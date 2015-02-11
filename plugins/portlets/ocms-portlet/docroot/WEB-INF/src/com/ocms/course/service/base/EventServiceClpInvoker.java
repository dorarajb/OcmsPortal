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

import com.ocms.course.service.EventServiceUtil;

import java.util.Arrays;

/**
 * @author doraraj
 * @generated
 */
public class EventServiceClpInvoker {
	public EventServiceClpInvoker() {
		_methodName54 = "getBeanIdentifier";

		_methodParameterTypes54 = new String[] {  };

		_methodName55 = "setBeanIdentifier";

		_methodParameterTypes55 = new String[] { "java.lang.String" };

		_methodName60 = "getEventByGroupId";

		_methodParameterTypes60 = new String[] { "long" };

		_methodName61 = "getEventByGroupId";

		_methodParameterTypes61 = new String[] { "long", "int", "int" };

		_methodName62 = "getEventByEventId";

		_methodParameterTypes62 = new String[] { "long" };

		_methodName63 = "getEventByEventId";

		_methodParameterTypes63 = new String[] { "long", "int", "int" };

		_methodName64 = "getEventByFlag";

		_methodParameterTypes64 = new String[] { "int" };

		_methodName66 = "addEvent";

		_methodParameterTypes66 = new String[] {
				"long", "java.lang.String", "long", "java.lang.String", "long",
				"java.lang.String", "java.util.Date", "java.util.Date", "int",
				"com.liferay.portal.service.ServiceContext"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName54.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes54, parameterTypes)) {
			return EventServiceUtil.getBeanIdentifier();
		}

		if (_methodName55.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes55, parameterTypes)) {
			EventServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName60.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes60, parameterTypes)) {
			return EventServiceUtil.getEventByGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName61.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes61, parameterTypes)) {
			return EventServiceUtil.getEventByGroupId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName62.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes62, parameterTypes)) {
			return EventServiceUtil.getEventByEventId(((Long)arguments[0]).longValue());
		}

		if (_methodName63.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes63, parameterTypes)) {
			return EventServiceUtil.getEventByEventId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName64.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes64, parameterTypes)) {
			return EventServiceUtil.getEventByFlag(((Integer)arguments[0]).intValue());
		}

		if (_methodName66.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes66, parameterTypes)) {
			return EventServiceUtil.addEvent(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				((Long)arguments[2]).longValue(),
				(java.lang.String)arguments[3],
				((Long)arguments[4]).longValue(),
				(java.lang.String)arguments[5], (java.util.Date)arguments[6],
				(java.util.Date)arguments[7],
				((Integer)arguments[8]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[9]);
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
	private String _methodName66;
	private String[] _methodParameterTypes66;
}