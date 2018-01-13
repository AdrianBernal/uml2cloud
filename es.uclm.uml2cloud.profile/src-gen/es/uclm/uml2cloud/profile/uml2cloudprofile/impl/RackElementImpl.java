/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile.impl;

import es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenter;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Rack;
import es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement;
import es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rack Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackElementImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackElementImpl#getRack <em>Rack</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackElementImpl#getDataCenter <em>Data Center</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RackElementImpl extends MinimalEObjectImpl.Container implements RackElement {
	/**
	 * The default value of the '{@link #getInstances() <em>Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected static final int INSTANCES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected int instances = INSTANCES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRack() <em>Rack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRack()
	 * @generated
	 * @ordered
	 */
	protected Rack rack;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RackElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2CloudPackage.Literals.RACK_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInstances() {
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstances(int newInstances) {
		int oldInstances = instances;
		instances = newInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudPackage.RACK_ELEMENT__INSTANCES, oldInstances, instances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rack getRack() {
		if (rack != null && rack.eIsProxy()) {
			InternalEObject oldRack = (InternalEObject)rack;
			rack = (Rack)eResolveProxy(oldRack);
			if (rack != oldRack) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2CloudPackage.RACK_ELEMENT__RACK, oldRack, rack));
			}
		}
		return rack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rack basicGetRack() {
		return rack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRack(Rack newRack) {
		Rack oldRack = rack;
		rack = newRack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudPackage.RACK_ELEMENT__RACK, oldRack, rack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCenter getDataCenter() {
		if (eContainerFeatureID() != UML2CloudPackage.RACK_ELEMENT__DATA_CENTER) return null;
		return (DataCenter)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataCenter(DataCenter newDataCenter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDataCenter, UML2CloudPackage.RACK_ELEMENT__DATA_CENTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataCenter(DataCenter newDataCenter) {
		if (newDataCenter != eInternalContainer() || (eContainerFeatureID() != UML2CloudPackage.RACK_ELEMENT__DATA_CENTER && newDataCenter != null)) {
			if (EcoreUtil.isAncestor(this, newDataCenter))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDataCenter != null)
				msgs = ((InternalEObject)newDataCenter).eInverseAdd(this, UML2CloudPackage.DATA_CENTER__RACK_ELEMENTS, DataCenter.class, msgs);
			msgs = basicSetDataCenter(newDataCenter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudPackage.RACK_ELEMENT__DATA_CENTER, newDataCenter, newDataCenter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2CloudPackage.RACK_ELEMENT__DATA_CENTER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDataCenter((DataCenter)otherEnd, msgs);
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
			case UML2CloudPackage.RACK_ELEMENT__DATA_CENTER:
				return basicSetDataCenter(null, msgs);
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
			case UML2CloudPackage.RACK_ELEMENT__DATA_CENTER:
				return eInternalContainer().eInverseRemove(this, UML2CloudPackage.DATA_CENTER__RACK_ELEMENTS, DataCenter.class, msgs);
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
			case UML2CloudPackage.RACK_ELEMENT__INSTANCES:
				return getInstances();
			case UML2CloudPackage.RACK_ELEMENT__RACK:
				if (resolve) return getRack();
				return basicGetRack();
			case UML2CloudPackage.RACK_ELEMENT__DATA_CENTER:
				return getDataCenter();
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
			case UML2CloudPackage.RACK_ELEMENT__INSTANCES:
				setInstances((Integer)newValue);
				return;
			case UML2CloudPackage.RACK_ELEMENT__RACK:
				setRack((Rack)newValue);
				return;
			case UML2CloudPackage.RACK_ELEMENT__DATA_CENTER:
				setDataCenter((DataCenter)newValue);
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
			case UML2CloudPackage.RACK_ELEMENT__INSTANCES:
				setInstances(INSTANCES_EDEFAULT);
				return;
			case UML2CloudPackage.RACK_ELEMENT__RACK:
				setRack((Rack)null);
				return;
			case UML2CloudPackage.RACK_ELEMENT__DATA_CENTER:
				setDataCenter((DataCenter)null);
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
			case UML2CloudPackage.RACK_ELEMENT__INSTANCES:
				return instances != INSTANCES_EDEFAULT;
			case UML2CloudPackage.RACK_ELEMENT__RACK:
				return rack != null;
			case UML2CloudPackage.RACK_ELEMENT__DATA_CENTER:
				return getDataCenter() != null;
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
		result.append(" (instances: ");
		result.append(instances);
		result.append(')');
		return result.toString();
	}

} //RackElementImpl
