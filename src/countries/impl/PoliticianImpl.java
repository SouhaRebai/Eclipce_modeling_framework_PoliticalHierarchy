/**
 */
package countries.impl;

import countries.CountriesPackage;
import countries.CountriesTables;
import countries.Politician;

import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.RealValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Politician</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link countries.impl.PoliticianImpl#getName <em>Name</em>}</li>
 *   <li>{@link countries.impl.PoliticianImpl#getPoliticalParty <em>Political Party</em>}</li>
 *   <li>{@link countries.impl.PoliticianImpl#getTotalYearsInService <em>Total Years In Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PoliticianImpl extends MinimalEObjectImpl.Container implements Politician {
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
	 * The default value of the '{@link #getPoliticalParty() <em>Political Party</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoliticalParty()
	 * @generated
	 * @ordered
	 */
	protected static final String POLITICAL_PARTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPoliticalParty() <em>Political Party</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoliticalParty()
	 * @generated
	 * @ordered
	 */
	protected String politicalParty = POLITICAL_PARTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalYearsInService() <em>Total Years In Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalYearsInService()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_YEARS_IN_SERVICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotalYearsInService() <em>Total Years In Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalYearsInService()
	 * @generated
	 * @ordered
	 */
	protected double totalYearsInService = TOTAL_YEARS_IN_SERVICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PoliticianImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CountriesPackage.Literals.POLITICIAN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.POLITICIAN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPoliticalParty() {
		return politicalParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoliticalParty(String newPoliticalParty) {
		String oldPoliticalParty = politicalParty;
		politicalParty = newPoliticalParty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.POLITICIAN__POLITICAL_PARTY, oldPoliticalParty, politicalParty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalYearsInService() {
		return totalYearsInService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalYearsInService(double newTotalYearsInService) {
		double oldTotalYearsInService = totalYearsInService;
		totalYearsInService = newTotalYearsInService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.POLITICIAN__TOTAL_YEARS_IN_SERVICE, oldTotalYearsInService, totalYearsInService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean serviceLimitation(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Politician::serviceLimitation";
		try {
			/**
			 *
			 * inv serviceLimitation:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = Politician.allInstances()
			 *         ->one(p | p.totalYearsInService < 5)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, CountriesPackage.Literals.POLITICIAN___SERVICE_LIMITATION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, CountriesTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_countries_c_c_Politician = idResolver.getClass(CountriesTables.CLSSid_Politician, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, CountriesTables.SET_CLSSid_Politician, TYP_countries_c_c_Politician);
				/*@Thrown*/ boolean accumulator = ValueUtil.FALSE_VALUE;
				Iterator<Object> ITERATOR_p = allInstances.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR_p.hasNext()) {
						result = accumulator;
						break;
					}
					/*@NonInvalid*/ Politician p = (Politician)ITERATOR_p.next();
					/**
					 * p.totalYearsInService < 5
					 */
					final /*@NonInvalid*/ double totalYearsInService = p.getTotalYearsInService();
					final /*@NonInvalid*/ RealValue BOXED_totalYearsInService = ValueUtil.realValueOf(totalYearsInService);
					final /*@NonInvalid*/ boolean lt = OclComparableLessThanOperation.INSTANCE.evaluate(executor, BOXED_totalYearsInService, CountriesTables.INT_5).booleanValue();
					//
					if (lt) {			// Carry on till something found
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
			case CountriesPackage.POLITICIAN__NAME:
				return getName();
			case CountriesPackage.POLITICIAN__POLITICAL_PARTY:
				return getPoliticalParty();
			case CountriesPackage.POLITICIAN__TOTAL_YEARS_IN_SERVICE:
				return getTotalYearsInService();
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
			case CountriesPackage.POLITICIAN__NAME:
				setName((String)newValue);
				return;
			case CountriesPackage.POLITICIAN__POLITICAL_PARTY:
				setPoliticalParty((String)newValue);
				return;
			case CountriesPackage.POLITICIAN__TOTAL_YEARS_IN_SERVICE:
				setTotalYearsInService((Double)newValue);
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
			case CountriesPackage.POLITICIAN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CountriesPackage.POLITICIAN__POLITICAL_PARTY:
				setPoliticalParty(POLITICAL_PARTY_EDEFAULT);
				return;
			case CountriesPackage.POLITICIAN__TOTAL_YEARS_IN_SERVICE:
				setTotalYearsInService(TOTAL_YEARS_IN_SERVICE_EDEFAULT);
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
			case CountriesPackage.POLITICIAN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CountriesPackage.POLITICIAN__POLITICAL_PARTY:
				return POLITICAL_PARTY_EDEFAULT == null ? politicalParty != null : !POLITICAL_PARTY_EDEFAULT.equals(politicalParty);
			case CountriesPackage.POLITICIAN__TOTAL_YEARS_IN_SERVICE:
				return totalYearsInService != TOTAL_YEARS_IN_SERVICE_EDEFAULT;
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
			case CountriesPackage.POLITICIAN___SERVICE_LIMITATION__DIAGNOSTICCHAIN_MAP:
				return serviceLimitation((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(", politicalParty: ");
		result.append(politicalParty);
		result.append(", totalYearsInService: ");
		result.append(totalYearsInService);
		result.append(')');
		return result.toString();
	}

} //PoliticianImpl
