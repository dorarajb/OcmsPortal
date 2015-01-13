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

package com.liferay.notifications.notifications.portlet;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.UserNotificationEvent;
import com.liferay.portal.service.UserNotificationDeliveryLocalServiceUtil;
import com.liferay.portal.service.UserNotificationEventLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

/**
 * @author Jonathan Lee
 */
public class NotificationsPortlet extends MVCPortlet {

	public void markAsRead(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		long userNotificationEventId = ParamUtil.getLong(
			actionRequest, "userNotificationEventId");

		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();

		try {
			UserNotificationEvent userNotificationEvent =
				UserNotificationEventLocalServiceUtil.getUserNotificationEvent(
					userNotificationEventId);

			userNotificationEvent.setArchived(true);

			UserNotificationEventLocalServiceUtil.updateUserNotificationEvent(
				userNotificationEvent);

			jsonObject.put("success", Boolean.TRUE);
		}
		catch (Exception e) {
			jsonObject.put("success", Boolean.FALSE);
		}

		writeJSON(actionRequest, actionResponse, jsonObject);
	}


	public void processAction(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws PortletException {

		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		if (!themeDisplay.isSignedIn()) {
			return;
		}

		try {
			String actionName = ParamUtil.getString(
				actionRequest, ActionRequest.ACTION_NAME);

			if (actionName.equals("markAsRead")) {
				markAsRead(actionRequest, actionResponse);
			}
			else if (actionName.equals("setDelivered")) {
				setDelivered(actionRequest, actionResponse);
			}
			else if (actionName.equals("updateUserNotificationDelivery")) {
				updateUserNotificationDelivery(actionRequest, actionResponse);
			}
			else {
				super.processAction(actionRequest, actionResponse);
			}
		}
		catch (Exception e) {
			throw new PortletException(e);
		}
	}

	public void setDelivered(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();

		try {
			List<UserNotificationEvent> userNotificationEvents =
				UserNotificationEventLocalServiceUtil.
					getDeliveredUserNotificationEvents(
						themeDisplay.getUserId(), false);

			for (UserNotificationEvent userNotificationEvent :
					userNotificationEvents) {

				userNotificationEvent.setDelivered(true);

				UserNotificationEventLocalServiceUtil.
					updateUserNotificationEvent(userNotificationEvent);
			}

			jsonObject.put("success", Boolean.TRUE);
		}
		catch (Exception e) {
			jsonObject.put("success", Boolean.FALSE);
		}

		writeJSON(actionRequest, actionResponse, jsonObject);
	}

	public void updateUserNotificationDelivery(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		long userNotificationDeliveryId = ParamUtil.getLong(
			actionRequest, "userNotificationDeliveryId");

		boolean deliver = ParamUtil.getBoolean(actionRequest, "deliver", true);

		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();

		try {
			UserNotificationDeliveryLocalServiceUtil.
				updateUserNotificationDelivery(
					userNotificationDeliveryId, deliver);

			jsonObject.put("success", Boolean.TRUE);
		}
		catch (Exception e) {
			jsonObject.put("success", Boolean.FALSE);
		}
	}

}