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
		StringBundler sb = new StringBundler(29);

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
		sb.append(", start_date=");
		sb.append(start_date);
		sb.append(", end_date=");
		sb.append(end_date);
		sb.append(", publishing_status=");
		sb.append(publishing_status);
		sb.append(", max_no_of_stud_reg=");
		sb.append(max_no_of_stud_reg);
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

		if (start_date == Long.MIN_VALUE) {
			courseSeriesImpl.setStart_date(null);
		}
		else {
			courseSeriesImpl.setStart_date(new Date(start_date));
		}

		if (end_date == Long.MIN_VALUE) {
			courseSeriesImpl.setEnd_date(null);
		}
		else {
			courseSeriesImpl.setEnd_date(new Date(end_date));
		}

		if (publishing_status == null) {
			courseSeriesImpl.setPublishing_status(StringPool.BLANK);
		}
		else {
			courseSeriesImpl.setPublishing_status(publishing_status);
		}

		courseSeriesImpl.setMax_no_of_stud_reg(max_no_of_stud_reg);

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
		start_date = objectInput.readLong();
		end_date = objectInput.readLong();
		publishing_status = objectInput.readUTF();
		max_no_of_stud_reg = objectInput.readLong();
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

		objectOutput.writeLong(start_date);
		objectOutput.writeLong(end_date);

		if (publishing_status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(publishing_status);
		}

		objectOutput.writeLong(max_no_of_stud_reg);
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
	public long start_date;
	public long end_date;
	public String publishing_status;
	public long max_no_of_stud_reg;
}