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

package com.ocms.course.service.base;

import com.ocms.course.service.CourseSeriesServiceUtil;

import java.util.Arrays;

/**
 * @author doraraj
 * @generated
 */
public class CourseSeriesServiceClpInvoker {
	public CourseSeriesServiceClpInvoker() {
		_methodName54 = "getBeanIdentifier";

		_methodParameterTypes54 = new String[] {  };

		_methodName55 = "setBeanIdentifier";

		_methodParameterTypes55 = new String[] { "java.lang.String" };

		_methodName60 = "getCourseSeriesByGroupId";

		_methodParameterTypes60 = new String[] { "long" };

		_methodName61 = "getCourseSeriesByGroupId";

		_methodParameterTypes61 = new String[] { "long", "int", "int" };

		_methodName62 = "getCourseSeriesByCourseId";

		_methodParameterTypes62 = new String[] { "long" };

		_methodName63 = "getCourseSeriesByCourseId";

		_methodParameterTypes63 = new String[] { "long", "int", "int" };

		_methodName64 = "getCourseSeriesByLocationId";

		_methodParameterTypes64 = new String[] { "long" };

		_methodName65 = "getCourseSeriesByLocationId";

		_methodParameterTypes65 = new String[] { "long", "int", "int" };

		_methodName66 = "getCourseSeriesByLocationId";

		_methodParameterTypes66 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName68 = "addCourseSeries";

		_methodParameterTypes68 = new String[] {
				"long", "long", "long", "java.lang.String", "java.util.Date",
				"java.util.Date", "java.lang.String", "long", "java.lang.String",
				"long", "com.liferay.portal.service.ServiceContext"
			};

		_methodName69 = "updateCourse";

		_methodParameterTypes69 = new String[] {
				"long", "long", "long", "java.util.Date", "java.util.Date",
				"java.lang.String", "long", "java.lang.String",
				"com.liferay.portal.service.ServiceContext"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName54.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes54, parameterTypes)) {
			return CourseSeriesServiceUtil.getBeanIdentifier();
		}

		if (_methodName55.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes55, parameterTypes)) {
			CourseSeriesServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName60.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes60, parameterTypes)) {
			return CourseSeriesServiceUtil.getCourseSeriesByGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName61.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes61, parameterTypes)) {
			return CourseSeriesServiceUtil.getCourseSeriesByGroupId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName62.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes62, parameterTypes)) {
			return CourseSeriesServiceUtil.getCourseSeriesByCourseId(((Long)arguments[0]).longValue());
		}

		if (_methodName63.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes63, parameterTypes)) {
			return CourseSeriesServiceUtil.getCourseSeriesByCourseId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName64.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes64, parameterTypes)) {
			return CourseSeriesServiceUtil.getCourseSeriesByLocationId(((Long)arguments[0]).longValue());
		}

		if (_methodName65.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes65, parameterTypes)) {
			return CourseSeriesServiceUtil.getCourseSeriesByLocationId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName66.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes66, parameterTypes)) {
			return CourseSeriesServiceUtil.getCourseSeriesByLocationId(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName68.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes68, parameterTypes)) {
			return CourseSeriesServiceUtil.addCourseSeries(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				(java.lang.String)arguments[3], (java.util.Date)arguments[4],
				(java.util.Date)arguments[5], (java.lang.String)arguments[6],
				((Long)arguments[7]).longValue(),
				(java.lang.String)arguments[8],
				((Long)arguments[9]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[10]);
		}

		if (_methodName69.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes69, parameterTypes)) {
			return CourseSeriesServiceUtil.updateCourse(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(), (java.util.Date)arguments[3],
				(java.util.Date)arguments[4], (java.lang.String)arguments[5],
				((Long)arguments[6]).longValue(),
				(java.lang.String)arguments[7],
				(com.liferay.portal.service.ServiceContext)arguments[8]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName54;
	private String[] _methodParameterTypes54;
	private String _methodName55;
	private String[] _methodParameterTypes55;
	private String _methodName60;
	private String[] _methodParameterTypes60;
	private String _methodName61;
	private String[] _methodParameterTypes61;
	private String _methodName62;
	private String[] _methodParameterTypes62;
	private String _methodName63;
	private String[] _methodParameterTypes63;
	private String _methodName64;
	private String[] _methodParameterTypes64;
	private String _methodName65;
	private String[] _methodParameterTypes65;
	private String _methodName66;
	private String[] _methodParameterTypes66;
	private String _methodName68;
	private String[] _methodParameterTypes68;
	private String _methodName69;
	private String[] _methodParameterTypes69;
}