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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the RegistrationDetails service. Represents a row in the &quot;CM_RegistrationDetails&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ocms.course.model.impl.RegistrationDetailsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ocms.course.model.impl.RegistrationDetailsImpl}.
 * </p>
 *
 * @author doraraj
 * @see RegistrationDetails
 * @see com.ocms.course.model.impl.RegistrationDetailsImpl
 * @see com.ocms.course.model.impl.RegistrationDetailsModelImpl
 * @generated
 */
public interface RegistrationDetailsModel extends BaseModel<RegistrationDetails>,
	GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a registration details model instance should use the {@link RegistrationDetails} interface instead.
	 */

	/**
	 * Returns the primary key of this registration details.
	 *
	 * @return the primary key of this registration details
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this registration details.
	 *
	 * @param primaryKey the primary key of this registration details
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the stud reg ID of this registration details.
	 *
	 * @return the stud reg ID of this registration details
	 */
	public long getStudRegId();

	/**
	 * Sets the stud reg ID of this registration details.
	 *
	 * @param studRegId the stud reg ID of this registration details
	 */
	public void setStudRegId(long studRegId);

	/**
	 * Returns the contact ID of this registration details.
	 *
	 * @return the contact ID of this registration details
	 */
	public long getContactId();

	/**
	 * Sets the contact ID of this registration details.
	 *
	 * @param contactId the contact ID of this registration details
	 */
	public void setContactId(long contactId);

	/**
	 * Returns the event ID of this registration details.
	 *
	 * @return the event ID of this registration details
	 */
	public long getEventId();

	/**
	 * Sets the event ID of this registration details.
	 *
	 * @param eventId the event ID of this registration details
	 */
	public void setEventId(long eventId);

	/**
	 * Returns the price of this registration details.
	 *
	 * @return the price of this registration details
	 */
	public double getPrice();

	/**
	 * Sets the price of this registration details.
	 *
	 * @param price the price of this registration details
	 */
	public void setPrice(double price);

	/**
	 * Returns the discount of this registration details.
	 *
	 * @return the discount of this registration details
	 */
	public double getDiscount();

	/**
	 * Sets the discount of this registration details.
	 *
	 * @param discount the discount of this registration details
	 */
	public void setDiscount(double discount);

	/**
	 * Returns the fee of this registration details.
	 *
	 * @return the fee of this registration details
	 */
	public double getFee();

	/**
	 * Sets the fee of this registration details.
	 *
	 * @param fee the fee of this registration details
	 */
	public void setFee(double fee);

	/**
	 * Returns the credit of this registration details.
	 *
	 * @return the credit of this registration details
	 */
	public double getCredit();

	/**
	 * Sets the credit of this registration details.
	 *
	 * @param credit the credit of this registration details
	 */
	public void setCredit(double credit);

	/**
	 * Returns the registration details ID of this registration details.
	 *
	 * @return the registration details ID of this registration details
	 */
	public long getRegistrationDetailsId();

	/**
	 * Sets the registration details ID of this registration details.
	 *
	 * @param registrationDetailsId the registration details ID of this registration details
	 */
	public void setRegistrationDetailsId(long registrationDetailsId);

	/**
	 * Returns the group ID of this registration details.
	 *
	 * @return the group ID of this registration details
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this registration details.
	 *
	 * @param groupId the group ID of this registration details
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this registration details.
	 *
	 * @return the company ID of this registration details
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this registration details.
	 *
	 * @param companyId the company ID of this registration details
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this registration details.
	 *
	 * @return the user ID of this registration details
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this registration details.
	 *
	 * @param userId the user ID of this registration details
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this registration details.
	 *
	 * @return the user uuid of this registration details
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this registration details.
	 *
	 * @param userUuid the user uuid of this registration details
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this registration details.
	 *
	 * @return the user name of this registration details
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this registration details.
	 *
	 * @param userName the user name of this registration details
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this registration details.
	 *
	 * @return the create date of this registration details
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this registration details.
	 *
	 * @param createDate the create date of this registration details
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this registration details.
	 *
	 * @return the modified date of this registration details
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this registration details.
	 *
	 * @param modifiedDate the modified date of this registration details
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(RegistrationDetails registrationDetails);

	@Override
	public int hashCode();

	@Override
	public CacheModel<RegistrationDetails> toCacheModel();

	@Override
	public RegistrationDetails toEscapedModel();

	@Override
	public RegistrationDetails toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}