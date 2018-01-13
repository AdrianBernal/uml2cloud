/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile.impl;

import es.uclm.uml2cloud.profile.uml2cloudprofile.Memory;
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
 * An implementation of the model object '<em><b>Memory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.MemoryImpl#getSizeGB <em>Size GB</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.MemoryImpl#getReadLatencyUS <em>Read Latency US</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.MemoryImpl#getWriteLatencyUS <em>Write Latency US</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryImpl extends HardwareImpl implements Memory {
	/**
	 * The default value of the '{@link #getSizeGB() <em>Size GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeGB()
	 * @generated
	 * @ordered
	 */
	protected static final double SIZE_GB_EDEFAULT = 4.0;

	/**
	 * The cached value of the '{@link #getSizeGB() <em>Size GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeGB()
	 * @generated
	 * @ordered
	 */
	protected double sizeGB = SIZE_GB_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadLatencyUS() <em>Read Latency US</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadLatencyUS()
	 * @generated
	 * @ordered
	 */
	protected static final int READ_LATENCY_US_EDEFAULT = 5;

	/**
	 * The cached value of the '{@link #getReadLatencyUS() <em>Read Latency US</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadLatencyUS()
	 * @generated
	 * @ordered
	 */
	protected int readLatencyUS = READ_LATENCY_US_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriteLatencyUS() <em>Write Latency US</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteLatencyUS()
	 * @generated
	 * @ordered
	 */
	protected static final int WRITE_LATENCY_US_EDEFAULT = 5;

	/**
	 * The cached value of the '{@link #getWriteLatencyUS() <em>Write Latency US</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteLatencyUS()
	 * @generated
	 * @ordered
	 */
	protected int writeLatencyUS = WRITE_LATENCY_US_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2CloudProfilePackage.Literals.MEMORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSizeGB() {
		return sizeGB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeGB(double newSizeGB) {
		double oldSizeGB = sizeGB;
		sizeGB = newSizeGB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.MEMORY__SIZE_GB, oldSizeGB, sizeGB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReadLatencyUS() {
		return readLatencyUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadLatencyUS(int newReadLatencyUS) {
		int oldReadLatencyUS = readLatencyUS;
		readLatencyUS = newReadLatencyUS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.MEMORY__READ_LATENCY_US, oldReadLatencyUS, readLatencyUS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWriteLatencyUS() {
		return writeLatencyUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteLatencyUS(int newWriteLatencyUS) {
		int oldWriteLatencyUS = writeLatencyUS;
		writeLatencyUS = newWriteLatencyUS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.MEMORY__WRITE_LATENCY_US, oldWriteLatencyUS, writeLatencyUS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean sizeGB_Must_Be_Greater_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UML2CloudProfileValidator.MEMORY__SIZE_GB_MUST_BE_GREATER_THAN_ZERO,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "sizeGB_Must_Be_Greater_Than_Zero", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean readLatencyUS_Must_Be_Greater_Than_Or_Equal_To_Zero(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UML2CloudProfileValidator.MEMORY__READ_LATENCY_US_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "readLatencyUS_Must_Be_Greater_Than_Or_Equal_To_Zero", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean writeLatencyUS_Must_Be_Greatter_Than_Or_Equal_To_Zero(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UML2CloudProfileValidator.MEMORY__WRITE_LATENCY_US_MUST_BE_GREATTER_THAN_OR_EQUAL_TO_ZERO,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "writeLatencyUS_Must_Be_Greatter_Than_Or_Equal_To_Zero", EObjectValidator.getObjectLabel(this, context) }),
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
			case UML2CloudProfilePackage.MEMORY__SIZE_GB:
				return getSizeGB();
			case UML2CloudProfilePackage.MEMORY__READ_LATENCY_US:
				return getReadLatencyUS();
			case UML2CloudProfilePackage.MEMORY__WRITE_LATENCY_US:
				return getWriteLatencyUS();
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
			case UML2CloudProfilePackage.MEMORY__SIZE_GB:
				setSizeGB((Double)newValue);
				return;
			case UML2CloudProfilePackage.MEMORY__READ_LATENCY_US:
				setReadLatencyUS((Integer)newValue);
				return;
			case UML2CloudProfilePackage.MEMORY__WRITE_LATENCY_US:
				setWriteLatencyUS((Integer)newValue);
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
			case UML2CloudProfilePackage.MEMORY__SIZE_GB:
				setSizeGB(SIZE_GB_EDEFAULT);
				return;
			case UML2CloudProfilePackage.MEMORY__READ_LATENCY_US:
				setReadLatencyUS(READ_LATENCY_US_EDEFAULT);
				return;
			case UML2CloudProfilePackage.MEMORY__WRITE_LATENCY_US:
				setWriteLatencyUS(WRITE_LATENCY_US_EDEFAULT);
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
			case UML2CloudProfilePackage.MEMORY__SIZE_GB:
				return sizeGB != SIZE_GB_EDEFAULT;
			case UML2CloudProfilePackage.MEMORY__READ_LATENCY_US:
				return readLatencyUS != READ_LATENCY_US_EDEFAULT;
			case UML2CloudProfilePackage.MEMORY__WRITE_LATENCY_US:
				return writeLatencyUS != WRITE_LATENCY_US_EDEFAULT;
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
			case UML2CloudProfilePackage.MEMORY___SIZE_GB_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP:
				return sizeGB_Must_Be_Greater_Than_Zero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UML2CloudProfilePackage.MEMORY___READ_LATENCY_US_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP:
				return readLatencyUS_Must_Be_Greater_Than_Or_Equal_To_Zero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UML2CloudProfilePackage.MEMORY___WRITE_LATENCY_US_MUST_BE_GREATTER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP:
				return writeLatencyUS_Must_Be_Greatter_Than_Or_Equal_To_Zero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (sizeGB: ");
		result.append(sizeGB);
		result.append(", readLatencyUS: ");
		result.append(readLatencyUS);
		result.append(", writeLatencyUS: ");
		result.append(writeLatencyUS);
		result.append(')');
		return result.toString();
	}

} //MemoryImpl
