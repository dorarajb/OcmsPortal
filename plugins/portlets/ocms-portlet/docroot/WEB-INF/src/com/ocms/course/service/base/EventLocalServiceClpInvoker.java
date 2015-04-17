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

import com.ocms.course.service.EventLocalServiceUtil;

import java.util.Arrays;

/**
 * @author doraraj
 * @generated
 */
public class EventLocalServiceClpInvoker {
	public EventLocalServiceClpInvoker() {
		_methodName0 = "addEvent";

		_methodParameterTypes0 = new String[] { "com.ocms.course.model.Event" };

		_methodName1 = "createEvent";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteEvent";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteEvent";

		_methodParameterTypes3 = new String[] { "com.ocms.course.model.Event" };

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

		_methodName10 = "fetchEvent";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getEvent";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getEvents";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getEventsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateEvent";

		_methodParameterTypes15 = new String[] { "com.ocms.course.model.Event" };

		_methodName100 = "getBeanIdentifier";

		_methodParameterTypes100 = new String[] {  };

		_methodName101 = "setBeanIdentifier";

		_methodParameterTypes101 = new String[] { "java.lang.String" };

		_methodName106 = "getEventByGroupId";

		_methodParameterTypes106 = new String[] { "long" };

		_methodName107 = "getEventByGroupId";

		_methodParameterTypes107 = new String[] { "long", "int", "int" };

		_methodName108 = "getEventByEventId";

		_methodParameterTypes108 = new String[] { "long" };

		_methodName109 = "getEventByEventId";

		_methodParameterTypes109 = new String[] { "long", "int", "int" };

		_methodName110 = "getEventByFlag";

		_methodParameterTypes110 = new String[] { "int" };

		_methodName112 = "addEvent";

		_methodParameterTypes112 = new String[] {
				"long", "java.lang.String", "long", "java.lang.String", "long",
				"java.lang.String", "java.util.Date", "java.util.Date", "int",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName113 = "updateEvent";

		_methodParameterTypes113 = new String[] {
				"long", "long", "java.lang.String", "long", "java.lang.String",
				"long", "java.lang.String", "java.util.Date", "java.util.Date",
				"int", "com.liferay.portal.service.ServiceContext"
			};

		_methodName114 = "updateEventFlag";

		_methodParameterTypes114 = new String[] {
				"com.ocms.course.model.Event", "int"
			};

		_methodName115 = "deleteEventByEventId";

		_methodParameterTypes115 = new String[] { "long" };

		_methodName116 = "deleteEventByGrouptId";

		_methodParameterTypes116 = new String[] { "long" };

		_methodName117 = "deleteAllEvent";

		_methodParameterTypes117 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return EventLocalServiceUtil.addEvent((com.ocms.course.model.Event)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return EventLocalServiceUtil.createEvent(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return EventLocalServiceUtil.deleteEvent(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return EventLocalServiceUtil.deleteEvent((com.ocms.course.model.Event)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return EventLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return EventLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return EventLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return EventLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return EventLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return EventLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return EventLocalServiceUtil.fetchEvent(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return EventLocalServiceUtil.getEvent(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return EventLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return EventLocalServiceUtil.getEvents(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return EventLocalServiceUtil.getEventsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return EventLocalServiceUtil.updateEvent((com.ocms.course.model.Event)arguments[0]);
		}

		if (_methodName100.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes100, parameterTypes)) {
			return EventLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName101.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes101, parameterTypes)) {
			EventLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName106.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
			return EventLocalServiceUtil.getEventByGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName107.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes107, parameterTypes)) {
			return EventLocalServiceUtil.getEventByGroupId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName108.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes108, parameterTypes)) {
			return EventLocalServiceUtil.getEventByEventId(((Long)arguments[0]).longValue());
		}

		if (_methodName109.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes109, parameterTypes)) {
			return EventLocalServiceUtil.getEventByEventId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName110.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes110, parameterTypes)) {
			return EventLocalServiceUtil.getEventByFlag(((Integer)arguments[0]).intValue());
		}

		if (_methodName112.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes112, parameterTypes)) {
			return EventLocalServiceUtil.addEvent(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				((Long)arguments[2]).longValue(),
				(java.lang.String)arguments[3],
				((Long)arguments[4]).longValue(),
				(java.lang.String)arguments[5], (java.util.Date)arguments[6],
				(java.util.Date)arguments[7],
				((Integer)arguments[8]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[9]);
		}

		if (_methodName113.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes113, parameterTypes)) {
			return EventLocalServiceUtil.updateEvent(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2],
				((Long)arguments[3]).longValue(),
				(java.lang.String)arguments[4],
				((Long)arguments[5]).longValue(),
				(java.lang.String)arguments[6], (java.util.Date)arguments[7],
				(java.util.Date)arguments[8],
				((Integer)arguments[9]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[10]);
		}

		if (_methodName114.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes114, parameterTypes)) {
			return EventLocalServiceUtil.updateEventFlag((com.ocms.course.model.Event)arguments[0],
				((Integer)arguments[1]).intValue());
		}

		if (_methodName115.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes115, parameterTypes)) {
			EventLocalServiceUtil.deleteEventByEventId(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName116.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes116, parameterTypes)) {
			EventLocalServiceUtil.deleteEventByGrouptId(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName117.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes117, parameterTypes)) {
			EventLocalServiceUtil.deleteAllEvent();

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
}