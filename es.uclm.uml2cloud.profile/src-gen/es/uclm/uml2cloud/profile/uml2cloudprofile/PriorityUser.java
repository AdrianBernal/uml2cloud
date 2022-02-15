/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Priority User</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getPriorityUser()
 * @model
 * @generated
 */
public interface PriorityUser extends User {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * uml2cloud::CloudInfrastructure.allInstances()->collect(ci | ci.datacenterElements)->collect(de | de.dataCenterType)->collect(dc | dc.rackElements)->select(re | re.rackType.oclIsKindOf(uml2cloud::ComputingRack))->select(re | re.rackType.oclAsType(uml2cloud::ComputingRack).machineType.type=uml2cloud::MachineType::Reserved)->collectNested(re | re.numberOfRacks*re.rackType.boards*re.rackType.machinesPerBoard)->sum()>0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean PriorityUser_has_been_modeled_but_no_machine_has_been_reserved(DiagnosticChain diagnostics, Map<Object, Object> context);
} // PriorityUser
