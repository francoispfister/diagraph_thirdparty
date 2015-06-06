/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.gmfgraph.ChildAccess;
import org.eclipse.gmf.gmfgraph.Compartment;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compartment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CompartmentImpl#isCollapsible <em>Collapsible</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CompartmentImpl#isNeedsTitle <em>Needs Title</em>}</li>
 *   <li>{@link org.eclipse.gmf.gmfgraph.impl.CompartmentImpl#getAccessor <em>Accessor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompartmentImpl extends DiagramElementImpl implements Compartment {
	/**
	 * The default value of the '{@link #isCollapsible() <em>Collapsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollapsible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLAPSIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCollapsible() <em>Collapsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollapsible()
	 * @generated
	 * @ordered
	 */
	protected boolean collapsible = COLLAPSIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNeedsTitle() <em>Needs Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsTitle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEEDS_TITLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNeedsTitle() <em>Needs Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsTitle()
	 * @generated
	 * @ordered
	 */
	protected boolean needsTitle = NEEDS_TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAccessor() <em>Accessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessor()
	 * @generated
	 * @ordered
	 */
	protected ChildAccess accessor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGraphPackage.eINSTANCE.getCompartment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCollapsible() {
		return collapsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollapsible(boolean newCollapsible) {
		boolean oldCollapsible = collapsible;
		collapsible = newCollapsible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.COMPARTMENT__COLLAPSIBLE, oldCollapsible, collapsible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNeedsTitle() {
		return needsTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedsTitle(boolean newNeedsTitle) {
		boolean oldNeedsTitle = needsTitle;
		needsTitle = newNeedsTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.COMPARTMENT__NEEDS_TITLE, oldNeedsTitle, needsTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildAccess getAccessor() {
		if (accessor != null && accessor.eIsProxy()) {
			InternalEObject oldAccessor = (InternalEObject)accessor;
			accessor = (ChildAccess)eResolveProxy(oldAccessor);
			if (accessor != oldAccessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFGraphPackage.COMPARTMENT__ACCESSOR, oldAccessor, accessor));
			}
		}
		return accessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildAccess basicGetAccessor() {
		return accessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessor(ChildAccess newAccessor) {
		ChildAccess oldAccessor = accessor;
		accessor = newAccessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGraphPackage.COMPARTMENT__ACCESSOR, oldAccessor, accessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGraphPackage.COMPARTMENT__COLLAPSIBLE:
				return isCollapsible();
			case GMFGraphPackage.COMPARTMENT__NEEDS_TITLE:
				return isNeedsTitle();
			case GMFGraphPackage.COMPARTMENT__ACCESSOR:
				if (resolve) return getAccessor();
				return basicGetAccessor();
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
			case GMFGraphPackage.COMPARTMENT__COLLAPSIBLE:
				setCollapsible((Boolean)newValue);
				return;
			case GMFGraphPackage.COMPARTMENT__NEEDS_TITLE:
				setNeedsTitle((Boolean)newValue);
				return;
			case GMFGraphPackage.COMPARTMENT__ACCESSOR:
				setAccessor((ChildAccess)newValue);
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
			case GMFGraphPackage.COMPARTMENT__COLLAPSIBLE:
				setCollapsible(COLLAPSIBLE_EDEFAULT);
				return;
			case GMFGraphPackage.COMPARTMENT__NEEDS_TITLE:
				setNeedsTitle(NEEDS_TITLE_EDEFAULT);
				return;
			case GMFGraphPackage.COMPARTMENT__ACCESSOR:
				setAccessor((ChildAccess)null);
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
			case GMFGraphPackage.COMPARTMENT__COLLAPSIBLE:
				return collapsible != COLLAPSIBLE_EDEFAULT;
			case GMFGraphPackage.COMPARTMENT__NEEDS_TITLE:
				return needsTitle != NEEDS_TITLE_EDEFAULT;
			case GMFGraphPackage.COMPARTMENT__ACCESSOR:
				return accessor != null;
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
		result.append(" (collapsible: ");
		result.append(collapsible);
		result.append(", needsTitle: ");
		result.append(needsTitle);
		result.append(')');
		return result.toString();
	}

} //CompartmentImpl
