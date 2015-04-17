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

import com.ocms.course.model.StudentRegistration;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing StudentRegistration in entity cache.
 *
 * @author doraraj
 * @see StudentRegistration
 * @generated
 */
public class StudentRegistrationCacheModel implements CacheModel<StudentRegistration>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{studRegId=");
		sb.append(studRegId);
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
		sb.append(", memo=");
		sb.append(memo);
		sb.append(", studRegStatus=");
		sb.append(studRegStatus);
		sb.append(", advisorOrig=");
		sb.append(advisorOrig);
		sb.append(", advisorReg=");
		sb.append(advisorReg);
		sb.append(", coursePackageId=");
		sb.append(coursePackageId);
		sb.append(", discountId=");
		sb.append(discountId);
		sb.append(", commMethod=");
		sb.append(commMethod);
		sb.append(", notes=");
		sb.append(notes);
		sb.append(", currency=");
		sb.append(currency);
		sb.append(", tax=");
		sb.append(tax);
		sb.append(", autoCharge=");
		sb.append(autoCharge);
		sb.append(", currencyPaid=");
		sb.append(currencyPaid);
		sb.append(", exchangeRate=");
		sb.append(exchangeRate);
		sb.append(", contactId=");
		sb.append(contactId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public StudentRegistration toEntityModel() {
		StudentRegistrationImpl studentRegistrationImpl = new StudentRegistrationImpl();

		studentRegistrationImpl.setStudRegId(studRegId);
		studentRegistrationImpl.setGroupId(groupId);
		studentRegistrationImpl.setCompanyId(companyId);
		studentRegistrationImpl.setUserId(userId);

		if (userName == null) {
			studentRegistrationImpl.setUserName(StringPool.BLANK);
		}
		else {
			studentRegistrationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			studentRegistrationImpl.setCreateDate(null);
		}
		else {
			studentRegistrationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			studentRegistrationImpl.setModifiedDate(null);
		}
		else {
			studentRegistrationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (memo == null) {
			studentRegistrationImpl.setMemo(StringPool.BLANK);
		}
		else {
			studentRegistrationImpl.setMemo(memo);
		}

		if (studRegStatus == null) {
			studentRegistrationImpl.setStudRegStatus(StringPool.BLANK);
		}
		else {
			studentRegistrationImpl.setStudRegStatus(studRegStatus);
		}

		if (advisorOrig == null) {
			studentRegistrationImpl.setAdvisorOrig(StringPool.BLANK);
		}
		else {
			studentRegistrationImpl.setAdvisorOrig(advisorOrig);
		}

		if (advisorReg == null) {
			studentRegistrationImpl.setAdvisorReg(StringPool.BLANK);
		}
		else {
			studentRegistrationImpl.setAdvisorReg(advisorReg);
		}

		studentRegistrationImpl.setCoursePackageId(coursePackageId);
		studentRegistrationImpl.setDiscountId(discountId);

		if (commMethod == null) {
			studentRegistrationImpl.setCommMethod(StringPool.BLANK);
		}
		else {
			studentRegistrationImpl.setCommMethod(commMethod);
		}

		if (notes == null) {
			studentRegistrationImpl.setNotes(StringPool.BLANK);
		}
		else {
			studentRegistrationImpl.setNotes(notes);
		}

		if (currency == null) {
			studentRegistrationImpl.setCurrency(StringPool.BLANK);
		}
		else {
			studentRegistrationImpl.setCurrency(currency);
		}

		studentRegistrationImpl.setTax(tax);

		if (autoCharge == null) {
			studentRegistrationImpl.setAutoCharge(StringPool.BLANK);
		}
		else {
			studentRegistrationImpl.setAutoCharge(autoCharge);
		}

		if (currencyPaid == null) {
			studentRegistrationImpl.setCurrencyPaid(StringPool.BLANK);
		}
		else {
			studentRegistrationImpl.setCurrencyPaid(currencyPaid);
		}

		studentRegistrationImpl.setExchangeRate(exchangeRate);
		studentRegistrationImpl.setContactId(contactId);

		studentRegistrationImpl.resetOriginalValues();

		return studentRegistrationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		studRegId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		memo = objectInput.readUTF();
		studRegStatus = objectInput.readUTF();
		advisorOrig = objectInput.readUTF();
		advisorReg = objectInput.readUTF();
		coursePackageId = objectInput.readLong();
		discountId = objectInput.readLong();
		commMethod = objectInput.readUTF();
		notes = objectInput.readUTF();
		currency = objectInput.readUTF();
		tax = objectInput.readLong();
		autoCharge = objectInput.readUTF();
		currencyPaid = objectInput.readUTF();
		exchangeRate = objectInput.readLong();
		contactId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(studRegId);
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

		if (memo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(memo);
		}

		if (studRegStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(studRegStatus);
		}

		if (advisorOrig == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(advisorOrig);
		}

		if (advisorReg == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(advisorReg);
		}

		objectOutput.writeLong(coursePackageId);
		objectOutput.writeLong(discountId);

		if (commMethod == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(commMethod);
		}

		if (notes == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(notes);
		}

		if (currency == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(currency);
		}

		objectOutput.writeLong(tax);

		if (autoCharge == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(autoCharge);
		}

		if (currencyPaid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(currencyPaid);
		}

		objectOutput.writeLong(exchangeRate);
		objectOutput.writeLong(contactId);
	}

	public long studRegId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String memo;
	public String studRegStatus;
	public String advisorOrig;
	public String advisorReg;
	public long coursePackageId;
	public long discountId;
	public String commMethod;
	public String notes;
	public String currency;
	public long tax;
	public String autoCharge;
	public String currencyPaid;
	public long exchangeRate;
	public long contactId;
}