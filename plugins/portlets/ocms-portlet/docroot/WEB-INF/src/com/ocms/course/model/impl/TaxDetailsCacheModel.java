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

import com.ocms.course.model.TaxDetails;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TaxDetails in entity cache.
 *
 * @author doraraj
 * @see TaxDetails
 * @generated
 */
public class TaxDetailsCacheModel implements CacheModel<TaxDetails>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{taxDetailsId=");
		sb.append(taxDetailsId);
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
		sb.append(", country=");
		sb.append(country);
		sb.append(", taxTypeId=");
		sb.append(taxTypeId);
		sb.append(", effectiveFromDate=");
		sb.append(effectiveFromDate);
		sb.append(", effectiveToDate=");
		sb.append(effectiveToDate);
		sb.append(", active=");
		sb.append(active);
		sb.append(", taxPercent=");
		sb.append(taxPercent);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TaxDetails toEntityModel() {
		TaxDetailsImpl taxDetailsImpl = new TaxDetailsImpl();

		taxDetailsImpl.setTaxDetailsId(taxDetailsId);
		taxDetailsImpl.setGroupId(groupId);
		taxDetailsImpl.setCompanyId(companyId);
		taxDetailsImpl.setUserId(userId);

		if (userName == null) {
			taxDetailsImpl.setUserName(StringPool.BLANK);
		}
		else {
			taxDetailsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			taxDetailsImpl.setCreateDate(null);
		}
		else {
			taxDetailsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			taxDetailsImpl.setModifiedDate(null);
		}
		else {
			taxDetailsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (country == null) {
			taxDetailsImpl.setCountry(StringPool.BLANK);
		}
		else {
			taxDetailsImpl.setCountry(country);
		}

		taxDetailsImpl.setTaxTypeId(taxTypeId);

		if (effectiveFromDate == Long.MIN_VALUE) {
			taxDetailsImpl.setEffectiveFromDate(null);
		}
		else {
			taxDetailsImpl.setEffectiveFromDate(new Date(effectiveFromDate));
		}

		if (effectiveToDate == Long.MIN_VALUE) {
			taxDetailsImpl.setEffectiveToDate(null);
		}
		else {
			taxDetailsImpl.setEffectiveToDate(new Date(effectiveToDate));
		}

		taxDetailsImpl.setActive(active);
		taxDetailsImpl.setTaxPercent(taxPercent);

		taxDetailsImpl.resetOriginalValues();

		return taxDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		taxDetailsId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		country = objectInput.readUTF();
		taxTypeId = objectInput.readLong();
		effectiveFromDate = objectInput.readLong();
		effectiveToDate = objectInput.readLong();
		active = objectInput.readInt();
		taxPercent = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(taxDetailsId);
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

		if (country == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(country);
		}

		objectOutput.writeLong(taxTypeId);
		objectOutput.writeLong(effectiveFromDate);
		objectOutput.writeLong(effectiveToDate);
		objectOutput.writeInt(active);
		objectOutput.writeInt(taxPercent);
	}

	public long taxDetailsId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String country;
	public long taxTypeId;
	public long effectiveFromDate;
	public long effectiveToDate;
	public int active;
	public int taxPercent;
}