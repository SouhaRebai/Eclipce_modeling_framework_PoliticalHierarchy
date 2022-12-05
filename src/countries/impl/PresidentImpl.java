/**
 */
package countries.impl;

import countries.CountriesPackage;
import countries.CountriesTables;
import countries.President;

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

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>President</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link countries.impl.PresidentImpl#getPresidentNumber <em>President Number</em>}</li>
 *   <li>{@link countries.impl.PresidentImpl#isEligibleForReelection <em>Eligible For Reelection</em>}</li>
 *   <li>{@link countries.impl.PresidentImpl#getSecretCodename <em>Secret Codename</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PresidentImpl extends PoliticianImpl implements President {
	/**
	 * The default value of the '{@link #getPresidentNumber() <em>President Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresidentNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int PRESIDENT_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPresidentNumber() <em>President Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresidentNumber()
	 * @generated
	 * @ordered
	 */
	protected int presidentNumber = PRESIDENT_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #isEligibleForReelection() <em>Eligible For Reelection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEligibleForReelection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ELIGIBLE_FOR_REELECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEligibleForReelection() <em>Eligible For Reelection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEligibleForReelection()
	 * @generated
	 * @ordered
	 */
	protected boolean eligibleForReelection = ELIGIBLE_FOR_REELECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecretCodename() <em>Secret Codename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretCodename()
	 * @generated
	 * @ordered
	 */
	protected static final String SECRET_CODENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecretCodename() <em>Secret Codename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretCodename()
	 * @generated
	 * @ordered
	 */
	protected String secretCodename = SECRET_CODENAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PresidentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CountriesPackage.Literals.PRESIDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPresidentNumber() {
		return presidentNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresidentNumber(int newPresidentNumber) {
		int oldPresidentNumber = presidentNumber;
		presidentNumber = newPresidentNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.PRESIDENT__PRESIDENT_NUMBER, oldPresidentNumber, presidentNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEligibleForReelection() {
		return eligibleForReelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEligibleForReelection(boolean newEligibleForReelection) {
		boolean oldEligibleForReelection = eligibleForReelection;
		eligibleForReelection = newEligibleForReelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.PRESIDENT__ELIGIBLE_FOR_REELECTION, oldEligibleForReelection, eligibleForReelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecretCodename() {
		return secretCodename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecretCodename(String newSecretCodename) {
		String oldSecretCodename = secretCodename;
		secretCodename = newSecretCodename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.PRESIDENT__SECRET_CODENAME, oldSecretCodename, secretCodename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean uniquePresidentNumber(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "President::uniquePresidentNumber";
		try {
			/**
			 *
			 * inv uniquePresidentNumber:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = President.allInstances()
			 *         ->one(p | p.presidentNumber = self.presidentNumber)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, CountriesPackage.Literals.PRESIDENT___UNIQUE_PRESIDENT_NUMBER__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, CountriesTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_countries_c_c_President = idResolver.getClass(CountriesTables.CLSSid_President, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, CountriesTables.SET_CLSSid_President, TYP_countries_c_c_President);
				/*@Thrown*/ boolean accumulator = ValueUtil.FALSE_VALUE;
				Iterator<Object> ITERATOR_p = allInstances.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR_p.hasNext()) {
						result = accumulator;
						break;
					}
					/*@NonInvalid*/ President p = (President)ITERATOR_p.next();
					/**
					 * p.presidentNumber = self.presidentNumber
					 */
					final /*@NonInvalid*/ int presidentNumber = p.getPresidentNumber();
					final /*@NonInvalid*/ int presidentNumber_0 = this.getPresidentNumber();
					final /*@NonInvalid*/ boolean eq = presidentNumber == presidentNumber_0;
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
			case CountriesPackage.PRESIDENT__PRESIDENT_NUMBER:
				return getPresidentNumber();
			case CountriesPackage.PRESIDENT__ELIGIBLE_FOR_REELECTION:
				return isEligibleForReelection();
			case CountriesPackage.PRESIDENT__SECRET_CODENAME:
				return getSecretCodename();
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
			case CountriesPackage.PRESIDENT__PRESIDENT_NUMBER:
				setPresidentNumber((Integer)newValue);
				return;
			case CountriesPackage.PRESIDENT__ELIGIBLE_FOR_REELECTION:
				setEligibleForReelection((Boolean)newValue);
				return;
			case CountriesPackage.PRESIDENT__SECRET_CODENAME:
				setSecretCodename((String)newValue);
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
			case CountriesPackage.PRESIDENT__PRESIDENT_NUMBER:
				setPresidentNumber(PRESIDENT_NUMBER_EDEFAULT);
				return;
			case CountriesPackage.PRESIDENT__ELIGIBLE_FOR_REELECTION:
				setEligibleForReelection(ELIGIBLE_FOR_REELECTION_EDEFAULT);
				return;
			case CountriesPackage.PRESIDENT__SECRET_CODENAME:
				setSecretCodename(SECRET_CODENAME_EDEFAULT);
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
			case CountriesPackage.PRESIDENT__PRESIDENT_NUMBER:
				return presidentNumber != PRESIDENT_NUMBER_EDEFAULT;
			case CountriesPackage.PRESIDENT__ELIGIBLE_FOR_REELECTION:
				return eligibleForReelection != ELIGIBLE_FOR_REELECTION_EDEFAULT;
			case CountriesPackage.PRESIDENT__SECRET_CODENAME:
				return SECRET_CODENAME_EDEFAULT == null ? secretCodename != null : !SECRET_CODENAME_EDEFAULT.equals(secretCodename);
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
			case CountriesPackage.PRESIDENT___UNIQUE_PRESIDENT_NUMBER__DIAGNOSTICCHAIN_MAP:
				return uniquePresidentNumber((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (presidentNumber: ");
		result.append(presidentNumber);
		result.append(", eligibleForReelection: ");
		result.append(eligibleForReelection);
		result.append(", secretCodename: ");
		result.append(secretCodename);
		result.append(')');
		return result.toString();
	}

} //PresidentImpl
