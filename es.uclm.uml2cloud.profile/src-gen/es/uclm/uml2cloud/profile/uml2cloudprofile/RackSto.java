/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rack Sto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RackSto#getNodeStoType <em>Node Sto Type</em>}</li>
 * </ul>
 *
 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudPackage#getRackSto()
 * @model
 * @generated
 */
public interface RackSto extends Rack {
	/**
	 * Returns the value of the '<em><b>Node Sto Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Sto Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Sto Type</em>' reference.
	 * @see #setNodeStoType(NodeSto)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudPackage#getRackSto_NodeStoType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	NodeSto getNodeStoType();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RackSto#getNodeStoType <em>Node Sto Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Sto Type</em>' reference.
	 * @see #getNodeStoType()
	 * @generated
	 */
	void setNodeStoType(NodeSto value);

} // RackSto
