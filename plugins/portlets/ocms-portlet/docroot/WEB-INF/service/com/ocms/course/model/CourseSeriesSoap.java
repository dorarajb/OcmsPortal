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
		soapModel.setStartDate(model.getStartDate());
		soapModel.setEndDate(model.getEndDate());
		soapModel.setPublishingStatus(model.getPublishingStatus());
		soapModel.setMaxNoStudReg(model.getMaxNoStudReg());
		soapModel.setSeriesCount(model.getSeriesCount());
		soapModel.setCourseSeriesCode(model.getCourseSeriesCode());
		soapModel.setCourseSeriesEventCode(model.getCourseSeriesEventCode());
		soapModel.setFlagToListData(model.getFlagToListData());
		soapModel.setFlagToChkEventCreation(model.getFlagToChkEventCreation());
		soapModel.setSMonth(model.getSMonth());
		soapModel.setSDay(model.getSDay());
		soapModel.setEMonth(model.getEMonth());
		soapModel.setEDay(model.getEDay());

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

	public Date getStartDate() {
		return _startDate;
	}

	public void setStartDate(Date startDate) {
		_startDate = startDate;
	}

	public Date getEndDate() {
		return _endDate;
	}

	public void setEndDate(Date endDate) {
		_endDate = endDate;
	}

	public String getPublishingStatus() {
		return _publishingStatus;
	}

	public void setPublishingStatus(String publishingStatus) {
		_publishingStatus = publishingStatus;
	}

	public long getMaxNoStudReg() {
		return _maxNoStudReg;
	}

	public void setMaxNoStudReg(long maxNoStudReg) {
		_maxNoStudReg = maxNoStudReg;
	}

	public long getSeriesCount() {
		return _seriesCount;
	}

	public void setSeriesCount(long seriesCount) {
		_seriesCount = seriesCount;
	}

	public String getCourseSeriesCode() {
		return _courseSeriesCode;
	}

	public void setCourseSeriesCode(String courseSeriesCode) {
		_courseSeriesCode = courseSeriesCode;
	}

	public String getCourseSeriesEventCode() {
		return _courseSeriesEventCode;
	}

	public void setCourseSeriesEventCode(String courseSeriesEventCode) {
		_courseSeriesEventCode = courseSeriesEventCode;
	}

	public int getFlagToListData() {
		return _flagToListData;
	}

	public void setFlagToListData(int flagToListData) {
		_flagToListData = flagToListData;
	}

	public int getFlagToChkEventCreation() {
		return _flagToChkEventCreation;
	}

	public void setFlagToChkEventCreation(int flagToChkEventCreation) {
		_flagToChkEventCreation = flagToChkEventCreation;
	}

	public String getSMonth() {
		return _sMonth;
	}

	public void setSMonth(String sMonth) {
		_sMonth = sMonth;
	}

	public int getSDay() {
		return _sDay;
	}

	public void setSDay(int sDay) {
		_sDay = sDay;
	}

	public String getEMonth() {
		return _eMonth;
	}

	public void setEMonth(String eMonth) {
		_eMonth = eMonth;
	}

	public int getEDay() {
		return _eDay;
	}

	public void setEDay(int eDay) {
		_eDay = eDay;
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
	private Date _startDate;
	private Date _endDate;
	private String _publishingStatus;
	private long _maxNoStudReg;
	private long _seriesCount;
	private String _courseSeriesCode;
	private String _courseSeriesEventCode;
	private int _flagToListData;
	private int _flagToChkEventCreation;
	private String _sMonth;
	private int _sDay;
	private String _eMonth;
	private int _eDay;
}