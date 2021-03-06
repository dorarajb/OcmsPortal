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
 * This class is used by SOAP remote services, specifically {@link com.ocms.course.service.http.CoursePackageServiceSoap}.
 *
 * @author doraraj
 * @see com.ocms.course.service.http.CoursePackageServiceSoap
 * @generated
 */
public class CoursePackageSoap implements Serializable {
	public static CoursePackageSoap toSoapModel(CoursePackage model) {
		CoursePackageSoap soapModel = new CoursePackageSoap();

		soapModel.setCoursePackageId(model.getCoursePackageId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setCode(model.getCode());

		return soapModel;
	}

	public static CoursePackageSoap[] toSoapModels(CoursePackage[] models) {
		CoursePackageSoap[] soapModels = new CoursePackageSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CoursePackageSoap[][] toSoapModels(CoursePackage[][] models) {
		CoursePackageSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CoursePackageSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CoursePackageSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CoursePackageSoap[] toSoapModels(List<CoursePackage> models) {
		List<CoursePackageSoap> soapModels = new ArrayList<CoursePackageSoap>(models.size());

		for (CoursePackage model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CoursePackageSoap[soapModels.size()]);
	}

	public CoursePackageSoap() {
	}

	public long getPrimaryKey() {
		return _coursePackageId;
	}

	public void setPrimaryKey(long pk) {
		setCoursePackageId(pk);
	}

	public long getCoursePackageId() {
		return _coursePackageId;
	}

	public void setCoursePackageId(long coursePackageId) {
		_coursePackageId = coursePackageId;
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

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getCode() {
		return _code;
	}

	public void setCode(String code) {
		_code = code;
	}

	private long _coursePackageId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _code;
}