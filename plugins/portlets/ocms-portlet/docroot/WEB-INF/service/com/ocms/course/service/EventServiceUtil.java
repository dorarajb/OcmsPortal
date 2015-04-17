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

package com.ocms.course.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Event. This utility wraps
 * {@link com.ocms.course.service.impl.EventServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author doraraj
 * @see EventService
 * @see com.ocms.course.service.base.EventServiceBaseImpl
 * @see com.ocms.course.service.impl.EventServiceImpl
 * @generated
 */
public class EventServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ocms.course.service.impl.EventServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<com.ocms.course.model.Event> getEventByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEventByGroupId(groupId);
	}

	public static java.util.List<com.ocms.course.model.Event> getEventByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEventByGroupId(groupId, start, end);
	}

	public static java.util.List<com.ocms.course.model.Event> getEventByEventId(
		long eventId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEventByEventId(eventId);
	}

	public static java.util.List<com.ocms.course.model.Event> getEventByEventId(
		long eventId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEventByEventId(eventId, start, end);
	}

	public static java.util.List<com.ocms.course.model.Event> getEventByFlag(
		int flag) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEventByFlag(flag);
	}

	public static java.util.List<com.ocms.course.model.Event> getEventByFlag(
		int flag, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEventByFlag(flag, start, end);
	}

	public static java.util.List<com.ocms.course.model.Event> getEventByUserIdFlag(
		long userId, int flag)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEventByUserIdFlag(userId, flag);
	}

	public static java.util.List<com.ocms.course.model.Event> getEventByUserIdFlag(
		long userId, int flag, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEventByUserIdFlag(userId, flag, start, end);
	}

	public static java.util.List<com.ocms.course.model.Event> getEventByUserIdFlagGrouId(
		long userId, int flag, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEventByUserIdFlagGrouId(userId, flag, groupId);
	}

	public static java.util.List<com.ocms.course.model.Event> getEventByUserIdFlagGroupId(
		long userId, int flag, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getEventByUserIdFlagGroupId(userId, flag, groupId, start,
			end);
	}

	public static com.ocms.course.model.Event addEvent(
		java.lang.String eventName, long courseId, long locationId,
		java.util.Date startDate, java.util.Date endDate, int flag,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addEvent(eventName, courseId, locationId, startDate,
			endDate, flag, serviceContext);
	}

	public static com.ocms.course.model.Event updateEvent(long eventId,
		java.lang.String eventName, long courseId, long locationId,
		java.util.Date startDate, java.util.Date endDate, int flag,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateEvent(eventId, eventName, courseId, locationId,
			startDate, endDate, flag, serviceContext);
	}

	public static com.ocms.course.model.Event updateEventFlag(
		com.ocms.course.model.Event event, int flag) {
		return getService().updateEventFlag(event, flag);
	}

	public static void deleteEventByEventId(long eventId) {
		getService().deleteEventByEventId(eventId);
	}

	public static void deleteEventByGrouptId(long groupId) {
		getService().deleteEventByGrouptId(groupId);
	}

	public static void deleteAllEvent() {
		getService().deleteAllEvent();
	}

	public static void FMAddEvent() {
		getService().FMAddEvent();
	}

	public static void clearService() {
		_service = null;
	}

	public static EventService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					EventService.class.getName());

			if (invokableService instanceof EventService) {
				_service = (EventService)invokableService;
			}
			else {
				_service = new EventServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(EventServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(EventService service) {
	}

	private static EventService _service;
}