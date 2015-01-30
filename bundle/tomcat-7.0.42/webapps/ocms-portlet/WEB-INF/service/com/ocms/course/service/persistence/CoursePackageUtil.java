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

import com.ocms.course.model.CoursePackage;

import java.util.List;

/**
 * The persistence utility for the course package service. This utility wraps {@link CoursePackagePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author doraraj
 * @see CoursePackagePersistence
 * @see CoursePackagePersistenceImpl
 * @generated
 */
public class CoursePackageUtil {
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
	public static void clearCache(CoursePackage coursePackage) {
		getPersistence().clearCache(coursePackage);
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
	public static List<CoursePackage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CoursePackage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CoursePackage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CoursePackage update(CoursePackage coursePackage)
		throws SystemException {
		return getPersistence().update(coursePackage);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CoursePackage update(CoursePackage coursePackage,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(coursePackage, serviceContext);
	}

	/**
	* Returns all the course packages where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching course packages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.CoursePackage> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the course packages where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CoursePackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of course packages
	* @param end the upper bound of the range of course packages (not inclusive)
	* @return the range of matching course packages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.CoursePackage> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the course packages where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CoursePackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of course packages
	* @param end the upper bound of the range of course packages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching course packages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.CoursePackage> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first course package in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course package
	* @throws com.ocms.course.NoSuchCoursePackageException if a matching course package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CoursePackage findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCoursePackageException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first course package in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course package, or <code>null</code> if a matching course package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CoursePackage fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last course package in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course package
	* @throws com.ocms.course.NoSuchCoursePackageException if a matching course package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CoursePackage findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCoursePackageException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last course package in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course package, or <code>null</code> if a matching course package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CoursePackage fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the course packages before and after the current course package in the ordered set where groupId = &#63;.
	*
	* @param coursePackageId the primary key of the current course package
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next course package
	* @throws com.ocms.course.NoSuchCoursePackageException if a course package with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CoursePackage[] findByGroupId_PrevAndNext(
		long coursePackageId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCoursePackageException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(coursePackageId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the course packages where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of course packages where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching course packages
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the course packages where coursePackageId = &#63;.
	*
	* @param coursePackageId the course package ID
	* @return the matching course packages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.CoursePackage> findByCoursePackageId(
		long coursePackageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCoursePackageId(coursePackageId);
	}

	/**
	* Returns a range of all the course packages where coursePackageId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CoursePackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param coursePackageId the course package ID
	* @param start the lower bound of the range of course packages
	* @param end the upper bound of the range of course packages (not inclusive)
	* @return the range of matching course packages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.CoursePackage> findByCoursePackageId(
		long coursePackageId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCoursePackageId(coursePackageId, start, end);
	}

	/**
	* Returns an ordered range of all the course packages where coursePackageId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CoursePackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param coursePackageId the course package ID
	* @param start the lower bound of the range of course packages
	* @param end the upper bound of the range of course packages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching course packages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.CoursePackage> findByCoursePackageId(
		long coursePackageId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCoursePackageId(coursePackageId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first course package in the ordered set where coursePackageId = &#63;.
	*
	* @param coursePackageId the course package ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course package
	* @throws com.ocms.course.NoSuchCoursePackageException if a matching course package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CoursePackage findByCoursePackageId_First(
		long coursePackageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCoursePackageException {
		return getPersistence()
				   .findByCoursePackageId_First(coursePackageId,
			orderByComparator);
	}

	/**
	* Returns the first course package in the ordered set where coursePackageId = &#63;.
	*
	* @param coursePackageId the course package ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course package, or <code>null</code> if a matching course package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CoursePackage fetchByCoursePackageId_First(
		long coursePackageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCoursePackageId_First(coursePackageId,
			orderByComparator);
	}

	/**
	* Returns the last course package in the ordered set where coursePackageId = &#63;.
	*
	* @param coursePackageId the course package ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course package
	* @throws com.ocms.course.NoSuchCoursePackageException if a matching course package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CoursePackage findByCoursePackageId_Last(
		long coursePackageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCoursePackageException {
		return getPersistence()
				   .findByCoursePackageId_Last(coursePackageId,
			orderByComparator);
	}

	/**
	* Returns the last course package in the ordered set where coursePackageId = &#63;.
	*
	* @param coursePackageId the course package ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course package, or <code>null</code> if a matching course package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CoursePackage fetchByCoursePackageId_Last(
		long coursePackageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCoursePackageId_Last(coursePackageId,
			orderByComparator);
	}

	/**
	* Removes all the course packages where coursePackageId = &#63; from the database.
	*
	* @param coursePackageId the course package ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCoursePackageId(long coursePackageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCoursePackageId(coursePackageId);
	}

	/**
	* Returns the number of course packages where coursePackageId = &#63;.
	*
	* @param coursePackageId the course package ID
	* @return the number of matching course packages
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCoursePackageId(long coursePackageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCoursePackageId(coursePackageId);
	}

	/**
	* Returns all the course packages where name = &#63;.
	*
	* @param name the name
	* @return the matching course packages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.CoursePackage> findByName(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByName(name);
	}

	/**
	* Returns a range of all the course packages where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CoursePackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of course packages
	* @param end the upper bound of the range of course packages (not inclusive)
	* @return the range of matching course packages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.CoursePackage> findByName(
		java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByName(name, start, end);
	}

	/**
	* Returns an ordered range of all the course packages where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CoursePackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of course packages
	* @param end the upper bound of the range of course packages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching course packages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.CoursePackage> findByName(
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByName(name, start, end, orderByComparator);
	}

	/**
	* Returns the first course package in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course package
	* @throws com.ocms.course.NoSuchCoursePackageException if a matching course package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CoursePackage findByName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCoursePackageException {
		return getPersistence().findByName_First(name, orderByComparator);
	}

	/**
	* Returns the first course package in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course package, or <code>null</code> if a matching course package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CoursePackage fetchByName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByName_First(name, orderByComparator);
	}

	/**
	* Returns the last course package in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course package
	* @throws com.ocms.course.NoSuchCoursePackageException if a matching course package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CoursePackage findByName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCoursePackageException {
		return getPersistence().findByName_Last(name, orderByComparator);
	}

	/**
	* Returns the last course package in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course package, or <code>null</code> if a matching course package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CoursePackage fetchByName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByName_Last(name, orderByComparator);
	}

	/**
	* Returns the course packages before and after the current course package in the ordered set where name = &#63;.
	*
	* @param coursePackageId the primary key of the current course package
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next course package
	* @throws com.ocms.course.NoSuchCoursePackageException if a course package with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CoursePackage[] findByName_PrevAndNext(
		long coursePackageId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCoursePackageException {
		return getPersistence()
				   .findByName_PrevAndNext(coursePackageId, name,
			orderByComparator);
	}

	/**
	* Removes all the course packages where name = &#63; from the database.
	*
	* @param name the name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByName(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByName(name);
	}

	/**
	* Returns the number of course packages where name = &#63;.
	*
	* @param name the name
	* @return the number of matching course packages
	* @throws SystemException if a system exception occurred
	*/
	public static int countByName(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByName(name);
	}

	/**
	* Caches the course package in the entity cache if it is enabled.
	*
	* @param coursePackage the course package
	*/
	public static void cacheResult(
		com.ocms.course.model.CoursePackage coursePackage) {
		getPersistence().cacheResult(coursePackage);
	}

	/**
	* Caches the course packages in the entity cache if it is enabled.
	*
	* @param coursePackages the course packages
	*/
	public static void cacheResult(
		java.util.List<com.ocms.course.model.CoursePackage> coursePackages) {
		getPersistence().cacheResult(coursePackages);
	}

	/**
	* Creates a new course package with the primary key. Does not add the course package to the database.
	*
	* @param coursePackageId the primary key for the new course package
	* @return the new course package
	*/
	public static com.ocms.course.model.CoursePackage create(
		long coursePackageId) {
		return getPersistence().create(coursePackageId);
	}

	/**
	* Removes the course package with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param coursePackageId the primary key of the course package
	* @return the course package that was removed
	* @throws com.ocms.course.NoSuchCoursePackageException if a course package with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CoursePackage remove(
		long coursePackageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCoursePackageException {
		return getPersistence().remove(coursePackageId);
	}

	public static com.ocms.course.model.CoursePackage updateImpl(
		com.ocms.course.model.CoursePackage coursePackage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(coursePackage);
	}

	/**
	* Returns the course package with the primary key or throws a {@link com.ocms.course.NoSuchCoursePackageException} if it could not be found.
	*
	* @param coursePackageId the primary key of the course package
	* @return the course package
	* @throws com.ocms.course.NoSuchCoursePackageException if a course package with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CoursePackage findByPrimaryKey(
		long coursePackageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCoursePackageException {
		return getPersistence().findByPrimaryKey(coursePackageId);
	}

	/**
	* Returns the course package with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param coursePackageId the primary key of the course package
	* @return the course package, or <code>null</code> if a course package with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CoursePackage fetchByPrimaryKey(
		long coursePackageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(coursePackageId);
	}

	/**
	* Returns all the course packages.
	*
	* @return the course packages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.CoursePackage> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the course packages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CoursePackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of course packages
	* @param end the upper bound of the range of course packages (not inclusive)
	* @return the range of course packages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.CoursePackage> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the course packages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CoursePackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of course packages
	* @param end the upper bound of the range of course packages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of course packages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.CoursePackage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the course packages from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of course packages.
	*
	* @return the number of course packages
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CoursePackagePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CoursePackagePersistence)PortletBeanLocatorUtil.locate(com.ocms.course.service.ClpSerializer.getServletContextName(),
					CoursePackagePersistence.class.getName());

			ReferenceRegistry.registerReference(CoursePackageUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CoursePackagePersistence persistence) {
	}

	private static CoursePackagePersistence _persistence;
}