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
 * This class is used by SOAP remote services, specifically {@link com.ocms.course.service.http.TaxDetailsServiceSoap}.
 *
 * @author doraraj
 * @see com.ocms.course.service.http.TaxDetailsServiceSoap
 * @generated
 */
public class TaxDetailsSoap implements Serializable {
	public static TaxDetailsSoap toSoapModel(TaxDetails model) {
		TaxDetailsSoap soapModel = new TaxDetailsSoap();

		soapModel.setTaxDetailsId(model.getTaxDetailsId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCountry(model.getCountry());
		soapModel.setTaxTypeId(model.getTaxTypeId());
		soapModel.setEffectiveFromDate(model.getEffectiveFromDate());
		soapModel.setEffectiveToDate(model.getEffectiveToDate());
		soapModel.setActive(model.getActive());
		soapModel.setTaxPercent(model.getTaxPercent());

		return soapModel;
	}

	public static TaxDetailsSoap[] toSoapModels(TaxDetails[] models) {
		TaxDetailsSoap[] soapModels = new TaxDetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TaxDetailsSoap[][] toSoapModels(TaxDetails[][] models) {
		TaxDetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TaxDetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TaxDetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TaxDetailsSoap[] toSoapModels(List<TaxDetails> models) {
		List<TaxDetailsSoap> soapModels = new ArrayList<TaxDetailsSoap>(models.size());

		for (TaxDetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TaxDetailsSoap[soapModels.size()]);
	}

	public TaxDetailsSoap() {
	}

	public long getPrimaryKey() {
		return _taxDetailsId;
	}

	public void setPrimaryKey(long pk) {
		setTaxDetailsId(pk);
	}

	public long getTaxDetailsId() {
		return _taxDetailsId;
	}

	public void setTaxDetailsId(long taxDetailsId) {
		_taxDetailsId = taxDetailsId;
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

	public String getCountry() {
		return _country;
	}

	public void setCountry(String country) {
		_country = country;
	}

	public long getTaxTypeId() {
		return _taxTypeId;
	}

	public void setTaxTypeId(long taxTypeId) {
		_taxTypeId = taxTypeId;
	}

	public Date getEffectiveFromDate() {
		return _effectiveFromDate;
	}

	public void setEffectiveFromDate(Date effectiveFromDate) {
		_effectiveFromDate = effectiveFromDate;
	}

	public Date getEffectiveToDate() {
		return _effectiveToDate;
	}

	public void setEffectiveToDate(Date effectiveToDate) {
		_effectiveToDate = effectiveToDate;
	}

	public int getActive() {
		return _active;
	}

	public void setActive(int active) {
		_active = active;
	}

	public int getTaxPercent() {
		return _taxPercent;
	}

	public void setTaxPercent(int taxPercent) {
		_taxPercent = taxPercent;
	}

	private long _taxDetailsId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _country;
	private long _taxTypeId;
	private Date _effectiveFromDate;
	private Date _effectiveToDate;
	private int _active;
	private int _taxPercent;
}