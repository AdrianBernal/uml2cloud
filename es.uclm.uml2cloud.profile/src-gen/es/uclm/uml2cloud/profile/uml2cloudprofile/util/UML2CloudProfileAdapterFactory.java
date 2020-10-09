/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile.util;

import es.uclm.uml2cloud.profile.uml2cloudprofile.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage
 * @generated
 */
public class UML2CloudProfileAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UML2CloudProfilePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UML2CloudProfileAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UML2CloudProfilePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UML2CloudProfileSwitch<Adapter> modelSwitch =
		new UML2CloudProfileSwitch<Adapter>() {
			@Override
			public Adapter caseDataCenter(DataCenter object) {
				return createDataCenterAdapter();
			}
			@Override
			public Adapter caseBandwidth(Bandwidth object) {
				return createBandwidthAdapter();
			}
			@Override
			public Adapter caseRackElement(RackElement object) {
				return createRackElementAdapter();
			}
			@Override
			public Adapter caseRack(Rack object) {
				return createRackAdapter();
			}
			@Override
			public Adapter caseMachine(Machine object) {
				return createMachineAdapter();
			}
			@Override
			public Adapter caseCPU(CPU object) {
				return createCPUAdapter();
			}
			@Override
			public Adapter caseHardware(Hardware object) {
				return createHardwareAdapter();
			}
			@Override
			public Adapter caseMemory(Memory object) {
				return createMemoryAdapter();
			}
			@Override
			public Adapter caseSize(Size object) {
				return createSizeAdapter();
			}
			@Override
			public Adapter caseLatency(Latency object) {
				return createLatencyAdapter();
			}
			@Override
			public Adapter caseTime(Time object) {
				return createTimeAdapter();
			}
			@Override
			public Adapter caseStorage(Storage object) {
				return createStorageAdapter();
			}
			@Override
			public Adapter caseComputingRack(ComputingRack object) {
				return createComputingRackAdapter();
			}
			@Override
			public Adapter caseComputingMachine(ComputingMachine object) {
				return createComputingMachineAdapter();
			}
			@Override
			public Adapter caseStorageRack(StorageRack object) {
				return createStorageRackAdapter();
			}
			@Override
			public Adapter caseStorageMachine(StorageMachine object) {
				return createStorageMachineAdapter();
			}
			@Override
			public Adapter caseCloudProvider(CloudProvider object) {
				return createCloudProviderAdapter();
			}
			@Override
			public Adapter caseSLA(SLA object) {
				return createSLAAdapter();
			}
			@Override
			public Adapter caseVMCost(VMCost object) {
				return createVMCostAdapter();
			}
			@Override
			public Adapter caseCost(Cost object) {
				return createCostAdapter();
			}
			@Override
			public Adapter caseVM(VM object) {
				return createVMAdapter();
			}
			@Override
			public Adapter caseApplication(Application object) {
				return createApplicationAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseRequest(Request object) {
				return createRequestAdapter();
			}
			@Override
			public Adapter caseVMInstantiation(VMInstantiation object) {
				return createVMInstantiationAdapter();
			}
			@Override
			public Adapter caseSubscribe(Subscribe object) {
				return createSubscribeAdapter();
			}
			@Override
			public Adapter caseAppInstantiation(AppInstantiation object) {
				return createAppInstantiationAdapter();
			}
			@Override
			public Adapter caseExecute(Execute object) {
				return createExecuteAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter caseCloudInfrastructure(CloudInfrastructure object) {
				return createCloudInfrastructureAdapter();
			}
			@Override
			public Adapter caseDataCenterElement(DataCenterElement object) {
				return createDataCenterElementAdapter();
			}
			@Override
			public Adapter casePriorityUser(PriorityUser object) {
				return createPriorityUserAdapter();
			}
			@Override
			public Adapter caseRegularUser(RegularUser object) {
				return createRegularUserAdapter();
			}
			@Override
			public Adapter caseResume(Resume object) {
				return createResumeAdapter();
			}
			@Override
			public Adapter caseResponseOfferedVMs(ResponseOfferedVMs object) {
				return createResponseOfferedVMsAdapter();
			}
			@Override
			public Adapter caseOk(Ok object) {
				return createOkAdapter();
			}
			@Override
			public Adapter caseTimeoutRenting(TimeoutRenting object) {
				return createTimeoutRentingAdapter();
			}
			@Override
			public Adapter caseNotify(Notify object) {
				return createNotifyAdapter();
			}
			@Override
			public Adapter caseTimeoutSubscription(TimeoutSubscription object) {
				return createTimeoutSubscriptionAdapter();
			}
			@Override
			public Adapter caseRequestOfferedVMs(RequestOfferedVMs object) {
				return createRequestOfferedVMsAdapter();
			}
			@Override
			public Adapter caseResponse(Response object) {
				return createResponseAdapter();
			}
			@Override
			public Adapter caseRefuse(Refuse object) {
				return createRefuseAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenter <em>Data Center</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenter
	 * @generated
	 */
	public Adapter createDataCenterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Bandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Bandwidth
	 * @generated
	 */
	public Adapter createBandwidthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement <em>Rack Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement
	 * @generated
	 */
	public Adapter createRackElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Rack <em>Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Rack
	 * @generated
	 */
	public Adapter createRackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Machine
	 * @generated
	 */
	public Adapter createMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CPU <em>CPU</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CPU
	 * @generated
	 */
	public Adapter createCPUAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Hardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Hardware
	 * @generated
	 */
	public Adapter createHardwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Memory
	 * @generated
	 */
	public Adapter createMemoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Size
	 * @generated
	 */
	public Adapter createSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Latency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Latency
	 * @generated
	 */
	public Adapter createLatencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Storage
	 * @generated
	 */
	public Adapter createStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.ComputingRack <em>Computing Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.ComputingRack
	 * @generated
	 */
	public Adapter createComputingRackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.ComputingMachine <em>Computing Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.ComputingMachine
	 * @generated
	 */
	public Adapter createComputingMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.StorageRack <em>Storage Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.StorageRack
	 * @generated
	 */
	public Adapter createStorageRackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.StorageMachine <em>Storage Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.StorageMachine
	 * @generated
	 */
	public Adapter createStorageMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProvider <em>Cloud Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProvider
	 * @generated
	 */
	public Adapter createCloudProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.SLA <em>SLA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.SLA
	 * @generated
	 */
	public Adapter createSLAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VMCost <em>VM Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VMCost
	 * @generated
	 */
	public Adapter createVMCostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Cost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Cost
	 * @generated
	 */
	public Adapter createCostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VM <em>VM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VM
	 * @generated
	 */
	public Adapter createVMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Request
	 * @generated
	 */
	public Adapter createRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VMInstantiation <em>VM Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VMInstantiation
	 * @generated
	 */
	public Adapter createVMInstantiationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Subscribe <em>Subscribe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Subscribe
	 * @generated
	 */
	public Adapter createSubscribeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.AppInstantiation <em>App Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.AppInstantiation
	 * @generated
	 */
	public Adapter createAppInstantiationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Execute <em>Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Execute
	 * @generated
	 */
	public Adapter createExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudInfrastructure <em>Cloud Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CloudInfrastructure
	 * @generated
	 */
	public Adapter createCloudInfrastructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenterElement <em>Data Center Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenterElement
	 * @generated
	 */
	public Adapter createDataCenterElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.PriorityUser <em>Priority User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.PriorityUser
	 * @generated
	 */
	public Adapter createPriorityUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RegularUser <em>Regular User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.RegularUser
	 * @generated
	 */
	public Adapter createRegularUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Resume <em>Resume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Resume
	 * @generated
	 */
	public Adapter createResumeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.ResponseOfferedVMs <em>Response Offered VMs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.ResponseOfferedVMs
	 * @generated
	 */
	public Adapter createResponseOfferedVMsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Ok <em>Ok</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Ok
	 * @generated
	 */
	public Adapter createOkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.TimeoutRenting <em>Timeout Renting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.TimeoutRenting
	 * @generated
	 */
	public Adapter createTimeoutRentingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Notify <em>Notify</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Notify
	 * @generated
	 */
	public Adapter createNotifyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.TimeoutSubscription <em>Timeout Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.TimeoutSubscription
	 * @generated
	 */
	public Adapter createTimeoutSubscriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RequestOfferedVMs <em>Request Offered VMs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.RequestOfferedVMs
	 * @generated
	 */
	public Adapter createRequestOfferedVMsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Response
	 * @generated
	 */
	public Adapter createResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Refuse <em>Refuse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Refuse
	 * @generated
	 */
	public Adapter createRefuseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UML2CloudProfileAdapterFactory
