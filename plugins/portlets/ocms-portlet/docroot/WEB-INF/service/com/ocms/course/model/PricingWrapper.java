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
 * This class is a wrapper for {@link Pricing}.
 * </p>
 *
 * @author doraraj
 * @see Pricing
 * @generated
 */
public class PricingWrapper implements Pricing, ModelWrapper<Pricing> {
	public PricingWrapper(Pricing pricing) {
		_pricing = pricing;
	}

	@Override
	public Class<?> getModelClass() {
		return Pricing.class;
	}

	@Override
	public String getModelClassName() {
		return Pricing.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("pricingId", getPricingId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("locationId", getLocationId());
		attributes.put("courseId", getCourseId());
		attributes.put("packageId", getPackageId());
		attributes.put("deposit", getDeposit());
		attributes.put("price", getPrice());
		attributes.put("currency", getCurrency());
		attributes.put("effectiveFromDate", getEffectiveFromDate());
		attributes.put("courseCode", getCourseCode());
		attributes.put("locationCode", getLocationCode());
		attributes.put("effectiveToDate", getEffectiveToDate());
		attributes.put("active", getActive());
		attributes.put("balanceDueParDate", getBalanceDueParDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long pricingId = (Long)attributes.get("pricingId");

		if (pricingId != null) {
			setPricingId(pricingId);
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

		Integer locationId = (Integer)attributes.get("locationId");

		if (locationId != null) {
			setLocationId(locationId);
		}

		Integer courseId = (Integer)attributes.get("courseId");

		if (courseId != null) {
			setCourseId(courseId);
		}

		Integer packageId = (Integer)attributes.get("packageId");

		if (packageId != null) {
			setPackageId(packageId);
		}

		Integer deposit = (Integer)attributes.get("deposit");

		if (deposit != null) {
			setDeposit(deposit);
		}

		Integer price = (Integer)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}

		String currency = (String)attributes.get("currency");

		if (currency != null) {
			setCurrency(currency);
		}

		Date effectiveFromDate = (Date)attributes.get("effectiveFromDate");

		if (effectiveFromDate != null) {
			setEffectiveFromDate(effectiveFromDate);
		}

		String courseCode = (String)attributes.get("courseCode");

		if (courseCode != null) {
			setCourseCode(courseCode);
		}

		String locationCode = (String)attributes.get("locationCode");

		if (locationCode != null) {
			setLocationCode(locationCode);
		}

		Date effectiveToDate = (Date)attributes.get("effectiveToDate");

		if (effectiveToDate != null) {
			setEffectiveToDate(effectiveToDate);
		}

		Integer active = (Integer)attributes.get("active");

		if (active != null) {
			setActive(active);
		}

		Integer balanceDueParDate = (Integer)attributes.get("balanceDueParDate");

		if (balanceDueParDate != null) {
			setBalanceDueParDate(balanceDueParDate);
		}
	}

	/**
	* Returns the primary key of this pricing.
	*
	* @return the primary key of this pricing
	*/
	@Override
	public long getPrimaryKey() {
		return _pricing.getPrimaryKey();
	}

	/**
	* Sets the primary key of this pricing.
	*
	* @param primaryKey the primary key of this pricing
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_pricing.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the pricing ID of this pricing.
	*
	* @return the pricing ID of this pricing
	*/
	@Override
	public long getPricingId() {
		return _pricing.getPricingId();
	}

	/**
	* Sets the pricing ID of this pricing.
	*
	* @param pricingId the pricing ID of this pricing
	*/
	@Override
	public void setPricingId(long pricingId) {
		_pricing.setPricingId(pricingId);
	}

	/**
	* Returns the group ID of this pricing.
	*
	* @return the group ID of this pricing
	*/
	@Override
	public long getGroupId() {
		return _pricing.getGroupId();
	}

	/**
	* Sets the group ID of this pricing.
	*
	* @param groupId the group ID of this pricing
	*/
	@Override
	public void setGroupId(long groupId) {
		_pricing.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this pricing.
	*
	* @return the company ID of this pricing
	*/
	@Override
	public long getCompanyId() {
		return _pricing.getCompanyId();
	}

	/**
	* Sets the company ID of this pricing.
	*
	* @param companyId the company ID of this pricing
	*/
	@Override
	public void setCompanyId(long companyId) {
		_pricing.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this pricing.
	*
	* @return the user ID of this pricing
	*/
	@Override
	public long getUserId() {
		return _pricing.getUserId();
	}

	/**
	* Sets the user ID of this pricing.
	*
	* @param userId the user ID of this pricing
	*/
	@Override
	public void setUserId(long userId) {
		_pricing.setUserId(userId);
	}

	/**
	* Returns the user uuid of this pricing.
	*
	* @return the user uuid of this pricing
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pricing.getUserUuid();
	}

	/**
	* Sets the user uuid of this pricing.
	*
	* @param userUuid the user uuid of this pricing
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_pricing.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this pricing.
	*
	* @return the user name of this pricing
	*/
	@Override
	public java.lang.String getUserName() {
		return _pricing.getUserName();
	}

	/**
	* Sets the user name of this pricing.
	*
	* @param userName the user name of this pricing
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_pricing.setUserName(userName);
	}

	/**
	* Returns the create date of this pricing.
	*
	* @return the create date of this pricing
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _pricing.getCreateDate();
	}

	/**
	* Sets the create date of this pricing.
	*
	* @param createDate the create date of this pricing
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_pricing.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this pricing.
	*
	* @return the modified date of this pricing
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _pricing.getModifiedDate();
	}

	/**
	* Sets the modified date of this pricing.
	*
	* @param modifiedDate the modified date of this pricing
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_pricing.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the location ID of this pricing.
	*
	* @return the location ID of this pricing
	*/
	@Override
	public int getLocationId() {
		return _pricing.getLocationId();
	}

	/**
	* Sets the location ID of this pricing.
	*
	* @param locationId the location ID of this pricing
	*/
	@Override
	public void setLocationId(int locationId) {
		_pricing.setLocationId(locationId);
	}

	/**
	* Returns the course ID of this pricing.
	*
	* @return the course ID of this pricing
	*/
	@Override
	public int getCourseId() {
		return _pricing.getCourseId();
	}

	/**
	* Sets the course ID of this pricing.
	*
	* @param courseId the course ID of this pricing
	*/
	@Override
	public void setCourseId(int courseId) {
		_pricing.setCourseId(courseId);
	}

	/**
	* Returns the package ID of this pricing.
	*
	* @return the package ID of this pricing
	*/
	@Override
	public int getPackageId() {
		return _pricing.getPackageId();
	}

	/**
	* Sets the package ID of this pricing.
	*
	* @param packageId the package ID of this pricing
	*/
	@Override
	public void setPackageId(int packageId) {
		_pricing.setPackageId(packageId);
	}

	/**
	* Returns the deposit of this pricing.
	*
	* @return the deposit of this pricing
	*/
	@Override
	public int getDeposit() {
		return _pricing.getDeposit();
	}

	/**
	* Sets the deposit of this pricing.
	*
	* @param deposit the deposit of this pricing
	*/
	@Override
	public void setDeposit(int deposit) {
		_pricing.setDeposit(deposit);
	}

	/**
	* Returns the price of this pricing.
	*
	* @return the price of this pricing
	*/
	@Override
	public int getPrice() {
		return _pricing.getPrice();
	}

	/**
	* Sets the price of this pricing.
	*
	* @param price the price of this pricing
	*/
	@Override
	public void setPrice(int price) {
		_pricing.setPrice(price);
	}

	/**
	* Returns the currency of this pricing.
	*
	* @return the currency of this pricing
	*/
	@Override
	public java.lang.String getCurrency() {
		return _pricing.getCurrency();
	}

	/**
	* Sets the currency of this pricing.
	*
	* @param currency the currency of this pricing
	*/
	@Override
	public void setCurrency(java.lang.String currency) {
		_pricing.setCurrency(currency);
	}

	/**
	* Returns the effective from date of this pricing.
	*
	* @return the effective from date of this pricing
	*/
	@Override
	public java.util.Date getEffectiveFromDate() {
		return _pricing.getEffectiveFromDate();
	}

	/**
	* Sets the effective from date of this pricing.
	*
	* @param effectiveFromDate the effective from date of this pricing
	*/
	@Override
	public void setEffectiveFromDate(java.util.Date effectiveFromDate) {
		_pricing.setEffectiveFromDate(effectiveFromDate);
	}

	/**
	* Returns the course code of this pricing.
	*
	* @return the course code of this pricing
	*/
	@Override
	public java.lang.String getCourseCode() {
		return _pricing.getCourseCode();
	}

	/**
	* Sets the course code of this pricing.
	*
	* @param courseCode the course code of this pricing
	*/
	@Override
	public void setCourseCode(java.lang.String courseCode) {
		_pricing.setCourseCode(courseCode);
	}

	/**
	* Returns the location code of this pricing.
	*
	* @return the location code of this pricing
	*/
	@Override
	public java.lang.String getLocationCode() {
		return _pricing.getLocationCode();
	}

	/**
	* Sets the location code of this pricing.
	*
	* @param locationCode the location code of this pricing
	*/
	@Override
	public void setLocationCode(java.lang.String locationCode) {
		_pricing.setLocationCode(locationCode);
	}

	/**
	* Returns the effective to date of this pricing.
	*
	* @return the effective to date of this pricing
	*/
	@Override
	public java.util.Date getEffectiveToDate() {
		return _pricing.getEffectiveToDate();
	}

	/**
	* Sets the effective to date of this pricing.
	*
	* @param effectiveToDate the effective to date of this pricing
	*/
	@Override
	public void setEffectiveToDate(java.util.Date effectiveToDate) {
		_pricing.setEffectiveToDate(effectiveToDate);
	}

	/**
	* Returns the active of this pricing.
	*
	* @return the active of this pricing
	*/
	@Override
	public int getActive() {
		return _pricing.getActive();
	}

	/**
	* Sets the active of this pricing.
	*
	* @param active the active of this pricing
	*/
	@Override
	public void setActive(int active) {
		_pricing.setActive(active);
	}

	/**
	* Returns the balance due par date of this pricing.
	*
	* @return the balance due par date of this pricing
	*/
	@Override
	public int getBalanceDueParDate() {
		return _pricing.getBalanceDueParDate();
	}

	/**
	* Sets the balance due par date of this pricing.
	*
	* @param balanceDueParDate the balance due par date of this pricing
	*/
	@Override
	public void setBalanceDueParDate(int balanceDueParDate) {
		_pricing.setBalanceDueParDate(balanceDueParDate);
	}

	@Override
	public boolean isNew() {
		return _pricing.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_pricing.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _pricing.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_pricing.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _pricing.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _pricing.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_pricing.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _pricing.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_pricing.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_pricing.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_pricing.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PricingWrapper((Pricing)_pricing.clone());
	}

	@Override
	public int compareTo(com.ocms.course.model.Pricing pricing) {
		return _pricing.compareTo(pricing);
	}

	@Override
	public int hashCode() {
		return _pricing.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ocms.course.model.Pricing> toCacheModel() {
		return _pricing.toCacheModel();
	}

	@Override
	public com.ocms.course.model.Pricing toEscapedModel() {
		return new PricingWrapper(_pricing.toEscapedModel());
	}

	@Override
	public com.ocms.course.model.Pricing toUnescapedModel() {
		return new PricingWrapper(_pricing.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _pricing.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _pricing.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_pricing.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PricingWrapper)) {
			return false;
		}

		PricingWrapper pricingWrapper = (PricingWrapper)obj;

		if (Validator.equals(_pricing, pricingWrapper._pricing)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Pricing getWrappedPricing() {
		return _pricing;
	}

	@Override
	public Pricing getWrappedModel() {
		return _pricing;
	}

	@Override
	public void resetOriginalValues() {
		_pricing.resetOriginalValues();
	}

	private Pricing _pricing;
}