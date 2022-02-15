/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile.impl;

import es.uclm.uml2cloud.profile.uml2cloudprofile.Cost;
import es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage;
import es.uclm.uml2cloud.profile.uml2cloudprofile.VM;
import es.uclm.uml2cloud.profile.uml2cloudprofile.VMCost;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VM Cost</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.VMCostImpl#getBase <em>Base</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.VMCostImpl#getIncpriority <em>Incpriority</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.VMCostImpl#getDiscount <em>Discount</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.VMCostImpl#getCompensation <em>Compensation</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.VMCostImpl#getVm <em>Vm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VMCostImpl extends MinimalEObjectImpl.Container implements VMCost {
	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected Cost base;

	/**
	 * The default value of the '{@link #getIncpriority() <em>Incpriority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncpriority()
	 * @generated
	 * @ordered
	 */
	protected static final double INCPRIORITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIncpriority() <em>Incpriority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncpriority()
	 * @generated
	 * @ordered
	 */
	protected double incpriority = INCPRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscount() <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscount()
	 * @generated
	 * @ordered
	 */
	protected static final double DISCOUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiscount() <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscount()
	 * @generated
	 * @ordered
	 */
	protected double discount = DISCOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompensation() <em>Compensation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensation()
	 * @generated
	 * @ordered
	 */
	protected static final double COMPENSATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCompensation() <em>Compensation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensation()
	 * @generated
	 * @ordered
	 */
	protected double compensation = COMPENSATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVm() <em>Vm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVm()
	 * @generated
	 * @ordered
	 */
	protected VM vm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VMCostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2CloudProfilePackage.Literals.VM_COST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cost getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase(Cost newBase, NotificationChain msgs) {
		Cost oldBase = base;
		base = newBase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.VM_COST__BASE, oldBase, newBase);
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
	public void setBase(Cost newBase) {
		if (newBase != base) {
			NotificationChain msgs = null;
			if (base != null)
				msgs = ((InternalEObject)base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2CloudProfilePackage.VM_COST__BASE, null, msgs);
			if (newBase != null)
				msgs = ((InternalEObject)newBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2CloudProfilePackage.VM_COST__BASE, null, msgs);
			msgs = basicSetBase(newBase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.VM_COST__BASE, newBase, newBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getIncpriority() {
		return incpriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncpriority(double newIncpriority) {
		double oldIncpriority = incpriority;
		incpriority = newIncpriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.VM_COST__INCPRIORITY, oldIncpriority, incpriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDiscount() {
		return discount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscount(double newDiscount) {
		double oldDiscount = discount;
		discount = newDiscount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.VM_COST__DISCOUNT, oldDiscount, discount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCompensation() {
		return compensation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompensation(double newCompensation) {
		double oldCompensation = compensation;
		compensation = newCompensation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.VM_COST__COMPENSATION, oldCompensation, compensation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VM getVm() {
		if (vm != null && vm.eIsProxy()) {
			InternalEObject oldVm = (InternalEObject)vm;
			vm = (VM)eResolveProxy(oldVm);
			if (vm != oldVm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2CloudProfilePackage.VM_COST__VM, oldVm, vm));
			}
		}
		return vm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VM basicGetVm() {
		return vm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVm(VM newVm) {
		VM oldVm = vm;
		vm = newVm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.VM_COST__VM, oldVm, vm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2CloudProfilePackage.VM_COST__BASE:
				return basicSetBase(null, msgs);
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
			case UML2CloudProfilePackage.VM_COST__BASE:
				return getBase();
			case UML2CloudProfilePackage.VM_COST__INCPRIORITY:
				return getIncpriority();
			case UML2CloudProfilePackage.VM_COST__DISCOUNT:
				return getDiscount();
			case UML2CloudProfilePackage.VM_COST__COMPENSATION:
				return getCompensation();
			case UML2CloudProfilePackage.VM_COST__VM:
				if (resolve) return getVm();
				return basicGetVm();
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
			case UML2CloudProfilePackage.VM_COST__BASE:
				setBase((Cost)newValue);
				return;
			case UML2CloudProfilePackage.VM_COST__INCPRIORITY:
				setIncpriority((Double)newValue);
				return;
			case UML2CloudProfilePackage.VM_COST__DISCOUNT:
				setDiscount((Double)newValue);
				return;
			case UML2CloudProfilePackage.VM_COST__COMPENSATION:
				setCompensation((Double)newValue);
				return;
			case UML2CloudProfilePackage.VM_COST__VM:
				setVm((VM)newValue);
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
			case UML2CloudProfilePackage.VM_COST__BASE:
				setBase((Cost)null);
				return;
			case UML2CloudProfilePackage.VM_COST__INCPRIORITY:
				setIncpriority(INCPRIORITY_EDEFAULT);
				return;
			case UML2CloudProfilePackage.VM_COST__DISCOUNT:
				setDiscount(DISCOUNT_EDEFAULT);
				return;
			case UML2CloudProfilePackage.VM_COST__COMPENSATION:
				setCompensation(COMPENSATION_EDEFAULT);
				return;
			case UML2CloudProfilePackage.VM_COST__VM:
				setVm((VM)null);
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
			case UML2CloudProfilePackage.VM_COST__BASE:
				return base != null;
			case UML2CloudProfilePackage.VM_COST__INCPRIORITY:
				return incpriority != INCPRIORITY_EDEFAULT;
			case UML2CloudProfilePackage.VM_COST__DISCOUNT:
				return discount != DISCOUNT_EDEFAULT;
			case UML2CloudProfilePackage.VM_COST__COMPENSATION:
				return compensation != COMPENSATION_EDEFAULT;
			case UML2CloudProfilePackage.VM_COST__VM:
				return vm != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		//StringBuilder result = new StringBuilder(super.toString());
		StringBuilder result = new StringBuilder("");
		result.append(" (vm: ");
		if (vm != null)
			result.append(vm.getBase_Component().getName());
		else
			result.append("not selected");
		result.append(", base: ");
		result.append(base);
		result.append(", incpriority: ");
		result.append(incpriority);
		result.append("*base, discount: ");
		result.append(discount);
		result.append("*base, compensation: ");
		result.append(compensation);
		result.append("*base)");
		return result.toString();
	}

} //VMCostImpl
