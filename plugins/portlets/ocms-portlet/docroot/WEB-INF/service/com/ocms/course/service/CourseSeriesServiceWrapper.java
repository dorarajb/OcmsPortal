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

package com.ocms.course.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CourseSeriesService}.
 *
 * @author doraraj
 * @see CourseSeriesService
 * @generated
 */
public class CourseSeriesServiceWrapper implements CourseSeriesService,
	ServiceWrapper<CourseSeriesService> {
	public CourseSeriesServiceWrapper(CourseSeriesService courseSeriesService) {
		_courseSeriesService = courseSeriesService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _courseSeriesService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_courseSeriesService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _courseSeriesService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesService.getCourseSeriesByGroupId(groupId);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesService.getCourseSeriesByGroupId(groupId, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByCourseId(
		long courseId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesService.getCourseSeriesByCourseId(courseId);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByCourseId(
		long courseId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesService.getCourseSeriesByCourseId(courseId, start,
			end);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByLocationId(
		long locationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesService.getCourseSeriesByLocationId(locationId);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByLocationId(
		long locationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesService.getCourseSeriesByLocationId(locationId,
			start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByLocationId(
		long locationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesService.getCourseSeriesByLocationId(locationId,
			orderByComparator);
	}

	@Override
	public com.ocms.course.model.CourseSeries addCourseSeries(long userId,
		long courseId, long locationId, java.lang.String courseSeriesCode,
		java.util.Date startDate, java.util.Date endDate,
		java.lang.String type, long maxNoStudReg,
		java.lang.String publishingStatus, long seriesCount,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesService.addCourseSeries(userId, courseId,
			locationId, courseSeriesCode, startDate, endDate, type,
			maxNoStudReg, publishingStatus, seriesCount, serviceContext);
	}

	@Override
	public com.ocms.course.model.CourseSeries updateCourse(long userId,
		long courseId, long locationId, java.util.Date startDate,
		java.util.Date endDate, java.lang.String type, long maxNoStudReg,
		java.lang.String publishingStatus,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesService.updateCourse(userId, courseId, locationId,
			startDate, endDate, type, maxNoStudReg, publishingStatus,
			serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CourseSeriesService getWrappedCourseSeriesService() {
		return _courseSeriesService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCourseSeriesService(
		CourseSeriesService courseSeriesService) {
		_courseSeriesService = courseSeriesService;
	}

	@Override
	public CourseSeriesService getWrappedService() {
		return _courseSeriesService;
	}

	@Override
	public void setWrappedService(CourseSeriesService courseSeriesService) {
		_courseSeriesService = courseSeriesService;
	}

	private CourseSeriesService _courseSeriesService;
}