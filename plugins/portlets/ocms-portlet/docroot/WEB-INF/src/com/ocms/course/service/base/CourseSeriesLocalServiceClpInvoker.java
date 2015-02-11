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

import com.ocms.course.service.CourseSeriesLocalServiceUtil;

import java.util.Arrays;

/**
 * @author doraraj
 * @generated
 */
public class CourseSeriesLocalServiceClpInvoker {
	public CourseSeriesLocalServiceClpInvoker() {
		_methodName0 = "addCourseSeries";

		_methodParameterTypes0 = new String[] {
				"com.ocms.course.model.CourseSeries"
			};

		_methodName1 = "createCourseSeries";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteCourseSeries";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteCourseSeries";

		_methodParameterTypes3 = new String[] {
				"com.ocms.course.model.CourseSeries"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchCourseSeries";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getCourseSeries";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getCourseSerieses";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getCourseSeriesesCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateCourseSeries";

		_methodParameterTypes15 = new String[] {
				"com.ocms.course.model.CourseSeries"
			};

		_methodName70 = "getBeanIdentifier";

		_methodParameterTypes70 = new String[] {  };

		_methodName71 = "setBeanIdentifier";

		_methodParameterTypes71 = new String[] { "java.lang.String" };

		_methodName76 = "getCourseSeriesByGroupId";

		_methodParameterTypes76 = new String[] { "long" };

		_methodName77 = "getCourseSeriesByGroupId";

		_methodParameterTypes77 = new String[] { "long", "int", "int" };

		_methodName78 = "getCourseSeriesByCourseId";

		_methodParameterTypes78 = new String[] { "long" };

		_methodName79 = "getCourseSeriesByCourseId";

		_methodParameterTypes79 = new String[] { "long", "int", "int" };

		_methodName80 = "getCourseSeriesByLocationId";

		_methodParameterTypes80 = new String[] { "long" };

		_methodName81 = "getCourseSeriesByLocationId";

		_methodParameterTypes81 = new String[] { "long", "int", "int" };

		_methodName82 = "getCourseSeriesByLocationId";

		_methodParameterTypes82 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName83 = "getCourseSeriesByCourseSeriesCode";

		_methodParameterTypes83 = new String[] { "java.lang.String" };

		_methodName85 = "addCourseSeries";

		_methodParameterTypes85 = new String[] {
				"long", "long", "long", "java.lang.String", "java.util.Date",
				"java.util.Date", "java.lang.String", "long", "java.lang.String",
				"long", "com.liferay.portal.service.ServiceContext"
			};

		_methodName86 = "updateCourse";

		_methodParameterTypes86 = new String[] {
				"long", "long", "long", "java.util.Date", "java.util.Date",
				"java.lang.String", "long", "java.lang.String",
				"com.liferay.portal.service.ServiceContext"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.addCourseSeries((com.ocms.course.model.CourseSeries)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.createCourseSeries(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.deleteCourseSeries(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.deleteCourseSeries((com.ocms.course.model.CourseSeries)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.fetchCourseSeries(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.getCourseSeries(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.getCourseSerieses(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.getCourseSeriesesCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.updateCourseSeries((com.ocms.course.model.CourseSeries)arguments[0]);
		}

		if (_methodName70.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes70, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName71.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes71, parameterTypes)) {
			CourseSeriesLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName76.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes76, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.getCourseSeriesByGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName77.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes77, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.getCourseSeriesByGroupId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName78.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes78, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.getCourseSeriesByCourseId(((Long)arguments[0]).longValue());
		}

		if (_methodName79.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes79, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.getCourseSeriesByCourseId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName80.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes80, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.getCourseSeriesByLocationId(((Long)arguments[0]).longValue());
		}

		if (_methodName81.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes81, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.getCourseSeriesByLocationId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName82.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes82, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.getCourseSeriesByLocationId(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName83.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes83, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.getCourseSeriesByCourseSeriesCode((java.lang.String)arguments[0]);
		}

		if (_methodName85.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.addCourseSeries(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				(java.lang.String)arguments[3], (java.util.Date)arguments[4],
				(java.util.Date)arguments[5], (java.lang.String)arguments[6],
				((Long)arguments[7]).longValue(),
				(java.lang.String)arguments[8],
				((Long)arguments[9]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[10]);
		}

		if (_methodName86.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes86, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.updateCourse(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(), (java.util.Date)arguments[3],
				(java.util.Date)arguments[4], (java.lang.String)arguments[5],
				((Long)arguments[6]).longValue(),
				(java.lang.String)arguments[7],
				(com.liferay.portal.service.ServiceContext)arguments[8]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
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
	private String _methodName70;
	private String[] _methodParameterTypes70;
	private String _methodName71;
	private String[] _methodParameterTypes71;
	private String _methodName76;
	private String[] _methodParameterTypes76;
	private String _methodName77;
	private String[] _methodParameterTypes77;
	private String _methodName78;
	private String[] _methodParameterTypes78;
	private String _methodName79;
	private String[] _methodParameterTypes79;
	private String _methodName80;
	private String[] _methodParameterTypes80;
	private String _methodName81;
	private String[] _methodParameterTypes81;
	private String _methodName82;
	private String[] _methodParameterTypes82;
	private String _methodName83;
	private String[] _methodParameterTypes83;
	private String _methodName85;
	private String[] _methodParameterTypes85;
	private String _methodName86;
	private String[] _methodParameterTypes86;
}