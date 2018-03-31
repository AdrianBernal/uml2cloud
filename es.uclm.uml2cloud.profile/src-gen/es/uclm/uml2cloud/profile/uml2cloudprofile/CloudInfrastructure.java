/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudInfrastructure#getDatacenterElements <em>Datacenter Elements</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudInfrastructure#getCloudProvider <em>Cloud Provider</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudInfrastructure#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudInfrastructure#getNetwork <em>Network</em>}</li>
 * </ul>
 *
 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getCloudInfrastructure()
 * @model
 * @generated
 */
public interface CloudInfrastructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Datacenter Elements</b></em>' containment reference list.
	 * The list contents are of type {@link es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenterElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datacenter Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datacenter Elements</em>' containment reference list.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getCloudInfrastructure_DatacenterElements()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<DataCenterElement> getDatacenterElements();

	/**
	 * Returns the value of the '<em><b>Cloud Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloud Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud Provider</em>' reference.
	 * @see #setCloudProvider(CloudProvider)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getCloudInfrastructure_CloudProvider()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CloudProvider getCloudProvider();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudInfrastructure#getCloudProvider <em>Cloud Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud Provider</em>' reference.
	 * @see #getCloudProvider()
	 * @generated
	 */
	void setCloudProvider(CloudProvider value);

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
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getCloudInfrastructure_Base_Component()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Component getBase_Component();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudInfrastructure#getBase_Component <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Component</em>' reference.
	 * @see #getBase_Component()
	 * @generated
	 */
	void setBase_Component(Component value);

	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' containment reference.
	 * @see #setNetwork(Bandwidth)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getCloudInfrastructure_Network()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Bandwidth getNetwork();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudInfrastructure#getNetwork <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' containment reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(Bandwidth value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.datacenterElements->forAll(numberOfDataCenters>=0)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean datacenterElements_instances_Must_Be_Greatter_Than_Or_Equal_To_Zero(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.datacenterElements->forAll(numberOfDataCenters>0)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean datacenterElements_instances_Should_Be_Greatter_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context);

} // CloudInfrastructure
