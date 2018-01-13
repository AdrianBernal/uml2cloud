/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile.impl;

import es.uclm.uml2cloud.profile.uml2cloudprofile.CPU;
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

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CPU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.CPUImpl#getNumberOfCores <em>Number Of Cores</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.CPUImpl#getSpeedMIPS <em>Speed MIPS</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.CPUImpl#getTickS <em>Tick S</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CPUImpl extends HardwareImpl implements CPU {
	/**
	 * The default value of the '{@link #getNumberOfCores() <em>Number Of Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfCores()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_CORES_EDEFAULT = 2;

	/**
	 * The cached value of the '{@link #getNumberOfCores() <em>Number Of Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfCores()
	 * @generated
	 * @ordered
	 */
	protected int numberOfCores = NUMBER_OF_CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeedMIPS() <em>Speed MIPS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedMIPS()
	 * @generated
	 * @ordered
	 */
	protected static final int SPEED_MIPS_EDEFAULT = 30000;

	/**
	 * The cached value of the '{@link #getSpeedMIPS() <em>Speed MIPS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedMIPS()
	 * @generated
	 * @ordered
	 */
	protected int speedMIPS = SPEED_MIPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTickS() <em>Tick S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTickS()
	 * @generated
	 * @ordered
	 */
	protected static final double TICK_S_EDEFAULT = 0.01;

	/**
	 * The cached value of the '{@link #getTickS() <em>Tick S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTickS()
	 * @generated
	 * @ordered
	 */
	protected double tickS = TICK_S_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CPUImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2CloudProfilePackage.Literals.CPU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfCores() {
		return numberOfCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfCores(int newNumberOfCores) {
		int oldNumberOfCores = numberOfCores;
		numberOfCores = newNumberOfCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.CPU__NUMBER_OF_CORES, oldNumberOfCores, numberOfCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSpeedMIPS() {
		return speedMIPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeedMIPS(int newSpeedMIPS) {
		int oldSpeedMIPS = speedMIPS;
		speedMIPS = newSpeedMIPS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.CPU__SPEED_MIPS, oldSpeedMIPS, speedMIPS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTickS() {
		return tickS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTickS(double newTickS) {
		double oldTickS = tickS;
		tickS = newTickS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.CPU__TICK_S, oldTickS, tickS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean speedMIPS_Must_Be_Greater_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UML2CloudProfileValidator.CPU__SPEED_MIPS_MUST_BE_GREATER_THAN_ZERO,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "speedMIPS_Must_Be_Greater_Than_Zero", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean tickS_Must_Be_Greater_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UML2CloudProfileValidator.CPU__TICK_SMUST_BE_GREATER_THAN_ZERO,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "tickS_Must_Be_Greater_Than_Zero", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean numberOfCores_Must_Be_Greater_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UML2CloudProfileValidator.CPU__NUMBER_OF_CORES_MUST_BE_GREATER_THAN_ZERO,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "numberOfCores_Must_Be_Greater_Than_Zero", EObjectValidator.getObjectLabel(this, context) }),
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
			case UML2CloudProfilePackage.CPU__NUMBER_OF_CORES:
				return getNumberOfCores();
			case UML2CloudProfilePackage.CPU__SPEED_MIPS:
				return getSpeedMIPS();
			case UML2CloudProfilePackage.CPU__TICK_S:
				return getTickS();
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
			case UML2CloudProfilePackage.CPU__NUMBER_OF_CORES:
				setNumberOfCores((Integer)newValue);
				return;
			case UML2CloudProfilePackage.CPU__SPEED_MIPS:
				setSpeedMIPS((Integer)newValue);
				return;
			case UML2CloudProfilePackage.CPU__TICK_S:
				setTickS((Double)newValue);
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
			case UML2CloudProfilePackage.CPU__NUMBER_OF_CORES:
				setNumberOfCores(NUMBER_OF_CORES_EDEFAULT);
				return;
			case UML2CloudProfilePackage.CPU__SPEED_MIPS:
				setSpeedMIPS(SPEED_MIPS_EDEFAULT);
				return;
			case UML2CloudProfilePackage.CPU__TICK_S:
				setTickS(TICK_S_EDEFAULT);
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
			case UML2CloudProfilePackage.CPU__NUMBER_OF_CORES:
				return numberOfCores != NUMBER_OF_CORES_EDEFAULT;
			case UML2CloudProfilePackage.CPU__SPEED_MIPS:
				return speedMIPS != SPEED_MIPS_EDEFAULT;
			case UML2CloudProfilePackage.CPU__TICK_S:
				return tickS != TICK_S_EDEFAULT;
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
			case UML2CloudProfilePackage.CPU___SPEED_MIPS_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP:
				return speedMIPS_Must_Be_Greater_Than_Zero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UML2CloudProfilePackage.CPU___TICK_SMUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP:
				return tickS_Must_Be_Greater_Than_Zero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UML2CloudProfilePackage.CPU___NUMBER_OF_CORES_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP:
				return numberOfCores_Must_Be_Greater_Than_Zero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (numberOfCores: ");
		result.append(numberOfCores);
		result.append(", speedMIPS: ");
		result.append(speedMIPS);
		result.append(", tickS: ");
		result.append(tickS);
		result.append(')');
		return result.toString();
	}

} //CPUImpl
