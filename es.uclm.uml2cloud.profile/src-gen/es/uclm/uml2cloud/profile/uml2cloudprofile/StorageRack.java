/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage Rack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.StorageRack#getMachineType <em>Machine Type</em>}</li>
 * </ul>
 *
 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getStorageRack()
 * @model
 * @generated
 */
public interface StorageRack extends Rack {
	/**
	 * Returns the value of the '<em><b>Machine Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machine Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Type</em>' reference.
	 * @see #setMachineType(StorageMachine)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getStorageRack_MachineType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StorageMachine getMachineType();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.StorageRack#getMachineType <em>Machine Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine Type</em>' reference.
	 * @see #getMachineType()
	 * @generated
	 */
	void setMachineType(StorageMachine value);

} // StorageRack
