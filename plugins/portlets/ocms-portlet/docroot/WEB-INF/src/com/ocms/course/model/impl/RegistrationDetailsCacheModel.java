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

import com.ocms.course.model.RegistrationDetails;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing RegistrationDetails in entity cache.
 *
 * @author doraraj
 * @see RegistrationDetails
 * @generated
 */
public class RegistrationDetailsCacheModel implements CacheModel<RegistrationDetails>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{studRegId=");
		sb.append(studRegId);
		sb.append(", contactId=");
		sb.append(contactId);
		sb.append(", eventId=");
		sb.append(eventId);
		sb.append(", price=");
		sb.append(price);
		sb.append(", discount=");
		sb.append(discount);
		sb.append(", fee=");
		sb.append(fee);
		sb.append(", credit=");
		sb.append(credit);
		sb.append(", registrationDetailsId=");
		sb.append(registrationDetailsId);
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RegistrationDetails toEntityModel() {
		RegistrationDetailsImpl registrationDetailsImpl = new RegistrationDetailsImpl();

		registrationDetailsImpl.setStudRegId(studRegId);
		registrationDetailsImpl.setContactId(contactId);
		registrationDetailsImpl.setEventId(eventId);
		registrationDetailsImpl.setPrice(price);
		registrationDetailsImpl.setDiscount(discount);
		registrationDetailsImpl.setFee(fee);
		registrationDetailsImpl.setCredit(credit);
		registrationDetailsImpl.setRegistrationDetailsId(registrationDetailsId);
		registrationDetailsImpl.setGroupId(groupId);
		registrationDetailsImpl.setCompanyId(companyId);
		registrationDetailsImpl.setUserId(userId);

		if (userName == null) {
			registrationDetailsImpl.setUserName(StringPool.BLANK);
		}
		else {
			registrationDetailsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			registrationDetailsImpl.setCreateDate(null);
		}
		else {
			registrationDetailsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			registrationDetailsImpl.setModifiedDate(null);
		}
		else {
			registrationDetailsImpl.setModifiedDate(new Date(modifiedDate));
		}

		registrationDetailsImpl.resetOriginalValues();

		return registrationDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		studRegId = objectInput.readLong();
		contactId = objectInput.readLong();
		eventId = objectInput.readLong();
		price = objectInput.readDouble();
		discount = objectInput.readDouble();
		fee = objectInput.readDouble();
		credit = objectInput.readDouble();
		registrationDetailsId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(studRegId);
		objectOutput.writeLong(contactId);
		objectOutput.writeLong(eventId);
		objectOutput.writeDouble(price);
		objectOutput.writeDouble(discount);
		objectOutput.writeDouble(fee);
		objectOutput.writeDouble(credit);
		objectOutput.writeLong(registrationDetailsId);
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
	}

	public long studRegId;
	public long contactId;
	public long eventId;
	public double price;
	public double discount;
	public double fee;
	public double credit;
	public long registrationDetailsId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
}