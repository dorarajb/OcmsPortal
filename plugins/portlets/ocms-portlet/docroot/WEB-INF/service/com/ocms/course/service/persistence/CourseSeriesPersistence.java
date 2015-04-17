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

import com.ocms.course.model.CourseSeries;

/**
 * The persistence interface for the course series service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author doraraj
 * @see CourseSeriesPersistenceImpl
 * @see CourseSeriesUtil
 * @generated
 */
public interface CourseSeriesPersistence extends BasePersistence<CourseSeries> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CourseSeriesUtil} to access the course series persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the course serieses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CourseSeries> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the course serieses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of course serieses
	* @param end the upper bound of the range of course serieses (not inclusive)
	* @return the range of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CourseSeries> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the course serieses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of course serieses
	* @param end the upper bound of the range of course serieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CourseSeries> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first course series in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException;

	/**
	* Returns the first course series in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last course series in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException;

	/**
	* Returns the last course series in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the course serieses before and after the current course series in the ordered set where groupId = &#63;.
	*
	* @param courseSeriesId the primary key of the current course series
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a course series with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries[] findByGroupId_PrevAndNext(
		long courseSeriesId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException;

	/**
	* Removes all the course serieses where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of course serieses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the course serieses where courseSeriesId = &#63;.
	*
	* @param courseSeriesId the course series ID
	* @return the matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CourseSeries> findBycourseSeriesId(
		long courseSeriesId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the course serieses where courseSeriesId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param courseSeriesId the course series ID
	* @param start the lower bound of the range of course serieses
	* @param end the upper bound of the range of course serieses (not inclusive)
	* @return the range of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CourseSeries> findBycourseSeriesId(
		long courseSeriesId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the course serieses where courseSeriesId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param courseSeriesId the course series ID
	* @param start the lower bound of the range of course serieses
	* @param end the upper bound of the range of course serieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CourseSeries> findBycourseSeriesId(
		long courseSeriesId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first course series in the ordered set where courseSeriesId = &#63;.
	*
	* @param courseSeriesId the course series ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries findBycourseSeriesId_First(
		long courseSeriesId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException;

	/**
	* Returns the first course series in the ordered set where courseSeriesId = &#63;.
	*
	* @param courseSeriesId the course series ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries fetchBycourseSeriesId_First(
		long courseSeriesId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last course series in the ordered set where courseSeriesId = &#63;.
	*
	* @param courseSeriesId the course series ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries findBycourseSeriesId_Last(
		long courseSeriesId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException;

	/**
	* Returns the last course series in the ordered set where courseSeriesId = &#63;.
	*
	* @param courseSeriesId the course series ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries fetchBycourseSeriesId_Last(
		long courseSeriesId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the course serieses where courseSeriesId = &#63; from the database.
	*
	* @param courseSeriesId the course series ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBycourseSeriesId(long courseSeriesId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of course serieses where courseSeriesId = &#63;.
	*
	* @param courseSeriesId the course series ID
	* @return the number of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public int countBycourseSeriesId(long courseSeriesId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the course serieses where courseId = &#63;.
	*
	* @param courseId the course ID
	* @return the matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CourseSeries> findByCourseId(
		long courseId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the course serieses where courseId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param courseId the course ID
	* @param start the lower bound of the range of course serieses
	* @param end the upper bound of the range of course serieses (not inclusive)
	* @return the range of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CourseSeries> findByCourseId(
		long courseId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the course serieses where courseId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param courseId the course ID
	* @param start the lower bound of the range of course serieses
	* @param end the upper bound of the range of course serieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CourseSeries> findByCourseId(
		long courseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first course series in the ordered set where courseId = &#63;.
	*
	* @param courseId the course ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries findByCourseId_First(
		long courseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException;

	/**
	* Returns the first course series in the ordered set where courseId = &#63;.
	*
	* @param courseId the course ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries fetchByCourseId_First(
		long courseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last course series in the ordered set where courseId = &#63;.
	*
	* @param courseId the course ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries findByCourseId_Last(
		long courseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException;

	/**
	* Returns the last course series in the ordered set where courseId = &#63;.
	*
	* @param courseId the course ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries fetchByCourseId_Last(
		long courseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the course serieses before and after the current course series in the ordered set where courseId = &#63;.
	*
	* @param courseSeriesId the primary key of the current course series
	* @param courseId the course ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a course series with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries[] findByCourseId_PrevAndNext(
		long courseSeriesId, long courseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException;

	/**
	* Removes all the course serieses where courseId = &#63; from the database.
	*
	* @param courseId the course ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCourseId(long courseId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of course serieses where courseId = &#63;.
	*
	* @param courseId the course ID
	* @return the number of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public int countByCourseId(long courseId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the course serieses where locationId = &#63;.
	*
	* @param locationId the location ID
	* @return the matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CourseSeries> findByLocationId(
		long locationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the course serieses where locationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param locationId the location ID
	* @param start the lower bound of the range of course serieses
	* @param end the upper bound of the range of course serieses (not inclusive)
	* @return the range of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CourseSeries> findByLocationId(
		long locationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the course serieses where locationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param locationId the location ID
	* @param start the lower bound of the range of course serieses
	* @param end the upper bound of the range of course serieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CourseSeries> findByLocationId(
		long locationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first course series in the ordered set where locationId = &#63;.
	*
	* @param locationId the location ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries findByLocationId_First(
		long locationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException;

	/**
	* Returns the first course series in the ordered set where locationId = &#63;.
	*
	* @param locationId the location ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries fetchByLocationId_First(
		long locationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last course series in the ordered set where locationId = &#63;.
	*
	* @param locationId the location ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries findByLocationId_Last(
		long locationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException;

	/**
	* Returns the last course series in the ordered set where locationId = &#63;.
	*
	* @param locationId the location ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries fetchByLocationId_Last(
		long locationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the course serieses before and after the current course series in the ordered set where locationId = &#63;.
	*
	* @param courseSeriesId the primary key of the current course series
	* @param locationId the location ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a course series with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries[] findByLocationId_PrevAndNext(
		long courseSeriesId, long locationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException;

	/**
	* Removes all the course serieses where locationId = &#63; from the database.
	*
	* @param locationId the location ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByLocationId(long locationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of course serieses where locationId = &#63;.
	*
	* @param locationId the location ID
	* @return the number of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public int countByLocationId(long locationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the course serieses where courseSeriesCode = &#63;.
	*
	* @param courseSeriesCode the course series code
	* @return the matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CourseSeries> findByCourseSeriesCode(
		java.lang.String courseSeriesCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the course serieses where courseSeriesCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param courseSeriesCode the course series code
	* @param start the lower bound of the range of course serieses
	* @param end the upper bound of the range of course serieses (not inclusive)
	* @return the range of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CourseSeries> findByCourseSeriesCode(
		java.lang.String courseSeriesCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the course serieses where courseSeriesCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param courseSeriesCode the course series code
	* @param start the lower bound of the range of course serieses
	* @param end the upper bound of the range of course serieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CourseSeries> findByCourseSeriesCode(
		java.lang.String courseSeriesCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first course series in the ordered set where courseSeriesCode = &#63;.
	*
	* @param courseSeriesCode the course series code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries findByCourseSeriesCode_First(
		java.lang.String courseSeriesCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException;

	/**
	* Returns the first course series in the ordered set where courseSeriesCode = &#63;.
	*
	* @param courseSeriesCode the course series code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries fetchByCourseSeriesCode_First(
		java.lang.String courseSeriesCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last course series in the ordered set where courseSeriesCode = &#63;.
	*
	* @param courseSeriesCode the course series code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries findByCourseSeriesCode_Last(
		java.lang.String courseSeriesCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException;

	/**
	* Returns the last course series in the ordered set where courseSeriesCode = &#63;.
	*
	* @param courseSeriesCode the course series code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries fetchByCourseSeriesCode_Last(
		java.lang.String courseSeriesCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the course serieses before and after the current course series in the ordered set where courseSeriesCode = &#63;.
	*
	* @param courseSeriesId the primary key of the current course series
	* @param courseSeriesCode the course series code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a course series with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries[] findByCourseSeriesCode_PrevAndNext(
		long courseSeriesId, java.lang.String courseSeriesCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException;

	/**
	* Removes all the course serieses where courseSeriesCode = &#63; from the database.
	*
	* @param courseSeriesCode the course series code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCourseSeriesCode(java.lang.String courseSeriesCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of course serieses where courseSeriesCode = &#63;.
	*
	* @param courseSeriesCode the course series code
	* @return the number of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public int countByCourseSeriesCode(java.lang.String courseSeriesCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the course serieses where flagToListData = &#63;.
	*
	* @param flagToListData the flag to list data
	* @return the matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CourseSeries> findByFlagToListData(
		int flagToListData)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the course serieses where flagToListData = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param flagToListData the flag to list data
	* @param start the lower bound of the range of course serieses
	* @param end the upper bound of the range of course serieses (not inclusive)
	* @return the range of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CourseSeries> findByFlagToListData(
		int flagToListData, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the course serieses where flagToListData = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param flagToListData the flag to list data
	* @param start the lower bound of the range of course serieses
	* @param end the upper bound of the range of course serieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CourseSeries> findByFlagToListData(
		int flagToListData, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first course series in the ordered set where flagToListData = &#63;.
	*
	* @param flagToListData the flag to list data
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries findByFlagToListData_First(
		int flagToListData,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException;

	/**
	* Returns the first course series in the ordered set where flagToListData = &#63;.
	*
	* @param flagToListData the flag to list data
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries fetchByFlagToListData_First(
		int flagToListData,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last course series in the ordered set where flagToListData = &#63;.
	*
	* @param flagToListData the flag to list data
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries findByFlagToListData_Last(
		int flagToListData,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException;

	/**
	* Returns the last course series in the ordered set where flagToListData = &#63;.
	*
	* @param flagToListData the flag to list data
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries fetchByFlagToListData_Last(
		int flagToListData,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the course serieses before and after the current course series in the ordered set where flagToListData = &#63;.
	*
	* @param courseSeriesId the primary key of the current course series
	* @param flagToListData the flag to list data
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a course series with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries[] findByFlagToListData_PrevAndNext(
		long courseSeriesId, int flagToListData,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException;

	/**
	* Removes all the course serieses where flagToListData = &#63; from the database.
	*
	* @param flagToListData the flag to list data
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFlagToListData(int flagToListData)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of course serieses where flagToListData = &#63;.
	*
	* @param flagToListData the flag to list data
	* @return the number of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public int countByFlagToListData(int flagToListData)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the course serieses where groupId = &#63; and flagToListData = &#63;.
	*
	* @param groupId the group ID
	* @param flagToListData the flag to list data
	* @return the matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CourseSeries> findByGroupIdAndFlagToListData(
		long groupId, int flagToListData)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the course serieses where groupId = &#63; and flagToListData = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param flagToListData the flag to list data
	* @param start the lower bound of the range of course serieses
	* @param end the upper bound of the range of course serieses (not inclusive)
	* @return the range of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CourseSeries> findByGroupIdAndFlagToListData(
		long groupId, int flagToListData, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the course serieses where groupId = &#63; and flagToListData = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param flagToListData the flag to list data
	* @param start the lower bound of the range of course serieses
	* @param end the upper bound of the range of course serieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CourseSeries> findByGroupIdAndFlagToListData(
		long groupId, int flagToListData, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first course series in the ordered set where groupId = &#63; and flagToListData = &#63;.
	*
	* @param groupId the group ID
	* @param flagToListData the flag to list data
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries findByGroupIdAndFlagToListData_First(
		long groupId, int flagToListData,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException;

	/**
	* Returns the first course series in the ordered set where groupId = &#63; and flagToListData = &#63;.
	*
	* @param groupId the group ID
	* @param flagToListData the flag to list data
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries fetchByGroupIdAndFlagToListData_First(
		long groupId, int flagToListData,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last course series in the ordered set where groupId = &#63; and flagToListData = &#63;.
	*
	* @param groupId the group ID
	* @param flagToListData the flag to list data
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries findByGroupIdAndFlagToListData_Last(
		long groupId, int flagToListData,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException;

	/**
	* Returns the last course series in the ordered set where groupId = &#63; and flagToListData = &#63;.
	*
	* @param groupId the group ID
	* @param flagToListData the flag to list data
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries fetchByGroupIdAndFlagToListData_Last(
		long groupId, int flagToListData,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the course serieses before and after the current course series in the ordered set where groupId = &#63; and flagToListData = &#63;.
	*
	* @param courseSeriesId the primary key of the current course series
	* @param groupId the group ID
	* @param flagToListData the flag to list data
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a course series with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries[] findByGroupIdAndFlagToListData_PrevAndNext(
		long courseSeriesId, long groupId, int flagToListData,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException;

	/**
	* Removes all the course serieses where groupId = &#63; and flagToListData = &#63; from the database.
	*
	* @param groupId the group ID
	* @param flagToListData the flag to list data
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupIdAndFlagToListData(long groupId,
		int flagToListData)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of course serieses where groupId = &#63; and flagToListData = &#63;.
	*
	* @param groupId the group ID
	* @param flagToListData the flag to list data
	* @return the number of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupIdAndFlagToListData(long groupId, int flagToListData)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the course serieses where locationId = &#63; and flagToListData = &#63;.
	*
	* @param locationId the location ID
	* @param flagToListData the flag to list data
	* @return the matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CourseSeries> findBylocationIdAndFlagToListData(
		long locationId, int flagToListData)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the course serieses where locationId = &#63; and flagToListData = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param locationId the location ID
	* @param flagToListData the flag to list data
	* @param start the lower bound of the range of course serieses
	* @param end the upper bound of the range of course serieses (not inclusive)
	* @return the range of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CourseSeries> findBylocationIdAndFlagToListData(
		long locationId, int flagToListData, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the course serieses where locationId = &#63; and flagToListData = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param locationId the location ID
	* @param flagToListData the flag to list data
	* @param start the lower bound of the range of course serieses
	* @param end the upper bound of the range of course serieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CourseSeries> findBylocationIdAndFlagToListData(
		long locationId, int flagToListData, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first course series in the ordered set where locationId = &#63; and flagToListData = &#63;.
	*
	* @param locationId the location ID
	* @param flagToListData the flag to list data
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries findBylocationIdAndFlagToListData_First(
		long locationId, int flagToListData,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException;

	/**
	* Returns the first course series in the ordered set where locationId = &#63; and flagToListData = &#63;.
	*
	* @param locationId the location ID
	* @param flagToListData the flag to list data
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries fetchBylocationIdAndFlagToListData_First(
		long locationId, int flagToListData,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last course series in the ordered set where locationId = &#63; and flagToListData = &#63;.
	*
	* @param locationId the location ID
	* @param flagToListData the flag to list data
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries findBylocationIdAndFlagToListData_Last(
		long locationId, int flagToListData,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException;

	/**
	* Returns the last course series in the ordered set where locationId = &#63; and flagToListData = &#63;.
	*
	* @param locationId the location ID
	* @param flagToListData the flag to list data
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries fetchBylocationIdAndFlagToListData_Last(
		long locationId, int flagToListData,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the course serieses before and after the current course series in the ordered set where locationId = &#63; and flagToListData = &#63;.
	*
	* @param courseSeriesId the primary key of the current course series
	* @param locationId the location ID
	* @param flagToListData the flag to list data
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a course series with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries[] findBylocationIdAndFlagToListData_PrevAndNext(
		long courseSeriesId, long locationId, int flagToListData,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException;

	/**
	* Removes all the course serieses where locationId = &#63; and flagToListData = &#63; from the database.
	*
	* @param locationId the location ID
	* @param flagToListData the flag to list data
	* @throws SystemException if a system exception occurred
	*/
	public void removeBylocationIdAndFlagToListData(long locationId,
		int flagToListData)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of course serieses where locationId = &#63; and flagToListData = &#63;.
	*
	* @param locationId the location ID
	* @param flagToListData the flag to list data
	* @return the number of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public int countBylocationIdAndFlagToListData(long locationId,
		int flagToListData)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the course series in the entity cache if it is enabled.
	*
	* @param courseSeries the course series
	*/
	public void cacheResult(com.ocms.course.model.CourseSeries courseSeries);

	/**
	* Caches the course serieses in the entity cache if it is enabled.
	*
	* @param courseSerieses the course serieses
	*/
	public void cacheResult(
		java.util.List<com.ocms.course.model.CourseSeries> courseSerieses);

	/**
	* Creates a new course series with the primary key. Does not add the course series to the database.
	*
	* @param courseSeriesId the primary key for the new course series
	* @return the new course series
	*/
	public com.ocms.course.model.CourseSeries create(long courseSeriesId);

	/**
	* Removes the course series with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param courseSeriesId the primary key of the course series
	* @return the course series that was removed
	* @throws com.ocms.course.NoSuchCourseSeriesException if a course series with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries remove(long courseSeriesId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException;

	public com.ocms.course.model.CourseSeries updateImpl(
		com.ocms.course.model.CourseSeries courseSeries)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the course series with the primary key or throws a {@link com.ocms.course.NoSuchCourseSeriesException} if it could not be found.
	*
	* @param courseSeriesId the primary key of the course series
	* @return the course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a course series with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries findByPrimaryKey(
		long courseSeriesId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException;

	/**
	* Returns the course series with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param courseSeriesId the primary key of the course series
	* @return the course series, or <code>null</code> if a course series with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.CourseSeries fetchByPrimaryKey(
		long courseSeriesId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the course serieses.
	*
	* @return the course serieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CourseSeries> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the course serieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of course serieses
	* @param end the upper bound of the range of course serieses (not inclusive)
	* @return the range of course serieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CourseSeries> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the course serieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of course serieses
	* @param end the upper bound of the range of course serieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of course serieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.CourseSeries> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the course serieses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of course serieses.
	*
	* @return the number of course serieses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}