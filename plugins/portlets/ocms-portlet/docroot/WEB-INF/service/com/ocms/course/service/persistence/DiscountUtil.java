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

import com.ocms.course.model.Discount;

import java.util.List;

/**
 * The persistence utility for the discount service. This utility wraps {@link DiscountPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author doraraj
 * @see DiscountPersistence
 * @see DiscountPersistenceImpl
 * @generated
 */
public class DiscountUtil {
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
	public static void clearCache(Discount discount) {
		getPersistence().clearCache(discount);
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
	public static List<Discount> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Discount> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Discount> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Discount update(Discount discount) throws SystemException {
		return getPersistence().update(discount);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Discount update(Discount discount,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(discount, serviceContext);
	}

	/**
	* Returns all the discounts where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Discount> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the discounts where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.DiscountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of discounts
	* @param end the upper bound of the range of discounts (not inclusive)
	* @return the range of matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Discount> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the discounts where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.DiscountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of discounts
	* @param end the upper bound of the range of discounts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Discount> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first discount in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching discount
	* @throws com.ocms.course.NoSuchDiscountException if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first discount in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching discount, or <code>null</code> if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last discount in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching discount
	* @throws com.ocms.course.NoSuchDiscountException if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last discount in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching discount, or <code>null</code> if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the discounts before and after the current discount in the ordered set where groupId = &#63;.
	*
	* @param id the primary key of the current discount
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next discount
	* @throws com.ocms.course.NoSuchDiscountException if a discount with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount[] findByGroupId_PrevAndNext(
		long id, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(id, groupId, orderByComparator);
	}

	/**
	* Removes all the discounts where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of discounts where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the discounts where id = &#63;.
	*
	* @param id the ID
	* @return the matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Discount> findById(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findById(id);
	}

	/**
	* Returns a range of all the discounts where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.DiscountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of discounts
	* @param end the upper bound of the range of discounts (not inclusive)
	* @return the range of matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Discount> findById(
		long id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findById(id, start, end);
	}

	/**
	* Returns an ordered range of all the discounts where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.DiscountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of discounts
	* @param end the upper bound of the range of discounts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Discount> findById(
		long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findById(id, start, end, orderByComparator);
	}

	/**
	* Returns the first discount in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching discount
	* @throws com.ocms.course.NoSuchDiscountException if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount findById_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException {
		return getPersistence().findById_First(id, orderByComparator);
	}

	/**
	* Returns the first discount in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching discount, or <code>null</code> if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount fetchById_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchById_First(id, orderByComparator);
	}

	/**
	* Returns the last discount in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching discount
	* @throws com.ocms.course.NoSuchDiscountException if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount findById_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException {
		return getPersistence().findById_Last(id, orderByComparator);
	}

	/**
	* Returns the last discount in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching discount, or <code>null</code> if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount fetchById_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchById_Last(id, orderByComparator);
	}

	/**
	* Removes all the discounts where id = &#63; from the database.
	*
	* @param id the ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeById(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeById(id);
	}

	/**
	* Returns the number of discounts where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public static int countById(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countById(id);
	}

	/**
	* Returns all the discounts where code = &#63;.
	*
	* @param code the code
	* @return the matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Discount> findByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCode(code);
	}

	/**
	* Returns a range of all the discounts where code = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.DiscountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param code the code
	* @param start the lower bound of the range of discounts
	* @param end the upper bound of the range of discounts (not inclusive)
	* @return the range of matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Discount> findByCode(
		java.lang.String code, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCode(code, start, end);
	}

	/**
	* Returns an ordered range of all the discounts where code = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.DiscountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param code the code
	* @param start the lower bound of the range of discounts
	* @param end the upper bound of the range of discounts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Discount> findByCode(
		java.lang.String code, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCode(code, start, end, orderByComparator);
	}

	/**
	* Returns the first discount in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching discount
	* @throws com.ocms.course.NoSuchDiscountException if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount findByCode_First(
		java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException {
		return getPersistence().findByCode_First(code, orderByComparator);
	}

	/**
	* Returns the first discount in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching discount, or <code>null</code> if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount fetchByCode_First(
		java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCode_First(code, orderByComparator);
	}

	/**
	* Returns the last discount in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching discount
	* @throws com.ocms.course.NoSuchDiscountException if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount findByCode_Last(
		java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException {
		return getPersistence().findByCode_Last(code, orderByComparator);
	}

	/**
	* Returns the last discount in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching discount, or <code>null</code> if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount fetchByCode_Last(
		java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCode_Last(code, orderByComparator);
	}

	/**
	* Returns the discounts before and after the current discount in the ordered set where code = &#63;.
	*
	* @param id the primary key of the current discount
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next discount
	* @throws com.ocms.course.NoSuchDiscountException if a discount with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount[] findByCode_PrevAndNext(
		long id, java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException {
		return getPersistence()
				   .findByCode_PrevAndNext(id, code, orderByComparator);
	}

	/**
	* Removes all the discounts where code = &#63; from the database.
	*
	* @param code the code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCode(java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCode(code);
	}

	/**
	* Returns the number of discounts where code = &#63;.
	*
	* @param code the code
	* @return the number of matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCode(java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCode(code);
	}

	/**
	* Returns all the discounts where active = &#63;.
	*
	* @param active the active
	* @return the matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Discount> findByActive(
		int active) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByActive(active);
	}

	/**
	* Returns a range of all the discounts where active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.DiscountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param active the active
	* @param start the lower bound of the range of discounts
	* @param end the upper bound of the range of discounts (not inclusive)
	* @return the range of matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Discount> findByActive(
		int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByActive(active, start, end);
	}

	/**
	* Returns an ordered range of all the discounts where active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.DiscountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param active the active
	* @param start the lower bound of the range of discounts
	* @param end the upper bound of the range of discounts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Discount> findByActive(
		int active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByActive(active, start, end, orderByComparator);
	}

	/**
	* Returns the first discount in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching discount
	* @throws com.ocms.course.NoSuchDiscountException if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount findByActive_First(
		int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException {
		return getPersistence().findByActive_First(active, orderByComparator);
	}

	/**
	* Returns the first discount in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching discount, or <code>null</code> if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount fetchByActive_First(
		int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByActive_First(active, orderByComparator);
	}

	/**
	* Returns the last discount in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching discount
	* @throws com.ocms.course.NoSuchDiscountException if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount findByActive_Last(int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException {
		return getPersistence().findByActive_Last(active, orderByComparator);
	}

	/**
	* Returns the last discount in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching discount, or <code>null</code> if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount fetchByActive_Last(
		int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByActive_Last(active, orderByComparator);
	}

	/**
	* Returns the discounts before and after the current discount in the ordered set where active = &#63;.
	*
	* @param id the primary key of the current discount
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next discount
	* @throws com.ocms.course.NoSuchDiscountException if a discount with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount[] findByActive_PrevAndNext(
		long id, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException {
		return getPersistence()
				   .findByActive_PrevAndNext(id, active, orderByComparator);
	}

	/**
	* Removes all the discounts where active = &#63; from the database.
	*
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByActive(int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByActive(active);
	}

	/**
	* Returns the number of discounts where active = &#63;.
	*
	* @param active the active
	* @return the number of matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public static int countByActive(int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByActive(active);
	}

	/**
	* Returns all the discounts where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @return the matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Discount> findByGroupIdAndActive(
		long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupIdAndActive(groupId, active);
	}

	/**
	* Returns a range of all the discounts where groupId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.DiscountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param active the active
	* @param start the lower bound of the range of discounts
	* @param end the upper bound of the range of discounts (not inclusive)
	* @return the range of matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Discount> findByGroupIdAndActive(
		long groupId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupIdAndActive(groupId, active, start, end);
	}

	/**
	* Returns an ordered range of all the discounts where groupId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.DiscountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param active the active
	* @param start the lower bound of the range of discounts
	* @param end the upper bound of the range of discounts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Discount> findByGroupIdAndActive(
		long groupId, int active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupIdAndActive(groupId, active, start, end,
			orderByComparator);
	}

	/**
	* Returns the first discount in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching discount
	* @throws com.ocms.course.NoSuchDiscountException if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount findByGroupIdAndActive_First(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException {
		return getPersistence()
				   .findByGroupIdAndActive_First(groupId, active,
			orderByComparator);
	}

	/**
	* Returns the first discount in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching discount, or <code>null</code> if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount fetchByGroupIdAndActive_First(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroupIdAndActive_First(groupId, active,
			orderByComparator);
	}

	/**
	* Returns the last discount in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching discount
	* @throws com.ocms.course.NoSuchDiscountException if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount findByGroupIdAndActive_Last(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException {
		return getPersistence()
				   .findByGroupIdAndActive_Last(groupId, active,
			orderByComparator);
	}

	/**
	* Returns the last discount in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching discount, or <code>null</code> if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount fetchByGroupIdAndActive_Last(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroupIdAndActive_Last(groupId, active,
			orderByComparator);
	}

	/**
	* Returns the discounts before and after the current discount in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param id the primary key of the current discount
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next discount
	* @throws com.ocms.course.NoSuchDiscountException if a discount with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount[] findByGroupIdAndActive_PrevAndNext(
		long id, long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException {
		return getPersistence()
				   .findByGroupIdAndActive_PrevAndNext(id, groupId, active,
			orderByComparator);
	}

	/**
	* Removes all the discounts where groupId = &#63; and active = &#63; from the database.
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
	* Returns the number of discounts where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @return the number of matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupIdAndActive(long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupIdAndActive(groupId, active);
	}

	/**
	* Returns all the discounts where id = &#63; and active = &#63;.
	*
	* @param id the ID
	* @param active the active
	* @return the matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Discount> findByIdAndActive(
		long id, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByIdAndActive(id, active);
	}

	/**
	* Returns a range of all the discounts where id = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.DiscountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param active the active
	* @param start the lower bound of the range of discounts
	* @param end the upper bound of the range of discounts (not inclusive)
	* @return the range of matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Discount> findByIdAndActive(
		long id, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByIdAndActive(id, active, start, end);
	}

	/**
	* Returns an ordered range of all the discounts where id = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.DiscountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param active the active
	* @param start the lower bound of the range of discounts
	* @param end the upper bound of the range of discounts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Discount> findByIdAndActive(
		long id, int active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByIdAndActive(id, active, start, end, orderByComparator);
	}

	/**
	* Returns the first discount in the ordered set where id = &#63; and active = &#63;.
	*
	* @param id the ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching discount
	* @throws com.ocms.course.NoSuchDiscountException if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount findByIdAndActive_First(
		long id, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException {
		return getPersistence()
				   .findByIdAndActive_First(id, active, orderByComparator);
	}

	/**
	* Returns the first discount in the ordered set where id = &#63; and active = &#63;.
	*
	* @param id the ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching discount, or <code>null</code> if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount fetchByIdAndActive_First(
		long id, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByIdAndActive_First(id, active, orderByComparator);
	}

	/**
	* Returns the last discount in the ordered set where id = &#63; and active = &#63;.
	*
	* @param id the ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching discount
	* @throws com.ocms.course.NoSuchDiscountException if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount findByIdAndActive_Last(
		long id, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException {
		return getPersistence()
				   .findByIdAndActive_Last(id, active, orderByComparator);
	}

	/**
	* Returns the last discount in the ordered set where id = &#63; and active = &#63;.
	*
	* @param id the ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching discount, or <code>null</code> if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount fetchByIdAndActive_Last(
		long id, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByIdAndActive_Last(id, active, orderByComparator);
	}

	/**
	* Removes all the discounts where id = &#63; and active = &#63; from the database.
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
	* Returns the number of discounts where id = &#63; and active = &#63;.
	*
	* @param id the ID
	* @param active the active
	* @return the number of matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public static int countByIdAndActive(long id, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByIdAndActive(id, active);
	}

	/**
	* Returns all the discounts where code = &#63; and active = &#63;.
	*
	* @param code the code
	* @param active the active
	* @return the matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Discount> findByCodeAndActive(
		java.lang.String code, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCodeAndActive(code, active);
	}

	/**
	* Returns a range of all the discounts where code = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.DiscountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param code the code
	* @param active the active
	* @param start the lower bound of the range of discounts
	* @param end the upper bound of the range of discounts (not inclusive)
	* @return the range of matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Discount> findByCodeAndActive(
		java.lang.String code, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCodeAndActive(code, active, start, end);
	}

	/**
	* Returns an ordered range of all the discounts where code = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.DiscountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param code the code
	* @param active the active
	* @param start the lower bound of the range of discounts
	* @param end the upper bound of the range of discounts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Discount> findByCodeAndActive(
		java.lang.String code, int active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCodeAndActive(code, active, start, end,
			orderByComparator);
	}

	/**
	* Returns the first discount in the ordered set where code = &#63; and active = &#63;.
	*
	* @param code the code
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching discount
	* @throws com.ocms.course.NoSuchDiscountException if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount findByCodeAndActive_First(
		java.lang.String code, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException {
		return getPersistence()
				   .findByCodeAndActive_First(code, active, orderByComparator);
	}

	/**
	* Returns the first discount in the ordered set where code = &#63; and active = &#63;.
	*
	* @param code the code
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching discount, or <code>null</code> if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount fetchByCodeAndActive_First(
		java.lang.String code, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCodeAndActive_First(code, active, orderByComparator);
	}

	/**
	* Returns the last discount in the ordered set where code = &#63; and active = &#63;.
	*
	* @param code the code
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching discount
	* @throws com.ocms.course.NoSuchDiscountException if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount findByCodeAndActive_Last(
		java.lang.String code, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException {
		return getPersistence()
				   .findByCodeAndActive_Last(code, active, orderByComparator);
	}

	/**
	* Returns the last discount in the ordered set where code = &#63; and active = &#63;.
	*
	* @param code the code
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching discount, or <code>null</code> if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount fetchByCodeAndActive_Last(
		java.lang.String code, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCodeAndActive_Last(code, active, orderByComparator);
	}

	/**
	* Returns the discounts before and after the current discount in the ordered set where code = &#63; and active = &#63;.
	*
	* @param id the primary key of the current discount
	* @param code the code
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next discount
	* @throws com.ocms.course.NoSuchDiscountException if a discount with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount[] findByCodeAndActive_PrevAndNext(
		long id, java.lang.String code, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException {
		return getPersistence()
				   .findByCodeAndActive_PrevAndNext(id, code, active,
			orderByComparator);
	}

	/**
	* Removes all the discounts where code = &#63; and active = &#63; from the database.
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
	* Returns the number of discounts where code = &#63; and active = &#63;.
	*
	* @param code the code
	* @param active the active
	* @return the number of matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCodeAndActive(java.lang.String code, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCodeAndActive(code, active);
	}

	/**
	* Caches the discount in the entity cache if it is enabled.
	*
	* @param discount the discount
	*/
	public static void cacheResult(com.ocms.course.model.Discount discount) {
		getPersistence().cacheResult(discount);
	}

	/**
	* Caches the discounts in the entity cache if it is enabled.
	*
	* @param discounts the discounts
	*/
	public static void cacheResult(
		java.util.List<com.ocms.course.model.Discount> discounts) {
		getPersistence().cacheResult(discounts);
	}

	/**
	* Creates a new discount with the primary key. Does not add the discount to the database.
	*
	* @param id the primary key for the new discount
	* @return the new discount
	*/
	public static com.ocms.course.model.Discount create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the discount with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the discount
	* @return the discount that was removed
	* @throws com.ocms.course.NoSuchDiscountException if a discount with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException {
		return getPersistence().remove(id);
	}

	public static com.ocms.course.model.Discount updateImpl(
		com.ocms.course.model.Discount discount)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(discount);
	}

	/**
	* Returns the discount with the primary key or throws a {@link com.ocms.course.NoSuchDiscountException} if it could not be found.
	*
	* @param id the primary key of the discount
	* @return the discount
	* @throws com.ocms.course.NoSuchDiscountException if a discount with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the discount with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the discount
	* @return the discount, or <code>null</code> if a discount with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the discounts.
	*
	* @return the discounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Discount> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the discounts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.DiscountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of discounts
	* @param end the upper bound of the range of discounts (not inclusive)
	* @return the range of discounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Discount> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the discounts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.DiscountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of discounts
	* @param end the upper bound of the range of discounts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of discounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Discount> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the discounts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of discounts.
	*
	* @return the number of discounts
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DiscountPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DiscountPersistence)PortletBeanLocatorUtil.locate(com.ocms.course.service.ClpSerializer.getServletContextName(),
					DiscountPersistence.class.getName());

			ReferenceRegistry.registerReference(DiscountUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DiscountPersistence persistence) {
	}

	private static DiscountPersistence _persistence;
}