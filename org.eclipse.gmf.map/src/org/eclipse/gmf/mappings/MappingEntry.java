/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.MappingEntry#getDomainMetaElement <em>Domain Meta Element</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.MappingEntry#getDomainSpecialization <em>Domain Specialization</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.MappingEntry#getDomainInitializer <em>Domain Initializer</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.MappingEntry#getLabelMappings <em>Label Mappings</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.MappingEntry#getRelatedDiagrams <em>Related Diagrams</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.MappingEntry#getVisualEffects <em>Visual Effects</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.mappings.GMFMapPackage#getMappingEntry()
 * @model abstract="true"
 * @generated
 */
public interface MappingEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain Meta Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Meta Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Meta Element</em>' reference.
	 * @see #setDomainMetaElement(EClass)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getMappingEntry_DomainMetaElement()
	 * @model
	 * @generated
	 */
	EClass getDomainMetaElement();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.MappingEntry#getDomainMetaElement <em>Domain Meta Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Meta Element</em>' reference.
	 * @see #getDomainMetaElement()
	 * @generated
	 */
	void setDomainMetaElement(EClass value);

	/**
	 * Returns the value of the '<em><b>Domain Specialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specializes further the domain meta element EClass associated with this mapping and should be evaluated in this EClass context
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Specialization</em>' containment reference.
	 * @see #setDomainSpecialization(Constraint)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getMappingEntry_DomainSpecialization()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints/meta def='context' ocl='self.getDomainContext()'"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints ocl='not domainSpecialization.oclIsUndefined() implies not domainMetaElement.oclIsUndefined()' description='Using \'Domain Specialization\' requires \'Domain Meta Element\' to be set'"
	 * @generated
	 */
	Constraint getDomainSpecialization();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.MappingEntry#getDomainSpecialization <em>Domain Specialization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Specialization</em>' containment reference.
	 * @see #getDomainSpecialization()
	 * @generated
	 */
	void setDomainSpecialization(Constraint value);

	/**
	 * Returns the value of the '<em><b>Domain Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initializer for the domain model element associated with mapping
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Initializer</em>' containment reference.
	 * @see #setDomainInitializer(ElementInitializer)
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getMappingEntry_DomainInitializer()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/gmf/2005/constraints ocl='not domainInitializer.oclIsUndefined() implies not domainMetaElement.oclIsUndefined()' description='\'Domain Element\' must be set in mapping with \'Element Initializers\''"
	 * @generated
	 */
	ElementInitializer getDomainInitializer();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.mappings.MappingEntry#getDomainInitializer <em>Domain Initializer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Initializer</em>' containment reference.
	 * @see #getDomainInitializer()
	 * @generated
	 */
	void setDomainInitializer(ElementInitializer value);

	/**
	 * Returns the value of the '<em><b>Label Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.mappings.LabelMapping}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.mappings.LabelMapping#getMapEntry <em>Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Mappings</em>' containment reference list.
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getMappingEntry_LabelMappings()
	 * @see org.eclipse.gmf.mappings.LabelMapping#getMapEntry
	 * @model opposite="mapEntry" containment="true"
	 * @generated
	 */
	EList<LabelMapping> getLabelMappings();

	/**
	 * Returns the value of the '<em><b>Related Diagrams</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmf.mappings.CanvasMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Diagrams that may be associated with this diagram element. It's up to client application to define what this association means (e.g. open diagram)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Diagrams</em>' reference list.
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getMappingEntry_RelatedDiagrams()
	 * @model
	 * @generated
	 */
	EList<CanvasMapping> getRelatedDiagrams();

	/**
	 * Returns the value of the '<em><b>Visual Effects</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.mappings.VisualEffectMapping}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.mappings.VisualEffectMapping#getParentMapEntry <em>Parent Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visual Effects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visual Effects</em>' containment reference list.
	 * @see org.eclipse.gmf.mappings.GMFMapPackage#getMappingEntry_VisualEffects()
	 * @see org.eclipse.gmf.mappings.VisualEffectMapping#getParentMapEntry
	 * @model opposite="parentMapEntry" containment="true"
	 * @generated
	 */
	EList<VisualEffectMapping> getVisualEffects();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method simplifies OCL expressions (makes it easy to write for both Node and Link).
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EClass getDomainContext();

} // MappingEntry
