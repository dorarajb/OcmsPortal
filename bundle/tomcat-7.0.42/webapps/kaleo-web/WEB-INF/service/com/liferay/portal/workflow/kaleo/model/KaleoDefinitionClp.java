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

package com.liferay.portal.workflow.kaleo.model;

import com.liferay.portal.LocaleException;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portal.workflow.kaleo.service.ClpSerializer;
import com.liferay.portal.workflow.kaleo.service.KaleoDefinitionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Brian Wing Shun Chan
 */
public class KaleoDefinitionClp extends BaseModelImpl<KaleoDefinition>
	implements KaleoDefinition {
	public KaleoDefinitionClp() {
	}


	public Class<?> getModelClass() {
		return KaleoDefinition.class;
	}


	public String getModelClassName() {
		return KaleoDefinition.class.getName();
	}


	public long getPrimaryKey() {
		return _kaleoDefinitionId;
	}


	public void setPrimaryKey(long primaryKey) {
		setKaleoDefinitionId(primaryKey);
	}


	public Serializable getPrimaryKeyObj() {
		return _kaleoDefinitionId;
	}


	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}


	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("kaleoDefinitionId", getKaleoDefinitionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());
		attributes.put("content", getContent());
		attributes.put("version", getVersion());
		attributes.put("active", getActive());
		attributes.put("startKaleoNodeId", getStartKaleoNodeId());

		return attributes;
	}


	public void setModelAttributes(Map<String, Object> attributes) {
		Long kaleoDefinitionId = (Long)attributes.get("kaleoDefinitionId");

		if (kaleoDefinitionId != null) {
			setKaleoDefinitionId(kaleoDefinitionId);
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		Integer version = (Integer)attributes.get("version");

		if (version != null) {
			setVersion(version);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
		}

		Long startKaleoNodeId = (Long)attributes.get("startKaleoNodeId");

		if (startKaleoNodeId != null) {
			setStartKaleoNodeId(startKaleoNodeId);
		}
	}


	public long getKaleoDefinitionId() {
		return _kaleoDefinitionId;
	}


	public void setKaleoDefinitionId(long kaleoDefinitionId) {
		_kaleoDefinitionId = kaleoDefinitionId;

		if (_kaleoDefinitionRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoDefinitionRemoteModel.getClass();

				Method method = clazz.getMethod("setKaleoDefinitionId",
						long.class);

				method.invoke(_kaleoDefinitionRemoteModel, kaleoDefinitionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public long getGroupId() {
		return _groupId;
	}


	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_kaleoDefinitionRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoDefinitionRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_kaleoDefinitionRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public long getCompanyId() {
		return _companyId;
	}


	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_kaleoDefinitionRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoDefinitionRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_kaleoDefinitionRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public long getUserId() {
		return _userId;
	}


	public void setUserId(long userId) {
		_userId = userId;

		if (_kaleoDefinitionRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoDefinitionRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_kaleoDefinitionRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}


	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}


	public String getUserName() {
		return _userName;
	}


	public void setUserName(String userName) {
		_userName = userName;

		if (_kaleoDefinitionRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoDefinitionRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_kaleoDefinitionRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public Date getCreateDate() {
		return _createDate;
	}


	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_kaleoDefinitionRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoDefinitionRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_kaleoDefinitionRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public Date getModifiedDate() {
		return _modifiedDate;
	}


	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_kaleoDefinitionRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoDefinitionRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_kaleoDefinitionRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public String getName() {
		return _name;
	}


	public void setName(String name) {
		_name = name;

		if (_kaleoDefinitionRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoDefinitionRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_kaleoDefinitionRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public String getTitle() {
		return _title;
	}


	public String getTitle(Locale locale) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getTitle(languageId);
	}


	public String getTitle(Locale locale, boolean useDefault) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getTitle(languageId, useDefault);
	}


	public String getTitle(String languageId) {
		return LocalizationUtil.getLocalization(getTitle(), languageId);
	}


	public String getTitle(String languageId, boolean useDefault) {
		return LocalizationUtil.getLocalization(getTitle(), languageId,
			useDefault);
	}


	public String getTitleCurrentLanguageId() {
		return _titleCurrentLanguageId;
	}


	public String getTitleCurrentValue() {
		Locale locale = getLocale(_titleCurrentLanguageId);

		return getTitle(locale);
	}


	public Map<Locale, String> getTitleMap() {
		return LocalizationUtil.getLocalizationMap(getTitle());
	}


	public void setTitle(String title) {
		_title = title;

		if (_kaleoDefinitionRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoDefinitionRemoteModel.getClass();

				Method method = clazz.getMethod("setTitle", String.class);

				method.invoke(_kaleoDefinitionRemoteModel, title);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public void setTitle(String title, Locale locale) {
		setTitle(title, locale, LocaleUtil.getDefault());
	}


	public void setTitle(String title, Locale locale, Locale defaultLocale) {
		String languageId = LocaleUtil.toLanguageId(locale);
		String defaultLanguageId = LocaleUtil.toLanguageId(defaultLocale);

		if (Validator.isNotNull(title)) {
			setTitle(LocalizationUtil.updateLocalization(getTitle(), "Title",
					title, languageId, defaultLanguageId));
		}
		else {
			setTitle(LocalizationUtil.removeLocalization(getTitle(), "Title",
					languageId));
		}
	}


	public void setTitleCurrentLanguageId(String languageId) {
		_titleCurrentLanguageId = languageId;
	}


	public void setTitleMap(Map<Locale, String> titleMap) {
		setTitleMap(titleMap, LocaleUtil.getDefault());
	}


	public void setTitleMap(Map<Locale, String> titleMap, Locale defaultLocale) {
		if (titleMap == null) {
			return;
		}

		ClassLoader portalClassLoader = PortalClassLoaderUtil.getClassLoader();

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			if (contextClassLoader != portalClassLoader) {
				currentThread.setContextClassLoader(portalClassLoader);
			}

			setTitle(LocalizationUtil.updateLocalization(titleMap, getTitle(),
					"Title", LocaleUtil.toLanguageId(defaultLocale)));
		}
		finally {
			if (contextClassLoader != portalClassLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}


	public String getDescription() {
		return _description;
	}


	public void setDescription(String description) {
		_description = description;

		if (_kaleoDefinitionRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoDefinitionRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_kaleoDefinitionRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public String getContent() {
		return _content;
	}


	public void setContent(String content) {
		_content = content;

		if (_kaleoDefinitionRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoDefinitionRemoteModel.getClass();

				Method method = clazz.getMethod("setContent", String.class);

				method.invoke(_kaleoDefinitionRemoteModel, content);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public int getVersion() {
		return _version;
	}


	public void setVersion(int version) {
		_version = version;

		if (_kaleoDefinitionRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoDefinitionRemoteModel.getClass();

				Method method = clazz.getMethod("setVersion", int.class);

				method.invoke(_kaleoDefinitionRemoteModel, version);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public boolean getActive() {
		return _active;
	}


	public boolean isActive() {
		return _active;
	}


	public void setActive(boolean active) {
		_active = active;

		if (_kaleoDefinitionRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoDefinitionRemoteModel.getClass();

				Method method = clazz.getMethod("setActive", boolean.class);

				method.invoke(_kaleoDefinitionRemoteModel, active);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public long getStartKaleoNodeId() {
		return _startKaleoNodeId;
	}


	public void setStartKaleoNodeId(long startKaleoNodeId) {
		_startKaleoNodeId = startKaleoNodeId;

		if (_kaleoDefinitionRemoteModel != null) {
			try {
				Class<?> clazz = _kaleoDefinitionRemoteModel.getClass();

				Method method = clazz.getMethod("setStartKaleoNodeId",
						long.class);

				method.invoke(_kaleoDefinitionRemoteModel, startKaleoNodeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}


	public boolean hasIncompleteKaleoInstances() {
		try {
			String methodName = "hasIncompleteKaleoInstances";

			Class<?>[] parameterTypes = new Class<?>[] {  };

			Object[] parameterValues = new Object[] {  };

			Boolean returnObj = (Boolean)invokeOnRemoteModel(methodName,
					parameterTypes, parameterValues);

			return returnObj;
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}


	public com.liferay.portal.workflow.kaleo.model.KaleoNode getKaleoStartNode() {
		try {
			String methodName = "getKaleoStartNode";

			Class<?>[] parameterTypes = new Class<?>[] {  };

			Object[] parameterValues = new Object[] {  };

			com.liferay.portal.workflow.kaleo.model.KaleoNode returnObj = (com.liferay.portal.workflow.kaleo.model.KaleoNode)invokeOnRemoteModel(methodName,
					parameterTypes, parameterValues);

			return returnObj;
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	public BaseModel<?> getKaleoDefinitionRemoteModel() {
		return _kaleoDefinitionRemoteModel;
	}

	public void setKaleoDefinitionRemoteModel(
		BaseModel<?> kaleoDefinitionRemoteModel) {
		_kaleoDefinitionRemoteModel = kaleoDefinitionRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _kaleoDefinitionRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_kaleoDefinitionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}


	public void persist() throws SystemException {
		if (this.isNew()) {
			KaleoDefinitionLocalServiceUtil.addKaleoDefinition(this);
		}
		else {
			KaleoDefinitionLocalServiceUtil.updateKaleoDefinition(this);
		}
	}


	public String[] getAvailableLanguageIds() {
		Set<String> availableLanguageIds = new TreeSet<String>();

		Map<Locale, String> titleMap = getTitleMap();

		for (Map.Entry<Locale, String> entry : titleMap.entrySet()) {
			Locale locale = entry.getKey();
			String value = entry.getValue();

			if (Validator.isNotNull(value)) {
				availableLanguageIds.add(LocaleUtil.toLanguageId(locale));
			}
		}

		return availableLanguageIds.toArray(new String[availableLanguageIds.size()]);
	}


	public String getDefaultLanguageId() {
		String xml = getTitle();

		if (xml == null) {
			return StringPool.BLANK;
		}

		return LocalizationUtil.getDefaultLanguageId(xml);
	}


	public void prepareLocalizedFieldsForImport() throws LocaleException {
		prepareLocalizedFieldsForImport(null);
	}


	@SuppressWarnings("unused")
	public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
		throws LocaleException {
		Locale defaultLocale = LocaleUtil.getDefault();

		String modelDefaultLanguageId = getDefaultLanguageId();

		String title = getTitle(defaultLocale);

		if (Validator.isNull(title)) {
			setTitle(getTitle(modelDefaultLanguageId), defaultLocale);
		}
		else {
			setTitle(getTitle(defaultLocale), defaultLocale, defaultLocale);
		}
	}


	public KaleoDefinition toEscapedModel() {
		return (KaleoDefinition)ProxyUtil.newProxyInstance(KaleoDefinition.class.getClassLoader(),
			new Class[] { KaleoDefinition.class },
			new AutoEscapeBeanHandler(this));
	}


	public Object clone() {
		KaleoDefinitionClp clone = new KaleoDefinitionClp();

		clone.setKaleoDefinitionId(getKaleoDefinitionId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setName(getName());
		clone.setTitle(getTitle());
		clone.setDescription(getDescription());
		clone.setContent(getContent());
		clone.setVersion(getVersion());
		clone.setActive(getActive());
		clone.setStartKaleoNodeId(getStartKaleoNodeId());

		return clone;
	}


	public int compareTo(KaleoDefinition kaleoDefinition) {
		int value = 0;

		if (getVersion() < kaleoDefinition.getVersion()) {
			value = -1;
		}
		else if (getVersion() > kaleoDefinition.getVersion()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}


	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KaleoDefinitionClp)) {
			return false;
		}

		KaleoDefinitionClp kaleoDefinition = (KaleoDefinitionClp)obj;

		long primaryKey = kaleoDefinition.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}


	public int hashCode() {
		return (int)getPrimaryKey();
	}


	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{kaleoDefinitionId=");
		sb.append(getKaleoDefinitionId());
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
		sb.append(", name=");
		sb.append(getName());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", content=");
		sb.append(getContent());
		sb.append(", version=");
		sb.append(getVersion());
		sb.append(", active=");
		sb.append(getActive());
		sb.append(", startKaleoNodeId=");
		sb.append(getStartKaleoNodeId());
		sb.append("}");

		return sb.toString();
	}


	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portal.workflow.kaleo.model.KaleoDefinition");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>kaleoDefinitionId</column-name><column-value><![CDATA[");
		sb.append(getKaleoDefinitionId());
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
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content</column-name><column-value><![CDATA[");
		sb.append(getContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>version</column-name><column-value><![CDATA[");
		sb.append(getVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>active</column-name><column-value><![CDATA[");
		sb.append(getActive());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startKaleoNodeId</column-name><column-value><![CDATA[");
		sb.append(getStartKaleoNodeId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _kaleoDefinitionId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _title;
	private String _titleCurrentLanguageId;
	private String _description;
	private String _content;
	private int _version;
	private boolean _active;
	private long _startKaleoNodeId;
	private BaseModel<?> _kaleoDefinitionRemoteModel;
}