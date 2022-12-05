/**
 */
package countries.impl;

import countries.City;
import countries.CountriesPackage;
import countries.CountriesTables;
import countries.Mayor;

import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link countries.impl.CityImpl#getName <em>Name</em>}</li>
 *   <li>{@link countries.impl.CityImpl#getPopulation <em>Population</em>}</li>
 *   <li>{@link countries.impl.CityImpl#isIsStateCapital <em>Is State Capital</em>}</li>
 *   <li>{@link countries.impl.CityImpl#getMayor <em>Mayor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CityImpl extends MinimalEObjectImpl.Container implements City {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPopulation() <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected static final int POPULATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected int population = POPULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsStateCapital() <em>Is State Capital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStateCapital()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STATE_CAPITAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStateCapital() <em>Is State Capital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStateCapital()
	 * @generated
	 * @ordered
	 */
	protected boolean isStateCapital = IS_STATE_CAPITAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMayor() <em>Mayor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMayor()
	 * @generated
	 * @ordered
	 */
	protected Mayor mayor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CountriesPackage.Literals.CITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.CITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPopulation() {
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopulation(int newPopulation) {
		int oldPopulation = population;
		population = newPopulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.CITY__POPULATION, oldPopulation, population));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStateCapital() {
		return isStateCapital;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStateCapital(boolean newIsStateCapital) {
		boolean oldIsStateCapital = isStateCapital;
		isStateCapital = newIsStateCapital;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.CITY__IS_STATE_CAPITAL, oldIsStateCapital, isStateCapital));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mayor getMayor() {
		if (mayor != null && mayor.eIsProxy()) {
			InternalEObject oldMayor = (InternalEObject)mayor;
			mayor = (Mayor)eResolveProxy(oldMayor);
			if (mayor != oldMayor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CountriesPackage.CITY__MAYOR, oldMayor, mayor));
			}
		}
		return mayor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mayor basicGetMayor() {
		return mayor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMayor(Mayor newMayor) {
		Mayor oldMayor = mayor;
		mayor = newMayor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.CITY__MAYOR, oldMayor, mayor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean uniqueCityName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "City::uniqueCityName";
		try {
			/**
			 *
			 * inv uniqueCityName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = City.allInstances()
			 *         ->one(c | c.name = self.name)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, CountriesPackage.Literals.CITY___UNIQUE_CITY_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, CountriesTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_countries_c_c_City = idResolver.getClass(CountriesTables.CLSSid_City, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, CountriesTables.SET_CLSSid_City, TYP_countries_c_c_City);
				/*@Thrown*/ boolean accumulator = ValueUtil.FALSE_VALUE;
				Iterator<Object> ITERATOR_c = allInstances.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR_c.hasNext()) {
						result = accumulator;
						break;
					}
					/*@NonInvalid*/ City c = (City)ITERATOR_c.next();
					/**
					 * c.name = self.name
					 */
					final /*@NonInvalid*/ String name = c.getName();
					final /*@NonInvalid*/ String name_0 = this.getName();
					final /*@NonInvalid*/ boolean eq = (name != null) ? name.equals(name_0) : (name_0 == null);
					//
					if (eq) {			// Carry on till something found
						if (accumulator) {
							result = false;
							break;
						}
						else {
							accumulator = true;
						}
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, CountriesTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CountriesPackage.CITY__NAME:
				return getName();
			case CountriesPackage.CITY__POPULATION:
				return getPopulation();
			case CountriesPackage.CITY__IS_STATE_CAPITAL:
				return isIsStateCapital();
			case CountriesPackage.CITY__MAYOR:
				if (resolve) return getMayor();
				return basicGetMayor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CountriesPackage.CITY__NAME:
				setName((String)newValue);
				return;
			case CountriesPackage.CITY__POPULATION:
				setPopulation((Integer)newValue);
				return;
			case CountriesPackage.CITY__IS_STATE_CAPITAL:
				setIsStateCapital((Boolean)newValue);
				return;
			case CountriesPackage.CITY__MAYOR:
				setMayor((Mayor)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CountriesPackage.CITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CountriesPackage.CITY__POPULATION:
				setPopulation(POPULATION_EDEFAULT);
				return;
			case CountriesPackage.CITY__IS_STATE_CAPITAL:
				setIsStateCapital(IS_STATE_CAPITAL_EDEFAULT);
				return;
			case CountriesPackage.CITY__MAYOR:
				setMayor((Mayor)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CountriesPackage.CITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CountriesPackage.CITY__POPULATION:
				return population != POPULATION_EDEFAULT;
			case CountriesPackage.CITY__IS_STATE_CAPITAL:
				return isStateCapital != IS_STATE_CAPITAL_EDEFAULT;
			case CountriesPackage.CITY__MAYOR:
				return mayor != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CountriesPackage.CITY___UNIQUE_CITY_NAME__DIAGNOSTICCHAIN_MAP:
				return uniqueCityName((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", population: ");
		result.append(population);
		result.append(", isStateCapital: ");
		result.append(isStateCapital);
		result.append(')');
		return result.toString();
	}

} //CityImpl
