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

import com.ocms.course.model.OffersAndDeductions;

/**
 * The persistence interface for the offers and deductions service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author doraraj
 * @see OffersAndDeductionsPersistenceImpl
 * @see OffersAndDeductionsUtil
 * @generated
 */
public interface OffersAndDeductionsPersistence extends BasePersistence<OffersAndDeductions> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OffersAndDeductionsUtil} to access the offers and deductions persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the offers and deductionses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.OffersAndDeductions> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.OffersAndDeductions> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.OffersAndDeductions> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first offers and deductions in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.OffersAndDeductions findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException;

	/**
	* Returns the first offers and deductions in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.OffersAndDeductions fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last offers and deductions in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.OffersAndDeductions findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException;

	/**
	* Returns the last offers and deductions in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.OffersAndDeductions fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ocms.course.model.OffersAndDeductions[] findByGroupId_PrevAndNext(
		long id, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException;

	/**
	* Removes all the offers and deductionses where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of offers and deductionses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the offers and deductionses where id = &#63;.
	*
	* @param id the ID
	* @return the matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.OffersAndDeductions> findById(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.OffersAndDeductions> findById(
		long id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.OffersAndDeductions> findById(
		long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first offers and deductions in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.OffersAndDeductions findById_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException;

	/**
	* Returns the first offers and deductions in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.OffersAndDeductions fetchById_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last offers and deductions in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.OffersAndDeductions findById_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException;

	/**
	* Returns the last offers and deductions in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.OffersAndDeductions fetchById_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the offers and deductionses where id = &#63; from the database.
	*
	* @param id the ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeById(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of offers and deductionses where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public int countById(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the offers and deductionses where code = &#63;.
	*
	* @param code the code
	* @return the matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.OffersAndDeductions> findByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.OffersAndDeductions> findByCode(
		java.lang.String code, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.OffersAndDeductions> findByCode(
		java.lang.String code, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first offers and deductions in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.OffersAndDeductions findByCode_First(
		java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException;

	/**
	* Returns the first offers and deductions in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.OffersAndDeductions fetchByCode_First(
		java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last offers and deductions in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.OffersAndDeductions findByCode_Last(
		java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException;

	/**
	* Returns the last offers and deductions in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.OffersAndDeductions fetchByCode_Last(
		java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ocms.course.model.OffersAndDeductions[] findByCode_PrevAndNext(
		long id, java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException;

	/**
	* Removes all the offers and deductionses where code = &#63; from the database.
	*
	* @param code the code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCode(java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of offers and deductionses where code = &#63;.
	*
	* @param code the code
	* @return the number of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public int countByCode(java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the offers and deductionses where active = &#63;.
	*
	* @param active the active
	* @return the matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.OffersAndDeductions> findByActive(
		int active) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.OffersAndDeductions> findByActive(
		int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.OffersAndDeductions> findByActive(
		int active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first offers and deductions in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.OffersAndDeductions findByActive_First(
		int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException;

	/**
	* Returns the first offers and deductions in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.OffersAndDeductions fetchByActive_First(
		int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last offers and deductions in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.OffersAndDeductions findByActive_Last(
		int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException;

	/**
	* Returns the last offers and deductions in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.OffersAndDeductions fetchByActive_Last(
		int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ocms.course.model.OffersAndDeductions[] findByActive_PrevAndNext(
		long id, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException;

	/**
	* Removes all the offers and deductionses where active = &#63; from the database.
	*
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public void removeByActive(int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of offers and deductionses where active = &#63;.
	*
	* @param active the active
	* @return the number of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public int countByActive(int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the offers and deductionses where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @return the matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.OffersAndDeductions> findByGroupIdAndActive(
		long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.OffersAndDeductions> findByGroupIdAndActive(
		long groupId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.OffersAndDeductions> findByGroupIdAndActive(
		long groupId, int active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ocms.course.model.OffersAndDeductions findByGroupIdAndActive_First(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException;

	/**
	* Returns the first offers and deductions in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.OffersAndDeductions fetchByGroupIdAndActive_First(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ocms.course.model.OffersAndDeductions findByGroupIdAndActive_Last(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException;

	/**
	* Returns the last offers and deductions in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.OffersAndDeductions fetchByGroupIdAndActive_Last(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ocms.course.model.OffersAndDeductions[] findByGroupIdAndActive_PrevAndNext(
		long id, long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException;

	/**
	* Removes all the offers and deductionses where groupId = &#63; and active = &#63; from the database.
	*
	* @param groupId the group ID
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupIdAndActive(long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of offers and deductionses where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @return the number of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupIdAndActive(long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the offers and deductionses where code = &#63; and active = &#63;.
	*
	* @param code the code
	* @param active the active
	* @return the matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.OffersAndDeductions> findByCodeAndActive(
		java.lang.String code, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.OffersAndDeductions> findByCodeAndActive(
		java.lang.String code, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.OffersAndDeductions> findByCodeAndActive(
		java.lang.String code, int active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ocms.course.model.OffersAndDeductions findByCodeAndActive_First(
		java.lang.String code, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException;

	/**
	* Returns the first offers and deductions in the ordered set where code = &#63; and active = &#63;.
	*
	* @param code the code
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.OffersAndDeductions fetchByCodeAndActive_First(
		java.lang.String code, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ocms.course.model.OffersAndDeductions findByCodeAndActive_Last(
		java.lang.String code, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException;

	/**
	* Returns the last offers and deductions in the ordered set where code = &#63; and active = &#63;.
	*
	* @param code the code
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.OffersAndDeductions fetchByCodeAndActive_Last(
		java.lang.String code, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ocms.course.model.OffersAndDeductions[] findByCodeAndActive_PrevAndNext(
		long id, java.lang.String code, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException;

	/**
	* Removes all the offers and deductionses where code = &#63; and active = &#63; from the database.
	*
	* @param code the code
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCodeAndActive(java.lang.String code, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of offers and deductionses where code = &#63; and active = &#63;.
	*
	* @param code the code
	* @param active the active
	* @return the number of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public int countByCodeAndActive(java.lang.String code, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the offers and deductionses where type = &#63;.
	*
	* @param type the type
	* @return the matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.OffersAndDeductions> findByType(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.OffersAndDeductions> findByType(
		java.lang.String type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.OffersAndDeductions> findByType(
		java.lang.String type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first offers and deductions in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.OffersAndDeductions findByType_First(
		java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException;

	/**
	* Returns the first offers and deductions in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.OffersAndDeductions fetchByType_First(
		java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last offers and deductions in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.OffersAndDeductions findByType_Last(
		java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException;

	/**
	* Returns the last offers and deductions in the ordered set where type = &#63;.
	*
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.OffersAndDeductions fetchByType_Last(
		java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ocms.course.model.OffersAndDeductions[] findByType_PrevAndNext(
		long id, java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException;

	/**
	* Removes all the offers and deductionses where type = &#63; from the database.
	*
	* @param type the type
	* @throws SystemException if a system exception occurred
	*/
	public void removeByType(java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of offers and deductionses where type = &#63;.
	*
	* @param type the type
	* @return the number of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public int countByType(java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the offers and deductionses where groupId = &#63; and type = &#63; and id = &#63;.
	*
	* @param groupId the group ID
	* @param type the type
	* @param id the ID
	* @return the matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.OffersAndDeductions> findByGroupIdTypeActive(
		long groupId, java.lang.String type, long id)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.OffersAndDeductions> findByGroupIdTypeActive(
		long groupId, java.lang.String type, long id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.OffersAndDeductions> findByGroupIdTypeActive(
		long groupId, java.lang.String type, long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ocms.course.model.OffersAndDeductions findByGroupIdTypeActive_First(
		long groupId, java.lang.String type, long id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException;

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
	public com.ocms.course.model.OffersAndDeductions fetchByGroupIdTypeActive_First(
		long groupId, java.lang.String type, long id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ocms.course.model.OffersAndDeductions findByGroupIdTypeActive_Last(
		long groupId, java.lang.String type, long id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException;

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
	public com.ocms.course.model.OffersAndDeductions fetchByGroupIdTypeActive_Last(
		long groupId, java.lang.String type, long id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the offers and deductionses where groupId = &#63; and type = &#63; and id = &#63; from the database.
	*
	* @param groupId the group ID
	* @param type the type
	* @param id the ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupIdTypeActive(long groupId, java.lang.String type,
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of offers and deductionses where groupId = &#63; and type = &#63; and id = &#63;.
	*
	* @param groupId the group ID
	* @param type the type
	* @param id the ID
	* @return the number of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupIdTypeActive(long groupId, java.lang.String type,
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the offers and deductionses where id = &#63; and active = &#63;.
	*
	* @param id the ID
	* @param active the active
	* @return the matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.OffersAndDeductions> findByIdAndActive(
		long id, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.OffersAndDeductions> findByIdAndActive(
		long id, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.OffersAndDeductions> findByIdAndActive(
		long id, int active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ocms.course.model.OffersAndDeductions findByIdAndActive_First(
		long id, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException;

	/**
	* Returns the first offers and deductions in the ordered set where id = &#63; and active = &#63;.
	*
	* @param id the ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.OffersAndDeductions fetchByIdAndActive_First(
		long id, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ocms.course.model.OffersAndDeductions findByIdAndActive_Last(
		long id, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException;

	/**
	* Returns the last offers and deductions in the ordered set where id = &#63; and active = &#63;.
	*
	* @param id the ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.OffersAndDeductions fetchByIdAndActive_Last(
		long id, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the offers and deductionses where id = &#63; and active = &#63; from the database.
	*
	* @param id the ID
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public void removeByIdAndActive(long id, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of offers and deductionses where id = &#63; and active = &#63;.
	*
	* @param id the ID
	* @param active the active
	* @return the number of matching offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public int countByIdAndActive(long id, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the offers and deductions in the entity cache if it is enabled.
	*
	* @param offersAndDeductions the offers and deductions
	*/
	public void cacheResult(
		com.ocms.course.model.OffersAndDeductions offersAndDeductions);

	/**
	* Caches the offers and deductionses in the entity cache if it is enabled.
	*
	* @param offersAndDeductionses the offers and deductionses
	*/
	public void cacheResult(
		java.util.List<com.ocms.course.model.OffersAndDeductions> offersAndDeductionses);

	/**
	* Creates a new offers and deductions with the primary key. Does not add the offers and deductions to the database.
	*
	* @param id the primary key for the new offers and deductions
	* @return the new offers and deductions
	*/
	public com.ocms.course.model.OffersAndDeductions create(long id);

	/**
	* Removes the offers and deductions with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the offers and deductions
	* @return the offers and deductions that was removed
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a offers and deductions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.OffersAndDeductions remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException;

	public com.ocms.course.model.OffersAndDeductions updateImpl(
		com.ocms.course.model.OffersAndDeductions offersAndDeductions)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the offers and deductions with the primary key or throws a {@link com.ocms.course.NoSuchOffersAndDeductionsException} if it could not be found.
	*
	* @param id the primary key of the offers and deductions
	* @return the offers and deductions
	* @throws com.ocms.course.NoSuchOffersAndDeductionsException if a offers and deductions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.OffersAndDeductions findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchOffersAndDeductionsException;

	/**
	* Returns the offers and deductions with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the offers and deductions
	* @return the offers and deductions, or <code>null</code> if a offers and deductions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.OffersAndDeductions fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the offers and deductionses.
	*
	* @return the offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.OffersAndDeductions> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.OffersAndDeductions> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.OffersAndDeductions> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the offers and deductionses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of offers and deductionses.
	*
	* @return the number of offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}