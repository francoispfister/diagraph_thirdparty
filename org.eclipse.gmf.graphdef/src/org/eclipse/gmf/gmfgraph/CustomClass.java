/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.CustomClass#getQualifiedClassName <em>Qualified Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getCustomClass()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CustomClass extends CustomAttributeOwner {
	/**
	 * Returns the value of the '<em><b>Qualified Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Class Name</em>' attribute.
	 * @see #setQualifiedClassName(String)
	 * @see org.eclipse.gmf.gmfgraph.GMFGraphPackage#getCustomClass_QualifiedClassName()
	 * @model
	 * @generated
	 */
	String getQualifiedClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.gmfgraph.CustomClass#getQualifiedClassName <em>Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Class Name</em>' attribute.
	 * @see #getQualifiedClassName()
	 * @generated
	 */
	void setQualifiedClassName(String value);

} // CustomClass
