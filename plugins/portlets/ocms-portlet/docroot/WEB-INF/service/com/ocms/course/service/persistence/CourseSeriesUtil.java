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

import com.ocms.course.model.CourseSeries;

import java.util.List;

/**
 * The persistence utility for the course series service. This utility wraps {@link CourseSeriesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author doraraj
 * @see CourseSeriesPersistence
 * @see CourseSeriesPersistenceImpl
 * @generated
 */
public class CourseSeriesUtil {
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
	public static void clearCache(CourseSeries courseSeries) {
		getPersistence().clearCache(courseSeries);
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
	public static List<CourseSeries> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CourseSeries> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CourseSeries> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CourseSeries update(CourseSeries courseSeries)
		throws SystemException {
		return getPersistence().update(courseSeries);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CourseSeries update(CourseSeries courseSeries,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(courseSeries, serviceContext);
	}

	/**
	* Returns all the course serieses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.CourseSeries> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

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
	public static java.util.List<com.ocms.course.model.CourseSeries> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

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
	public static java.util.List<com.ocms.course.model.CourseSeries> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first course series in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first course series in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last course series in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last course series in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

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
	public static com.ocms.course.model.CourseSeries[] findByGroupId_PrevAndNext(
		long courseSeriesId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(courseSeriesId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the course serieses where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of course serieses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the course serieses where courseSeriesId = &#63;.
	*
	* @param courseSeriesId the course series ID
	* @return the matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.CourseSeries> findBycourseSeriesId(
		long courseSeriesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBycourseSeriesId(courseSeriesId);
	}

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
	public static java.util.List<com.ocms.course.model.CourseSeries> findBycourseSeriesId(
		long courseSeriesId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBycourseSeriesId(courseSeriesId, start, end);
	}

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
	public static java.util.List<com.ocms.course.model.CourseSeries> findBycourseSeriesId(
		long courseSeriesId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBycourseSeriesId(courseSeriesId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first course series in the ordered set where courseSeriesId = &#63;.
	*
	* @param courseSeriesId the course series ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries findBycourseSeriesId_First(
		long courseSeriesId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException {
		return getPersistence()
				   .findBycourseSeriesId_First(courseSeriesId, orderByComparator);
	}

	/**
	* Returns the first course series in the ordered set where courseSeriesId = &#63;.
	*
	* @param courseSeriesId the course series ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries fetchBycourseSeriesId_First(
		long courseSeriesId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBycourseSeriesId_First(courseSeriesId,
			orderByComparator);
	}

	/**
	* Returns the last course series in the ordered set where courseSeriesId = &#63;.
	*
	* @param courseSeriesId the course series ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries findBycourseSeriesId_Last(
		long courseSeriesId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException {
		return getPersistence()
				   .findBycourseSeriesId_Last(courseSeriesId, orderByComparator);
	}

	/**
	* Returns the last course series in the ordered set where courseSeriesId = &#63;.
	*
	* @param courseSeriesId the course series ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries fetchBycourseSeriesId_Last(
		long courseSeriesId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBycourseSeriesId_Last(courseSeriesId, orderByComparator);
	}

	/**
	* Removes all the course serieses where courseSeriesId = &#63; from the database.
	*
	* @param courseSeriesId the course series ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBycourseSeriesId(long courseSeriesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBycourseSeriesId(courseSeriesId);
	}

	/**
	* Returns the number of course serieses where courseSeriesId = &#63;.
	*
	* @param courseSeriesId the course series ID
	* @return the number of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public static int countBycourseSeriesId(long courseSeriesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBycourseSeriesId(courseSeriesId);
	}

	/**
	* Returns all the course serieses where courseId = &#63;.
	*
	* @param courseId the course ID
	* @return the matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.CourseSeries> findByCourseId(
		long courseId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCourseId(courseId);
	}

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
	public static java.util.List<com.ocms.course.model.CourseSeries> findByCourseId(
		long courseId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCourseId(courseId, start, end);
	}

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
	public static java.util.List<com.ocms.course.model.CourseSeries> findByCourseId(
		long courseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCourseId(courseId, start, end, orderByComparator);
	}

	/**
	* Returns the first course series in the ordered set where courseId = &#63;.
	*
	* @param courseId the course ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries findByCourseId_First(
		long courseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException {
		return getPersistence().findByCourseId_First(courseId, orderByComparator);
	}

	/**
	* Returns the first course series in the ordered set where courseId = &#63;.
	*
	* @param courseId the course ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries fetchByCourseId_First(
		long courseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCourseId_First(courseId, orderByComparator);
	}

	/**
	* Returns the last course series in the ordered set where courseId = &#63;.
	*
	* @param courseId the course ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries findByCourseId_Last(
		long courseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException {
		return getPersistence().findByCourseId_Last(courseId, orderByComparator);
	}

	/**
	* Returns the last course series in the ordered set where courseId = &#63;.
	*
	* @param courseId the course ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries fetchByCourseId_Last(
		long courseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCourseId_Last(courseId, orderByComparator);
	}

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
	public static com.ocms.course.model.CourseSeries[] findByCourseId_PrevAndNext(
		long courseSeriesId, long courseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException {
		return getPersistence()
				   .findByCourseId_PrevAndNext(courseSeriesId, courseId,
			orderByComparator);
	}

	/**
	* Removes all the course serieses where courseId = &#63; from the database.
	*
	* @param courseId the course ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCourseId(long courseId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCourseId(courseId);
	}

	/**
	* Returns the number of course serieses where courseId = &#63;.
	*
	* @param courseId the course ID
	* @return the number of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCourseId(long courseId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCourseId(courseId);
	}

	/**
	* Returns all the course serieses where locationId = &#63;.
	*
	* @param locationId the location ID
	* @return the matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.CourseSeries> findByLocationId(
		long locationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLocationId(locationId);
	}

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
	public static java.util.List<com.ocms.course.model.CourseSeries> findByLocationId(
		long locationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLocationId(locationId, start, end);
	}

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
	public static java.util.List<com.ocms.course.model.CourseSeries> findByLocationId(
		long locationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByLocationId(locationId, start, end, orderByComparator);
	}

	/**
	* Returns the first course series in the ordered set where locationId = &#63;.
	*
	* @param locationId the location ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries findByLocationId_First(
		long locationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException {
		return getPersistence()
				   .findByLocationId_First(locationId, orderByComparator);
	}

	/**
	* Returns the first course series in the ordered set where locationId = &#63;.
	*
	* @param locationId the location ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries fetchByLocationId_First(
		long locationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByLocationId_First(locationId, orderByComparator);
	}

	/**
	* Returns the last course series in the ordered set where locationId = &#63;.
	*
	* @param locationId the location ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries findByLocationId_Last(
		long locationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException {
		return getPersistence()
				   .findByLocationId_Last(locationId, orderByComparator);
	}

	/**
	* Returns the last course series in the ordered set where locationId = &#63;.
	*
	* @param locationId the location ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries fetchByLocationId_Last(
		long locationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByLocationId_Last(locationId, orderByComparator);
	}

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
	public static com.ocms.course.model.CourseSeries[] findByLocationId_PrevAndNext(
		long courseSeriesId, long locationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException {
		return getPersistence()
				   .findByLocationId_PrevAndNext(courseSeriesId, locationId,
			orderByComparator);
	}

	/**
	* Removes all the course serieses where locationId = &#63; from the database.
	*
	* @param locationId the location ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByLocationId(long locationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByLocationId(locationId);
	}

	/**
	* Returns the number of course serieses where locationId = &#63;.
	*
	* @param locationId the location ID
	* @return the number of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByLocationId(long locationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByLocationId(locationId);
	}

	/**
	* Returns all the course serieses where courseSeriesCode = &#63;.
	*
	* @param courseSeriesCode the course series code
	* @return the matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.CourseSeries> findByCourseSeriesCode(
		java.lang.String courseSeriesCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCourseSeriesCode(courseSeriesCode);
	}

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
	public static java.util.List<com.ocms.course.model.CourseSeries> findByCourseSeriesCode(
		java.lang.String courseSeriesCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCourseSeriesCode(courseSeriesCode, start, end);
	}

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
	public static java.util.List<com.ocms.course.model.CourseSeries> findByCourseSeriesCode(
		java.lang.String courseSeriesCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCourseSeriesCode(courseSeriesCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first course series in the ordered set where courseSeriesCode = &#63;.
	*
	* @param courseSeriesCode the course series code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries findByCourseSeriesCode_First(
		java.lang.String courseSeriesCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException {
		return getPersistence()
				   .findByCourseSeriesCode_First(courseSeriesCode,
			orderByComparator);
	}

	/**
	* Returns the first course series in the ordered set where courseSeriesCode = &#63;.
	*
	* @param courseSeriesCode the course series code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries fetchByCourseSeriesCode_First(
		java.lang.String courseSeriesCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCourseSeriesCode_First(courseSeriesCode,
			orderByComparator);
	}

	/**
	* Returns the last course series in the ordered set where courseSeriesCode = &#63;.
	*
	* @param courseSeriesCode the course series code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries findByCourseSeriesCode_Last(
		java.lang.String courseSeriesCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException {
		return getPersistence()
				   .findByCourseSeriesCode_Last(courseSeriesCode,
			orderByComparator);
	}

	/**
	* Returns the last course series in the ordered set where courseSeriesCode = &#63;.
	*
	* @param courseSeriesCode the course series code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries fetchByCourseSeriesCode_Last(
		java.lang.String courseSeriesCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCourseSeriesCode_Last(courseSeriesCode,
			orderByComparator);
	}

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
	public static com.ocms.course.model.CourseSeries[] findByCourseSeriesCode_PrevAndNext(
		long courseSeriesId, java.lang.String courseSeriesCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException {
		return getPersistence()
				   .findByCourseSeriesCode_PrevAndNext(courseSeriesId,
			courseSeriesCode, orderByComparator);
	}

	/**
	* Removes all the course serieses where courseSeriesCode = &#63; from the database.
	*
	* @param courseSeriesCode the course series code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCourseSeriesCode(
		java.lang.String courseSeriesCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCourseSeriesCode(courseSeriesCode);
	}

	/**
	* Returns the number of course serieses where courseSeriesCode = &#63;.
	*
	* @param courseSeriesCode the course series code
	* @return the number of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCourseSeriesCode(java.lang.String courseSeriesCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCourseSeriesCode(courseSeriesCode);
	}

	/**
	* Returns all the course serieses where flagToListData = &#63;.
	*
	* @param flagToListData the flag to list data
	* @return the matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.CourseSeries> findByFlagToListData(
		int flagToListData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFlagToListData(flagToListData);
	}

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
	public static java.util.List<com.ocms.course.model.CourseSeries> findByFlagToListData(
		int flagToListData, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFlagToListData(flagToListData, start, end);
	}

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
	public static java.util.List<com.ocms.course.model.CourseSeries> findByFlagToListData(
		int flagToListData, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFlagToListData(flagToListData, start, end,
			orderByComparator);
	}

	/**
	* Returns the first course series in the ordered set where flagToListData = &#63;.
	*
	* @param flagToListData the flag to list data
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries findByFlagToListData_First(
		int flagToListData,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException {
		return getPersistence()
				   .findByFlagToListData_First(flagToListData, orderByComparator);
	}

	/**
	* Returns the first course series in the ordered set where flagToListData = &#63;.
	*
	* @param flagToListData the flag to list data
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries fetchByFlagToListData_First(
		int flagToListData,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFlagToListData_First(flagToListData,
			orderByComparator);
	}

	/**
	* Returns the last course series in the ordered set where flagToListData = &#63;.
	*
	* @param flagToListData the flag to list data
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries findByFlagToListData_Last(
		int flagToListData,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException {
		return getPersistence()
				   .findByFlagToListData_Last(flagToListData, orderByComparator);
	}

	/**
	* Returns the last course series in the ordered set where flagToListData = &#63;.
	*
	* @param flagToListData the flag to list data
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries fetchByFlagToListData_Last(
		int flagToListData,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFlagToListData_Last(flagToListData, orderByComparator);
	}

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
	public static com.ocms.course.model.CourseSeries[] findByFlagToListData_PrevAndNext(
		long courseSeriesId, int flagToListData,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException {
		return getPersistence()
				   .findByFlagToListData_PrevAndNext(courseSeriesId,
			flagToListData, orderByComparator);
	}

	/**
	* Removes all the course serieses where flagToListData = &#63; from the database.
	*
	* @param flagToListData the flag to list data
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFlagToListData(int flagToListData)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByFlagToListData(flagToListData);
	}

	/**
	* Returns the number of course serieses where flagToListData = &#63;.
	*
	* @param flagToListData the flag to list data
	* @return the number of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFlagToListData(int flagToListData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByFlagToListData(flagToListData);
	}

	/**
	* Returns all the course serieses where groupId = &#63; and flagToListData = &#63;.
	*
	* @param groupId the group ID
	* @param flagToListData the flag to list data
	* @return the matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.CourseSeries> findByGroupIdAndFlagToListData(
		long groupId, int flagToListData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupIdAndFlagToListData(groupId, flagToListData);
	}

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
	public static java.util.List<com.ocms.course.model.CourseSeries> findByGroupIdAndFlagToListData(
		long groupId, int flagToListData, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupIdAndFlagToListData(groupId, flagToListData,
			start, end);
	}

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
	public static java.util.List<com.ocms.course.model.CourseSeries> findByGroupIdAndFlagToListData(
		long groupId, int flagToListData, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupIdAndFlagToListData(groupId, flagToListData,
			start, end, orderByComparator);
	}

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
	public static com.ocms.course.model.CourseSeries findByGroupIdAndFlagToListData_First(
		long groupId, int flagToListData,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException {
		return getPersistence()
				   .findByGroupIdAndFlagToListData_First(groupId,
			flagToListData, orderByComparator);
	}

	/**
	* Returns the first course series in the ordered set where groupId = &#63; and flagToListData = &#63;.
	*
	* @param groupId the group ID
	* @param flagToListData the flag to list data
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries fetchByGroupIdAndFlagToListData_First(
		long groupId, int flagToListData,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroupIdAndFlagToListData_First(groupId,
			flagToListData, orderByComparator);
	}

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
	public static com.ocms.course.model.CourseSeries findByGroupIdAndFlagToListData_Last(
		long groupId, int flagToListData,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException {
		return getPersistence()
				   .findByGroupIdAndFlagToListData_Last(groupId,
			flagToListData, orderByComparator);
	}

	/**
	* Returns the last course series in the ordered set where groupId = &#63; and flagToListData = &#63;.
	*
	* @param groupId the group ID
	* @param flagToListData the flag to list data
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries fetchByGroupIdAndFlagToListData_Last(
		long groupId, int flagToListData,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByGroupIdAndFlagToListData_Last(groupId,
			flagToListData, orderByComparator);
	}

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
	public static com.ocms.course.model.CourseSeries[] findByGroupIdAndFlagToListData_PrevAndNext(
		long courseSeriesId, long groupId, int flagToListData,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException {
		return getPersistence()
				   .findByGroupIdAndFlagToListData_PrevAndNext(courseSeriesId,
			groupId, flagToListData, orderByComparator);
	}

	/**
	* Removes all the course serieses where groupId = &#63; and flagToListData = &#63; from the database.
	*
	* @param groupId the group ID
	* @param flagToListData the flag to list data
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupIdAndFlagToListData(long groupId,
		int flagToListData)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByGroupIdAndFlagToListData(groupId, flagToListData);
	}

	/**
	* Returns the number of course serieses where groupId = &#63; and flagToListData = &#63;.
	*
	* @param groupId the group ID
	* @param flagToListData the flag to list data
	* @return the number of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupIdAndFlagToListData(long groupId,
		int flagToListData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByGroupIdAndFlagToListData(groupId, flagToListData);
	}

	/**
	* Returns all the course serieses where locationId = &#63; and flagToListData = &#63;.
	*
	* @param locationId the location ID
	* @param flagToListData the flag to list data
	* @return the matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.CourseSeries> findBylocationIdAndFlagToListData(
		long locationId, int flagToListData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBylocationIdAndFlagToListData(locationId, flagToListData);
	}

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
	public static java.util.List<com.ocms.course.model.CourseSeries> findBylocationIdAndFlagToListData(
		long locationId, int flagToListData, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBylocationIdAndFlagToListData(locationId,
			flagToListData, start, end);
	}

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
	public static java.util.List<com.ocms.course.model.CourseSeries> findBylocationIdAndFlagToListData(
		long locationId, int flagToListData, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBylocationIdAndFlagToListData(locationId,
			flagToListData, start, end, orderByComparator);
	}

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
	public static com.ocms.course.model.CourseSeries findBylocationIdAndFlagToListData_First(
		long locationId, int flagToListData,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException {
		return getPersistence()
				   .findBylocationIdAndFlagToListData_First(locationId,
			flagToListData, orderByComparator);
	}

	/**
	* Returns the first course series in the ordered set where locationId = &#63; and flagToListData = &#63;.
	*
	* @param locationId the location ID
	* @param flagToListData the flag to list data
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries fetchBylocationIdAndFlagToListData_First(
		long locationId, int flagToListData,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBylocationIdAndFlagToListData_First(locationId,
			flagToListData, orderByComparator);
	}

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
	public static com.ocms.course.model.CourseSeries findBylocationIdAndFlagToListData_Last(
		long locationId, int flagToListData,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException {
		return getPersistence()
				   .findBylocationIdAndFlagToListData_Last(locationId,
			flagToListData, orderByComparator);
	}

	/**
	* Returns the last course series in the ordered set where locationId = &#63; and flagToListData = &#63;.
	*
	* @param locationId the location ID
	* @param flagToListData the flag to list data
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course series, or <code>null</code> if a matching course series could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries fetchBylocationIdAndFlagToListData_Last(
		long locationId, int flagToListData,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBylocationIdAndFlagToListData_Last(locationId,
			flagToListData, orderByComparator);
	}

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
	public static com.ocms.course.model.CourseSeries[] findBylocationIdAndFlagToListData_PrevAndNext(
		long courseSeriesId, long locationId, int flagToListData,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException {
		return getPersistence()
				   .findBylocationIdAndFlagToListData_PrevAndNext(courseSeriesId,
			locationId, flagToListData, orderByComparator);
	}

	/**
	* Removes all the course serieses where locationId = &#63; and flagToListData = &#63; from the database.
	*
	* @param locationId the location ID
	* @param flagToListData the flag to list data
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBylocationIdAndFlagToListData(long locationId,
		int flagToListData)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeBylocationIdAndFlagToListData(locationId, flagToListData);
	}

	/**
	* Returns the number of course serieses where locationId = &#63; and flagToListData = &#63;.
	*
	* @param locationId the location ID
	* @param flagToListData the flag to list data
	* @return the number of matching course serieses
	* @throws SystemException if a system exception occurred
	*/
	public static int countBylocationIdAndFlagToListData(long locationId,
		int flagToListData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBylocationIdAndFlagToListData(locationId,
			flagToListData);
	}

	/**
	* Caches the course series in the entity cache if it is enabled.
	*
	* @param courseSeries the course series
	*/
	public static void cacheResult(
		com.ocms.course.model.CourseSeries courseSeries) {
		getPersistence().cacheResult(courseSeries);
	}

	/**
	* Caches the course serieses in the entity cache if it is enabled.
	*
	* @param courseSerieses the course serieses
	*/
	public static void cacheResult(
		java.util.List<com.ocms.course.model.CourseSeries> courseSerieses) {
		getPersistence().cacheResult(courseSerieses);
	}

	/**
	* Creates a new course series with the primary key. Does not add the course series to the database.
	*
	* @param courseSeriesId the primary key for the new course series
	* @return the new course series
	*/
	public static com.ocms.course.model.CourseSeries create(long courseSeriesId) {
		return getPersistence().create(courseSeriesId);
	}

	/**
	* Removes the course series with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param courseSeriesId the primary key of the course series
	* @return the course series that was removed
	* @throws com.ocms.course.NoSuchCourseSeriesException if a course series with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries remove(long courseSeriesId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException {
		return getPersistence().remove(courseSeriesId);
	}

	public static com.ocms.course.model.CourseSeries updateImpl(
		com.ocms.course.model.CourseSeries courseSeries)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(courseSeries);
	}

	/**
	* Returns the course series with the primary key or throws a {@link com.ocms.course.NoSuchCourseSeriesException} if it could not be found.
	*
	* @param courseSeriesId the primary key of the course series
	* @return the course series
	* @throws com.ocms.course.NoSuchCourseSeriesException if a course series with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries findByPrimaryKey(
		long courseSeriesId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchCourseSeriesException {
		return getPersistence().findByPrimaryKey(courseSeriesId);
	}

	/**
	* Returns the course series with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param courseSeriesId the primary key of the course series
	* @return the course series, or <code>null</code> if a course series with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries fetchByPrimaryKey(
		long courseSeriesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(courseSeriesId);
	}

	/**
	* Returns all the course serieses.
	*
	* @return the course serieses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.CourseSeries> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.ocms.course.model.CourseSeries> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.ocms.course.model.CourseSeries> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the course serieses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of course serieses.
	*
	* @return the number of course serieses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CourseSeriesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CourseSeriesPersistence)PortletBeanLocatorUtil.locate(com.ocms.course.service.ClpSerializer.getServletContextName(),
					CourseSeriesPersistence.class.getName());

			ReferenceRegistry.registerReference(CourseSeriesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CourseSeriesPersistence persistence) {
	}

	private static CourseSeriesPersistence _persistence;
}