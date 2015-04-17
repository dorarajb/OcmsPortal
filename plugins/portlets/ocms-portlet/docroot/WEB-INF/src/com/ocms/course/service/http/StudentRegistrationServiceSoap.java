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

import com.ocms.course.service.StudentRegistrationServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.ocms.course.service.StudentRegistrationServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.ocms.course.model.StudentRegistrationSoap}.
 * If the method in the service utility returns a
 * {@link com.ocms.course.model.StudentRegistration}, that is translated to a
 * {@link com.ocms.course.model.StudentRegistrationSoap}. Methods that SOAP cannot
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
 * @see StudentRegistrationServiceHttp
 * @see com.ocms.course.model.StudentRegistrationSoap
 * @see com.ocms.course.service.StudentRegistrationServiceUtil
 * @generated
 */
public class StudentRegistrationServiceSoap {
	public static com.ocms.course.model.StudentRegistrationSoap[] getStudentRegistrationByGroupId(
		long groupId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.StudentRegistration> returnValue =
				StudentRegistrationServiceUtil.getStudentRegistrationByGroupId(groupId);

			return com.ocms.course.model.StudentRegistrationSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.StudentRegistrationSoap[] getStudentRegistrationByGroupId(
		long groupId, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.StudentRegistration> returnValue =
				StudentRegistrationServiceUtil.getStudentRegistrationByGroupId(groupId,
					start, end);

			return com.ocms.course.model.StudentRegistrationSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.StudentRegistrationSoap[] getStudentRegistrationByStudentRegistrationId(
		long studentRegistrationId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.StudentRegistration> returnValue =
				StudentRegistrationServiceUtil.getStudentRegistrationByStudentRegistrationId(studentRegistrationId);

			return com.ocms.course.model.StudentRegistrationSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.StudentRegistrationSoap[] getStudentRegistrationByStudentRegistrationId(
		long studentRegistrationId, int start, int end)
		throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.StudentRegistration> returnValue =
				StudentRegistrationServiceUtil.getStudentRegistrationByStudentRegistrationId(studentRegistrationId,
					start, end);

			return com.ocms.course.model.StudentRegistrationSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.StudentRegistrationSoap addStudentRegistration(
		long userId, long contactId, java.lang.String memo,
		java.lang.String studRegStatus, java.lang.String advisorOrig,
		java.lang.String advisorReg, long coursePackageId, long discountId,
		java.lang.String commMethod, java.lang.String notes,
		java.lang.String currency, long tax, java.lang.String autoCharge,
		java.lang.String currencyPaid, long exchangeRate,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.ocms.course.model.StudentRegistration returnValue = StudentRegistrationServiceUtil.addStudentRegistration(userId,
					contactId, memo, studRegStatus, advisorOrig, advisorReg,
					coursePackageId, discountId, commMethod, notes, currency,
					tax, autoCharge, currencyPaid, exchangeRate, serviceContext);

			return com.ocms.course.model.StudentRegistrationSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.StudentRegistrationSoap updateStudentRegistration(
		long userId, long studentRegistrationId, long contactId,
		java.lang.String memo, java.lang.String studRegStatus,
		java.lang.String advisorOrig, java.lang.String advisorReg,
		long coursePackageId, long discountId, java.lang.String commMethod,
		java.lang.String notes, java.lang.String currency, long tax,
		java.lang.String autoCharge, java.lang.String currencyPaid,
		long exchangeRate,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.ocms.course.model.StudentRegistration returnValue = StudentRegistrationServiceUtil.updateStudentRegistration(userId,
					studentRegistrationId, contactId, memo, studRegStatus,
					advisorOrig, advisorReg, coursePackageId, discountId,
					commMethod, notes, currency, tax, autoCharge, currencyPaid,
					exchangeRate, serviceContext);

			return com.ocms.course.model.StudentRegistrationSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteStudentRegistrationByStudentRegistrationId(
		long studentRegistrationId) throws RemoteException {
		try {
			StudentRegistrationServiceUtil.deleteStudentRegistrationByStudentRegistrationId(studentRegistrationId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteStudentRegistrationByGrouptId(long groupId)
		throws RemoteException {
		try {
			StudentRegistrationServiceUtil.deleteStudentRegistrationByGrouptId(groupId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteAllStudentRegistration() throws RemoteException {
		try {
			StudentRegistrationServiceUtil.deleteAllStudentRegistration();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(StudentRegistrationServiceSoap.class);
}