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
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.security.auth.PrincipalThreadLocal;
import com.liferay.portal.service.ServiceContext;
import com.ocms.course.EventCourseCodeException;
import com.ocms.course.EventCourseIdException;
import com.ocms.course.EventEndDateException;
import com.ocms.course.EventLocationCodeException;
import com.ocms.course.EventLocationIdException;
import com.ocms.course.EventNameException;
import com.ocms.course.EventStartDateException;
import com.ocms.course.model.Event;
import com.ocms.course.service.CourseServiceUtil;
import com.ocms.course.service.LocationServiceUtil;
import com.ocms.course.service.base.EventServiceBaseImpl;
import com.ocms.fm.controller.FMEventController;

/**
 * The implementation of the event remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ocms.course.service.EventService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author doraraj
 * @see com.ocms.course.service.base.EventServiceBaseImpl
 * @see com.ocms.course.service.EventServiceUtil
 */
@AccessControlled(guestAccessEnabled=true)
@JSONWebService("event")
public class EventServiceImpl extends EventServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.ocms.course.service.EventServiceUtil} to access the event remote service.
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
	
	public List<Event> getEventByFlag(int flag, int start, int end) throws SystemException {
		return eventPersistence.findByFlag(flag, start, end);
	}
	
	public List<Event> getEventByUserIdFlag(long userId,int flag) throws SystemException {
		return eventPersistence.findByUserIdFlag(userId, flag);
	}
	
	public List<Event> getEventByUserIdFlag(long userId, int flag, int start, int end) throws SystemException {
		return eventPersistence.findByUserIdFlag(userId, flag, start, end);
	}
	
	public List<Event> getEventByUserIdFlagGrouId(long userId,int flag, long groupId ) throws SystemException {
		return eventPersistence.findByUserIdFlagGroupId(userId,flag,groupId);
	}
	
	public List<Event> getEventByUserIdFlagGroupId(long userId, int flag, long groupId , int start, int end) throws SystemException {
		return eventPersistence.findByUserIdFlagGroupId(userId,flag,groupId, start, end);
	}
	
	protected void validate(String eventName,long courseId,long locationId, Date startDate, Date endDate) throws PortalException {
		if (Validator.isNull(eventName)) {
			throw new EventNameException();
		}
		if (Validator.isNull(courseId)) {
			throw new EventCourseIdException();
		}
		if (Validator.isNull(locationId)) {
			throw new EventLocationIdException();
		}
		if (Validator.isNull(startDate)) {
			throw new EventStartDateException();
		}
		if (Validator.isNull(endDate)) {
			throw new EventEndDateException();
		}
	}
	
	public Event addEvent(String eventName,long courseId,long locationId, Date startDate, Date endDate,int flag, ServiceContext serviceContext) throws SystemException, PortalException {
		
		System.out.println("Add");
		long userId =PrincipalThreadLocal.getUserId();
		long groupId = serviceContext.getScopeGroupId();

		User user = userPersistence.findByPrimaryKey(userId);

		Date now = new Date();

		validate(eventName, courseId, locationId,startDate,endDate);

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
		event.setCourseCode(CourseServiceUtil.getCoursesByCourseId(courseId).get(0).getName());
		event.setLocationId(locationId);
		event.setLocationCode(LocationServiceUtil.getLocationByLocationId(locationId).get(0).getName());
		event.setStartDate(startDate);
		event.setEndDate(endDate);
		event.setFlag(flag);
		event.setExpandoBridgeAttributes(serviceContext);

		eventPersistence.update(event);

		return event;
	}
	
	public Event updateEvent(long eventId, String eventName,long courseId, 
			long locationId, Date startDate, 
			Date endDate,int flag, ServiceContext serviceContext) throws SystemException, PortalException {
		
		System.out.println("Update");

		long userId =PrincipalThreadLocal.getUserId();
		long groupId = serviceContext.getScopeGroupId();
		User user = userPersistence.findByPrimaryKey(userId);
		Date now = new Date();

		validate(eventName, courseId, locationId, startDate, endDate);

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
		event.setCourseCode(CourseServiceUtil.getCoursesByCourseId(courseId).get(0).getName());
		event.setLocationId(locationId);
		event.setLocationCode(LocationServiceUtil.getLocationByLocationId(locationId).get(0).getName());
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
	
	public void FMAddEvent(){
		FMEventController event = new FMEventController();
		event.insertEvent();
	}
}