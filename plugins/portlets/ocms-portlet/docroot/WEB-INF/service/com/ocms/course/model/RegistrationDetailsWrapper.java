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
 * This class is a wrapper for {@link RegistrationDetails}.
 * </p>
 *
 * @author doraraj
 * @see RegistrationDetails
 * @generated
 */
public class RegistrationDetailsWrapper implements RegistrationDetails,
	ModelWrapper<RegistrationDetails> {
	public RegistrationDetailsWrapper(RegistrationDetails registrationDetails) {
		_registrationDetails = registrationDetails;
	}

	@Override
	public Class<?> getModelClass() {
		return RegistrationDetails.class;
	}

	@Override
	public String getModelClassName() {
		return RegistrationDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("studRegId", getStudRegId());
		attributes.put("contactId", getContactId());
		attributes.put("eventId", getEventId());
		attributes.put("price", getPrice());
		attributes.put("discount", getDiscount());
		attributes.put("fee", getFee());
		attributes.put("credit", getCredit());
		attributes.put("registrationDetailsId", getRegistrationDetailsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long studRegId = (Long)attributes.get("studRegId");

		if (studRegId != null) {
			setStudRegId(studRegId);
		}

		Long contactId = (Long)attributes.get("contactId");

		if (contactId != null) {
			setContactId(contactId);
		}

		Long eventId = (Long)attributes.get("eventId");

		if (eventId != null) {
			setEventId(eventId);
		}

		Double price = (Double)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}

		Double discount = (Double)attributes.get("discount");

		if (discount != null) {
			setDiscount(discount);
		}

		Double fee = (Double)attributes.get("fee");

		if (fee != null) {
			setFee(fee);
		}

		Double credit = (Double)attributes.get("credit");

		if (credit != null) {
			setCredit(credit);
		}

		Long registrationDetailsId = (Long)attributes.get(
				"registrationDetailsId");

		if (registrationDetailsId != null) {
			setRegistrationDetailsId(registrationDetailsId);
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
	}

	/**
	* Returns the primary key of this registration details.
	*
	* @return the primary key of this registration details
	*/
	@Override
	public long getPrimaryKey() {
		return _registrationDetails.getPrimaryKey();
	}

	/**
	* Sets the primary key of this registration details.
	*
	* @param primaryKey the primary key of this registration details
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_registrationDetails.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the stud reg ID of this registration details.
	*
	* @return the stud reg ID of this registration details
	*/
	@Override
	public long getStudRegId() {
		return _registrationDetails.getStudRegId();
	}

	/**
	* Sets the stud reg ID of this registration details.
	*
	* @param studRegId the stud reg ID of this registration details
	*/
	@Override
	public void setStudRegId(long studRegId) {
		_registrationDetails.setStudRegId(studRegId);
	}

	/**
	* Returns the contact ID of this registration details.
	*
	* @return the contact ID of this registration details
	*/
	@Override
	public long getContactId() {
		return _registrationDetails.getContactId();
	}

	/**
	* Sets the contact ID of this registration details.
	*
	* @param contactId the contact ID of this registration details
	*/
	@Override
	public void setContactId(long contactId) {
		_registrationDetails.setContactId(contactId);
	}

	/**
	* Returns the event ID of this registration details.
	*
	* @return the event ID of this registration details
	*/
	@Override
	public long getEventId() {
		return _registrationDetails.getEventId();
	}

	/**
	* Sets the event ID of this registration details.
	*
	* @param eventId the event ID of this registration details
	*/
	@Override
	public void setEventId(long eventId) {
		_registrationDetails.setEventId(eventId);
	}

	/**
	* Returns the price of this registration details.
	*
	* @return the price of this registration details
	*/
	@Override
	public double getPrice() {
		return _registrationDetails.getPrice();
	}

	/**
	* Sets the price of this registration details.
	*
	* @param price the price of this registration details
	*/
	@Override
	public void setPrice(double price) {
		_registrationDetails.setPrice(price);
	}

	/**
	* Returns the discount of this registration details.
	*
	* @return the discount of this registration details
	*/
	@Override
	public double getDiscount() {
		return _registrationDetails.getDiscount();
	}

	/**
	* Sets the discount of this registration details.
	*
	* @param discount the discount of this registration details
	*/
	@Override
	public void setDiscount(double discount) {
		_registrationDetails.setDiscount(discount);
	}

	/**
	* Returns the fee of this registration details.
	*
	* @return the fee of this registration details
	*/
	@Override
	public double getFee() {
		return _registrationDetails.getFee();
	}

	/**
	* Sets the fee of this registration details.
	*
	* @param fee the fee of this registration details
	*/
	@Override
	public void setFee(double fee) {
		_registrationDetails.setFee(fee);
	}

	/**
	* Returns the credit of this registration details.
	*
	* @return the credit of this registration details
	*/
	@Override
	public double getCredit() {
		return _registrationDetails.getCredit();
	}

	/**
	* Sets the credit of this registration details.
	*
	* @param credit the credit of this registration details
	*/
	@Override
	public void setCredit(double credit) {
		_registrationDetails.setCredit(credit);
	}

	/**
	* Returns the registration details ID of this registration details.
	*
	* @return the registration details ID of this registration details
	*/
	@Override
	public long getRegistrationDetailsId() {
		return _registrationDetails.getRegistrationDetailsId();
	}

	/**
	* Sets the registration details ID of this registration details.
	*
	* @param registrationDetailsId the registration details ID of this registration details
	*/
	@Override
	public void setRegistrationDetailsId(long registrationDetailsId) {
		_registrationDetails.setRegistrationDetailsId(registrationDetailsId);
	}

	/**
	* Returns the group ID of this registration details.
	*
	* @return the group ID of this registration details
	*/
	@Override
	public long getGroupId() {
		return _registrationDetails.getGroupId();
	}

	/**
	* Sets the group ID of this registration details.
	*
	* @param groupId the group ID of this registration details
	*/
	@Override
	public void setGroupId(long groupId) {
		_registrationDetails.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this registration details.
	*
	* @return the company ID of this registration details
	*/
	@Override
	public long getCompanyId() {
		return _registrationDetails.getCompanyId();
	}

	/**
	* Sets the company ID of this registration details.
	*
	* @param companyId the company ID of this registration details
	*/
	@Override
	public void setCompanyId(long companyId) {
		_registrationDetails.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this registration details.
	*
	* @return the user ID of this registration details
	*/
	@Override
	public long getUserId() {
		return _registrationDetails.getUserId();
	}

	/**
	* Sets the user ID of this registration details.
	*
	* @param userId the user ID of this registration details
	*/
	@Override
	public void setUserId(long userId) {
		_registrationDetails.setUserId(userId);
	}

	/**
	* Returns the user uuid of this registration details.
	*
	* @return the user uuid of this registration details
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationDetails.getUserUuid();
	}

	/**
	* Sets the user uuid of this registration details.
	*
	* @param userUuid the user uuid of this registration details
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_registrationDetails.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this registration details.
	*
	* @return the user name of this registration details
	*/
	@Override
	public java.lang.String getUserName() {
		return _registrationDetails.getUserName();
	}

	/**
	* Sets the user name of this registration details.
	*
	* @param userName the user name of this registration details
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_registrationDetails.setUserName(userName);
	}

	/**
	* Returns the create date of this registration details.
	*
	* @return the create date of this registration details
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _registrationDetails.getCreateDate();
	}

	/**
	* Sets the create date of this registration details.
	*
	* @param createDate the create date of this registration details
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_registrationDetails.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this registration details.
	*
	* @return the modified date of this registration details
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _registrationDetails.getModifiedDate();
	}

	/**
	* Sets the modified date of this registration details.
	*
	* @param modifiedDate the modified date of this registration details
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_registrationDetails.setModifiedDate(modifiedDate);
	}

	@Override
	public boolean isNew() {
		return _registrationDetails.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_registrationDetails.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _registrationDetails.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_registrationDetails.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _registrationDetails.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _registrationDetails.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_registrationDetails.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _registrationDetails.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_registrationDetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_registrationDetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_registrationDetails.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new RegistrationDetailsWrapper((RegistrationDetails)_registrationDetails.clone());
	}

	@Override
	public int compareTo(RegistrationDetails registrationDetails) {
		return _registrationDetails.compareTo(registrationDetails);
	}

	@Override
	public int hashCode() {
		return _registrationDetails.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<RegistrationDetails> toCacheModel() {
		return _registrationDetails.toCacheModel();
	}

	@Override
	public RegistrationDetails toEscapedModel() {
		return new RegistrationDetailsWrapper(_registrationDetails.toEscapedModel());
	}

	@Override
	public RegistrationDetails toUnescapedModel() {
		return new RegistrationDetailsWrapper(_registrationDetails.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _registrationDetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _registrationDetails.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_registrationDetails.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RegistrationDetailsWrapper)) {
			return false;
		}

		RegistrationDetailsWrapper registrationDetailsWrapper = (RegistrationDetailsWrapper)obj;

		if (Validator.equals(_registrationDetails,
					registrationDetailsWrapper._registrationDetails)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public RegistrationDetails getWrappedRegistrationDetails() {
		return _registrationDetails;
	}

	@Override
	public RegistrationDetails getWrappedModel() {
		return _registrationDetails;
	}

	@Override
	public void resetOriginalValues() {
		_registrationDetails.resetOriginalValues();
	}

	private RegistrationDetails _registrationDetails;
}