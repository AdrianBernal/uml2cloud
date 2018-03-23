/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile.impl;

import es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProvider;
import es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Lifeline;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.CloudProviderImpl#getResourceAllocationPolicy <em>Resource Allocation Policy</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.CloudProviderImpl#getBase_Lifeline <em>Base Lifeline</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CloudProviderImpl extends MinimalEObjectImpl.Container implements CloudProvider {
	/**
	 * The default value of the '{@link #getResourceAllocationPolicy() <em>Resource Allocation Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceAllocationPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_ALLOCATION_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceAllocationPolicy() <em>Resource Allocation Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceAllocationPolicy()
	 * @generated
	 * @ordered
	 */
	protected String resourceAllocationPolicy = RESOURCE_ALLOCATION_POLICY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Lifeline() <em>Base Lifeline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Lifeline()
	 * @generated
	 * @ordered
	 */
	protected Lifeline base_Lifeline;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2CloudProfilePackage.Literals.CLOUD_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceAllocationPolicy() {
		return resourceAllocationPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceAllocationPolicy(String newResourceAllocationPolicy) {
		String oldResourceAllocationPolicy = resourceAllocationPolicy;
		resourceAllocationPolicy = newResourceAllocationPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.CLOUD_PROVIDER__RESOURCE_ALLOCATION_POLICY, oldResourceAllocationPolicy, resourceAllocationPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline getBase_Lifeline() {
		if (base_Lifeline != null && base_Lifeline.eIsProxy()) {
			InternalEObject oldBase_Lifeline = (InternalEObject)base_Lifeline;
			base_Lifeline = (Lifeline)eResolveProxy(oldBase_Lifeline);
			if (base_Lifeline != oldBase_Lifeline) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2CloudProfilePackage.CLOUD_PROVIDER__BASE_LIFELINE, oldBase_Lifeline, base_Lifeline));
			}
		}
		return base_Lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline basicGetBase_Lifeline() {
		return base_Lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Lifeline(Lifeline newBase_Lifeline) {
		Lifeline oldBase_Lifeline = base_Lifeline;
		base_Lifeline = newBase_Lifeline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.CLOUD_PROVIDER__BASE_LIFELINE, oldBase_Lifeline, base_Lifeline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2CloudProfilePackage.CLOUD_PROVIDER__RESOURCE_ALLOCATION_POLICY:
				return getResourceAllocationPolicy();
			case UML2CloudProfilePackage.CLOUD_PROVIDER__BASE_LIFELINE:
				if (resolve) return getBase_Lifeline();
				return basicGetBase_Lifeline();
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
			case UML2CloudProfilePackage.CLOUD_PROVIDER__RESOURCE_ALLOCATION_POLICY:
				setResourceAllocationPolicy((String)newValue);
				return;
			case UML2CloudProfilePackage.CLOUD_PROVIDER__BASE_LIFELINE:
				setBase_Lifeline((Lifeline)newValue);
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
			case UML2CloudProfilePackage.CLOUD_PROVIDER__RESOURCE_ALLOCATION_POLICY:
				setResourceAllocationPolicy(RESOURCE_ALLOCATION_POLICY_EDEFAULT);
				return;
			case UML2CloudProfilePackage.CLOUD_PROVIDER__BASE_LIFELINE:
				setBase_Lifeline((Lifeline)null);
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
			case UML2CloudProfilePackage.CLOUD_PROVIDER__RESOURCE_ALLOCATION_POLICY:
				return RESOURCE_ALLOCATION_POLICY_EDEFAULT == null ? resourceAllocationPolicy != null : !RESOURCE_ALLOCATION_POLICY_EDEFAULT.equals(resourceAllocationPolicy);
			case UML2CloudProfilePackage.CLOUD_PROVIDER__BASE_LIFELINE:
				return base_Lifeline != null;
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
		result.append(" (resourceAllocationPolicy: ");
		result.append(resourceAllocationPolicy);
		result.append(')');
		return result.toString();
	}

} //CloudProviderImpl
