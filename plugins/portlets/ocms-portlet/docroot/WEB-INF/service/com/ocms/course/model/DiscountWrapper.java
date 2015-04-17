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
 * This class is a wrapper for {@link Discount}.
 * </p>
 *
 * @author doraraj
 * @see Discount
 * @generated
 */
public class DiscountWrapper implements Discount, ModelWrapper<Discount> {
	public DiscountWrapper(Discount discount) {
		_discount = discount;
	}

	@Override
	public Class<?> getModelClass() {
		return Discount.class;
	}

	@Override
	public String getModelClassName() {
		return Discount.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("code", getCode());
		attributes.put("description", getDescription());
		attributes.put("amount", getAmount());
		attributes.put("active", getActive());
		attributes.put("effectiveFromDate", getEffectiveFromDate());
		attributes.put("effectivetoDate", getEffectivetoDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
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

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long amount = (Long)attributes.get("amount");

		if (amount != null) {
			setAmount(amount);
		}

		Integer active = (Integer)attributes.get("active");

		if (active != null) {
			setActive(active);
		}

		Date effectiveFromDate = (Date)attributes.get("effectiveFromDate");

		if (effectiveFromDate != null) {
			setEffectiveFromDate(effectiveFromDate);
		}

		Date effectivetoDate = (Date)attributes.get("effectivetoDate");

		if (effectivetoDate != null) {
			setEffectivetoDate(effectivetoDate);
		}
	}

	/**
	* Returns the primary key of this discount.
	*
	* @return the primary key of this discount
	*/
	@Override
	public long getPrimaryKey() {
		return _discount.getPrimaryKey();
	}

	/**
	* Sets the primary key of this discount.
	*
	* @param primaryKey the primary key of this discount
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_discount.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this discount.
	*
	* @return the ID of this discount
	*/
	@Override
	public long getId() {
		return _discount.getId();
	}

	/**
	* Sets the ID of this discount.
	*
	* @param id the ID of this discount
	*/
	@Override
	public void setId(long id) {
		_discount.setId(id);
	}

	/**
	* Returns the group ID of this discount.
	*
	* @return the group ID of this discount
	*/
	@Override
	public long getGroupId() {
		return _discount.getGroupId();
	}

	/**
	* Sets the group ID of this discount.
	*
	* @param groupId the group ID of this discount
	*/
	@Override
	public void setGroupId(long groupId) {
		_discount.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this discount.
	*
	* @return the company ID of this discount
	*/
	@Override
	public long getCompanyId() {
		return _discount.getCompanyId();
	}

	/**
	* Sets the company ID of this discount.
	*
	* @param companyId the company ID of this discount
	*/
	@Override
	public void setCompanyId(long companyId) {
		_discount.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this discount.
	*
	* @return the user ID of this discount
	*/
	@Override
	public long getUserId() {
		return _discount.getUserId();
	}

	/**
	* Sets the user ID of this discount.
	*
	* @param userId the user ID of this discount
	*/
	@Override
	public void setUserId(long userId) {
		_discount.setUserId(userId);
	}

	/**
	* Returns the user uuid of this discount.
	*
	* @return the user uuid of this discount
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discount.getUserUuid();
	}

	/**
	* Sets the user uuid of this discount.
	*
	* @param userUuid the user uuid of this discount
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_discount.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this discount.
	*
	* @return the user name of this discount
	*/
	@Override
	public java.lang.String getUserName() {
		return _discount.getUserName();
	}

	/**
	* Sets the user name of this discount.
	*
	* @param userName the user name of this discount
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_discount.setUserName(userName);
	}

	/**
	* Returns the create date of this discount.
	*
	* @return the create date of this discount
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _discount.getCreateDate();
	}

	/**
	* Sets the create date of this discount.
	*
	* @param createDate the create date of this discount
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_discount.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this discount.
	*
	* @return the modified date of this discount
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _discount.getModifiedDate();
	}

	/**
	* Sets the modified date of this discount.
	*
	* @param modifiedDate the modified date of this discount
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_discount.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the code of this discount.
	*
	* @return the code of this discount
	*/
	@Override
	public java.lang.String getCode() {
		return _discount.getCode();
	}

	/**
	* Sets the code of this discount.
	*
	* @param code the code of this discount
	*/
	@Override
	public void setCode(java.lang.String code) {
		_discount.setCode(code);
	}

	/**
	* Returns the description of this discount.
	*
	* @return the description of this discount
	*/
	@Override
	public java.lang.String getDescription() {
		return _discount.getDescription();
	}

	/**
	* Sets the description of this discount.
	*
	* @param description the description of this discount
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_discount.setDescription(description);
	}

	/**
	* Returns the amount of this discount.
	*
	* @return the amount of this discount
	*/
	@Override
	public long getAmount() {
		return _discount.getAmount();
	}

	/**
	* Sets the amount of this discount.
	*
	* @param amount the amount of this discount
	*/
	@Override
	public void setAmount(long amount) {
		_discount.setAmount(amount);
	}

	/**
	* Returns the active of this discount.
	*
	* @return the active of this discount
	*/
	@Override
	public int getActive() {
		return _discount.getActive();
	}

	/**
	* Sets the active of this discount.
	*
	* @param active the active of this discount
	*/
	@Override
	public void setActive(int active) {
		_discount.setActive(active);
	}

	/**
	* Returns the effective from date of this discount.
	*
	* @return the effective from date of this discount
	*/
	@Override
	public java.util.Date getEffectiveFromDate() {
		return _discount.getEffectiveFromDate();
	}

	/**
	* Sets the effective from date of this discount.
	*
	* @param effectiveFromDate the effective from date of this discount
	*/
	@Override
	public void setEffectiveFromDate(java.util.Date effectiveFromDate) {
		_discount.setEffectiveFromDate(effectiveFromDate);
	}

	/**
	* Returns the effectiveto date of this discount.
	*
	* @return the effectiveto date of this discount
	*/
	@Override
	public java.util.Date getEffectivetoDate() {
		return _discount.getEffectivetoDate();
	}

	/**
	* Sets the effectiveto date of this discount.
	*
	* @param effectivetoDate the effectiveto date of this discount
	*/
	@Override
	public void setEffectivetoDate(java.util.Date effectivetoDate) {
		_discount.setEffectivetoDate(effectivetoDate);
	}

	@Override
	public boolean isNew() {
		return _discount.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_discount.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _discount.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_discount.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _discount.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _discount.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_discount.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _discount.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_discount.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_discount.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_discount.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DiscountWrapper((Discount)_discount.clone());
	}

	@Override
	public int compareTo(com.ocms.course.model.Discount discount) {
		return _discount.compareTo(discount);
	}

	@Override
	public int hashCode() {
		return _discount.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ocms.course.model.Discount> toCacheModel() {
		return _discount.toCacheModel();
	}

	@Override
	public com.ocms.course.model.Discount toEscapedModel() {
		return new DiscountWrapper(_discount.toEscapedModel());
	}

	@Override
	public com.ocms.course.model.Discount toUnescapedModel() {
		return new DiscountWrapper(_discount.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _discount.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _discount.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_discount.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DiscountWrapper)) {
			return false;
		}

		DiscountWrapper discountWrapper = (DiscountWrapper)obj;

		if (Validator.equals(_discount, discountWrapper._discount)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Discount getWrappedDiscount() {
		return _discount;
	}

	@Override
	public Discount getWrappedModel() {
		return _discount;
	}

	@Override
	public void resetOriginalValues() {
		_discount.resetOriginalValues();
	}

	private Discount _discount;
}