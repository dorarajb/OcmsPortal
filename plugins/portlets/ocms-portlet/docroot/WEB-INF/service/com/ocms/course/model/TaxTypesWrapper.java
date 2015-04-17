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
 * This class is a wrapper for {@link TaxTypes}.
 * </p>
 *
 * @author doraraj
 * @see TaxTypes
 * @generated
 */
public class TaxTypesWrapper implements TaxTypes, ModelWrapper<TaxTypes> {
	public TaxTypesWrapper(TaxTypes taxTypes) {
		_taxTypes = taxTypes;
	}

	@Override
	public Class<?> getModelClass() {
		return TaxTypes.class;
	}

	@Override
	public String getModelClassName() {
		return TaxTypes.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("taxTypesId", getTaxTypesId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("taxName", getTaxName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long taxTypesId = (Long)attributes.get("taxTypesId");

		if (taxTypesId != null) {
			setTaxTypesId(taxTypesId);
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

		String taxName = (String)attributes.get("taxName");

		if (taxName != null) {
			setTaxName(taxName);
		}
	}

	/**
	* Returns the primary key of this tax types.
	*
	* @return the primary key of this tax types
	*/
	@Override
	public long getPrimaryKey() {
		return _taxTypes.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tax types.
	*
	* @param primaryKey the primary key of this tax types
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_taxTypes.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the tax types ID of this tax types.
	*
	* @return the tax types ID of this tax types
	*/
	@Override
	public long getTaxTypesId() {
		return _taxTypes.getTaxTypesId();
	}

	/**
	* Sets the tax types ID of this tax types.
	*
	* @param taxTypesId the tax types ID of this tax types
	*/
	@Override
	public void setTaxTypesId(long taxTypesId) {
		_taxTypes.setTaxTypesId(taxTypesId);
	}

	/**
	* Returns the group ID of this tax types.
	*
	* @return the group ID of this tax types
	*/
	@Override
	public long getGroupId() {
		return _taxTypes.getGroupId();
	}

	/**
	* Sets the group ID of this tax types.
	*
	* @param groupId the group ID of this tax types
	*/
	@Override
	public void setGroupId(long groupId) {
		_taxTypes.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this tax types.
	*
	* @return the company ID of this tax types
	*/
	@Override
	public long getCompanyId() {
		return _taxTypes.getCompanyId();
	}

	/**
	* Sets the company ID of this tax types.
	*
	* @param companyId the company ID of this tax types
	*/
	@Override
	public void setCompanyId(long companyId) {
		_taxTypes.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this tax types.
	*
	* @return the user ID of this tax types
	*/
	@Override
	public long getUserId() {
		return _taxTypes.getUserId();
	}

	/**
	* Sets the user ID of this tax types.
	*
	* @param userId the user ID of this tax types
	*/
	@Override
	public void setUserId(long userId) {
		_taxTypes.setUserId(userId);
	}

	/**
	* Returns the user uuid of this tax types.
	*
	* @return the user uuid of this tax types
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxTypes.getUserUuid();
	}

	/**
	* Sets the user uuid of this tax types.
	*
	* @param userUuid the user uuid of this tax types
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_taxTypes.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this tax types.
	*
	* @return the user name of this tax types
	*/
	@Override
	public java.lang.String getUserName() {
		return _taxTypes.getUserName();
	}

	/**
	* Sets the user name of this tax types.
	*
	* @param userName the user name of this tax types
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_taxTypes.setUserName(userName);
	}

	/**
	* Returns the create date of this tax types.
	*
	* @return the create date of this tax types
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _taxTypes.getCreateDate();
	}

	/**
	* Sets the create date of this tax types.
	*
	* @param createDate the create date of this tax types
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_taxTypes.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this tax types.
	*
	* @return the modified date of this tax types
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _taxTypes.getModifiedDate();
	}

	/**
	* Sets the modified date of this tax types.
	*
	* @param modifiedDate the modified date of this tax types
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_taxTypes.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the tax name of this tax types.
	*
	* @return the tax name of this tax types
	*/
	@Override
	public java.lang.String getTaxName() {
		return _taxTypes.getTaxName();
	}

	/**
	* Sets the tax name of this tax types.
	*
	* @param taxName the tax name of this tax types
	*/
	@Override
	public void setTaxName(java.lang.String taxName) {
		_taxTypes.setTaxName(taxName);
	}

	@Override
	public boolean isNew() {
		return _taxTypes.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_taxTypes.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _taxTypes.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_taxTypes.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _taxTypes.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _taxTypes.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_taxTypes.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _taxTypes.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_taxTypes.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_taxTypes.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_taxTypes.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TaxTypesWrapper((TaxTypes)_taxTypes.clone());
	}

	@Override
	public int compareTo(com.ocms.course.model.TaxTypes taxTypes) {
		return _taxTypes.compareTo(taxTypes);
	}

	@Override
	public int hashCode() {
		return _taxTypes.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ocms.course.model.TaxTypes> toCacheModel() {
		return _taxTypes.toCacheModel();
	}

	@Override
	public com.ocms.course.model.TaxTypes toEscapedModel() {
		return new TaxTypesWrapper(_taxTypes.toEscapedModel());
	}

	@Override
	public com.ocms.course.model.TaxTypes toUnescapedModel() {
		return new TaxTypesWrapper(_taxTypes.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _taxTypes.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _taxTypes.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_taxTypes.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TaxTypesWrapper)) {
			return false;
		}

		TaxTypesWrapper taxTypesWrapper = (TaxTypesWrapper)obj;

		if (Validator.equals(_taxTypes, taxTypesWrapper._taxTypes)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TaxTypes getWrappedTaxTypes() {
		return _taxTypes;
	}

	@Override
	public TaxTypes getWrappedModel() {
		return _taxTypes;
	}

	@Override
	public void resetOriginalValues() {
		_taxTypes.resetOriginalValues();
	}

	private TaxTypes _taxTypes;
}