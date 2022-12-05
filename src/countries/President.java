/**
 */
package countries;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>President</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link countries.President#getPresidentNumber <em>President Number</em>}</li>
 *   <li>{@link countries.President#isEligibleForReelection <em>Eligible For Reelection</em>}</li>
 *   <li>{@link countries.President#getSecretCodename <em>Secret Codename</em>}</li>
 * </ul>
 *
 * @see countries.CountriesPackage#getPresident()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniquePresidentNumber'"
 * @generated
 */
public interface President extends Politician {
	/**
	 * Returns the value of the '<em><b>President Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>President Number</em>' attribute.
	 * @see #setPresidentNumber(int)
	 * @see countries.CountriesPackage#getPresident_PresidentNumber()
	 * @model required="true"
	 * @generated
	 */
	int getPresidentNumber();

	/**
	 * Sets the value of the '{@link countries.President#getPresidentNumber <em>President Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>President Number</em>' attribute.
	 * @see #getPresidentNumber()
	 * @generated
	 */
	void setPresidentNumber(int value);

	/**
	 * Returns the value of the '<em><b>Eligible For Reelection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eligible For Reelection</em>' attribute.
	 * @see #setEligibleForReelection(boolean)
	 * @see countries.CountriesPackage#getPresident_EligibleForReelection()
	 * @model required="true"
	 * @generated
	 */
	boolean isEligibleForReelection();

	/**
	 * Sets the value of the '{@link countries.President#isEligibleForReelection <em>Eligible For Reelection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eligible For Reelection</em>' attribute.
	 * @see #isEligibleForReelection()
	 * @generated
	 */
	void setEligibleForReelection(boolean value);

	/**
	 * Returns the value of the '<em><b>Secret Codename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secret Codename</em>' attribute.
	 * @see #setSecretCodename(String)
	 * @see countries.CountriesPackage#getPresident_SecretCodename()
	 * @model
	 * @generated
	 */
	String getSecretCodename();

	/**
	 * Sets the value of the '{@link countries.President#getSecretCodename <em>Secret Codename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secret Codename</em>' attribute.
	 * @see #getSecretCodename()
	 * @generated
	 */
	void setSecretCodename(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='President.allInstances()-&gt;one(p:President | p.presidentNumber = self.presidentNumber)'"
	 * @generated
	 */
	boolean uniquePresidentNumber(DiagnosticChain diagnostics, Map<Object, Object> context);

} // President
