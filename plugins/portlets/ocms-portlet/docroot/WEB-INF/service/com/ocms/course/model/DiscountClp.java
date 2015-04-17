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
import com.ocms.course.service.DiscountLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author doraraj
 */
public class DiscountClp extends BaseModelImpl<Discount> implements Discount {
	public DiscountClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Discount.class;
	}

	@Override
	public String getModelClassName() {
		return Discount.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("code", getCode());
		attributes.put("description", getDescription());
		attributes.put("amount", getAmount());
		attributes.put("active", getActive());
		attributes.put("effectiveFromDate", getEffectiveFromDate());
		attributes.put("effectivetoDate", getEffectivetoDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
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

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long amount = (Long)attributes.get("amount");

		if (amount != null) {
			setAmount(amount);
		}

		Integer active = (Integer)attributes.get("active");

		if (active != null) {
			setActive(active);
		}

		Date effectiveFromDate = (Date)attributes.get("effectiveFromDate");

		if (effectiveFromDate != null) {
			setEffectiveFromDate(effectiveFromDate);
		}

		Date effectivetoDate = (Date)attributes.get("effectivetoDate");

		if (effectivetoDate != null) {
			setEffectivetoDate(effectivetoDate);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_discountRemoteModel != null) {
			try {
				Class<?> clazz = _discountRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_discountRemoteModel, id);
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

		if (_discountRemoteModel != null) {
			try {
				Class<?> clazz = _discountRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_discountRemoteModel, groupId);
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

		if (_discountRemoteModel != null) {
			try {
				Class<?> clazz = _discountRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_discountRemoteModel, companyId);
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

		if (_discountRemoteModel != null) {
			try {
				Class<?> clazz = _discountRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_discountRemoteModel, userId);
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

		if (_discountRemoteModel != null) {
			try {
				Class<?> clazz = _discountRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_discountRemoteModel, userName);
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

		if (_discountRemoteModel != null) {
			try {
				Class<?> clazz = _discountRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_discountRemoteModel, createDate);
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

		if (_discountRemoteModel != null) {
			try {
				Class<?> clazz = _discountRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_discountRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCode() {
		return _code;
	}

	@Override
	public void setCode(String code) {
		_code = code;

		if (_discountRemoteModel != null) {
			try {
				Class<?> clazz = _discountRemoteModel.getClass();

				Method method = clazz.getMethod("setCode", String.class);

				method.invoke(_discountRemoteModel, code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_discountRemoteModel != null) {
			try {
				Class<?> clazz = _discountRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_discountRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAmount() {
		return _amount;
	}

	@Override
	public void setAmount(long amount) {
		_amount = amount;

		if (_discountRemoteModel != null) {
			try {
				Class<?> clazz = _discountRemoteModel.getClass();

				Method method = clazz.getMethod("setAmount", long.class);

				method.invoke(_discountRemoteModel, amount);
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

		if (_discountRemoteModel != null) {
			try {
				Class<?> clazz = _discountRemoteModel.getClass();

				Method method = clazz.getMethod("setActive", int.class);

				method.invoke(_discountRemoteModel, active);
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

		if (_discountRemoteModel != null) {
			try {
				Class<?> clazz = _discountRemoteModel.getClass();

				Method method = clazz.getMethod("setEffectiveFromDate",
						Date.class);

				method.invoke(_discountRemoteModel, effectiveFromDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getEffectivetoDate() {
		return _effectivetoDate;
	}

	@Override
	public void setEffectivetoDate(Date effectivetoDate) {
		_effectivetoDate = effectivetoDate;

		if (_discountRemoteModel != null) {
			try {
				Class<?> clazz = _discountRemoteModel.getClass();

				Method method = clazz.getMethod("setEffectivetoDate", Date.class);

				method.invoke(_discountRemoteModel, effectivetoDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDiscountRemoteModel() {
		return _discountRemoteModel;
	}

	public void setDiscountRemoteModel(BaseModel<?> discountRemoteModel) {
		_discountRemoteModel = discountRemoteModel;
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

		Class<?> remoteModelClass = _discountRemoteModel.getClass();

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

		Object returnValue = method.invoke(_discountRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DiscountLocalServiceUtil.addDiscount(this);
		}
		else {
			DiscountLocalServiceUtil.updateDiscount(this);
		}
	}

	@Override
	public Discount toEscapedModel() {
		return (Discount)ProxyUtil.newProxyInstance(Discount.class.getClassLoader(),
			new Class[] { Discount.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DiscountClp clone = new DiscountClp();

		clone.setId(getId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCode(getCode());
		clone.setDescription(getDescription());
		clone.setAmount(getAmount());
		clone.setActive(getActive());
		clone.setEffectiveFromDate(getEffectiveFromDate());
		clone.setEffectivetoDate(getEffectivetoDate());

		return clone;
	}

	@Override
	public int compareTo(Discount discount) {
		long primaryKey = discount.getPrimaryKey();

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

		if (!(obj instanceof DiscountClp)) {
			return false;
		}

		DiscountClp discount = (DiscountClp)obj;

		long primaryKey = discount.getPrimaryKey();

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

		sb.append("{id=");
		sb.append(getId());
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
		sb.append(", code=");
		sb.append(getCode());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", amount=");
		sb.append(getAmount());
		sb.append(", active=");
		sb.append(getActive());
		sb.append(", effectiveFromDate=");
		sb.append(getEffectiveFromDate());
		sb.append(", effectivetoDate=");
		sb.append(getEffectivetoDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.ocms.course.model.Discount");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
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
			"<column><column-name>code</column-name><column-value><![CDATA[");
		sb.append(getCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>amount</column-name><column-value><![CDATA[");
		sb.append(getAmount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>active</column-name><column-value><![CDATA[");
		sb.append(getActive());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>effectiveFromDate</column-name><column-value><![CDATA[");
		sb.append(getEffectiveFromDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>effectivetoDate</column-name><column-value><![CDATA[");
		sb.append(getEffectivetoDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _code;
	private String _description;
	private long _amount;
	private int _active;
	private Date _effectiveFromDate;
	private Date _effectivetoDate;
	private BaseModel<?> _discountRemoteModel;
}