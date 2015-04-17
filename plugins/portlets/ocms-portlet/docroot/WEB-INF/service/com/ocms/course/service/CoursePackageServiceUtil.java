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
 * Provides the remote service utility for CoursePackage. This utility wraps
 * {@link com.ocms.course.service.impl.CoursePackageServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author doraraj
 * @see CoursePackageService
 * @see com.ocms.course.service.base.CoursePackageServiceBaseImpl
 * @see com.ocms.course.service.impl.CoursePackageServiceImpl
 * @generated
 */
public class CoursePackageServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ocms.course.service.impl.CoursePackageServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static java.util.List<com.ocms.course.model.CoursePackage> getCoursesPackagesByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCoursesPackagesByGroupId(groupId);
	}

	public static java.util.List<com.ocms.course.model.CoursePackage> getCoursesPackagesByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCoursesPackagesByGroupId(groupId, start, end);
	}

	public static java.util.List<com.ocms.course.model.CoursePackage> getCoursesPackagesByCoursePackageId(
		long coursePackageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCoursesPackagesByCoursePackageId(coursePackageId);
	}

	public static java.util.List<com.ocms.course.model.CoursePackage> getCoursesPackagesByCoursePackageId(
		long coursePackageId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getCoursesPackagesByCoursePackageId(coursePackageId, start,
			end);
	}

	public static com.ocms.course.model.CoursePackage addCoursePackage(
		java.lang.String name, java.lang.String code,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().addCoursePackage(name, code, serviceContext);
	}

	public static com.ocms.course.model.CoursePackage updateCoursePackage(
		long coursePackageId, java.lang.String name, java.lang.String code,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateCoursePackage(coursePackageId, name, code,
			serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static CoursePackageService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					CoursePackageService.class.getName());

			if (invokableService instanceof CoursePackageService) {
				_service = (CoursePackageService)invokableService;
			}
			else {
				_service = new CoursePackageServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(CoursePackageServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(CoursePackageService service) {
	}

	private static CoursePackageService _service;
}