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

import com.ocms.course.service.OffersAndDeductionsServiceUtil;

import java.util.Arrays;

/**
 * @author doraraj
 * @generated
 */
public class OffersAndDeductionsServiceClpInvoker {
	public OffersAndDeductionsServiceClpInvoker() {
		_methodName84 = "getBeanIdentifier";

		_methodParameterTypes84 = new String[] {  };

		_methodName85 = "setBeanIdentifier";

		_methodParameterTypes85 = new String[] { "java.lang.String" };

		_methodName90 = "getOffersAndDeductionsByGroupId";

		_methodParameterTypes90 = new String[] { "long" };

		_methodName91 = "getOffersAndDeductionsByGroupId";

		_methodParameterTypes91 = new String[] { "long", "int", "int" };

		_methodName92 = "getOffersAndDeductionsByid";

		_methodParameterTypes92 = new String[] { "int" };

		_methodName93 = "getOffersAndDeductionsByid";

		_methodParameterTypes93 = new String[] { "int", "int", "int" };

		_methodName94 = "getOffersAndDeductionsByCode";

		_methodParameterTypes94 = new String[] { "java.lang.String" };

		_methodName95 = "getOffersAndDeductionsByCode";

		_methodParameterTypes95 = new String[] { "java.lang.String", "int", "int" };

		_methodName96 = "getOffersAndDeductionsByActive";

		_methodParameterTypes96 = new String[] { "int" };

		_methodName97 = "getOffersAndDeductionsByActive";

		_methodParameterTypes97 = new String[] { "int", "int", "int" };

		_methodName98 = "getOffersAndDeductionsByType";

		_methodParameterTypes98 = new String[] { "java.lang.String" };

		_methodName99 = "getOffersAndDeductionsByType";

		_methodParameterTypes99 = new String[] { "java.lang.String", "int", "int" };

		_methodName100 = "getOffersAndDeductionsByGroupIdAndActive";

		_methodParameterTypes100 = new String[] { "long", "int" };

		_methodName101 = "getOffersAndDeductionsByGroupIdAndActive";

		_methodParameterTypes101 = new String[] { "long", "int", "int", "int" };

		_methodName102 = "getOffersAndDeductionsByidAndActive";

		_methodParameterTypes102 = new String[] { "long", "int" };

		_methodName103 = "getOffersAndDeductionsByidAndActive";

		_methodParameterTypes103 = new String[] { "long", "int", "int", "int" };

		_methodName104 = "getOffersAndDeductionsByCodeAndActive";

		_methodParameterTypes104 = new String[] { "java.lang.String", "int" };

		_methodName105 = "getOffersAndDeductionsByCodeAndActive";

		_methodParameterTypes105 = new String[] {
				"java.lang.String", "int", "int", "int"
			};

		_methodName106 = "getOffersAndDeductionsByGroupIdTypeActive";

		_methodParameterTypes106 = new String[] {
				"long", "java.lang.String", "int"
			};

		_methodName107 = "getOffersAndDeductionsByGroupIdTypeActive";

		_methodParameterTypes107 = new String[] {
				"long", "java.lang.String", "int", "int", "int"
			};

		_methodName109 = "addOffersAndDeductions";

		_methodParameterTypes109 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.util.Date", "java.util.Date", "long",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName110 = "updateOffersAndDeductions";

		_methodParameterTypes110 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.util.Date", "java.util.Date", "long",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName111 = "deleteOffersAndDeductionsById";

		_methodParameterTypes111 = new String[] { "long" };

		_methodName112 = "deleteOffersAndDeductionsByType";

		_methodParameterTypes112 = new String[] { "java.lang.String" };

		_methodName113 = "deleteOffersAndDeductionsByGrouptId";

		_methodParameterTypes113 = new String[] { "long" };

		_methodName114 = "deleteAllOffersAndDeductions";

		_methodParameterTypes114 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName84.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
			return OffersAndDeductionsServiceUtil.getBeanIdentifier();
		}

		if (_methodName85.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
			OffersAndDeductionsServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName90.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
			return OffersAndDeductionsServiceUtil.getOffersAndDeductionsByGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName91.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
			return OffersAndDeductionsServiceUtil.getOffersAndDeductionsByGroupId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName92.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes92, parameterTypes)) {
			return OffersAndDeductionsServiceUtil.getOffersAndDeductionsByid(((Integer)arguments[0]).intValue());
		}

		if (_methodName93.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes93, parameterTypes)) {
			return OffersAndDeductionsServiceUtil.getOffersAndDeductionsByid(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName94.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes94, parameterTypes)) {
			return OffersAndDeductionsServiceUtil.getOffersAndDeductionsByCode((java.lang.String)arguments[0]);
		}

		if (_methodName95.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes95, parameterTypes)) {
			return OffersAndDeductionsServiceUtil.getOffersAndDeductionsByCode((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName96.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
			return OffersAndDeductionsServiceUtil.getOffersAndDeductionsByActive(((Integer)arguments[0]).intValue());
		}

		if (_methodName97.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes97, parameterTypes)) {
			return OffersAndDeductionsServiceUtil.getOffersAndDeductionsByActive(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName98.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes98, parameterTypes)) {
			return OffersAndDeductionsServiceUtil.getOffersAndDeductionsByType((java.lang.String)arguments[0]);
		}

		if (_methodName99.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes99, parameterTypes)) {
			return OffersAndDeductionsServiceUtil.getOffersAndDeductionsByType((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName100.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes100, parameterTypes)) {
			return OffersAndDeductionsServiceUtil.getOffersAndDeductionsByGroupIdAndActive(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName101.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes101, parameterTypes)) {
			return OffersAndDeductionsServiceUtil.getOffersAndDeductionsByGroupIdAndActive(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName102.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes102, parameterTypes)) {
			return OffersAndDeductionsServiceUtil.getOffersAndDeductionsByidAndActive(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName103.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes103, parameterTypes)) {
			return OffersAndDeductionsServiceUtil.getOffersAndDeductionsByidAndActive(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName104.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes104, parameterTypes)) {
			return OffersAndDeductionsServiceUtil.getOffersAndDeductionsByCodeAndActive((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue());
		}

		if (_methodName105.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes105, parameterTypes)) {
			return OffersAndDeductionsServiceUtil.getOffersAndDeductionsByCodeAndActive((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName106.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
			return OffersAndDeductionsServiceUtil.getOffersAndDeductionsByGroupIdTypeActive(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				((Integer)arguments[2]).intValue());
		}

		if (_methodName107.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes107, parameterTypes)) {
			return OffersAndDeductionsServiceUtil.getOffersAndDeductionsByGroupIdTypeActive(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue());
		}

		if (_methodName109.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes109, parameterTypes)) {
			return OffersAndDeductionsServiceUtil.addOffersAndDeductions((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.util.Date)arguments[3], (java.util.Date)arguments[4],
				((Long)arguments[5]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[6]);
		}

		if (_methodName110.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes110, parameterTypes)) {
			return OffersAndDeductionsServiceUtil.updateOffersAndDeductions(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.util.Date)arguments[4],
				(java.util.Date)arguments[5], ((Long)arguments[6]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[7]);
		}

		if (_methodName111.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes111, parameterTypes)) {
			OffersAndDeductionsServiceUtil.deleteOffersAndDeductionsById(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName112.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes112, parameterTypes)) {
			OffersAndDeductionsServiceUtil.deleteOffersAndDeductionsByType((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName113.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes113, parameterTypes)) {
			OffersAndDeductionsServiceUtil.deleteOffersAndDeductionsByGrouptId(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName114.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes114, parameterTypes)) {
			OffersAndDeductionsServiceUtil.deleteAllOffersAndDeductions();

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
	private String _methodName107;
	private String[] _methodParameterTypes107;
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
}