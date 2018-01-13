/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile.impl;

import es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudPackage;
import es.uclm.uml2cloud.profile.uml2cloudprofile.VM;

import es.uclm.uml2cloud.profile.uml2cloudprofile.util.UML2CloudValidator;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.VMImpl#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.VMImpl#getNumberOfCores <em>Number Of Cores</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.VMImpl#getDiskGB <em>Disk GB</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.VMImpl#getCostPerHour <em>Cost Per Hour</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.VMImpl#getSCU <em>SCU</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.VMImpl#getMemoryGB <em>Memory GB</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VMImpl extends MinimalEObjectImpl.Container implements VM {
	/**
	 * The cached value of the '{@link #getBase_Component() <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Component()
	 * @generated
	 * @ordered
	 */
	protected Component base_Component;

	/**
	 * The default value of the '{@link #getNumberOfCores() <em>Number Of Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfCores()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_CORES_EDEFAULT = 2;

	/**
	 * The cached value of the '{@link #getNumberOfCores() <em>Number Of Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfCores()
	 * @generated
	 * @ordered
	 */
	protected int numberOfCores = NUMBER_OF_CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiskGB() <em>Disk GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskGB()
	 * @generated
	 * @ordered
	 */
	protected static final double DISK_GB_EDEFAULT = 500.0;

	/**
	 * The cached value of the '{@link #getDiskGB() <em>Disk GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskGB()
	 * @generated
	 * @ordered
	 */
	protected double diskGB = DISK_GB_EDEFAULT;

	/**
	 * The default value of the '{@link #getCostPerHour() <em>Cost Per Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostPerHour()
	 * @generated
	 * @ordered
	 */
	protected static final double COST_PER_HOUR_EDEFAULT = 15.0;

	/**
	 * The cached value of the '{@link #getCostPerHour() <em>Cost Per Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostPerHour()
	 * @generated
	 * @ordered
	 */
	protected double costPerHour = COST_PER_HOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSCU() <em>SCU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCU()
	 * @generated
	 * @ordered
	 */
	protected static final double SCU_EDEFAULT = 2.0;

	/**
	 * The cached value of the '{@link #getSCU() <em>SCU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCU()
	 * @generated
	 * @ordered
	 */
	protected double scu = SCU_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemoryGB() <em>Memory GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryGB()
	 * @generated
	 * @ordered
	 */
	protected static final double MEMORY_GB_EDEFAULT = 4.0;

	/**
	 * The cached value of the '{@link #getMemoryGB() <em>Memory GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryGB()
	 * @generated
	 * @ordered
	 */
	protected double memoryGB = MEMORY_GB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2CloudPackage.Literals.VM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getBase_Component() {
		if (base_Component != null && base_Component.eIsProxy()) {
			InternalEObject oldBase_Component = (InternalEObject)base_Component;
			base_Component = (Component)eResolveProxy(oldBase_Component);
			if (base_Component != oldBase_Component) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2CloudPackage.VM__BASE_COMPONENT, oldBase_Component, base_Component));
			}
		}
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetBase_Component() {
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Component(Component newBase_Component) {
		Component oldBase_Component = base_Component;
		base_Component = newBase_Component;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudPackage.VM__BASE_COMPONENT, oldBase_Component, base_Component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfCores() {
		return numberOfCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfCores(int newNumberOfCores) {
		int oldNumberOfCores = numberOfCores;
		numberOfCores = newNumberOfCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudPackage.VM__NUMBER_OF_CORES, oldNumberOfCores, numberOfCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDiskGB() {
		return diskGB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiskGB(double newDiskGB) {
		double oldDiskGB = diskGB;
		diskGB = newDiskGB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudPackage.VM__DISK_GB, oldDiskGB, diskGB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCostPerHour() {
		return costPerHour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostPerHour(double newCostPerHour) {
		double oldCostPerHour = costPerHour;
		costPerHour = newCostPerHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudPackage.VM__COST_PER_HOUR, oldCostPerHour, costPerHour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSCU() {
		return scu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSCU(double newSCU) {
		double oldSCU = scu;
		scu = newSCU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudPackage.VM__SCU, oldSCU, scu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMemoryGB() {
		return memoryGB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryGB(double newMemoryGB) {
		double oldMemoryGB = memoryGB;
		memoryGB = newMemoryGB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudPackage.VM__MEMORY_GB, oldMemoryGB, memoryGB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean numberOfCores_Must_Be_Greater_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UML2CloudValidator.DIAGNOSTIC_SOURCE,
						 UML2CloudValidator.VM__NUMBER_OF_CORES_MUST_BE_GREATER_THAN_ZERO,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "numberOfCores_Must_Be_Greater_Than_Zero", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean diskGB_Must_Be_Greater_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UML2CloudValidator.DIAGNOSTIC_SOURCE,
						 UML2CloudValidator.VM__DISK_GB_MUST_BE_GREATER_THAN_ZERO,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "diskGB_Must_Be_Greater_Than_Zero", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean costPerHour_Must_Be_Greater_Than_Or_Equeal_To_Zero(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UML2CloudValidator.DIAGNOSTIC_SOURCE,
						 UML2CloudValidator.VM__COST_PER_HOUR_MUST_BE_GREATER_THAN_OR_EQUEAL_TO_ZERO,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "costPerHour_Must_Be_Greater_Than_Or_Equeal_To_Zero", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SCU_Must_Be_Greater_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UML2CloudValidator.DIAGNOSTIC_SOURCE,
						 UML2CloudValidator.VM__SCU_MUST_BE_GREATER_THAN_ZERO,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SCU_Must_Be_Greater_Than_Zero", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean memory_Must_Be_Greater_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UML2CloudValidator.DIAGNOSTIC_SOURCE,
						 UML2CloudValidator.VM__MEMORY_MUST_BE_GREATER_THAN_ZERO,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "memory_Must_Be_Greater_Than_Zero", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2CloudPackage.VM__BASE_COMPONENT:
				if (resolve) return getBase_Component();
				return basicGetBase_Component();
			case UML2CloudPackage.VM__NUMBER_OF_CORES:
				return getNumberOfCores();
			case UML2CloudPackage.VM__DISK_GB:
				return getDiskGB();
			case UML2CloudPackage.VM__COST_PER_HOUR:
				return getCostPerHour();
			case UML2CloudPackage.VM__SCU:
				return getSCU();
			case UML2CloudPackage.VM__MEMORY_GB:
				return getMemoryGB();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UML2CloudPackage.VM__BASE_COMPONENT:
				setBase_Component((Component)newValue);
				return;
			case UML2CloudPackage.VM__NUMBER_OF_CORES:
				setNumberOfCores((Integer)newValue);
				return;
			case UML2CloudPackage.VM__DISK_GB:
				setDiskGB((Double)newValue);
				return;
			case UML2CloudPackage.VM__COST_PER_HOUR:
				setCostPerHour((Double)newValue);
				return;
			case UML2CloudPackage.VM__SCU:
				setSCU((Double)newValue);
				return;
			case UML2CloudPackage.VM__MEMORY_GB:
				setMemoryGB((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UML2CloudPackage.VM__BASE_COMPONENT:
				setBase_Component((Component)null);
				return;
			case UML2CloudPackage.VM__NUMBER_OF_CORES:
				setNumberOfCores(NUMBER_OF_CORES_EDEFAULT);
				return;
			case UML2CloudPackage.VM__DISK_GB:
				setDiskGB(DISK_GB_EDEFAULT);
				return;
			case UML2CloudPackage.VM__COST_PER_HOUR:
				setCostPerHour(COST_PER_HOUR_EDEFAULT);
				return;
			case UML2CloudPackage.VM__SCU:
				setSCU(SCU_EDEFAULT);
				return;
			case UML2CloudPackage.VM__MEMORY_GB:
				setMemoryGB(MEMORY_GB_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UML2CloudPackage.VM__BASE_COMPONENT:
				return base_Component != null;
			case UML2CloudPackage.VM__NUMBER_OF_CORES:
				return numberOfCores != NUMBER_OF_CORES_EDEFAULT;
			case UML2CloudPackage.VM__DISK_GB:
				return diskGB != DISK_GB_EDEFAULT;
			case UML2CloudPackage.VM__COST_PER_HOUR:
				return costPerHour != COST_PER_HOUR_EDEFAULT;
			case UML2CloudPackage.VM__SCU:
				return scu != SCU_EDEFAULT;
			case UML2CloudPackage.VM__MEMORY_GB:
				return memoryGB != MEMORY_GB_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case UML2CloudPackage.VM___NUMBER_OF_CORES_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP:
				return numberOfCores_Must_Be_Greater_Than_Zero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UML2CloudPackage.VM___DISK_GB_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP:
				return diskGB_Must_Be_Greater_Than_Zero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UML2CloudPackage.VM___COST_PER_HOUR_MUST_BE_GREATER_THAN_OR_EQUEAL_TO_ZERO__DIAGNOSTICCHAIN_MAP:
				return costPerHour_Must_Be_Greater_Than_Or_Equeal_To_Zero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UML2CloudPackage.VM___SCU_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP:
				return SCU_Must_Be_Greater_Than_Zero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UML2CloudPackage.VM___MEMORY_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP:
				return memory_Must_Be_Greater_Than_Zero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (numberOfCores: ");
		result.append(numberOfCores);
		result.append(", diskGB: ");
		result.append(diskGB);
		result.append(", costPerHour: ");
		result.append(costPerHour);
		result.append(", SCU: ");
		result.append(scu);
		result.append(", memoryGB: ");
		result.append(memoryGB);
		result.append(')');
		return result.toString();
	}

} //VMImpl
