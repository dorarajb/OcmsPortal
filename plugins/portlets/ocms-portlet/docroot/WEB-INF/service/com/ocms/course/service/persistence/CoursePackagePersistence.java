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

import com.ocms.course.model.CoursePackage;

/**
 * The persistence interface for the course package service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author doraraj
 * @see CoursePackagePersistenceImpl
 * @see CoursePackageUtil
 * @generated
 */
public interface CoursePackagePersistence extends BasePersistence<CoursePackage> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CoursePackageUtil} to access the course package persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the course packages where coursePackageId = &#63;.
	*
	* @param coursePackageId the course package ID
	* @return the matching course packages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CoursePackage> findByCoursePackageId(
		long coursePackageId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.CoursePackage> findByCoursePackageId(
		long coursePackageId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.CoursePackage> findByCoursePackageId(
		long coursePackageId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first course package in the ordered set where coursePackageId = &#63;.
	*
	* @param coursePackageId the course package ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course package
	* @throws com.ocms.course.NoSuchCoursePackageException if a matching course package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CoursePackage findByCoursePackageId_First(
		long coursePackageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCoursePackageException;

	/**
	* Returns the first course package in the ordered set where coursePackageId = &#63;.
	*
	* @param coursePackageId the course package ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course package, or <code>null</code> if a matching course package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CoursePackage fetchByCoursePackageId_First(
		long coursePackageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last course package in the ordered set where coursePackageId = &#63;.
	*
	* @param coursePackageId the course package ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course package
	* @throws com.ocms.course.NoSuchCoursePackageException if a matching course package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CoursePackage findByCoursePackageId_Last(
		long coursePackageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCoursePackageException;

	/**
	* Returns the last course package in the ordered set where coursePackageId = &#63;.
	*
	* @param coursePackageId the course package ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course package, or <code>null</code> if a matching course package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CoursePackage fetchByCoursePackageId_Last(
		long coursePackageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the course packages where coursePackageId = &#63; from the database.
	*
	* @param coursePackageId the course package ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCoursePackageId(long coursePackageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of course packages where coursePackageId = &#63;.
	*
	* @param coursePackageId the course package ID
	* @return the number of matching course packages
	* @throws SystemException if a system exception occurred
	*/
	public int countByCoursePackageId(long coursePackageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the course packages where name = &#63;.
	*
	* @param name the name
	* @return the matching course packages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CoursePackage> findByName(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.CoursePackage> findByName(
		java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.CoursePackage> findByName(
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first course package in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course package
	* @throws com.ocms.course.NoSuchCoursePackageException if a matching course package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CoursePackage findByName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCoursePackageException;

	/**
	* Returns the first course package in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course package, or <code>null</code> if a matching course package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CoursePackage fetchByName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last course package in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course package
	* @throws com.ocms.course.NoSuchCoursePackageException if a matching course package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CoursePackage findByName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCoursePackageException;

	/**
	* Returns the last course package in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course package, or <code>null</code> if a matching course package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CoursePackage fetchByName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ocms.course.model.CoursePackage[] findByName_PrevAndNext(
		long coursePackageId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCoursePackageException;

	/**
	* Removes all the course packages where name = &#63; from the database.
	*
	* @param name the name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByName(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of course packages where name = &#63;.
	*
	* @param name the name
	* @return the number of matching course packages
	* @throws SystemException if a system exception occurred
	*/
	public int countByName(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the course packages where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching course packages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CoursePackage> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.CoursePackage> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.CoursePackage> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first course package in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course package
	* @throws com.ocms.course.NoSuchCoursePackageException if a matching course package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CoursePackage findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCoursePackageException;

	/**
	* Returns the first course package in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course package, or <code>null</code> if a matching course package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CoursePackage fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last course package in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course package
	* @throws com.ocms.course.NoSuchCoursePackageException if a matching course package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CoursePackage findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCoursePackageException;

	/**
	* Returns the last course package in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course package, or <code>null</code> if a matching course package could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CoursePackage fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.ocms.course.model.CoursePackage[] findByGroupId_PrevAndNext(
		long coursePackageId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCoursePackageException;

	/**
	* Removes all the course packages where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of course packages where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching course packages
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the course package in the entity cache if it is enabled.
	*
	* @param coursePackage the course package
	*/
	public void cacheResult(com.ocms.course.model.CoursePackage coursePackage);

	/**
	* Caches the course packages in the entity cache if it is enabled.
	*
	* @param coursePackages the course packages
	*/
	public void cacheResult(
		java.util.List<com.ocms.course.model.CoursePackage> coursePackages);

	/**
	* Creates a new course package with the primary key. Does not add the course package to the database.
	*
	* @param coursePackageId the primary key for the new course package
	* @return the new course package
	*/
	public com.ocms.course.model.CoursePackage create(long coursePackageId);

	/**
	* Removes the course package with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param coursePackageId the primary key of the course package
	* @return the course package that was removed
	* @throws com.ocms.course.NoSuchCoursePackageException if a course package with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CoursePackage remove(long coursePackageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCoursePackageException;

	public com.ocms.course.model.CoursePackage updateImpl(
		com.ocms.course.model.CoursePackage coursePackage)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the course package with the primary key or throws a {@link com.ocms.course.NoSuchCoursePackageException} if it could not be found.
	*
	* @param coursePackageId the primary key of the course package
	* @return the course package
	* @throws com.ocms.course.NoSuchCoursePackageException if a course package with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CoursePackage findByPrimaryKey(
		long coursePackageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCoursePackageException;

	/**
	* Returns the course package with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param coursePackageId the primary key of the course package
	* @return the course package, or <code>null</code> if a course package with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CoursePackage fetchByPrimaryKey(
		long coursePackageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the course packages.
	*
	* @return the course packages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CoursePackage> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.CoursePackage> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.CoursePackage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the course packages from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of course packages.
	*
	* @return the number of course packages
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}