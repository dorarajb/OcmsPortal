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

import com.ocms.course.service.TaxTypesServiceUtil;

import java.util.Arrays;

/**
 * @author doraraj
 * @generated
 */
public class TaxTypesServiceClpInvoker {
	public TaxTypesServiceClpInvoker() {
		_methodName84 = "getBeanIdentifier";

		_methodParameterTypes84 = new String[] {  };

		_methodName85 = "setBeanIdentifier";

		_methodParameterTypes85 = new String[] { "java.lang.String" };

		_methodName90 = "getTaxTypesByGroupId";

		_methodParameterTypes90 = new String[] { "long" };

		_methodName91 = "getTaxTypesByGroupId";

		_methodParameterTypes91 = new String[] { "long", "int", "int" };

		_methodName92 = "getTaxTypesByTaxTypesId";

		_methodParameterTypes92 = new String[] { "int" };

		_methodName93 = "getPricingByTaxTypesId";

		_methodParameterTypes93 = new String[] { "int", "int", "int" };

		_methodName95 = "addTaxType";

		_methodParameterTypes95 = new String[] {
				"java.lang.String", "com.liferay.portal.service.ServiceContext"
			};

		_methodName96 = "updateTaxTypes";

		_methodParameterTypes96 = new String[] {
				"long", "java.lang.String",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName97 = "deleteTaxTypesByTaxTypesId";

		_methodParameterTypes97 = new String[] { "long" };

		_methodName98 = "deleteTaxTypesByGrouptId";

		_methodParameterTypes98 = new String[] { "long" };

		_methodName99 = "deleteAllTaxTypes";

		_methodParameterTypes99 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName84.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
			return TaxTypesServiceUtil.getBeanIdentifier();
		}

		if (_methodName85.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
			TaxTypesServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName90.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
			return TaxTypesServiceUtil.getTaxTypesByGroupId(((Long)arguments[0]).longValue());
		}

		if (_methodName91.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
			return TaxTypesServiceUtil.getTaxTypesByGroupId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName92.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes92, parameterTypes)) {
			return TaxTypesServiceUtil.getTaxTypesByTaxTypesId(((Integer)arguments[0]).intValue());
		}

		if (_methodName93.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes93, parameterTypes)) {
			return TaxTypesServiceUtil.getPricingByTaxTypesId(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName95.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes95, parameterTypes)) {
			return TaxTypesServiceUtil.addTaxType((java.lang.String)arguments[0],
				(com.liferay.portal.service.ServiceContext)arguments[1]);
		}

		if (_methodName96.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
			return TaxTypesServiceUtil.updateTaxTypes(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				(com.liferay.portal.service.ServiceContext)arguments[2]);
		}

		if (_methodName97.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes97, parameterTypes)) {
			TaxTypesServiceUtil.deleteTaxTypesByTaxTypesId(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName98.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes98, parameterTypes)) {
			TaxTypesServiceUtil.deleteTaxTypesByGrouptId(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName99.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes99, parameterTypes)) {
			TaxTypesServiceUtil.deleteAllTaxTypes();

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