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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Machines Per Board Must Be Greatter Than Zero' of 'Rack'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RACK__MACHINES_PER_BOARD_MUST_BE_GREATTER_THAN_ZERO = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'MIPS Must Be Greater Than Zero' of 'CPU'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CPU__MIPS_MUST_BE_GREATER_THAN_ZERO = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Cores Must Be Greater Than Zero' of 'CPU'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CPU__CORES_MUST_BE_GREATER_THAN_ZERO = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Capacity Must Be Greater Than Zero' of 'Memory'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEMORY__CAPACITY_MUST_BE_GREATER_THAN_ZERO = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Number Of Drives Must Be Greatter Than Zero' of 'Storage'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STORAGE__NUMBER_OF_DRIVES_MUST_BE_GREATTER_THAN_ZERO = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Drive Capacity Must Be Greater Than Zero' of 'Storage'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STORAGE__DRIVE_CAPACITY_MUST_BE_GREATER_THAN_ZERO = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Read Bandwidth Must Be Greatter Than Zero' of 'Storage'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STORAGE__READ_BANDWIDTH_MUST_BE_GREATTER_THAN_ZERO = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Write Bandwidth Must Be Greatter Than Zero' of 'Storage'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STORAGE__WRITE_BANDWIDTH_MUST_BE_GREATTER_THAN_ZERO = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Cloud Provider Must Offer Once Each VM For Each SLA Type' of 'Cloud Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLOUD_PROVIDER__CLOUD_PROVIDER_MUST_OFFER_ONCE_EACH_VM_FOR_EACH_SLA_TYPE = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Cloud Provider offer must be greater than or equal to zero' of 'Cloud Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLOUD_PROVIDER__CLOUD_PROVIDER_OFFER_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'SLA compensation must be grater than or equal to zero' of 'SLA'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SLA__SLA_COMPENSATION_MUST_BE_GRATER_THAN_OR_EQUAL_TO_ZERO = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'SLA discount must be grater than or equal to zero' of 'SLA'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SLA__SLA_DISCOUNT_MUST_BE_GRATER_THAN_OR_EQUAL_TO_ZERO = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'SLA incpriority must be grater than or equal to zero' of 'SLA'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SLA__SLA_INCPRIORITY_MUST_BE_GRATER_THAN_OR_EQUAL_TO_ZERO = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'SLA base cost must be grater than or equal to zero' of 'SLA'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SLA__SLA_BASE_COST_MUST_BE_GRATER_THAN_OR_EQUAL_TO_ZERO = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Cloud Provider must offer once each VM for each SLA type' of 'SLA'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SLA__CLOUD_PROVIDER_MUST_OFFER_ONCE_EACH_VM_FOR_EACH_SLA_TYPE = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Cores Must Be Greater Than Zero' of 'VM'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VM__CORES_MUST_BE_GREATER_THAN_ZERO = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Computing Units Must Be Greater Than Zero' of 'VM'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VM__COMPUTING_UNITS_MUST_BE_GREATER_THAN_ZERO = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Memory Must Be Greater Than Zero' of 'VM'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VM__MEMORY_MUST_BE_GREATER_THAN_ZERO = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'VM can not be allocated' of 'VM'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VM__VM_CAN_NOT_BE_ALLOCATED = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Disk Must Be Greater Than Zero' of 'VM'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VM__DISK_MUST_BE_GREATER_THAN_ZERO = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'MIs Must Be Greater Than Zero' of 'Application'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APPLICATION__MIS_MUST_BE_GREATER_THAN_ZERO = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Input Data Must Be Greater Than Or Equal To Zero' of 'Application'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APPLICATION__INPUT_DATA_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Output Data Must Be Greater Than Or Equal To Zero' of 'Application'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APPLICATION__OUTPUT_DATA_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Renting Time Must Be Greater Than Zero' of 'Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REQUEST__RENTING_TIME_MUST_BE_GREATER_THAN_ZERO = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Instances Must Be Greater Than Zero' of 'Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REQUEST__INSTANCES_MUST_BE_GREATER_THAN_ZERO = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Request Must Be Sent To ACloud Provider' of 'Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REQUEST__REQUEST_MUST_BE_SENT_TO_ACLOUD_PROVIDER = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Request Must Be Sent By AUser' of 'Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REQUEST__REQUEST_MUST_BE_SENT_BY_AUSER = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Request For AVM Not Offered In The Signed SLA By The User' of 'Request'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REQUEST__REQUEST_FOR_AVM_NOT_OFFERED_IN_THE_SIGNED_SLA_BY_THE_USER = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Max Time Must Be Greater Than Zero' of 'Subscribe'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBSCRIBE__MAX_TIME_MUST_BE_GREATER_THAN_ZERO = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Subscribe Must Be Sent To ACloud Provider' of 'Subscribe'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBSCRIBE__SUBSCRIBE_MUST_BE_SENT_TO_ACLOUD_PROVIDER = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Subscribe Must Be Sent By AUser' of 'Subscribe'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBSCRIBE__SUBSCRIBE_MUST_BE_SENT_BY_AUSER = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Instances Must Be Greater Than Zero' of 'Execute'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXECUTE__INSTANCES_MUST_BE_GREATER_THAN_ZERO = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Execute Must Be Sent To ACloud Provider' of 'Execute'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXECUTE__EXECUTE_MUST_BE_SENT_TO_ACLOUD_PROVIDER = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Execute Must Be Sent By AUser' of 'Execute'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXECUTE__EXECUTE_MUST_BE_SENT_BY_AUSER = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Number Of App Instantiation Collections Must Be Equal Than Total VM Instances' of 'Execute'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXECUTE__NUMBER_OF_APP_INSTANTIATION_COLLECTIONS_MUST_BE_EQUAL_THAN_TOTAL_VM_INSTANCES = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'User Must Have AExecute Message' of 'User'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int USER__USER_MUST_HAVE_AEXECUTE_MESSAGE = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'User Must Have ARequest Message' of 'User'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int USER__USER_MUST_HAVE_AREQUEST_MESSAGE = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'User Must Sign AVM SLA Offered By The Cloud Provider' of 'User'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int USER__USER_MUST_SIGN_AVM_SLA_OFFERED_BY_THE_CLOUD_PROVIDER = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'User Must Have AResume Message' of 'User'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int USER__USER_MUST_HAVE_ARESUME_MESSAGE = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Datacenter Elements instances Must Be Greatter Than Or Equal To Zero' of 'Cloud Infrastructure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLOUD_INFRASTRUCTURE__DATACENTER_ELEMENTS_INSTANCES_MUST_BE_GREATTER_THAN_OR_EQUAL_TO_ZERO = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Datacenter Elements instances Should Be Greatter Than Zero' of 'Cloud Infrastructure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLOUD_INFRASTRUCTURE__DATACENTER_ELEMENTS_INSTANCES_SHOULD_BE_GREATTER_THAN_ZERO = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Priority User has been modeled but no machine has been reserved' of 'Priority User'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIORITY_USER__PRIORITY_USER_HAS_BEEN_MODELED_BUT_NO_MACHINE_HAS_BEEN_RESERVED = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Regular User Must Have ASubscribe Message' of 'Regular User'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REGULAR_USER__REGULAR_USER_MUST_HAVE_ASUBSCRIBE_MESSAGE = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Resume Time is at least twice as long as the renting time' of 'Resume'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESUME__RESUME_TIME_IS_AT_LEAST_TWICE_AS_LONG_AS_THE_RENTING_TIME = 47;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 47;

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
			case UML2CloudProfilePackage.SLA:
				return validateSLA((SLA)value, diagnostics, context);
			case UML2CloudProfilePackage.VM_COST:
				return validateVMCost((VMCost)value, diagnostics, context);
			case UML2CloudProfilePackage.COST:
				return validateCost((Cost)value, diagnostics, context);
			case UML2CloudProfilePackage.VM:
				return validateVM((VM)value, diagnostics, context);
			case UML2CloudProfilePackage.APPLICATION:
				return validateApplication((Application)value, diagnostics, context);
			case UML2CloudProfilePackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case UML2CloudProfilePackage.REQUEST:
				return validateRequest((Request)value, diagnostics, context);
			case UML2CloudProfilePackage.VM_INSTANTIATION:
				return validateVMInstantiation((VMInstantiation)value, diagnostics, context);
			case UML2CloudProfilePackage.SUBSCRIBE:
				return validateSubscribe((Subscribe)value, diagnostics, context);
			case UML2CloudProfilePackage.APP_INSTANTIATION:
				return validateAppInstantiation((AppInstantiation)value, diagnostics, context);
			case UML2CloudProfilePackage.EXECUTE:
				return validateExecute((Execute)value, diagnostics, context);
			case UML2CloudProfilePackage.USER:
				return validateUser((User)value, diagnostics, context);
			case UML2CloudProfilePackage.CLOUD_INFRASTRUCTURE:
				return validateCloudInfrastructure((CloudInfrastructure)value, diagnostics, context);
			case UML2CloudProfilePackage.DATA_CENTER_ELEMENT:
				return validateDataCenterElement((DataCenterElement)value, diagnostics, context);
			case UML2CloudProfilePackage.PRIORITY_USER:
				return validatePriorityUser((PriorityUser)value, diagnostics, context);
			case UML2CloudProfilePackage.REGULAR_USER:
				return validateRegularUser((RegularUser)value, diagnostics, context);
			case UML2CloudProfilePackage.RESUME:
				return validateResume((Resume)value, diagnostics, context);
			case UML2CloudProfilePackage.RESPONSE_OFFERED_VMS:
				return validateResponseOfferedVMs((ResponseOfferedVMs)value, diagnostics, context);
			case UML2CloudProfilePackage.OK:
				return validateOk((Ok)value, diagnostics, context);
			case UML2CloudProfilePackage.TIMEOUT_RENTING:
				return validateTimeoutRenting((TimeoutRenting)value, diagnostics, context);
			case UML2CloudProfilePackage.NOTIFY:
				return validateNotify((Notify)value, diagnostics, context);
			case UML2CloudProfilePackage.TIMEOUT_SUBSCRIPTION:
				return validateTimeoutSubscription((TimeoutSubscription)value, diagnostics, context);
			case UML2CloudProfilePackage.REQUEST_OFFERED_VMS:
				return validateRequestOfferedVMs((RequestOfferedVMs)value, diagnostics, context);
			case UML2CloudProfilePackage.RESPONSE:
				return validateResponse((Response)value, diagnostics, context);
			case UML2CloudProfilePackage.REFUSE:
				return validateRefuse((Refuse)value, diagnostics, context);
			case UML2CloudProfilePackage.BANDWIDTH_UNIT:
				return validateBandwidthUnit((BandwidthUnit)value, diagnostics, context);
			case UML2CloudProfilePackage.SIZE_UNIT:
				return validateSizeUnit((SizeUnit)value, diagnostics, context);
			case UML2CloudProfilePackage.TIME_UNIT:
				return validateTimeUnit((TimeUnit)value, diagnostics, context);
			case UML2CloudProfilePackage.MACHINE_TYPE:
				return validateMachineType((MachineType)value, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateRack_machinesPerBoard_Must_Be_Greatter_Than_Zero(rack, diagnostics, context);
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
	 * Validates the machinesPerBoard_Must_Be_Greatter_Than_Zero constraint of '<em>Rack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRack_machinesPerBoard_Must_Be_Greatter_Than_Zero(Rack rack, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rack.machinesPerBoard_Must_Be_Greatter_Than_Zero(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateCPU_MIPS_Must_Be_Greater_Than_Zero(cpu, diagnostics, context);
		if (result || diagnostics != null) result &= validateCPU_cores_Must_Be_Greater_Than_Zero(cpu, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MIPS_Must_Be_Greater_Than_Zero constraint of '<em>CPU</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCPU_MIPS_Must_Be_Greater_Than_Zero(CPU cpu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cpu.MIPS_Must_Be_Greater_Than_Zero(diagnostics, context);
	}

	/**
	 * Validates the cores_Must_Be_Greater_Than_Zero constraint of '<em>CPU</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCPU_cores_Must_Be_Greater_Than_Zero(CPU cpu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cpu.cores_Must_Be_Greater_Than_Zero(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateMemory_capacity_Must_Be_Greater_Than_Zero(memory, diagnostics, context);
		return result;
	}

	/**
	 * Validates the capacity_Must_Be_Greater_Than_Zero constraint of '<em>Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemory_capacity_Must_Be_Greater_Than_Zero(Memory memory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return memory.capacity_Must_Be_Greater_Than_Zero(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateStorage_numberOfDrives_Must_Be_Greatter_Than_Zero(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validateStorage_driveCapacity_Must_Be_Greater_Than_Zero(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validateStorage_readBandwidth_Must_Be_Greatter_Than_Zero(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validateStorage_writeBandwidth_Must_Be_Greatter_Than_Zero(storage, diagnostics, context);
		return result;
	}

	/**
	 * Validates the numberOfDrives_Must_Be_Greatter_Than_Zero constraint of '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorage_numberOfDrives_Must_Be_Greatter_Than_Zero(Storage storage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return storage.numberOfDrives_Must_Be_Greatter_Than_Zero(diagnostics, context);
	}

	/**
	 * Validates the driveCapacity_Must_Be_Greater_Than_Zero constraint of '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorage_driveCapacity_Must_Be_Greater_Than_Zero(Storage storage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return storage.driveCapacity_Must_Be_Greater_Than_Zero(diagnostics, context);
	}

	/**
	 * Validates the readBandwidth_Must_Be_Greatter_Than_Zero constraint of '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorage_readBandwidth_Must_Be_Greatter_Than_Zero(Storage storage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return storage.readBandwidth_Must_Be_Greatter_Than_Zero(diagnostics, context);
	}

	/**
	 * Validates the writeBandwidth_Must_Be_Greatter_Than_Zero constraint of '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorage_writeBandwidth_Must_Be_Greatter_Than_Zero(Storage storage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return storage.writeBandwidth_Must_Be_Greatter_Than_Zero(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateRack_machinesPerBoard_Must_Be_Greatter_Than_Zero(computingRack, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateRack_machinesPerBoard_Must_Be_Greatter_Than_Zero(storageRack, diagnostics, context);
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
		if (!validate_NoCircularContainment(cloudProvider, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cloudProvider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cloudProvider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cloudProvider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cloudProvider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cloudProvider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cloudProvider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cloudProvider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cloudProvider, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudProvider_CloudProvider_Must_Offer_Once_Each_VM_For_Each_SLA_Type(cloudProvider, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudProvider_CloudProvider_offer_must_be_greater_than_or_equal_to_zero(cloudProvider, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CloudProvider_Must_Offer_Once_Each_VM_For_Each_SLA_Type constraint of '<em>Cloud Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudProvider_CloudProvider_Must_Offer_Once_Each_VM_For_Each_SLA_Type(CloudProvider cloudProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cloudProvider.CloudProvider_Must_Offer_Once_Each_VM_For_Each_SLA_Type(diagnostics, context);
	}

	/**
	 * Validates the CloudProvider_offer_must_be_greater_than_or_equal_to_zero constraint of '<em>Cloud Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudProvider_CloudProvider_offer_must_be_greater_than_or_equal_to_zero(CloudProvider cloudProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cloudProvider.CloudProvider_offer_must_be_greater_than_or_equal_to_zero(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSLA(SLA sla, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sla, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sla, diagnostics, context);
		if (result || diagnostics != null) result &= validateSLA_SLA_compensation_must_be_grater_than_or_equal_to_zero(sla, diagnostics, context);
		if (result || diagnostics != null) result &= validateSLA_SLA_discount_must_be_grater_than_or_equal_to_zero(sla, diagnostics, context);
		if (result || diagnostics != null) result &= validateSLA_SLA_incpriority_must_be_grater_than_or_equal_to_zero(sla, diagnostics, context);
		if (result || diagnostics != null) result &= validateSLA_SLA_base_cost_must_be_grater_than_or_equal_to_zero(sla, diagnostics, context);
		if (result || diagnostics != null) result &= validateSLA_CloudProvider_must_offer_once_each_VM_for_each_SLA_type(sla, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SLA_compensation_must_be_grater_than_or_equal_to_zero constraint of '<em>SLA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSLA_SLA_compensation_must_be_grater_than_or_equal_to_zero(SLA sla, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sla.SLA_compensation_must_be_grater_than_or_equal_to_zero(diagnostics, context);
	}

	/**
	 * Validates the SLA_discount_must_be_grater_than_or_equal_to_zero constraint of '<em>SLA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSLA_SLA_discount_must_be_grater_than_or_equal_to_zero(SLA sla, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sla.SLA_discount_must_be_grater_than_or_equal_to_zero(diagnostics, context);
	}

	/**
	 * Validates the SLA_incpriority_must_be_grater_than_or_equal_to_zero constraint of '<em>SLA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSLA_SLA_incpriority_must_be_grater_than_or_equal_to_zero(SLA sla, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sla.SLA_incpriority_must_be_grater_than_or_equal_to_zero(diagnostics, context);
	}

	/**
	 * Validates the SLA_base_cost_must_be_grater_than_or_equal_to_zero constraint of '<em>SLA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSLA_SLA_base_cost_must_be_grater_than_or_equal_to_zero(SLA sla, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sla.SLA_base_cost_must_be_grater_than_or_equal_to_zero(diagnostics, context);
	}

	/**
	 * Validates the CloudProvider_must_offer_once_each_VM_for_each_SLA_type constraint of '<em>SLA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSLA_CloudProvider_must_offer_once_each_VM_for_each_SLA_type(SLA sla, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sla.CloudProvider_must_offer_once_each_VM_for_each_SLA_type(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVMCost(VMCost vmCost, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vmCost, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCost(Cost cost, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cost, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateVM_computingUnits_Must_Be_Greater_Than_Zero(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validateVM_memory_Must_Be_Greater_Than_Zero(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validateVM_VM_can_not_be_allocated(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validateVM_disk_Must_Be_Greater_Than_Zero(vm, diagnostics, context);
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
	 * Validates the computingUnits_Must_Be_Greater_Than_Zero constraint of '<em>VM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVM_computingUnits_Must_Be_Greater_Than_Zero(VM vm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vm.computingUnits_Must_Be_Greater_Than_Zero(diagnostics, context);
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
	 * Validates the disk_Must_Be_Greater_Than_Zero constraint of '<em>VM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVM_disk_Must_Be_Greater_Than_Zero(VM vm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vm.disk_Must_Be_Greater_Than_Zero(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication(Application application, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(application, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(application, diagnostics, context);
		if (result || diagnostics != null) result &= validateApplication_MIs_Must_Be_Greater_Than_Zero(application, diagnostics, context);
		if (result || diagnostics != null) result &= validateApplication_inputData_Must_Be_Greater_Than_Or_Equal_To_Zero(application, diagnostics, context);
		if (result || diagnostics != null) result &= validateApplication_outputData_Must_Be_Greater_Than_Or_Equal_To_Zero(application, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MIs_Must_Be_Greater_Than_Zero constraint of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication_MIs_Must_Be_Greater_Than_Zero(Application application, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return application.MIs_Must_Be_Greater_Than_Zero(diagnostics, context);
	}

	/**
	 * Validates the inputData_Must_Be_Greater_Than_Or_Equal_To_Zero constraint of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication_inputData_Must_Be_Greater_Than_Or_Equal_To_Zero(Application application, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return application.inputData_Must_Be_Greater_Than_Or_Equal_To_Zero(diagnostics, context);
	}

	/**
	 * Validates the outputData_Must_Be_Greater_Than_Or_Equal_To_Zero constraint of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication_outputData_Must_Be_Greater_Than_Or_Equal_To_Zero(Application application, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return application.outputData_Must_Be_Greater_Than_Or_Equal_To_Zero(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateRequest_rentingTime_Must_Be_Greater_Than__Zero(request, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequest_instances_Must_Be_Greater_Than__Zero(request, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequest_Request_Must_Be_Sent_To_A_CloudProvider(request, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequest_Request_Must_Be_Sent_By_A_User(request, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequest_Request_For_A_VM_Not_Offered_In_The_Signed_SLA_By_The_User(request, diagnostics, context);
		return result;
	}

	/**
	 * Validates the rentingTime_Must_Be_Greater_Than__Zero constraint of '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequest_rentingTime_Must_Be_Greater_Than__Zero(Request request, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return request.rentingTime_Must_Be_Greater_Than__Zero(diagnostics, context);
	}

	/**
	 * Validates the instances_Must_Be_Greater_Than__Zero constraint of '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequest_instances_Must_Be_Greater_Than__Zero(Request request, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return request.instances_Must_Be_Greater_Than__Zero(diagnostics, context);
	}

	/**
	 * Validates the Request_Must_Be_Sent_To_A_CloudProvider constraint of '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequest_Request_Must_Be_Sent_To_A_CloudProvider(Request request, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return request.Request_Must_Be_Sent_To_A_CloudProvider(diagnostics, context);
	}

	/**
	 * Validates the Request_Must_Be_Sent_By_A_User constraint of '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequest_Request_Must_Be_Sent_By_A_User(Request request, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return request.Request_Must_Be_Sent_By_A_User(diagnostics, context);
	}

	/**
	 * Validates the Request_For_A_VM_Not_Offered_In_The_Signed_SLA_By_The_User constraint of '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequest_Request_For_A_VM_Not_Offered_In_The_Signed_SLA_By_The_User(Request request, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return request.Request_For_A_VM_Not_Offered_In_The_Signed_SLA_By_The_User(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateSubscribe_Subscribe_Must_Be_Sent_To_A_CloudProvider(subscribe, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubscribe_Subscribe_Must_Be_Sent_By_A_User(subscribe, diagnostics, context);
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
	 * Validates the Subscribe_Must_Be_Sent_To_A_CloudProvider constraint of '<em>Subscribe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscribe_Subscribe_Must_Be_Sent_To_A_CloudProvider(Subscribe subscribe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return subscribe.Subscribe_Must_Be_Sent_To_A_CloudProvider(diagnostics, context);
	}

	/**
	 * Validates the Subscribe_Must_Be_Sent_By_A_User constraint of '<em>Subscribe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscribe_Subscribe_Must_Be_Sent_By_A_User(Subscribe subscribe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return subscribe.Subscribe_Must_Be_Sent_By_A_User(diagnostics, context);
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
	public boolean validateExecute(Execute execute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(execute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(execute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(execute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(execute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(execute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(execute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(execute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(execute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(execute, diagnostics, context);
		if (result || diagnostics != null) result &= validateExecute_instances_Must_Be_Greater_Than_Zero(execute, diagnostics, context);
		if (result || diagnostics != null) result &= validateExecute_Execute_Must_Be_Sent_To_A_CloudProvider(execute, diagnostics, context);
		if (result || diagnostics != null) result &= validateExecute_Execute_Must_Be_Sent_By_A_User(execute, diagnostics, context);
		if (result || diagnostics != null) result &= validateExecute_number_Of_AppInstantiation_Collections_Must_Be_Equal_Than_Total_VM_Instances(execute, diagnostics, context);
		return result;
	}

	/**
	 * Validates the instances_Must_Be_Greater_Than_Zero constraint of '<em>Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecute_instances_Must_Be_Greater_Than_Zero(Execute execute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return execute.instances_Must_Be_Greater_Than_Zero(diagnostics, context);
	}

	/**
	 * Validates the Execute_Must_Be_Sent_To_A_CloudProvider constraint of '<em>Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecute_Execute_Must_Be_Sent_To_A_CloudProvider(Execute execute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return execute.Execute_Must_Be_Sent_To_A_CloudProvider(diagnostics, context);
	}

	/**
	 * Validates the Execute_Must_Be_Sent_By_A_User constraint of '<em>Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecute_Execute_Must_Be_Sent_By_A_User(Execute execute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return execute.Execute_Must_Be_Sent_By_A_User(diagnostics, context);
	}

	/**
	 * Validates the number_Of_AppInstantiation_Collections_Must_Be_Equal_Than_Total_VM_Instances constraint of '<em>Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecute_number_Of_AppInstantiation_Collections_Must_Be_Equal_Than_Total_VM_Instances(Execute execute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return execute.number_Of_AppInstantiation_Collections_Must_Be_Equal_Than_Total_VM_Instances(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(user, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(user, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(user, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(user, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(user, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(user, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(user, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(user, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(user, diagnostics, context);
		if (result || diagnostics != null) result &= validateUser_User_Must_Have_A_Execute_Message(user, diagnostics, context);
		if (result || diagnostics != null) result &= validateUser_User_Must_Have_A_Request_Message(user, diagnostics, context);
		if (result || diagnostics != null) result &= validateUser_User_Must_Sign_A_VM_SLA_Offered_By_The_CloudProvider(user, diagnostics, context);
		if (result || diagnostics != null) result &= validateUser_User_Must_Have_A_Resume_Message(user, diagnostics, context);
		return result;
	}

	/**
	 * Validates the User_Must_Have_A_Execute_Message constraint of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser_User_Must_Have_A_Execute_Message(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return user.User_Must_Have_A_Execute_Message(diagnostics, context);
	}

	/**
	 * Validates the User_Must_Have_A_Request_Message constraint of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser_User_Must_Have_A_Request_Message(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return user.User_Must_Have_A_Request_Message(diagnostics, context);
	}

	/**
	 * Validates the User_Must_Sign_A_VM_SLA_Offered_By_The_CloudProvider constraint of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser_User_Must_Sign_A_VM_SLA_Offered_By_The_CloudProvider(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return user.User_Must_Sign_A_VM_SLA_Offered_By_The_CloudProvider(diagnostics, context);
	}

	/**
	 * Validates the User_Must_Have_A_Resume_Message constraint of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser_User_Must_Have_A_Resume_Message(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return user.User_Must_Have_A_Resume_Message(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudInfrastructure(CloudInfrastructure cloudInfrastructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cloudInfrastructure, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cloudInfrastructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cloudInfrastructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cloudInfrastructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cloudInfrastructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cloudInfrastructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cloudInfrastructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cloudInfrastructure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cloudInfrastructure, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudInfrastructure_datacenterElements_instances_Must_Be_Greatter_Than_Or_Equal_To_Zero(cloudInfrastructure, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudInfrastructure_datacenterElements_instances_Should_Be_Greatter_Than_Zero(cloudInfrastructure, diagnostics, context);
		return result;
	}

	/**
	 * Validates the datacenterElements_instances_Must_Be_Greatter_Than_Or_Equal_To_Zero constraint of '<em>Cloud Infrastructure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudInfrastructure_datacenterElements_instances_Must_Be_Greatter_Than_Or_Equal_To_Zero(CloudInfrastructure cloudInfrastructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cloudInfrastructure.datacenterElements_instances_Must_Be_Greatter_Than_Or_Equal_To_Zero(diagnostics, context);
	}

	/**
	 * Validates the datacenterElements_instances_Should_Be_Greatter_Than_Zero constraint of '<em>Cloud Infrastructure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudInfrastructure_datacenterElements_instances_Should_Be_Greatter_Than_Zero(CloudInfrastructure cloudInfrastructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cloudInfrastructure.datacenterElements_instances_Should_Be_Greatter_Than_Zero(diagnostics, context);
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
	public boolean validatePriorityUser(PriorityUser priorityUser, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(priorityUser, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(priorityUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(priorityUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(priorityUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(priorityUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(priorityUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(priorityUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(priorityUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(priorityUser, diagnostics, context);
		if (result || diagnostics != null) result &= validateUser_User_Must_Have_A_Execute_Message(priorityUser, diagnostics, context);
		if (result || diagnostics != null) result &= validateUser_User_Must_Have_A_Request_Message(priorityUser, diagnostics, context);
		if (result || diagnostics != null) result &= validateUser_User_Must_Sign_A_VM_SLA_Offered_By_The_CloudProvider(priorityUser, diagnostics, context);
		if (result || diagnostics != null) result &= validateUser_User_Must_Have_A_Resume_Message(priorityUser, diagnostics, context);
		if (result || diagnostics != null) result &= validatePriorityUser_PriorityUser_has_been_modeled_but_no_machine_has_been_reserved(priorityUser, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PriorityUser_has_been_modeled_but_no_machine_has_been_reserved constraint of '<em>Priority User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityUser_PriorityUser_has_been_modeled_but_no_machine_has_been_reserved(PriorityUser priorityUser, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return priorityUser.PriorityUser_has_been_modeled_but_no_machine_has_been_reserved(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegularUser(RegularUser regularUser, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(regularUser, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(regularUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(regularUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(regularUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(regularUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(regularUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(regularUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(regularUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(regularUser, diagnostics, context);
		if (result || diagnostics != null) result &= validateUser_User_Must_Have_A_Execute_Message(regularUser, diagnostics, context);
		if (result || diagnostics != null) result &= validateUser_User_Must_Have_A_Request_Message(regularUser, diagnostics, context);
		if (result || diagnostics != null) result &= validateUser_User_Must_Sign_A_VM_SLA_Offered_By_The_CloudProvider(regularUser, diagnostics, context);
		if (result || diagnostics != null) result &= validateUser_User_Must_Have_A_Resume_Message(regularUser, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegularUser_RegularUser_Must_Have_A_Subscribe_Message(regularUser, diagnostics, context);
		return result;
	}

	/**
	 * Validates the RegularUser_Must_Have_A_Subscribe_Message constraint of '<em>Regular User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegularUser_RegularUser_Must_Have_A_Subscribe_Message(RegularUser regularUser, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return regularUser.RegularUser_Must_Have_A_Subscribe_Message(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResume(Resume resume, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resume, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resume, diagnostics, context);
		if (result || diagnostics != null) result &= validateResume_ResumeTime_is_at_least_twice_as_long_as_the_renting_time(resume, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ResumeTime_is_at_least_twice_as_long_as_the_renting_time constraint of '<em>Resume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResume_ResumeTime_is_at_least_twice_as_long_as_the_renting_time(Resume resume, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resume.ResumeTime_is_at_least_twice_as_long_as_the_renting_time(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseOfferedVMs(ResponseOfferedVMs responseOfferedVMs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responseOfferedVMs, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOk(Ok ok, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ok, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeoutRenting(TimeoutRenting timeoutRenting, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeoutRenting, diagnostics, context);
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
	public boolean validateTimeoutSubscription(TimeoutSubscription timeoutSubscription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeoutSubscription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestOfferedVMs(RequestOfferedVMs requestOfferedVMs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestOfferedVMs, diagnostics, context);
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
	public boolean validateRefuse(Refuse refuse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(refuse, diagnostics, context);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachineType(MachineType machineType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
