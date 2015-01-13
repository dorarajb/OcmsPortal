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

package com.liferay.calendar.asset;

import com.liferay.calendar.model.Calendar;
import com.liferay.calendar.model.CalendarBooking;
import com.liferay.calendar.service.permission.CalendarPermission;
import com.liferay.calendar.util.ActionKeys;
import com.liferay.calendar.util.PortletKeys;
import com.liferay.calendar.util.WebKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.trash.TrashRenderer;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.asset.model.AssetRendererFactory;
import com.liferay.portlet.asset.model.BaseAssetRenderer;

import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.WindowState;

/**
 * @author Fabio Pezzutto
 * @author Eduardo Lundgren
 * @author Pier Paolo Ramon
 */
public class CalendarBookingAssetRenderer
	extends BaseAssetRenderer implements TrashRenderer {

	public CalendarBookingAssetRenderer(CalendarBooking calendarBooking) {
		_calendarBooking = calendarBooking;
	}


	public String getClassName() {
		return CalendarBooking.class.getName();
	}


	public long getClassPK() {
		return _calendarBooking.getCalendarBookingId();
	}


	public long getGroupId() {
		return _calendarBooking.getGroupId();
	}


	public String getIconPath(ThemeDisplay themeDisplay) {
		return themeDisplay.getPathThemeImages() + "/common/date.png";
	}


	public String getPortletId() {
		AssetRendererFactory assetRendererFactory = getAssetRendererFactory();

		return assetRendererFactory.getPortletId();
	}


	public String getSummary(Locale locale) {
		return _calendarBooking.getDescription(locale);
	}


	public String getTitle(Locale locale) {
		return _calendarBooking.getTitle(locale);
	}


	public String getType() {
		return CalendarBookingAssetRendererFactory.TYPE;
	}


	public PortletURL getURLEdit(
			LiferayPortletRequest liferayPortletRequest,
			LiferayPortletResponse liferayPortletResponse)
		throws Exception {

		PortletURL portletURL = liferayPortletResponse.createLiferayPortletURL(
			getControlPanelPlid(liferayPortletRequest), PortletKeys.CALENDAR,
			PortletRequest.RENDER_PHASE);

		portletURL.setParameter("mvcPath", "/edit_calendar_booking.jsp");
		portletURL.setParameter(
			"calendarBookingId",
			String.valueOf(_calendarBooking.getCalendarBookingId()));

		return portletURL;
	}


	public String getURLViewInContext(
		LiferayPortletRequest liferayPortletRequest,
		LiferayPortletResponse liferayPortletResponse,
		String noSuchEntryRedirect) {

		try {
			PortletURL portletURL = liferayPortletResponse.createRenderURL(
				PortletKeys.CALENDAR);

			portletURL.setParameter("mvcPath", "/view_calendar_booking.jsp");
			portletURL.setParameter(
				"calendarBookingId",
				String.valueOf(_calendarBooking.getCalendarBookingId()));
			portletURL.setWindowState(WindowState.MAXIMIZED);

			return portletURL.toString();
		}
		catch (Exception e) {
		}

		return null;
	}


	public long getUserId() {
		return _calendarBooking.getUserId();
	}


	public String getUserName() {
		return _calendarBooking.getUserName();
	}


	public String getUuid() {
		return _calendarBooking.getUuid();
	}


	public boolean hasEditPermission(PermissionChecker permissionChecker) {
		Calendar calendar = null;

		try {
			calendar = _calendarBooking.getCalendar();
		}
		catch (Exception e) {
			_log.error(e);
		}

		return CalendarPermission.contains(
			permissionChecker, calendar, ActionKeys.MANAGE_BOOKINGS);
	}


	public boolean hasViewPermission(PermissionChecker permissionChecker) {
		Calendar calendar = null;

		try {
			calendar = _calendarBooking.getCalendar();
		}
		catch (Exception e) {
			_log.error(e);
		}

		return CalendarPermission.contains(
			permissionChecker, calendar, ActionKeys.VIEW);
	}


	public boolean isPrintable() {
		return true;
	}


	public String render(
			RenderRequest renderRequest, RenderResponse renderResponse,
			String template)
		throws Exception {

		if (template.equals(TEMPLATE_ABSTRACT) ||
			template.equals(TEMPLATE_FULL_CONTENT)) {

			renderRequest.setAttribute(
				WebKeys.CALENDAR_BOOKING, _calendarBooking);

			return "/asset/" + template + ".jsp";
		}
		else {
			return null;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		CalendarBookingAssetRenderer.class);

	private CalendarBooking _calendarBooking;

}