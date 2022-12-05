/**
 */
package countries.impl;

import countries.CountriesPackage;
import countries.CountriesTables;
import countries.Governor;

import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Governor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link countries.impl.GovernorImpl#getYearElected <em>Year Elected</em>}</li>
 *   <li>{@link countries.impl.GovernorImpl#getEndOfTermYear <em>End Of Term Year</em>}</li>
 *   <li>{@link countries.impl.GovernorImpl#getYearsLivedInState <em>Years Lived In State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GovernorImpl extends PoliticianImpl implements Governor {
	/**
	 * The default value of the '{@link #getYearElected() <em>Year Elected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearElected()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_ELECTED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYearElected() <em>Year Elected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearElected()
	 * @generated
	 * @ordered
	 */
	protected int yearElected = YEAR_ELECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndOfTermYear() <em>End Of Term Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndOfTermYear()
	 * @generated
	 * @ordered
	 */
	protected static final int END_OF_TERM_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEndOfTermYear() <em>End Of Term Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndOfTermYear()
	 * @generated
	 * @ordered
	 */
	protected int endOfTermYear = END_OF_TERM_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getYearsLivedInState() <em>Years Lived In State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearsLivedInState()
	 * @generated
	 * @ordered
	 */
	protected static final int YEARS_LIVED_IN_STATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYearsLivedInState() <em>Years Lived In State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearsLivedInState()
	 * @generated
	 * @ordered
	 */
	protected int yearsLivedInState = YEARS_LIVED_IN_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GovernorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CountriesPackage.Literals.GOVERNOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYearElected() {
		return yearElected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearElected(int newYearElected) {
		int oldYearElected = yearElected;
		yearElected = newYearElected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.GOVERNOR__YEAR_ELECTED, oldYearElected, yearElected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEndOfTermYear() {
		return endOfTermYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndOfTermYear(int newEndOfTermYear) {
		int oldEndOfTermYear = endOfTermYear;
		endOfTermYear = newEndOfTermYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.GOVERNOR__END_OF_TERM_YEAR, oldEndOfTermYear, endOfTermYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYearsLivedInState() {
		return yearsLivedInState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearsLivedInState(int newYearsLivedInState) {
		int oldYearsLivedInState = yearsLivedInState;
		yearsLivedInState = newYearsLivedInState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.GOVERNOR__YEARS_LIVED_IN_STATE, oldYearsLivedInState, yearsLivedInState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean yearsLimitation(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Governor::yearsLimitation";
		try {
			/**
			 *
			 * inv yearsLimitation:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = Governor.allInstances()
			 *         ->forAll(g | g.yearElected < g.endOfTermYear)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, CountriesPackage.Literals.GOVERNOR___YEARS_LIMITATION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, CountriesTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_countries_c_c_Governor = idResolver.getClass(CountriesTables.CLSSid_Governor, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, CountriesTables.SET_CLSSid_Governor, TYP_countries_c_c_Governor);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_g = allInstances.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_g.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Governor g = (Governor)ITERATOR_g.next();
					/**
					 * g.yearElected < g.endOfTermYear
					 */
					final /*@NonInvalid*/ int yearElected = g.getYearElected();
					final /*@NonInvalid*/ IntegerValue BOXED_yearElected = ValueUtil.integerValueOf(yearElected);
					final /*@NonInvalid*/ int endOfTermYear = g.getEndOfTermYear();
					final /*@NonInvalid*/ IntegerValue BOXED_endOfTermYear = ValueUtil.integerValueOf(endOfTermYear);
					final /*@NonInvalid*/ boolean lt = OclComparableLessThanOperation.INSTANCE.evaluate(executor, BOXED_yearElected, BOXED_endOfTermYear).booleanValue();
					//
					if (!lt) {					// Normal unsuccessful body evaluation result
						result = ValueUtil.FALSE_VALUE;
						break;														// Stop immediately
					}
					else if (lt) {				// Normal successful body evaluation result
						;															// Carry on
					}
					else {															// Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
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
			case CountriesPackage.GOVERNOR__YEAR_ELECTED:
				return getYearElected();
			case CountriesPackage.GOVERNOR__END_OF_TERM_YEAR:
				return getEndOfTermYear();
			case CountriesPackage.GOVERNOR__YEARS_LIVED_IN_STATE:
				return getYearsLivedInState();
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
			case CountriesPackage.GOVERNOR__YEAR_ELECTED:
				setYearElected((Integer)newValue);
				return;
			case CountriesPackage.GOVERNOR__END_OF_TERM_YEAR:
				setEndOfTermYear((Integer)newValue);
				return;
			case CountriesPackage.GOVERNOR__YEARS_LIVED_IN_STATE:
				setYearsLivedInState((Integer)newValue);
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
			case CountriesPackage.GOVERNOR__YEAR_ELECTED:
				setYearElected(YEAR_ELECTED_EDEFAULT);
				return;
			case CountriesPackage.GOVERNOR__END_OF_TERM_YEAR:
				setEndOfTermYear(END_OF_TERM_YEAR_EDEFAULT);
				return;
			case CountriesPackage.GOVERNOR__YEARS_LIVED_IN_STATE:
				setYearsLivedInState(YEARS_LIVED_IN_STATE_EDEFAULT);
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
			case CountriesPackage.GOVERNOR__YEAR_ELECTED:
				return yearElected != YEAR_ELECTED_EDEFAULT;
			case CountriesPackage.GOVERNOR__END_OF_TERM_YEAR:
				return endOfTermYear != END_OF_TERM_YEAR_EDEFAULT;
			case CountriesPackage.GOVERNOR__YEARS_LIVED_IN_STATE:
				return yearsLivedInState != YEARS_LIVED_IN_STATE_EDEFAULT;
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
			case CountriesPackage.GOVERNOR___YEARS_LIMITATION__DIAGNOSTICCHAIN_MAP:
				return yearsLimitation((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (yearElected: ");
		result.append(yearElected);
		result.append(", endOfTermYear: ");
		result.append(endOfTermYear);
		result.append(", yearsLivedInState: ");
		result.append(yearsLivedInState);
		result.append(')');
		return result.toString();
	}

} //GovernorImpl
