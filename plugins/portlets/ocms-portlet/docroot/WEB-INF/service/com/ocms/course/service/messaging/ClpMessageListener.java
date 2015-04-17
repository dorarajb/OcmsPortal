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

package com.ocms.course.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.ocms.course.service.ClpSerializer;
import com.ocms.course.service.ContactLocalServiceUtil;
import com.ocms.course.service.ContactServiceUtil;
import com.ocms.course.service.CourseLocalServiceUtil;
import com.ocms.course.service.CoursePackageLocalServiceUtil;
import com.ocms.course.service.CoursePackageServiceUtil;
import com.ocms.course.service.CourseSeriesLocalServiceUtil;
import com.ocms.course.service.CourseSeriesServiceUtil;
import com.ocms.course.service.CourseServiceUtil;
import com.ocms.course.service.EventLocalServiceUtil;
import com.ocms.course.service.EventServiceUtil;
import com.ocms.course.service.LocationLocalServiceUtil;
import com.ocms.course.service.LocationServiceUtil;
import com.ocms.course.service.OffersAndDeductionsLocalServiceUtil;
import com.ocms.course.service.OffersAndDeductionsServiceUtil;
import com.ocms.course.service.PricingLocalServiceUtil;
import com.ocms.course.service.PricingServiceUtil;
import com.ocms.course.service.RegistrationDetailsLocalServiceUtil;
import com.ocms.course.service.RegistrationDetailsServiceUtil;
import com.ocms.course.service.StudentRegistrationLocalServiceUtil;
import com.ocms.course.service.StudentRegistrationServiceUtil;
import com.ocms.course.service.TaxDetailsLocalServiceUtil;
import com.ocms.course.service.TaxDetailsServiceUtil;
import com.ocms.course.service.TaxTypesLocalServiceUtil;
import com.ocms.course.service.TaxTypesServiceUtil;

/**
 * @author doraraj
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			ContactLocalServiceUtil.clearService();

			ContactServiceUtil.clearService();
			CourseLocalServiceUtil.clearService();

			CourseServiceUtil.clearService();
			CoursePackageLocalServiceUtil.clearService();

			CoursePackageServiceUtil.clearService();
			CourseSeriesLocalServiceUtil.clearService();

			CourseSeriesServiceUtil.clearService();
			EventLocalServiceUtil.clearService();

			EventServiceUtil.clearService();
			LocationLocalServiceUtil.clearService();

			LocationServiceUtil.clearService();
			OffersAndDeductionsLocalServiceUtil.clearService();

			OffersAndDeductionsServiceUtil.clearService();
			PricingLocalServiceUtil.clearService();

			PricingServiceUtil.clearService();
			RegistrationDetailsLocalServiceUtil.clearService();

			RegistrationDetailsServiceUtil.clearService();
			StudentRegistrationLocalServiceUtil.clearService();

			StudentRegistrationServiceUtil.clearService();
			TaxDetailsLocalServiceUtil.clearService();

			TaxDetailsServiceUtil.clearService();
			TaxTypesLocalServiceUtil.clearService();

			TaxTypesServiceUtil.clearService();
		}
	}
}