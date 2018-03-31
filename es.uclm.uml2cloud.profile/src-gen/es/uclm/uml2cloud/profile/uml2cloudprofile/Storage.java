/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Storage#getNumberOfDrives <em>Number Of Drives</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Storage#getDriveCapacity <em>Drive Capacity</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Storage#getReadBandwidth <em>Read Bandwidth</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Storage#getWriteBandwidth <em>Write Bandwidth</em>}</li>
 * </ul>
 *
 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getStorage()
 * @model
 * @generated
 */
public interface Storage extends Hardware {
	/**
	 * Returns the value of the '<em><b>Number Of Drives</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Drives</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Drives</em>' attribute.
	 * @see #setNumberOfDrives(int)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getStorage_NumberOfDrives()
	 * @model default="1" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfDrives();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Storage#getNumberOfDrives <em>Number Of Drives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Drives</em>' attribute.
	 * @see #getNumberOfDrives()
	 * @generated
	 */
	void setNumberOfDrives(int value);

	/**
	 * Returns the value of the '<em><b>Write Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write Bandwidth</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Bandwidth</em>' containment reference.
	 * @see #setWriteBandwidth(Bandwidth)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getStorage_WriteBandwidth()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Bandwidth getWriteBandwidth();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Storage#getWriteBandwidth <em>Write Bandwidth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Bandwidth</em>' containment reference.
	 * @see #getWriteBandwidth()
	 * @generated
	 */
	void setWriteBandwidth(Bandwidth value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.numberOfDrives>0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean numberOfDrives_Must_Be_Greatter_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.driveCapacity.value>0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean driveCapacity_Must_Be_Greater_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.readBandwidth.value>0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean readBandwidth_Must_Be_Greatter_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.writeBandwidth.value>0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean writeBandwidth_Must_Be_Greatter_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * Returns the value of the '<em><b>Drive Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drive Capacity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drive Capacity</em>' containment reference.
	 * @see #setDriveCapacity(Size)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getStorage_DriveCapacity()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Size getDriveCapacity();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Storage#getDriveCapacity <em>Drive Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drive Capacity</em>' containment reference.
	 * @see #getDriveCapacity()
	 * @generated
	 */
	void setDriveCapacity(Size value);

	/**
	 * Returns the value of the '<em><b>Read Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Bandwidth</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Bandwidth</em>' containment reference.
	 * @see #setReadBandwidth(Bandwidth)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getStorage_ReadBandwidth()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Bandwidth getReadBandwidth();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Storage#getReadBandwidth <em>Read Bandwidth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Bandwidth</em>' containment reference.
	 * @see #getReadBandwidth()
	 * @generated
	 */
	void setReadBandwidth(Bandwidth value);

} // Storage
