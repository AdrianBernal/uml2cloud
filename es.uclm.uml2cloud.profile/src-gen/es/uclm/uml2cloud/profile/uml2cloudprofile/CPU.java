/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CPU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CPU#getNumberOfCores <em>Number Of Cores</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CPU#getSpeedMIPS <em>Speed MIPS</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CPU#getTickS <em>Tick S</em>}</li>
 * </ul>
 *
 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudPackage#getCPU()
 * @model
 * @generated
 */
public interface CPU extends Hardware {
	/**
	 * Returns the value of the '<em><b>Number Of Cores</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Cores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Cores</em>' attribute.
	 * @see #setNumberOfCores(int)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudPackage#getCPU_NumberOfCores()
	 * @model default="2" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfCores();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CPU#getNumberOfCores <em>Number Of Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Cores</em>' attribute.
	 * @see #getNumberOfCores()
	 * @generated
	 */
	void setNumberOfCores(int value);

	/**
	 * Returns the value of the '<em><b>Speed MIPS</b></em>' attribute.
	 * The default value is <code>"30000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed MIPS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed MIPS</em>' attribute.
	 * @see #setSpeedMIPS(int)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudPackage#getCPU_SpeedMIPS()
	 * @model default="30000" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getSpeedMIPS();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CPU#getSpeedMIPS <em>Speed MIPS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed MIPS</em>' attribute.
	 * @see #getSpeedMIPS()
	 * @generated
	 */
	void setSpeedMIPS(int value);

	/**
	 * Returns the value of the '<em><b>Tick S</b></em>' attribute.
	 * The default value is <code>"0.01"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tick S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tick S</em>' attribute.
	 * @see #setTickS(double)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudPackage#getCPU_TickS()
	 * @model default="0.01" dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getTickS();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CPU#getTickS <em>Tick S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tick S</em>' attribute.
	 * @see #getTickS()
	 * @generated
	 */
	void setTickS(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.speedMIPS>0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean speedMIPS_Must_Be_Greater_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.tickS>0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean tickS_Must_Be_Greater_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.numberOfCores>0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean numberOfCores_Must_Be_Greater_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context);

} // CPU
