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

import com.ocms.course.model.Location;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Location in entity cache.
 *
 * @author doraraj
 * @see Location
 * @generated
 */
public class LocationCacheModel implements CacheModel<Location>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{locationId=");
		sb.append(locationId);
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
		sb.append(", name=");
		sb.append(name);
		sb.append(", notes=");
		sb.append(notes);
		sb.append(", addressLine1=");
		sb.append(addressLine1);
		sb.append(", addressLine2=");
		sb.append(addressLine2);
		sb.append(", city=");
		sb.append(city);
		sb.append(", state=");
		sb.append(state);
		sb.append(", country=");
		sb.append(country);
		sb.append(", region=");
		sb.append(region);
		sb.append(", zipcode=");
		sb.append(zipcode);
		sb.append(", phone=");
		sb.append(phone);
		sb.append(", fax=");
		sb.append(fax);
		sb.append(", email=");
		sb.append(email);
		sb.append(", siteUrl=");
		sb.append(siteUrl);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Location toEntityModel() {
		LocationImpl locationImpl = new LocationImpl();

		locationImpl.setLocationId(locationId);
		locationImpl.setGroupId(groupId);
		locationImpl.setCompanyId(companyId);
		locationImpl.setUserId(userId);

		if (userName == null) {
			locationImpl.setUserName(StringPool.BLANK);
		}
		else {
			locationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			locationImpl.setCreateDate(null);
		}
		else {
			locationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			locationImpl.setModifiedDate(null);
		}
		else {
			locationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (code == null) {
			locationImpl.setCode(StringPool.BLANK);
		}
		else {
			locationImpl.setCode(code);
		}

		if (name == null) {
			locationImpl.setName(StringPool.BLANK);
		}
		else {
			locationImpl.setName(name);
		}

		if (notes == null) {
			locationImpl.setNotes(StringPool.BLANK);
		}
		else {
			locationImpl.setNotes(notes);
		}

		if (addressLine1 == null) {
			locationImpl.setAddressLine1(StringPool.BLANK);
		}
		else {
			locationImpl.setAddressLine1(addressLine1);
		}

		if (addressLine2 == null) {
			locationImpl.setAddressLine2(StringPool.BLANK);
		}
		else {
			locationImpl.setAddressLine2(addressLine2);
		}

		if (city == null) {
			locationImpl.setCity(StringPool.BLANK);
		}
		else {
			locationImpl.setCity(city);
		}

		if (state == null) {
			locationImpl.setState(StringPool.BLANK);
		}
		else {
			locationImpl.setState(state);
		}

		if (country == null) {
			locationImpl.setCountry(StringPool.BLANK);
		}
		else {
			locationImpl.setCountry(country);
		}

		if (region == null) {
			locationImpl.setRegion(StringPool.BLANK);
		}
		else {
			locationImpl.setRegion(region);
		}

		if (zipcode == null) {
			locationImpl.setZipcode(StringPool.BLANK);
		}
		else {
			locationImpl.setZipcode(zipcode);
		}

		if (phone == null) {
			locationImpl.setPhone(StringPool.BLANK);
		}
		else {
			locationImpl.setPhone(phone);
		}

		if (fax == null) {
			locationImpl.setFax(StringPool.BLANK);
		}
		else {
			locationImpl.setFax(fax);
		}

		if (email == null) {
			locationImpl.setEmail(StringPool.BLANK);
		}
		else {
			locationImpl.setEmail(email);
		}

		if (siteUrl == null) {
			locationImpl.setSiteUrl(StringPool.BLANK);
		}
		else {
			locationImpl.setSiteUrl(siteUrl);
		}

		locationImpl.resetOriginalValues();

		return locationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		locationId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		code = objectInput.readUTF();
		name = objectInput.readUTF();
		notes = objectInput.readUTF();
		addressLine1 = objectInput.readUTF();
		addressLine2 = objectInput.readUTF();
		city = objectInput.readUTF();
		state = objectInput.readUTF();
		country = objectInput.readUTF();
		region = objectInput.readUTF();
		zipcode = objectInput.readUTF();
		phone = objectInput.readUTF();
		fax = objectInput.readUTF();
		email = objectInput.readUTF();
		siteUrl = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(locationId);
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

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (notes == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(notes);
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

		if (country == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(country);
		}

		if (region == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(region);
		}

		if (zipcode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(zipcode);
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

		if (siteUrl == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(siteUrl);
		}
	}

	public long locationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String code;
	public String name;
	public String notes;
	public String addressLine1;
	public String addressLine2;
	public String city;
	public String state;
	public String country;
	public String region;
	public String zipcode;
	public String phone;
	public String fax;
	public String email;
	public String siteUrl;
}