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
 * This class is used by SOAP remote services, specifically {@link com.ocms.course.service.http.PricingServiceSoap}.
 *
 * @author doraraj
 * @see com.ocms.course.service.http.PricingServiceSoap
 * @generated
 */
public class PricingSoap implements Serializable {
	public static PricingSoap toSoapModel(Pricing model) {
		PricingSoap soapModel = new PricingSoap();

		soapModel.setPricingId(model.getPricingId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setLocationId(model.getLocationId());
		soapModel.setCourseId(model.getCourseId());
		soapModel.setPackageId(model.getPackageId());
		soapModel.setDeposit(model.getDeposit());
		soapModel.setPrice(model.getPrice());
		soapModel.setCurrency(model.getCurrency());
		soapModel.setEffectiveDate(model.getEffectiveDate());

		return soapModel;
	}

	public static PricingSoap[] toSoapModels(Pricing[] models) {
		PricingSoap[] soapModels = new PricingSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PricingSoap[][] toSoapModels(Pricing[][] models) {
		PricingSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PricingSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PricingSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PricingSoap[] toSoapModels(List<Pricing> models) {
		List<PricingSoap> soapModels = new ArrayList<PricingSoap>(models.size());

		for (Pricing model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PricingSoap[soapModels.size()]);
	}

	public PricingSoap() {
	}

	public long getPrimaryKey() {
		return _pricingId;
	}

	public void setPrimaryKey(long pk) {
		setPricingId(pk);
	}

	public long getPricingId() {
		return _pricingId;
	}

	public void setPricingId(long pricingId) {
		_pricingId = pricingId;
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

	public int getLocationId() {
		return _locationId;
	}

	public void setLocationId(int locationId) {
		_locationId = locationId;
	}

	public int getCourseId() {
		return _courseId;
	}

	public void setCourseId(int courseId) {
		_courseId = courseId;
	}

	public int getPackageId() {
		return _packageId;
	}

	public void setPackageId(int packageId) {
		_packageId = packageId;
	}

	public int getDeposit() {
		return _deposit;
	}

	public void setDeposit(int deposit) {
		_deposit = deposit;
	}

	public int getPrice() {
		return _price;
	}

	public void setPrice(int price) {
		_price = price;
	}

	public String getCurrency() {
		return _currency;
	}

	public void setCurrency(String currency) {
		_currency = currency;
	}

	public Date getEffectiveDate() {
		return _effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		_effectiveDate = effectiveDate;
	}

	private long _pricingId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _locationId;
	private int _courseId;
	private int _packageId;
	private int _deposit;
	private int _price;
	private String _currency;
	private Date _effectiveDate;
}