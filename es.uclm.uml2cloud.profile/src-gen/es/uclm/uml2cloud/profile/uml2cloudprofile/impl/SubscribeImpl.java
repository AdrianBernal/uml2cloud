/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile.impl;

import es.uclm.uml2cloud.profile.uml2cloudprofile.Subscribe;
import es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage;

import es.uclm.uml2cloud.profile.uml2cloudprofile.util.UML2CloudProfileValidator;

import java.lang.reflect.InvocationTargetException;

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

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.uml2.uml.Message;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscribe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.SubscribeImpl#getBase_Message <em>Base Message</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.SubscribeImpl#getMaxSubTime <em>Max Sub Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscribeImpl extends MinimalEObjectImpl.Container implements Subscribe {
	/**
	 * The cached value of the '{@link #getBase_Message() <em>Base Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Message()
	 * @generated
	 * @ordered
	 */
	protected Message base_Message;

	/**
	 * The default value of the '{@link #getMaxSubTime() <em>Max Sub Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSubTime()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_SUB_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxSubTime() <em>Max Sub Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSubTime()
	 * @generated
	 * @ordered
	 */
	protected double maxSubTime = MAX_SUB_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscribeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2CloudProfilePackage.Literals.SUBSCRIBE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getBase_Message() {
		if (base_Message != null && base_Message.eIsProxy()) {
			InternalEObject oldBase_Message = (InternalEObject)base_Message;
			base_Message = (Message)eResolveProxy(oldBase_Message);
			if (base_Message != oldBase_Message) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2CloudProfilePackage.SUBSCRIBE__BASE_MESSAGE, oldBase_Message, base_Message));
			}
		}
		return base_Message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetBase_Message() {
		return base_Message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Message(Message newBase_Message) {
		Message oldBase_Message = base_Message;
		base_Message = newBase_Message;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.SUBSCRIBE__BASE_MESSAGE, oldBase_Message, base_Message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxSubTime() {
		return maxSubTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSubTime(double newMaxSubTime) {
		double oldMaxSubTime = maxSubTime;
		maxSubTime = newMaxSubTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.SUBSCRIBE__MAX_SUB_TIME, oldMaxSubTime, maxSubTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean t4_Must_Be_Greater_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UML2CloudProfileValidator.SUBSCRIBE__T4_MUST_BE_GREATER_THAN_ZERO,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "t4_Must_Be_Greater_Than_Zero", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean t4_Should_Be_Greater_Than_Or_Equal_To_t1_From_Connect_If_You_Want_To_Subscribe(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UML2CloudProfileValidator.SUBSCRIBE__T4_SHOULD_BE_GREATER_THAN_OR_EQUAL_TO_T1_FROM_CONNECT_IF_YOU_WANT_TO_SUBSCRIBE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "t4_Should_Be_Greater_Than_Or_Equal_To_t1_From_Connect_If_You_Want_To_Subscribe", EObjectValidator.getObjectLabel(this, context) }),
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
			case UML2CloudProfilePackage.SUBSCRIBE__BASE_MESSAGE:
				if (resolve) return getBase_Message();
				return basicGetBase_Message();
			case UML2CloudProfilePackage.SUBSCRIBE__MAX_SUB_TIME:
				return getMaxSubTime();
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
			case UML2CloudProfilePackage.SUBSCRIBE__BASE_MESSAGE:
				setBase_Message((Message)newValue);
				return;
			case UML2CloudProfilePackage.SUBSCRIBE__MAX_SUB_TIME:
				setMaxSubTime((Double)newValue);
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
			case UML2CloudProfilePackage.SUBSCRIBE__BASE_MESSAGE:
				setBase_Message((Message)null);
				return;
			case UML2CloudProfilePackage.SUBSCRIBE__MAX_SUB_TIME:
				setMaxSubTime(MAX_SUB_TIME_EDEFAULT);
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
			case UML2CloudProfilePackage.SUBSCRIBE__BASE_MESSAGE:
				return base_Message != null;
			case UML2CloudProfilePackage.SUBSCRIBE__MAX_SUB_TIME:
				return maxSubTime != MAX_SUB_TIME_EDEFAULT;
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
			case UML2CloudProfilePackage.SUBSCRIBE___T4_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP:
				return t4_Must_Be_Greater_Than_Zero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UML2CloudProfilePackage.SUBSCRIBE___T4_SHOULD_BE_GREATER_THAN_OR_EQUAL_TO_T1_FROM_CONNECT_IF_YOU_WANT_TO_SUBSCRIBE__DIAGNOSTICCHAIN_MAP:
				return t4_Should_Be_Greater_Than_Or_Equal_To_t1_From_Connect_If_You_Want_To_Subscribe((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (maxSubTime: ");
		result.append(maxSubTime);
		result.append(')');
		return result.toString();
	}

} //SubscribeImpl
