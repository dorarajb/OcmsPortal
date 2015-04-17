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
 * This class is a wrapper for {@link StudentRegistration}.
 * </p>
 *
 * @author doraraj
 * @see StudentRegistration
 * @generated
 */
public class StudentRegistrationWrapper implements StudentRegistration,
	ModelWrapper<StudentRegistration> {
	public StudentRegistrationWrapper(StudentRegistration studentRegistration) {
		_studentRegistration = studentRegistration;
	}

	@Override
	public Class<?> getModelClass() {
		return StudentRegistration.class;
	}

	@Override
	public String getModelClassName() {
		return StudentRegistration.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("studRegId", getStudRegId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("memo", getMemo());
		attributes.put("studRegStatus", getStudRegStatus());
		attributes.put("advisorOrig", getAdvisorOrig());
		attributes.put("advisorReg", getAdvisorReg());
		attributes.put("coursePackageId", getCoursePackageId());
		attributes.put("discountId", getDiscountId());
		attributes.put("commMethod", getCommMethod());
		attributes.put("notes", getNotes());
		attributes.put("currency", getCurrency());
		attributes.put("tax", getTax());
		attributes.put("autoCharge", getAutoCharge());
		attributes.put("currencyPaid", getCurrencyPaid());
		attributes.put("exchangeRate", getExchangeRate());
		attributes.put("contactId", getContactId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long studRegId = (Long)attributes.get("studRegId");

		if (studRegId != null) {
			setStudRegId(studRegId);
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

		String memo = (String)attributes.get("memo");

		if (memo != null) {
			setMemo(memo);
		}

		String studRegStatus = (String)attributes.get("studRegStatus");

		if (studRegStatus != null) {
			setStudRegStatus(studRegStatus);
		}

		String advisorOrig = (String)attributes.get("advisorOrig");

		if (advisorOrig != null) {
			setAdvisorOrig(advisorOrig);
		}

		String advisorReg = (String)attributes.get("advisorReg");

		if (advisorReg != null) {
			setAdvisorReg(advisorReg);
		}

		Long coursePackageId = (Long)attributes.get("coursePackageId");

		if (coursePackageId != null) {
			setCoursePackageId(coursePackageId);
		}

		Long discountId = (Long)attributes.get("discountId");

		if (discountId != null) {
			setDiscountId(discountId);
		}

		String commMethod = (String)attributes.get("commMethod");

		if (commMethod != null) {
			setCommMethod(commMethod);
		}

		String notes = (String)attributes.get("notes");

		if (notes != null) {
			setNotes(notes);
		}

		String currency = (String)attributes.get("currency");

		if (currency != null) {
			setCurrency(currency);
		}

		Long tax = (Long)attributes.get("tax");

		if (tax != null) {
			setTax(tax);
		}

		String autoCharge = (String)attributes.get("autoCharge");

		if (autoCharge != null) {
			setAutoCharge(autoCharge);
		}

		String currencyPaid = (String)attributes.get("currencyPaid");

		if (currencyPaid != null) {
			setCurrencyPaid(currencyPaid);
		}

		Long exchangeRate = (Long)attributes.get("exchangeRate");

		if (exchangeRate != null) {
			setExchangeRate(exchangeRate);
		}

		Long contactId = (Long)attributes.get("contactId");

		if (contactId != null) {
			setContactId(contactId);
		}
	}

	/**
	* Returns the primary key of this student registration.
	*
	* @return the primary key of this student registration
	*/
	@Override
	public long getPrimaryKey() {
		return _studentRegistration.getPrimaryKey();
	}

	/**
	* Sets the primary key of this student registration.
	*
	* @param primaryKey the primary key of this student registration
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_studentRegistration.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the stud reg ID of this student registration.
	*
	* @return the stud reg ID of this student registration
	*/
	@Override
	public long getStudRegId() {
		return _studentRegistration.getStudRegId();
	}

	/**
	* Sets the stud reg ID of this student registration.
	*
	* @param studRegId the stud reg ID of this student registration
	*/
	@Override
	public void setStudRegId(long studRegId) {
		_studentRegistration.setStudRegId(studRegId);
	}

	/**
	* Returns the group ID of this student registration.
	*
	* @return the group ID of this student registration
	*/
	@Override
	public long getGroupId() {
		return _studentRegistration.getGroupId();
	}

	/**
	* Sets the group ID of this student registration.
	*
	* @param groupId the group ID of this student registration
	*/
	@Override
	public void setGroupId(long groupId) {
		_studentRegistration.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this student registration.
	*
	* @return the company ID of this student registration
	*/
	@Override
	public long getCompanyId() {
		return _studentRegistration.getCompanyId();
	}

	/**
	* Sets the company ID of this student registration.
	*
	* @param companyId the company ID of this student registration
	*/
	@Override
	public void setCompanyId(long companyId) {
		_studentRegistration.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this student registration.
	*
	* @return the user ID of this student registration
	*/
	@Override
	public long getUserId() {
		return _studentRegistration.getUserId();
	}

	/**
	* Sets the user ID of this student registration.
	*
	* @param userId the user ID of this student registration
	*/
	@Override
	public void setUserId(long userId) {
		_studentRegistration.setUserId(userId);
	}

	/**
	* Returns the user uuid of this student registration.
	*
	* @return the user uuid of this student registration
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentRegistration.getUserUuid();
	}

	/**
	* Sets the user uuid of this student registration.
	*
	* @param userUuid the user uuid of this student registration
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_studentRegistration.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this student registration.
	*
	* @return the user name of this student registration
	*/
	@Override
	public java.lang.String getUserName() {
		return _studentRegistration.getUserName();
	}

	/**
	* Sets the user name of this student registration.
	*
	* @param userName the user name of this student registration
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_studentRegistration.setUserName(userName);
	}

	/**
	* Returns the create date of this student registration.
	*
	* @return the create date of this student registration
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _studentRegistration.getCreateDate();
	}

	/**
	* Sets the create date of this student registration.
	*
	* @param createDate the create date of this student registration
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_studentRegistration.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this student registration.
	*
	* @return the modified date of this student registration
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _studentRegistration.getModifiedDate();
	}

	/**
	* Sets the modified date of this student registration.
	*
	* @param modifiedDate the modified date of this student registration
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_studentRegistration.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the memo of this student registration.
	*
	* @return the memo of this student registration
	*/
	@Override
	public java.lang.String getMemo() {
		return _studentRegistration.getMemo();
	}

	/**
	* Sets the memo of this student registration.
	*
	* @param memo the memo of this student registration
	*/
	@Override
	public void setMemo(java.lang.String memo) {
		_studentRegistration.setMemo(memo);
	}

	/**
	* Returns the stud reg status of this student registration.
	*
	* @return the stud reg status of this student registration
	*/
	@Override
	public java.lang.String getStudRegStatus() {
		return _studentRegistration.getStudRegStatus();
	}

	/**
	* Sets the stud reg status of this student registration.
	*
	* @param studRegStatus the stud reg status of this student registration
	*/
	@Override
	public void setStudRegStatus(java.lang.String studRegStatus) {
		_studentRegistration.setStudRegStatus(studRegStatus);
	}

	/**
	* Returns the advisor orig of this student registration.
	*
	* @return the advisor orig of this student registration
	*/
	@Override
	public java.lang.String getAdvisorOrig() {
		return _studentRegistration.getAdvisorOrig();
	}

	/**
	* Sets the advisor orig of this student registration.
	*
	* @param advisorOrig the advisor orig of this student registration
	*/
	@Override
	public void setAdvisorOrig(java.lang.String advisorOrig) {
		_studentRegistration.setAdvisorOrig(advisorOrig);
	}

	/**
	* Returns the advisor reg of this student registration.
	*
	* @return the advisor reg of this student registration
	*/
	@Override
	public java.lang.String getAdvisorReg() {
		return _studentRegistration.getAdvisorReg();
	}

	/**
	* Sets the advisor reg of this student registration.
	*
	* @param advisorReg the advisor reg of this student registration
	*/
	@Override
	public void setAdvisorReg(java.lang.String advisorReg) {
		_studentRegistration.setAdvisorReg(advisorReg);
	}

	/**
	* Returns the course package ID of this student registration.
	*
	* @return the course package ID of this student registration
	*/
	@Override
	public long getCoursePackageId() {
		return _studentRegistration.getCoursePackageId();
	}

	/**
	* Sets the course package ID of this student registration.
	*
	* @param coursePackageId the course package ID of this student registration
	*/
	@Override
	public void setCoursePackageId(long coursePackageId) {
		_studentRegistration.setCoursePackageId(coursePackageId);
	}

	/**
	* Returns the discount ID of this student registration.
	*
	* @return the discount ID of this student registration
	*/
	@Override
	public long getDiscountId() {
		return _studentRegistration.getDiscountId();
	}

	/**
	* Sets the discount ID of this student registration.
	*
	* @param discountId the discount ID of this student registration
	*/
	@Override
	public void setDiscountId(long discountId) {
		_studentRegistration.setDiscountId(discountId);
	}

	/**
	* Returns the comm method of this student registration.
	*
	* @return the comm method of this student registration
	*/
	@Override
	public java.lang.String getCommMethod() {
		return _studentRegistration.getCommMethod();
	}

	/**
	* Sets the comm method of this student registration.
	*
	* @param commMethod the comm method of this student registration
	*/
	@Override
	public void setCommMethod(java.lang.String commMethod) {
		_studentRegistration.setCommMethod(commMethod);
	}

	/**
	* Returns the notes of this student registration.
	*
	* @return the notes of this student registration
	*/
	@Override
	public java.lang.String getNotes() {
		return _studentRegistration.getNotes();
	}

	/**
	* Sets the notes of this student registration.
	*
	* @param notes the notes of this student registration
	*/
	@Override
	public void setNotes(java.lang.String notes) {
		_studentRegistration.setNotes(notes);
	}

	/**
	* Returns the currency of this student registration.
	*
	* @return the currency of this student registration
	*/
	@Override
	public java.lang.String getCurrency() {
		return _studentRegistration.getCurrency();
	}

	/**
	* Sets the currency of this student registration.
	*
	* @param currency the currency of this student registration
	*/
	@Override
	public void setCurrency(java.lang.String currency) {
		_studentRegistration.setCurrency(currency);
	}

	/**
	* Returns the tax of this student registration.
	*
	* @return the tax of this student registration
	*/
	@Override
	public long getTax() {
		return _studentRegistration.getTax();
	}

	/**
	* Sets the tax of this student registration.
	*
	* @param tax the tax of this student registration
	*/
	@Override
	public void setTax(long tax) {
		_studentRegistration.setTax(tax);
	}

	/**
	* Returns the auto charge of this student registration.
	*
	* @return the auto charge of this student registration
	*/
	@Override
	public java.lang.String getAutoCharge() {
		return _studentRegistration.getAutoCharge();
	}

	/**
	* Sets the auto charge of this student registration.
	*
	* @param autoCharge the auto charge of this student registration
	*/
	@Override
	public void setAutoCharge(java.lang.String autoCharge) {
		_studentRegistration.setAutoCharge(autoCharge);
	}

	/**
	* Returns the currency paid of this student registration.
	*
	* @return the currency paid of this student registration
	*/
	@Override
	public java.lang.String getCurrencyPaid() {
		return _studentRegistration.getCurrencyPaid();
	}

	/**
	* Sets the currency paid of this student registration.
	*
	* @param currencyPaid the currency paid of this student registration
	*/
	@Override
	public void setCurrencyPaid(java.lang.String currencyPaid) {
		_studentRegistration.setCurrencyPaid(currencyPaid);
	}

	/**
	* Returns the exchange rate of this student registration.
	*
	* @return the exchange rate of this student registration
	*/
	@Override
	public long getExchangeRate() {
		return _studentRegistration.getExchangeRate();
	}

	/**
	* Sets the exchange rate of this student registration.
	*
	* @param exchangeRate the exchange rate of this student registration
	*/
	@Override
	public void setExchangeRate(long exchangeRate) {
		_studentRegistration.setExchangeRate(exchangeRate);
	}

	/**
	* Returns the contact ID of this student registration.
	*
	* @return the contact ID of this student registration
	*/
	@Override
	public long getContactId() {
		return _studentRegistration.getContactId();
	}

	/**
	* Sets the contact ID of this student registration.
	*
	* @param contactId the contact ID of this student registration
	*/
	@Override
	public void setContactId(long contactId) {
		_studentRegistration.setContactId(contactId);
	}

	@Override
	public boolean isNew() {
		return _studentRegistration.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_studentRegistration.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _studentRegistration.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_studentRegistration.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _studentRegistration.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _studentRegistration.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_studentRegistration.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _studentRegistration.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_studentRegistration.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_studentRegistration.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_studentRegistration.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new StudentRegistrationWrapper((StudentRegistration)_studentRegistration.clone());
	}

	@Override
	public int compareTo(StudentRegistration studentRegistration) {
		return _studentRegistration.compareTo(studentRegistration);
	}

	@Override
	public int hashCode() {
		return _studentRegistration.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<StudentRegistration> toCacheModel() {
		return _studentRegistration.toCacheModel();
	}

	@Override
	public StudentRegistration toEscapedModel() {
		return new StudentRegistrationWrapper(_studentRegistration.toEscapedModel());
	}

	@Override
	public StudentRegistration toUnescapedModel() {
		return new StudentRegistrationWrapper(_studentRegistration.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _studentRegistration.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _studentRegistration.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_studentRegistration.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StudentRegistrationWrapper)) {
			return false;
		}

		StudentRegistrationWrapper studentRegistrationWrapper = (StudentRegistrationWrapper)obj;

		if (Validator.equals(_studentRegistration,
					studentRegistrationWrapper._studentRegistration)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public StudentRegistration getWrappedStudentRegistration() {
		return _studentRegistration;
	}

	@Override
	public StudentRegistration getWrappedModel() {
		return _studentRegistration;
	}

	@Override
	public void resetOriginalValues() {
		_studentRegistration.resetOriginalValues();
	}

	private StudentRegistration _studentRegistration;
}