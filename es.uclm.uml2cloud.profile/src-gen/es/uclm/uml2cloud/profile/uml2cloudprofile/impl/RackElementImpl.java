/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile.impl;

import es.uclm.uml2cloud.profile.uml2cloudprofile.Rack;
import es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement;
import es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rack Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackElementImpl#getNumberOfRacks <em>Number Of Racks</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackElementImpl#getRackType <em>Rack Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RackElementImpl extends MinimalEObjectImpl.Container implements RackElement {
	/**
	 * The default value of the '{@link #getNumberOfRacks() <em>Number Of Racks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRacks()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_RACKS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNumberOfRacks() <em>Number Of Racks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRacks()
	 * @generated
	 * @ordered
	 */
	protected int numberOfRacks = NUMBER_OF_RACKS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRackType() <em>Rack Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRackType()
	 * @generated
	 * @ordered
	 */
	protected Rack rackType;

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
		return UML2CloudProfilePackage.Literals.RACK_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfRacks() {
		return numberOfRacks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfRacks(int newNumberOfRacks) {
		int oldNumberOfRacks = numberOfRacks;
		numberOfRacks = newNumberOfRacks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.RACK_ELEMENT__NUMBER_OF_RACKS, oldNumberOfRacks, numberOfRacks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rack getRackType() {
		if (rackType != null && rackType.eIsProxy()) {
			InternalEObject oldRackType = (InternalEObject)rackType;
			rackType = (Rack)eResolveProxy(oldRackType);
			if (rackType != oldRackType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2CloudProfilePackage.RACK_ELEMENT__RACK_TYPE, oldRackType, rackType));
			}
		}
		return rackType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rack basicGetRackType() {
		return rackType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRackType(Rack newRackType) {
		Rack oldRackType = rackType;
		rackType = newRackType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.RACK_ELEMENT__RACK_TYPE, oldRackType, rackType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2CloudProfilePackage.RACK_ELEMENT__NUMBER_OF_RACKS:
				return getNumberOfRacks();
			case UML2CloudProfilePackage.RACK_ELEMENT__RACK_TYPE:
				if (resolve) return getRackType();
				return basicGetRackType();
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
			case UML2CloudProfilePackage.RACK_ELEMENT__NUMBER_OF_RACKS:
				setNumberOfRacks((Integer)newValue);
				return;
			case UML2CloudProfilePackage.RACK_ELEMENT__RACK_TYPE:
				setRackType((Rack)newValue);
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
			case UML2CloudProfilePackage.RACK_ELEMENT__NUMBER_OF_RACKS:
				setNumberOfRacks(NUMBER_OF_RACKS_EDEFAULT);
				return;
			case UML2CloudProfilePackage.RACK_ELEMENT__RACK_TYPE:
				setRackType((Rack)null);
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
			case UML2CloudProfilePackage.RACK_ELEMENT__NUMBER_OF_RACKS:
				return numberOfRacks != NUMBER_OF_RACKS_EDEFAULT;
			case UML2CloudProfilePackage.RACK_ELEMENT__RACK_TYPE:
				return rackType != null;
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

		//StringBuffer result = new StringBuffer(super.toString());
		StringBuffer result = new StringBuffer("");
		result.append(" (numberOfRacks: ");
		result.append(numberOfRacks);
		result.append(", ");
		result.append(rackType.getBase_Component().getName());
		result.append(')');
		return result.toString();
	}

} //RackElementImpl
