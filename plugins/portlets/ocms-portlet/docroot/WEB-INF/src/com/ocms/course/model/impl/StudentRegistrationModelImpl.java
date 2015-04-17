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

import com.ocms.course.model.StudentRegistration;
import com.ocms.course.model.StudentRegistrationModel;
import com.ocms.course.model.StudentRegistrationSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the StudentRegistration service. Represents a row in the &quot;CM_StudentRegistration&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ocms.course.model.StudentRegistrationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link StudentRegistrationImpl}.
 * </p>
 *
 * @author doraraj
 * @see StudentRegistrationImpl
 * @see com.ocms.course.model.StudentRegistration
 * @see com.ocms.course.model.StudentRegistrationModel
 * @generated
 */
@JSON(strict = true)
public class StudentRegistrationModelImpl extends BaseModelImpl<StudentRegistration>
	implements StudentRegistrationModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a student registration model instance should use the {@link com.ocms.course.model.StudentRegistration} interface instead.
	 */
	public static final String TABLE_NAME = "CM_StudentRegistration";
	public static final Object[][] TABLE_COLUMNS = {
			{ "studRegId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "memo", Types.VARCHAR },
			{ "studRegStatus", Types.VARCHAR },
			{ "advisorOrig", Types.VARCHAR },
			{ "advisorReg", Types.VARCHAR },
			{ "coursePackageId", Types.BIGINT },
			{ "discountId", Types.BIGINT },
			{ "commMethod", Types.VARCHAR },
			{ "notes", Types.VARCHAR },
			{ "currency_", Types.VARCHAR },
			{ "tax", Types.BIGINT },
			{ "autoCharge", Types.VARCHAR },
			{ "currencyPaid", Types.VARCHAR },
			{ "exchangeRate", Types.BIGINT },
			{ "contactId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table CM_StudentRegistration (studRegId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,memo VARCHAR(75) null,studRegStatus VARCHAR(75) null,advisorOrig VARCHAR(75) null,advisorReg VARCHAR(75) null,coursePackageId LONG,discountId LONG,commMethod VARCHAR(75) null,notes VARCHAR(75) null,currency_ VARCHAR(75) null,tax LONG,autoCharge VARCHAR(75) null,currencyPaid VARCHAR(75) null,exchangeRate LONG,contactId LONG)";
	public static final String TABLE_SQL_DROP = "drop table CM_StudentRegistration";
	public static final String ORDER_BY_JPQL = " ORDER BY studentRegistration.studRegId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CM_StudentRegistration.studRegId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.ocms.course.model.StudentRegistration"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.ocms.course.model.StudentRegistration"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.ocms.course.model.StudentRegistration"),
			true);
	public static long GROUPID_COLUMN_BITMASK = 1L;
	public static long STUDREGID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static StudentRegistration toModel(StudentRegistrationSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		StudentRegistration model = new StudentRegistrationImpl();

		model.setStudRegId(soapModel.getStudRegId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setMemo(soapModel.getMemo());
		model.setStudRegStatus(soapModel.getStudRegStatus());
		model.setAdvisorOrig(soapModel.getAdvisorOrig());
		model.setAdvisorReg(soapModel.getAdvisorReg());
		model.setCoursePackageId(soapModel.getCoursePackageId());
		model.setDiscountId(soapModel.getDiscountId());
		model.setCommMethod(soapModel.getCommMethod());
		model.setNotes(soapModel.getNotes());
		model.setCurrency(soapModel.getCurrency());
		model.setTax(soapModel.getTax());
		model.setAutoCharge(soapModel.getAutoCharge());
		model.setCurrencyPaid(soapModel.getCurrencyPaid());
		model.setExchangeRate(soapModel.getExchangeRate());
		model.setContactId(soapModel.getContactId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<StudentRegistration> toModels(
		StudentRegistrationSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<StudentRegistration> models = new ArrayList<StudentRegistration>(soapModels.length);

		for (StudentRegistrationSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.ocms.course.model.StudentRegistration"));

	public StudentRegistrationModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _studRegId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setStudRegId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _studRegId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@JSON
	@Override
	public long getStudRegId() {
		return _studRegId;
	}

	@Override
	public void setStudRegId(long studRegId) {
		_columnBitmask |= STUDREGID_COLUMN_BITMASK;

		if (!_setOriginalStudRegId) {
			_setOriginalStudRegId = true;

			_originalStudRegId = _studRegId;
		}

		_studRegId = studRegId;
	}

	public long getOriginalStudRegId() {
		return _originalStudRegId;
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
	public String getMemo() {
		if (_memo == null) {
			return StringPool.BLANK;
		}
		else {
			return _memo;
		}
	}

	@Override
	public void setMemo(String memo) {
		_memo = memo;
	}

	@JSON
	@Override
	public String getStudRegStatus() {
		if (_studRegStatus == null) {
			return StringPool.BLANK;
		}
		else {
			return _studRegStatus;
		}
	}

	@Override
	public void setStudRegStatus(String studRegStatus) {
		_studRegStatus = studRegStatus;
	}

	@JSON
	@Override
	public String getAdvisorOrig() {
		if (_advisorOrig == null) {
			return StringPool.BLANK;
		}
		else {
			return _advisorOrig;
		}
	}

	@Override
	public void setAdvisorOrig(String advisorOrig) {
		_advisorOrig = advisorOrig;
	}

	@JSON
	@Override
	public String getAdvisorReg() {
		if (_advisorReg == null) {
			return StringPool.BLANK;
		}
		else {
			return _advisorReg;
		}
	}

	@Override
	public void setAdvisorReg(String advisorReg) {
		_advisorReg = advisorReg;
	}

	@JSON
	@Override
	public long getCoursePackageId() {
		return _coursePackageId;
	}

	@Override
	public void setCoursePackageId(long coursePackageId) {
		_coursePackageId = coursePackageId;
	}

	@JSON
	@Override
	public long getDiscountId() {
		return _discountId;
	}

	@Override
	public void setDiscountId(long discountId) {
		_discountId = discountId;
	}

	@JSON
	@Override
	public String getCommMethod() {
		if (_commMethod == null) {
			return StringPool.BLANK;
		}
		else {
			return _commMethod;
		}
	}

	@Override
	public void setCommMethod(String commMethod) {
		_commMethod = commMethod;
	}

	@JSON
	@Override
	public String getNotes() {
		if (_notes == null) {
			return StringPool.BLANK;
		}
		else {
			return _notes;
		}
	}

	@Override
	public void setNotes(String notes) {
		_notes = notes;
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
	public long getTax() {
		return _tax;
	}

	@Override
	public void setTax(long tax) {
		_tax = tax;
	}

	@JSON
	@Override
	public String getAutoCharge() {
		if (_autoCharge == null) {
			return StringPool.BLANK;
		}
		else {
			return _autoCharge;
		}
	}

	@Override
	public void setAutoCharge(String autoCharge) {
		_autoCharge = autoCharge;
	}

	@JSON
	@Override
	public String getCurrencyPaid() {
		if (_currencyPaid == null) {
			return StringPool.BLANK;
		}
		else {
			return _currencyPaid;
		}
	}

	@Override
	public void setCurrencyPaid(String currencyPaid) {
		_currencyPaid = currencyPaid;
	}

	@JSON
	@Override
	public long getExchangeRate() {
		return _exchangeRate;
	}

	@Override
	public void setExchangeRate(long exchangeRate) {
		_exchangeRate = exchangeRate;
	}

	@JSON
	@Override
	public long getContactId() {
		return _contactId;
	}

	@Override
	public void setContactId(long contactId) {
		_contactId = contactId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			StudentRegistration.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public StudentRegistration toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (StudentRegistration)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		StudentRegistrationImpl studentRegistrationImpl = new StudentRegistrationImpl();

		studentRegistrationImpl.setStudRegId(getStudRegId());
		studentRegistrationImpl.setGroupId(getGroupId());
		studentRegistrationImpl.setCompanyId(getCompanyId());
		studentRegistrationImpl.setUserId(getUserId());
		studentRegistrationImpl.setUserName(getUserName());
		studentRegistrationImpl.setCreateDate(getCreateDate());
		studentRegistrationImpl.setModifiedDate(getModifiedDate());
		studentRegistrationImpl.setMemo(getMemo());
		studentRegistrationImpl.setStudRegStatus(getStudRegStatus());
		studentRegistrationImpl.setAdvisorOrig(getAdvisorOrig());
		studentRegistrationImpl.setAdvisorReg(getAdvisorReg());
		studentRegistrationImpl.setCoursePackageId(getCoursePackageId());
		studentRegistrationImpl.setDiscountId(getDiscountId());
		studentRegistrationImpl.setCommMethod(getCommMethod());
		studentRegistrationImpl.setNotes(getNotes());
		studentRegistrationImpl.setCurrency(getCurrency());
		studentRegistrationImpl.setTax(getTax());
		studentRegistrationImpl.setAutoCharge(getAutoCharge());
		studentRegistrationImpl.setCurrencyPaid(getCurrencyPaid());
		studentRegistrationImpl.setExchangeRate(getExchangeRate());
		studentRegistrationImpl.setContactId(getContactId());

		studentRegistrationImpl.resetOriginalValues();

		return studentRegistrationImpl;
	}

	@Override
	public int compareTo(StudentRegistration studentRegistration) {
		long primaryKey = studentRegistration.getPrimaryKey();

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

		if (!(obj instanceof StudentRegistration)) {
			return false;
		}

		StudentRegistration studentRegistration = (StudentRegistration)obj;

		long primaryKey = studentRegistration.getPrimaryKey();

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
		StudentRegistrationModelImpl studentRegistrationModelImpl = this;

		studentRegistrationModelImpl._originalStudRegId = studentRegistrationModelImpl._studRegId;

		studentRegistrationModelImpl._setOriginalStudRegId = false;

		studentRegistrationModelImpl._originalGroupId = studentRegistrationModelImpl._groupId;

		studentRegistrationModelImpl._setOriginalGroupId = false;

		studentRegistrationModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<StudentRegistration> toCacheModel() {
		StudentRegistrationCacheModel studentRegistrationCacheModel = new StudentRegistrationCacheModel();

		studentRegistrationCacheModel.studRegId = getStudRegId();

		studentRegistrationCacheModel.groupId = getGroupId();

		studentRegistrationCacheModel.companyId = getCompanyId();

		studentRegistrationCacheModel.userId = getUserId();

		studentRegistrationCacheModel.userName = getUserName();

		String userName = studentRegistrationCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			studentRegistrationCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			studentRegistrationCacheModel.createDate = createDate.getTime();
		}
		else {
			studentRegistrationCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			studentRegistrationCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			studentRegistrationCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		studentRegistrationCacheModel.memo = getMemo();

		String memo = studentRegistrationCacheModel.memo;

		if ((memo != null) && (memo.length() == 0)) {
			studentRegistrationCacheModel.memo = null;
		}

		studentRegistrationCacheModel.studRegStatus = getStudRegStatus();

		String studRegStatus = studentRegistrationCacheModel.studRegStatus;

		if ((studRegStatus != null) && (studRegStatus.length() == 0)) {
			studentRegistrationCacheModel.studRegStatus = null;
		}

		studentRegistrationCacheModel.advisorOrig = getAdvisorOrig();

		String advisorOrig = studentRegistrationCacheModel.advisorOrig;

		if ((advisorOrig != null) && (advisorOrig.length() == 0)) {
			studentRegistrationCacheModel.advisorOrig = null;
		}

		studentRegistrationCacheModel.advisorReg = getAdvisorReg();

		String advisorReg = studentRegistrationCacheModel.advisorReg;

		if ((advisorReg != null) && (advisorReg.length() == 0)) {
			studentRegistrationCacheModel.advisorReg = null;
		}

		studentRegistrationCacheModel.coursePackageId = getCoursePackageId();

		studentRegistrationCacheModel.discountId = getDiscountId();

		studentRegistrationCacheModel.commMethod = getCommMethod();

		String commMethod = studentRegistrationCacheModel.commMethod;

		if ((commMethod != null) && (commMethod.length() == 0)) {
			studentRegistrationCacheModel.commMethod = null;
		}

		studentRegistrationCacheModel.notes = getNotes();

		String notes = studentRegistrationCacheModel.notes;

		if ((notes != null) && (notes.length() == 0)) {
			studentRegistrationCacheModel.notes = null;
		}

		studentRegistrationCacheModel.currency = getCurrency();

		String currency = studentRegistrationCacheModel.currency;

		if ((currency != null) && (currency.length() == 0)) {
			studentRegistrationCacheModel.currency = null;
		}

		studentRegistrationCacheModel.tax = getTax();

		studentRegistrationCacheModel.autoCharge = getAutoCharge();

		String autoCharge = studentRegistrationCacheModel.autoCharge;

		if ((autoCharge != null) && (autoCharge.length() == 0)) {
			studentRegistrationCacheModel.autoCharge = null;
		}

		studentRegistrationCacheModel.currencyPaid = getCurrencyPaid();

		String currencyPaid = studentRegistrationCacheModel.currencyPaid;

		if ((currencyPaid != null) && (currencyPaid.length() == 0)) {
			studentRegistrationCacheModel.currencyPaid = null;
		}

		studentRegistrationCacheModel.exchangeRate = getExchangeRate();

		studentRegistrationCacheModel.contactId = getContactId();

		return studentRegistrationCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{studRegId=");
		sb.append(getStudRegId());
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
		sb.append(", memo=");
		sb.append(getMemo());
		sb.append(", studRegStatus=");
		sb.append(getStudRegStatus());
		sb.append(", advisorOrig=");
		sb.append(getAdvisorOrig());
		sb.append(", advisorReg=");
		sb.append(getAdvisorReg());
		sb.append(", coursePackageId=");
		sb.append(getCoursePackageId());
		sb.append(", discountId=");
		sb.append(getDiscountId());
		sb.append(", commMethod=");
		sb.append(getCommMethod());
		sb.append(", notes=");
		sb.append(getNotes());
		sb.append(", currency=");
		sb.append(getCurrency());
		sb.append(", tax=");
		sb.append(getTax());
		sb.append(", autoCharge=");
		sb.append(getAutoCharge());
		sb.append(", currencyPaid=");
		sb.append(getCurrencyPaid());
		sb.append(", exchangeRate=");
		sb.append(getExchangeRate());
		sb.append(", contactId=");
		sb.append(getContactId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(67);

		sb.append("<model><model-name>");
		sb.append("com.ocms.course.model.StudentRegistration");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>studRegId</column-name><column-value><![CDATA[");
		sb.append(getStudRegId());
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
			"<column><column-name>memo</column-name><column-value><![CDATA[");
		sb.append(getMemo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>studRegStatus</column-name><column-value><![CDATA[");
		sb.append(getStudRegStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>advisorOrig</column-name><column-value><![CDATA[");
		sb.append(getAdvisorOrig());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>advisorReg</column-name><column-value><![CDATA[");
		sb.append(getAdvisorReg());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>coursePackageId</column-name><column-value><![CDATA[");
		sb.append(getCoursePackageId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>discountId</column-name><column-value><![CDATA[");
		sb.append(getDiscountId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>commMethod</column-name><column-value><![CDATA[");
		sb.append(getCommMethod());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>notes</column-name><column-value><![CDATA[");
		sb.append(getNotes());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currency</column-name><column-value><![CDATA[");
		sb.append(getCurrency());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tax</column-name><column-value><![CDATA[");
		sb.append(getTax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>autoCharge</column-name><column-value><![CDATA[");
		sb.append(getAutoCharge());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currencyPaid</column-name><column-value><![CDATA[");
		sb.append(getCurrencyPaid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>exchangeRate</column-name><column-value><![CDATA[");
		sb.append(getExchangeRate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactId</column-name><column-value><![CDATA[");
		sb.append(getContactId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = StudentRegistration.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			StudentRegistration.class
		};
	private long _studRegId;
	private long _originalStudRegId;
	private boolean _setOriginalStudRegId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _memo;
	private String _studRegStatus;
	private String _advisorOrig;
	private String _advisorReg;
	private long _coursePackageId;
	private long _discountId;
	private String _commMethod;
	private String _notes;
	private String _currency;
	private long _tax;
	private String _autoCharge;
	private String _currencyPaid;
	private long _exchangeRate;
	private long _contactId;
	private long _columnBitmask;
	private StudentRegistration _escapedModel;
}