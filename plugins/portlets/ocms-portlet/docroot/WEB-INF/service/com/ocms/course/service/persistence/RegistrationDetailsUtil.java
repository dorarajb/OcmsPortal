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

import com.ocms.course.model.RegistrationDetails;

import java.util.List;

/**
 * The persistence utility for the registration details service. This utility wraps {@link RegistrationDetailsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author doraraj
 * @see RegistrationDetailsPersistence
 * @see RegistrationDetailsPersistenceImpl
 * @generated
 */
public class RegistrationDetailsUtil {
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
	public static void clearCache(RegistrationDetails registrationDetails) {
		getPersistence().clearCache(registrationDetails);
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
	public static List<RegistrationDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RegistrationDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RegistrationDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static RegistrationDetails update(
		RegistrationDetails registrationDetails) throws SystemException {
		return getPersistence().update(registrationDetails);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static RegistrationDetails update(
		RegistrationDetails registrationDetails, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(registrationDetails, serviceContext);
	}

	/**
	* Returns all the registration detailses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching registration detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.RegistrationDetails> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the registration detailses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.RegistrationDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of registration detailses
	* @param end the upper bound of the range of registration detailses (not inclusive)
	* @return the range of matching registration detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.RegistrationDetails> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the registration detailses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.RegistrationDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of registration detailses
	* @param end the upper bound of the range of registration detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching registration detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.RegistrationDetails> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first registration details in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration details
	* @throws com.ocms.course.NoSuchRegistrationDetailsException if a matching registration details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.RegistrationDetails findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchRegistrationDetailsException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first registration details in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration details, or <code>null</code> if a matching registration details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.RegistrationDetails fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last registration details in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration details
	* @throws com.ocms.course.NoSuchRegistrationDetailsException if a matching registration details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.RegistrationDetails findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchRegistrationDetailsException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last registration details in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration details, or <code>null</code> if a matching registration details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.RegistrationDetails fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the registration detailses before and after the current registration details in the ordered set where groupId = &#63;.
	*
	* @param registrationDetailsId the primary key of the current registration details
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next registration details
	* @throws com.ocms.course.NoSuchRegistrationDetailsException if a registration details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.RegistrationDetails[] findByGroupId_PrevAndNext(
		long registrationDetailsId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchRegistrationDetailsException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(registrationDetailsId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the registration detailses where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of registration detailses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching registration detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the registration detailses where registrationDetailsId = &#63;.
	*
	* @param registrationDetailsId the registration details ID
	* @return the matching registration detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.RegistrationDetails> findByRegistrationDetailsId(
		long registrationDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRegistrationDetailsId(registrationDetailsId);
	}

	/**
	* Returns a range of all the registration detailses where registrationDetailsId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.RegistrationDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param registrationDetailsId the registration details ID
	* @param start the lower bound of the range of registration detailses
	* @param end the upper bound of the range of registration detailses (not inclusive)
	* @return the range of matching registration detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.RegistrationDetails> findByRegistrationDetailsId(
		long registrationDetailsId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRegistrationDetailsId(registrationDetailsId, start,
			end);
	}

	/**
	* Returns an ordered range of all the registration detailses where registrationDetailsId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.RegistrationDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param registrationDetailsId the registration details ID
	* @param start the lower bound of the range of registration detailses
	* @param end the upper bound of the range of registration detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching registration detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.RegistrationDetails> findByRegistrationDetailsId(
		long registrationDetailsId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRegistrationDetailsId(registrationDetailsId, start,
			end, orderByComparator);
	}

	/**
	* Returns the first registration details in the ordered set where registrationDetailsId = &#63;.
	*
	* @param registrationDetailsId the registration details ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration details
	* @throws com.ocms.course.NoSuchRegistrationDetailsException if a matching registration details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.RegistrationDetails findByRegistrationDetailsId_First(
		long registrationDetailsId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchRegistrationDetailsException {
		return getPersistence()
				   .findByRegistrationDetailsId_First(registrationDetailsId,
			orderByComparator);
	}

	/**
	* Returns the first registration details in the ordered set where registrationDetailsId = &#63;.
	*
	* @param registrationDetailsId the registration details ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration details, or <code>null</code> if a matching registration details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.RegistrationDetails fetchByRegistrationDetailsId_First(
		long registrationDetailsId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRegistrationDetailsId_First(registrationDetailsId,
			orderByComparator);
	}

	/**
	* Returns the last registration details in the ordered set where registrationDetailsId = &#63;.
	*
	* @param registrationDetailsId the registration details ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration details
	* @throws com.ocms.course.NoSuchRegistrationDetailsException if a matching registration details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.RegistrationDetails findByRegistrationDetailsId_Last(
		long registrationDetailsId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchRegistrationDetailsException {
		return getPersistence()
				   .findByRegistrationDetailsId_Last(registrationDetailsId,
			orderByComparator);
	}

	/**
	* Returns the last registration details in the ordered set where registrationDetailsId = &#63;.
	*
	* @param registrationDetailsId the registration details ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration details, or <code>null</code> if a matching registration details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.RegistrationDetails fetchByRegistrationDetailsId_Last(
		long registrationDetailsId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRegistrationDetailsId_Last(registrationDetailsId,
			orderByComparator);
	}

	/**
	* Removes all the registration detailses where registrationDetailsId = &#63; from the database.
	*
	* @param registrationDetailsId the registration details ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByRegistrationDetailsId(long registrationDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByRegistrationDetailsId(registrationDetailsId);
	}

	/**
	* Returns the number of registration detailses where registrationDetailsId = &#63;.
	*
	* @param registrationDetailsId the registration details ID
	* @return the number of matching registration detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRegistrationDetailsId(long registrationDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByRegistrationDetailsId(registrationDetailsId);
	}

	/**
	* Caches the registration details in the entity cache if it is enabled.
	*
	* @param registrationDetails the registration details
	*/
	public static void cacheResult(
		com.ocms.course.model.RegistrationDetails registrationDetails) {
		getPersistence().cacheResult(registrationDetails);
	}

	/**
	* Caches the registration detailses in the entity cache if it is enabled.
	*
	* @param registrationDetailses the registration detailses
	*/
	public static void cacheResult(
		java.util.List<com.ocms.course.model.RegistrationDetails> registrationDetailses) {
		getPersistence().cacheResult(registrationDetailses);
	}

	/**
	* Creates a new registration details with the primary key. Does not add the registration details to the database.
	*
	* @param registrationDetailsId the primary key for the new registration details
	* @return the new registration details
	*/
	public static com.ocms.course.model.RegistrationDetails create(
		long registrationDetailsId) {
		return getPersistence().create(registrationDetailsId);
	}

	/**
	* Removes the registration details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param registrationDetailsId the primary key of the registration details
	* @return the registration details that was removed
	* @throws com.ocms.course.NoSuchRegistrationDetailsException if a registration details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.RegistrationDetails remove(
		long registrationDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchRegistrationDetailsException {
		return getPersistence().remove(registrationDetailsId);
	}

	public static com.ocms.course.model.RegistrationDetails updateImpl(
		com.ocms.course.model.RegistrationDetails registrationDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(registrationDetails);
	}

	/**
	* Returns the registration details with the primary key or throws a {@link com.ocms.course.NoSuchRegistrationDetailsException} if it could not be found.
	*
	* @param registrationDetailsId the primary key of the registration details
	* @return the registration details
	* @throws com.ocms.course.NoSuchRegistrationDetailsException if a registration details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.RegistrationDetails findByPrimaryKey(
		long registrationDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchRegistrationDetailsException {
		return getPersistence().findByPrimaryKey(registrationDetailsId);
	}

	/**
	* Returns the registration details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param registrationDetailsId the primary key of the registration details
	* @return the registration details, or <code>null</code> if a registration details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.RegistrationDetails fetchByPrimaryKey(
		long registrationDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(registrationDetailsId);
	}

	/**
	* Returns all the registration detailses.
	*
	* @return the registration detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.RegistrationDetails> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the registration detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.RegistrationDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of registration detailses
	* @param end the upper bound of the range of registration detailses (not inclusive)
	* @return the range of registration detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.RegistrationDetails> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the registration detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.RegistrationDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of registration detailses
	* @param end the upper bound of the range of registration detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of registration detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.RegistrationDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the registration detailses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of registration detailses.
	*
	* @return the number of registration detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static RegistrationDetailsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (RegistrationDetailsPersistence)PortletBeanLocatorUtil.locate(com.ocms.course.service.ClpSerializer.getServletContextName(),
					RegistrationDetailsPersistence.class.getName());

			ReferenceRegistry.registerReference(RegistrationDetailsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(RegistrationDetailsPersistence persistence) {
	}

	private static RegistrationDetailsPersistence _persistence;
}