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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EventService}.
 *
 * @author doraraj
 * @see EventService
 * @generated
 */
public class EventServiceWrapper implements EventService,
	ServiceWrapper<EventService> {
	public EventServiceWrapper(EventService eventService) {
		_eventService = eventService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _eventService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_eventService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _eventService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.ocms.course.model.Event> getEventByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _eventService.getEventByGroupId(groupId);
	}

	@Override
	public java.util.List<com.ocms.course.model.Event> getEventByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _eventService.getEventByGroupId(groupId, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.Event> getEventByEventId(
		long eventId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _eventService.getEventByEventId(eventId);
	}

	@Override
	public java.util.List<com.ocms.course.model.Event> getEventByEventId(
		long eventId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _eventService.getEventByEventId(eventId, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.Event> getEventByFlag(int flag)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _eventService.getEventByFlag(flag);
	}

	@Override
	public java.util.List<com.ocms.course.model.Event> getEventByFlag(
		int flag, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _eventService.getEventByFlag(flag, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.Event> getEventByUserIdFlag(
		long userId, int flag)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _eventService.getEventByUserIdFlag(userId, flag);
	}

	@Override
	public java.util.List<com.ocms.course.model.Event> getEventByUserIdFlag(
		long userId, int flag, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _eventService.getEventByUserIdFlag(userId, flag, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.Event> getEventByUserIdFlagGrouId(
		long userId, int flag, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _eventService.getEventByUserIdFlagGrouId(userId, flag, groupId);
	}

	@Override
	public java.util.List<com.ocms.course.model.Event> getEventByUserIdFlagGroupId(
		long userId, int flag, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _eventService.getEventByUserIdFlagGroupId(userId, flag, groupId,
			start, end);
	}

	@Override
	public com.ocms.course.model.Event addEvent(java.lang.String eventName,
		long courseId, long locationId, java.util.Date startDate,
		java.util.Date endDate, int flag,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _eventService.addEvent(eventName, courseId, locationId,
			startDate, endDate, flag, serviceContext);
	}

	@Override
	public com.ocms.course.model.Event updateEvent(long eventId,
		java.lang.String eventName, long courseId, long locationId,
		java.util.Date startDate, java.util.Date endDate, int flag,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _eventService.updateEvent(eventId, eventName, courseId,
			locationId, startDate, endDate, flag, serviceContext);
	}

	@Override
	public com.ocms.course.model.Event updateEventFlag(
		com.ocms.course.model.Event event, int flag) {
		return _eventService.updateEventFlag(event, flag);
	}

	@Override
	public void deleteEventByEventId(long eventId) {
		_eventService.deleteEventByEventId(eventId);
	}

	@Override
	public void deleteEventByGrouptId(long groupId) {
		_eventService.deleteEventByGrouptId(groupId);
	}

	@Override
	public void deleteAllEvent() {
		_eventService.deleteAllEvent();
	}

	@Override
	public void FMAddEvent() {
		_eventService.FMAddEvent();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public EventService getWrappedEventService() {
		return _eventService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedEventService(EventService eventService) {
		_eventService = eventService;
	}

	@Override
	public EventService getWrappedService() {
		return _eventService;
	}

	@Override
	public void setWrappedService(EventService eventService) {
		_eventService = eventService;
	}

	private EventService _eventService;
}