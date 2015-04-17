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

import com.ocms.course.service.TaxDetailsLocalServiceUtil;

import java.util.Arrays;

/**
 * @author doraraj
 * @generated
 */
public class TaxDetailsLocalServiceClpInvoker {
	public TaxDetailsLocalServiceClpInvoker() {
		_methodName0 = "addTaxDetails";

		_methodParameterTypes0 = new String[] { "com.ocms.course.model.TaxDetails" };

		_methodName1 = "createTaxDetails";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteTaxDetails";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteTaxDetails";

		_methodParameterTypes3 = new String[] { "com.ocms.course.model.TaxDetails" };

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

		_methodName10 = "fetchTaxDetails";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getTaxDetails";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getTaxDetailses";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getTaxDetailsesCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateTaxDetails";

		_methodParameterTypes15 = new String[] {
				"com.ocms.course.model.TaxDetails"
			};

		_methodName100 = "getBeanIdentifier";

		_methodParameterTypes100 = new String[] {  };

		_methodName101 = "setBeanIdentifier";

		_methodParameterTypes101 = new String[] { "java.lang.String" };

		_methodName106 = "getTaxDetailsByGroupId";

		_methodParameterTypes106 = new String[] { "long" };

		_methodName107 = "getTaxDetailsByGroupId";

		_methodParameterTypes107 = new String[] { "long", "int", "int" };

		_methodName108 = "getTaxDetailsByTaxDetailsId";

		_methodParameterTypes108 = new String[] { "int" };

		_methodName109 = "getTaxDetailsByTaxDetailsId";

		_methodParameterTypes109 = new String[] { "int", "int", "int" };

		_methodName110 = "getTaxDetailsByTaxTypeId";

		_methodParameterTypes110 = new String[] { "int" };

		_methodName111 = "getTaxDetailsByTaxTypeId";

		_methodParameterTypes111 = new String[] { "int", "int", "int" };

		_methodName112 = "getTaxDetailsByActive";

		_methodParameterTypes112 = new String[] { "int" };

		_methodName113 = "getTaxDetailsByActive";

		_methodParameterTypes113 = new String[] { "int", "int", "int" };

		_methodName114 = "getTaxDetailsByGroupIdActive";

		_methodParameterTypes114 = new String[] { "int", "int" };

		_methodName115 = "getTaxDetailsByGroupIdActive";

		_methodParameterTypes115 = new String[] { "int", "int", "int", "int" };

		_methodName116 = "getTaxDetailsByGroupIdTaxDetailsIdActive";

		_methodParameterTypes116 = new String[] { "int", "int" };

		_methodName117 = "getTaxDetailsByGroupIdTaxDetailsIdActive";

		_methodParameterTypes117 = new String[] { "int", "int", "int", "int" };

		_methodName118 = "getTaxDetailsByGroupIdTaxTypeIdActive";

		_methodParameterTypes118 = new String[] { "int", "int" };

		_methodName119 = "getTaxDetailsByGroupIdTaxTypeIdActive";

		_methodParameterTypes119 = new String[] { "int", "int", "int", "int" };

		_methodName121 = "addTaxDetails";

		_methodParameterTypes121 = new String[] {
				"long", "java.lang.String", "java.util.Date", "java.util.Date",
				"int", "int", "com.liferay.portal.service.ServiceContext"
			};

		_methodName122 = "updateTaxDetails";

		_methodParameterTypes122 = new String[] {
				"long", "long", "java.lang.String", "java.util.Date",
				"java.util.Date", "int", "int",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName123 = "deleteTaxDetailsByTaxDetailsId";

		_methodParameterTypes123 = new String[] { "long" };

		_methodName124 = "deletetaxDetailsByGrouptId";

		_methodParameterTypes124 = new String[] { "long" };

		_methodName125 = "deleteAlltaxDetails";

		_methodParameterTypes125 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.addTaxDetails((com.ocms.course.model.TaxDetails)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.createTaxDetails(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.deleteTaxDetails(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.deleteTaxDetails((com.ocms.course.model.TaxDetails)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.fetchTaxDetails(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.getTaxDetails(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.getTaxDetailses(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.getTaxDetailsesCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.updateTaxDetails((com.ocms.course.model.TaxDetails)arguments[0]);
		}

		if (_methodName100.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes100, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName101.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes101, parameterTypes)) {
			TaxDetailsLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName106.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.getTaxDetailsByGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName107.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes107, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.getTaxDetailsByGroupId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName108.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes108, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.getTaxDetailsByTaxDetailsId(((Integer)arguments[0]).intValue());
		}

		if (_methodName109.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes109, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.getTaxDetailsByTaxDetailsId(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName110.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes110, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.getTaxDetailsByTaxTypeId(((Integer)arguments[0]).intValue());
		}

		if (_methodName111.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes111, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.getTaxDetailsByTaxTypeId(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName112.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes112, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.getTaxDetailsByActive(((Integer)arguments[0]).intValue());
		}

		if (_methodName113.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes113, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.getTaxDetailsByActive(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName114.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes114, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.getTaxDetailsByGroupIdActive(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName115.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes115, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.getTaxDetailsByGroupIdActive(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName116.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes116, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.getTaxDetailsByGroupIdTaxDetailsIdActive(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName117.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes117, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.getTaxDetailsByGroupIdTaxDetailsIdActive(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName118.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes118, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.getTaxDetailsByGroupIdTaxTypeIdActive(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName119.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes119, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.getTaxDetailsByGroupIdTaxTypeIdActive(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName121.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes121, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.addTaxDetails(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.util.Date)arguments[2],
				(java.util.Date)arguments[3],
				((Integer)arguments[4]).intValue(),
				((Integer)arguments[5]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[6]);
		}

		if (_methodName122.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes122, parameterTypes)) {
			return TaxDetailsLocalServiceUtil.updateTaxDetails(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.util.Date)arguments[3],
				(java.util.Date)arguments[4],
				((Integer)arguments[5]).intValue(),
				((Integer)arguments[6]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[7]);
		}

		if (_methodName123.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes123, parameterTypes)) {
			TaxDetailsLocalServiceUtil.deleteTaxDetailsByTaxDetailsId(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName124.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes124, parameterTypes)) {
			TaxDetailsLocalServiceUtil.deletetaxDetailsByGrouptId(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName125.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes125, parameterTypes)) {
			TaxDetailsLocalServiceUtil.deleteAlltaxDetails();

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
	private String _methodName121;
	private String[] _methodParameterTypes121;
	private String _methodName122;
	private String[] _methodParameterTypes122;
	private String _methodName123;
	private String[] _methodParameterTypes123;
	private String _methodName124;
	private String[] _methodParameterTypes124;
	private String _methodName125;
	private String[] _methodParameterTypes125;
}