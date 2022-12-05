/**
 */
package countries;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link countries.City#getName <em>Name</em>}</li>
 *   <li>{@link countries.City#getPopulation <em>Population</em>}</li>
 *   <li>{@link countries.City#isIsStateCapital <em>Is State Capital</em>}</li>
 *   <li>{@link countries.City#getMayor <em>Mayor</em>}</li>
 * </ul>
 *
 * @see countries.CountriesPackage#getCity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueCityName'"
 * @generated
 */
public interface City extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see countries.CountriesPackage#getCity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link countries.City#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Population</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population</em>' attribute.
	 * @see #setPopulation(int)
	 * @see countries.CountriesPackage#getCity_Population()
	 * @model required="true"
	 * @generated
	 */
	int getPopulation();

	/**
	 * Sets the value of the '{@link countries.City#getPopulation <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population</em>' attribute.
	 * @see #getPopulation()
	 * @generated
	 */
	void setPopulation(int value);

	/**
	 * Returns the value of the '<em><b>Is State Capital</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is State Capital</em>' attribute.
	 * @see #setIsStateCapital(boolean)
	 * @see countries.CountriesPackage#getCity_IsStateCapital()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsStateCapital();

	/**
	 * Sets the value of the '{@link countries.City#isIsStateCapital <em>Is State Capital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is State Capital</em>' attribute.
	 * @see #isIsStateCapital()
	 * @generated
	 */
	void setIsStateCapital(boolean value);

	/**
	 * Returns the value of the '<em><b>Mayor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mayor</em>' reference.
	 * @see #setMayor(Mayor)
	 * @see countries.CountriesPackage#getCity_Mayor()
	 * @model required="true"
	 * @generated
	 */
	Mayor getMayor();

	/**
	 * Sets the value of the '{@link countries.City#getMayor <em>Mayor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mayor</em>' reference.
	 * @see #getMayor()
	 * @generated
	 */
	void setMayor(Mayor value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='City.allInstances()-&gt;one(c : City | c.name = self.name)'"
	 * @generated
	 */
	boolean uniqueCityName(DiagnosticChain diagnostics, Map<Object, Object> context);

} // City
