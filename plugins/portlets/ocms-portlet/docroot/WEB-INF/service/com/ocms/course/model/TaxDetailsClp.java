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
import com.ocms.course.service.TaxDetailsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author doraraj
 */
public class TaxDetailsClp extends BaseModelImpl<TaxDetails>
	implements TaxDetails {
	public TaxDetailsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TaxDetails.class;
	}

	@Override
	public String getModelClassName() {
		return TaxDetails.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _taxDetailsId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTaxDetailsId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _taxDetailsId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("taxDetailsId", getTaxDetailsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("country", getCountry());
		attributes.put("taxTypeId", getTaxTypeId());
		attributes.put("effectiveFromDate", getEffectiveFromDate());
		attributes.put("effectiveToDate", getEffectiveToDate());
		attributes.put("active", getActive());
		attributes.put("taxPercent", getTaxPercent());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long taxDetailsId = (Long)attributes.get("taxDetailsId");

		if (taxDetailsId != null) {
			setTaxDetailsId(taxDetailsId);
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

		String country = (String)attributes.get("country");

		if (country != null) {
			setCountry(country);
		}

		Long taxTypeId = (Long)attributes.get("taxTypeId");

		if (taxTypeId != null) {
			setTaxTypeId(taxTypeId);
		}

		Date effectiveFromDate = (Date)attributes.get("effectiveFromDate");

		if (effectiveFromDate != null) {
			setEffectiveFromDate(effectiveFromDate);
		}

		Date effectiveToDate = (Date)attributes.get("effectiveToDate");

		if (effectiveToDate != null) {
			setEffectiveToDate(effectiveToDate);
		}

		Integer active = (Integer)attributes.get("active");

		if (active != null) {
			setActive(active);
		}

		Integer taxPercent = (Integer)attributes.get("taxPercent");

		if (taxPercent != null) {
			setTaxPercent(taxPercent);
		}
	}

	@Override
	public long getTaxDetailsId() {
		return _taxDetailsId;
	}

	@Override
	public void setTaxDetailsId(long taxDetailsId) {
		_taxDetailsId = taxDetailsId;

		if (_taxDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _taxDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setTaxDetailsId", long.class);

				method.invoke(_taxDetailsRemoteModel, taxDetailsId);
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

		if (_taxDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _taxDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_taxDetailsRemoteModel, groupId);
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

		if (_taxDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _taxDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_taxDetailsRemoteModel, companyId);
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

		if (_taxDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _taxDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_taxDetailsRemoteModel, userId);
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

		if (_taxDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _taxDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_taxDetailsRemoteModel, userName);
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

		if (_taxDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _taxDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_taxDetailsRemoteModel, createDate);
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

		if (_taxDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _taxDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_taxDetailsRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCountry() {
		return _country;
	}

	@Override
	public void setCountry(String country) {
		_country = country;

		if (_taxDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _taxDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCountry", String.class);

				method.invoke(_taxDetailsRemoteModel, country);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTaxTypeId() {
		return _taxTypeId;
	}

	@Override
	public void setTaxTypeId(long taxTypeId) {
		_taxTypeId = taxTypeId;

		if (_taxDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _taxDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setTaxTypeId", long.class);

				method.invoke(_taxDetailsRemoteModel, taxTypeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getEffectiveFromDate() {
		return _effectiveFromDate;
	}

	@Override
	public void setEffectiveFromDate(Date effectiveFromDate) {
		_effectiveFromDate = effectiveFromDate;

		if (_taxDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _taxDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setEffectiveFromDate",
						Date.class);

				method.invoke(_taxDetailsRemoteModel, effectiveFromDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getEffectiveToDate() {
		return _effectiveToDate;
	}

	@Override
	public void setEffectiveToDate(Date effectiveToDate) {
		_effectiveToDate = effectiveToDate;

		if (_taxDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _taxDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setEffectiveToDate", Date.class);

				method.invoke(_taxDetailsRemoteModel, effectiveToDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getActive() {
		return _active;
	}

	@Override
	public void setActive(int active) {
		_active = active;

		if (_taxDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _taxDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setActive", int.class);

				method.invoke(_taxDetailsRemoteModel, active);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTaxPercent() {
		return _taxPercent;
	}

	@Override
	public void setTaxPercent(int taxPercent) {
		_taxPercent = taxPercent;

		if (_taxDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _taxDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setTaxPercent", int.class);

				method.invoke(_taxDetailsRemoteModel, taxPercent);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTaxDetailsRemoteModel() {
		return _taxDetailsRemoteModel;
	}

	public void setTaxDetailsRemoteModel(BaseModel<?> taxDetailsRemoteModel) {
		_taxDetailsRemoteModel = taxDetailsRemoteModel;
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

		Class<?> remoteModelClass = _taxDetailsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_taxDetailsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TaxDetailsLocalServiceUtil.addTaxDetails(this);
		}
		else {
			TaxDetailsLocalServiceUtil.updateTaxDetails(this);
		}
	}

	@Override
	public TaxDetails toEscapedModel() {
		return (TaxDetails)ProxyUtil.newProxyInstance(TaxDetails.class.getClassLoader(),
			new Class[] { TaxDetails.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TaxDetailsClp clone = new TaxDetailsClp();

		clone.setTaxDetailsId(getTaxDetailsId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCountry(getCountry());
		clone.setTaxTypeId(getTaxTypeId());
		clone.setEffectiveFromDate(getEffectiveFromDate());
		clone.setEffectiveToDate(getEffectiveToDate());
		clone.setActive(getActive());
		clone.setTaxPercent(getTaxPercent());

		return clone;
	}

	@Override
	public int compareTo(TaxDetails taxDetails) {
		long primaryKey = taxDetails.getPrimaryKey();

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

		if (!(obj instanceof TaxDetailsClp)) {
			return false;
		}

		TaxDetailsClp taxDetails = (TaxDetailsClp)obj;

		long primaryKey = taxDetails.getPrimaryKey();

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
		StringBundler sb = new StringBundler(27);

		sb.append("{taxDetailsId=");
		sb.append(getTaxDetailsId());
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
		sb.append(", country=");
		sb.append(getCountry());
		sb.append(", taxTypeId=");
		sb.append(getTaxTypeId());
		sb.append(", effectiveFromDate=");
		sb.append(getEffectiveFromDate());
		sb.append(", effectiveToDate=");
		sb.append(getEffectiveToDate());
		sb.append(", active=");
		sb.append(getActive());
		sb.append(", taxPercent=");
		sb.append(getTaxPercent());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.ocms.course.model.TaxDetails");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>taxDetailsId</column-name><column-value><![CDATA[");
		sb.append(getTaxDetailsId());
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
			"<column><column-name>country</column-name><column-value><![CDATA[");
		sb.append(getCountry());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taxTypeId</column-name><column-value><![CDATA[");
		sb.append(getTaxTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>effectiveFromDate</column-name><column-value><![CDATA[");
		sb.append(getEffectiveFromDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>effectiveToDate</column-name><column-value><![CDATA[");
		sb.append(getEffectiveToDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>active</column-name><column-value><![CDATA[");
		sb.append(getActive());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taxPercent</column-name><column-value><![CDATA[");
		sb.append(getTaxPercent());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _taxDetailsId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _country;
	private long _taxTypeId;
	private Date _effectiveFromDate;
	private Date _effectiveToDate;
	private int _active;
	private int _taxPercent;
	private BaseModel<?> _taxDetailsRemoteModel;
}