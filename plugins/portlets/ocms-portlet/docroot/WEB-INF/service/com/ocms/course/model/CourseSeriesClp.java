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
import com.ocms.course.service.CourseSeriesLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author doraraj
 */
public class CourseSeriesClp extends BaseModelImpl<CourseSeries>
	implements CourseSeries {
	public CourseSeriesClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CourseSeries.class;
	}

	@Override
	public String getModelClassName() {
		return CourseSeries.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _courseSeriesId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCourseSeriesId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _courseSeriesId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("courseSeriesId", getCourseSeriesId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("courseId", getCourseId());
		attributes.put("locationId", getLocationId());
		attributes.put("type", getType());
		attributes.put("startDate", getStartDate());
		attributes.put("endDate", getEndDate());
		attributes.put("publishingStatus", getPublishingStatus());
		attributes.put("maxNoStudReg", getMaxNoStudReg());
		attributes.put("seriesCount", getSeriesCount());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long courseSeriesId = (Long)attributes.get("courseSeriesId");

		if (courseSeriesId != null) {
			setCourseSeriesId(courseSeriesId);
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

		Long courseId = (Long)attributes.get("courseId");

		if (courseId != null) {
			setCourseId(courseId);
		}

		Long locationId = (Long)attributes.get("locationId");

		if (locationId != null) {
			setLocationId(locationId);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		Date startDate = (Date)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		Date endDate = (Date)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}

		String publishingStatus = (String)attributes.get("publishingStatus");

		if (publishingStatus != null) {
			setPublishingStatus(publishingStatus);
		}

		Long maxNoStudReg = (Long)attributes.get("maxNoStudReg");

		if (maxNoStudReg != null) {
			setMaxNoStudReg(maxNoStudReg);
		}

		Long seriesCount = (Long)attributes.get("seriesCount");

		if (seriesCount != null) {
			setSeriesCount(seriesCount);
		}
	}

	@Override
	public long getCourseSeriesId() {
		return _courseSeriesId;
	}

	@Override
	public void setCourseSeriesId(long courseSeriesId) {
		_courseSeriesId = courseSeriesId;

		if (_courseSeriesRemoteModel != null) {
			try {
				Class<?> clazz = _courseSeriesRemoteModel.getClass();

				Method method = clazz.getMethod("setCourseSeriesId", long.class);

				method.invoke(_courseSeriesRemoteModel, courseSeriesId);
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

		if (_courseSeriesRemoteModel != null) {
			try {
				Class<?> clazz = _courseSeriesRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_courseSeriesRemoteModel, groupId);
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

		if (_courseSeriesRemoteModel != null) {
			try {
				Class<?> clazz = _courseSeriesRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_courseSeriesRemoteModel, companyId);
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

		if (_courseSeriesRemoteModel != null) {
			try {
				Class<?> clazz = _courseSeriesRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_courseSeriesRemoteModel, userId);
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

		if (_courseSeriesRemoteModel != null) {
			try {
				Class<?> clazz = _courseSeriesRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_courseSeriesRemoteModel, userName);
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

		if (_courseSeriesRemoteModel != null) {
			try {
				Class<?> clazz = _courseSeriesRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_courseSeriesRemoteModel, createDate);
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

		if (_courseSeriesRemoteModel != null) {
			try {
				Class<?> clazz = _courseSeriesRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_courseSeriesRemoteModel, modifiedDate);
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

		if (_courseSeriesRemoteModel != null) {
			try {
				Class<?> clazz = _courseSeriesRemoteModel.getClass();

				Method method = clazz.getMethod("setCourseId", long.class);

				method.invoke(_courseSeriesRemoteModel, courseId);
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

		if (_courseSeriesRemoteModel != null) {
			try {
				Class<?> clazz = _courseSeriesRemoteModel.getClass();

				Method method = clazz.getMethod("setLocationId", long.class);

				method.invoke(_courseSeriesRemoteModel, locationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getType() {
		return _type;
	}

	@Override
	public void setType(String type) {
		_type = type;

		if (_courseSeriesRemoteModel != null) {
			try {
				Class<?> clazz = _courseSeriesRemoteModel.getClass();

				Method method = clazz.getMethod("setType", String.class);

				method.invoke(_courseSeriesRemoteModel, type);
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

		if (_courseSeriesRemoteModel != null) {
			try {
				Class<?> clazz = _courseSeriesRemoteModel.getClass();

				Method method = clazz.getMethod("setStartDate", Date.class);

				method.invoke(_courseSeriesRemoteModel, startDate);
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

		if (_courseSeriesRemoteModel != null) {
			try {
				Class<?> clazz = _courseSeriesRemoteModel.getClass();

				Method method = clazz.getMethod("setEndDate", Date.class);

				method.invoke(_courseSeriesRemoteModel, endDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPublishingStatus() {
		return _publishingStatus;
	}

	@Override
	public void setPublishingStatus(String publishingStatus) {
		_publishingStatus = publishingStatus;

		if (_courseSeriesRemoteModel != null) {
			try {
				Class<?> clazz = _courseSeriesRemoteModel.getClass();

				Method method = clazz.getMethod("setPublishingStatus",
						String.class);

				method.invoke(_courseSeriesRemoteModel, publishingStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getMaxNoStudReg() {
		return _maxNoStudReg;
	}

	@Override
	public void setMaxNoStudReg(long maxNoStudReg) {
		_maxNoStudReg = maxNoStudReg;

		if (_courseSeriesRemoteModel != null) {
			try {
				Class<?> clazz = _courseSeriesRemoteModel.getClass();

				Method method = clazz.getMethod("setMaxNoStudReg", long.class);

				method.invoke(_courseSeriesRemoteModel, maxNoStudReg);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSeriesCount() {
		return _seriesCount;
	}

	@Override
	public void setSeriesCount(long seriesCount) {
		_seriesCount = seriesCount;

		if (_courseSeriesRemoteModel != null) {
			try {
				Class<?> clazz = _courseSeriesRemoteModel.getClass();

				Method method = clazz.getMethod("setSeriesCount", long.class);

				method.invoke(_courseSeriesRemoteModel, seriesCount);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCourseSeriesRemoteModel() {
		return _courseSeriesRemoteModel;
	}

	public void setCourseSeriesRemoteModel(BaseModel<?> courseSeriesRemoteModel) {
		_courseSeriesRemoteModel = courseSeriesRemoteModel;
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

		Class<?> remoteModelClass = _courseSeriesRemoteModel.getClass();

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

		Object returnValue = method.invoke(_courseSeriesRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CourseSeriesLocalServiceUtil.addCourseSeries(this);
		}
		else {
			CourseSeriesLocalServiceUtil.updateCourseSeries(this);
		}
	}

	@Override
	public CourseSeries toEscapedModel() {
		return (CourseSeries)ProxyUtil.newProxyInstance(CourseSeries.class.getClassLoader(),
			new Class[] { CourseSeries.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CourseSeriesClp clone = new CourseSeriesClp();

		clone.setCourseSeriesId(getCourseSeriesId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCourseId(getCourseId());
		clone.setLocationId(getLocationId());
		clone.setType(getType());
		clone.setStartDate(getStartDate());
		clone.setEndDate(getEndDate());
		clone.setPublishingStatus(getPublishingStatus());
		clone.setMaxNoStudReg(getMaxNoStudReg());
		clone.setSeriesCount(getSeriesCount());

		return clone;
	}

	@Override
	public int compareTo(CourseSeries courseSeries) {
		long primaryKey = courseSeries.getPrimaryKey();

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

		if (!(obj instanceof CourseSeriesClp)) {
			return false;
		}

		CourseSeriesClp courseSeries = (CourseSeriesClp)obj;

		long primaryKey = courseSeries.getPrimaryKey();

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

		sb.append("{courseSeriesId=");
		sb.append(getCourseSeriesId());
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
		sb.append(", courseId=");
		sb.append(getCourseId());
		sb.append(", locationId=");
		sb.append(getLocationId());
		sb.append(", type=");
		sb.append(getType());
		sb.append(", startDate=");
		sb.append(getStartDate());
		sb.append(", endDate=");
		sb.append(getEndDate());
		sb.append(", publishingStatus=");
		sb.append(getPublishingStatus());
		sb.append(", maxNoStudReg=");
		sb.append(getMaxNoStudReg());
		sb.append(", seriesCount=");
		sb.append(getSeriesCount());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("com.ocms.course.model.CourseSeries");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>courseSeriesId</column-name><column-value><![CDATA[");
		sb.append(getCourseSeriesId());
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
			"<column><column-name>courseId</column-name><column-value><![CDATA[");
		sb.append(getCourseId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>locationId</column-name><column-value><![CDATA[");
		sb.append(getLocationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startDate</column-name><column-value><![CDATA[");
		sb.append(getStartDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>endDate</column-name><column-value><![CDATA[");
		sb.append(getEndDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>publishingStatus</column-name><column-value><![CDATA[");
		sb.append(getPublishingStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maxNoStudReg</column-name><column-value><![CDATA[");
		sb.append(getMaxNoStudReg());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>seriesCount</column-name><column-value><![CDATA[");
		sb.append(getSeriesCount());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _courseSeriesId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _courseId;
	private long _locationId;
	private String _type;
	private Date _startDate;
	private Date _endDate;
	private String _publishingStatus;
	private long _maxNoStudReg;
	private long _seriesCount;
	private BaseModel<?> _courseSeriesRemoteModel;
}