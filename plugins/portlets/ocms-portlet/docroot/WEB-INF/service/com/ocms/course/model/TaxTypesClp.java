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
import com.ocms.course.service.TaxTypesLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author doraraj
 */
public class TaxTypesClp extends BaseModelImpl<TaxTypes> implements TaxTypes {
	public TaxTypesClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TaxTypes.class;
	}

	@Override
	public String getModelClassName() {
		return TaxTypes.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _taxTypesId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTaxTypesId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _taxTypesId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("taxTypesId", getTaxTypesId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("taxName", getTaxName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long taxTypesId = (Long)attributes.get("taxTypesId");

		if (taxTypesId != null) {
			setTaxTypesId(taxTypesId);
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

		String taxName = (String)attributes.get("taxName");

		if (taxName != null) {
			setTaxName(taxName);
		}
	}

	@Override
	public long getTaxTypesId() {
		return _taxTypesId;
	}

	@Override
	public void setTaxTypesId(long taxTypesId) {
		_taxTypesId = taxTypesId;

		if (_taxTypesRemoteModel != null) {
			try {
				Class<?> clazz = _taxTypesRemoteModel.getClass();

				Method method = clazz.getMethod("setTaxTypesId", long.class);

				method.invoke(_taxTypesRemoteModel, taxTypesId);
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

		if (_taxTypesRemoteModel != null) {
			try {
				Class<?> clazz = _taxTypesRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_taxTypesRemoteModel, groupId);
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

		if (_taxTypesRemoteModel != null) {
			try {
				Class<?> clazz = _taxTypesRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_taxTypesRemoteModel, companyId);
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

		if (_taxTypesRemoteModel != null) {
			try {
				Class<?> clazz = _taxTypesRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_taxTypesRemoteModel, userId);
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

		if (_taxTypesRemoteModel != null) {
			try {
				Class<?> clazz = _taxTypesRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_taxTypesRemoteModel, userName);
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

		if (_taxTypesRemoteModel != null) {
			try {
				Class<?> clazz = _taxTypesRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_taxTypesRemoteModel, createDate);
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

		if (_taxTypesRemoteModel != null) {
			try {
				Class<?> clazz = _taxTypesRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_taxTypesRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTaxName() {
		return _taxName;
	}

	@Override
	public void setTaxName(String taxName) {
		_taxName = taxName;

		if (_taxTypesRemoteModel != null) {
			try {
				Class<?> clazz = _taxTypesRemoteModel.getClass();

				Method method = clazz.getMethod("setTaxName", String.class);

				method.invoke(_taxTypesRemoteModel, taxName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTaxTypesRemoteModel() {
		return _taxTypesRemoteModel;
	}

	public void setTaxTypesRemoteModel(BaseModel<?> taxTypesRemoteModel) {
		_taxTypesRemoteModel = taxTypesRemoteModel;
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

		Class<?> remoteModelClass = _taxTypesRemoteModel.getClass();

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

		Object returnValue = method.invoke(_taxTypesRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TaxTypesLocalServiceUtil.addTaxTypes(this);
		}
		else {
			TaxTypesLocalServiceUtil.updateTaxTypes(this);
		}
	}

	@Override
	public TaxTypes toEscapedModel() {
		return (TaxTypes)ProxyUtil.newProxyInstance(TaxTypes.class.getClassLoader(),
			new Class[] { TaxTypes.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TaxTypesClp clone = new TaxTypesClp();

		clone.setTaxTypesId(getTaxTypesId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setTaxName(getTaxName());

		return clone;
	}

	@Override
	public int compareTo(TaxTypes taxTypes) {
		long primaryKey = taxTypes.getPrimaryKey();

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

		if (!(obj instanceof TaxTypesClp)) {
			return false;
		}

		TaxTypesClp taxTypes = (TaxTypesClp)obj;

		long primaryKey = taxTypes.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{taxTypesId=");
		sb.append(getTaxTypesId());
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
		sb.append(", taxName=");
		sb.append(getTaxName());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.ocms.course.model.TaxTypes");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>taxTypesId</column-name><column-value><![CDATA[");
		sb.append(getTaxTypesId());
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
			"<column><column-name>taxName</column-name><column-value><![CDATA[");
		sb.append(getTaxName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _taxTypesId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _taxName;
	private BaseModel<?> _taxTypesRemoteModel;
}