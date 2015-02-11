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

package com.ocms.course.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Event}.
 * </p>
 *
 * @author doraraj
 * @see Event
 * @generated
 */
public class EventWrapper implements Event, ModelWrapper<Event> {
	public EventWrapper(Event event) {
		_event = event;
	}

	@Override
	public Class<?> getModelClass() {
		return Event.class;
	}

	@Override
	public String getModelClassName() {
		return Event.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("eventId", getEventId());
		attributes.put("eventName", getEventName());
		attributes.put("courseCode", getCourseCode());
		attributes.put("locationCode", getLocationCode());
		attributes.put("startDate", getStartDate());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("endDate", getEndDate());
		attributes.put("flag", getFlag());
		attributes.put("courseId", getCourseId());
		attributes.put("locationId", getLocationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long eventId = (Long)attributes.get("eventId");

		if (eventId != null) {
			setEventId(eventId);
		}

		String eventName = (String)attributes.get("eventName");

		if (eventName != null) {
			setEventName(eventName);
		}

		String courseCode = (String)attributes.get("courseCode");

		if (courseCode != null) {
			setCourseCode(courseCode);
		}

		String locationCode = (String)attributes.get("locationCode");

		if (locationCode != null) {
			setLocationCode(locationCode);
		}

		Date startDate = (Date)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Date endDate = (Date)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}

		Integer flag = (Integer)attributes.get("flag");

		if (flag != null) {
			setFlag(flag);
		}

		Long courseId = (Long)attributes.get("courseId");

		if (courseId != null) {
			setCourseId(courseId);
		}

		Long locationId = (Long)attributes.get("locationId");

		if (locationId != null) {
			setLocationId(locationId);
		}
	}

	/**
	* Returns the primary key of this event.
	*
	* @return the primary key of this event
	*/
	@Override
	public long getPrimaryKey() {
		return _event.getPrimaryKey();
	}

	/**
	* Sets the primary key of this event.
	*
	* @param primaryKey the primary key of this event
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_event.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the event ID of this event.
	*
	* @return the event ID of this event
	*/
	@Override
	public long getEventId() {
		return _event.getEventId();
	}

	/**
	* Sets the event ID of this event.
	*
	* @param eventId the event ID of this event
	*/
	@Override
	public void setEventId(long eventId) {
		_event.setEventId(eventId);
	}

	/**
	* Returns the event name of this event.
	*
	* @return the event name of this event
	*/
	@Override
	public java.lang.String getEventName() {
		return _event.getEventName();
	}

	/**
	* Sets the event name of this event.
	*
	* @param eventName the event name of this event
	*/
	@Override
	public void setEventName(java.lang.String eventName) {
		_event.setEventName(eventName);
	}

	/**
	* Returns the course code of this event.
	*
	* @return the course code of this event
	*/
	@Override
	public java.lang.String getCourseCode() {
		return _event.getCourseCode();
	}

	/**
	* Sets the course code of this event.
	*
	* @param courseCode the course code of this event
	*/
	@Override
	public void setCourseCode(java.lang.String courseCode) {
		_event.setCourseCode(courseCode);
	}

	/**
	* Returns the location code of this event.
	*
	* @return the location code of this event
	*/
	@Override
	public java.lang.String getLocationCode() {
		return _event.getLocationCode();
	}

	/**
	* Sets the location code of this event.
	*
	* @param locationCode the location code of this event
	*/
	@Override
	public void setLocationCode(java.lang.String locationCode) {
		_event.setLocationCode(locationCode);
	}

	/**
	* Returns the start date of this event.
	*
	* @return the start date of this event
	*/
	@Override
	public java.util.Date getStartDate() {
		return _event.getStartDate();
	}

	/**
	* Sets the start date of this event.
	*
	* @param startDate the start date of this event
	*/
	@Override
	public void setStartDate(java.util.Date startDate) {
		_event.setStartDate(startDate);
	}

	/**
	* Returns the group ID of this event.
	*
	* @return the group ID of this event
	*/
	@Override
	public long getGroupId() {
		return _event.getGroupId();
	}

	/**
	* Sets the group ID of this event.
	*
	* @param groupId the group ID of this event
	*/
	@Override
	public void setGroupId(long groupId) {
		_event.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this event.
	*
	* @return the company ID of this event
	*/
	@Override
	public long getCompanyId() {
		return _event.getCompanyId();
	}

	/**
	* Sets the company ID of this event.
	*
	* @param companyId the company ID of this event
	*/
	@Override
	public void setCompanyId(long companyId) {
		_event.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this event.
	*
	* @return the user ID of this event
	*/
	@Override
	public long getUserId() {
		return _event.getUserId();
	}

	/**
	* Sets the user ID of this event.
	*
	* @param userId the user ID of this event
	*/
	@Override
	public void setUserId(long userId) {
		_event.setUserId(userId);
	}

	/**
	* Returns the user uuid of this event.
	*
	* @return the user uuid of this event
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _event.getUserUuid();
	}

	/**
	* Sets the user uuid of this event.
	*
	* @param userUuid the user uuid of this event
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_event.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this event.
	*
	* @return the user name of this event
	*/
	@Override
	public java.lang.String getUserName() {
		return _event.getUserName();
	}

	/**
	* Sets the user name of this event.
	*
	* @param userName the user name of this event
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_event.setUserName(userName);
	}

	/**
	* Returns the create date of this event.
	*
	* @return the create date of this event
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _event.getCreateDate();
	}

	/**
	* Sets the create date of this event.
	*
	* @param createDate the create date of this event
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_event.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this event.
	*
	* @return the modified date of this event
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _event.getModifiedDate();
	}

	/**
	* Sets the modified date of this event.
	*
	* @param modifiedDate the modified date of this event
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_event.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the end date of this event.
	*
	* @return the end date of this event
	*/
	@Override
	public java.util.Date getEndDate() {
		return _event.getEndDate();
	}

	/**
	* Sets the end date of this event.
	*
	* @param endDate the end date of this event
	*/
	@Override
	public void setEndDate(java.util.Date endDate) {
		_event.setEndDate(endDate);
	}

	/**
	* Returns the flag of this event.
	*
	* @return the flag of this event
	*/
	@Override
	public int getFlag() {
		return _event.getFlag();
	}

	/**
	* Sets the flag of this event.
	*
	* @param flag the flag of this event
	*/
	@Override
	public void setFlag(int flag) {
		_event.setFlag(flag);
	}

	/**
	* Returns the course ID of this event.
	*
	* @return the course ID of this event
	*/
	@Override
	public long getCourseId() {
		return _event.getCourseId();
	}

	/**
	* Sets the course ID of this event.
	*
	* @param courseId the course ID of this event
	*/
	@Override
	public void setCourseId(long courseId) {
		_event.setCourseId(courseId);
	}

	/**
	* Returns the location ID of this event.
	*
	* @return the location ID of this event
	*/
	@Override
	public long getLocationId() {
		return _event.getLocationId();
	}

	/**
	* Sets the location ID of this event.
	*
	* @param locationId the location ID of this event
	*/
	@Override
	public void setLocationId(long locationId) {
		_event.setLocationId(locationId);
	}

	@Override
	public boolean isNew() {
		return _event.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_event.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _event.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_event.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _event.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _event.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_event.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _event.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_event.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_event.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_event.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EventWrapper((Event)_event.clone());
	}

	@Override
	public int compareTo(com.ocms.course.model.Event event) {
		return _event.compareTo(event);
	}

	@Override
	public int hashCode() {
		return _event.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ocms.course.model.Event> toCacheModel() {
		return _event.toCacheModel();
	}

	@Override
	public com.ocms.course.model.Event toEscapedModel() {
		return new EventWrapper(_event.toEscapedModel());
	}

	@Override
	public com.ocms.course.model.Event toUnescapedModel() {
		return new EventWrapper(_event.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _event.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _event.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_event.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EventWrapper)) {
			return false;
		}

		EventWrapper eventWrapper = (EventWrapper)obj;

		if (Validator.equals(_event, eventWrapper._event)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Event getWrappedEvent() {
		return _event;
	}

	@Override
	public Event getWrappedModel() {
		return _event;
	}

	@Override
	public void resetOriginalValues() {
		_event.resetOriginalValues();
	}

	private Event _event;
}