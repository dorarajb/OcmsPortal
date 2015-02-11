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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for CourseSeries. This utility wraps
 * {@link com.ocms.course.service.impl.CourseSeriesServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author doraraj
 * @see CourseSeriesService
 * @see com.ocms.course.service.base.CourseSeriesServiceBaseImpl
 * @see com.ocms.course.service.impl.CourseSeriesServiceImpl
 * @generated
 */
public class CourseSeriesServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ocms.course.service.impl.CourseSeriesServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCourseSeriesByGroupId(groupId);
	}

	public static java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCourseSeriesByGroupId(groupId, start, end);
	}

	public static java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByCourseId(
		long courseId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCourseSeriesByCourseId(courseId);
	}

	public static java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByCourseId(
		long courseId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCourseSeriesByCourseId(courseId, start, end);
	}

	public static java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByLocationId(
		long locationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCourseSeriesByLocationId(locationId);
	}

	public static java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByLocationId(
		long locationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCourseSeriesByLocationId(locationId, start, end);
	}

	public static java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByLocationId(
		long locationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getCourseSeriesByLocationId(locationId, orderByComparator);
	}

	public static com.ocms.course.model.CourseSeries addCourseSeries(
		long userId, long courseId, long locationId,
		java.lang.String courseSeriesCode, java.util.Date startDate,
		java.util.Date endDate, java.lang.String type, long maxNoStudReg,
		java.lang.String publishingStatus, long seriesCount,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addCourseSeries(userId, courseId, locationId,
			courseSeriesCode, startDate, endDate, type, maxNoStudReg,
			publishingStatus, seriesCount, serviceContext);
	}

	public static com.ocms.course.model.CourseSeries updateCourse(long userId,
		long courseId, long locationId, java.util.Date startDate,
		java.util.Date endDate, java.lang.String type, long maxNoStudReg,
		java.lang.String publishingStatus,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateCourse(userId, courseId, locationId, startDate,
			endDate, type, maxNoStudReg, publishingStatus, serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static CourseSeriesService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					CourseSeriesService.class.getName());

			if (invokableService instanceof CourseSeriesService) {
				_service = (CourseSeriesService)invokableService;
			}
			else {
				_service = new CourseSeriesServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(CourseSeriesServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(CourseSeriesService service) {
	}

	private static CourseSeriesService _service;
}