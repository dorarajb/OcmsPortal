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
 * Provides a wrapper for {@link CourseService}.
 *
 * @author doraraj
 * @see CourseService
 * @generated
 */
public class CourseServiceWrapper implements CourseService,
	ServiceWrapper<CourseService> {
	public CourseServiceWrapper(CourseService courseService) {
		_courseService = courseService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _courseService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_courseService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _courseService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.lang.String getCourse()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseService.getCourse();
	}

	@Override
	public java.util.List<com.ocms.course.model.Course> getCoursesByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseService.getCoursesByGroupId(groupId);
	}

	@Override
	public java.util.List<com.ocms.course.model.Course> getCoursesByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseService.getCoursesByGroupId(groupId, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.Course> getCoursesByCourseId(
		long courseId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseService.getCoursesByCourseId(courseId);
	}

	@Override
	public java.util.List<com.ocms.course.model.Course> getCoursesByCourseId(
		long courseId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseService.getCoursesByCourseId(courseId, start, end);
	}

	@Override
	public com.ocms.course.model.Course addCourse(java.lang.String name,
		java.lang.String code, java.lang.String duration,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _courseService.addCourse(name, code, duration, serviceContext);
	}

	@Override
	public com.ocms.course.model.Course updateCourse(long courseId,
		java.lang.String name, java.lang.String code,
		java.lang.String duration,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _courseService.updateCourse(courseId, name, code, duration,
			serviceContext);
	}

	@Override
	public void deleteCourseByCourseId(long courseId) {
		_courseService.deleteCourseByCourseId(courseId);
	}

	@Override
	public void deleteCourseByGrouptId(long groupId) {
		_courseService.deleteCourseByGrouptId(groupId);
	}

	@Override
	public void deleteAllCourse() {
		_courseService.deleteAllCourse();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CourseService getWrappedCourseService() {
		return _courseService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCourseService(CourseService courseService) {
		_courseService = courseService;
	}

	@Override
	public CourseService getWrappedService() {
		return _courseService;
	}

	@Override
	public void setWrappedService(CourseService courseService) {
		_courseService = courseService;
	}

	private CourseService _courseService;
}