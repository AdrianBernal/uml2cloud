/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile.impl;

import es.uclm.uml2cloud.profile.uml2cloudprofile.NodeCmp;
import es.uclm.uml2cloud.profile.uml2cloudprofile.RackCmp;
import es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rack Cmp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackCmpImpl#getNodeCmpType <em>Node Cmp Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RackCmpImpl extends RackImpl implements RackCmp {
	/**
	 * The cached value of the '{@link #getNodeCmpType() <em>Node Cmp Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeCmpType()
	 * @generated
	 * @ordered
	 */
	protected NodeCmp nodeCmpType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RackCmpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2CloudProfilePackage.Literals.RACK_CMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeCmp getNodeCmpType() {
		if (nodeCmpType != null && nodeCmpType.eIsProxy()) {
			InternalEObject oldNodeCmpType = (InternalEObject)nodeCmpType;
			nodeCmpType = (NodeCmp)eResolveProxy(oldNodeCmpType);
			if (nodeCmpType != oldNodeCmpType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2CloudProfilePackage.RACK_CMP__NODE_CMP_TYPE, oldNodeCmpType, nodeCmpType));
			}
		}
		return nodeCmpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeCmp basicGetNodeCmpType() {
		return nodeCmpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeCmpType(NodeCmp newNodeCmpType) {
		NodeCmp oldNodeCmpType = nodeCmpType;
		nodeCmpType = newNodeCmpType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.RACK_CMP__NODE_CMP_TYPE, oldNodeCmpType, nodeCmpType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2CloudProfilePackage.RACK_CMP__NODE_CMP_TYPE:
				if (resolve) return getNodeCmpType();
				return basicGetNodeCmpType();
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
			case UML2CloudProfilePackage.RACK_CMP__NODE_CMP_TYPE:
				setNodeCmpType((NodeCmp)newValue);
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
			case UML2CloudProfilePackage.RACK_CMP__NODE_CMP_TYPE:
				setNodeCmpType((NodeCmp)null);
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
			case UML2CloudProfilePackage.RACK_CMP__NODE_CMP_TYPE:
				return nodeCmpType != null;
		}
		return super.eIsSet(featureID);
	}

} //RackCmpImpl
