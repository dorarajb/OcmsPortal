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
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByFlagToListData(
		int flagToListData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesService.getCourseSeriesByFlagToListData(flagToListData);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByFlagToListData(
		int flagToListData, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesService.getCourseSeriesByFlagToListData(flagToListData,
			start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByGroupIdAndFlagToListData(
		long groupId, int flagToListData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesService.getCourseSeriesByGroupIdAndFlagToListData(groupId,
			flagToListData);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByGroupIdAndFlagToListData(
		long groupId, int flagToListData, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesService.getCourseSeriesByGroupIdAndFlagToListData(groupId,
			flagToListData, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByCourseSeriesCode(
		java.lang.String courseSeriesCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesService.getCourseSeriesByCourseSeriesCode(courseSeriesCode);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByCourseSeriesCode(
		java.lang.String courseSeriesCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesService.getCourseSeriesByCourseSeriesCode(courseSeriesCode,
			start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByCourseSeriesId(
		long courseSeriesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesService.getCourseSeriesByCourseSeriesId(courseSeriesId);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByCourseSeriesId(
		long courseSeriesId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesService.getCourseSeriesByCourseSeriesId(courseSeriesId,
			start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByLocationIdAndFlagToListData(
		long locationId, int flagToListData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesService.getCourseSeriesByLocationIdAndFlagToListData(locationId,
			flagToListData);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByLocationIdAndFlagToListData(
		long locationId, int flagToListData, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesService.getCourseSeriesByLocationIdAndFlagToListData(locationId,
			flagToListData, start, end);
	}

	@Override
	public com.ocms.course.model.CourseSeries addCourseSeries(long userId,
		long courseId, long locationId, java.lang.String courseSeriesCode,
		java.lang.String courseSeriesEventCode, int flagToListData,
		java.util.Date startDate, java.util.Date endDate,
		java.lang.String type, long maxNoStudReg,
		java.lang.String publishingStatus, long seriesCount,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesService.addCourseSeries(userId, courseId,
			locationId, courseSeriesCode, courseSeriesEventCode,
			flagToListData, startDate, endDate, type, maxNoStudReg,
			publishingStatus, seriesCount, serviceContext);
	}

	@Override
	public com.ocms.course.model.CourseSeries updateCourse(long courseId,
		long locationId, java.util.Date startDate, java.util.Date endDate,
		java.lang.String type, long maxNoStudReg,
		java.lang.String publishingStatus,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesService.updateCourse(courseId, locationId,
			startDate, endDate, type, maxNoStudReg, publishingStatus,
			serviceContext);
	}

	@Override
	public void deleteCourseSeriesByCourseSeriesId(long courseSeriesId) {
		_courseSeriesService.deleteCourseSeriesByCourseSeriesId(courseSeriesId);
	}

	@Override
	public void deleteCourseSeriesByCourseSeriesIdCode(long courseSeriesId) {
		_courseSeriesService.deleteCourseSeriesByCourseSeriesIdCode(courseSeriesId);
	}

	@Override
	public void deleteCourseSeriesByGrouptId(long groupId) {
		_courseSeriesService.deleteCourseSeriesByGrouptId(groupId);
	}

	@Override
	public void deleteCourseSeriesByCourseSeriesCode(
		java.lang.String courseSeriescode) {
		_courseSeriesService.deleteCourseSeriesByCourseSeriesCode(courseSeriescode);
	}

	@Override
	public void deleteAllCourseSeries() {
		_courseSeriesService.deleteAllCourseSeries();
	}

	@Override
	public void deleteCourseSeriesEvent(long courseSeriesId) {
		_courseSeriesService.deleteCourseSeriesEvent(courseSeriesId);
	}

	@Override
	public void addCourseSeriesLoop(long[] locationList, long[] courseList,
		com.liferay.portal.service.ServiceContext serviceContext) {
		_courseSeriesService.addCourseSeriesLoop(locationList, courseList,
			serviceContext);
	}

	@Override
	public void updateCourseSeriesStartDate(long courseSeriesId,
		java.util.Date startDate) {
		_courseSeriesService.updateCourseSeriesStartDate(courseSeriesId,
			startDate);
	}

	@Override
	public void updateCourseSeriesEndDate(long courseSeriesId,
		java.util.Date endDate) {
		_courseSeriesService.updateCourseSeriesEndDate(courseSeriesId, endDate);
	}

	@Override
	public void updateFlagToChkEventCreation(
		com.ocms.course.model.CourseSeries courseSeries)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_courseSeriesService.updateFlagToChkEventCreation(courseSeries);
	}

	@Override
	public void updateDayAndMonthName()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_courseSeriesService.updateDayAndMonthName();
	}

	@Override
	public void createEvent(java.lang.String courseSeriesCode,
		com.liferay.portal.service.ServiceContext serviceContext) {
		_courseSeriesService.createEvent(courseSeriesCode, serviceContext);
	}

	@Override
	public void createEventList(java.lang.String[] codeList,
		com.liferay.portal.service.ServiceContext serviceContext) {
		_courseSeriesService.createEventList(codeList, serviceContext);
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