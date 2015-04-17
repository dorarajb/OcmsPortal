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

import com.ocms.course.model.StudentRegistration;

import java.util.List;

/**
 * The persistence utility for the student registration service. This utility wraps {@link StudentRegistrationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author doraraj
 * @see StudentRegistrationPersistence
 * @see StudentRegistrationPersistenceImpl
 * @generated
 */
public class StudentRegistrationUtil {
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
	public static void clearCache(StudentRegistration studentRegistration) {
		getPersistence().clearCache(studentRegistration);
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
	public static List<StudentRegistration> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<StudentRegistration> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<StudentRegistration> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static StudentRegistration update(
		StudentRegistration studentRegistration) throws SystemException {
		return getPersistence().update(studentRegistration);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static StudentRegistration update(
		StudentRegistration studentRegistration, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(studentRegistration, serviceContext);
	}

	/**
	* Returns all the student registrations where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching student registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.StudentRegistration> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the student registrations where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.StudentRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of student registrations
	* @param end the upper bound of the range of student registrations (not inclusive)
	* @return the range of matching student registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.StudentRegistration> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the student registrations where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.StudentRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of student registrations
	* @param end the upper bound of the range of student registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching student registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.StudentRegistration> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first student registration in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching student registration
	* @throws com.ocms.course.NoSuchStudentRegistrationException if a matching student registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.StudentRegistration findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchStudentRegistrationException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first student registration in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching student registration, or <code>null</code> if a matching student registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.StudentRegistration fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last student registration in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching student registration
	* @throws com.ocms.course.NoSuchStudentRegistrationException if a matching student registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.StudentRegistration findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchStudentRegistrationException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last student registration in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching student registration, or <code>null</code> if a matching student registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.StudentRegistration fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the student registrations before and after the current student registration in the ordered set where groupId = &#63;.
	*
	* @param studRegId the primary key of the current student registration
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next student registration
	* @throws com.ocms.course.NoSuchStudentRegistrationException if a student registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.StudentRegistration[] findByGroupId_PrevAndNext(
		long studRegId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchStudentRegistrationException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(studRegId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the student registrations where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of student registrations where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching student registrations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the student registrations where studRegId = &#63;.
	*
	* @param studRegId the stud reg ID
	* @return the matching student registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.StudentRegistration> findByStudRegId(
		long studRegId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStudRegId(studRegId);
	}

	/**
	* Returns a range of all the student registrations where studRegId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.StudentRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param studRegId the stud reg ID
	* @param start the lower bound of the range of student registrations
	* @param end the upper bound of the range of student registrations (not inclusive)
	* @return the range of matching student registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.StudentRegistration> findByStudRegId(
		long studRegId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStudRegId(studRegId, start, end);
	}

	/**
	* Returns an ordered range of all the student registrations where studRegId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.StudentRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param studRegId the stud reg ID
	* @param start the lower bound of the range of student registrations
	* @param end the upper bound of the range of student registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching student registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.StudentRegistration> findByStudRegId(
		long studRegId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByStudRegId(studRegId, start, end, orderByComparator);
	}

	/**
	* Returns the first student registration in the ordered set where studRegId = &#63;.
	*
	* @param studRegId the stud reg ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching student registration
	* @throws com.ocms.course.NoSuchStudentRegistrationException if a matching student registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.StudentRegistration findByStudRegId_First(
		long studRegId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchStudentRegistrationException {
		return getPersistence()
				   .findByStudRegId_First(studRegId, orderByComparator);
	}

	/**
	* Returns the first student registration in the ordered set where studRegId = &#63;.
	*
	* @param studRegId the stud reg ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching student registration, or <code>null</code> if a matching student registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.StudentRegistration fetchByStudRegId_First(
		long studRegId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByStudRegId_First(studRegId, orderByComparator);
	}

	/**
	* Returns the last student registration in the ordered set where studRegId = &#63;.
	*
	* @param studRegId the stud reg ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching student registration
	* @throws com.ocms.course.NoSuchStudentRegistrationException if a matching student registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.StudentRegistration findByStudRegId_Last(
		long studRegId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchStudentRegistrationException {
		return getPersistence()
				   .findByStudRegId_Last(studRegId, orderByComparator);
	}

	/**
	* Returns the last student registration in the ordered set where studRegId = &#63;.
	*
	* @param studRegId the stud reg ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching student registration, or <code>null</code> if a matching student registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.StudentRegistration fetchByStudRegId_Last(
		long studRegId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByStudRegId_Last(studRegId, orderByComparator);
	}

	/**
	* Removes all the student registrations where studRegId = &#63; from the database.
	*
	* @param studRegId the stud reg ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByStudRegId(long studRegId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByStudRegId(studRegId);
	}

	/**
	* Returns the number of student registrations where studRegId = &#63;.
	*
	* @param studRegId the stud reg ID
	* @return the number of matching student registrations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByStudRegId(long studRegId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByStudRegId(studRegId);
	}

	/**
	* Caches the student registration in the entity cache if it is enabled.
	*
	* @param studentRegistration the student registration
	*/
	public static void cacheResult(
		com.ocms.course.model.StudentRegistration studentRegistration) {
		getPersistence().cacheResult(studentRegistration);
	}

	/**
	* Caches the student registrations in the entity cache if it is enabled.
	*
	* @param studentRegistrations the student registrations
	*/
	public static void cacheResult(
		java.util.List<com.ocms.course.model.StudentRegistration> studentRegistrations) {
		getPersistence().cacheResult(studentRegistrations);
	}

	/**
	* Creates a new student registration with the primary key. Does not add the student registration to the database.
	*
	* @param studRegId the primary key for the new student registration
	* @return the new student registration
	*/
	public static com.ocms.course.model.StudentRegistration create(
		long studRegId) {
		return getPersistence().create(studRegId);
	}

	/**
	* Removes the student registration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studRegId the primary key of the student registration
	* @return the student registration that was removed
	* @throws com.ocms.course.NoSuchStudentRegistrationException if a student registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.StudentRegistration remove(
		long studRegId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchStudentRegistrationException {
		return getPersistence().remove(studRegId);
	}

	public static com.ocms.course.model.StudentRegistration updateImpl(
		com.ocms.course.model.StudentRegistration studentRegistration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(studentRegistration);
	}

	/**
	* Returns the student registration with the primary key or throws a {@link com.ocms.course.NoSuchStudentRegistrationException} if it could not be found.
	*
	* @param studRegId the primary key of the student registration
	* @return the student registration
	* @throws com.ocms.course.NoSuchStudentRegistrationException if a student registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.StudentRegistration findByPrimaryKey(
		long studRegId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchStudentRegistrationException {
		return getPersistence().findByPrimaryKey(studRegId);
	}

	/**
	* Returns the student registration with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param studRegId the primary key of the student registration
	* @return the student registration, or <code>null</code> if a student registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.StudentRegistration fetchByPrimaryKey(
		long studRegId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(studRegId);
	}

	/**
	* Returns all the student registrations.
	*
	* @return the student registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.StudentRegistration> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the student registrations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.StudentRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of student registrations
	* @param end the upper bound of the range of student registrations (not inclusive)
	* @return the range of student registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.StudentRegistration> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the student registrations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.StudentRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of student registrations
	* @param end the upper bound of the range of student registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of student registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.StudentRegistration> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the student registrations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of student registrations.
	*
	* @return the number of student registrations
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static StudentRegistrationPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (StudentRegistrationPersistence)PortletBeanLocatorUtil.locate(com.ocms.course.service.ClpSerializer.getServletContextName(),
					StudentRegistrationPersistence.class.getName());

			ReferenceRegistry.registerReference(StudentRegistrationUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(StudentRegistrationPersistence persistence) {
	}

	private static StudentRegistrationPersistence _persistence;
}