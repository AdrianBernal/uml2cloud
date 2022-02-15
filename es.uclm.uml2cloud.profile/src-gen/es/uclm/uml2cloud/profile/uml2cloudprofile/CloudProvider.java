/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Lifeline;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProvider#getResourceAllocationPolicy <em>Resource Allocation Policy</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProvider#getBase_Lifeline <em>Base Lifeline</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProvider#getSla <em>Sla</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProvider#getOffer <em>Offer</em>}</li>
 * </ul>
 *
 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getCloudProvider()
 * @model
 * @generated
 */
public interface CloudProvider extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource Allocation Policy</b></em>' attribute.
	 * The default value is <code>"_firstFist_cost"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Allocation Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Allocation Policy</em>' attribute.
	 * @see #setResourceAllocationPolicy(String)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getCloudProvider_ResourceAllocationPolicy()
	 * @model default="_firstFist_cost" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getResourceAllocationPolicy();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProvider#getResourceAllocationPolicy <em>Resource Allocation Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Allocation Policy</em>' attribute.
	 * @see #getResourceAllocationPolicy()
	 * @generated
	 */
	void setResourceAllocationPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Lifeline</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Lifeline</em>' reference.
	 * @see #setBase_Lifeline(Lifeline)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getCloudProvider_Base_Lifeline()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Lifeline getBase_Lifeline();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProvider#getBase_Lifeline <em>Base Lifeline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Lifeline</em>' reference.
	 * @see #getBase_Lifeline()
	 * @generated
	 */
	void setBase_Lifeline(Lifeline value);

	/**
	 * Returns the value of the '<em><b>Sla</b></em>' reference list.
	 * The list contents are of type {@link es.uclm.uml2cloud.profile.uml2cloudprofile.SLA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sla</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sla</em>' reference list.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getCloudProvider_Sla()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<SLA> getSla();

	/**
	 * Returns the value of the '<em><b>Offer</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offer</em>' attribute.
	 * @see #setOffer(double)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getCloudProvider_Offer()
	 * @model default="0.0" dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getOffer();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProvider#getOffer <em>Offer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offer</em>' attribute.
	 * @see #getOffer()
	 * @generated
	 */
	void setOffer(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean CloudProvider_Must_Offer_Once_Each_VM_For_Each_SLA_Type(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.offer >= 0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean CloudProvider_offer_must_be_greater_than_or_equal_to_zero(DiagnosticChain diagnostics, Map<Object, Object> context);

} // CloudProvider
