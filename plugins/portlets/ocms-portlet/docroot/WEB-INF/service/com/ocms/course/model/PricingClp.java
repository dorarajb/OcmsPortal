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
import com.ocms.course.service.PricingLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author doraraj
 */
public class PricingClp extends BaseModelImpl<Pricing> implements Pricing {
	public PricingClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Pricing.class;
	}

	@Override
	public String getModelClassName() {
		return Pricing.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _pricingId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPricingId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _pricingId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("pricingId", getPricingId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("locationId", getLocationId());
		attributes.put("courseId", getCourseId());
		attributes.put("packageId", getPackageId());
		attributes.put("deposit", getDeposit());
		attributes.put("price", getPrice());
		attributes.put("currency", getCurrency());
		attributes.put("effectiveFromDate", getEffectiveFromDate());
		attributes.put("courseCode", getCourseCode());
		attributes.put("locationCode", getLocationCode());
		attributes.put("effectiveToDate", getEffectiveToDate());
		attributes.put("active", getActive());
		attributes.put("balanceDueParDate", getBalanceDueParDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long pricingId = (Long)attributes.get("pricingId");

		if (pricingId != null) {
			setPricingId(pricingId);
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

		Integer locationId = (Integer)attributes.get("locationId");

		if (locationId != null) {
			setLocationId(locationId);
		}

		Integer courseId = (Integer)attributes.get("courseId");

		if (courseId != null) {
			setCourseId(courseId);
		}

		Integer packageId = (Integer)attributes.get("packageId");

		if (packageId != null) {
			setPackageId(packageId);
		}

		Integer deposit = (Integer)attributes.get("deposit");

		if (deposit != null) {
			setDeposit(deposit);
		}

		Integer price = (Integer)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}

		String currency = (String)attributes.get("currency");

		if (currency != null) {
			setCurrency(currency);
		}

		Date effectiveFromDate = (Date)attributes.get("effectiveFromDate");

		if (effectiveFromDate != null) {
			setEffectiveFromDate(effectiveFromDate);
		}

		String courseCode = (String)attributes.get("courseCode");

		if (courseCode != null) {
			setCourseCode(courseCode);
		}

		String locationCode = (String)attributes.get("locationCode");

		if (locationCode != null) {
			setLocationCode(locationCode);
		}

		Date effectiveToDate = (Date)attributes.get("effectiveToDate");

		if (effectiveToDate != null) {
			setEffectiveToDate(effectiveToDate);
		}

		Integer active = (Integer)attributes.get("active");

		if (active != null) {
			setActive(active);
		}

		Integer balanceDueParDate = (Integer)attributes.get("balanceDueParDate");

		if (balanceDueParDate != null) {
			setBalanceDueParDate(balanceDueParDate);
		}
	}

	@Override
	public long getPricingId() {
		return _pricingId;
	}

	@Override
	public void setPricingId(long pricingId) {
		_pricingId = pricingId;

		if (_pricingRemoteModel != null) {
			try {
				Class<?> clazz = _pricingRemoteModel.getClass();

				Method method = clazz.getMethod("setPricingId", long.class);

				method.invoke(_pricingRemoteModel, pricingId);
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

		if (_pricingRemoteModel != null) {
			try {
				Class<?> clazz = _pricingRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_pricingRemoteModel, groupId);
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

		if (_pricingRemoteModel != null) {
			try {
				Class<?> clazz = _pricingRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_pricingRemoteModel, companyId);
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

		if (_pricingRemoteModel != null) {
			try {
				Class<?> clazz = _pricingRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_pricingRemoteModel, userId);
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

		if (_pricingRemoteModel != null) {
			try {
				Class<?> clazz = _pricingRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_pricingRemoteModel, userName);
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

		if (_pricingRemoteModel != null) {
			try {
				Class<?> clazz = _pricingRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_pricingRemoteModel, createDate);
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

		if (_pricingRemoteModel != null) {
			try {
				Class<?> clazz = _pricingRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_pricingRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLocationId() {
		return _locationId;
	}

	@Override
	public void setLocationId(int locationId) {
		_locationId = locationId;

		if (_pricingRemoteModel != null) {
			try {
				Class<?> clazz = _pricingRemoteModel.getClass();

				Method method = clazz.getMethod("setLocationId", int.class);

				method.invoke(_pricingRemoteModel, locationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCourseId() {
		return _courseId;
	}

	@Override
	public void setCourseId(int courseId) {
		_courseId = courseId;

		if (_pricingRemoteModel != null) {
			try {
				Class<?> clazz = _pricingRemoteModel.getClass();

				Method method = clazz.getMethod("setCourseId", int.class);

				method.invoke(_pricingRemoteModel, courseId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPackageId() {
		return _packageId;
	}

	@Override
	public void setPackageId(int packageId) {
		_packageId = packageId;

		if (_pricingRemoteModel != null) {
			try {
				Class<?> clazz = _pricingRemoteModel.getClass();

				Method method = clazz.getMethod("setPackageId", int.class);

				method.invoke(_pricingRemoteModel, packageId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDeposit() {
		return _deposit;
	}

	@Override
	public void setDeposit(int deposit) {
		_deposit = deposit;

		if (_pricingRemoteModel != null) {
			try {
				Class<?> clazz = _pricingRemoteModel.getClass();

				Method method = clazz.getMethod("setDeposit", int.class);

				method.invoke(_pricingRemoteModel, deposit);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPrice() {
		return _price;
	}

	@Override
	public void setPrice(int price) {
		_price = price;

		if (_pricingRemoteModel != null) {
			try {
				Class<?> clazz = _pricingRemoteModel.getClass();

				Method method = clazz.getMethod("setPrice", int.class);

				method.invoke(_pricingRemoteModel, price);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCurrency() {
		return _currency;
	}

	@Override
	public void setCurrency(String currency) {
		_currency = currency;

		if (_pricingRemoteModel != null) {
			try {
				Class<?> clazz = _pricingRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrency", String.class);

				method.invoke(_pricingRemoteModel, currency);
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

		if (_pricingRemoteModel != null) {
			try {
				Class<?> clazz = _pricingRemoteModel.getClass();

				Method method = clazz.getMethod("setEffectiveFromDate",
						Date.class);

				method.invoke(_pricingRemoteModel, effectiveFromDate);
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

		if (_pricingRemoteModel != null) {
			try {
				Class<?> clazz = _pricingRemoteModel.getClass();

				Method method = clazz.getMethod("setCourseCode", String.class);

				method.invoke(_pricingRemoteModel, courseCode);
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

		if (_pricingRemoteModel != null) {
			try {
				Class<?> clazz = _pricingRemoteModel.getClass();

				Method method = clazz.getMethod("setLocationCode", String.class);

				method.invoke(_pricingRemoteModel, locationCode);
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

		if (_pricingRemoteModel != null) {
			try {
				Class<?> clazz = _pricingRemoteModel.getClass();

				Method method = clazz.getMethod("setEffectiveToDate", Date.class);

				method.invoke(_pricingRemoteModel, effectiveToDate);
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

		if (_pricingRemoteModel != null) {
			try {
				Class<?> clazz = _pricingRemoteModel.getClass();

				Method method = clazz.getMethod("setActive", int.class);

				method.invoke(_pricingRemoteModel, active);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getBalanceDueParDate() {
		return _balanceDueParDate;
	}

	@Override
	public void setBalanceDueParDate(int balanceDueParDate) {
		_balanceDueParDate = balanceDueParDate;

		if (_pricingRemoteModel != null) {
			try {
				Class<?> clazz = _pricingRemoteModel.getClass();

				Method method = clazz.getMethod("setBalanceDueParDate",
						int.class);

				method.invoke(_pricingRemoteModel, balanceDueParDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPricingRemoteModel() {
		return _pricingRemoteModel;
	}

	public void setPricingRemoteModel(BaseModel<?> pricingRemoteModel) {
		_pricingRemoteModel = pricingRemoteModel;
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

		Class<?> remoteModelClass = _pricingRemoteModel.getClass();

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

		Object returnValue = method.invoke(_pricingRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PricingLocalServiceUtil.addPricing(this);
		}
		else {
			PricingLocalServiceUtil.updatePricing(this);
		}
	}

	@Override
	public Pricing toEscapedModel() {
		return (Pricing)ProxyUtil.newProxyInstance(Pricing.class.getClassLoader(),
			new Class[] { Pricing.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PricingClp clone = new PricingClp();

		clone.setPricingId(getPricingId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setLocationId(getLocationId());
		clone.setCourseId(getCourseId());
		clone.setPackageId(getPackageId());
		clone.setDeposit(getDeposit());
		clone.setPrice(getPrice());
		clone.setCurrency(getCurrency());
		clone.setEffectiveFromDate(getEffectiveFromDate());
		clone.setCourseCode(getCourseCode());
		clone.setLocationCode(getLocationCode());
		clone.setEffectiveToDate(getEffectiveToDate());
		clone.setActive(getActive());
		clone.setBalanceDueParDate(getBalanceDueParDate());

		return clone;
	}

	@Override
	public int compareTo(Pricing pricing) {
		long primaryKey = pricing.getPrimaryKey();

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

		if (!(obj instanceof PricingClp)) {
			return false;
		}

		PricingClp pricing = (PricingClp)obj;

		long primaryKey = pricing.getPrimaryKey();

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
		StringBundler sb = new StringBundler(39);

		sb.append("{pricingId=");
		sb.append(getPricingId());
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
		sb.append(", locationId=");
		sb.append(getLocationId());
		sb.append(", courseId=");
		sb.append(getCourseId());
		sb.append(", packageId=");
		sb.append(getPackageId());
		sb.append(", deposit=");
		sb.append(getDeposit());
		sb.append(", price=");
		sb.append(getPrice());
		sb.append(", currency=");
		sb.append(getCurrency());
		sb.append(", effectiveFromDate=");
		sb.append(getEffectiveFromDate());
		sb.append(", courseCode=");
		sb.append(getCourseCode());
		sb.append(", locationCode=");
		sb.append(getLocationCode());
		sb.append(", effectiveToDate=");
		sb.append(getEffectiveToDate());
		sb.append(", active=");
		sb.append(getActive());
		sb.append(", balanceDueParDate=");
		sb.append(getBalanceDueParDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(61);

		sb.append("<model><model-name>");
		sb.append("com.ocms.course.model.Pricing");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>pricingId</column-name><column-value><![CDATA[");
		sb.append(getPricingId());
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
			"<column><column-name>locationId</column-name><column-value><![CDATA[");
		sb.append(getLocationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>courseId</column-name><column-value><![CDATA[");
		sb.append(getCourseId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>packageId</column-name><column-value><![CDATA[");
		sb.append(getPackageId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>deposit</column-name><column-value><![CDATA[");
		sb.append(getDeposit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>price</column-name><column-value><![CDATA[");
		sb.append(getPrice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currency</column-name><column-value><![CDATA[");
		sb.append(getCurrency());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>effectiveFromDate</column-name><column-value><![CDATA[");
		sb.append(getEffectiveFromDate());
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
			"<column><column-name>effectiveToDate</column-name><column-value><![CDATA[");
		sb.append(getEffectiveToDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>active</column-name><column-value><![CDATA[");
		sb.append(getActive());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>balanceDueParDate</column-name><column-value><![CDATA[");
		sb.append(getBalanceDueParDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _pricingId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _locationId;
	private int _courseId;
	private int _packageId;
	private int _deposit;
	private int _price;
	private String _currency;
	private Date _effectiveFromDate;
	private String _courseCode;
	private String _locationCode;
	private Date _effectiveToDate;
	private int _active;
	private int _balanceDueParDate;
	private BaseModel<?> _pricingRemoteModel;
}