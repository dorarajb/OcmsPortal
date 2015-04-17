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

import com.ocms.course.model.OffersAndDeductions;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OffersAndDeductions in entity cache.
 *
 * @author doraraj
 * @see OffersAndDeductions
 * @generated
 */
public class OffersAndDeductionsCacheModel implements CacheModel<OffersAndDeductions>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(id);
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
		sb.append(", code=");
		sb.append(code);
		sb.append(", description=");
		sb.append(description);
		sb.append(", amount=");
		sb.append(amount);
		sb.append(", active=");
		sb.append(active);
		sb.append(", effectiveFromDate=");
		sb.append(effectiveFromDate);
		sb.append(", effectivetoDate=");
		sb.append(effectivetoDate);
		sb.append(", type=");
		sb.append(type);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OffersAndDeductions toEntityModel() {
		OffersAndDeductionsImpl offersAndDeductionsImpl = new OffersAndDeductionsImpl();

		offersAndDeductionsImpl.setId(id);
		offersAndDeductionsImpl.setGroupId(groupId);
		offersAndDeductionsImpl.setCompanyId(companyId);
		offersAndDeductionsImpl.setUserId(userId);

		if (userName == null) {
			offersAndDeductionsImpl.setUserName(StringPool.BLANK);
		}
		else {
			offersAndDeductionsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			offersAndDeductionsImpl.setCreateDate(null);
		}
		else {
			offersAndDeductionsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			offersAndDeductionsImpl.setModifiedDate(null);
		}
		else {
			offersAndDeductionsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (code == null) {
			offersAndDeductionsImpl.setCode(StringPool.BLANK);
		}
		else {
			offersAndDeductionsImpl.setCode(code);
		}

		if (description == null) {
			offersAndDeductionsImpl.setDescription(StringPool.BLANK);
		}
		else {
			offersAndDeductionsImpl.setDescription(description);
		}

		offersAndDeductionsImpl.setAmount(amount);
		offersAndDeductionsImpl.setActive(active);

		if (effectiveFromDate == Long.MIN_VALUE) {
			offersAndDeductionsImpl.setEffectiveFromDate(null);
		}
		else {
			offersAndDeductionsImpl.setEffectiveFromDate(new Date(
					effectiveFromDate));
		}

		if (effectivetoDate == Long.MIN_VALUE) {
			offersAndDeductionsImpl.setEffectivetoDate(null);
		}
		else {
			offersAndDeductionsImpl.setEffectivetoDate(new Date(effectivetoDate));
		}

		if (type == null) {
			offersAndDeductionsImpl.setType(StringPool.BLANK);
		}
		else {
			offersAndDeductionsImpl.setType(type);
		}

		offersAndDeductionsImpl.resetOriginalValues();

		return offersAndDeductionsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		code = objectInput.readUTF();
		description = objectInput.readUTF();
		amount = objectInput.readLong();
		active = objectInput.readInt();
		effectiveFromDate = objectInput.readLong();
		effectivetoDate = objectInput.readLong();
		type = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
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

		if (code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(code);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(amount);
		objectOutput.writeInt(active);
		objectOutput.writeLong(effectiveFromDate);
		objectOutput.writeLong(effectivetoDate);

		if (type == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(type);
		}
	}

	public long id;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String code;
	public String description;
	public long amount;
	public int active;
	public long effectiveFromDate;
	public long effectivetoDate;
	public String type;
}