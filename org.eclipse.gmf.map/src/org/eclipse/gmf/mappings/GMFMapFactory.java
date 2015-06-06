/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.mappings.GMFMapPackage
 * @generated
 */
public interface GMFMapFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GMFMapFactory eINSTANCE = org.eclipse.gmf.mappings.impl.GMFMapFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Node Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Mapping</em>'.
	 * @generated
	 */
	NodeMapping createNodeMapping();

	/**
	 * Returns a new object of class '<em>Compartment Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compartment Mapping</em>'.
	 * @generated
	 */
	CompartmentMapping createCompartmentMapping();

	/**
	 * Returns a new object of class '<em>Link Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Mapping</em>'.
	 * @generated
	 */
	LinkMapping createLinkMapping();

	/**
	 * Returns a new object of class '<em>Canvas Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Canvas Mapping</em>'.
	 * @generated
	 */
	CanvasMapping createCanvasMapping();

	/**
	 * Returns a new object of class '<em>Label Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Mapping</em>'.
	 * @generated
	 */
	LabelMapping createLabelMapping();

	/**
	 * Returns a new object of class '<em>Feature Label Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Label Mapping</em>'.
	 * @generated
	 */
	FeatureLabelMapping createFeatureLabelMapping();

	/**
	 * Returns a new object of class '<em>Ocl Choice Label Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ocl Choice Label Mapping</em>'.
	 * @generated
	 */
	OclChoiceLabelMapping createOclChoiceLabelMapping();

	/**
	 * Returns a new object of class '<em>Design Label Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Design Label Mapping</em>'.
	 * @generated
	 */
	DesignLabelMapping createDesignLabelMapping();

	/**
	 * Returns a new object of class '<em>Expression Label Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Label Mapping</em>'.
	 * @generated
	 */
	ExpressionLabelMapping createExpressionLabelMapping();

	/**
	 * Returns a new object of class '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping</em>'.
	 * @generated
	 */
	Mapping createMapping();

	/**
	 * Returns a new object of class '<em>Child Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Child Reference</em>'.
	 * @generated
	 */
	ChildReference createChildReference();

	/**
	 * Returns a new object of class '<em>Top Node Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Top Node Reference</em>'.
	 * @generated
	 */
	TopNodeReference createTopNodeReference();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns a new object of class '<em>Link Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Constraints</em>'.
	 * @generated
	 */
	LinkConstraints createLinkConstraints();

	/**
	 * Returns a new object of class '<em>Value Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Expression</em>'.
	 * @generated
	 */
	ValueExpression createValueExpression();

	/**
	 * Returns a new object of class '<em>Feature Seq Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Seq Initializer</em>'.
	 * @generated
	 */
	FeatureSeqInitializer createFeatureSeqInitializer();

	/**
	 * Returns a new object of class '<em>Feature Value Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Value Spec</em>'.
	 * @generated
	 */
	FeatureValueSpec createFeatureValueSpec();

	/**
	 * Returns a new object of class '<em>Reference New Element Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference New Element Spec</em>'.
	 * @generated
	 */
	ReferenceNewElementSpec createReferenceNewElementSpec();

	/**
	 * Returns a new object of class '<em>Audit Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audit Container</em>'.
	 * @generated
	 */
	AuditContainer createAuditContainer();

	/**
	 * Returns a new object of class '<em>Audit Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audit Rule</em>'.
	 * @generated
	 */
	AuditRule createAuditRule();

	/**
	 * Returns a new object of class '<em>Domain Element Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Element Target</em>'.
	 * @generated
	 */
	DomainElementTarget createDomainElementTarget();

	/**
	 * Returns a new object of class '<em>Domain Attribute Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Attribute Target</em>'.
	 * @generated
	 */
	DomainAttributeTarget createDomainAttributeTarget();

	/**
	 * Returns a new object of class '<em>Diagram Element Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Element Target</em>'.
	 * @generated
	 */
	DiagramElementTarget createDiagramElementTarget();

	/**
	 * Returns a new object of class '<em>Notation Element Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notation Element Target</em>'.
	 * @generated
	 */
	NotationElementTarget createNotationElementTarget();

	/**
	 * Returns a new object of class '<em>Metric Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metric Container</em>'.
	 * @generated
	 */
	MetricContainer createMetricContainer();

	/**
	 * Returns a new object of class '<em>Metric Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metric Rule</em>'.
	 * @generated
	 */
	MetricRule createMetricRule();

	/**
	 * Returns a new object of class '<em>Audited Metric Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audited Metric Target</em>'.
	 * @generated
	 */
	AuditedMetricTarget createAuditedMetricTarget();

	/**
	 * Returns a new object of class '<em>Visual Effect Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visual Effect Mapping</em>'.
	 * @generated
	 */
	VisualEffectMapping createVisualEffectMapping();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GMFMapPackage getGMFMapPackage();

} //GMFMapFactory
