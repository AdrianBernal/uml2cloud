/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Node#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Node#getCpuScheduler <em>Cpu Scheduler</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Node#getCpu <em>Cpu</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Node#getMemory <em>Memory</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Node#getStorage <em>Storage</em>}</li>
 * </ul>
 *
 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Component</em>' reference.
	 * @see #setBase_Component(Component)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getNode_Base_Component()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Component getBase_Component();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Node#getBase_Component <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Component</em>' reference.
	 * @see #getBase_Component()
	 * @generated
	 */
	void setBase_Component(Component value);

	/**
	 * Returns the value of the '<em><b>Cpu Scheduler</b></em>' attribute.
	 * The default value is <code>"FIFO"</code>.
	 * The literals are from the enumeration {@link es.uclm.uml2cloud.profile.uml2cloudprofile.CPUScheduler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu Scheduler</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu Scheduler</em>' attribute.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CPUScheduler
	 * @see #setCpuScheduler(CPUScheduler)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getNode_CpuScheduler()
	 * @model default="FIFO" required="true" ordered="false"
	 * @generated
	 */
	CPUScheduler getCpuScheduler();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Node#getCpuScheduler <em>Cpu Scheduler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Scheduler</em>' attribute.
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.CPUScheduler
	 * @see #getCpuScheduler()
	 * @generated
	 */
	void setCpuScheduler(CPUScheduler value);

	/**
	 * Returns the value of the '<em><b>Cpu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu</em>' reference.
	 * @see #setCpu(CPU)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getNode_Cpu()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CPU getCpu();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Node#getCpu <em>Cpu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu</em>' reference.
	 * @see #getCpu()
	 * @generated
	 */
	void setCpu(CPU value);

	/**
	 * Returns the value of the '<em><b>Memory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory</em>' reference.
	 * @see #setMemory(Memory)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getNode_Memory()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Memory getMemory();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Node#getMemory <em>Memory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory</em>' reference.
	 * @see #getMemory()
	 * @generated
	 */
	void setMemory(Memory value);

	/**
	 * Returns the value of the '<em><b>Storage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage</em>' reference.
	 * @see #setStorage(Disk)
	 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getNode_Storage()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Disk getStorage();

	/**
	 * Sets the value of the '{@link es.uclm.uml2cloud.profile.uml2cloudprofile.Node#getStorage <em>Storage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage</em>' reference.
	 * @see #getStorage()
	 * @generated
	 */
	void setStorage(Disk value);

} // Node
