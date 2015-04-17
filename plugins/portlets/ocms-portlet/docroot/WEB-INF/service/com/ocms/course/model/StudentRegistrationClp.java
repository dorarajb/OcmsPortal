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
import com.ocms.course.service.StudentRegistrationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author doraraj
 */
public class StudentRegistrationClp extends BaseModelImpl<StudentRegistration>
	implements StudentRegistration {
	public StudentRegistrationClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return StudentRegistration.class;
	}

	@Override
	public String getModelClassName() {
		return StudentRegistration.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _studRegId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setStudRegId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _studRegId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("studRegId", getStudRegId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("memo", getMemo());
		attributes.put("studRegStatus", getStudRegStatus());
		attributes.put("advisorOrig", getAdvisorOrig());
		attributes.put("advisorReg", getAdvisorReg());
		attributes.put("coursePackageId", getCoursePackageId());
		attributes.put("discountId", getDiscountId());
		attributes.put("commMethod", getCommMethod());
		attributes.put("notes", getNotes());
		attributes.put("currency", getCurrency());
		attributes.put("tax", getTax());
		attributes.put("autoCharge", getAutoCharge());
		attributes.put("currencyPaid", getCurrencyPaid());
		attributes.put("exchangeRate", getExchangeRate());
		attributes.put("contactId", getContactId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long studRegId = (Long)attributes.get("studRegId");

		if (studRegId != null) {
			setStudRegId(studRegId);
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

		String memo = (String)attributes.get("memo");

		if (memo != null) {
			setMemo(memo);
		}

		String studRegStatus = (String)attributes.get("studRegStatus");

		if (studRegStatus != null) {
			setStudRegStatus(studRegStatus);
		}

		String advisorOrig = (String)attributes.get("advisorOrig");

		if (advisorOrig != null) {
			setAdvisorOrig(advisorOrig);
		}

		String advisorReg = (String)attributes.get("advisorReg");

		if (advisorReg != null) {
			setAdvisorReg(advisorReg);
		}

		Long coursePackageId = (Long)attributes.get("coursePackageId");

		if (coursePackageId != null) {
			setCoursePackageId(coursePackageId);
		}

		Long discountId = (Long)attributes.get("discountId");

		if (discountId != null) {
			setDiscountId(discountId);
		}

		String commMethod = (String)attributes.get("commMethod");

		if (commMethod != null) {
			setCommMethod(commMethod);
		}

		String notes = (String)attributes.get("notes");

		if (notes != null) {
			setNotes(notes);
		}

		String currency = (String)attributes.get("currency");

		if (currency != null) {
			setCurrency(currency);
		}

		Long tax = (Long)attributes.get("tax");

		if (tax != null) {
			setTax(tax);
		}

		String autoCharge = (String)attributes.get("autoCharge");

		if (autoCharge != null) {
			setAutoCharge(autoCharge);
		}

		String currencyPaid = (String)attributes.get("currencyPaid");

		if (currencyPaid != null) {
			setCurrencyPaid(currencyPaid);
		}

		Long exchangeRate = (Long)attributes.get("exchangeRate");

		if (exchangeRate != null) {
			setExchangeRate(exchangeRate);
		}

		Long contactId = (Long)attributes.get("contactId");

		if (contactId != null) {
			setContactId(contactId);
		}
	}

	@Override
	public long getStudRegId() {
		return _studRegId;
	}

	@Override
	public void setStudRegId(long studRegId) {
		_studRegId = studRegId;

		if (_studentRegistrationRemoteModel != null) {
			try {
				Class<?> clazz = _studentRegistrationRemoteModel.getClass();

				Method method = clazz.getMethod("setStudRegId", long.class);

				method.invoke(_studentRegistrationRemoteModel, studRegId);
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

		if (_studentRegistrationRemoteModel != null) {
			try {
				Class<?> clazz = _studentRegistrationRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_studentRegistrationRemoteModel, groupId);
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

		if (_studentRegistrationRemoteModel != null) {
			try {
				Class<?> clazz = _studentRegistrationRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_studentRegistrationRemoteModel, companyId);
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

		if (_studentRegistrationRemoteModel != null) {
			try {
				Class<?> clazz = _studentRegistrationRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_studentRegistrationRemoteModel, userId);
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

		if (_studentRegistrationRemoteModel != null) {
			try {
				Class<?> clazz = _studentRegistrationRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_studentRegistrationRemoteModel, userName);
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

		if (_studentRegistrationRemoteModel != null) {
			try {
				Class<?> clazz = _studentRegistrationRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_studentRegistrationRemoteModel, createDate);
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

		if (_studentRegistrationRemoteModel != null) {
			try {
				Class<?> clazz = _studentRegistrationRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_studentRegistrationRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMemo() {
		return _memo;
	}

	@Override
	public void setMemo(String memo) {
		_memo = memo;

		if (_studentRegistrationRemoteModel != null) {
			try {
				Class<?> clazz = _studentRegistrationRemoteModel.getClass();

				Method method = clazz.getMethod("setMemo", String.class);

				method.invoke(_studentRegistrationRemoteModel, memo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStudRegStatus() {
		return _studRegStatus;
	}

	@Override
	public void setStudRegStatus(String studRegStatus) {
		_studRegStatus = studRegStatus;

		if (_studentRegistrationRemoteModel != null) {
			try {
				Class<?> clazz = _studentRegistrationRemoteModel.getClass();

				Method method = clazz.getMethod("setStudRegStatus", String.class);

				method.invoke(_studentRegistrationRemoteModel, studRegStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAdvisorOrig() {
		return _advisorOrig;
	}

	@Override
	public void setAdvisorOrig(String advisorOrig) {
		_advisorOrig = advisorOrig;

		if (_studentRegistrationRemoteModel != null) {
			try {
				Class<?> clazz = _studentRegistrationRemoteModel.getClass();

				Method method = clazz.getMethod("setAdvisorOrig", String.class);

				method.invoke(_studentRegistrationRemoteModel, advisorOrig);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAdvisorReg() {
		return _advisorReg;
	}

	@Override
	public void setAdvisorReg(String advisorReg) {
		_advisorReg = advisorReg;

		if (_studentRegistrationRemoteModel != null) {
			try {
				Class<?> clazz = _studentRegistrationRemoteModel.getClass();

				Method method = clazz.getMethod("setAdvisorReg", String.class);

				method.invoke(_studentRegistrationRemoteModel, advisorReg);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCoursePackageId() {
		return _coursePackageId;
	}

	@Override
	public void setCoursePackageId(long coursePackageId) {
		_coursePackageId = coursePackageId;

		if (_studentRegistrationRemoteModel != null) {
			try {
				Class<?> clazz = _studentRegistrationRemoteModel.getClass();

				Method method = clazz.getMethod("setCoursePackageId", long.class);

				method.invoke(_studentRegistrationRemoteModel, coursePackageId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDiscountId() {
		return _discountId;
	}

	@Override
	public void setDiscountId(long discountId) {
		_discountId = discountId;

		if (_studentRegistrationRemoteModel != null) {
			try {
				Class<?> clazz = _studentRegistrationRemoteModel.getClass();

				Method method = clazz.getMethod("setDiscountId", long.class);

				method.invoke(_studentRegistrationRemoteModel, discountId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCommMethod() {
		return _commMethod;
	}

	@Override
	public void setCommMethod(String commMethod) {
		_commMethod = commMethod;

		if (_studentRegistrationRemoteModel != null) {
			try {
				Class<?> clazz = _studentRegistrationRemoteModel.getClass();

				Method method = clazz.getMethod("setCommMethod", String.class);

				method.invoke(_studentRegistrationRemoteModel, commMethod);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNotes() {
		return _notes;
	}

	@Override
	public void setNotes(String notes) {
		_notes = notes;

		if (_studentRegistrationRemoteModel != null) {
			try {
				Class<?> clazz = _studentRegistrationRemoteModel.getClass();

				Method method = clazz.getMethod("setNotes", String.class);

				method.invoke(_studentRegistrationRemoteModel, notes);
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

		if (_studentRegistrationRemoteModel != null) {
			try {
				Class<?> clazz = _studentRegistrationRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrency", String.class);

				method.invoke(_studentRegistrationRemoteModel, currency);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTax() {
		return _tax;
	}

	@Override
	public void setTax(long tax) {
		_tax = tax;

		if (_studentRegistrationRemoteModel != null) {
			try {
				Class<?> clazz = _studentRegistrationRemoteModel.getClass();

				Method method = clazz.getMethod("setTax", long.class);

				method.invoke(_studentRegistrationRemoteModel, tax);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAutoCharge() {
		return _autoCharge;
	}

	@Override
	public void setAutoCharge(String autoCharge) {
		_autoCharge = autoCharge;

		if (_studentRegistrationRemoteModel != null) {
			try {
				Class<?> clazz = _studentRegistrationRemoteModel.getClass();

				Method method = clazz.getMethod("setAutoCharge", String.class);

				method.invoke(_studentRegistrationRemoteModel, autoCharge);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCurrencyPaid() {
		return _currencyPaid;
	}

	@Override
	public void setCurrencyPaid(String currencyPaid) {
		_currencyPaid = currencyPaid;

		if (_studentRegistrationRemoteModel != null) {
			try {
				Class<?> clazz = _studentRegistrationRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrencyPaid", String.class);

				method.invoke(_studentRegistrationRemoteModel, currencyPaid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getExchangeRate() {
		return _exchangeRate;
	}

	@Override
	public void setExchangeRate(long exchangeRate) {
		_exchangeRate = exchangeRate;

		if (_studentRegistrationRemoteModel != null) {
			try {
				Class<?> clazz = _studentRegistrationRemoteModel.getClass();

				Method method = clazz.getMethod("setExchangeRate", long.class);

				method.invoke(_studentRegistrationRemoteModel, exchangeRate);
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

		if (_studentRegistrationRemoteModel != null) {
			try {
				Class<?> clazz = _studentRegistrationRemoteModel.getClass();

				Method method = clazz.getMethod("setContactId", long.class);

				method.invoke(_studentRegistrationRemoteModel, contactId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getStudentRegistrationRemoteModel() {
		return _studentRegistrationRemoteModel;
	}

	public void setStudentRegistrationRemoteModel(
		BaseModel<?> studentRegistrationRemoteModel) {
		_studentRegistrationRemoteModel = studentRegistrationRemoteModel;
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

		Class<?> remoteModelClass = _studentRegistrationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_studentRegistrationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			StudentRegistrationLocalServiceUtil.addStudentRegistration(this);
		}
		else {
			StudentRegistrationLocalServiceUtil.updateStudentRegistration(this);
		}
	}

	@Override
	public StudentRegistration toEscapedModel() {
		return (StudentRegistration)ProxyUtil.newProxyInstance(StudentRegistration.class.getClassLoader(),
			new Class[] { StudentRegistration.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		StudentRegistrationClp clone = new StudentRegistrationClp();

		clone.setStudRegId(getStudRegId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setMemo(getMemo());
		clone.setStudRegStatus(getStudRegStatus());
		clone.setAdvisorOrig(getAdvisorOrig());
		clone.setAdvisorReg(getAdvisorReg());
		clone.setCoursePackageId(getCoursePackageId());
		clone.setDiscountId(getDiscountId());
		clone.setCommMethod(getCommMethod());
		clone.setNotes(getNotes());
		clone.setCurrency(getCurrency());
		clone.setTax(getTax());
		clone.setAutoCharge(getAutoCharge());
		clone.setCurrencyPaid(getCurrencyPaid());
		clone.setExchangeRate(getExchangeRate());
		clone.setContactId(getContactId());

		return clone;
	}

	@Override
	public int compareTo(StudentRegistration studentRegistration) {
		long primaryKey = studentRegistration.getPrimaryKey();

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

		if (!(obj instanceof StudentRegistrationClp)) {
			return false;
		}

		StudentRegistrationClp studentRegistration = (StudentRegistrationClp)obj;

		long primaryKey = studentRegistration.getPrimaryKey();

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
		StringBundler sb = new StringBundler(43);

		sb.append("{studRegId=");
		sb.append(getStudRegId());
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
		sb.append(", memo=");
		sb.append(getMemo());
		sb.append(", studRegStatus=");
		sb.append(getStudRegStatus());
		sb.append(", advisorOrig=");
		sb.append(getAdvisorOrig());
		sb.append(", advisorReg=");
		sb.append(getAdvisorReg());
		sb.append(", coursePackageId=");
		sb.append(getCoursePackageId());
		sb.append(", discountId=");
		sb.append(getDiscountId());
		sb.append(", commMethod=");
		sb.append(getCommMethod());
		sb.append(", notes=");
		sb.append(getNotes());
		sb.append(", currency=");
		sb.append(getCurrency());
		sb.append(", tax=");
		sb.append(getTax());
		sb.append(", autoCharge=");
		sb.append(getAutoCharge());
		sb.append(", currencyPaid=");
		sb.append(getCurrencyPaid());
		sb.append(", exchangeRate=");
		sb.append(getExchangeRate());
		sb.append(", contactId=");
		sb.append(getContactId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(67);

		sb.append("<model><model-name>");
		sb.append("com.ocms.course.model.StudentRegistration");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>studRegId</column-name><column-value><![CDATA[");
		sb.append(getStudRegId());
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
			"<column><column-name>memo</column-name><column-value><![CDATA[");
		sb.append(getMemo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>studRegStatus</column-name><column-value><![CDATA[");
		sb.append(getStudRegStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>advisorOrig</column-name><column-value><![CDATA[");
		sb.append(getAdvisorOrig());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>advisorReg</column-name><column-value><![CDATA[");
		sb.append(getAdvisorReg());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>coursePackageId</column-name><column-value><![CDATA[");
		sb.append(getCoursePackageId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>discountId</column-name><column-value><![CDATA[");
		sb.append(getDiscountId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>commMethod</column-name><column-value><![CDATA[");
		sb.append(getCommMethod());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>notes</column-name><column-value><![CDATA[");
		sb.append(getNotes());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currency</column-name><column-value><![CDATA[");
		sb.append(getCurrency());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tax</column-name><column-value><![CDATA[");
		sb.append(getTax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>autoCharge</column-name><column-value><![CDATA[");
		sb.append(getAutoCharge());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currencyPaid</column-name><column-value><![CDATA[");
		sb.append(getCurrencyPaid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>exchangeRate</column-name><column-value><![CDATA[");
		sb.append(getExchangeRate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactId</column-name><column-value><![CDATA[");
		sb.append(getContactId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _studRegId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _memo;
	private String _studRegStatus;
	private String _advisorOrig;
	private String _advisorReg;
	private long _coursePackageId;
	private long _discountId;
	private String _commMethod;
	private String _notes;
	private String _currency;
	private long _tax;
	private String _autoCharge;
	private String _currencyPaid;
	private long _exchangeRate;
	private long _contactId;
	private BaseModel<?> _studentRegistrationRemoteModel;
}