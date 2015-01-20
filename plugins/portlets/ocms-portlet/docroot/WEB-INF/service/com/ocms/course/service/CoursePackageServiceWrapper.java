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
 * Provides a wrapper for {@link CoursePackageService}.
 *
 * @author doraraj
 * @see CoursePackageService
 * @generated
 */
public class CoursePackageServiceWrapper implements CoursePackageService,
	ServiceWrapper<CoursePackageService> {
	public CoursePackageServiceWrapper(
		CoursePackageService coursePackageService) {
		_coursePackageService = coursePackageService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _coursePackageService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_coursePackageService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _coursePackageService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CoursePackageService getWrappedCoursePackageService() {
		return _coursePackageService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCoursePackageService(
		CoursePackageService coursePackageService) {
		_coursePackageService = coursePackageService;
	}

	@Override
	public CoursePackageService getWrappedService() {
		return _coursePackageService;
	}

	@Override
	public void setWrappedService(CoursePackageService coursePackageService) {
		_coursePackageService = coursePackageService;
	}

	private CoursePackageService _coursePackageService;
}