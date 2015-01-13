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

import com.ocms.course.model.CourseSeries;
import com.ocms.course.service.CourseSeriesLocalServiceUtil;

/**
 * @author doraraj
 * @generated
 */
public abstract class CourseSeriesActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public CourseSeriesActionableDynamicQuery() throws SystemException {
		setBaseLocalService(CourseSeriesLocalServiceUtil.getService());
		setClass(CourseSeries.class);

		setClassLoader(com.ocms.course.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("courseSeriesId");
	}
}