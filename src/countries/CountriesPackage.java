/**
 */
package countries;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see countries.CountriesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface CountriesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "countries";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/EMF_modeling_project/model/countries.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "countries";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CountriesPackage eINSTANCE = countries.impl.CountriesPackageImpl.init();

	/**
	 * The meta object id for the '{@link countries.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see countries.impl.CountryImpl
	 * @see countries.impl.CountriesPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Year Founded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__YEAR_FOUNDED = 1;

	/**
	 * The feature id for the '<em><b>Is Part Of UN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__IS_PART_OF_UN = 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__STATE = 3;

	/**
	 * The feature id for the '<em><b>President</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__PRESIDENT = 4;

	/**
	 * The number of structural features of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Unique Country Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY___UNIQUE_COUNTRY_NAME__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link countries.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see countries.impl.StateImpl
	 * @see countries.impl.CountriesPackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Population</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__POPULATION = 1;

	/**
	 * The feature id for the '<em><b>Total Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TOTAL_AREA = 2;

	/**
	 * The feature id for the '<em><b>County</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__COUNTY = 3;

	/**
	 * The feature id for the '<em><b>Governor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__GOVERNOR = 4;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Unique State Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___UNIQUE_STATE_NAME__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link countries.impl.CountyImpl <em>County</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see countries.impl.CountyImpl
	 * @see countries.impl.CountriesPackageImpl#getCounty()
	 * @generated
	 */
	int COUNTY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>County Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTY__COUNTY_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Largest City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTY__LARGEST_CITY = 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTY__CITY = 3;

	/**
	 * The feature id for the '<em><b>Commissioner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTY__COMMISSIONER = 4;

	/**
	 * The number of structural features of the '<em>County</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTY_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Unique County Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTY___UNIQUE_COUNTY_NAME__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>County</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link countries.impl.CityImpl <em>City</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see countries.impl.CityImpl
	 * @see countries.impl.CountriesPackageImpl#getCity()
	 * @generated
	 */
	int CITY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Population</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__POPULATION = 1;

	/**
	 * The feature id for the '<em><b>Is State Capital</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__IS_STATE_CAPITAL = 2;

	/**
	 * The feature id for the '<em><b>Mayor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__MAYOR = 3;

	/**
	 * The number of structural features of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Unique City Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY___UNIQUE_CITY_NAME__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link countries.impl.PoliticianImpl <em>Politician</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see countries.impl.PoliticianImpl
	 * @see countries.impl.CountriesPackageImpl#getPolitician()
	 * @generated
	 */
	int POLITICIAN = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLITICIAN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Political Party</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLITICIAN__POLITICAL_PARTY = 1;

	/**
	 * The feature id for the '<em><b>Total Years In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLITICIAN__TOTAL_YEARS_IN_SERVICE = 2;

	/**
	 * The number of structural features of the '<em>Politician</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLITICIAN_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Service Limitation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLITICIAN___SERVICE_LIMITATION__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Politician</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLITICIAN_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link countries.impl.GovernorImpl <em>Governor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see countries.impl.GovernorImpl
	 * @see countries.impl.CountriesPackageImpl#getGovernor()
	 * @generated
	 */
	int GOVERNOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNOR__NAME = POLITICIAN__NAME;

	/**
	 * The feature id for the '<em><b>Political Party</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNOR__POLITICAL_PARTY = POLITICIAN__POLITICAL_PARTY;

	/**
	 * The feature id for the '<em><b>Total Years In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNOR__TOTAL_YEARS_IN_SERVICE = POLITICIAN__TOTAL_YEARS_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Year Elected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNOR__YEAR_ELECTED = POLITICIAN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Of Term Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNOR__END_OF_TERM_YEAR = POLITICIAN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Years Lived In State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNOR__YEARS_LIVED_IN_STATE = POLITICIAN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Governor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNOR_FEATURE_COUNT = POLITICIAN_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Service Limitation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNOR___SERVICE_LIMITATION__DIAGNOSTICCHAIN_MAP = POLITICIAN___SERVICE_LIMITATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Years Limitation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNOR___YEARS_LIMITATION__DIAGNOSTICCHAIN_MAP = POLITICIAN_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Governor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVERNOR_OPERATION_COUNT = POLITICIAN_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link countries.impl.PresidentImpl <em>President</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see countries.impl.PresidentImpl
	 * @see countries.impl.CountriesPackageImpl#getPresident()
	 * @generated
	 */
	int PRESIDENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESIDENT__NAME = POLITICIAN__NAME;

	/**
	 * The feature id for the '<em><b>Political Party</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESIDENT__POLITICAL_PARTY = POLITICIAN__POLITICAL_PARTY;

	/**
	 * The feature id for the '<em><b>Total Years In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESIDENT__TOTAL_YEARS_IN_SERVICE = POLITICIAN__TOTAL_YEARS_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>President Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESIDENT__PRESIDENT_NUMBER = POLITICIAN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Eligible For Reelection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESIDENT__ELIGIBLE_FOR_REELECTION = POLITICIAN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Secret Codename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESIDENT__SECRET_CODENAME = POLITICIAN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>President</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESIDENT_FEATURE_COUNT = POLITICIAN_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Service Limitation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESIDENT___SERVICE_LIMITATION__DIAGNOSTICCHAIN_MAP = POLITICIAN___SERVICE_LIMITATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Unique President Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESIDENT___UNIQUE_PRESIDENT_NUMBER__DIAGNOSTICCHAIN_MAP = POLITICIAN_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>President</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESIDENT_OPERATION_COUNT = POLITICIAN_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link countries.impl.CommissionerImpl <em>Commissioner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see countries.impl.CommissionerImpl
	 * @see countries.impl.CountriesPackageImpl#getCommissioner()
	 * @generated
	 */
	int COMMISSIONER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMISSIONER__NAME = POLITICIAN__NAME;

	/**
	 * The feature id for the '<em><b>Political Party</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMISSIONER__POLITICAL_PARTY = POLITICIAN__POLITICAL_PARTY;

	/**
	 * The feature id for the '<em><b>Total Years In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMISSIONER__TOTAL_YEARS_IN_SERVICE = POLITICIAN__TOTAL_YEARS_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Year Elected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMISSIONER__YEAR_ELECTED = POLITICIAN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Congressional District</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMISSIONER__CONGRESSIONAL_DISTRICT = POLITICIAN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Incumbent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMISSIONER__IS_INCUMBENT = POLITICIAN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Commissioner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMISSIONER_FEATURE_COUNT = POLITICIAN_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Service Limitation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMISSIONER___SERVICE_LIMITATION__DIAGNOSTICCHAIN_MAP = POLITICIAN___SERVICE_LIMITATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Commissioner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMISSIONER_OPERATION_COUNT = POLITICIAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link countries.impl.MayorImpl <em>Mayor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see countries.impl.MayorImpl
	 * @see countries.impl.CountriesPackageImpl#getMayor()
	 * @generated
	 */
	int MAYOR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYOR__NAME = POLITICIAN__NAME;

	/**
	 * The feature id for the '<em><b>Political Party</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYOR__POLITICAL_PARTY = POLITICIAN__POLITICAL_PARTY;

	/**
	 * The feature id for the '<em><b>Total Years In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYOR__TOTAL_YEARS_IN_SERVICE = POLITICIAN__TOTAL_YEARS_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYOR__ADDRESS = POLITICIAN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Times Elected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYOR__TIMES_ELECTED = POLITICIAN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Age Elected As Mayor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYOR__AGE_ELECTED_AS_MAYOR = POLITICIAN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mayor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYOR_FEATURE_COUNT = POLITICIAN_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Service Limitation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYOR___SERVICE_LIMITATION__DIAGNOSTICCHAIN_MAP = POLITICIAN___SERVICE_LIMITATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Age Limitation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYOR___AGE_LIMITATION__DIAGNOSTICCHAIN_MAP = POLITICIAN_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mayor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAYOR_OPERATION_COUNT = POLITICIAN_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link countries.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country</em>'.
	 * @see countries.Country
	 * @generated
	 */
	EClass getCountry();

	/**
	 * Returns the meta object for the attribute '{@link countries.Country#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see countries.Country#getName()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_Name();

	/**
	 * Returns the meta object for the attribute '{@link countries.Country#getYearFounded <em>Year Founded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year Founded</em>'.
	 * @see countries.Country#getYearFounded()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_YearFounded();

	/**
	 * Returns the meta object for the attribute '{@link countries.Country#isIsPartOfUN <em>Is Part Of UN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Part Of UN</em>'.
	 * @see countries.Country#isIsPartOfUN()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_IsPartOfUN();

	/**
	 * Returns the meta object for the containment reference list '{@link countries.Country#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see countries.Country#getState()
	 * @see #getCountry()
	 * @generated
	 */
	EReference getCountry_State();

	/**
	 * Returns the meta object for the reference '{@link countries.Country#getPresident <em>President</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>President</em>'.
	 * @see countries.Country#getPresident()
	 * @see #getCountry()
	 * @generated
	 */
	EReference getCountry_President();

	/**
	 * Returns the meta object for the '{@link countries.Country#uniqueCountryName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Country Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Country Name</em>' operation.
	 * @see countries.Country#uniqueCountryName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCountry__UniqueCountryName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link countries.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see countries.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link countries.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see countries.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the attribute '{@link countries.State#getPopulation <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Population</em>'.
	 * @see countries.State#getPopulation()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Population();

	/**
	 * Returns the meta object for the attribute '{@link countries.State#getTotalArea <em>Total Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Area</em>'.
	 * @see countries.State#getTotalArea()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_TotalArea();

	/**
	 * Returns the meta object for the containment reference list '{@link countries.State#getCounty <em>County</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>County</em>'.
	 * @see countries.State#getCounty()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_County();

	/**
	 * Returns the meta object for the reference '{@link countries.State#getGovernor <em>Governor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Governor</em>'.
	 * @see countries.State#getGovernor()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Governor();

	/**
	 * Returns the meta object for the '{@link countries.State#uniqueStateName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique State Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique State Name</em>' operation.
	 * @see countries.State#uniqueStateName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getState__UniqueStateName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link countries.County <em>County</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>County</em>'.
	 * @see countries.County
	 * @generated
	 */
	EClass getCounty();

	/**
	 * Returns the meta object for the attribute '{@link countries.County#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see countries.County#getName()
	 * @see #getCounty()
	 * @generated
	 */
	EAttribute getCounty_Name();

	/**
	 * Returns the meta object for the attribute '{@link countries.County#getCountyNumber <em>County Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>County Number</em>'.
	 * @see countries.County#getCountyNumber()
	 * @see #getCounty()
	 * @generated
	 */
	EAttribute getCounty_CountyNumber();

	/**
	 * Returns the meta object for the attribute '{@link countries.County#getLargestCity <em>Largest City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Largest City</em>'.
	 * @see countries.County#getLargestCity()
	 * @see #getCounty()
	 * @generated
	 */
	EAttribute getCounty_LargestCity();

	/**
	 * Returns the meta object for the containment reference list '{@link countries.County#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>City</em>'.
	 * @see countries.County#getCity()
	 * @see #getCounty()
	 * @generated
	 */
	EReference getCounty_City();

	/**
	 * Returns the meta object for the reference '{@link countries.County#getCommissioner <em>Commissioner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Commissioner</em>'.
	 * @see countries.County#getCommissioner()
	 * @see #getCounty()
	 * @generated
	 */
	EReference getCounty_Commissioner();

	/**
	 * Returns the meta object for the '{@link countries.County#uniqueCountyName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique County Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique County Name</em>' operation.
	 * @see countries.County#uniqueCountyName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCounty__UniqueCountyName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link countries.City <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City</em>'.
	 * @see countries.City
	 * @generated
	 */
	EClass getCity();

	/**
	 * Returns the meta object for the attribute '{@link countries.City#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see countries.City#getName()
	 * @see #getCity()
	 * @generated
	 */
	EAttribute getCity_Name();

	/**
	 * Returns the meta object for the attribute '{@link countries.City#getPopulation <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Population</em>'.
	 * @see countries.City#getPopulation()
	 * @see #getCity()
	 * @generated
	 */
	EAttribute getCity_Population();

	/**
	 * Returns the meta object for the attribute '{@link countries.City#isIsStateCapital <em>Is State Capital</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is State Capital</em>'.
	 * @see countries.City#isIsStateCapital()
	 * @see #getCity()
	 * @generated
	 */
	EAttribute getCity_IsStateCapital();

	/**
	 * Returns the meta object for the reference '{@link countries.City#getMayor <em>Mayor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mayor</em>'.
	 * @see countries.City#getMayor()
	 * @see #getCity()
	 * @generated
	 */
	EReference getCity_Mayor();

	/**
	 * Returns the meta object for the '{@link countries.City#uniqueCityName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique City Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique City Name</em>' operation.
	 * @see countries.City#uniqueCityName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCity__UniqueCityName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link countries.Governor <em>Governor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Governor</em>'.
	 * @see countries.Governor
	 * @generated
	 */
	EClass getGovernor();

	/**
	 * Returns the meta object for the attribute '{@link countries.Governor#getYearElected <em>Year Elected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year Elected</em>'.
	 * @see countries.Governor#getYearElected()
	 * @see #getGovernor()
	 * @generated
	 */
	EAttribute getGovernor_YearElected();

	/**
	 * Returns the meta object for the attribute '{@link countries.Governor#getEndOfTermYear <em>End Of Term Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Of Term Year</em>'.
	 * @see countries.Governor#getEndOfTermYear()
	 * @see #getGovernor()
	 * @generated
	 */
	EAttribute getGovernor_EndOfTermYear();

	/**
	 * Returns the meta object for the attribute '{@link countries.Governor#getYearsLivedInState <em>Years Lived In State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Years Lived In State</em>'.
	 * @see countries.Governor#getYearsLivedInState()
	 * @see #getGovernor()
	 * @generated
	 */
	EAttribute getGovernor_YearsLivedInState();

	/**
	 * Returns the meta object for the '{@link countries.Governor#yearsLimitation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Years Limitation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Years Limitation</em>' operation.
	 * @see countries.Governor#yearsLimitation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getGovernor__YearsLimitation__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link countries.President <em>President</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>President</em>'.
	 * @see countries.President
	 * @generated
	 */
	EClass getPresident();

	/**
	 * Returns the meta object for the attribute '{@link countries.President#getPresidentNumber <em>President Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>President Number</em>'.
	 * @see countries.President#getPresidentNumber()
	 * @see #getPresident()
	 * @generated
	 */
	EAttribute getPresident_PresidentNumber();

	/**
	 * Returns the meta object for the attribute '{@link countries.President#isEligibleForReelection <em>Eligible For Reelection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eligible For Reelection</em>'.
	 * @see countries.President#isEligibleForReelection()
	 * @see #getPresident()
	 * @generated
	 */
	EAttribute getPresident_EligibleForReelection();

	/**
	 * Returns the meta object for the attribute '{@link countries.President#getSecretCodename <em>Secret Codename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secret Codename</em>'.
	 * @see countries.President#getSecretCodename()
	 * @see #getPresident()
	 * @generated
	 */
	EAttribute getPresident_SecretCodename();

	/**
	 * Returns the meta object for the '{@link countries.President#uniquePresidentNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique President Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique President Number</em>' operation.
	 * @see countries.President#uniquePresidentNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPresident__UniquePresidentNumber__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link countries.Commissioner <em>Commissioner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commissioner</em>'.
	 * @see countries.Commissioner
	 * @generated
	 */
	EClass getCommissioner();

	/**
	 * Returns the meta object for the attribute '{@link countries.Commissioner#getYearElected <em>Year Elected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year Elected</em>'.
	 * @see countries.Commissioner#getYearElected()
	 * @see #getCommissioner()
	 * @generated
	 */
	EAttribute getCommissioner_YearElected();

	/**
	 * Returns the meta object for the attribute '{@link countries.Commissioner#getCongressionalDistrict <em>Congressional District</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Congressional District</em>'.
	 * @see countries.Commissioner#getCongressionalDistrict()
	 * @see #getCommissioner()
	 * @generated
	 */
	EAttribute getCommissioner_CongressionalDistrict();

	/**
	 * Returns the meta object for the attribute '{@link countries.Commissioner#isIsIncumbent <em>Is Incumbent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Incumbent</em>'.
	 * @see countries.Commissioner#isIsIncumbent()
	 * @see #getCommissioner()
	 * @generated
	 */
	EAttribute getCommissioner_IsIncumbent();

	/**
	 * Returns the meta object for class '{@link countries.Mayor <em>Mayor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mayor</em>'.
	 * @see countries.Mayor
	 * @generated
	 */
	EClass getMayor();

	/**
	 * Returns the meta object for the attribute '{@link countries.Mayor#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see countries.Mayor#getAddress()
	 * @see #getMayor()
	 * @generated
	 */
	EAttribute getMayor_Address();

	/**
	 * Returns the meta object for the attribute '{@link countries.Mayor#getTimesElected <em>Times Elected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Times Elected</em>'.
	 * @see countries.Mayor#getTimesElected()
	 * @see #getMayor()
	 * @generated
	 */
	EAttribute getMayor_TimesElected();

	/**
	 * Returns the meta object for the attribute '{@link countries.Mayor#getAgeElectedAsMayor <em>Age Elected As Mayor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age Elected As Mayor</em>'.
	 * @see countries.Mayor#getAgeElectedAsMayor()
	 * @see #getMayor()
	 * @generated
	 */
	EAttribute getMayor_AgeElectedAsMayor();

	/**
	 * Returns the meta object for the '{@link countries.Mayor#ageLimitation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Age Limitation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Age Limitation</em>' operation.
	 * @see countries.Mayor#ageLimitation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMayor__AgeLimitation__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link countries.Politician <em>Politician</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Politician</em>'.
	 * @see countries.Politician
	 * @generated
	 */
	EClass getPolitician();

	/**
	 * Returns the meta object for the attribute '{@link countries.Politician#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see countries.Politician#getName()
	 * @see #getPolitician()
	 * @generated
	 */
	EAttribute getPolitician_Name();

	/**
	 * Returns the meta object for the attribute '{@link countries.Politician#getPoliticalParty <em>Political Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Political Party</em>'.
	 * @see countries.Politician#getPoliticalParty()
	 * @see #getPolitician()
	 * @generated
	 */
	EAttribute getPolitician_PoliticalParty();

	/**
	 * Returns the meta object for the attribute '{@link countries.Politician#getTotalYearsInService <em>Total Years In Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Years In Service</em>'.
	 * @see countries.Politician#getTotalYearsInService()
	 * @see #getPolitician()
	 * @generated
	 */
	EAttribute getPolitician_TotalYearsInService();

	/**
	 * Returns the meta object for the '{@link countries.Politician#serviceLimitation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Service Limitation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Service Limitation</em>' operation.
	 * @see countries.Politician#serviceLimitation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPolitician__ServiceLimitation__DiagnosticChain_Map();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CountriesFactory getCountriesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link countries.impl.CountryImpl <em>Country</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see countries.impl.CountryImpl
		 * @see countries.impl.CountriesPackageImpl#getCountry()
		 * @generated
		 */
		EClass COUNTRY = eINSTANCE.getCountry();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__NAME = eINSTANCE.getCountry_Name();

		/**
		 * The meta object literal for the '<em><b>Year Founded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__YEAR_FOUNDED = eINSTANCE.getCountry_YearFounded();

		/**
		 * The meta object literal for the '<em><b>Is Part Of UN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__IS_PART_OF_UN = eINSTANCE.getCountry_IsPartOfUN();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY__STATE = eINSTANCE.getCountry_State();

		/**
		 * The meta object literal for the '<em><b>President</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY__PRESIDENT = eINSTANCE.getCountry_President();

		/**
		 * The meta object literal for the '<em><b>Unique Country Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COUNTRY___UNIQUE_COUNTRY_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCountry__UniqueCountryName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link countries.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see countries.impl.StateImpl
		 * @see countries.impl.CountriesPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Population</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__POPULATION = eINSTANCE.getState_Population();

		/**
		 * The meta object literal for the '<em><b>Total Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__TOTAL_AREA = eINSTANCE.getState_TotalArea();

		/**
		 * The meta object literal for the '<em><b>County</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__COUNTY = eINSTANCE.getState_County();

		/**
		 * The meta object literal for the '<em><b>Governor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__GOVERNOR = eINSTANCE.getState_Governor();

		/**
		 * The meta object literal for the '<em><b>Unique State Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___UNIQUE_STATE_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getState__UniqueStateName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link countries.impl.CountyImpl <em>County</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see countries.impl.CountyImpl
		 * @see countries.impl.CountriesPackageImpl#getCounty()
		 * @generated
		 */
		EClass COUNTY = eINSTANCE.getCounty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTY__NAME = eINSTANCE.getCounty_Name();

		/**
		 * The meta object literal for the '<em><b>County Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTY__COUNTY_NUMBER = eINSTANCE.getCounty_CountyNumber();

		/**
		 * The meta object literal for the '<em><b>Largest City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTY__LARGEST_CITY = eINSTANCE.getCounty_LargestCity();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTY__CITY = eINSTANCE.getCounty_City();

		/**
		 * The meta object literal for the '<em><b>Commissioner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTY__COMMISSIONER = eINSTANCE.getCounty_Commissioner();

		/**
		 * The meta object literal for the '<em><b>Unique County Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COUNTY___UNIQUE_COUNTY_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCounty__UniqueCountyName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link countries.impl.CityImpl <em>City</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see countries.impl.CityImpl
		 * @see countries.impl.CountriesPackageImpl#getCity()
		 * @generated
		 */
		EClass CITY = eINSTANCE.getCity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY__NAME = eINSTANCE.getCity_Name();

		/**
		 * The meta object literal for the '<em><b>Population</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY__POPULATION = eINSTANCE.getCity_Population();

		/**
		 * The meta object literal for the '<em><b>Is State Capital</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY__IS_STATE_CAPITAL = eINSTANCE.getCity_IsStateCapital();

		/**
		 * The meta object literal for the '<em><b>Mayor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY__MAYOR = eINSTANCE.getCity_Mayor();

		/**
		 * The meta object literal for the '<em><b>Unique City Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CITY___UNIQUE_CITY_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCity__UniqueCityName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link countries.impl.GovernorImpl <em>Governor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see countries.impl.GovernorImpl
		 * @see countries.impl.CountriesPackageImpl#getGovernor()
		 * @generated
		 */
		EClass GOVERNOR = eINSTANCE.getGovernor();

		/**
		 * The meta object literal for the '<em><b>Year Elected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOVERNOR__YEAR_ELECTED = eINSTANCE.getGovernor_YearElected();

		/**
		 * The meta object literal for the '<em><b>End Of Term Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOVERNOR__END_OF_TERM_YEAR = eINSTANCE.getGovernor_EndOfTermYear();

		/**
		 * The meta object literal for the '<em><b>Years Lived In State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOVERNOR__YEARS_LIVED_IN_STATE = eINSTANCE.getGovernor_YearsLivedInState();

		/**
		 * The meta object literal for the '<em><b>Years Limitation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GOVERNOR___YEARS_LIMITATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getGovernor__YearsLimitation__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link countries.impl.PresidentImpl <em>President</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see countries.impl.PresidentImpl
		 * @see countries.impl.CountriesPackageImpl#getPresident()
		 * @generated
		 */
		EClass PRESIDENT = eINSTANCE.getPresident();

		/**
		 * The meta object literal for the '<em><b>President Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESIDENT__PRESIDENT_NUMBER = eINSTANCE.getPresident_PresidentNumber();

		/**
		 * The meta object literal for the '<em><b>Eligible For Reelection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESIDENT__ELIGIBLE_FOR_REELECTION = eINSTANCE.getPresident_EligibleForReelection();

		/**
		 * The meta object literal for the '<em><b>Secret Codename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESIDENT__SECRET_CODENAME = eINSTANCE.getPresident_SecretCodename();

		/**
		 * The meta object literal for the '<em><b>Unique President Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRESIDENT___UNIQUE_PRESIDENT_NUMBER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPresident__UniquePresidentNumber__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link countries.impl.CommissionerImpl <em>Commissioner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see countries.impl.CommissionerImpl
		 * @see countries.impl.CountriesPackageImpl#getCommissioner()
		 * @generated
		 */
		EClass COMMISSIONER = eINSTANCE.getCommissioner();

		/**
		 * The meta object literal for the '<em><b>Year Elected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMISSIONER__YEAR_ELECTED = eINSTANCE.getCommissioner_YearElected();

		/**
		 * The meta object literal for the '<em><b>Congressional District</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMISSIONER__CONGRESSIONAL_DISTRICT = eINSTANCE.getCommissioner_CongressionalDistrict();

		/**
		 * The meta object literal for the '<em><b>Is Incumbent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMISSIONER__IS_INCUMBENT = eINSTANCE.getCommissioner_IsIncumbent();

		/**
		 * The meta object literal for the '{@link countries.impl.MayorImpl <em>Mayor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see countries.impl.MayorImpl
		 * @see countries.impl.CountriesPackageImpl#getMayor()
		 * @generated
		 */
		EClass MAYOR = eINSTANCE.getMayor();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAYOR__ADDRESS = eINSTANCE.getMayor_Address();

		/**
		 * The meta object literal for the '<em><b>Times Elected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAYOR__TIMES_ELECTED = eINSTANCE.getMayor_TimesElected();

		/**
		 * The meta object literal for the '<em><b>Age Elected As Mayor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAYOR__AGE_ELECTED_AS_MAYOR = eINSTANCE.getMayor_AgeElectedAsMayor();

		/**
		 * The meta object literal for the '<em><b>Age Limitation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAYOR___AGE_LIMITATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMayor__AgeLimitation__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link countries.impl.PoliticianImpl <em>Politician</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see countries.impl.PoliticianImpl
		 * @see countries.impl.CountriesPackageImpl#getPolitician()
		 * @generated
		 */
		EClass POLITICIAN = eINSTANCE.getPolitician();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLITICIAN__NAME = eINSTANCE.getPolitician_Name();

		/**
		 * The meta object literal for the '<em><b>Political Party</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLITICIAN__POLITICAL_PARTY = eINSTANCE.getPolitician_PoliticalParty();

		/**
		 * The meta object literal for the '<em><b>Total Years In Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLITICIAN__TOTAL_YEARS_IN_SERVICE = eINSTANCE.getPolitician_TotalYearsInService();

		/**
		 * The meta object literal for the '<em><b>Service Limitation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLITICIAN___SERVICE_LIMITATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPolitician__ServiceLimitation__DiagnosticChain_Map();

	}

} //CountriesPackage
