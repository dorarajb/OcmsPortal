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

import com.ocms.course.service.EventServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.ocms.course.service.EventServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.ocms.course.model.EventSoap}.
 * If the method in the service utility returns a
 * {@link com.ocms.course.model.Event}, that is translated to a
 * {@link com.ocms.course.model.EventSoap}. Methods that SOAP cannot
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
 * @see EventServiceHttp
 * @see com.ocms.course.model.EventSoap
 * @see com.ocms.course.service.EventServiceUtil
 * @generated
 */
public class EventServiceSoap {
	public static com.ocms.course.model.EventSoap[] getEventByGroupId(
		long groupId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Event> returnValue = EventServiceUtil.getEventByGroupId(groupId);

			return com.ocms.course.model.EventSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.EventSoap[] getEventByGroupId(
		long groupId, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Event> returnValue = EventServiceUtil.getEventByGroupId(groupId,
					start, end);

			return com.ocms.course.model.EventSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.EventSoap[] getEventByEventId(
		long eventId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Event> returnValue = EventServiceUtil.getEventByEventId(eventId);

			return com.ocms.course.model.EventSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.EventSoap[] getEventByEventId(
		long eventId, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Event> returnValue = EventServiceUtil.getEventByEventId(eventId,
					start, end);

			return com.ocms.course.model.EventSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.EventSoap[] getEventByFlag(int flag)
		throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Event> returnValue = EventServiceUtil.getEventByFlag(flag);

			return com.ocms.course.model.EventSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.EventSoap[] getEventByFlag(int flag,
		int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Event> returnValue = EventServiceUtil.getEventByFlag(flag,
					start, end);

			return com.ocms.course.model.EventSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.EventSoap[] getEventByUserIdFlag(
		long userId, int flag) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Event> returnValue = EventServiceUtil.getEventByUserIdFlag(userId,
					flag);

			return com.ocms.course.model.EventSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.EventSoap[] getEventByUserIdFlag(
		long userId, int flag, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Event> returnValue = EventServiceUtil.getEventByUserIdFlag(userId,
					flag, start, end);

			return com.ocms.course.model.EventSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.EventSoap[] getEventByUserIdFlagGrouId(
		long userId, int flag, long groupId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Event> returnValue = EventServiceUtil.getEventByUserIdFlagGrouId(userId,
					flag, groupId);

			return com.ocms.course.model.EventSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.EventSoap[] getEventByUserIdFlagGroupId(
		long userId, int flag, long groupId, int start, int end)
		throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Event> returnValue = EventServiceUtil.getEventByUserIdFlagGroupId(userId,
					flag, groupId, start, end);

			return com.ocms.course.model.EventSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.EventSoap addEvent(
		java.lang.String eventName, long courseId, long locationId,
		java.util.Date startDate, java.util.Date endDate, int flag,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.ocms.course.model.Event returnValue = EventServiceUtil.addEvent(eventName,
					courseId, locationId, startDate, endDate, flag,
					serviceContext);

			return com.ocms.course.model.EventSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.EventSoap updateEvent(long eventId,
		java.lang.String eventName, long courseId, long locationId,
		java.util.Date startDate, java.util.Date endDate, int flag,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.ocms.course.model.Event returnValue = EventServiceUtil.updateEvent(eventId,
					eventName, courseId, locationId, startDate, endDate, flag,
					serviceContext);

			return com.ocms.course.model.EventSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.EventSoap updateEventFlag(
		com.ocms.course.model.EventSoap event, int flag)
		throws RemoteException {
		try {
			com.ocms.course.model.Event returnValue = EventServiceUtil.updateEventFlag(com.ocms.course.model.impl.EventModelImpl.toModel(
						event), flag);

			return com.ocms.course.model.EventSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteEventByEventId(long eventId)
		throws RemoteException {
		try {
			EventServiceUtil.deleteEventByEventId(eventId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteEventByGrouptId(long groupId)
		throws RemoteException {
		try {
			EventServiceUtil.deleteEventByGrouptId(groupId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteAllEvent() throws RemoteException {
		try {
			EventServiceUtil.deleteAllEvent();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void FMAddEvent() throws RemoteException {
		try {
			EventServiceUtil.FMAddEvent();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(EventServiceSoap.class);
}