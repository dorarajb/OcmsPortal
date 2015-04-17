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

import com.ocms.course.model.TaxTypes;

/**
 * The persistence interface for the tax types service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author doraraj
 * @see TaxTypesPersistenceImpl
 * @see TaxTypesUtil
 * @generated
 */
public interface TaxTypesPersistence extends BasePersistence<TaxTypes> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TaxTypesUtil} to access the tax types persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the tax typeses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching tax typeses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxTypes> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tax typeses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of tax typeses
	* @param end the upper bound of the range of tax typeses (not inclusive)
	* @return the range of matching tax typeses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxTypes> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tax typeses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of tax typeses
	* @param end the upper bound of the range of tax typeses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tax typeses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxTypes> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tax types in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax types
	* @throws com.ocms.course.NoSuchTaxTypesException if a matching tax types could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxTypes findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxTypesException;

	/**
	* Returns the first tax types in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax types, or <code>null</code> if a matching tax types could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxTypes fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tax types in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax types
	* @throws com.ocms.course.NoSuchTaxTypesException if a matching tax types could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxTypes findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxTypesException;

	/**
	* Returns the last tax types in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax types, or <code>null</code> if a matching tax types could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxTypes fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tax typeses before and after the current tax types in the ordered set where groupId = &#63;.
	*
	* @param taxTypesId the primary key of the current tax types
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tax types
	* @throws com.ocms.course.NoSuchTaxTypesException if a tax types with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxTypes[] findByGroupId_PrevAndNext(
		long taxTypesId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxTypesException;

	/**
	* Removes all the tax typeses where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tax typeses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching tax typeses
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tax typeses where taxTypesId = &#63;.
	*
	* @param taxTypesId the tax types ID
	* @return the matching tax typeses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxTypes> findByTaxTypeId(
		long taxTypesId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tax typeses where taxTypesId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param taxTypesId the tax types ID
	* @param start the lower bound of the range of tax typeses
	* @param end the upper bound of the range of tax typeses (not inclusive)
	* @return the range of matching tax typeses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxTypes> findByTaxTypeId(
		long taxTypesId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tax typeses where taxTypesId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param taxTypesId the tax types ID
	* @param start the lower bound of the range of tax typeses
	* @param end the upper bound of the range of tax typeses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tax typeses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxTypes> findByTaxTypeId(
		long taxTypesId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tax types in the ordered set where taxTypesId = &#63;.
	*
	* @param taxTypesId the tax types ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax types
	* @throws com.ocms.course.NoSuchTaxTypesException if a matching tax types could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxTypes findByTaxTypeId_First(
		long taxTypesId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxTypesException;

	/**
	* Returns the first tax types in the ordered set where taxTypesId = &#63;.
	*
	* @param taxTypesId the tax types ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax types, or <code>null</code> if a matching tax types could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxTypes fetchByTaxTypeId_First(
		long taxTypesId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tax types in the ordered set where taxTypesId = &#63;.
	*
	* @param taxTypesId the tax types ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax types
	* @throws com.ocms.course.NoSuchTaxTypesException if a matching tax types could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxTypes findByTaxTypeId_Last(
		long taxTypesId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxTypesException;

	/**
	* Returns the last tax types in the ordered set where taxTypesId = &#63;.
	*
	* @param taxTypesId the tax types ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax types, or <code>null</code> if a matching tax types could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxTypes fetchByTaxTypeId_Last(
		long taxTypesId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tax typeses where taxTypesId = &#63; from the database.
	*
	* @param taxTypesId the tax types ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTaxTypeId(long taxTypesId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tax typeses where taxTypesId = &#63;.
	*
	* @param taxTypesId the tax types ID
	* @return the number of matching tax typeses
	* @throws SystemException if a system exception occurred
	*/
	public int countByTaxTypeId(long taxTypesId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the tax types in the entity cache if it is enabled.
	*
	* @param taxTypes the tax types
	*/
	public void cacheResult(com.ocms.course.model.TaxTypes taxTypes);

	/**
	* Caches the tax typeses in the entity cache if it is enabled.
	*
	* @param taxTypeses the tax typeses
	*/
	public void cacheResult(
		java.util.List<com.ocms.course.model.TaxTypes> taxTypeses);

	/**
	* Creates a new tax types with the primary key. Does not add the tax types to the database.
	*
	* @param taxTypesId the primary key for the new tax types
	* @return the new tax types
	*/
	public com.ocms.course.model.TaxTypes create(long taxTypesId);

	/**
	* Removes the tax types with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param taxTypesId the primary key of the tax types
	* @return the tax types that was removed
	* @throws com.ocms.course.NoSuchTaxTypesException if a tax types with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxTypes remove(long taxTypesId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxTypesException;

	public com.ocms.course.model.TaxTypes updateImpl(
		com.ocms.course.model.TaxTypes taxTypes)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tax types with the primary key or throws a {@link com.ocms.course.NoSuchTaxTypesException} if it could not be found.
	*
	* @param taxTypesId the primary key of the tax types
	* @return the tax types
	* @throws com.ocms.course.NoSuchTaxTypesException if a tax types with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxTypes findByPrimaryKey(long taxTypesId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxTypesException;

	/**
	* Returns the tax types with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param taxTypesId the primary key of the tax types
	* @return the tax types, or <code>null</code> if a tax types with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.TaxTypes fetchByPrimaryKey(long taxTypesId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tax typeses.
	*
	* @return the tax typeses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxTypes> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tax typeses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tax typeses
	* @param end the upper bound of the range of tax typeses (not inclusive)
	* @return the range of tax typeses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxTypes> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tax typeses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tax typeses
	* @param end the upper bound of the range of tax typeses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tax typeses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.TaxTypes> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tax typeses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tax typeses.
	*
	* @return the number of tax typeses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}