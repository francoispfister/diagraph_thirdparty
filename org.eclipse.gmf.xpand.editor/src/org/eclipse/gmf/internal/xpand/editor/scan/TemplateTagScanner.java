/*
 * Copyright (c) 2005, 2008 Sven Efftinge and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge - Initial API and implementation
 */
package org.eclipse.gmf.internal.xpand.editor.scan;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gmf.internal.xpand.codeassist.XpandTokens;
import org.eclipse.gmf.internal.xpand.editor.ColorProvider;
import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;

/**
 * 
 */
public class TemplateTagScanner extends RuleBasedScanner {

    public TemplateTagScanner(ColorProvider colorProvider) {
        final List<IRule> rules = new ArrayList<IRule>();

        final Token string = XpandTokenFactory.newStringToken(colorProvider);
        final Token terminals = XpandTokenFactory.newTerminalsToken(colorProvider);
        final Token define = XpandTokenFactory.newDefineToken(colorProvider);
        final Token keyword = XpandTokenFactory.newKeywordsToken(colorProvider);
        final Token others = XpandTokenFactory.newOtherToken(colorProvider);
        // FIXME add separate highlight for varaibles/parameters?

        // Add rule for strings
        rules.add(new MultiLineRule("'", "'", string, (char) 0,true)); // no escape char in OCL, I guess.
        // Add rule for brackets
        rules.add(new IRule() {
            public IToken evaluate(final ICharacterScanner scanner) {
                final int c = scanner.read();
                if ((XpandTokens.LT_CHAR == c) || (XpandTokens.RT_CHAR == c)) {
					return terminals;
				} else {
                    scanner.unread();
                    return Token.UNDEFINED;
                }
            }
        });

        // Add rule for define
        rules.add(new XpandKeywordRule(define, new String[] { XpandTokens.DEFINE, XpandTokens.ENDDEFINE, XpandTokens.AROUND, XpandTokens.ENDAROUND }));
        // Add rule for keywords
        rules.add(new XpandKeywordRule(keyword, XpandTokens.allKeywords()));
        // Add generic whitespace rule.
        rules.add(new WhitespaceRule(new WhitespaceDetector()));

        setRules(rules.toArray(new IRule[rules.size()]));
        setDefaultReturnToken(others);
    }

}