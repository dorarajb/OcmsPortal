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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.ocms.course.service.http.StudentRegistrationServiceSoap}.
 *
 * @author doraraj
 * @see com.ocms.course.service.http.StudentRegistrationServiceSoap
 * @generated
 */
public class StudentRegistrationSoap implements Serializable {
	public static StudentRegistrationSoap toSoapModel(StudentRegistration model) {
		StudentRegistrationSoap soapModel = new StudentRegistrationSoap();

		soapModel.setStudRegId(model.getStudRegId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setMemo(model.getMemo());
		soapModel.setStudRegStatus(model.getStudRegStatus());
		soapModel.setAdvisorOrig(model.getAdvisorOrig());
		soapModel.setAdvisorReg(model.getAdvisorReg());
		soapModel.setCoursePackageId(model.getCoursePackageId());
		soapModel.setDiscountId(model.getDiscountId());
		soapModel.setCommMethod(model.getCommMethod());
		soapModel.setNotes(model.getNotes());
		soapModel.setCurrency(model.getCurrency());
		soapModel.setTax(model.getTax());
		soapModel.setAutoCharge(model.getAutoCharge());
		soapModel.setCurrencyPaid(model.getCurrencyPaid());
		soapModel.setExchangeRate(model.getExchangeRate());
		soapModel.setContactId(model.getContactId());

		return soapModel;
	}

	public static StudentRegistrationSoap[] toSoapModels(
		StudentRegistration[] models) {
		StudentRegistrationSoap[] soapModels = new StudentRegistrationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static StudentRegistrationSoap[][] toSoapModels(
		StudentRegistration[][] models) {
		StudentRegistrationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new StudentRegistrationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new StudentRegistrationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static StudentRegistrationSoap[] toSoapModels(
		List<StudentRegistration> models) {
		List<StudentRegistrationSoap> soapModels = new ArrayList<StudentRegistrationSoap>(models.size());

		for (StudentRegistration model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new StudentRegistrationSoap[soapModels.size()]);
	}

	public StudentRegistrationSoap() {
	}

	public long getPrimaryKey() {
		return _studRegId;
	}

	public void setPrimaryKey(long pk) {
		setStudRegId(pk);
	}

	public long getStudRegId() {
		return _studRegId;
	}

	public void setStudRegId(long studRegId) {
		_studRegId = studRegId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getMemo() {
		return _memo;
	}

	public void setMemo(String memo) {
		_memo = memo;
	}

	public String getStudRegStatus() {
		return _studRegStatus;
	}

	public void setStudRegStatus(String studRegStatus) {
		_studRegStatus = studRegStatus;
	}

	public String getAdvisorOrig() {
		return _advisorOrig;
	}

	public void setAdvisorOrig(String advisorOrig) {
		_advisorOrig = advisorOrig;
	}

	public String getAdvisorReg() {
		return _advisorReg;
	}

	public void setAdvisorReg(String advisorReg) {
		_advisorReg = advisorReg;
	}

	public long getCoursePackageId() {
		return _coursePackageId;
	}

	public void setCoursePackageId(long coursePackageId) {
		_coursePackageId = coursePackageId;
	}

	public long getDiscountId() {
		return _discountId;
	}

	public void setDiscountId(long discountId) {
		_discountId = discountId;
	}

	public String getCommMethod() {
		return _commMethod;
	}

	public void setCommMethod(String commMethod) {
		_commMethod = commMethod;
	}

	public String getNotes() {
		return _notes;
	}

	public void setNotes(String notes) {
		_notes = notes;
	}

	public String getCurrency() {
		return _currency;
	}

	public void setCurrency(String currency) {
		_currency = currency;
	}

	public long getTax() {
		return _tax;
	}

	public void setTax(long tax) {
		_tax = tax;
	}

	public String getAutoCharge() {
		return _autoCharge;
	}

	public void setAutoCharge(String autoCharge) {
		_autoCharge = autoCharge;
	}

	public String getCurrencyPaid() {
		return _currencyPaid;
	}

	public void setCurrencyPaid(String currencyPaid) {
		_currencyPaid = currencyPaid;
	}

	public long getExchangeRate() {
		return _exchangeRate;
	}

	public void setExchangeRate(long exchangeRate) {
		_exchangeRate = exchangeRate;
	}

	public long getContactId() {
		return _contactId;
	}

	public void setContactId(long contactId) {
		_contactId = contactId;
	}

	private long _studRegId;
	private long _groupId;
	private long _companyId;
	private long _userId;
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
}