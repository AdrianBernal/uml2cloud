/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage
 * @generated
 */
public interface UML2CloudProfileFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UML2CloudProfileFactory eINSTANCE = es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfileFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Center</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Center</em>'.
	 * @generated
	 */
	DataCenter createDataCenter();

	/**
	 * Returns a new object of class '<em>Bandwidth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bandwidth</em>'.
	 * @generated
	 */
	Bandwidth createBandwidth();

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
	 * Returns a new object of class '<em>Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Size</em>'.
	 * @generated
	 */
	Size createSize();

	/**
	 * Returns a new object of class '<em>Latency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Latency</em>'.
	 * @generated
	 */
	Latency createLatency();

	/**
	 * Returns a new object of class '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time</em>'.
	 * @generated
	 */
	Time createTime();

	/**
	 * Returns a new object of class '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage</em>'.
	 * @generated
	 */
	Storage createStorage();

	/**
	 * Returns a new object of class '<em>Computing Rack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computing Rack</em>'.
	 * @generated
	 */
	ComputingRack createComputingRack();

	/**
	 * Returns a new object of class '<em>Computing Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computing Machine</em>'.
	 * @generated
	 */
	ComputingMachine createComputingMachine();

	/**
	 * Returns a new object of class '<em>Storage Rack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage Rack</em>'.
	 * @generated
	 */
	StorageRack createStorageRack();

	/**
	 * Returns a new object of class '<em>Storage Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage Machine</em>'.
	 * @generated
	 */
	StorageMachine createStorageMachine();

	/**
	 * Returns a new object of class '<em>Cloud Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Provider</em>'.
	 * @generated
	 */
	CloudProvider createCloudProvider();

	/**
	 * Returns a new object of class '<em>SLA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SLA</em>'.
	 * @generated
	 */
	SLA createSLA();

	/**
	 * Returns a new object of class '<em>VM Cost</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VM Cost</em>'.
	 * @generated
	 */
	VMCost createVMCost();

	/**
	 * Returns a new object of class '<em>Cost</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cost</em>'.
	 * @generated
	 */
	Cost createCost();

	/**
	 * Returns a new object of class '<em>VM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VM</em>'.
	 * @generated
	 */
	VM createVM();

	/**
	 * Returns a new object of class '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application</em>'.
	 * @generated
	 */
	Application createApplication();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request</em>'.
	 * @generated
	 */
	Request createRequest();

	/**
	 * Returns a new object of class '<em>VM Instantiation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VM Instantiation</em>'.
	 * @generated
	 */
	VMInstantiation createVMInstantiation();

	/**
	 * Returns a new object of class '<em>Subscribe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subscribe</em>'.
	 * @generated
	 */
	Subscribe createSubscribe();

	/**
	 * Returns a new object of class '<em>App Instantiation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Instantiation</em>'.
	 * @generated
	 */
	AppInstantiation createAppInstantiation();

	/**
	 * Returns a new object of class '<em>Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execute</em>'.
	 * @generated
	 */
	Execute createExecute();

	/**
	 * Returns a new object of class '<em>Cloud Infrastructure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Infrastructure</em>'.
	 * @generated
	 */
	CloudInfrastructure createCloudInfrastructure();

	/**
	 * Returns a new object of class '<em>Data Center Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Center Element</em>'.
	 * @generated
	 */
	DataCenterElement createDataCenterElement();

	/**
	 * Returns a new object of class '<em>Priority User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Priority User</em>'.
	 * @generated
	 */
	PriorityUser createPriorityUser();

	/**
	 * Returns a new object of class '<em>Regular User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regular User</em>'.
	 * @generated
	 */
	RegularUser createRegularUser();

	/**
	 * Returns a new object of class '<em>Resume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resume</em>'.
	 * @generated
	 */
	Resume createResume();

	/**
	 * Returns a new object of class '<em>Response Offered VMs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Offered VMs</em>'.
	 * @generated
	 */
	ResponseOfferedVMs createResponseOfferedVMs();

	/**
	 * Returns a new object of class '<em>Ok</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ok</em>'.
	 * @generated
	 */
	Ok createOk();

	/**
	 * Returns a new object of class '<em>Timeout Renting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timeout Renting</em>'.
	 * @generated
	 */
	TimeoutRenting createTimeoutRenting();

	/**
	 * Returns a new object of class '<em>Notify</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notify</em>'.
	 * @generated
	 */
	Notify createNotify();

	/**
	 * Returns a new object of class '<em>Timeout Subscription</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timeout Subscription</em>'.
	 * @generated
	 */
	TimeoutSubscription createTimeoutSubscription();

	/**
	 * Returns a new object of class '<em>Request Offered VMs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Offered VMs</em>'.
	 * @generated
	 */
	RequestOfferedVMs createRequestOfferedVMs();

	/**
	 * Returns a new object of class '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response</em>'.
	 * @generated
	 */
	Response createResponse();

	/**
	 * Returns a new object of class '<em>Refuse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refuse</em>'.
	 * @generated
	 */
	Refuse createRefuse();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UML2CloudProfilePackage getUML2CloudProfilePackage();

} //UML2CloudProfileFactory
