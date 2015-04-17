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

import com.ocms.course.service.StudentRegistrationServiceUtil;

import java.util.Arrays;

/**
 * @author doraraj
 * @generated
 */
public class StudentRegistrationServiceClpInvoker {
	public StudentRegistrationServiceClpInvoker() {
		_methodName84 = "getBeanIdentifier";

		_methodParameterTypes84 = new String[] {  };

		_methodName85 = "setBeanIdentifier";

		_methodParameterTypes85 = new String[] { "java.lang.String" };

		_methodName90 = "getStudentRegistrationByGroupId";

		_methodParameterTypes90 = new String[] { "long" };

		_methodName91 = "getStudentRegistrationByGroupId";

		_methodParameterTypes91 = new String[] { "long", "int", "int" };

		_methodName92 = "getStudentRegistrationByStudentRegistrationId";

		_methodParameterTypes92 = new String[] { "long" };

		_methodName93 = "getStudentRegistrationByStudentRegistrationId";

		_methodParameterTypes93 = new String[] { "long", "int", "int" };

		_methodName95 = "addStudentRegistration";

		_methodParameterTypes95 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "long", "long",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"long", "java.lang.String", "java.lang.String", "long",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName96 = "updateStudentRegistration";

		_methodParameterTypes96 = new String[] {
				"long", "long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "long", "long",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"long", "java.lang.String", "java.lang.String", "long",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName97 = "deleteStudentRegistrationByStudentRegistrationId";

		_methodParameterTypes97 = new String[] { "long" };

		_methodName98 = "deleteStudentRegistrationByGrouptId";

		_methodParameterTypes98 = new String[] { "long" };

		_methodName99 = "deleteAllStudentRegistration";

		_methodParameterTypes99 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName84.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
			return StudentRegistrationServiceUtil.getBeanIdentifier();
		}

		if (_methodName85.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
			StudentRegistrationServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName90.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
			return StudentRegistrationServiceUtil.getStudentRegistrationByGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName91.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
			return StudentRegistrationServiceUtil.getStudentRegistrationByGroupId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName92.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes92, parameterTypes)) {
			return StudentRegistrationServiceUtil.getStudentRegistrationByStudentRegistrationId(((Long)arguments[0]).longValue());
		}

		if (_methodName93.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes93, parameterTypes)) {
			return StudentRegistrationServiceUtil.getStudentRegistrationByStudentRegistrationId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName95.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes95, parameterTypes)) {
			return StudentRegistrationServiceUtil.addStudentRegistration(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(java.lang.String)arguments[4], (java.lang.String)arguments[5],
				((Long)arguments[6]).longValue(),
				((Long)arguments[7]).longValue(),
				(java.lang.String)arguments[8], (java.lang.String)arguments[9],
				(java.lang.String)arguments[10],
				((Long)arguments[11]).longValue(),
				(java.lang.String)arguments[12],
				(java.lang.String)arguments[13],
				((Long)arguments[14]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[15]);
		}

		if (_methodName96.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
			return StudentRegistrationServiceUtil.updateStudentRegistration(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				((Long)arguments[7]).longValue(),
				((Long)arguments[8]).longValue(),
				(java.lang.String)arguments[9],
				(java.lang.String)arguments[10],
				(java.lang.String)arguments[11],
				((Long)arguments[12]).longValue(),
				(java.lang.String)arguments[13],
				(java.lang.String)arguments[14],
				((Long)arguments[15]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[16]);
		}

		if (_methodName97.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes97, parameterTypes)) {
			StudentRegistrationServiceUtil.deleteStudentRegistrationByStudentRegistrationId(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName98.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes98, parameterTypes)) {
			StudentRegistrationServiceUtil.deleteStudentRegistrationByGrouptId(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName99.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes99, parameterTypes)) {
			StudentRegistrationServiceUtil.deleteAllStudentRegistration();

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
}