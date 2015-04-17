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
 * This class is used by SOAP remote services, specifically {@link com.ocms.course.service.http.OffersAndDeductionsServiceSoap}.
 *
 * @author doraraj
 * @see com.ocms.course.service.http.OffersAndDeductionsServiceSoap
 * @generated
 */
public class OffersAndDeductionsSoap implements Serializable {
	public static OffersAndDeductionsSoap toSoapModel(OffersAndDeductions model) {
		OffersAndDeductionsSoap soapModel = new OffersAndDeductionsSoap();

		soapModel.setId(model.getId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCode(model.getCode());
		soapModel.setDescription(model.getDescription());
		soapModel.setAmount(model.getAmount());
		soapModel.setActive(model.getActive());
		soapModel.setEffectiveFromDate(model.getEffectiveFromDate());
		soapModel.setEffectivetoDate(model.getEffectivetoDate());
		soapModel.setType(model.getType());

		return soapModel;
	}

	public static OffersAndDeductionsSoap[] toSoapModels(
		OffersAndDeductions[] models) {
		OffersAndDeductionsSoap[] soapModels = new OffersAndDeductionsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OffersAndDeductionsSoap[][] toSoapModels(
		OffersAndDeductions[][] models) {
		OffersAndDeductionsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OffersAndDeductionsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OffersAndDeductionsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OffersAndDeductionsSoap[] toSoapModels(
		List<OffersAndDeductions> models) {
		List<OffersAndDeductionsSoap> soapModels = new ArrayList<OffersAndDeductionsSoap>(models.size());

		for (OffersAndDeductions model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OffersAndDeductionsSoap[soapModels.size()]);
	}

	public OffersAndDeductionsSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
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

	public String getCode() {
		return _code;
	}

	public void setCode(String code) {
		_code = code;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public long getAmount() {
		return _amount;
	}

	public void setAmount(long amount) {
		_amount = amount;
	}

	public int getActive() {
		return _active;
	}

	public void setActive(int active) {
		_active = active;
	}

	public Date getEffectiveFromDate() {
		return _effectiveFromDate;
	}

	public void setEffectiveFromDate(Date effectiveFromDate) {
		_effectiveFromDate = effectiveFromDate;
	}

	public Date getEffectivetoDate() {
		return _effectivetoDate;
	}

	public void setEffectivetoDate(Date effectivetoDate) {
		_effectivetoDate = effectivetoDate;
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	private long _id;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _code;
	private String _description;
	private long _amount;
	private int _active;
	private Date _effectiveFromDate;
	private Date _effectivetoDate;
	private String _type;
}