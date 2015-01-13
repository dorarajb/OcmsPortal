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

package com.liferay.calendar.service.impl;

import com.liferay.calendar.model.Calendar;
import com.liferay.calendar.model.CalendarNotificationTemplate;
import com.liferay.calendar.notification.NotificationTemplateType;
import com.liferay.calendar.notification.NotificationType;
import com.liferay.calendar.service.base.CalendarNotificationTemplateLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

import java.util.Date;
import java.util.List;

/**
 * @author Adam Brandizzi
 * @author Marcellus Tavares
 */
public class CalendarNotificationTemplateLocalServiceImpl
	extends CalendarNotificationTemplateLocalServiceBaseImpl {


	public CalendarNotificationTemplate addCalendarNotificationTemplate(
			long userId, long calendarId, NotificationType notificationType,
			String notificationTypeSettings,
			NotificationTemplateType notificationTemplateType, String subject,
			String body, ServiceContext serviceContext)
		throws PortalException, SystemException {

		User user = userPersistence.findByPrimaryKey(userId);
		Calendar calendar = calendarPersistence.findByPrimaryKey(calendarId);
		Date now = new Date();

		long calendarNotificationTemplateId = counterLocalService.increment();

		CalendarNotificationTemplate calendarNotificationTemplate =
			calendarNotificationTemplatePersistence.create(
				calendarNotificationTemplateId);

		calendarNotificationTemplate.setUuid(serviceContext.getUuid());
		calendarNotificationTemplate.setGroupId(calendar.getGroupId());
		calendarNotificationTemplate.setCompanyId(user.getCompanyId());
		calendarNotificationTemplate.setUserId(user.getUserId());
		calendarNotificationTemplate.setUserName(user.getFullName());
		calendarNotificationTemplate.setCreateDate(
			serviceContext.getCreateDate(now));
		calendarNotificationTemplate.setModifiedDate(
			serviceContext.getModifiedDate(now));
		calendarNotificationTemplate.setCalendarId(calendarId);
		calendarNotificationTemplate.setNotificationType(
			notificationType.getValue());
		calendarNotificationTemplate.setNotificationTypeSettings(
			notificationTypeSettings);
		calendarNotificationTemplate.setNotificationTemplateType(
			notificationTemplateType.getValue());
		calendarNotificationTemplate.setSubject(subject);
		calendarNotificationTemplate.setBody(body);

		return calendarNotificationTemplatePersistence.update(
			calendarNotificationTemplate);
	}


	public void deleteCalendarNotificationTemplates(long calendarId)
		throws SystemException {

		List<CalendarNotificationTemplate> calendarNotificationTemplates =
			calendarNotificationTemplatePersistence.findByCalendarId(
				calendarId);

		for (CalendarNotificationTemplate calendarNotificationTemplate :
				calendarNotificationTemplates) {

			calendarNotificationTemplateLocalService.
				deleteCalendarNotificationTemplate(
					calendarNotificationTemplate);
		}
	}


	public CalendarNotificationTemplate fetchCalendarNotificationTemplate(
			long calendarId, NotificationType notificationType,
			NotificationTemplateType notificationTemplateType)
		throws SystemException {

		return calendarNotificationTemplatePersistence.fetchByC_NT_NTT(
			calendarId, notificationType.getValue(),
			notificationTemplateType.getValue());
	}


	public CalendarNotificationTemplate updateCalendarNotificationTemplate(
			long calendarNotificationTemplateId,
			String notificationTypeSettings, String subject, String body,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		CalendarNotificationTemplate calendarNotificationTemplate =
			calendarNotificationTemplatePersistence.findByPrimaryKey(
				calendarNotificationTemplateId);

		calendarNotificationTemplate.setModifiedDate(
			serviceContext.getModifiedDate(null));
		calendarNotificationTemplate.setSubject(subject);
		calendarNotificationTemplate.setBody(body);
		calendarNotificationTemplate.setNotificationTypeSettings(
			notificationTypeSettings);

		return calendarNotificationTemplatePersistence.update(
			calendarNotificationTemplate);
	}

}