/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Disk#getNumberOfDisks <em>Number Of Disks</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Disk#getReadBandwidthMBps <em>Read Bandwidth MBps</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Disk#getWriteBandwidthMBps <em>Write Bandwidth MBps</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Disk#getSizePerDeviceGB <em>Size Per Device GB</em>}</li>
 * </ul>
 *
 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudPackage#getDisk()
 * @model
 * @generated
 */
public interface Disk extends Hardware {
	/**
	 * Returns the value of the '<em><b>Number Of Disks</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Disks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Disks</em>' attribute.
	 * @see #setNumberOfDisks(int)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudPackage#getDisk_NumberOfDisks()
	 * @model default="1" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfDisks();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Disk#getNumberOfDisks <em>Number Of Disks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Disks</em>' attribute.
	 * @see #getNumberOfDisks()
	 * @generated
	 */
	void setNumberOfDisks(int value);

	/**
	 * Returns the value of the '<em><b>Read Bandwidth MBps</b></em>' attribute.
	 * The default value is <code>"500.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Bandwidth MBps</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Bandwidth MBps</em>' attribute.
	 * @see #setReadBandwidthMBps(double)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudPackage#getDisk_ReadBandwidthMBps()
	 * @model default="500.0" dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getReadBandwidthMBps();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Disk#getReadBandwidthMBps <em>Read Bandwidth MBps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Bandwidth MBps</em>' attribute.
	 * @see #getReadBandwidthMBps()
	 * @generated
	 */
	void setReadBandwidthMBps(double value);

	/**
	 * Returns the value of the '<em><b>Write Bandwidth MBps</b></em>' attribute.
	 * The default value is <code>"350.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write Bandwidth MBps</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Bandwidth MBps</em>' attribute.
	 * @see #setWriteBandwidthMBps(double)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudPackage#getDisk_WriteBandwidthMBps()
	 * @model default="350.0" dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getWriteBandwidthMBps();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Disk#getWriteBandwidthMBps <em>Write Bandwidth MBps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Bandwidth MBps</em>' attribute.
	 * @see #getWriteBandwidthMBps()
	 * @generated
	 */
	void setWriteBandwidthMBps(double value);

	/**
	 * Returns the value of the '<em><b>Size Per Device GB</b></em>' attribute.
	 * The default value is <code>"1000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Per Device GB</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Per Device GB</em>' attribute.
	 * @see #setSizePerDeviceGB(int)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudPackage#getDisk_SizePerDeviceGB()
	 * @model default="1000" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getSizePerDeviceGB();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Disk#getSizePerDeviceGB <em>Size Per Device GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Per Device GB</em>' attribute.
	 * @see #getSizePerDeviceGB()
	 * @generated
	 */
	void setSizePerDeviceGB(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.numberOfDisks>0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean numberOfDisks_Must_Be_Greatter_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.readBandwidthMBps>0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean readBandwidthMBps_Must_Be_Greatter_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.writeBandwidthMBps>0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean writeBandwidthMBps_Must_Be_Greatter_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.sizePerDeviceGB>0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean sizePerDeviceGB_Must_Be_Greatter_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Disk
