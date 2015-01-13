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

package com.liferay.sync.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.liferay.sync.model.SyncDLObject;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SyncDLObject in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see SyncDLObject
 * @generated
 */
public class SyncDLObjectCacheModel implements CacheModel<SyncDLObject>,
	Externalizable {

	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{objectId=");
		sb.append(objectId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createTime=");
		sb.append(createTime);
		sb.append(", modifiedTime=");
		sb.append(modifiedTime);
		sb.append(", repositoryId=");
		sb.append(repositoryId);
		sb.append(", parentFolderId=");
		sb.append(parentFolderId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", extension=");
		sb.append(extension);
		sb.append(", mimeType=");
		sb.append(mimeType);
		sb.append(", description=");
		sb.append(description);
		sb.append(", changeLog=");
		sb.append(changeLog);
		sb.append(", extraSettings=");
		sb.append(extraSettings);
		sb.append(", version=");
		sb.append(version);
		sb.append(", size=");
		sb.append(size);
		sb.append(", checksum=");
		sb.append(checksum);
		sb.append(", event=");
		sb.append(event);
		sb.append(", lockExpirationDate=");
		sb.append(lockExpirationDate);
		sb.append(", lockUserId=");
		sb.append(lockUserId);
		sb.append(", lockUserName=");
		sb.append(lockUserName);
		sb.append(", type=");
		sb.append(type);
		sb.append(", typePK=");
		sb.append(typePK);
		sb.append(", typeUuid=");
		sb.append(typeUuid);
		sb.append("}");

		return sb.toString();
	}


	public SyncDLObject toEntityModel() {
		SyncDLObjectImpl syncDLObjectImpl = new SyncDLObjectImpl();

		syncDLObjectImpl.setObjectId(objectId);
		syncDLObjectImpl.setCompanyId(companyId);
		syncDLObjectImpl.setCreateTime(createTime);
		syncDLObjectImpl.setModifiedTime(modifiedTime);
		syncDLObjectImpl.setRepositoryId(repositoryId);
		syncDLObjectImpl.setParentFolderId(parentFolderId);

		if (name == null) {
			syncDLObjectImpl.setName(StringPool.BLANK);
		}
		else {
			syncDLObjectImpl.setName(name);
		}

		if (extension == null) {
			syncDLObjectImpl.setExtension(StringPool.BLANK);
		}
		else {
			syncDLObjectImpl.setExtension(extension);
		}

		if (mimeType == null) {
			syncDLObjectImpl.setMimeType(StringPool.BLANK);
		}
		else {
			syncDLObjectImpl.setMimeType(mimeType);
		}

		if (description == null) {
			syncDLObjectImpl.setDescription(StringPool.BLANK);
		}
		else {
			syncDLObjectImpl.setDescription(description);
		}

		if (changeLog == null) {
			syncDLObjectImpl.setChangeLog(StringPool.BLANK);
		}
		else {
			syncDLObjectImpl.setChangeLog(changeLog);
		}

		if (extraSettings == null) {
			syncDLObjectImpl.setExtraSettings(StringPool.BLANK);
		}
		else {
			syncDLObjectImpl.setExtraSettings(extraSettings);
		}

		if (version == null) {
			syncDLObjectImpl.setVersion(StringPool.BLANK);
		}
		else {
			syncDLObjectImpl.setVersion(version);
		}

		syncDLObjectImpl.setSize(size);

		if (checksum == null) {
			syncDLObjectImpl.setChecksum(StringPool.BLANK);
		}
		else {
			syncDLObjectImpl.setChecksum(checksum);
		}

		if (event == null) {
			syncDLObjectImpl.setEvent(StringPool.BLANK);
		}
		else {
			syncDLObjectImpl.setEvent(event);
		}

		if (lockExpirationDate == Long.MIN_VALUE) {
			syncDLObjectImpl.setLockExpirationDate(null);
		}
		else {
			syncDLObjectImpl.setLockExpirationDate(new Date(lockExpirationDate));
		}

		syncDLObjectImpl.setLockUserId(lockUserId);

		if (lockUserName == null) {
			syncDLObjectImpl.setLockUserName(StringPool.BLANK);
		}
		else {
			syncDLObjectImpl.setLockUserName(lockUserName);
		}

		if (type == null) {
			syncDLObjectImpl.setType(StringPool.BLANK);
		}
		else {
			syncDLObjectImpl.setType(type);
		}

		syncDLObjectImpl.setTypePK(typePK);

		if (typeUuid == null) {
			syncDLObjectImpl.setTypeUuid(StringPool.BLANK);
		}
		else {
			syncDLObjectImpl.setTypeUuid(typeUuid);
		}

		syncDLObjectImpl.resetOriginalValues();

		return syncDLObjectImpl;
	}


	public void readExternal(ObjectInput objectInput) throws IOException {
		objectId = objectInput.readLong();
		companyId = objectInput.readLong();
		createTime = objectInput.readLong();
		modifiedTime = objectInput.readLong();
		repositoryId = objectInput.readLong();
		parentFolderId = objectInput.readLong();
		name = objectInput.readUTF();
		extension = objectInput.readUTF();
		mimeType = objectInput.readUTF();
		description = objectInput.readUTF();
		changeLog = objectInput.readUTF();
		extraSettings = objectInput.readUTF();
		version = objectInput.readUTF();
		size = objectInput.readLong();
		checksum = objectInput.readUTF();
		event = objectInput.readUTF();
		lockExpirationDate = objectInput.readLong();
		lockUserId = objectInput.readLong();
		lockUserName = objectInput.readUTF();
		type = objectInput.readUTF();
		typePK = objectInput.readLong();
		typeUuid = objectInput.readUTF();
	}


	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(objectId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createTime);
		objectOutput.writeLong(modifiedTime);
		objectOutput.writeLong(repositoryId);
		objectOutput.writeLong(parentFolderId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (extension == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(extension);
		}

		if (mimeType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mimeType);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (changeLog == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(changeLog);
		}

		if (extraSettings == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(extraSettings);
		}

		if (version == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(version);
		}

		objectOutput.writeLong(size);

		if (checksum == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(checksum);
		}

		if (event == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(event);
		}

		objectOutput.writeLong(lockExpirationDate);
		objectOutput.writeLong(lockUserId);

		if (lockUserName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lockUserName);
		}

		if (type == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(type);
		}

		objectOutput.writeLong(typePK);

		if (typeUuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(typeUuid);
		}
	}

	public long objectId;
	public long companyId;
	public long createTime;
	public long modifiedTime;
	public long repositoryId;
	public long parentFolderId;
	public String name;
	public String extension;
	public String mimeType;
	public String description;
	public String changeLog;
	public String extraSettings;
	public String version;
	public long size;
	public String checksum;
	public String event;
	public long lockExpirationDate;
	public long lockUserId;
	public String lockUserName;
	public String type;
	public long typePK;
	public String typeUuid;
}