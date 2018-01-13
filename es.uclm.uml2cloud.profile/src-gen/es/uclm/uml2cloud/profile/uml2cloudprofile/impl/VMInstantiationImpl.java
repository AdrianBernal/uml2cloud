/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile.impl;

import es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage;
import es.uclm.uml2cloud.profile.uml2cloudprofile.VM;
import es.uclm.uml2cloud.profile.uml2cloudprofile.VMInstantiation;

import org.eclipse.emf.common.notify.Notification;

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
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.VM_INSTANTIATION__INSTANCES, oldInstances, instances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2CloudProfilePackage.VM_INSTANTIATION__INSTANCES:
				return getInstances();
			case UML2CloudProfilePackage.VM_INSTANTIATION__VM_TYPE:
				if (resolve) return getVmType();
				return basicGetVmType();
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

} //VMInstantiationImpl
