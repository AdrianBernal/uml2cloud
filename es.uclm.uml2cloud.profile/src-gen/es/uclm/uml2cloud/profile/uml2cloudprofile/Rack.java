/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Rack#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Rack#getNodesPerBoard <em>Nodes Per Board</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Rack#getCommLink <em>Comm Link</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Rack#getBoards <em>Boards</em>}</li>
 * </ul>
 *
 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getRack()
 * @model abstract="true"
 * @generated
 */
public interface Rack extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Component</em>' reference.
	 * @see #setBase_Component(Component)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getRack_Base_Component()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Component getBase_Component();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Rack#getBase_Component <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Component</em>' reference.
	 * @see #getBase_Component()
	 * @generated
	 */
	void setBase_Component(Component value);

	/**
	 * Returns the value of the '<em><b>Nodes Per Board</b></em>' attribute.
	 * The default value is <code>"8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes Per Board</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes Per Board</em>' attribute.
	 * @see #setNodesPerBoard(int)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getRack_NodesPerBoard()
	 * @model default="8" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNodesPerBoard();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Rack#getNodesPerBoard <em>Nodes Per Board</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodes Per Board</em>' attribute.
	 * @see #getNodesPerBoard()
	 * @generated
	 */
	void setNodesPerBoard(int value);

	/**
	 * Returns the value of the '<em><b>Comm Link</b></em>' attribute.
	 * The default value is <code>"Ethernet40Gbps"</code>.
	 * The literals are from the enumeration {@link es.uclm.uml2cloud.profile.uml2cloudprofile.Channel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comm Link</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm Link</em>' attribute.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Channel
	 * @see #setCommLink(Channel)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getRack_CommLink()
	 * @model default="Ethernet40Gbps" required="true" ordered="false"
	 * @generated
	 */
	Channel getCommLink();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Rack#getCommLink <em>Comm Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comm Link</em>' attribute.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Channel
	 * @see #getCommLink()
	 * @generated
	 */
	void setCommLink(Channel value);

	/**
	 * Returns the value of the '<em><b>Boards</b></em>' attribute.
	 * The default value is <code>"8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boards</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boards</em>' attribute.
	 * @see #setBoards(int)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getRack_Boards()
	 * @model default="8" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getBoards();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Rack#getBoards <em>Boards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boards</em>' attribute.
	 * @see #getBoards()
	 * @generated
	 */
	void setBoards(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.boards>0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean boards_Must_Be_Greatter_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.nodesPerBoard>0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean nodesPerBoard_Must_Be_Greatter_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Rack
