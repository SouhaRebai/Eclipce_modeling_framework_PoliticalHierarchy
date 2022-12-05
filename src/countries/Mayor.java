/**
 */
package countries;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mayor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link countries.Mayor#getAddress <em>Address</em>}</li>
 *   <li>{@link countries.Mayor#getTimesElected <em>Times Elected</em>}</li>
 *   <li>{@link countries.Mayor#getAgeElectedAsMayor <em>Age Elected As Mayor</em>}</li>
 * </ul>
 *
 * @see countries.CountriesPackage#getMayor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ageLimitation'"
 * @generated
 */
public interface Mayor extends Politician {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see countries.CountriesPackage#getMayor_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link countries.Mayor#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Times Elected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Times Elected</em>' attribute.
	 * @see #setTimesElected(int)
	 * @see countries.CountriesPackage#getMayor_TimesElected()
	 * @model required="true"
	 * @generated
	 */
	int getTimesElected();

	/**
	 * Sets the value of the '{@link countries.Mayor#getTimesElected <em>Times Elected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Times Elected</em>' attribute.
	 * @see #getTimesElected()
	 * @generated
	 */
	void setTimesElected(int value);

	/**
	 * Returns the value of the '<em><b>Age Elected As Mayor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age Elected As Mayor</em>' attribute.
	 * @see #setAgeElectedAsMayor(int)
	 * @see countries.CountriesPackage#getMayor_AgeElectedAsMayor()
	 * @model required="true"
	 * @generated
	 */
	int getAgeElectedAsMayor();

	/**
	 * Sets the value of the '{@link countries.Mayor#getAgeElectedAsMayor <em>Age Elected As Mayor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age Elected As Mayor</em>' attribute.
	 * @see #getAgeElectedAsMayor()
	 * @generated
	 */
	void setAgeElectedAsMayor(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Mayor.allInstances()-&gt;one(m:Mayor | m.ageElectedAsMayor &lt;71 and m.ageElectedAsMayor &gt; 24 )'"
	 * @generated
	 */
	boolean ageLimitation(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Mayor
