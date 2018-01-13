/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.AppInstantiation#getApplicationType <em>Application Type</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.AppInstantiation#getInstances <em>Instances</em>}</li>
 * </ul>
 *
 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getAppInstantiation()
 * @model
 * @generated
 */
public interface AppInstantiation extends EObject {
	/**
	 * Returns the value of the '<em><b>Application Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Type</em>' reference.
	 * @see #setApplicationType(Application)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getAppInstantiation_ApplicationType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Application getApplicationType();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.AppInstantiation#getApplicationType <em>Application Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Type</em>' reference.
	 * @see #getApplicationType()
	 * @generated
	 */
	void setApplicationType(Application value);

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
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getAppInstantiation_Instances()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getInstances();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.AppInstantiation#getInstances <em>Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instances</em>' attribute.
	 * @see #getInstances()
	 * @generated
	 */
	void setInstances(int value);

} // AppInstantiation
