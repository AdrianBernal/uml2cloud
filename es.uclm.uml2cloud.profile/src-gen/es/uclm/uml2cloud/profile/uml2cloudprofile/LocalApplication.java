/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#getInputDataSizeMiB <em>Input Data Size Mi B</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#getOutputDataSizeMiB <em>Output Data Size Mi B</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#getInputFile <em>Input File</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#getOutputFile <em>Output File</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#getMIs <em>MIs</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#getIterations <em>Iterations</em>}</li>
 * </ul>
 *
 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getLocalApplication()
 * @model
 * @generated
 */
public interface LocalApplication extends Application {
	/**
	 * Returns the value of the '<em><b>Input Data Size Mi B</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Data Size Mi B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Data Size Mi B</em>' attribute.
	 * @see #setInputDataSizeMiB(int)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getLocalApplication_InputDataSizeMiB()
	 * @model default="10" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getInputDataSizeMiB();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#getInputDataSizeMiB <em>Input Data Size Mi B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Data Size Mi B</em>' attribute.
	 * @see #getInputDataSizeMiB()
	 * @generated
	 */
	void setInputDataSizeMiB(int value);

	/**
	 * Returns the value of the '<em><b>Output Data Size Mi B</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Data Size Mi B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Data Size Mi B</em>' attribute.
	 * @see #setOutputDataSizeMiB(int)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getLocalApplication_OutputDataSizeMiB()
	 * @model default="5" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getOutputDataSizeMiB();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#getOutputDataSizeMiB <em>Output Data Size Mi B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Data Size Mi B</em>' attribute.
	 * @see #getOutputDataSizeMiB()
	 * @generated
	 */
	void setOutputDataSizeMiB(int value);

	/**
	 * Returns the value of the '<em><b>Input File</b></em>' attribute.
	 * The default value is <code>"/inputFile_0.dat"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input File</em>' attribute.
	 * @see #setInputFile(String)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getLocalApplication_InputFile()
	 * @model default="/inputFile_0.dat" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getInputFile();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#getInputFile <em>Input File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input File</em>' attribute.
	 * @see #getInputFile()
	 * @generated
	 */
	void setInputFile(String value);

	/**
	 * Returns the value of the '<em><b>Output File</b></em>' attribute.
	 * The default value is <code>"/outputFile_0.dat"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output File</em>' attribute.
	 * @see #setOutputFile(String)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getLocalApplication_OutputFile()
	 * @model default="/outputFile_0.dat" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getOutputFile();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#getOutputFile <em>Output File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output File</em>' attribute.
	 * @see #getOutputFile()
	 * @generated
	 */
	void setOutputFile(String value);

	/**
	 * Returns the value of the '<em><b>MIs</b></em>' attribute.
	 * The default value is <code>"10000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MIs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MIs</em>' attribute.
	 * @see #setMIs(int)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getLocalApplication_MIs()
	 * @model default="10000" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getMIs();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#getMIs <em>MIs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MIs</em>' attribute.
	 * @see #getMIs()
	 * @generated
	 */
	void setMIs(int value);

	/**
	 * Returns the value of the '<em><b>Iterations</b></em>' attribute.
	 * The default value is <code>"25"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterations</em>' attribute.
	 * @see #setIterations(int)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getLocalApplication_Iterations()
	 * @model default="25" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIterations();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#getIterations <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterations</em>' attribute.
	 * @see #getIterations()
	 * @generated
	 */
	void setIterations(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.inputDataSizeMiB>=0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean inputDataSizeMiB_Must_Be_Greater_Than_Or_Equal_To_Zero(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.outputDataSizeMiB>=0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean outputDataSizeMiB_Must_Be_Greater_Than_Or_Equal_To_Zero(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.MIs>=0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean MIs_Must_Be_Greater_Than_Or_Equal_To_Zero(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.iterations>=0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean iterations_Must_Be_Greater_Than_Or_Equal_To_Zero(DiagnosticChain diagnostics, Map<Object, Object> context);

} // LocalApplication
