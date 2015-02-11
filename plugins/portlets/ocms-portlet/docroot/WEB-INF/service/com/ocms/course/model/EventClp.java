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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.ocms.course.service.ClpSerializer;
import com.ocms.course.service.EventLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author doraraj
 */
public class EventClp extends BaseModelImpl<Event> implements Event {
	public EventClp() {
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
	public long getPrimaryKey() {
		return _eventId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEventId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _eventId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getEventId() {
		return _eventId;
	}

	@Override
	public void setEventId(long eventId) {
		_eventId = eventId;

		if (_eventRemoteModel != null) {
			try {
				Class<?> clazz = _eventRemoteModel.getClass();

				Method method = clazz.getMethod("setEventId", long.class);

				method.invoke(_eventRemoteModel, eventId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEventName() {
		return _eventName;
	}

	@Override
	public void setEventName(String eventName) {
		_eventName = eventName;

		if (_eventRemoteModel != null) {
			try {
				Class<?> clazz = _eventRemoteModel.getClass();

				Method method = clazz.getMethod("setEventName", String.class);

				method.invoke(_eventRemoteModel, eventName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCourseCode() {
		return _courseCode;
	}

	@Override
	public void setCourseCode(String courseCode) {
		_courseCode = courseCode;

		if (_eventRemoteModel != null) {
			try {
				Class<?> clazz = _eventRemoteModel.getClass();

				Method method = clazz.getMethod("setCourseCode", String.class);

				method.invoke(_eventRemoteModel, courseCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLocationCode() {
		return _locationCode;
	}

	@Override
	public void setLocationCode(String locationCode) {
		_locationCode = locationCode;

		if (_eventRemoteModel != null) {
			try {
				Class<?> clazz = _eventRemoteModel.getClass();

				Method method = clazz.getMethod("setLocationCode", String.class);

				method.invoke(_eventRemoteModel, locationCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getStartDate() {
		return _startDate;
	}

	@Override
	public void setStartDate(Date startDate) {
		_startDate = startDate;

		if (_eventRemoteModel != null) {
			try {
				Class<?> clazz = _eventRemoteModel.getClass();

				Method method = clazz.getMethod("setStartDate", Date.class);

				method.invoke(_eventRemoteModel, startDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_eventRemoteModel != null) {
			try {
				Class<?> clazz = _eventRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_eventRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_eventRemoteModel != null) {
			try {
				Class<?> clazz = _eventRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_eventRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_eventRemoteModel != null) {
			try {
				Class<?> clazz = _eventRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_eventRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_eventRemoteModel != null) {
			try {
				Class<?> clazz = _eventRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_eventRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_eventRemoteModel != null) {
			try {
				Class<?> clazz = _eventRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_eventRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_eventRemoteModel != null) {
			try {
				Class<?> clazz = _eventRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_eventRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getEndDate() {
		return _endDate;
	}

	@Override
	public void setEndDate(Date endDate) {
		_endDate = endDate;

		if (_eventRemoteModel != null) {
			try {
				Class<?> clazz = _eventRemoteModel.getClass();

				Method method = clazz.getMethod("setEndDate", Date.class);

				method.invoke(_eventRemoteModel, endDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getFlag() {
		return _flag;
	}

	@Override
	public void setFlag(int flag) {
		_flag = flag;

		if (_eventRemoteModel != null) {
			try {
				Class<?> clazz = _eventRemoteModel.getClass();

				Method method = clazz.getMethod("setFlag", int.class);

				method.invoke(_eventRemoteModel, flag);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCourseId() {
		return _courseId;
	}

	@Override
	public void setCourseId(long courseId) {
		_courseId = courseId;

		if (_eventRemoteModel != null) {
			try {
				Class<?> clazz = _eventRemoteModel.getClass();

				Method method = clazz.getMethod("setCourseId", long.class);

				method.invoke(_eventRemoteModel, courseId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLocationId() {
		return _locationId;
	}

	@Override
	public void setLocationId(long locationId) {
		_locationId = locationId;

		if (_eventRemoteModel != null) {
			try {
				Class<?> clazz = _eventRemoteModel.getClass();

				Method method = clazz.getMethod("setLocationId", long.class);

				method.invoke(_eventRemoteModel, locationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEventRemoteModel() {
		return _eventRemoteModel;
	}

	public void setEventRemoteModel(BaseModel<?> eventRemoteModel) {
		_eventRemoteModel = eventRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _eventRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_eventRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EventLocalServiceUtil.addEvent(this);
		}
		else {
			EventLocalServiceUtil.updateEvent(this);
		}
	}

	@Override
	public Event toEscapedModel() {
		return (Event)ProxyUtil.newProxyInstance(Event.class.getClassLoader(),
			new Class[] { Event.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EventClp clone = new EventClp();

		clone.setEventId(getEventId());
		clone.setEventName(getEventName());
		clone.setCourseCode(getCourseCode());
		clone.setLocationCode(getLocationCode());
		clone.setStartDate(getStartDate());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setEndDate(getEndDate());
		clone.setFlag(getFlag());
		clone.setCourseId(getCourseId());
		clone.setLocationId(getLocationId());

		return clone;
	}

	@Override
	public int compareTo(Event event) {
		long primaryKey = event.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EventClp)) {
			return false;
		}

		EventClp event = (EventClp)obj;

		long primaryKey = event.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{eventId=");
		sb.append(getEventId());
		sb.append(", eventName=");
		sb.append(getEventName());
		sb.append(", courseCode=");
		sb.append(getCourseCode());
		sb.append(", locationCode=");
		sb.append(getLocationCode());
		sb.append(", startDate=");
		sb.append(getStartDate());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", endDate=");
		sb.append(getEndDate());
		sb.append(", flag=");
		sb.append(getFlag());
		sb.append(", courseId=");
		sb.append(getCourseId());
		sb.append(", locationId=");
		sb.append(getLocationId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("com.ocms.course.model.Event");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>eventId</column-name><column-value><![CDATA[");
		sb.append(getEventId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eventName</column-name><column-value><![CDATA[");
		sb.append(getEventName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>courseCode</column-name><column-value><![CDATA[");
		sb.append(getCourseCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>locationCode</column-name><column-value><![CDATA[");
		sb.append(getLocationCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startDate</column-name><column-value><![CDATA[");
		sb.append(getStartDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>endDate</column-name><column-value><![CDATA[");
		sb.append(getEndDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>flag</column-name><column-value><![CDATA[");
		sb.append(getFlag());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>courseId</column-name><column-value><![CDATA[");
		sb.append(getCourseId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>locationId</column-name><column-value><![CDATA[");
		sb.append(getLocationId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _eventId;
	private String _eventName;
	private String _courseCode;
	private String _locationCode;
	private Date _startDate;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private Date _endDate;
	private int _flag;
	private long _courseId;
	private long _locationId;
	private BaseModel<?> _eventRemoteModel;
}