/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rack Cmp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RackCmp#getNodeCmpType <em>Node Cmp Type</em>}</li>
 * </ul>
 *
 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudPackage#getRackCmp()
 * @model
 * @generated
 */
public interface RackCmp extends Rack {
	/**
	 * Returns the value of the '<em><b>Node Cmp Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Cmp Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Cmp Type</em>' reference.
	 * @see #setNodeCmpType(NodeCmp)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudPackage#getRackCmp_NodeCmpType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	NodeCmp getNodeCmpType();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RackCmp#getNodeCmpType <em>Node Cmp Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Cmp Type</em>' reference.
	 * @see #getNodeCmpType()
	 * @generated
	 */
	void setNodeCmpType(NodeCmp value);

} // RackCmp
