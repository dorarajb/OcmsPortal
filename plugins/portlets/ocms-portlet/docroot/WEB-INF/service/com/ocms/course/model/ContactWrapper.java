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
 * This class is a wrapper for {@link Contact}.
 * </p>
 *
 * @author doraraj
 * @see Contact
 * @generated
 */
public class ContactWrapper implements Contact, ModelWrapper<Contact> {
	public ContactWrapper(Contact contact) {
		_contact = contact;
	}

	@Override
	public Class<?> getModelClass() {
		return Contact.class;
	}

	@Override
	public String getModelClassName() {
		return Contact.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("contactId", getContactId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("contactType", getContactType());
		attributes.put("contactName", getContactName());
		attributes.put("addressLine1", getAddressLine1());
		attributes.put("addressLine2", getAddressLine2());
		attributes.put("city", getCity());
		attributes.put("state", getState());
		attributes.put("region", getRegion());
		attributes.put("zip", getZip());
		attributes.put("phone", getPhone());
		attributes.put("fax", getFax());
		attributes.put("email", getEmail());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long contactId = (Long)attributes.get("contactId");

		if (contactId != null) {
			setContactId(contactId);
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

		String contactType = (String)attributes.get("contactType");

		if (contactType != null) {
			setContactType(contactType);
		}

		String contactName = (String)attributes.get("contactName");

		if (contactName != null) {
			setContactName(contactName);
		}

		String addressLine1 = (String)attributes.get("addressLine1");

		if (addressLine1 != null) {
			setAddressLine1(addressLine1);
		}

		String addressLine2 = (String)attributes.get("addressLine2");

		if (addressLine2 != null) {
			setAddressLine2(addressLine2);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String state = (String)attributes.get("state");

		if (state != null) {
			setState(state);
		}

		String region = (String)attributes.get("region");

		if (region != null) {
			setRegion(region);
		}

		String zip = (String)attributes.get("zip");

		if (zip != null) {
			setZip(zip);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		String fax = (String)attributes.get("fax");

		if (fax != null) {
			setFax(fax);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}
	}

	/**
	* Returns the primary key of this contact.
	*
	* @return the primary key of this contact
	*/
	@Override
	public long getPrimaryKey() {
		return _contact.getPrimaryKey();
	}

	/**
	* Sets the primary key of this contact.
	*
	* @param primaryKey the primary key of this contact
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_contact.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the contact ID of this contact.
	*
	* @return the contact ID of this contact
	*/
	@Override
	public long getContactId() {
		return _contact.getContactId();
	}

	/**
	* Sets the contact ID of this contact.
	*
	* @param contactId the contact ID of this contact
	*/
	@Override
	public void setContactId(long contactId) {
		_contact.setContactId(contactId);
	}

	/**
	* Returns the group ID of this contact.
	*
	* @return the group ID of this contact
	*/
	@Override
	public long getGroupId() {
		return _contact.getGroupId();
	}

	/**
	* Sets the group ID of this contact.
	*
	* @param groupId the group ID of this contact
	*/
	@Override
	public void setGroupId(long groupId) {
		_contact.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this contact.
	*
	* @return the company ID of this contact
	*/
	@Override
	public long getCompanyId() {
		return _contact.getCompanyId();
	}

	/**
	* Sets the company ID of this contact.
	*
	* @param companyId the company ID of this contact
	*/
	@Override
	public void setCompanyId(long companyId) {
		_contact.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this contact.
	*
	* @return the user ID of this contact
	*/
	@Override
	public long getUserId() {
		return _contact.getUserId();
	}

	/**
	* Sets the user ID of this contact.
	*
	* @param userId the user ID of this contact
	*/
	@Override
	public void setUserId(long userId) {
		_contact.setUserId(userId);
	}

	/**
	* Returns the user uuid of this contact.
	*
	* @return the user uuid of this contact
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contact.getUserUuid();
	}

	/**
	* Sets the user uuid of this contact.
	*
	* @param userUuid the user uuid of this contact
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_contact.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this contact.
	*
	* @return the user name of this contact
	*/
	@Override
	public java.lang.String getUserName() {
		return _contact.getUserName();
	}

	/**
	* Sets the user name of this contact.
	*
	* @param userName the user name of this contact
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_contact.setUserName(userName);
	}

	/**
	* Returns the create date of this contact.
	*
	* @return the create date of this contact
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _contact.getCreateDate();
	}

	/**
	* Sets the create date of this contact.
	*
	* @param createDate the create date of this contact
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_contact.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this contact.
	*
	* @return the modified date of this contact
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _contact.getModifiedDate();
	}

	/**
	* Sets the modified date of this contact.
	*
	* @param modifiedDate the modified date of this contact
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_contact.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the contact type of this contact.
	*
	* @return the contact type of this contact
	*/
	@Override
	public java.lang.String getContactType() {
		return _contact.getContactType();
	}

	/**
	* Sets the contact type of this contact.
	*
	* @param contactType the contact type of this contact
	*/
	@Override
	public void setContactType(java.lang.String contactType) {
		_contact.setContactType(contactType);
	}

	/**
	* Returns the contact name of this contact.
	*
	* @return the contact name of this contact
	*/
	@Override
	public java.lang.String getContactName() {
		return _contact.getContactName();
	}

	/**
	* Sets the contact name of this contact.
	*
	* @param contactName the contact name of this contact
	*/
	@Override
	public void setContactName(java.lang.String contactName) {
		_contact.setContactName(contactName);
	}

	/**
	* Returns the address line1 of this contact.
	*
	* @return the address line1 of this contact
	*/
	@Override
	public java.lang.String getAddressLine1() {
		return _contact.getAddressLine1();
	}

	/**
	* Sets the address line1 of this contact.
	*
	* @param addressLine1 the address line1 of this contact
	*/
	@Override
	public void setAddressLine1(java.lang.String addressLine1) {
		_contact.setAddressLine1(addressLine1);
	}

	/**
	* Returns the address line2 of this contact.
	*
	* @return the address line2 of this contact
	*/
	@Override
	public java.lang.String getAddressLine2() {
		return _contact.getAddressLine2();
	}

	/**
	* Sets the address line2 of this contact.
	*
	* @param addressLine2 the address line2 of this contact
	*/
	@Override
	public void setAddressLine2(java.lang.String addressLine2) {
		_contact.setAddressLine2(addressLine2);
	}

	/**
	* Returns the city of this contact.
	*
	* @return the city of this contact
	*/
	@Override
	public java.lang.String getCity() {
		return _contact.getCity();
	}

	/**
	* Sets the city of this contact.
	*
	* @param city the city of this contact
	*/
	@Override
	public void setCity(java.lang.String city) {
		_contact.setCity(city);
	}

	/**
	* Returns the state of this contact.
	*
	* @return the state of this contact
	*/
	@Override
	public java.lang.String getState() {
		return _contact.getState();
	}

	/**
	* Sets the state of this contact.
	*
	* @param state the state of this contact
	*/
	@Override
	public void setState(java.lang.String state) {
		_contact.setState(state);
	}

	/**
	* Returns the region of this contact.
	*
	* @return the region of this contact
	*/
	@Override
	public java.lang.String getRegion() {
		return _contact.getRegion();
	}

	/**
	* Sets the region of this contact.
	*
	* @param region the region of this contact
	*/
	@Override
	public void setRegion(java.lang.String region) {
		_contact.setRegion(region);
	}

	/**
	* Returns the zip of this contact.
	*
	* @return the zip of this contact
	*/
	@Override
	public java.lang.String getZip() {
		return _contact.getZip();
	}

	/**
	* Sets the zip of this contact.
	*
	* @param zip the zip of this contact
	*/
	@Override
	public void setZip(java.lang.String zip) {
		_contact.setZip(zip);
	}

	/**
	* Returns the phone of this contact.
	*
	* @return the phone of this contact
	*/
	@Override
	public java.lang.String getPhone() {
		return _contact.getPhone();
	}

	/**
	* Sets the phone of this contact.
	*
	* @param phone the phone of this contact
	*/
	@Override
	public void setPhone(java.lang.String phone) {
		_contact.setPhone(phone);
	}

	/**
	* Returns the fax of this contact.
	*
	* @return the fax of this contact
	*/
	@Override
	public java.lang.String getFax() {
		return _contact.getFax();
	}

	/**
	* Sets the fax of this contact.
	*
	* @param fax the fax of this contact
	*/
	@Override
	public void setFax(java.lang.String fax) {
		_contact.setFax(fax);
	}

	/**
	* Returns the email of this contact.
	*
	* @return the email of this contact
	*/
	@Override
	public java.lang.String getEmail() {
		return _contact.getEmail();
	}

	/**
	* Sets the email of this contact.
	*
	* @param email the email of this contact
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_contact.setEmail(email);
	}

	@Override
	public boolean isNew() {
		return _contact.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_contact.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _contact.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_contact.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _contact.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _contact.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_contact.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _contact.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_contact.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_contact.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_contact.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ContactWrapper((Contact)_contact.clone());
	}

	@Override
	public int compareTo(com.ocms.course.model.Contact contact) {
		return _contact.compareTo(contact);
	}

	@Override
	public int hashCode() {
		return _contact.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.ocms.course.model.Contact> toCacheModel() {
		return _contact.toCacheModel();
	}

	@Override
	public com.ocms.course.model.Contact toEscapedModel() {
		return new ContactWrapper(_contact.toEscapedModel());
	}

	@Override
	public com.ocms.course.model.Contact toUnescapedModel() {
		return new ContactWrapper(_contact.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _contact.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _contact.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_contact.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ContactWrapper)) {
			return false;
		}

		ContactWrapper contactWrapper = (ContactWrapper)obj;

		if (Validator.equals(_contact, contactWrapper._contact)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Contact getWrappedContact() {
		return _contact;
	}

	@Override
	public Contact getWrappedModel() {
		return _contact;
	}

	@Override
	public void resetOriginalValues() {
		_contact.resetOriginalValues();
	}

	private Contact _contact;
}