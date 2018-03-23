/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Size Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage#getSizeUnit()
 * @model
 * @generated
 */
public enum SizeUnit implements Enumerator {
	/**
	 * The '<em><b>KByte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KBYTE_VALUE
	 * @generated
	 * @ordered
	 */
	KBYTE(0, "KByte", "KByte"),

	/**
	 * The '<em><b>MByte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MBYTE_VALUE
	 * @generated
	 * @ordered
	 */
	MBYTE(1, "MByte", "MByte"),

	/**
	 * The '<em><b>GByte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GBYTE_VALUE
	 * @generated
	 * @ordered
	 */
	GBYTE(2, "GByte", "GByte"),

	/**
	 * The '<em><b>TByte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TBYTE_VALUE
	 * @generated
	 * @ordered
	 */
	TBYTE(3, "TByte", "TByte");

	/**
	 * The '<em><b>KByte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KByte</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KBYTE
	 * @model name="KByte"
	 * @generated
	 * @ordered
	 */
	public static final int KBYTE_VALUE = 0;

	/**
	 * The '<em><b>MByte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MByte</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MBYTE
	 * @model name="MByte"
	 * @generated
	 * @ordered
	 */
	public static final int MBYTE_VALUE = 1;

	/**
	 * The '<em><b>GByte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GByte</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GBYTE
	 * @model name="GByte"
	 * @generated
	 * @ordered
	 */
	public static final int GBYTE_VALUE = 2;

	/**
	 * The '<em><b>TByte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TByte</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TBYTE
	 * @model name="TByte"
	 * @generated
	 * @ordered
	 */
	public static final int TBYTE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Size Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SizeUnit[] VALUES_ARRAY =
		new SizeUnit[] {
			KBYTE,
			MBYTE,
			GBYTE,
			TBYTE,
		};

	/**
	 * A public read-only list of all the '<em><b>Size Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SizeUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Size Unit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SizeUnit get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SizeUnit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Size Unit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SizeUnit getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SizeUnit result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Size Unit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SizeUnit get(int value) {
		switch (value) {
			case KBYTE_VALUE: return KBYTE;
			case MBYTE_VALUE: return MBYTE;
			case GBYTE_VALUE: return GBYTE;
			case TBYTE_VALUE: return TBYTE;
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
	private SizeUnit(int value, String name, String literal) {
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
	
} //SizeUnit
