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

package com.ocms.course.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.ocms.course.model.Pricing;
import com.ocms.course.service.PricingLocalServiceUtil;

/**
 * @author doraraj
 * @generated
 */
public abstract class PricingActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public PricingActionableDynamicQuery() throws SystemException {
		setBaseLocalService(PricingLocalServiceUtil.getService());
		setClass(Pricing.class);

		setClassLoader(com.ocms.course.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("pricingId");
	}
}