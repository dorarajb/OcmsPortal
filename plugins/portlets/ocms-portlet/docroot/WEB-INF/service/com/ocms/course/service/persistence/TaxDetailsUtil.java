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

import com.ocms.course.model.TaxDetails;

import java.util.List;

/**
 * The persistence utility for the tax details service. This utility wraps {@link TaxDetailsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author doraraj
 * @see TaxDetailsPersistence
 * @see TaxDetailsPersistenceImpl
 * @generated
 */
public class TaxDetailsUtil {
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
	public static void clearCache(TaxDetails taxDetails) {
		getPersistence().clearCache(taxDetails);
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
	public static List<TaxDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TaxDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TaxDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TaxDetails update(TaxDetails taxDetails)
		throws SystemException {
		return getPersistence().update(taxDetails);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TaxDetails update(TaxDetails taxDetails,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(taxDetails, serviceContext);
	}

	/**
	* Returns all the tax detailses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.TaxDetails> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

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
	public static java.util.List<com.ocms.course.model.TaxDetails> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

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
	public static java.util.List<com.ocms.course.model.TaxDetails> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first tax details in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax details
	* @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxDetails findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first tax details in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax details, or <code>null</code> if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxDetails fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last tax details in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax details
	* @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxDetails findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last tax details in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax details, or <code>null</code> if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxDetails fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

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
	public static com.ocms.course.model.TaxDetails[] findByGroupId_PrevAndNext(
		long taxDetailsId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(taxDetailsId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the tax detailses where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of tax detailses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the tax detailses where taxDetailsId = &#63;.
	*
	* @param taxDetailsId the tax details ID
	* @return the matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.TaxDetails> findByTaxDetailsId(
		long taxDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTaxDetailsId(taxDetailsId);
	}

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
	public static java.util.List<com.ocms.course.model.TaxDetails> findByTaxDetailsId(
		long taxDetailsId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTaxDetailsId(taxDetailsId, start, end);
	}

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
	public static java.util.List<com.ocms.course.model.TaxDetails> findByTaxDetailsId(
		long taxDetailsId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTaxDetailsId(taxDetailsId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first tax details in the ordered set where taxDetailsId = &#63;.
	*
	* @param taxDetailsId the tax details ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax details
	* @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxDetails findByTaxDetailsId_First(
		long taxDetailsId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException {
		return getPersistence()
				   .findByTaxDetailsId_First(taxDetailsId, orderByComparator);
	}

	/**
	* Returns the first tax details in the ordered set where taxDetailsId = &#63;.
	*
	* @param taxDetailsId the tax details ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax details, or <code>null</code> if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxDetails fetchByTaxDetailsId_First(
		long taxDetailsId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTaxDetailsId_First(taxDetailsId, orderByComparator);
	}

	/**
	* Returns the last tax details in the ordered set where taxDetailsId = &#63;.
	*
	* @param taxDetailsId the tax details ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax details
	* @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxDetails findByTaxDetailsId_Last(
		long taxDetailsId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException {
		return getPersistence()
				   .findByTaxDetailsId_Last(taxDetailsId, orderByComparator);
	}

	/**
	* Returns the last tax details in the ordered set where taxDetailsId = &#63;.
	*
	* @param taxDetailsId the tax details ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax details, or <code>null</code> if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxDetails fetchByTaxDetailsId_Last(
		long taxDetailsId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTaxDetailsId_Last(taxDetailsId, orderByComparator);
	}

	/**
	* Removes all the tax detailses where taxDetailsId = &#63; from the database.
	*
	* @param taxDetailsId the tax details ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTaxDetailsId(long taxDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTaxDetailsId(taxDetailsId);
	}

	/**
	* Returns the number of tax detailses where taxDetailsId = &#63;.
	*
	* @param taxDetailsId the tax details ID
	* @return the number of matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTaxDetailsId(long taxDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTaxDetailsId(taxDetailsId);
	}

	/**
	* Returns all the tax detailses where taxTypeId = &#63;.
	*
	* @param taxTypeId the tax type ID
	* @return the matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.TaxDetails> findByTaxTypeId(
		long taxTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTaxTypeId(taxTypeId);
	}

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
	public static java.util.List<com.ocms.course.model.TaxDetails> findByTaxTypeId(
		long taxTypeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTaxTypeId(taxTypeId, start, end);
	}

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
	public static java.util.List<com.ocms.course.model.TaxDetails> findByTaxTypeId(
		long taxTypeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTaxTypeId(taxTypeId, start, end, orderByComparator);
	}

	/**
	* Returns the first tax details in the ordered set where taxTypeId = &#63;.
	*
	* @param taxTypeId the tax type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax details
	* @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxDetails findByTaxTypeId_First(
		long taxTypeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException {
		return getPersistence()
				   .findByTaxTypeId_First(taxTypeId, orderByComparator);
	}

	/**
	* Returns the first tax details in the ordered set where taxTypeId = &#63;.
	*
	* @param taxTypeId the tax type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax details, or <code>null</code> if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxDetails fetchByTaxTypeId_First(
		long taxTypeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTaxTypeId_First(taxTypeId, orderByComparator);
	}

	/**
	* Returns the last tax details in the ordered set where taxTypeId = &#63;.
	*
	* @param taxTypeId the tax type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax details
	* @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxDetails findByTaxTypeId_Last(
		long taxTypeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException {
		return getPersistence()
				   .findByTaxTypeId_Last(taxTypeId, orderByComparator);
	}

	/**
	* Returns the last tax details in the ordered set where taxTypeId = &#63;.
	*
	* @param taxTypeId the tax type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax details, or <code>null</code> if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxDetails fetchByTaxTypeId_Last(
		long taxTypeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTaxTypeId_Last(taxTypeId, orderByComparator);
	}

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
	public static com.ocms.course.model.TaxDetails[] findByTaxTypeId_PrevAndNext(
		long taxDetailsId, long taxTypeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException {
		return getPersistence()
				   .findByTaxTypeId_PrevAndNext(taxDetailsId, taxTypeId,
			orderByComparator);
	}

	/**
	* Removes all the tax detailses where taxTypeId = &#63; from the database.
	*
	* @param taxTypeId the tax type ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTaxTypeId(long taxTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTaxTypeId(taxTypeId);
	}

	/**
	* Returns the number of tax detailses where taxTypeId = &#63;.
	*
	* @param taxTypeId the tax type ID
	* @return the number of matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTaxTypeId(long taxTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTaxTypeId(taxTypeId);
	}

	/**
	* Returns all the tax detailses where active = &#63;.
	*
	* @param active the active
	* @return the matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.TaxDetails> findByActive(
		int active) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByActive(active);
	}

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
	public static java.util.List<com.ocms.course.model.TaxDetails> findByActive(
		int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByActive(active, start, end);
	}

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
	public static java.util.List<com.ocms.course.model.TaxDetails> findByActive(
		int active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByActive(active, start, end, orderByComparator);
	}

	/**
	* Returns the first tax details in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax details
	* @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxDetails findByActive_First(
		int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException {
		return getPersistence().findByActive_First(active, orderByComparator);
	}

	/**
	* Returns the first tax details in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax details, or <code>null</code> if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxDetails fetchByActive_First(
		int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByActive_First(active, orderByComparator);
	}

	/**
	* Returns the last tax details in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax details
	* @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxDetails findByActive_Last(
		int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException {
		return getPersistence().findByActive_Last(active, orderByComparator);
	}

	/**
	* Returns the last tax details in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax details, or <code>null</code> if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxDetails fetchByActive_Last(
		int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByActive_Last(active, orderByComparator);
	}

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
	public static com.ocms.course.model.TaxDetails[] findByActive_PrevAndNext(
		long taxDetailsId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException {
		return getPersistence()
				   .findByActive_PrevAndNext(taxDetailsId, active,
			orderByComparator);
	}

	/**
	* Removes all the tax detailses where active = &#63; from the database.
	*
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByActive(int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByActive(active);
	}

	/**
	* Returns the number of tax detailses where active = &#63;.
	*
	* @param active the active
	* @return the number of matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByActive(int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByActive(active);
	}

	/**
	* Returns all the tax detailses where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @return the matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.TaxDetails> findByGroupIdActive(
		long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupIdActive(groupId, active);
	}

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
	public static java.util.List<com.ocms.course.model.TaxDetails> findByGroupIdActive(
		long groupId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupIdActive(groupId, active, start, end);
	}

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
	public static java.util.List<com.ocms.course.model.TaxDetails> findByGroupIdActive(
		long groupId, int active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupIdActive(groupId, active, start, end,
			orderByComparator);
	}

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
	public static com.ocms.course.model.TaxDetails findByGroupIdActive_First(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException {
		return getPersistence()
				   .findByGroupIdActive_First(groupId, active, orderByComparator);
	}

	/**
	* Returns the first tax details in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax details, or <code>null</code> if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxDetails fetchByGroupIdActive_First(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroupIdActive_First(groupId, active,
			orderByComparator);
	}

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
	public static com.ocms.course.model.TaxDetails findByGroupIdActive_Last(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException {
		return getPersistence()
				   .findByGroupIdActive_Last(groupId, active, orderByComparator);
	}

	/**
	* Returns the last tax details in the ordered set where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax details, or <code>null</code> if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxDetails fetchByGroupIdActive_Last(
		long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroupIdActive_Last(groupId, active, orderByComparator);
	}

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
	public static com.ocms.course.model.TaxDetails[] findByGroupIdActive_PrevAndNext(
		long taxDetailsId, long groupId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException {
		return getPersistence()
				   .findByGroupIdActive_PrevAndNext(taxDetailsId, groupId,
			active, orderByComparator);
	}

	/**
	* Removes all the tax detailses where groupId = &#63; and active = &#63; from the database.
	*
	* @param groupId the group ID
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupIdActive(long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupIdActive(groupId, active);
	}

	/**
	* Returns the number of tax detailses where groupId = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param active the active
	* @return the number of matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupIdActive(long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupIdActive(groupId, active);
	}

	/**
	* Returns all the tax detailses where taxDetailsId = &#63; and active = &#63;.
	*
	* @param taxDetailsId the tax details ID
	* @param active the active
	* @return the matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.TaxDetails> findByTaxDetailsIdActive(
		long taxDetailsId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTaxDetailsIdActive(taxDetailsId, active);
	}

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
	public static java.util.List<com.ocms.course.model.TaxDetails> findByTaxDetailsIdActive(
		long taxDetailsId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTaxDetailsIdActive(taxDetailsId, active, start, end);
	}

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
	public static java.util.List<com.ocms.course.model.TaxDetails> findByTaxDetailsIdActive(
		long taxDetailsId, int active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTaxDetailsIdActive(taxDetailsId, active, start, end,
			orderByComparator);
	}

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
	public static com.ocms.course.model.TaxDetails findByTaxDetailsIdActive_First(
		long taxDetailsId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException {
		return getPersistence()
				   .findByTaxDetailsIdActive_First(taxDetailsId, active,
			orderByComparator);
	}

	/**
	* Returns the first tax details in the ordered set where taxDetailsId = &#63; and active = &#63;.
	*
	* @param taxDetailsId the tax details ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax details, or <code>null</code> if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxDetails fetchByTaxDetailsIdActive_First(
		long taxDetailsId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTaxDetailsIdActive_First(taxDetailsId, active,
			orderByComparator);
	}

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
	public static com.ocms.course.model.TaxDetails findByTaxDetailsIdActive_Last(
		long taxDetailsId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException {
		return getPersistence()
				   .findByTaxDetailsIdActive_Last(taxDetailsId, active,
			orderByComparator);
	}

	/**
	* Returns the last tax details in the ordered set where taxDetailsId = &#63; and active = &#63;.
	*
	* @param taxDetailsId the tax details ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax details, or <code>null</code> if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxDetails fetchByTaxDetailsIdActive_Last(
		long taxDetailsId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTaxDetailsIdActive_Last(taxDetailsId, active,
			orderByComparator);
	}

	/**
	* Removes all the tax detailses where taxDetailsId = &#63; and active = &#63; from the database.
	*
	* @param taxDetailsId the tax details ID
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTaxDetailsIdActive(long taxDetailsId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTaxDetailsIdActive(taxDetailsId, active);
	}

	/**
	* Returns the number of tax detailses where taxDetailsId = &#63; and active = &#63;.
	*
	* @param taxDetailsId the tax details ID
	* @param active the active
	* @return the number of matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTaxDetailsIdActive(long taxDetailsId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTaxDetailsIdActive(taxDetailsId, active);
	}

	/**
	* Returns all the tax detailses where taxTypeId = &#63; and active = &#63;.
	*
	* @param taxTypeId the tax type ID
	* @param active the active
	* @return the matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.TaxDetails> findByTaxTypeIdActive(
		long taxTypeId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTaxTypeIdActive(taxTypeId, active);
	}

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
	public static java.util.List<com.ocms.course.model.TaxDetails> findByTaxTypeIdActive(
		long taxTypeId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTaxTypeIdActive(taxTypeId, active, start, end);
	}

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
	public static java.util.List<com.ocms.course.model.TaxDetails> findByTaxTypeIdActive(
		long taxTypeId, int active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTaxTypeIdActive(taxTypeId, active, start, end,
			orderByComparator);
	}

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
	public static com.ocms.course.model.TaxDetails findByTaxTypeIdActive_First(
		long taxTypeId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException {
		return getPersistence()
				   .findByTaxTypeIdActive_First(taxTypeId, active,
			orderByComparator);
	}

	/**
	* Returns the first tax details in the ordered set where taxTypeId = &#63; and active = &#63;.
	*
	* @param taxTypeId the tax type ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tax details, or <code>null</code> if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxDetails fetchByTaxTypeIdActive_First(
		long taxTypeId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTaxTypeIdActive_First(taxTypeId, active,
			orderByComparator);
	}

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
	public static com.ocms.course.model.TaxDetails findByTaxTypeIdActive_Last(
		long taxTypeId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException {
		return getPersistence()
				   .findByTaxTypeIdActive_Last(taxTypeId, active,
			orderByComparator);
	}

	/**
	* Returns the last tax details in the ordered set where taxTypeId = &#63; and active = &#63;.
	*
	* @param taxTypeId the tax type ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tax details, or <code>null</code> if a matching tax details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxDetails fetchByTaxTypeIdActive_Last(
		long taxTypeId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTaxTypeIdActive_Last(taxTypeId, active,
			orderByComparator);
	}

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
	public static com.ocms.course.model.TaxDetails[] findByTaxTypeIdActive_PrevAndNext(
		long taxDetailsId, long taxTypeId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException {
		return getPersistence()
				   .findByTaxTypeIdActive_PrevAndNext(taxDetailsId, taxTypeId,
			active, orderByComparator);
	}

	/**
	* Removes all the tax detailses where taxTypeId = &#63; and active = &#63; from the database.
	*
	* @param taxTypeId the tax type ID
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTaxTypeIdActive(long taxTypeId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTaxTypeIdActive(taxTypeId, active);
	}

	/**
	* Returns the number of tax detailses where taxTypeId = &#63; and active = &#63;.
	*
	* @param taxTypeId the tax type ID
	* @param active the active
	* @return the number of matching tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTaxTypeIdActive(long taxTypeId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTaxTypeIdActive(taxTypeId, active);
	}

	/**
	* Caches the tax details in the entity cache if it is enabled.
	*
	* @param taxDetails the tax details
	*/
	public static void cacheResult(com.ocms.course.model.TaxDetails taxDetails) {
		getPersistence().cacheResult(taxDetails);
	}

	/**
	* Caches the tax detailses in the entity cache if it is enabled.
	*
	* @param taxDetailses the tax detailses
	*/
	public static void cacheResult(
		java.util.List<com.ocms.course.model.TaxDetails> taxDetailses) {
		getPersistence().cacheResult(taxDetailses);
	}

	/**
	* Creates a new tax details with the primary key. Does not add the tax details to the database.
	*
	* @param taxDetailsId the primary key for the new tax details
	* @return the new tax details
	*/
	public static com.ocms.course.model.TaxDetails create(long taxDetailsId) {
		return getPersistence().create(taxDetailsId);
	}

	/**
	* Removes the tax details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param taxDetailsId the primary key of the tax details
	* @return the tax details that was removed
	* @throws com.ocms.course.NoSuchTaxDetailsException if a tax details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxDetails remove(long taxDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException {
		return getPersistence().remove(taxDetailsId);
	}

	public static com.ocms.course.model.TaxDetails updateImpl(
		com.ocms.course.model.TaxDetails taxDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(taxDetails);
	}

	/**
	* Returns the tax details with the primary key or throws a {@link com.ocms.course.NoSuchTaxDetailsException} if it could not be found.
	*
	* @param taxDetailsId the primary key of the tax details
	* @return the tax details
	* @throws com.ocms.course.NoSuchTaxDetailsException if a tax details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxDetails findByPrimaryKey(
		long taxDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchTaxDetailsException {
		return getPersistence().findByPrimaryKey(taxDetailsId);
	}

	/**
	* Returns the tax details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param taxDetailsId the primary key of the tax details
	* @return the tax details, or <code>null</code> if a tax details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxDetails fetchByPrimaryKey(
		long taxDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(taxDetailsId);
	}

	/**
	* Returns all the tax detailses.
	*
	* @return the tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.TaxDetails> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.ocms.course.model.TaxDetails> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.ocms.course.model.TaxDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the tax detailses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tax detailses.
	*
	* @return the number of tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TaxDetailsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TaxDetailsPersistence)PortletBeanLocatorUtil.locate(com.ocms.course.service.ClpSerializer.getServletContextName(),
					TaxDetailsPersistence.class.getName());

			ReferenceRegistry.registerReference(TaxDetailsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TaxDetailsPersistence persistence) {
	}

	private static TaxDetailsPersistence _persistence;
}