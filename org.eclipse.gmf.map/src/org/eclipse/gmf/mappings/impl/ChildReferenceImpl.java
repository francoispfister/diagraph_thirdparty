/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.mappings.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.gmf.mappings.ChildReference;
import org.eclipse.gmf.mappings.CompartmentMapping;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.NodeMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Child Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.mappings.impl.ChildReferenceImpl#getParentNode <em>Parent Node</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.ChildReferenceImpl#getCompartment <em>Compartment</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.ChildReferenceImpl#getOwnedChild <em>Owned Child</em>}</li>
 *   <li>{@link org.eclipse.gmf.mappings.impl.ChildReferenceImpl#getReferencedChild <em>Referenced Child</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChildReferenceImpl extends NodeReferenceImpl implements ChildReference {
	/**
	 * The cached value of the '{@link #getCompartment() <em>Compartment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartment()
	 * @generated
	 * @ordered
	 */
	protected CompartmentMapping compartment;

	/**
	 * The cached value of the '{@link #getOwnedChild() <em>Owned Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedChild()
	 * @generated
	 * @ordered
	 */
	protected NodeMapping ownedChild;

	/**
	 * The cached value of the '{@link #getReferencedChild() <em>Referenced Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedChild()
	 * @generated
	 * @ordered
	 */
	protected NodeMapping referencedChild;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFMapPackage.eINSTANCE.getChildReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeMapping getParentNode() {
		if (eContainerFeatureID() != GMFMapPackage.CHILD_REFERENCE__PARENT_NODE) return null;
		return (NodeMapping)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentNode(NodeMapping newParentNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentNode, GMFMapPackage.CHILD_REFERENCE__PARENT_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentNode(NodeMapping newParentNode) {
		if (newParentNode != eInternalContainer() || (eContainerFeatureID() != GMFMapPackage.CHILD_REFERENCE__PARENT_NODE && newParentNode != null)) {
			if (EcoreUtil.isAncestor(this, newParentNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentNode != null)
				msgs = ((InternalEObject)newParentNode).eInverseAdd(this, GMFMapPackage.NODE_MAPPING__CHILDREN, NodeMapping.class, msgs);
			msgs = basicSetParentNode(newParentNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.CHILD_REFERENCE__PARENT_NODE, newParentNode, newParentNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentMapping getCompartment() {
		if (compartment != null && compartment.eIsProxy()) {
			InternalEObject oldCompartment = (InternalEObject)compartment;
			compartment = (CompartmentMapping)eResolveProxy(oldCompartment);
			if (compartment != oldCompartment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFMapPackage.CHILD_REFERENCE__COMPARTMENT, oldCompartment, compartment));
			}
		}
		return compartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentMapping basicGetCompartment() {
		return compartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompartment(CompartmentMapping newCompartment, NotificationChain msgs) {
		CompartmentMapping oldCompartment = compartment;
		compartment = newCompartment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFMapPackage.CHILD_REFERENCE__COMPARTMENT, oldCompartment, newCompartment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompartment(CompartmentMapping newCompartment) {
		if (newCompartment != compartment) {
			NotificationChain msgs = null;
			if (compartment != null)
				msgs = ((InternalEObject)compartment).eInverseRemove(this, GMFMapPackage.COMPARTMENT_MAPPING__CHILDREN, CompartmentMapping.class, msgs);
			if (newCompartment != null)
				msgs = ((InternalEObject)newCompartment).eInverseAdd(this, GMFMapPackage.COMPARTMENT_MAPPING__CHILDREN, CompartmentMapping.class, msgs);
			msgs = basicSetCompartment(newCompartment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.CHILD_REFERENCE__COMPARTMENT, newCompartment, newCompartment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeMapping getOwnedChild() {
		return ownedChild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedChild(NodeMapping newOwnedChild, NotificationChain msgs) {
		NodeMapping oldOwnedChild = ownedChild;
		ownedChild = newOwnedChild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMFMapPackage.CHILD_REFERENCE__OWNED_CHILD, oldOwnedChild, newOwnedChild);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedChild(NodeMapping newOwnedChild) {
		if (newOwnedChild != ownedChild) {
			NotificationChain msgs = null;
			if (ownedChild != null)
				msgs = ((InternalEObject)ownedChild).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMFMapPackage.CHILD_REFERENCE__OWNED_CHILD, null, msgs);
			if (newOwnedChild != null)
				msgs = ((InternalEObject)newOwnedChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMFMapPackage.CHILD_REFERENCE__OWNED_CHILD, null, msgs);
			msgs = basicSetOwnedChild(newOwnedChild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.CHILD_REFERENCE__OWNED_CHILD, newOwnedChild, newOwnedChild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeMapping getReferencedChild() {
		if (referencedChild != null && referencedChild.eIsProxy()) {
			InternalEObject oldReferencedChild = (InternalEObject)referencedChild;
			referencedChild = (NodeMapping)eResolveProxy(oldReferencedChild);
			if (referencedChild != oldReferencedChild) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GMFMapPackage.CHILD_REFERENCE__REFERENCED_CHILD, oldReferencedChild, referencedChild));
			}
		}
		return referencedChild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeMapping basicGetReferencedChild() {
		return referencedChild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedChild(NodeMapping newReferencedChild) {
		NodeMapping oldReferencedChild = referencedChild;
		referencedChild = newReferencedChild;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFMapPackage.CHILD_REFERENCE__REFERENCED_CHILD, oldReferencedChild, referencedChild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFMapPackage.CHILD_REFERENCE__PARENT_NODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentNode((NodeMapping)otherEnd, msgs);
			case GMFMapPackage.CHILD_REFERENCE__COMPARTMENT:
				if (compartment != null)
					msgs = ((InternalEObject)compartment).eInverseRemove(this, GMFMapPackage.COMPARTMENT_MAPPING__CHILDREN, CompartmentMapping.class, msgs);
				return basicSetCompartment((CompartmentMapping)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMFMapPackage.CHILD_REFERENCE__PARENT_NODE:
				return basicSetParentNode(null, msgs);
			case GMFMapPackage.CHILD_REFERENCE__COMPARTMENT:
				return basicSetCompartment(null, msgs);
			case GMFMapPackage.CHILD_REFERENCE__OWNED_CHILD:
				return basicSetOwnedChild(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GMFMapPackage.CHILD_REFERENCE__PARENT_NODE:
				return eInternalContainer().eInverseRemove(this, GMFMapPackage.NODE_MAPPING__CHILDREN, NodeMapping.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFMapPackage.CHILD_REFERENCE__PARENT_NODE:
				return getParentNode();
			case GMFMapPackage.CHILD_REFERENCE__COMPARTMENT:
				if (resolve) return getCompartment();
				return basicGetCompartment();
			case GMFMapPackage.CHILD_REFERENCE__OWNED_CHILD:
				return getOwnedChild();
			case GMFMapPackage.CHILD_REFERENCE__REFERENCED_CHILD:
				if (resolve) return getReferencedChild();
				return basicGetReferencedChild();
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
			case GMFMapPackage.CHILD_REFERENCE__PARENT_NODE:
				setParentNode((NodeMapping)newValue);
				return;
			case GMFMapPackage.CHILD_REFERENCE__COMPARTMENT:
				setCompartment((CompartmentMapping)newValue);
				return;
			case GMFMapPackage.CHILD_REFERENCE__OWNED_CHILD:
				setOwnedChild((NodeMapping)newValue);
				return;
			case GMFMapPackage.CHILD_REFERENCE__REFERENCED_CHILD:
				setReferencedChild((NodeMapping)newValue);
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
			case GMFMapPackage.CHILD_REFERENCE__PARENT_NODE:
				setParentNode((NodeMapping)null);
				return;
			case GMFMapPackage.CHILD_REFERENCE__COMPARTMENT:
				setCompartment((CompartmentMapping)null);
				return;
			case GMFMapPackage.CHILD_REFERENCE__OWNED_CHILD:
				setOwnedChild((NodeMapping)null);
				return;
			case GMFMapPackage.CHILD_REFERENCE__REFERENCED_CHILD:
				setReferencedChild((NodeMapping)null);
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
			case GMFMapPackage.CHILD_REFERENCE__PARENT_NODE:
				return getParentNode() != null;
			case GMFMapPackage.CHILD_REFERENCE__COMPARTMENT:
				return compartment != null;
			case GMFMapPackage.CHILD_REFERENCE__OWNED_CHILD:
				return ownedChild != null;
			case GMFMapPackage.CHILD_REFERENCE__REFERENCED_CHILD:
				return referencedChild != null;
		}
		return super.eIsSet(featureID);
	}

	public NodeMapping getChild() {
		if (getOwnedChild() != null) {
			return getOwnedChild();
		}
		return getReferencedChild();
	}

	public boolean isSetChild() {
		return getOwnedChild() != null || getReferencedChild() != null;
	}
} //ChildReferenceImpl
