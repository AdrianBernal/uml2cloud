/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Center Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenterElement#getNumberOfDataCenters <em>Number Of Data Centers</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenterElement#getDataCenterType <em>Data Center Type</em>}</li>
 * </ul>
 *
 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getDataCenterElement()
 * @model
 * @generated
 */
public interface DataCenterElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Number Of Data Centers</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Data Centers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Data Centers</em>' attribute.
	 * @see #setNumberOfDataCenters(int)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getDataCenterElement_NumberOfDataCenters()
	 * @model default="1" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfDataCenters();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenterElement#getNumberOfDataCenters <em>Number Of Data Centers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Data Centers</em>' attribute.
	 * @see #getNumberOfDataCenters()
	 * @generated
	 */
	void setNumberOfDataCenters(int value);

	/**
	 * Returns the value of the '<em><b>Data Center Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Center Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Center Type</em>' reference.
	 * @see #setDataCenterType(DataCenter)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getDataCenterElement_DataCenterType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataCenter getDataCenterType();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenterElement#getDataCenterType <em>Data Center Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Center Type</em>' reference.
	 * @see #getDataCenterType()
	 * @generated
	 */
	void setDataCenterType(DataCenter value);

} // DataCenterElement
