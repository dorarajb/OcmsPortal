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

import com.liferay.portal.service.InvokableService;

/**
 * @author doraraj
 * @generated
 */
public class CourseSeriesServiceClp implements CourseSeriesService {
	public CourseSeriesServiceClp(InvokableService invokableService) {
		_invokableService = invokableService;

		_methodName0 = "getBeanIdentifier";

		_methodParameterTypes0 = new String[] {  };

		_methodName1 = "setBeanIdentifier";

		_methodParameterTypes1 = new String[] { "java.lang.String" };

		_methodName3 = "getCourseSeriesByGroupId";

		_methodParameterTypes3 = new String[] { "long" };

		_methodName4 = "getCourseSeriesByGroupId";

		_methodParameterTypes4 = new String[] { "long", "int", "int" };

		_methodName5 = "getCourseSeriesByCourseId";

		_methodParameterTypes5 = new String[] { "long" };

		_methodName6 = "getCourseSeriesByCourseId";

		_methodParameterTypes6 = new String[] { "long", "int", "int" };

		_methodName7 = "getCourseSeriesByLocationId";

		_methodParameterTypes7 = new String[] { "long" };

		_methodName8 = "getCourseSeriesByLocationId";

		_methodParameterTypes8 = new String[] { "long", "int", "int" };

		_methodName9 = "getCourseSeriesByLocationId";

		_methodParameterTypes9 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName10 = "getCourseSeriesByFlagToListData";

		_methodParameterTypes10 = new String[] { "int" };

		_methodName11 = "getCourseSeriesByFlagToListData";

		_methodParameterTypes11 = new String[] { "int", "int", "int" };

		_methodName12 = "getCourseSeriesByGroupIdAndFlagToListData";

		_methodParameterTypes12 = new String[] { "long", "int" };

		_methodName13 = "getCourseSeriesByGroupIdAndFlagToListData";

		_methodParameterTypes13 = new String[] { "long", "int", "int", "int" };

		_methodName14 = "getCourseSeriesByCourseSeriesCode";

		_methodParameterTypes14 = new String[] { "java.lang.String" };

		_methodName15 = "getCourseSeriesByCourseSeriesCode";

		_methodParameterTypes15 = new String[] { "java.lang.String", "int", "int" };

		_methodName16 = "getCourseSeriesByCourseSeriesId";

		_methodParameterTypes16 = new String[] { "long" };

		_methodName17 = "getCourseSeriesByCourseSeriesId";

		_methodParameterTypes17 = new String[] { "long", "int", "int" };

		_methodName18 = "getCourseSeriesByLocationIdAndFlagToListData";

		_methodParameterTypes18 = new String[] { "long", "int" };

		_methodName19 = "getCourseSeriesByLocationIdAndFlagToListData";

		_methodParameterTypes19 = new String[] { "long", "int", "int", "int" };

		_methodName20 = "addCourseSeries";

		_methodParameterTypes20 = new String[] {
				"long", "long", "long", "java.lang.String", "java.lang.String",
				"int", "java.util.Date", "java.util.Date", "java.lang.String",
				"long", "java.lang.String", "long",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName21 = "updateCourse";

		_methodParameterTypes21 = new String[] {
				"long", "long", "java.util.Date", "java.util.Date",
				"java.lang.String", "long", "java.lang.String",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName22 = "deleteCourseSeriesByCourseSeriesId";

		_methodParameterTypes22 = new String[] { "long" };

		_methodName23 = "deleteCourseSeriesByCourseSeriesIdCode";

		_methodParameterTypes23 = new String[] { "long" };

		_methodName24 = "deleteCourseSeriesByGrouptId";

		_methodParameterTypes24 = new String[] { "long" };

		_methodName25 = "deleteCourseSeriesByCourseSeriesCode";

		_methodParameterTypes25 = new String[] { "java.lang.String" };

		_methodName26 = "deleteAllCourseSeries";

		_methodParameterTypes26 = new String[] {  };

		_methodName27 = "deleteCourseSeriesEvent";

		_methodParameterTypes27 = new String[] { "long" };

		_methodName28 = "addCourseSeriesLoop";

		_methodParameterTypes28 = new String[] {
				"long[][]", "long[][]",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName29 = "updateCourseSeriesStartDate";

		_methodParameterTypes29 = new String[] { "long", "java.util.Date" };

		_methodName30 = "updateCourseSeriesEndDate";

		_methodParameterTypes30 = new String[] { "long", "java.util.Date" };

		_methodName31 = "updateFlagToChkEventCreation";

		_methodParameterTypes31 = new String[] {
				"com.ocms.course.model.CourseSeries"
			};

		_methodName32 = "updateDayAndMonthName";

		_methodParameterTypes32 = new String[] {  };

		_methodName33 = "createEvent";

		_methodParameterTypes33 = new String[] {
				"java.lang.String", "com.liferay.portal.service.ServiceContext"
			};

		_methodName34 = "createEventList";

		_methodParameterTypes34 = new String[] {
				"java.lang.String[][]",
				"com.liferay.portal.service.ServiceContext"
			};
	}

	@Override
	public java.lang.String getBeanIdentifier() {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName0,
					_methodParameterTypes0, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.lang.String)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		try {
			_invokableService.invokeMethod(_methodName1,
				_methodParameterTypes1,
				new Object[] { ClpSerializer.translateInput(beanIdentifier) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		throw new UnsupportedOperationException();
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName3,
					_methodParameterTypes3, new Object[] { groupId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.CourseSeries>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName4,
					_methodParameterTypes4, new Object[] { groupId, start, end });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.CourseSeries>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByCourseId(
		long courseId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName5,
					_methodParameterTypes5, new Object[] { courseId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.CourseSeries>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByCourseId(
		long courseId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName6,
					_methodParameterTypes6,
					new Object[] { courseId, start, end });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.CourseSeries>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByLocationId(
		long locationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName7,
					_methodParameterTypes7, new Object[] { locationId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.CourseSeries>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByLocationId(
		long locationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName8,
					_methodParameterTypes8,
					new Object[] { locationId, start, end });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.CourseSeries>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByLocationId(
		long locationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName9,
					_methodParameterTypes9,
					new Object[] {
						locationId,
						
					ClpSerializer.translateInput(orderByComparator)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.CourseSeries>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByFlagToListData(
		int flagToListData)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName10,
					_methodParameterTypes10, new Object[] { flagToListData });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.CourseSeries>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByFlagToListData(
		int flagToListData, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName11,
					_methodParameterTypes11,
					new Object[] { flagToListData, start, end });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.CourseSeries>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByGroupIdAndFlagToListData(
		long groupId, int flagToListData)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName12,
					_methodParameterTypes12,
					new Object[] { groupId, flagToListData });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.CourseSeries>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByGroupIdAndFlagToListData(
		long groupId, int flagToListData, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName13,
					_methodParameterTypes13,
					new Object[] { groupId, flagToListData, start, end });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.CourseSeries>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByCourseSeriesCode(
		java.lang.String courseSeriesCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName14,
					_methodParameterTypes14,
					new Object[] { ClpSerializer.translateInput(
							courseSeriesCode) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.CourseSeries>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByCourseSeriesCode(
		java.lang.String courseSeriesCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName15,
					_methodParameterTypes15,
					new Object[] {
						ClpSerializer.translateInput(courseSeriesCode),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.CourseSeries>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByCourseSeriesId(
		long courseSeriesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName16,
					_methodParameterTypes16, new Object[] { courseSeriesId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.CourseSeries>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByCourseSeriesId(
		long courseSeriesId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName17,
					_methodParameterTypes17,
					new Object[] { courseSeriesId, start, end });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.CourseSeries>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByLocationIdAndFlagToListData(
		long locationId, int flagToListData)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName18,
					_methodParameterTypes18,
					new Object[] { locationId, flagToListData });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.CourseSeries>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByLocationIdAndFlagToListData(
		long locationId, int flagToListData, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName19,
					_methodParameterTypes19,
					new Object[] { locationId, flagToListData, start, end });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.CourseSeries>)ClpSerializer.translateOutput(returnObj);
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
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName20,
					_methodParameterTypes20,
					new Object[] {
						userId,
						
					courseId,
						
					locationId,
						
					ClpSerializer.translateInput(courseSeriesCode),
						
					ClpSerializer.translateInput(courseSeriesEventCode),
						
					flagToListData,
						
					ClpSerializer.translateInput(startDate),
						
					ClpSerializer.translateInput(endDate),
						
					ClpSerializer.translateInput(type),
						
					maxNoStudReg,
						
					ClpSerializer.translateInput(publishingStatus),
						
					seriesCount,
						
					ClpSerializer.translateInput(serviceContext)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.ocms.course.model.CourseSeries)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.ocms.course.model.CourseSeries updateCourse(long courseId,
		long locationId, java.util.Date startDate, java.util.Date endDate,
		java.lang.String type, long maxNoStudReg,
		java.lang.String publishingStatus,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName21,
					_methodParameterTypes21,
					new Object[] {
						courseId,
						
					locationId,
						
					ClpSerializer.translateInput(startDate),
						
					ClpSerializer.translateInput(endDate),
						
					ClpSerializer.translateInput(type),
						
					maxNoStudReg,
						
					ClpSerializer.translateInput(publishingStatus),
						
					ClpSerializer.translateInput(serviceContext)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.ocms.course.model.CourseSeries)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void deleteCourseSeriesByCourseSeriesId(long courseSeriesId) {
		try {
			_invokableService.invokeMethod(_methodName22,
				_methodParameterTypes22, new Object[] { courseSeriesId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void deleteCourseSeriesByCourseSeriesIdCode(long courseSeriesId) {
		try {
			_invokableService.invokeMethod(_methodName23,
				_methodParameterTypes23, new Object[] { courseSeriesId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void deleteCourseSeriesByGrouptId(long groupId) {
		try {
			_invokableService.invokeMethod(_methodName24,
				_methodParameterTypes24, new Object[] { groupId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void deleteCourseSeriesByCourseSeriesCode(
		java.lang.String courseSeriescode) {
		try {
			_invokableService.invokeMethod(_methodName25,
				_methodParameterTypes25,
				new Object[] { ClpSerializer.translateInput(courseSeriescode) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void deleteAllCourseSeries() {
		try {
			_invokableService.invokeMethod(_methodName26,
				_methodParameterTypes26, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void deleteCourseSeriesEvent(long courseSeriesId) {
		try {
			_invokableService.invokeMethod(_methodName27,
				_methodParameterTypes27, new Object[] { courseSeriesId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void addCourseSeriesLoop(long[] locationList, long[] courseList,
		com.liferay.portal.service.ServiceContext serviceContext) {
		try {
			_invokableService.invokeMethod(_methodName28,
				_methodParameterTypes28,
				new Object[] {
					ClpSerializer.translateInput(locationList),
					
				ClpSerializer.translateInput(courseList),
					
				ClpSerializer.translateInput(serviceContext)
				});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void updateCourseSeriesStartDate(long courseSeriesId,
		java.util.Date startDate) {
		try {
			_invokableService.invokeMethod(_methodName29,
				_methodParameterTypes29,
				new Object[] {
					courseSeriesId,
					
				ClpSerializer.translateInput(startDate)
				});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void updateCourseSeriesEndDate(long courseSeriesId,
		java.util.Date endDate) {
		try {
			_invokableService.invokeMethod(_methodName30,
				_methodParameterTypes30,
				new Object[] {
					courseSeriesId,
					
				ClpSerializer.translateInput(endDate)
				});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void updateFlagToChkEventCreation(
		com.ocms.course.model.CourseSeries courseSeries)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			_invokableService.invokeMethod(_methodName31,
				_methodParameterTypes31,
				new Object[] { ClpSerializer.translateInput(courseSeries) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void updateDayAndMonthName()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			_invokableService.invokeMethod(_methodName32,
				_methodParameterTypes32, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void createEvent(java.lang.String courseSeriesCode,
		com.liferay.portal.service.ServiceContext serviceContext) {
		try {
			_invokableService.invokeMethod(_methodName33,
				_methodParameterTypes33,
				new Object[] {
					ClpSerializer.translateInput(courseSeriesCode),
					
				ClpSerializer.translateInput(serviceContext)
				});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void createEventList(java.lang.String[] codeList,
		com.liferay.portal.service.ServiceContext serviceContext) {
		try {
			_invokableService.invokeMethod(_methodName34,
				_methodParameterTypes34,
				new Object[] {
					ClpSerializer.translateInput(codeList),
					
				ClpSerializer.translateInput(serviceContext)
				});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	private InvokableService _invokableService;
	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName16;
	private String[] _methodParameterTypes16;
	private String _methodName17;
	private String[] _methodParameterTypes17;
	private String _methodName18;
	private String[] _methodParameterTypes18;
	private String _methodName19;
	private String[] _methodParameterTypes19;
	private String _methodName20;
	private String[] _methodParameterTypes20;
	private String _methodName21;
	private String[] _methodParameterTypes21;
	private String _methodName22;
	private String[] _methodParameterTypes22;
	private String _methodName23;
	private String[] _methodParameterTypes23;
	private String _methodName24;
	private String[] _methodParameterTypes24;
	private String _methodName25;
	private String[] _methodParameterTypes25;
	private String _methodName26;
	private String[] _methodParameterTypes26;
	private String _methodName27;
	private String[] _methodParameterTypes27;
	private String _methodName28;
	private String[] _methodParameterTypes28;
	private String _methodName29;
	private String[] _methodParameterTypes29;
	private String _methodName30;
	private String[] _methodParameterTypes30;
	private String _methodName31;
	private String[] _methodParameterTypes31;
	private String _methodName32;
	private String[] _methodParameterTypes32;
	private String _methodName33;
	private String[] _methodParameterTypes33;
	private String _methodName34;
	private String[] _methodParameterTypes34;
}