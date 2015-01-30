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

import com.ocms.course.model.Pricing;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Pricing in entity cache.
 *
 * @author doraraj
 * @see Pricing
 * @generated
 */
public class PricingCacheModel implements CacheModel<Pricing>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{pricingId=");
		sb.append(pricingId);
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
		sb.append(", locationId=");
		sb.append(locationId);
		sb.append(", courseId=");
		sb.append(courseId);
		sb.append(", packageId=");
		sb.append(packageId);
		sb.append(", deposit=");
		sb.append(deposit);
		sb.append(", price=");
		sb.append(price);
		sb.append(", currency=");
		sb.append(currency);
		sb.append(", effectiveDate=");
		sb.append(effectiveDate);
		sb.append(", courseCode=");
		sb.append(courseCode);
		sb.append(", locationCode=");
		sb.append(locationCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Pricing toEntityModel() {
		PricingImpl pricingImpl = new PricingImpl();

		pricingImpl.setPricingId(pricingId);
		pricingImpl.setGroupId(groupId);
		pricingImpl.setCompanyId(companyId);
		pricingImpl.setUserId(userId);

		if (userName == null) {
			pricingImpl.setUserName(StringPool.BLANK);
		}
		else {
			pricingImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			pricingImpl.setCreateDate(null);
		}
		else {
			pricingImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			pricingImpl.setModifiedDate(null);
		}
		else {
			pricingImpl.setModifiedDate(new Date(modifiedDate));
		}

		pricingImpl.setLocationId(locationId);
		pricingImpl.setCourseId(courseId);
		pricingImpl.setPackageId(packageId);
		pricingImpl.setDeposit(deposit);
		pricingImpl.setPrice(price);

		if (currency == null) {
			pricingImpl.setCurrency(StringPool.BLANK);
		}
		else {
			pricingImpl.setCurrency(currency);
		}

		if (effectiveDate == Long.MIN_VALUE) {
			pricingImpl.setEffectiveDate(null);
		}
		else {
			pricingImpl.setEffectiveDate(new Date(effectiveDate));
		}

		if (courseCode == null) {
			pricingImpl.setCourseCode(StringPool.BLANK);
		}
		else {
			pricingImpl.setCourseCode(courseCode);
		}

		if (locationCode == null) {
			pricingImpl.setLocationCode(StringPool.BLANK);
		}
		else {
			pricingImpl.setLocationCode(locationCode);
		}

		pricingImpl.resetOriginalValues();

		return pricingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		pricingId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		locationId = objectInput.readInt();
		courseId = objectInput.readInt();
		packageId = objectInput.readInt();
		deposit = objectInput.readInt();
		price = objectInput.readInt();
		currency = objectInput.readUTF();
		effectiveDate = objectInput.readLong();
		courseCode = objectInput.readUTF();
		locationCode = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(pricingId);
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
		objectOutput.writeInt(locationId);
		objectOutput.writeInt(courseId);
		objectOutput.writeInt(packageId);
		objectOutput.writeInt(deposit);
		objectOutput.writeInt(price);

		if (currency == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(currency);
		}

		objectOutput.writeLong(effectiveDate);

		if (courseCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(courseCode);
		}

		if (locationCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(locationCode);
		}
	}

	public long pricingId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int locationId;
	public int courseId;
	public int packageId;
	public int deposit;
	public int price;
	public String currency;
	public long effectiveDate;
	public String courseCode;
	public String locationCode;
}