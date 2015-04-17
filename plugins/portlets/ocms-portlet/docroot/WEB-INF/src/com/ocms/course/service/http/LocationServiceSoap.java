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

import com.ocms.course.service.LocationServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.ocms.course.service.LocationServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.ocms.course.model.LocationSoap}.
 * If the method in the service utility returns a
 * {@link com.ocms.course.model.Location}, that is translated to a
 * {@link com.ocms.course.model.LocationSoap}. Methods that SOAP cannot
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
 * @see LocationServiceHttp
 * @see com.ocms.course.model.LocationSoap
 * @see com.ocms.course.service.LocationServiceUtil
 * @generated
 */
public class LocationServiceSoap {
	public static com.ocms.course.model.LocationSoap[] getLocationByGroupId(
		long groupId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Location> returnValue = LocationServiceUtil.getLocationByGroupId(groupId);

			return com.ocms.course.model.LocationSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.LocationSoap[] getLocationByGroupId(
		long groupId, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Location> returnValue = LocationServiceUtil.getLocationByGroupId(groupId,
					start, end);

			return com.ocms.course.model.LocationSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.LocationSoap[] getLocationByLocationId(
		long locationId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Location> returnValue = LocationServiceUtil.getLocationByLocationId(locationId);

			return com.ocms.course.model.LocationSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.LocationSoap[] getLocationByLocationId(
		long locationId, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Location> returnValue = LocationServiceUtil.getLocationByLocationId(locationId,
					start, end);

			return com.ocms.course.model.LocationSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.LocationSoap addLocation(
		java.lang.String name, java.lang.String code, java.lang.String notes,
		java.lang.String addressLine1, java.lang.String addressLine2,
		java.lang.String city, java.lang.String state, java.lang.String region,
		java.lang.String country, java.lang.String zip, java.lang.String phone,
		java.lang.String fax, java.lang.String email,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.ocms.course.model.Location returnValue = LocationServiceUtil.addLocation(name,
					code, notes, addressLine1, addressLine2, city, state,
					region, country, zip, phone, fax, email, serviceContext);

			return com.ocms.course.model.LocationSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.LocationSoap updateLocation(
		long locationId, java.lang.String name, java.lang.String code,
		java.lang.String notes, java.lang.String addressLine1,
		java.lang.String addressLine2, java.lang.String city,
		java.lang.String state, java.lang.String region,
		java.lang.String country, java.lang.String zip, java.lang.String phone,
		java.lang.String fax, java.lang.String email,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.ocms.course.model.Location returnValue = LocationServiceUtil.updateLocation(locationId,
					name, code, notes, addressLine1, addressLine2, city, state,
					region, country, zip, phone, fax, email, serviceContext);

			return com.ocms.course.model.LocationSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteLocationByLocationId(long locationId)
		throws RemoteException {
		try {
			LocationServiceUtil.deleteLocationByLocationId(locationId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteLocationByGrouptId(long groupId)
		throws RemoteException {
		try {
			LocationServiceUtil.deleteLocationByGrouptId(groupId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteAllLocation() throws RemoteException {
		try {
			LocationServiceUtil.deleteAllLocation();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(LocationServiceSoap.class);
}