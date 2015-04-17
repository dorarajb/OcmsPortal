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

import com.ocms.course.service.OffersAndDeductionsLocalServiceUtil;

import java.util.Arrays;

/**
 * @author doraraj
 * @generated
 */
public class OffersAndDeductionsLocalServiceClpInvoker {
	public OffersAndDeductionsLocalServiceClpInvoker() {
		_methodName0 = "addOffersAndDeductions";

		_methodParameterTypes0 = new String[] {
				"com.ocms.course.model.OffersAndDeductions"
			};

		_methodName1 = "createOffersAndDeductions";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteOffersAndDeductions";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteOffersAndDeductions";

		_methodParameterTypes3 = new String[] {
				"com.ocms.course.model.OffersAndDeductions"
			};

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

		_methodName10 = "fetchOffersAndDeductions";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getOffersAndDeductions";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getOffersAndDeductionses";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getOffersAndDeductionsesCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateOffersAndDeductions";

		_methodParameterTypes15 = new String[] {
				"com.ocms.course.model.OffersAndDeductions"
			};

		_methodName100 = "getBeanIdentifier";

		_methodParameterTypes100 = new String[] {  };

		_methodName101 = "setBeanIdentifier";

		_methodParameterTypes101 = new String[] { "java.lang.String" };

		_methodName106 = "getOffersAndDeductionsByGroupId";

		_methodParameterTypes106 = new String[] { "long" };

		_methodName107 = "getOffersAndDeductionsByGroupId";

		_methodParameterTypes107 = new String[] { "long", "int", "int" };

		_methodName108 = "getOffersAndDeductionsByid";

		_methodParameterTypes108 = new String[] { "int" };

		_methodName109 = "getOffersAndDeductionsByid";

		_methodParameterTypes109 = new String[] { "int", "int", "int" };

		_methodName110 = "getOffersAndDeductionsByCode";

		_methodParameterTypes110 = new String[] { "java.lang.String" };

		_methodName111 = "getOffersAndDeductionsByCode";

		_methodParameterTypes111 = new String[] { "java.lang.String", "int", "int" };

		_methodName112 = "getOffersAndDeductionsByActive";

		_methodParameterTypes112 = new String[] { "int" };

		_methodName113 = "getOffersAndDeductionsByActive";

		_methodParameterTypes113 = new String[] { "int", "int", "int" };

		_methodName114 = "getOffersAndDeductionsByType";

		_methodParameterTypes114 = new String[] { "java.lang.String" };

		_methodName115 = "getOffersAndDeductionsByType";

		_methodParameterTypes115 = new String[] { "java.lang.String", "int", "int" };

		_methodName116 = "getOffersAndDeductionsByGroupIdAndActive";

		_methodParameterTypes116 = new String[] { "long", "int" };

		_methodName117 = "getOffersAndDeductionsByGroupIdAndActive";

		_methodParameterTypes117 = new String[] { "long", "int", "int", "int" };

		_methodName118 = "getOffersAndDeductionsByidAndActive";

		_methodParameterTypes118 = new String[] { "long", "int" };

		_methodName119 = "getOffersAndDeductionsByidAndActive";

		_methodParameterTypes119 = new String[] { "long", "int", "int", "int" };

		_methodName120 = "getOffersAndDeductionsByCodeAndActive";

		_methodParameterTypes120 = new String[] { "java.lang.String", "int" };

		_methodName121 = "getOffersAndDeductionsByCodeAndActive";

		_methodParameterTypes121 = new String[] {
				"java.lang.String", "int", "int", "int"
			};

		_methodName122 = "getOffersAndDeductionsByGroupIdTypeActive";

		_methodParameterTypes122 = new String[] {
				"long", "java.lang.String", "int"
			};

		_methodName123 = "getOffersAndDeductionsByGroupIdTypeActive";

		_methodParameterTypes123 = new String[] {
				"long", "java.lang.String", "int", "int", "int"
			};

		_methodName125 = "addOffersAndDeductions";

		_methodParameterTypes125 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.util.Date", "java.util.Date", "long",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName126 = "updateOffersAndDeductions";

		_methodParameterTypes126 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.util.Date", "java.util.Date", "long",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName127 = "deleteOffersAndDeductionsById";

		_methodParameterTypes127 = new String[] { "long" };

		_methodName128 = "deleteOffersAndDeductionsByType";

		_methodParameterTypes128 = new String[] { "java.lang.String" };

		_methodName129 = "deleteOffersAndDeductionsByGrouptId";

		_methodParameterTypes129 = new String[] { "long" };

		_methodName130 = "deleteAllOffersAndDeductions";

		_methodParameterTypes130 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.addOffersAndDeductions((com.ocms.course.model.OffersAndDeductions)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.createOffersAndDeductions(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.deleteOffersAndDeductions(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.deleteOffersAndDeductions((com.ocms.course.model.OffersAndDeductions)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.fetchOffersAndDeductions(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.getOffersAndDeductions(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.getOffersAndDeductionses(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.getOffersAndDeductionsesCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.updateOffersAndDeductions((com.ocms.course.model.OffersAndDeductions)arguments[0]);
		}

		if (_methodName100.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes100, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName101.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes101, parameterTypes)) {
			OffersAndDeductionsLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName106.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.getOffersAndDeductionsByGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName107.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes107, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.getOffersAndDeductionsByGroupId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName108.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes108, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.getOffersAndDeductionsByid(((Integer)arguments[0]).intValue());
		}

		if (_methodName109.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes109, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.getOffersAndDeductionsByid(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName110.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes110, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.getOffersAndDeductionsByCode((java.lang.String)arguments[0]);
		}

		if (_methodName111.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes111, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.getOffersAndDeductionsByCode((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName112.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes112, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.getOffersAndDeductionsByActive(((Integer)arguments[0]).intValue());
		}

		if (_methodName113.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes113, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.getOffersAndDeductionsByActive(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName114.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes114, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.getOffersAndDeductionsByType((java.lang.String)arguments[0]);
		}

		if (_methodName115.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes115, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.getOffersAndDeductionsByType((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName116.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes116, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.getOffersAndDeductionsByGroupIdAndActive(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName117.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes117, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.getOffersAndDeductionsByGroupIdAndActive(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName118.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes118, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.getOffersAndDeductionsByidAndActive(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName119.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes119, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.getOffersAndDeductionsByidAndActive(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName120.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes120, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.getOffersAndDeductionsByCodeAndActive((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue());
		}

		if (_methodName121.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes121, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.getOffersAndDeductionsByCodeAndActive((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName122.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes122, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.getOffersAndDeductionsByGroupIdTypeActive(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				((Integer)arguments[2]).intValue());
		}

		if (_methodName123.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes123, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.getOffersAndDeductionsByGroupIdTypeActive(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue());
		}

		if (_methodName125.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes125, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.addOffersAndDeductions((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.util.Date)arguments[3], (java.util.Date)arguments[4],
				((Long)arguments[5]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[6]);
		}

		if (_methodName126.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes126, parameterTypes)) {
			return OffersAndDeductionsLocalServiceUtil.updateOffersAndDeductions(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.util.Date)arguments[4],
				(java.util.Date)arguments[5], ((Long)arguments[6]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[7]);
		}

		if (_methodName127.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes127, parameterTypes)) {
			OffersAndDeductionsLocalServiceUtil.deleteOffersAndDeductionsById(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName128.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes128, parameterTypes)) {
			OffersAndDeductionsLocalServiceUtil.deleteOffersAndDeductionsByType((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName129.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes129, parameterTypes)) {
			OffersAndDeductionsLocalServiceUtil.deleteOffersAndDeductionsByGrouptId(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName130.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes130, parameterTypes)) {
			OffersAndDeductionsLocalServiceUtil.deleteAllOffersAndDeductions();

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
	private String _methodName120;
	private String[] _methodParameterTypes120;
	private String _methodName121;
	private String[] _methodParameterTypes121;
	private String _methodName122;
	private String[] _methodParameterTypes122;
	private String _methodName123;
	private String[] _methodParameterTypes123;
	private String _methodName125;
	private String[] _methodParameterTypes125;
	private String _methodName126;
	private String[] _methodParameterTypes126;
	private String _methodName127;
	private String[] _methodParameterTypes127;
	private String _methodName128;
	private String[] _methodParameterTypes128;
	private String _methodName129;
	private String[] _methodParameterTypes129;
	private String _methodName130;
	private String[] _methodParameterTypes130;
}