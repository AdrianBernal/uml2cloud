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
public class UML2CloudProfileFactoryImpl extends EFactoryImpl implements UML2CloudProfileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UML2CloudProfileFactory init() {
		try {
			UML2CloudProfileFactory theUML2CloudProfileFactory = (UML2CloudProfileFactory)EPackage.Registry.INSTANCE.getEFactory(UML2CloudProfilePackage.eNS_URI);
			if (theUML2CloudProfileFactory != null) {
				return theUML2CloudProfileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UML2CloudProfileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UML2CloudProfileFactoryImpl() {
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
			case UML2CloudProfilePackage.DATA_CENTER: return createDataCenter();
			case UML2CloudProfilePackage.BANDWIDTH: return createBandwidth();
			case UML2CloudProfilePackage.RACK_ELEMENT: return createRackElement();
			case UML2CloudProfilePackage.CPU: return createCPU();
			case UML2CloudProfilePackage.MEMORY: return createMemory();
			case UML2CloudProfilePackage.SIZE: return createSize();
			case UML2CloudProfilePackage.LATENCY: return createLatency();
			case UML2CloudProfilePackage.TIME: return createTime();
			case UML2CloudProfilePackage.STORAGE: return createStorage();
			case UML2CloudProfilePackage.COMPUTING_RACK: return createComputingRack();
			case UML2CloudProfilePackage.COMPUTING_MACHINE: return createComputingMachine();
			case UML2CloudProfilePackage.STORAGE_RACK: return createStorageRack();
			case UML2CloudProfilePackage.STORAGE_MACHINE: return createStorageMachine();
			case UML2CloudProfilePackage.CLOUD_PROVIDER: return createCloudProvider();
			case UML2CloudProfilePackage.SLA: return createSLA();
			case UML2CloudProfilePackage.VM_COST: return createVMCost();
			case UML2CloudProfilePackage.COST: return createCost();
			case UML2CloudProfilePackage.VM: return createVM();
			case UML2CloudProfilePackage.APPLICATION: return createApplication();
			case UML2CloudProfilePackage.PARAMETER: return createParameter();
			case UML2CloudProfilePackage.REQUEST: return createRequest();
			case UML2CloudProfilePackage.VM_INSTANTIATION: return createVMInstantiation();
			case UML2CloudProfilePackage.SUBSCRIBE: return createSubscribe();
			case UML2CloudProfilePackage.APP_INSTANTIATION: return createAppInstantiation();
			case UML2CloudProfilePackage.EXECUTE: return createExecute();
			case UML2CloudProfilePackage.CLOUD_INFRASTRUCTURE: return createCloudInfrastructure();
			case UML2CloudProfilePackage.DATA_CENTER_ELEMENT: return createDataCenterElement();
			case UML2CloudProfilePackage.PRIORITY_USER: return createPriorityUser();
			case UML2CloudProfilePackage.REGULAR_USER: return createRegularUser();
			case UML2CloudProfilePackage.RESUME: return createResume();
			case UML2CloudProfilePackage.RESPONSE_OFFERED_VMS: return createResponseOfferedVMs();
			case UML2CloudProfilePackage.OK: return createOk();
			case UML2CloudProfilePackage.TIMEOUT_RENTING: return createTimeoutRenting();
			case UML2CloudProfilePackage.NOTIFY: return createNotify();
			case UML2CloudProfilePackage.TIMEOUT_SUBSCRIPTION: return createTimeoutSubscription();
			case UML2CloudProfilePackage.REQUEST_OFFERED_VMS: return createRequestOfferedVMs();
			case UML2CloudProfilePackage.RESPONSE: return createResponse();
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
			case UML2CloudProfilePackage.BANDWIDTH_UNIT:
				return createBandwidthUnitFromString(eDataType, initialValue);
			case UML2CloudProfilePackage.SIZE_UNIT:
				return createSizeUnitFromString(eDataType, initialValue);
			case UML2CloudProfilePackage.TIME_UNIT:
				return createTimeUnitFromString(eDataType, initialValue);
			case UML2CloudProfilePackage.MACHINE_TYPE:
				return createMachineTypeFromString(eDataType, initialValue);
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
			case UML2CloudProfilePackage.BANDWIDTH_UNIT:
				return convertBandwidthUnitToString(eDataType, instanceValue);
			case UML2CloudProfilePackage.SIZE_UNIT:
				return convertSizeUnitToString(eDataType, instanceValue);
			case UML2CloudProfilePackage.TIME_UNIT:
				return convertTimeUnitToString(eDataType, instanceValue);
			case UML2CloudProfilePackage.MACHINE_TYPE:
				return convertMachineTypeToString(eDataType, instanceValue);
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
	public DataCenter createDataCenter() {
		DataCenterImpl dataCenter = new DataCenterImpl();
		return dataCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bandwidth createBandwidth() {
		BandwidthImpl bandwidth = new BandwidthImpl();
		return bandwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RackElement createRackElement() {
		RackElementImpl rackElement = new RackElementImpl();
		return rackElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CPU createCPU() {
		CPUImpl cpu = new CPUImpl();
		return cpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Memory createMemory() {
		MemoryImpl memory = new MemoryImpl();
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Size createSize() {
		SizeImpl size = new SizeImpl();
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Latency createLatency() {
		LatencyImpl latency = new LatencyImpl();
		return latency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Storage createStorage() {
		StorageImpl storage = new StorageImpl();
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComputingRack createComputingRack() {
		ComputingRackImpl computingRack = new ComputingRackImpl();
		return computingRack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComputingMachine createComputingMachine() {
		ComputingMachineImpl computingMachine = new ComputingMachineImpl();
		return computingMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StorageRack createStorageRack() {
		StorageRackImpl storageRack = new StorageRackImpl();
		return storageRack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StorageMachine createStorageMachine() {
		StorageMachineImpl storageMachine = new StorageMachineImpl();
		return storageMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CloudProvider createCloudProvider() {
		CloudProviderImpl cloudProvider = new CloudProviderImpl();
		return cloudProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SLA createSLA() {
		SLAImpl sla = new SLAImpl();
		return sla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VMCost createVMCost() {
		VMCostImpl vmCost = new VMCostImpl();
		return vmCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cost createCost() {
		CostImpl cost = new CostImpl();
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VM createVM() {
		VMImpl vm = new VMImpl();
		return vm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Request createRequest() {
		RequestImpl request = new RequestImpl();
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VMInstantiation createVMInstantiation() {
		VMInstantiationImpl vmInstantiation = new VMInstantiationImpl();
		return vmInstantiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subscribe createSubscribe() {
		SubscribeImpl subscribe = new SubscribeImpl();
		return subscribe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppInstantiation createAppInstantiation() {
		AppInstantiationImpl appInstantiation = new AppInstantiationImpl();
		return appInstantiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Execute createExecute() {
		ExecuteImpl execute = new ExecuteImpl();
		return execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CloudInfrastructure createCloudInfrastructure() {
		CloudInfrastructureImpl cloudInfrastructure = new CloudInfrastructureImpl();
		return cloudInfrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCenterElement createDataCenterElement() {
		DataCenterElementImpl dataCenterElement = new DataCenterElementImpl();
		return dataCenterElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PriorityUser createPriorityUser() {
		PriorityUserImpl priorityUser = new PriorityUserImpl();
		return priorityUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegularUser createRegularUser() {
		RegularUserImpl regularUser = new RegularUserImpl();
		return regularUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resume createResume() {
		ResumeImpl resume = new ResumeImpl();
		return resume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseOfferedVMs createResponseOfferedVMs() {
		ResponseOfferedVMsImpl responseOfferedVMs = new ResponseOfferedVMsImpl();
		return responseOfferedVMs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ok createOk() {
		OkImpl ok = new OkImpl();
		return ok;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeoutRenting createTimeoutRenting() {
		TimeoutRentingImpl timeoutRenting = new TimeoutRentingImpl();
		return timeoutRenting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Notify createNotify() {
		NotifyImpl notify = new NotifyImpl();
		return notify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeoutSubscription createTimeoutSubscription() {
		TimeoutSubscriptionImpl timeoutSubscription = new TimeoutSubscriptionImpl();
		return timeoutSubscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestOfferedVMs createRequestOfferedVMs() {
		RequestOfferedVMsImpl requestOfferedVMs = new RequestOfferedVMsImpl();
		return requestOfferedVMs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response createResponse() {
		ResponseImpl response = new ResponseImpl();
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BandwidthUnit createBandwidthUnitFromString(EDataType eDataType, String initialValue) {
		BandwidthUnit result = BandwidthUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBandwidthUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeUnit createSizeUnitFromString(EDataType eDataType, String initialValue) {
		SizeUnit result = SizeUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSizeUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit createTimeUnitFromString(EDataType eDataType, String initialValue) {
		TimeUnit result = TimeUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MachineType createMachineTypeFromString(EDataType eDataType, String initialValue) {
		MachineType result = MachineType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMachineTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UML2CloudProfilePackage getUML2CloudProfilePackage() {
		return (UML2CloudProfilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UML2CloudProfilePackage getPackage() {
		return UML2CloudProfilePackage.eINSTANCE;
	}

} //UML2CloudProfileFactoryImpl
