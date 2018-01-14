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
	String eNS_URI = "http://www.uclm.es/UML/profiles/UML2Cloud/1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "UML2Cloud";

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
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER__BASE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER__NETWORK = 1;

	/**
	 * The feature id for the '<em><b>Rack Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER__RACK_ELEMENTS = 2;

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
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackElementImpl <em>Rack Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackElementImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getRackElement()
	 * @generated
	 */
	int RACK_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_ELEMENT__INSTANCES = 0;

	/**
	 * The feature id for the '<em><b>Rack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_ELEMENT__RACK = 1;

	/**
	 * The feature id for the '<em><b>Data Center</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_ELEMENT__DATA_CENTER = 2;

	/**
	 * The number of structural features of the '<em>Rack Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_ELEMENT_FEATURE_COUNT = 3;

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
	int RACK = 2;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__BASE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Nodes Per Board</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__NODES_PER_BOARD = 1;

	/**
	 * The feature id for the '<em><b>Comm Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__COMM_LINK = 2;

	/**
	 * The feature id for the '<em><b>Boards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__BOARDS = 3;

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
	 * The operation id for the '<em>Nodes Per Board Must Be Greatter Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK___NODES_PER_BOARD_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.NodeImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 3;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__BASE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Cpu Scheduler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CPU_SCHEDULER = 1;

	/**
	 * The feature id for the '<em><b>Cpu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CPU = 2;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MEMORY = 3;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__STORAGE = 4;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.HardwareImpl <em>Hardware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.HardwareImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getHardware()
	 * @generated
	 */
	int HARDWARE = 5;

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
	int CPU = 4;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU__BASE_COMPONENT = HARDWARE__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Number Of Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU__NUMBER_OF_CORES = HARDWARE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Speed MIPS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU__SPEED_MIPS = HARDWARE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tick S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU__TICK_S = HARDWARE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CPU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_FEATURE_COUNT = HARDWARE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Speed MIPS Must Be Greater Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU___SPEED_MIPS_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = HARDWARE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Tick SMust Be Greater Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU___TICK_SMUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = HARDWARE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Number Of Cores Must Be Greater Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU___NUMBER_OF_CORES_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = HARDWARE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>CPU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_OPERATION_COUNT = HARDWARE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.MemoryImpl <em>Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.MemoryImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getMemory()
	 * @generated
	 */
	int MEMORY = 6;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__BASE_COMPONENT = HARDWARE__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Size GB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__SIZE_GB = HARDWARE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Read Latency US</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__READ_LATENCY_US = HARDWARE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Write Latency US</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__WRITE_LATENCY_US = HARDWARE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_FEATURE_COUNT = HARDWARE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Size GB Must Be Greater Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY___SIZE_GB_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = HARDWARE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Read Latency US Must Be Greater Than Or Equal To Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY___READ_LATENCY_US_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = HARDWARE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Write Latency US Must Be Greatter Than Or Equal To Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY___WRITE_LATENCY_US_MUST_BE_GREATTER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = HARDWARE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_OPERATION_COUNT = HARDWARE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.DiskImpl <em>Disk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.DiskImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getDisk()
	 * @generated
	 */
	int DISK = 7;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__BASE_COMPONENT = HARDWARE__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Number Of Disks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__NUMBER_OF_DISKS = HARDWARE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Read Bandwidth MBps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__READ_BANDWIDTH_MBPS = HARDWARE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Write Bandwidth MBps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__WRITE_BANDWIDTH_MBPS = HARDWARE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size Per Device GB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__SIZE_PER_DEVICE_GB = HARDWARE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Disk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_FEATURE_COUNT = HARDWARE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Number Of Disks Must Be Greatter Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK___NUMBER_OF_DISKS_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = HARDWARE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Read Bandwidth MBps Must Be Greatter Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK___READ_BANDWIDTH_MBPS_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = HARDWARE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Write Bandwidth MBps Must Be Greatter Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK___WRITE_BANDWIDTH_MBPS_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = HARDWARE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Size Per Device GB Must Be Greatter Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK___SIZE_PER_DEVICE_GB_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = HARDWARE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Disk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_OPERATION_COUNT = HARDWARE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackCmpImpl <em>Rack Cmp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackCmpImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getRackCmp()
	 * @generated
	 */
	int RACK_CMP = 8;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_CMP__BASE_COMPONENT = RACK__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Nodes Per Board</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_CMP__NODES_PER_BOARD = RACK__NODES_PER_BOARD;

	/**
	 * The feature id for the '<em><b>Comm Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_CMP__COMM_LINK = RACK__COMM_LINK;

	/**
	 * The feature id for the '<em><b>Boards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_CMP__BOARDS = RACK__BOARDS;

	/**
	 * The feature id for the '<em><b>Node Cmp Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_CMP__NODE_CMP_TYPE = RACK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rack Cmp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_CMP_FEATURE_COUNT = RACK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Boards Must Be Greatter Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_CMP___BOARDS_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = RACK___BOARDS_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Nodes Per Board Must Be Greatter Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_CMP___NODES_PER_BOARD_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = RACK___NODES_PER_BOARD_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Rack Cmp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_CMP_OPERATION_COUNT = RACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.NodeCmpImpl <em>Node Cmp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.NodeCmpImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getNodeCmp()
	 * @generated
	 */
	int NODE_CMP = 9;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CMP__BASE_COMPONENT = NODE__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Cpu Scheduler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CMP__CPU_SCHEDULER = NODE__CPU_SCHEDULER;

	/**
	 * The feature id for the '<em><b>Cpu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CMP__CPU = NODE__CPU;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CMP__MEMORY = NODE__MEMORY;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CMP__STORAGE = NODE__STORAGE;

	/**
	 * The number of structural features of the '<em>Node Cmp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CMP_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Node Cmp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CMP_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackStoImpl <em>Rack Sto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackStoImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getRackSto()
	 * @generated
	 */
	int RACK_STO = 10;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_STO__BASE_COMPONENT = RACK__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Nodes Per Board</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_STO__NODES_PER_BOARD = RACK__NODES_PER_BOARD;

	/**
	 * The feature id for the '<em><b>Comm Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_STO__COMM_LINK = RACK__COMM_LINK;

	/**
	 * The feature id for the '<em><b>Boards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_STO__BOARDS = RACK__BOARDS;

	/**
	 * The feature id for the '<em><b>Node Sto Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_STO__NODE_STO_TYPE = RACK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rack Sto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_STO_FEATURE_COUNT = RACK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Boards Must Be Greatter Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_STO___BOARDS_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = RACK___BOARDS_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Nodes Per Board Must Be Greatter Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_STO___NODES_PER_BOARD_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = RACK___NODES_PER_BOARD_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Rack Sto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_STO_OPERATION_COUNT = RACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.NodeStoImpl <em>Node Sto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.NodeStoImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getNodeSto()
	 * @generated
	 */
	int NODE_STO = 11;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STO__BASE_COMPONENT = NODE__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Cpu Scheduler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STO__CPU_SCHEDULER = NODE__CPU_SCHEDULER;

	/**
	 * The feature id for the '<em><b>Cpu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STO__CPU = NODE__CPU;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STO__MEMORY = NODE__MEMORY;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STO__STORAGE = NODE__STORAGE;

	/**
	 * The number of structural features of the '<em>Node Sto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STO_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Node Sto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_STO_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ScenarioImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 12;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__BASE_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Cloud Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__CLOUD_PROVIDER = 1;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RepositoryImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 13;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__BASE_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ApplicationImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 14;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__BASE_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.VMImpl <em>VM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.VMImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getVM()
	 * @generated
	 */
	int VM = 15;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__BASE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Number Of Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__NUMBER_OF_CORES = 1;

	/**
	 * The feature id for the '<em><b>Disk GB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__DISK_GB = 2;

	/**
	 * The feature id for the '<em><b>Cost Per Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__COST_PER_HOUR = 3;

	/**
	 * The feature id for the '<em><b>SCU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__SCU = 4;

	/**
	 * The feature id for the '<em><b>Memory GB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__MEMORY_GB = 5;

	/**
	 * The number of structural features of the '<em>VM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Number Of Cores Must Be Greater Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___NUMBER_OF_CORES_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Disk GB Must Be Greater Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___DISK_GB_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Cost Per Hour Must Be Greater Than Or Equeal To Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___COST_PER_HOUR_MUST_BE_GREATER_THAN_OR_EQUEAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>SCU Must Be Greater Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___SCU_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Memory Must Be Greater Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___MEMORY_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The number of operations of the '<em>VM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.LocalApplicationImpl <em>Local Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.LocalApplicationImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getLocalApplication()
	 * @generated
	 */
	int LOCAL_APPLICATION = 16;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_APPLICATION__BASE_COMPONENT = APPLICATION__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Input Data Size Mi B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_APPLICATION__INPUT_DATA_SIZE_MI_B = APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Data Size Mi B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_APPLICATION__OUTPUT_DATA_SIZE_MI_B = APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_APPLICATION__INPUT_FILE = APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_APPLICATION__OUTPUT_FILE = APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MIs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_APPLICATION__MIS = APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_APPLICATION__ITERATIONS = APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Local Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_APPLICATION_FEATURE_COUNT = APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Input Data Size Mi BMust Be Greater Than Or Equal To Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_APPLICATION___INPUT_DATA_SIZE_MI_BMUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Output Data Size Mi BMust Be Greater Than Or Equal To Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_APPLICATION___OUTPUT_DATA_SIZE_MI_BMUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = APPLICATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>MIs Must Be Greater Than Or Equal To Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_APPLICATION___MIS_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = APPLICATION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Iterations Must Be Greater Than Or Equal To Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_APPLICATION___ITERATIONS_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = APPLICATION_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Local Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_APPLICATION_OPERATION_COUNT = APPLICATION_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.CloudProviderImpl <em>Cloud Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.CloudProviderImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getCloudProvider()
	 * @generated
	 */
	int CLOUD_PROVIDER = 17;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER__BASE_LIFELINE = 0;

	/**
	 * The number of structural features of the '<em>Cloud Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cloud Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RequestImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 18;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__BASE_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Renting Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__RENTING_TIME = 1;

	/**
	 * The feature id for the '<em><b>Vm Instantiation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__VM_INSTANTIATION = 2;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>T1 Must Be Greater Than Or Equal To Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST___T1_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>T2 Must Be Greater Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST___T2_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.VMInstantiationImpl <em>VM Instantiation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.VMInstantiationImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getVMInstantiation()
	 * @generated
	 */
	int VM_INSTANTIATION = 19;

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
	 * The number of structural features of the '<em>VM Instantiation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_INSTANTIATION_FEATURE_COUNT = 2;

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
	int SUBSCRIBE = 20;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE__BASE_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Max Sub Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE__MAX_SUB_TIME = 1;

	/**
	 * The number of structural features of the '<em>Subscribe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>T4 Must Be Greater Than Zero</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE___T4_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>T4 Should Be Greater Than Or Equal To t1 From Connect If You Want To Subscribe</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE___T4_SHOULD_BE_GREATER_THAN_OR_EQUAL_TO_T1_FROM_CONNECT_IF_YOU_WANT_TO_SUBSCRIBE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Subscribe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.AppInstantiationImpl <em>App Instantiation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.AppInstantiationImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getAppInstantiation()
	 * @generated
	 */
	int APP_INSTANTIATION = 21;

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
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.OKImpl <em>OK</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.OKImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getOK()
	 * @generated
	 */
	int OK = 22;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK__BASE_MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>OK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>OK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.NotifyImpl <em>Notify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.NotifyImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getNotify()
	 * @generated
	 */
	int NOTIFY = 23;

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
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.TimeoutImpl <em>Timeout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.TimeoutImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getTimeout()
	 * @generated
	 */
	int TIMEOUT = 24;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT__BASE_MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Timeout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Timeout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ResponseImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getResponse()
	 * @generated
	 */
	int RESPONSE = 25;

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
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RejectImpl <em>Reject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RejectImpl
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getReject()
	 * @generated
	 */
	int REJECT = 26;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REJECT__BASE_MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Reject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REJECT_OPERATION_COUNT = 0;

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
	 * The number of operations of the '<em>Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_OPERATION_COUNT = 0;

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
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Channel <em>Channel</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Channel
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getChannel()
	 * @generated
	 */
	int CHANNEL = 29;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CPUScheduler <em>CPU Scheduler</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CPUScheduler
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getCPUScheduler()
	 * @generated
	 */
	int CPU_SCHEDULER = 30;

	/**
	 * The meta object id for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProviderType <em>Cloud Provider Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProviderType
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getCloudProviderType()
	 * @generated
	 */
	int CLOUD_PROVIDER_TYPE = 31;


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
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenter#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.DataCenter#getNetwork()
	 * @see #getDataCenter()
	 * @generated
	 */
	EAttribute getDataCenter_Network();

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
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement <em>Rack Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rack Element</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement
	 * @generated
	 */
	EClass getRackElement();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instances</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement#getInstances()
	 * @see #getRackElement()
	 * @generated
	 */
	EAttribute getRackElement_Instances();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement#getRack <em>Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rack</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement#getRack()
	 * @see #getRackElement()
	 * @generated
	 */
	EReference getRackElement_Rack();

	/**
	 * Returns the meta object for the container reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement#getDataCenter <em>Data Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Center</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.RackElement#getDataCenter()
	 * @see #getRackElement()
	 * @generated
	 */
	EReference getRackElement_DataCenter();

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
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Rack#getNodesPerBoard <em>Nodes Per Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nodes Per Board</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Rack#getNodesPerBoard()
	 * @see #getRack()
	 * @generated
	 */
	EAttribute getRack_NodesPerBoard();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Rack#getCommLink <em>Comm Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comm Link</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Rack#getCommLink()
	 * @see #getRack()
	 * @generated
	 */
	EAttribute getRack_CommLink();

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
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Rack#boards_Must_Be_Greatter_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Boards Must Be Greatter Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Boards Must Be Greatter Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Rack#boards_Must_Be_Greatter_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRack__Boards_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Rack#nodesPerBoard_Must_Be_Greatter_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Nodes Per Board Must Be Greatter Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nodes Per Board Must Be Greatter Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Rack#nodesPerBoard_Must_Be_Greatter_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRack__NodesPerBoard_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Node#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Node#getBase_Component()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Base_Component();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Node#getCpuScheduler <em>Cpu Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Scheduler</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Node#getCpuScheduler()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_CpuScheduler();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Node#getCpu <em>Cpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cpu</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Node#getCpu()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Cpu();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Node#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Memory</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Node#getMemory()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Memory();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Node#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Storage</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Node#getStorage()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Storage();

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
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CPU#getNumberOfCores <em>Number Of Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Cores</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CPU#getNumberOfCores()
	 * @see #getCPU()
	 * @generated
	 */
	EAttribute getCPU_NumberOfCores();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CPU#getSpeedMIPS <em>Speed MIPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed MIPS</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CPU#getSpeedMIPS()
	 * @see #getCPU()
	 * @generated
	 */
	EAttribute getCPU_SpeedMIPS();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CPU#getTickS <em>Tick S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tick S</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CPU#getTickS()
	 * @see #getCPU()
	 * @generated
	 */
	EAttribute getCPU_TickS();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CPU#speedMIPS_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Speed MIPS Must Be Greater Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Speed MIPS Must Be Greater Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CPU#speedMIPS_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCPU__SpeedMIPS_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CPU#tickS_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Tick SMust Be Greater Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tick SMust Be Greater Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CPU#tickS_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCPU__TickS_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CPU#numberOfCores_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Number Of Cores Must Be Greater Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Number Of Cores Must Be Greater Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CPU#numberOfCores_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCPU__NumberOfCores_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

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
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Memory#getSizeGB <em>Size GB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size GB</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Memory#getSizeGB()
	 * @see #getMemory()
	 * @generated
	 */
	EAttribute getMemory_SizeGB();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Memory#getReadLatencyUS <em>Read Latency US</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Latency US</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Memory#getReadLatencyUS()
	 * @see #getMemory()
	 * @generated
	 */
	EAttribute getMemory_ReadLatencyUS();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Memory#getWriteLatencyUS <em>Write Latency US</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write Latency US</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Memory#getWriteLatencyUS()
	 * @see #getMemory()
	 * @generated
	 */
	EAttribute getMemory_WriteLatencyUS();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Memory#sizeGB_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Size GB Must Be Greater Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Size GB Must Be Greater Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Memory#sizeGB_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMemory__SizeGB_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Memory#readLatencyUS_Must_Be_Greater_Than_Or_Equal_To_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Read Latency US Must Be Greater Than Or Equal To Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Latency US Must Be Greater Than Or Equal To Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Memory#readLatencyUS_Must_Be_Greater_Than_Or_Equal_To_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMemory__ReadLatencyUS_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Memory#writeLatencyUS_Must_Be_Greatter_Than_Or_Equal_To_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Write Latency US Must Be Greatter Than Or Equal To Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write Latency US Must Be Greatter Than Or Equal To Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Memory#writeLatencyUS_Must_Be_Greatter_Than_Or_Equal_To_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMemory__WriteLatencyUS_Must_Be_Greatter_Than_Or_Equal_To_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Disk <em>Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disk</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Disk
	 * @generated
	 */
	EClass getDisk();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Disk#getNumberOfDisks <em>Number Of Disks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Disks</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Disk#getNumberOfDisks()
	 * @see #getDisk()
	 * @generated
	 */
	EAttribute getDisk_NumberOfDisks();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Disk#getReadBandwidthMBps <em>Read Bandwidth MBps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Bandwidth MBps</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Disk#getReadBandwidthMBps()
	 * @see #getDisk()
	 * @generated
	 */
	EAttribute getDisk_ReadBandwidthMBps();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Disk#getWriteBandwidthMBps <em>Write Bandwidth MBps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write Bandwidth MBps</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Disk#getWriteBandwidthMBps()
	 * @see #getDisk()
	 * @generated
	 */
	EAttribute getDisk_WriteBandwidthMBps();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Disk#getSizePerDeviceGB <em>Size Per Device GB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Per Device GB</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Disk#getSizePerDeviceGB()
	 * @see #getDisk()
	 * @generated
	 */
	EAttribute getDisk_SizePerDeviceGB();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Disk#numberOfDisks_Must_Be_Greatter_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Number Of Disks Must Be Greatter Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Number Of Disks Must Be Greatter Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Disk#numberOfDisks_Must_Be_Greatter_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDisk__NumberOfDisks_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Disk#readBandwidthMBps_Must_Be_Greatter_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Read Bandwidth MBps Must Be Greatter Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Bandwidth MBps Must Be Greatter Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Disk#readBandwidthMBps_Must_Be_Greatter_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDisk__ReadBandwidthMBps_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Disk#writeBandwidthMBps_Must_Be_Greatter_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Write Bandwidth MBps Must Be Greatter Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write Bandwidth MBps Must Be Greatter Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Disk#writeBandwidthMBps_Must_Be_Greatter_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDisk__WriteBandwidthMBps_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Disk#sizePerDeviceGB_Must_Be_Greatter_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Size Per Device GB Must Be Greatter Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Size Per Device GB Must Be Greatter Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Disk#sizePerDeviceGB_Must_Be_Greatter_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDisk__SizePerDeviceGB_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RackCmp <em>Rack Cmp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rack Cmp</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.RackCmp
	 * @generated
	 */
	EClass getRackCmp();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RackCmp#getNodeCmpType <em>Node Cmp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node Cmp Type</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.RackCmp#getNodeCmpType()
	 * @see #getRackCmp()
	 * @generated
	 */
	EReference getRackCmp_NodeCmpType();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.NodeCmp <em>Node Cmp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Cmp</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.NodeCmp
	 * @generated
	 */
	EClass getNodeCmp();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RackSto <em>Rack Sto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rack Sto</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.RackSto
	 * @generated
	 */
	EClass getRackSto();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.RackSto#getNodeStoType <em>Node Sto Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node Sto Type</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.RackSto#getNodeStoType()
	 * @see #getRackSto()
	 * @generated
	 */
	EReference getRackSto_NodeStoType();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.NodeSto <em>Node Sto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Sto</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.NodeSto
	 * @generated
	 */
	EClass getNodeSto();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Scenario#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Scenario#getBase_Package()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Base_Package();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Scenario#getCloudProvider <em>Cloud Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloud Provider</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Scenario#getCloudProvider()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_CloudProvider();

	/**
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Repository#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Repository#getBase_Package()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Base_Package();

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
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VM#getNumberOfCores <em>Number Of Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Cores</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VM#getNumberOfCores()
	 * @see #getVM()
	 * @generated
	 */
	EAttribute getVM_NumberOfCores();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VM#getDiskGB <em>Disk GB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk GB</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VM#getDiskGB()
	 * @see #getVM()
	 * @generated
	 */
	EAttribute getVM_DiskGB();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VM#getCostPerHour <em>Cost Per Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Per Hour</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VM#getCostPerHour()
	 * @see #getVM()
	 * @generated
	 */
	EAttribute getVM_CostPerHour();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VM#getSCU <em>SCU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SCU</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VM#getSCU()
	 * @see #getVM()
	 * @generated
	 */
	EAttribute getVM_SCU();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VM#getMemoryGB <em>Memory GB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory GB</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VM#getMemoryGB()
	 * @see #getVM()
	 * @generated
	 */
	EAttribute getVM_MemoryGB();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VM#numberOfCores_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Number Of Cores Must Be Greater Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Number Of Cores Must Be Greater Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VM#numberOfCores_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVM__NumberOfCores_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VM#diskGB_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Disk GB Must Be Greater Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Disk GB Must Be Greater Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VM#diskGB_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVM__DiskGB_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VM#costPerHour_Must_Be_Greater_Than_Or_Equeal_To_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Cost Per Hour Must Be Greater Than Or Equeal To Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cost Per Hour Must Be Greater Than Or Equeal To Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VM#costPerHour_Must_Be_Greater_Than_Or_Equeal_To_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVM__CostPerHour_Must_Be_Greater_Than_Or_Equeal_To_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.VM#SCU_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>SCU Must Be Greater Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>SCU Must Be Greater Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.VM#SCU_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVM__SCU_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

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
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication <em>Local Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Application</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication
	 * @generated
	 */
	EClass getLocalApplication();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#getInputDataSizeMiB <em>Input Data Size Mi B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Data Size Mi B</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#getInputDataSizeMiB()
	 * @see #getLocalApplication()
	 * @generated
	 */
	EAttribute getLocalApplication_InputDataSizeMiB();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#getOutputDataSizeMiB <em>Output Data Size Mi B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Data Size Mi B</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#getOutputDataSizeMiB()
	 * @see #getLocalApplication()
	 * @generated
	 */
	EAttribute getLocalApplication_OutputDataSizeMiB();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#getInputFile <em>Input File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input File</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#getInputFile()
	 * @see #getLocalApplication()
	 * @generated
	 */
	EAttribute getLocalApplication_InputFile();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#getOutputFile <em>Output File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output File</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#getOutputFile()
	 * @see #getLocalApplication()
	 * @generated
	 */
	EAttribute getLocalApplication_OutputFile();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#getMIs <em>MIs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MIs</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#getMIs()
	 * @see #getLocalApplication()
	 * @generated
	 */
	EAttribute getLocalApplication_MIs();

	/**
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#getIterations <em>Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterations</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#getIterations()
	 * @see #getLocalApplication()
	 * @generated
	 */
	EAttribute getLocalApplication_Iterations();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#inputDataSizeMiB_Must_Be_Greater_Than_Or_Equal_To_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Input Data Size Mi BMust Be Greater Than Or Equal To Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Input Data Size Mi BMust Be Greater Than Or Equal To Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#inputDataSizeMiB_Must_Be_Greater_Than_Or_Equal_To_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLocalApplication__InputDataSizeMiB_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#outputDataSizeMiB_Must_Be_Greater_Than_Or_Equal_To_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Output Data Size Mi BMust Be Greater Than Or Equal To Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Output Data Size Mi BMust Be Greater Than Or Equal To Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#outputDataSizeMiB_Must_Be_Greater_Than_Or_Equal_To_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLocalApplication__OutputDataSizeMiB_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#MIs_Must_Be_Greater_Than_Or_Equal_To_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>MIs Must Be Greater Than Or Equal To Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>MIs Must Be Greater Than Or Equal To Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#MIs_Must_Be_Greater_Than_Or_Equal_To_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLocalApplication__MIs_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#iterations_Must_Be_Greater_Than_Or_Equal_To_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Iterations Must Be Greater Than Or Equal To Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Iterations Must Be Greater Than Or Equal To Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.LocalApplication#iterations_Must_Be_Greater_Than_Or_Equal_To_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLocalApplication__Iterations_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map();

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
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Request#getRentingTime <em>Renting Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Renting Time</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Request#getRentingTime()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_RentingTime();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Request#getVmInstantiation <em>Vm Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vm Instantiation</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Request#getVmInstantiation()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_VmInstantiation();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Request#t1_Must_Be_Greater_Than_Or_Equal_To_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>T1 Must Be Greater Than Or Equal To Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>T1 Must Be Greater Than Or Equal To Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Request#t1_Must_Be_Greater_Than_Or_Equal_To_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRequest__T1_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Request#t2_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>T2 Must Be Greater Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>T2 Must Be Greater Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Request#t2_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRequest__T2_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

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
	 * Returns the meta object for the attribute '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Subscribe#getMaxSubTime <em>Max Sub Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Sub Time</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Subscribe#getMaxSubTime()
	 * @see #getSubscribe()
	 * @generated
	 */
	EAttribute getSubscribe_MaxSubTime();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Subscribe#t4_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>T4 Must Be Greater Than Zero</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>T4 Must Be Greater Than Zero</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Subscribe#t4_Must_Be_Greater_Than_Zero(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSubscribe__T4_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Subscribe#t4_Should_Be_Greater_Than_Or_Equal_To_t1_From_Connect_If_You_Want_To_Subscribe(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>T4 Should Be Greater Than Or Equal To t1 From Connect If You Want To Subscribe</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>T4 Should Be Greater Than Or Equal To t1 From Connect If You Want To Subscribe</em>' operation.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Subscribe#t4_Should_Be_Greater_Than_Or_Equal_To_t1_From_Connect_If_You_Want_To_Subscribe(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSubscribe__T4_Should_Be_Greater_Than_Or_Equal_To_t1_From_Connect_If_You_Want_To_Subscribe__DiagnosticChain_Map();

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
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.OK <em>OK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OK</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.OK
	 * @generated
	 */
	EClass getOK();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.OK#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.OK#getBase_Message()
	 * @see #getOK()
	 * @generated
	 */
	EReference getOK_Base_Message();

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
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Timeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timeout</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Timeout
	 * @generated
	 */
	EClass getTimeout();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Timeout#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Timeout#getBase_Message()
	 * @see #getTimeout()
	 * @generated
	 */
	EReference getTimeout_Base_Message();

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
	 * Returns the meta object for class '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Reject <em>Reject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reject</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Reject
	 * @generated
	 */
	EClass getReject();

	/**
	 * Returns the meta object for the reference '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Reject#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Reject#getBase_Message()
	 * @see #getReject()
	 * @generated
	 */
	EReference getReject_Base_Message();

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
	 * Returns the meta object for enum '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Channel</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Channel
	 * @generated
	 */
	EEnum getChannel();

	/**
	 * Returns the meta object for enum '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CPUScheduler <em>CPU Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CPU Scheduler</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CPUScheduler
	 * @generated
	 */
	EEnum getCPUScheduler();

	/**
	 * Returns the meta object for enum '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProviderType <em>Cloud Provider Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cloud Provider Type</em>'.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProviderType
	 * @generated
	 */
	EEnum getCloudProviderType();

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
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CENTER__BASE_COMPONENT = eINSTANCE.getDataCenter_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CENTER__NETWORK = eINSTANCE.getDataCenter_Network();

		/**
		 * The meta object literal for the '<em><b>Rack Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CENTER__RACK_ELEMENTS = eINSTANCE.getDataCenter_RackElements();

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
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackElementImpl <em>Rack Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackElementImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getRackElement()
		 * @generated
		 */
		EClass RACK_ELEMENT = eINSTANCE.getRackElement();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RACK_ELEMENT__INSTANCES = eINSTANCE.getRackElement_Instances();

		/**
		 * The meta object literal for the '<em><b>Rack</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RACK_ELEMENT__RACK = eINSTANCE.getRackElement_Rack();

		/**
		 * The meta object literal for the '<em><b>Data Center</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RACK_ELEMENT__DATA_CENTER = eINSTANCE.getRackElement_DataCenter();

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
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RACK__BASE_COMPONENT = eINSTANCE.getRack_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Nodes Per Board</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RACK__NODES_PER_BOARD = eINSTANCE.getRack_NodesPerBoard();

		/**
		 * The meta object literal for the '<em><b>Comm Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RACK__COMM_LINK = eINSTANCE.getRack_CommLink();

		/**
		 * The meta object literal for the '<em><b>Boards</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RACK__BOARDS = eINSTANCE.getRack_Boards();

		/**
		 * The meta object literal for the '<em><b>Boards Must Be Greatter Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RACK___BOARDS_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRack__Boards_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Nodes Per Board Must Be Greatter Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RACK___NODES_PER_BOARD_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRack__NodesPerBoard_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.NodeImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__BASE_COMPONENT = eINSTANCE.getNode_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Cpu Scheduler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__CPU_SCHEDULER = eINSTANCE.getNode_CpuScheduler();

		/**
		 * The meta object literal for the '<em><b>Cpu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CPU = eINSTANCE.getNode_Cpu();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__MEMORY = eINSTANCE.getNode_Memory();

		/**
		 * The meta object literal for the '<em><b>Storage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__STORAGE = eINSTANCE.getNode_Storage();

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
		 * The meta object literal for the '<em><b>Number Of Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPU__NUMBER_OF_CORES = eINSTANCE.getCPU_NumberOfCores();

		/**
		 * The meta object literal for the '<em><b>Speed MIPS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPU__SPEED_MIPS = eINSTANCE.getCPU_SpeedMIPS();

		/**
		 * The meta object literal for the '<em><b>Tick S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPU__TICK_S = eINSTANCE.getCPU_TickS();

		/**
		 * The meta object literal for the '<em><b>Speed MIPS Must Be Greater Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CPU___SPEED_MIPS_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCPU__SpeedMIPS_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Tick SMust Be Greater Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CPU___TICK_SMUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCPU__TickS_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Number Of Cores Must Be Greater Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CPU___NUMBER_OF_CORES_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCPU__NumberOfCores_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

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
		 * The meta object literal for the '<em><b>Size GB</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY__SIZE_GB = eINSTANCE.getMemory_SizeGB();

		/**
		 * The meta object literal for the '<em><b>Read Latency US</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY__READ_LATENCY_US = eINSTANCE.getMemory_ReadLatencyUS();

		/**
		 * The meta object literal for the '<em><b>Write Latency US</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY__WRITE_LATENCY_US = eINSTANCE.getMemory_WriteLatencyUS();

		/**
		 * The meta object literal for the '<em><b>Size GB Must Be Greater Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEMORY___SIZE_GB_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMemory__SizeGB_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Read Latency US Must Be Greater Than Or Equal To Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEMORY___READ_LATENCY_US_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMemory__ReadLatencyUS_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Write Latency US Must Be Greatter Than Or Equal To Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEMORY___WRITE_LATENCY_US_MUST_BE_GREATTER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMemory__WriteLatencyUS_Must_Be_Greatter_Than_Or_Equal_To_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.DiskImpl <em>Disk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.DiskImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getDisk()
		 * @generated
		 */
		EClass DISK = eINSTANCE.getDisk();

		/**
		 * The meta object literal for the '<em><b>Number Of Disks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISK__NUMBER_OF_DISKS = eINSTANCE.getDisk_NumberOfDisks();

		/**
		 * The meta object literal for the '<em><b>Read Bandwidth MBps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISK__READ_BANDWIDTH_MBPS = eINSTANCE.getDisk_ReadBandwidthMBps();

		/**
		 * The meta object literal for the '<em><b>Write Bandwidth MBps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISK__WRITE_BANDWIDTH_MBPS = eINSTANCE.getDisk_WriteBandwidthMBps();

		/**
		 * The meta object literal for the '<em><b>Size Per Device GB</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISK__SIZE_PER_DEVICE_GB = eINSTANCE.getDisk_SizePerDeviceGB();

		/**
		 * The meta object literal for the '<em><b>Number Of Disks Must Be Greatter Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISK___NUMBER_OF_DISKS_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDisk__NumberOfDisks_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Read Bandwidth MBps Must Be Greatter Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISK___READ_BANDWIDTH_MBPS_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDisk__ReadBandwidthMBps_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Write Bandwidth MBps Must Be Greatter Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISK___WRITE_BANDWIDTH_MBPS_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDisk__WriteBandwidthMBps_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Size Per Device GB Must Be Greatter Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISK___SIZE_PER_DEVICE_GB_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDisk__SizePerDeviceGB_Must_Be_Greatter_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackCmpImpl <em>Rack Cmp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackCmpImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getRackCmp()
		 * @generated
		 */
		EClass RACK_CMP = eINSTANCE.getRackCmp();

		/**
		 * The meta object literal for the '<em><b>Node Cmp Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RACK_CMP__NODE_CMP_TYPE = eINSTANCE.getRackCmp_NodeCmpType();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.NodeCmpImpl <em>Node Cmp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.NodeCmpImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getNodeCmp()
		 * @generated
		 */
		EClass NODE_CMP = eINSTANCE.getNodeCmp();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackStoImpl <em>Rack Sto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackStoImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getRackSto()
		 * @generated
		 */
		EClass RACK_STO = eINSTANCE.getRackSto();

		/**
		 * The meta object literal for the '<em><b>Node Sto Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RACK_STO__NODE_STO_TYPE = eINSTANCE.getRackSto_NodeStoType();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.NodeStoImpl <em>Node Sto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.NodeStoImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getNodeSto()
		 * @generated
		 */
		EClass NODE_STO = eINSTANCE.getNodeSto();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.ScenarioImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__BASE_PACKAGE = eINSTANCE.getScenario_Base_Package();

		/**
		 * The meta object literal for the '<em><b>Cloud Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__CLOUD_PROVIDER = eINSTANCE.getScenario_CloudProvider();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RepositoryImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__BASE_PACKAGE = eINSTANCE.getRepository_Base_Package();

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
		 * The meta object literal for the '<em><b>Number Of Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__NUMBER_OF_CORES = eINSTANCE.getVM_NumberOfCores();

		/**
		 * The meta object literal for the '<em><b>Disk GB</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__DISK_GB = eINSTANCE.getVM_DiskGB();

		/**
		 * The meta object literal for the '<em><b>Cost Per Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__COST_PER_HOUR = eINSTANCE.getVM_CostPerHour();

		/**
		 * The meta object literal for the '<em><b>SCU</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__SCU = eINSTANCE.getVM_SCU();

		/**
		 * The meta object literal for the '<em><b>Memory GB</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__MEMORY_GB = eINSTANCE.getVM_MemoryGB();

		/**
		 * The meta object literal for the '<em><b>Number Of Cores Must Be Greater Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VM___NUMBER_OF_CORES_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getVM__NumberOfCores_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Disk GB Must Be Greater Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VM___DISK_GB_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getVM__DiskGB_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Cost Per Hour Must Be Greater Than Or Equeal To Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VM___COST_PER_HOUR_MUST_BE_GREATER_THAN_OR_EQUEAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getVM__CostPerHour_Must_Be_Greater_Than_Or_Equeal_To_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>SCU Must Be Greater Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VM___SCU_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getVM__SCU_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Memory Must Be Greater Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VM___MEMORY_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getVM__Memory_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.LocalApplicationImpl <em>Local Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.LocalApplicationImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getLocalApplication()
		 * @generated
		 */
		EClass LOCAL_APPLICATION = eINSTANCE.getLocalApplication();

		/**
		 * The meta object literal for the '<em><b>Input Data Size Mi B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_APPLICATION__INPUT_DATA_SIZE_MI_B = eINSTANCE.getLocalApplication_InputDataSizeMiB();

		/**
		 * The meta object literal for the '<em><b>Output Data Size Mi B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_APPLICATION__OUTPUT_DATA_SIZE_MI_B = eINSTANCE.getLocalApplication_OutputDataSizeMiB();

		/**
		 * The meta object literal for the '<em><b>Input File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_APPLICATION__INPUT_FILE = eINSTANCE.getLocalApplication_InputFile();

		/**
		 * The meta object literal for the '<em><b>Output File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_APPLICATION__OUTPUT_FILE = eINSTANCE.getLocalApplication_OutputFile();

		/**
		 * The meta object literal for the '<em><b>MIs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_APPLICATION__MIS = eINSTANCE.getLocalApplication_MIs();

		/**
		 * The meta object literal for the '<em><b>Iterations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_APPLICATION__ITERATIONS = eINSTANCE.getLocalApplication_Iterations();

		/**
		 * The meta object literal for the '<em><b>Input Data Size Mi BMust Be Greater Than Or Equal To Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCAL_APPLICATION___INPUT_DATA_SIZE_MI_BMUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLocalApplication__InputDataSizeMiB_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Output Data Size Mi BMust Be Greater Than Or Equal To Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCAL_APPLICATION___OUTPUT_DATA_SIZE_MI_BMUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLocalApplication__OutputDataSizeMiB_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>MIs Must Be Greater Than Or Equal To Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCAL_APPLICATION___MIS_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLocalApplication__MIs_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Iterations Must Be Greater Than Or Equal To Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCAL_APPLICATION___ITERATIONS_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLocalApplication__Iterations_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map();

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
		 * The meta object literal for the '<em><b>Base Lifeline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_PROVIDER__BASE_LIFELINE = eINSTANCE.getCloudProvider_Base_Lifeline();

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
		 * The meta object literal for the '<em><b>Renting Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__RENTING_TIME = eINSTANCE.getRequest_RentingTime();

		/**
		 * The meta object literal for the '<em><b>Vm Instantiation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__VM_INSTANTIATION = eINSTANCE.getRequest_VmInstantiation();

		/**
		 * The meta object literal for the '<em><b>T1 Must Be Greater Than Or Equal To Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REQUEST___T1_MUST_BE_GREATER_THAN_OR_EQUAL_TO_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRequest__T1_Must_Be_Greater_Than_Or_Equal_To_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>T2 Must Be Greater Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REQUEST___T2_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRequest__T2_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

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
		 * The meta object literal for the '<em><b>Max Sub Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIBE__MAX_SUB_TIME = eINSTANCE.getSubscribe_MaxSubTime();

		/**
		 * The meta object literal for the '<em><b>T4 Must Be Greater Than Zero</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBSCRIBE___T4_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSubscribe__T4_Must_Be_Greater_Than_Zero__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>T4 Should Be Greater Than Or Equal To t1 From Connect If You Want To Subscribe</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBSCRIBE___T4_SHOULD_BE_GREATER_THAN_OR_EQUAL_TO_T1_FROM_CONNECT_IF_YOU_WANT_TO_SUBSCRIBE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSubscribe__T4_Should_Be_Greater_Than_Or_Equal_To_t1_From_Connect_If_You_Want_To_Subscribe__DiagnosticChain_Map();

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
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.OKImpl <em>OK</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.OKImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getOK()
		 * @generated
		 */
		EClass OK = eINSTANCE.getOK();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OK__BASE_MESSAGE = eINSTANCE.getOK_Base_Message();

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
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.TimeoutImpl <em>Timeout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.TimeoutImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getTimeout()
		 * @generated
		 */
		EClass TIMEOUT = eINSTANCE.getTimeout();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMEOUT__BASE_MESSAGE = eINSTANCE.getTimeout_Base_Message();

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
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RejectImpl <em>Reject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RejectImpl
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getReject()
		 * @generated
		 */
		EClass REJECT = eINSTANCE.getReject();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REJECT__BASE_MESSAGE = eINSTANCE.getReject_Base_Message();

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
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Channel <em>Channel</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.Channel
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getChannel()
		 * @generated
		 */
		EEnum CHANNEL = eINSTANCE.getChannel();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CPUScheduler <em>CPU Scheduler</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CPUScheduler
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getCPUScheduler()
		 * @generated
		 */
		EEnum CPU_SCHEDULER = eINSTANCE.getCPUScheduler();

		/**
		 * The meta object literal for the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProviderType <em>Cloud Provider Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CloudProviderType
		 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.impl.UML2CloudProfilePackageImpl#getCloudProviderType()
		 * @generated
		 */
		EEnum CLOUD_PROVIDER_TYPE = eINSTANCE.getCloudProviderType();

	}

} //UML2CloudProfilePackage
