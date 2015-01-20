/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.ocms.course.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.ocms.course.model.Pricing;

import java.util.List;

/**
 * The persistence utility for the pricing service. This utility wraps {@link PricingPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author doraraj
 * @see PricingPersistence
 * @see PricingPersistenceImpl
 * @generated
 */
public class PricingUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Pricing pricing) {
		getPersistence().clearCache(pricing);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Pricing> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Pricing> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Pricing> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Pricing update(Pricing pricing) throws SystemException {
		return getPersistence().update(pricing);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Pricing update(Pricing pricing, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(pricing, serviceContext);
	}

	/**
	* Returns all the pricings where pricingId = &#63;.
	*
	* @param pricingId the pricing ID
	* @return the matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Pricing> findByPricingId(
		long pricingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPricingId(pricingId);
	}

	/**
	* Returns a range of all the pricings where pricingId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pricingId the pricing ID
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @return the range of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Pricing> findByPricingId(
		long pricingId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPricingId(pricingId, start, end);
	}

	/**
	* Returns an ordered range of all the pricings where pricingId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pricingId the pricing ID
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Pricing> findByPricingId(
		long pricingId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPricingId(pricingId, start, end, orderByComparator);
	}

	/**
	* Returns the first pricing in the ordered set where pricingId = &#63;.
	*
	* @param pricingId the pricing ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pricing
	* @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing findByPricingId_First(
		long pricingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException {
		return getPersistence()
				   .findByPricingId_First(pricingId, orderByComparator);
	}

	/**
	* Returns the first pricing in the ordered set where pricingId = &#63;.
	*
	* @param pricingId the pricing ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pricing, or <code>null</code> if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing fetchByPricingId_First(
		long pricingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPricingId_First(pricingId, orderByComparator);
	}

	/**
	* Returns the last pricing in the ordered set where pricingId = &#63;.
	*
	* @param pricingId the pricing ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pricing
	* @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing findByPricingId_Last(
		long pricingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException {
		return getPersistence()
				   .findByPricingId_Last(pricingId, orderByComparator);
	}

	/**
	* Returns the last pricing in the ordered set where pricingId = &#63;.
	*
	* @param pricingId the pricing ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pricing, or <code>null</code> if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing fetchByPricingId_Last(
		long pricingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPricingId_Last(pricingId, orderByComparator);
	}

	/**
	* Removes all the pricings where pricingId = &#63; from the database.
	*
	* @param pricingId the pricing ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPricingId(long pricingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPricingId(pricingId);
	}

	/**
	* Returns the number of pricings where pricingId = &#63;.
	*
	* @param pricingId the pricing ID
	* @return the number of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPricingId(long pricingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPricingId(pricingId);
	}

	/**
	* Returns all the pricings where packageId = &#63;.
	*
	* @param packageId the package ID
	* @return the matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Pricing> findByPackageId(
		int packageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPackageId(packageId);
	}

	/**
	* Returns a range of all the pricings where packageId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param packageId the package ID
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @return the range of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Pricing> findByPackageId(
		int packageId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPackageId(packageId, start, end);
	}

	/**
	* Returns an ordered range of all the pricings where packageId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param packageId the package ID
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Pricing> findByPackageId(
		int packageId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPackageId(packageId, start, end, orderByComparator);
	}

	/**
	* Returns the first pricing in the ordered set where packageId = &#63;.
	*
	* @param packageId the package ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pricing
	* @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing findByPackageId_First(
		int packageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException {
		return getPersistence()
				   .findByPackageId_First(packageId, orderByComparator);
	}

	/**
	* Returns the first pricing in the ordered set where packageId = &#63;.
	*
	* @param packageId the package ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pricing, or <code>null</code> if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing fetchByPackageId_First(
		int packageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPackageId_First(packageId, orderByComparator);
	}

	/**
	* Returns the last pricing in the ordered set where packageId = &#63;.
	*
	* @param packageId the package ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pricing
	* @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing findByPackageId_Last(
		int packageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException {
		return getPersistence()
				   .findByPackageId_Last(packageId, orderByComparator);
	}

	/**
	* Returns the last pricing in the ordered set where packageId = &#63;.
	*
	* @param packageId the package ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pricing, or <code>null</code> if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing fetchByPackageId_Last(
		int packageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPackageId_Last(packageId, orderByComparator);
	}

	/**
	* Returns the pricings before and after the current pricing in the ordered set where packageId = &#63;.
	*
	* @param pricingId the primary key of the current pricing
	* @param packageId the package ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next pricing
	* @throws com.ocms.course.NoSuchPricingException if a pricing with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing[] findByPackageId_PrevAndNext(
		long pricingId, int packageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException {
		return getPersistence()
				   .findByPackageId_PrevAndNext(pricingId, packageId,
			orderByComparator);
	}

	/**
	* Removes all the pricings where packageId = &#63; from the database.
	*
	* @param packageId the package ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPackageId(int packageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPackageId(packageId);
	}

	/**
	* Returns the number of pricings where packageId = &#63;.
	*
	* @param packageId the package ID
	* @return the number of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPackageId(int packageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPackageId(packageId);
	}

	/**
	* Returns all the pricings where courseId = &#63;.
	*
	* @param courseId the course ID
	* @return the matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Pricing> findByCourseId(
		int courseId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCourseId(courseId);
	}

	/**
	* Returns a range of all the pricings where courseId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param courseId the course ID
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @return the range of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Pricing> findByCourseId(
		int courseId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCourseId(courseId, start, end);
	}

	/**
	* Returns an ordered range of all the pricings where courseId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param courseId the course ID
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Pricing> findByCourseId(
		int courseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCourseId(courseId, start, end, orderByComparator);
	}

	/**
	* Returns the first pricing in the ordered set where courseId = &#63;.
	*
	* @param courseId the course ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pricing
	* @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing findByCourseId_First(
		int courseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException {
		return getPersistence().findByCourseId_First(courseId, orderByComparator);
	}

	/**
	* Returns the first pricing in the ordered set where courseId = &#63;.
	*
	* @param courseId the course ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pricing, or <code>null</code> if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing fetchByCourseId_First(
		int courseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCourseId_First(courseId, orderByComparator);
	}

	/**
	* Returns the last pricing in the ordered set where courseId = &#63;.
	*
	* @param courseId the course ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pricing
	* @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing findByCourseId_Last(
		int courseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException {
		return getPersistence().findByCourseId_Last(courseId, orderByComparator);
	}

	/**
	* Returns the last pricing in the ordered set where courseId = &#63;.
	*
	* @param courseId the course ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pricing, or <code>null</code> if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing fetchByCourseId_Last(
		int courseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCourseId_Last(courseId, orderByComparator);
	}

	/**
	* Returns the pricings before and after the current pricing in the ordered set where courseId = &#63;.
	*
	* @param pricingId the primary key of the current pricing
	* @param courseId the course ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next pricing
	* @throws com.ocms.course.NoSuchPricingException if a pricing with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing[] findByCourseId_PrevAndNext(
		long pricingId, int courseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException {
		return getPersistence()
				   .findByCourseId_PrevAndNext(pricingId, courseId,
			orderByComparator);
	}

	/**
	* Removes all the pricings where courseId = &#63; from the database.
	*
	* @param courseId the course ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCourseId(int courseId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCourseId(courseId);
	}

	/**
	* Returns the number of pricings where courseId = &#63;.
	*
	* @param courseId the course ID
	* @return the number of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCourseId(int courseId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCourseId(courseId);
	}

	/**
	* Returns all the pricings where locationId = &#63;.
	*
	* @param locationId the location ID
	* @return the matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Pricing> findByLocationId(
		int locationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLocationId(locationId);
	}

	/**
	* Returns a range of all the pricings where locationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param locationId the location ID
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @return the range of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Pricing> findByLocationId(
		int locationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLocationId(locationId, start, end);
	}

	/**
	* Returns an ordered range of all the pricings where locationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param locationId the location ID
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Pricing> findByLocationId(
		int locationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByLocationId(locationId, start, end, orderByComparator);
	}

	/**
	* Returns the first pricing in the ordered set where locationId = &#63;.
	*
	* @param locationId the location ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pricing
	* @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing findByLocationId_First(
		int locationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException {
		return getPersistence()
				   .findByLocationId_First(locationId, orderByComparator);
	}

	/**
	* Returns the first pricing in the ordered set where locationId = &#63;.
	*
	* @param locationId the location ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pricing, or <code>null</code> if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing fetchByLocationId_First(
		int locationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByLocationId_First(locationId, orderByComparator);
	}

	/**
	* Returns the last pricing in the ordered set where locationId = &#63;.
	*
	* @param locationId the location ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pricing
	* @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing findByLocationId_Last(
		int locationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException {
		return getPersistence()
				   .findByLocationId_Last(locationId, orderByComparator);
	}

	/**
	* Returns the last pricing in the ordered set where locationId = &#63;.
	*
	* @param locationId the location ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pricing, or <code>null</code> if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing fetchByLocationId_Last(
		int locationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByLocationId_Last(locationId, orderByComparator);
	}

	/**
	* Returns the pricings before and after the current pricing in the ordered set where locationId = &#63;.
	*
	* @param pricingId the primary key of the current pricing
	* @param locationId the location ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next pricing
	* @throws com.ocms.course.NoSuchPricingException if a pricing with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing[] findByLocationId_PrevAndNext(
		long pricingId, int locationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException {
		return getPersistence()
				   .findByLocationId_PrevAndNext(pricingId, locationId,
			orderByComparator);
	}

	/**
	* Removes all the pricings where locationId = &#63; from the database.
	*
	* @param locationId the location ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByLocationId(int locationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByLocationId(locationId);
	}

	/**
	* Returns the number of pricings where locationId = &#63;.
	*
	* @param locationId the location ID
	* @return the number of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByLocationId(int locationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByLocationId(locationId);
	}

	/**
	* Returns all the pricings where price = &#63;.
	*
	* @param price the price
	* @return the matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Pricing> findByPrice(
		int price) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrice(price);
	}

	/**
	* Returns a range of all the pricings where price = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param price the price
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @return the range of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Pricing> findByPrice(
		int price, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrice(price, start, end);
	}

	/**
	* Returns an ordered range of all the pricings where price = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param price the price
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Pricing> findByPrice(
		int price, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrice(price, start, end, orderByComparator);
	}

	/**
	* Returns the first pricing in the ordered set where price = &#63;.
	*
	* @param price the price
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pricing
	* @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing findByPrice_First(int price,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException {
		return getPersistence().findByPrice_First(price, orderByComparator);
	}

	/**
	* Returns the first pricing in the ordered set where price = &#63;.
	*
	* @param price the price
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pricing, or <code>null</code> if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing fetchByPrice_First(int price,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrice_First(price, orderByComparator);
	}

	/**
	* Returns the last pricing in the ordered set where price = &#63;.
	*
	* @param price the price
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pricing
	* @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing findByPrice_Last(int price,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException {
		return getPersistence().findByPrice_Last(price, orderByComparator);
	}

	/**
	* Returns the last pricing in the ordered set where price = &#63;.
	*
	* @param price the price
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pricing, or <code>null</code> if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing fetchByPrice_Last(int price,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrice_Last(price, orderByComparator);
	}

	/**
	* Returns the pricings before and after the current pricing in the ordered set where price = &#63;.
	*
	* @param pricingId the primary key of the current pricing
	* @param price the price
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next pricing
	* @throws com.ocms.course.NoSuchPricingException if a pricing with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing[] findByPrice_PrevAndNext(
		long pricingId, int price,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException {
		return getPersistence()
				   .findByPrice_PrevAndNext(pricingId, price, orderByComparator);
	}

	/**
	* Removes all the pricings where price = &#63; from the database.
	*
	* @param price the price
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPrice(int price)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPrice(price);
	}

	/**
	* Returns the number of pricings where price = &#63;.
	*
	* @param price the price
	* @return the number of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPrice(int price)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPrice(price);
	}

	/**
	* Caches the pricing in the entity cache if it is enabled.
	*
	* @param pricing the pricing
	*/
	public static void cacheResult(com.ocms.course.model.Pricing pricing) {
		getPersistence().cacheResult(pricing);
	}

	/**
	* Caches the pricings in the entity cache if it is enabled.
	*
	* @param pricings the pricings
	*/
	public static void cacheResult(
		java.util.List<com.ocms.course.model.Pricing> pricings) {
		getPersistence().cacheResult(pricings);
	}

	/**
	* Creates a new pricing with the primary key. Does not add the pricing to the database.
	*
	* @param pricingId the primary key for the new pricing
	* @return the new pricing
	*/
	public static com.ocms.course.model.Pricing create(long pricingId) {
		return getPersistence().create(pricingId);
	}

	/**
	* Removes the pricing with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param pricingId the primary key of the pricing
	* @return the pricing that was removed
	* @throws com.ocms.course.NoSuchPricingException if a pricing with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing remove(long pricingId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException {
		return getPersistence().remove(pricingId);
	}

	public static com.ocms.course.model.Pricing updateImpl(
		com.ocms.course.model.Pricing pricing)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(pricing);
	}

	/**
	* Returns the pricing with the primary key or throws a {@link com.ocms.course.NoSuchPricingException} if it could not be found.
	*
	* @param pricingId the primary key of the pricing
	* @return the pricing
	* @throws com.ocms.course.NoSuchPricingException if a pricing with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing findByPrimaryKey(long pricingId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException {
		return getPersistence().findByPrimaryKey(pricingId);
	}

	/**
	* Returns the pricing with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param pricingId the primary key of the pricing
	* @return the pricing, or <code>null</code> if a pricing with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing fetchByPrimaryKey(
		long pricingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(pricingId);
	}

	/**
	* Returns all the pricings.
	*
	* @return the pricings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Pricing> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the pricings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @return the range of pricings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Pricing> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the pricings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of pricings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Pricing> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the pricings from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of pricings.
	*
	* @return the number of pricings
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PricingPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PricingPersistence)PortletBeanLocatorUtil.locate(com.ocms.course.service.ClpSerializer.getServletContextName(),
					PricingPersistence.class.getName());

			ReferenceRegistry.registerReference(PricingUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(PricingPersistence persistence) {
	}

	private static PricingPersistence _persistence;
}