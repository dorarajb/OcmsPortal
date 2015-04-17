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
 * This class is used by SOAP remote services, specifically {@link com.ocms.course.service.http.DiscountServiceSoap}.
 *
 * @author doraraj
 * @see com.ocms.course.service.http.DiscountServiceSoap
 * @generated
 */
public class DiscountSoap implements Serializable {
	public static DiscountSoap toSoapModel(Discount model) {
		DiscountSoap soapModel = new DiscountSoap();

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

		return soapModel;
	}

	public static DiscountSoap[] toSoapModels(Discount[] models) {
		DiscountSoap[] soapModels = new DiscountSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DiscountSoap[][] toSoapModels(Discount[][] models) {
		DiscountSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DiscountSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DiscountSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DiscountSoap[] toSoapModels(List<Discount> models) {
		List<DiscountSoap> soapModels = new ArrayList<DiscountSoap>(models.size());

		for (Discount model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DiscountSoap[soapModels.size()]);
	}

	public DiscountSoap() {
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
}