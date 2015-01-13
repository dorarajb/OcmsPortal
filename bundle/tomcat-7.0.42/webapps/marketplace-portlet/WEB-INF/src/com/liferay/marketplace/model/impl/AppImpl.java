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

package com.liferay.marketplace.model.impl;

import com.liferay.marketplace.model.Module;
import com.liferay.marketplace.service.ModuleLocalServiceUtil;
import com.liferay.portal.kernel.deploy.DeployManagerUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CompanyConstants;
import com.liferay.portlet.documentlibrary.store.DLStoreUtil;
import com.liferay.portlet.documentlibrary.store.Store;

import java.util.List;

/**
 * @author Ryan Park
 */
public class AppImpl extends AppBaseImpl {

	public AppImpl() {
	}

	@Override
	public String[] addContextName(String contextName) {
		if (_contextNames == null) {
			_contextNames = new String[] {contextName};
		}
		else {
			_contextNames = ArrayUtil.append(_contextNames, contextName);
		}

		return _contextNames;
	}

	@Override
	public String[] getContextNames() throws SystemException {
		if (_contextNames != null) {
			return _contextNames;
		}

		List<Module> modules = ModuleLocalServiceUtil.getModules(getAppId());

		String[] contextNames = new String[modules.size()];

		for (int i = 0; i < modules.size(); i++) {
			Module module = modules.get(i);

			contextNames[i] = module.getContextName();
		}

		_contextNames = contextNames;

		return _contextNames;
	}

	@Override
	public String getFileDir() {
		return _DIR_NAME;
	}

	@Override
	public String getFileName() {
		return getAppId() + StringPool.PERIOD + _EXTENSION;
	}

	@Override
	public String getFilePath() {
		return getFileDir() + StringPool.SLASH + getFileName();
	}

	@Override
	public boolean isDownloaded() throws PortalException, SystemException {
		return DLStoreUtil.hasFile(
			getCompanyId(), CompanyConstants.SYSTEM, getFilePath(),
			Store.VERSION_DEFAULT);
	}

	@Override
	public boolean isInstalled() throws SystemException {
		String[] contextNames = getContextNames();

		if (contextNames.length == 0) {
			return false;
		}

		for (String contextName : contextNames) {
			if (!DeployManagerUtil.isDeployed(contextName)) {
				return false;
			}
		}

		return true;
	}

	private static final String _DIR_NAME = "marketplace";

	private static final String _EXTENSION = "lpkg";

	private String[] _contextNames;

}