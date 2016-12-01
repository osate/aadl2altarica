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
package org.osate.altarica.formatting

import com.google.inject.Inject
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter
import org.eclipse.xtext.formatting.impl.FormattingConfig
import org.osate.altarica.services.AltaricaGrammarAccess

// import com.google.inject.Inject;
// import org.osate.altarica.services.AltaricaGrammarAccess
/**
 * This class contains custom formatting declarations.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#formatting
 * on how and when to use it.
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
class AltaricaFormatter extends AbstractDeclarativeFormatter {

	@Inject extension AltaricaGrammarAccess

	override protected void configureFormatting(FormattingConfig c) {
		c.setLinewrap(0, 1, 2).before(SL_COMMENTRule)
		c.setLinewrap(0, 1, 2).before(ML_COMMENTRule)
		c.setLinewrap(0, 1, 1).after(ML_COMMENTRule)
		
		c.setAutoLinewrap(120);
		c.setWrappedLineIndentation(2);

		// find common keywords an specify formatting for them
		findKeywordPairs("(", ")").forEach [ pair |
			c.setIndentationIncrement().after(pair.first)
			c.setNoSpace().after(pair.first)
			c.setLinewrap(0, 0, 1).after(pair.first)
			c.setIndentationDecrement().before(pair.second)
			c.setNoSpace().before(pair.second)
			c.setLinewrap(0, 0, 1).before(pair.second)
		]
		findKeywordPairs("[", "]").forEach [ pair |
			c.setIndentationIncrement().after(pair.first)
			c.setNoSpace().after(pair.first)
			c.setLinewrap(0, 0, 1).after(pair.first)
			c.setIndentationDecrement().before(pair.second)
			c.setNoSpace().before(pair.second)
			c.setLinewrap(0, 0, 1).before(pair.second)
		]
		findKeywordPairs("{", "}").forEach [ pair |
			c.setIndentationIncrement().after(pair.first)
			//c.setNoSpace().after(pair.first)
			c.setLinewrap(1, 1, 1).after(pair.first)
			c.setIndentationDecrement().before(pair.second)
			//c.setNoSpace().before(pair.second)
			c.setLinewrap(1, 1, 1).before(pair.second)
			c.setLinewrap(1, 1, 2).after(pair.second)
		]
		findKeywords(",").forEach [ comma |
			c.setNoSpace().before(comma)
			c.setNoLinewrap().before(comma)
			c.setLinewrap(0, 0, 1).after(comma)
		]
		findKeywords(";").forEach [ semi |
			c.setNoSpace().before(semi)
			c.setNoLinewrap().before(semi)
			c.setLinewrap(1, 1, 2).after(semi)
		]
		findKeywords(".").forEach [ dot |
			c.setNoSpace().around(dot)
			c.setNoLinewrap().around(dot)
		]
		findKeywords(":").forEach [ colon |
			c.setNoSpace().before(colon)
			c.setNoLinewrap().before(colon)
		]
		findKeywords(":=").forEach [ doublecolon |
			c.setNoLinewrap().around(doublecolon)
		]
		findKeywords("|-").forEach [ turn |
			c.setNoLinewrap().after(turn)
		]
		findKeywords("->").forEach [ arrow |
			c.setLinewrap(0, 0, 1).after(arrow)
		]

		findKeywords("transition", "assertion").forEach [ section |
			c.indentSection(section)
		]

		c.setLinewrap(1,2,2).before(classAccess.classKeyword_1)
		c.setLinewrap.after(classAccess.nameIDTerminalRuleCall_2_0)
		c.indentInClass(classAccess.classKeyword_1, classAccess.endKeyword_6)
		c.setLinewrap(1,2,2).after(classAccess.endKeyword_6)
		
		c.setLinewrap(1,1,1).after(switchAccess.leftCurlyBracketKeyword_1)
		c.setLinewrap(1,1,1).before(caseExpressionRule)
		c.setLinewrap(1,1,1).after(caseExpressionRule)
		c.setLinewrap(1,1,1).after(switchAccess.elseExpressionParserRuleCall_5_0)
	}

	protected def indentSection(FormattingConfig c, Keyword keyword) {
		c.setLinewrap(1, 1, 2).before(keyword)
		c.setLinewrap.after(keyword)
		c.setIndentationDecrement.before(keyword)
		c.setIndentationIncrement.after(keyword)
	}

	protected def indentInClass(FormattingConfig c, Keyword start, Keyword end) {
		c.indentTwiceAfter(start)
		c.setLinewrap(1, 1, 2).before(end)
		c.unindentTwiceBefore(end)
	}

	protected def indentTwiceAfter(FormattingConfig c, Keyword keyword) {
		c.setIndentationIncrement.after(keyword)
		c.setIndentationIncrement.after(keyword)
	}

	protected def unindentTwiceBefore(FormattingConfig c, Keyword keyword) {
		c.setIndentationDecrement.before(keyword)
		c.setIndentationDecrement.before(keyword)
	}

}
