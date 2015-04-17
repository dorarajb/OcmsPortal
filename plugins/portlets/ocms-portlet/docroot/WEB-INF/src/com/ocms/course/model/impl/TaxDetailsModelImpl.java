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

package com.ocms.course.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.ocms.course.model.TaxDetails;
import com.ocms.course.model.TaxDetailsModel;
import com.ocms.course.model.TaxDetailsSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the TaxDetails service. Represents a row in the &quot;CM_TaxDetails&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ocms.course.model.TaxDetailsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TaxDetailsImpl}.
 * </p>
 *
 * @author doraraj
 * @see TaxDetailsImpl
 * @see com.ocms.course.model.TaxDetails
 * @see com.ocms.course.model.TaxDetailsModel
 * @generated
 */
@JSON(strict = true)
public class TaxDetailsModelImpl extends BaseModelImpl<TaxDetails>
	implements TaxDetailsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tax details model instance should use the {@link com.ocms.course.model.TaxDetails} interface instead.
	 */
	public static final String TABLE_NAME = "CM_TaxDetails";
	public static final Object[][] TABLE_COLUMNS = {
			{ "taxDetailsId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "country", Types.VARCHAR },
			{ "taxTypeId", Types.BIGINT },
			{ "effectiveFromDate", Types.TIMESTAMP },
			{ "effectiveToDate", Types.TIMESTAMP },
			{ "active_", Types.INTEGER },
			{ "taxPercent", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table CM_TaxDetails (taxDetailsId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,country VARCHAR(75) null,taxTypeId LONG,effectiveFromDate DATE null,effectiveToDate DATE null,active_ INTEGER,taxPercent INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table CM_TaxDetails";
	public static final String ORDER_BY_JPQL = " ORDER BY taxDetails.taxDetailsId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CM_TaxDetails.taxDetailsId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.ocms.course.model.TaxDetails"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.ocms.course.model.TaxDetails"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.ocms.course.model.TaxDetails"),
			true);
	public static long ACTIVE_COLUMN_BITMASK = 1L;
	public static long GROUPID_COLUMN_BITMASK = 2L;
	public static long TAXDETAILSID_COLUMN_BITMASK = 4L;
	public static long TAXTYPEID_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static TaxDetails toModel(TaxDetailsSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		TaxDetails model = new TaxDetailsImpl();

		model.setTaxDetailsId(soapModel.getTaxDetailsId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setCountry(soapModel.getCountry());
		model.setTaxTypeId(soapModel.getTaxTypeId());
		model.setEffectiveFromDate(soapModel.getEffectiveFromDate());
		model.setEffectiveToDate(soapModel.getEffectiveToDate());
		model.setActive(soapModel.getActive());
		model.setTaxPercent(soapModel.getTaxPercent());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<TaxDetails> toModels(TaxDetailsSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<TaxDetails> models = new ArrayList<TaxDetails>(soapModels.length);

		for (TaxDetailsSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.ocms.course.model.TaxDetails"));

	public TaxDetailsModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _taxDetailsId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTaxDetailsId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _taxDetailsId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@JSON
	@Override
	public long getTaxDetailsId() {
		return _taxDetailsId;
	}

	@Override
	public void setTaxDetailsId(long taxDetailsId) {
		_columnBitmask |= TAXDETAILSID_COLUMN_BITMASK;

		if (!_setOriginalTaxDetailsId) {
			_setOriginalTaxDetailsId = true;

			_originalTaxDetailsId = _taxDetailsId;
		}

		_taxDetailsId = taxDetailsId;
	}

	public long getOriginalTaxDetailsId() {
		return _originalTaxDetailsId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getCountry() {
		if (_country == null) {
			return StringPool.BLANK;
		}
		else {
			return _country;
		}
	}

	@Override
	public void setCountry(String country) {
		_country = country;
	}

	@JSON
	@Override
	public long getTaxTypeId() {
		return _taxTypeId;
	}

	@Override
	public void setTaxTypeId(long taxTypeId) {
		_columnBitmask |= TAXTYPEID_COLUMN_BITMASK;

		if (!_setOriginalTaxTypeId) {
			_setOriginalTaxTypeId = true;

			_originalTaxTypeId = _taxTypeId;
		}

		_taxTypeId = taxTypeId;
	}

	public long getOriginalTaxTypeId() {
		return _originalTaxTypeId;
	}

	@JSON
	@Override
	public Date getEffectiveFromDate() {
		return _effectiveFromDate;
	}

	@Override
	public void setEffectiveFromDate(Date effectiveFromDate) {
		_effectiveFromDate = effectiveFromDate;
	}

	@JSON
	@Override
	public Date getEffectiveToDate() {
		return _effectiveToDate;
	}

	@Override
	public void setEffectiveToDate(Date effectiveToDate) {
		_effectiveToDate = effectiveToDate;
	}

	@JSON
	@Override
	public int getActive() {
		return _active;
	}

	@Override
	public void setActive(int active) {
		_columnBitmask |= ACTIVE_COLUMN_BITMASK;

		if (!_setOriginalActive) {
			_setOriginalActive = true;

			_originalActive = _active;
		}

		_active = active;
	}

	public int getOriginalActive() {
		return _originalActive;
	}

	@JSON
	@Override
	public int getTaxPercent() {
		return _taxPercent;
	}

	@Override
	public void setTaxPercent(int taxPercent) {
		_taxPercent = taxPercent;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			TaxDetails.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TaxDetails toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TaxDetails)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TaxDetailsImpl taxDetailsImpl = new TaxDetailsImpl();

		taxDetailsImpl.setTaxDetailsId(getTaxDetailsId());
		taxDetailsImpl.setGroupId(getGroupId());
		taxDetailsImpl.setCompanyId(getCompanyId());
		taxDetailsImpl.setUserId(getUserId());
		taxDetailsImpl.setUserName(getUserName());
		taxDetailsImpl.setCreateDate(getCreateDate());
		taxDetailsImpl.setModifiedDate(getModifiedDate());
		taxDetailsImpl.setCountry(getCountry());
		taxDetailsImpl.setTaxTypeId(getTaxTypeId());
		taxDetailsImpl.setEffectiveFromDate(getEffectiveFromDate());
		taxDetailsImpl.setEffectiveToDate(getEffectiveToDate());
		taxDetailsImpl.setActive(getActive());
		taxDetailsImpl.setTaxPercent(getTaxPercent());

		taxDetailsImpl.resetOriginalValues();

		return taxDetailsImpl;
	}

	@Override
	public int compareTo(TaxDetails taxDetails) {
		long primaryKey = taxDetails.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TaxDetails)) {
			return false;
		}

		TaxDetails taxDetails = (TaxDetails)obj;

		long primaryKey = taxDetails.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		TaxDetailsModelImpl taxDetailsModelImpl = this;

		taxDetailsModelImpl._originalTaxDetailsId = taxDetailsModelImpl._taxDetailsId;

		taxDetailsModelImpl._setOriginalTaxDetailsId = false;

		taxDetailsModelImpl._originalGroupId = taxDetailsModelImpl._groupId;

		taxDetailsModelImpl._setOriginalGroupId = false;

		taxDetailsModelImpl._originalTaxTypeId = taxDetailsModelImpl._taxTypeId;

		taxDetailsModelImpl._setOriginalTaxTypeId = false;

		taxDetailsModelImpl._originalActive = taxDetailsModelImpl._active;

		taxDetailsModelImpl._setOriginalActive = false;

		taxDetailsModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TaxDetails> toCacheModel() {
		TaxDetailsCacheModel taxDetailsCacheModel = new TaxDetailsCacheModel();

		taxDetailsCacheModel.taxDetailsId = getTaxDetailsId();

		taxDetailsCacheModel.groupId = getGroupId();

		taxDetailsCacheModel.companyId = getCompanyId();

		taxDetailsCacheModel.userId = getUserId();

		taxDetailsCacheModel.userName = getUserName();

		String userName = taxDetailsCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			taxDetailsCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			taxDetailsCacheModel.createDate = createDate.getTime();
		}
		else {
			taxDetailsCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			taxDetailsCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			taxDetailsCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		taxDetailsCacheModel.country = getCountry();

		String country = taxDetailsCacheModel.country;

		if ((country != null) && (country.length() == 0)) {
			taxDetailsCacheModel.country = null;
		}

		taxDetailsCacheModel.taxTypeId = getTaxTypeId();

		Date effectiveFromDate = getEffectiveFromDate();

		if (effectiveFromDate != null) {
			taxDetailsCacheModel.effectiveFromDate = effectiveFromDate.getTime();
		}
		else {
			taxDetailsCacheModel.effectiveFromDate = Long.MIN_VALUE;
		}

		Date effectiveToDate = getEffectiveToDate();

		if (effectiveToDate != null) {
			taxDetailsCacheModel.effectiveToDate = effectiveToDate.getTime();
		}
		else {
			taxDetailsCacheModel.effectiveToDate = Long.MIN_VALUE;
		}

		taxDetailsCacheModel.active = getActive();

		taxDetailsCacheModel.taxPercent = getTaxPercent();

		return taxDetailsCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{taxDetailsId=");
		sb.append(getTaxDetailsId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", country=");
		sb.append(getCountry());
		sb.append(", taxTypeId=");
		sb.append(getTaxTypeId());
		sb.append(", effectiveFromDate=");
		sb.append(getEffectiveFromDate());
		sb.append(", effectiveToDate=");
		sb.append(getEffectiveToDate());
		sb.append(", active=");
		sb.append(getActive());
		sb.append(", taxPercent=");
		sb.append(getTaxPercent());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.ocms.course.model.TaxDetails");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>taxDetailsId</column-name><column-value><![CDATA[");
		sb.append(getTaxDetailsId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>country</column-name><column-value><![CDATA[");
		sb.append(getCountry());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taxTypeId</column-name><column-value><![CDATA[");
		sb.append(getTaxTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>effectiveFromDate</column-name><column-value><![CDATA[");
		sb.append(getEffectiveFromDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>effectiveToDate</column-name><column-value><![CDATA[");
		sb.append(getEffectiveToDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>active</column-name><column-value><![CDATA[");
		sb.append(getActive());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taxPercent</column-name><column-value><![CDATA[");
		sb.append(getTaxPercent());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = TaxDetails.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TaxDetails.class
		};
	private long _taxDetailsId;
	private long _originalTaxDetailsId;
	private boolean _setOriginalTaxDetailsId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _country;
	private long _taxTypeId;
	private long _originalTaxTypeId;
	private boolean _setOriginalTaxTypeId;
	private Date _effectiveFromDate;
	private Date _effectiveToDate;
	private int _active;
	private int _originalActive;
	private boolean _setOriginalActive;
	private int _taxPercent;
	private long _columnBitmask;
	private TaxDetails _escapedModel;
}