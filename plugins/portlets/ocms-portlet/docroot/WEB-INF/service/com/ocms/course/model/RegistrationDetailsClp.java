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
import com.ocms.course.service.RegistrationDetailsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author doraraj
 */
public class RegistrationDetailsClp extends BaseModelImpl<RegistrationDetails>
	implements RegistrationDetails {
	public RegistrationDetailsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return RegistrationDetails.class;
	}

	@Override
	public String getModelClassName() {
		return RegistrationDetails.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _registrationDetailsId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRegistrationDetailsId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _registrationDetailsId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("studRegId", getStudRegId());
		attributes.put("contactId", getContactId());
		attributes.put("eventId", getEventId());
		attributes.put("price", getPrice());
		attributes.put("discount", getDiscount());
		attributes.put("fee", getFee());
		attributes.put("credit", getCredit());
		attributes.put("registrationDetailsId", getRegistrationDetailsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long studRegId = (Long)attributes.get("studRegId");

		if (studRegId != null) {
			setStudRegId(studRegId);
		}

		Long contactId = (Long)attributes.get("contactId");

		if (contactId != null) {
			setContactId(contactId);
		}

		Long eventId = (Long)attributes.get("eventId");

		if (eventId != null) {
			setEventId(eventId);
		}

		Double price = (Double)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}

		Double discount = (Double)attributes.get("discount");

		if (discount != null) {
			setDiscount(discount);
		}

		Double fee = (Double)attributes.get("fee");

		if (fee != null) {
			setFee(fee);
		}

		Double credit = (Double)attributes.get("credit");

		if (credit != null) {
			setCredit(credit);
		}

		Long registrationDetailsId = (Long)attributes.get(
				"registrationDetailsId");

		if (registrationDetailsId != null) {
			setRegistrationDetailsId(registrationDetailsId);
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
	}

	@Override
	public long getStudRegId() {
		return _studRegId;
	}

	@Override
	public void setStudRegId(long studRegId) {
		_studRegId = studRegId;

		if (_registrationDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _registrationDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setStudRegId", long.class);

				method.invoke(_registrationDetailsRemoteModel, studRegId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getContactId() {
		return _contactId;
	}

	@Override
	public void setContactId(long contactId) {
		_contactId = contactId;

		if (_registrationDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _registrationDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setContactId", long.class);

				method.invoke(_registrationDetailsRemoteModel, contactId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEventId() {
		return _eventId;
	}

	@Override
	public void setEventId(long eventId) {
		_eventId = eventId;

		if (_registrationDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _registrationDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setEventId", long.class);

				method.invoke(_registrationDetailsRemoteModel, eventId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getPrice() {
		return _price;
	}

	@Override
	public void setPrice(double price) {
		_price = price;

		if (_registrationDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _registrationDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setPrice", double.class);

				method.invoke(_registrationDetailsRemoteModel, price);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getDiscount() {
		return _discount;
	}

	@Override
	public void setDiscount(double discount) {
		_discount = discount;

		if (_registrationDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _registrationDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setDiscount", double.class);

				method.invoke(_registrationDetailsRemoteModel, discount);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getFee() {
		return _fee;
	}

	@Override
	public void setFee(double fee) {
		_fee = fee;

		if (_registrationDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _registrationDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setFee", double.class);

				method.invoke(_registrationDetailsRemoteModel, fee);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getCredit() {
		return _credit;
	}

	@Override
	public void setCredit(double credit) {
		_credit = credit;

		if (_registrationDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _registrationDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCredit", double.class);

				method.invoke(_registrationDetailsRemoteModel, credit);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRegistrationDetailsId() {
		return _registrationDetailsId;
	}

	@Override
	public void setRegistrationDetailsId(long registrationDetailsId) {
		_registrationDetailsId = registrationDetailsId;

		if (_registrationDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _registrationDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setRegistrationDetailsId",
						long.class);

				method.invoke(_registrationDetailsRemoteModel,
					registrationDetailsId);
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

		if (_registrationDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _registrationDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_registrationDetailsRemoteModel, groupId);
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

		if (_registrationDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _registrationDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_registrationDetailsRemoteModel, companyId);
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

		if (_registrationDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _registrationDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_registrationDetailsRemoteModel, userId);
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

		if (_registrationDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _registrationDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_registrationDetailsRemoteModel, userName);
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

		if (_registrationDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _registrationDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_registrationDetailsRemoteModel, createDate);
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

		if (_registrationDetailsRemoteModel != null) {
			try {
				Class<?> clazz = _registrationDetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_registrationDetailsRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getRegistrationDetailsRemoteModel() {
		return _registrationDetailsRemoteModel;
	}

	public void setRegistrationDetailsRemoteModel(
		BaseModel<?> registrationDetailsRemoteModel) {
		_registrationDetailsRemoteModel = registrationDetailsRemoteModel;
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

		Class<?> remoteModelClass = _registrationDetailsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_registrationDetailsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			RegistrationDetailsLocalServiceUtil.addRegistrationDetails(this);
		}
		else {
			RegistrationDetailsLocalServiceUtil.updateRegistrationDetails(this);
		}
	}

	@Override
	public RegistrationDetails toEscapedModel() {
		return (RegistrationDetails)ProxyUtil.newProxyInstance(RegistrationDetails.class.getClassLoader(),
			new Class[] { RegistrationDetails.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		RegistrationDetailsClp clone = new RegistrationDetailsClp();

		clone.setStudRegId(getStudRegId());
		clone.setContactId(getContactId());
		clone.setEventId(getEventId());
		clone.setPrice(getPrice());
		clone.setDiscount(getDiscount());
		clone.setFee(getFee());
		clone.setCredit(getCredit());
		clone.setRegistrationDetailsId(getRegistrationDetailsId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(RegistrationDetails registrationDetails) {
		long primaryKey = registrationDetails.getPrimaryKey();

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

		if (!(obj instanceof RegistrationDetailsClp)) {
			return false;
		}

		RegistrationDetailsClp registrationDetails = (RegistrationDetailsClp)obj;

		long primaryKey = registrationDetails.getPrimaryKey();

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
		StringBundler sb = new StringBundler(29);

		sb.append("{studRegId=");
		sb.append(getStudRegId());
		sb.append(", contactId=");
		sb.append(getContactId());
		sb.append(", eventId=");
		sb.append(getEventId());
		sb.append(", price=");
		sb.append(getPrice());
		sb.append(", discount=");
		sb.append(getDiscount());
		sb.append(", fee=");
		sb.append(getFee());
		sb.append(", credit=");
		sb.append(getCredit());
		sb.append(", registrationDetailsId=");
		sb.append(getRegistrationDetailsId());
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.ocms.course.model.RegistrationDetails");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>studRegId</column-name><column-value><![CDATA[");
		sb.append(getStudRegId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactId</column-name><column-value><![CDATA[");
		sb.append(getContactId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eventId</column-name><column-value><![CDATA[");
		sb.append(getEventId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>price</column-name><column-value><![CDATA[");
		sb.append(getPrice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>discount</column-name><column-value><![CDATA[");
		sb.append(getDiscount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fee</column-name><column-value><![CDATA[");
		sb.append(getFee());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>credit</column-name><column-value><![CDATA[");
		sb.append(getCredit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registrationDetailsId</column-name><column-value><![CDATA[");
		sb.append(getRegistrationDetailsId());
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

		sb.append("</model>");

		return sb.toString();
	}

	private long _studRegId;
	private long _contactId;
	private long _eventId;
	private double _price;
	private double _discount;
	private double _fee;
	private double _credit;
	private long _registrationDetailsId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private BaseModel<?> _registrationDetailsRemoteModel;
}