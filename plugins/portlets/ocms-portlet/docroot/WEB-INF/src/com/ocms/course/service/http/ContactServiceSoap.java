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

import com.ocms.course.service.ContactServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.ocms.course.service.ContactServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.ocms.course.model.ContactSoap}.
 * If the method in the service utility returns a
 * {@link com.ocms.course.model.Contact}, that is translated to a
 * {@link com.ocms.course.model.ContactSoap}. Methods that SOAP cannot
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
 * @see ContactServiceHttp
 * @see com.ocms.course.model.ContactSoap
 * @see com.ocms.course.service.ContactServiceUtil
 * @generated
 */
public class ContactServiceSoap {
	public static com.ocms.course.model.ContactSoap[] getContactByGroupId(
		long groupId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Contact> returnValue = ContactServiceUtil.getContactByGroupId(groupId);

			return com.ocms.course.model.ContactSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.ContactSoap[] getContactByGroupId(
		long groupId, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Contact> returnValue = ContactServiceUtil.getContactByGroupId(groupId,
					start, end);

			return com.ocms.course.model.ContactSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.ContactSoap[] getContactByContactId(
		long contactId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Contact> returnValue = ContactServiceUtil.getContactByContactId(contactId);

			return com.ocms.course.model.ContactSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.ContactSoap[] getContactByContactId(
		long contactId, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Contact> returnValue = ContactServiceUtil.getContactByContactId(contactId,
					start, end);

			return com.ocms.course.model.ContactSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.ContactSoap addContact(
		java.lang.String contactType, java.lang.String contactName,
		java.lang.String addressLine1, java.lang.String addressLine2,
		java.lang.String city, java.lang.String state, java.lang.String region,
		java.lang.String zip, java.lang.String phone, java.lang.String fax,
		java.lang.String email,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.ocms.course.model.Contact returnValue = ContactServiceUtil.addContact(contactType,
					contactName, addressLine1, addressLine2, city, state,
					region, zip, phone, fax, email, serviceContext);

			return com.ocms.course.model.ContactSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.ContactSoap updateContact(
		long contactId, java.lang.String contactType,
		java.lang.String contactName, java.lang.String addressLine1,
		java.lang.String addressLine2, java.lang.String city,
		java.lang.String state, java.lang.String region, java.lang.String zip,
		java.lang.String phone, java.lang.String fax, java.lang.String email,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.ocms.course.model.Contact returnValue = ContactServiceUtil.updateContact(contactId,
					contactType, contactName, addressLine1, addressLine2, city,
					state, region, zip, phone, fax, email, serviceContext);

			return com.ocms.course.model.ContactSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteContactByContactId(long contactId)
		throws RemoteException {
		try {
			ContactServiceUtil.deleteContactByContactId(contactId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteContactByGrouptId(long groupId)
		throws RemoteException {
		try {
			ContactServiceUtil.deleteContactByGrouptId(groupId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteAllContact() throws RemoteException {
		try {
			ContactServiceUtil.deleteAllContact();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(ContactServiceSoap.class);
}