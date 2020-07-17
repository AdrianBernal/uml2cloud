/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computing Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.ComputingMachine#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getComputingMachine()
 * @model
 * @generated
 */
public interface ComputingMachine extends Machine {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uclm.uml2cloud.profile.uml2cloudprofile.MachineType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.MachineType
	 * @see #setType(MachineType)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getComputingMachine_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MachineType getType();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.ComputingMachine#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.MachineType
	 * @see #getType()
	 * @generated
	 */
	void setType(MachineType value);

} // ComputingMachine
