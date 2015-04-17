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
		_methodName84 = "getBeanIdentifier";

		_methodParameterTypes84 = new String[] {  };

		_methodName85 = "setBeanIdentifier";

		_methodParameterTypes85 = new String[] { "java.lang.String" };

		_methodName90 = "getEventByGroupId";

		_methodParameterTypes90 = new String[] { "long" };

		_methodName91 = "getEventByGroupId";

		_methodParameterTypes91 = new String[] { "long", "int", "int" };

		_methodName92 = "getEventByEventId";

		_methodParameterTypes92 = new String[] { "long" };

		_methodName93 = "getEventByEventId";

		_methodParameterTypes93 = new String[] { "long", "int", "int" };

		_methodName94 = "getEventByFlag";

		_methodParameterTypes94 = new String[] { "int" };

		_methodName95 = "getEventByFlag";

		_methodParameterTypes95 = new String[] { "int", "int", "int" };

		_methodName96 = "getEventByUserIdFlag";

		_methodParameterTypes96 = new String[] { "long", "int" };

		_methodName97 = "getEventByUserIdFlag";

		_methodParameterTypes97 = new String[] { "long", "int", "int", "int" };

		_methodName98 = "getEventByUserIdFlagGrouId";

		_methodParameterTypes98 = new String[] { "long", "int", "long" };

		_methodName99 = "getEventByUserIdFlagGroupId";

		_methodParameterTypes99 = new String[] {
				"long", "int", "long", "int", "int"
			};

		_methodName101 = "addEvent";

		_methodParameterTypes101 = new String[] {
				"java.lang.String", "long", "long", "java.util.Date",
				"java.util.Date", "int",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName102 = "updateEvent";

		_methodParameterTypes102 = new String[] {
				"long", "java.lang.String", "long", "long", "java.util.Date",
				"java.util.Date", "int",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName103 = "updateEventFlag";

		_methodParameterTypes103 = new String[] {
				"com.ocms.course.model.Event", "int"
			};

		_methodName104 = "deleteEventByEventId";

		_methodParameterTypes104 = new String[] { "long" };

		_methodName105 = "deleteEventByGrouptId";

		_methodParameterTypes105 = new String[] { "long" };

		_methodName106 = "deleteAllEvent";

		_methodParameterTypes106 = new String[] {  };

		_methodName107 = "FMAddEvent";

		_methodParameterTypes107 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName84.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
			return EventServiceUtil.getBeanIdentifier();
		}

		if (_methodName85.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
			EventServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName90.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
			return EventServiceUtil.getEventByGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName91.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
			return EventServiceUtil.getEventByGroupId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName92.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes92, parameterTypes)) {
			return EventServiceUtil.getEventByEventId(((Long)arguments[0]).longValue());
		}

		if (_methodName93.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes93, parameterTypes)) {
			return EventServiceUtil.getEventByEventId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName94.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes94, parameterTypes)) {
			return EventServiceUtil.getEventByFlag(((Integer)arguments[0]).intValue());
		}

		if (_methodName95.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes95, parameterTypes)) {
			return EventServiceUtil.getEventByFlag(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName96.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
			return EventServiceUtil.getEventByUserIdFlag(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName97.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes97, parameterTypes)) {
			return EventServiceUtil.getEventByUserIdFlag(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName98.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes98, parameterTypes)) {
			return EventServiceUtil.getEventByUserIdFlagGrouId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Long)arguments[2]).longValue());
		}

		if (_methodName99.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes99, parameterTypes)) {
			return EventServiceUtil.getEventByUserIdFlagGroupId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Long)arguments[2]).longValue(),
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue());
		}

		if (_methodName101.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes101, parameterTypes)) {
			return EventServiceUtil.addEvent((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(), (java.util.Date)arguments[3],
				(java.util.Date)arguments[4],
				((Integer)arguments[5]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[6]);
		}

		if (_methodName102.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes102, parameterTypes)) {
			return EventServiceUtil.updateEvent(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				((Long)arguments[2]).longValue(),
				((Long)arguments[3]).longValue(), (java.util.Date)arguments[4],
				(java.util.Date)arguments[5],
				((Integer)arguments[6]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[7]);
		}

		if (_methodName103.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes103, parameterTypes)) {
			return EventServiceUtil.updateEventFlag((com.ocms.course.model.Event)arguments[0],
				((Integer)arguments[1]).intValue());
		}

		if (_methodName104.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes104, parameterTypes)) {
			EventServiceUtil.deleteEventByEventId(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName105.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes105, parameterTypes)) {
			EventServiceUtil.deleteEventByGrouptId(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName106.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
			EventServiceUtil.deleteAllEvent();

			return null;
		}

		if (_methodName107.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes107, parameterTypes)) {
			EventServiceUtil.FMAddEvent();

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
	private String _methodName107;
	private String[] _methodParameterTypes107;
}