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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Number Of Cores Must Be Greater Than Zero' of 'CPU'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CPU__NUMBER_OF_CORES_MUST_BE_GREATER_THAN_ZERO = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Size GB Must Be Greater Than Zero' of 'Memory'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEMORY__SIZE_GB_MUST_BE_GREATER_THAN_ZERO = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Number Of Disks Must Be Greatter Than Zero' of 'Storage'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STORAGE__NUMBER_OF_DISKS_MUST_BE_GREATTER_THAN_ZERO = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Cores Must Be Greater Than Zero' of 'VM'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VM__CORES_MUST_BE_GREATER_THAN_ZERO = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'SCU Must Be Greater Than Zero' of 'VM'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VM__SCU_MUST_BE_GREATER_THAN_ZERO = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Memory Must Be Greater Than Zero' of 'VM'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VM__MEMORY_MUST_BE_GREATER_THAN_ZERO = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'VM can not be allocated' of 'VM'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VM__VM_CAN_NOT_BE_ALLOCATED = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Renting Time Must Be Greater Than Or Equal To Zero' of 'Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REQUEST__RENTING_TIME_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Max Time Must Be Greater Than Zero' of 'Subscribe'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBSCRIBE__MAX_TIME_MUST_BE_GREATER_THAN_ZERO = 14;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 14;

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
			case UML2CloudProfilePackage.BANDWIDTH:
				return validateBandwidth((Bandwidth)value, diagnostics, context);
			case UML2CloudProfilePackage.RACK_ELEMENT:
				return validateRackElement((RackElement)value, diagnostics, context);
			case UML2CloudProfilePackage.RACK:
				return validateRack((Rack)value, diagnostics, context);
			case UML2CloudProfilePackage.MACHINE:
				return validateMachine((Machine)value, diagnostics, context);
			case UML2CloudProfilePackage.CPU:
				return validateCPU((CPU)value, diagnostics, context);
			case UML2CloudProfilePackage.HARDWARE:
				return validateHardware((Hardware)value, diagnostics, context);
			case UML2CloudProfilePackage.MEMORY:
				return validateMemory((Memory)value, diagnostics, context);
			case UML2CloudProfilePackage.SIZE:
				return validateSize((Size)value, diagnostics, context);
			case UML2CloudProfilePackage.LATENCY:
				return validateLatency((Latency)value, diagnostics, context);
			case UML2CloudProfilePackage.TIME:
				return validateTime((Time)value, diagnostics, context);
			case UML2CloudProfilePackage.STORAGE:
				return validateStorage((Storage)value, diagnostics, context);
			case UML2CloudProfilePackage.COMPUTING_RACK:
				return validateComputingRack((ComputingRack)value, diagnostics, context);
			case UML2CloudProfilePackage.COMPUTING_MACHINE:
				return validateComputingMachine((ComputingMachine)value, diagnostics, context);
			case UML2CloudProfilePackage.STORAGE_RACK:
				return validateStorageRack((StorageRack)value, diagnostics, context);
			case UML2CloudProfilePackage.STORAGE_MACHINE:
				return validateStorageMachine((StorageMachine)value, diagnostics, context);
			case UML2CloudProfilePackage.CLOUD_PROVIDER:
				return validateCloudProvider((CloudProvider)value, diagnostics, context);
			case UML2CloudProfilePackage.APPLICATION:
				return validateApplication((Application)value, diagnostics, context);
			case UML2CloudProfilePackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case UML2CloudProfilePackage.VM:
				return validateVM((VM)value, diagnostics, context);
			case UML2CloudProfilePackage.REQUEST:
				return validateRequest((Request)value, diagnostics, context);
			case UML2CloudProfilePackage.VM_INSTANTIATION:
				return validateVMInstantiation((VMInstantiation)value, diagnostics, context);
			case UML2CloudProfilePackage.SUBSCRIBE:
				return validateSubscribe((Subscribe)value, diagnostics, context);
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
			case UML2CloudProfilePackage.USER:
				return validateUser((User)value, diagnostics, context);
			case UML2CloudProfilePackage.CLOUD_INFRASTRUCTURE:
				return validateCloudInfrastructure((CloudInfrastructure)value, diagnostics, context);
			case UML2CloudProfilePackage.DATA_CENTER_ELEMENT:
				return validateDataCenterElement((DataCenterElement)value, diagnostics, context);
			case UML2CloudProfilePackage.BANDWIDTH_UNIT:
				return validateBandwidthUnit((BandwidthUnit)value, diagnostics, context);
			case UML2CloudProfilePackage.SIZE_UNIT:
				return validateSizeUnit((SizeUnit)value, diagnostics, context);
			case UML2CloudProfilePackage.TIME_UNIT:
				return validateTimeUnit((TimeUnit)value, diagnostics, context);
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
	public boolean validateBandwidth(Bandwidth bandwidth, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bandwidth, diagnostics, context);
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
	public boolean validateMachine(Machine machine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(machine, diagnostics, context);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSize(Size size, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(size, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatency(Latency latency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(latency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTime(Time time, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(time, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorage(Storage storage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(storage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validateStorage_numberOfDisks_Must_Be_Greatter_Than_Zero(storage, diagnostics, context);
		return result;
	}

	/**
	 * Validates the numberOfDisks_Must_Be_Greatter_Than_Zero constraint of '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorage_numberOfDisks_Must_Be_Greatter_Than_Zero(Storage storage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return storage.numberOfDisks_Must_Be_Greatter_Than_Zero(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComputingRack(ComputingRack computingRack, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(computingRack, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(computingRack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(computingRack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(computingRack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(computingRack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(computingRack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(computingRack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(computingRack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(computingRack, diagnostics, context);
		if (result || diagnostics != null) result &= validateRack_boards_Must_Be_Greatter_Than_Zero(computingRack, diagnostics, context);
		if (result || diagnostics != null) result &= validateRack_nodesPerBoard_Must_Be_Greatter_Than_Zero(computingRack, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComputingMachine(ComputingMachine computingMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(computingMachine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorageRack(StorageRack storageRack, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(storageRack, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(storageRack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(storageRack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(storageRack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(storageRack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(storageRack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(storageRack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(storageRack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(storageRack, diagnostics, context);
		if (result || diagnostics != null) result &= validateRack_boards_Must_Be_Greatter_Than_Zero(storageRack, diagnostics, context);
		if (result || diagnostics != null) result &= validateRack_nodesPerBoard_Must_Be_Greatter_Than_Zero(storageRack, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorageMachine(StorageMachine storageMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(storageMachine, diagnostics, context);
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
	public boolean validateApplication(Application application, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(application, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateVM_cores_Must_Be_Greater_Than_Zero(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validateVM_SCU_Must_Be_Greater_Than_Zero(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validateVM_memory_Must_Be_Greater_Than_Zero(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validateVM_VM_can_not_be_allocated(vm, diagnostics, context);
		return result;
	}

	/**
	 * Validates the cores_Must_Be_Greater_Than_Zero constraint of '<em>VM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVM_cores_Must_Be_Greater_Than_Zero(VM vm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vm.cores_Must_Be_Greater_Than_Zero(diagnostics, context);
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
	 * Validates the VM_can_not_be_allocated constraint of '<em>VM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVM_VM_can_not_be_allocated(VM vm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vm.VM_can_not_be_allocated(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateRequest_rentingTime_Must_Be_Greater_Than_Or_Equal_To_Zero(request, diagnostics, context);
		return result;
	}

	/**
	 * Validates the rentingTime_Must_Be_Greater_Than_Or_Equal_To_Zero constraint of '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequest_rentingTime_Must_Be_Greater_Than_Or_Equal_To_Zero(Request request, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return request.rentingTime_Must_Be_Greater_Than_Or_Equal_To_Zero(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateSubscribe_maxTime_Must_Be_Greater_Than_Zero(subscribe, diagnostics, context);
		return result;
	}

	/**
	 * Validates the maxTime_Must_Be_Greater_Than_Zero constraint of '<em>Subscribe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscribe_maxTime_Must_Be_Greater_Than_Zero(Subscribe subscribe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return subscribe.maxTime_Must_Be_Greater_Than_Zero(diagnostics, context);
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
	public boolean validateUser(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(user, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudInfrastructure(CloudInfrastructure cloudInfrastructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cloudInfrastructure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataCenterElement(DataCenterElement dataCenterElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataCenterElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBandwidthUnit(BandwidthUnit bandwidthUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSizeUnit(SizeUnit sizeUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeUnit(TimeUnit timeUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
