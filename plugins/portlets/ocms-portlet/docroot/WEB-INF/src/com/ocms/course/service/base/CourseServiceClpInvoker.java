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

import com.ocms.course.service.CourseServiceUtil;

import java.util.Arrays;

/**
 * @author doraraj
 * @generated
 */
public class CourseServiceClpInvoker {
	public CourseServiceClpInvoker() {
		_methodName84 = "getBeanIdentifier";

		_methodParameterTypes84 = new String[] {  };

		_methodName85 = "setBeanIdentifier";

		_methodParameterTypes85 = new String[] { "java.lang.String" };

		_methodName90 = "getCourse";

		_methodParameterTypes90 = new String[] {  };

		_methodName91 = "getCoursesByGroupId";

		_methodParameterTypes91 = new String[] { "long" };

		_methodName92 = "getCoursesByGroupId";

		_methodParameterTypes92 = new String[] { "long", "int", "int" };

		_methodName93 = "getCoursesByCourseId";

		_methodParameterTypes93 = new String[] { "long" };

		_methodName94 = "getCoursesByCourseId";

		_methodParameterTypes94 = new String[] { "long", "int", "int" };

		_methodName96 = "addCourse";

		_methodParameterTypes96 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName97 = "updateCourse";

		_methodParameterTypes97 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String", "com.liferay.portal.service.ServiceContext"
			};

		_methodName98 = "deleteCourseByCourseId";

		_methodParameterTypes98 = new String[] { "long" };

		_methodName99 = "deleteCourseByGrouptId";

		_methodParameterTypes99 = new String[] { "long" };

		_methodName100 = "deleteAllCourse";

		_methodParameterTypes100 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName84.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
			return CourseServiceUtil.getBeanIdentifier();
		}

		if (_methodName85.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
			CourseServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName90.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
			return CourseServiceUtil.getCourse();
		}

		if (_methodName91.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
			return CourseServiceUtil.getCoursesByGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName92.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes92, parameterTypes)) {
			return CourseServiceUtil.getCoursesByGroupId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName93.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes93, parameterTypes)) {
			return CourseServiceUtil.getCoursesByCourseId(((Long)arguments[0]).longValue());
		}

		if (_methodName94.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes94, parameterTypes)) {
			return CourseServiceUtil.getCoursesByCourseId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName96.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
			return CourseServiceUtil.addCourse((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(com.liferay.portal.service.ServiceContext)arguments[3]);
		}

		if (_methodName97.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes97, parameterTypes)) {
			return CourseServiceUtil.updateCourse(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3],
				(com.liferay.portal.service.ServiceContext)arguments[4]);
		}

		if (_methodName98.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes98, parameterTypes)) {
			CourseServiceUtil.deleteCourseByCourseId(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName99.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes99, parameterTypes)) {
			CourseServiceUtil.deleteCourseByGrouptId(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName100.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes100, parameterTypes)) {
			CourseServiceUtil.deleteAllCourse();

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
}