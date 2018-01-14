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
			public Adapter caseRackElement(RackElement object) {
				return createRackElementAdapter();
			}
			@Override
			public Adapter caseRack(Rack object) {
				return createRackAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
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
			public Adapter caseDisk(Disk object) {
				return createDiskAdapter();
			}
			@Override
			public Adapter caseRackCmp(RackCmp object) {
				return createRackCmpAdapter();
			}
			@Override
			public Adapter caseNodeCmp(NodeCmp object) {
				return createNodeCmpAdapter();
			}
			@Override
			public Adapter caseRackSto(RackSto object) {
				return createRackStoAdapter();
			}
			@Override
			public Adapter caseNodeSto(NodeSto object) {
				return createNodeStoAdapter();
			}
			@Override
			public Adapter caseScenario(Scenario object) {
				return createScenarioAdapter();
			}
			@Override
			public Adapter caseRepository(Repository object) {
				return createRepositoryAdapter();
			}
			@Override
			public Adapter caseApplication(Application object) {
				return createApplicationAdapter();
			}
			@Override
			public Adapter caseVM(VM object) {
				return createVMAdapter();
			}
			@Override
			public Adapter caseLocalApplication(LocalApplication object) {
				return createLocalApplicationAdapter();
			}
			@Override
			public Adapter caseCloudProvider(CloudProvider object) {
				return createCloudProviderAdapter();
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
			public Adapter caseOK(OK object) {
				return createOKAdapter();
			}
			@Override
			public Adapter caseNotify(Notify object) {
				return createNotifyAdapter();
			}
			@Override
			public Adapter caseTimeout(Timeout object) {
				return createTimeoutAdapter();
			}
			@Override
			public Adapter caseResponse(Response object) {
				return createResponseAdapter();
			}
			@Override
			public Adapter caseReject(Reject object) {
				return createRejectAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Disk <em>Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Disk
	 * @generated
	 */
	public Adapter createDiskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RackCmp <em>Rack Cmp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.RackCmp
	 * @generated
	 */
	public Adapter createRackCmpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.NodeCmp <em>Node Cmp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.NodeCmp
	 * @generated
	 */
	public Adapter createNodeCmpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RackSto <em>Rack Sto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.RackSto
	 * @generated
	 */
	public Adapter createRackStoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.NodeSto <em>Node Sto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.NodeSto
	 * @generated
	 */
	public Adapter createNodeStoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Scenario
	 * @generated
	 */
	public Adapter createScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Repository
	 * @generated
	 */
	public Adapter createRepositoryAdapter() {
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
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication <em>Local Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication
	 * @generated
	 */
	public Adapter createLocalApplicationAdapter() {
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
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.OK <em>OK</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.OK
	 * @generated
	 */
	public Adapter createOKAdapter() {
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
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Timeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Timeout
	 * @generated
	 */
	public Adapter createTimeoutAdapter() {
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
	 * Creates a new adapter for an object of class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Reject <em>Reject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Reject
	 * @generated
	 */
	public Adapter createRejectAdapter() {
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
