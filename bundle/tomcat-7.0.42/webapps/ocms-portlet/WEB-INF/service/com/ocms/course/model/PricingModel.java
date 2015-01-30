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
 * The base model interface for the Pricing service. Represents a row in the &quot;CM_Pricing&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ocms.course.model.impl.PricingModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ocms.course.model.impl.PricingImpl}.
 * </p>
 *
 * @author doraraj
 * @see Pricing
 * @see com.ocms.course.model.impl.PricingImpl
 * @see com.ocms.course.model.impl.PricingModelImpl
 * @generated
 */
public interface PricingModel extends BaseModel<Pricing>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a pricing model instance should use the {@link Pricing} interface instead.
	 */

	/**
	 * Returns the primary key of this pricing.
	 *
	 * @return the primary key of this pricing
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this pricing.
	 *
	 * @param primaryKey the primary key of this pricing
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the pricing ID of this pricing.
	 *
	 * @return the pricing ID of this pricing
	 */
	public long getPricingId();

	/**
	 * Sets the pricing ID of this pricing.
	 *
	 * @param pricingId the pricing ID of this pricing
	 */
	public void setPricingId(long pricingId);

	/**
	 * Returns the group ID of this pricing.
	 *
	 * @return the group ID of this pricing
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this pricing.
	 *
	 * @param groupId the group ID of this pricing
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this pricing.
	 *
	 * @return the company ID of this pricing
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this pricing.
	 *
	 * @param companyId the company ID of this pricing
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this pricing.
	 *
	 * @return the user ID of this pricing
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this pricing.
	 *
	 * @param userId the user ID of this pricing
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this pricing.
	 *
	 * @return the user uuid of this pricing
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this pricing.
	 *
	 * @param userUuid the user uuid of this pricing
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this pricing.
	 *
	 * @return the user name of this pricing
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this pricing.
	 *
	 * @param userName the user name of this pricing
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this pricing.
	 *
	 * @return the create date of this pricing
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this pricing.
	 *
	 * @param createDate the create date of this pricing
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this pricing.
	 *
	 * @return the modified date of this pricing
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this pricing.
	 *
	 * @param modifiedDate the modified date of this pricing
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the location ID of this pricing.
	 *
	 * @return the location ID of this pricing
	 */
	public int getLocationId();

	/**
	 * Sets the location ID of this pricing.
	 *
	 * @param locationId the location ID of this pricing
	 */
	public void setLocationId(int locationId);

	/**
	 * Returns the course ID of this pricing.
	 *
	 * @return the course ID of this pricing
	 */
	public int getCourseId();

	/**
	 * Sets the course ID of this pricing.
	 *
	 * @param courseId the course ID of this pricing
	 */
	public void setCourseId(int courseId);

	/**
	 * Returns the package ID of this pricing.
	 *
	 * @return the package ID of this pricing
	 */
	public int getPackageId();

	/**
	 * Sets the package ID of this pricing.
	 *
	 * @param packageId the package ID of this pricing
	 */
	public void setPackageId(int packageId);

	/**
	 * Returns the deposit of this pricing.
	 *
	 * @return the deposit of this pricing
	 */
	public int getDeposit();

	/**
	 * Sets the deposit of this pricing.
	 *
	 * @param deposit the deposit of this pricing
	 */
	public void setDeposit(int deposit);

	/**
	 * Returns the price of this pricing.
	 *
	 * @return the price of this pricing
	 */
	public int getPrice();

	/**
	 * Sets the price of this pricing.
	 *
	 * @param price the price of this pricing
	 */
	public void setPrice(int price);

	/**
	 * Returns the currency of this pricing.
	 *
	 * @return the currency of this pricing
	 */
	@AutoEscape
	public String getCurrency();

	/**
	 * Sets the currency of this pricing.
	 *
	 * @param currency the currency of this pricing
	 */
	public void setCurrency(String currency);

	/**
	 * Returns the effective date of this pricing.
	 *
	 * @return the effective date of this pricing
	 */
	public Date getEffectiveDate();

	/**
	 * Sets the effective date of this pricing.
	 *
	 * @param effectiveDate the effective date of this pricing
	 */
	public void setEffectiveDate(Date effectiveDate);

	/**
	 * Returns the course code of this pricing.
	 *
	 * @return the course code of this pricing
	 */
	@AutoEscape
	public String getCourseCode();

	/**
	 * Sets the course code of this pricing.
	 *
	 * @param courseCode the course code of this pricing
	 */
	public void setCourseCode(String courseCode);

	/**
	 * Returns the location code of this pricing.
	 *
	 * @return the location code of this pricing
	 */
	@AutoEscape
	public String getLocationCode();

	/**
	 * Sets the location code of this pricing.
	 *
	 * @param locationCode the location code of this pricing
	 */
	public void setLocationCode(String locationCode);

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
	public int compareTo(Pricing pricing);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Pricing> toCacheModel();

	@Override
	public Pricing toEscapedModel();

	@Override
	public Pricing toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}