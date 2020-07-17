/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile.impl;

import es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenter;
import es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenterElement;
import es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Center Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.DataCenterElementImpl#getNumberOfDataCenters <em>Number Of Data Centers</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.DataCenterElementImpl#getDataCenterType <em>Data Center Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataCenterElementImpl extends MinimalEObjectImpl.Container implements DataCenterElement {
	/**
	 * The default value of the '{@link #getNumberOfDataCenters() <em>Number Of Data Centers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfDataCenters()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_DATA_CENTERS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNumberOfDataCenters() <em>Number Of Data Centers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfDataCenters()
	 * @generated
	 * @ordered
	 */
	protected int numberOfDataCenters = NUMBER_OF_DATA_CENTERS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataCenterType() <em>Data Center Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCenterType()
	 * @generated
	 * @ordered
	 */
	protected DataCenter dataCenterType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataCenterElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2CloudProfilePackage.Literals.DATA_CENTER_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberOfDataCenters() {
		return numberOfDataCenters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfDataCenters(int newNumberOfDataCenters) {
		int oldNumberOfDataCenters = numberOfDataCenters;
		numberOfDataCenters = newNumberOfDataCenters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.DATA_CENTER_ELEMENT__NUMBER_OF_DATA_CENTERS, oldNumberOfDataCenters, numberOfDataCenters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCenter getDataCenterType() {
		if (dataCenterType != null && dataCenterType.eIsProxy()) {
			InternalEObject oldDataCenterType = (InternalEObject)dataCenterType;
			dataCenterType = (DataCenter)eResolveProxy(oldDataCenterType);
			if (dataCenterType != oldDataCenterType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2CloudProfilePackage.DATA_CENTER_ELEMENT__DATA_CENTER_TYPE, oldDataCenterType, dataCenterType));
			}
		}
		return dataCenterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCenter basicGetDataCenterType() {
		return dataCenterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataCenterType(DataCenter newDataCenterType) {
		DataCenter oldDataCenterType = dataCenterType;
		dataCenterType = newDataCenterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.DATA_CENTER_ELEMENT__DATA_CENTER_TYPE, oldDataCenterType, dataCenterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2CloudProfilePackage.DATA_CENTER_ELEMENT__NUMBER_OF_DATA_CENTERS:
				return getNumberOfDataCenters();
			case UML2CloudProfilePackage.DATA_CENTER_ELEMENT__DATA_CENTER_TYPE:
				if (resolve) return getDataCenterType();
				return basicGetDataCenterType();
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
			case UML2CloudProfilePackage.DATA_CENTER_ELEMENT__NUMBER_OF_DATA_CENTERS:
				setNumberOfDataCenters((Integer)newValue);
				return;
			case UML2CloudProfilePackage.DATA_CENTER_ELEMENT__DATA_CENTER_TYPE:
				setDataCenterType((DataCenter)newValue);
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
			case UML2CloudProfilePackage.DATA_CENTER_ELEMENT__NUMBER_OF_DATA_CENTERS:
				setNumberOfDataCenters(NUMBER_OF_DATA_CENTERS_EDEFAULT);
				return;
			case UML2CloudProfilePackage.DATA_CENTER_ELEMENT__DATA_CENTER_TYPE:
				setDataCenterType((DataCenter)null);
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
			case UML2CloudProfilePackage.DATA_CENTER_ELEMENT__NUMBER_OF_DATA_CENTERS:
				return numberOfDataCenters != NUMBER_OF_DATA_CENTERS_EDEFAULT;
			case UML2CloudProfilePackage.DATA_CENTER_ELEMENT__DATA_CENTER_TYPE:
				return dataCenterType != null;
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
		result.append(" (numberOfDataCenters: ");
		result.append(numberOfDataCenters);
		result.append(", ");
		result.append(dataCenterType.getBase_Component().getName());
		result.append(')');
		return result.toString();
	}

} //DataCenterElementImpl
