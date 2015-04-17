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

import com.ocms.course.service.OffersAndDeductionsServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.ocms.course.service.OffersAndDeductionsServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.ocms.course.model.OffersAndDeductionsSoap}.
 * If the method in the service utility returns a
 * {@link com.ocms.course.model.OffersAndDeductions}, that is translated to a
 * {@link com.ocms.course.model.OffersAndDeductionsSoap}. Methods that SOAP cannot
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
 * @see OffersAndDeductionsServiceHttp
 * @see com.ocms.course.model.OffersAndDeductionsSoap
 * @see com.ocms.course.service.OffersAndDeductionsServiceUtil
 * @generated
 */
public class OffersAndDeductionsServiceSoap {
	public static com.ocms.course.model.OffersAndDeductionsSoap[] getOffersAndDeductionsByGroupId(
		long groupId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.OffersAndDeductions> returnValue =
				OffersAndDeductionsServiceUtil.getOffersAndDeductionsByGroupId(groupId);

			return com.ocms.course.model.OffersAndDeductionsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.OffersAndDeductionsSoap[] getOffersAndDeductionsByGroupId(
		long groupId, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.OffersAndDeductions> returnValue =
				OffersAndDeductionsServiceUtil.getOffersAndDeductionsByGroupId(groupId,
					start, end);

			return com.ocms.course.model.OffersAndDeductionsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.OffersAndDeductionsSoap[] getOffersAndDeductionsByid(
		int id) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.OffersAndDeductions> returnValue =
				OffersAndDeductionsServiceUtil.getOffersAndDeductionsByid(id);

			return com.ocms.course.model.OffersAndDeductionsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.OffersAndDeductionsSoap[] getOffersAndDeductionsByid(
		int id, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.OffersAndDeductions> returnValue =
				OffersAndDeductionsServiceUtil.getOffersAndDeductionsByid(id,
					start, end);

			return com.ocms.course.model.OffersAndDeductionsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.OffersAndDeductionsSoap[] getOffersAndDeductionsByCode(
		java.lang.String code) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.OffersAndDeductions> returnValue =
				OffersAndDeductionsServiceUtil.getOffersAndDeductionsByCode(code);

			return com.ocms.course.model.OffersAndDeductionsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.OffersAndDeductionsSoap[] getOffersAndDeductionsByCode(
		java.lang.String code, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.OffersAndDeductions> returnValue =
				OffersAndDeductionsServiceUtil.getOffersAndDeductionsByCode(code,
					start, end);

			return com.ocms.course.model.OffersAndDeductionsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.OffersAndDeductionsSoap[] getOffersAndDeductionsByActive(
		int active) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.OffersAndDeductions> returnValue =
				OffersAndDeductionsServiceUtil.getOffersAndDeductionsByActive(active);

			return com.ocms.course.model.OffersAndDeductionsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.OffersAndDeductionsSoap[] getOffersAndDeductionsByActive(
		int active, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.OffersAndDeductions> returnValue =
				OffersAndDeductionsServiceUtil.getOffersAndDeductionsByActive(active,
					start, end);

			return com.ocms.course.model.OffersAndDeductionsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.OffersAndDeductionsSoap[] getOffersAndDeductionsByType(
		java.lang.String type) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.OffersAndDeductions> returnValue =
				OffersAndDeductionsServiceUtil.getOffersAndDeductionsByType(type);

			return com.ocms.course.model.OffersAndDeductionsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.OffersAndDeductionsSoap[] getOffersAndDeductionsByType(
		java.lang.String type, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.OffersAndDeductions> returnValue =
				OffersAndDeductionsServiceUtil.getOffersAndDeductionsByType(type,
					start, end);

			return com.ocms.course.model.OffersAndDeductionsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.OffersAndDeductionsSoap[] getOffersAndDeductionsByGroupIdAndActive(
		long groupId, int active) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.OffersAndDeductions> returnValue =
				OffersAndDeductionsServiceUtil.getOffersAndDeductionsByGroupIdAndActive(groupId,
					active);

			return com.ocms.course.model.OffersAndDeductionsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.OffersAndDeductionsSoap[] getOffersAndDeductionsByGroupIdAndActive(
		long groupId, int active, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.OffersAndDeductions> returnValue =
				OffersAndDeductionsServiceUtil.getOffersAndDeductionsByGroupIdAndActive(groupId,
					active, start, end);

			return com.ocms.course.model.OffersAndDeductionsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.OffersAndDeductionsSoap[] getOffersAndDeductionsByidAndActive(
		long id, int active) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.OffersAndDeductions> returnValue =
				OffersAndDeductionsServiceUtil.getOffersAndDeductionsByidAndActive(id,
					active);

			return com.ocms.course.model.OffersAndDeductionsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.OffersAndDeductionsSoap[] getOffersAndDeductionsByidAndActive(
		long id, int active, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.OffersAndDeductions> returnValue =
				OffersAndDeductionsServiceUtil.getOffersAndDeductionsByidAndActive(id,
					active, start, end);

			return com.ocms.course.model.OffersAndDeductionsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.OffersAndDeductionsSoap[] getOffersAndDeductionsByCodeAndActive(
		java.lang.String code, int active) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.OffersAndDeductions> returnValue =
				OffersAndDeductionsServiceUtil.getOffersAndDeductionsByCodeAndActive(code,
					active);

			return com.ocms.course.model.OffersAndDeductionsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.OffersAndDeductionsSoap[] getOffersAndDeductionsByCodeAndActive(
		java.lang.String code, int active, int start, int end)
		throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.OffersAndDeductions> returnValue =
				OffersAndDeductionsServiceUtil.getOffersAndDeductionsByCodeAndActive(code,
					active, start, end);

			return com.ocms.course.model.OffersAndDeductionsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.OffersAndDeductionsSoap[] getOffersAndDeductionsByGroupIdTypeActive(
		long groupId, java.lang.String type, int active)
		throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.OffersAndDeductions> returnValue =
				OffersAndDeductionsServiceUtil.getOffersAndDeductionsByGroupIdTypeActive(groupId,
					type, active);

			return com.ocms.course.model.OffersAndDeductionsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.OffersAndDeductionsSoap[] getOffersAndDeductionsByGroupIdTypeActive(
		long groupId, java.lang.String type, int active, int start, int end)
		throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.OffersAndDeductions> returnValue =
				OffersAndDeductionsServiceUtil.getOffersAndDeductionsByGroupIdTypeActive(groupId,
					type, active, start, end);

			return com.ocms.course.model.OffersAndDeductionsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.OffersAndDeductionsSoap addOffersAndDeductions(
		java.lang.String code, java.lang.String type,
		java.lang.String description, java.util.Date effectiveFromDate,
		java.util.Date effectiveToDate, long amount,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.ocms.course.model.OffersAndDeductions returnValue = OffersAndDeductionsServiceUtil.addOffersAndDeductions(code,
					type, description, effectiveFromDate, effectiveToDate,
					amount, serviceContext);

			return com.ocms.course.model.OffersAndDeductionsSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.OffersAndDeductionsSoap updateOffersAndDeductions(
		long id, java.lang.String code, java.lang.String type,
		java.lang.String description, java.util.Date effectiveFromDate,
		java.util.Date effectiveToDate, long amount,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.ocms.course.model.OffersAndDeductions returnValue = OffersAndDeductionsServiceUtil.updateOffersAndDeductions(id,
					code, type, description, effectiveFromDate,
					effectiveToDate, amount, serviceContext);

			return com.ocms.course.model.OffersAndDeductionsSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteOffersAndDeductionsById(long id)
		throws RemoteException {
		try {
			OffersAndDeductionsServiceUtil.deleteOffersAndDeductionsById(id);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteOffersAndDeductionsByType(java.lang.String type)
		throws RemoteException {
		try {
			OffersAndDeductionsServiceUtil.deleteOffersAndDeductionsByType(type);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteOffersAndDeductionsByGrouptId(long groupId)
		throws RemoteException {
		try {
			OffersAndDeductionsServiceUtil.deleteOffersAndDeductionsByGrouptId(groupId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteAllOffersAndDeductions() throws RemoteException {
		try {
			OffersAndDeductionsServiceUtil.deleteAllOffersAndDeductions();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(OffersAndDeductionsServiceSoap.class);
}