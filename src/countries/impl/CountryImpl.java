/**
 */
package countries.impl;

import countries.CountriesPackage;
import countries.CountriesTables;
import countries.Country;
import countries.President;
import countries.State;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 * An implementation of the model object '<em><b>Country</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link countries.impl.CountryImpl#getName <em>Name</em>}</li>
 *   <li>{@link countries.impl.CountryImpl#getYearFounded <em>Year Founded</em>}</li>
 *   <li>{@link countries.impl.CountryImpl#isIsPartOfUN <em>Is Part Of UN</em>}</li>
 *   <li>{@link countries.impl.CountryImpl#getState <em>State</em>}</li>
 *   <li>{@link countries.impl.CountryImpl#getPresident <em>President</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountryImpl extends MinimalEObjectImpl.Container implements Country {
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
	 * The default value of the '{@link #getYearFounded() <em>Year Founded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearFounded()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_FOUNDED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYearFounded() <em>Year Founded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearFounded()
	 * @generated
	 * @ordered
	 */
	protected int yearFounded = YEAR_FOUNDED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPartOfUN() <em>Is Part Of UN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPartOfUN()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PART_OF_UN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPartOfUN() <em>Is Part Of UN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPartOfUN()
	 * @generated
	 * @ordered
	 */
	protected boolean isPartOfUN = IS_PART_OF_UN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected EList<State> state;

	/**
	 * The cached value of the '{@link #getPresident() <em>President</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresident()
	 * @generated
	 * @ordered
	 */
	protected President president;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CountriesPackage.Literals.COUNTRY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.COUNTRY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYearFounded() {
		return yearFounded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearFounded(int newYearFounded) {
		int oldYearFounded = yearFounded;
		yearFounded = newYearFounded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.COUNTRY__YEAR_FOUNDED, oldYearFounded, yearFounded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPartOfUN() {
		return isPartOfUN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPartOfUN(boolean newIsPartOfUN) {
		boolean oldIsPartOfUN = isPartOfUN;
		isPartOfUN = newIsPartOfUN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.COUNTRY__IS_PART_OF_UN, oldIsPartOfUN, isPartOfUN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getState() {
		if (state == null) {
			state = new EObjectContainmentEList<State>(State.class, this, CountriesPackage.COUNTRY__STATE);
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public President getPresident() {
		if (president != null && president.eIsProxy()) {
			InternalEObject oldPresident = (InternalEObject)president;
			president = (President)eResolveProxy(oldPresident);
			if (president != oldPresident) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CountriesPackage.COUNTRY__PRESIDENT, oldPresident, president));
			}
		}
		return president;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public President basicGetPresident() {
		return president;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresident(President newPresident) {
		President oldPresident = president;
		president = newPresident;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.COUNTRY__PRESIDENT, oldPresident, president));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean uniqueCountryName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Country::uniqueCountryName";
		try {
			/**
			 *
			 * inv uniqueCountryName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = Country.allInstances()
			 *         ->one(c | c.name = self.name)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, CountriesPackage.Literals.COUNTRY___UNIQUE_COUNTRY_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, CountriesTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_countries_c_c_Country = idResolver.getClass(CountriesTables.CLSSid_Country, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, CountriesTables.SET_CLSSid_Country, TYP_countries_c_c_Country);
				/*@Thrown*/ boolean accumulator = ValueUtil.FALSE_VALUE;
				Iterator<Object> ITERATOR_c = allInstances.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR_c.hasNext()) {
						result = accumulator;
						break;
					}
					/*@NonInvalid*/ Country c = (Country)ITERATOR_c.next();
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CountriesPackage.COUNTRY__STATE:
				return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CountriesPackage.COUNTRY__NAME:
				return getName();
			case CountriesPackage.COUNTRY__YEAR_FOUNDED:
				return getYearFounded();
			case CountriesPackage.COUNTRY__IS_PART_OF_UN:
				return isIsPartOfUN();
			case CountriesPackage.COUNTRY__STATE:
				return getState();
			case CountriesPackage.COUNTRY__PRESIDENT:
				if (resolve) return getPresident();
				return basicGetPresident();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CountriesPackage.COUNTRY__NAME:
				setName((String)newValue);
				return;
			case CountriesPackage.COUNTRY__YEAR_FOUNDED:
				setYearFounded((Integer)newValue);
				return;
			case CountriesPackage.COUNTRY__IS_PART_OF_UN:
				setIsPartOfUN((Boolean)newValue);
				return;
			case CountriesPackage.COUNTRY__STATE:
				getState().clear();
				getState().addAll((Collection<? extends State>)newValue);
				return;
			case CountriesPackage.COUNTRY__PRESIDENT:
				setPresident((President)newValue);
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
			case CountriesPackage.COUNTRY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CountriesPackage.COUNTRY__YEAR_FOUNDED:
				setYearFounded(YEAR_FOUNDED_EDEFAULT);
				return;
			case CountriesPackage.COUNTRY__IS_PART_OF_UN:
				setIsPartOfUN(IS_PART_OF_UN_EDEFAULT);
				return;
			case CountriesPackage.COUNTRY__STATE:
				getState().clear();
				return;
			case CountriesPackage.COUNTRY__PRESIDENT:
				setPresident((President)null);
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
			case CountriesPackage.COUNTRY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CountriesPackage.COUNTRY__YEAR_FOUNDED:
				return yearFounded != YEAR_FOUNDED_EDEFAULT;
			case CountriesPackage.COUNTRY__IS_PART_OF_UN:
				return isPartOfUN != IS_PART_OF_UN_EDEFAULT;
			case CountriesPackage.COUNTRY__STATE:
				return state != null && !state.isEmpty();
			case CountriesPackage.COUNTRY__PRESIDENT:
				return president != null;
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
			case CountriesPackage.COUNTRY___UNIQUE_COUNTRY_NAME__DIAGNOSTICCHAIN_MAP:
				return uniqueCountryName((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(", yearFounded: ");
		result.append(yearFounded);
		result.append(", isPartOfUN: ");
		result.append(isPartOfUN);
		result.append(')');
		return result.toString();
	}

} //CountryImpl
