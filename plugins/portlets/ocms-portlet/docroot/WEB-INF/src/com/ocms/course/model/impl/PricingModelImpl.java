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

import com.ocms.course.model.Pricing;
import com.ocms.course.model.PricingModel;
import com.ocms.course.model.PricingSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Pricing service. Represents a row in the &quot;CM_Pricing&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ocms.course.model.PricingModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PricingImpl}.
 * </p>
 *
 * @author doraraj
 * @see PricingImpl
 * @see com.ocms.course.model.Pricing
 * @see com.ocms.course.model.PricingModel
 * @generated
 */
@JSON(strict = true)
public class PricingModelImpl extends BaseModelImpl<Pricing>
	implements PricingModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a pricing model instance should use the {@link com.ocms.course.model.Pricing} interface instead.
	 */
	public static final String TABLE_NAME = "CM_Pricing";
	public static final Object[][] TABLE_COLUMNS = {
			{ "pricingId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "locationId", Types.INTEGER },
			{ "courseId", Types.INTEGER },
			{ "packageId", Types.INTEGER },
			{ "deposit", Types.INTEGER },
			{ "price", Types.INTEGER },
			{ "currency_", Types.VARCHAR },
			{ "effectiveDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table CM_Pricing (pricingId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,locationId INTEGER,courseId INTEGER,packageId INTEGER,deposit INTEGER,price INTEGER,currency_ VARCHAR(75) null,effectiveDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table CM_Pricing";
	public static final String ORDER_BY_JPQL = " ORDER BY pricing.pricingId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CM_Pricing.pricingId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.ocms.course.model.Pricing"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.ocms.course.model.Pricing"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.ocms.course.model.Pricing"),
			true);
	public static long COURSEID_COLUMN_BITMASK = 1L;
	public static long LOCATIONID_COLUMN_BITMASK = 2L;
	public static long PACKAGEID_COLUMN_BITMASK = 4L;
	public static long PRICE_COLUMN_BITMASK = 8L;
	public static long PRICINGID_COLUMN_BITMASK = 16L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Pricing toModel(PricingSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Pricing model = new PricingImpl();

		model.setPricingId(soapModel.getPricingId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setLocationId(soapModel.getLocationId());
		model.setCourseId(soapModel.getCourseId());
		model.setPackageId(soapModel.getPackageId());
		model.setDeposit(soapModel.getDeposit());
		model.setPrice(soapModel.getPrice());
		model.setCurrency(soapModel.getCurrency());
		model.setEffectiveDate(soapModel.getEffectiveDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Pricing> toModels(PricingSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Pricing> models = new ArrayList<Pricing>(soapModels.length);

		for (PricingSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.ocms.course.model.Pricing"));

	public PricingModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _pricingId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPricingId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _pricingId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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
		attributes.put("effectiveDate", getEffectiveDate());

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

		Date effectiveDate = (Date)attributes.get("effectiveDate");

		if (effectiveDate != null) {
			setEffectiveDate(effectiveDate);
		}
	}

	@JSON
	@Override
	public long getPricingId() {
		return _pricingId;
	}

	@Override
	public void setPricingId(long pricingId) {
		_columnBitmask |= PRICINGID_COLUMN_BITMASK;

		if (!_setOriginalPricingId) {
			_setOriginalPricingId = true;

			_originalPricingId = _pricingId;
		}

		_pricingId = pricingId;
	}

	public long getOriginalPricingId() {
		return _originalPricingId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
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
	public int getLocationId() {
		return _locationId;
	}

	@Override
	public void setLocationId(int locationId) {
		_columnBitmask |= LOCATIONID_COLUMN_BITMASK;

		if (!_setOriginalLocationId) {
			_setOriginalLocationId = true;

			_originalLocationId = _locationId;
		}

		_locationId = locationId;
	}

	public int getOriginalLocationId() {
		return _originalLocationId;
	}

	@JSON
	@Override
	public int getCourseId() {
		return _courseId;
	}

	@Override
	public void setCourseId(int courseId) {
		_columnBitmask |= COURSEID_COLUMN_BITMASK;

		if (!_setOriginalCourseId) {
			_setOriginalCourseId = true;

			_originalCourseId = _courseId;
		}

		_courseId = courseId;
	}

	public int getOriginalCourseId() {
		return _originalCourseId;
	}

	@JSON
	@Override
	public int getPackageId() {
		return _packageId;
	}

	@Override
	public void setPackageId(int packageId) {
		_columnBitmask |= PACKAGEID_COLUMN_BITMASK;

		if (!_setOriginalPackageId) {
			_setOriginalPackageId = true;

			_originalPackageId = _packageId;
		}

		_packageId = packageId;
	}

	public int getOriginalPackageId() {
		return _originalPackageId;
	}

	@JSON
	@Override
	public int getDeposit() {
		return _deposit;
	}

	@Override
	public void setDeposit(int deposit) {
		_deposit = deposit;
	}

	@JSON
	@Override
	public int getPrice() {
		return _price;
	}

	@Override
	public void setPrice(int price) {
		_columnBitmask |= PRICE_COLUMN_BITMASK;

		if (!_setOriginalPrice) {
			_setOriginalPrice = true;

			_originalPrice = _price;
		}

		_price = price;
	}

	public int getOriginalPrice() {
		return _originalPrice;
	}

	@JSON
	@Override
	public String getCurrency() {
		if (_currency == null) {
			return StringPool.BLANK;
		}
		else {
			return _currency;
		}
	}

	@Override
	public void setCurrency(String currency) {
		_currency = currency;
	}

	@JSON
	@Override
	public Date getEffectiveDate() {
		return _effectiveDate;
	}

	@Override
	public void setEffectiveDate(Date effectiveDate) {
		_effectiveDate = effectiveDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Pricing.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Pricing toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Pricing)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		PricingImpl pricingImpl = new PricingImpl();

		pricingImpl.setPricingId(getPricingId());
		pricingImpl.setGroupId(getGroupId());
		pricingImpl.setCompanyId(getCompanyId());
		pricingImpl.setUserId(getUserId());
		pricingImpl.setUserName(getUserName());
		pricingImpl.setCreateDate(getCreateDate());
		pricingImpl.setModifiedDate(getModifiedDate());
		pricingImpl.setLocationId(getLocationId());
		pricingImpl.setCourseId(getCourseId());
		pricingImpl.setPackageId(getPackageId());
		pricingImpl.setDeposit(getDeposit());
		pricingImpl.setPrice(getPrice());
		pricingImpl.setCurrency(getCurrency());
		pricingImpl.setEffectiveDate(getEffectiveDate());

		pricingImpl.resetOriginalValues();

		return pricingImpl;
	}

	@Override
	public int compareTo(Pricing pricing) {
		long primaryKey = pricing.getPrimaryKey();

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

		if (!(obj instanceof Pricing)) {
			return false;
		}

		Pricing pricing = (Pricing)obj;

		long primaryKey = pricing.getPrimaryKey();

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
		PricingModelImpl pricingModelImpl = this;

		pricingModelImpl._originalPricingId = pricingModelImpl._pricingId;

		pricingModelImpl._setOriginalPricingId = false;

		pricingModelImpl._originalLocationId = pricingModelImpl._locationId;

		pricingModelImpl._setOriginalLocationId = false;

		pricingModelImpl._originalCourseId = pricingModelImpl._courseId;

		pricingModelImpl._setOriginalCourseId = false;

		pricingModelImpl._originalPackageId = pricingModelImpl._packageId;

		pricingModelImpl._setOriginalPackageId = false;

		pricingModelImpl._originalPrice = pricingModelImpl._price;

		pricingModelImpl._setOriginalPrice = false;

		pricingModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Pricing> toCacheModel() {
		PricingCacheModel pricingCacheModel = new PricingCacheModel();

		pricingCacheModel.pricingId = getPricingId();

		pricingCacheModel.groupId = getGroupId();

		pricingCacheModel.companyId = getCompanyId();

		pricingCacheModel.userId = getUserId();

		pricingCacheModel.userName = getUserName();

		String userName = pricingCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			pricingCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			pricingCacheModel.createDate = createDate.getTime();
		}
		else {
			pricingCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			pricingCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			pricingCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		pricingCacheModel.locationId = getLocationId();

		pricingCacheModel.courseId = getCourseId();

		pricingCacheModel.packageId = getPackageId();

		pricingCacheModel.deposit = getDeposit();

		pricingCacheModel.price = getPrice();

		pricingCacheModel.currency = getCurrency();

		String currency = pricingCacheModel.currency;

		if ((currency != null) && (currency.length() == 0)) {
			pricingCacheModel.currency = null;
		}

		Date effectiveDate = getEffectiveDate();

		if (effectiveDate != null) {
			pricingCacheModel.effectiveDate = effectiveDate.getTime();
		}
		else {
			pricingCacheModel.effectiveDate = Long.MIN_VALUE;
		}

		return pricingCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{pricingId=");
		sb.append(getPricingId());
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
		sb.append(", locationId=");
		sb.append(getLocationId());
		sb.append(", courseId=");
		sb.append(getCourseId());
		sb.append(", packageId=");
		sb.append(getPackageId());
		sb.append(", deposit=");
		sb.append(getDeposit());
		sb.append(", price=");
		sb.append(getPrice());
		sb.append(", currency=");
		sb.append(getCurrency());
		sb.append(", effectiveDate=");
		sb.append(getEffectiveDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.ocms.course.model.Pricing");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>pricingId</column-name><column-value><![CDATA[");
		sb.append(getPricingId());
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
			"<column><column-name>locationId</column-name><column-value><![CDATA[");
		sb.append(getLocationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>courseId</column-name><column-value><![CDATA[");
		sb.append(getCourseId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>packageId</column-name><column-value><![CDATA[");
		sb.append(getPackageId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>deposit</column-name><column-value><![CDATA[");
		sb.append(getDeposit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>price</column-name><column-value><![CDATA[");
		sb.append(getPrice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currency</column-name><column-value><![CDATA[");
		sb.append(getCurrency());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>effectiveDate</column-name><column-value><![CDATA[");
		sb.append(getEffectiveDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Pricing.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Pricing.class
		};
	private long _pricingId;
	private long _originalPricingId;
	private boolean _setOriginalPricingId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _locationId;
	private int _originalLocationId;
	private boolean _setOriginalLocationId;
	private int _courseId;
	private int _originalCourseId;
	private boolean _setOriginalCourseId;
	private int _packageId;
	private int _originalPackageId;
	private boolean _setOriginalPackageId;
	private int _deposit;
	private int _price;
	private int _originalPrice;
	private boolean _setOriginalPrice;
	private String _currency;
	private Date _effectiveDate;
	private long _columnBitmask;
	private Pricing _escapedModel;
}