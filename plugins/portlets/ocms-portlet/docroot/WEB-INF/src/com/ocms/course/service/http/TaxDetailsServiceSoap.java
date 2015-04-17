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

import com.ocms.course.service.TaxDetailsServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.ocms.course.service.TaxDetailsServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.ocms.course.model.TaxDetailsSoap}.
 * If the method in the service utility returns a
 * {@link com.ocms.course.model.TaxDetails}, that is translated to a
 * {@link com.ocms.course.model.TaxDetailsSoap}. Methods that SOAP cannot
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
 * @see TaxDetailsServiceHttp
 * @see com.ocms.course.model.TaxDetailsSoap
 * @see com.ocms.course.service.TaxDetailsServiceUtil
 * @generated
 */
public class TaxDetailsServiceSoap {
	public static com.ocms.course.model.TaxDetailsSoap[] getTaxDetailsByGroupId(
		long groupId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.TaxDetails> returnValue = TaxDetailsServiceUtil.getTaxDetailsByGroupId(groupId);

			return com.ocms.course.model.TaxDetailsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.TaxDetailsSoap[] getTaxDetailsByGroupId(
		long groupId, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.TaxDetails> returnValue = TaxDetailsServiceUtil.getTaxDetailsByGroupId(groupId,
					start, end);

			return com.ocms.course.model.TaxDetailsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.TaxDetailsSoap[] getTaxDetailsByTaxDetailsId(
		int taxDetailsId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.TaxDetails> returnValue = TaxDetailsServiceUtil.getTaxDetailsByTaxDetailsId(taxDetailsId);

			return com.ocms.course.model.TaxDetailsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.TaxDetailsSoap[] getTaxDetailsByTaxDetailsId(
		int taxDetailsId, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.TaxDetails> returnValue = TaxDetailsServiceUtil.getTaxDetailsByTaxDetailsId(taxDetailsId,
					start, end);

			return com.ocms.course.model.TaxDetailsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.TaxDetailsSoap[] getTaxDetailsByTaxTypeId(
		int taxTypeId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.TaxDetails> returnValue = TaxDetailsServiceUtil.getTaxDetailsByTaxTypeId(taxTypeId);

			return com.ocms.course.model.TaxDetailsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.TaxDetailsSoap[] getTaxDetailsByTaxTypeId(
		int taxTypeId, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.TaxDetails> returnValue = TaxDetailsServiceUtil.getTaxDetailsByTaxTypeId(taxTypeId,
					start, end);

			return com.ocms.course.model.TaxDetailsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.TaxDetailsSoap[] getTaxDetailsByActive(
		int taxActiveId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.TaxDetails> returnValue = TaxDetailsServiceUtil.getTaxDetailsByActive(taxActiveId);

			return com.ocms.course.model.TaxDetailsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.TaxDetailsSoap[] getTaxDetailsByActive(
		int taxActiveId, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.TaxDetails> returnValue = TaxDetailsServiceUtil.getTaxDetailsByActive(taxActiveId,
					start, end);

			return com.ocms.course.model.TaxDetailsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.TaxDetailsSoap[] getTaxDetailsByGroupIdActive(
		int groupId, int taxActiveId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.TaxDetails> returnValue = TaxDetailsServiceUtil.getTaxDetailsByGroupIdActive(groupId,
					taxActiveId);

			return com.ocms.course.model.TaxDetailsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.TaxDetailsSoap[] getTaxDetailsByGroupIdActive(
		int groupId, int taxActiveId, int start, int end)
		throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.TaxDetails> returnValue = TaxDetailsServiceUtil.getTaxDetailsByGroupIdActive(groupId,
					taxActiveId, start, end);

			return com.ocms.course.model.TaxDetailsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.TaxDetailsSoap[] getTaxDetailsByGroupIdTaxDetailsIdActive(
		int taxDetailsId, int taxActiveId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.TaxDetails> returnValue = TaxDetailsServiceUtil.getTaxDetailsByGroupIdTaxDetailsIdActive(taxDetailsId,
					taxActiveId);

			return com.ocms.course.model.TaxDetailsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.TaxDetailsSoap[] getTaxDetailsByGroupIdTaxDetailsIdActive(
		int taxDetailsId, int taxActiveId, int start, int end)
		throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.TaxDetails> returnValue = TaxDetailsServiceUtil.getTaxDetailsByGroupIdTaxDetailsIdActive(taxDetailsId,
					taxActiveId, start, end);

			return com.ocms.course.model.TaxDetailsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.TaxDetailsSoap[] getTaxDetailsByGroupIdTaxTypeIdActive(
		int taxTypeId, int taxActiveId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.TaxDetails> returnValue = TaxDetailsServiceUtil.getTaxDetailsByGroupIdTaxTypeIdActive(taxTypeId,
					taxActiveId);

			return com.ocms.course.model.TaxDetailsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.TaxDetailsSoap[] getTaxDetailsByGroupIdTaxTypeIdActive(
		int taxTypeId, int taxActiveId, int start, int end)
		throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.TaxDetails> returnValue = TaxDetailsServiceUtil.getTaxDetailsByGroupIdTaxTypeIdActive(taxTypeId,
					taxActiveId, start, end);

			return com.ocms.course.model.TaxDetailsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.TaxDetailsSoap addTaxDetails(
		long taxTypeId, java.lang.String country,
		java.util.Date effectiveFromDate, java.util.Date effectiveToDate,
		int active, int taxPercent,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.ocms.course.model.TaxDetails returnValue = TaxDetailsServiceUtil.addTaxDetails(taxTypeId,
					country, effectiveFromDate, effectiveToDate, active,
					taxPercent, serviceContext);

			return com.ocms.course.model.TaxDetailsSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.TaxDetailsSoap updateTaxDetails(
		long taxDetailsId, long taxTypeId, java.lang.String country,
		java.util.Date effectiveFromDate, java.util.Date effectiveToDate,
		int active, int taxPercent,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.ocms.course.model.TaxDetails returnValue = TaxDetailsServiceUtil.updateTaxDetails(taxDetailsId,
					taxTypeId, country, effectiveFromDate, effectiveToDate,
					active, taxPercent, serviceContext);

			return com.ocms.course.model.TaxDetailsSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteTaxDetailsByTaxDetailsId(long taxDetailsId)
		throws RemoteException {
		try {
			TaxDetailsServiceUtil.deleteTaxDetailsByTaxDetailsId(taxDetailsId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deletetaxDetailsByGrouptId(long groupId)
		throws RemoteException {
		try {
			TaxDetailsServiceUtil.deletetaxDetailsByGrouptId(groupId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteAlltaxDetails() throws RemoteException {
		try {
			TaxDetailsServiceUtil.deleteAlltaxDetails();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(TaxDetailsServiceSoap.class);
}