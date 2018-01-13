/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile.impl;

import es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication;
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
 * An implementation of the model object '<em><b>Local Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.LocalApplicationImpl#getInputDataSizeMiB <em>Input Data Size Mi B</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.LocalApplicationImpl#getOutputDataSizeMiB <em>Output Data Size Mi B</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.LocalApplicationImpl#getInputFile <em>Input File</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.LocalApplicationImpl#getOutputFile <em>Output File</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.LocalApplicationImpl#getMIs <em>MIs</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.LocalApplicationImpl#getIterations <em>Iterations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalApplicationImpl extends ApplicationImpl implements LocalApplication {
	/**
	 * The default value of the '{@link #getInputDataSizeMiB() <em>Input Data Size Mi B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputDataSizeMiB()
	 * @generated
	 * @ordered
	 */
	protected static final int INPUT_DATA_SIZE_MI_B_EDEFAULT = 10;

	/**
	 * The cached value of the '{@link #getInputDataSizeMiB() <em>Input Data Size Mi B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputDataSizeMiB()
	 * @generated
	 * @ordered
	 */
	protected int inputDataSizeMiB = INPUT_DATA_SIZE_MI_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputDataSizeMiB() <em>Output Data Size Mi B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDataSizeMiB()
	 * @generated
	 * @ordered
	 */
	protected static final int OUTPUT_DATA_SIZE_MI_B_EDEFAULT = 5;

	/**
	 * The cached value of the '{@link #getOutputDataSizeMiB() <em>Output Data Size Mi B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDataSizeMiB()
	 * @generated
	 * @ordered
	 */
	protected int outputDataSizeMiB = OUTPUT_DATA_SIZE_MI_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputFile() <em>Input File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFile()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_FILE_EDEFAULT = "/inputFile_0.dat";

	/**
	 * The cached value of the '{@link #getInputFile() <em>Input File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFile()
	 * @generated
	 * @ordered
	 */
	protected String inputFile = INPUT_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputFile() <em>Output File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFile()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_FILE_EDEFAULT = "/outputFile_0.dat";

	/**
	 * The cached value of the '{@link #getOutputFile() <em>Output File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFile()
	 * @generated
	 * @ordered
	 */
	protected String outputFile = OUTPUT_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMIs() <em>MIs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMIs()
	 * @generated
	 * @ordered
	 */
	protected static final int MIS_EDEFAULT = 10000;

	/**
	 * The cached value of the '{@link #getMIs() <em>MIs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMIs()
	 * @generated
	 * @ordered
	 */
	protected int mIs = MIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIterations() <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterations()
	 * @generated
	 * @ordered
	 */
	protected static final int ITERATIONS_EDEFAULT = 25;

	/**
	 * The cached value of the '{@link #getIterations() <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterations()
	 * @generated
	 * @ordered
	 */
	protected int iterations = ITERATIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2CloudProfilePackage.Literals.LOCAL_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInputDataSizeMiB() {
		return inputDataSizeMiB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputDataSizeMiB(int newInputDataSizeMiB) {
		int oldInputDataSizeMiB = inputDataSizeMiB;
		inputDataSizeMiB = newInputDataSizeMiB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.LOCAL_APPLICATION__INPUT_DATA_SIZE_MI_B, oldInputDataSizeMiB, inputDataSizeMiB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOutputDataSizeMiB() {
		return outputDataSizeMiB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputDataSizeMiB(int newOutputDataSizeMiB) {
		int oldOutputDataSizeMiB = outputDataSizeMiB;
		outputDataSizeMiB = newOutputDataSizeMiB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.LOCAL_APPLICATION__OUTPUT_DATA_SIZE_MI_B, oldOutputDataSizeMiB, outputDataSizeMiB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputFile() {
		return inputFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputFile(String newInputFile) {
		String oldInputFile = inputFile;
		inputFile = newInputFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.LOCAL_APPLICATION__INPUT_FILE, oldInputFile, inputFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputFile() {
		return outputFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputFile(String newOutputFile) {
		String oldOutputFile = outputFile;
		outputFile = newOutputFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.LOCAL_APPLICATION__OUTPUT_FILE, oldOutputFile, outputFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMIs() {
		return mIs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMIs(int newMIs) {
		int oldMIs = mIs;
		mIs = newMIs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.LOCAL_APPLICATION__MIS, oldMIs, mIs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIterations() {
		return iterations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterations(int newIterations) {
		int oldIterations = iterations;
		iterations = newIterations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.LOCAL_APPLICATION__ITERATIONS, oldIterations, iterations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean inputDataSizeMiB_Must_Be_Greater_Than_Or_Equal_To_Zero(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UML2CloudProfileValidator.LOCAL_APPLICATION__INPUT_DATA_SIZE_MI_BMUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "inputDataSizeMiB_Must_Be_Greater_Than_Or_Equal_To_Zero", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean outputDataSizeMiB_Must_Be_Greater_Than_Or_Equal_To_Zero(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UML2CloudProfileValidator.LOCAL_APPLICATION__OUTPUT_DATA_SIZE_MI_BMUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "outputDataSizeMiB_Must_Be_Greater_Than_Or_Equal_To_Zero", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean MIs_Must_Be_Greater_Than_Or_Equal_To_Zero(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UML2CloudProfileValidator.LOCAL_APPLICATION__MIS_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MIs_Must_Be_Greater_Than_Or_Equal_To_Zero", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean iterations_Must_Be_Greater_Than_Or_Equal_To_Zero(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UML2CloudProfileValidator.LOCAL_APPLICATION__ITERATIONS_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "iterations_Must_Be_Greater_Than_Or_Equal_To_Zero", EObjectValidator.getObjectLabel(this, context) }),
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
			case UML2CloudProfilePackage.LOCAL_APPLICATION__INPUT_DATA_SIZE_MI_B:
				return getInputDataSizeMiB();
			case UML2CloudProfilePackage.LOCAL_APPLICATION__OUTPUT_DATA_SIZE_MI_B:
				return getOutputDataSizeMiB();
			case UML2CloudProfilePackage.LOCAL_APPLICATION__INPUT_FILE:
				return getInputFile();
			case UML2CloudProfilePackage.LOCAL_APPLICATION__OUTPUT_FILE:
				return getOutputFile();
			case UML2CloudProfilePackage.LOCAL_APPLICATION__MIS:
				return getMIs();
			case UML2CloudProfilePackage.LOCAL_APPLICATION__ITERATIONS:
				return getIterations();
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
			case UML2CloudProfilePackage.LOCAL_APPLICATION__INPUT_DATA_SIZE_MI_B:
				setInputDataSizeMiB((Integer)newValue);
				return;
			case UML2CloudProfilePackage.LOCAL_APPLICATION__OUTPUT_DATA_SIZE_MI_B:
				setOutputDataSizeMiB((Integer)newValue);
				return;
			case UML2CloudProfilePackage.LOCAL_APPLICATION__INPUT_FILE:
				setInputFile((String)newValue);
				return;
			case UML2CloudProfilePackage.LOCAL_APPLICATION__OUTPUT_FILE:
				setOutputFile((String)newValue);
				return;
			case UML2CloudProfilePackage.LOCAL_APPLICATION__MIS:
				setMIs((Integer)newValue);
				return;
			case UML2CloudProfilePackage.LOCAL_APPLICATION__ITERATIONS:
				setIterations((Integer)newValue);
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
			case UML2CloudProfilePackage.LOCAL_APPLICATION__INPUT_DATA_SIZE_MI_B:
				setInputDataSizeMiB(INPUT_DATA_SIZE_MI_B_EDEFAULT);
				return;
			case UML2CloudProfilePackage.LOCAL_APPLICATION__OUTPUT_DATA_SIZE_MI_B:
				setOutputDataSizeMiB(OUTPUT_DATA_SIZE_MI_B_EDEFAULT);
				return;
			case UML2CloudProfilePackage.LOCAL_APPLICATION__INPUT_FILE:
				setInputFile(INPUT_FILE_EDEFAULT);
				return;
			case UML2CloudProfilePackage.LOCAL_APPLICATION__OUTPUT_FILE:
				setOutputFile(OUTPUT_FILE_EDEFAULT);
				return;
			case UML2CloudProfilePackage.LOCAL_APPLICATION__MIS:
				setMIs(MIS_EDEFAULT);
				return;
			case UML2CloudProfilePackage.LOCAL_APPLICATION__ITERATIONS:
				setIterations(ITERATIONS_EDEFAULT);
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
			case UML2CloudProfilePackage.LOCAL_APPLICATION__INPUT_DATA_SIZE_MI_B:
				return inputDataSizeMiB != INPUT_DATA_SIZE_MI_B_EDEFAULT;
			case UML2CloudProfilePackage.LOCAL_APPLICATION__OUTPUT_DATA_SIZE_MI_B:
				return outputDataSizeMiB != OUTPUT_DATA_SIZE_MI_B_EDEFAULT;
			case UML2CloudProfilePackage.LOCAL_APPLICATION__INPUT_FILE:
				return INPUT_FILE_EDEFAULT == null ? inputFile != null : !INPUT_FILE_EDEFAULT.equals(inputFile);
			case UML2CloudProfilePackage.LOCAL_APPLICATION__OUTPUT_FILE:
				return OUTPUT_FILE_EDEFAULT == null ? outputFile != null : !OUTPUT_FILE_EDEFAULT.equals(outputFile);
			case UML2CloudProfilePackage.LOCAL_APPLICATION__MIS:
				return mIs != MIS_EDEFAULT;
			case UML2CloudProfilePackage.LOCAL_APPLICATION__ITERATIONS:
				return iterations != ITERATIONS_EDEFAULT;
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
			case UML2CloudProfilePackage.LOCAL_APPLICATION___INPUT_DATA_SIZE_MI_BMUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP:
				return inputDataSizeMiB_Must_Be_Greater_Than_Or_Equal_To_Zero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UML2CloudProfilePackage.LOCAL_APPLICATION___OUTPUT_DATA_SIZE_MI_BMUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP:
				return outputDataSizeMiB_Must_Be_Greater_Than_Or_Equal_To_Zero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UML2CloudProfilePackage.LOCAL_APPLICATION___MIS_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP:
				return MIs_Must_Be_Greater_Than_Or_Equal_To_Zero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UML2CloudProfilePackage.LOCAL_APPLICATION___ITERATIONS_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP:
				return iterations_Must_Be_Greater_Than_Or_Equal_To_Zero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (inputDataSizeMiB: ");
		result.append(inputDataSizeMiB);
		result.append(", outputDataSizeMiB: ");
		result.append(outputDataSizeMiB);
		result.append(", inputFile: ");
		result.append(inputFile);
		result.append(", outputFile: ");
		result.append(outputFile);
		result.append(", MIs: ");
		result.append(mIs);
		result.append(", iterations: ");
		result.append(iterations);
		result.append(')');
		return result.toString();
	}

} //LocalApplicationImpl
