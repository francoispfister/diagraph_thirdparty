/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.gmfgraph.GMFGraphFactory
 * @model kind="package"
 * @generated
 */
public interface GMFGraphPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gmfgraph";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/gmf/2006/GraphicalDefinition";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gmfgraph";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GMFGraphPackage eINSTANCE = org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.Identity <em>Identity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.Identity
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getIdentity()
	 * @generated
	 */
	int IDENTITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.CanvasImpl <em>Canvas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.CanvasImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getCanvas()
	 * @generated
	 */
	int CANVAS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__NAME = IDENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Figures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__FIGURES = IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__NODES = IDENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__CONNECTIONS = IDENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compartments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__COMPARTMENTS = IDENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__LABELS = IDENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Canvas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_FEATURE_COUNT = IDENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.FigureGalleryImpl <em>Figure Gallery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.FigureGalleryImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getFigureGallery()
	 * @generated
	 */
	int FIGURE_GALLERY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_GALLERY__NAME = IDENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Figures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_GALLERY__FIGURES = IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_GALLERY__DESCRIPTORS = IDENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Borders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_GALLERY__BORDERS = IDENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Layouts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_GALLERY__LAYOUTS = IDENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Implementation Bundle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_GALLERY__IMPLEMENTATION_BUNDLE = IDENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Figure Gallery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_GALLERY_FEATURE_COUNT = IDENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.DiagramElementImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getDiagramElement()
	 * @generated
	 */
	int DIAGRAM_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__NAME = IDENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Figure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__FIGURE = IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__FACETS = IDENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_FEATURE_COUNT = IDENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.AbstractNodeImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getAbstractNode()
	 * @generated
	 */
	int ABSTRACT_NODE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__NAME = DIAGRAM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Figure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__FIGURE = DIAGRAM_ELEMENT__FIGURE;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__FACETS = DIAGRAM_ELEMENT__FACETS;

	/**
	 * The number of structural features of the '<em>Abstract Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.NodeImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = ABSTRACT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Figure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FIGURE = ABSTRACT_NODE__FIGURE;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FACETS = ABSTRACT_NODE__FACETS;

	/**
	 * The feature id for the '<em><b>Resize Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__RESIZE_CONSTRAINT = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Affixed Parent Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__AFFIXED_PARENT_SIDE = ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Content Pane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CONTENT_PANE = ABSTRACT_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.ChildAccessImpl <em>Child Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.ChildAccessImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getChildAccess()
	 * @generated
	 */
	int CHILD_ACCESS = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.ConnectionImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = DIAGRAM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Figure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__FIGURE = DIAGRAM_ELEMENT__FIGURE;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__FACETS = DIAGRAM_ELEMENT__FACETS;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.CompartmentImpl <em>Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.CompartmentImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getCompartment()
	 * @generated
	 */
	int COMPARTMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__NAME = DIAGRAM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Figure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__FIGURE = DIAGRAM_ELEMENT__FIGURE;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__FACETS = DIAGRAM_ELEMENT__FACETS;

	/**
	 * The feature id for the '<em><b>Collapsible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__COLLAPSIBLE = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Needs Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__NEEDS_TITLE = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Accessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT__ACCESSOR = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARTMENT_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.DiagramLabelImpl <em>Diagram Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.DiagramLabelImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getDiagramLabel()
	 * @generated
	 */
	int DIAGRAM_LABEL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_LABEL__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Figure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_LABEL__FIGURE = NODE__FIGURE;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_LABEL__FACETS = NODE__FACETS;

	/**
	 * The feature id for the '<em><b>Resize Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_LABEL__RESIZE_CONSTRAINT = NODE__RESIZE_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Affixed Parent Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_LABEL__AFFIXED_PARENT_SIDE = NODE__AFFIXED_PARENT_SIDE;

	/**
	 * The feature id for the '<em><b>Content Pane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_LABEL__CONTENT_PANE = NODE__CONTENT_PANE;

	/**
	 * The feature id for the '<em><b>Element Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_LABEL__ELEMENT_ICON = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_LABEL__ACCESSOR = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_LABEL__CONTAINER = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_LABEL__EXTERNAL = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Diagram Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_LABEL_FEATURE_COUNT = NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.VisualFacet <em>Visual Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.VisualFacet
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getVisualFacet()
	 * @generated
	 */
	int VISUAL_FACET = 9;

	/**
	 * The number of structural features of the '<em>Visual Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_FACET_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.GeneralFacetImpl <em>General Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.GeneralFacetImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getGeneralFacet()
	 * @generated
	 */
	int GENERAL_FACET = 10;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_FACET__IDENTIFIER = VISUAL_FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_FACET__DATA = VISUAL_FACET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>General Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_FACET_FEATURE_COUNT = VISUAL_FACET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.AlignmentFacetImpl <em>Alignment Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.AlignmentFacetImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getAlignmentFacet()
	 * @generated
	 */
	int ALIGNMENT_FACET = 11;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIGNMENT_FACET__ALIGNMENT = VISUAL_FACET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alignment Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIGNMENT_FACET_FEATURE_COUNT = VISUAL_FACET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.GradientFacetImpl <em>Gradient Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.GradientFacetImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getGradientFacet()
	 * @generated
	 */
	int GRADIENT_FACET = 12;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_FACET__DIRECTION = VISUAL_FACET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gradient Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_FACET_FEATURE_COUNT = VISUAL_FACET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.LabelOffsetFacetImpl <em>Label Offset Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.LabelOffsetFacetImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getLabelOffsetFacet()
	 * @generated
	 */
	int LABEL_OFFSET_FACET = 13;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OFFSET_FACET__X = VISUAL_FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OFFSET_FACET__Y = VISUAL_FACET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Label Offset Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OFFSET_FACET_FEATURE_COUNT = VISUAL_FACET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.DefaultSizeFacetImpl <em>Default Size Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.DefaultSizeFacetImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getDefaultSizeFacet()
	 * @generated
	 */
	int DEFAULT_SIZE_FACET = 14;

	/**
	 * The feature id for the '<em><b>Default Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SIZE_FACET__DEFAULT_SIZE = VISUAL_FACET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Default Size Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SIZE_FACET_FEATURE_COUNT = VISUAL_FACET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.Layoutable <em>Layoutable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.Layoutable
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getLayoutable()
	 * @generated
	 */
	int LAYOUTABLE = 62;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE__LAYOUT_DATA = 0;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE__LAYOUT = 1;

	/**
	 * The number of structural features of the '<em>Layoutable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUTABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.Figure <em>Figure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.Figure
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getFigure()
	 * @generated
	 */
	int FIGURE = 15;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__LAYOUT_DATA = LAYOUTABLE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__LAYOUT = LAYOUTABLE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__DESCRIPTOR = LAYOUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__FOREGROUND_COLOR = LAYOUTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__BACKGROUND_COLOR = LAYOUTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__MAXIMUM_SIZE = LAYOUTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__MINIMUM_SIZE = LAYOUTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__PREFERRED_SIZE = LAYOUTABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__FONT = LAYOUTABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__INSETS = LAYOUTABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__BORDER = LAYOUTABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__LOCATION = LAYOUTABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__SIZE = LAYOUTABLE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_FEATURE_COUNT = LAYOUTABLE_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.AbstractFigureImpl <em>Abstract Figure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.AbstractFigureImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getAbstractFigure()
	 * @generated
	 */
	int ABSTRACT_FIGURE = 16;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FIGURE__LAYOUT_DATA = FIGURE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FIGURE__LAYOUT = FIGURE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FIGURE__DESCRIPTOR = FIGURE__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FIGURE__FOREGROUND_COLOR = FIGURE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FIGURE__BACKGROUND_COLOR = FIGURE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FIGURE__MAXIMUM_SIZE = FIGURE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FIGURE__MINIMUM_SIZE = FIGURE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FIGURE__PREFERRED_SIZE = FIGURE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FIGURE__FONT = FIGURE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FIGURE__INSETS = FIGURE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FIGURE__BORDER = FIGURE__BORDER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FIGURE__LOCATION = FIGURE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FIGURE__SIZE = FIGURE__SIZE;

	/**
	 * The number of structural features of the '<em>Abstract Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FIGURE_FEATURE_COUNT = FIGURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.FigureDescriptorImpl <em>Figure Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.FigureDescriptorImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getFigureDescriptor()
	 * @generated
	 */
	int FIGURE_DESCRIPTOR = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_DESCRIPTOR__NAME = IDENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Actual Figure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_DESCRIPTOR__ACTUAL_FIGURE = IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accessors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_DESCRIPTOR__ACCESSORS = IDENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Figure Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_DESCRIPTOR_FEATURE_COUNT = IDENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_ACCESS__OWNER = 0;

	/**
	 * The feature id for the '<em><b>Accessor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_ACCESS__ACCESSOR = 1;

	/**
	 * The feature id for the '<em><b>Figure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_ACCESS__FIGURE = 2;

	/**
	 * The number of structural features of the '<em>Child Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_ACCESS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.RealFigureImpl <em>Real Figure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.RealFigureImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getRealFigure()
	 * @generated
	 */
	int REAL_FIGURE = 19;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FIGURE__LAYOUT_DATA = ABSTRACT_FIGURE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FIGURE__LAYOUT = ABSTRACT_FIGURE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FIGURE__DESCRIPTOR = ABSTRACT_FIGURE__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FIGURE__FOREGROUND_COLOR = ABSTRACT_FIGURE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FIGURE__BACKGROUND_COLOR = ABSTRACT_FIGURE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FIGURE__MAXIMUM_SIZE = ABSTRACT_FIGURE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FIGURE__MINIMUM_SIZE = ABSTRACT_FIGURE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FIGURE__PREFERRED_SIZE = ABSTRACT_FIGURE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FIGURE__FONT = ABSTRACT_FIGURE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FIGURE__INSETS = ABSTRACT_FIGURE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FIGURE__BORDER = ABSTRACT_FIGURE__BORDER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FIGURE__LOCATION = ABSTRACT_FIGURE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FIGURE__SIZE = ABSTRACT_FIGURE__SIZE;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FIGURE__PINS = ABSTRACT_FIGURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FIGURE__ATTRIBUTES = ABSTRACT_FIGURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FIGURE__NAME = ABSTRACT_FIGURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FIGURE__CHILDREN = ABSTRACT_FIGURE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Real Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FIGURE_FEATURE_COUNT = ABSTRACT_FIGURE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.FigureRefImpl <em>Figure Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.FigureRefImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getFigureRef()
	 * @generated
	 */
	int FIGURE_REF = 20;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_REF__LAYOUT_DATA = ABSTRACT_FIGURE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_REF__LAYOUT = ABSTRACT_FIGURE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_REF__DESCRIPTOR = ABSTRACT_FIGURE__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_REF__FOREGROUND_COLOR = ABSTRACT_FIGURE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_REF__BACKGROUND_COLOR = ABSTRACT_FIGURE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_REF__MAXIMUM_SIZE = ABSTRACT_FIGURE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_REF__MINIMUM_SIZE = ABSTRACT_FIGURE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_REF__PREFERRED_SIZE = ABSTRACT_FIGURE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_REF__FONT = ABSTRACT_FIGURE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_REF__INSETS = ABSTRACT_FIGURE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_REF__BORDER = ABSTRACT_FIGURE__BORDER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_REF__LOCATION = ABSTRACT_FIGURE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_REF__SIZE = ABSTRACT_FIGURE__SIZE;

	/**
	 * The feature id for the '<em><b>Figure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_REF__FIGURE = ABSTRACT_FIGURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Figure Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_REF_FEATURE_COUNT = ABSTRACT_FIGURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.ConnectionFigure <em>Connection Figure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.ConnectionFigure
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getConnectionFigure()
	 * @generated
	 */
	int CONNECTION_FIGURE = 21;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__LAYOUT_DATA = REAL_FIGURE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__LAYOUT = REAL_FIGURE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__DESCRIPTOR = REAL_FIGURE__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__FOREGROUND_COLOR = REAL_FIGURE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__BACKGROUND_COLOR = REAL_FIGURE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__MAXIMUM_SIZE = REAL_FIGURE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__MINIMUM_SIZE = REAL_FIGURE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__PREFERRED_SIZE = REAL_FIGURE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__FONT = REAL_FIGURE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__INSETS = REAL_FIGURE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__BORDER = REAL_FIGURE__BORDER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__LOCATION = REAL_FIGURE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__SIZE = REAL_FIGURE__SIZE;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__PINS = REAL_FIGURE__PINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__ATTRIBUTES = REAL_FIGURE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__NAME = REAL_FIGURE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE__CHILDREN = REAL_FIGURE__CHILDREN;

	/**
	 * The number of structural features of the '<em>Connection Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FIGURE_FEATURE_COUNT = REAL_FIGURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.DecorationFigure <em>Decoration Figure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.DecorationFigure
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getDecorationFigure()
	 * @generated
	 */
	int DECORATION_FIGURE = 22;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__LAYOUT_DATA = REAL_FIGURE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__LAYOUT = REAL_FIGURE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__DESCRIPTOR = REAL_FIGURE__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__FOREGROUND_COLOR = REAL_FIGURE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__BACKGROUND_COLOR = REAL_FIGURE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__MAXIMUM_SIZE = REAL_FIGURE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__MINIMUM_SIZE = REAL_FIGURE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__PREFERRED_SIZE = REAL_FIGURE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__FONT = REAL_FIGURE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__INSETS = REAL_FIGURE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__BORDER = REAL_FIGURE__BORDER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__LOCATION = REAL_FIGURE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__SIZE = REAL_FIGURE__SIZE;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__PINS = REAL_FIGURE__PINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__ATTRIBUTES = REAL_FIGURE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__NAME = REAL_FIGURE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE__CHILDREN = REAL_FIGURE__CHILDREN;

	/**
	 * The number of structural features of the '<em>Decoration Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FIGURE_FEATURE_COUNT = REAL_FIGURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.ShapeImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 23;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LAYOUT_DATA = REAL_FIGURE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LAYOUT = REAL_FIGURE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__DESCRIPTOR = REAL_FIGURE__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__FOREGROUND_COLOR = REAL_FIGURE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__BACKGROUND_COLOR = REAL_FIGURE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__MAXIMUM_SIZE = REAL_FIGURE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__MINIMUM_SIZE = REAL_FIGURE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__PREFERRED_SIZE = REAL_FIGURE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__FONT = REAL_FIGURE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__INSETS = REAL_FIGURE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__BORDER = REAL_FIGURE__BORDER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LOCATION = REAL_FIGURE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__SIZE = REAL_FIGURE__SIZE;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__PINS = REAL_FIGURE__PINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__ATTRIBUTES = REAL_FIGURE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__NAME = REAL_FIGURE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__CHILDREN = REAL_FIGURE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__OUTLINE = REAL_FIGURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__FILL = REAL_FIGURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LINE_WIDTH = REAL_FIGURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Line Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LINE_KIND = REAL_FIGURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Xor Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__XOR_FILL = REAL_FIGURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Xor Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__XOR_OUTLINE = REAL_FIGURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Resolved Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__RESOLVED_CHILDREN = REAL_FIGURE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = REAL_FIGURE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.LabelImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 24;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__LAYOUT_DATA = REAL_FIGURE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__LAYOUT = REAL_FIGURE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__DESCRIPTOR = REAL_FIGURE__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FOREGROUND_COLOR = REAL_FIGURE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BACKGROUND_COLOR = REAL_FIGURE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__MAXIMUM_SIZE = REAL_FIGURE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__MINIMUM_SIZE = REAL_FIGURE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__PREFERRED_SIZE = REAL_FIGURE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FONT = REAL_FIGURE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__INSETS = REAL_FIGURE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BORDER = REAL_FIGURE__BORDER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__LOCATION = REAL_FIGURE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__SIZE = REAL_FIGURE__SIZE;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__PINS = REAL_FIGURE__PINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ATTRIBUTES = REAL_FIGURE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NAME = REAL_FIGURE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__CHILDREN = REAL_FIGURE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT = REAL_FIGURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = REAL_FIGURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.LabeledContainerImpl <em>Labeled Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.LabeledContainerImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getLabeledContainer()
	 * @generated
	 */
	int LABELED_CONTAINER = 25;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__LAYOUT_DATA = REAL_FIGURE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__LAYOUT = REAL_FIGURE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__DESCRIPTOR = REAL_FIGURE__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__FOREGROUND_COLOR = REAL_FIGURE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__BACKGROUND_COLOR = REAL_FIGURE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__MAXIMUM_SIZE = REAL_FIGURE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__MINIMUM_SIZE = REAL_FIGURE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__PREFERRED_SIZE = REAL_FIGURE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__FONT = REAL_FIGURE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__INSETS = REAL_FIGURE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__BORDER = REAL_FIGURE__BORDER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__LOCATION = REAL_FIGURE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__SIZE = REAL_FIGURE__SIZE;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__PINS = REAL_FIGURE__PINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__ATTRIBUTES = REAL_FIGURE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__NAME = REAL_FIGURE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER__CHILDREN = REAL_FIGURE__CHILDREN;

	/**
	 * The number of structural features of the '<em>Labeled Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_CONTAINER_FEATURE_COUNT = REAL_FIGURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.VerticalLabelImpl <em>Vertical Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.VerticalLabelImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getVerticalLabel()
	 * @generated
	 */
	int VERTICAL_LABEL = 26;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LABEL__LAYOUT_DATA = REAL_FIGURE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LABEL__LAYOUT = REAL_FIGURE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LABEL__DESCRIPTOR = REAL_FIGURE__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LABEL__FOREGROUND_COLOR = REAL_FIGURE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LABEL__BACKGROUND_COLOR = REAL_FIGURE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LABEL__MAXIMUM_SIZE = REAL_FIGURE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LABEL__MINIMUM_SIZE = REAL_FIGURE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LABEL__PREFERRED_SIZE = REAL_FIGURE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LABEL__FONT = REAL_FIGURE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LABEL__INSETS = REAL_FIGURE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LABEL__BORDER = REAL_FIGURE__BORDER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LABEL__LOCATION = REAL_FIGURE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LABEL__SIZE = REAL_FIGURE__SIZE;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LABEL__PINS = REAL_FIGURE__PINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LABEL__ATTRIBUTES = REAL_FIGURE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LABEL__NAME = REAL_FIGURE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LABEL__CHILDREN = REAL_FIGURE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LABEL__TEXT = REAL_FIGURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vertical Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LABEL_FEATURE_COUNT = REAL_FIGURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.RectangleImpl <em>Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.RectangleImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 27;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__LAYOUT_DATA = SHAPE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__LAYOUT = SHAPE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__DESCRIPTOR = SHAPE__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__FOREGROUND_COLOR = SHAPE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__BACKGROUND_COLOR = SHAPE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__MAXIMUM_SIZE = SHAPE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__MINIMUM_SIZE = SHAPE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__PREFERRED_SIZE = SHAPE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__FONT = SHAPE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__INSETS = SHAPE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__BORDER = SHAPE__BORDER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__LOCATION = SHAPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__SIZE = SHAPE__SIZE;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__PINS = SHAPE__PINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__ATTRIBUTES = SHAPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__NAME = SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__CHILDREN = SHAPE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__OUTLINE = SHAPE__OUTLINE;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__FILL = SHAPE__FILL;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__LINE_WIDTH = SHAPE__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__LINE_KIND = SHAPE__LINE_KIND;

	/**
	 * The feature id for the '<em><b>Xor Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__XOR_FILL = SHAPE__XOR_FILL;

	/**
	 * The feature id for the '<em><b>Xor Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__XOR_OUTLINE = SHAPE__XOR_OUTLINE;

	/**
	 * The feature id for the '<em><b>Resolved Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__RESOLVED_CHILDREN = SHAPE__RESOLVED_CHILDREN;

	/**
	 * The number of structural features of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.InvisibleRectangleImpl <em>Invisible Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.InvisibleRectangleImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getInvisibleRectangle()
	 * @generated
	 */
	int INVISIBLE_RECTANGLE = 28;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVISIBLE_RECTANGLE__LAYOUT_DATA = REAL_FIGURE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVISIBLE_RECTANGLE__LAYOUT = REAL_FIGURE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVISIBLE_RECTANGLE__DESCRIPTOR = REAL_FIGURE__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVISIBLE_RECTANGLE__FOREGROUND_COLOR = REAL_FIGURE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVISIBLE_RECTANGLE__BACKGROUND_COLOR = REAL_FIGURE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVISIBLE_RECTANGLE__MAXIMUM_SIZE = REAL_FIGURE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVISIBLE_RECTANGLE__MINIMUM_SIZE = REAL_FIGURE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVISIBLE_RECTANGLE__PREFERRED_SIZE = REAL_FIGURE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVISIBLE_RECTANGLE__FONT = REAL_FIGURE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVISIBLE_RECTANGLE__INSETS = REAL_FIGURE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVISIBLE_RECTANGLE__BORDER = REAL_FIGURE__BORDER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVISIBLE_RECTANGLE__LOCATION = REAL_FIGURE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVISIBLE_RECTANGLE__SIZE = REAL_FIGURE__SIZE;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVISIBLE_RECTANGLE__PINS = REAL_FIGURE__PINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVISIBLE_RECTANGLE__ATTRIBUTES = REAL_FIGURE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVISIBLE_RECTANGLE__NAME = REAL_FIGURE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVISIBLE_RECTANGLE__CHILDREN = REAL_FIGURE__CHILDREN;

	/**
	 * The number of structural features of the '<em>Invisible Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVISIBLE_RECTANGLE_FEATURE_COUNT = REAL_FIGURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.RoundedRectangleImpl <em>Rounded Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.RoundedRectangleImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getRoundedRectangle()
	 * @generated
	 */
	int ROUNDED_RECTANGLE = 29;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__LAYOUT_DATA = SHAPE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__LAYOUT = SHAPE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__DESCRIPTOR = SHAPE__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__FOREGROUND_COLOR = SHAPE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__BACKGROUND_COLOR = SHAPE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__MAXIMUM_SIZE = SHAPE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__MINIMUM_SIZE = SHAPE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__PREFERRED_SIZE = SHAPE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__FONT = SHAPE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__INSETS = SHAPE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__BORDER = SHAPE__BORDER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__LOCATION = SHAPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__SIZE = SHAPE__SIZE;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__PINS = SHAPE__PINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__ATTRIBUTES = SHAPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__NAME = SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__CHILDREN = SHAPE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__OUTLINE = SHAPE__OUTLINE;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__FILL = SHAPE__FILL;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__LINE_WIDTH = SHAPE__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__LINE_KIND = SHAPE__LINE_KIND;

	/**
	 * The feature id for the '<em><b>Xor Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__XOR_FILL = SHAPE__XOR_FILL;

	/**
	 * The feature id for the '<em><b>Xor Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__XOR_OUTLINE = SHAPE__XOR_OUTLINE;

	/**
	 * The feature id for the '<em><b>Resolved Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__RESOLVED_CHILDREN = SHAPE__RESOLVED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Corner Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__CORNER_WIDTH = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Corner Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__CORNER_HEIGHT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rounded Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.EllipseImpl <em>Ellipse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.EllipseImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getEllipse()
	 * @generated
	 */
	int ELLIPSE = 30;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__LAYOUT_DATA = SHAPE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__LAYOUT = SHAPE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__DESCRIPTOR = SHAPE__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__FOREGROUND_COLOR = SHAPE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__BACKGROUND_COLOR = SHAPE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__MAXIMUM_SIZE = SHAPE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__MINIMUM_SIZE = SHAPE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__PREFERRED_SIZE = SHAPE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__FONT = SHAPE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__INSETS = SHAPE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__BORDER = SHAPE__BORDER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__LOCATION = SHAPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__SIZE = SHAPE__SIZE;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__PINS = SHAPE__PINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__ATTRIBUTES = SHAPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__NAME = SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__CHILDREN = SHAPE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__OUTLINE = SHAPE__OUTLINE;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__FILL = SHAPE__FILL;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__LINE_WIDTH = SHAPE__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__LINE_KIND = SHAPE__LINE_KIND;

	/**
	 * The feature id for the '<em><b>Xor Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__XOR_FILL = SHAPE__XOR_FILL;

	/**
	 * The feature id for the '<em><b>Xor Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__XOR_OUTLINE = SHAPE__XOR_OUTLINE;

	/**
	 * The feature id for the '<em><b>Resolved Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__RESOLVED_CHILDREN = SHAPE__RESOLVED_CHILDREN;

	/**
	 * The number of structural features of the '<em>Ellipse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.PolylineImpl <em>Polyline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.PolylineImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getPolyline()
	 * @generated
	 */
	int POLYLINE = 31;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__LAYOUT_DATA = SHAPE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__LAYOUT = SHAPE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__DESCRIPTOR = SHAPE__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__FOREGROUND_COLOR = SHAPE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__BACKGROUND_COLOR = SHAPE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__MAXIMUM_SIZE = SHAPE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__MINIMUM_SIZE = SHAPE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__PREFERRED_SIZE = SHAPE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__FONT = SHAPE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__INSETS = SHAPE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__BORDER = SHAPE__BORDER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__LOCATION = SHAPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__SIZE = SHAPE__SIZE;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__PINS = SHAPE__PINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__ATTRIBUTES = SHAPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__NAME = SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__CHILDREN = SHAPE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__OUTLINE = SHAPE__OUTLINE;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__FILL = SHAPE__FILL;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__LINE_WIDTH = SHAPE__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__LINE_KIND = SHAPE__LINE_KIND;

	/**
	 * The feature id for the '<em><b>Xor Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__XOR_FILL = SHAPE__XOR_FILL;

	/**
	 * The feature id for the '<em><b>Xor Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__XOR_OUTLINE = SHAPE__XOR_OUTLINE;

	/**
	 * The feature id for the '<em><b>Resolved Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__RESOLVED_CHILDREN = SHAPE__RESOLVED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__TEMPLATE = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Polyline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.PolygonImpl <em>Polygon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.PolygonImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getPolygon()
	 * @generated
	 */
	int POLYGON = 32;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__LAYOUT_DATA = POLYLINE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__LAYOUT = POLYLINE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__DESCRIPTOR = POLYLINE__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__FOREGROUND_COLOR = POLYLINE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__BACKGROUND_COLOR = POLYLINE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__MAXIMUM_SIZE = POLYLINE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__MINIMUM_SIZE = POLYLINE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__PREFERRED_SIZE = POLYLINE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__FONT = POLYLINE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__INSETS = POLYLINE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__BORDER = POLYLINE__BORDER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__LOCATION = POLYLINE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__SIZE = POLYLINE__SIZE;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__PINS = POLYLINE__PINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__ATTRIBUTES = POLYLINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__NAME = POLYLINE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__CHILDREN = POLYLINE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__OUTLINE = POLYLINE__OUTLINE;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__FILL = POLYLINE__FILL;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__LINE_WIDTH = POLYLINE__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__LINE_KIND = POLYLINE__LINE_KIND;

	/**
	 * The feature id for the '<em><b>Xor Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__XOR_FILL = POLYLINE__XOR_FILL;

	/**
	 * The feature id for the '<em><b>Xor Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__XOR_OUTLINE = POLYLINE__XOR_OUTLINE;

	/**
	 * The feature id for the '<em><b>Resolved Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__RESOLVED_CHILDREN = POLYLINE__RESOLVED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__TEMPLATE = POLYLINE__TEMPLATE;

	/**
	 * The number of structural features of the '<em>Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FEATURE_COUNT = POLYLINE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.ScalablePolygonImpl <em>Scalable Polygon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.ScalablePolygonImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getScalablePolygon()
	 * @generated
	 */
	int SCALABLE_POLYGON = 33;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLE_POLYGON__LAYOUT_DATA = POLYGON__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLE_POLYGON__LAYOUT = POLYGON__LAYOUT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLE_POLYGON__DESCRIPTOR = POLYGON__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLE_POLYGON__FOREGROUND_COLOR = POLYGON__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLE_POLYGON__BACKGROUND_COLOR = POLYGON__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLE_POLYGON__MAXIMUM_SIZE = POLYGON__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLE_POLYGON__MINIMUM_SIZE = POLYGON__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLE_POLYGON__PREFERRED_SIZE = POLYGON__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLE_POLYGON__FONT = POLYGON__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLE_POLYGON__INSETS = POLYGON__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLE_POLYGON__BORDER = POLYGON__BORDER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLE_POLYGON__LOCATION = POLYGON__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLE_POLYGON__SIZE = POLYGON__SIZE;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLE_POLYGON__PINS = POLYGON__PINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLE_POLYGON__ATTRIBUTES = POLYGON__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLE_POLYGON__NAME = POLYGON__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLE_POLYGON__CHILDREN = POLYGON__CHILDREN;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLE_POLYGON__OUTLINE = POLYGON__OUTLINE;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLE_POLYGON__FILL = POLYGON__FILL;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLE_POLYGON__LINE_WIDTH = POLYGON__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLE_POLYGON__LINE_KIND = POLYGON__LINE_KIND;

	/**
	 * The feature id for the '<em><b>Xor Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLE_POLYGON__XOR_FILL = POLYGON__XOR_FILL;

	/**
	 * The feature id for the '<em><b>Xor Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLE_POLYGON__XOR_OUTLINE = POLYGON__XOR_OUTLINE;

	/**
	 * The feature id for the '<em><b>Resolved Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLE_POLYGON__RESOLVED_CHILDREN = POLYGON__RESOLVED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLE_POLYGON__TEMPLATE = POLYGON__TEMPLATE;

	/**
	 * The number of structural features of the '<em>Scalable Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABLE_POLYGON_FEATURE_COUNT = POLYGON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.PolylineConnectionImpl <em>Polyline Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.PolylineConnectionImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getPolylineConnection()
	 * @generated
	 */
	int POLYLINE_CONNECTION = 34;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__LAYOUT_DATA = POLYLINE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__LAYOUT = POLYLINE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__DESCRIPTOR = POLYLINE__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__FOREGROUND_COLOR = POLYLINE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__BACKGROUND_COLOR = POLYLINE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__MAXIMUM_SIZE = POLYLINE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__MINIMUM_SIZE = POLYLINE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__PREFERRED_SIZE = POLYLINE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__FONT = POLYLINE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__INSETS = POLYLINE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__BORDER = POLYLINE__BORDER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__LOCATION = POLYLINE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__SIZE = POLYLINE__SIZE;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__PINS = POLYLINE__PINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__ATTRIBUTES = POLYLINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__NAME = POLYLINE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__CHILDREN = POLYLINE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__OUTLINE = POLYLINE__OUTLINE;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__FILL = POLYLINE__FILL;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__LINE_WIDTH = POLYLINE__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__LINE_KIND = POLYLINE__LINE_KIND;

	/**
	 * The feature id for the '<em><b>Xor Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__XOR_FILL = POLYLINE__XOR_FILL;

	/**
	 * The feature id for the '<em><b>Xor Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__XOR_OUTLINE = POLYLINE__XOR_OUTLINE;

	/**
	 * The feature id for the '<em><b>Resolved Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__RESOLVED_CHILDREN = POLYLINE__RESOLVED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__TEMPLATE = POLYLINE__TEMPLATE;

	/**
	 * The feature id for the '<em><b>Source Decoration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__SOURCE_DECORATION = POLYLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Decoration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION__TARGET_DECORATION = POLYLINE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Polyline Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_CONNECTION_FEATURE_COUNT = POLYLINE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.PolylineDecorationImpl <em>Polyline Decoration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.PolylineDecorationImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getPolylineDecoration()
	 * @generated
	 */
	int POLYLINE_DECORATION = 35;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__LAYOUT_DATA = POLYLINE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__LAYOUT = POLYLINE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__DESCRIPTOR = POLYLINE__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__FOREGROUND_COLOR = POLYLINE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__BACKGROUND_COLOR = POLYLINE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__MAXIMUM_SIZE = POLYLINE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__MINIMUM_SIZE = POLYLINE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__PREFERRED_SIZE = POLYLINE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__FONT = POLYLINE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__INSETS = POLYLINE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__BORDER = POLYLINE__BORDER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__LOCATION = POLYLINE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__SIZE = POLYLINE__SIZE;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__PINS = POLYLINE__PINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__ATTRIBUTES = POLYLINE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__NAME = POLYLINE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__CHILDREN = POLYLINE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__OUTLINE = POLYLINE__OUTLINE;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__FILL = POLYLINE__FILL;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__LINE_WIDTH = POLYLINE__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__LINE_KIND = POLYLINE__LINE_KIND;

	/**
	 * The feature id for the '<em><b>Xor Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__XOR_FILL = POLYLINE__XOR_FILL;

	/**
	 * The feature id for the '<em><b>Xor Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__XOR_OUTLINE = POLYLINE__XOR_OUTLINE;

	/**
	 * The feature id for the '<em><b>Resolved Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__RESOLVED_CHILDREN = POLYLINE__RESOLVED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION__TEMPLATE = POLYLINE__TEMPLATE;

	/**
	 * The number of structural features of the '<em>Polyline Decoration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_DECORATION_FEATURE_COUNT = POLYLINE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.PolygonDecorationImpl <em>Polygon Decoration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.PolygonDecorationImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getPolygonDecoration()
	 * @generated
	 */
	int POLYGON_DECORATION = 36;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__LAYOUT_DATA = POLYGON__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__LAYOUT = POLYGON__LAYOUT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__DESCRIPTOR = POLYGON__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__FOREGROUND_COLOR = POLYGON__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__BACKGROUND_COLOR = POLYGON__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__MAXIMUM_SIZE = POLYGON__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__MINIMUM_SIZE = POLYGON__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__PREFERRED_SIZE = POLYGON__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__FONT = POLYGON__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__INSETS = POLYGON__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__BORDER = POLYGON__BORDER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__LOCATION = POLYGON__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__SIZE = POLYGON__SIZE;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__PINS = POLYGON__PINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__ATTRIBUTES = POLYGON__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__NAME = POLYGON__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__CHILDREN = POLYGON__CHILDREN;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__OUTLINE = POLYGON__OUTLINE;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__FILL = POLYGON__FILL;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__LINE_WIDTH = POLYGON__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__LINE_KIND = POLYGON__LINE_KIND;

	/**
	 * The feature id for the '<em><b>Xor Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__XOR_FILL = POLYGON__XOR_FILL;

	/**
	 * The feature id for the '<em><b>Xor Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__XOR_OUTLINE = POLYGON__XOR_OUTLINE;

	/**
	 * The feature id for the '<em><b>Resolved Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__RESOLVED_CHILDREN = POLYGON__RESOLVED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION__TEMPLATE = POLYGON__TEMPLATE;

	/**
	 * The number of structural features of the '<em>Polygon Decoration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_DECORATION_FEATURE_COUNT = POLYGON_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.CustomAttributeOwner <em>Custom Attribute Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.CustomAttributeOwner
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getCustomAttributeOwner()
	 * @generated
	 */
	int CUSTOM_ATTRIBUTE_OWNER = 37;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ATTRIBUTE_OWNER__ATTRIBUTES = 0;

	/**
	 * The number of structural features of the '<em>Custom Attribute Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ATTRIBUTE_OWNER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.CustomClass <em>Custom Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.CustomClass
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getCustomClass()
	 * @generated
	 */
	int CUSTOM_CLASS = 38;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CLASS__ATTRIBUTES = CUSTOM_ATTRIBUTE_OWNER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CLASS__QUALIFIED_CLASS_NAME = CUSTOM_ATTRIBUTE_OWNER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CLASS_FEATURE_COUNT = CUSTOM_ATTRIBUTE_OWNER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.CustomFigureImpl <em>Custom Figure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.CustomFigureImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getCustomFigure()
	 * @generated
	 */
	int CUSTOM_FIGURE = 41;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.CustomDecorationImpl <em>Custom Decoration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.CustomDecorationImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getCustomDecoration()
	 * @generated
	 */
	int CUSTOM_DECORATION = 42;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.CustomConnectionImpl <em>Custom Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.CustomConnectionImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getCustomConnection()
	 * @generated
	 */
	int CUSTOM_CONNECTION = 43;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.Color <em>Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.Color
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 44;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.RGBColorImpl <em>RGB Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.RGBColorImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getRGBColor()
	 * @generated
	 */
	int RGB_COLOR = 45;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.ConstantColorImpl <em>Constant Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.ConstantColorImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getConstantColor()
	 * @generated
	 */
	int CONSTANT_COLOR = 46;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.Font <em>Font</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.Font
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getFont()
	 * @generated
	 */
	int FONT = 47;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.BasicFontImpl <em>Basic Font</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.BasicFontImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getBasicFont()
	 * @generated
	 */
	int BASIC_FONT = 48;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.FontStyle <em>Font Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.FontStyle
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getFontStyle()
	 * @generated
	 */
	int FONT_STYLE = 82;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.PointImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 49;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.DimensionImpl <em>Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.DimensionImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 50;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.InsetsImpl <em>Insets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.InsetsImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getInsets()
	 * @generated
	 */
	int INSETS = 51;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.Border <em>Border</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.Border
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getBorder()
	 * @generated
	 */
	int BORDER = 52;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.LineBorderImpl <em>Line Border</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.LineBorderImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getLineBorder()
	 * @generated
	 */
	int LINE_BORDER = 54;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.MarginBorderImpl <em>Margin Border</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.MarginBorderImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getMarginBorder()
	 * @generated
	 */
	int MARGIN_BORDER = 55;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.CompoundBorderImpl <em>Compound Border</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.CompoundBorderImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getCompoundBorder()
	 * @generated
	 */
	int COMPOUND_BORDER = 56;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.CustomBorderImpl <em>Custom Border</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.CustomBorderImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getCustomBorder()
	 * @generated
	 */
	int CUSTOM_BORDER = 57;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.LayoutData <em>Layout Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.LayoutData
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getLayoutData()
	 * @generated
	 */
	int LAYOUT_DATA = 58;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.GridLayoutDataImpl <em>Grid Layout Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.GridLayoutDataImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getGridLayoutData()
	 * @generated
	 */
	int GRID_LAYOUT_DATA = 60;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.BorderLayoutDataImpl <em>Border Layout Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.BorderLayoutDataImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getBorderLayoutData()
	 * @generated
	 */
	int BORDER_LAYOUT_DATA = 61;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.CustomLayoutImpl <em>Custom Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.CustomLayoutImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getCustomLayout()
	 * @generated
	 */
	int CUSTOM_LAYOUT = 65;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.Layout <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.Layout
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 63;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.CustomLayoutDataImpl <em>Custom Layout Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.CustomLayoutDataImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getCustomLayoutData()
	 * @generated
	 */
	int CUSTOM_LAYOUT_DATA = 59;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.GridLayoutImpl <em>Grid Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.GridLayoutImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getGridLayout()
	 * @generated
	 */
	int GRID_LAYOUT = 66;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.BorderLayoutImpl <em>Border Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.BorderLayoutImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getBorderLayout()
	 * @generated
	 */
	int BORDER_LAYOUT = 67;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.CustomAttributeImpl <em>Custom Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.CustomAttributeImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getCustomAttribute()
	 * @generated
	 */
	int CUSTOM_ATTRIBUTE = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ATTRIBUTE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Direct Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ATTRIBUTE__DIRECT_ACCESS = 2;

	/**
	 * The feature id for the '<em><b>Multi Statement Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ATTRIBUTE__MULTI_STATEMENT_VALUE = 3;

	/**
	 * The number of structural features of the '<em>Custom Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ATTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.FigureAccessorImpl <em>Figure Accessor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.FigureAccessorImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getFigureAccessor()
	 * @generated
	 */
	int FIGURE_ACCESSOR = 40;

	/**
	 * The feature id for the '<em><b>Accessor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_ACCESSOR__ACCESSOR = 0;

	/**
	 * The feature id for the '<em><b>Typed Figure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_ACCESSOR__TYPED_FIGURE = 1;

	/**
	 * The number of structural features of the '<em>Figure Accessor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_ACCESSOR_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__LAYOUT_DATA = REAL_FIGURE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__LAYOUT = REAL_FIGURE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__DESCRIPTOR = REAL_FIGURE__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__FOREGROUND_COLOR = REAL_FIGURE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__BACKGROUND_COLOR = REAL_FIGURE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__MAXIMUM_SIZE = REAL_FIGURE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__MINIMUM_SIZE = REAL_FIGURE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__PREFERRED_SIZE = REAL_FIGURE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__FONT = REAL_FIGURE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__INSETS = REAL_FIGURE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__BORDER = REAL_FIGURE__BORDER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__LOCATION = REAL_FIGURE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__SIZE = REAL_FIGURE__SIZE;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__PINS = REAL_FIGURE__PINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__ATTRIBUTES = REAL_FIGURE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__NAME = REAL_FIGURE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__CHILDREN = REAL_FIGURE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__QUALIFIED_CLASS_NAME = REAL_FIGURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Custom Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE__CUSTOM_CHILDREN = REAL_FIGURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FIGURE_FEATURE_COUNT = REAL_FIGURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__LAYOUT_DATA = CUSTOM_FIGURE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__LAYOUT = CUSTOM_FIGURE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__DESCRIPTOR = CUSTOM_FIGURE__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__FOREGROUND_COLOR = CUSTOM_FIGURE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__BACKGROUND_COLOR = CUSTOM_FIGURE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__MAXIMUM_SIZE = CUSTOM_FIGURE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__MINIMUM_SIZE = CUSTOM_FIGURE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__PREFERRED_SIZE = CUSTOM_FIGURE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__FONT = CUSTOM_FIGURE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__INSETS = CUSTOM_FIGURE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__BORDER = CUSTOM_FIGURE__BORDER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__LOCATION = CUSTOM_FIGURE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__SIZE = CUSTOM_FIGURE__SIZE;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__PINS = CUSTOM_FIGURE__PINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__ATTRIBUTES = CUSTOM_FIGURE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__NAME = CUSTOM_FIGURE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__CHILDREN = CUSTOM_FIGURE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__QUALIFIED_CLASS_NAME = CUSTOM_FIGURE__QUALIFIED_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Custom Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION__CUSTOM_CHILDREN = CUSTOM_FIGURE__CUSTOM_CHILDREN;

	/**
	 * The number of structural features of the '<em>Custom Decoration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DECORATION_FEATURE_COUNT = CUSTOM_FIGURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__LAYOUT_DATA = CUSTOM_FIGURE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__LAYOUT = CUSTOM_FIGURE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__DESCRIPTOR = CUSTOM_FIGURE__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__FOREGROUND_COLOR = CUSTOM_FIGURE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__BACKGROUND_COLOR = CUSTOM_FIGURE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__MAXIMUM_SIZE = CUSTOM_FIGURE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__MINIMUM_SIZE = CUSTOM_FIGURE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__PREFERRED_SIZE = CUSTOM_FIGURE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__FONT = CUSTOM_FIGURE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__INSETS = CUSTOM_FIGURE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__BORDER = CUSTOM_FIGURE__BORDER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__LOCATION = CUSTOM_FIGURE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__SIZE = CUSTOM_FIGURE__SIZE;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__PINS = CUSTOM_FIGURE__PINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__ATTRIBUTES = CUSTOM_FIGURE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__NAME = CUSTOM_FIGURE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__CHILDREN = CUSTOM_FIGURE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__QUALIFIED_CLASS_NAME = CUSTOM_FIGURE__QUALIFIED_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Custom Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION__CUSTOM_CHILDREN = CUSTOM_FIGURE__CUSTOM_CHILDREN;

	/**
	 * The number of structural features of the '<em>Custom Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONNECTION_FEATURE_COUNT = CUSTOM_FIGURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR__RED = COLOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR__GREEN = COLOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR__BLUE = COLOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>RGB Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR_FEATURE_COUNT = COLOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_COLOR__VALUE = COLOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_COLOR_FEATURE_COUNT = COLOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Font</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Face Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FONT__FACE_NAME = FONT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FONT__HEIGHT = FONT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FONT__STYLE = FONT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Basic Font</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FONT_FEATURE_COUNT = FONT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Y = 1;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Dx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__DX = 0;

	/**
	 * The feature id for the '<em><b>Dy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__DY = 1;

	/**
	 * The number of structural features of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSETS__TOP = 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSETS__LEFT = 1;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSETS__BOTTOM = 2;

	/**
	 * The feature id for the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSETS__RIGHT = 3;

	/**
	 * The number of structural features of the '<em>Insets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSETS_FEATURE_COUNT = 4;

	/**
	 * The number of structural features of the '<em>Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.BorderRefImpl <em>Border Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.BorderRefImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getBorderRef()
	 * @generated
	 */
	int BORDER_REF = 53;

	/**
	 * The feature id for the '<em><b>Actual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_REF__ACTUAL = BORDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Border Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_REF_FEATURE_COUNT = BORDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BORDER__COLOR = BORDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BORDER__WIDTH = BORDER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Line Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BORDER_FEATURE_COUNT = BORDER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN_BORDER__INSETS = BORDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Margin Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN_BORDER_FEATURE_COUNT = BORDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_BORDER__OUTER = BORDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_BORDER__INNER = BORDER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compound Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_BORDER_FEATURE_COUNT = BORDER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_BORDER__ATTRIBUTES = BORDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_BORDER__QUALIFIED_CLASS_NAME = BORDER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_BORDER_FEATURE_COUNT = BORDER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DATA__OWNER = 0;

	/**
	 * The number of structural features of the '<em>Layout Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DATA_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT_DATA__OWNER = LAYOUT_DATA__OWNER;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT_DATA__ATTRIBUTES = LAYOUT_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT_DATA__QUALIFIED_CLASS_NAME = LAYOUT_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Layout Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT_DATA_FEATURE_COUNT = LAYOUT_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT_DATA__OWNER = LAYOUT_DATA__OWNER;

	/**
	 * The feature id for the '<em><b>Grab Excess Horizontal Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT_DATA__GRAB_EXCESS_HORIZONTAL_SPACE = LAYOUT_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Grab Excess Vertical Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT_DATA__GRAB_EXCESS_VERTICAL_SPACE = LAYOUT_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vertical Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT_DATA__VERTICAL_ALIGNMENT = LAYOUT_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT_DATA__HORIZONTAL_ALIGNMENT = LAYOUT_DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Vertical Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT_DATA__VERTICAL_SPAN = LAYOUT_DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Horizontal Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT_DATA__HORIZONTAL_SPAN = LAYOUT_DATA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Horizontal Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT_DATA__HORIZONTAL_INDENT = LAYOUT_DATA_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Size Hint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT_DATA__SIZE_HINT = LAYOUT_DATA_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Grid Layout Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT_DATA_FEATURE_COUNT = LAYOUT_DATA_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT_DATA__OWNER = LAYOUT_DATA__OWNER;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT_DATA__ALIGNMENT = LAYOUT_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT_DATA__VERTICAL = LAYOUT_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Border Layout Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT_DATA_FEATURE_COUNT = LAYOUT_DATA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.LayoutRefImpl <em>Layout Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.LayoutRefImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getLayoutRef()
	 * @generated
	 */
	int LAYOUT_REF = 64;

	/**
	 * The feature id for the '<em><b>Actual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_REF__ACTUAL = LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Layout Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_REF_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT__ATTRIBUTES = LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT__QUALIFIED_CLASS_NAME = LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Num Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__NUM_COLUMNS = LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Equal Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__EQUAL_WIDTH = LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Margins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__MARGINS = LAYOUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT__SPACING = LAYOUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Grid Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT__SPACING = LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Border Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.FlowLayoutImpl <em>Flow Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.FlowLayoutImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getFlowLayout()
	 * @generated
	 */
	int FLOW_LAYOUT = 68;

	/**
	 * The feature id for the '<em><b>Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__VERTICAL = LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Match Minor Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__MATCH_MINOR_SIZE = LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Force Single Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__FORCE_SINGLE_LINE = LAYOUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Major Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__MAJOR_ALIGNMENT = LAYOUT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Minor Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__MINOR_ALIGNMENT = LAYOUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Major Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__MAJOR_SPACING = LAYOUT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Minor Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__MINOR_SPACING = LAYOUT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Flow Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.XYLayoutImpl <em>XY Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.XYLayoutImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getXYLayout()
	 * @generated
	 */
	int XY_LAYOUT = 69;

	/**
	 * The number of structural features of the '<em>XY Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.XYLayoutDataImpl <em>XY Layout Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.XYLayoutDataImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getXYLayoutData()
	 * @generated
	 */
	int XY_LAYOUT_DATA = 70;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_LAYOUT_DATA__OWNER = LAYOUT_DATA__OWNER;

	/**
	 * The feature id for the '<em><b>Top Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_LAYOUT_DATA__TOP_LEFT = LAYOUT_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_LAYOUT_DATA__SIZE = LAYOUT_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XY Layout Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_LAYOUT_DATA_FEATURE_COUNT = LAYOUT_DATA_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.StackLayoutImpl <em>Stack Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.StackLayoutImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getStackLayout()
	 * @generated
	 */
	int STACK_LAYOUT = 71;

	/**
	 * The number of structural features of the '<em>Stack Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.CenterLayoutImpl <em>Center Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.CenterLayoutImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getCenterLayout()
	 * @generated
	 */
	int CENTER_LAYOUT = 72;

	/**
	 * The number of structural features of the '<em>Center Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTER_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.SVGFigureImpl <em>SVG Figure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.SVGFigureImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getSVGFigure()
	 * @generated
	 */
	int SVG_FIGURE = 73;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__LAYOUT_DATA = REAL_FIGURE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__LAYOUT = REAL_FIGURE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__DESCRIPTOR = REAL_FIGURE__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__FOREGROUND_COLOR = REAL_FIGURE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__BACKGROUND_COLOR = REAL_FIGURE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Maximum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__MAXIMUM_SIZE = REAL_FIGURE__MAXIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Minimum Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__MINIMUM_SIZE = REAL_FIGURE__MINIMUM_SIZE;

	/**
	 * The feature id for the '<em><b>Preferred Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__PREFERRED_SIZE = REAL_FIGURE__PREFERRED_SIZE;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__FONT = REAL_FIGURE__FONT;

	/**
	 * The feature id for the '<em><b>Insets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__INSETS = REAL_FIGURE__INSETS;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__BORDER = REAL_FIGURE__BORDER;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__LOCATION = REAL_FIGURE__LOCATION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__SIZE = REAL_FIGURE__SIZE;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__PINS = REAL_FIGURE__PINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__ATTRIBUTES = REAL_FIGURE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__NAME = REAL_FIGURE__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__CHILDREN = REAL_FIGURE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Document URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__DOCUMENT_URI = REAL_FIGURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__PROPERTIES = REAL_FIGURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Area Of Interest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__AREA_OF_INTEREST = REAL_FIGURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>No Canvas Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__NO_CANVAS_WIDTH = REAL_FIGURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>No Canvas Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__NO_CANVAS_HEIGHT = REAL_FIGURE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>SVG Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE_FEATURE_COUNT = REAL_FIGURE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.SVGPropertyImpl <em>SVG Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.SVGPropertyImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getSVGProperty()
	 * @generated
	 */
	int SVG_PROPERTY = 74;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_PROPERTY__QUERY = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_PROPERTY__ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_PROPERTY__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Getter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_PROPERTY__GETTER = 3;

	/**
	 * The feature id for the '<em><b>Setter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_PROPERTY__SETTER = 4;

	/**
	 * The feature id for the '<em><b>Call Super</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_PROPERTY__CALL_SUPER = 5;

	/**
	 * The number of structural features of the '<em>SVG Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_PROPERTY_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.Rectangle2DImpl <em>Rectangle2 D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.Rectangle2DImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getRectangle2D()
	 * @generated
	 */
	int RECTANGLE2_D = 75;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE2_D__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE2_D__Y = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE2_D__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE2_D__HEIGHT = 3;

	/**
	 * The number of structural features of the '<em>Rectangle2 D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE2_D_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.Pin <em>Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.Pin
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getPin()
	 * @generated
	 */
	int PIN = 76;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__NAME = IDENTITY__NAME;

	/**
	 * The number of structural features of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_FEATURE_COUNT = IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.CustomPinImpl <em>Custom Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.CustomPinImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getCustomPin()
	 * @generated
	 */
	int CUSTOM_PIN = 77;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PIN__NAME = PIN__NAME;

	/**
	 * The feature id for the '<em><b>Custom Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PIN__CUSTOM_OPERATION_NAME = PIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Custom Operation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PIN__CUSTOM_OPERATION_TYPE = PIN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.ColorPinImpl <em>Color Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.ColorPinImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getColorPin()
	 * @generated
	 */
	int COLOR_PIN = 78;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PIN__NAME = PIN__NAME;

	/**
	 * The feature id for the '<em><b>Background Not Foreground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PIN__BACKGROUND_NOT_FOREGROUND = PIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Color Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.impl.VisiblePinImpl <em>Visible Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.impl.VisiblePinImpl
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getVisiblePin()
	 * @generated
	 */
	int VISIBLE_PIN = 79;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_PIN__NAME = PIN__NAME;

	/**
	 * The number of structural features of the '<em>Visible Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.PinOwner <em>Pin Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.PinOwner
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getPinOwner()
	 * @generated
	 */
	int PIN_OWNER = 80;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_OWNER__PINS = 0;

	/**
	 * The number of structural features of the '<em>Pin Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_OWNER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.ColorConstants <em>Color Constants</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.ColorConstants
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getColorConstants()
	 * @generated
	 */
	int COLOR_CONSTANTS = 81;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.Direction
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 83;

	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.LineKind <em>Line Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.LineKind
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getLineKind()
	 * @generated
	 */
	int LINE_KIND = 84;


	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.Alignment <em>Alignment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.Alignment
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getAlignment()
	 * @generated
	 */
	int ALIGNMENT = 85;


	/**
	 * The meta object id for the '{@link org.eclipse.gmf.gmfgraph.SVGPropertyType <em>SVG Property Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmf.gmfgraph.SVGPropertyType
	 * @see org.eclipse.gmf.gmfgraph.impl.GMFGraphPackageImpl#getSVGPropertyType()
	 * @generated
	 */
	int SVG_PROPERTY_TYPE = 86;


	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Canvas <em>Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Canvas</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Canvas
	 * @generated
	 */
	EClass getCanvas();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.gmfgraph.Canvas#getFigures <em>Figures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Figures</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Canvas#getFigures()
	 * @see #getCanvas()
	 * @generated
	 */
	EReference getCanvas_Figures();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.gmfgraph.Canvas#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Canvas#getNodes()
	 * @see #getCanvas()
	 * @generated
	 */
	EReference getCanvas_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.gmfgraph.Canvas#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Canvas#getConnections()
	 * @see #getCanvas()
	 * @generated
	 */
	EReference getCanvas_Connections();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.gmfgraph.Canvas#getCompartments <em>Compartments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compartments</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Canvas#getCompartments()
	 * @see #getCanvas()
	 * @generated
	 */
	EReference getCanvas_Compartments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.gmfgraph.Canvas#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labels</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Canvas#getLabels()
	 * @see #getCanvas()
	 * @generated
	 */
	EReference getCanvas_Labels();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.FigureGallery <em>Figure Gallery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figure Gallery</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FigureGallery
	 * @generated
	 */
	EClass getFigureGallery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.gmfgraph.FigureGallery#getFigures <em>Figures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Figures</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FigureGallery#getFigures()
	 * @see #getFigureGallery()
	 * @generated
	 */
	EReference getFigureGallery_Figures();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.gmfgraph.FigureGallery#getDescriptors <em>Descriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptors</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FigureGallery#getDescriptors()
	 * @see #getFigureGallery()
	 * @generated
	 */
	EReference getFigureGallery_Descriptors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.gmfgraph.FigureGallery#getBorders <em>Borders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Borders</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FigureGallery#getBorders()
	 * @see #getFigureGallery()
	 * @generated
	 */
	EReference getFigureGallery_Borders();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.gmfgraph.FigureGallery#getLayouts <em>Layouts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layouts</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FigureGallery#getLayouts()
	 * @see #getFigureGallery()
	 * @generated
	 */
	EReference getFigureGallery_Layouts();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.FigureGallery#getImplementationBundle <em>Implementation Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Bundle</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FigureGallery#getImplementationBundle()
	 * @see #getFigureGallery()
	 * @generated
	 */
	EAttribute getFigureGallery_ImplementationBundle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Identity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Identity
	 * @generated
	 */
	EClass getIdentity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Identity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Identity#getName()
	 * @see #getIdentity()
	 * @generated
	 */
	EAttribute getIdentity_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.DiagramElement <em>Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Element</em>'.
	 * @see org.eclipse.gmf.gmfgraph.DiagramElement
	 * @generated
	 */
	EClass getDiagramElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.gmfgraph.DiagramElement#getFigure <em>Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Figure</em>'.
	 * @see org.eclipse.gmf.gmfgraph.DiagramElement#getFigure()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EReference getDiagramElement_Figure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.gmfgraph.DiagramElement#getFacets <em>Facets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Facets</em>'.
	 * @see org.eclipse.gmf.gmfgraph.DiagramElement#getFacets()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EReference getDiagramElement_Facets();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.AbstractNode <em>Abstract Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Node</em>'.
	 * @see org.eclipse.gmf.gmfgraph.AbstractNode
	 * @generated
	 */
	EClass getAbstractNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Node#getResizeConstraint <em>Resize Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resize Constraint</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Node#getResizeConstraint()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_ResizeConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Node#getAffixedParentSide <em>Affixed Parent Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Affixed Parent Side</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Node#getAffixedParentSide()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_AffixedParentSide();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.gmfgraph.Node#getContentPane <em>Content Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Pane</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Node#getContentPane()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_ContentPane();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.ChildAccess <em>Child Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Access</em>'.
	 * @see org.eclipse.gmf.gmfgraph.ChildAccess
	 * @generated
	 */
	EClass getChildAccess();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.gmfgraph.ChildAccess#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see org.eclipse.gmf.gmfgraph.ChildAccess#getOwner()
	 * @see #getChildAccess()
	 * @generated
	 */
	EReference getChildAccess_Owner();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.ChildAccess#getAccessor <em>Accessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accessor</em>'.
	 * @see org.eclipse.gmf.gmfgraph.ChildAccess#getAccessor()
	 * @see #getChildAccess()
	 * @generated
	 */
	EAttribute getChildAccess_Accessor();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.gmfgraph.ChildAccess#getFigure <em>Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Figure</em>'.
	 * @see org.eclipse.gmf.gmfgraph.ChildAccess#getFigure()
	 * @see #getChildAccess()
	 * @generated
	 */
	EReference getChildAccess_Figure();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.RealFigure <em>Real Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Figure</em>'.
	 * @see org.eclipse.gmf.gmfgraph.RealFigure
	 * @generated
	 */
	EClass getRealFigure();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.RealFigure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gmf.gmfgraph.RealFigure#getName()
	 * @see #getRealFigure()
	 * @generated
	 */
	EAttribute getRealFigure_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.gmfgraph.RealFigure#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.gmf.gmfgraph.RealFigure#getChildren()
	 * @see #getRealFigure()
	 * @generated
	 */
	EReference getRealFigure_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Compartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compartment</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Compartment
	 * @generated
	 */
	EClass getCompartment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Compartment#isCollapsible <em>Collapsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collapsible</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Compartment#isCollapsible()
	 * @see #getCompartment()
	 * @generated
	 */
	EAttribute getCompartment_Collapsible();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Compartment#isNeedsTitle <em>Needs Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needs Title</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Compartment#isNeedsTitle()
	 * @see #getCompartment()
	 * @generated
	 */
	EAttribute getCompartment_NeedsTitle();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.gmfgraph.Compartment#getAccessor <em>Accessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Accessor</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Compartment#getAccessor()
	 * @see #getCompartment()
	 * @generated
	 */
	EReference getCompartment_Accessor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.DiagramLabel <em>Diagram Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Label</em>'.
	 * @see org.eclipse.gmf.gmfgraph.DiagramLabel
	 * @generated
	 */
	EClass getDiagramLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.DiagramLabel#isElementIcon <em>Element Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Icon</em>'.
	 * @see org.eclipse.gmf.gmfgraph.DiagramLabel#isElementIcon()
	 * @see #getDiagramLabel()
	 * @generated
	 */
	EAttribute getDiagramLabel_ElementIcon();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.gmfgraph.DiagramLabel#getAccessor <em>Accessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Accessor</em>'.
	 * @see org.eclipse.gmf.gmfgraph.DiagramLabel#getAccessor()
	 * @see #getDiagramLabel()
	 * @generated
	 */
	EReference getDiagramLabel_Accessor();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.gmfgraph.DiagramLabel#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see org.eclipse.gmf.gmfgraph.DiagramLabel#getContainer()
	 * @see #getDiagramLabel()
	 * @generated
	 */
	EReference getDiagramLabel_Container();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.DiagramLabel#isExternal <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External</em>'.
	 * @see org.eclipse.gmf.gmfgraph.DiagramLabel#isExternal()
	 * @see #getDiagramLabel()
	 * @generated
	 */
	EAttribute getDiagramLabel_External();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.VisualFacet <em>Visual Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visual Facet</em>'.
	 * @see org.eclipse.gmf.gmfgraph.VisualFacet
	 * @generated
	 */
	EClass getVisualFacet();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.GeneralFacet <em>General Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Facet</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GeneralFacet
	 * @generated
	 */
	EClass getGeneralFacet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.GeneralFacet#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GeneralFacet#getIdentifier()
	 * @see #getGeneralFacet()
	 * @generated
	 */
	EAttribute getGeneralFacet_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.GeneralFacet#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GeneralFacet#getData()
	 * @see #getGeneralFacet()
	 * @generated
	 */
	EAttribute getGeneralFacet_Data();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.AlignmentFacet <em>Alignment Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alignment Facet</em>'.
	 * @see org.eclipse.gmf.gmfgraph.AlignmentFacet
	 * @generated
	 */
	EClass getAlignmentFacet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.AlignmentFacet#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.eclipse.gmf.gmfgraph.AlignmentFacet#getAlignment()
	 * @see #getAlignmentFacet()
	 * @generated
	 */
	EAttribute getAlignmentFacet_Alignment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.GradientFacet <em>Gradient Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gradient Facet</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GradientFacet
	 * @generated
	 */
	EClass getGradientFacet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.GradientFacet#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GradientFacet#getDirection()
	 * @see #getGradientFacet()
	 * @generated
	 */
	EAttribute getGradientFacet_Direction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.LabelOffsetFacet <em>Label Offset Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Offset Facet</em>'.
	 * @see org.eclipse.gmf.gmfgraph.LabelOffsetFacet
	 * @generated
	 */
	EClass getLabelOffsetFacet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.LabelOffsetFacet#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.eclipse.gmf.gmfgraph.LabelOffsetFacet#getX()
	 * @see #getLabelOffsetFacet()
	 * @generated
	 */
	EAttribute getLabelOffsetFacet_X();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.LabelOffsetFacet#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.eclipse.gmf.gmfgraph.LabelOffsetFacet#getY()
	 * @see #getLabelOffsetFacet()
	 * @generated
	 */
	EAttribute getLabelOffsetFacet_Y();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.DefaultSizeFacet <em>Default Size Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Size Facet</em>'.
	 * @see org.eclipse.gmf.gmfgraph.DefaultSizeFacet
	 * @generated
	 */
	EClass getDefaultSizeFacet();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.DefaultSizeFacet#getDefaultSize <em>Default Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Size</em>'.
	 * @see org.eclipse.gmf.gmfgraph.DefaultSizeFacet#getDefaultSize()
	 * @see #getDefaultSizeFacet()
	 * @generated
	 */
	EReference getDefaultSizeFacet_DefaultSize();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Figure <em>Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figure</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Figure
	 * @generated
	 */
	EClass getFigure();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.gmfgraph.Figure#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Descriptor</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Figure#getDescriptor()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_Descriptor();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.Figure#getForegroundColor <em>Foreground Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreground Color</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Figure#getForegroundColor()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_ForegroundColor();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.Figure#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Background Color</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Figure#getBackgroundColor()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_BackgroundColor();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.Figure#getMaximumSize <em>Maximum Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Maximum Size</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Figure#getMaximumSize()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_MaximumSize();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.Figure#getMinimumSize <em>Minimum Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Minimum Size</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Figure#getMinimumSize()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_MinimumSize();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.Figure#getPreferredSize <em>Preferred Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preferred Size</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Figure#getPreferredSize()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_PreferredSize();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.Figure#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Figure#getFont()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_Font();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.Figure#getInsets <em>Insets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insets</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Figure#getInsets()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_Insets();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.Figure#getBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Border</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Figure#getBorder()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_Border();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.Figure#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Figure#getLocation()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_Location();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.Figure#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Figure#getSize()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_Size();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.FigureDescriptor <em>Figure Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figure Descriptor</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FigureDescriptor
	 * @generated
	 */
	EClass getFigureDescriptor();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.FigureDescriptor#getActualFigure <em>Actual Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actual Figure</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FigureDescriptor#getActualFigure()
	 * @see #getFigureDescriptor()
	 * @generated
	 */
	EReference getFigureDescriptor_ActualFigure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.gmfgraph.FigureDescriptor#getAccessors <em>Accessors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accessors</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FigureDescriptor#getAccessors()
	 * @see #getFigureDescriptor()
	 * @generated
	 */
	EReference getFigureDescriptor_Accessors();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.AbstractFigure <em>Abstract Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Figure</em>'.
	 * @see org.eclipse.gmf.gmfgraph.AbstractFigure
	 * @generated
	 */
	EClass getAbstractFigure();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.FigureRef <em>Figure Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figure Ref</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FigureRef
	 * @generated
	 */
	EClass getFigureRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.gmfgraph.FigureRef#getFigure <em>Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Figure</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FigureRef#getFigure()
	 * @see #getFigureRef()
	 * @generated
	 */
	EReference getFigureRef_Figure();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.ConnectionFigure <em>Connection Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Figure</em>'.
	 * @see org.eclipse.gmf.gmfgraph.ConnectionFigure
	 * @generated
	 */
	EClass getConnectionFigure();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.DecorationFigure <em>Decoration Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decoration Figure</em>'.
	 * @see org.eclipse.gmf.gmfgraph.DecorationFigure
	 * @generated
	 */
	EClass getDecorationFigure();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Shape#isOutline <em>Outline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Shape#isOutline()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Outline();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Shape#isFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Shape#isFill()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Fill();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Shape#getLineWidth <em>Line Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Width</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Shape#getLineWidth()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_LineWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Shape#getLineKind <em>Line Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Kind</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Shape#getLineKind()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_LineKind();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Shape#isXorFill <em>Xor Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xor Fill</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Shape#isXorFill()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_XorFill();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Shape#isXorOutline <em>Xor Outline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xor Outline</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Shape#isXorOutline()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_XorOutline();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gmf.gmfgraph.Shape#getResolvedChildren <em>Resolved Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resolved Children</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Shape#getResolvedChildren()
	 * @see #getShape()
	 * @generated
	 */
	EReference getShape_ResolvedChildren();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Label#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Label#getText()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Text();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.LabeledContainer <em>Labeled Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeled Container</em>'.
	 * @see org.eclipse.gmf.gmfgraph.LabeledContainer
	 * @generated
	 */
	EClass getLabeledContainer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.VerticalLabel <em>Vertical Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertical Label</em>'.
	 * @see org.eclipse.gmf.gmfgraph.VerticalLabel
	 * @generated
	 */
	EClass getVerticalLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.VerticalLabel#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.gmf.gmfgraph.VerticalLabel#getText()
	 * @see #getVerticalLabel()
	 * @generated
	 */
	EAttribute getVerticalLabel_Text();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Rectangle
	 * @generated
	 */
	EClass getRectangle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.InvisibleRectangle <em>Invisible Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invisible Rectangle</em>'.
	 * @see org.eclipse.gmf.gmfgraph.InvisibleRectangle
	 * @generated
	 */
	EClass getInvisibleRectangle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.RoundedRectangle <em>Rounded Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rounded Rectangle</em>'.
	 * @see org.eclipse.gmf.gmfgraph.RoundedRectangle
	 * @generated
	 */
	EClass getRoundedRectangle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.RoundedRectangle#getCornerWidth <em>Corner Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corner Width</em>'.
	 * @see org.eclipse.gmf.gmfgraph.RoundedRectangle#getCornerWidth()
	 * @see #getRoundedRectangle()
	 * @generated
	 */
	EAttribute getRoundedRectangle_CornerWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.RoundedRectangle#getCornerHeight <em>Corner Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corner Height</em>'.
	 * @see org.eclipse.gmf.gmfgraph.RoundedRectangle#getCornerHeight()
	 * @see #getRoundedRectangle()
	 * @generated
	 */
	EAttribute getRoundedRectangle_CornerHeight();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Ellipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ellipse</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Ellipse
	 * @generated
	 */
	EClass getEllipse();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Polyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polyline</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Polyline
	 * @generated
	 */
	EClass getPolyline();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.gmfgraph.Polyline#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Polyline#getTemplate()
	 * @see #getPolyline()
	 * @generated
	 */
	EReference getPolyline_Template();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Polygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Polygon
	 * @generated
	 */
	EClass getPolygon();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.ScalablePolygon <em>Scalable Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scalable Polygon</em>'.
	 * @see org.eclipse.gmf.gmfgraph.ScalablePolygon
	 * @generated
	 */
	EClass getScalablePolygon();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.PolylineConnection <em>Polyline Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polyline Connection</em>'.
	 * @see org.eclipse.gmf.gmfgraph.PolylineConnection
	 * @generated
	 */
	EClass getPolylineConnection();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.gmfgraph.PolylineConnection#getSourceDecoration <em>Source Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Decoration</em>'.
	 * @see org.eclipse.gmf.gmfgraph.PolylineConnection#getSourceDecoration()
	 * @see #getPolylineConnection()
	 * @generated
	 */
	EReference getPolylineConnection_SourceDecoration();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.gmfgraph.PolylineConnection#getTargetDecoration <em>Target Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Decoration</em>'.
	 * @see org.eclipse.gmf.gmfgraph.PolylineConnection#getTargetDecoration()
	 * @see #getPolylineConnection()
	 * @generated
	 */
	EReference getPolylineConnection_TargetDecoration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.PolylineDecoration <em>Polyline Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polyline Decoration</em>'.
	 * @see org.eclipse.gmf.gmfgraph.PolylineDecoration
	 * @generated
	 */
	EClass getPolylineDecoration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.PolygonDecoration <em>Polygon Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon Decoration</em>'.
	 * @see org.eclipse.gmf.gmfgraph.PolygonDecoration
	 * @generated
	 */
	EClass getPolygonDecoration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.CustomAttributeOwner <em>Custom Attribute Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Attribute Owner</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomAttributeOwner
	 * @generated
	 */
	EClass getCustomAttributeOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.gmfgraph.CustomAttributeOwner#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomAttributeOwner#getAttributes()
	 * @see #getCustomAttributeOwner()
	 * @generated
	 */
	EReference getCustomAttributeOwner_Attributes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.CustomClass <em>Custom Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Class</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomClass
	 * @generated
	 */
	EClass getCustomClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.CustomClass#getQualifiedClassName <em>Qualified Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Class Name</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomClass#getQualifiedClassName()
	 * @see #getCustomClass()
	 * @generated
	 */
	EAttribute getCustomClass_QualifiedClassName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.CustomFigure <em>Custom Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Figure</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomFigure
	 * @generated
	 */
	EClass getCustomFigure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.gmfgraph.CustomFigure#getCustomChildren <em>Custom Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Children</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomFigure#getCustomChildren()
	 * @see #getCustomFigure()
	 * @generated
	 */
	EReference getCustomFigure_CustomChildren();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.CustomDecoration <em>Custom Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Decoration</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomDecoration
	 * @generated
	 */
	EClass getCustomDecoration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.CustomConnection <em>Custom Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Connection</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomConnection
	 * @generated
	 */
	EClass getCustomConnection();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Color
	 * @generated
	 */
	EClass getColor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.RGBColor <em>RGB Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RGB Color</em>'.
	 * @see org.eclipse.gmf.gmfgraph.RGBColor
	 * @generated
	 */
	EClass getRGBColor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.RGBColor#getRed <em>Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red</em>'.
	 * @see org.eclipse.gmf.gmfgraph.RGBColor#getRed()
	 * @see #getRGBColor()
	 * @generated
	 */
	EAttribute getRGBColor_Red();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.RGBColor#getGreen <em>Green</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green</em>'.
	 * @see org.eclipse.gmf.gmfgraph.RGBColor#getGreen()
	 * @see #getRGBColor()
	 * @generated
	 */
	EAttribute getRGBColor_Green();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.RGBColor#getBlue <em>Blue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue</em>'.
	 * @see org.eclipse.gmf.gmfgraph.RGBColor#getBlue()
	 * @see #getRGBColor()
	 * @generated
	 */
	EAttribute getRGBColor_Blue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.ConstantColor <em>Constant Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Color</em>'.
	 * @see org.eclipse.gmf.gmfgraph.ConstantColor
	 * @generated
	 */
	EClass getConstantColor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.ConstantColor#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.gmf.gmfgraph.ConstantColor#getValue()
	 * @see #getConstantColor()
	 * @generated
	 */
	EAttribute getConstantColor_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Font <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Font
	 * @generated
	 */
	EClass getFont();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.BasicFont <em>Basic Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Font</em>'.
	 * @see org.eclipse.gmf.gmfgraph.BasicFont
	 * @generated
	 */
	EClass getBasicFont();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.BasicFont#getFaceName <em>Face Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Face Name</em>'.
	 * @see org.eclipse.gmf.gmfgraph.BasicFont#getFaceName()
	 * @see #getBasicFont()
	 * @generated
	 */
	EAttribute getBasicFont_FaceName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.BasicFont#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.eclipse.gmf.gmfgraph.BasicFont#getHeight()
	 * @see #getBasicFont()
	 * @generated
	 */
	EAttribute getBasicFont_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.BasicFont#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.gmf.gmfgraph.BasicFont#getStyle()
	 * @see #getBasicFont()
	 * @generated
	 */
	EAttribute getBasicFont_Style();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.gmfgraph.FontStyle <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Font Style</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FontStyle
	 * @generated
	 */
	EEnum getFontStyle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Point#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Point#getX()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Point#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Point#getY()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Y();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Dimension
	 * @generated
	 */
	EClass getDimension();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Dimension#getDx <em>Dx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dx</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Dimension#getDx()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Dx();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Dimension#getDy <em>Dy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dy</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Dimension#getDy()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Dy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Insets <em>Insets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insets</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Insets
	 * @generated
	 */
	EClass getInsets();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Insets#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Insets#getTop()
	 * @see #getInsets()
	 * @generated
	 */
	EAttribute getInsets_Top();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Insets#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Insets#getLeft()
	 * @see #getInsets()
	 * @generated
	 */
	EAttribute getInsets_Left();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Insets#getBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Insets#getBottom()
	 * @see #getInsets()
	 * @generated
	 */
	EAttribute getInsets_Bottom();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Insets#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Insets#getRight()
	 * @see #getInsets()
	 * @generated
	 */
	EAttribute getInsets_Right();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Border <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Border</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Border
	 * @generated
	 */
	EClass getBorder();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.BorderRef <em>Border Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Border Ref</em>'.
	 * @see org.eclipse.gmf.gmfgraph.BorderRef
	 * @generated
	 */
	EClass getBorderRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.gmfgraph.BorderRef#getActual <em>Actual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actual</em>'.
	 * @see org.eclipse.gmf.gmfgraph.BorderRef#getActual()
	 * @see #getBorderRef()
	 * @generated
	 */
	EReference getBorderRef_Actual();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.LineBorder <em>Line Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Border</em>'.
	 * @see org.eclipse.gmf.gmfgraph.LineBorder
	 * @generated
	 */
	EClass getLineBorder();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.LineBorder#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Color</em>'.
	 * @see org.eclipse.gmf.gmfgraph.LineBorder#getColor()
	 * @see #getLineBorder()
	 * @generated
	 */
	EReference getLineBorder_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.LineBorder#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.gmf.gmfgraph.LineBorder#getWidth()
	 * @see #getLineBorder()
	 * @generated
	 */
	EAttribute getLineBorder_Width();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.MarginBorder <em>Margin Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Margin Border</em>'.
	 * @see org.eclipse.gmf.gmfgraph.MarginBorder
	 * @generated
	 */
	EClass getMarginBorder();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.MarginBorder#getInsets <em>Insets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insets</em>'.
	 * @see org.eclipse.gmf.gmfgraph.MarginBorder#getInsets()
	 * @see #getMarginBorder()
	 * @generated
	 */
	EReference getMarginBorder_Insets();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.CompoundBorder <em>Compound Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Border</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CompoundBorder
	 * @generated
	 */
	EClass getCompoundBorder();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.CompoundBorder#getOuter <em>Outer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outer</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CompoundBorder#getOuter()
	 * @see #getCompoundBorder()
	 * @generated
	 */
	EReference getCompoundBorder_Outer();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.CompoundBorder#getInner <em>Inner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inner</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CompoundBorder#getInner()
	 * @see #getCompoundBorder()
	 * @generated
	 */
	EReference getCompoundBorder_Inner();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.CustomBorder <em>Custom Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Border</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomBorder
	 * @generated
	 */
	EClass getCustomBorder();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.LayoutData <em>Layout Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout Data</em>'.
	 * @see org.eclipse.gmf.gmfgraph.LayoutData
	 * @generated
	 */
	EClass getLayoutData();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gmf.gmfgraph.LayoutData#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see org.eclipse.gmf.gmfgraph.LayoutData#getOwner()
	 * @see #getLayoutData()
	 * @generated
	 */
	EReference getLayoutData_Owner();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.CustomLayoutData <em>Custom Layout Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Layout Data</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomLayoutData
	 * @generated
	 */
	EClass getCustomLayoutData();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.GridLayoutData <em>Grid Layout Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Layout Data</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GridLayoutData
	 * @generated
	 */
	EClass getGridLayoutData();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.GridLayoutData#isGrabExcessHorizontalSpace <em>Grab Excess Horizontal Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grab Excess Horizontal Space</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GridLayoutData#isGrabExcessHorizontalSpace()
	 * @see #getGridLayoutData()
	 * @generated
	 */
	EAttribute getGridLayoutData_GrabExcessHorizontalSpace();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.GridLayoutData#isGrabExcessVerticalSpace <em>Grab Excess Vertical Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grab Excess Vertical Space</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GridLayoutData#isGrabExcessVerticalSpace()
	 * @see #getGridLayoutData()
	 * @generated
	 */
	EAttribute getGridLayoutData_GrabExcessVerticalSpace();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.GridLayoutData#getVerticalAlignment <em>Vertical Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Alignment</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GridLayoutData#getVerticalAlignment()
	 * @see #getGridLayoutData()
	 * @generated
	 */
	EAttribute getGridLayoutData_VerticalAlignment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.GridLayoutData#getHorizontalAlignment <em>Horizontal Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Alignment</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GridLayoutData#getHorizontalAlignment()
	 * @see #getGridLayoutData()
	 * @generated
	 */
	EAttribute getGridLayoutData_HorizontalAlignment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.GridLayoutData#getVerticalSpan <em>Vertical Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Span</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GridLayoutData#getVerticalSpan()
	 * @see #getGridLayoutData()
	 * @generated
	 */
	EAttribute getGridLayoutData_VerticalSpan();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.GridLayoutData#getHorizontalSpan <em>Horizontal Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Span</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GridLayoutData#getHorizontalSpan()
	 * @see #getGridLayoutData()
	 * @generated
	 */
	EAttribute getGridLayoutData_HorizontalSpan();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.GridLayoutData#getHorizontalIndent <em>Horizontal Indent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Indent</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GridLayoutData#getHorizontalIndent()
	 * @see #getGridLayoutData()
	 * @generated
	 */
	EAttribute getGridLayoutData_HorizontalIndent();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.GridLayoutData#getSizeHint <em>Size Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size Hint</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GridLayoutData#getSizeHint()
	 * @see #getGridLayoutData()
	 * @generated
	 */
	EReference getGridLayoutData_SizeHint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.BorderLayoutData <em>Border Layout Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Border Layout Data</em>'.
	 * @see org.eclipse.gmf.gmfgraph.BorderLayoutData
	 * @generated
	 */
	EClass getBorderLayoutData();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.BorderLayoutData#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.eclipse.gmf.gmfgraph.BorderLayoutData#getAlignment()
	 * @see #getBorderLayoutData()
	 * @generated
	 */
	EAttribute getBorderLayoutData_Alignment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.BorderLayoutData#isVertical <em>Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical</em>'.
	 * @see org.eclipse.gmf.gmfgraph.BorderLayoutData#isVertical()
	 * @see #getBorderLayoutData()
	 * @generated
	 */
	EAttribute getBorderLayoutData_Vertical();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Layoutable <em>Layoutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layoutable</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Layoutable
	 * @generated
	 */
	EClass getLayoutable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.Layoutable#getLayoutData <em>Layout Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout Data</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Layoutable#getLayoutData()
	 * @see #getLayoutable()
	 * @generated
	 */
	EReference getLayoutable_LayoutData();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.Layoutable#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Layoutable#getLayout()
	 * @see #getLayoutable()
	 * @generated
	 */
	EReference getLayoutable_Layout();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.LayoutRef <em>Layout Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout Ref</em>'.
	 * @see org.eclipse.gmf.gmfgraph.LayoutRef
	 * @generated
	 */
	EClass getLayoutRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmf.gmfgraph.LayoutRef#getActual <em>Actual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actual</em>'.
	 * @see org.eclipse.gmf.gmfgraph.LayoutRef#getActual()
	 * @see #getLayoutRef()
	 * @generated
	 */
	EReference getLayoutRef_Actual();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.CustomLayout <em>Custom Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Layout</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomLayout
	 * @generated
	 */
	EClass getCustomLayout();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.GridLayout <em>Grid Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Layout</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GridLayout
	 * @generated
	 */
	EClass getGridLayout();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.GridLayout#getNumColumns <em>Num Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Columns</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GridLayout#getNumColumns()
	 * @see #getGridLayout()
	 * @generated
	 */
	EAttribute getGridLayout_NumColumns();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.GridLayout#isEqualWidth <em>Equal Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Equal Width</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GridLayout#isEqualWidth()
	 * @see #getGridLayout()
	 * @generated
	 */
	EAttribute getGridLayout_EqualWidth();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.GridLayout#getMargins <em>Margins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Margins</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GridLayout#getMargins()
	 * @see #getGridLayout()
	 * @generated
	 */
	EReference getGridLayout_Margins();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.GridLayout#getSpacing <em>Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spacing</em>'.
	 * @see org.eclipse.gmf.gmfgraph.GridLayout#getSpacing()
	 * @see #getGridLayout()
	 * @generated
	 */
	EReference getGridLayout_Spacing();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.BorderLayout <em>Border Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Border Layout</em>'.
	 * @see org.eclipse.gmf.gmfgraph.BorderLayout
	 * @generated
	 */
	EClass getBorderLayout();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.BorderLayout#getSpacing <em>Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spacing</em>'.
	 * @see org.eclipse.gmf.gmfgraph.BorderLayout#getSpacing()
	 * @see #getBorderLayout()
	 * @generated
	 */
	EReference getBorderLayout_Spacing();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.CustomAttribute <em>Custom Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Attribute</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomAttribute
	 * @generated
	 */
	EClass getCustomAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.CustomAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomAttribute#getName()
	 * @see #getCustomAttribute()
	 * @generated
	 */
	EAttribute getCustomAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.CustomAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomAttribute#getValue()
	 * @see #getCustomAttribute()
	 * @generated
	 */
	EAttribute getCustomAttribute_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.CustomAttribute#isDirectAccess <em>Direct Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direct Access</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomAttribute#isDirectAccess()
	 * @see #getCustomAttribute()
	 * @generated
	 */
	EAttribute getCustomAttribute_DirectAccess();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.CustomAttribute#isMultiStatementValue <em>Multi Statement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Statement Value</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomAttribute#isMultiStatementValue()
	 * @see #getCustomAttribute()
	 * @generated
	 */
	EAttribute getCustomAttribute_MultiStatementValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.FigureAccessor <em>Figure Accessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figure Accessor</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FigureAccessor
	 * @generated
	 */
	EClass getFigureAccessor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.FigureAccessor#getAccessor <em>Accessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accessor</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FigureAccessor#getAccessor()
	 * @see #getFigureAccessor()
	 * @generated
	 */
	EAttribute getFigureAccessor_Accessor();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.FigureAccessor#getTypedFigure <em>Typed Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Typed Figure</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FigureAccessor#getTypedFigure()
	 * @see #getFigureAccessor()
	 * @generated
	 */
	EReference getFigureAccessor_TypedFigure();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.FlowLayout <em>Flow Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Layout</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FlowLayout
	 * @generated
	 */
	EClass getFlowLayout();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.FlowLayout#isVertical <em>Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FlowLayout#isVertical()
	 * @see #getFlowLayout()
	 * @generated
	 */
	EAttribute getFlowLayout_Vertical();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.FlowLayout#isMatchMinorSize <em>Match Minor Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match Minor Size</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FlowLayout#isMatchMinorSize()
	 * @see #getFlowLayout()
	 * @generated
	 */
	EAttribute getFlowLayout_MatchMinorSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.FlowLayout#isForceSingleLine <em>Force Single Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Force Single Line</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FlowLayout#isForceSingleLine()
	 * @see #getFlowLayout()
	 * @generated
	 */
	EAttribute getFlowLayout_ForceSingleLine();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.FlowLayout#getMajorAlignment <em>Major Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Major Alignment</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FlowLayout#getMajorAlignment()
	 * @see #getFlowLayout()
	 * @generated
	 */
	EAttribute getFlowLayout_MajorAlignment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.FlowLayout#getMinorAlignment <em>Minor Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minor Alignment</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FlowLayout#getMinorAlignment()
	 * @see #getFlowLayout()
	 * @generated
	 */
	EAttribute getFlowLayout_MinorAlignment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.FlowLayout#getMajorSpacing <em>Major Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Major Spacing</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FlowLayout#getMajorSpacing()
	 * @see #getFlowLayout()
	 * @generated
	 */
	EAttribute getFlowLayout_MajorSpacing();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.FlowLayout#getMinorSpacing <em>Minor Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minor Spacing</em>'.
	 * @see org.eclipse.gmf.gmfgraph.FlowLayout#getMinorSpacing()
	 * @see #getFlowLayout()
	 * @generated
	 */
	EAttribute getFlowLayout_MinorSpacing();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.XYLayout <em>XY Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XY Layout</em>'.
	 * @see org.eclipse.gmf.gmfgraph.XYLayout
	 * @generated
	 */
	EClass getXYLayout();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.XYLayoutData <em>XY Layout Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XY Layout Data</em>'.
	 * @see org.eclipse.gmf.gmfgraph.XYLayoutData
	 * @generated
	 */
	EClass getXYLayoutData();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.XYLayoutData#getTopLeft <em>Top Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Top Left</em>'.
	 * @see org.eclipse.gmf.gmfgraph.XYLayoutData#getTopLeft()
	 * @see #getXYLayoutData()
	 * @generated
	 */
	EReference getXYLayoutData_TopLeft();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.XYLayoutData#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see org.eclipse.gmf.gmfgraph.XYLayoutData#getSize()
	 * @see #getXYLayoutData()
	 * @generated
	 */
	EReference getXYLayoutData_Size();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.StackLayout <em>Stack Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stack Layout</em>'.
	 * @see org.eclipse.gmf.gmfgraph.StackLayout
	 * @generated
	 */
	EClass getStackLayout();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.CenterLayout <em>Center Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Center Layout</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CenterLayout
	 * @generated
	 */
	EClass getCenterLayout();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.SVGFigure <em>SVG Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SVG Figure</em>'.
	 * @see org.eclipse.gmf.gmfgraph.SVGFigure
	 * @generated
	 */
	EClass getSVGFigure();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.SVGFigure#getDocumentURI <em>Document URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document URI</em>'.
	 * @see org.eclipse.gmf.gmfgraph.SVGFigure#getDocumentURI()
	 * @see #getSVGFigure()
	 * @generated
	 */
	EAttribute getSVGFigure_DocumentURI();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.gmfgraph.SVGFigure#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.gmf.gmfgraph.SVGFigure#getProperties()
	 * @see #getSVGFigure()
	 * @generated
	 */
	EReference getSVGFigure_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmf.gmfgraph.SVGFigure#getAreaOfInterest <em>Area Of Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Area Of Interest</em>'.
	 * @see org.eclipse.gmf.gmfgraph.SVGFigure#getAreaOfInterest()
	 * @see #getSVGFigure()
	 * @generated
	 */
	EReference getSVGFigure_AreaOfInterest();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.SVGFigure#isNoCanvasWidth <em>No Canvas Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Canvas Width</em>'.
	 * @see org.eclipse.gmf.gmfgraph.SVGFigure#isNoCanvasWidth()
	 * @see #getSVGFigure()
	 * @generated
	 */
	EAttribute getSVGFigure_NoCanvasWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.SVGFigure#isNoCanvasHeight <em>No Canvas Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Canvas Height</em>'.
	 * @see org.eclipse.gmf.gmfgraph.SVGFigure#isNoCanvasHeight()
	 * @see #getSVGFigure()
	 * @generated
	 */
	EAttribute getSVGFigure_NoCanvasHeight();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.SVGProperty <em>SVG Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SVG Property</em>'.
	 * @see org.eclipse.gmf.gmfgraph.SVGProperty
	 * @generated
	 */
	EClass getSVGProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.SVGProperty#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see org.eclipse.gmf.gmfgraph.SVGProperty#getQuery()
	 * @see #getSVGProperty()
	 * @generated
	 */
	EAttribute getSVGProperty_Query();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.SVGProperty#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see org.eclipse.gmf.gmfgraph.SVGProperty#getAttribute()
	 * @see #getSVGProperty()
	 * @generated
	 */
	EAttribute getSVGProperty_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.SVGProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.gmf.gmfgraph.SVGProperty#getType()
	 * @see #getSVGProperty()
	 * @generated
	 */
	EAttribute getSVGProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.SVGProperty#getGetter <em>Getter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Getter</em>'.
	 * @see org.eclipse.gmf.gmfgraph.SVGProperty#getGetter()
	 * @see #getSVGProperty()
	 * @generated
	 */
	EAttribute getSVGProperty_Getter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.SVGProperty#getSetter <em>Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Setter</em>'.
	 * @see org.eclipse.gmf.gmfgraph.SVGProperty#getSetter()
	 * @see #getSVGProperty()
	 * @generated
	 */
	EAttribute getSVGProperty_Setter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.SVGProperty#isCallSuper <em>Call Super</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Call Super</em>'.
	 * @see org.eclipse.gmf.gmfgraph.SVGProperty#isCallSuper()
	 * @see #getSVGProperty()
	 * @generated
	 */
	EAttribute getSVGProperty_CallSuper();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Rectangle2D <em>Rectangle2 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle2 D</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Rectangle2D
	 * @generated
	 */
	EClass getRectangle2D();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Rectangle2D#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Rectangle2D#getX()
	 * @see #getRectangle2D()
	 * @generated
	 */
	EAttribute getRectangle2D_X();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Rectangle2D#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Rectangle2D#getY()
	 * @see #getRectangle2D()
	 * @generated
	 */
	EAttribute getRectangle2D_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Rectangle2D#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Rectangle2D#getWidth()
	 * @see #getRectangle2D()
	 * @generated
	 */
	EAttribute getRectangle2D_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.Rectangle2D#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Rectangle2D#getHeight()
	 * @see #getRectangle2D()
	 * @generated
	 */
	EAttribute getRectangle2D_Height();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Pin
	 * @generated
	 */
	EClass getPin();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.CustomPin <em>Custom Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Pin</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomPin
	 * @generated
	 */
	EClass getCustomPin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.CustomPin#getCustomOperationName <em>Custom Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Operation Name</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomPin#getCustomOperationName()
	 * @see #getCustomPin()
	 * @generated
	 */
	EAttribute getCustomPin_CustomOperationName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.CustomPin#getCustomOperationType <em>Custom Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Operation Type</em>'.
	 * @see org.eclipse.gmf.gmfgraph.CustomPin#getCustomOperationType()
	 * @see #getCustomPin()
	 * @generated
	 */
	EAttribute getCustomPin_CustomOperationType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.ColorPin <em>Color Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Pin</em>'.
	 * @see org.eclipse.gmf.gmfgraph.ColorPin
	 * @generated
	 */
	EClass getColorPin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmf.gmfgraph.ColorPin#isBackgroundNotForeground <em>Background Not Foreground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Not Foreground</em>'.
	 * @see org.eclipse.gmf.gmfgraph.ColorPin#isBackgroundNotForeground()
	 * @see #getColorPin()
	 * @generated
	 */
	EAttribute getColorPin_BackgroundNotForeground();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.VisiblePin <em>Visible Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visible Pin</em>'.
	 * @see org.eclipse.gmf.gmfgraph.VisiblePin
	 * @generated
	 */
	EClass getVisiblePin();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmf.gmfgraph.PinOwner <em>Pin Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin Owner</em>'.
	 * @see org.eclipse.gmf.gmfgraph.PinOwner
	 * @generated
	 */
	EClass getPinOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmf.gmfgraph.PinOwner#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pins</em>'.
	 * @see org.eclipse.gmf.gmfgraph.PinOwner#getPins()
	 * @see #getPinOwner()
	 * @generated
	 */
	EReference getPinOwner_Pins();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.gmfgraph.ColorConstants <em>Color Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color Constants</em>'.
	 * @see org.eclipse.gmf.gmfgraph.ColorConstants
	 * @generated
	 */
	EEnum getColorConstants();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.gmfgraph.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.gmfgraph.LineKind <em>Line Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Line Kind</em>'.
	 * @see org.eclipse.gmf.gmfgraph.LineKind
	 * @generated
	 */
	EEnum getLineKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.gmfgraph.Alignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Alignment</em>'.
	 * @see org.eclipse.gmf.gmfgraph.Alignment
	 * @generated
	 */
	EEnum getAlignment();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmf.gmfgraph.SVGPropertyType <em>SVG Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SVG Property Type</em>'.
	 * @see org.eclipse.gmf.gmfgraph.SVGPropertyType
	 * @generated
	 */
	EEnum getSVGPropertyType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GMFGraphFactory getGMFGraphFactory();

} //GMFGraphPackage
