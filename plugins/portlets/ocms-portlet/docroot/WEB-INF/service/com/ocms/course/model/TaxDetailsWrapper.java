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
 * This class is a wrapper for {@link TaxDetails}.
 * </p>
 *
 * @author doraraj
 * @see TaxDetails
 * @generated
 */
public class TaxDetailsWrapper implements TaxDetails, ModelWrapper<TaxDetails> {
	public TaxDetailsWrapper(TaxDetails taxDetails) {
		_taxDetails = taxDetails;
	}

	@Override
	public Class<?> getModelClass() {
		return TaxDetails.class;
	}

	@Override
	public String getModelClassName() {
		return TaxDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("taxDetailsId", getTaxDetailsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("country", getCountry());
		attributes.put("taxTypeId", getTaxTypeId());
		attributes.put("effectiveFromDate", getEffectiveFromDate());
		attributes.put("effectiveToDate", getEffectiveToDate());
		attributes.put("active", getActive());
		attributes.put("taxPercent", getTaxPercent());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long taxDetailsId = (Long)attributes.get("taxDetailsId");

		if (taxDetailsId != null) {
			setTaxDetailsId(taxDetailsId);
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

		String country = (String)attributes.get("country");

		if (country != null) {
			setCountry(country);
		}

		Long taxTypeId = (Long)attributes.get("taxTypeId");

		if (taxTypeId != null) {
			setTaxTypeId(taxTypeId);
		}

		Date effectiveFromDate = (Date)attributes.get("effectiveFromDate");

		if (effectiveFromDate != null) {
			setEffectiveFromDate(effectiveFromDate);
		}

		Date effectiveToDate = (Date)attributes.get("effectiveToDate");

		if (effectiveToDate != null) {
			setEffectiveToDate(effectiveToDate);
		}

		Integer active = (Integer)attributes.get("active");

		if (active != null) {
			setActive(active);
		}

		Integer taxPercent = (Integer)attributes.get("taxPercent");

		if (taxPercent != null) {
			setTaxPercent(taxPercent);
		}
	}

	/**
	* Returns the primary key of this tax details.
	*
	* @return the primary key of this tax details
	*/
	@Override
	public long getPrimaryKey() {
		return _taxDetails.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tax details.
	*
	* @param primaryKey the primary key of this tax details
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_taxDetails.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the tax details ID of this tax details.
	*
	* @return the tax details ID of this tax details
	*/
	@Override
	public long getTaxDetailsId() {
		return _taxDetails.getTaxDetailsId();
	}

	/**
	* Sets the tax details ID of this tax details.
	*
	* @param taxDetailsId the tax details ID of this tax details
	*/
	@Override
	public void setTaxDetailsId(long taxDetailsId) {
		_taxDetails.setTaxDetailsId(taxDetailsId);
	}

	/**
	* Returns the group ID of this tax details.
	*
	* @return the group ID of this tax details
	*/
	@Override
	public long getGroupId() {
		return _taxDetails.getGroupId();
	}

	/**
	* Sets the group ID of this tax details.
	*
	* @param groupId the group ID of this tax details
	*/
	@Override
	public void setGroupId(long groupId) {
		_taxDetails.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this tax details.
	*
	* @return the company ID of this tax details
	*/
	@Override
	public long getCompanyId() {
		return _taxDetails.getCompanyId();
	}

	/**
	* Sets the company ID of this tax details.
	*
	* @param companyId the company ID of this tax details
	*/
	@Override
	public void setCompanyId(long companyId) {
		_taxDetails.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this tax details.
	*
	* @return the user ID of this tax details
	*/
	@Override
	public long getUserId() {
		return _taxDetails.getUserId();
	}

	/**
	* Sets the user ID of this tax details.
	*
	* @param userId the user ID of this tax details
	*/
	@Override
	public void setUserId(long userId) {
		_taxDetails.setUserId(userId);
	}

	/**
	* Returns the user uuid of this tax details.
	*
	* @return the user uuid of this tax details
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetails.getUserUuid();
	}

	/**
	* Sets the user uuid of this tax details.
	*
	* @param userUuid the user uuid of this tax details
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_taxDetails.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this tax details.
	*
	* @return the user name of this tax details
	*/
	@Override
	public java.lang.String getUserName() {
		return _taxDetails.getUserName();
	}

	/**
	* Sets the user name of this tax details.
	*
	* @param userName the user name of this tax details
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_taxDetails.setUserName(userName);
	}

	/**
	* Returns the create date of this tax details.
	*
	* @return the create date of this tax details
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _taxDetails.getCreateDate();
	}

	/**
	* Sets the create date of this tax details.
	*
	* @param createDate the create date of this tax details
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_taxDetails.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this tax details.
	*
	* @return the modified date of this tax details
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _taxDetails.getModifiedDate();
	}

	/**
	* Sets the modified date of this tax details.
	*
	* @param modifiedDate the modified date of this tax details
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_taxDetails.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the country of this tax details.
	*
	* @return the country of this tax details
	*/
	@Override
	public java.lang.String getCountry() {
		return _taxDetails.getCountry();
	}

	/**
	* Sets the country of this tax details.
	*
	* @param country the country of this tax details
	*/
	@Override
	public void setCountry(java.lang.String country) {
		_taxDetails.setCountry(country);
	}

	/**
	* Returns the tax type ID of this tax details.
	*
	* @return the tax type ID of this tax details
	*/
	@Override
	public long getTaxTypeId() {
		return _taxDetails.getTaxTypeId();
	}

	/**
	* Sets the tax type ID of this tax details.
	*
	* @param taxTypeId the tax type ID of this tax details
	*/
	@Override
	public void setTaxTypeId(long taxTypeId) {
		_taxDetails.setTaxTypeId(taxTypeId);
	}

	/**
	* Returns the effective from date of this tax details.
	*
	* @return the effective from date of this tax details
	*/
	@Override
	public java.util.Date getEffectiveFromDate() {
		return _taxDetails.getEffectiveFromDate();
	}

	/**
	* Sets the effective from date of this tax details.
	*
	* @param effectiveFromDate the effective from date of this tax details
	*/
	@Override
	public void setEffectiveFromDate(java.util.Date effectiveFromDate) {
		_taxDetails.setEffectiveFromDate(effectiveFromDate);
	}

	/**
	* Returns the effective to date of this tax details.
	*
	* @return the effective to date of this tax details
	*/
	@Override
	public java.util.Date getEffectiveToDate() {
		return _taxDetails.getEffectiveToDate();
	}

	/**
	* Sets the effective to date of this tax details.
	*
	* @param effectiveToDate the effective to date of this tax details
	*/
	@Override
	public void setEffectiveToDate(java.util.Date effectiveToDate) {
		_taxDetails.setEffectiveToDate(effectiveToDate);
	}

	/**
	* Returns the active of this tax details.
	*
	* @return the active of this tax details
	*/
	@Override
	public int getActive() {
		return _taxDetails.getActive();
	}

	/**
	* Sets the active of this tax details.
	*
	* @param active the active of this tax details
	*/
	@Override
	public void setActive(int active) {
		_taxDetails.setActive(active);
	}

	/**
	* Returns the tax percent of this tax details.
	*
	* @return the tax percent of this tax details
	*/
	@Override
	public int getTaxPercent() {
		return _taxDetails.getTaxPercent();
	}

	/**
	* Sets the tax percent of this tax details.
	*
	* @param taxPercent the tax percent of this tax details
	*/
	@Override
	public void setTaxPercent(int taxPercent) {
		_taxDetails.setTaxPercent(taxPercent);
	}

	@Override
	public boolean isNew() {
		return _taxDetails.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_taxDetails.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _taxDetails.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_taxDetails.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _taxDetails.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _taxDetails.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_taxDetails.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _taxDetails.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_taxDetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_taxDetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_taxDetails.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TaxDetailsWrapper((TaxDetails)_taxDetails.clone());
	}

	@Override
	public int compareTo(com.ocms.course.model.TaxDetails taxDetails) {
		return _taxDetails.compareTo(taxDetails);
	}

	@Override
	public int hashCode() {
		return _taxDetails.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ocms.course.model.TaxDetails> toCacheModel() {
		return _taxDetails.toCacheModel();
	}

	@Override
	public com.ocms.course.model.TaxDetails toEscapedModel() {
		return new TaxDetailsWrapper(_taxDetails.toEscapedModel());
	}

	@Override
	public com.ocms.course.model.TaxDetails toUnescapedModel() {
		return new TaxDetailsWrapper(_taxDetails.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _taxDetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _taxDetails.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_taxDetails.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TaxDetailsWrapper)) {
			return false;
		}

		TaxDetailsWrapper taxDetailsWrapper = (TaxDetailsWrapper)obj;

		if (Validator.equals(_taxDetails, taxDetailsWrapper._taxDetails)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TaxDetails getWrappedTaxDetails() {
		return _taxDetails;
	}

	@Override
	public TaxDetails getWrappedModel() {
		return _taxDetails;
	}

	@Override
	public void resetOriginalValues() {
		_taxDetails.resetOriginalValues();
	}

	private TaxDetails _taxDetails;
}