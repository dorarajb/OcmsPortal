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

package com.ocms.course.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.ocms.course.EventCourseCodeException;
import com.ocms.course.EventCourseIdException;
import com.ocms.course.EventEndDateException;
import com.ocms.course.EventLocationCodeException;
import com.ocms.course.EventLocationIdException;
import com.ocms.course.EventNameException;
import com.ocms.course.EventStartDateException;
import com.ocms.course.model.CourseSeries;
import com.ocms.course.model.Event;
import com.ocms.course.service.base.EventLocalServiceBaseImpl;

/**
 * The implementation of the event local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ocms.course.service.EventLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author doraraj
 * @see com.ocms.course.service.base.EventLocalServiceBaseImpl
 * @see com.ocms.course.service.EventLocalServiceUtil
 */
public class EventLocalServiceImpl extends EventLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.ocms.course.service.EventLocalServiceUtil} to access the event local service.
	 */
	
	public List<Event> getEventByGroupId(long groupId) throws SystemException {
		return eventPersistence.findByGroupId(groupId);
	}
	
	public List<Event> getEventByGroupId(long groupId, int start, int end) throws SystemException {
		return eventPersistence.findByGroupId(groupId, start, end);
	}
	
	public List<Event> getEventByEventId(long eventId) throws SystemException {
		return eventPersistence.findByEventId(eventId);
	}
	
	public List<Event> getEventByEventId(long eventId, int start, int end) throws SystemException {
		return eventPersistence.findByEventId(eventId, start, end);
	}
	
	public List<Event> getEventByFlag(int flag) throws SystemException {
		return eventPersistence.findByFlag(flag);
	}
	
	protected void validate(String eventName,long courseId, String courseCode,long locationId, String locationCode, Date startDate, Date endDate) throws PortalException {
		if (Validator.isNull(eventName)) {
			throw new EventNameException();
		}
		if (Validator.isNull(courseId)) {
			throw new EventCourseIdException();
		}
		if (Validator.isNull(courseCode)) {
			throw new EventCourseCodeException();
		}
		if (Validator.isNull(locationId)) {
			throw new EventLocationIdException();
		}
		if (Validator.isNull(locationCode)) {
			throw new EventLocationCodeException();
		}
		if (Validator.isNull(startDate)) {
			throw new EventStartDateException();
		}
		if (Validator.isNull(endDate)) {
			throw new EventEndDateException();
		}
	}
	
	public Event addEvent(long userId, String eventName,long courseId, String courseCode,long locationId, String locationCode, Date startDate, Date endDate,int flag, ServiceContext serviceContext) throws SystemException, PortalException {
		long groupId = serviceContext.getScopeGroupId();

		User user = userPersistence.findByPrimaryKey(userId);

		Date now = new Date();

		validate(eventName, courseId, courseCode, locationId, locationCode, startDate, endDate);

		long eventId = counterLocalService.increment();

		Event event = eventPersistence.create(eventId);

		event.setUserId(userId);
		event.setGroupId(groupId);
		event.setCompanyId(user.getCompanyId());
		event.setUserName(user.getFullName());
		event.setCreateDate(serviceContext.getCreateDate(now));
		event.setModifiedDate(serviceContext.getModifiedDate(now));
		event.setEventName(eventName);
		event.setCourseId(courseId);
		event.setCourseCode(courseCode);
		event.setLocationId(locationId);
		event.setLocationCode(locationCode);
		event.setStartDate(startDate);
		event.setEndDate(endDate);
		event.setFlag(flag);
		event.setExpandoBridgeAttributes(serviceContext);

		eventPersistence.update(event);

		return event;
	}
	
	public Event updateEvent(long userId,long eventId, String eventName,long courseId, 
			String courseCode,long locationId, String locationCode, Date startDate, 
			Date endDate,int flag, ServiceContext serviceContext) throws SystemException, PortalException {

		long groupId = serviceContext.getScopeGroupId();
		User user = userPersistence.findByPrimaryKey(userId);
		Date now = new Date();

		validate(eventName, courseId, courseCode, locationId, locationCode, startDate, endDate);

		List<Event> eventList = eventPersistence.findByEventId(eventId);
		Event event = eventList.get(0);
		
		event.setUserId(userId);
		event.setGroupId(groupId);
		event.setCompanyId(user.getCompanyId());
		event.setUserName(user.getFullName());
		event.setCreateDate(serviceContext.getCreateDate(now));
		event.setModifiedDate(serviceContext.getModifiedDate(now));
		event.setEventName(eventName);
		event.setCourseId(courseId);
		event.setCourseCode(courseCode);
		event.setLocationId(locationId);
		event.setLocationCode(locationCode);
		event.setStartDate(startDate);
		event.setEndDate(endDate);
		event.setFlag(flag);
		event.setExpandoBridgeAttributes(serviceContext);

		eventPersistence.update(event);

		return event;
	}
	
	public Event updateEventFlag(Event event, int flag){
		event.setFlag(flag);
		try {
			eventPersistence.update(event);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return event;
	}
	
	public void deleteEventByEventId(long eventId){
		try {
			eventPersistence.removeByEventId(eventId);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteEventByGrouptId(long groupId){
		try {
			eventPersistence.removeByGroupId(groupId);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteAllEvent(){
		try {
			eventPersistence.removeAll();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}