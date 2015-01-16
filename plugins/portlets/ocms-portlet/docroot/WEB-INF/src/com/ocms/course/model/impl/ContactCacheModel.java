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

package com.ocms.course.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.ocms.course.model.Contact;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Contact in entity cache.
 *
 * @author doraraj
 * @see Contact
 * @generated
 */
public class ContactCacheModel implements CacheModel<Contact>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{contactId=");
		sb.append(contactId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", contactType=");
		sb.append(contactType);
		sb.append(", contactName=");
		sb.append(contactName);
		sb.append(", addressLine1=");
		sb.append(addressLine1);
		sb.append(", addressLine2=");
		sb.append(addressLine2);
		sb.append(", city=");
		sb.append(city);
		sb.append(", state=");
		sb.append(state);
		sb.append(", region=");
		sb.append(region);
		sb.append(", zip=");
		sb.append(zip);
		sb.append(", phone=");
		sb.append(phone);
		sb.append(", fax=");
		sb.append(fax);
		sb.append(", email=");
		sb.append(email);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Contact toEntityModel() {
		ContactImpl contactImpl = new ContactImpl();

		contactImpl.setContactId(contactId);
		contactImpl.setGroupId(groupId);
		contactImpl.setCompanyId(companyId);
		contactImpl.setUserId(userId);

		if (userName == null) {
			contactImpl.setUserName(StringPool.BLANK);
		}
		else {
			contactImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			contactImpl.setCreateDate(null);
		}
		else {
			contactImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			contactImpl.setModifiedDate(null);
		}
		else {
			contactImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (contactType == null) {
			contactImpl.setContactType(StringPool.BLANK);
		}
		else {
			contactImpl.setContactType(contactType);
		}

		if (contactName == null) {
			contactImpl.setContactName(StringPool.BLANK);
		}
		else {
			contactImpl.setContactName(contactName);
		}

		if (addressLine1 == null) {
			contactImpl.setAddressLine1(StringPool.BLANK);
		}
		else {
			contactImpl.setAddressLine1(addressLine1);
		}

		if (addressLine2 == null) {
			contactImpl.setAddressLine2(StringPool.BLANK);
		}
		else {
			contactImpl.setAddressLine2(addressLine2);
		}

		if (city == null) {
			contactImpl.setCity(StringPool.BLANK);
		}
		else {
			contactImpl.setCity(city);
		}

		if (state == null) {
			contactImpl.setState(StringPool.BLANK);
		}
		else {
			contactImpl.setState(state);
		}

		if (region == null) {
			contactImpl.setRegion(StringPool.BLANK);
		}
		else {
			contactImpl.setRegion(region);
		}

		if (zip == null) {
			contactImpl.setZip(StringPool.BLANK);
		}
		else {
			contactImpl.setZip(zip);
		}

		if (phone == null) {
			contactImpl.setPhone(StringPool.BLANK);
		}
		else {
			contactImpl.setPhone(phone);
		}

		if (fax == null) {
			contactImpl.setFax(StringPool.BLANK);
		}
		else {
			contactImpl.setFax(fax);
		}

		if (email == null) {
			contactImpl.setEmail(StringPool.BLANK);
		}
		else {
			contactImpl.setEmail(email);
		}

		contactImpl.resetOriginalValues();

		return contactImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		contactId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		contactType = objectInput.readUTF();
		contactName = objectInput.readUTF();
		addressLine1 = objectInput.readUTF();
		addressLine2 = objectInput.readUTF();
		city = objectInput.readUTF();
		state = objectInput.readUTF();
		region = objectInput.readUTF();
		zip = objectInput.readUTF();
		phone = objectInput.readUTF();
		fax = objectInput.readUTF();
		email = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(contactId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (contactType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contactType);
		}

		if (contactName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contactName);
		}

		if (addressLine1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(addressLine1);
		}

		if (addressLine2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(addressLine2);
		}

		if (city == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(city);
		}

		if (state == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(state);
		}

		if (region == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(region);
		}

		if (zip == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(zip);
		}

		if (phone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(phone);
		}

		if (fax == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fax);
		}

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}
	}

	public long contactId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String contactType;
	public String contactName;
	public String addressLine1;
	public String addressLine2;
	public String city;
	public String state;
	public String region;
	public String zip;
	public String phone;
	public String fax;
	public String email;
}