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
 * This class is a wrapper for {@link CoursePackage}.
 * </p>
 *
 * @author doraraj
 * @see CoursePackage
 * @generated
 */
public class CoursePackageWrapper implements CoursePackage,
	ModelWrapper<CoursePackage> {
	public CoursePackageWrapper(CoursePackage coursePackage) {
		_coursePackage = coursePackage;
	}

	@Override
	public Class<?> getModelClass() {
		return CoursePackage.class;
	}

	@Override
	public String getModelClassName() {
		return CoursePackage.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("coursePackageId", getCoursePackageId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("code", getCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long coursePackageId = (Long)attributes.get("coursePackageId");

		if (coursePackageId != null) {
			setCoursePackageId(coursePackageId);
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}
	}

	/**
	* Returns the primary key of this course package.
	*
	* @return the primary key of this course package
	*/
	@Override
	public long getPrimaryKey() {
		return _coursePackage.getPrimaryKey();
	}

	/**
	* Sets the primary key of this course package.
	*
	* @param primaryKey the primary key of this course package
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_coursePackage.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the course package ID of this course package.
	*
	* @return the course package ID of this course package
	*/
	@Override
	public long getCoursePackageId() {
		return _coursePackage.getCoursePackageId();
	}

	/**
	* Sets the course package ID of this course package.
	*
	* @param coursePackageId the course package ID of this course package
	*/
	@Override
	public void setCoursePackageId(long coursePackageId) {
		_coursePackage.setCoursePackageId(coursePackageId);
	}

	/**
	* Returns the group ID of this course package.
	*
	* @return the group ID of this course package
	*/
	@Override
	public long getGroupId() {
		return _coursePackage.getGroupId();
	}

	/**
	* Sets the group ID of this course package.
	*
	* @param groupId the group ID of this course package
	*/
	@Override
	public void setGroupId(long groupId) {
		_coursePackage.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this course package.
	*
	* @return the company ID of this course package
	*/
	@Override
	public long getCompanyId() {
		return _coursePackage.getCompanyId();
	}

	/**
	* Sets the company ID of this course package.
	*
	* @param companyId the company ID of this course package
	*/
	@Override
	public void setCompanyId(long companyId) {
		_coursePackage.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this course package.
	*
	* @return the user ID of this course package
	*/
	@Override
	public long getUserId() {
		return _coursePackage.getUserId();
	}

	/**
	* Sets the user ID of this course package.
	*
	* @param userId the user ID of this course package
	*/
	@Override
	public void setUserId(long userId) {
		_coursePackage.setUserId(userId);
	}

	/**
	* Returns the user uuid of this course package.
	*
	* @return the user uuid of this course package
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _coursePackage.getUserUuid();
	}

	/**
	* Sets the user uuid of this course package.
	*
	* @param userUuid the user uuid of this course package
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_coursePackage.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this course package.
	*
	* @return the user name of this course package
	*/
	@Override
	public java.lang.String getUserName() {
		return _coursePackage.getUserName();
	}

	/**
	* Sets the user name of this course package.
	*
	* @param userName the user name of this course package
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_coursePackage.setUserName(userName);
	}

	/**
	* Returns the create date of this course package.
	*
	* @return the create date of this course package
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _coursePackage.getCreateDate();
	}

	/**
	* Sets the create date of this course package.
	*
	* @param createDate the create date of this course package
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_coursePackage.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this course package.
	*
	* @return the modified date of this course package
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _coursePackage.getModifiedDate();
	}

	/**
	* Sets the modified date of this course package.
	*
	* @param modifiedDate the modified date of this course package
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_coursePackage.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the name of this course package.
	*
	* @return the name of this course package
	*/
	@Override
	public java.lang.String getName() {
		return _coursePackage.getName();
	}

	/**
	* Sets the name of this course package.
	*
	* @param name the name of this course package
	*/
	@Override
	public void setName(java.lang.String name) {
		_coursePackage.setName(name);
	}

	/**
	* Returns the code of this course package.
	*
	* @return the code of this course package
	*/
	@Override
	public java.lang.String getCode() {
		return _coursePackage.getCode();
	}

	/**
	* Sets the code of this course package.
	*
	* @param code the code of this course package
	*/
	@Override
	public void setCode(java.lang.String code) {
		_coursePackage.setCode(code);
	}

	@Override
	public boolean isNew() {
		return _coursePackage.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_coursePackage.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _coursePackage.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_coursePackage.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _coursePackage.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _coursePackage.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_coursePackage.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _coursePackage.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_coursePackage.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_coursePackage.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_coursePackage.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CoursePackageWrapper((CoursePackage)_coursePackage.clone());
	}

	@Override
	public int compareTo(com.ocms.course.model.CoursePackage coursePackage) {
		return _coursePackage.compareTo(coursePackage);
	}

	@Override
	public int hashCode() {
		return _coursePackage.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ocms.course.model.CoursePackage> toCacheModel() {
		return _coursePackage.toCacheModel();
	}

	@Override
	public com.ocms.course.model.CoursePackage toEscapedModel() {
		return new CoursePackageWrapper(_coursePackage.toEscapedModel());
	}

	@Override
	public com.ocms.course.model.CoursePackage toUnescapedModel() {
		return new CoursePackageWrapper(_coursePackage.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _coursePackage.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _coursePackage.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_coursePackage.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CoursePackageWrapper)) {
			return false;
		}

		CoursePackageWrapper coursePackageWrapper = (CoursePackageWrapper)obj;

		if (Validator.equals(_coursePackage, coursePackageWrapper._coursePackage)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CoursePackage getWrappedCoursePackage() {
		return _coursePackage;
	}

	@Override
	public CoursePackage getWrappedModel() {
		return _coursePackage;
	}

	@Override
	public void resetOriginalValues() {
		_coursePackage.resetOriginalValues();
	}

	private CoursePackage _coursePackage;
}