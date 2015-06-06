/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Parser</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Handwritten or otherwise available IParser implementation
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.CustomParser#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.CustomParser#isGenerateBoilerplate <em>Generate Boilerplate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getCustomParser()
 * @model
 * @generated
 */
public interface CustomParser extends GenParserImplementation {
	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see #setQualifiedName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getCustomParser_QualifiedName()
	 * @model required="true"
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.CustomParser#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Generate Boilerplate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When true, GMF generates empty implementation class suitable for further customizations
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generate Boilerplate</em>' attribute.
	 * @see #setGenerateBoilerplate(boolean)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getCustomParser_GenerateBoilerplate()
	 * @model default="false"
	 * @generated
	 */
	boolean isGenerateBoilerplate();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.CustomParser#isGenerateBoilerplate <em>Generate Boilerplate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Boilerplate</em>' attribute.
	 * @see #isGenerateBoilerplate()
	 * @generated
	 */
	void setGenerateBoilerplate(boolean value);

} // CustomParser
