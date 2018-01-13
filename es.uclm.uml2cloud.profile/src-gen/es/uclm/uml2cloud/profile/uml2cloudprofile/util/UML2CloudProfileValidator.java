/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile.util;

import es.uclm.uml2cloud.profile.uml2cloudprofile.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage
 * @generated
 */
public class UML2CloudProfileValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final UML2CloudProfileValidator INSTANCE = new UML2CloudProfileValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "es.uclm.uml2cloud.profile.uml2cloudprofile";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Rack Elements instances Should Be Greatter Than Zero' of 'Data Center'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_CENTER__RACK_ELEMENTS_INSTANCES_SHOULD_BE_GREATTER_THAN_ZERO = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Rack Elements instances Must Be Greatter Than Or Equal To Zero' of 'Data Center'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_CENTER__RACK_ELEMENTS_INSTANCES_MUST_BE_GREATTER_THAN_OR_EQUAL_TO_ZERO = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Boards Must Be Greatter Than Zero' of 'Rack'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RACK__BOARDS_MUST_BE_GREATTER_THAN_ZERO = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nodes Per Board Must Be Greatter Than Zero' of 'Rack'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RACK__NODES_PER_BOARD_MUST_BE_GREATTER_THAN_ZERO = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Speed MIPS Must Be Greater Than Zero' of 'CPU'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CPU__SPEED_MIPS_MUST_BE_GREATER_THAN_ZERO = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Tick SMust Be Greater Than Zero' of 'CPU'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CPU__TICK_SMUST_BE_GREATER_THAN_ZERO = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Number Of Cores Must Be Greater Than Zero' of 'CPU'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CPU__NUMBER_OF_CORES_MUST_BE_GREATER_THAN_ZERO = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Size GB Must Be Greater Than Zero' of 'Memory'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEMORY__SIZE_GB_MUST_BE_GREATER_THAN_ZERO = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Read Latency US Must Be Greater Than Or Equal To Zero' of 'Memory'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEMORY__READ_LATENCY_US_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Write Latency US Must Be Greatter Than Or Equal To Zero' of 'Memory'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEMORY__WRITE_LATENCY_US_MUST_BE_GREATTER_THAN_OR_EQUAL_TO_ZERO = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Number Of Disks Must Be Greatter Than Zero' of 'Disk'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISK__NUMBER_OF_DISKS_MUST_BE_GREATTER_THAN_ZERO = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Read Bandwidth MBps Must Be Greatter Than Zero' of 'Disk'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISK__READ_BANDWIDTH_MBPS_MUST_BE_GREATTER_THAN_ZERO = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Write Bandwidth MBps Must Be Greatter Than Zero' of 'Disk'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISK__WRITE_BANDWIDTH_MBPS_MUST_BE_GREATTER_THAN_ZERO = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Size Per Device GB Must Be Greatter Than Zero' of 'Disk'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISK__SIZE_PER_DEVICE_GB_MUST_BE_GREATTER_THAN_ZERO = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Number Of Cores Must Be Greater Than Zero' of 'VM'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VM__NUMBER_OF_CORES_MUST_BE_GREATER_THAN_ZERO = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Disk GB Must Be Greater Than Zero' of 'VM'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VM__DISK_GB_MUST_BE_GREATER_THAN_ZERO = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Cost Per Hour Must Be Greater Than Or Equeal To Zero' of 'VM'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VM__COST_PER_HOUR_MUST_BE_GREATER_THAN_OR_EQUEAL_TO_ZERO = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'SCU Must Be Greater Than Zero' of 'VM'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VM__SCU_MUST_BE_GREATER_THAN_ZERO = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Memory Must Be Greater Than Zero' of 'VM'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VM__MEMORY_MUST_BE_GREATER_THAN_ZERO = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Input Data Size Mi BMust Be Greater Than Or Equal To Zero' of 'Local Application'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOCAL_APPLICATION__INPUT_DATA_SIZE_MI_BMUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Output Data Size Mi BMust Be Greater Than Or Equal To Zero' of 'Local Application'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOCAL_APPLICATION__OUTPUT_DATA_SIZE_MI_BMUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'MIs Must Be Greater Than Or Equal To Zero' of 'Local Application'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOCAL_APPLICATION__MIS_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Iterations Must Be Greater Than Or Equal To Zero' of 'Local Application'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOCAL_APPLICATION__ITERATIONS_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'T1 Must Be Greater Than Or Equal To Zero' of 'Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REQUEST__T1_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'T2 Must Be Greater Than Zero' of 'Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REQUEST__T2_MUST_BE_GREATER_THAN_ZERO = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'T4 Must Be Greater Than Zero' of 'Subscribe'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBSCRIBE__T4_MUST_BE_GREATER_THAN_ZERO = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'T4 Should Be Greater Than Or Equal To t1 From Connect If You Want To Subscribe' of 'Subscribe'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBSCRIBE__T4_SHOULD_BE_GREATER_THAN_OR_EQUAL_TO_T1_FROM_CONNECT_IF_YOU_WANT_TO_SUBSCRIBE = 27;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 27;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UML2CloudProfileValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return UML2CloudProfilePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case UML2CloudProfilePackage.DATA_CENTER:
				return validateDataCenter((DataCenter)value, diagnostics, context);
			case UML2CloudProfilePackage.RACK_ELEMENT:
				return validateRackElement((RackElement)value, diagnostics, context);
			case UML2CloudProfilePackage.RACK:
				return validateRack((Rack)value, diagnostics, context);
			case UML2CloudProfilePackage.NODE:
				return validateNode((Node)value, diagnostics, context);
			case UML2CloudProfilePackage.CPU:
				return validateCPU((CPU)value, diagnostics, context);
			case UML2CloudProfilePackage.HARDWARE:
				return validateHardware((Hardware)value, diagnostics, context);
			case UML2CloudProfilePackage.MEMORY:
				return validateMemory((Memory)value, diagnostics, context);
			case UML2CloudProfilePackage.DISK:
				return validateDisk((Disk)value, diagnostics, context);
			case UML2CloudProfilePackage.RACK_CMP:
				return validateRackCmp((RackCmp)value, diagnostics, context);
			case UML2CloudProfilePackage.NODE_CMP:
				return validateNodeCmp((NodeCmp)value, diagnostics, context);
			case UML2CloudProfilePackage.RACK_STO:
				return validateRackSto((RackSto)value, diagnostics, context);
			case UML2CloudProfilePackage.NODE_STO:
				return validateNodeSto((NodeSto)value, diagnostics, context);
			case UML2CloudProfilePackage.SCENARIO:
				return validateScenario((Scenario)value, diagnostics, context);
			case UML2CloudProfilePackage.REPOSITORY:
				return validateRepository((Repository)value, diagnostics, context);
			case UML2CloudProfilePackage.APPLICATION:
				return validateApplication((Application)value, diagnostics, context);
			case UML2CloudProfilePackage.VM:
				return validateVM((VM)value, diagnostics, context);
			case UML2CloudProfilePackage.LOCAL_APPLICATION:
				return validateLocalApplication((LocalApplication)value, diagnostics, context);
			case UML2CloudProfilePackage.USER:
				return validateUser((User)value, diagnostics, context);
			case UML2CloudProfilePackage.CLOUD_PROVIDER:
				return validateCloudProvider((CloudProvider)value, diagnostics, context);
			case UML2CloudProfilePackage.REQUEST:
				return validateRequest((Request)value, diagnostics, context);
			case UML2CloudProfilePackage.SUBSCRIBE:
				return validateSubscribe((Subscribe)value, diagnostics, context);
			case UML2CloudProfilePackage.VM_INSTANTIATION:
				return validateVMInstantiation((VMInstantiation)value, diagnostics, context);
			case UML2CloudProfilePackage.APP_INSTANTIATION:
				return validateAppInstantiation((AppInstantiation)value, diagnostics, context);
			case UML2CloudProfilePackage.OK:
				return validateOK((OK)value, diagnostics, context);
			case UML2CloudProfilePackage.NOTIFY:
				return validateNotify((Notify)value, diagnostics, context);
			case UML2CloudProfilePackage.TIMEOUT:
				return validateTimeout((Timeout)value, diagnostics, context);
			case UML2CloudProfilePackage.RESPONSE:
				return validateResponse((Response)value, diagnostics, context);
			case UML2CloudProfilePackage.REJECT:
				return validateReject((Reject)value, diagnostics, context);
			case UML2CloudProfilePackage.EXECUTE:
				return validateExecute((Execute)value, diagnostics, context);
			case UML2CloudProfilePackage.CHANNEL:
				return validateChannel((Channel)value, diagnostics, context);
			case UML2CloudProfilePackage.CPU_SCHEDULER:
				return validateCPUScheduler((CPUScheduler)value, diagnostics, context);
			case UML2CloudProfilePackage.CLOUD_PROVIDER_TYPE:
				return validateCloudProviderType((CloudProviderType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataCenter(DataCenter dataCenter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataCenter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataCenter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataCenter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataCenter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataCenter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataCenter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataCenter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataCenter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataCenter, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataCenter_rackElements_instances_Should_Be_Greatter_Than_Zero(dataCenter, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataCenter_rackElements_instances_Must_Be_Greatter_Than_Or_Equal_To_Zero(dataCenter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the rackElements_instances_Should_Be_Greatter_Than_Zero constraint of '<em>Data Center</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataCenter_rackElements_instances_Should_Be_Greatter_Than_Zero(DataCenter dataCenter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataCenter.rackElements_instances_Should_Be_Greatter_Than_Zero(diagnostics, context);
	}

	/**
	 * Validates the rackElements_instances_Must_Be_Greatter_Than_Or_Equal_To_Zero constraint of '<em>Data Center</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataCenter_rackElements_instances_Must_Be_Greatter_Than_Or_Equal_To_Zero(DataCenter dataCenter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataCenter.rackElements_instances_Must_Be_Greatter_Than_Or_Equal_To_Zero(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRackElement(RackElement rackElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rackElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRack(Rack rack, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rack, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rack, diagnostics, context);
		if (result || diagnostics != null) result &= validateRack_boards_Must_Be_Greatter_Than_Zero(rack, diagnostics, context);
		if (result || diagnostics != null) result &= validateRack_nodesPerBoard_Must_Be_Greatter_Than_Zero(rack, diagnostics, context);
		return result;
	}

	/**
	 * Validates the boards_Must_Be_Greatter_Than_Zero constraint of '<em>Rack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRack_boards_Must_Be_Greatter_Than_Zero(Rack rack, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rack.boards_Must_Be_Greatter_Than_Zero(diagnostics, context);
	}

	/**
	 * Validates the nodesPerBoard_Must_Be_Greatter_Than_Zero constraint of '<em>Rack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRack_nodesPerBoard_Must_Be_Greatter_Than_Zero(Rack rack, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rack.nodesPerBoard_Must_Be_Greatter_Than_Zero(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(node, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCPU(CPU cpu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cpu, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cpu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cpu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cpu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cpu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cpu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cpu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cpu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cpu, diagnostics, context);
		if (result || diagnostics != null) result &= validateCPU_speedMIPS_Must_Be_Greater_Than_Zero(cpu, diagnostics, context);
		if (result || diagnostics != null) result &= validateCPU_tickS_Must_Be_Greater_Than_Zero(cpu, diagnostics, context);
		if (result || diagnostics != null) result &= validateCPU_numberOfCores_Must_Be_Greater_Than_Zero(cpu, diagnostics, context);
		return result;
	}

	/**
	 * Validates the speedMIPS_Must_Be_Greater_Than_Zero constraint of '<em>CPU</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCPU_speedMIPS_Must_Be_Greater_Than_Zero(CPU cpu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cpu.speedMIPS_Must_Be_Greater_Than_Zero(diagnostics, context);
	}

	/**
	 * Validates the tickS_Must_Be_Greater_Than_Zero constraint of '<em>CPU</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCPU_tickS_Must_Be_Greater_Than_Zero(CPU cpu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cpu.tickS_Must_Be_Greater_Than_Zero(diagnostics, context);
	}

	/**
	 * Validates the numberOfCores_Must_Be_Greater_Than_Zero constraint of '<em>CPU</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCPU_numberOfCores_Must_Be_Greater_Than_Zero(CPU cpu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cpu.numberOfCores_Must_Be_Greater_Than_Zero(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardware(Hardware hardware, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hardware, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemory(Memory memory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(memory, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validateMemory_sizeGB_Must_Be_Greater_Than_Zero(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validateMemory_readLatencyUS_Must_Be_Greater_Than_Or_Equal_To_Zero(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validateMemory_writeLatencyUS_Must_Be_Greatter_Than_Or_Equal_To_Zero(memory, diagnostics, context);
		return result;
	}

	/**
	 * Validates the sizeGB_Must_Be_Greater_Than_Zero constraint of '<em>Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemory_sizeGB_Must_Be_Greater_Than_Zero(Memory memory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return memory.sizeGB_Must_Be_Greater_Than_Zero(diagnostics, context);
	}

	/**
	 * Validates the readLatencyUS_Must_Be_Greater_Than_Or_Equal_To_Zero constraint of '<em>Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemory_readLatencyUS_Must_Be_Greater_Than_Or_Equal_To_Zero(Memory memory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return memory.readLatencyUS_Must_Be_Greater_Than_Or_Equal_To_Zero(diagnostics, context);
	}

	/**
	 * Validates the writeLatencyUS_Must_Be_Greatter_Than_Or_Equal_To_Zero constraint of '<em>Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemory_writeLatencyUS_Must_Be_Greatter_Than_Or_Equal_To_Zero(Memory memory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return memory.writeLatencyUS_Must_Be_Greatter_Than_Or_Equal_To_Zero(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisk(Disk disk, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(disk, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(disk, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(disk, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(disk, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(disk, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(disk, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(disk, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(disk, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(disk, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisk_numberOfDisks_Must_Be_Greatter_Than_Zero(disk, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisk_readBandwidthMBps_Must_Be_Greatter_Than_Zero(disk, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisk_writeBandwidthMBps_Must_Be_Greatter_Than_Zero(disk, diagnostics, context);
		if (result || diagnostics != null) result &= validateDisk_sizePerDeviceGB_Must_Be_Greatter_Than_Zero(disk, diagnostics, context);
		return result;
	}

	/**
	 * Validates the numberOfDisks_Must_Be_Greatter_Than_Zero constraint of '<em>Disk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisk_numberOfDisks_Must_Be_Greatter_Than_Zero(Disk disk, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return disk.numberOfDisks_Must_Be_Greatter_Than_Zero(diagnostics, context);
	}

	/**
	 * Validates the readBandwidthMBps_Must_Be_Greatter_Than_Zero constraint of '<em>Disk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisk_readBandwidthMBps_Must_Be_Greatter_Than_Zero(Disk disk, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return disk.readBandwidthMBps_Must_Be_Greatter_Than_Zero(diagnostics, context);
	}

	/**
	 * Validates the writeBandwidthMBps_Must_Be_Greatter_Than_Zero constraint of '<em>Disk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisk_writeBandwidthMBps_Must_Be_Greatter_Than_Zero(Disk disk, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return disk.writeBandwidthMBps_Must_Be_Greatter_Than_Zero(diagnostics, context);
	}

	/**
	 * Validates the sizePerDeviceGB_Must_Be_Greatter_Than_Zero constraint of '<em>Disk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisk_sizePerDeviceGB_Must_Be_Greatter_Than_Zero(Disk disk, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return disk.sizePerDeviceGB_Must_Be_Greatter_Than_Zero(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRackCmp(RackCmp rackCmp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rackCmp, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rackCmp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rackCmp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rackCmp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rackCmp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rackCmp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rackCmp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rackCmp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rackCmp, diagnostics, context);
		if (result || diagnostics != null) result &= validateRack_boards_Must_Be_Greatter_Than_Zero(rackCmp, diagnostics, context);
		if (result || diagnostics != null) result &= validateRack_nodesPerBoard_Must_Be_Greatter_Than_Zero(rackCmp, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeCmp(NodeCmp nodeCmp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nodeCmp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRackSto(RackSto rackSto, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rackSto, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rackSto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rackSto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rackSto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rackSto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rackSto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rackSto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rackSto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rackSto, diagnostics, context);
		if (result || diagnostics != null) result &= validateRack_boards_Must_Be_Greatter_Than_Zero(rackSto, diagnostics, context);
		if (result || diagnostics != null) result &= validateRack_nodesPerBoard_Must_Be_Greatter_Than_Zero(rackSto, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeSto(NodeSto nodeSto, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nodeSto, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScenario(Scenario scenario, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scenario, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepository(Repository repository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(repository, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication(Application application, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(application, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVM(VM vm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vm, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validateVM_numberOfCores_Must_Be_Greater_Than_Zero(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validateVM_diskGB_Must_Be_Greater_Than_Zero(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validateVM_costPerHour_Must_Be_Greater_Than_Or_Equeal_To_Zero(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validateVM_SCU_Must_Be_Greater_Than_Zero(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validateVM_memory_Must_Be_Greater_Than_Zero(vm, diagnostics, context);
		return result;
	}

	/**
	 * Validates the numberOfCores_Must_Be_Greater_Than_Zero constraint of '<em>VM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVM_numberOfCores_Must_Be_Greater_Than_Zero(VM vm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vm.numberOfCores_Must_Be_Greater_Than_Zero(diagnostics, context);
	}

	/**
	 * Validates the diskGB_Must_Be_Greater_Than_Zero constraint of '<em>VM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVM_diskGB_Must_Be_Greater_Than_Zero(VM vm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vm.diskGB_Must_Be_Greater_Than_Zero(diagnostics, context);
	}

	/**
	 * Validates the costPerHour_Must_Be_Greater_Than_Or_Equeal_To_Zero constraint of '<em>VM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVM_costPerHour_Must_Be_Greater_Than_Or_Equeal_To_Zero(VM vm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vm.costPerHour_Must_Be_Greater_Than_Or_Equeal_To_Zero(diagnostics, context);
	}

	/**
	 * Validates the SCU_Must_Be_Greater_Than_Zero constraint of '<em>VM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVM_SCU_Must_Be_Greater_Than_Zero(VM vm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vm.SCU_Must_Be_Greater_Than_Zero(diagnostics, context);
	}

	/**
	 * Validates the memory_Must_Be_Greater_Than_Zero constraint of '<em>VM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVM_memory_Must_Be_Greater_Than_Zero(VM vm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vm.memory_Must_Be_Greater_Than_Zero(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalApplication(LocalApplication localApplication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(localApplication, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(localApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(localApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(localApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(localApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(localApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(localApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(localApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(localApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocalApplication_inputDataSizeMiB_Must_Be_Greater_Than_Or_Equal_To_Zero(localApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocalApplication_outputDataSizeMiB_Must_Be_Greater_Than_Or_Equal_To_Zero(localApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocalApplication_MIs_Must_Be_Greater_Than_Or_Equal_To_Zero(localApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocalApplication_iterations_Must_Be_Greater_Than_Or_Equal_To_Zero(localApplication, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inputDataSizeMiB_Must_Be_Greater_Than_Or_Equal_To_Zero constraint of '<em>Local Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalApplication_inputDataSizeMiB_Must_Be_Greater_Than_Or_Equal_To_Zero(LocalApplication localApplication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return localApplication.inputDataSizeMiB_Must_Be_Greater_Than_Or_Equal_To_Zero(diagnostics, context);
	}

	/**
	 * Validates the outputDataSizeMiB_Must_Be_Greater_Than_Or_Equal_To_Zero constraint of '<em>Local Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalApplication_outputDataSizeMiB_Must_Be_Greater_Than_Or_Equal_To_Zero(LocalApplication localApplication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return localApplication.outputDataSizeMiB_Must_Be_Greater_Than_Or_Equal_To_Zero(diagnostics, context);
	}

	/**
	 * Validates the MIs_Must_Be_Greater_Than_Or_Equal_To_Zero constraint of '<em>Local Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalApplication_MIs_Must_Be_Greater_Than_Or_Equal_To_Zero(LocalApplication localApplication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return localApplication.MIs_Must_Be_Greater_Than_Or_Equal_To_Zero(diagnostics, context);
	}

	/**
	 * Validates the iterations_Must_Be_Greater_Than_Or_Equal_To_Zero constraint of '<em>Local Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalApplication_iterations_Must_Be_Greater_Than_Or_Equal_To_Zero(LocalApplication localApplication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return localApplication.iterations_Must_Be_Greater_Than_Or_Equal_To_Zero(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(user, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudProvider(CloudProvider cloudProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cloudProvider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequest(Request request, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(request, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(request, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(request, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(request, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(request, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(request, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(request, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(request, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(request, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequest_t1_Must_Be_Greater_Than_Or_Equal_To_Zero(request, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequest_t2_Must_Be_Greater_Than_Zero(request, diagnostics, context);
		return result;
	}

	/**
	 * Validates the t1_Must_Be_Greater_Than_Or_Equal_To_Zero constraint of '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequest_t1_Must_Be_Greater_Than_Or_Equal_To_Zero(Request request, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return request.t1_Must_Be_Greater_Than_Or_Equal_To_Zero(diagnostics, context);
	}

	/**
	 * Validates the t2_Must_Be_Greater_Than_Zero constraint of '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequest_t2_Must_Be_Greater_Than_Zero(Request request, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return request.t2_Must_Be_Greater_Than_Zero(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscribe(Subscribe subscribe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subscribe, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(subscribe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(subscribe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(subscribe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(subscribe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(subscribe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(subscribe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(subscribe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(subscribe, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubscribe_t4_Must_Be_Greater_Than_Zero(subscribe, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubscribe_t4_Should_Be_Greater_Than_Or_Equal_To_t1_From_Connect_If_You_Want_To_Subscribe(subscribe, diagnostics, context);
		return result;
	}

	/**
	 * Validates the t4_Must_Be_Greater_Than_Zero constraint of '<em>Subscribe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscribe_t4_Must_Be_Greater_Than_Zero(Subscribe subscribe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return subscribe.t4_Must_Be_Greater_Than_Zero(diagnostics, context);
	}

	/**
	 * Validates the t4_Should_Be_Greater_Than_Or_Equal_To_t1_From_Connect_If_You_Want_To_Subscribe constraint of '<em>Subscribe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscribe_t4_Should_Be_Greater_Than_Or_Equal_To_t1_From_Connect_If_You_Want_To_Subscribe(Subscribe subscribe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return subscribe.t4_Should_Be_Greater_Than_Or_Equal_To_t1_From_Connect_If_You_Want_To_Subscribe(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVMInstantiation(VMInstantiation vmInstantiation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vmInstantiation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppInstantiation(AppInstantiation appInstantiation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appInstantiation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOK(OK ok, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ok, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotify(Notify notify, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(notify, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeout(Timeout timeout, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeout, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponse(Response response, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(response, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReject(Reject reject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecute(Execute execute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(execute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannel(Channel channel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCPUScheduler(CPUScheduler cpuScheduler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudProviderType(CloudProviderType cloudProviderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //UML2CloudProfileValidator
