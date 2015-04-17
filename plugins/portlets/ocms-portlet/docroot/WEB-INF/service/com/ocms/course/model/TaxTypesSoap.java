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
 * This class is used by SOAP remote services, specifically {@link com.ocms.course.service.http.TaxTypesServiceSoap}.
 *
 * @author doraraj
 * @see com.ocms.course.service.http.TaxTypesServiceSoap
 * @generated
 */
public class TaxTypesSoap implements Serializable {
	public static TaxTypesSoap toSoapModel(TaxTypes model) {
		TaxTypesSoap soapModel = new TaxTypesSoap();

		soapModel.setTaxTypesId(model.getTaxTypesId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTaxName(model.getTaxName());

		return soapModel;
	}

	public static TaxTypesSoap[] toSoapModels(TaxTypes[] models) {
		TaxTypesSoap[] soapModels = new TaxTypesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TaxTypesSoap[][] toSoapModels(TaxTypes[][] models) {
		TaxTypesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TaxTypesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TaxTypesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TaxTypesSoap[] toSoapModels(List<TaxTypes> models) {
		List<TaxTypesSoap> soapModels = new ArrayList<TaxTypesSoap>(models.size());

		for (TaxTypes model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TaxTypesSoap[soapModels.size()]);
	}

	public TaxTypesSoap() {
	}

	public long getPrimaryKey() {
		return _taxTypesId;
	}

	public void setPrimaryKey(long pk) {
		setTaxTypesId(pk);
	}

	public long getTaxTypesId() {
		return _taxTypesId;
	}

	public void setTaxTypesId(long taxTypesId) {
		_taxTypesId = taxTypesId;
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

	public String getTaxName() {
		return _taxName;
	}

	public void setTaxName(String taxName) {
		_taxName = taxName;
	}

	private long _taxTypesId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _taxName;
}