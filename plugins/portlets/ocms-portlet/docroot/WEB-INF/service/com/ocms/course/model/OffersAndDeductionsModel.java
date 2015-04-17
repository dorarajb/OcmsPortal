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
 * The base model interface for the OffersAndDeductions service. Represents a row in the &quot;CM_OffersAndDeductions&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ocms.course.model.impl.OffersAndDeductionsImpl}.
 * </p>
 *
 * @author doraraj
 * @see OffersAndDeductions
 * @see com.ocms.course.model.impl.OffersAndDeductionsImpl
 * @see com.ocms.course.model.impl.OffersAndDeductionsModelImpl
 * @generated
 */
public interface OffersAndDeductionsModel extends BaseModel<OffersAndDeductions>,
	GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a offers and deductions model instance should use the {@link OffersAndDeductions} interface instead.
	 */

	/**
	 * Returns the primary key of this offers and deductions.
	 *
	 * @return the primary key of this offers and deductions
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this offers and deductions.
	 *
	 * @param primaryKey the primary key of this offers and deductions
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this offers and deductions.
	 *
	 * @return the ID of this offers and deductions
	 */
	public long getId();

	/**
	 * Sets the ID of this offers and deductions.
	 *
	 * @param id the ID of this offers and deductions
	 */
	public void setId(long id);

	/**
	 * Returns the group ID of this offers and deductions.
	 *
	 * @return the group ID of this offers and deductions
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this offers and deductions.
	 *
	 * @param groupId the group ID of this offers and deductions
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this offers and deductions.
	 *
	 * @return the company ID of this offers and deductions
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this offers and deductions.
	 *
	 * @param companyId the company ID of this offers and deductions
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this offers and deductions.
	 *
	 * @return the user ID of this offers and deductions
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this offers and deductions.
	 *
	 * @param userId the user ID of this offers and deductions
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this offers and deductions.
	 *
	 * @return the user uuid of this offers and deductions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this offers and deductions.
	 *
	 * @param userUuid the user uuid of this offers and deductions
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this offers and deductions.
	 *
	 * @return the user name of this offers and deductions
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this offers and deductions.
	 *
	 * @param userName the user name of this offers and deductions
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this offers and deductions.
	 *
	 * @return the create date of this offers and deductions
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this offers and deductions.
	 *
	 * @param createDate the create date of this offers and deductions
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this offers and deductions.
	 *
	 * @return the modified date of this offers and deductions
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this offers and deductions.
	 *
	 * @param modifiedDate the modified date of this offers and deductions
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the code of this offers and deductions.
	 *
	 * @return the code of this offers and deductions
	 */
	@AutoEscape
	public String getCode();

	/**
	 * Sets the code of this offers and deductions.
	 *
	 * @param code the code of this offers and deductions
	 */
	public void setCode(String code);

	/**
	 * Returns the description of this offers and deductions.
	 *
	 * @return the description of this offers and deductions
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this offers and deductions.
	 *
	 * @param description the description of this offers and deductions
	 */
	public void setDescription(String description);

	/**
	 * Returns the amount of this offers and deductions.
	 *
	 * @return the amount of this offers and deductions
	 */
	public long getAmount();

	/**
	 * Sets the amount of this offers and deductions.
	 *
	 * @param amount the amount of this offers and deductions
	 */
	public void setAmount(long amount);

	/**
	 * Returns the active of this offers and deductions.
	 *
	 * @return the active of this offers and deductions
	 */
	public int getActive();

	/**
	 * Sets the active of this offers and deductions.
	 *
	 * @param active the active of this offers and deductions
	 */
	public void setActive(int active);

	/**
	 * Returns the effective from date of this offers and deductions.
	 *
	 * @return the effective from date of this offers and deductions
	 */
	public Date getEffectiveFromDate();

	/**
	 * Sets the effective from date of this offers and deductions.
	 *
	 * @param effectiveFromDate the effective from date of this offers and deductions
	 */
	public void setEffectiveFromDate(Date effectiveFromDate);

	/**
	 * Returns the effectiveto date of this offers and deductions.
	 *
	 * @return the effectiveto date of this offers and deductions
	 */
	public Date getEffectivetoDate();

	/**
	 * Sets the effectiveto date of this offers and deductions.
	 *
	 * @param effectivetoDate the effectiveto date of this offers and deductions
	 */
	public void setEffectivetoDate(Date effectivetoDate);

	/**
	 * Returns the type of this offers and deductions.
	 *
	 * @return the type of this offers and deductions
	 */
	@AutoEscape
	public String getType();

	/**
	 * Sets the type of this offers and deductions.
	 *
	 * @param type the type of this offers and deductions
	 */
	public void setType(String type);

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
	public int compareTo(OffersAndDeductions offersAndDeductions);

	@Override
	public int hashCode();

	@Override
	public CacheModel<OffersAndDeductions> toCacheModel();

	@Override
	public OffersAndDeductions toEscapedModel();

	@Override
	public OffersAndDeductions toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}