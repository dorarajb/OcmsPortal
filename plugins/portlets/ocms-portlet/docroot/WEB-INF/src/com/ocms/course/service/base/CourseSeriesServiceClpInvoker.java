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
		_methodName84 = "getBeanIdentifier";

		_methodParameterTypes84 = new String[] {  };

		_methodName85 = "setBeanIdentifier";

		_methodParameterTypes85 = new String[] { "java.lang.String" };

		_methodName90 = "getCourseSeriesByGroupId";

		_methodParameterTypes90 = new String[] { "long" };

		_methodName91 = "getCourseSeriesByGroupId";

		_methodParameterTypes91 = new String[] { "long", "int", "int" };

		_methodName92 = "getCourseSeriesByCourseId";

		_methodParameterTypes92 = new String[] { "long" };

		_methodName93 = "getCourseSeriesByCourseId";

		_methodParameterTypes93 = new String[] { "long", "int", "int" };

		_methodName94 = "getCourseSeriesByLocationId";

		_methodParameterTypes94 = new String[] { "long" };

		_methodName95 = "getCourseSeriesByLocationId";

		_methodParameterTypes95 = new String[] { "long", "int", "int" };

		_methodName96 = "getCourseSeriesByLocationId";

		_methodParameterTypes96 = new String[] {
				"long", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName97 = "getCourseSeriesByFlagToListData";

		_methodParameterTypes97 = new String[] { "int" };

		_methodName98 = "getCourseSeriesByFlagToListData";

		_methodParameterTypes98 = new String[] { "int", "int", "int" };

		_methodName99 = "getCourseSeriesByGroupIdAndFlagToListData";

		_methodParameterTypes99 = new String[] { "long", "int" };

		_methodName100 = "getCourseSeriesByGroupIdAndFlagToListData";

		_methodParameterTypes100 = new String[] { "long", "int", "int", "int" };

		_methodName101 = "getCourseSeriesByCourseSeriesCode";

		_methodParameterTypes101 = new String[] { "java.lang.String" };

		_methodName102 = "getCourseSeriesByCourseSeriesCode";

		_methodParameterTypes102 = new String[] { "java.lang.String", "int", "int" };

		_methodName103 = "getCourseSeriesByCourseSeriesId";

		_methodParameterTypes103 = new String[] { "long" };

		_methodName104 = "getCourseSeriesByCourseSeriesId";

		_methodParameterTypes104 = new String[] { "long", "int", "int" };

		_methodName105 = "getCourseSeriesByLocationIdAndFlagToListData";

		_methodParameterTypes105 = new String[] { "long", "int" };

		_methodName106 = "getCourseSeriesByLocationIdAndFlagToListData";

		_methodParameterTypes106 = new String[] { "long", "int", "int", "int" };

		_methodName108 = "addCourseSeries";

		_methodParameterTypes108 = new String[] {
				"long", "long", "long", "java.lang.String", "java.lang.String",
				"int", "java.util.Date", "java.util.Date", "java.lang.String",
				"long", "java.lang.String", "long",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName109 = "updateCourse";

		_methodParameterTypes109 = new String[] {
				"long", "long", "java.util.Date", "java.util.Date",
				"java.lang.String", "long", "java.lang.String",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName110 = "deleteCourseSeriesByCourseSeriesId";

		_methodParameterTypes110 = new String[] { "long" };

		_methodName111 = "deleteCourseSeriesByCourseSeriesIdCode";

		_methodParameterTypes111 = new String[] { "long" };

		_methodName112 = "deleteCourseSeriesByGrouptId";

		_methodParameterTypes112 = new String[] { "long" };

		_methodName113 = "deleteCourseSeriesByCourseSeriesCode";

		_methodParameterTypes113 = new String[] { "java.lang.String" };

		_methodName114 = "deleteAllCourseSeries";

		_methodParameterTypes114 = new String[] {  };

		_methodName115 = "deleteCourseSeriesEvent";

		_methodParameterTypes115 = new String[] { "long" };

		_methodName116 = "addCourseSeriesLoop";

		_methodParameterTypes116 = new String[] {
				"long[][]", "long[][]",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName117 = "updateCourseSeriesStartDate";

		_methodParameterTypes117 = new String[] { "long", "java.util.Date" };

		_methodName118 = "updateCourseSeriesEndDate";

		_methodParameterTypes118 = new String[] { "long", "java.util.Date" };

		_methodName119 = "updateFlagToChkEventCreation";

		_methodParameterTypes119 = new String[] {
				"com.ocms.course.model.CourseSeries"
			};

		_methodName120 = "updateDayAndMonthName";

		_methodParameterTypes120 = new String[] {  };

		_methodName121 = "createEvent";

		_methodParameterTypes121 = new String[] {
				"java.lang.String", "com.liferay.portal.service.ServiceContext"
			};

		_methodName122 = "createEventList";

		_methodParameterTypes122 = new String[] {
				"java.lang.String[][]",
				"com.liferay.portal.service.ServiceContext"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName84.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
			return CourseSeriesServiceUtil.getBeanIdentifier();
		}

		if (_methodName85.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
			CourseSeriesServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName90.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
			return CourseSeriesServiceUtil.getCourseSeriesByGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName91.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
			return CourseSeriesServiceUtil.getCourseSeriesByGroupId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName92.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes92, parameterTypes)) {
			return CourseSeriesServiceUtil.getCourseSeriesByCourseId(((Long)arguments[0]).longValue());
		}

		if (_methodName93.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes93, parameterTypes)) {
			return CourseSeriesServiceUtil.getCourseSeriesByCourseId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName94.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes94, parameterTypes)) {
			return CourseSeriesServiceUtil.getCourseSeriesByLocationId(((Long)arguments[0]).longValue());
		}

		if (_methodName95.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes95, parameterTypes)) {
			return CourseSeriesServiceUtil.getCourseSeriesByLocationId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName96.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
			return CourseSeriesServiceUtil.getCourseSeriesByLocationId(((Long)arguments[0]).longValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[1]);
		}

		if (_methodName97.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes97, parameterTypes)) {
			return CourseSeriesServiceUtil.getCourseSeriesByFlagToListData(((Integer)arguments[0]).intValue());
		}

		if (_methodName98.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes98, parameterTypes)) {
			return CourseSeriesServiceUtil.getCourseSeriesByFlagToListData(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName99.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes99, parameterTypes)) {
			return CourseSeriesServiceUtil.getCourseSeriesByGroupIdAndFlagToListData(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName100.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes100, parameterTypes)) {
			return CourseSeriesServiceUtil.getCourseSeriesByGroupIdAndFlagToListData(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName101.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes101, parameterTypes)) {
			return CourseSeriesServiceUtil.getCourseSeriesByCourseSeriesCode((java.lang.String)arguments[0]);
		}

		if (_methodName102.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes102, parameterTypes)) {
			return CourseSeriesServiceUtil.getCourseSeriesByCourseSeriesCode((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName103.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes103, parameterTypes)) {
			return CourseSeriesServiceUtil.getCourseSeriesByCourseSeriesId(((Long)arguments[0]).longValue());
		}

		if (_methodName104.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes104, parameterTypes)) {
			return CourseSeriesServiceUtil.getCourseSeriesByCourseSeriesId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName105.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes105, parameterTypes)) {
			return CourseSeriesServiceUtil.getCourseSeriesByLocationIdAndFlagToListData(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName106.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
			return CourseSeriesServiceUtil.getCourseSeriesByLocationIdAndFlagToListData(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName108.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes108, parameterTypes)) {
			return CourseSeriesServiceUtil.addCourseSeries(((Long)arguments[0]).longValue(),
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

		if (_methodName109.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes109, parameterTypes)) {
			return CourseSeriesServiceUtil.updateCourse(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(), (java.util.Date)arguments[2],
				(java.util.Date)arguments[3], (java.lang.String)arguments[4],
				((Long)arguments[5]).longValue(),
				(java.lang.String)arguments[6],
				(com.liferay.portal.service.ServiceContext)arguments[7]);
		}

		if (_methodName110.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes110, parameterTypes)) {
			CourseSeriesServiceUtil.deleteCourseSeriesByCourseSeriesId(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName111.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes111, parameterTypes)) {
			CourseSeriesServiceUtil.deleteCourseSeriesByCourseSeriesIdCode(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName112.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes112, parameterTypes)) {
			CourseSeriesServiceUtil.deleteCourseSeriesByGrouptId(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName113.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes113, parameterTypes)) {
			CourseSeriesServiceUtil.deleteCourseSeriesByCourseSeriesCode((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName114.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes114, parameterTypes)) {
			CourseSeriesServiceUtil.deleteAllCourseSeries();

			return null;
		}

		if (_methodName115.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes115, parameterTypes)) {
			CourseSeriesServiceUtil.deleteCourseSeriesEvent(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName116.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes116, parameterTypes)) {
			CourseSeriesServiceUtil.addCourseSeriesLoop((long[])arguments[0],
				(long[])arguments[1],
				(com.liferay.portal.service.ServiceContext)arguments[2]);

			return null;
		}

		if (_methodName117.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes117, parameterTypes)) {
			CourseSeriesServiceUtil.updateCourseSeriesStartDate(((Long)arguments[0]).longValue(),
				(java.util.Date)arguments[1]);

			return null;
		}

		if (_methodName118.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes118, parameterTypes)) {
			CourseSeriesServiceUtil.updateCourseSeriesEndDate(((Long)arguments[0]).longValue(),
				(java.util.Date)arguments[1]);

			return null;
		}

		if (_methodName119.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes119, parameterTypes)) {
			CourseSeriesServiceUtil.updateFlagToChkEventCreation((com.ocms.course.model.CourseSeries)arguments[0]);

			return null;
		}

		if (_methodName120.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes120, parameterTypes)) {
			CourseSeriesServiceUtil.updateDayAndMonthName();

			return null;
		}

		if (_methodName121.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes121, parameterTypes)) {
			CourseSeriesServiceUtil.createEvent((java.lang.String)arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1]);

			return null;
		}

		if (_methodName122.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes122, parameterTypes)) {
			CourseSeriesServiceUtil.createEventList((java.lang.String[])arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1]);

			return null;
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName84;
	private String[] _methodParameterTypes84;
	private String _methodName85;
	private String[] _methodParameterTypes85;
	private String _methodName90;
	private String[] _methodParameterTypes90;
	private String _methodName91;
	private String[] _methodParameterTypes91;
	private String _methodName92;
	private String[] _methodParameterTypes92;
	private String _methodName93;
	private String[] _methodParameterTypes93;
	private String _methodName94;
	private String[] _methodParameterTypes94;
	private String _methodName95;
	private String[] _methodParameterTypes95;
	private String _methodName96;
	private String[] _methodParameterTypes96;
	private String _methodName97;
	private String[] _methodParameterTypes97;
	private String _methodName98;
	private String[] _methodParameterTypes98;
	private String _methodName99;
	private String[] _methodParameterTypes99;
	private String _methodName100;
	private String[] _methodParameterTypes100;
	private String _methodName101;
	private String[] _methodParameterTypes101;
	private String _methodName102;
	private String[] _methodParameterTypes102;
	private String _methodName103;
	private String[] _methodParameterTypes103;
	private String _methodName104;
	private String[] _methodParameterTypes104;
	private String _methodName105;
	private String[] _methodParameterTypes105;
	private String _methodName106;
	private String[] _methodParameterTypes106;
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
	private String _methodName121;
	private String[] _methodParameterTypes121;
	private String _methodName122;
	private String[] _methodParameterTypes122;
}