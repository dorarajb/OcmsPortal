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
 * This class is a wrapper for {@link OffersAndDeductions}.
 * </p>
 *
 * @author doraraj
 * @see OffersAndDeductions
 * @generated
 */
public class OffersAndDeductionsWrapper implements OffersAndDeductions,
	ModelWrapper<OffersAndDeductions> {
	public OffersAndDeductionsWrapper(OffersAndDeductions offersAndDeductions) {
		_offersAndDeductions = offersAndDeductions;
	}

	@Override
	public Class<?> getModelClass() {
		return OffersAndDeductions.class;
	}

	@Override
	public String getModelClassName() {
		return OffersAndDeductions.class.getName();
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
		attributes.put("type", getType());

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

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}
	}

	/**
	* Returns the primary key of this offers and deductions.
	*
	* @return the primary key of this offers and deductions
	*/
	@Override
	public long getPrimaryKey() {
		return _offersAndDeductions.getPrimaryKey();
	}

	/**
	* Sets the primary key of this offers and deductions.
	*
	* @param primaryKey the primary key of this offers and deductions
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_offersAndDeductions.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this offers and deductions.
	*
	* @return the ID of this offers and deductions
	*/
	@Override
	public long getId() {
		return _offersAndDeductions.getId();
	}

	/**
	* Sets the ID of this offers and deductions.
	*
	* @param id the ID of this offers and deductions
	*/
	@Override
	public void setId(long id) {
		_offersAndDeductions.setId(id);
	}

	/**
	* Returns the group ID of this offers and deductions.
	*
	* @return the group ID of this offers and deductions
	*/
	@Override
	public long getGroupId() {
		return _offersAndDeductions.getGroupId();
	}

	/**
	* Sets the group ID of this offers and deductions.
	*
	* @param groupId the group ID of this offers and deductions
	*/
	@Override
	public void setGroupId(long groupId) {
		_offersAndDeductions.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this offers and deductions.
	*
	* @return the company ID of this offers and deductions
	*/
	@Override
	public long getCompanyId() {
		return _offersAndDeductions.getCompanyId();
	}

	/**
	* Sets the company ID of this offers and deductions.
	*
	* @param companyId the company ID of this offers and deductions
	*/
	@Override
	public void setCompanyId(long companyId) {
		_offersAndDeductions.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this offers and deductions.
	*
	* @return the user ID of this offers and deductions
	*/
	@Override
	public long getUserId() {
		return _offersAndDeductions.getUserId();
	}

	/**
	* Sets the user ID of this offers and deductions.
	*
	* @param userId the user ID of this offers and deductions
	*/
	@Override
	public void setUserId(long userId) {
		_offersAndDeductions.setUserId(userId);
	}

	/**
	* Returns the user uuid of this offers and deductions.
	*
	* @return the user uuid of this offers and deductions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductions.getUserUuid();
	}

	/**
	* Sets the user uuid of this offers and deductions.
	*
	* @param userUuid the user uuid of this offers and deductions
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_offersAndDeductions.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this offers and deductions.
	*
	* @return the user name of this offers and deductions
	*/
	@Override
	public java.lang.String getUserName() {
		return _offersAndDeductions.getUserName();
	}

	/**
	* Sets the user name of this offers and deductions.
	*
	* @param userName the user name of this offers and deductions
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_offersAndDeductions.setUserName(userName);
	}

	/**
	* Returns the create date of this offers and deductions.
	*
	* @return the create date of this offers and deductions
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _offersAndDeductions.getCreateDate();
	}

	/**
	* Sets the create date of this offers and deductions.
	*
	* @param createDate the create date of this offers and deductions
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_offersAndDeductions.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this offers and deductions.
	*
	* @return the modified date of this offers and deductions
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _offersAndDeductions.getModifiedDate();
	}

	/**
	* Sets the modified date of this offers and deductions.
	*
	* @param modifiedDate the modified date of this offers and deductions
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_offersAndDeductions.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the code of this offers and deductions.
	*
	* @return the code of this offers and deductions
	*/
	@Override
	public java.lang.String getCode() {
		return _offersAndDeductions.getCode();
	}

	/**
	* Sets the code of this offers and deductions.
	*
	* @param code the code of this offers and deductions
	*/
	@Override
	public void setCode(java.lang.String code) {
		_offersAndDeductions.setCode(code);
	}

	/**
	* Returns the description of this offers and deductions.
	*
	* @return the description of this offers and deductions
	*/
	@Override
	public java.lang.String getDescription() {
		return _offersAndDeductions.getDescription();
	}

	/**
	* Sets the description of this offers and deductions.
	*
	* @param description the description of this offers and deductions
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_offersAndDeductions.setDescription(description);
	}

	/**
	* Returns the amount of this offers and deductions.
	*
	* @return the amount of this offers and deductions
	*/
	@Override
	public long getAmount() {
		return _offersAndDeductions.getAmount();
	}

	/**
	* Sets the amount of this offers and deductions.
	*
	* @param amount the amount of this offers and deductions
	*/
	@Override
	public void setAmount(long amount) {
		_offersAndDeductions.setAmount(amount);
	}

	/**
	* Returns the active of this offers and deductions.
	*
	* @return the active of this offers and deductions
	*/
	@Override
	public int getActive() {
		return _offersAndDeductions.getActive();
	}

	/**
	* Sets the active of this offers and deductions.
	*
	* @param active the active of this offers and deductions
	*/
	@Override
	public void setActive(int active) {
		_offersAndDeductions.setActive(active);
	}

	/**
	* Returns the effective from date of this offers and deductions.
	*
	* @return the effective from date of this offers and deductions
	*/
	@Override
	public java.util.Date getEffectiveFromDate() {
		return _offersAndDeductions.getEffectiveFromDate();
	}

	/**
	* Sets the effective from date of this offers and deductions.
	*
	* @param effectiveFromDate the effective from date of this offers and deductions
	*/
	@Override
	public void setEffectiveFromDate(java.util.Date effectiveFromDate) {
		_offersAndDeductions.setEffectiveFromDate(effectiveFromDate);
	}

	/**
	* Returns the effectiveto date of this offers and deductions.
	*
	* @return the effectiveto date of this offers and deductions
	*/
	@Override
	public java.util.Date getEffectivetoDate() {
		return _offersAndDeductions.getEffectivetoDate();
	}

	/**
	* Sets the effectiveto date of this offers and deductions.
	*
	* @param effectivetoDate the effectiveto date of this offers and deductions
	*/
	@Override
	public void setEffectivetoDate(java.util.Date effectivetoDate) {
		_offersAndDeductions.setEffectivetoDate(effectivetoDate);
	}

	/**
	* Returns the type of this offers and deductions.
	*
	* @return the type of this offers and deductions
	*/
	@Override
	public java.lang.String getType() {
		return _offersAndDeductions.getType();
	}

	/**
	* Sets the type of this offers and deductions.
	*
	* @param type the type of this offers and deductions
	*/
	@Override
	public void setType(java.lang.String type) {
		_offersAndDeductions.setType(type);
	}

	@Override
	public boolean isNew() {
		return _offersAndDeductions.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_offersAndDeductions.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _offersAndDeductions.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_offersAndDeductions.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _offersAndDeductions.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _offersAndDeductions.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_offersAndDeductions.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _offersAndDeductions.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_offersAndDeductions.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_offersAndDeductions.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_offersAndDeductions.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new OffersAndDeductionsWrapper((OffersAndDeductions)_offersAndDeductions.clone());
	}

	@Override
	public int compareTo(
		com.ocms.course.model.OffersAndDeductions offersAndDeductions) {
		return _offersAndDeductions.compareTo(offersAndDeductions);
	}

	@Override
	public int hashCode() {
		return _offersAndDeductions.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ocms.course.model.OffersAndDeductions> toCacheModel() {
		return _offersAndDeductions.toCacheModel();
	}

	@Override
	public com.ocms.course.model.OffersAndDeductions toEscapedModel() {
		return new OffersAndDeductionsWrapper(_offersAndDeductions.toEscapedModel());
	}

	@Override
	public com.ocms.course.model.OffersAndDeductions toUnescapedModel() {
		return new OffersAndDeductionsWrapper(_offersAndDeductions.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _offersAndDeductions.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _offersAndDeductions.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_offersAndDeductions.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OffersAndDeductionsWrapper)) {
			return false;
		}

		OffersAndDeductionsWrapper offersAndDeductionsWrapper = (OffersAndDeductionsWrapper)obj;

		if (Validator.equals(_offersAndDeductions,
					offersAndDeductionsWrapper._offersAndDeductions)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public OffersAndDeductions getWrappedOffersAndDeductions() {
		return _offersAndDeductions;
	}

	@Override
	public OffersAndDeductions getWrappedModel() {
		return _offersAndDeductions;
	}

	@Override
	public void resetOriginalValues() {
		_offersAndDeductions.resetOriginalValues();
	}

	private OffersAndDeductions _offersAndDeductions;
}