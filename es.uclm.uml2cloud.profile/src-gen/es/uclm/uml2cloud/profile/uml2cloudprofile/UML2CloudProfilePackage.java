/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfileFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='uml2cloud'"
 * @generated
 */
public interface UML2CloudProfilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uml2cloudprofile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.uclm.es/UML/profiles/UML2Cloud/2.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "UML2CloudProfile";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UML2CloudProfilePackage eINSTANCE = es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.DataCenterImpl <em>Data Center</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.DataCenterImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getDataCenter()
	 * @generated
	 */
	int DATA_CENTER = 0;

	/**
	 * The feature id for the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER__NETWORK = 0;

	/**
	 * The feature id for the '<em><b>Rack Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER__RACK_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER__BASE_COMPONENT = 2;

	/**
	 * The number of structural features of the '<em>Data Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Rack Elements instances Should Be Greatter Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER___RACK_ELEMENTS_INSTANCES_SHOULD_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Rack Elements instances Must Be Greatter Than Or Equal To Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER___RACK_ELEMENTS_INSTANCES_MUST_BE_GREATTER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Data Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.BandwidthImpl <em>Bandwidth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.BandwidthImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getBandwidth()
	 * @generated
	 */
	int BANDWIDTH = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Bandwidth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bandwidth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackElementImpl <em>Rack Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackElementImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getRackElement()
	 * @generated
	 */
	int RACK_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Number Of Racks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_ELEMENT__NUMBER_OF_RACKS = 0;

	/**
	 * The feature id for the '<em><b>Rack Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_ELEMENT__RACK_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Rack Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rack Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackImpl <em>Rack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getRack()
	 * @generated
	 */
	int RACK = 3;

	/**
	 * The feature id for the '<em><b>Machines Per Board</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__MACHINES_PER_BOARD = 0;

	/**
	 * The feature id for the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__NETWORK = 1;

	/**
	 * The feature id for the '<em><b>Boards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__BOARDS = 2;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__BASE_COMPONENT = 3;

	/**
	 * The number of structural features of the '<em>Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Boards Must Be Greatter Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK___BOARDS_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Machines Per Board Must Be Greatter Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK___MACHINES_PER_BOARD_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.MachineImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 4;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__BASE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Cpu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__CPU = 1;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__MEMORY = 2;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__STORAGE = 3;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.HardwareImpl <em>Hardware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.HardwareImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getHardware()
	 * @generated
	 */
	int HARDWARE = 6;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__BASE_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.CPUImpl <em>CPU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.CPUImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getCPU()
	 * @generated
	 */
	int CPU = 5;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU__BASE_COMPONENT = HARDWARE__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU__CORES = HARDWARE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MIPS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU__MIPS = HARDWARE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CPU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_FEATURE_COUNT = HARDWARE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>MIPS Must Be Greater Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU___MIPS_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = HARDWARE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Cores Must Be Greater Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU___CORES_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = HARDWARE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>CPU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_OPERATION_COUNT = HARDWARE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.MemoryImpl <em>Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.MemoryImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getMemory()
	 * @generated
	 */
	int MEMORY = 7;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__BASE_COMPONENT = HARDWARE__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__CAPACITY = HARDWARE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Latency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__LATENCY = HARDWARE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_FEATURE_COUNT = HARDWARE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Capacity Must Be Greater Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY___CAPACITY_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = HARDWARE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_OPERATION_COUNT = HARDWARE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.SizeImpl <em>Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.SizeImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getSize()
	 * @generated
	 */
	int SIZE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.LatencyImpl <em>Latency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.LatencyImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getLatency()
	 * @generated
	 */
	int LATENCY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY__TIME = 1;

	/**
	 * The number of structural features of the '<em>Latency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Latency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.TimeImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getTime()
	 * @generated
	 */
	int TIME = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.StorageImpl <em>Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.StorageImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getStorage()
	 * @generated
	 */
	int STORAGE = 11;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__BASE_COMPONENT = HARDWARE__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Number Of Drives</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__NUMBER_OF_DRIVES = HARDWARE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Drive Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__DRIVE_CAPACITY = HARDWARE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Read Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__READ_BANDWIDTH = HARDWARE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Write Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__WRITE_BANDWIDTH = HARDWARE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_FEATURE_COUNT = HARDWARE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Number Of Drives Must Be Greatter Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE___NUMBER_OF_DRIVES_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = HARDWARE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Drive Capacity Must Be Greater Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE___DRIVE_CAPACITY_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = HARDWARE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Read Bandwidth Must Be Greatter Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE___READ_BANDWIDTH_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = HARDWARE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Write Bandwidth Must Be Greatter Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE___WRITE_BANDWIDTH_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = HARDWARE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OPERATION_COUNT = HARDWARE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ComputingRackImpl <em>Computing Rack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ComputingRackImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getComputingRack()
	 * @generated
	 */
	int COMPUTING_RACK = 12;

	/**
	 * The feature id for the '<em><b>Machines Per Board</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RACK__MACHINES_PER_BOARD = RACK__MACHINES_PER_BOARD;

	/**
	 * The feature id for the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RACK__NETWORK = RACK__NETWORK;

	/**
	 * The feature id for the '<em><b>Boards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RACK__BOARDS = RACK__BOARDS;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RACK__BASE_COMPONENT = RACK__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Machine Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RACK__MACHINE_TYPE = RACK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Computing Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RACK_FEATURE_COUNT = RACK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Boards Must Be Greatter Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RACK___BOARDS_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = RACK___BOARDS_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Machines Per Board Must Be Greatter Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RACK___MACHINES_PER_BOARD_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = RACK___MACHINES_PER_BOARD_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Computing Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RACK_OPERATION_COUNT = RACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ComputingMachineImpl <em>Computing Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ComputingMachineImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getComputingMachine()
	 * @generated
	 */
	int COMPUTING_MACHINE = 13;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_MACHINE__BASE_COMPONENT = MACHINE__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Cpu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_MACHINE__CPU = MACHINE__CPU;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_MACHINE__MEMORY = MACHINE__MEMORY;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_MACHINE__STORAGE = MACHINE__STORAGE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_MACHINE__TYPE = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Computing Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_MACHINE_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Computing Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_MACHINE_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.StorageRackImpl <em>Storage Rack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.StorageRackImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getStorageRack()
	 * @generated
	 */
	int STORAGE_RACK = 14;

	/**
	 * The feature id for the '<em><b>Machines Per Board</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RACK__MACHINES_PER_BOARD = RACK__MACHINES_PER_BOARD;

	/**
	 * The feature id for the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RACK__NETWORK = RACK__NETWORK;

	/**
	 * The feature id for the '<em><b>Boards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RACK__BOARDS = RACK__BOARDS;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RACK__BASE_COMPONENT = RACK__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Machine Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RACK__MACHINE_TYPE = RACK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Storage Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RACK_FEATURE_COUNT = RACK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Boards Must Be Greatter Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RACK___BOARDS_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = RACK___BOARDS_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Machines Per Board Must Be Greatter Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RACK___MACHINES_PER_BOARD_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = RACK___MACHINES_PER_BOARD_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Storage Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RACK_OPERATION_COUNT = RACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.StorageMachineImpl <em>Storage Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.StorageMachineImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getStorageMachine()
	 * @generated
	 */
	int STORAGE_MACHINE = 15;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MACHINE__BASE_COMPONENT = MACHINE__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Cpu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MACHINE__CPU = MACHINE__CPU;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MACHINE__MEMORY = MACHINE__MEMORY;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MACHINE__STORAGE = MACHINE__STORAGE;

	/**
	 * The number of structural features of the '<em>Storage Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MACHINE_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Storage Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_MACHINE_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.CloudProviderImpl <em>Cloud Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.CloudProviderImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getCloudProvider()
	 * @generated
	 */
	int CLOUD_PROVIDER = 16;

	/**
	 * The feature id for the '<em><b>Resource Allocation Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER__RESOURCE_ALLOCATION_POLICY = 0;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER__BASE_LIFELINE = 1;

	/**
	 * The feature id for the '<em><b>Sla</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER__SLA = 2;

	/**
	 * The feature id for the '<em><b>Offer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER__OFFER = 3;

	/**
	 * The number of structural features of the '<em>Cloud Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Cloud Provider Must Offer Once Each VM For Each SLA Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER___CLOUD_PROVIDER_MUST_OFFER_ONCE_EACH_VM_FOR_EACH_SLA_TYPE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Cloud Provider offer must be greater than or equal to zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER___CLOUD_PROVIDER_OFFER_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Cloud Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.SLAImpl <em>SLA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.SLAImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getSLA()
	 * @generated
	 */
	int SLA = 17;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__BASE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Vmcost</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__VMCOST = 1;

	/**
	 * The number of structural features of the '<em>SLA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>SLA compensation must be grater than or equal to zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA___SLA_COMPENSATION_MUST_BE_GRATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>SLA discount must be grater than or equal to zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA___SLA_DISCOUNT_MUST_BE_GRATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>SLA incpriority must be grater than or equal to zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA___SLA_INCPRIORITY_MUST_BE_GRATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>SLA base cost must be grater than or equal to zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA___SLA_BASE_COST_MUST_BE_GRATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Cloud Provider must offer once each VM for each SLA type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA___CLOUD_PROVIDER_MUST_OFFER_ONCE_EACH_VM_FOR_EACH_SLA_TYPE__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The number of operations of the '<em>SLA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.VMCostImpl <em>VM Cost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.VMCostImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getVMCost()
	 * @generated
	 */
	int VM_COST = 18;

	/**
	 * The feature id for the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_COST__BASE = 0;

	/**
	 * The feature id for the '<em><b>Incpriority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_COST__INCPRIORITY = 1;

	/**
	 * The feature id for the '<em><b>Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_COST__DISCOUNT = 2;

	/**
	 * The feature id for the '<em><b>Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_COST__COMPENSATION = 3;

	/**
	 * The feature id for the '<em><b>Vm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_COST__VM = 4;

	/**
	 * The number of structural features of the '<em>VM Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_COST_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>VM Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_COST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.CostImpl <em>Cost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.CostImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getCost()
	 * @generated
	 */
	int COST = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST__RATE = 1;

	/**
	 * The number of structural features of the '<em>Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.VMImpl <em>VM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.VMImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getVM()
	 * @generated
	 */
	int VM = 20;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__BASE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__CORES = 1;

	/**
	 * The feature id for the '<em><b>Disk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__DISK = 2;

	/**
	 * The feature id for the '<em><b>Computing Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__COMPUTING_UNITS = 3;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__MEMORY = 4;

	/**
	 * The number of structural features of the '<em>VM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Cores Must Be Greater Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___CORES_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Computing Units Must Be Greater Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___COMPUTING_UNITS_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Memory Must Be Greater Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___MEMORY_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>VM can not be allocated</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___VM_CAN_NOT_BE_ALLOCATED__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Disk Must Be Greater Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___DISK_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The number of operations of the '<em>VM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ApplicationImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 21;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__BASE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>MIs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__MIS = 1;

	/**
	 * The feature id for the '<em><b>Input Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__INPUT_DATA = 2;

	/**
	 * The feature id for the '<em><b>Output Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__OUTPUT_DATA = 3;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PARAMETER = 4;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>MIs Must Be Greater Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___MIS_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Input Data Must Be Greater Than Or Equal To Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___INPUT_DATA_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Output Data Must Be Greater Than Or Equal To Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___OUTPUT_DATA_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ParameterImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RequestImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 23;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__BASE_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Vm Instantiation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__VM_INSTANTIATION = 1;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Renting Time Must Be Greater Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST___RENTING_TIME_MUST_BE_GREATER_THAN_ZERO__ZERO__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Instances Must Be Greater Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST___INSTANCES_MUST_BE_GREATER_THAN_ZERO__ZERO__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Request Must Be Sent To ACloud Provider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST___REQUEST_MUST_BE_SENT_TO_ACLOUD_PROVIDER__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Request Must Be Sent By AUser</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST___REQUEST_MUST_BE_SENT_BY_AUSER__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Request For AVM Not Offered In The Signed SLA By The User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST___REQUEST_FOR_AVM_NOT_OFFERED_IN_THE_SIGNED_SLA_BY_THE_USER__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.VMInstantiationImpl <em>VM Instantiation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.VMInstantiationImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getVMInstantiation()
	 * @generated
	 */
	int VM_INSTANTIATION = 24;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_INSTANTIATION__INSTANCES = 0;

	/**
	 * The feature id for the '<em><b>Vm Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_INSTANTIATION__VM_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Renting Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_INSTANTIATION__RENTING_TIME = 2;

	/**
	 * The number of structural features of the '<em>VM Instantiation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_INSTANTIATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>VM Instantiation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_INSTANTIATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.SubscribeImpl <em>Subscribe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.SubscribeImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getSubscribe()
	 * @generated
	 */
	int SUBSCRIBE = 25;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE__BASE_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE__MAX_TIME = 1;

	/**
	 * The number of structural features of the '<em>Subscribe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Max Time Must Be Greater Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE___MAX_TIME_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Subscribe Must Be Sent To ACloud Provider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE___SUBSCRIBE_MUST_BE_SENT_TO_ACLOUD_PROVIDER__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Subscribe Must Be Sent By AUser</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE___SUBSCRIBE_MUST_BE_SENT_BY_AUSER__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Subscribe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.AppInstantiationImpl <em>App Instantiation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.AppInstantiationImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getAppInstantiation()
	 * @generated
	 */
	int APP_INSTANTIATION = 26;

	/**
	 * The feature id for the '<em><b>Application Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_INSTANTIATION__APPLICATION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_INSTANTIATION__INSTANCES = 1;

	/**
	 * The number of structural features of the '<em>App Instantiation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_INSTANTIATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>App Instantiation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_INSTANTIATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ExecuteImpl <em>Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ExecuteImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getExecute()
	 * @generated
	 */
	int EXECUTE = 27;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE__BASE_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>App Instantiation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE__APP_INSTANTIATION = 1;

	/**
	 * The number of structural features of the '<em>Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Instances Must Be Greater Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE___INSTANCES_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Execute Must Be Sent To ACloud Provider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE___EXECUTE_MUST_BE_SENT_TO_ACLOUD_PROVIDER__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Execute Must Be Sent By AUser</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE___EXECUTE_MUST_BE_SENT_BY_AUSER__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Number Of App Instantiation Collections Must Be Equal Than Total VM Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE___NUMBER_OF_APP_INSTANTIATION_COLLECTIONS_MUST_BE_EQUAL_THAN_TOTAL_VM_INSTANCES__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The number of operations of the '<em>Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UserImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getUser()
	 * @generated
	 */
	int USER = 28;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__BASE_LIFELINE = 0;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__INSTANCES = 1;

	/**
	 * The feature id for the '<em><b>Sla</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SLA = 2;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>User Must Have AExecute Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___USER_MUST_HAVE_AEXECUTE_MESSAGE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>User Must Have ARequest Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___USER_MUST_HAVE_AREQUEST_MESSAGE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>User Must Sign AVM SLA Offered By The Cloud Provider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___USER_MUST_SIGN_AVM_SLA_OFFERED_BY_THE_CLOUD_PROVIDER__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>User Must Have AResume Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___USER_MUST_HAVE_ARESUME_MESSAGE__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.CloudInfrastructureImpl <em>Cloud Infrastructure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.CloudInfrastructureImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getCloudInfrastructure()
	 * @generated
	 */
	int CLOUD_INFRASTRUCTURE = 29;

	/**
	 * The feature id for the '<em><b>Datacenter Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_INFRASTRUCTURE__DATACENTER_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_INFRASTRUCTURE__BASE_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_INFRASTRUCTURE__NETWORK = 2;

	/**
	 * The number of structural features of the '<em>Cloud Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_INFRASTRUCTURE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Datacenter Elements instances Must Be Greatter Than Or Equal To Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_INFRASTRUCTURE___DATACENTER_ELEMENTS_INSTANCES_MUST_BE_GREATTER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Datacenter Elements instances Should Be Greatter Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_INFRASTRUCTURE___DATACENTER_ELEMENTS_INSTANCES_SHOULD_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Cloud Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_INFRASTRUCTURE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.DataCenterElementImpl <em>Data Center Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.DataCenterElementImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getDataCenterElement()
	 * @generated
	 */
	int DATA_CENTER_ELEMENT = 30;

	/**
	 * The feature id for the '<em><b>Number Of Data Centers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER_ELEMENT__NUMBER_OF_DATA_CENTERS = 0;

	/**
	 * The feature id for the '<em><b>Data Center Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER_ELEMENT__DATA_CENTER_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Data Center Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Center Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.PriorityUserImpl <em>Priority User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.PriorityUserImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getPriorityUser()
	 * @generated
	 */
	int PRIORITY_USER = 31;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_USER__BASE_LIFELINE = USER__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_USER__INSTANCES = USER__INSTANCES;

	/**
	 * The feature id for the '<em><b>Sla</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_USER__SLA = USER__SLA;

	/**
	 * The number of structural features of the '<em>Priority User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_USER_FEATURE_COUNT = USER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>User Must Have AExecute Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_USER___USER_MUST_HAVE_AEXECUTE_MESSAGE__DIAGNOSTICCHAIN_MAP = USER___USER_MUST_HAVE_AEXECUTE_MESSAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>User Must Have ARequest Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_USER___USER_MUST_HAVE_AREQUEST_MESSAGE__DIAGNOSTICCHAIN_MAP = USER___USER_MUST_HAVE_AREQUEST_MESSAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>User Must Sign AVM SLA Offered By The Cloud Provider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_USER___USER_MUST_SIGN_AVM_SLA_OFFERED_BY_THE_CLOUD_PROVIDER__DIAGNOSTICCHAIN_MAP = USER___USER_MUST_SIGN_AVM_SLA_OFFERED_BY_THE_CLOUD_PROVIDER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>User Must Have AResume Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_USER___USER_MUST_HAVE_ARESUME_MESSAGE__DIAGNOSTICCHAIN_MAP = USER___USER_MUST_HAVE_ARESUME_MESSAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Priority User has been modeled but no machine has been reserved</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_USER___PRIORITY_USER_HAS_BEEN_MODELED_BUT_NO_MACHINE_HAS_BEEN_RESERVED__DIAGNOSTICCHAIN_MAP = USER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Priority User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_USER_OPERATION_COUNT = USER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RegularUserImpl <em>Regular User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RegularUserImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getRegularUser()
	 * @generated
	 */
	int REGULAR_USER = 32;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_USER__BASE_LIFELINE = USER__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_USER__INSTANCES = USER__INSTANCES;

	/**
	 * The feature id for the '<em><b>Sla</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_USER__SLA = USER__SLA;

	/**
	 * The number of structural features of the '<em>Regular User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_USER_FEATURE_COUNT = USER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>User Must Have AExecute Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_USER___USER_MUST_HAVE_AEXECUTE_MESSAGE__DIAGNOSTICCHAIN_MAP = USER___USER_MUST_HAVE_AEXECUTE_MESSAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>User Must Have ARequest Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_USER___USER_MUST_HAVE_AREQUEST_MESSAGE__DIAGNOSTICCHAIN_MAP = USER___USER_MUST_HAVE_AREQUEST_MESSAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>User Must Sign AVM SLA Offered By The Cloud Provider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_USER___USER_MUST_SIGN_AVM_SLA_OFFERED_BY_THE_CLOUD_PROVIDER__DIAGNOSTICCHAIN_MAP = USER___USER_MUST_SIGN_AVM_SLA_OFFERED_BY_THE_CLOUD_PROVIDER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>User Must Have AResume Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_USER___USER_MUST_HAVE_ARESUME_MESSAGE__DIAGNOSTICCHAIN_MAP = USER___USER_MUST_HAVE_ARESUME_MESSAGE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Regular User Must Have ASubscribe Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_USER___REGULAR_USER_MUST_HAVE_ASUBSCRIBE_MESSAGE__DIAGNOSTICCHAIN_MAP = USER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Regular User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_USER_OPERATION_COUNT = USER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ResumeImpl <em>Resume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ResumeImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getResume()
	 * @generated
	 */
	int RESUME = 33;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__BASE_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Resume Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__RESUME_TIME = 1;

	/**
	 * The number of structural features of the '<em>Resume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Resume Time is at least twice as long as the renting time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME___RESUME_TIME_IS_AT_LEAST_TWICE_AS_LONG_AS_THE_RENTING_TIME__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Resume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ResponseOfferedVMsImpl <em>Response Offered VMs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ResponseOfferedVMsImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getResponseOfferedVMs()
	 * @generated
	 */
	int RESPONSE_OFFERED_VMS = 34;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_OFFERED_VMS__BASE_MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Response Offered VMs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_OFFERED_VMS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Response Offered VMs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_OFFERED_VMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.OkImpl <em>Ok</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.OkImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getOk()
	 * @generated
	 */
	int OK = 35;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK__BASE_MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Ok</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ok</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.TimeoutRentingImpl <em>Timeout Renting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.TimeoutRentingImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getTimeoutRenting()
	 * @generated
	 */
	int TIMEOUT_RENTING = 36;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_RENTING__BASE_MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Timeout Renting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_RENTING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Timeout Renting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_RENTING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.NotifyImpl <em>Notify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.NotifyImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getNotify()
	 * @generated
	 */
	int NOTIFY = 37;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY__BASE_MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Notify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Notify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.TimeoutSubscriptionImpl <em>Timeout Subscription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.TimeoutSubscriptionImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getTimeoutSubscription()
	 * @generated
	 */
	int TIMEOUT_SUBSCRIPTION = 38;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_SUBSCRIPTION__BASE_MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Timeout Subscription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_SUBSCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Timeout Subscription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_SUBSCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RequestOfferedVMsImpl <em>Request Offered VMs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RequestOfferedVMsImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getRequestOfferedVMs()
	 * @generated
	 */
	int REQUEST_OFFERED_VMS = 39;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OFFERED_VMS__BASE_MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Request Offered VMs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OFFERED_VMS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Request Offered VMs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OFFERED_VMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ResponseImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getResponse()
	 * @generated
	 */
	int RESPONSE = 40;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__BASE_MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RefuseImpl <em>Refuse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RefuseImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getRefuse()
	 * @generated
	 */
	int REFUSE = 41;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUSE__BASE_MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Refuse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Refuse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.BandwidthUnit <em>Bandwidth Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.BandwidthUnit
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getBandwidthUnit()
	 * @generated
	 */
	int BANDWIDTH_UNIT = 42;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.SizeUnit <em>Size Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.SizeUnit
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getSizeUnit()
	 * @generated
	 */
	int SIZE_UNIT = 43;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.TimeUnit <em>Time Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.TimeUnit
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getTimeUnit()
	 * @generated
	 */
	int TIME_UNIT = 44;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.MachineType <em>Machine Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.MachineType
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getMachineType()
	 * @generated
	 */
	int MACHINE_TYPE = 45;

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenter <em>Data Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Center</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenter
	 * @generated
	 */
	EClass getDataCenter();

	/**
	 * Returns the meta object for the containment reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenter#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenter#getNetwork()
	 * @see #getDataCenter()
	 * @generated
	 */
	EReference getDataCenter_Network();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenter#getRackElements <em>Rack Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rack Elements</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenter#getRackElements()
	 * @see #getDataCenter()
	 * @generated
	 */
	EReference getDataCenter_RackElements();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenter#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenter#getBase_Component()
	 * @see #getDataCenter()
	 * @generated
	 */
	EReference getDataCenter_Base_Component();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenter#rackElements_instances_Should_Be_Greatter_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Rack Elements instances Should Be Greatter Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rack Elements instances Should Be Greatter Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenter#rackElements_instances_Should_Be_Greatter_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDataCenter__RackElements_instances_Should_Be_Greatter_Than_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenter#rackElements_instances_Must_Be_Greatter_Than_Or_Equal_To_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Rack Elements instances Must Be Greatter Than Or Equal To Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rack Elements instances Must Be Greatter Than Or Equal To Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenter#rackElements_instances_Must_Be_Greatter_Than_Or_Equal_To_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDataCenter__RackElements_instances_Must_Be_Greatter_Than_Or_Equal_To_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Bandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bandwidth</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Bandwidth
	 * @generated
	 */
	EClass getBandwidth();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Bandwidth#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Bandwidth#getValue()
	 * @see #getBandwidth()
	 * @generated
	 */
	EAttribute getBandwidth_Value();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Bandwidth#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Bandwidth#getUnit()
	 * @see #getBandwidth()
	 * @generated
	 */
	EAttribute getBandwidth_Unit();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement <em>Rack Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rack Element</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement
	 * @generated
	 */
	EClass getRackElement();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement#getNumberOfRacks <em>Number Of Racks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Racks</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement#getNumberOfRacks()
	 * @see #getRackElement()
	 * @generated
	 */
	EAttribute getRackElement_NumberOfRacks();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement#getRackType <em>Rack Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rack Type</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement#getRackType()
	 * @see #getRackElement()
	 * @generated
	 */
	EReference getRackElement_RackType();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Rack <em>Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rack</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Rack
	 * @generated
	 */
	EClass getRack();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Rack#getMachinesPerBoard <em>Machines Per Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Machines Per Board</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Rack#getMachinesPerBoard()
	 * @see #getRack()
	 * @generated
	 */
	EAttribute getRack_MachinesPerBoard();

	/**
	 * Returns the meta object for the containment reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Rack#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Rack#getNetwork()
	 * @see #getRack()
	 * @generated
	 */
	EReference getRack_Network();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Rack#getBoards <em>Boards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boards</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Rack#getBoards()
	 * @see #getRack()
	 * @generated
	 */
	EAttribute getRack_Boards();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Rack#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Rack#getBase_Component()
	 * @see #getRack()
	 * @generated
	 */
	EReference getRack_Base_Component();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Rack#boards_Must_Be_Greatter_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Boards Must Be Greatter Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Boards Must Be Greatter Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Rack#boards_Must_Be_Greatter_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRack__Boards_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Rack#machinesPerBoard_Must_Be_Greatter_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Machines Per Board Must Be Greatter Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Machines Per Board Must Be Greatter Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Rack#machinesPerBoard_Must_Be_Greatter_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRack__MachinesPerBoard_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Machine#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Machine#getBase_Component()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Base_Component();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Machine#getCpu <em>Cpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cpu</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Machine#getCpu()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Cpu();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Machine#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Memory</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Machine#getMemory()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Memory();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Machine#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Storage</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Machine#getStorage()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Storage();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CPU <em>CPU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CPU</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CPU
	 * @generated
	 */
	EClass getCPU();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CPU#getCores <em>Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cores</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CPU#getCores()
	 * @see #getCPU()
	 * @generated
	 */
	EAttribute getCPU_Cores();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CPU#getMIPS <em>MIPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MIPS</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CPU#getMIPS()
	 * @see #getCPU()
	 * @generated
	 */
	EAttribute getCPU_MIPS();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CPU#MIPS_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>MIPS Must Be Greater Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>MIPS Must Be Greater Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CPU#MIPS_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCPU__MIPS_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CPU#cores_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Cores Must Be Greater Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cores Must Be Greater Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CPU#cores_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCPU__Cores_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Hardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Hardware
	 * @generated
	 */
	EClass getHardware();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Hardware#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Hardware#getBase_Component()
	 * @see #getHardware()
	 * @generated
	 */
	EReference getHardware_Base_Component();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Memory
	 * @generated
	 */
	EClass getMemory();

	/**
	 * Returns the meta object for the containment reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Memory#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capacity</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Memory#getCapacity()
	 * @see #getMemory()
	 * @generated
	 */
	EReference getMemory_Capacity();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Memory#getLatency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Latency</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Memory#getLatency()
	 * @see #getMemory()
	 * @generated
	 */
	EReference getMemory_Latency();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Memory#capacity_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Capacity Must Be Greater Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Capacity Must Be Greater Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Memory#capacity_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMemory__Capacity_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Size</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Size
	 * @generated
	 */
	EClass getSize();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Size#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Size#getValue()
	 * @see #getSize()
	 * @generated
	 */
	EAttribute getSize_Value();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Size#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Size#getUnit()
	 * @see #getSize()
	 * @generated
	 */
	EAttribute getSize_Unit();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Latency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Latency</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Latency
	 * @generated
	 */
	EClass getLatency();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Latency#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Latency#getName()
	 * @see #getLatency()
	 * @generated
	 */
	EAttribute getLatency_Name();

	/**
	 * Returns the meta object for the containment reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Latency#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Latency#getTime()
	 * @see #getLatency()
	 * @generated
	 */
	EReference getLatency_Time();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Time#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Time#getValue()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Value();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Time#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Time#getUnit()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Unit();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Storage
	 * @generated
	 */
	EClass getStorage();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Storage#getNumberOfDrives <em>Number Of Drives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Drives</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Storage#getNumberOfDrives()
	 * @see #getStorage()
	 * @generated
	 */
	EAttribute getStorage_NumberOfDrives();

	/**
	 * Returns the meta object for the containment reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Storage#getDriveCapacity <em>Drive Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drive Capacity</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Storage#getDriveCapacity()
	 * @see #getStorage()
	 * @generated
	 */
	EReference getStorage_DriveCapacity();

	/**
	 * Returns the meta object for the containment reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Storage#getReadBandwidth <em>Read Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Read Bandwidth</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Storage#getReadBandwidth()
	 * @see #getStorage()
	 * @generated
	 */
	EReference getStorage_ReadBandwidth();

	/**
	 * Returns the meta object for the containment reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Storage#getWriteBandwidth <em>Write Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Write Bandwidth</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Storage#getWriteBandwidth()
	 * @see #getStorage()
	 * @generated
	 */
	EReference getStorage_WriteBandwidth();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Storage#numberOfDrives_Must_Be_Greatter_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Number Of Drives Must Be Greatter Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Number Of Drives Must Be Greatter Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Storage#numberOfDrives_Must_Be_Greatter_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getStorage__NumberOfDrives_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Storage#driveCapacity_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Drive Capacity Must Be Greater Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Drive Capacity Must Be Greater Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Storage#driveCapacity_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getStorage__DriveCapacity_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Storage#readBandwidth_Must_Be_Greatter_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Read Bandwidth Must Be Greatter Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Bandwidth Must Be Greatter Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Storage#readBandwidth_Must_Be_Greatter_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getStorage__ReadBandwidth_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Storage#writeBandwidth_Must_Be_Greatter_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Write Bandwidth Must Be Greatter Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write Bandwidth Must Be Greatter Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Storage#writeBandwidth_Must_Be_Greatter_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getStorage__WriteBandwidth_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.ComputingRack <em>Computing Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computing Rack</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.ComputingRack
	 * @generated
	 */
	EClass getComputingRack();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.ComputingRack#getMachineType <em>Machine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Machine Type</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.ComputingRack#getMachineType()
	 * @see #getComputingRack()
	 * @generated
	 */
	EReference getComputingRack_MachineType();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.ComputingMachine <em>Computing Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computing Machine</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.ComputingMachine
	 * @generated
	 */
	EClass getComputingMachine();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.ComputingMachine#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.ComputingMachine#getType()
	 * @see #getComputingMachine()
	 * @generated
	 */
	EAttribute getComputingMachine_Type();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.StorageRack <em>Storage Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Rack</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.StorageRack
	 * @generated
	 */
	EClass getStorageRack();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.StorageRack#getMachineType <em>Machine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Machine Type</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.StorageRack#getMachineType()
	 * @see #getStorageRack()
	 * @generated
	 */
	EReference getStorageRack_MachineType();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.StorageMachine <em>Storage Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Machine</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.StorageMachine
	 * @generated
	 */
	EClass getStorageMachine();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProvider <em>Cloud Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Provider</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProvider
	 * @generated
	 */
	EClass getCloudProvider();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProvider#getResourceAllocationPolicy <em>Resource Allocation Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Allocation Policy</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProvider#getResourceAllocationPolicy()
	 * @see #getCloudProvider()
	 * @generated
	 */
	EAttribute getCloudProvider_ResourceAllocationPolicy();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProvider#getBase_Lifeline <em>Base Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Lifeline</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProvider#getBase_Lifeline()
	 * @see #getCloudProvider()
	 * @generated
	 */
	EReference getCloudProvider_Base_Lifeline();

	/**
	 * Returns the meta object for the reference list '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProvider#getSla <em>Sla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sla</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProvider#getSla()
	 * @see #getCloudProvider()
	 * @generated
	 */
	EReference getCloudProvider_Sla();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProvider#getOffer <em>Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offer</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProvider#getOffer()
	 * @see #getCloudProvider()
	 * @generated
	 */
	EAttribute getCloudProvider_Offer();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProvider#CloudProvider_Must_Offer_Once_Each_VM_For_Each_SLA_Type(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Cloud Provider Must Offer Once Each VM For Each SLA Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cloud Provider Must Offer Once Each VM For Each SLA Type</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProvider#CloudProvider_Must_Offer_Once_Each_VM_For_Each_SLA_Type(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCloudProvider__CloudProvider_Must_Offer_Once_Each_VM_For_Each_SLA_Type__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProvider#CloudProvider_offer_must_be_greater_than_or_equal_to_zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Cloud Provider offer must be greater than or equal to zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cloud Provider offer must be greater than or equal to zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProvider#CloudProvider_offer_must_be_greater_than_or_equal_to_zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCloudProvider__CloudProvider_offer_must_be_greater_than_or_equal_to_zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.SLA <em>SLA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SLA</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.SLA
	 * @generated
	 */
	EClass getSLA();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.SLA#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.SLA#getBase_Component()
	 * @see #getSLA()
	 * @generated
	 */
	EReference getSLA_Base_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.SLA#getVmcost <em>Vmcost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vmcost</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.SLA#getVmcost()
	 * @see #getSLA()
	 * @generated
	 */
	EReference getSLA_Vmcost();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.SLA#SLA_compensation_must_be_grater_than_or_equal_to_zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>SLA compensation must be grater than or equal to zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>SLA compensation must be grater than or equal to zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.SLA#SLA_compensation_must_be_grater_than_or_equal_to_zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSLA__SLA_compensation_must_be_grater_than_or_equal_to_zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.SLA#SLA_discount_must_be_grater_than_or_equal_to_zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>SLA discount must be grater than or equal to zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>SLA discount must be grater than or equal to zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.SLA#SLA_discount_must_be_grater_than_or_equal_to_zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSLA__SLA_discount_must_be_grater_than_or_equal_to_zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.SLA#SLA_incpriority_must_be_grater_than_or_equal_to_zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>SLA incpriority must be grater than or equal to zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>SLA incpriority must be grater than or equal to zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.SLA#SLA_incpriority_must_be_grater_than_or_equal_to_zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSLA__SLA_incpriority_must_be_grater_than_or_equal_to_zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.SLA#SLA_base_cost_must_be_grater_than_or_equal_to_zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>SLA base cost must be grater than or equal to zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>SLA base cost must be grater than or equal to zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.SLA#SLA_base_cost_must_be_grater_than_or_equal_to_zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSLA__SLA_base_cost_must_be_grater_than_or_equal_to_zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.SLA#CloudProvider_must_offer_once_each_VM_for_each_SLA_type(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Cloud Provider must offer once each VM for each SLA type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cloud Provider must offer once each VM for each SLA type</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.SLA#CloudProvider_must_offer_once_each_VM_for_each_SLA_type(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSLA__CloudProvider_must_offer_once_each_VM_for_each_SLA_type__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VMCost <em>VM Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VM Cost</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VMCost
	 * @generated
	 */
	EClass getVMCost();

	/**
	 * Returns the meta object for the containment reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VMCost#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VMCost#getBase()
	 * @see #getVMCost()
	 * @generated
	 */
	EReference getVMCost_Base();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VMCost#getIncpriority <em>Incpriority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incpriority</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VMCost#getIncpriority()
	 * @see #getVMCost()
	 * @generated
	 */
	EAttribute getVMCost_Incpriority();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VMCost#getDiscount <em>Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discount</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VMCost#getDiscount()
	 * @see #getVMCost()
	 * @generated
	 */
	EAttribute getVMCost_Discount();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VMCost#getCompensation <em>Compensation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compensation</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VMCost#getCompensation()
	 * @see #getVMCost()
	 * @generated
	 */
	EAttribute getVMCost_Compensation();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VMCost#getVm <em>Vm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vm</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VMCost#getVm()
	 * @see #getVMCost()
	 * @generated
	 */
	EReference getVMCost_Vm();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Cost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cost</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Cost
	 * @generated
	 */
	EClass getCost();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Cost#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Cost#getValue()
	 * @see #getCost()
	 * @generated
	 */
	EAttribute getCost_Value();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Cost#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Cost#getRate()
	 * @see #getCost()
	 * @generated
	 */
	EAttribute getCost_Rate();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VM <em>VM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VM</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VM
	 * @generated
	 */
	EClass getVM();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VM#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VM#getBase_Component()
	 * @see #getVM()
	 * @generated
	 */
	EReference getVM_Base_Component();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VM#getCores <em>Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cores</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VM#getCores()
	 * @see #getVM()
	 * @generated
	 */
	EAttribute getVM_Cores();

	/**
	 * Returns the meta object for the containment reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VM#getDisk <em>Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Disk</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VM#getDisk()
	 * @see #getVM()
	 * @generated
	 */
	EReference getVM_Disk();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VM#getComputingUnits <em>Computing Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Computing Units</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VM#getComputingUnits()
	 * @see #getVM()
	 * @generated
	 */
	EAttribute getVM_ComputingUnits();

	/**
	 * Returns the meta object for the containment reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VM#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Memory</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VM#getMemory()
	 * @see #getVM()
	 * @generated
	 */
	EReference getVM_Memory();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VM#cores_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Cores Must Be Greater Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cores Must Be Greater Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VM#cores_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVM__Cores_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VM#computingUnits_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Computing Units Must Be Greater Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Computing Units Must Be Greater Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VM#computingUnits_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVM__ComputingUnits_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VM#memory_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Memory Must Be Greater Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Memory Must Be Greater Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VM#memory_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVM__Memory_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VM#VM_can_not_be_allocated(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>VM can not be allocated</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>VM can not be allocated</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VM#VM_can_not_be_allocated(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVM__VM_can_not_be_allocated__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VM#disk_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Disk Must Be Greater Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Disk Must Be Greater Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VM#disk_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVM__Disk_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Application#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Application#getBase_Component()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Base_Component();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Application#getMIs <em>MIs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MIs</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Application#getMIs()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_MIs();

	/**
	 * Returns the meta object for the containment reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Application#getInputData <em>Input Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Data</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Application#getInputData()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_InputData();

	/**
	 * Returns the meta object for the containment reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Application#getOutputData <em>Output Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Data</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Application#getOutputData()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_OutputData();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Application#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Application#getParameter()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Parameter();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Application#MIs_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>MIs Must Be Greater Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>MIs Must Be Greater Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Application#MIs_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getApplication__MIs_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Application#inputData_Must_Be_Greater_Than_Or_Equal_To_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Input Data Must Be Greater Than Or Equal To Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Input Data Must Be Greater Than Or Equal To Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Application#inputData_Must_Be_Greater_Than_Or_Equal_To_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getApplication__InputData_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Application#outputData_Must_Be_Greater_Than_Or_Equal_To_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Output Data Must Be Greater Than Or Equal To Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Output Data Must Be Greater Than Or Equal To Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Application#outputData_Must_Be_Greater_Than_Or_Equal_To_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getApplication__OutputData_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Parameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Parameter#getDescription()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Description();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Request
	 * @generated
	 */
	EClass getRequest();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Request#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Request#getBase_Message()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Base_Message();

	/**
	 * Returns the meta object for the containment reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Request#getVmInstantiation <em>Vm Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vm Instantiation</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Request#getVmInstantiation()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_VmInstantiation();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Request#rentingTime_Must_Be_Greater_Than__Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Renting Time Must Be Greater Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Renting Time Must Be Greater Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Request#rentingTime_Must_Be_Greater_Than__Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRequest__RentingTime_Must_Be_Greater_Than__Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Request#instances_Must_Be_Greater_Than__Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Instances Must Be Greater Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Instances Must Be Greater Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Request#instances_Must_Be_Greater_Than__Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRequest__Instances_Must_Be_Greater_Than__Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Request#Request_Must_Be_Sent_To_A_CloudProvider(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Request Must Be Sent To ACloud Provider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Request Must Be Sent To ACloud Provider</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Request#Request_Must_Be_Sent_To_A_CloudProvider(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRequest__Request_Must_Be_Sent_To_A_CloudProvider__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Request#Request_Must_Be_Sent_By_A_User(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Request Must Be Sent By AUser</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Request Must Be Sent By AUser</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Request#Request_Must_Be_Sent_By_A_User(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRequest__Request_Must_Be_Sent_By_A_User__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Request#Request_For_A_VM_Not_Offered_In_The_Signed_SLA_By_The_User(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Request For AVM Not Offered In The Signed SLA By The User</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Request For AVM Not Offered In The Signed SLA By The User</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Request#Request_For_A_VM_Not_Offered_In_The_Signed_SLA_By_The_User(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRequest__Request_For_A_VM_Not_Offered_In_The_Signed_SLA_By_The_User__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VMInstantiation <em>VM Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VM Instantiation</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VMInstantiation
	 * @generated
	 */
	EClass getVMInstantiation();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VMInstantiation#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instances</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VMInstantiation#getInstances()
	 * @see #getVMInstantiation()
	 * @generated
	 */
	EAttribute getVMInstantiation_Instances();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VMInstantiation#getVmType <em>Vm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vm Type</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VMInstantiation#getVmType()
	 * @see #getVMInstantiation()
	 * @generated
	 */
	EReference getVMInstantiation_VmType();

	/**
	 * Returns the meta object for the containment reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VMInstantiation#getRentingTime <em>Renting Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Renting Time</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VMInstantiation#getRentingTime()
	 * @see #getVMInstantiation()
	 * @generated
	 */
	EReference getVMInstantiation_RentingTime();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Subscribe <em>Subscribe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscribe</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Subscribe
	 * @generated
	 */
	EClass getSubscribe();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Subscribe#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Subscribe#getBase_Message()
	 * @see #getSubscribe()
	 * @generated
	 */
	EReference getSubscribe_Base_Message();

	/**
	 * Returns the meta object for the containment reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Subscribe#getMaxTime <em>Max Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Time</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Subscribe#getMaxTime()
	 * @see #getSubscribe()
	 * @generated
	 */
	EReference getSubscribe_MaxTime();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Subscribe#maxTime_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Max Time Must Be Greater Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Max Time Must Be Greater Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Subscribe#maxTime_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSubscribe__MaxTime_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Subscribe#Subscribe_Must_Be_Sent_To_A_CloudProvider(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subscribe Must Be Sent To ACloud Provider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Subscribe Must Be Sent To ACloud Provider</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Subscribe#Subscribe_Must_Be_Sent_To_A_CloudProvider(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSubscribe__Subscribe_Must_Be_Sent_To_A_CloudProvider__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Subscribe#Subscribe_Must_Be_Sent_By_A_User(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subscribe Must Be Sent By AUser</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Subscribe Must Be Sent By AUser</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Subscribe#Subscribe_Must_Be_Sent_By_A_User(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSubscribe__Subscribe_Must_Be_Sent_By_A_User__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.AppInstantiation <em>App Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Instantiation</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.AppInstantiation
	 * @generated
	 */
	EClass getAppInstantiation();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.AppInstantiation#getApplicationType <em>Application Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Application Type</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.AppInstantiation#getApplicationType()
	 * @see #getAppInstantiation()
	 * @generated
	 */
	EReference getAppInstantiation_ApplicationType();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.AppInstantiation#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instances</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.AppInstantiation#getInstances()
	 * @see #getAppInstantiation()
	 * @generated
	 */
	EAttribute getAppInstantiation_Instances();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Execute <em>Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execute</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Execute
	 * @generated
	 */
	EClass getExecute();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Execute#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Execute#getBase_Message()
	 * @see #getExecute()
	 * @generated
	 */
	EReference getExecute_Base_Message();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Execute#getAppInstantiation <em>App Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>App Instantiation</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Execute#getAppInstantiation()
	 * @see #getExecute()
	 * @generated
	 */
	EReference getExecute_AppInstantiation();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Execute#instances_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Instances Must Be Greater Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Instances Must Be Greater Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Execute#instances_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getExecute__Instances_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Execute#Execute_Must_Be_Sent_To_A_CloudProvider(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Execute Must Be Sent To ACloud Provider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute Must Be Sent To ACloud Provider</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Execute#Execute_Must_Be_Sent_To_A_CloudProvider(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getExecute__Execute_Must_Be_Sent_To_A_CloudProvider__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Execute#Execute_Must_Be_Sent_By_A_User(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Execute Must Be Sent By AUser</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute Must Be Sent By AUser</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Execute#Execute_Must_Be_Sent_By_A_User(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getExecute__Execute_Must_Be_Sent_By_A_User__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Execute#number_Of_AppInstantiation_Collections_Must_Be_Equal_Than_Total_VM_Instances(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Number Of App Instantiation Collections Must Be Equal Than Total VM Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Number Of App Instantiation Collections Must Be Equal Than Total VM Instances</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Execute#number_Of_AppInstantiation_Collections_Must_Be_Equal_Than_Total_VM_Instances(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getExecute__Number_Of_AppInstantiation_Collections_Must_Be_Equal_Than_Total_VM_Instances__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.User#getBase_Lifeline <em>Base Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Lifeline</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.User#getBase_Lifeline()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Base_Lifeline();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.User#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instances</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.User#getInstances()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Instances();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.User#getSla <em>Sla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sla</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.User#getSla()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Sla();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.User#User_Must_Have_A_Execute_Message(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>User Must Have AExecute Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>User Must Have AExecute Message</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.User#User_Must_Have_A_Execute_Message(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUser__User_Must_Have_A_Execute_Message__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.User#User_Must_Have_A_Request_Message(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>User Must Have ARequest Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>User Must Have ARequest Message</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.User#User_Must_Have_A_Request_Message(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUser__User_Must_Have_A_Request_Message__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.User#User_Must_Sign_A_VM_SLA_Offered_By_The_CloudProvider(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>User Must Sign AVM SLA Offered By The Cloud Provider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>User Must Sign AVM SLA Offered By The Cloud Provider</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.User#User_Must_Sign_A_VM_SLA_Offered_By_The_CloudProvider(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUser__User_Must_Sign_A_VM_SLA_Offered_By_The_CloudProvider__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.User#User_Must_Have_A_Resume_Message(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>User Must Have AResume Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>User Must Have AResume Message</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.User#User_Must_Have_A_Resume_Message(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUser__User_Must_Have_A_Resume_Message__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudInfrastructure <em>Cloud Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Infrastructure</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CloudInfrastructure
	 * @generated
	 */
	EClass getCloudInfrastructure();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudInfrastructure#getDatacenterElements <em>Datacenter Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datacenter Elements</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CloudInfrastructure#getDatacenterElements()
	 * @see #getCloudInfrastructure()
	 * @generated
	 */
	EReference getCloudInfrastructure_DatacenterElements();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudInfrastructure#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CloudInfrastructure#getBase_Component()
	 * @see #getCloudInfrastructure()
	 * @generated
	 */
	EReference getCloudInfrastructure_Base_Component();

	/**
	 * Returns the meta object for the containment reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudInfrastructure#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CloudInfrastructure#getNetwork()
	 * @see #getCloudInfrastructure()
	 * @generated
	 */
	EReference getCloudInfrastructure_Network();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudInfrastructure#datacenterElements_instances_Must_Be_Greatter_Than_Or_Equal_To_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Datacenter Elements instances Must Be Greatter Than Or Equal To Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Datacenter Elements instances Must Be Greatter Than Or Equal To Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CloudInfrastructure#datacenterElements_instances_Must_Be_Greatter_Than_Or_Equal_To_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCloudInfrastructure__DatacenterElements_instances_Must_Be_Greatter_Than_Or_Equal_To_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudInfrastructure#datacenterElements_instances_Should_Be_Greatter_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Datacenter Elements instances Should Be Greatter Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Datacenter Elements instances Should Be Greatter Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CloudInfrastructure#datacenterElements_instances_Should_Be_Greatter_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCloudInfrastructure__DatacenterElements_instances_Should_Be_Greatter_Than_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenterElement <em>Data Center Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Center Element</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenterElement
	 * @generated
	 */
	EClass getDataCenterElement();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenterElement#getNumberOfDataCenters <em>Number Of Data Centers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Data Centers</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenterElement#getNumberOfDataCenters()
	 * @see #getDataCenterElement()
	 * @generated
	 */
	EAttribute getDataCenterElement_NumberOfDataCenters();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenterElement#getDataCenterType <em>Data Center Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Center Type</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenterElement#getDataCenterType()
	 * @see #getDataCenterElement()
	 * @generated
	 */
	EReference getDataCenterElement_DataCenterType();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.PriorityUser <em>Priority User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Priority User</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.PriorityUser
	 * @generated
	 */
	EClass getPriorityUser();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.PriorityUser#PriorityUser_has_been_modeled_but_no_machine_has_been_reserved(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Priority User has been modeled but no machine has been reserved</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Priority User has been modeled but no machine has been reserved</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.PriorityUser#PriorityUser_has_been_modeled_but_no_machine_has_been_reserved(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPriorityUser__PriorityUser_has_been_modeled_but_no_machine_has_been_reserved__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RegularUser <em>Regular User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular User</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.RegularUser
	 * @generated
	 */
	EClass getRegularUser();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RegularUser#RegularUser_Must_Have_A_Subscribe_Message(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Regular User Must Have ASubscribe Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Regular User Must Have ASubscribe Message</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.RegularUser#RegularUser_Must_Have_A_Subscribe_Message(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRegularUser__RegularUser_Must_Have_A_Subscribe_Message__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Resume <em>Resume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resume</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Resume
	 * @generated
	 */
	EClass getResume();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Resume#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Resume#getBase_Message()
	 * @see #getResume()
	 * @generated
	 */
	EReference getResume_Base_Message();

	/**
	 * Returns the meta object for the containment reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Resume#getResumeTime <em>Resume Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resume Time</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Resume#getResumeTime()
	 * @see #getResume()
	 * @generated
	 */
	EReference getResume_ResumeTime();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Resume#ResumeTime_is_at_least_twice_as_long_as_the_renting_time(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Resume Time is at least twice as long as the renting time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resume Time is at least twice as long as the renting time</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Resume#ResumeTime_is_at_least_twice_as_long_as_the_renting_time(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getResume__ResumeTime_is_at_least_twice_as_long_as_the_renting_time__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.ResponseOfferedVMs <em>Response Offered VMs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Offered VMs</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.ResponseOfferedVMs
	 * @generated
	 */
	EClass getResponseOfferedVMs();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.ResponseOfferedVMs#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.ResponseOfferedVMs#getBase_Message()
	 * @see #getResponseOfferedVMs()
	 * @generated
	 */
	EReference getResponseOfferedVMs_Base_Message();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Ok <em>Ok</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ok</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Ok
	 * @generated
	 */
	EClass getOk();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Ok#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Ok#getBase_Message()
	 * @see #getOk()
	 * @generated
	 */
	EReference getOk_Base_Message();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.TimeoutRenting <em>Timeout Renting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timeout Renting</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.TimeoutRenting
	 * @generated
	 */
	EClass getTimeoutRenting();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.TimeoutRenting#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.TimeoutRenting#getBase_Message()
	 * @see #getTimeoutRenting()
	 * @generated
	 */
	EReference getTimeoutRenting_Base_Message();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Notify <em>Notify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notify</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Notify
	 * @generated
	 */
	EClass getNotify();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Notify#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Notify#getBase_Message()
	 * @see #getNotify()
	 * @generated
	 */
	EReference getNotify_Base_Message();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.TimeoutSubscription <em>Timeout Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timeout Subscription</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.TimeoutSubscription
	 * @generated
	 */
	EClass getTimeoutSubscription();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.TimeoutSubscription#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.TimeoutSubscription#getBase_Message()
	 * @see #getTimeoutSubscription()
	 * @generated
	 */
	EReference getTimeoutSubscription_Base_Message();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RequestOfferedVMs <em>Request Offered VMs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Offered VMs</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.RequestOfferedVMs
	 * @generated
	 */
	EClass getRequestOfferedVMs();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RequestOfferedVMs#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.RequestOfferedVMs#getBase_Message()
	 * @see #getRequestOfferedVMs()
	 * @generated
	 */
	EReference getRequestOfferedVMs_Base_Message();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Response
	 * @generated
	 */
	EClass getResponse();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Response#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Response#getBase_Message()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_Base_Message();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Refuse <em>Refuse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refuse</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Refuse
	 * @generated
	 */
	EClass getRefuse();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Refuse#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Refuse#getBase_Message()
	 * @see #getRefuse()
	 * @generated
	 */
	EReference getRefuse_Base_Message();

	/**
	 * Returns the meta object for enum '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.BandwidthUnit <em>Bandwidth Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bandwidth Unit</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.BandwidthUnit
	 * @generated
	 */
	EEnum getBandwidthUnit();

	/**
	 * Returns the meta object for enum '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.SizeUnit <em>Size Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Size Unit</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.SizeUnit
	 * @generated
	 */
	EEnum getSizeUnit();

	/**
	 * Returns the meta object for enum '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.TimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Unit</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.TimeUnit
	 * @generated
	 */
	EEnum getTimeUnit();

	/**
	 * Returns the meta object for enum '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.MachineType <em>Machine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Machine Type</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.MachineType
	 * @generated
	 */
	EEnum getMachineType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UML2CloudProfileFactory getUML2CloudProfileFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.DataCenterImpl <em>Data Center</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.DataCenterImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getDataCenter()
		 * @generated
		 */
		EClass DATA_CENTER = eINSTANCE.getDataCenter();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CENTER__NETWORK = eINSTANCE.getDataCenter_Network();

		/**
		 * The meta object literal for the '<em><b>Rack Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CENTER__RACK_ELEMENTS = eINSTANCE.getDataCenter_RackElements();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CENTER__BASE_COMPONENT = eINSTANCE.getDataCenter_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Rack Elements instances Should Be Greatter Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_CENTER___RACK_ELEMENTS_INSTANCES_SHOULD_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDataCenter__RackElements_instances_Should_Be_Greatter_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Rack Elements instances Must Be Greatter Than Or Equal To Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_CENTER___RACK_ELEMENTS_INSTANCES_MUST_BE_GREATTER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDataCenter__RackElements_instances_Must_Be_Greatter_Than_Or_Equal_To_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.BandwidthImpl <em>Bandwidth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.BandwidthImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getBandwidth()
		 * @generated
		 */
		EClass BANDWIDTH = eINSTANCE.getBandwidth();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANDWIDTH__VALUE = eINSTANCE.getBandwidth_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANDWIDTH__UNIT = eINSTANCE.getBandwidth_Unit();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackElementImpl <em>Rack Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackElementImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getRackElement()
		 * @generated
		 */
		EClass RACK_ELEMENT = eINSTANCE.getRackElement();

		/**
		 * The meta object literal for the '<em><b>Number Of Racks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RACK_ELEMENT__NUMBER_OF_RACKS = eINSTANCE.getRackElement_NumberOfRacks();

		/**
		 * The meta object literal for the '<em><b>Rack Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RACK_ELEMENT__RACK_TYPE = eINSTANCE.getRackElement_RackType();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackImpl <em>Rack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getRack()
		 * @generated
		 */
		EClass RACK = eINSTANCE.getRack();

		/**
		 * The meta object literal for the '<em><b>Machines Per Board</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RACK__MACHINES_PER_BOARD = eINSTANCE.getRack_MachinesPerBoard();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RACK__NETWORK = eINSTANCE.getRack_Network();

		/**
		 * The meta object literal for the '<em><b>Boards</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RACK__BOARDS = eINSTANCE.getRack_Boards();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RACK__BASE_COMPONENT = eINSTANCE.getRack_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Boards Must Be Greatter Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RACK___BOARDS_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRack__Boards_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Machines Per Board Must Be Greatter Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RACK___MACHINES_PER_BOARD_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRack__MachinesPerBoard_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.MachineImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__BASE_COMPONENT = eINSTANCE.getMachine_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Cpu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__CPU = eINSTANCE.getMachine_Cpu();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__MEMORY = eINSTANCE.getMachine_Memory();

		/**
		 * The meta object literal for the '<em><b>Storage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__STORAGE = eINSTANCE.getMachine_Storage();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.CPUImpl <em>CPU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.CPUImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getCPU()
		 * @generated
		 */
		EClass CPU = eINSTANCE.getCPU();

		/**
		 * The meta object literal for the '<em><b>Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPU__CORES = eINSTANCE.getCPU_Cores();

		/**
		 * The meta object literal for the '<em><b>MIPS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPU__MIPS = eINSTANCE.getCPU_MIPS();

		/**
		 * The meta object literal for the '<em><b>MIPS Must Be Greater Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CPU___MIPS_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCPU__MIPS_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Cores Must Be Greater Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CPU___CORES_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCPU__Cores_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.HardwareImpl <em>Hardware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.HardwareImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getHardware()
		 * @generated
		 */
		EClass HARDWARE = eINSTANCE.getHardware();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE__BASE_COMPONENT = eINSTANCE.getHardware_Base_Component();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.MemoryImpl <em>Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.MemoryImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getMemory()
		 * @generated
		 */
		EClass MEMORY = eINSTANCE.getMemory();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY__CAPACITY = eINSTANCE.getMemory_Capacity();

		/**
		 * The meta object literal for the '<em><b>Latency</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY__LATENCY = eINSTANCE.getMemory_Latency();

		/**
		 * The meta object literal for the '<em><b>Capacity Must Be Greater Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEMORY___CAPACITY_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMemory__Capacity_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.SizeImpl <em>Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.SizeImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getSize()
		 * @generated
		 */
		EClass SIZE = eINSTANCE.getSize();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE__VALUE = eINSTANCE.getSize_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE__UNIT = eINSTANCE.getSize_Unit();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.LatencyImpl <em>Latency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.LatencyImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getLatency()
		 * @generated
		 */
		EClass LATENCY = eINSTANCE.getLatency();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATENCY__NAME = eINSTANCE.getLatency_Name();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LATENCY__TIME = eINSTANCE.getLatency_Time();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.TimeImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__VALUE = eINSTANCE.getTime_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__UNIT = eINSTANCE.getTime_Unit();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.StorageImpl <em>Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.StorageImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getStorage()
		 * @generated
		 */
		EClass STORAGE = eINSTANCE.getStorage();

		/**
		 * The meta object literal for the '<em><b>Number Of Drives</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE__NUMBER_OF_DRIVES = eINSTANCE.getStorage_NumberOfDrives();

		/**
		 * The meta object literal for the '<em><b>Drive Capacity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE__DRIVE_CAPACITY = eINSTANCE.getStorage_DriveCapacity();

		/**
		 * The meta object literal for the '<em><b>Read Bandwidth</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE__READ_BANDWIDTH = eINSTANCE.getStorage_ReadBandwidth();

		/**
		 * The meta object literal for the '<em><b>Write Bandwidth</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE__WRITE_BANDWIDTH = eINSTANCE.getStorage_WriteBandwidth();

		/**
		 * The meta object literal for the '<em><b>Number Of Drives Must Be Greatter Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORAGE___NUMBER_OF_DRIVES_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getStorage__NumberOfDrives_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Drive Capacity Must Be Greater Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORAGE___DRIVE_CAPACITY_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getStorage__DriveCapacity_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Read Bandwidth Must Be Greatter Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORAGE___READ_BANDWIDTH_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getStorage__ReadBandwidth_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Write Bandwidth Must Be Greatter Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORAGE___WRITE_BANDWIDTH_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getStorage__WriteBandwidth_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ComputingRackImpl <em>Computing Rack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ComputingRackImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getComputingRack()
		 * @generated
		 */
		EClass COMPUTING_RACK = eINSTANCE.getComputingRack();

		/**
		 * The meta object literal for the '<em><b>Machine Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTING_RACK__MACHINE_TYPE = eINSTANCE.getComputingRack_MachineType();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ComputingMachineImpl <em>Computing Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ComputingMachineImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getComputingMachine()
		 * @generated
		 */
		EClass COMPUTING_MACHINE = eINSTANCE.getComputingMachine();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTING_MACHINE__TYPE = eINSTANCE.getComputingMachine_Type();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.StorageRackImpl <em>Storage Rack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.StorageRackImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getStorageRack()
		 * @generated
		 */
		EClass STORAGE_RACK = eINSTANCE.getStorageRack();

		/**
		 * The meta object literal for the '<em><b>Machine Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE_RACK__MACHINE_TYPE = eINSTANCE.getStorageRack_MachineType();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.StorageMachineImpl <em>Storage Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.StorageMachineImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getStorageMachine()
		 * @generated
		 */
		EClass STORAGE_MACHINE = eINSTANCE.getStorageMachine();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.CloudProviderImpl <em>Cloud Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.CloudProviderImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getCloudProvider()
		 * @generated
		 */
		EClass CLOUD_PROVIDER = eINSTANCE.getCloudProvider();

		/**
		 * The meta object literal for the '<em><b>Resource Allocation Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_PROVIDER__RESOURCE_ALLOCATION_POLICY = eINSTANCE.getCloudProvider_ResourceAllocationPolicy();

		/**
		 * The meta object literal for the '<em><b>Base Lifeline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_PROVIDER__BASE_LIFELINE = eINSTANCE.getCloudProvider_Base_Lifeline();

		/**
		 * The meta object literal for the '<em><b>Sla</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_PROVIDER__SLA = eINSTANCE.getCloudProvider_Sla();

		/**
		 * The meta object literal for the '<em><b>Offer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_PROVIDER__OFFER = eINSTANCE.getCloudProvider_Offer();

		/**
		 * The meta object literal for the '<em><b>Cloud Provider Must Offer Once Each VM For Each SLA Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOUD_PROVIDER___CLOUD_PROVIDER_MUST_OFFER_ONCE_EACH_VM_FOR_EACH_SLA_TYPE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCloudProvider__CloudProvider_Must_Offer_Once_Each_VM_For_Each_SLA_Type__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Cloud Provider offer must be greater than or equal to zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOUD_PROVIDER___CLOUD_PROVIDER_OFFER_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCloudProvider__CloudProvider_offer_must_be_greater_than_or_equal_to_zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.SLAImpl <em>SLA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.SLAImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getSLA()
		 * @generated
		 */
		EClass SLA = eINSTANCE.getSLA();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLA__BASE_COMPONENT = eINSTANCE.getSLA_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Vmcost</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLA__VMCOST = eINSTANCE.getSLA_Vmcost();

		/**
		 * The meta object literal for the '<em><b>SLA compensation must be grater than or equal to zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SLA___SLA_COMPENSATION_MUST_BE_GRATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSLA__SLA_compensation_must_be_grater_than_or_equal_to_zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>SLA discount must be grater than or equal to zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SLA___SLA_DISCOUNT_MUST_BE_GRATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSLA__SLA_discount_must_be_grater_than_or_equal_to_zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>SLA incpriority must be grater than or equal to zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SLA___SLA_INCPRIORITY_MUST_BE_GRATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSLA__SLA_incpriority_must_be_grater_than_or_equal_to_zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>SLA base cost must be grater than or equal to zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SLA___SLA_BASE_COST_MUST_BE_GRATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSLA__SLA_base_cost_must_be_grater_than_or_equal_to_zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Cloud Provider must offer once each VM for each SLA type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SLA___CLOUD_PROVIDER_MUST_OFFER_ONCE_EACH_VM_FOR_EACH_SLA_TYPE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSLA__CloudProvider_must_offer_once_each_VM_for_each_SLA_type__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.VMCostImpl <em>VM Cost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.VMCostImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getVMCost()
		 * @generated
		 */
		EClass VM_COST = eINSTANCE.getVMCost();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_COST__BASE = eINSTANCE.getVMCost_Base();

		/**
		 * The meta object literal for the '<em><b>Incpriority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM_COST__INCPRIORITY = eINSTANCE.getVMCost_Incpriority();

		/**
		 * The meta object literal for the '<em><b>Discount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM_COST__DISCOUNT = eINSTANCE.getVMCost_Discount();

		/**
		 * The meta object literal for the '<em><b>Compensation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM_COST__COMPENSATION = eINSTANCE.getVMCost_Compensation();

		/**
		 * The meta object literal for the '<em><b>Vm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_COST__VM = eINSTANCE.getVMCost_Vm();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.CostImpl <em>Cost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.CostImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getCost()
		 * @generated
		 */
		EClass COST = eINSTANCE.getCost();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST__VALUE = eINSTANCE.getCost_Value();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COST__RATE = eINSTANCE.getCost_Rate();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.VMImpl <em>VM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.VMImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getVM()
		 * @generated
		 */
		EClass VM = eINSTANCE.getVM();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM__BASE_COMPONENT = eINSTANCE.getVM_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__CORES = eINSTANCE.getVM_Cores();

		/**
		 * The meta object literal for the '<em><b>Disk</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM__DISK = eINSTANCE.getVM_Disk();

		/**
		 * The meta object literal for the '<em><b>Computing Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__COMPUTING_UNITS = eINSTANCE.getVM_ComputingUnits();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM__MEMORY = eINSTANCE.getVM_Memory();

		/**
		 * The meta object literal for the '<em><b>Cores Must Be Greater Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VM___CORES_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getVM__Cores_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Computing Units Must Be Greater Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VM___COMPUTING_UNITS_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getVM__ComputingUnits_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Memory Must Be Greater Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VM___MEMORY_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getVM__Memory_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>VM can not be allocated</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VM___VM_CAN_NOT_BE_ALLOCATED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getVM__VM_can_not_be_allocated__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Disk Must Be Greater Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VM___DISK_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getVM__Disk_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ApplicationImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__BASE_COMPONENT = eINSTANCE.getApplication_Base_Component();

		/**
		 * The meta object literal for the '<em><b>MIs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__MIS = eINSTANCE.getApplication_MIs();

		/**
		 * The meta object literal for the '<em><b>Input Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__INPUT_DATA = eINSTANCE.getApplication_InputData();

		/**
		 * The meta object literal for the '<em><b>Output Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__OUTPUT_DATA = eINSTANCE.getApplication_OutputData();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__PARAMETER = eINSTANCE.getApplication_Parameter();

		/**
		 * The meta object literal for the '<em><b>MIs Must Be Greater Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___MIS_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getApplication__MIs_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Input Data Must Be Greater Than Or Equal To Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___INPUT_DATA_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getApplication__InputData_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Output Data Must Be Greater Than Or Equal To Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION___OUTPUT_DATA_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getApplication__OutputData_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ParameterImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DESCRIPTION = eINSTANCE.getParameter_Description();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RequestImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getRequest()
		 * @generated
		 */
		EClass REQUEST = eINSTANCE.getRequest();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__BASE_MESSAGE = eINSTANCE.getRequest_Base_Message();

		/**
		 * The meta object literal for the '<em><b>Vm Instantiation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__VM_INSTANTIATION = eINSTANCE.getRequest_VmInstantiation();

		/**
		 * The meta object literal for the '<em><b>Renting Time Must Be Greater Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REQUEST___RENTING_TIME_MUST_BE_GREATER_THAN_ZERO__ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRequest__RentingTime_Must_Be_Greater_Than__Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Instances Must Be Greater Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REQUEST___INSTANCES_MUST_BE_GREATER_THAN_ZERO__ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRequest__Instances_Must_Be_Greater_Than__Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Request Must Be Sent To ACloud Provider</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REQUEST___REQUEST_MUST_BE_SENT_TO_ACLOUD_PROVIDER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRequest__Request_Must_Be_Sent_To_A_CloudProvider__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Request Must Be Sent By AUser</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REQUEST___REQUEST_MUST_BE_SENT_BY_AUSER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRequest__Request_Must_Be_Sent_By_A_User__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Request For AVM Not Offered In The Signed SLA By The User</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REQUEST___REQUEST_FOR_AVM_NOT_OFFERED_IN_THE_SIGNED_SLA_BY_THE_USER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRequest__Request_For_A_VM_Not_Offered_In_The_Signed_SLA_By_The_User__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.VMInstantiationImpl <em>VM Instantiation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.VMInstantiationImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getVMInstantiation()
		 * @generated
		 */
		EClass VM_INSTANTIATION = eINSTANCE.getVMInstantiation();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM_INSTANTIATION__INSTANCES = eINSTANCE.getVMInstantiation_Instances();

		/**
		 * The meta object literal for the '<em><b>Vm Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_INSTANTIATION__VM_TYPE = eINSTANCE.getVMInstantiation_VmType();

		/**
		 * The meta object literal for the '<em><b>Renting Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_INSTANTIATION__RENTING_TIME = eINSTANCE.getVMInstantiation_RentingTime();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.SubscribeImpl <em>Subscribe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.SubscribeImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getSubscribe()
		 * @generated
		 */
		EClass SUBSCRIBE = eINSTANCE.getSubscribe();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBE__BASE_MESSAGE = eINSTANCE.getSubscribe_Base_Message();

		/**
		 * The meta object literal for the '<em><b>Max Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBE__MAX_TIME = eINSTANCE.getSubscribe_MaxTime();

		/**
		 * The meta object literal for the '<em><b>Max Time Must Be Greater Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBSCRIBE___MAX_TIME_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSubscribe__MaxTime_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Subscribe Must Be Sent To ACloud Provider</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBSCRIBE___SUBSCRIBE_MUST_BE_SENT_TO_ACLOUD_PROVIDER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSubscribe__Subscribe_Must_Be_Sent_To_A_CloudProvider__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Subscribe Must Be Sent By AUser</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBSCRIBE___SUBSCRIBE_MUST_BE_SENT_BY_AUSER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSubscribe__Subscribe_Must_Be_Sent_By_A_User__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.AppInstantiationImpl <em>App Instantiation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.AppInstantiationImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getAppInstantiation()
		 * @generated
		 */
		EClass APP_INSTANTIATION = eINSTANCE.getAppInstantiation();

		/**
		 * The meta object literal for the '<em><b>Application Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_INSTANTIATION__APPLICATION_TYPE = eINSTANCE.getAppInstantiation_ApplicationType();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_INSTANTIATION__INSTANCES = eINSTANCE.getAppInstantiation_Instances();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ExecuteImpl <em>Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ExecuteImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getExecute()
		 * @generated
		 */
		EClass EXECUTE = eINSTANCE.getExecute();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTE__BASE_MESSAGE = eINSTANCE.getExecute_Base_Message();

		/**
		 * The meta object literal for the '<em><b>App Instantiation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTE__APP_INSTANTIATION = eINSTANCE.getExecute_AppInstantiation();

		/**
		 * The meta object literal for the '<em><b>Instances Must Be Greater Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTE___INSTANCES_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getExecute__Instances_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Execute Must Be Sent To ACloud Provider</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTE___EXECUTE_MUST_BE_SENT_TO_ACLOUD_PROVIDER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getExecute__Execute_Must_Be_Sent_To_A_CloudProvider__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Execute Must Be Sent By AUser</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTE___EXECUTE_MUST_BE_SENT_BY_AUSER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getExecute__Execute_Must_Be_Sent_By_A_User__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Number Of App Instantiation Collections Must Be Equal Than Total VM Instances</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTE___NUMBER_OF_APP_INSTANTIATION_COLLECTIONS_MUST_BE_EQUAL_THAN_TOTAL_VM_INSTANCES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getExecute__Number_Of_AppInstantiation_Collections_Must_Be_Equal_Than_Total_VM_Instances__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UserImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Base Lifeline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__BASE_LIFELINE = eINSTANCE.getUser_Base_Lifeline();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__INSTANCES = eINSTANCE.getUser_Instances();

		/**
		 * The meta object literal for the '<em><b>Sla</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__SLA = eINSTANCE.getUser_Sla();

		/**
		 * The meta object literal for the '<em><b>User Must Have AExecute Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___USER_MUST_HAVE_AEXECUTE_MESSAGE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getUser__User_Must_Have_A_Execute_Message__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>User Must Have ARequest Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___USER_MUST_HAVE_AREQUEST_MESSAGE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getUser__User_Must_Have_A_Request_Message__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>User Must Sign AVM SLA Offered By The Cloud Provider</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___USER_MUST_SIGN_AVM_SLA_OFFERED_BY_THE_CLOUD_PROVIDER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getUser__User_Must_Sign_A_VM_SLA_Offered_By_The_CloudProvider__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>User Must Have AResume Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___USER_MUST_HAVE_ARESUME_MESSAGE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getUser__User_Must_Have_A_Resume_Message__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.CloudInfrastructureImpl <em>Cloud Infrastructure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.CloudInfrastructureImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getCloudInfrastructure()
		 * @generated
		 */
		EClass CLOUD_INFRASTRUCTURE = eINSTANCE.getCloudInfrastructure();

		/**
		 * The meta object literal for the '<em><b>Datacenter Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_INFRASTRUCTURE__DATACENTER_ELEMENTS = eINSTANCE.getCloudInfrastructure_DatacenterElements();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_INFRASTRUCTURE__BASE_COMPONENT = eINSTANCE.getCloudInfrastructure_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_INFRASTRUCTURE__NETWORK = eINSTANCE.getCloudInfrastructure_Network();

		/**
		 * The meta object literal for the '<em><b>Datacenter Elements instances Must Be Greatter Than Or Equal To Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOUD_INFRASTRUCTURE___DATACENTER_ELEMENTS_INSTANCES_MUST_BE_GREATTER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCloudInfrastructure__DatacenterElements_instances_Must_Be_Greatter_Than_Or_Equal_To_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Datacenter Elements instances Should Be Greatter Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOUD_INFRASTRUCTURE___DATACENTER_ELEMENTS_INSTANCES_SHOULD_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCloudInfrastructure__DatacenterElements_instances_Should_Be_Greatter_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.DataCenterElementImpl <em>Data Center Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.DataCenterElementImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getDataCenterElement()
		 * @generated
		 */
		EClass DATA_CENTER_ELEMENT = eINSTANCE.getDataCenterElement();

		/**
		 * The meta object literal for the '<em><b>Number Of Data Centers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CENTER_ELEMENT__NUMBER_OF_DATA_CENTERS = eINSTANCE.getDataCenterElement_NumberOfDataCenters();

		/**
		 * The meta object literal for the '<em><b>Data Center Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CENTER_ELEMENT__DATA_CENTER_TYPE = eINSTANCE.getDataCenterElement_DataCenterType();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.PriorityUserImpl <em>Priority User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.PriorityUserImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getPriorityUser()
		 * @generated
		 */
		EClass PRIORITY_USER = eINSTANCE.getPriorityUser();

		/**
		 * The meta object literal for the '<em><b>Priority User has been modeled but no machine has been reserved</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIORITY_USER___PRIORITY_USER_HAS_BEEN_MODELED_BUT_NO_MACHINE_HAS_BEEN_RESERVED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPriorityUser__PriorityUser_has_been_modeled_but_no_machine_has_been_reserved__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RegularUserImpl <em>Regular User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RegularUserImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getRegularUser()
		 * @generated
		 */
		EClass REGULAR_USER = eINSTANCE.getRegularUser();

		/**
		 * The meta object literal for the '<em><b>Regular User Must Have ASubscribe Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGULAR_USER___REGULAR_USER_MUST_HAVE_ASUBSCRIBE_MESSAGE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRegularUser__RegularUser_Must_Have_A_Subscribe_Message__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ResumeImpl <em>Resume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ResumeImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getResume()
		 * @generated
		 */
		EClass RESUME = eINSTANCE.getResume();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESUME__BASE_MESSAGE = eINSTANCE.getResume_Base_Message();

		/**
		 * The meta object literal for the '<em><b>Resume Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESUME__RESUME_TIME = eINSTANCE.getResume_ResumeTime();

		/**
		 * The meta object literal for the '<em><b>Resume Time is at least twice as long as the renting time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESUME___RESUME_TIME_IS_AT_LEAST_TWICE_AS_LONG_AS_THE_RENTING_TIME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getResume__ResumeTime_is_at_least_twice_as_long_as_the_renting_time__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ResponseOfferedVMsImpl <em>Response Offered VMs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ResponseOfferedVMsImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getResponseOfferedVMs()
		 * @generated
		 */
		EClass RESPONSE_OFFERED_VMS = eINSTANCE.getResponseOfferedVMs();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_OFFERED_VMS__BASE_MESSAGE = eINSTANCE.getResponseOfferedVMs_Base_Message();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.OkImpl <em>Ok</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.OkImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getOk()
		 * @generated
		 */
		EClass OK = eINSTANCE.getOk();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OK__BASE_MESSAGE = eINSTANCE.getOk_Base_Message();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.TimeoutRentingImpl <em>Timeout Renting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.TimeoutRentingImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getTimeoutRenting()
		 * @generated
		 */
		EClass TIMEOUT_RENTING = eINSTANCE.getTimeoutRenting();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMEOUT_RENTING__BASE_MESSAGE = eINSTANCE.getTimeoutRenting_Base_Message();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.NotifyImpl <em>Notify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.NotifyImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getNotify()
		 * @generated
		 */
		EClass NOTIFY = eINSTANCE.getNotify();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFY__BASE_MESSAGE = eINSTANCE.getNotify_Base_Message();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.TimeoutSubscriptionImpl <em>Timeout Subscription</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.TimeoutSubscriptionImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getTimeoutSubscription()
		 * @generated
		 */
		EClass TIMEOUT_SUBSCRIPTION = eINSTANCE.getTimeoutSubscription();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMEOUT_SUBSCRIPTION__BASE_MESSAGE = eINSTANCE.getTimeoutSubscription_Base_Message();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RequestOfferedVMsImpl <em>Request Offered VMs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RequestOfferedVMsImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getRequestOfferedVMs()
		 * @generated
		 */
		EClass REQUEST_OFFERED_VMS = eINSTANCE.getRequestOfferedVMs();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_OFFERED_VMS__BASE_MESSAGE = eINSTANCE.getRequestOfferedVMs_Base_Message();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ResponseImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getResponse()
		 * @generated
		 */
		EClass RESPONSE = eINSTANCE.getResponse();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__BASE_MESSAGE = eINSTANCE.getResponse_Base_Message();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RefuseImpl <em>Refuse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RefuseImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getRefuse()
		 * @generated
		 */
		EClass REFUSE = eINSTANCE.getRefuse();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFUSE__BASE_MESSAGE = eINSTANCE.getRefuse_Base_Message();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.BandwidthUnit <em>Bandwidth Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.BandwidthUnit
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getBandwidthUnit()
		 * @generated
		 */
		EEnum BANDWIDTH_UNIT = eINSTANCE.getBandwidthUnit();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.SizeUnit <em>Size Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.SizeUnit
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getSizeUnit()
		 * @generated
		 */
		EEnum SIZE_UNIT = eINSTANCE.getSizeUnit();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.TimeUnit <em>Time Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.TimeUnit
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getTimeUnit()
		 * @generated
		 */
		EEnum TIME_UNIT = eINSTANCE.getTimeUnit();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.MachineType <em>Machine Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.MachineType
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getMachineType()
		 * @generated
		 */
		EEnum MACHINE_TYPE = eINSTANCE.getMachineType();

	}

} //UML2CloudProfilePackage
