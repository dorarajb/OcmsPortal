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

import com.ocms.course.model.OffersAndDeductions;

import java.util.List;

/**
 * The persistence utility for the offers and deductions service. This utility wraps {@link OffersAndDeductionsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author doraraj
 * @see OffersAndDeductionsPersistence
 * @see OffersAndDeductionsPersistenceImpl
 * @generated
 */
public class OffersAndDeductionsUtil {
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
	public static void clearCache(OffersAndDeductions offersAndDeductions) {
		getPersistence().clearCache(offersAndDeductions);
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
	public static List<OffersAndDeductions> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OffersAndDeductions> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OffersAndDeductions> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static OffersAndDeductions update(
		OffersAndDeductions offersAndDeductions) throws SystemException {
		return getPersistence().update(offersAndDeductions);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static OffersAndDeductions update(
		OffersAndDeductions offersAndDeductions, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(offersAndDeductions, serviceContext);
	}

	/**
	* Returns all the offers and deductionses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.OffersAndDeductions> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the offers and deductionses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of offers and deductionses
	* @param end the upper bound of the range of offers and deductionses (not inclusive)
	* @return the range of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.OffersAndDeductions> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the offers and deductionses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of offers and deductionses
	* @param end the upper bound of the range of offers and deductionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.OffersAndDeductions> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first offers and deductions in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first offers and deductions in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last offers and deductions in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last offers and deductions in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the offers and deductionses before and after the current offers and deductions in the ordered set where groupId = &#63;.
	*
	* @param id the primary key of the current offers and deductions
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a offers and deductions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions[] findByGroupId_PrevAndNext(
		long id, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(id, groupId, orderByComparator);
	}

	/**
	* Removes all the offers and deductionses where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of offers and deductionses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the offers and deductionses where id = &#63;.
	*
	* @param id the ID
	* @return the matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.OffersAndDeductions> findById(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findById(id);
	}

	/**
	* Returns a range of all the offers and deductionses where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of offers and deductionses
	* @param end the upper bound of the range of offers and deductionses (not inclusive)
	* @return the range of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.OffersAndDeductions> findById(
		long id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findById(id, start, end);
	}

	/**
	* Returns an ordered range of all the offers and deductionses where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of offers and deductionses
	* @param end the upper bound of the range of offers and deductionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.OffersAndDeductions> findById(
		long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findById(id, start, end, orderByComparator);
	}

	/**
	* Returns the first offers and deductions in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions findById_First(
		long id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException {
		return getPersistence().findById_First(id, orderByComparator);
	}

	/**
	* Returns the first offers and deductions in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions fetchById_First(
		long id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchById_First(id, orderByComparator);
	}

	/**
	* Returns the last offers and deductions in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions findById_Last(
		long id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException {
		return getPersistence().findById_Last(id, orderByComparator);
	}

	/**
	* Returns the last offers and deductions in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions fetchById_Last(
		long id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchById_Last(id, orderByComparator);
	}

	/**
	* Removes all the offers and deductionses where id = &#63; from the database.
	*
	* @param id the ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeById(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeById(id);
	}

	/**
	* Returns the number of offers and deductionses where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static int countById(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countById(id);
	}

	/**
	* Returns all the offers and deductionses where code = &#63;.
	*
	* @param code the code
	* @return the matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.OffersAndDeductions> findByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCode(code);
	}

	/**
	* Returns a range of all the offers and deductionses where code = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param code the code
	* @param start the lower bound of the range of offers and deductionses
	* @param end the upper bound of the range of offers and deductionses (not inclusive)
	* @return the range of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.OffersAndDeductions> findByCode(
		java.lang.String code, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCode(code, start, end);
	}

	/**
	* Returns an ordered range of all the offers and deductionses where code = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param code the code
	* @param start the lower bound of the range of offers and deductionses
	* @param end the upper bound of the range of offers and deductionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.OffersAndDeductions> findByCode(
		java.lang.String code, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCode(code, start, end, orderByComparator);
	}

	/**
	* Returns the first offers and deductions in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions findByCode_First(
		java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException {
		return getPersistence().findByCode_First(code, orderByComparator);
	}

	/**
	* Returns the first offers and deductions in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions fetchByCode_First(
		java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCode_First(code, orderByComparator);
	}

	/**
	* Returns the last offers and deductions in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions findByCode_Last(
		java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException {
		return getPersistence().findByCode_Last(code, orderByComparator);
	}

	/**
	* Returns the last offers and deductions in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions fetchByCode_Last(
		java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCode_Last(code, orderByComparator);
	}

	/**
	* Returns the offers and deductionses before and after the current offers and deductions in the ordered set where code = &#63;.
	*
	* @param id the primary key of the current offers and deductions
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a offers and deductions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions[] findByCode_PrevAndNext(
		long id, java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException {
		return getPersistence()
				   .findByCode_PrevAndNext(id, code, orderByComparator);
	}

	/**
	* Removes all the offers and deductionses where code = &#63; from the database.
	*
	* @param code the code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCode(java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCode(code);
	}

	/**
	* Returns the number of offers and deductionses where code = &#63;.
	*
	* @param code the code
	* @return the number of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCode(java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCode(code);
	}

	/**
	* Returns all the offers and deductionses where active = &#63;.
	*
	* @param active the active
	* @return the matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.OffersAndDeductions> findByActive(
		int active) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByActive(active);
	}

	/**
	* Returns a range of all the offers and deductionses where active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param active the active
	* @param start the lower bound of the range of offers and deductionses
	* @param end the upper bound of the range of offers and deductionses (not inclusive)
	* @return the range of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.OffersAndDeductions> findByActive(
		int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByActive(active, start, end);
	}

	/**
	* Returns an ordered range of all the offers and deductionses where active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param active the active
	* @param start the lower bound of the range of offers and deductionses
	* @param end the upper bound of the range of offers and deductionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.OffersAndDeductions> findByActive(
		int active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByActive(active, start, end, orderByComparator);
	}

	/**
	* Returns the first offers and deductions in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions findByActive_First(
		int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException {
		return getPersistence().findByActive_First(active, orderByComparator);
	}

	/**
	* Returns the first offers and deductions in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions fetchByActive_First(
		int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByActive_First(active, orderByComparator);
	}

	/**
	* Returns the last offers and deductions in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions findByActive_Last(
		int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException {
		return getPersistence().findByActive_Last(active, orderByComparator);
	}

	/**
	* Returns the last offers and deductions in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions fetchByActive_Last(
		int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByActive_Last(active, orderByComparator);
	}

	/**
	* Returns the offers and deductionses before and after the current offers and deductions in the ordered set where active = &#63;.
	*
	* @param id the primary key of the current offers and deductions
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a offers and deductions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions[] findByActive_PrevAndNext(
		long id, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException {
		return getPersistence()
				   .findByActive_PrevAndNext(id, active, orderByComparator);
	}

	/**
	* Removes all the offers and deductionses where active = &#63; from the database.
	*
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByActive(int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByActive(active);
	}

	/**
	* Returns the number of offers and deductionses where active = &#63;.
	*
	* @param active the active
	* @return the number of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByActive(int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByActive(active);
	}

	/**
	* Returns all the offers and deductionses where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @return the matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.OffersAndDeductions> findByGroupIdAndActive(
		long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupIdAndActive(groupId, active);
	}

	/**
	* Returns a range of all the offers and deductionses where groupId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param active the active
	* @param start the lower bound of the range of offers and deductionses
	* @param end the upper bound of the range of offers and deductionses (not inclusive)
	* @return the range of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.OffersAndDeductions> findByGroupIdAndActive(
		long groupId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupIdAndActive(groupId, active, start, end);
	}

	/**
	* Returns an ordered range of all the offers and deductionses where groupId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param active the active
	* @param start the lower bound of the range of offers and deductionses
	* @param end the upper bound of the range of offers and deductionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.OffersAndDeductions> findByGroupIdAndActive(
		long groupId, int active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupIdAndActive(groupId, active, start, end,
			orderByComparator);
	}

	/**
	* Returns the first offers and deductions in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions findByGroupIdAndActive_First(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException {
		return getPersistence()
				   .findByGroupIdAndActive_First(groupId, active,
			orderByComparator);
	}

	/**
	* Returns the first offers and deductions in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions fetchByGroupIdAndActive_First(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroupIdAndActive_First(groupId, active,
			orderByComparator);
	}

	/**
	* Returns the last offers and deductions in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions findByGroupIdAndActive_Last(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException {
		return getPersistence()
				   .findByGroupIdAndActive_Last(groupId, active,
			orderByComparator);
	}

	/**
	* Returns the last offers and deductions in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions fetchByGroupIdAndActive_Last(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroupIdAndActive_Last(groupId, active,
			orderByComparator);
	}

	/**
	* Returns the offers and deductionses before and after the current offers and deductions in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param id the primary key of the current offers and deductions
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a offers and deductions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions[] findByGroupIdAndActive_PrevAndNext(
		long id, long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException {
		return getPersistence()
				   .findByGroupIdAndActive_PrevAndNext(id, groupId, active,
			orderByComparator);
	}

	/**
	* Removes all the offers and deductionses where groupId = &#63; and active = &#63; from the database.
	*
	* @param groupId the group ID
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupIdAndActive(long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupIdAndActive(groupId, active);
	}

	/**
	* Returns the number of offers and deductionses where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @return the number of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupIdAndActive(long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupIdAndActive(groupId, active);
	}

	/**
	* Returns all the offers and deductionses where code = &#63; and active = &#63;.
	*
	* @param code the code
	* @param active the active
	* @return the matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.OffersAndDeductions> findByCodeAndActive(
		java.lang.String code, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCodeAndActive(code, active);
	}

	/**
	* Returns a range of all the offers and deductionses where code = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param code the code
	* @param active the active
	* @param start the lower bound of the range of offers and deductionses
	* @param end the upper bound of the range of offers and deductionses (not inclusive)
	* @return the range of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.OffersAndDeductions> findByCodeAndActive(
		java.lang.String code, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCodeAndActive(code, active, start, end);
	}

	/**
	* Returns an ordered range of all the offers and deductionses where code = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param code the code
	* @param active the active
	* @param start the lower bound of the range of offers and deductionses
	* @param end the upper bound of the range of offers and deductionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.OffersAndDeductions> findByCodeAndActive(
		java.lang.String code, int active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCodeAndActive(code, active, start, end,
			orderByComparator);
	}

	/**
	* Returns the first offers and deductions in the ordered set where code = &#63; and active = &#63;.
	*
	* @param code the code
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions findByCodeAndActive_First(
		java.lang.String code, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException {
		return getPersistence()
				   .findByCodeAndActive_First(code, active, orderByComparator);
	}

	/**
	* Returns the first offers and deductions in the ordered set where code = &#63; and active = &#63;.
	*
	* @param code the code
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions fetchByCodeAndActive_First(
		java.lang.String code, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCodeAndActive_First(code, active, orderByComparator);
	}

	/**
	* Returns the last offers and deductions in the ordered set where code = &#63; and active = &#63;.
	*
	* @param code the code
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions findByCodeAndActive_Last(
		java.lang.String code, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException {
		return getPersistence()
				   .findByCodeAndActive_Last(code, active, orderByComparator);
	}

	/**
	* Returns the last offers and deductions in the ordered set where code = &#63; and active = &#63;.
	*
	* @param code the code
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions fetchByCodeAndActive_Last(
		java.lang.String code, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCodeAndActive_Last(code, active, orderByComparator);
	}

	/**
	* Returns the offers and deductionses before and after the current offers and deductions in the ordered set where code = &#63; and active = &#63;.
	*
	* @param id the primary key of the current offers and deductions
	* @param code the code
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a offers and deductions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions[] findByCodeAndActive_PrevAndNext(
		long id, java.lang.String code, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException {
		return getPersistence()
				   .findByCodeAndActive_PrevAndNext(id, code, active,
			orderByComparator);
	}

	/**
	* Removes all the offers and deductionses where code = &#63; and active = &#63; from the database.
	*
	* @param code the code
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCodeAndActive(java.lang.String code, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCodeAndActive(code, active);
	}

	/**
	* Returns the number of offers and deductionses where code = &#63; and active = &#63;.
	*
	* @param code the code
	* @param active the active
	* @return the number of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCodeAndActive(java.lang.String code, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCodeAndActive(code, active);
	}

	/**
	* Returns all the offers and deductionses where type = &#63;.
	*
	* @param type the type
	* @return the matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.OffersAndDeductions> findByType(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByType(type);
	}

	/**
	* Returns a range of all the offers and deductionses where type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param type the type
	* @param start the lower bound of the range of offers and deductionses
	* @param end the upper bound of the range of offers and deductionses (not inclusive)
	* @return the range of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.OffersAndDeductions> findByType(
		java.lang.String type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByType(type, start, end);
	}

	/**
	* Returns an ordered range of all the offers and deductionses where type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param type the type
	* @param start the lower bound of the range of offers and deductionses
	* @param end the upper bound of the range of offers and deductionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.OffersAndDeductions> findByType(
		java.lang.String type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByType(type, start, end, orderByComparator);
	}

	/**
	* Returns the first offers and deductions in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions findByType_First(
		java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException {
		return getPersistence().findByType_First(type, orderByComparator);
	}

	/**
	* Returns the first offers and deductions in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions fetchByType_First(
		java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByType_First(type, orderByComparator);
	}

	/**
	* Returns the last offers and deductions in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions findByType_Last(
		java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException {
		return getPersistence().findByType_Last(type, orderByComparator);
	}

	/**
	* Returns the last offers and deductions in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions fetchByType_Last(
		java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByType_Last(type, orderByComparator);
	}

	/**
	* Returns the offers and deductionses before and after the current offers and deductions in the ordered set where type = &#63;.
	*
	* @param id the primary key of the current offers and deductions
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a offers and deductions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions[] findByType_PrevAndNext(
		long id, java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException {
		return getPersistence()
				   .findByType_PrevAndNext(id, type, orderByComparator);
	}

	/**
	* Removes all the offers and deductionses where type = &#63; from the database.
	*
	* @param type the type
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByType(java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByType(type);
	}

	/**
	* Returns the number of offers and deductionses where type = &#63;.
	*
	* @param type the type
	* @return the number of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByType(java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByType(type);
	}

	/**
	* Returns all the offers and deductionses where groupId = &#63; and type = &#63; and id = &#63;.
	*
	* @param groupId the group ID
	* @param type the type
	* @param id the ID
	* @return the matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.OffersAndDeductions> findByGroupIdTypeActive(
		long groupId, java.lang.String type, long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupIdTypeActive(groupId, type, id);
	}

	/**
	* Returns a range of all the offers and deductionses where groupId = &#63; and type = &#63; and id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param type the type
	* @param id the ID
	* @param start the lower bound of the range of offers and deductionses
	* @param end the upper bound of the range of offers and deductionses (not inclusive)
	* @return the range of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.OffersAndDeductions> findByGroupIdTypeActive(
		long groupId, java.lang.String type, long id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupIdTypeActive(groupId, type, id, start, end);
	}

	/**
	* Returns an ordered range of all the offers and deductionses where groupId = &#63; and type = &#63; and id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param type the type
	* @param id the ID
	* @param start the lower bound of the range of offers and deductionses
	* @param end the upper bound of the range of offers and deductionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.OffersAndDeductions> findByGroupIdTypeActive(
		long groupId, java.lang.String type, long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupIdTypeActive(groupId, type, id, start, end,
			orderByComparator);
	}

	/**
	* Returns the first offers and deductions in the ordered set where groupId = &#63; and type = &#63; and id = &#63;.
	*
	* @param groupId the group ID
	* @param type the type
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions findByGroupIdTypeActive_First(
		long groupId, java.lang.String type, long id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException {
		return getPersistence()
				   .findByGroupIdTypeActive_First(groupId, type, id,
			orderByComparator);
	}

	/**
	* Returns the first offers and deductions in the ordered set where groupId = &#63; and type = &#63; and id = &#63;.
	*
	* @param groupId the group ID
	* @param type the type
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions fetchByGroupIdTypeActive_First(
		long groupId, java.lang.String type, long id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroupIdTypeActive_First(groupId, type, id,
			orderByComparator);
	}

	/**
	* Returns the last offers and deductions in the ordered set where groupId = &#63; and type = &#63; and id = &#63;.
	*
	* @param groupId the group ID
	* @param type the type
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions findByGroupIdTypeActive_Last(
		long groupId, java.lang.String type, long id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException {
		return getPersistence()
				   .findByGroupIdTypeActive_Last(groupId, type, id,
			orderByComparator);
	}

	/**
	* Returns the last offers and deductions in the ordered set where groupId = &#63; and type = &#63; and id = &#63;.
	*
	* @param groupId the group ID
	* @param type the type
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions fetchByGroupIdTypeActive_Last(
		long groupId, java.lang.String type, long id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroupIdTypeActive_Last(groupId, type, id,
			orderByComparator);
	}

	/**
	* Removes all the offers and deductionses where groupId = &#63; and type = &#63; and id = &#63; from the database.
	*
	* @param groupId the group ID
	* @param type the type
	* @param id the ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupIdTypeActive(long groupId,
		java.lang.String type, long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupIdTypeActive(groupId, type, id);
	}

	/**
	* Returns the number of offers and deductionses where groupId = &#63; and type = &#63; and id = &#63;.
	*
	* @param groupId the group ID
	* @param type the type
	* @param id the ID
	* @return the number of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupIdTypeActive(long groupId,
		java.lang.String type, long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupIdTypeActive(groupId, type, id);
	}

	/**
	* Returns all the offers and deductionses where id = &#63; and active = &#63;.
	*
	* @param id the ID
	* @param active the active
	* @return the matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.OffersAndDeductions> findByIdAndActive(
		long id, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByIdAndActive(id, active);
	}

	/**
	* Returns a range of all the offers and deductionses where id = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param active the active
	* @param start the lower bound of the range of offers and deductionses
	* @param end the upper bound of the range of offers and deductionses (not inclusive)
	* @return the range of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.OffersAndDeductions> findByIdAndActive(
		long id, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByIdAndActive(id, active, start, end);
	}

	/**
	* Returns an ordered range of all the offers and deductionses where id = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param active the active
	* @param start the lower bound of the range of offers and deductionses
	* @param end the upper bound of the range of offers and deductionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.OffersAndDeductions> findByIdAndActive(
		long id, int active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByIdAndActive(id, active, start, end, orderByComparator);
	}

	/**
	* Returns the first offers and deductions in the ordered set where id = &#63; and active = &#63;.
	*
	* @param id the ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions findByIdAndActive_First(
		long id, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException {
		return getPersistence()
				   .findByIdAndActive_First(id, active, orderByComparator);
	}

	/**
	* Returns the first offers and deductions in the ordered set where id = &#63; and active = &#63;.
	*
	* @param id the ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions fetchByIdAndActive_First(
		long id, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByIdAndActive_First(id, active, orderByComparator);
	}

	/**
	* Returns the last offers and deductions in the ordered set where id = &#63; and active = &#63;.
	*
	* @param id the ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions findByIdAndActive_Last(
		long id, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException {
		return getPersistence()
				   .findByIdAndActive_Last(id, active, orderByComparator);
	}

	/**
	* Returns the last offers and deductions in the ordered set where id = &#63; and active = &#63;.
	*
	* @param id the ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions fetchByIdAndActive_Last(
		long id, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByIdAndActive_Last(id, active, orderByComparator);
	}

	/**
	* Removes all the offers and deductionses where id = &#63; and active = &#63; from the database.
	*
	* @param id the ID
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByIdAndActive(long id, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByIdAndActive(id, active);
	}

	/**
	* Returns the number of offers and deductionses where id = &#63; and active = &#63;.
	*
	* @param id the ID
	* @param active the active
	* @return the number of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByIdAndActive(long id, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByIdAndActive(id, active);
	}

	/**
	* Caches the offers and deductions in the entity cache if it is enabled.
	*
	* @param offersAndDeductions the offers and deductions
	*/
	public static void cacheResult(
		com.ocms.course.model.OffersAndDeductions offersAndDeductions) {
		getPersistence().cacheResult(offersAndDeductions);
	}

	/**
	* Caches the offers and deductionses in the entity cache if it is enabled.
	*
	* @param offersAndDeductionses the offers and deductionses
	*/
	public static void cacheResult(
		java.util.List<com.ocms.course.model.OffersAndDeductions> offersAndDeductionses) {
		getPersistence().cacheResult(offersAndDeductionses);
	}

	/**
	* Creates a new offers and deductions with the primary key. Does not add the offers and deductions to the database.
	*
	* @param id the primary key for the new offers and deductions
	* @return the new offers and deductions
	*/
	public static com.ocms.course.model.OffersAndDeductions create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the offers and deductions with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the offers and deductions
	* @return the offers and deductions that was removed
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a offers and deductions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException {
		return getPersistence().remove(id);
	}

	public static com.ocms.course.model.OffersAndDeductions updateImpl(
		com.ocms.course.model.OffersAndDeductions offersAndDeductions)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(offersAndDeductions);
	}

	/**
	* Returns the offers and deductions with the primary key or throws a {@link com.ocms.course.NoSuchOffersAndDeductionsException} if it could not be found.
	*
	* @param id the primary key of the offers and deductions
	* @return the offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a offers and deductions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the offers and deductions with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the offers and deductions
	* @return the offers and deductions, or <code>null</code> if a offers and deductions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.OffersAndDeductions fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the offers and deductionses.
	*
	* @return the offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.OffersAndDeductions> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the offers and deductionses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of offers and deductionses
	* @param end the upper bound of the range of offers and deductionses (not inclusive)
	* @return the range of offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.OffersAndDeductions> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the offers and deductionses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of offers and deductionses
	* @param end the upper bound of the range of offers and deductionses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.OffersAndDeductions> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the offers and deductionses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of offers and deductionses.
	*
	* @return the number of offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static OffersAndDeductionsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (OffersAndDeductionsPersistence)PortletBeanLocatorUtil.locate(com.ocms.course.service.ClpSerializer.getServletContextName(),
					OffersAndDeductionsPersistence.class.getName());

			ReferenceRegistry.registerReference(OffersAndDeductionsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(OffersAndDeductionsPersistence persistence) {
	}

	private static OffersAndDeductionsPersistence _persistence;
}