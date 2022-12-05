/**
 */
package countries;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Politician</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link countries.Politician#getName <em>Name</em>}</li>
 *   <li>{@link countries.Politician#getPoliticalParty <em>Political Party</em>}</li>
 *   <li>{@link countries.Politician#getTotalYearsInService <em>Total Years In Service</em>}</li>
 * </ul>
 *
 * @see countries.CountriesPackage#getPolitician()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='serviceLimitation'"
 * @generated
 */
public interface Politician extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see countries.CountriesPackage#getPolitician_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link countries.Politician#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Political Party</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Political Party</em>' attribute.
	 * @see #setPoliticalParty(String)
	 * @see countries.CountriesPackage#getPolitician_PoliticalParty()
	 * @model
	 * @generated
	 */
	String getPoliticalParty();

	/**
	 * Sets the value of the '{@link countries.Politician#getPoliticalParty <em>Political Party</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Political Party</em>' attribute.
	 * @see #getPoliticalParty()
	 * @generated
	 */
	void setPoliticalParty(String value);

	/**
	 * Returns the value of the '<em><b>Total Years In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Years In Service</em>' attribute.
	 * @see #setTotalYearsInService(double)
	 * @see countries.CountriesPackage#getPolitician_TotalYearsInService()
	 * @model required="true"
	 * @generated
	 */
	double getTotalYearsInService();

	/**
	 * Sets the value of the '{@link countries.Politician#getTotalYearsInService <em>Total Years In Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Years In Service</em>' attribute.
	 * @see #getTotalYearsInService()
	 * @generated
	 */
	void setTotalYearsInService(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Politician.allInstances()-&gt;one(p:Politician | p.totalYearsInService &lt;5)'"
	 * @generated
	 */
	boolean serviceLimitation(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Politician
