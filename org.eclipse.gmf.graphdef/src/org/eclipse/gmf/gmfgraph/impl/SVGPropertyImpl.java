/**
 * <copyright>
 * </copyright>
 *
 * $Id: SVGPropertyImpl.java,v 1.1 2008/07/31 12:17:13 dstadnik Exp $
 */
package org.eclipse.gmf.gmfgraph.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.SVGProperty;
import org.eclipse.gmf.gmfgraph.SVGPropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SVG Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.SVGPropertyImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.SVGPropertyImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.SVGPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.SVGPropertyImpl#getGetter <em>Getter</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.SVGPropertyImpl#getSetter <em>Setter</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.SVGPropertyImpl#isCallSuper <em>Call Super</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SVGPropertyImpl extends EObjectImpl implements SVGProperty {
	/**
	 * The default value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected String query = QUERY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected String attribute = ATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final SVGPropertyType TYPE_EDEFAULT = SVGPropertyType.STRING;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SVGPropertyType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGetter() <em>Getter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetter()
	 * @generated
	 * @ordered
	 */
	protected static final String GETTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGetter() <em>Getter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetter()
	 * @generated
	 * @ordered
	 */
	protected String getter = GETTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSetter() <em>Setter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetter()
	 * @generated
	 * @ordered
	 */
	protected static final String SETTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSetter() <em>Setter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetter()
	 * @generated
	 * @ordered
	 */
	protected String setter = SETTER_EDEFAULT;

	/**
	 * The default value of the '{@link #isCallSuper() <em>Call Super</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallSuper()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CALL_SUPER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCallSuper() <em>Call Super</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallSuper()
	 * @generated
	 * @ordered
	 */
	protected boolean callSuper = CALL_SUPER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SVGPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getSVGProperty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery(String newQuery) {
		String oldQuery = query;
		query = newQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SVG_PROPERTY__QUERY, oldQuery, query));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(String newAttribute) {
		String oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SVG_PROPERTY__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SVGPropertyType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SVGPropertyType newType) {
		SVGPropertyType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SVG_PROPERTY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGetter() {
		return getter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetter(String newGetter) {
		String oldGetter = getter;
		getter = newGetter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SVG_PROPERTY__GETTER, oldGetter, getter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSetter() {
		return setter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetter(String newSetter) {
		String oldSetter = setter;
		setter = newSetter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SVG_PROPERTY__SETTER, oldSetter, setter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCallSuper() {
		return callSuper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallSuper(boolean newCallSuper) {
		boolean oldCallSuper = callSuper;
		callSuper = newCallSuper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.SVG_PROPERTY__CALL_SUPER, oldCallSuper, callSuper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGraphPackage.SVG_PROPERTY__QUERY:
				return getQuery();
			case GMFGraphPackage.SVG_PROPERTY__ATTRIBUTE:
				return getAttribute();
			case GMFGraphPackage.SVG_PROPERTY__TYPE:
				return getType();
			case GMFGraphPackage.SVG_PROPERTY__GETTER:
				return getGetter();
			case GMFGraphPackage.SVG_PROPERTY__SETTER:
				return getSetter();
			case GMFGraphPackage.SVG_PROPERTY__CALL_SUPER:
				return isCallSuper();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMFGraphPackage.SVG_PROPERTY__QUERY:
				setQuery((String)newValue);
				return;
			case GMFGraphPackage.SVG_PROPERTY__ATTRIBUTE:
				setAttribute((String)newValue);
				return;
			case GMFGraphPackage.SVG_PROPERTY__TYPE:
				setType((SVGPropertyType)newValue);
				return;
			case GMFGraphPackage.SVG_PROPERTY__GETTER:
				setGetter((String)newValue);
				return;
			case GMFGraphPackage.SVG_PROPERTY__SETTER:
				setSetter((String)newValue);
				return;
			case GMFGraphPackage.SVG_PROPERTY__CALL_SUPER:
				setCallSuper((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GMFGraphPackage.SVG_PROPERTY__QUERY:
				setQuery(QUERY_EDEFAULT);
				return;
			case GMFGraphPackage.SVG_PROPERTY__ATTRIBUTE:
				setAttribute(ATTRIBUTE_EDEFAULT);
				return;
			case GMFGraphPackage.SVG_PROPERTY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GMFGraphPackage.SVG_PROPERTY__GETTER:
				setGetter(GETTER_EDEFAULT);
				return;
			case GMFGraphPackage.SVG_PROPERTY__SETTER:
				setSetter(SETTER_EDEFAULT);
				return;
			case GMFGraphPackage.SVG_PROPERTY__CALL_SUPER:
				setCallSuper(CALL_SUPER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GMFGraphPackage.SVG_PROPERTY__QUERY:
				return QUERY_EDEFAULT == null ? query != null : !QUERY_EDEFAULT.equals(query);
			case GMFGraphPackage.SVG_PROPERTY__ATTRIBUTE:
				return ATTRIBUTE_EDEFAULT == null ? attribute != null : !ATTRIBUTE_EDEFAULT.equals(attribute);
			case GMFGraphPackage.SVG_PROPERTY__TYPE:
				return type != TYPE_EDEFAULT;
			case GMFGraphPackage.SVG_PROPERTY__GETTER:
				return GETTER_EDEFAULT == null ? getter != null : !GETTER_EDEFAULT.equals(getter);
			case GMFGraphPackage.SVG_PROPERTY__SETTER:
				return SETTER_EDEFAULT == null ? setter != null : !SETTER_EDEFAULT.equals(setter);
			case GMFGraphPackage.SVG_PROPERTY__CALL_SUPER:
				return callSuper != CALL_SUPER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (query: ");
		result.append(query);
		result.append(", attribute: ");
		result.append(attribute);
		result.append(", type: ");
		result.append(type);
		result.append(", getter: ");
		result.append(getter);
		result.append(", setter: ");
		result.append(setter);
		result.append(", callSuper: ");
		result.append(callSuper);
		result.append(')');
		return result.toString();
	}

} //SVGPropertyImpl
