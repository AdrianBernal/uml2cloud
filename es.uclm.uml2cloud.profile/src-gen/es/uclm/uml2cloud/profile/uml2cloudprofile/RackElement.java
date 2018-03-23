/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rack Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement#getNumberOfRacks <em>Number Of Racks</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement#getRackType <em>Rack Type</em>}</li>
 * </ul>
 *
 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getRackElement()
 * @model
 * @generated
 */
public interface RackElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Number Of Racks</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Racks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Racks</em>' attribute.
	 * @see #setNumberOfRacks(int)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getRackElement_NumberOfRacks()
	 * @model default="1" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfRacks();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement#getNumberOfRacks <em>Number Of Racks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Racks</em>' attribute.
	 * @see #getNumberOfRacks()
	 * @generated
	 */
	void setNumberOfRacks(int value);

	/**
	 * Returns the value of the '<em><b>Rack Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rack Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rack Type</em>' reference.
	 * @see #setRackType(Rack)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getRackElement_RackType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Rack getRackType();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement#getRackType <em>Rack Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rack Type</em>' reference.
	 * @see #getRackType()
	 * @generated
	 */
	void setRackType(Rack value);

} // RackElement
