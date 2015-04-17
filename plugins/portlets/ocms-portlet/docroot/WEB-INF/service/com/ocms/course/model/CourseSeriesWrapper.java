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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CourseSeries}.
 * </p>
 *
 * @author doraraj
 * @see CourseSeries
 * @generated
 */
public class CourseSeriesWrapper implements CourseSeries,
	ModelWrapper<CourseSeries> {
	public CourseSeriesWrapper(CourseSeries courseSeries) {
		_courseSeries = courseSeries;
	}

	@Override
	public Class<?> getModelClass() {
		return CourseSeries.class;
	}

	@Override
	public String getModelClassName() {
		return CourseSeries.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("courseSeriesId", getCourseSeriesId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("courseId", getCourseId());
		attributes.put("locationId", getLocationId());
		attributes.put("type", getType());
		attributes.put("startDate", getStartDate());
		attributes.put("endDate", getEndDate());
		attributes.put("publishingStatus", getPublishingStatus());
		attributes.put("maxNoStudReg", getMaxNoStudReg());
		attributes.put("seriesCount", getSeriesCount());
		attributes.put("courseSeriesCode", getCourseSeriesCode());
		attributes.put("courseSeriesEventCode", getCourseSeriesEventCode());
		attributes.put("flagToListData", getFlagToListData());
		attributes.put("flagToChkEventCreation", getFlagToChkEventCreation());
		attributes.put("sMonth", getSMonth());
		attributes.put("sDay", getSDay());
		attributes.put("eMonth", getEMonth());
		attributes.put("eDay", getEDay());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long courseSeriesId = (Long)attributes.get("courseSeriesId");

		if (courseSeriesId != null) {
			setCourseSeriesId(courseSeriesId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long courseId = (Long)attributes.get("courseId");

		if (courseId != null) {
			setCourseId(courseId);
		}

		Long locationId = (Long)attributes.get("locationId");

		if (locationId != null) {
			setLocationId(locationId);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		Date startDate = (Date)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		Date endDate = (Date)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}

		String publishingStatus = (String)attributes.get("publishingStatus");

		if (publishingStatus != null) {
			setPublishingStatus(publishingStatus);
		}

		Long maxNoStudReg = (Long)attributes.get("maxNoStudReg");

		if (maxNoStudReg != null) {
			setMaxNoStudReg(maxNoStudReg);
		}

		Long seriesCount = (Long)attributes.get("seriesCount");

		if (seriesCount != null) {
			setSeriesCount(seriesCount);
		}

		String courseSeriesCode = (String)attributes.get("courseSeriesCode");

		if (courseSeriesCode != null) {
			setCourseSeriesCode(courseSeriesCode);
		}

		String courseSeriesEventCode = (String)attributes.get(
				"courseSeriesEventCode");

		if (courseSeriesEventCode != null) {
			setCourseSeriesEventCode(courseSeriesEventCode);
		}

		Integer flagToListData = (Integer)attributes.get("flagToListData");

		if (flagToListData != null) {
			setFlagToListData(flagToListData);
		}

		Integer flagToChkEventCreation = (Integer)attributes.get(
				"flagToChkEventCreation");

		if (flagToChkEventCreation != null) {
			setFlagToChkEventCreation(flagToChkEventCreation);
		}

		String sMonth = (String)attributes.get("sMonth");

		if (sMonth != null) {
			setSMonth(sMonth);
		}

		Integer sDay = (Integer)attributes.get("sDay");

		if (sDay != null) {
			setSDay(sDay);
		}

		String eMonth = (String)attributes.get("eMonth");

		if (eMonth != null) {
			setEMonth(eMonth);
		}

		Integer eDay = (Integer)attributes.get("eDay");

		if (eDay != null) {
			setEDay(eDay);
		}
	}

	/**
	* Returns the primary key of this course series.
	*
	* @return the primary key of this course series
	*/
	@Override
	public long getPrimaryKey() {
		return _courseSeries.getPrimaryKey();
	}

	/**
	* Sets the primary key of this course series.
	*
	* @param primaryKey the primary key of this course series
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_courseSeries.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the course series ID of this course series.
	*
	* @return the course series ID of this course series
	*/
	@Override
	public long getCourseSeriesId() {
		return _courseSeries.getCourseSeriesId();
	}

	/**
	* Sets the course series ID of this course series.
	*
	* @param courseSeriesId the course series ID of this course series
	*/
	@Override
	public void setCourseSeriesId(long courseSeriesId) {
		_courseSeries.setCourseSeriesId(courseSeriesId);
	}

	/**
	* Returns the group ID of this course series.
	*
	* @return the group ID of this course series
	*/
	@Override
	public long getGroupId() {
		return _courseSeries.getGroupId();
	}

	/**
	* Sets the group ID of this course series.
	*
	* @param groupId the group ID of this course series
	*/
	@Override
	public void setGroupId(long groupId) {
		_courseSeries.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this course series.
	*
	* @return the company ID of this course series
	*/
	@Override
	public long getCompanyId() {
		return _courseSeries.getCompanyId();
	}

	/**
	* Sets the company ID of this course series.
	*
	* @param companyId the company ID of this course series
	*/
	@Override
	public void setCompanyId(long companyId) {
		_courseSeries.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this course series.
	*
	* @return the user ID of this course series
	*/
	@Override
	public long getUserId() {
		return _courseSeries.getUserId();
	}

	/**
	* Sets the user ID of this course series.
	*
	* @param userId the user ID of this course series
	*/
	@Override
	public void setUserId(long userId) {
		_courseSeries.setUserId(userId);
	}

	/**
	* Returns the user uuid of this course series.
	*
	* @return the user uuid of this course series
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeries.getUserUuid();
	}

	/**
	* Sets the user uuid of this course series.
	*
	* @param userUuid the user uuid of this course series
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_courseSeries.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this course series.
	*
	* @return the user name of this course series
	*/
	@Override
	public java.lang.String getUserName() {
		return _courseSeries.getUserName();
	}

	/**
	* Sets the user name of this course series.
	*
	* @param userName the user name of this course series
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_courseSeries.setUserName(userName);
	}

	/**
	* Returns the create date of this course series.
	*
	* @return the create date of this course series
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _courseSeries.getCreateDate();
	}

	/**
	* Sets the create date of this course series.
	*
	* @param createDate the create date of this course series
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_courseSeries.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this course series.
	*
	* @return the modified date of this course series
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _courseSeries.getModifiedDate();
	}

	/**
	* Sets the modified date of this course series.
	*
	* @param modifiedDate the modified date of this course series
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_courseSeries.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the course ID of this course series.
	*
	* @return the course ID of this course series
	*/
	@Override
	public long getCourseId() {
		return _courseSeries.getCourseId();
	}

	/**
	* Sets the course ID of this course series.
	*
	* @param courseId the course ID of this course series
	*/
	@Override
	public void setCourseId(long courseId) {
		_courseSeries.setCourseId(courseId);
	}

	/**
	* Returns the location ID of this course series.
	*
	* @return the location ID of this course series
	*/
	@Override
	public long getLocationId() {
		return _courseSeries.getLocationId();
	}

	/**
	* Sets the location ID of this course series.
	*
	* @param locationId the location ID of this course series
	*/
	@Override
	public void setLocationId(long locationId) {
		_courseSeries.setLocationId(locationId);
	}

	/**
	* Returns the type of this course series.
	*
	* @return the type of this course series
	*/
	@Override
	public java.lang.String getType() {
		return _courseSeries.getType();
	}

	/**
	* Sets the type of this course series.
	*
	* @param type the type of this course series
	*/
	@Override
	public void setType(java.lang.String type) {
		_courseSeries.setType(type);
	}

	/**
	* Returns the start date of this course series.
	*
	* @return the start date of this course series
	*/
	@Override
	public java.util.Date getStartDate() {
		return _courseSeries.getStartDate();
	}

	/**
	* Sets the start date of this course series.
	*
	* @param startDate the start date of this course series
	*/
	@Override
	public void setStartDate(java.util.Date startDate) {
		_courseSeries.setStartDate(startDate);
	}

	/**
	* Returns the end date of this course series.
	*
	* @return the end date of this course series
	*/
	@Override
	public java.util.Date getEndDate() {
		return _courseSeries.getEndDate();
	}

	/**
	* Sets the end date of this course series.
	*
	* @param endDate the end date of this course series
	*/
	@Override
	public void setEndDate(java.util.Date endDate) {
		_courseSeries.setEndDate(endDate);
	}

	/**
	* Returns the publishing status of this course series.
	*
	* @return the publishing status of this course series
	*/
	@Override
	public java.lang.String getPublishingStatus() {
		return _courseSeries.getPublishingStatus();
	}

	/**
	* Sets the publishing status of this course series.
	*
	* @param publishingStatus the publishing status of this course series
	*/
	@Override
	public void setPublishingStatus(java.lang.String publishingStatus) {
		_courseSeries.setPublishingStatus(publishingStatus);
	}

	/**
	* Returns the max no stud reg of this course series.
	*
	* @return the max no stud reg of this course series
	*/
	@Override
	public long getMaxNoStudReg() {
		return _courseSeries.getMaxNoStudReg();
	}

	/**
	* Sets the max no stud reg of this course series.
	*
	* @param maxNoStudReg the max no stud reg of this course series
	*/
	@Override
	public void setMaxNoStudReg(long maxNoStudReg) {
		_courseSeries.setMaxNoStudReg(maxNoStudReg);
	}

	/**
	* Returns the series count of this course series.
	*
	* @return the series count of this course series
	*/
	@Override
	public long getSeriesCount() {
		return _courseSeries.getSeriesCount();
	}

	/**
	* Sets the series count of this course series.
	*
	* @param seriesCount the series count of this course series
	*/
	@Override
	public void setSeriesCount(long seriesCount) {
		_courseSeries.setSeriesCount(seriesCount);
	}

	/**
	* Returns the course series code of this course series.
	*
	* @return the course series code of this course series
	*/
	@Override
	public java.lang.String getCourseSeriesCode() {
		return _courseSeries.getCourseSeriesCode();
	}

	/**
	* Sets the course series code of this course series.
	*
	* @param courseSeriesCode the course series code of this course series
	*/
	@Override
	public void setCourseSeriesCode(java.lang.String courseSeriesCode) {
		_courseSeries.setCourseSeriesCode(courseSeriesCode);
	}

	/**
	* Returns the course series event code of this course series.
	*
	* @return the course series event code of this course series
	*/
	@Override
	public java.lang.String getCourseSeriesEventCode() {
		return _courseSeries.getCourseSeriesEventCode();
	}

	/**
	* Sets the course series event code of this course series.
	*
	* @param courseSeriesEventCode the course series event code of this course series
	*/
	@Override
	public void setCourseSeriesEventCode(java.lang.String courseSeriesEventCode) {
		_courseSeries.setCourseSeriesEventCode(courseSeriesEventCode);
	}

	/**
	* Returns the flag to list data of this course series.
	*
	* @return the flag to list data of this course series
	*/
	@Override
	public int getFlagToListData() {
		return _courseSeries.getFlagToListData();
	}

	/**
	* Sets the flag to list data of this course series.
	*
	* @param flagToListData the flag to list data of this course series
	*/
	@Override
	public void setFlagToListData(int flagToListData) {
		_courseSeries.setFlagToListData(flagToListData);
	}

	/**
	* Returns the flag to chk event creation of this course series.
	*
	* @return the flag to chk event creation of this course series
	*/
	@Override
	public int getFlagToChkEventCreation() {
		return _courseSeries.getFlagToChkEventCreation();
	}

	/**
	* Sets the flag to chk event creation of this course series.
	*
	* @param flagToChkEventCreation the flag to chk event creation of this course series
	*/
	@Override
	public void setFlagToChkEventCreation(int flagToChkEventCreation) {
		_courseSeries.setFlagToChkEventCreation(flagToChkEventCreation);
	}

	/**
	* Returns the s month of this course series.
	*
	* @return the s month of this course series
	*/
	@Override
	public java.lang.String getSMonth() {
		return _courseSeries.getSMonth();
	}

	/**
	* Sets the s month of this course series.
	*
	* @param sMonth the s month of this course series
	*/
	@Override
	public void setSMonth(java.lang.String sMonth) {
		_courseSeries.setSMonth(sMonth);
	}

	/**
	* Returns the s day of this course series.
	*
	* @return the s day of this course series
	*/
	@Override
	public int getSDay() {
		return _courseSeries.getSDay();
	}

	/**
	* Sets the s day of this course series.
	*
	* @param sDay the s day of this course series
	*/
	@Override
	public void setSDay(int sDay) {
		_courseSeries.setSDay(sDay);
	}

	/**
	* Returns the e month of this course series.
	*
	* @return the e month of this course series
	*/
	@Override
	public java.lang.String getEMonth() {
		return _courseSeries.getEMonth();
	}

	/**
	* Sets the e month of this course series.
	*
	* @param eMonth the e month of this course series
	*/
	@Override
	public void setEMonth(java.lang.String eMonth) {
		_courseSeries.setEMonth(eMonth);
	}

	/**
	* Returns the e day of this course series.
	*
	* @return the e day of this course series
	*/
	@Override
	public int getEDay() {
		return _courseSeries.getEDay();
	}

	/**
	* Sets the e day of this course series.
	*
	* @param eDay the e day of this course series
	*/
	@Override
	public void setEDay(int eDay) {
		_courseSeries.setEDay(eDay);
	}

	@Override
	public boolean isNew() {
		return _courseSeries.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_courseSeries.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _courseSeries.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_courseSeries.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _courseSeries.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _courseSeries.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_courseSeries.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _courseSeries.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_courseSeries.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_courseSeries.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_courseSeries.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CourseSeriesWrapper((CourseSeries)_courseSeries.clone());
	}

	@Override
	public int compareTo(com.ocms.course.model.CourseSeries courseSeries) {
		return _courseSeries.compareTo(courseSeries);
	}

	@Override
	public int hashCode() {
		return _courseSeries.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ocms.course.model.CourseSeries> toCacheModel() {
		return _courseSeries.toCacheModel();
	}

	@Override
	public com.ocms.course.model.CourseSeries toEscapedModel() {
		return new CourseSeriesWrapper(_courseSeries.toEscapedModel());
	}

	@Override
	public com.ocms.course.model.CourseSeries toUnescapedModel() {
		return new CourseSeriesWrapper(_courseSeries.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _courseSeries.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _courseSeries.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_courseSeries.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CourseSeriesWrapper)) {
			return false;
		}

		CourseSeriesWrapper courseSeriesWrapper = (CourseSeriesWrapper)obj;

		if (Validator.equals(_courseSeries, courseSeriesWrapper._courseSeries)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CourseSeries getWrappedCourseSeries() {
		return _courseSeries;
	}

	@Override
	public CourseSeries getWrappedModel() {
		return _courseSeries;
	}

	@Override
	public void resetOriginalValues() {
		_courseSeries.resetOriginalValues();
	}

	private CourseSeries _courseSeries;
}