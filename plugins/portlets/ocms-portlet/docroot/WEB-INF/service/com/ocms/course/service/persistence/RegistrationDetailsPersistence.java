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

import com.ocms.course.model.RegistrationDetails;

/**
 * The persistence interface for the registration details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author doraraj
 * @see RegistrationDetailsPersistenceImpl
 * @see RegistrationDetailsUtil
 * @generated
 */
public interface RegistrationDetailsPersistence extends BasePersistence<RegistrationDetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RegistrationDetailsUtil} to access the registration details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the registration detailses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching registration detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.RegistrationDetails> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.RegistrationDetails> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.RegistrationDetails> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first registration details in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration details
	* @throws com.ocms.course.NoSuchRegistrationDetailsException if a matching registration details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.RegistrationDetails findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchRegistrationDetailsException;

	/**
	* Returns the first registration details in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration details, or <code>null</code> if a matching registration details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.RegistrationDetails fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last registration details in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration details
	* @throws com.ocms.course.NoSuchRegistrationDetailsException if a matching registration details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.RegistrationDetails findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchRegistrationDetailsException;

	/**
	* Returns the last registration details in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration details, or <code>null</code> if a matching registration details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.RegistrationDetails fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ocms.course.model.RegistrationDetails[] findByGroupId_PrevAndNext(
		long registrationDetailsId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchRegistrationDetailsException;

	/**
	* Removes all the registration detailses where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of registration detailses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching registration detailses
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the registration detailses where registrationDetailsId = &#63;.
	*
	* @param registrationDetailsId the registration details ID
	* @return the matching registration detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.RegistrationDetails> findByRegistrationDetailsId(
		long registrationDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.RegistrationDetails> findByRegistrationDetailsId(
		long registrationDetailsId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.RegistrationDetails> findByRegistrationDetailsId(
		long registrationDetailsId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first registration details in the ordered set where registrationDetailsId = &#63;.
	*
	* @param registrationDetailsId the registration details ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration details
	* @throws com.ocms.course.NoSuchRegistrationDetailsException if a matching registration details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.RegistrationDetails findByRegistrationDetailsId_First(
		long registrationDetailsId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchRegistrationDetailsException;

	/**
	* Returns the first registration details in the ordered set where registrationDetailsId = &#63;.
	*
	* @param registrationDetailsId the registration details ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration details, or <code>null</code> if a matching registration details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.RegistrationDetails fetchByRegistrationDetailsId_First(
		long registrationDetailsId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last registration details in the ordered set where registrationDetailsId = &#63;.
	*
	* @param registrationDetailsId the registration details ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration details
	* @throws com.ocms.course.NoSuchRegistrationDetailsException if a matching registration details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.RegistrationDetails findByRegistrationDetailsId_Last(
		long registrationDetailsId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchRegistrationDetailsException;

	/**
	* Returns the last registration details in the ordered set where registrationDetailsId = &#63;.
	*
	* @param registrationDetailsId the registration details ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration details, or <code>null</code> if a matching registration details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.RegistrationDetails fetchByRegistrationDetailsId_Last(
		long registrationDetailsId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the registration detailses where registrationDetailsId = &#63; from the database.
	*
	* @param registrationDetailsId the registration details ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByRegistrationDetailsId(long registrationDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of registration detailses where registrationDetailsId = &#63;.
	*
	* @param registrationDetailsId the registration details ID
	* @return the number of matching registration detailses
	* @throws SystemException if a system exception occurred
	*/
	public int countByRegistrationDetailsId(long registrationDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the registration details in the entity cache if it is enabled.
	*
	* @param registrationDetails the registration details
	*/
	public void cacheResult(
		com.ocms.course.model.RegistrationDetails registrationDetails);

	/**
	* Caches the registration detailses in the entity cache if it is enabled.
	*
	* @param registrationDetailses the registration detailses
	*/
	public void cacheResult(
		java.util.List<com.ocms.course.model.RegistrationDetails> registrationDetailses);

	/**
	* Creates a new registration details with the primary key. Does not add the registration details to the database.
	*
	* @param registrationDetailsId the primary key for the new registration details
	* @return the new registration details
	*/
	public com.ocms.course.model.RegistrationDetails create(
		long registrationDetailsId);

	/**
	* Removes the registration details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param registrationDetailsId the primary key of the registration details
	* @return the registration details that was removed
	* @throws com.ocms.course.NoSuchRegistrationDetailsException if a registration details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.RegistrationDetails remove(
		long registrationDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchRegistrationDetailsException;

	public com.ocms.course.model.RegistrationDetails updateImpl(
		com.ocms.course.model.RegistrationDetails registrationDetails)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the registration details with the primary key or throws a {@link com.ocms.course.NoSuchRegistrationDetailsException} if it could not be found.
	*
	* @param registrationDetailsId the primary key of the registration details
	* @return the registration details
	* @throws com.ocms.course.NoSuchRegistrationDetailsException if a registration details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.RegistrationDetails findByPrimaryKey(
		long registrationDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchRegistrationDetailsException;

	/**
	* Returns the registration details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param registrationDetailsId the primary key of the registration details
	* @return the registration details, or <code>null</code> if a registration details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.RegistrationDetails fetchByPrimaryKey(
		long registrationDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the registration detailses.
	*
	* @return the registration detailses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.RegistrationDetails> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.RegistrationDetails> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.RegistrationDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the registration detailses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of registration detailses.
	*
	* @return the number of registration detailses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}