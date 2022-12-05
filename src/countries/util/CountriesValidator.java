/**
 */
package countries.util;

import countries.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see countries.CountriesPackage
 * @generated
 */
public class CountriesValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CountriesValidator INSTANCE = new CountriesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "countries";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Country Name' of 'Country'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COUNTRY__UNIQUE_COUNTRY_NAME = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique State Name' of 'State'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATE__UNIQUE_STATE_NAME = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique County Name' of 'County'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COUNTY__UNIQUE_COUNTY_NAME = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique City Name' of 'City'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CITY__UNIQUE_CITY_NAME = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Years Limitation' of 'Governor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GOVERNOR__YEARS_LIMITATION = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique President Number' of 'President'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRESIDENT__UNIQUE_PRESIDENT_NUMBER = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Age Limitation' of 'Mayor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MAYOR__AGE_LIMITATION = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Service Limitation' of 'Politician'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLITICIAN__SERVICE_LIMITATION = 8;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 8;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountriesValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CountriesPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CountriesPackage.COUNTRY:
				return validateCountry((Country)value, diagnostics, context);
			case CountriesPackage.STATE:
				return validateState((State)value, diagnostics, context);
			case CountriesPackage.COUNTY:
				return validateCounty((County)value, diagnostics, context);
			case CountriesPackage.CITY:
				return validateCity((City)value, diagnostics, context);
			case CountriesPackage.GOVERNOR:
				return validateGovernor((Governor)value, diagnostics, context);
			case CountriesPackage.PRESIDENT:
				return validatePresident((President)value, diagnostics, context);
			case CountriesPackage.COMMISSIONER:
				return validateCommissioner((Commissioner)value, diagnostics, context);
			case CountriesPackage.MAYOR:
				return validateMayor((Mayor)value, diagnostics, context);
			case CountriesPackage.POLITICIAN:
				return validatePolitician((Politician)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountry(Country country, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(country, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(country, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(country, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(country, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(country, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(country, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(country, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(country, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(country, diagnostics, context);
		if (result || diagnostics != null) result &= validateCountry_uniqueCountryName(country, diagnostics, context);
		return result;
	}

	/**
	 * Validates the uniqueCountryName constraint of '<em>Country</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountry_uniqueCountryName(Country country, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return country.uniqueCountryName(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(state, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_uniqueStateName(state, diagnostics, context);
		return result;
	}

	/**
	 * Validates the uniqueStateName constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_uniqueStateName(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return state.uniqueStateName(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCounty(County county, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(county, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(county, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(county, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(county, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(county, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(county, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(county, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(county, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(county, diagnostics, context);
		if (result || diagnostics != null) result &= validateCounty_uniqueCountyName(county, diagnostics, context);
		return result;
	}

	/**
	 * Validates the uniqueCountyName constraint of '<em>County</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCounty_uniqueCountyName(County county, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return county.uniqueCountyName(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCity(City city, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(city, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(city, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(city, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(city, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(city, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(city, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(city, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(city, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(city, diagnostics, context);
		if (result || diagnostics != null) result &= validateCity_uniqueCityName(city, diagnostics, context);
		return result;
	}

	/**
	 * Validates the uniqueCityName constraint of '<em>City</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCity_uniqueCityName(City city, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return city.uniqueCityName(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGovernor(Governor governor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(governor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(governor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(governor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(governor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(governor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(governor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(governor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(governor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(governor, diagnostics, context);
		if (result || diagnostics != null) result &= validatePolitician_serviceLimitation(governor, diagnostics, context);
		if (result || diagnostics != null) result &= validateGovernor_yearsLimitation(governor, diagnostics, context);
		return result;
	}

	/**
	 * Validates the yearsLimitation constraint of '<em>Governor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGovernor_yearsLimitation(Governor governor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return governor.yearsLimitation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePresident(President president, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(president, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(president, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(president, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(president, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(president, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(president, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(president, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(president, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(president, diagnostics, context);
		if (result || diagnostics != null) result &= validatePolitician_serviceLimitation(president, diagnostics, context);
		if (result || diagnostics != null) result &= validatePresident_uniquePresidentNumber(president, diagnostics, context);
		return result;
	}

	/**
	 * Validates the uniquePresidentNumber constraint of '<em>President</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePresident_uniquePresidentNumber(President president, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return president.uniquePresidentNumber(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommissioner(Commissioner commissioner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(commissioner, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(commissioner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(commissioner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(commissioner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(commissioner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(commissioner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(commissioner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(commissioner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(commissioner, diagnostics, context);
		if (result || diagnostics != null) result &= validatePolitician_serviceLimitation(commissioner, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMayor(Mayor mayor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mayor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mayor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mayor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mayor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mayor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mayor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mayor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mayor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mayor, diagnostics, context);
		if (result || diagnostics != null) result &= validatePolitician_serviceLimitation(mayor, diagnostics, context);
		if (result || diagnostics != null) result &= validateMayor_ageLimitation(mayor, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ageLimitation constraint of '<em>Mayor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMayor_ageLimitation(Mayor mayor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mayor.ageLimitation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolitician(Politician politician, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(politician, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(politician, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(politician, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(politician, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(politician, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(politician, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(politician, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(politician, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(politician, diagnostics, context);
		if (result || diagnostics != null) result &= validatePolitician_serviceLimitation(politician, diagnostics, context);
		return result;
	}

	/**
	 * Validates the serviceLimitation constraint of '<em>Politician</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolitician_serviceLimitation(Politician politician, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return politician.serviceLimitation(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CountriesValidator
