/**
 */
package countries;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>County</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link countries.County#getName <em>Name</em>}</li>
 *   <li>{@link countries.County#getCountyNumber <em>County Number</em>}</li>
 *   <li>{@link countries.County#getLargestCity <em>Largest City</em>}</li>
 *   <li>{@link countries.County#getCity <em>City</em>}</li>
 *   <li>{@link countries.County#getCommissioner <em>Commissioner</em>}</li>
 * </ul>
 *
 * @see countries.CountriesPackage#getCounty()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueCountyName'"
 * @generated
 */
public interface County extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see countries.CountriesPackage#getCounty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link countries.County#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>County Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>County Number</em>' attribute.
	 * @see #setCountyNumber(int)
	 * @see countries.CountriesPackage#getCounty_CountyNumber()
	 * @model required="true"
	 * @generated
	 */
	int getCountyNumber();

	/**
	 * Sets the value of the '{@link countries.County#getCountyNumber <em>County Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>County Number</em>' attribute.
	 * @see #getCountyNumber()
	 * @generated
	 */
	void setCountyNumber(int value);

	/**
	 * Returns the value of the '<em><b>Largest City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Largest City</em>' attribute.
	 * @see #setLargestCity(String)
	 * @see countries.CountriesPackage#getCounty_LargestCity()
	 * @model
	 * @generated
	 */
	String getLargestCity();

	/**
	 * Sets the value of the '{@link countries.County#getLargestCity <em>Largest City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Largest City</em>' attribute.
	 * @see #getLargestCity()
	 * @generated
	 */
	void setLargestCity(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' containment reference list.
	 * The list contents are of type {@link countries.City}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' containment reference list.
	 * @see countries.CountriesPackage#getCounty_City()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<City> getCity();

	/**
	 * Returns the value of the '<em><b>Commissioner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commissioner</em>' reference.
	 * @see #setCommissioner(Commissioner)
	 * @see countries.CountriesPackage#getCounty_Commissioner()
	 * @model required="true"
	 * @generated
	 */
	Commissioner getCommissioner();

	/**
	 * Sets the value of the '{@link countries.County#getCommissioner <em>Commissioner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commissioner</em>' reference.
	 * @see #getCommissioner()
	 * @generated
	 */
	void setCommissioner(Commissioner value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='County.allInstances()-&gt;one(c : County | c.name = self.name)'"
	 * @generated
	 */
	boolean uniqueCountyName(DiagnosticChain diagnostics, Map<Object, Object> context);

} // County
