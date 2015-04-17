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

import com.ocms.course.service.RegistrationDetailsServiceUtil;

import java.util.Arrays;

/**
 * @author doraraj
 * @generated
 */
public class RegistrationDetailsServiceClpInvoker {
	public RegistrationDetailsServiceClpInvoker() {
		_methodName84 = "getBeanIdentifier";

		_methodParameterTypes84 = new String[] {  };

		_methodName85 = "setBeanIdentifier";

		_methodParameterTypes85 = new String[] { "java.lang.String" };

		_methodName90 = "getRegistrationDetailsByGroupId";

		_methodParameterTypes90 = new String[] { "long" };

		_methodName91 = "getRegistrationDetailsByGroupId";

		_methodParameterTypes91 = new String[] { "long", "int", "int" };

		_methodName92 = "getRegistrationDetailsByRegistrationDetailsId";

		_methodParameterTypes92 = new String[] { "long" };

		_methodName93 = "getRegistrationDetailsByRegistrationDetailsId";

		_methodParameterTypes93 = new String[] { "long", "int", "int" };

		_methodName95 = "addRegistrationDetails";

		_methodParameterTypes95 = new String[] {
				"long", "long", "long", "long", "double", "double", "double",
				"double", "com.liferay.portal.service.ServiceContext"
			};

		_methodName96 = "updateRegistrationDetails";

		_methodParameterTypes96 = new String[] {
				"long", "long", "long", "long", "long", "double", "double",
				"double", "double", "com.liferay.portal.service.ServiceContext"
			};

		_methodName97 = "deleteRegistrationDetailsByRegistrationDetailsId";

		_methodParameterTypes97 = new String[] { "long" };

		_methodName98 = "deleteRegistrationDetailsByGrouptId";

		_methodParameterTypes98 = new String[] { "long" };

		_methodName99 = "deleteAllRegistrationDetails";

		_methodParameterTypes99 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName84.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
			return RegistrationDetailsServiceUtil.getBeanIdentifier();
		}

		if (_methodName85.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
			RegistrationDetailsServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName90.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
			return RegistrationDetailsServiceUtil.getRegistrationDetailsByGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName91.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
			return RegistrationDetailsServiceUtil.getRegistrationDetailsByGroupId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName92.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes92, parameterTypes)) {
			return RegistrationDetailsServiceUtil.getRegistrationDetailsByRegistrationDetailsId(((Long)arguments[0]).longValue());
		}

		if (_methodName93.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes93, parameterTypes)) {
			return RegistrationDetailsServiceUtil.getRegistrationDetailsByRegistrationDetailsId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName95.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes95, parameterTypes)) {
			return RegistrationDetailsServiceUtil.addRegistrationDetails(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				((Long)arguments[3]).longValue(),
				((Double)arguments[4]).doubleValue(),
				((Double)arguments[5]).doubleValue(),
				((Double)arguments[6]).doubleValue(),
				((Double)arguments[7]).doubleValue(),
				(com.liferay.portal.service.ServiceContext)arguments[8]);
		}

		if (_methodName96.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
			return RegistrationDetailsServiceUtil.updateRegistrationDetails(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				((Long)arguments[3]).longValue(),
				((Long)arguments[4]).longValue(),
				((Double)arguments[5]).doubleValue(),
				((Double)arguments[6]).doubleValue(),
				((Double)arguments[7]).doubleValue(),
				((Double)arguments[8]).doubleValue(),
				(com.liferay.portal.service.ServiceContext)arguments[9]);
		}

		if (_methodName97.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes97, parameterTypes)) {
			RegistrationDetailsServiceUtil.deleteRegistrationDetailsByRegistrationDetailsId(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName98.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes98, parameterTypes)) {
			RegistrationDetailsServiceUtil.deleteRegistrationDetailsByGrouptId(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName99.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes99, parameterTypes)) {
			RegistrationDetailsServiceUtil.deleteAllRegistrationDetails();

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