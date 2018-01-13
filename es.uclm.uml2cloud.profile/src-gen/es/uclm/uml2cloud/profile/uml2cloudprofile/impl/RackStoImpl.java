/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile.impl;

import es.uclm.uml2cloud.profile.uml2cloudprofile.NodeSto;
import es.uclm.uml2cloud.profile.uml2cloudprofile.RackSto;
import es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rack Sto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackStoImpl#getNodeStoType <em>Node Sto Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RackStoImpl extends RackImpl implements RackSto {
	/**
	 * The cached value of the '{@link #getNodeStoType() <em>Node Sto Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeStoType()
	 * @generated
	 * @ordered
	 */
	protected NodeSto nodeStoType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RackStoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2CloudPackage.Literals.RACK_STO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeSto getNodeStoType() {
		if (nodeStoType != null && nodeStoType.eIsProxy()) {
			InternalEObject oldNodeStoType = (InternalEObject)nodeStoType;
			nodeStoType = (NodeSto)eResolveProxy(oldNodeStoType);
			if (nodeStoType != oldNodeStoType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2CloudPackage.RACK_STO__NODE_STO_TYPE, oldNodeStoType, nodeStoType));
			}
		}
		return nodeStoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeSto basicGetNodeStoType() {
		return nodeStoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeStoType(NodeSto newNodeStoType) {
		NodeSto oldNodeStoType = nodeStoType;
		nodeStoType = newNodeStoType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudPackage.RACK_STO__NODE_STO_TYPE, oldNodeStoType, nodeStoType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2CloudPackage.RACK_STO__NODE_STO_TYPE:
				if (resolve) return getNodeStoType();
				return basicGetNodeStoType();
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
			case UML2CloudPackage.RACK_STO__NODE_STO_TYPE:
				setNodeStoType((NodeSto)newValue);
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
			case UML2CloudPackage.RACK_STO__NODE_STO_TYPE:
				setNodeStoType((NodeSto)null);
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
			case UML2CloudPackage.RACK_STO__NODE_STO_TYPE:
				return nodeStoType != null;
		}
		return super.eIsSet(featureID);
	}

} //RackStoImpl
