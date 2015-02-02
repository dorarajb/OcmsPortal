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

import com.ocms.course.model.CourseSeries;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CourseSeries in entity cache.
 *
 * @author doraraj
 * @see CourseSeries
 * @generated
 */
public class CourseSeriesCacheModel implements CacheModel<CourseSeries>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{courseSeriesId=");
		sb.append(courseSeriesId);
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
		sb.append(", courseId=");
		sb.append(courseId);
		sb.append(", locationId=");
		sb.append(locationId);
		sb.append(", type=");
		sb.append(type);
		sb.append(", startDate=");
		sb.append(startDate);
		sb.append(", endDate=");
		sb.append(endDate);
		sb.append(", publishingStatus=");
		sb.append(publishingStatus);
		sb.append(", maxNoStudReg=");
		sb.append(maxNoStudReg);
		sb.append(", seriesCount=");
		sb.append(seriesCount);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CourseSeries toEntityModel() {
		CourseSeriesImpl courseSeriesImpl = new CourseSeriesImpl();

		courseSeriesImpl.setCourseSeriesId(courseSeriesId);
		courseSeriesImpl.setGroupId(groupId);
		courseSeriesImpl.setCompanyId(companyId);
		courseSeriesImpl.setUserId(userId);

		if (userName == null) {
			courseSeriesImpl.setUserName(StringPool.BLANK);
		}
		else {
			courseSeriesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			courseSeriesImpl.setCreateDate(null);
		}
		else {
			courseSeriesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			courseSeriesImpl.setModifiedDate(null);
		}
		else {
			courseSeriesImpl.setModifiedDate(new Date(modifiedDate));
		}

		courseSeriesImpl.setCourseId(courseId);
		courseSeriesImpl.setLocationId(locationId);

		if (type == null) {
			courseSeriesImpl.setType(StringPool.BLANK);
		}
		else {
			courseSeriesImpl.setType(type);
		}

		if (startDate == Long.MIN_VALUE) {
			courseSeriesImpl.setStartDate(null);
		}
		else {
			courseSeriesImpl.setStartDate(new Date(startDate));
		}

		if (endDate == Long.MIN_VALUE) {
			courseSeriesImpl.setEndDate(null);
		}
		else {
			courseSeriesImpl.setEndDate(new Date(endDate));
		}

		if (publishingStatus == null) {
			courseSeriesImpl.setPublishingStatus(StringPool.BLANK);
		}
		else {
			courseSeriesImpl.setPublishingStatus(publishingStatus);
		}

		courseSeriesImpl.setMaxNoStudReg(maxNoStudReg);
		courseSeriesImpl.setSeriesCount(seriesCount);

		courseSeriesImpl.resetOriginalValues();

		return courseSeriesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		courseSeriesId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		courseId = objectInput.readLong();
		locationId = objectInput.readLong();
		type = objectInput.readUTF();
		startDate = objectInput.readLong();
		endDate = objectInput.readLong();
		publishingStatus = objectInput.readUTF();
		maxNoStudReg = objectInput.readLong();
		seriesCount = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(courseSeriesId);
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
		objectOutput.writeLong(courseId);
		objectOutput.writeLong(locationId);

		if (type == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(type);
		}

		objectOutput.writeLong(startDate);
		objectOutput.writeLong(endDate);

		if (publishingStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(publishingStatus);
		}

		objectOutput.writeLong(maxNoStudReg);
		objectOutput.writeLong(seriesCount);
	}

	public long courseSeriesId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long courseId;
	public long locationId;
	public String type;
	public long startDate;
	public long endDate;
	public String publishingStatus;
	public long maxNoStudReg;
	public long seriesCount;
}