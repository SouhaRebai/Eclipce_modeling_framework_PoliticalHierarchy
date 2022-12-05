/**
 */
package countries.impl;

import countries.City;
import countries.Commissioner;
import countries.CountriesPackage;
import countries.CountriesTables;
import countries.County;

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
 * An implementation of the model object '<em><b>County</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link countries.impl.CountyImpl#getName <em>Name</em>}</li>
 *   <li>{@link countries.impl.CountyImpl#getCountyNumber <em>County Number</em>}</li>
 *   <li>{@link countries.impl.CountyImpl#getLargestCity <em>Largest City</em>}</li>
 *   <li>{@link countries.impl.CountyImpl#getCity <em>City</em>}</li>
 *   <li>{@link countries.impl.CountyImpl#getCommissioner <em>Commissioner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountyImpl extends MinimalEObjectImpl.Container implements County {
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
	 * The default value of the '{@link #getCountyNumber() <em>County Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountyNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNTY_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCountyNumber() <em>County Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountyNumber()
	 * @generated
	 * @ordered
	 */
	protected int countyNumber = COUNTY_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLargestCity() <em>Largest City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargestCity()
	 * @generated
	 * @ordered
	 */
	protected static final String LARGEST_CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLargestCity() <em>Largest City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargestCity()
	 * @generated
	 * @ordered
	 */
	protected String largestCity = LARGEST_CITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected EList<City> city;

	/**
	 * The cached value of the '{@link #getCommissioner() <em>Commissioner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommissioner()
	 * @generated
	 * @ordered
	 */
	protected Commissioner commissioner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CountriesPackage.Literals.COUNTY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.COUNTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCountyNumber() {
		return countyNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountyNumber(int newCountyNumber) {
		int oldCountyNumber = countyNumber;
		countyNumber = newCountyNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.COUNTY__COUNTY_NUMBER, oldCountyNumber, countyNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLargestCity() {
		return largestCity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargestCity(String newLargestCity) {
		String oldLargestCity = largestCity;
		largestCity = newLargestCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.COUNTY__LARGEST_CITY, oldLargestCity, largestCity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<City> getCity() {
		if (city == null) {
			city = new EObjectContainmentEList<City>(City.class, this, CountriesPackage.COUNTY__CITY);
		}
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commissioner getCommissioner() {
		if (commissioner != null && commissioner.eIsProxy()) {
			InternalEObject oldCommissioner = (InternalEObject)commissioner;
			commissioner = (Commissioner)eResolveProxy(oldCommissioner);
			if (commissioner != oldCommissioner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CountriesPackage.COUNTY__COMMISSIONER, oldCommissioner, commissioner));
			}
		}
		return commissioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commissioner basicGetCommissioner() {
		return commissioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommissioner(Commissioner newCommissioner) {
		Commissioner oldCommissioner = commissioner;
		commissioner = newCommissioner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.COUNTY__COMMISSIONER, oldCommissioner, commissioner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean uniqueCountyName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "County::uniqueCountyName";
		try {
			/**
			 *
			 * inv uniqueCountyName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = County.allInstances()
			 *         ->one(c | c.name = self.name)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, CountriesPackage.Literals.COUNTY___UNIQUE_COUNTY_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, CountriesTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_countries_c_c_County = idResolver.getClass(CountriesTables.CLSSid_County, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, CountriesTables.SET_CLSSid_County, TYP_countries_c_c_County);
				/*@Thrown*/ boolean accumulator = ValueUtil.FALSE_VALUE;
				Iterator<Object> ITERATOR_c = allInstances.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR_c.hasNext()) {
						result = accumulator;
						break;
					}
					/*@NonInvalid*/ County c = (County)ITERATOR_c.next();
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
			case CountriesPackage.COUNTY__CITY:
				return ((InternalEList<?>)getCity()).basicRemove(otherEnd, msgs);
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
			case CountriesPackage.COUNTY__NAME:
				return getName();
			case CountriesPackage.COUNTY__COUNTY_NUMBER:
				return getCountyNumber();
			case CountriesPackage.COUNTY__LARGEST_CITY:
				return getLargestCity();
			case CountriesPackage.COUNTY__CITY:
				return getCity();
			case CountriesPackage.COUNTY__COMMISSIONER:
				if (resolve) return getCommissioner();
				return basicGetCommissioner();
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
			case CountriesPackage.COUNTY__NAME:
				setName((String)newValue);
				return;
			case CountriesPackage.COUNTY__COUNTY_NUMBER:
				setCountyNumber((Integer)newValue);
				return;
			case CountriesPackage.COUNTY__LARGEST_CITY:
				setLargestCity((String)newValue);
				return;
			case CountriesPackage.COUNTY__CITY:
				getCity().clear();
				getCity().addAll((Collection<? extends City>)newValue);
				return;
			case CountriesPackage.COUNTY__COMMISSIONER:
				setCommissioner((Commissioner)newValue);
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
			case CountriesPackage.COUNTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CountriesPackage.COUNTY__COUNTY_NUMBER:
				setCountyNumber(COUNTY_NUMBER_EDEFAULT);
				return;
			case CountriesPackage.COUNTY__LARGEST_CITY:
				setLargestCity(LARGEST_CITY_EDEFAULT);
				return;
			case CountriesPackage.COUNTY__CITY:
				getCity().clear();
				return;
			case CountriesPackage.COUNTY__COMMISSIONER:
				setCommissioner((Commissioner)null);
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
			case CountriesPackage.COUNTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CountriesPackage.COUNTY__COUNTY_NUMBER:
				return countyNumber != COUNTY_NUMBER_EDEFAULT;
			case CountriesPackage.COUNTY__LARGEST_CITY:
				return LARGEST_CITY_EDEFAULT == null ? largestCity != null : !LARGEST_CITY_EDEFAULT.equals(largestCity);
			case CountriesPackage.COUNTY__CITY:
				return city != null && !city.isEmpty();
			case CountriesPackage.COUNTY__COMMISSIONER:
				return commissioner != null;
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
			case CountriesPackage.COUNTY___UNIQUE_COUNTY_NAME__DIAGNOSTICCHAIN_MAP:
				return uniqueCountyName((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(", countyNumber: ");
		result.append(countyNumber);
		result.append(", largestCity: ");
		result.append(largestCity);
		result.append(')');
		return result.toString();
	}

} //CountyImpl
