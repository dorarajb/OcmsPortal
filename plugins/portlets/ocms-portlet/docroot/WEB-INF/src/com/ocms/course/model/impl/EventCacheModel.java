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

import com.ocms.course.model.Event;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Event in entity cache.
 *
 * @author doraraj
 * @see Event
 * @generated
 */
public class EventCacheModel implements CacheModel<Event>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{eventId=");
		sb.append(eventId);
		sb.append(", eventName=");
		sb.append(eventName);
		sb.append(", courseCode=");
		sb.append(courseCode);
		sb.append(", locationCode=");
		sb.append(locationCode);
		sb.append(", startDate=");
		sb.append(startDate);
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
		sb.append(", endDate=");
		sb.append(endDate);
		sb.append(", flag=");
		sb.append(flag);
		sb.append(", courseId=");
		sb.append(courseId);
		sb.append(", locationId=");
		sb.append(locationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Event toEntityModel() {
		EventImpl eventImpl = new EventImpl();

		eventImpl.setEventId(eventId);

		if (eventName == null) {
			eventImpl.setEventName(StringPool.BLANK);
		}
		else {
			eventImpl.setEventName(eventName);
		}

		if (courseCode == null) {
			eventImpl.setCourseCode(StringPool.BLANK);
		}
		else {
			eventImpl.setCourseCode(courseCode);
		}

		if (locationCode == null) {
			eventImpl.setLocationCode(StringPool.BLANK);
		}
		else {
			eventImpl.setLocationCode(locationCode);
		}

		if (startDate == Long.MIN_VALUE) {
			eventImpl.setStartDate(null);
		}
		else {
			eventImpl.setStartDate(new Date(startDate));
		}

		eventImpl.setGroupId(groupId);
		eventImpl.setCompanyId(companyId);
		eventImpl.setUserId(userId);

		if (userName == null) {
			eventImpl.setUserName(StringPool.BLANK);
		}
		else {
			eventImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			eventImpl.setCreateDate(null);
		}
		else {
			eventImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			eventImpl.setModifiedDate(null);
		}
		else {
			eventImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (endDate == Long.MIN_VALUE) {
			eventImpl.setEndDate(null);
		}
		else {
			eventImpl.setEndDate(new Date(endDate));
		}

		eventImpl.setFlag(flag);
		eventImpl.setCourseId(courseId);
		eventImpl.setLocationId(locationId);

		eventImpl.resetOriginalValues();

		return eventImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		eventId = objectInput.readLong();
		eventName = objectInput.readUTF();
		courseCode = objectInput.readUTF();
		locationCode = objectInput.readUTF();
		startDate = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		endDate = objectInput.readLong();
		flag = objectInput.readInt();
		courseId = objectInput.readLong();
		locationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(eventId);

		if (eventName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(eventName);
		}

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

		objectOutput.writeLong(startDate);
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
		objectOutput.writeLong(endDate);
		objectOutput.writeInt(flag);
		objectOutput.writeLong(courseId);
		objectOutput.writeLong(locationId);
	}

	public long eventId;
	public String eventName;
	public String courseCode;
	public String locationCode;
	public long startDate;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long endDate;
	public int flag;
	public long courseId;
	public long locationId;
}