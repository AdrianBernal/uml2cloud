/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile.impl;

import es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProviderType;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Scenario;
import es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ScenarioImpl#getBase_Package <em>Base Package</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ScenarioImpl#getCloudProvider <em>Cloud Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario {
	/**
	 * The cached value of the '{@link #getBase_Package() <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Package()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Package base_Package;

	/**
	 * The default value of the '{@link #getCloudProvider() <em>Cloud Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudProvider()
	 * @generated
	 * @ordered
	 */
	protected static final CloudProviderType CLOUD_PROVIDER_EDEFAULT = CloudProviderType.CLOUD_PROVIDER_FIRST_FIT;

	/**
	 * The cached value of the '{@link #getCloudProvider() <em>Cloud Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudProvider()
	 * @generated
	 * @ordered
	 */
	protected CloudProviderType cloudProvider = CLOUD_PROVIDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2CloudProfilePackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package getBase_Package() {
		if (base_Package != null && base_Package.eIsProxy()) {
			InternalEObject oldBase_Package = (InternalEObject)base_Package;
			base_Package = (org.eclipse.uml2.uml.Package)eResolveProxy(oldBase_Package);
			if (base_Package != oldBase_Package) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2CloudProfilePackage.SCENARIO__BASE_PACKAGE, oldBase_Package, base_Package));
			}
		}
		return base_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package basicGetBase_Package() {
		return base_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Package(org.eclipse.uml2.uml.Package newBase_Package) {
		org.eclipse.uml2.uml.Package oldBase_Package = base_Package;
		base_Package = newBase_Package;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.SCENARIO__BASE_PACKAGE, oldBase_Package, base_Package));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudProviderType getCloudProvider() {
		return cloudProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudProvider(CloudProviderType newCloudProvider) {
		CloudProviderType oldCloudProvider = cloudProvider;
		cloudProvider = newCloudProvider == null ? CLOUD_PROVIDER_EDEFAULT : newCloudProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.SCENARIO__CLOUD_PROVIDER, oldCloudProvider, cloudProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2CloudProfilePackage.SCENARIO__BASE_PACKAGE:
				if (resolve) return getBase_Package();
				return basicGetBase_Package();
			case UML2CloudProfilePackage.SCENARIO__CLOUD_PROVIDER:
				return getCloudProvider();
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
			case UML2CloudProfilePackage.SCENARIO__BASE_PACKAGE:
				setBase_Package((org.eclipse.uml2.uml.Package)newValue);
				return;
			case UML2CloudProfilePackage.SCENARIO__CLOUD_PROVIDER:
				setCloudProvider((CloudProviderType)newValue);
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
			case UML2CloudProfilePackage.SCENARIO__BASE_PACKAGE:
				setBase_Package((org.eclipse.uml2.uml.Package)null);
				return;
			case UML2CloudProfilePackage.SCENARIO__CLOUD_PROVIDER:
				setCloudProvider(CLOUD_PROVIDER_EDEFAULT);
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
			case UML2CloudProfilePackage.SCENARIO__BASE_PACKAGE:
				return base_Package != null;
			case UML2CloudProfilePackage.SCENARIO__CLOUD_PROVIDER:
				return cloudProvider != CLOUD_PROVIDER_EDEFAULT;
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
		result.append(" (cloudProvider: ");
		result.append(cloudProvider);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
