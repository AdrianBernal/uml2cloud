/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Bandwidth Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getBandwidthUnit()
 * @model
 * @generated
 */
public enum BandwidthUnit implements Enumerator {
	/**
	 * The '<em><b>Kbps</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KBPS_VALUE
	 * @generated
	 * @ordered
	 */
	KBPS(0, "Kbps", "Kbps"),

	/**
	 * The '<em><b>Mbps</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MBPS_VALUE
	 * @generated
	 * @ordered
	 */
	MBPS(1, "Mbps", "Mbps"),

	/**
	 * The '<em><b>Gbps</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GBPS_VALUE
	 * @generated
	 * @ordered
	 */
	GBPS(2, "Gbps", "Gbps");

	/**
	 * The '<em><b>Kbps</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KBPS
	 * @model name="Kbps"
	 * @generated
	 * @ordered
	 */
	public static final int KBPS_VALUE = 0;

	/**
	 * The '<em><b>Mbps</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MBPS
	 * @model name="Mbps"
	 * @generated
	 * @ordered
	 */
	public static final int MBPS_VALUE = 1;

	/**
	 * The '<em><b>Gbps</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GBPS
	 * @model name="Gbps"
	 * @generated
	 * @ordered
	 */
	public static final int GBPS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Bandwidth Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BandwidthUnit[] VALUES_ARRAY =
		new BandwidthUnit[] {
			KBPS,
			MBPS,
			GBPS,
		};

	/**
	 * A public read-only list of all the '<em><b>Bandwidth Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BandwidthUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Bandwidth Unit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BandwidthUnit get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BandwidthUnit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bandwidth Unit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BandwidthUnit getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BandwidthUnit result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bandwidth Unit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BandwidthUnit get(int value) {
		switch (value) {
			case KBPS_VALUE: return KBPS;
			case MBPS_VALUE: return MBPS;
			case GBPS_VALUE: return GBPS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BandwidthUnit(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //BandwidthUnit
