/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile.impl;

import es.uclm.uml2cloud.profile.uml2cloudprofile.Time;
import es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage;
import es.uclm.uml2cloud.profile.uml2cloudprofile.VM;
import es.uclm.uml2cloud.profile.uml2cloudprofile.VMInstantiation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VM Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.VMInstantiationImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.VMInstantiationImpl#getVmType <em>Vm Type</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.VMInstantiationImpl#getRentingTime <em>Renting Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VMInstantiationImpl extends MinimalEObjectImpl.Container implements VMInstantiation {
	/**
	 * The default value of the '{@link #getInstances() <em>Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected static final int INSTANCES_EDEFAULT = 1;

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
	 * The cached value of the '{@link #getVmType() <em>Vm Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmType()
	 * @generated
	 * @ordered
	 */
	protected VM vmType;

	/**
	 * The cached value of the '{@link #getRentingTime() <em>Renting Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRentingTime()
	 * @generated
	 * @ordered
	 */
	protected Time rentingTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VMInstantiationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2CloudProfilePackage.Literals.VM_INSTANTIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getInstances() {
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstances(int newInstances) {
		int oldInstances = instances;
		instances = newInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.VM_INSTANTIATION__INSTANCES, oldInstances, instances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VM getVmType() {
		if (vmType != null && vmType.eIsProxy()) {
			InternalEObject oldVmType = (InternalEObject)vmType;
			vmType = (VM)eResolveProxy(oldVmType);
			if (vmType != oldVmType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2CloudProfilePackage.VM_INSTANTIATION__VM_TYPE, oldVmType, vmType));
			}
		}
		return vmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VM basicGetVmType() {
		return vmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVmType(VM newVmType) {
		VM oldVmType = vmType;
		vmType = newVmType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.VM_INSTANTIATION__VM_TYPE, oldVmType, vmType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getRentingTime() {
		return rentingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRentingTime(Time newRentingTime, NotificationChain msgs) {
		Time oldRentingTime = rentingTime;
		rentingTime = newRentingTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.VM_INSTANTIATION__RENTING_TIME, oldRentingTime, newRentingTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRentingTime(Time newRentingTime) {
		if (newRentingTime != rentingTime) {
			NotificationChain msgs = null;
			if (rentingTime != null)
				msgs = ((InternalEObject)rentingTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2CloudProfilePackage.VM_INSTANTIATION__RENTING_TIME, null, msgs);
			if (newRentingTime != null)
				msgs = ((InternalEObject)newRentingTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2CloudProfilePackage.VM_INSTANTIATION__RENTING_TIME, null, msgs);
			msgs = basicSetRentingTime(newRentingTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.VM_INSTANTIATION__RENTING_TIME, newRentingTime, newRentingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2CloudProfilePackage.VM_INSTANTIATION__RENTING_TIME:
				return basicSetRentingTime(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2CloudProfilePackage.VM_INSTANTIATION__INSTANCES:
				return getInstances();
			case UML2CloudProfilePackage.VM_INSTANTIATION__VM_TYPE:
				if (resolve) return getVmType();
				return basicGetVmType();
			case UML2CloudProfilePackage.VM_INSTANTIATION__RENTING_TIME:
				return getRentingTime();
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
			case UML2CloudProfilePackage.VM_INSTANTIATION__INSTANCES:
				setInstances((Integer)newValue);
				return;
			case UML2CloudProfilePackage.VM_INSTANTIATION__VM_TYPE:
				setVmType((VM)newValue);
				return;
			case UML2CloudProfilePackage.VM_INSTANTIATION__RENTING_TIME:
				setRentingTime((Time)newValue);
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
			case UML2CloudProfilePackage.VM_INSTANTIATION__INSTANCES:
				setInstances(INSTANCES_EDEFAULT);
				return;
			case UML2CloudProfilePackage.VM_INSTANTIATION__VM_TYPE:
				setVmType((VM)null);
				return;
			case UML2CloudProfilePackage.VM_INSTANTIATION__RENTING_TIME:
				setRentingTime((Time)null);
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
			case UML2CloudProfilePackage.VM_INSTANTIATION__INSTANCES:
				return instances != INSTANCES_EDEFAULT;
			case UML2CloudProfilePackage.VM_INSTANTIATION__VM_TYPE:
				return vmType != null;
			case UML2CloudProfilePackage.VM_INSTANTIATION__RENTING_TIME:
				return rentingTime != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (instances: ");
		result.append(instances);
		result.append(')');
		return result.toString();
	}

} //VMInstantiationImpl
