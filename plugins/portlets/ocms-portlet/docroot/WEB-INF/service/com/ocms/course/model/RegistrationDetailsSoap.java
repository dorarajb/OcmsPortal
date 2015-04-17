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
 * This class is used by SOAP remote services, specifically {@link com.ocms.course.service.http.RegistrationDetailsServiceSoap}.
 *
 * @author doraraj
 * @see com.ocms.course.service.http.RegistrationDetailsServiceSoap
 * @generated
 */
public class RegistrationDetailsSoap implements Serializable {
	public static RegistrationDetailsSoap toSoapModel(RegistrationDetails model) {
		RegistrationDetailsSoap soapModel = new RegistrationDetailsSoap();

		soapModel.setStudRegId(model.getStudRegId());
		soapModel.setContactId(model.getContactId());
		soapModel.setEventId(model.getEventId());
		soapModel.setPrice(model.getPrice());
		soapModel.setDiscount(model.getDiscount());
		soapModel.setFee(model.getFee());
		soapModel.setCredit(model.getCredit());
		soapModel.setRegistrationDetailsId(model.getRegistrationDetailsId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static RegistrationDetailsSoap[] toSoapModels(
		RegistrationDetails[] models) {
		RegistrationDetailsSoap[] soapModels = new RegistrationDetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RegistrationDetailsSoap[][] toSoapModels(
		RegistrationDetails[][] models) {
		RegistrationDetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RegistrationDetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RegistrationDetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RegistrationDetailsSoap[] toSoapModels(
		List<RegistrationDetails> models) {
		List<RegistrationDetailsSoap> soapModels = new ArrayList<RegistrationDetailsSoap>(models.size());

		for (RegistrationDetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RegistrationDetailsSoap[soapModels.size()]);
	}

	public RegistrationDetailsSoap() {
	}

	public long getPrimaryKey() {
		return _registrationDetailsId;
	}

	public void setPrimaryKey(long pk) {
		setRegistrationDetailsId(pk);
	}

	public long getStudRegId() {
		return _studRegId;
	}

	public void setStudRegId(long studRegId) {
		_studRegId = studRegId;
	}

	public long getContactId() {
		return _contactId;
	}

	public void setContactId(long contactId) {
		_contactId = contactId;
	}

	public long getEventId() {
		return _eventId;
	}

	public void setEventId(long eventId) {
		_eventId = eventId;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double price) {
		_price = price;
	}

	public double getDiscount() {
		return _discount;
	}

	public void setDiscount(double discount) {
		_discount = discount;
	}

	public double getFee() {
		return _fee;
	}

	public void setFee(double fee) {
		_fee = fee;
	}

	public double getCredit() {
		return _credit;
	}

	public void setCredit(double credit) {
		_credit = credit;
	}

	public long getRegistrationDetailsId() {
		return _registrationDetailsId;
	}

	public void setRegistrationDetailsId(long registrationDetailsId) {
		_registrationDetailsId = registrationDetailsId;
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
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
}