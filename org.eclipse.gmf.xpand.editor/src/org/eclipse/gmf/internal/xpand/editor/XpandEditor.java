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
package org.eclipse.gmf.internal.xpand.editor;

import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.ResourceBundle;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.gmf.internal.xpand.ResourceManager;
import org.eclipse.gmf.internal.xpand.RootManager;
import org.eclipse.gmf.internal.xpand.RootManager.RootDescription;
import org.eclipse.gmf.internal.xpand.codeassist.XpandTokens;
import org.eclipse.gmf.internal.xpand.editor.ui.InsertTextAction;
import org.eclipse.gmf.internal.xpand.model.ExecutionContext;
import org.eclipse.gmf.internal.xpand.util.ContextFactory;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.texteditor.ITextEditorActionDefinitionIds;
import org.eclipse.ui.texteditor.TextOperationAction;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

/**
 * Template specific text editor.
 */
public class XpandEditor extends TextEditor {

	private final ColorProvider colorProvider;

    private final XpandContentOutlinePage ivOutlinePage = null;

	private ExecutionContext context;

    public XpandEditor() {
        super();
        colorProvider = new ColorProvider(Activator.getDefault().getPreferenceStore());
        colorProvider.initializeDefaults();
        setSourceViewerConfiguration(new XpandSourceViewerConfiguration(this));
        setDocumentProvider(new XpandDocumentProvider());
        setKeyBindingScopes(new String[] { "org.eclipse.gmf.xpand.editorScope" }); //$NON-NLS-1$
    }

    /*package*/ ExecutionContext createContext() {
    	if (context == null) {
    		assert getEditorInput().getAdapter(IFile.class) != null;
    		IFile aFile = (IFile) getEditorInput().getAdapter(IFile.class);
    		IProject project = aFile.getProject();
    		RootManager rootManager = org.eclipse.gmf.internal.xpand.Activator.getRootManager(project);
    		RootDescription rootDescription = rootManager.getRootDescription(aFile);
   			ResourceManager resourceManager = org.eclipse.gmf.internal.xpand.Activator.createWorkspaceResourceManager(project, rootDescription);
   			context = ContextFactory.createXpandContext(resourceManager);
    	}
    	return context;
    }

    @Override
    public void dispose() {
        colorProvider.dispose();
        super.dispose();
    }

    /*package*/ ColorProvider getColorProvider() {
		return colorProvider;
	}

    @Override
    public void editorContextMenuAboutToShow(IMenuManager aMenu) {
        super.editorContextMenuAboutToShow(aMenu);
        addAction(aMenu, "ContentAssistProposal");
        addAction(aMenu, "ContentAssistTip");
    }

    @SuppressWarnings("unchecked")
	@Override
    public Object getAdapter(final Class aRequired) {
        if (IContentOutlinePage.class.equals(aRequired)) {
			// if (ivOutlinePage == null) {
            // ivOutlinePage = new
            // XPandContentOutlinePage(getDocumentProvider(), this);
            // if (getEditorInput() != null) {
            // ivOutlinePage.setInput(getEditorInput());
            // }
            // }
            return ivOutlinePage;
		}
        return super.getAdapter(aRequired);
    }

    /**
     * Forces the document to be redraw
     */
    public void redraw() {
        final ISourceViewer sourceViewer = getSourceViewer();
        if (sourceViewer != null) {
            final IDocument document = sourceViewer.getDocument();

            if (document != null) {
                document.set(document.get());
            }
        }
    }

    /**
     * The <code>TemplateEditor</code> implementation of this
     * <code>AbstractTextEditor</code> method extends the actions and connects
     * them with the global workbench actions.
     */
    @Override
    protected void createActions() {
        super.createActions();
        final ResourceBundle rb = new ResourceBundle() {

            @Override
            public Enumeration<String> getKeys() {
            	List<String> s = Collections.emptyList();
                return Collections.enumeration(s);
            }

            @Override
            protected Object handleGetObject(String key) {
                return null;
            }
        };
        IAction a = new TextOperationAction(rb, "ContentAssistProposal.", this, ISourceViewer.CONTENTASSIST_PROPOSALS);
        a.setActionDefinitionId(ITextEditorActionDefinitionIds.CONTENT_ASSIST_PROPOSALS);
        setAction("ContentAssistProposal", a);

        a = new TextOperationAction(rb, "ContentAssistTip.", this, ISourceViewer.CONTENTASSIST_CONTEXT_INFORMATION);
        a.setActionDefinitionId(ITextEditorActionDefinitionIds.CONTENT_ASSIST_CONTEXT_INFORMATION);
        setAction("ContentAssistTip", a);

        a = new InsertTextAction(rb, this, getSourceViewer(), XpandTokens.LT);
        a.setActionDefinitionId(Activator.getPluginID() + ".insertLT");
        setAction("InsertLT", a);

        a = new InsertTextAction(rb, this, getSourceViewer(), XpandTokens.RT);
        a.setActionDefinitionId(Activator.getPluginID() + ".insertRT");
        setAction("InsertRT", a);

    }
}
