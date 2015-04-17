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

import com.ocms.course.service.ContactLocalServiceUtil;

import java.util.Arrays;

/**
 * @author doraraj
 * @generated
 */
public class ContactLocalServiceClpInvoker {
	public ContactLocalServiceClpInvoker() {
		_methodName0 = "addContact";

		_methodParameterTypes0 = new String[] { "com.ocms.course.model.Contact" };

		_methodName1 = "createContact";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteContact";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteContact";

		_methodParameterTypes3 = new String[] { "com.ocms.course.model.Contact" };

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

		_methodName10 = "fetchContact";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getContact";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getContacts";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getContactsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateContact";

		_methodParameterTypes15 = new String[] { "com.ocms.course.model.Contact" };

		_methodName100 = "getBeanIdentifier";

		_methodParameterTypes100 = new String[] {  };

		_methodName101 = "setBeanIdentifier";

		_methodParameterTypes101 = new String[] { "java.lang.String" };

		_methodName106 = "getContactByGroupId";

		_methodParameterTypes106 = new String[] { "long" };

		_methodName107 = "getContactByGroupId";

		_methodParameterTypes107 = new String[] { "long", "int", "int" };

		_methodName108 = "getContactByContactId";

		_methodParameterTypes108 = new String[] { "long" };

		_methodName109 = "getContactByContactId";

		_methodParameterTypes109 = new String[] { "long", "int", "int" };

		_methodName111 = "addContact";

		_methodParameterTypes111 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName112 = "updateContact";

		_methodParameterTypes112 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName113 = "deleteContactByContactId";

		_methodParameterTypes113 = new String[] { "long" };

		_methodName114 = "deleteContactByGrouptId";

		_methodParameterTypes114 = new String[] { "long" };

		_methodName115 = "deleteAllContact";

		_methodParameterTypes115 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return ContactLocalServiceUtil.addContact((com.ocms.course.model.Contact)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return ContactLocalServiceUtil.createContact(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return ContactLocalServiceUtil.deleteContact(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return ContactLocalServiceUtil.deleteContact((com.ocms.course.model.Contact)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return ContactLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return ContactLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return ContactLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return ContactLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return ContactLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return ContactLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return ContactLocalServiceUtil.fetchContact(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return ContactLocalServiceUtil.getContact(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return ContactLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return ContactLocalServiceUtil.getContacts(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return ContactLocalServiceUtil.getContactsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return ContactLocalServiceUtil.updateContact((com.ocms.course.model.Contact)arguments[0]);
		}

		if (_methodName100.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes100, parameterTypes)) {
			return ContactLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName101.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes101, parameterTypes)) {
			ContactLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName106.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
			return ContactLocalServiceUtil.getContactByGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName107.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes107, parameterTypes)) {
			return ContactLocalServiceUtil.getContactByGroupId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName108.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes108, parameterTypes)) {
			return ContactLocalServiceUtil.getContactByContactId(((Long)arguments[0]).longValue());
		}

		if (_methodName109.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes109, parameterTypes)) {
			return ContactLocalServiceUtil.getContactByContactId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName111.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes111, parameterTypes)) {
			return ContactLocalServiceUtil.addContact(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				(java.lang.String)arguments[7], (java.lang.String)arguments[8],
				(java.lang.String)arguments[9],
				(java.lang.String)arguments[10],
				(java.lang.String)arguments[11],
				(com.liferay.portal.service.ServiceContext)arguments[12]);
		}

		if (_methodName112.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes112, parameterTypes)) {
			return ContactLocalServiceUtil.updateContact(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(java.lang.String)arguments[4], (java.lang.String)arguments[5],
				(java.lang.String)arguments[6], (java.lang.String)arguments[7],
				(java.lang.String)arguments[8], (java.lang.String)arguments[9],
				(java.lang.String)arguments[10],
				(java.lang.String)arguments[11],
				(java.lang.String)arguments[12],
				(com.liferay.portal.service.ServiceContext)arguments[13]);
		}

		if (_methodName113.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes113, parameterTypes)) {
			ContactLocalServiceUtil.deleteContactByContactId(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName114.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes114, parameterTypes)) {
			ContactLocalServiceUtil.deleteContactByGrouptId(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName115.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes115, parameterTypes)) {
			ContactLocalServiceUtil.deleteAllContact();

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
}