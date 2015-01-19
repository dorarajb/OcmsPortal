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
 * This class is used by SOAP remote services, specifically {@link com.ocms.course.service.http.ContactServiceSoap}.
 *
 * @author doraraj
 * @see com.ocms.course.service.http.ContactServiceSoap
 * @generated
 */
public class ContactSoap implements Serializable {
	public static ContactSoap toSoapModel(Contact model) {
		ContactSoap soapModel = new ContactSoap();

		soapModel.setContactId(model.getContactId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setContactType(model.getContactType());
		soapModel.setContactName(model.getContactName());
		soapModel.setAddressLine1(model.getAddressLine1());
		soapModel.setAddressLine2(model.getAddressLine2());
		soapModel.setCity(model.getCity());
		soapModel.setState(model.getState());
		soapModel.setRegion(model.getRegion());
		soapModel.setZip(model.getZip());
		soapModel.setPhone(model.getPhone());
		soapModel.setFax(model.getFax());
		soapModel.setEmail(model.getEmail());

		return soapModel;
	}

	public static ContactSoap[] toSoapModels(Contact[] models) {
		ContactSoap[] soapModels = new ContactSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ContactSoap[][] toSoapModels(Contact[][] models) {
		ContactSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ContactSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ContactSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ContactSoap[] toSoapModels(List<Contact> models) {
		List<ContactSoap> soapModels = new ArrayList<ContactSoap>(models.size());

		for (Contact model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ContactSoap[soapModels.size()]);
	}

	public ContactSoap() {
	}

	public long getPrimaryKey() {
		return _contactId;
	}

	public void setPrimaryKey(long pk) {
		setContactId(pk);
	}

	public long getContactId() {
		return _contactId;
	}

	public void setContactId(long contactId) {
		_contactId = contactId;
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

	public String getContactType() {
		return _contactType;
	}

	public void setContactType(String contactType) {
		_contactType = contactType;
	}

	public String getContactName() {
		return _contactName;
	}

	public void setContactName(String contactName) {
		_contactName = contactName;
	}

	public String getAddressLine1() {
		return _addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		_addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return _addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		_addressLine2 = addressLine2;
	}

	public String getCity() {
		return _city;
	}

	public void setCity(String city) {
		_city = city;
	}

	public String getState() {
		return _state;
	}

	public void setState(String state) {
		_state = state;
	}

	public String getRegion() {
		return _region;
	}

	public void setRegion(String region) {
		_region = region;
	}

	public String getZip() {
		return _zip;
	}

	public void setZip(String zip) {
		_zip = zip;
	}

	public String getPhone() {
		return _phone;
	}

	public void setPhone(String phone) {
		_phone = phone;
	}

	public String getFax() {
		return _fax;
	}

	public void setFax(String fax) {
		_fax = fax;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	private long _contactId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _contactType;
	private String _contactName;
	private String _addressLine1;
	private String _addressLine2;
	private String _city;
	private String _state;
	private String _region;
	private String _zip;
	private String _phone;
	private String _fax;
	private String _email;
}