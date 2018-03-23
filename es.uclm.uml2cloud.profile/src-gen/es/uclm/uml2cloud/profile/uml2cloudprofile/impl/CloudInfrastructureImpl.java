/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile.impl;

import es.uclm.uml2cloud.profile.uml2cloudprofile.Bandwidth;
import es.uclm.uml2cloud.profile.uml2cloudprofile.CloudInfrastructure;
import es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProvider;
import es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenterElement;
import es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.CloudInfrastructureImpl#getDatacenterElement <em>Datacenter Element</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.CloudInfrastructureImpl#getCloudProvider <em>Cloud Provider</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.CloudInfrastructureImpl#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.CloudInfrastructureImpl#getNetwork <em>Network</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CloudInfrastructureImpl extends MinimalEObjectImpl.Container implements CloudInfrastructure {
	/**
	 * The cached value of the '{@link #getDatacenterElement() <em>Datacenter Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacenterElement()
	 * @generated
	 * @ordered
	 */
	protected EList<DataCenterElement> datacenterElement;

	/**
	 * The cached value of the '{@link #getCloudProvider() <em>Cloud Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudProvider()
	 * @generated
	 * @ordered
	 */
	protected CloudProvider cloudProvider;

	/**
	 * The cached value of the '{@link #getBase_Component() <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Component()
	 * @generated
	 * @ordered
	 */
	protected Component base_Component;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected Bandwidth network;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudInfrastructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2CloudProfilePackage.Literals.CLOUD_INFRASTRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataCenterElement> getDatacenterElement() {
		if (datacenterElement == null) {
			datacenterElement = new EObjectContainmentEList<DataCenterElement>(DataCenterElement.class, this, UML2CloudProfilePackage.CLOUD_INFRASTRUCTURE__DATACENTER_ELEMENT);
		}
		return datacenterElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudProvider getCloudProvider() {
		if (cloudProvider != null && cloudProvider.eIsProxy()) {
			InternalEObject oldCloudProvider = (InternalEObject)cloudProvider;
			cloudProvider = (CloudProvider)eResolveProxy(oldCloudProvider);
			if (cloudProvider != oldCloudProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2CloudProfilePackage.CLOUD_INFRASTRUCTURE__CLOUD_PROVIDER, oldCloudProvider, cloudProvider));
			}
		}
		return cloudProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudProvider basicGetCloudProvider() {
		return cloudProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudProvider(CloudProvider newCloudProvider) {
		CloudProvider oldCloudProvider = cloudProvider;
		cloudProvider = newCloudProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.CLOUD_INFRASTRUCTURE__CLOUD_PROVIDER, oldCloudProvider, cloudProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getBase_Component() {
		if (base_Component != null && base_Component.eIsProxy()) {
			InternalEObject oldBase_Component = (InternalEObject)base_Component;
			base_Component = (Component)eResolveProxy(oldBase_Component);
			if (base_Component != oldBase_Component) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2CloudProfilePackage.CLOUD_INFRASTRUCTURE__BASE_COMPONENT, oldBase_Component, base_Component));
			}
		}
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetBase_Component() {
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Component(Component newBase_Component) {
		Component oldBase_Component = base_Component;
		base_Component = newBase_Component;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.CLOUD_INFRASTRUCTURE__BASE_COMPONENT, oldBase_Component, base_Component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bandwidth getNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetwork(Bandwidth newNetwork, NotificationChain msgs) {
		Bandwidth oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.CLOUD_INFRASTRUCTURE__NETWORK, oldNetwork, newNetwork);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(Bandwidth newNetwork) {
		if (newNetwork != network) {
			NotificationChain msgs = null;
			if (network != null)
				msgs = ((InternalEObject)network).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2CloudProfilePackage.CLOUD_INFRASTRUCTURE__NETWORK, null, msgs);
			if (newNetwork != null)
				msgs = ((InternalEObject)newNetwork).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2CloudProfilePackage.CLOUD_INFRASTRUCTURE__NETWORK, null, msgs);
			msgs = basicSetNetwork(newNetwork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.CLOUD_INFRASTRUCTURE__NETWORK, newNetwork, newNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2CloudProfilePackage.CLOUD_INFRASTRUCTURE__DATACENTER_ELEMENT:
				return ((InternalEList<?>)getDatacenterElement()).basicRemove(otherEnd, msgs);
			case UML2CloudProfilePackage.CLOUD_INFRASTRUCTURE__NETWORK:
				return basicSetNetwork(null, msgs);
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
			case UML2CloudProfilePackage.CLOUD_INFRASTRUCTURE__DATACENTER_ELEMENT:
				return getDatacenterElement();
			case UML2CloudProfilePackage.CLOUD_INFRASTRUCTURE__CLOUD_PROVIDER:
				if (resolve) return getCloudProvider();
				return basicGetCloudProvider();
			case UML2CloudProfilePackage.CLOUD_INFRASTRUCTURE__BASE_COMPONENT:
				if (resolve) return getBase_Component();
				return basicGetBase_Component();
			case UML2CloudProfilePackage.CLOUD_INFRASTRUCTURE__NETWORK:
				return getNetwork();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UML2CloudProfilePackage.CLOUD_INFRASTRUCTURE__DATACENTER_ELEMENT:
				getDatacenterElement().clear();
				getDatacenterElement().addAll((Collection<? extends DataCenterElement>)newValue);
				return;
			case UML2CloudProfilePackage.CLOUD_INFRASTRUCTURE__CLOUD_PROVIDER:
				setCloudProvider((CloudProvider)newValue);
				return;
			case UML2CloudProfilePackage.CLOUD_INFRASTRUCTURE__BASE_COMPONENT:
				setBase_Component((Component)newValue);
				return;
			case UML2CloudProfilePackage.CLOUD_INFRASTRUCTURE__NETWORK:
				setNetwork((Bandwidth)newValue);
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
			case UML2CloudProfilePackage.CLOUD_INFRASTRUCTURE__DATACENTER_ELEMENT:
				getDatacenterElement().clear();
				return;
			case UML2CloudProfilePackage.CLOUD_INFRASTRUCTURE__CLOUD_PROVIDER:
				setCloudProvider((CloudProvider)null);
				return;
			case UML2CloudProfilePackage.CLOUD_INFRASTRUCTURE__BASE_COMPONENT:
				setBase_Component((Component)null);
				return;
			case UML2CloudProfilePackage.CLOUD_INFRASTRUCTURE__NETWORK:
				setNetwork((Bandwidth)null);
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
			case UML2CloudProfilePackage.CLOUD_INFRASTRUCTURE__DATACENTER_ELEMENT:
				return datacenterElement != null && !datacenterElement.isEmpty();
			case UML2CloudProfilePackage.CLOUD_INFRASTRUCTURE__CLOUD_PROVIDER:
				return cloudProvider != null;
			case UML2CloudProfilePackage.CLOUD_INFRASTRUCTURE__BASE_COMPONENT:
				return base_Component != null;
			case UML2CloudProfilePackage.CLOUD_INFRASTRUCTURE__NETWORK:
				return network != null;
		}
		return super.eIsSet(featureID);
	}

} //CloudInfrastructureImpl
