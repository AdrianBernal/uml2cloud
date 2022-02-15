/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile.impl;

import es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProvider;
import es.uclm.uml2cloud.profile.uml2cloudprofile.SLA;
import es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage;

import es.uclm.uml2cloud.profile.uml2cloudprofile.util.UML2CloudProfileValidator;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

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
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.CloudProviderImpl#getSla <em>Sla</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.CloudProviderImpl#getOffer <em>Offer</em>}</li>
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
	protected static final String RESOURCE_ALLOCATION_POLICY_EDEFAULT = "_firstFist_cost";

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
	 * The cached value of the '{@link #getSla() <em>Sla</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSla()
	 * @generated
	 * @ordered
	 */
	protected EList<SLA> sla;

	/**
	 * The default value of the '{@link #getOffer() <em>Offer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffer()
	 * @generated
	 * @ordered
	 */
	protected static final double OFFER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOffer() <em>Offer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffer()
	 * @generated
	 * @ordered
	 */
	protected double offer = OFFER_EDEFAULT;

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
	@Override
	public String getResourceAllocationPolicy() {
		return resourceAllocationPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
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
	@Override
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
	public EList<SLA> getSla() {
		if (sla == null) {
			sla = new EObjectResolvingEList<SLA>(SLA.class, this, UML2CloudProfilePackage.CLOUD_PROVIDER__SLA);
		}
		return sla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getOffer() {
		return offer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOffer(double newOffer) {
		double oldOffer = offer;
		offer = newOffer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.CLOUD_PROVIDER__OFFER, oldOffer, offer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CloudProvider_Must_Offer_Once_Each_VM_For_Each_SLA_Type(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UML2CloudProfileValidator.DIAGNOSTIC_SOURCE,
						 UML2CloudProfileValidator.CLOUD_PROVIDER__CLOUD_PROVIDER_MUST_OFFER_ONCE_EACH_VM_FOR_EACH_SLA_TYPE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CloudProvider_Must_Offer_Once_Each_VM_For_Each_SLA_Type", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CloudProvider_offer_must_be_greater_than_or_equal_to_zero(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UML2CloudProfileValidator.DIAGNOSTIC_SOURCE,
						 UML2CloudProfileValidator.CLOUD_PROVIDER__CLOUD_PROVIDER_OFFER_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CloudProvider_offer_must_be_greater_than_or_equal_to_zero", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
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
			case UML2CloudProfilePackage.CLOUD_PROVIDER__SLA:
				return getSla();
			case UML2CloudProfilePackage.CLOUD_PROVIDER__OFFER:
				return getOffer();
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
			case UML2CloudProfilePackage.CLOUD_PROVIDER__RESOURCE_ALLOCATION_POLICY:
				setResourceAllocationPolicy((String)newValue);
				return;
			case UML2CloudProfilePackage.CLOUD_PROVIDER__BASE_LIFELINE:
				setBase_Lifeline((Lifeline)newValue);
				return;
			case UML2CloudProfilePackage.CLOUD_PROVIDER__SLA:
				getSla().clear();
				getSla().addAll((Collection<? extends SLA>)newValue);
				return;
			case UML2CloudProfilePackage.CLOUD_PROVIDER__OFFER:
				setOffer((Double)newValue);
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
			case UML2CloudProfilePackage.CLOUD_PROVIDER__SLA:
				getSla().clear();
				return;
			case UML2CloudProfilePackage.CLOUD_PROVIDER__OFFER:
				setOffer(OFFER_EDEFAULT);
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
			case UML2CloudProfilePackage.CLOUD_PROVIDER__SLA:
				return sla != null && !sla.isEmpty();
			case UML2CloudProfilePackage.CLOUD_PROVIDER__OFFER:
				return offer != OFFER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case UML2CloudProfilePackage.CLOUD_PROVIDER___CLOUD_PROVIDER_MUST_OFFER_ONCE_EACH_VM_FOR_EACH_SLA_TYPE__DIAGNOSTICCHAIN_MAP:
				return CloudProvider_Must_Offer_Once_Each_VM_For_Each_SLA_Type((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UML2CloudProfilePackage.CLOUD_PROVIDER___CLOUD_PROVIDER_OFFER_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP:
				return CloudProvider_offer_must_be_greater_than_or_equal_to_zero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (resourceAllocationPolicy: ");
		result.append(resourceAllocationPolicy);
		result.append(", offer: ");
		result.append(offer);
		result.append(')');
		return result.toString();
	}

} //CloudProviderImpl
