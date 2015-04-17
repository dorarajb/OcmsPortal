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

import com.ocms.course.model.TaxTypes;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TaxTypes in entity cache.
 *
 * @author doraraj
 * @see TaxTypes
 * @generated
 */
public class TaxTypesCacheModel implements CacheModel<TaxTypes>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{taxTypesId=");
		sb.append(taxTypesId);
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
		sb.append(", taxName=");
		sb.append(taxName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TaxTypes toEntityModel() {
		TaxTypesImpl taxTypesImpl = new TaxTypesImpl();

		taxTypesImpl.setTaxTypesId(taxTypesId);
		taxTypesImpl.setGroupId(groupId);
		taxTypesImpl.setCompanyId(companyId);
		taxTypesImpl.setUserId(userId);

		if (userName == null) {
			taxTypesImpl.setUserName(StringPool.BLANK);
		}
		else {
			taxTypesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			taxTypesImpl.setCreateDate(null);
		}
		else {
			taxTypesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			taxTypesImpl.setModifiedDate(null);
		}
		else {
			taxTypesImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (taxName == null) {
			taxTypesImpl.setTaxName(StringPool.BLANK);
		}
		else {
			taxTypesImpl.setTaxName(taxName);
		}

		taxTypesImpl.resetOriginalValues();

		return taxTypesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		taxTypesId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		taxName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(taxTypesId);
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

		if (taxName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(taxName);
		}
	}

	public long taxTypesId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String taxName;
}