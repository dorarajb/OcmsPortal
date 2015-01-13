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

package com.liferay.notifications.util;

import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.util.portlet.PortletProps;

/**
 * @author Jonathan Lee
 */
public class PortletPropsValues {

	public static final boolean NOTIFICATIONS_DOCKBAR_DISPLAY_ENABLED =
		GetterUtil.getBoolean(
			PortletProps.get(
				PortletPropsKeys.NOTIFICATIONS_DOCKBAR_DISPLAY_ENABLED));

}