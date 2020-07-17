/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile.impl;

import es.uclm.uml2cloud.profile.uml2cloudprofile.AppInstantiation;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Application;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Bandwidth;
import es.uclm.uml2cloud.profile.uml2cloudprofile.BandwidthUnit;
import es.uclm.uml2cloud.profile.uml2cloudprofile.CloudInfrastructure;
import es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProvider;
import es.uclm.uml2cloud.profile.uml2cloudprofile.ComputingMachine;
import es.uclm.uml2cloud.profile.uml2cloudprofile.ComputingRack;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Cost;
import es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenter;
import es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenterElement;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Execute;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Hardware;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Latency;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Machine;
import es.uclm.uml2cloud.profile.uml2cloudprofile.MachineType;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Memory;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Notify;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Ok;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Parameter;
import es.uclm.uml2cloud.profile.uml2cloudprofile.PriorityUser;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Rack;
import es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement;
import es.uclm.uml2cloud.profile.uml2cloudprofile.RegularUser;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Request;
import es.uclm.uml2cloud.profile.uml2cloudprofile.RequestOfferedVMs;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Response;
import es.uclm.uml2cloud.profile.uml2cloudprofile.ResponseOfferedVMs;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Resume;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Size;
import es.uclm.uml2cloud.profile.uml2cloudprofile.SizeUnit;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Storage;
import es.uclm.uml2cloud.profile.uml2cloudprofile.StorageMachine;
import es.uclm.uml2cloud.profile.uml2cloudprofile.StorageRack;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Subscribe;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Time;
import es.uclm.uml2cloud.profile.uml2cloudprofile.TimeUnit;
import es.uclm.uml2cloud.profile.uml2cloudprofile.TimeoutRenting;
import es.uclm.uml2cloud.profile.uml2cloudprofile.TimeoutSubscription;
import es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfileFactory;
import es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage;
import es.uclm.uml2cloud.profile.uml2cloudprofile.User;
import es.uclm.uml2cloud.profile.uml2cloudprofile.VMCost;
import es.uclm.uml2cloud.profile.uml2cloudprofile.VMInstantiation;

import es.uclm.uml2cloud.profile.uml2cloudprofile.util.UML2CloudProfileValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UML2CloudProfilePackageImpl extends EPackageImpl implements UML2CloudProfilePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataCenterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bandwidthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rackElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass latencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computingRackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computingMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageRackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmCostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass costEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmInstantiationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscribeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appInstantiationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudInfrastructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataCenterElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priorityUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseOfferedVMsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass okEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeoutRentingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notifyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeoutSubscriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestOfferedVMsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bandwidthUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sizeUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum machineTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UML2CloudProfilePackageImpl() {
		super(eNS_URI, UML2CloudProfileFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link UML2CloudProfilePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UML2CloudProfilePackage init() {
		if (isInited) return (UML2CloudProfilePackage)EPackage.Registry.INSTANCE.getEPackage(UML2CloudProfilePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUML2CloudProfilePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UML2CloudProfilePackageImpl theUML2CloudProfilePackage = registeredUML2CloudProfilePackage instanceof UML2CloudProfilePackageImpl ? (UML2CloudProfilePackageImpl)registeredUML2CloudProfilePackage : new UML2CloudProfilePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theUML2CloudProfilePackage.createPackageContents();

		// Initialize created meta-data
		theUML2CloudProfilePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theUML2CloudProfilePackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return UML2CloudProfileValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theUML2CloudProfilePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UML2CloudProfilePackage.eNS_URI, theUML2CloudProfilePackage);
		return theUML2CloudProfilePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataCenter() {
		return dataCenterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataCenter_Network() {
		return (EReference)dataCenterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataCenter_RackElements() {
		return (EReference)dataCenterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataCenter_Base_Component() {
		return (EReference)dataCenterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataCenter__RackElements_instances_Should_Be_Greatter_Than_Zero__DiagnosticChain_Map() {
		return dataCenterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataCenter__RackElements_instances_Must_Be_Greatter_Than_Or_Equal_To_Zero__DiagnosticChain_Map() {
		return dataCenterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBandwidth() {
		return bandwidthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBandwidth_Value() {
		return (EAttribute)bandwidthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBandwidth_Unit() {
		return (EAttribute)bandwidthEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRackElement() {
		return rackElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRackElement_NumberOfRacks() {
		return (EAttribute)rackElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRackElement_RackType() {
		return (EReference)rackElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRack() {
		return rackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRack_MachinesPerBoard() {
		return (EAttribute)rackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRack_Network() {
		return (EReference)rackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRack_Boards() {
		return (EAttribute)rackEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRack_Base_Component() {
		return (EReference)rackEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRack__Boards_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map() {
		return rackEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRack__MachinesPerBoard_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map() {
		return rackEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMachine() {
		return machineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMachine_Base_Component() {
		return (EReference)machineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMachine_Cpu() {
		return (EReference)machineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMachine_Memory() {
		return (EReference)machineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMachine_Storage() {
		return (EReference)machineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCPU() {
		return cpuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCPU_Cores() {
		return (EAttribute)cpuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCPU_MIPS() {
		return (EAttribute)cpuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCPU__MIPS_Must_Be_Greater_Than_Zero__DiagnosticChain_Map() {
		return cpuEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCPU__Cores_Must_Be_Greater_Than_Zero__DiagnosticChain_Map() {
		return cpuEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHardware() {
		return hardwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHardware_Base_Component() {
		return (EReference)hardwareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemory() {
		return memoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemory_Capacity() {
		return (EReference)memoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemory_Latency() {
		return (EReference)memoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemory__Capacity_Must_Be_Greater_Than_Zero__DiagnosticChain_Map() {
		return memoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSize() {
		return sizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSize_Value() {
		return (EAttribute)sizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSize_Unit() {
		return (EAttribute)sizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLatency() {
		return latencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLatency_Name() {
		return (EAttribute)latencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLatency_Time() {
		return (EReference)latencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTime() {
		return timeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTime_Value() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTime_Unit() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStorage() {
		return storageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStorage_NumberOfDrives() {
		return (EAttribute)storageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStorage_DriveCapacity() {
		return (EReference)storageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStorage_ReadBandwidth() {
		return (EReference)storageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStorage_WriteBandwidth() {
		return (EReference)storageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStorage__NumberOfDrives_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map() {
		return storageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStorage__DriveCapacity_Must_Be_Greater_Than_Zero__DiagnosticChain_Map() {
		return storageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStorage__ReadBandwidth_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map() {
		return storageEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStorage__WriteBandwidth_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map() {
		return storageEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComputingRack() {
		return computingRackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComputingRack_MachineType() {
		return (EReference)computingRackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComputingMachine() {
		return computingMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComputingMachine_Type() {
		return (EAttribute)computingMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStorageRack() {
		return storageRackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStorageRack_MachineType() {
		return (EReference)storageRackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStorageMachine() {
		return storageMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCloudProvider() {
		return cloudProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudProvider_ResourceAllocationPolicy() {
		return (EAttribute)cloudProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCloudProvider_Base_Lifeline() {
		return (EReference)cloudProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCloudProvider_Sla() {
		return (EReference)cloudProviderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudProvider_Offer() {
		return (EAttribute)cloudProviderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCloudProvider__CloudProvider_Must_Offer_Once_Each_VM_For_Each_SLA_Type__DiagnosticChain_Map() {
		return cloudProviderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSLA() {
		return slaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSLA_Base_Component() {
		return (EReference)slaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSLA_Vmcost() {
		return (EReference)slaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVMCost() {
		return vmCostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVMCost_Base() {
		return (EReference)vmCostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVMCost_Incpriority() {
		return (EAttribute)vmCostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVMCost_Discount() {
		return (EAttribute)vmCostEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVMCost_Compensation() {
		return (EAttribute)vmCostEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVMCost_Vm() {
		return (EReference)vmCostEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCost() {
		return costEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCost_Value() {
		return (EAttribute)costEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCost_Rate() {
		return (EAttribute)costEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVM() {
		return vmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVM_Base_Component() {
		return (EReference)vmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVM_Cores() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVM_Disk() {
		return (EReference)vmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVM_ComputingUnits() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVM_Memory() {
		return (EReference)vmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVM__Cores_Must_Be_Greater_Than_Zero__DiagnosticChain_Map() {
		return vmEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVM__ComputingUnits_Must_Be_Greater_Than_Zero__DiagnosticChain_Map() {
		return vmEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVM__Memory_Must_Be_Greater_Than_Zero__DiagnosticChain_Map() {
		return vmEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVM__VM_can_not_be_allocated__DiagnosticChain_Map() {
		return vmEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVM__Disk_Must_Be_Greater_Than_Zero__DiagnosticChain_Map() {
		return vmEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_Base_Component() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplication_MIs() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_InputData() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_OutputData() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApplication_Parameter() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getApplication__MIs_Must_Be_Greater_Than_Zero__DiagnosticChain_Map() {
		return applicationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getApplication__InputData_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map() {
		return applicationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getApplication__OutputData_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map() {
		return applicationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Value() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Type() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Description() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequest() {
		return requestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequest_Base_Message() {
		return (EReference)requestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequest_VmInstantiation() {
		return (EReference)requestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRequest__RentingTime_Must_Be_Greater_Than__Zero__DiagnosticChain_Map() {
		return requestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRequest__Instances_Must_Be_Greater_Than__Zero__DiagnosticChain_Map() {
		return requestEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRequest__Request_Must_Be_Sent_To_A_CloudProvider__DiagnosticChain_Map() {
		return requestEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRequest__Request_Must_Be_Sent_By_A_User__DiagnosticChain_Map() {
		return requestEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRequest__Request_For_A_VM_Not_Offered_In_The_Signed_SLA_By_The_User__DiagnosticChain_Map() {
		return requestEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVMInstantiation() {
		return vmInstantiationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVMInstantiation_Instances() {
		return (EAttribute)vmInstantiationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVMInstantiation_VmType() {
		return (EReference)vmInstantiationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVMInstantiation_RentingTime() {
		return (EReference)vmInstantiationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubscribe() {
		return subscribeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubscribe_Base_Message() {
		return (EReference)subscribeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubscribe_MaxTime() {
		return (EReference)subscribeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubscribe__MaxTime_Must_Be_Greater_Than_Zero__DiagnosticChain_Map() {
		return subscribeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubscribe__Subscribe_Must_Be_Sent_To_A_CloudProvider__DiagnosticChain_Map() {
		return subscribeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubscribe__Subscribe_Must_Be_Sent_By_A_User__DiagnosticChain_Map() {
		return subscribeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAppInstantiation() {
		return appInstantiationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAppInstantiation_ApplicationType() {
		return (EReference)appInstantiationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppInstantiation_Instances() {
		return (EAttribute)appInstantiationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecute() {
		return executeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecute_Base_Message() {
		return (EReference)executeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecute_AppInstantiation() {
		return (EReference)executeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExecute__Instances_Must_Be_Greater_Than_Zero__DiagnosticChain_Map() {
		return executeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExecute__Execute_Must_Be_Sent_To_A_CloudProvider__DiagnosticChain_Map() {
		return executeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExecute__Execute_Must_Be_Sent_By_A_User__DiagnosticChain_Map() {
		return executeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_Base_Lifeline() {
		return (EReference)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_Instances() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_Sla() {
		return (EReference)userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUser__User_Must_Have_A_Execute_Message__DiagnosticChain_Map() {
		return userEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUser__User_Must_Have_A_Request_Message__DiagnosticChain_Map() {
		return userEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUser__User_Must_Sign_A_VM_SLA_Offered_By_The_CloudProvider__DiagnosticChain_Map() {
		return userEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUser__User_Must_Have_A_Resume_Message__DiagnosticChain_Map() {
		return userEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCloudInfrastructure() {
		return cloudInfrastructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCloudInfrastructure_DatacenterElements() {
		return (EReference)cloudInfrastructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCloudInfrastructure_Base_Component() {
		return (EReference)cloudInfrastructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCloudInfrastructure_Network() {
		return (EReference)cloudInfrastructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCloudInfrastructure__DatacenterElements_instances_Must_Be_Greatter_Than_Or_Equal_To_Zero__DiagnosticChain_Map() {
		return cloudInfrastructureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCloudInfrastructure__DatacenterElements_instances_Should_Be_Greatter_Than_Zero__DiagnosticChain_Map() {
		return cloudInfrastructureEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataCenterElement() {
		return dataCenterElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataCenterElement_NumberOfDataCenters() {
		return (EAttribute)dataCenterElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataCenterElement_DataCenterType() {
		return (EReference)dataCenterElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPriorityUser() {
		return priorityUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegularUser() {
		return regularUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRegularUser__RegularUser_Must_Have_A_Subscribe_Message__DiagnosticChain_Map() {
		return regularUserEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResume() {
		return resumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResume_Base_Message() {
		return (EReference)resumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResume_ResumeTime() {
		return (EReference)resumeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponseOfferedVMs() {
		return responseOfferedVMsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponseOfferedVMs_Base_Message() {
		return (EReference)responseOfferedVMsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOk() {
		return okEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOk_Base_Message() {
		return (EReference)okEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeoutRenting() {
		return timeoutRentingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeoutRenting_Base_Message() {
		return (EReference)timeoutRentingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNotify() {
		return notifyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNotify_Base_Message() {
		return (EReference)notifyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeoutSubscription() {
		return timeoutSubscriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeoutSubscription_Base_Message() {
		return (EReference)timeoutSubscriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestOfferedVMs() {
		return requestOfferedVMsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequestOfferedVMs_Base_Message() {
		return (EReference)requestOfferedVMsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponse() {
		return responseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponse_Base_Message() {
		return (EReference)responseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBandwidthUnit() {
		return bandwidthUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSizeUnit() {
		return sizeUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTimeUnit() {
		return timeUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMachineType() {
		return machineTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UML2CloudProfileFactory getUML2CloudProfileFactory() {
		return (UML2CloudProfileFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dataCenterEClass = createEClass(DATA_CENTER);
		createEReference(dataCenterEClass, DATA_CENTER__NETWORK);
		createEReference(dataCenterEClass, DATA_CENTER__RACK_ELEMENTS);
		createEReference(dataCenterEClass, DATA_CENTER__BASE_COMPONENT);
		createEOperation(dataCenterEClass, DATA_CENTER___RACK_ELEMENTS_INSTANCES_SHOULD_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(dataCenterEClass, DATA_CENTER___RACK_ELEMENTS_INSTANCES_MUST_BE_GREATTER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP);

		bandwidthEClass = createEClass(BANDWIDTH);
		createEAttribute(bandwidthEClass, BANDWIDTH__VALUE);
		createEAttribute(bandwidthEClass, BANDWIDTH__UNIT);

		rackElementEClass = createEClass(RACK_ELEMENT);
		createEAttribute(rackElementEClass, RACK_ELEMENT__NUMBER_OF_RACKS);
		createEReference(rackElementEClass, RACK_ELEMENT__RACK_TYPE);

		rackEClass = createEClass(RACK);
		createEAttribute(rackEClass, RACK__MACHINES_PER_BOARD);
		createEReference(rackEClass, RACK__NETWORK);
		createEAttribute(rackEClass, RACK__BOARDS);
		createEReference(rackEClass, RACK__BASE_COMPONENT);
		createEOperation(rackEClass, RACK___BOARDS_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(rackEClass, RACK___MACHINES_PER_BOARD_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);

		machineEClass = createEClass(MACHINE);
		createEReference(machineEClass, MACHINE__BASE_COMPONENT);
		createEReference(machineEClass, MACHINE__CPU);
		createEReference(machineEClass, MACHINE__MEMORY);
		createEReference(machineEClass, MACHINE__STORAGE);

		cpuEClass = createEClass(CPU);
		createEAttribute(cpuEClass, CPU__CORES);
		createEAttribute(cpuEClass, CPU__MIPS);
		createEOperation(cpuEClass, CPU___MIPS_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(cpuEClass, CPU___CORES_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);

		hardwareEClass = createEClass(HARDWARE);
		createEReference(hardwareEClass, HARDWARE__BASE_COMPONENT);

		memoryEClass = createEClass(MEMORY);
		createEReference(memoryEClass, MEMORY__CAPACITY);
		createEReference(memoryEClass, MEMORY__LATENCY);
		createEOperation(memoryEClass, MEMORY___CAPACITY_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);

		sizeEClass = createEClass(SIZE);
		createEAttribute(sizeEClass, SIZE__VALUE);
		createEAttribute(sizeEClass, SIZE__UNIT);

		latencyEClass = createEClass(LATENCY);
		createEAttribute(latencyEClass, LATENCY__NAME);
		createEReference(latencyEClass, LATENCY__TIME);

		timeEClass = createEClass(TIME);
		createEAttribute(timeEClass, TIME__VALUE);
		createEAttribute(timeEClass, TIME__UNIT);

		storageEClass = createEClass(STORAGE);
		createEAttribute(storageEClass, STORAGE__NUMBER_OF_DRIVES);
		createEReference(storageEClass, STORAGE__DRIVE_CAPACITY);
		createEReference(storageEClass, STORAGE__READ_BANDWIDTH);
		createEReference(storageEClass, STORAGE__WRITE_BANDWIDTH);
		createEOperation(storageEClass, STORAGE___NUMBER_OF_DRIVES_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(storageEClass, STORAGE___DRIVE_CAPACITY_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(storageEClass, STORAGE___READ_BANDWIDTH_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(storageEClass, STORAGE___WRITE_BANDWIDTH_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);

		computingRackEClass = createEClass(COMPUTING_RACK);
		createEReference(computingRackEClass, COMPUTING_RACK__MACHINE_TYPE);

		computingMachineEClass = createEClass(COMPUTING_MACHINE);
		createEAttribute(computingMachineEClass, COMPUTING_MACHINE__TYPE);

		storageRackEClass = createEClass(STORAGE_RACK);
		createEReference(storageRackEClass, STORAGE_RACK__MACHINE_TYPE);

		storageMachineEClass = createEClass(STORAGE_MACHINE);

		cloudProviderEClass = createEClass(CLOUD_PROVIDER);
		createEAttribute(cloudProviderEClass, CLOUD_PROVIDER__RESOURCE_ALLOCATION_POLICY);
		createEReference(cloudProviderEClass, CLOUD_PROVIDER__BASE_LIFELINE);
		createEReference(cloudProviderEClass, CLOUD_PROVIDER__SLA);
		createEAttribute(cloudProviderEClass, CLOUD_PROVIDER__OFFER);
		createEOperation(cloudProviderEClass, CLOUD_PROVIDER___CLOUD_PROVIDER_MUST_OFFER_ONCE_EACH_VM_FOR_EACH_SLA_TYPE__DIAGNOSTICCHAIN_MAP);

		slaEClass = createEClass(SLA);
		createEReference(slaEClass, SLA__BASE_COMPONENT);
		createEReference(slaEClass, SLA__VMCOST);

		vmCostEClass = createEClass(VM_COST);
		createEReference(vmCostEClass, VM_COST__BASE);
		createEAttribute(vmCostEClass, VM_COST__INCPRIORITY);
		createEAttribute(vmCostEClass, VM_COST__DISCOUNT);
		createEAttribute(vmCostEClass, VM_COST__COMPENSATION);
		createEReference(vmCostEClass, VM_COST__VM);

		costEClass = createEClass(COST);
		createEAttribute(costEClass, COST__VALUE);
		createEAttribute(costEClass, COST__RATE);

		vmEClass = createEClass(VM);
		createEReference(vmEClass, VM__BASE_COMPONENT);
		createEAttribute(vmEClass, VM__CORES);
		createEReference(vmEClass, VM__DISK);
		createEAttribute(vmEClass, VM__COMPUTING_UNITS);
		createEReference(vmEClass, VM__MEMORY);
		createEOperation(vmEClass, VM___CORES_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(vmEClass, VM___COMPUTING_UNITS_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(vmEClass, VM___MEMORY_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(vmEClass, VM___VM_CAN_NOT_BE_ALLOCATED__DIAGNOSTICCHAIN_MAP);
		createEOperation(vmEClass, VM___DISK_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);

		applicationEClass = createEClass(APPLICATION);
		createEReference(applicationEClass, APPLICATION__BASE_COMPONENT);
		createEAttribute(applicationEClass, APPLICATION__MIS);
		createEReference(applicationEClass, APPLICATION__INPUT_DATA);
		createEReference(applicationEClass, APPLICATION__OUTPUT_DATA);
		createEReference(applicationEClass, APPLICATION__PARAMETER);
		createEOperation(applicationEClass, APPLICATION___MIS_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(applicationEClass, APPLICATION___INPUT_DATA_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(applicationEClass, APPLICATION___OUTPUT_DATA_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEAttribute(parameterEClass, PARAMETER__VALUE);
		createEAttribute(parameterEClass, PARAMETER__TYPE);
		createEAttribute(parameterEClass, PARAMETER__DESCRIPTION);

		requestEClass = createEClass(REQUEST);
		createEReference(requestEClass, REQUEST__BASE_MESSAGE);
		createEReference(requestEClass, REQUEST__VM_INSTANTIATION);
		createEOperation(requestEClass, REQUEST___RENTING_TIME_MUST_BE_GREATER_THAN_ZERO__ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(requestEClass, REQUEST___INSTANCES_MUST_BE_GREATER_THAN_ZERO__ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(requestEClass, REQUEST___REQUEST_MUST_BE_SENT_TO_ACLOUD_PROVIDER__DIAGNOSTICCHAIN_MAP);
		createEOperation(requestEClass, REQUEST___REQUEST_MUST_BE_SENT_BY_AUSER__DIAGNOSTICCHAIN_MAP);
		createEOperation(requestEClass, REQUEST___REQUEST_FOR_AVM_NOT_OFFERED_IN_THE_SIGNED_SLA_BY_THE_USER__DIAGNOSTICCHAIN_MAP);

		vmInstantiationEClass = createEClass(VM_INSTANTIATION);
		createEAttribute(vmInstantiationEClass, VM_INSTANTIATION__INSTANCES);
		createEReference(vmInstantiationEClass, VM_INSTANTIATION__VM_TYPE);
		createEReference(vmInstantiationEClass, VM_INSTANTIATION__RENTING_TIME);

		subscribeEClass = createEClass(SUBSCRIBE);
		createEReference(subscribeEClass, SUBSCRIBE__BASE_MESSAGE);
		createEReference(subscribeEClass, SUBSCRIBE__MAX_TIME);
		createEOperation(subscribeEClass, SUBSCRIBE___MAX_TIME_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(subscribeEClass, SUBSCRIBE___SUBSCRIBE_MUST_BE_SENT_TO_ACLOUD_PROVIDER__DIAGNOSTICCHAIN_MAP);
		createEOperation(subscribeEClass, SUBSCRIBE___SUBSCRIBE_MUST_BE_SENT_BY_AUSER__DIAGNOSTICCHAIN_MAP);

		appInstantiationEClass = createEClass(APP_INSTANTIATION);
		createEReference(appInstantiationEClass, APP_INSTANTIATION__APPLICATION_TYPE);
		createEAttribute(appInstantiationEClass, APP_INSTANTIATION__INSTANCES);

		executeEClass = createEClass(EXECUTE);
		createEReference(executeEClass, EXECUTE__BASE_MESSAGE);
		createEReference(executeEClass, EXECUTE__APP_INSTANTIATION);
		createEOperation(executeEClass, EXECUTE___INSTANCES_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(executeEClass, EXECUTE___EXECUTE_MUST_BE_SENT_TO_ACLOUD_PROVIDER__DIAGNOSTICCHAIN_MAP);
		createEOperation(executeEClass, EXECUTE___EXECUTE_MUST_BE_SENT_BY_AUSER__DIAGNOSTICCHAIN_MAP);

		userEClass = createEClass(USER);
		createEReference(userEClass, USER__BASE_LIFELINE);
		createEAttribute(userEClass, USER__INSTANCES);
		createEReference(userEClass, USER__SLA);
		createEOperation(userEClass, USER___USER_MUST_HAVE_AEXECUTE_MESSAGE__DIAGNOSTICCHAIN_MAP);
		createEOperation(userEClass, USER___USER_MUST_HAVE_AREQUEST_MESSAGE__DIAGNOSTICCHAIN_MAP);
		createEOperation(userEClass, USER___USER_MUST_SIGN_AVM_SLA_OFFERED_BY_THE_CLOUD_PROVIDER__DIAGNOSTICCHAIN_MAP);
		createEOperation(userEClass, USER___USER_MUST_HAVE_ARESUME_MESSAGE__DIAGNOSTICCHAIN_MAP);

		cloudInfrastructureEClass = createEClass(CLOUD_INFRASTRUCTURE);
		createEReference(cloudInfrastructureEClass, CLOUD_INFRASTRUCTURE__DATACENTER_ELEMENTS);
		createEReference(cloudInfrastructureEClass, CLOUD_INFRASTRUCTURE__BASE_COMPONENT);
		createEReference(cloudInfrastructureEClass, CLOUD_INFRASTRUCTURE__NETWORK);
		createEOperation(cloudInfrastructureEClass, CLOUD_INFRASTRUCTURE___DATACENTER_ELEMENTS_INSTANCES_MUST_BE_GREATTER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(cloudInfrastructureEClass, CLOUD_INFRASTRUCTURE___DATACENTER_ELEMENTS_INSTANCES_SHOULD_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);

		dataCenterElementEClass = createEClass(DATA_CENTER_ELEMENT);
		createEAttribute(dataCenterElementEClass, DATA_CENTER_ELEMENT__NUMBER_OF_DATA_CENTERS);
		createEReference(dataCenterElementEClass, DATA_CENTER_ELEMENT__DATA_CENTER_TYPE);

		priorityUserEClass = createEClass(PRIORITY_USER);

		regularUserEClass = createEClass(REGULAR_USER);
		createEOperation(regularUserEClass, REGULAR_USER___REGULAR_USER_MUST_HAVE_ASUBSCRIBE_MESSAGE__DIAGNOSTICCHAIN_MAP);

		resumeEClass = createEClass(RESUME);
		createEReference(resumeEClass, RESUME__BASE_MESSAGE);
		createEReference(resumeEClass, RESUME__RESUME_TIME);

		responseOfferedVMsEClass = createEClass(RESPONSE_OFFERED_VMS);
		createEReference(responseOfferedVMsEClass, RESPONSE_OFFERED_VMS__BASE_MESSAGE);

		okEClass = createEClass(OK);
		createEReference(okEClass, OK__BASE_MESSAGE);

		timeoutRentingEClass = createEClass(TIMEOUT_RENTING);
		createEReference(timeoutRentingEClass, TIMEOUT_RENTING__BASE_MESSAGE);

		notifyEClass = createEClass(NOTIFY);
		createEReference(notifyEClass, NOTIFY__BASE_MESSAGE);

		timeoutSubscriptionEClass = createEClass(TIMEOUT_SUBSCRIPTION);
		createEReference(timeoutSubscriptionEClass, TIMEOUT_SUBSCRIPTION__BASE_MESSAGE);

		requestOfferedVMsEClass = createEClass(REQUEST_OFFERED_VMS);
		createEReference(requestOfferedVMsEClass, REQUEST_OFFERED_VMS__BASE_MESSAGE);

		responseEClass = createEClass(RESPONSE);
		createEReference(responseEClass, RESPONSE__BASE_MESSAGE);

		// Create enums
		bandwidthUnitEEnum = createEEnum(BANDWIDTH_UNIT);
		sizeUnitEEnum = createEEnum(SIZE_UNIT);
		timeUnitEEnum = createEEnum(TIME_UNIT);
		machineTypeEEnum = createEEnum(MACHINE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cpuEClass.getESuperTypes().add(this.getHardware());
		memoryEClass.getESuperTypes().add(this.getHardware());
		storageEClass.getESuperTypes().add(this.getHardware());
		computingRackEClass.getESuperTypes().add(this.getRack());
		computingMachineEClass.getESuperTypes().add(this.getMachine());
		storageRackEClass.getESuperTypes().add(this.getRack());
		storageMachineEClass.getESuperTypes().add(this.getMachine());
		priorityUserEClass.getESuperTypes().add(this.getUser());
		regularUserEClass.getESuperTypes().add(this.getUser());

		// Initialize classes, features, and operations; add parameters
		initEClass(dataCenterEClass, DataCenter.class, "DataCenter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataCenter_Network(), this.getBandwidth(), null, "network", null, 1, 1, DataCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataCenter_RackElements(), this.getRackElement(), null, "rackElements", null, 1, -1, DataCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataCenter_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, DataCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getDataCenter__RackElements_instances_Should_Be_Greatter_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "rackElements_instances_Should_Be_Greatter_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataCenter__RackElements_instances_Must_Be_Greatter_Than_Or_Equal_To_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "rackElements_instances_Must_Be_Greatter_Than_Or_Equal_To_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(bandwidthEClass, Bandwidth.class, "Bandwidth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBandwidth_Value(), theTypesPackage.getReal(), "value", "1.0", 1, 1, Bandwidth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBandwidth_Unit(), this.getBandwidthUnit(), "unit", "Gbps", 1, 1, Bandwidth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rackElementEClass, RackElement.class, "RackElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRackElement_NumberOfRacks(), theTypesPackage.getInteger(), "numberOfRacks", "1", 1, 1, RackElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRackElement_RackType(), this.getRack(), null, "rackType", null, 1, 1, RackElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rackEClass, Rack.class, "Rack", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRack_MachinesPerBoard(), theTypesPackage.getInteger(), "machinesPerBoard", "8", 1, 1, Rack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRack_Network(), this.getBandwidth(), null, "network", null, 1, 1, Rack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRack_Boards(), theTypesPackage.getInteger(), "boards", "8", 1, 1, Rack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRack_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, Rack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRack__Boards_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "boards_Must_Be_Greatter_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRack__MachinesPerBoard_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "machinesPerBoard_Must_Be_Greatter_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(machineEClass, Machine.class, "Machine", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMachine_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMachine_Cpu(), this.getCPU(), null, "cpu", null, 1, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMachine_Memory(), this.getMemory(), null, "memory", null, 1, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMachine_Storage(), this.getStorage(), null, "storage", null, 1, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cpuEClass, es.uclm.uml2cloud.profile.uml2cloudprofile.CPU.class, "CPU", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCPU_Cores(), theTypesPackage.getInteger(), "cores", "2", 1, 1, es.uclm.uml2cloud.profile.uml2cloudprofile.CPU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCPU_MIPS(), theTypesPackage.getInteger(), "MIPS", "30000", 1, 1, es.uclm.uml2cloud.profile.uml2cloudprofile.CPU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getCPU__MIPS_Must_Be_Greater_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "MIPS_Must_Be_Greater_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCPU__Cores_Must_Be_Greater_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "cores_Must_Be_Greater_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hardwareEClass, Hardware.class, "Hardware", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHardware_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, Hardware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(memoryEClass, Memory.class, "Memory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemory_Capacity(), this.getSize(), null, "capacity", null, 1, 1, Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMemory_Latency(), this.getLatency(), null, "latency", null, 1, -1, Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getMemory__Capacity_Must_Be_Greater_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "capacity_Must_Be_Greater_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sizeEClass, Size.class, "Size", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSize_Value(), theTypesPackage.getReal(), "value", "1.0", 1, 1, Size.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSize_Unit(), this.getSizeUnit(), "unit", "MByte", 1, 1, Size.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(latencyEClass, Latency.class, "Latency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLatency_Name(), theTypesPackage.getString(), "name", "read", 1, 1, Latency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLatency_Time(), this.getTime(), null, "time", null, 1, 1, Latency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(timeEClass, Time.class, "Time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTime_Value(), theTypesPackage.getReal(), "value", "5.0", 1, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTime_Unit(), this.getTimeUnit(), "unit", "h", 1, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(storageEClass, Storage.class, "Storage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStorage_NumberOfDrives(), theTypesPackage.getInteger(), "numberOfDrives", "1", 1, 1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStorage_DriveCapacity(), this.getSize(), null, "driveCapacity", null, 1, 1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStorage_ReadBandwidth(), this.getBandwidth(), null, "readBandwidth", null, 1, 1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStorage_WriteBandwidth(), this.getBandwidth(), null, "writeBandwidth", null, 1, 1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getStorage__NumberOfDrives_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "numberOfDrives_Must_Be_Greatter_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStorage__DriveCapacity_Must_Be_Greater_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "driveCapacity_Must_Be_Greater_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStorage__ReadBandwidth_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "readBandwidth_Must_Be_Greatter_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStorage__WriteBandwidth_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "writeBandwidth_Must_Be_Greatter_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(computingRackEClass, ComputingRack.class, "ComputingRack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComputingRack_MachineType(), this.getComputingMachine(), null, "machineType", null, 1, 1, ComputingRack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(computingMachineEClass, ComputingMachine.class, "ComputingMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComputingMachine_Type(), this.getMachineType(), "type", null, 1, 1, ComputingMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(storageRackEClass, StorageRack.class, "StorageRack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStorageRack_MachineType(), this.getStorageMachine(), null, "machineType", null, 1, 1, StorageRack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(storageMachineEClass, StorageMachine.class, "StorageMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cloudProviderEClass, CloudProvider.class, "CloudProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloudProvider_ResourceAllocationPolicy(), theTypesPackage.getString(), "resourceAllocationPolicy", "_firstFist_cost", 1, 1, CloudProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCloudProvider_Base_Lifeline(), theUMLPackage.getLifeline(), null, "base_Lifeline", null, 1, 1, CloudProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCloudProvider_Sla(), this.getSLA(), null, "sla", null, 1, -1, CloudProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCloudProvider_Offer(), theTypesPackage.getReal(), "offer", "0.0", 1, 1, CloudProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getCloudProvider__CloudProvider_Must_Offer_Once_Each_VM_For_Each_SLA_Type__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "CloudProvider_Must_Offer_Once_Each_VM_For_Each_SLA_Type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(slaEClass, es.uclm.uml2cloud.profile.uml2cloudprofile.SLA.class, "SLA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSLA_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 0, 1, es.uclm.uml2cloud.profile.uml2cloudprofile.SLA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSLA_Vmcost(), this.getVMCost(), null, "vmcost", null, 1, -1, es.uclm.uml2cloud.profile.uml2cloudprofile.SLA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(vmCostEClass, VMCost.class, "VMCost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVMCost_Base(), this.getCost(), null, "base", null, 1, 1, VMCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVMCost_Incpriority(), theTypesPackage.getReal(), "incpriority", null, 1, 1, VMCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVMCost_Discount(), theTypesPackage.getReal(), "discount", null, 1, 1, VMCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVMCost_Compensation(), theTypesPackage.getReal(), "compensation", null, 1, 1, VMCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVMCost_Vm(), this.getVM(), null, "vm", null, 1, 1, VMCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(costEClass, Cost.class, "Cost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCost_Value(), theTypesPackage.getReal(), "value", "1.0", 1, 1, Cost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCost_Rate(), this.getTimeUnit(), "rate", null, 1, 1, Cost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(vmEClass, es.uclm.uml2cloud.profile.uml2cloudprofile.VM.class, "VM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVM_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, es.uclm.uml2cloud.profile.uml2cloudprofile.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVM_Cores(), theTypesPackage.getInteger(), "cores", "2", 1, 1, es.uclm.uml2cloud.profile.uml2cloudprofile.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVM_Disk(), this.getSize(), null, "disk", null, 1, 1, es.uclm.uml2cloud.profile.uml2cloudprofile.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVM_ComputingUnits(), theTypesPackage.getReal(), "computingUnits", "2.0", 1, 1, es.uclm.uml2cloud.profile.uml2cloudprofile.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVM_Memory(), this.getSize(), null, "memory", null, 1, 1, es.uclm.uml2cloud.profile.uml2cloudprofile.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getVM__Cores_Must_Be_Greater_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "cores_Must_Be_Greater_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVM__ComputingUnits_Must_Be_Greater_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "computingUnits_Must_Be_Greater_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVM__Memory_Must_Be_Greater_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "memory_Must_Be_Greater_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVM__VM_can_not_be_allocated__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "VM_can_not_be_allocated", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVM__Disk_Must_Be_Greater_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "disk_Must_Be_Greater_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplication_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getApplication_MIs(), theTypesPackage.getInteger(), "MIs", "10000", 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getApplication_InputData(), this.getSize(), null, "inputData", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getApplication_OutputData(), this.getSize(), null, "outputData", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getApplication_Parameter(), this.getParameter(), null, "parameter", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getApplication__MIs_Must_Be_Greater_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "MIs_Must_Be_Greater_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApplication__InputData_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "inputData_Must_Be_Greater_Than_Or_Equal_To_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApplication__OutputData_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "outputData_Must_Be_Greater_Than_Or_Equal_To_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), theTypesPackage.getString(), "name", "inputFile", 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParameter_Value(), theTypesPackage.getString(), "value", "/inputFile_0.dat", 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParameter_Type(), theTypesPackage.getString(), "type", "string", 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParameter_Description(), theTypesPackage.getString(), "description", " ", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(requestEClass, Request.class, "Request", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequest_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 1, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRequest_VmInstantiation(), this.getVMInstantiation(), null, "vmInstantiation", null, 1, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRequest__RentingTime_Must_Be_Greater_Than__Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "rentingTime_Must_Be_Greater_Than__Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRequest__Instances_Must_Be_Greater_Than__Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "instances_Must_Be_Greater_Than__Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRequest__Request_Must_Be_Sent_To_A_CloudProvider__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Request_Must_Be_Sent_To_A_CloudProvider", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRequest__Request_Must_Be_Sent_By_A_User__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Request_Must_Be_Sent_By_A_User", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRequest__Request_For_A_VM_Not_Offered_In_The_Signed_SLA_By_The_User__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Request_For_A_VM_Not_Offered_In_The_Signed_SLA_By_The_User", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vmInstantiationEClass, VMInstantiation.class, "VMInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVMInstantiation_Instances(), theTypesPackage.getInteger(), "instances", "1", 1, 1, VMInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVMInstantiation_VmType(), this.getVM(), null, "vmType", null, 1, 1, VMInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVMInstantiation_RentingTime(), this.getTime(), null, "rentingTime", null, 1, 1, VMInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subscribeEClass, Subscribe.class, "Subscribe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubscribe_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 1, 1, Subscribe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubscribe_MaxTime(), this.getTime(), null, "maxTime", null, 1, 1, Subscribe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getSubscribe__MaxTime_Must_Be_Greater_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "maxTime_Must_Be_Greater_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSubscribe__Subscribe_Must_Be_Sent_To_A_CloudProvider__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Subscribe_Must_Be_Sent_To_A_CloudProvider", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSubscribe__Subscribe_Must_Be_Sent_By_A_User__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Subscribe_Must_Be_Sent_By_A_User", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(appInstantiationEClass, AppInstantiation.class, "AppInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAppInstantiation_ApplicationType(), this.getApplication(), null, "applicationType", null, 1, 1, AppInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAppInstantiation_Instances(), theTypesPackage.getInteger(), "instances", "1", 1, 1, AppInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(executeEClass, Execute.class, "Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecute_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 1, 1, Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExecute_AppInstantiation(), this.getAppInstantiation(), null, "appInstantiation", null, 1, -1, Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getExecute__Instances_Must_Be_Greater_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "instances_Must_Be_Greater_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExecute__Execute_Must_Be_Sent_To_A_CloudProvider__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Execute_Must_Be_Sent_To_A_CloudProvider", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExecute__Execute_Must_Be_Sent_By_A_User__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "Execute_Must_Be_Sent_By_A_User", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(userEClass, User.class, "User", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUser_Base_Lifeline(), theUMLPackage.getLifeline(), null, "base_Lifeline", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUser_Instances(), theTypesPackage.getInteger(), "instances", "1", 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUser_Sla(), this.getSLA(), null, "sla", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getUser__User_Must_Have_A_Execute_Message__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "User_Must_Have_A_Execute_Message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUser__User_Must_Have_A_Request_Message__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "User_Must_Have_A_Request_Message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUser__User_Must_Sign_A_VM_SLA_Offered_By_The_CloudProvider__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "User_Must_Sign_A_VM_SLA_Offered_By_The_CloudProvider", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUser__User_Must_Have_A_Resume_Message__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "User_Must_Have_A_Resume_Message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cloudInfrastructureEClass, CloudInfrastructure.class, "CloudInfrastructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCloudInfrastructure_DatacenterElements(), this.getDataCenterElement(), null, "datacenterElements", null, 1, -1, CloudInfrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCloudInfrastructure_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, CloudInfrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCloudInfrastructure_Network(), this.getBandwidth(), null, "network", null, 1, 1, CloudInfrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getCloudInfrastructure__DatacenterElements_instances_Must_Be_Greatter_Than_Or_Equal_To_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "datacenterElements_instances_Must_Be_Greatter_Than_Or_Equal_To_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCloudInfrastructure__DatacenterElements_instances_Should_Be_Greatter_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "datacenterElements_instances_Should_Be_Greatter_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataCenterElementEClass, DataCenterElement.class, "DataCenterElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataCenterElement_NumberOfDataCenters(), theTypesPackage.getInteger(), "numberOfDataCenters", "1", 1, 1, DataCenterElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataCenterElement_DataCenterType(), this.getDataCenter(), null, "dataCenterType", null, 1, 1, DataCenterElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(priorityUserEClass, PriorityUser.class, "PriorityUser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(regularUserEClass, RegularUser.class, "RegularUser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getRegularUser__RegularUser_Must_Have_A_Subscribe_Message__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "RegularUser_Must_Have_A_Subscribe_Message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resumeEClass, Resume.class, "Resume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResume_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, Resume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResume_ResumeTime(), this.getTime(), null, "resumeTime", null, 1, 1, Resume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(responseOfferedVMsEClass, ResponseOfferedVMs.class, "ResponseOfferedVMs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResponseOfferedVMs_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, ResponseOfferedVMs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(okEClass, Ok.class, "Ok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOk_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, Ok.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(timeoutRentingEClass, TimeoutRenting.class, "TimeoutRenting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeoutRenting_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, TimeoutRenting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(notifyEClass, Notify.class, "Notify", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotify_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, Notify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(timeoutSubscriptionEClass, TimeoutSubscription.class, "TimeoutSubscription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeoutSubscription_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, TimeoutSubscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(requestOfferedVMsEClass, RequestOfferedVMs.class, "RequestOfferedVMs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequestOfferedVMs_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, RequestOfferedVMs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(responseEClass, Response.class, "Response", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResponse_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(bandwidthUnitEEnum, BandwidthUnit.class, "BandwidthUnit");
		addEEnumLiteral(bandwidthUnitEEnum, BandwidthUnit.KBPS);
		addEEnumLiteral(bandwidthUnitEEnum, BandwidthUnit.MBPS);
		addEEnumLiteral(bandwidthUnitEEnum, BandwidthUnit.GBPS);

		initEEnum(sizeUnitEEnum, SizeUnit.class, "SizeUnit");
		addEEnumLiteral(sizeUnitEEnum, SizeUnit.KBYTE);
		addEEnumLiteral(sizeUnitEEnum, SizeUnit.MBYTE);
		addEEnumLiteral(sizeUnitEEnum, SizeUnit.GBYTE);
		addEEnumLiteral(sizeUnitEEnum, SizeUnit.TBYTE);

		initEEnum(timeUnitEEnum, TimeUnit.class, "TimeUnit");
		addEEnumLiteral(timeUnitEEnum, TimeUnit.H);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.MIN);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.S);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.MS);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.US);

		initEEnum(machineTypeEEnum, MachineType.class, "MachineType");
		addEEnumLiteral(machineTypeEEnum, MachineType.NORMAL);
		addEEnumLiteral(machineTypeEEnum, MachineType.RESERVED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "originalName", "uml2cloud"
		   });
		addAnnotation
		  (getVMCost_Incpriority(),
		   source,
		   new String[] {
			   "originalName", "inc-priority"
		   });
	}

} //UML2CloudProfilePackageImpl
