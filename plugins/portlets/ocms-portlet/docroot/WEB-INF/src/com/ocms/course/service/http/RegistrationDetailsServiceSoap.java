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

import com.ocms.course.service.RegistrationDetailsServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.ocms.course.service.RegistrationDetailsServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.ocms.course.model.RegistrationDetailsSoap}.
 * If the method in the service utility returns a
 * {@link com.ocms.course.model.RegistrationDetails}, that is translated to a
 * {@link com.ocms.course.model.RegistrationDetailsSoap}. Methods that SOAP cannot
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
 * @see RegistrationDetailsServiceHttp
 * @see com.ocms.course.model.RegistrationDetailsSoap
 * @see com.ocms.course.service.RegistrationDetailsServiceUtil
 * @generated
 */
public class RegistrationDetailsServiceSoap {
	public static com.ocms.course.model.RegistrationDetailsSoap[] getRegistrationDetailsByGroupId(
		long groupId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.RegistrationDetails> returnValue =
				RegistrationDetailsServiceUtil.getRegistrationDetailsByGroupId(groupId);

			return com.ocms.course.model.RegistrationDetailsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.RegistrationDetailsSoap[] getRegistrationDetailsByGroupId(
		long groupId, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.RegistrationDetails> returnValue =
				RegistrationDetailsServiceUtil.getRegistrationDetailsByGroupId(groupId,
					start, end);

			return com.ocms.course.model.RegistrationDetailsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.RegistrationDetailsSoap[] getRegistrationDetailsByRegistrationDetailsId(
		long registrationDetailsId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.RegistrationDetails> returnValue =
				RegistrationDetailsServiceUtil.getRegistrationDetailsByRegistrationDetailsId(registrationDetailsId);

			return com.ocms.course.model.RegistrationDetailsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.RegistrationDetailsSoap[] getRegistrationDetailsByRegistrationDetailsId(
		long registrationDetailsId, int start, int end)
		throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.RegistrationDetails> returnValue =
				RegistrationDetailsServiceUtil.getRegistrationDetailsByRegistrationDetailsId(registrationDetailsId,
					start, end);

			return com.ocms.course.model.RegistrationDetailsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.RegistrationDetailsSoap addRegistrationDetails(
		long userId, long studRegId, long contactId, long eventId,
		double price, double discount, double fee, double credit,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.ocms.course.model.RegistrationDetails returnValue = RegistrationDetailsServiceUtil.addRegistrationDetails(userId,
					studRegId, contactId, eventId, price, discount, fee,
					credit, serviceContext);

			return com.ocms.course.model.RegistrationDetailsSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.RegistrationDetailsSoap updateRegistrationDetails(
		long userId, long registrationDetailsId, long studRegId,
		long contactId, long eventId, double price, double discount,
		double fee, double credit,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.ocms.course.model.RegistrationDetails returnValue = RegistrationDetailsServiceUtil.updateRegistrationDetails(userId,
					registrationDetailsId, studRegId, contactId, eventId,
					price, discount, fee, credit, serviceContext);

			return com.ocms.course.model.RegistrationDetailsSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteRegistrationDetailsByRegistrationDetailsId(
		long registrationDetailsId) throws RemoteException {
		try {
			RegistrationDetailsServiceUtil.deleteRegistrationDetailsByRegistrationDetailsId(registrationDetailsId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteRegistrationDetailsByGrouptId(long groupId)
		throws RemoteException {
		try {
			RegistrationDetailsServiceUtil.deleteRegistrationDetailsByGrouptId(groupId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteAllRegistrationDetails() throws RemoteException {
		try {
			RegistrationDetailsServiceUtil.deleteAllRegistrationDetails();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(RegistrationDetailsServiceSoap.class);
}