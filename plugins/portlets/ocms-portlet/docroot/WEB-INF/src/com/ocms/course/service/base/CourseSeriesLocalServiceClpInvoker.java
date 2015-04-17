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

		_methodName100 = "getBeanIdentifier";

		_methodParameterTypes100 = new String[] {  };

		_methodName101 = "setBeanIdentifier";

		_methodParameterTypes101 = new String[] { "java.lang.String" };

		_methodName106 = "getCourseSeriesByGroupId";

		_methodParameterTypes106 = new String[] { "long" };

		_methodName107 = "getCourseSeriesByGroupId";

		_methodParameterTypes107 = new String[] { "long", "int", "int" };

		_methodName108 = "getCourseSeriesByCourseId";

		_methodParameterTypes108 = new String[] { "long" };

		_methodName109 = "getCourseSeriesByCourseId";

		_methodParameterTypes109 = new String[] { "long", "int", "int" };

		_methodName110 = "getCourseSeriesByLocationId";

		_methodParameterTypes110 = new String[] { "long" };

		_methodName111 = "getCourseSeriesByLocationId";

		_methodParameterTypes111 = new String[] { "long", "int", "int" };

		_methodName112 = "getCourseSeriesByLocationId";

		_methodParameterTypes112 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName113 = "getCourseSeriesByFlagToListData";

		_methodParameterTypes113 = new String[] { "int" };

		_methodName114 = "getCourseSeriesByFlagToListData";

		_methodParameterTypes114 = new String[] { "int", "int", "int" };

		_methodName115 = "getCourseSeriesByGroupIdAndFlagToListData";

		_methodParameterTypes115 = new String[] { "long", "int" };

		_methodName116 = "getCourseSeriesByGroupIdAndFlagToListData";

		_methodParameterTypes116 = new String[] { "long", "int", "int", "int" };

		_methodName117 = "getCourseSeriesByCourseSeriesCode";

		_methodParameterTypes117 = new String[] { "java.lang.String" };

		_methodName118 = "getCourseSeriesByCourseSeriesCode";

		_methodParameterTypes118 = new String[] { "java.lang.String", "int", "int" };

		_methodName119 = "getCourseSeriesByCourseSeriesId";

		_methodParameterTypes119 = new String[] { "long" };

		_methodName120 = "getCourseSeriesByCourseSeriesId";

		_methodParameterTypes120 = new String[] { "long", "int", "int" };

		_methodName122 = "addCourseSeries";

		_methodParameterTypes122 = new String[] {
				"long", "long", "long", "java.lang.String", "java.lang.String",
				"int", "java.util.Date", "java.util.Date", "java.lang.String",
				"long", "java.lang.String", "long",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName123 = "updateCourse";

		_methodParameterTypes123 = new String[] {
				"long", "long", "java.util.Date", "java.util.Date",
				"java.lang.String", "long", "java.lang.String",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName124 = "deleteCourseSeriesByCourseSeriesId";

		_methodParameterTypes124 = new String[] { "long" };

		_methodName125 = "deleteCourseSeriesByCourseSeriesIdCode";

		_methodParameterTypes125 = new String[] { "long" };

		_methodName126 = "deleteCourseSeriesByGrouptId";

		_methodParameterTypes126 = new String[] { "long" };

		_methodName127 = "deleteCourseSeriesByCourseSeriesCode";

		_methodParameterTypes127 = new String[] { "java.lang.String" };

		_methodName128 = "deleteAllCourseSeries";

		_methodParameterTypes128 = new String[] {  };

		_methodName129 = "addCourseSeriesLoop";

		_methodParameterTypes129 = new String[] {
				"long[][]", "long[][]",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName130 = "updateFlagToChkEventCreation";

		_methodParameterTypes130 = new String[] {
				"com.ocms.course.model.CourseSeries"
			};

		_methodName131 = "createEvent";

		_methodParameterTypes131 = new String[] {
				"java.lang.String", "com.liferay.portal.service.ServiceContext"
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

		if (_methodName100.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes100, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName101.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes101, parameterTypes)) {
			CourseSeriesLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName106.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.getCourseSeriesByGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName107.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes107, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.getCourseSeriesByGroupId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName108.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes108, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.getCourseSeriesByCourseId(((Long)arguments[0]).longValue());
		}

		if (_methodName109.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes109, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.getCourseSeriesByCourseId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName110.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes110, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.getCourseSeriesByLocationId(((Long)arguments[0]).longValue());
		}

		if (_methodName111.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes111, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.getCourseSeriesByLocationId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName112.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes112, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.getCourseSeriesByLocationId(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName113.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes113, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.getCourseSeriesByFlagToListData(((Integer)arguments[0]).intValue());
		}

		if (_methodName114.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes114, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.getCourseSeriesByFlagToListData(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName115.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes115, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.getCourseSeriesByGroupIdAndFlagToListData(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName116.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes116, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.getCourseSeriesByGroupIdAndFlagToListData(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName117.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes117, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.getCourseSeriesByCourseSeriesCode((java.lang.String)arguments[0]);
		}

		if (_methodName118.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes118, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.getCourseSeriesByCourseSeriesCode((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName119.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes119, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.getCourseSeriesByCourseSeriesId(((Long)arguments[0]).longValue());
		}

		if (_methodName120.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes120, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.getCourseSeriesByCourseSeriesId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName122.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes122, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.addCourseSeries(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				((Integer)arguments[5]).intValue(),
				(java.util.Date)arguments[6], (java.util.Date)arguments[7],
				(java.lang.String)arguments[8],
				((Long)arguments[9]).longValue(),
				(java.lang.String)arguments[10],
				((Long)arguments[11]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[12]);
		}

		if (_methodName123.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes123, parameterTypes)) {
			return CourseSeriesLocalServiceUtil.updateCourse(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(), (java.util.Date)arguments[2],
				(java.util.Date)arguments[3], (java.lang.String)arguments[4],
				((Long)arguments[5]).longValue(),
				(java.lang.String)arguments[6],
				(com.liferay.portal.service.ServiceContext)arguments[7]);
		}

		if (_methodName124.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes124, parameterTypes)) {
			CourseSeriesLocalServiceUtil.deleteCourseSeriesByCourseSeriesId(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName125.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes125, parameterTypes)) {
			CourseSeriesLocalServiceUtil.deleteCourseSeriesByCourseSeriesIdCode(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName126.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes126, parameterTypes)) {
			CourseSeriesLocalServiceUtil.deleteCourseSeriesByGrouptId(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName127.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes127, parameterTypes)) {
			CourseSeriesLocalServiceUtil.deleteCourseSeriesByCourseSeriesCode((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName128.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes128, parameterTypes)) {
			CourseSeriesLocalServiceUtil.deleteAllCourseSeries();

			return null;
		}

		if (_methodName129.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes129, parameterTypes)) {
			CourseSeriesLocalServiceUtil.addCourseSeriesLoop((long[])arguments[0],
				(long[])arguments[1],
				(com.liferay.portal.service.ServiceContext)arguments[2]);

			return null;
		}

		if (_methodName130.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes130, parameterTypes)) {
			CourseSeriesLocalServiceUtil.updateFlagToChkEventCreation((com.ocms.course.model.CourseSeries)arguments[0]);

			return null;
		}

		if (_methodName131.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes131, parameterTypes)) {
			CourseSeriesLocalServiceUtil.createEvent((java.lang.String)arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1]);

			return null;
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
	private String _methodName100;
	private String[] _methodParameterTypes100;
	private String _methodName101;
	private String[] _methodParameterTypes101;
	private String _methodName106;
	private String[] _methodParameterTypes106;
	private String _methodName107;
	private String[] _methodParameterTypes107;
	private String _methodName108;
	private String[] _methodParameterTypes108;
	private String _methodName109;
	private String[] _methodParameterTypes109;
	private String _methodName110;
	private String[] _methodParameterTypes110;
	private String _methodName111;
	private String[] _methodParameterTypes111;
	private String _methodName112;
	private String[] _methodParameterTypes112;
	private String _methodName113;
	private String[] _methodParameterTypes113;
	private String _methodName114;
	private String[] _methodParameterTypes114;
	private String _methodName115;
	private String[] _methodParameterTypes115;
	private String _methodName116;
	private String[] _methodParameterTypes116;
	private String _methodName117;
	private String[] _methodParameterTypes117;
	private String _methodName118;
	private String[] _methodParameterTypes118;
	private String _methodName119;
	private String[] _methodParameterTypes119;
	private String _methodName120;
	private String[] _methodParameterTypes120;
	private String _methodName122;
	private String[] _methodParameterTypes122;
	private String _methodName123;
	private String[] _methodParameterTypes123;
	private String _methodName124;
	private String[] _methodParameterTypes124;
	private String _methodName125;
	private String[] _methodParameterTypes125;
	private String _methodName126;
	private String[] _methodParameterTypes126;
	private String _methodName127;
	private String[] _methodParameterTypes127;
	private String _methodName128;
	private String[] _methodParameterTypes128;
	private String _methodName129;
	private String[] _methodParameterTypes129;
	private String _methodName130;
	private String[] _methodParameterTypes130;
	private String _methodName131;
	private String[] _methodParameterTypes131;
}