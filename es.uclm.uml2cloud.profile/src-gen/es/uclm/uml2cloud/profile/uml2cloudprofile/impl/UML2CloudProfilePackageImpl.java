/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile.impl;

import es.uclm.uml2cloud.profile.uml2cloudprofile.AppInstantiation;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Application;
import es.uclm.uml2cloud.profile.uml2cloudprofile.CPUScheduler;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Channel;
import es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProvider;
import es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProviderType;
import es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenter;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Disk;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Execute;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Hardware;
import es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Memory;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Node;
import es.uclm.uml2cloud.profile.uml2cloudprofile.NodeCmp;
import es.uclm.uml2cloud.profile.uml2cloudprofile.NodeSto;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Notify;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Rack;
import es.uclm.uml2cloud.profile.uml2cloudprofile.RackCmp;
import es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement;
import es.uclm.uml2cloud.profile.uml2cloudprofile.RackSto;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Reject;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Repository;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Request;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Response;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Scenario;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Subscribe;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Timeout;
import es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfileFactory;
import es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage;
import es.uclm.uml2cloud.profile.uml2cloudprofile.User;
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
	private EClass nodeEClass = null;

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
	private EClass diskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rackCmpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeCmpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rackStoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeStoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryEClass = null;

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
	private EClass vmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localApplicationEClass = null;

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
	private EClass cloudProviderEClass = null;

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
	private EClass subscribeEClass = null;

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
	private EClass appInstantiationEClass = null;

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
	private EClass notifyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeoutEClass = null;

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
	private EClass rejectEClass = null;

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
	private EEnum channelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cpuSchedulerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cloudProviderTypeEEnum = null;

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
		UML2CloudProfilePackageImpl theUML2CloudProfilePackage = (UML2CloudProfilePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UML2CloudProfilePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UML2CloudProfilePackageImpl());

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
	public EClass getDataCenter() {
		return dataCenterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataCenter_Base_Component() {
		return (EReference)dataCenterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCenter_Network() {
		return (EAttribute)dataCenterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataCenter_RackElements() {
		return (EReference)dataCenterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataCenter__RackElements_instances_Should_Be_Greatter_Than_Zero__DiagnosticChain_Map() {
		return dataCenterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataCenter__RackElements_instances_Must_Be_Greatter_Than_Or_Equal_To_Zero__DiagnosticChain_Map() {
		return dataCenterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRackElement() {
		return rackElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRackElement_Instances() {
		return (EAttribute)rackElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRackElement_Rack() {
		return (EReference)rackElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRackElement_DataCenter() {
		return (EReference)rackElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRack() {
		return rackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRack_Base_Component() {
		return (EReference)rackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRack_NodesPerBoard() {
		return (EAttribute)rackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRack_CommLink() {
		return (EAttribute)rackEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRack_Boards() {
		return (EAttribute)rackEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRack__Boards_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map() {
		return rackEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRack__NodesPerBoard_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map() {
		return rackEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Base_Component() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_CpuScheduler() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Cpu() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Memory() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Storage() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCPU() {
		return cpuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCPU_NumberOfCores() {
		return (EAttribute)cpuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCPU_SpeedMIPS() {
		return (EAttribute)cpuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCPU_TickS() {
		return (EAttribute)cpuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCPU__SpeedMIPS_Must_Be_Greater_Than_Zero__DiagnosticChain_Map() {
		return cpuEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCPU__TickS_Must_Be_Greater_Than_Zero__DiagnosticChain_Map() {
		return cpuEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCPU__NumberOfCores_Must_Be_Greater_Than_Zero__DiagnosticChain_Map() {
		return cpuEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardware() {
		return hardwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardware_Base_Component() {
		return (EReference)hardwareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemory() {
		return memoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemory_SizeGB() {
		return (EAttribute)memoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemory_ReadLatencyUS() {
		return (EAttribute)memoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemory_WriteLatencyUS() {
		return (EAttribute)memoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMemory__SizeGB_Must_Be_Greater_Than_Zero__DiagnosticChain_Map() {
		return memoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMemory__ReadLatencyUS_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map() {
		return memoryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMemory__WriteLatencyUS_Must_Be_Greatter_Than_Or_Equal_To_Zero__DiagnosticChain_Map() {
		return memoryEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisk() {
		return diskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisk_NumberOfDisks() {
		return (EAttribute)diskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisk_ReadBandwidthMBps() {
		return (EAttribute)diskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisk_WriteBandwidthMBps() {
		return (EAttribute)diskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisk_SizePerDeviceGB() {
		return (EAttribute)diskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDisk__NumberOfDisks_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map() {
		return diskEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDisk__ReadBandwidthMBps_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map() {
		return diskEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDisk__WriteBandwidthMBps_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map() {
		return diskEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDisk__SizePerDeviceGB_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map() {
		return diskEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRackCmp() {
		return rackCmpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRackCmp_NodeCmpType() {
		return (EReference)rackCmpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeCmp() {
		return nodeCmpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRackSto() {
		return rackStoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRackSto_NodeStoType() {
		return (EReference)rackStoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeSto() {
		return nodeStoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenario() {
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Base_Package() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_CloudProvider() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepository() {
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_Base_Package() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_Base_Component() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVM() {
		return vmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVM_Base_Component() {
		return (EReference)vmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVM_NumberOfCores() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVM_DiskGB() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVM_CostPerHour() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVM_SCU() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVM_MemoryGB() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVM__NumberOfCores_Must_Be_Greater_Than_Zero__DiagnosticChain_Map() {
		return vmEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVM__DiskGB_Must_Be_Greater_Than_Zero__DiagnosticChain_Map() {
		return vmEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVM__CostPerHour_Must_Be_Greater_Than_Or_Equeal_To_Zero__DiagnosticChain_Map() {
		return vmEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVM__SCU_Must_Be_Greater_Than_Zero__DiagnosticChain_Map() {
		return vmEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVM__Memory_Must_Be_Greater_Than_Zero__DiagnosticChain_Map() {
		return vmEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalApplication() {
		return localApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalApplication_InputDataSizeMiB() {
		return (EAttribute)localApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalApplication_OutputDataSizeMiB() {
		return (EAttribute)localApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalApplication_InputFile() {
		return (EAttribute)localApplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalApplication_OutputFile() {
		return (EAttribute)localApplicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalApplication_MIs() {
		return (EAttribute)localApplicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalApplication_Iterations() {
		return (EAttribute)localApplicationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocalApplication__InputDataSizeMiB_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map() {
		return localApplicationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocalApplication__OutputDataSizeMiB_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map() {
		return localApplicationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocalApplication__MIs_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map() {
		return localApplicationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocalApplication__Iterations_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map() {
		return localApplicationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Base_Lifeline() {
		return (EReference)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudProvider() {
		return cloudProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudProvider_Base_Lifeline() {
		return (EReference)cloudProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequest() {
		return requestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequest_Base_Message() {
		return (EReference)requestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_RentingTime() {
		return (EAttribute)requestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequest__T1_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map() {
		return requestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequest__T2_Must_Be_Greater_Than_Zero__DiagnosticChain_Map() {
		return requestEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubscribe() {
		return subscribeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscribe_Base_Message() {
		return (EReference)subscribeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscribe_MaxSubTime() {
		return (EAttribute)subscribeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubscribe__T4_Must_Be_Greater_Than_Zero__DiagnosticChain_Map() {
		return subscribeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubscribe__T4_Should_Be_Greater_Than_Or_Equal_To_t1_From_Connect_If_You_Want_To_Subscribe__DiagnosticChain_Map() {
		return subscribeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVMInstantiation() {
		return vmInstantiationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVMInstantiation_Instances() {
		return (EAttribute)vmInstantiationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVMInstantiation_VmType() {
		return (EReference)vmInstantiationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppInstantiation() {
		return appInstantiationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppInstantiation_ApplicationType() {
		return (EReference)appInstantiationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppInstantiation_Instances() {
		return (EAttribute)appInstantiationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOK() {
		return okEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOK_Base_Message() {
		return (EReference)okEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotify() {
		return notifyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotify_Base_Message() {
		return (EReference)notifyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeout() {
		return timeoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeout_Base_Message() {
		return (EReference)timeoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponse() {
		return responseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponse_Base_Message() {
		return (EReference)responseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReject() {
		return rejectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReject_Base_Message() {
		return (EReference)rejectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecute() {
		return executeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecute_Base_Message() {
		return (EReference)executeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecute_AppInstantiation() {
		return (EReference)executeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChannel() {
		return channelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCPUScheduler() {
		return cpuSchedulerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCloudProviderType() {
		return cloudProviderTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
		createEReference(dataCenterEClass, DATA_CENTER__BASE_COMPONENT);
		createEAttribute(dataCenterEClass, DATA_CENTER__NETWORK);
		createEReference(dataCenterEClass, DATA_CENTER__RACK_ELEMENTS);
		createEOperation(dataCenterEClass, DATA_CENTER___RACK_ELEMENTS_INSTANCES_SHOULD_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(dataCenterEClass, DATA_CENTER___RACK_ELEMENTS_INSTANCES_MUST_BE_GREATTER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP);

		rackElementEClass = createEClass(RACK_ELEMENT);
		createEAttribute(rackElementEClass, RACK_ELEMENT__INSTANCES);
		createEReference(rackElementEClass, RACK_ELEMENT__RACK);
		createEReference(rackElementEClass, RACK_ELEMENT__DATA_CENTER);

		rackEClass = createEClass(RACK);
		createEReference(rackEClass, RACK__BASE_COMPONENT);
		createEAttribute(rackEClass, RACK__NODES_PER_BOARD);
		createEAttribute(rackEClass, RACK__COMM_LINK);
		createEAttribute(rackEClass, RACK__BOARDS);
		createEOperation(rackEClass, RACK___BOARDS_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(rackEClass, RACK___NODES_PER_BOARD_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__BASE_COMPONENT);
		createEAttribute(nodeEClass, NODE__CPU_SCHEDULER);
		createEReference(nodeEClass, NODE__CPU);
		createEReference(nodeEClass, NODE__MEMORY);
		createEReference(nodeEClass, NODE__STORAGE);

		cpuEClass = createEClass(CPU);
		createEAttribute(cpuEClass, CPU__NUMBER_OF_CORES);
		createEAttribute(cpuEClass, CPU__SPEED_MIPS);
		createEAttribute(cpuEClass, CPU__TICK_S);
		createEOperation(cpuEClass, CPU___SPEED_MIPS_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(cpuEClass, CPU___TICK_SMUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(cpuEClass, CPU___NUMBER_OF_CORES_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);

		hardwareEClass = createEClass(HARDWARE);
		createEReference(hardwareEClass, HARDWARE__BASE_COMPONENT);

		memoryEClass = createEClass(MEMORY);
		createEAttribute(memoryEClass, MEMORY__SIZE_GB);
		createEAttribute(memoryEClass, MEMORY__READ_LATENCY_US);
		createEAttribute(memoryEClass, MEMORY__WRITE_LATENCY_US);
		createEOperation(memoryEClass, MEMORY___SIZE_GB_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(memoryEClass, MEMORY___READ_LATENCY_US_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(memoryEClass, MEMORY___WRITE_LATENCY_US_MUST_BE_GREATTER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP);

		diskEClass = createEClass(DISK);
		createEAttribute(diskEClass, DISK__NUMBER_OF_DISKS);
		createEAttribute(diskEClass, DISK__READ_BANDWIDTH_MBPS);
		createEAttribute(diskEClass, DISK__WRITE_BANDWIDTH_MBPS);
		createEAttribute(diskEClass, DISK__SIZE_PER_DEVICE_GB);
		createEOperation(diskEClass, DISK___NUMBER_OF_DISKS_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(diskEClass, DISK___READ_BANDWIDTH_MBPS_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(diskEClass, DISK___WRITE_BANDWIDTH_MBPS_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(diskEClass, DISK___SIZE_PER_DEVICE_GB_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);

		rackCmpEClass = createEClass(RACK_CMP);
		createEReference(rackCmpEClass, RACK_CMP__NODE_CMP_TYPE);

		nodeCmpEClass = createEClass(NODE_CMP);

		rackStoEClass = createEClass(RACK_STO);
		createEReference(rackStoEClass, RACK_STO__NODE_STO_TYPE);

		nodeStoEClass = createEClass(NODE_STO);

		scenarioEClass = createEClass(SCENARIO);
		createEReference(scenarioEClass, SCENARIO__BASE_PACKAGE);
		createEAttribute(scenarioEClass, SCENARIO__CLOUD_PROVIDER);

		repositoryEClass = createEClass(REPOSITORY);
		createEReference(repositoryEClass, REPOSITORY__BASE_PACKAGE);

		applicationEClass = createEClass(APPLICATION);
		createEReference(applicationEClass, APPLICATION__BASE_COMPONENT);

		vmEClass = createEClass(VM);
		createEReference(vmEClass, VM__BASE_COMPONENT);
		createEAttribute(vmEClass, VM__NUMBER_OF_CORES);
		createEAttribute(vmEClass, VM__DISK_GB);
		createEAttribute(vmEClass, VM__COST_PER_HOUR);
		createEAttribute(vmEClass, VM__SCU);
		createEAttribute(vmEClass, VM__MEMORY_GB);
		createEOperation(vmEClass, VM___NUMBER_OF_CORES_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(vmEClass, VM___DISK_GB_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(vmEClass, VM___COST_PER_HOUR_MUST_BE_GREATER_THAN_OR_EQUEAL_TO_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(vmEClass, VM___SCU_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(vmEClass, VM___MEMORY_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);

		localApplicationEClass = createEClass(LOCAL_APPLICATION);
		createEAttribute(localApplicationEClass, LOCAL_APPLICATION__INPUT_DATA_SIZE_MI_B);
		createEAttribute(localApplicationEClass, LOCAL_APPLICATION__OUTPUT_DATA_SIZE_MI_B);
		createEAttribute(localApplicationEClass, LOCAL_APPLICATION__INPUT_FILE);
		createEAttribute(localApplicationEClass, LOCAL_APPLICATION__OUTPUT_FILE);
		createEAttribute(localApplicationEClass, LOCAL_APPLICATION__MIS);
		createEAttribute(localApplicationEClass, LOCAL_APPLICATION__ITERATIONS);
		createEOperation(localApplicationEClass, LOCAL_APPLICATION___INPUT_DATA_SIZE_MI_BMUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(localApplicationEClass, LOCAL_APPLICATION___OUTPUT_DATA_SIZE_MI_BMUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(localApplicationEClass, LOCAL_APPLICATION___MIS_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(localApplicationEClass, LOCAL_APPLICATION___ITERATIONS_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP);

		userEClass = createEClass(USER);
		createEReference(userEClass, USER__BASE_LIFELINE);

		cloudProviderEClass = createEClass(CLOUD_PROVIDER);
		createEReference(cloudProviderEClass, CLOUD_PROVIDER__BASE_LIFELINE);

		requestEClass = createEClass(REQUEST);
		createEReference(requestEClass, REQUEST__BASE_MESSAGE);
		createEAttribute(requestEClass, REQUEST__RENTING_TIME);
		createEOperation(requestEClass, REQUEST___T1_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(requestEClass, REQUEST___T2_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);

		subscribeEClass = createEClass(SUBSCRIBE);
		createEReference(subscribeEClass, SUBSCRIBE__BASE_MESSAGE);
		createEAttribute(subscribeEClass, SUBSCRIBE__MAX_SUB_TIME);
		createEOperation(subscribeEClass, SUBSCRIBE___T4_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP);
		createEOperation(subscribeEClass, SUBSCRIBE___T4_SHOULD_BE_GREATER_THAN_OR_EQUAL_TO_T1_FROM_CONNECT_IF_YOU_WANT_TO_SUBSCRIBE__DIAGNOSTICCHAIN_MAP);

		vmInstantiationEClass = createEClass(VM_INSTANTIATION);
		createEAttribute(vmInstantiationEClass, VM_INSTANTIATION__INSTANCES);
		createEReference(vmInstantiationEClass, VM_INSTANTIATION__VM_TYPE);

		appInstantiationEClass = createEClass(APP_INSTANTIATION);
		createEReference(appInstantiationEClass, APP_INSTANTIATION__APPLICATION_TYPE);
		createEAttribute(appInstantiationEClass, APP_INSTANTIATION__INSTANCES);

		okEClass = createEClass(OK);
		createEReference(okEClass, OK__BASE_MESSAGE);

		notifyEClass = createEClass(NOTIFY);
		createEReference(notifyEClass, NOTIFY__BASE_MESSAGE);

		timeoutEClass = createEClass(TIMEOUT);
		createEReference(timeoutEClass, TIMEOUT__BASE_MESSAGE);

		responseEClass = createEClass(RESPONSE);
		createEReference(responseEClass, RESPONSE__BASE_MESSAGE);

		rejectEClass = createEClass(REJECT);
		createEReference(rejectEClass, REJECT__BASE_MESSAGE);

		executeEClass = createEClass(EXECUTE);
		createEReference(executeEClass, EXECUTE__BASE_MESSAGE);
		createEReference(executeEClass, EXECUTE__APP_INSTANTIATION);

		// Create enums
		channelEEnum = createEEnum(CHANNEL);
		cpuSchedulerEEnum = createEEnum(CPU_SCHEDULER);
		cloudProviderTypeEEnum = createEEnum(CLOUD_PROVIDER_TYPE);
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
		diskEClass.getESuperTypes().add(this.getHardware());
		rackCmpEClass.getESuperTypes().add(this.getRack());
		nodeCmpEClass.getESuperTypes().add(this.getNode());
		rackStoEClass.getESuperTypes().add(this.getRack());
		nodeStoEClass.getESuperTypes().add(this.getNode());
		localApplicationEClass.getESuperTypes().add(this.getApplication());

		// Initialize classes, features, and operations; add parameters
		initEClass(dataCenterEClass, DataCenter.class, "DataCenter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataCenter_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, DataCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataCenter_Network(), this.getChannel(), "network", "Ethernet40Gbps", 1, 1, DataCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataCenter_RackElements(), this.getRackElement(), this.getRackElement_DataCenter(), "rackElements", null, 1, -1, DataCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

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

		initEClass(rackElementEClass, RackElement.class, "RackElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRackElement_Instances(), theTypesPackage.getInteger(), "instances", null, 1, 1, RackElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRackElement_Rack(), this.getRack(), null, "rack", null, 1, 1, RackElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRackElement_DataCenter(), this.getDataCenter(), this.getDataCenter_RackElements(), "dataCenter", null, 1, 1, RackElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rackEClass, Rack.class, "Rack", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRack_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, Rack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRack_NodesPerBoard(), theTypesPackage.getInteger(), "nodesPerBoard", "8", 1, 1, Rack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRack_CommLink(), this.getChannel(), "commLink", "Ethernet40Gbps", 1, 1, Rack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRack_Boards(), theTypesPackage.getInteger(), "boards", "8", 1, 1, Rack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRack__Boards_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "boards_Must_Be_Greatter_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRack__NodesPerBoard_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nodesPerBoard_Must_Be_Greatter_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNode_CpuScheduler(), this.getCPUScheduler(), "cpuScheduler", "FIFO", 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNode_Cpu(), this.getCPU(), null, "cpu", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNode_Memory(), this.getMemory(), null, "memory", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNode_Storage(), this.getDisk(), null, "storage", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cpuEClass, es.uclm.uml2cloud.profile.uml2cloudprofile.CPU.class, "CPU", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCPU_NumberOfCores(), theTypesPackage.getInteger(), "numberOfCores", "2", 1, 1, es.uclm.uml2cloud.profile.uml2cloudprofile.CPU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCPU_SpeedMIPS(), theTypesPackage.getInteger(), "speedMIPS", "30000", 1, 1, es.uclm.uml2cloud.profile.uml2cloudprofile.CPU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCPU_TickS(), theTypesPackage.getReal(), "tickS", "0.01", 1, 1, es.uclm.uml2cloud.profile.uml2cloudprofile.CPU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getCPU__SpeedMIPS_Must_Be_Greater_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "speedMIPS_Must_Be_Greater_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCPU__TickS_Must_Be_Greater_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "tickS_Must_Be_Greater_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCPU__NumberOfCores_Must_Be_Greater_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "numberOfCores_Must_Be_Greater_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
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
		initEAttribute(getMemory_SizeGB(), theTypesPackage.getReal(), "sizeGB", "4.0", 1, 1, Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMemory_ReadLatencyUS(), theTypesPackage.getInteger(), "readLatencyUS", "5", 1, 1, Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMemory_WriteLatencyUS(), theTypesPackage.getInteger(), "writeLatencyUS", "5", 1, 1, Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getMemory__SizeGB_Must_Be_Greater_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sizeGB_Must_Be_Greater_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMemory__ReadLatencyUS_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "readLatencyUS_Must_Be_Greater_Than_Or_Equal_To_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMemory__WriteLatencyUS_Must_Be_Greatter_Than_Or_Equal_To_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "writeLatencyUS_Must_Be_Greatter_Than_Or_Equal_To_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(diskEClass, Disk.class, "Disk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisk_NumberOfDisks(), theTypesPackage.getInteger(), "numberOfDisks", "1", 1, 1, Disk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDisk_ReadBandwidthMBps(), theTypesPackage.getReal(), "readBandwidthMBps", "500.0", 1, 1, Disk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDisk_WriteBandwidthMBps(), theTypesPackage.getReal(), "writeBandwidthMBps", "350.0", 1, 1, Disk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDisk_SizePerDeviceGB(), theTypesPackage.getInteger(), "sizePerDeviceGB", "1000", 1, 1, Disk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getDisk__NumberOfDisks_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "numberOfDisks_Must_Be_Greatter_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDisk__ReadBandwidthMBps_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "readBandwidthMBps_Must_Be_Greatter_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDisk__WriteBandwidthMBps_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "writeBandwidthMBps_Must_Be_Greatter_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDisk__SizePerDeviceGB_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sizePerDeviceGB_Must_Be_Greatter_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rackCmpEClass, RackCmp.class, "RackCmp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRackCmp_NodeCmpType(), this.getNodeCmp(), null, "nodeCmpType", null, 1, 1, RackCmp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nodeCmpEClass, NodeCmp.class, "NodeCmp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rackStoEClass, RackSto.class, "RackSto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRackSto_NodeStoType(), this.getNodeSto(), null, "nodeStoType", null, 1, 1, RackSto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nodeStoEClass, NodeSto.class, "NodeSto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenario_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 1, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getScenario_CloudProvider(), this.getCloudProviderType(), "cloudProvider", "CloudProviderFirstFit", 1, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepository_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 1, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(applicationEClass, Application.class, "Application", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplication_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(vmEClass, es.uclm.uml2cloud.profile.uml2cloudprofile.VM.class, "VM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVM_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, es.uclm.uml2cloud.profile.uml2cloudprofile.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVM_NumberOfCores(), theTypesPackage.getInteger(), "numberOfCores", "2", 1, 1, es.uclm.uml2cloud.profile.uml2cloudprofile.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVM_DiskGB(), theTypesPackage.getReal(), "diskGB", "500.0", 1, 1, es.uclm.uml2cloud.profile.uml2cloudprofile.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVM_CostPerHour(), theTypesPackage.getReal(), "costPerHour", "15.0", 1, 1, es.uclm.uml2cloud.profile.uml2cloudprofile.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVM_SCU(), theTypesPackage.getReal(), "SCU", "2.0", 1, 1, es.uclm.uml2cloud.profile.uml2cloudprofile.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVM_MemoryGB(), theTypesPackage.getReal(), "memoryGB", "4.0", 1, 1, es.uclm.uml2cloud.profile.uml2cloudprofile.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getVM__NumberOfCores_Must_Be_Greater_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "numberOfCores_Must_Be_Greater_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVM__DiskGB_Must_Be_Greater_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "diskGB_Must_Be_Greater_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVM__CostPerHour_Must_Be_Greater_Than_Or_Equeal_To_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "costPerHour_Must_Be_Greater_Than_Or_Equeal_To_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVM__SCU_Must_Be_Greater_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "SCU_Must_Be_Greater_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
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

		initEClass(localApplicationEClass, LocalApplication.class, "LocalApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalApplication_InputDataSizeMiB(), theTypesPackage.getInteger(), "inputDataSizeMiB", "10", 1, 1, LocalApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocalApplication_OutputDataSizeMiB(), theTypesPackage.getInteger(), "outputDataSizeMiB", "5", 1, 1, LocalApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocalApplication_InputFile(), theTypesPackage.getString(), "inputFile", "/inputFile_0.dat", 1, 1, LocalApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocalApplication_OutputFile(), theTypesPackage.getString(), "outputFile", "/outputFile_0.dat", 1, 1, LocalApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocalApplication_MIs(), theTypesPackage.getInteger(), "MIs", "10000", 1, 1, LocalApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocalApplication_Iterations(), theTypesPackage.getInteger(), "iterations", "25", 1, 1, LocalApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getLocalApplication__InputDataSizeMiB_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "inputDataSizeMiB_Must_Be_Greater_Than_Or_Equal_To_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLocalApplication__OutputDataSizeMiB_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "outputDataSizeMiB_Must_Be_Greater_Than_Or_Equal_To_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLocalApplication__MIs_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "MIs_Must_Be_Greater_Than_Or_Equal_To_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLocalApplication__Iterations_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "iterations_Must_Be_Greater_Than_Or_Equal_To_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUser_Base_Lifeline(), theUMLPackage.getLifeline(), null, "base_Lifeline", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cloudProviderEClass, CloudProvider.class, "CloudProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCloudProvider_Base_Lifeline(), theUMLPackage.getLifeline(), null, "base_Lifeline", null, 1, 1, CloudProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(requestEClass, Request.class, "Request", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequest_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 1, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRequest_RentingTime(), theTypesPackage.getReal(), "rentingTime", null, 1, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRequest__T1_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "t1_Must_Be_Greater_Than_Or_Equal_To_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRequest__T2_Must_Be_Greater_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "t2_Must_Be_Greater_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(subscribeEClass, Subscribe.class, "Subscribe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubscribe_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 1, 1, Subscribe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubscribe_MaxSubTime(), theTypesPackage.getReal(), "maxSubTime", "0.0", 1, 1, Subscribe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getSubscribe__T4_Must_Be_Greater_Than_Zero__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "t4_Must_Be_Greater_Than_Zero", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSubscribe__T4_Should_Be_Greater_Than_Or_Equal_To_t1_From_Connect_If_You_Want_To_Subscribe__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "t4_Should_Be_Greater_Than_Or_Equal_To_t1_From_Connect_If_You_Want_To_Subscribe", 0, 1, IS_UNIQUE, IS_ORDERED);
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

		initEClass(appInstantiationEClass, AppInstantiation.class, "AppInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAppInstantiation_ApplicationType(), this.getApplication(), null, "applicationType", null, 1, 1, AppInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAppInstantiation_Instances(), theTypesPackage.getInteger(), "instances", null, 1, 1, AppInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(okEClass, es.uclm.uml2cloud.profile.uml2cloudprofile.OK.class, "OK", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOK_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 1, 1, es.uclm.uml2cloud.profile.uml2cloudprofile.OK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(notifyEClass, Notify.class, "Notify", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotify_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 1, 1, Notify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(timeoutEClass, Timeout.class, "Timeout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeout_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 1, 1, Timeout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(responseEClass, Response.class, "Response", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResponse_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 1, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rejectEClass, Reject.class, "Reject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReject_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 1, 1, Reject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(executeEClass, Execute.class, "Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecute_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 1, 1, Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExecute_AppInstantiation(), this.getAppInstantiation(), null, "appInstantiation", null, 1, -1, Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(channelEEnum, Channel.class, "Channel");
		addEEnumLiteral(channelEEnum, Channel.ETHERNET10_MBPS);
		addEEnumLiteral(channelEEnum, Channel.ETHERNET100_MBPS);
		addEEnumLiteral(channelEEnum, Channel.ETHERNET1_GBPS);
		addEEnumLiteral(channelEEnum, Channel.ETHERNET10_GBPS);
		addEEnumLiteral(channelEEnum, Channel.ETHERNET40_GBPS);
		addEEnumLiteral(channelEEnum, Channel.ETHERNET100_GBPS);

		initEEnum(cpuSchedulerEEnum, CPUScheduler.class, "CPUScheduler");
		addEEnumLiteral(cpuSchedulerEEnum, CPUScheduler.FIFO);
		addEEnumLiteral(cpuSchedulerEEnum, CPUScheduler.ROUND_ROBIN);

		initEEnum(cloudProviderTypeEEnum, CloudProviderType.class, "CloudProviderType");
		addEEnumLiteral(cloudProviderTypeEEnum, CloudProviderType.CLOUD_PROVIDER_FIRST_FIT);

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
	}

} //UML2CloudProfilePackageImpl
