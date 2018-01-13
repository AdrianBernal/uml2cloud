/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile.impl;

import es.uclm.uml2cloud.profile.uml2cloudprofile.Channel;
import es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenter;
import es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement;
import es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage;

import es.uclm.uml2cloud.profile.uml2cloudprofile.util.UML2CloudProfileValidator;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Center</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.DataCenterImpl#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.DataCenterImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.DataCenterImpl#getRackElements <em>Rack Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataCenterImpl extends MinimalEObjectImpl.Container implements DataCenter {
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
	 * The default value of the '{@link #getNetwork() <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected static final Channel NETWORK_EDEFAULT = Channel.ETHERNET40_GBPS;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected Channel network = NETWORK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRackElements() <em>Rack Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRackElements()
	 * @generated
	 * @ordered
	 */
	protected EList<RackElement> rackElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataCenterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2CloudProfilePackage.Literals.DATA_CENTER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2CloudProfilePackage.DATA_CENTER__BASE_COMPONENT, oldBase_Component, base_Component));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.DATA_CENTER__BASE_COMPONENT, oldBase_Component, base_Component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel getNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(Channel newNetwork) {
		Channel oldNetwork = network;
		network = newNetwork == null ? NETWORK_EDEFAULT : newNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.DATA_CENTER__NETWORK, oldNetwork, network));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RackElement> getRackElements() {
		if (rackElements == null) {
			rackElements = new EObjectContainmentWithInverseEList<RackElement>(RackElement.class, this, UML2CloudProfilePackage.DATA_CENTER__RACK_ELEMENTS, UML2CloudProfilePackage.RACK_ELEMENT__DATA_CENTER);
		}
		return rackElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean rackElements_instances_Should_Be_Greatter_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UML2CloudProfileValidator.DATA_CENTER__RACK_ELEMENTS_INSTANCES_SHOULD_BE_GREATTER_THAN_ZERO,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "rackElements_instances_Should_Be_Greatter_Than_Zero", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean rackElements_instances_Must_Be_Greatter_Than_Or_Equal_To_Zero(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UML2CloudProfileValidator.DATA_CENTER__RACK_ELEMENTS_INSTANCES_MUST_BE_GREATTER_THAN_OR_EQUAL_TO_ZERO,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "rackElements_instances_Must_Be_Greatter_Than_Or_Equal_To_Zero", EObjectValidator.getObjectLabel(this, context) }),
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2CloudProfilePackage.DATA_CENTER__RACK_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRackElements()).basicAdd(otherEnd, msgs);
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
			case UML2CloudProfilePackage.DATA_CENTER__RACK_ELEMENTS:
				return ((InternalEList<?>)getRackElements()).basicRemove(otherEnd, msgs);
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
			case UML2CloudProfilePackage.DATA_CENTER__BASE_COMPONENT:
				if (resolve) return getBase_Component();
				return basicGetBase_Component();
			case UML2CloudProfilePackage.DATA_CENTER__NETWORK:
				return getNetwork();
			case UML2CloudProfilePackage.DATA_CENTER__RACK_ELEMENTS:
				return getRackElements();
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
			case UML2CloudProfilePackage.DATA_CENTER__BASE_COMPONENT:
				setBase_Component((Component)newValue);
				return;
			case UML2CloudProfilePackage.DATA_CENTER__NETWORK:
				setNetwork((Channel)newValue);
				return;
			case UML2CloudProfilePackage.DATA_CENTER__RACK_ELEMENTS:
				getRackElements().clear();
				getRackElements().addAll((Collection<? extends RackElement>)newValue);
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
			case UML2CloudProfilePackage.DATA_CENTER__BASE_COMPONENT:
				setBase_Component((Component)null);
				return;
			case UML2CloudProfilePackage.DATA_CENTER__NETWORK:
				setNetwork(NETWORK_EDEFAULT);
				return;
			case UML2CloudProfilePackage.DATA_CENTER__RACK_ELEMENTS:
				getRackElements().clear();
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
			case UML2CloudProfilePackage.DATA_CENTER__BASE_COMPONENT:
				return base_Component != null;
			case UML2CloudProfilePackage.DATA_CENTER__NETWORK:
				return network != NETWORK_EDEFAULT;
			case UML2CloudProfilePackage.DATA_CENTER__RACK_ELEMENTS:
				return rackElements != null && !rackElements.isEmpty();
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
			case UML2CloudProfilePackage.DATA_CENTER___RACK_ELEMENTS_INSTANCES_SHOULD_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP:
				return rackElements_instances_Should_Be_Greatter_Than_Zero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UML2CloudProfilePackage.DATA_CENTER___RACK_ELEMENTS_INSTANCES_MUST_BE_GREATTER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP:
				return rackElements_instances_Must_Be_Greatter_Than_Or_Equal_To_Zero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (network: ");
		result.append(network);
		result.append(')');
		return result.toString();
	}

} //DataCenterImpl
