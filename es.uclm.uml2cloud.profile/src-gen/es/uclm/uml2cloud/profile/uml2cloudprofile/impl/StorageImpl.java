/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile.impl;

import es.uclm.uml2cloud.profile.uml2cloudprofile.Bandwidth;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Size;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Storage;
import es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage;

import es.uclm.uml2cloud.profile.uml2cloudprofile.util.UML2CloudProfileValidator;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.StorageImpl#getNumberOfDrives <em>Number Of Drives</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.StorageImpl#getDriveCapacity <em>Drive Capacity</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.StorageImpl#getReadBandwidth <em>Read Bandwidth</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.StorageImpl#getWriteBandwidth <em>Write Bandwidth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StorageImpl extends HardwareImpl implements Storage {
	/**
	 * The default value of the '{@link #getNumberOfDrives() <em>Number Of Drives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfDrives()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_DRIVES_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNumberOfDrives() <em>Number Of Drives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfDrives()
	 * @generated
	 * @ordered
	 */
	protected int numberOfDrives = NUMBER_OF_DRIVES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDriveCapacity() <em>Drive Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriveCapacity()
	 * @generated
	 * @ordered
	 */
	protected Size driveCapacity;

	/**
	 * The cached value of the '{@link #getReadBandwidth() <em>Read Bandwidth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadBandwidth()
	 * @generated
	 * @ordered
	 */
	protected Bandwidth readBandwidth;

	/**
	 * The cached value of the '{@link #getWriteBandwidth() <em>Write Bandwidth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteBandwidth()
	 * @generated
	 * @ordered
	 */
	protected Bandwidth writeBandwidth;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StorageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2CloudProfilePackage.Literals.STORAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfDrives() {
		return numberOfDrives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfDrives(int newNumberOfDrives) {
		int oldNumberOfDrives = numberOfDrives;
		numberOfDrives = newNumberOfDrives;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.STORAGE__NUMBER_OF_DRIVES, oldNumberOfDrives, numberOfDrives));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size getDriveCapacity() {
		return driveCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDriveCapacity(Size newDriveCapacity, NotificationChain msgs) {
		Size oldDriveCapacity = driveCapacity;
		driveCapacity = newDriveCapacity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.STORAGE__DRIVE_CAPACITY, oldDriveCapacity, newDriveCapacity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriveCapacity(Size newDriveCapacity) {
		if (newDriveCapacity != driveCapacity) {
			NotificationChain msgs = null;
			if (driveCapacity != null)
				msgs = ((InternalEObject)driveCapacity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2CloudProfilePackage.STORAGE__DRIVE_CAPACITY, null, msgs);
			if (newDriveCapacity != null)
				msgs = ((InternalEObject)newDriveCapacity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2CloudProfilePackage.STORAGE__DRIVE_CAPACITY, null, msgs);
			msgs = basicSetDriveCapacity(newDriveCapacity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.STORAGE__DRIVE_CAPACITY, newDriveCapacity, newDriveCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bandwidth getReadBandwidth() {
		return readBandwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadBandwidth(Bandwidth newReadBandwidth, NotificationChain msgs) {
		Bandwidth oldReadBandwidth = readBandwidth;
		readBandwidth = newReadBandwidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.STORAGE__READ_BANDWIDTH, oldReadBandwidth, newReadBandwidth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadBandwidth(Bandwidth newReadBandwidth) {
		if (newReadBandwidth != readBandwidth) {
			NotificationChain msgs = null;
			if (readBandwidth != null)
				msgs = ((InternalEObject)readBandwidth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2CloudProfilePackage.STORAGE__READ_BANDWIDTH, null, msgs);
			if (newReadBandwidth != null)
				msgs = ((InternalEObject)newReadBandwidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2CloudProfilePackage.STORAGE__READ_BANDWIDTH, null, msgs);
			msgs = basicSetReadBandwidth(newReadBandwidth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.STORAGE__READ_BANDWIDTH, newReadBandwidth, newReadBandwidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bandwidth getWriteBandwidth() {
		return writeBandwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWriteBandwidth(Bandwidth newWriteBandwidth, NotificationChain msgs) {
		Bandwidth oldWriteBandwidth = writeBandwidth;
		writeBandwidth = newWriteBandwidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.STORAGE__WRITE_BANDWIDTH, oldWriteBandwidth, newWriteBandwidth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteBandwidth(Bandwidth newWriteBandwidth) {
		if (newWriteBandwidth != writeBandwidth) {
			NotificationChain msgs = null;
			if (writeBandwidth != null)
				msgs = ((InternalEObject)writeBandwidth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2CloudProfilePackage.STORAGE__WRITE_BANDWIDTH, null, msgs);
			if (newWriteBandwidth != null)
				msgs = ((InternalEObject)newWriteBandwidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2CloudProfilePackage.STORAGE__WRITE_BANDWIDTH, null, msgs);
			msgs = basicSetWriteBandwidth(newWriteBandwidth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.STORAGE__WRITE_BANDWIDTH, newWriteBandwidth, newWriteBandwidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean numberOfDrives_Must_Be_Greatter_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UML2CloudProfileValidator.DIAGNOSTIC_SOURCE,
						 UML2CloudProfileValidator.STORAGE__NUMBER_OF_DRIVES_MUST_BE_GREATTER_THAN_ZERO,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "numberOfDrives_Must_Be_Greatter_Than_Zero", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean driveCapacity_Must_Be_Greater_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UML2CloudProfileValidator.DIAGNOSTIC_SOURCE,
						 UML2CloudProfileValidator.STORAGE__DRIVE_CAPACITY_MUST_BE_GREATER_THAN_ZERO,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "driveCapacity_Must_Be_Greater_Than_Zero", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean readBandwidth_Must_Be_Greatter_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UML2CloudProfileValidator.DIAGNOSTIC_SOURCE,
						 UML2CloudProfileValidator.STORAGE__READ_BANDWIDTH_MUST_BE_GREATTER_THAN_ZERO,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "readBandwidth_Must_Be_Greatter_Than_Zero", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean writeBandwidth_Must_Be_Greatter_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UML2CloudProfileValidator.DIAGNOSTIC_SOURCE,
						 UML2CloudProfileValidator.STORAGE__WRITE_BANDWIDTH_MUST_BE_GREATTER_THAN_ZERO,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "writeBandwidth_Must_Be_Greatter_Than_Zero", EObjectValidator.getObjectLabel(this, context) }),
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UML2CloudProfilePackage.STORAGE__DRIVE_CAPACITY:
				return basicSetDriveCapacity(null, msgs);
			case UML2CloudProfilePackage.STORAGE__READ_BANDWIDTH:
				return basicSetReadBandwidth(null, msgs);
			case UML2CloudProfilePackage.STORAGE__WRITE_BANDWIDTH:
				return basicSetWriteBandwidth(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2CloudProfilePackage.STORAGE__NUMBER_OF_DRIVES:
				return getNumberOfDrives();
			case UML2CloudProfilePackage.STORAGE__DRIVE_CAPACITY:
				return getDriveCapacity();
			case UML2CloudProfilePackage.STORAGE__READ_BANDWIDTH:
				return getReadBandwidth();
			case UML2CloudProfilePackage.STORAGE__WRITE_BANDWIDTH:
				return getWriteBandwidth();
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
			case UML2CloudProfilePackage.STORAGE__NUMBER_OF_DRIVES:
				setNumberOfDrives((Integer)newValue);
				return;
			case UML2CloudProfilePackage.STORAGE__DRIVE_CAPACITY:
				setDriveCapacity((Size)newValue);
				return;
			case UML2CloudProfilePackage.STORAGE__READ_BANDWIDTH:
				setReadBandwidth((Bandwidth)newValue);
				return;
			case UML2CloudProfilePackage.STORAGE__WRITE_BANDWIDTH:
				setWriteBandwidth((Bandwidth)newValue);
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
			case UML2CloudProfilePackage.STORAGE__NUMBER_OF_DRIVES:
				setNumberOfDrives(NUMBER_OF_DRIVES_EDEFAULT);
				return;
			case UML2CloudProfilePackage.STORAGE__DRIVE_CAPACITY:
				setDriveCapacity((Size)null);
				return;
			case UML2CloudProfilePackage.STORAGE__READ_BANDWIDTH:
				setReadBandwidth((Bandwidth)null);
				return;
			case UML2CloudProfilePackage.STORAGE__WRITE_BANDWIDTH:
				setWriteBandwidth((Bandwidth)null);
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
			case UML2CloudProfilePackage.STORAGE__NUMBER_OF_DRIVES:
				return numberOfDrives != NUMBER_OF_DRIVES_EDEFAULT;
			case UML2CloudProfilePackage.STORAGE__DRIVE_CAPACITY:
				return driveCapacity != null;
			case UML2CloudProfilePackage.STORAGE__READ_BANDWIDTH:
				return readBandwidth != null;
			case UML2CloudProfilePackage.STORAGE__WRITE_BANDWIDTH:
				return writeBandwidth != null;
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
			case UML2CloudProfilePackage.STORAGE___NUMBER_OF_DRIVES_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP:
				return numberOfDrives_Must_Be_Greatter_Than_Zero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UML2CloudProfilePackage.STORAGE___DRIVE_CAPACITY_MUST_BE_GREATER_THAN_ZERO__DIAGNOSTICCHAIN_MAP:
				return driveCapacity_Must_Be_Greater_Than_Zero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UML2CloudProfilePackage.STORAGE___READ_BANDWIDTH_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP:
				return readBandwidth_Must_Be_Greatter_Than_Zero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UML2CloudProfilePackage.STORAGE___WRITE_BANDWIDTH_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP:
				return writeBandwidth_Must_Be_Greatter_Than_Zero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (numberOfDrives: ");
		result.append(numberOfDrives);
		result.append(')');
		return result.toString();
	}

} //StorageImpl
