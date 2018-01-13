/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cloud Provider Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudPackage#getCloudProviderType()
 * @model
 * @generated
 */
public enum CloudProviderType implements Enumerator {
	/**
	 * The '<em><b>Cloud Provider First Fit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOUD_PROVIDER_FIRST_FIT_VALUE
	 * @generated
	 * @ordered
	 */
	CLOUD_PROVIDER_FIRST_FIT(0, "CloudProviderFirstFit", "CloudProviderFirstFit");

	/**
	 * The '<em><b>Cloud Provider First Fit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cloud Provider First Fit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLOUD_PROVIDER_FIRST_FIT
	 * @model name="CloudProviderFirstFit"
	 * @generated
	 * @ordered
	 */
	public static final int CLOUD_PROVIDER_FIRST_FIT_VALUE = 0;

	/**
	 * An array of all the '<em><b>Cloud Provider Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CloudProviderType[] VALUES_ARRAY =
		new CloudProviderType[] {
			CLOUD_PROVIDER_FIRST_FIT,
		};

	/**
	 * A public read-only list of all the '<em><b>Cloud Provider Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CloudProviderType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cloud Provider Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CloudProviderType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CloudProviderType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cloud Provider Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CloudProviderType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CloudProviderType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cloud Provider Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CloudProviderType get(int value) {
		switch (value) {
			case CLOUD_PROVIDER_FIRST_FIT_VALUE: return CLOUD_PROVIDER_FIRST_FIT;
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
	private CloudProviderType(int value, String name, String literal) {
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
	
} //CloudProviderType
