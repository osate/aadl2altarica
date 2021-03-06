/*
 * generated by Xtext
 */
package org.osate.altarica.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.osate.altarica.ui.internal.AltaricaActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class AltaricaExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return AltaricaActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return AltaricaActivator.getInstance().getInjector(AltaricaActivator.ORG_OSATE_ALTARICA_ALTARICA);
	}
	
}
