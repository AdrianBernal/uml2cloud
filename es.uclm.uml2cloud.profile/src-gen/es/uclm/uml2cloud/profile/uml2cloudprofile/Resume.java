/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Message;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Resume#getBase_Message <em>Base Message</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Resume#getResumeTime <em>Resume Time</em>}</li>
 * </ul>
 *
 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getResume()
 * @model
 * @generated
 */
public interface Resume extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Message</em>' reference.
	 * @see #setBase_Message(Message)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getResume_Base_Message()
	 * @model ordered="false"
	 * @generated
	 */
	Message getBase_Message();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Resume#getBase_Message <em>Base Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Message</em>' reference.
	 * @see #getBase_Message()
	 * @generated
	 */
	void setBase_Message(Message value);

	/**
	 * Returns the value of the '<em><b>Resume Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resume Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resume Time</em>' containment reference.
	 * @see #setResumeTime(Time)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getResume_ResumeTime()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Time getResumeTime();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Resume#getResumeTime <em>Resume Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resume Time</em>' containment reference.
	 * @see #getResumeTime()
	 * @generated
	 */
	void setResumeTime(Time value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * uml2cloud::Request.allInstances()->select(req | uml2cloud::RegularUser.allInstances()->select(ru | ru.base_Lifeline.coveredBy->includes(self.base_Message.sendEvent))->forAll( ru | ru.base_Lifeline.coveredBy->includes(req.base_Message.sendEvent)))->forAll(req | req.vmInstantiation.rentingTime.value*2>self.resumeTime.value)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean ResumeTime_is_at_least_twice_as_long_as_the_renting_time(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Resume
