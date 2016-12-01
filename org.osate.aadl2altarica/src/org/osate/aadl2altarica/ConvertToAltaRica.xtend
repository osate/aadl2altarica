/**
 * AADL to AltaRica Translator
 * 
 * Copyright 2016 Carnegie Mellon University. All Rights Reserved.
 * 
 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING INSTITUTE
 * MATERIAL IS FURNISHED ON AN "AS-IS" BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO
 * WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR MERCHANTABILITY,
 * EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE MELLON
 * UNIVERSITY DOES NOT MAKE ANY WARRANTY OF ANY KIND WITH RESPECT TO FREEDOM FROM
 * PATENT, TRADEMARK, OR COPYRIGHT INFRINGEMENT.
 * 
 *  Released under a Eclipse Public License - v1.0-style license,
 *  please see license.txt or contact permission@sei.cmu.edu for full terms.
 * 
 * DM16-0114
 */
package org.osate.aadl2altarica

import com.google.inject.Inject
import com.google.inject.Provider
import java.io.IOException
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.resources.IFile
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.window.Window
import org.eclipse.m2m.atl.emftvm.EmftvmFactory
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver
import org.eclipse.m2m.atl.emftvm.util.TimingData
import org.eclipse.ui.handlers.HandlerUtil
import org.eclipse.xtext.resource.FileExtensionProvider
import org.eclipse.xtext.resource.XtextResourceSet
import org.osate.aadl2.instance.SystemInstance
import org.osate.aadl2.instance.SystemOperationMode
import org.osate.aadl2.util.Aadl2ResourceImpl
import org.osate.altarica.ui.internal.AltaricaActivator
import org.osate.ui.dialogs.Dialog
import org.osate.ui.dialogs.SOMChooserDialog
import org.eclipse.ui.PlatformUI

class ConvertToAltaRica extends AbstractHandler {

	@Inject
	Provider<XtextResourceSet> resourceSetProvider

	@Inject
	extension FileExtensionProvider

	new() {
		val injector = AltaricaActivator.instance.getInjector(AltaricaActivator.ORG_OSATE_ALTARICA_ALTARICA)
		injector.injectMembers(this)
	}

	override execute(ExecutionEvent event) throws ExecutionException {
		val selectedFile = (HandlerUtil.getCurrentSelection(event) as IStructuredSelection).firstElement as IFile
		val filePath = selectedFile.fullPath.toString

		val inURI = URI.createPlatformResourceURI(filePath, false)
		val outURI = inURI.trimFileExtension.appendFileExtension(primaryFileExtension)

		val env = EmftvmFactory.eINSTANCE.createExecEnv
		val rs = resourceSetProvider.get

		val instanceMM = EmftvmFactory.eINSTANCE.createMetamodel
		instanceMM.setResource(rs.getResource(URI.createURI("http://aadl.info/AADL/2.0/instance"), true))
		env.registerMetaModel("AADL", instanceMM)

		val declarativeMM = EmftvmFactory.eINSTANCE.createMetamodel
		declarativeMM.setResource(rs.getResource(URI.createURI("http://aadl.info/AADL/2.0"), true))
		env.registerMetaModel("AADL2", declarativeMM)

		val emv2MM = EmftvmFactory.eINSTANCE.createMetamodel
		emv2MM.setResource(rs.getResource(URI.createURI("http://www.aadl.info/EMV2"), true))
		env.registerMetaModel("EMV2", emv2MM)

		val altaricaMM = EmftvmFactory.eINSTANCE.createMetamodel
		altaricaMM.setResource(rs.getResource(URI.createURI("http://osate.org/Altarica"), true))
		env.registerMetaModel("AR", altaricaMM)

		// Load IN models
		val inModel = EmftvmFactory.eINSTANCE.createModel
		inModel.resource = rs.getResource(inURI, true)
		env.registerInOutModel("IN", inModel)

		selectSOM(inModel.resource)

		// Create OUT models
		val outModel = EmftvmFactory.eINSTANCE.createModel
		outModel.resource = rs.createResource(outURI)
		outModel.allowInterModelReferences = false
		env.registerInOutModel("OUT", outModel)

		val moduleResolver = new DefaultModuleResolver("platform:/plugin/" + Activator.PLUGIN_ID + "/transformation/",
			rs)
		val td = new TimingData
		env.loadModule(moduleResolver, "AADLEM2AltaRica")
		td.finishLoading
		env.run(td)
		td.finish

		// Save models
		try {
			outModel.resource.save(null)
		} catch (IOException e) {
			e.printStackTrace
		}

		null
	}

	static val INITIAL_MODE_LABEL = "Initial Mode"
	static val CHOOSE_MODE_LABEL = "Choose Mode..."

	static val String[] SINGLE_MODE_CHOICE_LABELS = #[INITIAL_MODE_LABEL, CHOOSE_MODE_LABEL]

	static val INITIAL_MODE = 0
	static val CHOOSE_MODE = 1

	static val DEFAULT_MODE_CHOICE = INITIAL_MODE

	var lastDefaultModeChoice = DEFAULT_MODE_CHOICE

	def selectSOM(Resource instanceModel) {
		if (instanceModel instanceof Aadl2ResourceImpl) {
			val root = instanceModel.contents.get(0)
			if (root instanceof SystemInstance) {
				val si = root
				var int whichMode = INITIAL_MODE
				if (si.systemOperationModes.size > 1) {
					whichMode = Dialog.askQuestion("Choose Mode",
						"Please choose in which mode(s) the model should be analyzed.", SINGLE_MODE_CHOICE_LABELS,
						lastDefaultModeChoice)
					lastDefaultModeChoice = whichMode

					var SystemOperationMode chosenSOM = null
					if (whichMode == INITIAL_MODE) {
						// this may also be "No Modes" aka NORMAL_SOM_NAME
						chosenSOM = si.initialSystemOperationMode
					} else if (whichMode == CHOOSE_MODE) {
						val shell = PlatformUI.workbench.activeWorkbenchWindow.shell
						val somDialog = new SOMChooserDialog(shell, si, false)
						if (somDialog.openThreadSafe == Window.OK) {
							chosenSOM = somDialog.getSOM
						} else {
							return
						}
					}
					si.setCurrentSystemOperationMode(chosenSOM)
				}
			}
		}
	}
}