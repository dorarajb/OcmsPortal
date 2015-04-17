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

import com.ocms.course.model.TaxDetails;

/**
 * The persistence interface for the tax details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author doraraj
 * @see TaxDetailsPersistenceImpl
 * @see TaxDetailsUtil
 * @generated
 */
public interface TaxDetailsPersistence extends BasePersistence<TaxDetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TaxDetailsUtil} to access the tax details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the tax detailses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxDetails> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tax detailses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of tax detailses
	* @param end the upper bound of the range of tax detailses (not inclusive)
	* @return the range of matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxDetails> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tax detailses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of tax detailses
	* @param end the upper bound of the range of tax detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxDetails> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tax details in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax details
	* @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException;

	/**
	* Returns the first tax details in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax details, or <code>null</code> if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tax details in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax details
	* @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException;

	/**
	* Returns the last tax details in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax details, or <code>null</code> if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tax detailses before and after the current tax details in the ordered set where groupId = &#63;.
	*
	* @param taxDetailsId the primary key of the current tax details
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tax details
	* @throws com.ocms.course.NoSuchTaxDetailsException if a tax details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails[] findByGroupId_PrevAndNext(
		long taxDetailsId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException;

	/**
	* Removes all the tax detailses where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tax detailses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tax detailses where taxDetailsId = &#63;.
	*
	* @param taxDetailsId the tax details ID
	* @return the matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxDetails> findByTaxDetailsId(
		long taxDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tax detailses where taxDetailsId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param taxDetailsId the tax details ID
	* @param start the lower bound of the range of tax detailses
	* @param end the upper bound of the range of tax detailses (not inclusive)
	* @return the range of matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxDetails> findByTaxDetailsId(
		long taxDetailsId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tax detailses where taxDetailsId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param taxDetailsId the tax details ID
	* @param start the lower bound of the range of tax detailses
	* @param end the upper bound of the range of tax detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxDetails> findByTaxDetailsId(
		long taxDetailsId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tax details in the ordered set where taxDetailsId = &#63;.
	*
	* @param taxDetailsId the tax details ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax details
	* @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails findByTaxDetailsId_First(
		long taxDetailsId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException;

	/**
	* Returns the first tax details in the ordered set where taxDetailsId = &#63;.
	*
	* @param taxDetailsId the tax details ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax details, or <code>null</code> if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails fetchByTaxDetailsId_First(
		long taxDetailsId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tax details in the ordered set where taxDetailsId = &#63;.
	*
	* @param taxDetailsId the tax details ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax details
	* @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails findByTaxDetailsId_Last(
		long taxDetailsId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException;

	/**
	* Returns the last tax details in the ordered set where taxDetailsId = &#63;.
	*
	* @param taxDetailsId the tax details ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax details, or <code>null</code> if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails fetchByTaxDetailsId_Last(
		long taxDetailsId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tax detailses where taxDetailsId = &#63; from the database.
	*
	* @param taxDetailsId the tax details ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTaxDetailsId(long taxDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tax detailses where taxDetailsId = &#63;.
	*
	* @param taxDetailsId the tax details ID
	* @return the number of matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public int countByTaxDetailsId(long taxDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tax detailses where taxTypeId = &#63;.
	*
	* @param taxTypeId the tax type ID
	* @return the matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxDetails> findByTaxTypeId(
		long taxTypeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tax detailses where taxTypeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param taxTypeId the tax type ID
	* @param start the lower bound of the range of tax detailses
	* @param end the upper bound of the range of tax detailses (not inclusive)
	* @return the range of matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxDetails> findByTaxTypeId(
		long taxTypeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tax detailses where taxTypeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param taxTypeId the tax type ID
	* @param start the lower bound of the range of tax detailses
	* @param end the upper bound of the range of tax detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxDetails> findByTaxTypeId(
		long taxTypeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tax details in the ordered set where taxTypeId = &#63;.
	*
	* @param taxTypeId the tax type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax details
	* @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails findByTaxTypeId_First(
		long taxTypeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException;

	/**
	* Returns the first tax details in the ordered set where taxTypeId = &#63;.
	*
	* @param taxTypeId the tax type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax details, or <code>null</code> if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails fetchByTaxTypeId_First(
		long taxTypeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tax details in the ordered set where taxTypeId = &#63;.
	*
	* @param taxTypeId the tax type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax details
	* @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails findByTaxTypeId_Last(
		long taxTypeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException;

	/**
	* Returns the last tax details in the ordered set where taxTypeId = &#63;.
	*
	* @param taxTypeId the tax type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax details, or <code>null</code> if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails fetchByTaxTypeId_Last(
		long taxTypeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tax detailses before and after the current tax details in the ordered set where taxTypeId = &#63;.
	*
	* @param taxDetailsId the primary key of the current tax details
	* @param taxTypeId the tax type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tax details
	* @throws com.ocms.course.NoSuchTaxDetailsException if a tax details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails[] findByTaxTypeId_PrevAndNext(
		long taxDetailsId, long taxTypeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException;

	/**
	* Removes all the tax detailses where taxTypeId = &#63; from the database.
	*
	* @param taxTypeId the tax type ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTaxTypeId(long taxTypeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tax detailses where taxTypeId = &#63;.
	*
	* @param taxTypeId the tax type ID
	* @return the number of matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public int countByTaxTypeId(long taxTypeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tax detailses where active = &#63;.
	*
	* @param active the active
	* @return the matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxDetails> findByActive(
		int active) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tax detailses where active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param active the active
	* @param start the lower bound of the range of tax detailses
	* @param end the upper bound of the range of tax detailses (not inclusive)
	* @return the range of matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxDetails> findByActive(
		int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tax detailses where active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param active the active
	* @param start the lower bound of the range of tax detailses
	* @param end the upper bound of the range of tax detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxDetails> findByActive(
		int active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tax details in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax details
	* @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails findByActive_First(int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException;

	/**
	* Returns the first tax details in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax details, or <code>null</code> if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails fetchByActive_First(int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tax details in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax details
	* @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails findByActive_Last(int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException;

	/**
	* Returns the last tax details in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax details, or <code>null</code> if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails fetchByActive_Last(int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tax detailses before and after the current tax details in the ordered set where active = &#63;.
	*
	* @param taxDetailsId the primary key of the current tax details
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tax details
	* @throws com.ocms.course.NoSuchTaxDetailsException if a tax details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails[] findByActive_PrevAndNext(
		long taxDetailsId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException;

	/**
	* Removes all the tax detailses where active = &#63; from the database.
	*
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public void removeByActive(int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tax detailses where active = &#63;.
	*
	* @param active the active
	* @return the number of matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public int countByActive(int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tax detailses where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @return the matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxDetails> findByGroupIdActive(
		long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tax detailses where groupId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param active the active
	* @param start the lower bound of the range of tax detailses
	* @param end the upper bound of the range of tax detailses (not inclusive)
	* @return the range of matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxDetails> findByGroupIdActive(
		long groupId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tax detailses where groupId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param active the active
	* @param start the lower bound of the range of tax detailses
	* @param end the upper bound of the range of tax detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxDetails> findByGroupIdActive(
		long groupId, int active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tax details in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax details
	* @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails findByGroupIdActive_First(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException;

	/**
	* Returns the first tax details in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax details, or <code>null</code> if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails fetchByGroupIdActive_First(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tax details in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax details
	* @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails findByGroupIdActive_Last(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException;

	/**
	* Returns the last tax details in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax details, or <code>null</code> if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails fetchByGroupIdActive_Last(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tax detailses before and after the current tax details in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param taxDetailsId the primary key of the current tax details
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tax details
	* @throws com.ocms.course.NoSuchTaxDetailsException if a tax details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails[] findByGroupIdActive_PrevAndNext(
		long taxDetailsId, long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException;

	/**
	* Removes all the tax detailses where groupId = &#63; and active = &#63; from the database.
	*
	* @param groupId the group ID
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupIdActive(long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tax detailses where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @return the number of matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupIdActive(long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tax detailses where taxDetailsId = &#63; and active = &#63;.
	*
	* @param taxDetailsId the tax details ID
	* @param active the active
	* @return the matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxDetails> findByTaxDetailsIdActive(
		long taxDetailsId, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tax detailses where taxDetailsId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param taxDetailsId the tax details ID
	* @param active the active
	* @param start the lower bound of the range of tax detailses
	* @param end the upper bound of the range of tax detailses (not inclusive)
	* @return the range of matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxDetails> findByTaxDetailsIdActive(
		long taxDetailsId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tax detailses where taxDetailsId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param taxDetailsId the tax details ID
	* @param active the active
	* @param start the lower bound of the range of tax detailses
	* @param end the upper bound of the range of tax detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxDetails> findByTaxDetailsIdActive(
		long taxDetailsId, int active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tax details in the ordered set where taxDetailsId = &#63; and active = &#63;.
	*
	* @param taxDetailsId the tax details ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax details
	* @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails findByTaxDetailsIdActive_First(
		long taxDetailsId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException;

	/**
	* Returns the first tax details in the ordered set where taxDetailsId = &#63; and active = &#63;.
	*
	* @param taxDetailsId the tax details ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax details, or <code>null</code> if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails fetchByTaxDetailsIdActive_First(
		long taxDetailsId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tax details in the ordered set where taxDetailsId = &#63; and active = &#63;.
	*
	* @param taxDetailsId the tax details ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax details
	* @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails findByTaxDetailsIdActive_Last(
		long taxDetailsId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException;

	/**
	* Returns the last tax details in the ordered set where taxDetailsId = &#63; and active = &#63;.
	*
	* @param taxDetailsId the tax details ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax details, or <code>null</code> if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails fetchByTaxDetailsIdActive_Last(
		long taxDetailsId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tax detailses where taxDetailsId = &#63; and active = &#63; from the database.
	*
	* @param taxDetailsId the tax details ID
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTaxDetailsIdActive(long taxDetailsId, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tax detailses where taxDetailsId = &#63; and active = &#63;.
	*
	* @param taxDetailsId the tax details ID
	* @param active the active
	* @return the number of matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public int countByTaxDetailsIdActive(long taxDetailsId, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tax detailses where taxTypeId = &#63; and active = &#63;.
	*
	* @param taxTypeId the tax type ID
	* @param active the active
	* @return the matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxDetails> findByTaxTypeIdActive(
		long taxTypeId, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tax detailses where taxTypeId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param taxTypeId the tax type ID
	* @param active the active
	* @param start the lower bound of the range of tax detailses
	* @param end the upper bound of the range of tax detailses (not inclusive)
	* @return the range of matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxDetails> findByTaxTypeIdActive(
		long taxTypeId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tax detailses where taxTypeId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param taxTypeId the tax type ID
	* @param active the active
	* @param start the lower bound of the range of tax detailses
	* @param end the upper bound of the range of tax detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxDetails> findByTaxTypeIdActive(
		long taxTypeId, int active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tax details in the ordered set where taxTypeId = &#63; and active = &#63;.
	*
	* @param taxTypeId the tax type ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax details
	* @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails findByTaxTypeIdActive_First(
		long taxTypeId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException;

	/**
	* Returns the first tax details in the ordered set where taxTypeId = &#63; and active = &#63;.
	*
	* @param taxTypeId the tax type ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax details, or <code>null</code> if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails fetchByTaxTypeIdActive_First(
		long taxTypeId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tax details in the ordered set where taxTypeId = &#63; and active = &#63;.
	*
	* @param taxTypeId the tax type ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax details
	* @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails findByTaxTypeIdActive_Last(
		long taxTypeId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException;

	/**
	* Returns the last tax details in the ordered set where taxTypeId = &#63; and active = &#63;.
	*
	* @param taxTypeId the tax type ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax details, or <code>null</code> if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails fetchByTaxTypeIdActive_Last(
		long taxTypeId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tax detailses before and after the current tax details in the ordered set where taxTypeId = &#63; and active = &#63;.
	*
	* @param taxDetailsId the primary key of the current tax details
	* @param taxTypeId the tax type ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tax details
	* @throws com.ocms.course.NoSuchTaxDetailsException if a tax details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails[] findByTaxTypeIdActive_PrevAndNext(
		long taxDetailsId, long taxTypeId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException;

	/**
	* Removes all the tax detailses where taxTypeId = &#63; and active = &#63; from the database.
	*
	* @param taxTypeId the tax type ID
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTaxTypeIdActive(long taxTypeId, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tax detailses where taxTypeId = &#63; and active = &#63;.
	*
	* @param taxTypeId the tax type ID
	* @param active the active
	* @return the number of matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public int countByTaxTypeIdActive(long taxTypeId, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the tax details in the entity cache if it is enabled.
	*
	* @param taxDetails the tax details
	*/
	public void cacheResult(com.ocms.course.model.TaxDetails taxDetails);

	/**
	* Caches the tax detailses in the entity cache if it is enabled.
	*
	* @param taxDetailses the tax detailses
	*/
	public void cacheResult(
		java.util.List<com.ocms.course.model.TaxDetails> taxDetailses);

	/**
	* Creates a new tax details with the primary key. Does not add the tax details to the database.
	*
	* @param taxDetailsId the primary key for the new tax details
	* @return the new tax details
	*/
	public com.ocms.course.model.TaxDetails create(long taxDetailsId);

	/**
	* Removes the tax details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param taxDetailsId the primary key of the tax details
	* @return the tax details that was removed
	* @throws com.ocms.course.NoSuchTaxDetailsException if a tax details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails remove(long taxDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException;

	public com.ocms.course.model.TaxDetails updateImpl(
		com.ocms.course.model.TaxDetails taxDetails)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tax details with the primary key or throws a {@link com.ocms.course.NoSuchTaxDetailsException} if it could not be found.
	*
	* @param taxDetailsId the primary key of the tax details
	* @return the tax details
	* @throws com.ocms.course.NoSuchTaxDetailsException if a tax details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails findByPrimaryKey(long taxDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException;

	/**
	* Returns the tax details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param taxDetailsId the primary key of the tax details
	* @return the tax details, or <code>null</code> if a tax details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxDetails fetchByPrimaryKey(long taxDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tax detailses.
	*
	* @return the tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxDetails> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tax detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tax detailses
	* @param end the upper bound of the range of tax detailses (not inclusive)
	* @return the range of tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxDetails> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tax detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tax detailses
	* @param end the upper bound of the range of tax detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxDetails> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tax detailses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tax detailses.
	*
	* @return the number of tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}