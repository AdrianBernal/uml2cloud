/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regular User</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getRegularUser()
 * @model
 * @generated
 */
public interface RegularUser extends User {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Lifeline.coveredBy->intersection(uml2cloud::Subscribe.allInstances()->collect(m | m.base_Message.sendEvent))->size()=1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean RegularUser_Must_Have_A_Subscribe_Message(DiagnosticChain diagnostics, Map<Object, Object> context);

} // RegularUser
