/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Memory#getSizeGB <em>Size GB</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Memory#getReadLatencyUS <em>Read Latency US</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Memory#getWriteLatencyUS <em>Write Latency US</em>}</li>
 * </ul>
 *
 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudPackage#getMemory()
 * @model
 * @generated
 */
public interface Memory extends Hardware {
	/**
	 * Returns the value of the '<em><b>Size GB</b></em>' attribute.
	 * The default value is <code>"4.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size GB</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size GB</em>' attribute.
	 * @see #setSizeGB(double)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudPackage#getMemory_SizeGB()
	 * @model default="4.0" dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getSizeGB();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Memory#getSizeGB <em>Size GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size GB</em>' attribute.
	 * @see #getSizeGB()
	 * @generated
	 */
	void setSizeGB(double value);

	/**
	 * Returns the value of the '<em><b>Read Latency US</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Latency US</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Latency US</em>' attribute.
	 * @see #setReadLatencyUS(int)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudPackage#getMemory_ReadLatencyUS()
	 * @model default="5" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getReadLatencyUS();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Memory#getReadLatencyUS <em>Read Latency US</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Latency US</em>' attribute.
	 * @see #getReadLatencyUS()
	 * @generated
	 */
	void setReadLatencyUS(int value);

	/**
	 * Returns the value of the '<em><b>Write Latency US</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write Latency US</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Latency US</em>' attribute.
	 * @see #setWriteLatencyUS(int)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudPackage#getMemory_WriteLatencyUS()
	 * @model default="5" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getWriteLatencyUS();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Memory#getWriteLatencyUS <em>Write Latency US</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Latency US</em>' attribute.
	 * @see #getWriteLatencyUS()
	 * @generated
	 */
	void setWriteLatencyUS(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.sizeGB>0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean sizeGB_Must_Be_Greater_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.readLatencyUS>=0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean readLatencyUS_Must_Be_Greater_Than_Or_Equal_To_Zero(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.writeLatencyUS>=0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean writeLatencyUS_Must_Be_Greatter_Than_Or_Equal_To_Zero(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Memory
