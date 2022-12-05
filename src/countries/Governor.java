/**
 */
package countries;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Governor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link countries.Governor#getYearElected <em>Year Elected</em>}</li>
 *   <li>{@link countries.Governor#getEndOfTermYear <em>End Of Term Year</em>}</li>
 *   <li>{@link countries.Governor#getYearsLivedInState <em>Years Lived In State</em>}</li>
 * </ul>
 *
 * @see countries.CountriesPackage#getGovernor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='yearsLimitation'"
 * @generated
 */
public interface Governor extends Politician {
	/**
	 * Returns the value of the '<em><b>Year Elected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year Elected</em>' attribute.
	 * @see #setYearElected(int)
	 * @see countries.CountriesPackage#getGovernor_YearElected()
	 * @model required="true"
	 * @generated
	 */
	int getYearElected();

	/**
	 * Sets the value of the '{@link countries.Governor#getYearElected <em>Year Elected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year Elected</em>' attribute.
	 * @see #getYearElected()
	 * @generated
	 */
	void setYearElected(int value);

	/**
	 * Returns the value of the '<em><b>End Of Term Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Of Term Year</em>' attribute.
	 * @see #setEndOfTermYear(int)
	 * @see countries.CountriesPackage#getGovernor_EndOfTermYear()
	 * @model required="true"
	 * @generated
	 */
	int getEndOfTermYear();

	/**
	 * Sets the value of the '{@link countries.Governor#getEndOfTermYear <em>End Of Term Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Of Term Year</em>' attribute.
	 * @see #getEndOfTermYear()
	 * @generated
	 */
	void setEndOfTermYear(int value);

	/**
	 * Returns the value of the '<em><b>Years Lived In State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Years Lived In State</em>' attribute.
	 * @see #setYearsLivedInState(int)
	 * @see countries.CountriesPackage#getGovernor_YearsLivedInState()
	 * @model required="true"
	 * @generated
	 */
	int getYearsLivedInState();

	/**
	 * Sets the value of the '{@link countries.Governor#getYearsLivedInState <em>Years Lived In State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Years Lived In State</em>' attribute.
	 * @see #getYearsLivedInState()
	 * @generated
	 */
	void setYearsLivedInState(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Governor.allInstances()-&gt;forAll(g:Governor | g.yearElected &lt; g.endOfTermYear)'"
	 * @generated
	 */
	boolean yearsLimitation(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Governor
