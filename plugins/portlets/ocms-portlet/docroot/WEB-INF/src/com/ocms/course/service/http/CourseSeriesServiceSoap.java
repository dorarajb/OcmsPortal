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

import com.ocms.course.service.CourseSeriesServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.ocms.course.service.CourseSeriesServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.ocms.course.model.CourseSeriesSoap}.
 * If the method in the service utility returns a
 * {@link com.ocms.course.model.CourseSeries}, that is translated to a
 * {@link com.ocms.course.model.CourseSeriesSoap}. Methods that SOAP cannot
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
 * @see CourseSeriesServiceHttp
 * @see com.ocms.course.model.CourseSeriesSoap
 * @see com.ocms.course.service.CourseSeriesServiceUtil
 * @generated
 */
public class CourseSeriesServiceSoap {
	public static com.ocms.course.model.CourseSeriesSoap[] getCourseSeriesByGroupId(
		long groupId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.CourseSeries> returnValue = CourseSeriesServiceUtil.getCourseSeriesByGroupId(groupId);

			return com.ocms.course.model.CourseSeriesSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.CourseSeriesSoap[] getCourseSeriesByGroupId(
		long groupId, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.CourseSeries> returnValue = CourseSeriesServiceUtil.getCourseSeriesByGroupId(groupId,
					start, end);

			return com.ocms.course.model.CourseSeriesSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.CourseSeriesSoap[] getCourseSeriesByCourseId(
		long courseId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.CourseSeries> returnValue = CourseSeriesServiceUtil.getCourseSeriesByCourseId(courseId);

			return com.ocms.course.model.CourseSeriesSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.CourseSeriesSoap[] getCourseSeriesByCourseId(
		long courseId, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.CourseSeries> returnValue = CourseSeriesServiceUtil.getCourseSeriesByCourseId(courseId,
					start, end);

			return com.ocms.course.model.CourseSeriesSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.CourseSeriesSoap[] getCourseSeriesByLocationId(
		long locationId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.CourseSeries> returnValue = CourseSeriesServiceUtil.getCourseSeriesByLocationId(locationId);

			return com.ocms.course.model.CourseSeriesSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.CourseSeriesSoap[] getCourseSeriesByLocationId(
		long locationId, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.CourseSeries> returnValue = CourseSeriesServiceUtil.getCourseSeriesByLocationId(locationId,
					start, end);

			return com.ocms.course.model.CourseSeriesSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.CourseSeriesSoap[] getCourseSeriesByLocationId(
		long locationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.CourseSeries> returnValue = CourseSeriesServiceUtil.getCourseSeriesByLocationId(locationId,
					orderByComparator);

			return com.ocms.course.model.CourseSeriesSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.CourseSeriesSoap[] getCourseSeriesByFlagToListData(
		int flagToListData) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.CourseSeries> returnValue = CourseSeriesServiceUtil.getCourseSeriesByFlagToListData(flagToListData);

			return com.ocms.course.model.CourseSeriesSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.CourseSeriesSoap[] getCourseSeriesByFlagToListData(
		int flagToListData, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.CourseSeries> returnValue = CourseSeriesServiceUtil.getCourseSeriesByFlagToListData(flagToListData,
					start, end);

			return com.ocms.course.model.CourseSeriesSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.CourseSeriesSoap[] getCourseSeriesByGroupIdAndFlagToListData(
		long groupId, int flagToListData) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.CourseSeries> returnValue = CourseSeriesServiceUtil.getCourseSeriesByGroupIdAndFlagToListData(groupId,
					flagToListData);

			return com.ocms.course.model.CourseSeriesSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.CourseSeriesSoap[] getCourseSeriesByGroupIdAndFlagToListData(
		long groupId, int flagToListData, int start, int end)
		throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.CourseSeries> returnValue = CourseSeriesServiceUtil.getCourseSeriesByGroupIdAndFlagToListData(groupId,
					flagToListData, start, end);

			return com.ocms.course.model.CourseSeriesSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.CourseSeriesSoap[] getCourseSeriesByCourseSeriesCode(
		java.lang.String courseSeriesCode) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.CourseSeries> returnValue = CourseSeriesServiceUtil.getCourseSeriesByCourseSeriesCode(courseSeriesCode);

			return com.ocms.course.model.CourseSeriesSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.CourseSeriesSoap[] getCourseSeriesByCourseSeriesCode(
		java.lang.String courseSeriesCode, int start, int end)
		throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.CourseSeries> returnValue = CourseSeriesServiceUtil.getCourseSeriesByCourseSeriesCode(courseSeriesCode,
					start, end);

			return com.ocms.course.model.CourseSeriesSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.CourseSeriesSoap[] getCourseSeriesByCourseSeriesId(
		long courseSeriesId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.CourseSeries> returnValue = CourseSeriesServiceUtil.getCourseSeriesByCourseSeriesId(courseSeriesId);

			return com.ocms.course.model.CourseSeriesSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.CourseSeriesSoap[] getCourseSeriesByCourseSeriesId(
		long courseSeriesId, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.CourseSeries> returnValue = CourseSeriesServiceUtil.getCourseSeriesByCourseSeriesId(courseSeriesId,
					start, end);

			return com.ocms.course.model.CourseSeriesSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.CourseSeriesSoap[] getCourseSeriesByLocationIdAndFlagToListData(
		long locationId, int flagToListData) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.CourseSeries> returnValue = CourseSeriesServiceUtil.getCourseSeriesByLocationIdAndFlagToListData(locationId,
					flagToListData);

			return com.ocms.course.model.CourseSeriesSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.CourseSeriesSoap[] getCourseSeriesByLocationIdAndFlagToListData(
		long locationId, int flagToListData, int start, int end)
		throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.CourseSeries> returnValue = CourseSeriesServiceUtil.getCourseSeriesByLocationIdAndFlagToListData(locationId,
					flagToListData, start, end);

			return com.ocms.course.model.CourseSeriesSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.CourseSeriesSoap addCourseSeries(
		long userId, long courseId, long locationId,
		java.lang.String courseSeriesCode,
		java.lang.String courseSeriesEventCode, int flagToListData,
		java.util.Date startDate, java.util.Date endDate,
		java.lang.String type, long maxNoStudReg,
		java.lang.String publishingStatus, long seriesCount,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.ocms.course.model.CourseSeries returnValue = CourseSeriesServiceUtil.addCourseSeries(userId,
					courseId, locationId, courseSeriesCode,
					courseSeriesEventCode, flagToListData, startDate, endDate,
					type, maxNoStudReg, publishingStatus, seriesCount,
					serviceContext);

			return com.ocms.course.model.CourseSeriesSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.CourseSeriesSoap updateCourse(
		long courseId, long locationId, java.util.Date startDate,
		java.util.Date endDate, java.lang.String type, long maxNoStudReg,
		java.lang.String publishingStatus,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.ocms.course.model.CourseSeries returnValue = CourseSeriesServiceUtil.updateCourse(courseId,
					locationId, startDate, endDate, type, maxNoStudReg,
					publishingStatus, serviceContext);

			return com.ocms.course.model.CourseSeriesSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteCourseSeriesByCourseSeriesId(long courseSeriesId)
		throws RemoteException {
		try {
			CourseSeriesServiceUtil.deleteCourseSeriesByCourseSeriesId(courseSeriesId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteCourseSeriesByCourseSeriesIdCode(
		long courseSeriesId) throws RemoteException {
		try {
			CourseSeriesServiceUtil.deleteCourseSeriesByCourseSeriesIdCode(courseSeriesId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteCourseSeriesByGrouptId(long groupId)
		throws RemoteException {
		try {
			CourseSeriesServiceUtil.deleteCourseSeriesByGrouptId(groupId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteCourseSeriesByCourseSeriesCode(
		java.lang.String courseSeriescode) throws RemoteException {
		try {
			CourseSeriesServiceUtil.deleteCourseSeriesByCourseSeriesCode(courseSeriescode);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteAllCourseSeries() throws RemoteException {
		try {
			CourseSeriesServiceUtil.deleteAllCourseSeries();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteCourseSeriesEvent(long courseSeriesId)
		throws RemoteException {
		try {
			CourseSeriesServiceUtil.deleteCourseSeriesEvent(courseSeriesId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addCourseSeriesLoop(long[] locationList,
		long[] courseList,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			CourseSeriesServiceUtil.addCourseSeriesLoop(locationList,
				courseList, serviceContext);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void updateCourseSeriesStartDate(long courseSeriesId,
		java.util.Date startDate) throws RemoteException {
		try {
			CourseSeriesServiceUtil.updateCourseSeriesStartDate(courseSeriesId,
				startDate);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void updateCourseSeriesEndDate(long courseSeriesId,
		java.util.Date endDate) throws RemoteException {
		try {
			CourseSeriesServiceUtil.updateCourseSeriesEndDate(courseSeriesId,
				endDate);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void updateFlagToChkEventCreation(
		com.ocms.course.model.CourseSeriesSoap courseSeries)
		throws RemoteException {
		try {
			CourseSeriesServiceUtil.updateFlagToChkEventCreation(com.ocms.course.model.impl.CourseSeriesModelImpl.toModel(
					courseSeries));
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void updateDayAndMonthName() throws RemoteException {
		try {
			CourseSeriesServiceUtil.updateDayAndMonthName();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void createEvent(java.lang.String courseSeriesCode,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			CourseSeriesServiceUtil.createEvent(courseSeriesCode, serviceContext);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void createEventList(java.lang.String[] codeList,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			CourseSeriesServiceUtil.createEventList(codeList, serviceContext);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(CourseSeriesServiceSoap.class);
}