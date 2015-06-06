/*
 * Copyright (c) 2005, 2009 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.bridge.wizards.pages;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.gmf.mappings.FeatureInitializer;
import org.eclipse.gmf.mappings.FeatureSeqInitializer;
import org.eclipse.gmf.mappings.GMFMapFactory;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.Mapping;
import org.eclipse.gmf.mappings.MappingEntry;
import org.eclipse.gmf.mappings.NodeMapping;
import org.eclipse.gmf.mappings.NodeReference;
import org.eclipse.gmf.mappings.TopNodeReference;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ListDialog;
import org.eclipse.ui.views.properties.PropertySheetPage;

/**
 * @author artem
 *
 */
public class EntriesPage extends WizardPage {

	private final WizardInput myHolder;

	public EntriesPage(WizardInput input) {
		super("entriesPage"); //$NON-NLS-1$
		this.myHolder = input;
		setTitle(Messages.mapPageTitle);
		setDescription(Messages.mapPageDesc);
	}

	protected Mapping getMapInstance() {
		return myHolder.getMapping();
	}

	protected WizardInput getHolder() {
		return myHolder;
	}

	public void createControl(Composite parent) {
		setControl(new PageControl(parent));
	}

	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			((PageControl) getControl()).populate();
		}
	}

	private class PageControl extends Composite {

		private Group nodesGroup = null;

		private List nodesList = null;

		private Group linksGroup = null;

		private List linksList = null;

		private Composite detailsPart = null;

		private Group groupStructure = null;

		private Group groupEdit = null;

		private Group groupVisual = null;

		private Composite composite2 = null;

		private Composite composite = null;

		private Button asNodeButton = null;

		private Button asLinkButton = null;

		private Button removeButton = null;

		private Button changeDetailsButton = null;

		private Button restoreButton = null;

		private Group groupConstaints = null;

		private Label specLabel = null;

		private Label initLabel = null;

		private Label diagramElementLabel = null;

		private Label metaElementLabel;

		private Label containmentLabel;

		private Label linkMetaFeatureLabel;

		private boolean isNodeInSelection;

		private NodeReference selectedNode;

		private LinkMapping selectedLink;

		private final ILabelProvider myLabelProvider = new LabelProvider() {

			final EcoreItemProviderAdapterFactory helperFactory = new EcoreItemProviderAdapterFactory();

			public String getText(Object element) {
				if (element instanceof LinkMapping) {
					LinkMapping next = (LinkMapping) element;
					final String linkName;
					if (next.getDomainMetaElement() == null) {
						if (next.getLinkMetaFeature() == null) {
							linkName = Messages.unspecifiedValue;
						} else {
							linkName = getLabel(next.getLinkMetaFeature());
						}
					} else {
						linkName = getLabel(next.getDomainMetaElement());
					}
					final String dlName = next.getDiagramLink() != null ? next.getDiagramLink().getName() : Messages.unspecifiedValue;
					final String featureName = next.getContainmentFeature() != null ? next.getContainmentFeature().getName() : Messages.unspecifiedValue;
					return Messages.bind(Messages.linkLabel, new Object[] { linkName, dlName, featureName });
				} else {
					NodeReference next = (NodeReference) element;
					final String nodeName = next.getChild().getDomainMetaElement() == null ? Messages.unspecifiedValue : getLabel(next.getChild().getDomainMetaElement());
					final String dnName = next.getChild().getDiagramNode() != null ? next.getChild().getDiagramNode().getName() : Messages.unspecifiedValue;
					final String featureName;
					if (next.getContainmentFeature() != null) {
						featureName = next.getContainmentFeature().getName();
					} else if (next.getChildrenFeature() != null) {
						featureName = next.getChildrenFeature().getName();
					} else {
						featureName = Messages.unspecifiedValue;
					}
					return Messages.bind(Messages.nodeLabel, new Object[] { nodeName, dnName, featureName });
				}
			}

			private String getLabel(EObject ecoreElement) {
				IItemLabelProvider lp = (IItemLabelProvider) helperFactory.adapt((Object) ecoreElement, IItemLabelProvider.class);
				assert lp != null;
				return lp.getText(ecoreElement);
			}
		};

		private SelectionListener myListSelectionListener = new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				removeButton.setEnabled(true);
				changeDetailsButton.setEnabled(true);
				restoreButton.setEnabled(true);

				if (e.widget == nodesList) {
					handleNodesListSelectionChange();
					linksList.deselectAll();
				} else if (e.widget == linksList) {
					handleLinksListSelectionChange();
					nodesList.deselectAll();
				}
			}

			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		};

		private FocusListener myListFocusListener = new FocusListener() {

			public void focusGained(FocusEvent e) {
				if (e.widget == nodesList) {
					handleNodesListSelectionChange();
				} else if (e.widget == linksList) {
					handleLinksListSelectionChange();
				}
			}

			public void focusLost(FocusEvent e) {
				//do nothing
			}

		};

		public PageControl(Composite parent) {
			super(parent, SWT.NONE);
			initialize();
		}

		public void populate() {
			populateNodesList();
			populateLinksList();
		}

		private void populateNodesList() {
			String[] items = new String[getMapInstance().getNodes().size()];
			int i = 0;
			for (Iterator<?> it = getMapInstance().getNodes().iterator(); it.hasNext(); i++) {
				items[i] = myLabelProvider.getText(it.next());
			}
			nodesList.setItems(items);
		}

		private void populateLinksList() {
			String[] items = new String[getMapInstance().getLinks().size()];
			int i = 0;
			for (Iterator<?> it = getMapInstance().getLinks().iterator(); it.hasNext(); i++) {
				items[i] = myLabelProvider.getText(it.next());
			}
			linksList.setItems(items);
		}

		private void initialize() {
			GridLayout gridLayout = new GridLayout();
			gridLayout.numColumns = 3;
			this.setLayout(gridLayout);
			//			setSize(new org.eclipse.swt.graphics.Point(990,612));
			createNodesList();
			createButtonsPane();
			createLinksList();
			createDetailsPart();
		}

		private void createNodesList() {
			GridData gridData = new GridData();
			gridData.horizontalAlignment = GridData.FILL;
			gridData.grabExcessHorizontalSpace = true;
			gridData.grabExcessVerticalSpace = true;
			gridData.verticalAlignment = GridData.FILL;
			nodesGroup = new Group(this, SWT.NONE);
			nodesGroup.setLayout(new FillLayout());
			nodesGroup.setLayoutData(gridData);
			nodesGroup.setText(Messages.mapNodesList);
			nodesList = new List(nodesGroup, SWT.SINGLE | SWT.BORDER | SWT.V_SCROLL);
			nodesList.addSelectionListener(myListSelectionListener);
			nodesList.addFocusListener(myListFocusListener);
		}

		private void createLinksList() {
			GridData gridData1 = new GridData();
			gridData1.grabExcessHorizontalSpace = true;
			gridData1.horizontalAlignment = GridData.FILL;
			gridData1.verticalAlignment = GridData.FILL;
			gridData1.grabExcessVerticalSpace = true;
			linksGroup = new Group(this, SWT.NONE);
			linksGroup.setLayout(new FillLayout());
			linksGroup.setLayoutData(gridData1);
			linksGroup.setText(Messages.mapLinksList);
			linksList = new List(linksGroup, SWT.SINGLE | SWT.BORDER | SWT.V_SCROLL);
			linksList.addSelectionListener(myListSelectionListener);
			linksList.addFocusListener(myListFocusListener);
		}

		private void createDetailsPart() {
			GridData gridData3 = new GridData();
			gridData3.horizontalSpan = 5;
			gridData3.verticalAlignment = GridData.FILL;
			gridData3.grabExcessHorizontalSpace = true;
			gridData3.grabExcessVerticalSpace = false;
			gridData3.horizontalAlignment = GridData.FILL;
			detailsPart = new Composite(this, SWT.NONE);
			detailsPart.setLayoutData(gridData3);
			GridLayout gridLayout1 = new GridLayout();
			gridLayout1.numColumns = 7;
			gridLayout1.makeColumnsEqualWidth = true;
			detailsPart.setLayout(gridLayout1);
			createStructureGroup();
			createEditGroup();
			changeDetailsButton = new Button(detailsPart, SWT.NONE);
			changeDetailsButton.setText(Messages.mapChange);
			changeDetailsButton.addSelectionListener(new SelectionAdapter() {

				public void widgetSelected(SelectionEvent e) {
					final Object input = isNodeInSelection ? (Object) selectedNode : (Object) selectedLink;
					ChangePropertiesDialog changePropertiesDialog = new ChangePropertiesDialog(getShell(), new Object[] { input });
					int result = changePropertiesDialog.open();
					if (result == Window.OK) {
						// TODO: save values to the model here
					}
				}
			});
			GridData gridData8 = new GridData();
			gridData8.grabExcessHorizontalSpace = true;
			gridData8.verticalAlignment = GridData.CENTER;
			gridData8.verticalSpan = 2;
			gridData8.horizontalAlignment = GridData.CENTER;
			changeDetailsButton.setLayoutData(gridData8);
			createVisualGroup();
			createConstraintsGroup();
		}

		private void createStructureGroup() {
			groupStructure = new Group(detailsPart, SWT.SHADOW_OUT);
			groupStructure.setText(Messages.groupStructure);
			groupStructure.setLayoutData(newDetailGroupConstraint());
			groupStructure.setLayout(newDetailGroupLayout());
			Label l = new Label(groupStructure, SWT.NONE);
			l.setText(Messages.labelElement);
			metaElementLabel = new Label(groupStructure, SWT.NONE);
			metaElementLabel.setLayoutData(newDetailLabelConstraint());
			l = new Label(groupStructure, SWT.NONE);
			l.setText(Messages.labelContainment);
			containmentLabel = new Label(groupStructure, SWT.NONE);
			containmentLabel.setLayoutData(newDetailLabelConstraint());
			l = new Label(groupStructure, SWT.NONE);
			l.setText(Messages.labelTargetFeature);
			linkMetaFeatureLabel = new Label(groupStructure, SWT.NONE);
			linkMetaFeatureLabel.setLayoutData(newDetailLabelConstraint());

		}

		private void createEditGroup() {
			groupEdit = new Group(detailsPart, SWT.NONE);
			groupEdit.setText(Messages.groupEdit);
			groupEdit.setLayout(newDetailGroupLayout());
			groupEdit.setLayoutData(newDetailGroupConstraint());
		}

		private void createVisualGroup() {
			groupVisual = new Group(detailsPart, SWT.NONE);
			groupVisual.setText(Messages.groupVisual);
			groupVisual.setLayoutData(newDetailGroupConstraint());
			groupVisual.setLayout(newDetailGroupLayout());
			Label l = new Label(groupVisual, SWT.NONE);
			l.setText(Messages.labelDiagramElement);
			diagramElementLabel = new Label(groupVisual, SWT.NONE);
			diagramElementLabel.setLayoutData(newDetailLabelConstraint());
		}

		private void createButtonsPane() {
			GridData gridData2 = new GridData();
			gridData2.horizontalAlignment = GridData.FILL;
			gridData2.verticalAlignment = GridData.CENTER;
			composite2 = new Composite(this, SWT.NONE);
			composite2.setLayout(new FillLayout());
			composite2.setLayoutData(gridData2);
			createComposite();
		}

		private void createComposite() {
			RowLayout rowLayout = new RowLayout();
			rowLayout.type = org.eclipse.swt.SWT.VERTICAL;
			rowLayout.justify = true;
			rowLayout.marginHeight = 0;
			rowLayout.marginWidth = 0;
			rowLayout.pack = false;
			rowLayout.spacing = 6;
			rowLayout.marginLeft = 10;
			rowLayout.marginRight = 10;
			rowLayout.fill = false;
			composite = new Composite(composite2, SWT.NONE);
			composite.setLayout(rowLayout);
			asNodeButton = new Button(composite, SWT.NONE);
			asNodeButton.setText(Messages.mapAsNode);
			asNodeButton.setEnabled(false);
			asNodeButton.addListener(SWT.Selection, new Listener() {

				public void handleEvent(Event event) {
					TopNodeReference tnr = GMFMapFactory.eINSTANCE.createTopNodeReference();
					NodeMapping nm = GMFMapFactory.eINSTANCE.createNodeMapping();
					nm.setDomainMetaElement(selectedLink.getDomainMetaElement());
					nm.setDomainInitializer(selectedLink.getDomainInitializer());
					nm.setDomainSpecialization(selectedLink.getDomainSpecialization());
					nm.setTool(selectedLink.getTool());
					nm.setContextMenu(selectedLink.getContextMenu());
					nm.setAppearanceStyle(selectedLink.getAppearanceStyle());
					tnr.setContainmentFeature(selectedLink.getContainmentFeature());
					tnr.setOwnedChild(nm);
					getMapInstance().getNodes().add(tnr);
					getMapInstance().getLinks().remove(selectedLink);
					linksList.remove(linksList.getSelectionIndex());
					nodesList.add(myLabelProvider.getText(tnr));
					nodesList.setSelection(nodesList.getItemCount() - 1);
					handleNodesListSelectionChange();
				}
			});
			asLinkButton = new Button(composite, SWT.NONE);
			asLinkButton.setText(Messages.mapAsLink);
			asLinkButton.setEnabled(false);
			asLinkButton.addListener(SWT.Selection, new Listener() {

				public void handleEvent(Event event) {
					LinkMapping lm = GMFMapFactory.eINSTANCE.createLinkMapping();
					NodeMapping nodeMapping = selectedNode.getChild();
					lm.setDomainMetaElement(nodeMapping.getDomainMetaElement());
					lm.setContainmentFeature(selectedNode.getContainmentFeature());
					lm.setDomainInitializer(nodeMapping.getDomainInitializer());
					lm.setDomainSpecialization(nodeMapping.getDomainSpecialization());
					lm.setTool(nodeMapping.getTool());
					lm.setContextMenu(nodeMapping.getContextMenu());
					lm.setAppearanceStyle(nodeMapping.getAppearanceStyle());
					getMapInstance().getLinks().add(lm);
					getMapInstance().getNodes().remove(selectedNode);
					nodesList.remove(nodesList.getSelectionIndex());
					linksList.add(myLabelProvider.getText(lm));
					linksList.setSelection(linksList.getItemCount() - 1);
					handleLinksListSelectionChange();
				}
			});
			removeButton = new Button(composite, SWT.NONE);
			removeButton.setText(Messages.mapRemove);
			removeButton.setEnabled(false);
			removeButton.addListener(SWT.Selection, new Listener() {

				public void handleEvent(Event event) {
					if (nodesList.getSelectionIndex() != -1) {
						int i = nodesList.getSelectionIndex();
						nodesList.remove(i);
						getMapInstance().getNodes().remove(i);
						if (i == nodesList.getItemCount() && i > 0) {
							i--;
						}
						nodesList.setSelection(i);
						if (nodesList.getItemCount() == 0) {
							asLinkButton.setEnabled(false);
							removeButton.setEnabled(false);
							changeDetailsButton.setEnabled(false);
						} else {
							handleNodesListSelectionChange();
						}
					}
					if (linksList.getSelectionIndex() != -1) {
						int i = linksList.getSelectionIndex();
						linksList.remove(i);
						getMapInstance().getLinks().remove(i);
						if (i == linksList.getItemCount() && i > 0) {
							i--;
						}
						linksList.setSelection(i);
						if (linksList.getItemCount() == 0) {
							asNodeButton.setEnabled(false);
							removeButton.setEnabled(false);
							changeDetailsButton.setEnabled(false);
						} else {
							handleLinksListSelectionChange();
						}
					}
				}
			});
			restoreButton = new Button(composite, SWT.NONE);
			restoreButton.setText(Messages.mapRestore);
			restoreButton.setEnabled(false);
			restoreButton.addListener(SWT.Selection, new Listener() {

				public void handleEvent(Event event) {
					ListDialog dialog = new ListDialog(getShell());
					dialog.setTitle(isNodeInSelection ? Messages.mapRestoreNode : Messages.mapRestoreLink);
					dialog.setMessage(Messages.mapRestoreText);
					dialog.setContentProvider(new IStructuredContentProvider() {

						public Object[] getElements(Object inputElement) {
							return (Object[]) inputElement;
						}

						public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
						}

						public void dispose() {
						}
					});
					dialog.setLabelProvider(PageControl.this.myLabelProvider);
					if (isNodeInSelection) {
						dialog.setInput(getHolder().nodeCandidates());
					} else {
						dialog.setInput(getHolder().linkCandidates());
					}
					if (dialog.open() == ListDialog.OK) {
						if (isNodeInSelection) {
							EList<TopNodeReference> nodes = getMapInstance().getNodes();

							Set<EClass> usedClassSet = new HashSet<EClass>();
							for (TopNodeReference nextTopNodeReference : nodes) {
								usedClassSet.add(nextTopNodeReference.getChild().getDomainMetaElement());
							}

							for (Object nextObject : dialog.getResult()) {
								TopNodeReference nextNodeReference = (TopNodeReference) nextObject;
								if (!usedClassSet.contains((nextNodeReference.getChild().getDomainMetaElement()))) {
									nodes.add(nextNodeReference);
								}
							}

							nodesList.removeAll();
							populateNodesList();
						} else {
							EList<LinkMapping> links = getMapInstance().getLinks();

							Set<EClass> usedClassSet = new HashSet<EClass>();
							for (LinkMapping nextLinkMapping : links) {
								usedClassSet.add(nextLinkMapping.getDomainMetaElement());
							}

							for (Object nextObject : dialog.getResult()) {
								LinkMapping nextLinkMapping = (LinkMapping) nextObject;
								if (!usedClassSet.contains((nextLinkMapping.getDomainMetaElement()))) {
									links.add(nextLinkMapping);
								}
							}

							linksList.removeAll();
							populateLinksList();
						}
					}
				}
			});
		}

		private void createConstraintsGroup() {
			groupConstaints = new Group(detailsPart, SWT.NONE);
			groupConstaints.setText(Messages.groupConstraints);
			groupConstaints.setLayout(newDetailGroupLayout());
			groupConstaints.setLayoutData(newDetailGroupConstraint());

			Label label = new Label(groupConstaints, SWT.NONE);
			label.setText(Messages.labelSpecialization);
			specLabel = new Label(groupConstaints, SWT.NONE);
			specLabel.setLayoutData(newDetailLabelConstraint());

			label = new Label(groupConstaints, SWT.NONE);
			label.setText(Messages.labelInitializer);
			initLabel = new Label(groupConstaints, SWT.NONE);
			initLabel.setLayoutData(newDetailLabelConstraint());
			// TODO link creation constraints
		}

		private GridLayout newDetailGroupLayout() {
			GridLayout gridLayout = new GridLayout();
			gridLayout.numColumns = 3;
			gridLayout.makeColumnsEqualWidth = true;
			return gridLayout;
		}

		private GridData newDetailGroupConstraint() {
			GridData groupGridData = new GridData();
			groupGridData.horizontalAlignment = GridData.FILL;
			groupGridData.grabExcessHorizontalSpace = true;
			groupGridData.grabExcessVerticalSpace = true;
			groupGridData.horizontalSpan = 3;
			groupGridData.verticalAlignment = GridData.FILL;
			return groupGridData;
		}

		private GridData newDetailLabelConstraint() {
			GridData labelGridData = new GridData();
			labelGridData.horizontalSpan = 2;
			labelGridData.grabExcessHorizontalSpace = true;
			labelGridData.horizontalAlignment = GridData.FILL;
			return labelGridData;
		}

		private void refreshCommonDetails(MappingEntry selectedEntry) {
			affix(metaElementLabel, selectedEntry.getDomainMetaElement());
			refreshDomainSpecialization(selectedEntry);
			refreshDomainInitializer(selectedEntry);
		}

		private void refreshDomainSpecialization(MappingEntry selectedEntry) {
			if (selectedEntry.getDomainSpecialization() == null) {
				specLabel.setText("");
				return;
			}
			specLabel.setText(selectedEntry.getDomainSpecialization().getBody());
		}

		private void refreshDomainInitializer(MappingEntry selectedEntry) {
			if (selectedEntry.getDomainInitializer() == null || false == selectedEntry.getDomainInitializer() instanceof FeatureSeqInitializer) {
				initLabel.setText("");
				return;
			}
			FeatureSeqInitializer fsi = (FeatureSeqInitializer) selectedEntry.getDomainInitializer();
			StringBuilder sb = new StringBuilder();
			for (FeatureInitializer next : fsi.getInitializers()) {
				sb.append(next.getFeature().getName());
				sb.append("; ");
			}
			initLabel.setText(sb.toString());
		}

		private void affix(Label l, ENamedElement el) {
			if (el != null) {
				l.setText(el.getName());
			} else {
				l.setText("");
			}
		}

		private void refreshNodeDetails() {
			refreshCommonDetails(selectedNode.getChild());
			NodeMapping m = selectedNode.getChild();
			affix(containmentLabel, selectedNode.getContainmentFeature());
			if (m.getDiagramNode() != null) {
				diagramElementLabel.setText(m.getDiagramNode().getName());
			} else {
				diagramElementLabel.setText("");
			}
			linkMetaFeatureLabel.setText("");
		}

		private void refreshLinkDetails() {
			refreshCommonDetails(selectedLink);
			affix(containmentLabel, selectedLink.getContainmentFeature());
			LinkMapping l = selectedLink;
			if (l.getDiagramLink() != null) {
				diagramElementLabel.setText(l.getDiagramLink().getName());
			} else {
				diagramElementLabel.setText("");
			}
			affix(linkMetaFeatureLabel, l.getLinkMetaFeature());
		}

		void handleNodesListSelectionChange() {
			asNodeButton.setEnabled(false);

			int selectionIndex = nodesList.getSelectionIndex();
			if (selectionIndex != -1) {
				selectedNode = getMapInstance().getNodes().get(selectionIndex);
				asLinkButton.setEnabled(selectedNode.getChild().getDomainMetaElement() != null);
				refreshNodeDetails();
			}

			isNodeInSelection = true;
		}

		void handleLinksListSelectionChange() {
			asLinkButton.setEnabled(false);

			int selectionIndex = linksList.getSelectionIndex();
			if (selectionIndex != -1) {
				selectedLink = getMapInstance().getLinks().get(selectionIndex);
				asNodeButton.setEnabled(selectedLink.getDomainMetaElement() != null);
				refreshLinkDetails();
			}

			isNodeInSelection = false;
		}
	}

	private class ChangePropertiesDialog extends Dialog {

		private Object[] mySelection;

		protected ChangePropertiesDialog(Shell parentShell, Object[] selection) {
			super(parentShell);
			setShellStyle(getShellStyle() | SWT.RESIZE);
			mySelection = selection;
		}

		protected Control createDialogArea(Composite parent) {
			Composite composite = (Composite) super.createDialogArea(parent);
			Composite frame = new Composite(composite, SWT.BORDER);
			GridData layoutData = new GridData(GridData.FILL_BOTH);
			layoutData.heightHint = 300;
			layoutData.widthHint = 400;
			frame.setLayoutData(layoutData);
			GridLayout layout = new GridLayout();
			layout.marginHeight = 0;
			layout.marginWidth = 0;
			frame.setLayout(layout);

			PropertySheetPage propertyPage = new PropertySheetPage();
			propertyPage.createControl(frame);
			propertyPage.setPropertySourceProvider(new AdapterFactoryContentProvider(myHolder.getAdapterFactory()));
			propertyPage.selectionChanged(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPartService().getActivePart(), new StructuredSelection(mySelection));
			propertyPage.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
			return composite;
		}

		protected void createButtonsForButtonBar(Composite parent) {
			createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		}

	}
}
