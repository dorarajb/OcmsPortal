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

package com.liferay.portal.workflow.kaleo.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portal.workflow.kaleo.service.ClpSerializer;
import com.liferay.portal.workflow.kaleo.service.KaleoTimerLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Brian Wing Shun Chan
 */
public class KaleoTimerClp extends BaseModelImpl<KaleoTimer>
	implements KaleoTimer {
	public KaleoTimerClp() {
	}


	public Class<?> getModelClass() {
		return KaleoTimer.class;
	}


	public String getModelClassName() {
		return KaleoTimer.class.getName();
	}


	public long getPrimaryKey() {
		return _kaleoTimerId;
	}


	public void setPrimaryKey(long primaryKey) {
		setKaleoTimerId(primaryKey);
	}


	public Serializable getPrimaryKeyObj() {
		return _kaleoTimerId;
	}


	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}


	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("kaleoTimerId", getKaleoTimerId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("kaleoClassName", getKaleoClassName());
		attributes.put("kaleoClassPK", getKaleoClassPK());
		attributes.put("kaleoDefinitionId", getKaleoDefinitionId());
		attributes.put("name", getName());
		attributes.put("blocking", getBlocking());
		attributes.put("description", getDescription());
		attributes.put("duration", getDuration());
		attributes.put("scale", getScale());
		attributes.put("recurrenceDuration", getRecurrenceDuration());
		attributes.put("recurrenceScale", getRecurrenceScale());

		return attributes;
	}


	public void setModelAttributes(Map<String, Object> attributes) {
		Long kaleoTimerId = (Long)attributes.get("kaleoTimerId");

		if (kaleoTimerId != null) {
			setKaleoTimerId(kaleoTimerId);
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

		String kaleoClassName = (String)attributes.get("kaleoClassName");

		if (kaleoClassName != null) {
			setKaleoClassName(kaleoClassName);
		}

		Long kaleoClassPK = (Long)attributes.get("kaleoClassPK");

		if (kaleoClassPK != null) {
			setKaleoClassPK(kaleoClassPK);
		}

		Long kaleoDefinitionId = (Long)attributes.get("kaleoDefinitionId");

		if (kaleoDefinitionId != null) {
			setKaleoDefinitionId(kaleoDefinitionId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Boolean blocking = (Boolean)attributes.get("blocking");

		if (blocking != null) {
			setBlocking(blocking);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Double duration = (Double)attributes.get("duration");

		if (duration != null) {
			setDuration(duration);
		}

		String scale = (String)attributes.get("scale");

		if (scale != null) {
			setScale(scale);
		}

		Double recurrenceDuration = (Double)attributes.get("recurrenceDuration");

		if (recurrenceDuration != null) {
			setRecurrenceDuration(recurrenceDuration);
		}

		String recurrenceScale = (String)attributes.get("recurrenceScale");

		if (recurrenceScale != null) {
			setRecurrenceScale(recurrenceScale);
		}
	}


	public long getKaleoTimerId() {
		return _kaleoTimerId;
	}


	public void setKaleoTimerId(long kaleoTimerId) {
		_kaleoTimerId = kaleoTimerId;

		if (_kaleoTimerRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoTimerRemoteModel.getClass();

				Method method = clazz.getMethod("setKaleoTimerId", long.class);

				method.invoke(_kaleoTimerRemoteModel, kaleoTimerId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public long getGroupId() {
		return _groupId;
	}


	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_kaleoTimerRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoTimerRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_kaleoTimerRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public long getCompanyId() {
		return _companyId;
	}


	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_kaleoTimerRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoTimerRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_kaleoTimerRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public long getUserId() {
		return _userId;
	}


	public void setUserId(long userId) {
		_userId = userId;

		if (_kaleoTimerRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoTimerRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_kaleoTimerRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}


	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}


	public String getUserName() {
		return _userName;
	}


	public void setUserName(String userName) {
		_userName = userName;

		if (_kaleoTimerRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoTimerRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_kaleoTimerRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public Date getCreateDate() {
		return _createDate;
	}


	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_kaleoTimerRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoTimerRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_kaleoTimerRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public Date getModifiedDate() {
		return _modifiedDate;
	}


	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_kaleoTimerRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoTimerRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_kaleoTimerRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public String getKaleoClassName() {
		return _kaleoClassName;
	}


	public void setKaleoClassName(String kaleoClassName) {
		_kaleoClassName = kaleoClassName;

		if (_kaleoTimerRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoTimerRemoteModel.getClass();

				Method method = clazz.getMethod("setKaleoClassName",
						String.class);

				method.invoke(_kaleoTimerRemoteModel, kaleoClassName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public long getKaleoClassPK() {
		return _kaleoClassPK;
	}


	public void setKaleoClassPK(long kaleoClassPK) {
		_kaleoClassPK = kaleoClassPK;

		if (_kaleoTimerRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoTimerRemoteModel.getClass();

				Method method = clazz.getMethod("setKaleoClassPK", long.class);

				method.invoke(_kaleoTimerRemoteModel, kaleoClassPK);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public long getKaleoDefinitionId() {
		return _kaleoDefinitionId;
	}


	public void setKaleoDefinitionId(long kaleoDefinitionId) {
		_kaleoDefinitionId = kaleoDefinitionId;

		if (_kaleoTimerRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoTimerRemoteModel.getClass();

				Method method = clazz.getMethod("setKaleoDefinitionId",
						long.class);

				method.invoke(_kaleoTimerRemoteModel, kaleoDefinitionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public String getName() {
		return _name;
	}


	public void setName(String name) {
		_name = name;

		if (_kaleoTimerRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoTimerRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_kaleoTimerRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public boolean getBlocking() {
		return _blocking;
	}


	public boolean isBlocking() {
		return _blocking;
	}


	public void setBlocking(boolean blocking) {
		_blocking = blocking;

		if (_kaleoTimerRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoTimerRemoteModel.getClass();

				Method method = clazz.getMethod("setBlocking", boolean.class);

				method.invoke(_kaleoTimerRemoteModel, blocking);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public String getDescription() {
		return _description;
	}


	public void setDescription(String description) {
		_description = description;

		if (_kaleoTimerRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoTimerRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_kaleoTimerRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public double getDuration() {
		return _duration;
	}


	public void setDuration(double duration) {
		_duration = duration;

		if (_kaleoTimerRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoTimerRemoteModel.getClass();

				Method method = clazz.getMethod("setDuration", double.class);

				method.invoke(_kaleoTimerRemoteModel, duration);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public String getScale() {
		return _scale;
	}


	public void setScale(String scale) {
		_scale = scale;

		if (_kaleoTimerRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoTimerRemoteModel.getClass();

				Method method = clazz.getMethod("setScale", String.class);

				method.invoke(_kaleoTimerRemoteModel, scale);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public double getRecurrenceDuration() {
		return _recurrenceDuration;
	}


	public void setRecurrenceDuration(double recurrenceDuration) {
		_recurrenceDuration = recurrenceDuration;

		if (_kaleoTimerRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoTimerRemoteModel.getClass();

				Method method = clazz.getMethod("setRecurrenceDuration",
						double.class);

				method.invoke(_kaleoTimerRemoteModel, recurrenceDuration);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public String getRecurrenceScale() {
		return _recurrenceScale;
	}


	public void setRecurrenceScale(String recurrenceScale) {
		_recurrenceScale = recurrenceScale;

		if (_kaleoTimerRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoTimerRemoteModel.getClass();

				Method method = clazz.getMethod("setRecurrenceScale",
						String.class);

				method.invoke(_kaleoTimerRemoteModel, recurrenceScale);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public boolean isRecurring() {
		try {
			String methodName = "isRecurring";

			Class<?>[] parameterTypes = new Class<?>[] {  };

			Object[] parameterValues = new Object[] {  };

			Boolean returnObj = (Boolean)invokeOnRemoteModel(methodName,
					parameterTypes, parameterValues);

			return returnObj;
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}


	public java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment> getKaleoTaskReassignments() {
		try {
			String methodName = "getKaleoTaskReassignments";

			Class<?>[] parameterTypes = new Class<?>[] {  };

			Object[] parameterValues = new Object[] {  };

			java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment> returnObj =
				(java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment>)invokeOnRemoteModel(methodName,
					parameterTypes, parameterValues);

			return returnObj;
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	public BaseModel<?> getKaleoTimerRemoteModel() {
		return _kaleoTimerRemoteModel;
	}

	public void setKaleoTimerRemoteModel(BaseModel<?> kaleoTimerRemoteModel) {
		_kaleoTimerRemoteModel = kaleoTimerRemoteModel;
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

		Class<?> remoteModelClass = _kaleoTimerRemoteModel.getClass();

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

		Object returnValue = method.invoke(_kaleoTimerRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}


	public void persist() throws SystemException {
		if (this.isNew()) {
			KaleoTimerLocalServiceUtil.addKaleoTimer(this);
		}
		else {
			KaleoTimerLocalServiceUtil.updateKaleoTimer(this);
		}
	}


	public KaleoTimer toEscapedModel() {
		return (KaleoTimer)ProxyUtil.newProxyInstance(KaleoTimer.class.getClassLoader(),
			new Class[] { KaleoTimer.class }, new AutoEscapeBeanHandler(this));
	}


	public Object clone() {
		KaleoTimerClp clone = new KaleoTimerClp();

		clone.setKaleoTimerId(getKaleoTimerId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setKaleoClassName(getKaleoClassName());
		clone.setKaleoClassPK(getKaleoClassPK());
		clone.setKaleoDefinitionId(getKaleoDefinitionId());
		clone.setName(getName());
		clone.setBlocking(getBlocking());
		clone.setDescription(getDescription());
		clone.setDuration(getDuration());
		clone.setScale(getScale());
		clone.setRecurrenceDuration(getRecurrenceDuration());
		clone.setRecurrenceScale(getRecurrenceScale());

		return clone;
	}


	public int compareTo(KaleoTimer kaleoTimer) {
		int value = 0;

		if (getKaleoTimerId() < kaleoTimer.getKaleoTimerId()) {
			value = -1;
		}
		else if (getKaleoTimerId() > kaleoTimer.getKaleoTimerId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}


	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KaleoTimerClp)) {
			return false;
		}

		KaleoTimerClp kaleoTimer = (KaleoTimerClp)obj;

		long primaryKey = kaleoTimer.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}


	public int hashCode() {
		return (int)getPrimaryKey();
	}


	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{kaleoTimerId=");
		sb.append(getKaleoTimerId());
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
		sb.append(", kaleoClassName=");
		sb.append(getKaleoClassName());
		sb.append(", kaleoClassPK=");
		sb.append(getKaleoClassPK());
		sb.append(", kaleoDefinitionId=");
		sb.append(getKaleoDefinitionId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", blocking=");
		sb.append(getBlocking());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", duration=");
		sb.append(getDuration());
		sb.append(", scale=");
		sb.append(getScale());
		sb.append(", recurrenceDuration=");
		sb.append(getRecurrenceDuration());
		sb.append(", recurrenceScale=");
		sb.append(getRecurrenceScale());
		sb.append("}");

		return sb.toString();
	}


	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portal.workflow.kaleo.model.KaleoTimer");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>kaleoTimerId</column-name><column-value><![CDATA[");
		sb.append(getKaleoTimerId());
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
			"<column><column-name>kaleoClassName</column-name><column-value><![CDATA[");
		sb.append(getKaleoClassName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoClassPK</column-name><column-value><![CDATA[");
		sb.append(getKaleoClassPK());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoDefinitionId</column-name><column-value><![CDATA[");
		sb.append(getKaleoDefinitionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>blocking</column-name><column-value><![CDATA[");
		sb.append(getBlocking());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>duration</column-name><column-value><![CDATA[");
		sb.append(getDuration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>scale</column-name><column-value><![CDATA[");
		sb.append(getScale());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>recurrenceDuration</column-name><column-value><![CDATA[");
		sb.append(getRecurrenceDuration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>recurrenceScale</column-name><column-value><![CDATA[");
		sb.append(getRecurrenceScale());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _kaleoTimerId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _kaleoClassName;
	private long _kaleoClassPK;
	private long _kaleoDefinitionId;
	private String _name;
	private boolean _blocking;
	private String _description;
	private double _duration;
	private String _scale;
	private double _recurrenceDuration;
	private String _recurrenceScale;
	private BaseModel<?> _kaleoTimerRemoteModel;
}