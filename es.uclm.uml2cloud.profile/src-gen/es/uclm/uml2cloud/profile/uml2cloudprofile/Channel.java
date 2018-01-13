/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Channel</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudPackage#getChannel()
 * @model
 * @generated
 */
public enum Channel implements Enumerator {
	/**
	 * The '<em><b>Ethernet10 Mbps</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETHERNET10_MBPS_VALUE
	 * @generated
	 * @ordered
	 */
	ETHERNET10_MBPS(0, "Ethernet10Mbps", "Ethernet10Mbps"),

	/**
	 * The '<em><b>Ethernet100 Mbps</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETHERNET100_MBPS_VALUE
	 * @generated
	 * @ordered
	 */
	ETHERNET100_MBPS(1, "Ethernet100Mbps", "Ethernet100Mbps"),

	/**
	 * The '<em><b>Ethernet1 Gbps</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETHERNET1_GBPS_VALUE
	 * @generated
	 * @ordered
	 */
	ETHERNET1_GBPS(2, "Ethernet1Gbps", "Ethernet1Gbps"),

	/**
	 * The '<em><b>Ethernet10 Gbps</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETHERNET10_GBPS_VALUE
	 * @generated
	 * @ordered
	 */
	ETHERNET10_GBPS(3, "Ethernet10Gbps", "Ethernet10Gbps"),

	/**
	 * The '<em><b>Ethernet40 Gbps</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETHERNET40_GBPS_VALUE
	 * @generated
	 * @ordered
	 */
	ETHERNET40_GBPS(4, "Ethernet40Gbps", "Ethernet40Gbps"),

	/**
	 * The '<em><b>Ethernet100 Gbps</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETHERNET100_GBPS_VALUE
	 * @generated
	 * @ordered
	 */
	ETHERNET100_GBPS(5, "Ethernet100Gbps", "Ethernet100Gbps");

	/**
	 * The '<em><b>Ethernet10 Mbps</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ethernet10 Mbps</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ETHERNET10_MBPS
	 * @model name="Ethernet10Mbps"
	 * @generated
	 * @ordered
	 */
	public static final int ETHERNET10_MBPS_VALUE = 0;

	/**
	 * The '<em><b>Ethernet100 Mbps</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ethernet100 Mbps</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ETHERNET100_MBPS
	 * @model name="Ethernet100Mbps"
	 * @generated
	 * @ordered
	 */
	public static final int ETHERNET100_MBPS_VALUE = 1;

	/**
	 * The '<em><b>Ethernet1 Gbps</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ethernet1 Gbps</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ETHERNET1_GBPS
	 * @model name="Ethernet1Gbps"
	 * @generated
	 * @ordered
	 */
	public static final int ETHERNET1_GBPS_VALUE = 2;

	/**
	 * The '<em><b>Ethernet10 Gbps</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ethernet10 Gbps</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ETHERNET10_GBPS
	 * @model name="Ethernet10Gbps"
	 * @generated
	 * @ordered
	 */
	public static final int ETHERNET10_GBPS_VALUE = 3;

	/**
	 * The '<em><b>Ethernet40 Gbps</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ethernet40 Gbps</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ETHERNET40_GBPS
	 * @model name="Ethernet40Gbps"
	 * @generated
	 * @ordered
	 */
	public static final int ETHERNET40_GBPS_VALUE = 4;

	/**
	 * The '<em><b>Ethernet100 Gbps</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ethernet100 Gbps</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ETHERNET100_GBPS
	 * @model name="Ethernet100Gbps"
	 * @generated
	 * @ordered
	 */
	public static final int ETHERNET100_GBPS_VALUE = 5;

	/**
	 * An array of all the '<em><b>Channel</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Channel[] VALUES_ARRAY =
		new Channel[] {
			ETHERNET10_MBPS,
			ETHERNET100_MBPS,
			ETHERNET1_GBPS,
			ETHERNET10_GBPS,
			ETHERNET40_GBPS,
			ETHERNET100_GBPS,
		};

	/**
	 * A public read-only list of all the '<em><b>Channel</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Channel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Channel</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Channel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Channel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Channel</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Channel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Channel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Channel</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Channel get(int value) {
		switch (value) {
			case ETHERNET10_MBPS_VALUE: return ETHERNET10_MBPS;
			case ETHERNET100_MBPS_VALUE: return ETHERNET100_MBPS;
			case ETHERNET1_GBPS_VALUE: return ETHERNET1_GBPS;
			case ETHERNET10_GBPS_VALUE: return ETHERNET10_GBPS;
			case ETHERNET40_GBPS_VALUE: return ETHERNET40_GBPS;
			case ETHERNET100_GBPS_VALUE: return ETHERNET100_GBPS;
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
	private Channel(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //Channel
