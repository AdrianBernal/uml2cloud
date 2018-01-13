/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Scenario#getBase_Package <em>Base Package</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Scenario#getCloudProvider <em>Cloud Provider</em>}</li>
 * </ul>
 *
 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' reference.
	 * @see #setBase_Package(org.eclipse.uml2.uml.Package)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudPackage#getScenario_Base_Package()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Package getBase_Package();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Scenario#getBase_Package <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' reference.
	 * @see #getBase_Package()
	 * @generated
	 */
	void setBase_Package(org.eclipse.uml2.uml.Package value);

	/**
	 * Returns the value of the '<em><b>Cloud Provider</b></em>' attribute.
	 * The default value is <code>"CloudProviderFirstFit"</code>.
	 * The literals are from the enumeration {@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProviderType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloud Provider</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud Provider</em>' attribute.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProviderType
	 * @see #setCloudProvider(CloudProviderType)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudPackage#getScenario_CloudProvider()
	 * @model default="CloudProviderFirstFit" required="true" ordered="false"
	 * @generated
	 */
	CloudProviderType getCloudProvider();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Scenario#getCloudProvider <em>Cloud Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud Provider</em>' attribute.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProviderType
	 * @see #getCloudProvider()
	 * @generated
	 */
	void setCloudProvider(CloudProviderType value);

} // Scenario
