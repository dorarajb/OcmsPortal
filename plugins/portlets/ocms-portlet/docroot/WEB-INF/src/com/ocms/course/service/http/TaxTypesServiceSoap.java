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

package com.ocms.course.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.ocms.course.service.TaxTypesServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.ocms.course.service.TaxTypesServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.ocms.course.model.TaxTypesSoap}.
 * If the method in the service utility returns a
 * {@link com.ocms.course.model.TaxTypes}, that is translated to a
 * {@link com.ocms.course.model.TaxTypesSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author doraraj
 * @see TaxTypesServiceHttp
 * @see com.ocms.course.model.TaxTypesSoap
 * @see com.ocms.course.service.TaxTypesServiceUtil
 * @generated
 */
public class TaxTypesServiceSoap {
	public static com.ocms.course.model.TaxTypesSoap[] getTaxTypesByGroupId(
		long groupId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.TaxTypes> returnValue = TaxTypesServiceUtil.getTaxTypesByGroupId(groupId);

			return com.ocms.course.model.TaxTypesSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.TaxTypesSoap[] getTaxTypesByGroupId(
		long groupId, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.TaxTypes> returnValue = TaxTypesServiceUtil.getTaxTypesByGroupId(groupId,
					start, end);

			return com.ocms.course.model.TaxTypesSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.TaxTypesSoap[] getTaxTypesByTaxTypesId(
		int taxTypesId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.TaxTypes> returnValue = TaxTypesServiceUtil.getTaxTypesByTaxTypesId(taxTypesId);

			return com.ocms.course.model.TaxTypesSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.TaxTypesSoap[] getPricingByTaxTypesId(
		int taxTypesId, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.TaxTypes> returnValue = TaxTypesServiceUtil.getPricingByTaxTypesId(taxTypesId,
					start, end);

			return com.ocms.course.model.TaxTypesSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.TaxTypesSoap addTaxType(
		java.lang.String taxTypeName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.ocms.course.model.TaxTypes returnValue = TaxTypesServiceUtil.addTaxType(taxTypeName,
					serviceContext);

			return com.ocms.course.model.TaxTypesSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.TaxTypesSoap updateTaxTypes(
		long taxTypesId, java.lang.String taxTypeName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.ocms.course.model.TaxTypes returnValue = TaxTypesServiceUtil.updateTaxTypes(taxTypesId,
					taxTypeName, serviceContext);

			return com.ocms.course.model.TaxTypesSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteTaxTypesByTaxTypesId(long taxTypesId)
		throws RemoteException {
		try {
			TaxTypesServiceUtil.deleteTaxTypesByTaxTypesId(taxTypesId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteTaxTypesByGrouptId(long groupId)
		throws RemoteException {
		try {
			TaxTypesServiceUtil.deleteTaxTypesByGrouptId(groupId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteAllTaxTypes() throws RemoteException {
		try {
			TaxTypesServiceUtil.deleteAllTaxTypes();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(TaxTypesServiceSoap.class);
}