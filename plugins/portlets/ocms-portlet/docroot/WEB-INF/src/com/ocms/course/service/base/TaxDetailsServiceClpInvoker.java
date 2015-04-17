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

import com.ocms.course.service.TaxDetailsServiceUtil;

import java.util.Arrays;

/**
 * @author doraraj
 * @generated
 */
public class TaxDetailsServiceClpInvoker {
	public TaxDetailsServiceClpInvoker() {
		_methodName84 = "getBeanIdentifier";

		_methodParameterTypes84 = new String[] {  };

		_methodName85 = "setBeanIdentifier";

		_methodParameterTypes85 = new String[] { "java.lang.String" };

		_methodName90 = "getTaxDetailsByGroupId";

		_methodParameterTypes90 = new String[] { "long" };

		_methodName91 = "getTaxDetailsByGroupId";

		_methodParameterTypes91 = new String[] { "long", "int", "int" };

		_methodName92 = "getTaxDetailsByTaxDetailsId";

		_methodParameterTypes92 = new String[] { "int" };

		_methodName93 = "getTaxDetailsByTaxDetailsId";

		_methodParameterTypes93 = new String[] { "int", "int", "int" };

		_methodName94 = "getTaxDetailsByTaxTypeId";

		_methodParameterTypes94 = new String[] { "int" };

		_methodName95 = "getTaxDetailsByTaxTypeId";

		_methodParameterTypes95 = new String[] { "int", "int", "int" };

		_methodName96 = "getTaxDetailsByActive";

		_methodParameterTypes96 = new String[] { "int" };

		_methodName97 = "getTaxDetailsByActive";

		_methodParameterTypes97 = new String[] { "int", "int", "int" };

		_methodName98 = "getTaxDetailsByGroupIdActive";

		_methodParameterTypes98 = new String[] { "int", "int" };

		_methodName99 = "getTaxDetailsByGroupIdActive";

		_methodParameterTypes99 = new String[] { "int", "int", "int", "int" };

		_methodName100 = "getTaxDetailsByGroupIdTaxDetailsIdActive";

		_methodParameterTypes100 = new String[] { "int", "int" };

		_methodName101 = "getTaxDetailsByGroupIdTaxDetailsIdActive";

		_methodParameterTypes101 = new String[] { "int", "int", "int", "int" };

		_methodName102 = "getTaxDetailsByGroupIdTaxTypeIdActive";

		_methodParameterTypes102 = new String[] { "int", "int" };

		_methodName103 = "getTaxDetailsByGroupIdTaxTypeIdActive";

		_methodParameterTypes103 = new String[] { "int", "int", "int", "int" };

		_methodName105 = "addTaxDetails";

		_methodParameterTypes105 = new String[] {
				"long", "java.lang.String", "java.util.Date", "java.util.Date",
				"int", "int", "com.liferay.portal.service.ServiceContext"
			};

		_methodName106 = "updateTaxDetails";

		_methodParameterTypes106 = new String[] {
				"long", "long", "java.lang.String", "java.util.Date",
				"java.util.Date", "int", "int",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName107 = "deleteTaxDetailsByTaxDetailsId";

		_methodParameterTypes107 = new String[] { "long" };

		_methodName108 = "deletetaxDetailsByGrouptId";

		_methodParameterTypes108 = new String[] { "long" };

		_methodName109 = "deleteAlltaxDetails";

		_methodParameterTypes109 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName84.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
			return TaxDetailsServiceUtil.getBeanIdentifier();
		}

		if (_methodName85.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
			TaxDetailsServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName90.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
			return TaxDetailsServiceUtil.getTaxDetailsByGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName91.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
			return TaxDetailsServiceUtil.getTaxDetailsByGroupId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName92.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes92, parameterTypes)) {
			return TaxDetailsServiceUtil.getTaxDetailsByTaxDetailsId(((Integer)arguments[0]).intValue());
		}

		if (_methodName93.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes93, parameterTypes)) {
			return TaxDetailsServiceUtil.getTaxDetailsByTaxDetailsId(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName94.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes94, parameterTypes)) {
			return TaxDetailsServiceUtil.getTaxDetailsByTaxTypeId(((Integer)arguments[0]).intValue());
		}

		if (_methodName95.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes95, parameterTypes)) {
			return TaxDetailsServiceUtil.getTaxDetailsByTaxTypeId(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName96.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
			return TaxDetailsServiceUtil.getTaxDetailsByActive(((Integer)arguments[0]).intValue());
		}

		if (_methodName97.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes97, parameterTypes)) {
			return TaxDetailsServiceUtil.getTaxDetailsByActive(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName98.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes98, parameterTypes)) {
			return TaxDetailsServiceUtil.getTaxDetailsByGroupIdActive(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName99.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes99, parameterTypes)) {
			return TaxDetailsServiceUtil.getTaxDetailsByGroupIdActive(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName100.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes100, parameterTypes)) {
			return TaxDetailsServiceUtil.getTaxDetailsByGroupIdTaxDetailsIdActive(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName101.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes101, parameterTypes)) {
			return TaxDetailsServiceUtil.getTaxDetailsByGroupIdTaxDetailsIdActive(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName102.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes102, parameterTypes)) {
			return TaxDetailsServiceUtil.getTaxDetailsByGroupIdTaxTypeIdActive(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName103.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes103, parameterTypes)) {
			return TaxDetailsServiceUtil.getTaxDetailsByGroupIdTaxTypeIdActive(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName105.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes105, parameterTypes)) {
			return TaxDetailsServiceUtil.addTaxDetails(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.util.Date)arguments[2],
				(java.util.Date)arguments[3],
				((Integer)arguments[4]).intValue(),
				((Integer)arguments[5]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[6]);
		}

		if (_methodName106.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
			return TaxDetailsServiceUtil.updateTaxDetails(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.util.Date)arguments[3],
				(java.util.Date)arguments[4],
				((Integer)arguments[5]).intValue(),
				((Integer)arguments[6]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[7]);
		}

		if (_methodName107.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes107, parameterTypes)) {
			TaxDetailsServiceUtil.deleteTaxDetailsByTaxDetailsId(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName108.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes108, parameterTypes)) {
			TaxDetailsServiceUtil.deletetaxDetailsByGrouptId(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName109.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes109, parameterTypes)) {
			TaxDetailsServiceUtil.deleteAlltaxDetails();

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
	private String _methodName105;
	private String[] _methodParameterTypes105;
	private String _methodName106;
	private String[] _methodParameterTypes106;
	private String _methodName107;
	private String[] _methodParameterTypes107;
	private String _methodName108;
	private String[] _methodParameterTypes108;
	private String _methodName109;
	private String[] _methodParameterTypes109;
}