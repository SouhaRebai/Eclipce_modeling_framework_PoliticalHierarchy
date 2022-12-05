/**
 */
package countries.impl;

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

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mayor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link countries.impl.MayorImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link countries.impl.MayorImpl#getTimesElected <em>Times Elected</em>}</li>
 *   <li>{@link countries.impl.MayorImpl#getAgeElectedAsMayor <em>Age Elected As Mayor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MayorImpl extends PoliticianImpl implements Mayor {
	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimesElected() <em>Times Elected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimesElected()
	 * @generated
	 * @ordered
	 */
	protected static final int TIMES_ELECTED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimesElected() <em>Times Elected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimesElected()
	 * @generated
	 * @ordered
	 */
	protected int timesElected = TIMES_ELECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAgeElectedAsMayor() <em>Age Elected As Mayor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeElectedAsMayor()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_ELECTED_AS_MAYOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAgeElectedAsMayor() <em>Age Elected As Mayor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeElectedAsMayor()
	 * @generated
	 * @ordered
	 */
	protected int ageElectedAsMayor = AGE_ELECTED_AS_MAYOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MayorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CountriesPackage.Literals.MAYOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.MAYOR__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimesElected() {
		return timesElected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimesElected(int newTimesElected) {
		int oldTimesElected = timesElected;
		timesElected = newTimesElected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.MAYOR__TIMES_ELECTED, oldTimesElected, timesElected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAgeElectedAsMayor() {
		return ageElectedAsMayor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgeElectedAsMayor(int newAgeElectedAsMayor) {
		int oldAgeElectedAsMayor = ageElectedAsMayor;
		ageElectedAsMayor = newAgeElectedAsMayor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.MAYOR__AGE_ELECTED_AS_MAYOR, oldAgeElectedAsMayor, ageElectedAsMayor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ageLimitation(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Mayor::ageLimitation";
		try {
			/**
			 *
			 * inv ageLimitation:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = Mayor.allInstances()
			 *         ->one(m | m.ageElectedAsMayor < 71 and m.ageElectedAsMayor > 24)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, CountriesPackage.Literals.MAYOR___AGE_LIMITATION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, CountriesTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_countries_c_c_Mayor = idResolver.getClass(CountriesTables.CLSSid_Mayor, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, CountriesTables.SET_CLSSid_Mayor, TYP_countries_c_c_Mayor);
					/*@Thrown*/ boolean accumulator = ValueUtil.FALSE_VALUE;
					Iterator<Object> ITERATOR_m = allInstances.iterator();
					/*@Thrown*/ boolean result;
					while (true) {
						if (!ITERATOR_m.hasNext()) {
							result = accumulator;
							break;
						}
						/*@NonInvalid*/ Mayor m = (Mayor)ITERATOR_m.next();
						/**
						 * m.ageElectedAsMayor < 71 and m.ageElectedAsMayor > 24
						 */
						final /*@NonInvalid*/ int ageElectedAsMayor_0 = m.getAgeElectedAsMayor();
						final /*@NonInvalid*/ IntegerValue BOXED_ageElectedAsMayor_0 = ValueUtil.integerValueOf(ageElectedAsMayor_0);
						final /*@NonInvalid*/ boolean lt = OclComparableLessThanOperation.INSTANCE.evaluate(executor, BOXED_ageElectedAsMayor_0, CountriesTables.INT_71).booleanValue();
						final /*@NonInvalid*/ Boolean and;
						if (!lt) {
							and = ValueUtil.FALSE_VALUE;
						}
						else {
							final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_ageElectedAsMayor_0, CountriesTables.INT_24).booleanValue();
							if (!gt) {
								and = ValueUtil.FALSE_VALUE;
							}
							else {
								and = ValueUtil.TRUE_VALUE;
							}
						}
						if (and == null) {
							throw new InvalidValueException("Null body for \'Collection(T).one(Collection.T[?] | Lambda T() : Boolean[1]) : Boolean[1]\'");
						}
						//
						if (and != ValueUtil.FALSE_VALUE) {			// Carry on till something found
							if (accumulator) {
								result = false;
								break;
							}
							else {
								accumulator = true;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, CountriesTables.INT_0).booleanValue();
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
			case CountriesPackage.MAYOR__ADDRESS:
				return getAddress();
			case CountriesPackage.MAYOR__TIMES_ELECTED:
				return getTimesElected();
			case CountriesPackage.MAYOR__AGE_ELECTED_AS_MAYOR:
				return getAgeElectedAsMayor();
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
			case CountriesPackage.MAYOR__ADDRESS:
				setAddress((String)newValue);
				return;
			case CountriesPackage.MAYOR__TIMES_ELECTED:
				setTimesElected((Integer)newValue);
				return;
			case CountriesPackage.MAYOR__AGE_ELECTED_AS_MAYOR:
				setAgeElectedAsMayor((Integer)newValue);
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
			case CountriesPackage.MAYOR__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case CountriesPackage.MAYOR__TIMES_ELECTED:
				setTimesElected(TIMES_ELECTED_EDEFAULT);
				return;
			case CountriesPackage.MAYOR__AGE_ELECTED_AS_MAYOR:
				setAgeElectedAsMayor(AGE_ELECTED_AS_MAYOR_EDEFAULT);
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
			case CountriesPackage.MAYOR__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case CountriesPackage.MAYOR__TIMES_ELECTED:
				return timesElected != TIMES_ELECTED_EDEFAULT;
			case CountriesPackage.MAYOR__AGE_ELECTED_AS_MAYOR:
				return ageElectedAsMayor != AGE_ELECTED_AS_MAYOR_EDEFAULT;
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
			case CountriesPackage.MAYOR___AGE_LIMITATION__DIAGNOSTICCHAIN_MAP:
				return ageLimitation((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (address: ");
		result.append(address);
		result.append(", timesElected: ");
		result.append(timesElected);
		result.append(", ageElectedAsMayor: ");
		result.append(ageElectedAsMayor);
		result.append(')');
		return result.toString();
	}

} //MayorImpl
