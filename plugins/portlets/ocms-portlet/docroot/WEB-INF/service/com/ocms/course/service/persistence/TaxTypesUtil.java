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

import com.ocms.course.model.TaxTypes;

import java.util.List;

/**
 * The persistence utility for the tax types service. This utility wraps {@link TaxTypesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author doraraj
 * @see TaxTypesPersistence
 * @see TaxTypesPersistenceImpl
 * @generated
 */
public class TaxTypesUtil {
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
	public static void clearCache(TaxTypes taxTypes) {
		getPersistence().clearCache(taxTypes);
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
	public static List<TaxTypes> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TaxTypes> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TaxTypes> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TaxTypes update(TaxTypes taxTypes) throws SystemException {
		return getPersistence().update(taxTypes);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TaxTypes update(TaxTypes taxTypes,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(taxTypes, serviceContext);
	}

	/**
	* Returns all the tax typeses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching tax typeses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.TaxTypes> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

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
	public static java.util.List<com.ocms.course.model.TaxTypes> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

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
	public static java.util.List<com.ocms.course.model.TaxTypes> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first tax types in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax types
	* @throws com.ocms.course.NoSuchTaxTypesException if a matching tax types could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxTypes findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxTypesException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first tax types in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax types, or <code>null</code> if a matching tax types could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxTypes fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last tax types in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax types
	* @throws com.ocms.course.NoSuchTaxTypesException if a matching tax types could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxTypes findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxTypesException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last tax types in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax types, or <code>null</code> if a matching tax types could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxTypes fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

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
	public static com.ocms.course.model.TaxTypes[] findByGroupId_PrevAndNext(
		long taxTypesId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxTypesException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(taxTypesId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the tax typeses where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of tax typeses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching tax typeses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the tax typeses where taxTypesId = &#63;.
	*
	* @param taxTypesId the tax types ID
	* @return the matching tax typeses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.TaxTypes> findByTaxTypeId(
		long taxTypesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTaxTypeId(taxTypesId);
	}

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
	public static java.util.List<com.ocms.course.model.TaxTypes> findByTaxTypeId(
		long taxTypesId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTaxTypeId(taxTypesId, start, end);
	}

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
	public static java.util.List<com.ocms.course.model.TaxTypes> findByTaxTypeId(
		long taxTypesId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTaxTypeId(taxTypesId, start, end, orderByComparator);
	}

	/**
	* Returns the first tax types in the ordered set where taxTypesId = &#63;.
	*
	* @param taxTypesId the tax types ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax types
	* @throws com.ocms.course.NoSuchTaxTypesException if a matching tax types could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxTypes findByTaxTypeId_First(
		long taxTypesId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxTypesException {
		return getPersistence()
				   .findByTaxTypeId_First(taxTypesId, orderByComparator);
	}

	/**
	* Returns the first tax types in the ordered set where taxTypesId = &#63;.
	*
	* @param taxTypesId the tax types ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax types, or <code>null</code> if a matching tax types could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxTypes fetchByTaxTypeId_First(
		long taxTypesId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTaxTypeId_First(taxTypesId, orderByComparator);
	}

	/**
	* Returns the last tax types in the ordered set where taxTypesId = &#63;.
	*
	* @param taxTypesId the tax types ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax types
	* @throws com.ocms.course.NoSuchTaxTypesException if a matching tax types could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxTypes findByTaxTypeId_Last(
		long taxTypesId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxTypesException {
		return getPersistence()
				   .findByTaxTypeId_Last(taxTypesId, orderByComparator);
	}

	/**
	* Returns the last tax types in the ordered set where taxTypesId = &#63;.
	*
	* @param taxTypesId the tax types ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax types, or <code>null</code> if a matching tax types could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxTypes fetchByTaxTypeId_Last(
		long taxTypesId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTaxTypeId_Last(taxTypesId, orderByComparator);
	}

	/**
	* Removes all the tax typeses where taxTypesId = &#63; from the database.
	*
	* @param taxTypesId the tax types ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTaxTypeId(long taxTypesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTaxTypeId(taxTypesId);
	}

	/**
	* Returns the number of tax typeses where taxTypesId = &#63;.
	*
	* @param taxTypesId the tax types ID
	* @return the number of matching tax typeses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTaxTypeId(long taxTypesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTaxTypeId(taxTypesId);
	}

	/**
	* Caches the tax types in the entity cache if it is enabled.
	*
	* @param taxTypes the tax types
	*/
	public static void cacheResult(com.ocms.course.model.TaxTypes taxTypes) {
		getPersistence().cacheResult(taxTypes);
	}

	/**
	* Caches the tax typeses in the entity cache if it is enabled.
	*
	* @param taxTypeses the tax typeses
	*/
	public static void cacheResult(
		java.util.List<com.ocms.course.model.TaxTypes> taxTypeses) {
		getPersistence().cacheResult(taxTypeses);
	}

	/**
	* Creates a new tax types with the primary key. Does not add the tax types to the database.
	*
	* @param taxTypesId the primary key for the new tax types
	* @return the new tax types
	*/
	public static com.ocms.course.model.TaxTypes create(long taxTypesId) {
		return getPersistence().create(taxTypesId);
	}

	/**
	* Removes the tax types with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param taxTypesId the primary key of the tax types
	* @return the tax types that was removed
	* @throws com.ocms.course.NoSuchTaxTypesException if a tax types with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxTypes remove(long taxTypesId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxTypesException {
		return getPersistence().remove(taxTypesId);
	}

	public static com.ocms.course.model.TaxTypes updateImpl(
		com.ocms.course.model.TaxTypes taxTypes)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(taxTypes);
	}

	/**
	* Returns the tax types with the primary key or throws a {@link com.ocms.course.NoSuchTaxTypesException} if it could not be found.
	*
	* @param taxTypesId the primary key of the tax types
	* @return the tax types
	* @throws com.ocms.course.NoSuchTaxTypesException if a tax types with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxTypes findByPrimaryKey(
		long taxTypesId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxTypesException {
		return getPersistence().findByPrimaryKey(taxTypesId);
	}

	/**
	* Returns the tax types with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param taxTypesId the primary key of the tax types
	* @return the tax types, or <code>null</code> if a tax types with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxTypes fetchByPrimaryKey(
		long taxTypesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(taxTypesId);
	}

	/**
	* Returns all the tax typeses.
	*
	* @return the tax typeses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.TaxTypes> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.ocms.course.model.TaxTypes> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.ocms.course.model.TaxTypes> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the tax typeses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tax typeses.
	*
	* @return the number of tax typeses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TaxTypesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TaxTypesPersistence)PortletBeanLocatorUtil.locate(com.ocms.course.service.ClpSerializer.getServletContextName(),
					TaxTypesPersistence.class.getName());

			ReferenceRegistry.registerReference(TaxTypesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TaxTypesPersistence persistence) {
	}

	private static TaxTypesPersistence _persistence;
}