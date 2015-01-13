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

package com.ocms.course.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.ocms.course.service.http.CourseSeriesServiceSoap}.
 *
 * @author doraraj
 * @see com.ocms.course.service.http.CourseSeriesServiceSoap
 * @generated
 */
public class CourseSeriesSoap implements Serializable {
	public static CourseSeriesSoap toSoapModel(CourseSeries model) {
		CourseSeriesSoap soapModel = new CourseSeriesSoap();

		soapModel.setCourseSeriesId(model.getCourseSeriesId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCourseId(model.getCourseId());
		soapModel.setLocationId(model.getLocationId());
		soapModel.setType(model.getType());
		soapModel.setStart_date(model.getStart_date());
		soapModel.setEnd_date(model.getEnd_date());
		soapModel.setPublishing_status(model.getPublishing_status());
		soapModel.setMax_no_of_stud_reg(model.getMax_no_of_stud_reg());

		return soapModel;
	}

	public static CourseSeriesSoap[] toSoapModels(CourseSeries[] models) {
		CourseSeriesSoap[] soapModels = new CourseSeriesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CourseSeriesSoap[][] toSoapModels(CourseSeries[][] models) {
		CourseSeriesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CourseSeriesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CourseSeriesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CourseSeriesSoap[] toSoapModels(List<CourseSeries> models) {
		List<CourseSeriesSoap> soapModels = new ArrayList<CourseSeriesSoap>(models.size());

		for (CourseSeries model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CourseSeriesSoap[soapModels.size()]);
	}

	public CourseSeriesSoap() {
	}

	public long getPrimaryKey() {
		return _courseSeriesId;
	}

	public void setPrimaryKey(long pk) {
		setCourseSeriesId(pk);
	}

	public long getCourseSeriesId() {
		return _courseSeriesId;
	}

	public void setCourseSeriesId(long courseSeriesId) {
		_courseSeriesId = courseSeriesId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getCourseId() {
		return _courseId;
	}

	public void setCourseId(long courseId) {
		_courseId = courseId;
	}

	public long getLocationId() {
		return _locationId;
	}

	public void setLocationId(long locationId) {
		_locationId = locationId;
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	public Date getStart_date() {
		return _start_date;
	}

	public void setStart_date(Date start_date) {
		_start_date = start_date;
	}

	public Date getEnd_date() {
		return _end_date;
	}

	public void setEnd_date(Date end_date) {
		_end_date = end_date;
	}

	public String getPublishing_status() {
		return _publishing_status;
	}

	public void setPublishing_status(String publishing_status) {
		_publishing_status = publishing_status;
	}

	public long getMax_no_of_stud_reg() {
		return _max_no_of_stud_reg;
	}

	public void setMax_no_of_stud_reg(long max_no_of_stud_reg) {
		_max_no_of_stud_reg = max_no_of_stud_reg;
	}

	private long _courseSeriesId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _courseId;
	private long _locationId;
	private String _type;
	private Date _start_date;
	private Date _end_date;
	private String _publishing_status;
	private long _max_no_of_stud_reg;
}