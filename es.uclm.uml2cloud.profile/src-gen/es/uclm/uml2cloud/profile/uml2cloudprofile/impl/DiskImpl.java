/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile.impl;

import es.uclm.uml2cloud.profile.uml2cloudprofile.Disk;
import es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudPackage;

import es.uclm.uml2cloud.profile.uml2cloudprofile.util.UML2CloudValidator;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.DiskImpl#getNumberOfDisks <em>Number Of Disks</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.DiskImpl#getReadBandwidthMBps <em>Read Bandwidth MBps</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.DiskImpl#getWriteBandwidthMBps <em>Write Bandwidth MBps</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.DiskImpl#getSizePerDeviceGB <em>Size Per Device GB</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiskImpl extends HardwareImpl implements Disk {
	/**
	 * The default value of the '{@link #getNumberOfDisks() <em>Number Of Disks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfDisks()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_DISKS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNumberOfDisks() <em>Number Of Disks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfDisks()
	 * @generated
	 * @ordered
	 */
	protected int numberOfDisks = NUMBER_OF_DISKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadBandwidthMBps() <em>Read Bandwidth MBps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadBandwidthMBps()
	 * @generated
	 * @ordered
	 */
	protected static final double READ_BANDWIDTH_MBPS_EDEFAULT = 500.0;

	/**
	 * The cached value of the '{@link #getReadBandwidthMBps() <em>Read Bandwidth MBps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadBandwidthMBps()
	 * @generated
	 * @ordered
	 */
	protected double readBandwidthMBps = READ_BANDWIDTH_MBPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriteBandwidthMBps() <em>Write Bandwidth MBps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteBandwidthMBps()
	 * @generated
	 * @ordered
	 */
	protected static final double WRITE_BANDWIDTH_MBPS_EDEFAULT = 350.0;

	/**
	 * The cached value of the '{@link #getWriteBandwidthMBps() <em>Write Bandwidth MBps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteBandwidthMBps()
	 * @generated
	 * @ordered
	 */
	protected double writeBandwidthMBps = WRITE_BANDWIDTH_MBPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSizePerDeviceGB() <em>Size Per Device GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizePerDeviceGB()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_PER_DEVICE_GB_EDEFAULT = 1000;

	/**
	 * The cached value of the '{@link #getSizePerDeviceGB() <em>Size Per Device GB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizePerDeviceGB()
	 * @generated
	 * @ordered
	 */
	protected int sizePerDeviceGB = SIZE_PER_DEVICE_GB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2CloudPackage.Literals.DISK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfDisks() {
		return numberOfDisks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfDisks(int newNumberOfDisks) {
		int oldNumberOfDisks = numberOfDisks;
		numberOfDisks = newNumberOfDisks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudPackage.DISK__NUMBER_OF_DISKS, oldNumberOfDisks, numberOfDisks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReadBandwidthMBps() {
		return readBandwidthMBps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadBandwidthMBps(double newReadBandwidthMBps) {
		double oldReadBandwidthMBps = readBandwidthMBps;
		readBandwidthMBps = newReadBandwidthMBps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudPackage.DISK__READ_BANDWIDTH_MBPS, oldReadBandwidthMBps, readBandwidthMBps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWriteBandwidthMBps() {
		return writeBandwidthMBps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteBandwidthMBps(double newWriteBandwidthMBps) {
		double oldWriteBandwidthMBps = writeBandwidthMBps;
		writeBandwidthMBps = newWriteBandwidthMBps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudPackage.DISK__WRITE_BANDWIDTH_MBPS, oldWriteBandwidthMBps, writeBandwidthMBps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSizePerDeviceGB() {
		return sizePerDeviceGB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizePerDeviceGB(int newSizePerDeviceGB) {
		int oldSizePerDeviceGB = sizePerDeviceGB;
		sizePerDeviceGB = newSizePerDeviceGB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudPackage.DISK__SIZE_PER_DEVICE_GB, oldSizePerDeviceGB, sizePerDeviceGB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean numberOfDisks_Must_Be_Greatter_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UML2CloudValidator.DISK__NUMBER_OF_DISKS_MUST_BE_GREATTER_THAN_ZERO,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "numberOfDisks_Must_Be_Greatter_Than_Zero", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean readBandwidthMBps_Must_Be_Greatter_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UML2CloudValidator.DISK__READ_BANDWIDTH_MBPS_MUST_BE_GREATTER_THAN_ZERO,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "readBandwidthMBps_Must_Be_Greatter_Than_Zero", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean writeBandwidthMBps_Must_Be_Greatter_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UML2CloudValidator.DISK__WRITE_BANDWIDTH_MBPS_MUST_BE_GREATTER_THAN_ZERO,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "writeBandwidthMBps_Must_Be_Greatter_Than_Zero", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean sizePerDeviceGB_Must_Be_Greatter_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UML2CloudValidator.DISK__SIZE_PER_DEVICE_GB_MUST_BE_GREATTER_THAN_ZERO,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "sizePerDeviceGB_Must_Be_Greatter_Than_Zero", EObjectValidator.getObjectLabel(this, context) }),
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
			case UML2CloudPackage.DISK__NUMBER_OF_DISKS:
				return getNumberOfDisks();
			case UML2CloudPackage.DISK__READ_BANDWIDTH_MBPS:
				return getReadBandwidthMBps();
			case UML2CloudPackage.DISK__WRITE_BANDWIDTH_MBPS:
				return getWriteBandwidthMBps();
			case UML2CloudPackage.DISK__SIZE_PER_DEVICE_GB:
				return getSizePerDeviceGB();
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
			case UML2CloudPackage.DISK__NUMBER_OF_DISKS:
				setNumberOfDisks((Integer)newValue);
				return;
			case UML2CloudPackage.DISK__READ_BANDWIDTH_MBPS:
				setReadBandwidthMBps((Double)newValue);
				return;
			case UML2CloudPackage.DISK__WRITE_BANDWIDTH_MBPS:
				setWriteBandwidthMBps((Double)newValue);
				return;
			case UML2CloudPackage.DISK__SIZE_PER_DEVICE_GB:
				setSizePerDeviceGB((Integer)newValue);
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
			case UML2CloudPackage.DISK__NUMBER_OF_DISKS:
				setNumberOfDisks(NUMBER_OF_DISKS_EDEFAULT);
				return;
			case UML2CloudPackage.DISK__READ_BANDWIDTH_MBPS:
				setReadBandwidthMBps(READ_BANDWIDTH_MBPS_EDEFAULT);
				return;
			case UML2CloudPackage.DISK__WRITE_BANDWIDTH_MBPS:
				setWriteBandwidthMBps(WRITE_BANDWIDTH_MBPS_EDEFAULT);
				return;
			case UML2CloudPackage.DISK__SIZE_PER_DEVICE_GB:
				setSizePerDeviceGB(SIZE_PER_DEVICE_GB_EDEFAULT);
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
			case UML2CloudPackage.DISK__NUMBER_OF_DISKS:
				return numberOfDisks != NUMBER_OF_DISKS_EDEFAULT;
			case UML2CloudPackage.DISK__READ_BANDWIDTH_MBPS:
				return readBandwidthMBps != READ_BANDWIDTH_MBPS_EDEFAULT;
			case UML2CloudPackage.DISK__WRITE_BANDWIDTH_MBPS:
				return writeBandwidthMBps != WRITE_BANDWIDTH_MBPS_EDEFAULT;
			case UML2CloudPackage.DISK__SIZE_PER_DEVICE_GB:
				return sizePerDeviceGB != SIZE_PER_DEVICE_GB_EDEFAULT;
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
			case UML2CloudPackage.DISK___NUMBER_OF_DISKS_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP:
				return numberOfDisks_Must_Be_Greatter_Than_Zero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UML2CloudPackage.DISK___READ_BANDWIDTH_MBPS_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP:
				return readBandwidthMBps_Must_Be_Greatter_Than_Zero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UML2CloudPackage.DISK___WRITE_BANDWIDTH_MBPS_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP:
				return writeBandwidthMBps_Must_Be_Greatter_Than_Zero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UML2CloudPackage.DISK___SIZE_PER_DEVICE_GB_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP:
				return sizePerDeviceGB_Must_Be_Greatter_Than_Zero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (numberOfDisks: ");
		result.append(numberOfDisks);
		result.append(", readBandwidthMBps: ");
		result.append(readBandwidthMBps);
		result.append(", writeBandwidthMBps: ");
		result.append(writeBandwidthMBps);
		result.append(", sizePerDeviceGB: ");
		result.append(sizePerDeviceGB);
		result.append(')');
		return result.toString();
	}

} //DiskImpl
