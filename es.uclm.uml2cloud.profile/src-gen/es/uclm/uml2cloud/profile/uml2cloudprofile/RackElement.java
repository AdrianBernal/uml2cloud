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
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement#getInstances <em>Instances</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement#getRack <em>Rack</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement#getDataCenter <em>Data Center</em>}</li>
 * </ul>
 *
 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getRackElement()
 * @model
 * @generated
 */
public interface RackElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' attribute.
	 * @see #setInstances(int)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getRackElement_Instances()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getInstances();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement#getInstances <em>Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instances</em>' attribute.
	 * @see #getInstances()
	 * @generated
	 */
	void setInstances(int value);

	/**
	 * Returns the value of the '<em><b>Rack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rack</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rack</em>' reference.
	 * @see #setRack(Rack)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getRackElement_Rack()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Rack getRack();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement#getRack <em>Rack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rack</em>' reference.
	 * @see #getRack()
	 * @generated
	 */
	void setRack(Rack value);

	/**
	 * Returns the value of the '<em><b>Data Center</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenter#getRackElements <em>Rack Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Center</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Center</em>' container reference.
	 * @see #setDataCenter(DataCenter)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getRackElement_DataCenter()
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenter#getRackElements
	 * @model opposite="rackElements" required="true" transient="false" ordered="false"
	 * @generated
	 */
	DataCenter getDataCenter();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement#getDataCenter <em>Data Center</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Center</em>' container reference.
	 * @see #getDataCenter()
	 * @generated
	 */
	void setDataCenter(DataCenter value);

} // RackElement
