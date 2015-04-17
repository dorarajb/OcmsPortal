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

import com.ocms.course.service.CourseServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.ocms.course.service.CourseServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.ocms.course.model.CourseSoap}.
 * If the method in the service utility returns a
 * {@link com.ocms.course.model.Course}, that is translated to a
 * {@link com.ocms.course.model.CourseSoap}. Methods that SOAP cannot
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
 * @see CourseServiceHttp
 * @see com.ocms.course.model.CourseSoap
 * @see com.ocms.course.service.CourseServiceUtil
 * @generated
 */
public class CourseServiceSoap {
	public static java.lang.String getCourse() throws RemoteException {
		try {
			java.lang.String returnValue = CourseServiceUtil.getCourse();

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.CourseSoap[] getCoursesByGroupId(
		long groupId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Course> returnValue = CourseServiceUtil.getCoursesByGroupId(groupId);

			return com.ocms.course.model.CourseSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.CourseSoap[] getCoursesByGroupId(
		long groupId, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Course> returnValue = CourseServiceUtil.getCoursesByGroupId(groupId,
					start, end);

			return com.ocms.course.model.CourseSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.CourseSoap[] getCoursesByCourseId(
		long courseId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Course> returnValue = CourseServiceUtil.getCoursesByCourseId(courseId);

			return com.ocms.course.model.CourseSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.CourseSoap[] getCoursesByCourseId(
		long courseId, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Course> returnValue = CourseServiceUtil.getCoursesByCourseId(courseId,
					start, end);

			return com.ocms.course.model.CourseSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.CourseSoap addCourse(
		java.lang.String name, java.lang.String code,
		java.lang.String duration,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.ocms.course.model.Course returnValue = CourseServiceUtil.addCourse(name,
					code, duration, serviceContext);

			return com.ocms.course.model.CourseSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.CourseSoap updateCourse(long courseId,
		java.lang.String name, java.lang.String code,
		java.lang.String duration,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.ocms.course.model.Course returnValue = CourseServiceUtil.updateCourse(courseId,
					name, code, duration, serviceContext);

			return com.ocms.course.model.CourseSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteCourseByCourseId(long courseId)
		throws RemoteException {
		try {
			CourseServiceUtil.deleteCourseByCourseId(courseId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteCourseByGrouptId(long groupId)
		throws RemoteException {
		try {
			CourseServiceUtil.deleteCourseByGrouptId(groupId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteAllCourse() throws RemoteException {
		try {
			CourseServiceUtil.deleteAllCourse();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(CourseServiceSoap.class);
}