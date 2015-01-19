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

import com.ocms.course.model.Contact;
import com.ocms.course.model.ContactModel;
import com.ocms.course.model.ContactSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Contact service. Represents a row in the &quot;CM_Contact&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ocms.course.model.ContactModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ContactImpl}.
 * </p>
 *
 * @author doraraj
 * @see ContactImpl
 * @see com.ocms.course.model.Contact
 * @see com.ocms.course.model.ContactModel
 * @generated
 */
@JSON(strict = true)
public class ContactModelImpl extends BaseModelImpl<Contact>
	implements ContactModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a contact model instance should use the {@link com.ocms.course.model.Contact} interface instead.
	 */
	public static final String TABLE_NAME = "CM_Contact";
	public static final Object[][] TABLE_COLUMNS = {
			{ "contactId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "contactType", Types.VARCHAR },
			{ "contactName", Types.VARCHAR },
			{ "addressLine1", Types.VARCHAR },
			{ "addressLine2", Types.VARCHAR },
			{ "city", Types.VARCHAR },
			{ "state_", Types.VARCHAR },
			{ "region", Types.VARCHAR },
			{ "zip", Types.VARCHAR },
			{ "phone", Types.VARCHAR },
			{ "fax", Types.VARCHAR },
			{ "email", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table CM_Contact (contactId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,contactType VARCHAR(75) null,contactName VARCHAR(75) null,addressLine1 VARCHAR(75) null,addressLine2 VARCHAR(75) null,city VARCHAR(75) null,state_ VARCHAR(75) null,region VARCHAR(75) null,zip VARCHAR(75) null,phone VARCHAR(75) null,fax VARCHAR(75) null,email VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table CM_Contact";
	public static final String ORDER_BY_JPQL = " ORDER BY contact.contactId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CM_Contact.contactId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.ocms.course.model.Contact"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.ocms.course.model.Contact"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.ocms.course.model.Contact"),
			true);
	public static long CONTACTID_COLUMN_BITMASK = 1L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Contact toModel(ContactSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Contact model = new ContactImpl();

		model.setContactId(soapModel.getContactId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setContactType(soapModel.getContactType());
		model.setContactName(soapModel.getContactName());
		model.setAddressLine1(soapModel.getAddressLine1());
		model.setAddressLine2(soapModel.getAddressLine2());
		model.setCity(soapModel.getCity());
		model.setState(soapModel.getState());
		model.setRegion(soapModel.getRegion());
		model.setZip(soapModel.getZip());
		model.setPhone(soapModel.getPhone());
		model.setFax(soapModel.getFax());
		model.setEmail(soapModel.getEmail());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Contact> toModels(ContactSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Contact> models = new ArrayList<Contact>(soapModels.length);

		for (ContactSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.ocms.course.model.Contact"));

	public ContactModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _contactId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setContactId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _contactId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@JSON
	@Override
	public long getContactId() {
		return _contactId;
	}

	@Override
	public void setContactId(long contactId) {
		_columnBitmask |= CONTACTID_COLUMN_BITMASK;

		if (!_setOriginalContactId) {
			_setOriginalContactId = true;

			_originalContactId = _contactId;
		}

		_contactId = contactId;
	}

	public long getOriginalContactId() {
		return _originalContactId;
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
	public String getContactType() {
		if (_contactType == null) {
			return StringPool.BLANK;
		}
		else {
			return _contactType;
		}
	}

	@Override
	public void setContactType(String contactType) {
		_contactType = contactType;
	}

	@JSON
	@Override
	public String getContactName() {
		if (_contactName == null) {
			return StringPool.BLANK;
		}
		else {
			return _contactName;
		}
	}

	@Override
	public void setContactName(String contactName) {
		_contactName = contactName;
	}

	@JSON
	@Override
	public String getAddressLine1() {
		if (_addressLine1 == null) {
			return StringPool.BLANK;
		}
		else {
			return _addressLine1;
		}
	}

	@Override
	public void setAddressLine1(String addressLine1) {
		_addressLine1 = addressLine1;
	}

	@JSON
	@Override
	public String getAddressLine2() {
		if (_addressLine2 == null) {
			return StringPool.BLANK;
		}
		else {
			return _addressLine2;
		}
	}

	@Override
	public void setAddressLine2(String addressLine2) {
		_addressLine2 = addressLine2;
	}

	@JSON
	@Override
	public String getCity() {
		if (_city == null) {
			return StringPool.BLANK;
		}
		else {
			return _city;
		}
	}

	@Override
	public void setCity(String city) {
		_city = city;
	}

	@JSON
	@Override
	public String getState() {
		if (_state == null) {
			return StringPool.BLANK;
		}
		else {
			return _state;
		}
	}

	@Override
	public void setState(String state) {
		_state = state;
	}

	@JSON
	@Override
	public String getRegion() {
		if (_region == null) {
			return StringPool.BLANK;
		}
		else {
			return _region;
		}
	}

	@Override
	public void setRegion(String region) {
		_region = region;
	}

	@JSON
	@Override
	public String getZip() {
		if (_zip == null) {
			return StringPool.BLANK;
		}
		else {
			return _zip;
		}
	}

	@Override
	public void setZip(String zip) {
		_zip = zip;
	}

	@JSON
	@Override
	public String getPhone() {
		if (_phone == null) {
			return StringPool.BLANK;
		}
		else {
			return _phone;
		}
	}

	@Override
	public void setPhone(String phone) {
		_phone = phone;
	}

	@JSON
	@Override
	public String getFax() {
		if (_fax == null) {
			return StringPool.BLANK;
		}
		else {
			return _fax;
		}
	}

	@Override
	public void setFax(String fax) {
		_fax = fax;
	}

	@JSON
	@Override
	public String getEmail() {
		if (_email == null) {
			return StringPool.BLANK;
		}
		else {
			return _email;
		}
	}

	@Override
	public void setEmail(String email) {
		_email = email;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Contact.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Contact toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Contact)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ContactImpl contactImpl = new ContactImpl();

		contactImpl.setContactId(getContactId());
		contactImpl.setGroupId(getGroupId());
		contactImpl.setCompanyId(getCompanyId());
		contactImpl.setUserId(getUserId());
		contactImpl.setUserName(getUserName());
		contactImpl.setCreateDate(getCreateDate());
		contactImpl.setModifiedDate(getModifiedDate());
		contactImpl.setContactType(getContactType());
		contactImpl.setContactName(getContactName());
		contactImpl.setAddressLine1(getAddressLine1());
		contactImpl.setAddressLine2(getAddressLine2());
		contactImpl.setCity(getCity());
		contactImpl.setState(getState());
		contactImpl.setRegion(getRegion());
		contactImpl.setZip(getZip());
		contactImpl.setPhone(getPhone());
		contactImpl.setFax(getFax());
		contactImpl.setEmail(getEmail());

		contactImpl.resetOriginalValues();

		return contactImpl;
	}

	@Override
	public int compareTo(Contact contact) {
		long primaryKey = contact.getPrimaryKey();

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

		if (!(obj instanceof Contact)) {
			return false;
		}

		Contact contact = (Contact)obj;

		long primaryKey = contact.getPrimaryKey();

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
		ContactModelImpl contactModelImpl = this;

		contactModelImpl._originalContactId = contactModelImpl._contactId;

		contactModelImpl._setOriginalContactId = false;

		contactModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Contact> toCacheModel() {
		ContactCacheModel contactCacheModel = new ContactCacheModel();

		contactCacheModel.contactId = getContactId();

		contactCacheModel.groupId = getGroupId();

		contactCacheModel.companyId = getCompanyId();

		contactCacheModel.userId = getUserId();

		contactCacheModel.userName = getUserName();

		String userName = contactCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			contactCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			contactCacheModel.createDate = createDate.getTime();
		}
		else {
			contactCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			contactCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			contactCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		contactCacheModel.contactType = getContactType();

		String contactType = contactCacheModel.contactType;

		if ((contactType != null) && (contactType.length() == 0)) {
			contactCacheModel.contactType = null;
		}

		contactCacheModel.contactName = getContactName();

		String contactName = contactCacheModel.contactName;

		if ((contactName != null) && (contactName.length() == 0)) {
			contactCacheModel.contactName = null;
		}

		contactCacheModel.addressLine1 = getAddressLine1();

		String addressLine1 = contactCacheModel.addressLine1;

		if ((addressLine1 != null) && (addressLine1.length() == 0)) {
			contactCacheModel.addressLine1 = null;
		}

		contactCacheModel.addressLine2 = getAddressLine2();

		String addressLine2 = contactCacheModel.addressLine2;

		if ((addressLine2 != null) && (addressLine2.length() == 0)) {
			contactCacheModel.addressLine2 = null;
		}

		contactCacheModel.city = getCity();

		String city = contactCacheModel.city;

		if ((city != null) && (city.length() == 0)) {
			contactCacheModel.city = null;
		}

		contactCacheModel.state = getState();

		String state = contactCacheModel.state;

		if ((state != null) && (state.length() == 0)) {
			contactCacheModel.state = null;
		}

		contactCacheModel.region = getRegion();

		String region = contactCacheModel.region;

		if ((region != null) && (region.length() == 0)) {
			contactCacheModel.region = null;
		}

		contactCacheModel.zip = getZip();

		String zip = contactCacheModel.zip;

		if ((zip != null) && (zip.length() == 0)) {
			contactCacheModel.zip = null;
		}

		contactCacheModel.phone = getPhone();

		String phone = contactCacheModel.phone;

		if ((phone != null) && (phone.length() == 0)) {
			contactCacheModel.phone = null;
		}

		contactCacheModel.fax = getFax();

		String fax = contactCacheModel.fax;

		if ((fax != null) && (fax.length() == 0)) {
			contactCacheModel.fax = null;
		}

		contactCacheModel.email = getEmail();

		String email = contactCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			contactCacheModel.email = null;
		}

		return contactCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{contactId=");
		sb.append(getContactId());
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
		sb.append(", contactType=");
		sb.append(getContactType());
		sb.append(", contactName=");
		sb.append(getContactName());
		sb.append(", addressLine1=");
		sb.append(getAddressLine1());
		sb.append(", addressLine2=");
		sb.append(getAddressLine2());
		sb.append(", city=");
		sb.append(getCity());
		sb.append(", state=");
		sb.append(getState());
		sb.append(", region=");
		sb.append(getRegion());
		sb.append(", zip=");
		sb.append(getZip());
		sb.append(", phone=");
		sb.append(getPhone());
		sb.append(", fax=");
		sb.append(getFax());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(58);

		sb.append("<model><model-name>");
		sb.append("com.ocms.course.model.Contact");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>contactId</column-name><column-value><![CDATA[");
		sb.append(getContactId());
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
			"<column><column-name>contactType</column-name><column-value><![CDATA[");
		sb.append(getContactType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactName</column-name><column-value><![CDATA[");
		sb.append(getContactName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>addressLine1</column-name><column-value><![CDATA[");
		sb.append(getAddressLine1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>addressLine2</column-name><column-value><![CDATA[");
		sb.append(getAddressLine2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>city</column-name><column-value><![CDATA[");
		sb.append(getCity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>state</column-name><column-value><![CDATA[");
		sb.append(getState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>region</column-name><column-value><![CDATA[");
		sb.append(getRegion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>zip</column-name><column-value><![CDATA[");
		sb.append(getZip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phone</column-name><column-value><![CDATA[");
		sb.append(getPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fax</column-name><column-value><![CDATA[");
		sb.append(getFax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Contact.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Contact.class
		};
	private long _contactId;
	private long _originalContactId;
	private boolean _setOriginalContactId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _contactType;
	private String _contactName;
	private String _addressLine1;
	private String _addressLine2;
	private String _city;
	private String _state;
	private String _region;
	private String _zip;
	private String _phone;
	private String _fax;
	private String _email;
	private long _columnBitmask;
	private Contact _escapedModel;
}