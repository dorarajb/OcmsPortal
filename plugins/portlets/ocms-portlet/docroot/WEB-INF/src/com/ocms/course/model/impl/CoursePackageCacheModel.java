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

import com.ocms.course.model.CoursePackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CoursePackage in entity cache.
 *
 * @author doraraj
 * @see CoursePackage
 * @generated
 */
public class CoursePackageCacheModel implements CacheModel<CoursePackage>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{coursePackageId=");
		sb.append(coursePackageId);
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
		sb.append(", name=");
		sb.append(name);
		sb.append(", code=");
		sb.append(code);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CoursePackage toEntityModel() {
		CoursePackageImpl coursePackageImpl = new CoursePackageImpl();

		coursePackageImpl.setCoursePackageId(coursePackageId);
		coursePackageImpl.setGroupId(groupId);
		coursePackageImpl.setCompanyId(companyId);
		coursePackageImpl.setUserId(userId);

		if (userName == null) {
			coursePackageImpl.setUserName(StringPool.BLANK);
		}
		else {
			coursePackageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			coursePackageImpl.setCreateDate(null);
		}
		else {
			coursePackageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			coursePackageImpl.setModifiedDate(null);
		}
		else {
			coursePackageImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			coursePackageImpl.setName(StringPool.BLANK);
		}
		else {
			coursePackageImpl.setName(name);
		}

		if (code == null) {
			coursePackageImpl.setCode(StringPool.BLANK);
		}
		else {
			coursePackageImpl.setCode(code);
		}

		coursePackageImpl.resetOriginalValues();

		return coursePackageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		coursePackageId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		code = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(coursePackageId);
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

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(code);
		}
	}

	public long coursePackageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String code;
}