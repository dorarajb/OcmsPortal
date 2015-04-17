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

import com.liferay.portal.service.persistence.BasePersistence;

import com.ocms.course.model.Discount;

/**
 * The persistence interface for the discount service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author doraraj
 * @see DiscountPersistenceImpl
 * @see DiscountUtil
 * @generated
 */
public interface DiscountPersistence extends BasePersistence<Discount> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DiscountUtil} to access the discount persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the discounts where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Discount> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.Discount> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.Discount> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first discount in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching discount
	* @throws com.ocms.course.NoSuchDiscountException if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Discount findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException;

	/**
	* Returns the first discount in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching discount, or <code>null</code> if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Discount fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last discount in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching discount
	* @throws com.ocms.course.NoSuchDiscountException if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Discount findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException;

	/**
	* Returns the last discount in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching discount, or <code>null</code> if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Discount fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ocms.course.model.Discount[] findByGroupId_PrevAndNext(long id,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException;

	/**
	* Removes all the discounts where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of discounts where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the discounts where id = &#63;.
	*
	* @param id the ID
	* @return the matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Discount> findById(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.Discount> findById(long id,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.Discount> findById(long id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first discount in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching discount
	* @throws com.ocms.course.NoSuchDiscountException if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Discount findById_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException;

	/**
	* Returns the first discount in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching discount, or <code>null</code> if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Discount fetchById_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last discount in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching discount
	* @throws com.ocms.course.NoSuchDiscountException if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Discount findById_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException;

	/**
	* Returns the last discount in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching discount, or <code>null</code> if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Discount fetchById_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the discounts where id = &#63; from the database.
	*
	* @param id the ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeById(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of discounts where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public int countById(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the discounts where code = &#63;.
	*
	* @param code the code
	* @return the matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Discount> findByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.Discount> findByCode(
		java.lang.String code, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.Discount> findByCode(
		java.lang.String code, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first discount in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching discount
	* @throws com.ocms.course.NoSuchDiscountException if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Discount findByCode_First(
		java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException;

	/**
	* Returns the first discount in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching discount, or <code>null</code> if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Discount fetchByCode_First(
		java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last discount in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching discount
	* @throws com.ocms.course.NoSuchDiscountException if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Discount findByCode_Last(
		java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException;

	/**
	* Returns the last discount in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching discount, or <code>null</code> if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Discount fetchByCode_Last(
		java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ocms.course.model.Discount[] findByCode_PrevAndNext(long id,
		java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException;

	/**
	* Removes all the discounts where code = &#63; from the database.
	*
	* @param code the code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCode(java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of discounts where code = &#63;.
	*
	* @param code the code
	* @return the number of matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public int countByCode(java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the discounts where active = &#63;.
	*
	* @param active the active
	* @return the matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Discount> findByActive(
		int active) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.Discount> findByActive(
		int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.Discount> findByActive(
		int active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first discount in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching discount
	* @throws com.ocms.course.NoSuchDiscountException if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Discount findByActive_First(int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException;

	/**
	* Returns the first discount in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching discount, or <code>null</code> if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Discount fetchByActive_First(int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last discount in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching discount
	* @throws com.ocms.course.NoSuchDiscountException if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Discount findByActive_Last(int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException;

	/**
	* Returns the last discount in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching discount, or <code>null</code> if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Discount fetchByActive_Last(int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ocms.course.model.Discount[] findByActive_PrevAndNext(long id,
		int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException;

	/**
	* Removes all the discounts where active = &#63; from the database.
	*
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public void removeByActive(int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of discounts where active = &#63;.
	*
	* @param active the active
	* @return the number of matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public int countByActive(int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the discounts where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @return the matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Discount> findByGroupIdAndActive(
		long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.Discount> findByGroupIdAndActive(
		long groupId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.Discount> findByGroupIdAndActive(
		long groupId, int active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ocms.course.model.Discount findByGroupIdAndActive_First(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException;

	/**
	* Returns the first discount in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching discount, or <code>null</code> if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Discount fetchByGroupIdAndActive_First(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ocms.course.model.Discount findByGroupIdAndActive_Last(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException;

	/**
	* Returns the last discount in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching discount, or <code>null</code> if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Discount fetchByGroupIdAndActive_Last(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ocms.course.model.Discount[] findByGroupIdAndActive_PrevAndNext(
		long id, long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException;

	/**
	* Removes all the discounts where groupId = &#63; and active = &#63; from the database.
	*
	* @param groupId the group ID
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupIdAndActive(long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of discounts where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @return the number of matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupIdAndActive(long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the discounts where id = &#63; and active = &#63;.
	*
	* @param id the ID
	* @param active the active
	* @return the matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Discount> findByIdAndActive(
		long id, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.Discount> findByIdAndActive(
		long id, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.Discount> findByIdAndActive(
		long id, int active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ocms.course.model.Discount findByIdAndActive_First(long id,
		int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException;

	/**
	* Returns the first discount in the ordered set where id = &#63; and active = &#63;.
	*
	* @param id the ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching discount, or <code>null</code> if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Discount fetchByIdAndActive_First(long id,
		int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ocms.course.model.Discount findByIdAndActive_Last(long id,
		int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException;

	/**
	* Returns the last discount in the ordered set where id = &#63; and active = &#63;.
	*
	* @param id the ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching discount, or <code>null</code> if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Discount fetchByIdAndActive_Last(long id,
		int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the discounts where id = &#63; and active = &#63; from the database.
	*
	* @param id the ID
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public void removeByIdAndActive(long id, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of discounts where id = &#63; and active = &#63;.
	*
	* @param id the ID
	* @param active the active
	* @return the number of matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public int countByIdAndActive(long id, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the discounts where code = &#63; and active = &#63;.
	*
	* @param code the code
	* @param active the active
	* @return the matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Discount> findByCodeAndActive(
		java.lang.String code, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.Discount> findByCodeAndActive(
		java.lang.String code, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.Discount> findByCodeAndActive(
		java.lang.String code, int active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ocms.course.model.Discount findByCodeAndActive_First(
		java.lang.String code, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException;

	/**
	* Returns the first discount in the ordered set where code = &#63; and active = &#63;.
	*
	* @param code the code
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching discount, or <code>null</code> if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Discount fetchByCodeAndActive_First(
		java.lang.String code, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ocms.course.model.Discount findByCodeAndActive_Last(
		java.lang.String code, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException;

	/**
	* Returns the last discount in the ordered set where code = &#63; and active = &#63;.
	*
	* @param code the code
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching discount, or <code>null</code> if a matching discount could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Discount fetchByCodeAndActive_Last(
		java.lang.String code, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ocms.course.model.Discount[] findByCodeAndActive_PrevAndNext(
		long id, java.lang.String code, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException;

	/**
	* Removes all the discounts where code = &#63; and active = &#63; from the database.
	*
	* @param code the code
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCodeAndActive(java.lang.String code, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of discounts where code = &#63; and active = &#63;.
	*
	* @param code the code
	* @param active the active
	* @return the number of matching discounts
	* @throws SystemException if a system exception occurred
	*/
	public int countByCodeAndActive(java.lang.String code, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the discount in the entity cache if it is enabled.
	*
	* @param discount the discount
	*/
	public void cacheResult(com.ocms.course.model.Discount discount);

	/**
	* Caches the discounts in the entity cache if it is enabled.
	*
	* @param discounts the discounts
	*/
	public void cacheResult(
		java.util.List<com.ocms.course.model.Discount> discounts);

	/**
	* Creates a new discount with the primary key. Does not add the discount to the database.
	*
	* @param id the primary key for the new discount
	* @return the new discount
	*/
	public com.ocms.course.model.Discount create(long id);

	/**
	* Removes the discount with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the discount
	* @return the discount that was removed
	* @throws com.ocms.course.NoSuchDiscountException if a discount with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Discount remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException;

	public com.ocms.course.model.Discount updateImpl(
		com.ocms.course.model.Discount discount)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the discount with the primary key or throws a {@link com.ocms.course.NoSuchDiscountException} if it could not be found.
	*
	* @param id the primary key of the discount
	* @return the discount
	* @throws com.ocms.course.NoSuchDiscountException if a discount with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Discount findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchDiscountException;

	/**
	* Returns the discount with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the discount
	* @return the discount, or <code>null</code> if a discount with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Discount fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the discounts.
	*
	* @return the discounts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Discount> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.Discount> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.Discount> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the discounts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of discounts.
	*
	* @return the number of discounts
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}