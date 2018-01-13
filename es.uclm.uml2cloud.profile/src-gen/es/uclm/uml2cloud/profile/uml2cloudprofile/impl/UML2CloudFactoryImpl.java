/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile.impl;

import es.uclm.uml2cloud.profile.uml2cloudprofile.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UML2CloudFactoryImpl extends EFactoryImpl implements UML2CloudFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UML2CloudFactory init() {
		try {
			UML2CloudFactory theUML2CloudFactory = (UML2CloudFactory)EPackage.Registry.INSTANCE.getEFactory(UML2CloudPackage.eNS_URI);
			if (theUML2CloudFactory != null) {
				return theUML2CloudFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UML2CloudFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UML2CloudFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UML2CloudPackage.DATA_CENTER: return createDataCenter();
			case UML2CloudPackage.RACK_ELEMENT: return createRackElement();
			case UML2CloudPackage.CPU: return createCPU();
			case UML2CloudPackage.MEMORY: return createMemory();
			case UML2CloudPackage.DISK: return createDisk();
			case UML2CloudPackage.RACK_CMP: return createRackCmp();
			case UML2CloudPackage.NODE_CMP: return createNodeCmp();
			case UML2CloudPackage.RACK_STO: return createRackSto();
			case UML2CloudPackage.NODE_STO: return createNodeSto();
			case UML2CloudPackage.SCENARIO: return createScenario();
			case UML2CloudPackage.REPOSITORY: return createRepository();
			case UML2CloudPackage.VM: return createVM();
			case UML2CloudPackage.LOCAL_APPLICATION: return createLocalApplication();
			case UML2CloudPackage.USER: return createUser();
			case UML2CloudPackage.CLOUD_PROVIDER: return createCloudProvider();
			case UML2CloudPackage.REQUEST: return createRequest();
			case UML2CloudPackage.SUBSCRIBE: return createSubscribe();
			case UML2CloudPackage.VM_INSTANTIATION: return createVMInstantiation();
			case UML2CloudPackage.APP_INSTANTIATION: return createAppInstantiation();
			case UML2CloudPackage.OK: return createOK();
			case UML2CloudPackage.NOTIFY: return createNotify();
			case UML2CloudPackage.TIMEOUT: return createTimeout();
			case UML2CloudPackage.RESPONSE: return createResponse();
			case UML2CloudPackage.REJECT: return createReject();
			case UML2CloudPackage.EXECUTE: return createExecute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UML2CloudPackage.CHANNEL:
				return createChannelFromString(eDataType, initialValue);
			case UML2CloudPackage.CPU_SCHEDULER:
				return createCPUSchedulerFromString(eDataType, initialValue);
			case UML2CloudPackage.CLOUD_PROVIDER_TYPE:
				return createCloudProviderTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UML2CloudPackage.CHANNEL:
				return convertChannelToString(eDataType, instanceValue);
			case UML2CloudPackage.CPU_SCHEDULER:
				return convertCPUSchedulerToString(eDataType, instanceValue);
			case UML2CloudPackage.CLOUD_PROVIDER_TYPE:
				return convertCloudProviderTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCenter createDataCenter() {
		DataCenterImpl dataCenter = new DataCenterImpl();
		return dataCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RackElement createRackElement() {
		RackElementImpl rackElement = new RackElementImpl();
		return rackElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPU createCPU() {
		CPUImpl cpu = new CPUImpl();
		return cpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memory createMemory() {
		MemoryImpl memory = new MemoryImpl();
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Disk createDisk() {
		DiskImpl disk = new DiskImpl();
		return disk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RackCmp createRackCmp() {
		RackCmpImpl rackCmp = new RackCmpImpl();
		return rackCmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeCmp createNodeCmp() {
		NodeCmpImpl nodeCmp = new NodeCmpImpl();
		return nodeCmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RackSto createRackSto() {
		RackStoImpl rackSto = new RackStoImpl();
		return rackSto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeSto createNodeSto() {
		NodeStoImpl nodeSto = new NodeStoImpl();
		return nodeSto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VM createVM() {
		VMImpl vm = new VMImpl();
		return vm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalApplication createLocalApplication() {
		LocalApplicationImpl localApplication = new LocalApplicationImpl();
		return localApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudProvider createCloudProvider() {
		CloudProviderImpl cloudProvider = new CloudProviderImpl();
		return cloudProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Request createRequest() {
		RequestImpl request = new RequestImpl();
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscribe createSubscribe() {
		SubscribeImpl subscribe = new SubscribeImpl();
		return subscribe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMInstantiation createVMInstantiation() {
		VMInstantiationImpl vmInstantiation = new VMInstantiationImpl();
		return vmInstantiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppInstantiation createAppInstantiation() {
		AppInstantiationImpl appInstantiation = new AppInstantiationImpl();
		return appInstantiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OK createOK() {
		OKImpl ok = new OKImpl();
		return ok;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notify createNotify() {
		NotifyImpl notify = new NotifyImpl();
		return notify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timeout createTimeout() {
		TimeoutImpl timeout = new TimeoutImpl();
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Response createResponse() {
		ResponseImpl response = new ResponseImpl();
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reject createReject() {
		RejectImpl reject = new RejectImpl();
		return reject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Execute createExecute() {
		ExecuteImpl execute = new ExecuteImpl();
		return execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel createChannelFromString(EDataType eDataType, String initialValue) {
		Channel result = Channel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChannelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPUScheduler createCPUSchedulerFromString(EDataType eDataType, String initialValue) {
		CPUScheduler result = CPUScheduler.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCPUSchedulerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudProviderType createCloudProviderTypeFromString(EDataType eDataType, String initialValue) {
		CloudProviderType result = CloudProviderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCloudProviderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UML2CloudPackage getUML2CloudPackage() {
		return (UML2CloudPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UML2CloudPackage getPackage() {
		return UML2CloudPackage.eINSTANCE;
	}

} //UML2CloudFactoryImpl
