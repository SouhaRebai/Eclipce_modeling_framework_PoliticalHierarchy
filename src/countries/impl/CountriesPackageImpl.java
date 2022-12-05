/**
 */
package countries.impl;

import countries.City;
import countries.Commissioner;
import countries.CountriesFactory;
import countries.CountriesPackage;
import countries.Country;
import countries.County;
import countries.Governor;
import countries.Mayor;
import countries.Politician;
import countries.President;
import countries.State;

import countries.util.CountriesValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CountriesPackageImpl extends EPackageImpl implements CountriesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass governorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass presidentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commissionerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mayorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass politicianEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see countries.CountriesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CountriesPackageImpl() {
		super(eNS_URI, CountriesFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CountriesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CountriesPackage init() {
		if (isInited) return (CountriesPackage)EPackage.Registry.INSTANCE.getEPackage(CountriesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCountriesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CountriesPackageImpl theCountriesPackage = registeredCountriesPackage instanceof CountriesPackageImpl ? (CountriesPackageImpl)registeredCountriesPackage : new CountriesPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCountriesPackage.createPackageContents();

		// Initialize created meta-data
		theCountriesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCountriesPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CountriesValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCountriesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CountriesPackage.eNS_URI, theCountriesPackage);
		return theCountriesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountry() {
		return countryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountry_Name() {
		return (EAttribute)countryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountry_YearFounded() {
		return (EAttribute)countryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountry_IsPartOfUN() {
		return (EAttribute)countryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCountry_State() {
		return (EReference)countryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCountry_President() {
		return (EReference)countryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCountry__UniqueCountryName__DiagnosticChain_Map() {
		return countryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Name() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Population() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_TotalArea() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_County() {
		return (EReference)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Governor() {
		return (EReference)stateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getState__UniqueStateName__DiagnosticChain_Map() {
		return stateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCounty() {
		return countyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCounty_Name() {
		return (EAttribute)countyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCounty_CountyNumber() {
		return (EAttribute)countyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCounty_LargestCity() {
		return (EAttribute)countyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCounty_City() {
		return (EReference)countyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCounty_Commissioner() {
		return (EReference)countyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCounty__UniqueCountyName__DiagnosticChain_Map() {
		return countyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCity() {
		return cityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCity_Name() {
		return (EAttribute)cityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCity_Population() {
		return (EAttribute)cityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCity_IsStateCapital() {
		return (EAttribute)cityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCity_Mayor() {
		return (EReference)cityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCity__UniqueCityName__DiagnosticChain_Map() {
		return cityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGovernor() {
		return governorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGovernor_YearElected() {
		return (EAttribute)governorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGovernor_EndOfTermYear() {
		return (EAttribute)governorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGovernor_YearsLivedInState() {
		return (EAttribute)governorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGovernor__YearsLimitation__DiagnosticChain_Map() {
		return governorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPresident() {
		return presidentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresident_PresidentNumber() {
		return (EAttribute)presidentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresident_EligibleForReelection() {
		return (EAttribute)presidentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresident_SecretCodename() {
		return (EAttribute)presidentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPresident__UniquePresidentNumber__DiagnosticChain_Map() {
		return presidentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommissioner() {
		return commissionerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommissioner_YearElected() {
		return (EAttribute)commissionerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommissioner_CongressionalDistrict() {
		return (EAttribute)commissionerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommissioner_IsIncumbent() {
		return (EAttribute)commissionerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMayor() {
		return mayorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMayor_Address() {
		return (EAttribute)mayorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMayor_TimesElected() {
		return (EAttribute)mayorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMayor_AgeElectedAsMayor() {
		return (EAttribute)mayorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMayor__AgeLimitation__DiagnosticChain_Map() {
		return mayorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolitician() {
		return politicianEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolitician_Name() {
		return (EAttribute)politicianEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolitician_PoliticalParty() {
		return (EAttribute)politicianEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolitician_TotalYearsInService() {
		return (EAttribute)politicianEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolitician__ServiceLimitation__DiagnosticChain_Map() {
		return politicianEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountriesFactory getCountriesFactory() {
		return (CountriesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		countryEClass = createEClass(COUNTRY);
		createEAttribute(countryEClass, COUNTRY__NAME);
		createEAttribute(countryEClass, COUNTRY__YEAR_FOUNDED);
		createEAttribute(countryEClass, COUNTRY__IS_PART_OF_UN);
		createEReference(countryEClass, COUNTRY__STATE);
		createEReference(countryEClass, COUNTRY__PRESIDENT);
		createEOperation(countryEClass, COUNTRY___UNIQUE_COUNTRY_NAME__DIAGNOSTICCHAIN_MAP);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__NAME);
		createEAttribute(stateEClass, STATE__POPULATION);
		createEAttribute(stateEClass, STATE__TOTAL_AREA);
		createEReference(stateEClass, STATE__COUNTY);
		createEReference(stateEClass, STATE__GOVERNOR);
		createEOperation(stateEClass, STATE___UNIQUE_STATE_NAME__DIAGNOSTICCHAIN_MAP);

		countyEClass = createEClass(COUNTY);
		createEAttribute(countyEClass, COUNTY__NAME);
		createEAttribute(countyEClass, COUNTY__COUNTY_NUMBER);
		createEAttribute(countyEClass, COUNTY__LARGEST_CITY);
		createEReference(countyEClass, COUNTY__CITY);
		createEReference(countyEClass, COUNTY__COMMISSIONER);
		createEOperation(countyEClass, COUNTY___UNIQUE_COUNTY_NAME__DIAGNOSTICCHAIN_MAP);

		cityEClass = createEClass(CITY);
		createEAttribute(cityEClass, CITY__NAME);
		createEAttribute(cityEClass, CITY__POPULATION);
		createEAttribute(cityEClass, CITY__IS_STATE_CAPITAL);
		createEReference(cityEClass, CITY__MAYOR);
		createEOperation(cityEClass, CITY___UNIQUE_CITY_NAME__DIAGNOSTICCHAIN_MAP);

		governorEClass = createEClass(GOVERNOR);
		createEAttribute(governorEClass, GOVERNOR__YEAR_ELECTED);
		createEAttribute(governorEClass, GOVERNOR__END_OF_TERM_YEAR);
		createEAttribute(governorEClass, GOVERNOR__YEARS_LIVED_IN_STATE);
		createEOperation(governorEClass, GOVERNOR___YEARS_LIMITATION__DIAGNOSTICCHAIN_MAP);

		presidentEClass = createEClass(PRESIDENT);
		createEAttribute(presidentEClass, PRESIDENT__PRESIDENT_NUMBER);
		createEAttribute(presidentEClass, PRESIDENT__ELIGIBLE_FOR_REELECTION);
		createEAttribute(presidentEClass, PRESIDENT__SECRET_CODENAME);
		createEOperation(presidentEClass, PRESIDENT___UNIQUE_PRESIDENT_NUMBER__DIAGNOSTICCHAIN_MAP);

		commissionerEClass = createEClass(COMMISSIONER);
		createEAttribute(commissionerEClass, COMMISSIONER__YEAR_ELECTED);
		createEAttribute(commissionerEClass, COMMISSIONER__CONGRESSIONAL_DISTRICT);
		createEAttribute(commissionerEClass, COMMISSIONER__IS_INCUMBENT);

		mayorEClass = createEClass(MAYOR);
		createEAttribute(mayorEClass, MAYOR__ADDRESS);
		createEAttribute(mayorEClass, MAYOR__TIMES_ELECTED);
		createEAttribute(mayorEClass, MAYOR__AGE_ELECTED_AS_MAYOR);
		createEOperation(mayorEClass, MAYOR___AGE_LIMITATION__DIAGNOSTICCHAIN_MAP);

		politicianEClass = createEClass(POLITICIAN);
		createEAttribute(politicianEClass, POLITICIAN__NAME);
		createEAttribute(politicianEClass, POLITICIAN__POLITICAL_PARTY);
		createEAttribute(politicianEClass, POLITICIAN__TOTAL_YEARS_IN_SERVICE);
		createEOperation(politicianEClass, POLITICIAN___SERVICE_LIMITATION__DIAGNOSTICCHAIN_MAP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		governorEClass.getESuperTypes().add(this.getPolitician());
		presidentEClass.getESuperTypes().add(this.getPolitician());
		commissionerEClass.getESuperTypes().add(this.getPolitician());
		mayorEClass.getESuperTypes().add(this.getPolitician());

		// Initialize classes, features, and operations; add parameters
		initEClass(countryEClass, Country.class, "Country", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCountry_Name(), ecorePackage.getEString(), "name", null, 0, 1, Country.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCountry_YearFounded(), ecorePackage.getEInt(), "yearFounded", null, 1, 1, Country.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCountry_IsPartOfUN(), ecorePackage.getEBoolean(), "isPartOfUN", null, 1, 1, Country.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCountry_State(), this.getState(), null, "state", null, 1, -1, Country.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCountry_President(), this.getPresident(), null, "president", null, 1, 1, Country.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getCountry__UniqueCountryName__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "uniqueCountryName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Name(), ecorePackage.getEString(), "name", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Population(), ecorePackage.getEInt(), "population", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_TotalArea(), ecorePackage.getEDouble(), "totalArea", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_County(), this.getCounty(), null, "county", null, 1, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Governor(), this.getGovernor(), null, "governor", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getState__UniqueStateName__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "uniqueStateName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(countyEClass, County.class, "County", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCounty_Name(), ecorePackage.getEString(), "name", null, 0, 1, County.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCounty_CountyNumber(), ecorePackage.getEInt(), "countyNumber", null, 1, 1, County.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCounty_LargestCity(), ecorePackage.getEString(), "largestCity", null, 0, 1, County.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCounty_City(), this.getCity(), null, "city", null, 1, -1, County.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCounty_Commissioner(), this.getCommissioner(), null, "commissioner", null, 1, 1, County.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCounty__UniqueCountyName__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "uniqueCountyName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cityEClass, City.class, "City", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCity_Name(), ecorePackage.getEString(), "name", null, 0, 1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCity_Population(), ecorePackage.getEInt(), "population", null, 1, 1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCity_IsStateCapital(), ecorePackage.getEBoolean(), "isStateCapital", null, 1, 1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCity_Mayor(), this.getMayor(), null, "mayor", null, 1, 1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCity__UniqueCityName__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "uniqueCityName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(governorEClass, Governor.class, "Governor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGovernor_YearElected(), ecorePackage.getEInt(), "yearElected", null, 1, 1, Governor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGovernor_EndOfTermYear(), ecorePackage.getEInt(), "endOfTermYear", null, 1, 1, Governor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGovernor_YearsLivedInState(), ecorePackage.getEInt(), "yearsLivedInState", null, 1, 1, Governor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getGovernor__YearsLimitation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "yearsLimitation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(presidentEClass, President.class, "President", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPresident_PresidentNumber(), ecorePackage.getEInt(), "presidentNumber", null, 1, 1, President.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresident_EligibleForReelection(), ecorePackage.getEBoolean(), "eligibleForReelection", null, 1, 1, President.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresident_SecretCodename(), ecorePackage.getEString(), "secretCodename", null, 0, 1, President.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPresident__UniquePresidentNumber__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "uniquePresidentNumber", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(commissionerEClass, Commissioner.class, "Commissioner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommissioner_YearElected(), ecorePackage.getEInt(), "yearElected", null, 1, 1, Commissioner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommissioner_CongressionalDistrict(), ecorePackage.getEInt(), "congressionalDistrict", null, 1, 1, Commissioner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommissioner_IsIncumbent(), ecorePackage.getEBoolean(), "isIncumbent", null, 1, 1, Commissioner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mayorEClass, Mayor.class, "Mayor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMayor_Address(), ecorePackage.getEString(), "address", null, 0, 1, Mayor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMayor_TimesElected(), ecorePackage.getEInt(), "timesElected", null, 1, 1, Mayor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMayor_AgeElectedAsMayor(), ecorePackage.getEInt(), "ageElectedAsMayor", null, 1, 1, Mayor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMayor__AgeLimitation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ageLimitation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(politicianEClass, Politician.class, "Politician", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolitician_Name(), ecorePackage.getEString(), "name", null, 0, 1, Politician.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolitician_PoliticalParty(), ecorePackage.getEString(), "politicalParty", null, 0, 1, Politician.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolitician_TotalYearsInService(), ecorePackage.getEDouble(), "totalYearsInService", null, 1, 1, Politician.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPolitician__ServiceLimitation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "serviceLimitation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (countryEClass,
		   source,
		   new String[] {
			   "constraints", "uniqueCountryName"
		   });
		addAnnotation
		  (stateEClass,
		   source,
		   new String[] {
			   "constraints", "uniqueStateName"
		   });
		addAnnotation
		  (countyEClass,
		   source,
		   new String[] {
			   "constraints", "uniqueCountyName"
		   });
		addAnnotation
		  (cityEClass,
		   source,
		   new String[] {
			   "constraints", "uniqueCityName"
		   });
		addAnnotation
		  (governorEClass,
		   source,
		   new String[] {
			   "constraints", "yearsLimitation"
		   });
		addAnnotation
		  (presidentEClass,
		   source,
		   new String[] {
			   "constraints", "uniquePresidentNumber"
		   });
		addAnnotation
		  (mayorEClass,
		   source,
		   new String[] {
			   "constraints", "ageLimitation"
		   });
		addAnnotation
		  (politicianEClass,
		   source,
		   new String[] {
			   "constraints", "serviceLimitation"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getCountry__UniqueCountryName__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Country.allInstances()->one(c : Country | c.name = self.name)"
		   });
		addAnnotation
		  (getState__UniqueStateName__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "State.allInstances()->one(s : State | s.name = self.name)"
		   });
		addAnnotation
		  (getCounty__UniqueCountyName__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "County.allInstances()->one(c : County | c.name = self.name)"
		   });
		addAnnotation
		  (getCity__UniqueCityName__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "City.allInstances()->one(c : City | c.name = self.name)"
		   });
		addAnnotation
		  (getGovernor__YearsLimitation__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Governor.allInstances()->forAll(g:Governor | g.yearElected < g.endOfTermYear)"
		   });
		addAnnotation
		  (getPresident__UniquePresidentNumber__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "President.allInstances()->one(p:President | p.presidentNumber = self.presidentNumber)"
		   });
		addAnnotation
		  (getMayor__AgeLimitation__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Mayor.allInstances()->one(m:Mayor | m.ageElectedAsMayor <71 and m.ageElectedAsMayor > 24 )"
		   });
		addAnnotation
		  (getPolitician__ServiceLimitation__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Politician.allInstances()->one(p:Politician | p.totalYearsInService <5)"
		   });
	}

} //CountriesPackageImpl
