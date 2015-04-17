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

package com.ocms.course.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.ocms.course.service.CoursePackageServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.ocms.course.service.CoursePackageServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.ocms.course.model.CoursePackageSoap}.
 * If the method in the service utility returns a
 * {@link com.ocms.course.model.CoursePackage}, that is translated to a
 * {@link com.ocms.course.model.CoursePackageSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author doraraj
 * @see CoursePackageServiceHttp
 * @see com.ocms.course.model.CoursePackageSoap
 * @see com.ocms.course.service.CoursePackageServiceUtil
 * @generated
 */
public class CoursePackageServiceSoap {
	public static com.ocms.course.model.CoursePackageSoap[] getCoursesPackagesByGroupId(
		long groupId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.CoursePackage> returnValue = CoursePackageServiceUtil.getCoursesPackagesByGroupId(groupId);

			return com.ocms.course.model.CoursePackageSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.CoursePackageSoap[] getCoursesPackagesByGroupId(
		long groupId, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.CoursePackage> returnValue = CoursePackageServiceUtil.getCoursesPackagesByGroupId(groupId,
					start, end);

			return com.ocms.course.model.CoursePackageSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.CoursePackageSoap[] getCoursesPackagesByCoursePackageId(
		long coursePackageId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.CoursePackage> returnValue = CoursePackageServiceUtil.getCoursesPackagesByCoursePackageId(coursePackageId);

			return com.ocms.course.model.CoursePackageSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.CoursePackageSoap[] getCoursesPackagesByCoursePackageId(
		long coursePackageId, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.CoursePackage> returnValue = CoursePackageServiceUtil.getCoursesPackagesByCoursePackageId(coursePackageId,
					start, end);

			return com.ocms.course.model.CoursePackageSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.CoursePackageSoap addCoursePackage(
		java.lang.String name, java.lang.String code,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.ocms.course.model.CoursePackage returnValue = CoursePackageServiceUtil.addCoursePackage(name,
					code, serviceContext);

			return com.ocms.course.model.CoursePackageSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.CoursePackageSoap updateCoursePackage(
		long coursePackageId, java.lang.String name, java.lang.String code,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.ocms.course.model.CoursePackage returnValue = CoursePackageServiceUtil.updateCoursePackage(coursePackageId,
					name, code, serviceContext);

			return com.ocms.course.model.CoursePackageSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(CoursePackageServiceSoap.class);
}