/**
 */
package countries;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commissioner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link countries.Commissioner#getYearElected <em>Year Elected</em>}</li>
 *   <li>{@link countries.Commissioner#getCongressionalDistrict <em>Congressional District</em>}</li>
 *   <li>{@link countries.Commissioner#isIsIncumbent <em>Is Incumbent</em>}</li>
 * </ul>
 *
 * @see countries.CountriesPackage#getCommissioner()
 * @model
 * @generated
 */
public interface Commissioner extends Politician {
	/**
	 * Returns the value of the '<em><b>Year Elected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year Elected</em>' attribute.
	 * @see #setYearElected(int)
	 * @see countries.CountriesPackage#getCommissioner_YearElected()
	 * @model required="true"
	 * @generated
	 */
	int getYearElected();

	/**
	 * Sets the value of the '{@link countries.Commissioner#getYearElected <em>Year Elected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year Elected</em>' attribute.
	 * @see #getYearElected()
	 * @generated
	 */
	void setYearElected(int value);

	/**
	 * Returns the value of the '<em><b>Congressional District</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Congressional District</em>' attribute.
	 * @see #setCongressionalDistrict(int)
	 * @see countries.CountriesPackage#getCommissioner_CongressionalDistrict()
	 * @model required="true"
	 * @generated
	 */
	int getCongressionalDistrict();

	/**
	 * Sets the value of the '{@link countries.Commissioner#getCongressionalDistrict <em>Congressional District</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Congressional District</em>' attribute.
	 * @see #getCongressionalDistrict()
	 * @generated
	 */
	void setCongressionalDistrict(int value);

	/**
	 * Returns the value of the '<em><b>Is Incumbent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Incumbent</em>' attribute.
	 * @see #setIsIncumbent(boolean)
	 * @see countries.CountriesPackage#getCommissioner_IsIncumbent()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsIncumbent();

	/**
	 * Sets the value of the '{@link countries.Commissioner#isIsIncumbent <em>Is Incumbent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Incumbent</em>' attribute.
	 * @see #isIsIncumbent()
	 * @generated
	 */
	void setIsIncumbent(boolean value);

} // Commissioner
