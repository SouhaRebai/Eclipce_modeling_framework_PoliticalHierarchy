/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /EMF_modeling_project/model/countries.ecore
 * using:
 *   /EMF_modeling_project/model/countries.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package countries;

// import countries.CountriesPackage;
// import countries.CountriesTables;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * CountriesTables provides the dispatch tables for the countries for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class CountriesTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(CountriesPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_platform_c_s_resource_s_EMF_modeling_project_s_model_s_countries_ecore = IdManager.getNsURIPackageId("platform:/resource/EMF_modeling_project/model/countries.ecore", null, CountriesPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_City = CountriesTables.PACKid_platform_c_s_resource_s_EMF_modeling_project_s_model_s_countries_ecore.getClassId("City", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = CountriesTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Commissioner = CountriesTables.PACKid_platform_c_s_resource_s_EMF_modeling_project_s_model_s_countries_ecore.getClassId("Commissioner", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Country = CountriesTables.PACKid_platform_c_s_resource_s_EMF_modeling_project_s_model_s_countries_ecore.getClassId("Country", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_County = CountriesTables.PACKid_platform_c_s_resource_s_EMF_modeling_project_s_model_s_countries_ecore.getClassId("County", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Governor = CountriesTables.PACKid_platform_c_s_resource_s_EMF_modeling_project_s_model_s_countries_ecore.getClassId("Governor", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Mayor = CountriesTables.PACKid_platform_c_s_resource_s_EMF_modeling_project_s_model_s_countries_ecore.getClassId("Mayor", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Politician = CountriesTables.PACKid_platform_c_s_resource_s_EMF_modeling_project_s_model_s_countries_ecore.getClassId("Politician", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_President = CountriesTables.PACKid_platform_c_s_resource_s_EMF_modeling_project_s_model_s_countries_ecore.getClassId("President", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_State = CountriesTables.PACKid_platform_c_s_resource_s_EMF_modeling_project_s_model_s_countries_ecore.getClassId("State", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDouble = CountriesTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDouble", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = CountriesTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_24 = ValueUtil.integerValueOf("24");
	public static final /*@NonInvalid*/ IntegerValue INT_5 = ValueUtil.integerValueOf("5");
	public static final /*@NonInvalid*/ IntegerValue INT_71 = ValueUtil.integerValueOf("71");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_City = TypeId.BAG.getSpecializedId(CountriesTables.CLSSid_City);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Country = TypeId.BAG.getSpecializedId(CountriesTables.CLSSid_Country);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_County = TypeId.BAG.getSpecializedId(CountriesTables.CLSSid_County);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_State = TypeId.BAG.getSpecializedId(CountriesTables.CLSSid_State);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_City = TypeId.ORDERED_SET.getSpecializedId(CountriesTables.CLSSid_City);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_County = TypeId.ORDERED_SET.getSpecializedId(CountriesTables.CLSSid_County);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_State = TypeId.ORDERED_SET.getSpecializedId(CountriesTables.CLSSid_State);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_City = TypeId.SET.getSpecializedId(CountriesTables.CLSSid_City);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Country = TypeId.SET.getSpecializedId(CountriesTables.CLSSid_Country);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_County = TypeId.SET.getSpecializedId(CountriesTables.CLSSid_County);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Governor = TypeId.SET.getSpecializedId(CountriesTables.CLSSid_Governor);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Mayor = TypeId.SET.getSpecializedId(CountriesTables.CLSSid_Mayor);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Politician = TypeId.SET.getSpecializedId(CountriesTables.CLSSid_Politician);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_President = TypeId.SET.getSpecializedId(CountriesTables.CLSSid_President);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_State = TypeId.SET.getSpecializedId(CountriesTables.CLSSid_State);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			CountriesTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CountriesTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _City = new EcoreExecutorType(CountriesPackage.Literals.CITY, PACKAGE, 0);
		public static final EcoreExecutorType _Commissioner = new EcoreExecutorType(CountriesPackage.Literals.COMMISSIONER, PACKAGE, 0);
		public static final EcoreExecutorType _Country = new EcoreExecutorType(CountriesPackage.Literals.COUNTRY, PACKAGE, 0);
		public static final EcoreExecutorType _County = new EcoreExecutorType(CountriesPackage.Literals.COUNTY, PACKAGE, 0);
		public static final EcoreExecutorType _Governor = new EcoreExecutorType(CountriesPackage.Literals.GOVERNOR, PACKAGE, 0);
		public static final EcoreExecutorType _Mayor = new EcoreExecutorType(CountriesPackage.Literals.MAYOR, PACKAGE, 0);
		public static final EcoreExecutorType _Politician = new EcoreExecutorType(CountriesPackage.Literals.POLITICIAN, PACKAGE, 0);
		public static final EcoreExecutorType _President = new EcoreExecutorType(CountriesPackage.Literals.PRESIDENT, PACKAGE, 0);
		public static final EcoreExecutorType _State = new EcoreExecutorType(CountriesPackage.Literals.STATE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_City,
			_Commissioner,
			_Country,
			_County,
			_Governor,
			_Mayor,
			_Politician,
			_President,
			_State
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CountriesTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _City__City = new ExecutorFragment(Types._City, CountriesTables.Types._City);
		private static final ExecutorFragment _City__OclAny = new ExecutorFragment(Types._City, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _City__OclElement = new ExecutorFragment(Types._City, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Commissioner__Commissioner = new ExecutorFragment(Types._Commissioner, CountriesTables.Types._Commissioner);
		private static final ExecutorFragment _Commissioner__OclAny = new ExecutorFragment(Types._Commissioner, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Commissioner__OclElement = new ExecutorFragment(Types._Commissioner, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Commissioner__Politician = new ExecutorFragment(Types._Commissioner, CountriesTables.Types._Politician);

		private static final ExecutorFragment _Country__Country = new ExecutorFragment(Types._Country, CountriesTables.Types._Country);
		private static final ExecutorFragment _Country__OclAny = new ExecutorFragment(Types._Country, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Country__OclElement = new ExecutorFragment(Types._Country, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _County__County = new ExecutorFragment(Types._County, CountriesTables.Types._County);
		private static final ExecutorFragment _County__OclAny = new ExecutorFragment(Types._County, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _County__OclElement = new ExecutorFragment(Types._County, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Governor__Governor = new ExecutorFragment(Types._Governor, CountriesTables.Types._Governor);
		private static final ExecutorFragment _Governor__OclAny = new ExecutorFragment(Types._Governor, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Governor__OclElement = new ExecutorFragment(Types._Governor, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Governor__Politician = new ExecutorFragment(Types._Governor, CountriesTables.Types._Politician);

		private static final ExecutorFragment _Mayor__Mayor = new ExecutorFragment(Types._Mayor, CountriesTables.Types._Mayor);
		private static final ExecutorFragment _Mayor__OclAny = new ExecutorFragment(Types._Mayor, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Mayor__OclElement = new ExecutorFragment(Types._Mayor, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Mayor__Politician = new ExecutorFragment(Types._Mayor, CountriesTables.Types._Politician);

		private static final ExecutorFragment _Politician__OclAny = new ExecutorFragment(Types._Politician, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Politician__OclElement = new ExecutorFragment(Types._Politician, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Politician__Politician = new ExecutorFragment(Types._Politician, CountriesTables.Types._Politician);

		private static final ExecutorFragment _President__OclAny = new ExecutorFragment(Types._President, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _President__OclElement = new ExecutorFragment(Types._President, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _President__Politician = new ExecutorFragment(Types._President, CountriesTables.Types._Politician);
		private static final ExecutorFragment _President__President = new ExecutorFragment(Types._President, CountriesTables.Types._President);

		private static final ExecutorFragment _State__OclAny = new ExecutorFragment(Types._State, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _State__OclElement = new ExecutorFragment(Types._State, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _State__State = new ExecutorFragment(Types._State, CountriesTables.Types._State);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CountriesTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CountriesTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CountriesTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _City__isStateCapital = new EcoreExecutorProperty(CountriesPackage.Literals.CITY__IS_STATE_CAPITAL, Types._City, 0);
		public static final ExecutorProperty _City__mayor = new EcoreExecutorProperty(CountriesPackage.Literals.CITY__MAYOR, Types._City, 1);
		public static final ExecutorProperty _City__name = new EcoreExecutorProperty(CountriesPackage.Literals.CITY__NAME, Types._City, 2);
		public static final ExecutorProperty _City__population = new EcoreExecutorProperty(CountriesPackage.Literals.CITY__POPULATION, Types._City, 3);
		public static final ExecutorProperty _City__County__city = new ExecutorPropertyWithImplementation("County", Types._City, 4, new EcoreLibraryOppositeProperty(CountriesPackage.Literals.COUNTY__CITY));

		public static final ExecutorProperty _Commissioner__congressionalDistrict = new EcoreExecutorProperty(CountriesPackage.Literals.COMMISSIONER__CONGRESSIONAL_DISTRICT, Types._Commissioner, 0);
		public static final ExecutorProperty _Commissioner__isIncumbent = new EcoreExecutorProperty(CountriesPackage.Literals.COMMISSIONER__IS_INCUMBENT, Types._Commissioner, 1);
		public static final ExecutorProperty _Commissioner__yearElected = new EcoreExecutorProperty(CountriesPackage.Literals.COMMISSIONER__YEAR_ELECTED, Types._Commissioner, 2);
		public static final ExecutorProperty _Commissioner__County__commissioner = new ExecutorPropertyWithImplementation("County", Types._Commissioner, 3, new EcoreLibraryOppositeProperty(CountriesPackage.Literals.COUNTY__COMMISSIONER));

		public static final ExecutorProperty _Country__isPartOfUN = new EcoreExecutorProperty(CountriesPackage.Literals.COUNTRY__IS_PART_OF_UN, Types._Country, 0);
		public static final ExecutorProperty _Country__name = new EcoreExecutorProperty(CountriesPackage.Literals.COUNTRY__NAME, Types._Country, 1);
		public static final ExecutorProperty _Country__president = new EcoreExecutorProperty(CountriesPackage.Literals.COUNTRY__PRESIDENT, Types._Country, 2);
		public static final ExecutorProperty _Country__state = new EcoreExecutorProperty(CountriesPackage.Literals.COUNTRY__STATE, Types._Country, 3);
		public static final ExecutorProperty _Country__yearFounded = new EcoreExecutorProperty(CountriesPackage.Literals.COUNTRY__YEAR_FOUNDED, Types._Country, 4);

		public static final ExecutorProperty _County__city = new EcoreExecutorProperty(CountriesPackage.Literals.COUNTY__CITY, Types._County, 0);
		public static final ExecutorProperty _County__commissioner = new EcoreExecutorProperty(CountriesPackage.Literals.COUNTY__COMMISSIONER, Types._County, 1);
		public static final ExecutorProperty _County__countyNumber = new EcoreExecutorProperty(CountriesPackage.Literals.COUNTY__COUNTY_NUMBER, Types._County, 2);
		public static final ExecutorProperty _County__largestCity = new EcoreExecutorProperty(CountriesPackage.Literals.COUNTY__LARGEST_CITY, Types._County, 3);
		public static final ExecutorProperty _County__name = new EcoreExecutorProperty(CountriesPackage.Literals.COUNTY__NAME, Types._County, 4);
		public static final ExecutorProperty _County__State__county = new ExecutorPropertyWithImplementation("State", Types._County, 5, new EcoreLibraryOppositeProperty(CountriesPackage.Literals.STATE__COUNTY));

		public static final ExecutorProperty _Governor__endOfTermYear = new EcoreExecutorProperty(CountriesPackage.Literals.GOVERNOR__END_OF_TERM_YEAR, Types._Governor, 0);
		public static final ExecutorProperty _Governor__yearElected = new EcoreExecutorProperty(CountriesPackage.Literals.GOVERNOR__YEAR_ELECTED, Types._Governor, 1);
		public static final ExecutorProperty _Governor__yearsLivedInState = new EcoreExecutorProperty(CountriesPackage.Literals.GOVERNOR__YEARS_LIVED_IN_STATE, Types._Governor, 2);
		public static final ExecutorProperty _Governor__State__governor = new ExecutorPropertyWithImplementation("State", Types._Governor, 3, new EcoreLibraryOppositeProperty(CountriesPackage.Literals.STATE__GOVERNOR));

		public static final ExecutorProperty _Mayor__address = new EcoreExecutorProperty(CountriesPackage.Literals.MAYOR__ADDRESS, Types._Mayor, 0);
		public static final ExecutorProperty _Mayor__ageElectedAsMayor = new EcoreExecutorProperty(CountriesPackage.Literals.MAYOR__AGE_ELECTED_AS_MAYOR, Types._Mayor, 1);
		public static final ExecutorProperty _Mayor__timesElected = new EcoreExecutorProperty(CountriesPackage.Literals.MAYOR__TIMES_ELECTED, Types._Mayor, 2);
		public static final ExecutorProperty _Mayor__City__mayor = new ExecutorPropertyWithImplementation("City", Types._Mayor, 3, new EcoreLibraryOppositeProperty(CountriesPackage.Literals.CITY__MAYOR));

		public static final ExecutorProperty _Politician__name = new EcoreExecutorProperty(CountriesPackage.Literals.POLITICIAN__NAME, Types._Politician, 0);
		public static final ExecutorProperty _Politician__politicalParty = new EcoreExecutorProperty(CountriesPackage.Literals.POLITICIAN__POLITICAL_PARTY, Types._Politician, 1);
		public static final ExecutorProperty _Politician__totalYearsInService = new EcoreExecutorProperty(CountriesPackage.Literals.POLITICIAN__TOTAL_YEARS_IN_SERVICE, Types._Politician, 2);

		public static final ExecutorProperty _President__eligibleForReelection = new EcoreExecutorProperty(CountriesPackage.Literals.PRESIDENT__ELIGIBLE_FOR_REELECTION, Types._President, 0);
		public static final ExecutorProperty _President__presidentNumber = new EcoreExecutorProperty(CountriesPackage.Literals.PRESIDENT__PRESIDENT_NUMBER, Types._President, 1);
		public static final ExecutorProperty _President__secretCodename = new EcoreExecutorProperty(CountriesPackage.Literals.PRESIDENT__SECRET_CODENAME, Types._President, 2);
		public static final ExecutorProperty _President__Country__president = new ExecutorPropertyWithImplementation("Country", Types._President, 3, new EcoreLibraryOppositeProperty(CountriesPackage.Literals.COUNTRY__PRESIDENT));

		public static final ExecutorProperty _State__county = new EcoreExecutorProperty(CountriesPackage.Literals.STATE__COUNTY, Types._State, 0);
		public static final ExecutorProperty _State__governor = new EcoreExecutorProperty(CountriesPackage.Literals.STATE__GOVERNOR, Types._State, 1);
		public static final ExecutorProperty _State__name = new EcoreExecutorProperty(CountriesPackage.Literals.STATE__NAME, Types._State, 2);
		public static final ExecutorProperty _State__population = new EcoreExecutorProperty(CountriesPackage.Literals.STATE__POPULATION, Types._State, 3);
		public static final ExecutorProperty _State__totalArea = new EcoreExecutorProperty(CountriesPackage.Literals.STATE__TOTAL_AREA, Types._State, 4);
		public static final ExecutorProperty _State__Country__state = new ExecutorPropertyWithImplementation("Country", Types._State, 5, new EcoreLibraryOppositeProperty(CountriesPackage.Literals.COUNTRY__STATE));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CountriesTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _City =
			{
				Fragments._City__OclAny /* 0 */,
				Fragments._City__OclElement /* 1 */,
				Fragments._City__City /* 2 */
			};
		private static final int /*@NonNull*/ [] __City = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Commissioner =
			{
				Fragments._Commissioner__OclAny /* 0 */,
				Fragments._Commissioner__OclElement /* 1 */,
				Fragments._Commissioner__Politician /* 2 */,
				Fragments._Commissioner__Commissioner /* 3 */
			};
		private static final int /*@NonNull*/ [] __Commissioner = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Country =
			{
				Fragments._Country__OclAny /* 0 */,
				Fragments._Country__OclElement /* 1 */,
				Fragments._Country__Country /* 2 */
			};
		private static final int /*@NonNull*/ [] __Country = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _County =
			{
				Fragments._County__OclAny /* 0 */,
				Fragments._County__OclElement /* 1 */,
				Fragments._County__County /* 2 */
			};
		private static final int /*@NonNull*/ [] __County = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Governor =
			{
				Fragments._Governor__OclAny /* 0 */,
				Fragments._Governor__OclElement /* 1 */,
				Fragments._Governor__Politician /* 2 */,
				Fragments._Governor__Governor /* 3 */
			};
		private static final int /*@NonNull*/ [] __Governor = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Mayor =
			{
				Fragments._Mayor__OclAny /* 0 */,
				Fragments._Mayor__OclElement /* 1 */,
				Fragments._Mayor__Politician /* 2 */,
				Fragments._Mayor__Mayor /* 3 */
			};
		private static final int /*@NonNull*/ [] __Mayor = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Politician =
			{
				Fragments._Politician__OclAny /* 0 */,
				Fragments._Politician__OclElement /* 1 */,
				Fragments._Politician__Politician /* 2 */
			};
		private static final int /*@NonNull*/ [] __Politician = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _President =
			{
				Fragments._President__OclAny /* 0 */,
				Fragments._President__OclElement /* 1 */,
				Fragments._President__Politician /* 2 */,
				Fragments._President__President /* 3 */
			};
		private static final int /*@NonNull*/ [] __President = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _State =
			{
				Fragments._State__OclAny /* 0 */,
				Fragments._State__OclElement /* 1 */,
				Fragments._State__State /* 2 */
			};
		private static final int /*@NonNull*/ [] __State = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._City.initFragments(_City, __City);
			Types._Commissioner.initFragments(_Commissioner, __Commissioner);
			Types._Country.initFragments(_Country, __Country);
			Types._County.initFragments(_County, __County);
			Types._Governor.initFragments(_Governor, __Governor);
			Types._Mayor.initFragments(_Mayor, __Mayor);
			Types._Politician.initFragments(_Politician, __Politician);
			Types._President.initFragments(_President, __President);
			Types._State.initFragments(_State, __State);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CountriesTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _City__City = {};
		private static final ExecutorOperation /*@NonNull*/ [] _City__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _City__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Commissioner__Commissioner = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Commissioner__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Commissioner__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Commissioner__Politician = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Country__Country = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Country__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Country__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _County__County = {};
		private static final ExecutorOperation /*@NonNull*/ [] _County__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _County__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Governor__Governor = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Governor__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Governor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Governor__Politician = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Mayor__Mayor = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Mayor__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Mayor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Mayor__Politician = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Politician__Politician = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Politician__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Politician__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _President__President = {};
		private static final ExecutorOperation /*@NonNull*/ [] _President__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _President__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _President__Politician = {};

		private static final ExecutorOperation /*@NonNull*/ [] _State__State = {};
		private static final ExecutorOperation /*@NonNull*/ [] _State__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _State__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._City__City.initOperations(_City__City);
			Fragments._City__OclAny.initOperations(_City__OclAny);
			Fragments._City__OclElement.initOperations(_City__OclElement);

			Fragments._Commissioner__Commissioner.initOperations(_Commissioner__Commissioner);
			Fragments._Commissioner__OclAny.initOperations(_Commissioner__OclAny);
			Fragments._Commissioner__OclElement.initOperations(_Commissioner__OclElement);
			Fragments._Commissioner__Politician.initOperations(_Commissioner__Politician);

			Fragments._Country__Country.initOperations(_Country__Country);
			Fragments._Country__OclAny.initOperations(_Country__OclAny);
			Fragments._Country__OclElement.initOperations(_Country__OclElement);

			Fragments._County__County.initOperations(_County__County);
			Fragments._County__OclAny.initOperations(_County__OclAny);
			Fragments._County__OclElement.initOperations(_County__OclElement);

			Fragments._Governor__Governor.initOperations(_Governor__Governor);
			Fragments._Governor__OclAny.initOperations(_Governor__OclAny);
			Fragments._Governor__OclElement.initOperations(_Governor__OclElement);
			Fragments._Governor__Politician.initOperations(_Governor__Politician);

			Fragments._Mayor__Mayor.initOperations(_Mayor__Mayor);
			Fragments._Mayor__OclAny.initOperations(_Mayor__OclAny);
			Fragments._Mayor__OclElement.initOperations(_Mayor__OclElement);
			Fragments._Mayor__Politician.initOperations(_Mayor__Politician);

			Fragments._Politician__OclAny.initOperations(_Politician__OclAny);
			Fragments._Politician__OclElement.initOperations(_Politician__OclElement);
			Fragments._Politician__Politician.initOperations(_Politician__Politician);

			Fragments._President__OclAny.initOperations(_President__OclAny);
			Fragments._President__OclElement.initOperations(_President__OclElement);
			Fragments._President__Politician.initOperations(_President__Politician);
			Fragments._President__President.initOperations(_President__President);

			Fragments._State__OclAny.initOperations(_State__OclAny);
			Fragments._State__OclElement.initOperations(_State__OclElement);
			Fragments._State__State.initOperations(_State__State);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CountriesTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _City = {
			CountriesTables.Properties._City__isStateCapital,
			CountriesTables.Properties._City__mayor,
			CountriesTables.Properties._City__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CountriesTables.Properties._City__population
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Commissioner = {
			CountriesTables.Properties._Commissioner__congressionalDistrict,
			CountriesTables.Properties._Commissioner__isIncumbent,
			CountriesTables.Properties._Politician__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CountriesTables.Properties._Politician__politicalParty,
			CountriesTables.Properties._Politician__totalYearsInService,
			CountriesTables.Properties._Commissioner__yearElected
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Country = {
			CountriesTables.Properties._Country__isPartOfUN,
			CountriesTables.Properties._Country__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CountriesTables.Properties._Country__president,
			CountriesTables.Properties._Country__state,
			CountriesTables.Properties._Country__yearFounded
		};

		private static final ExecutorProperty /*@NonNull*/ [] _County = {
			CountriesTables.Properties._County__city,
			CountriesTables.Properties._County__commissioner,
			CountriesTables.Properties._County__countyNumber,
			CountriesTables.Properties._County__largestCity,
			CountriesTables.Properties._County__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Governor = {
			CountriesTables.Properties._Governor__endOfTermYear,
			CountriesTables.Properties._Politician__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CountriesTables.Properties._Politician__politicalParty,
			CountriesTables.Properties._Politician__totalYearsInService,
			CountriesTables.Properties._Governor__yearElected,
			CountriesTables.Properties._Governor__yearsLivedInState
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Mayor = {
			CountriesTables.Properties._Mayor__address,
			CountriesTables.Properties._Mayor__ageElectedAsMayor,
			CountriesTables.Properties._Politician__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CountriesTables.Properties._Politician__politicalParty,
			CountriesTables.Properties._Mayor__timesElected,
			CountriesTables.Properties._Politician__totalYearsInService
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Politician = {
			CountriesTables.Properties._Politician__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CountriesTables.Properties._Politician__politicalParty,
			CountriesTables.Properties._Politician__totalYearsInService
		};

		private static final ExecutorProperty /*@NonNull*/ [] _President = {
			CountriesTables.Properties._President__eligibleForReelection,
			CountriesTables.Properties._Politician__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CountriesTables.Properties._Politician__politicalParty,
			CountriesTables.Properties._President__presidentNumber,
			CountriesTables.Properties._President__secretCodename,
			CountriesTables.Properties._Politician__totalYearsInService
		};

		private static final ExecutorProperty /*@NonNull*/ [] _State = {
			CountriesTables.Properties._State__county,
			CountriesTables.Properties._State__governor,
			CountriesTables.Properties._State__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			CountriesTables.Properties._State__population,
			CountriesTables.Properties._State__totalArea
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._City__City.initProperties(_City);
			Fragments._Commissioner__Commissioner.initProperties(_Commissioner);
			Fragments._Country__Country.initProperties(_Country);
			Fragments._County__County.initProperties(_County);
			Fragments._Governor__Governor.initProperties(_Governor);
			Fragments._Mayor__Mayor.initProperties(_Mayor);
			Fragments._Politician__Politician.initProperties(_Politician);
			Fragments._President__President.initProperties(_President);
			Fragments._State__State.initProperties(_State);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CountriesTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CountriesTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new CountriesTables();
	}

	private CountriesTables() {
		super(CountriesPackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		CountriesPackage.Literals.CITY,
		CountriesPackage.Literals.COUNTRY,
		CountriesPackage.Literals.COUNTY,
		CountriesPackage.Literals.GOVERNOR,
		CountriesPackage.Literals.MAYOR,
		CountriesPackage.Literals.POLITICIAN,
		CountriesPackage.Literals.PRESIDENT,
		CountriesPackage.Literals.STATE
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
