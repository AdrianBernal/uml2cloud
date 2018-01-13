/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudPackage
 * @generated
 */
public interface UML2CloudFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UML2CloudFactory eINSTANCE = es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Center</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Center</em>'.
	 * @generated
	 */
	DataCenter createDataCenter();

	/**
	 * Returns a new object of class '<em>Rack Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rack Element</em>'.
	 * @generated
	 */
	RackElement createRackElement();

	/**
	 * Returns a new object of class '<em>CPU</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CPU</em>'.
	 * @generated
	 */
	CPU createCPU();

	/**
	 * Returns a new object of class '<em>Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory</em>'.
	 * @generated
	 */
	Memory createMemory();

	/**
	 * Returns a new object of class '<em>Disk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disk</em>'.
	 * @generated
	 */
	Disk createDisk();

	/**
	 * Returns a new object of class '<em>Rack Cmp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rack Cmp</em>'.
	 * @generated
	 */
	RackCmp createRackCmp();

	/**
	 * Returns a new object of class '<em>Node Cmp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Cmp</em>'.
	 * @generated
	 */
	NodeCmp createNodeCmp();

	/**
	 * Returns a new object of class '<em>Rack Sto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rack Sto</em>'.
	 * @generated
	 */
	RackSto createRackSto();

	/**
	 * Returns a new object of class '<em>Node Sto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Sto</em>'.
	 * @generated
	 */
	NodeSto createNodeSto();

	/**
	 * Returns a new object of class '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario</em>'.
	 * @generated
	 */
	Scenario createScenario();

	/**
	 * Returns a new object of class '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repository</em>'.
	 * @generated
	 */
	Repository createRepository();

	/**
	 * Returns a new object of class '<em>VM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VM</em>'.
	 * @generated
	 */
	VM createVM();

	/**
	 * Returns a new object of class '<em>Local Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Application</em>'.
	 * @generated
	 */
	LocalApplication createLocalApplication();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Cloud Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Provider</em>'.
	 * @generated
	 */
	CloudProvider createCloudProvider();

	/**
	 * Returns a new object of class '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request</em>'.
	 * @generated
	 */
	Request createRequest();

	/**
	 * Returns a new object of class '<em>Subscribe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subscribe</em>'.
	 * @generated
	 */
	Subscribe createSubscribe();

	/**
	 * Returns a new object of class '<em>VM Instantiation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VM Instantiation</em>'.
	 * @generated
	 */
	VMInstantiation createVMInstantiation();

	/**
	 * Returns a new object of class '<em>App Instantiation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Instantiation</em>'.
	 * @generated
	 */
	AppInstantiation createAppInstantiation();

	/**
	 * Returns a new object of class '<em>OK</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OK</em>'.
	 * @generated
	 */
	OK createOK();

	/**
	 * Returns a new object of class '<em>Notify</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notify</em>'.
	 * @generated
	 */
	Notify createNotify();

	/**
	 * Returns a new object of class '<em>Timeout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timeout</em>'.
	 * @generated
	 */
	Timeout createTimeout();

	/**
	 * Returns a new object of class '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response</em>'.
	 * @generated
	 */
	Response createResponse();

	/**
	 * Returns a new object of class '<em>Reject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reject</em>'.
	 * @generated
	 */
	Reject createReject();

	/**
	 * Returns a new object of class '<em>Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execute</em>'.
	 * @generated
	 */
	Execute createExecute();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UML2CloudPackage getUML2CloudPackage();

} //UML2CloudFactory
