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

package com.ocms.course.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.ocms.course.CourseSeriesEndDateException;
import com.ocms.course.CourseSeriesMaxNoStudRegException;
import com.ocms.course.CourseSeriesStartDateException;
import com.ocms.course.CourseSeriesTypeException;
import com.ocms.course.model.CourseSeries;
import com.ocms.course.service.base.CourseSeriesLocalServiceBaseImpl;

/**
 * The implementation of the course series local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ocms.course.service.CourseSeriesLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author doraraj
 * @see com.ocms.course.service.base.CourseSeriesLocalServiceBaseImpl
 * @see com.ocms.course.service.CourseSeriesLocalServiceUtil
 */
public class CourseSeriesLocalServiceImpl
	extends CourseSeriesLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.ocms.course.service.CourseSeriesLocalServiceUtil} to access the course series local service.
	 */
	
	public List<CourseSeries> getCourseSeriesByGroupId(long groupId) throws SystemException {
		return courseSeriesPersistence.findByGroupId(groupId);
	}
	
	public List<CourseSeries> getCourseSeriesByGroupId(long groupId, int start, int end) throws SystemException {
		return courseSeriesPersistence.findByGroupId(groupId, start, end);
	}
	
	public List<CourseSeries> getCourseSeriesByCourseId(long courseId) throws SystemException {
		return courseSeriesPersistence.findByCourseId(courseId);
	}
	
	public List<CourseSeries> getCourseSeriesByCourseId(long courseId, int start, int end) throws SystemException {
		return courseSeriesPersistence.findByCourseId(courseId, start, end);
	}
	
	public List<CourseSeries> getCourseSeriesByLocationId(long locationId) throws SystemException {
		return courseSeriesPersistence.findByLocationId(locationId);
	}
	
	public List<CourseSeries> getCourseSeriesByLocationId(long locationId, int start, int end) throws SystemException {
		return courseSeriesPersistence.findByLocationId(locationId, start, end);
	}
	
	protected void validate(Date startDate, Date endDate, String type,
			long maxNoStudReg) throws PortalException {
		if (Validator.isNull(startDate)) {
			throw new CourseSeriesStartDateException();
		}
		if (Validator.isNull(endDate)) {
			throw new CourseSeriesEndDateException();
		}
		if (Validator.isNull(type)) {
			throw new CourseSeriesTypeException();
		}
		if (Validator.isNull(maxNoStudReg)) {
			throw new CourseSeriesMaxNoStudRegException();
		}
	}
	
	public CourseSeries addCourseSeries(long userId, long courseId, long locationId,
			Date startDate, Date endDate, String type, long maxNoStudReg,
			String publishingStatus, ServiceContext serviceContext)
			throws SystemException, PortalException {
		long groupId = serviceContext.getScopeGroupId();

		User user = userPersistence.findByPrimaryKey(userId);

		Date now = new Date();

		validate(startDate, endDate, type, maxNoStudReg);

		long courseSeriesId = counterLocalService.increment();

		CourseSeries courseSeries = courseSeriesPersistence.create(courseSeriesId);

		courseSeries.setUserId(userId);
		courseSeries.setGroupId(groupId);
		courseSeries.setCompanyId(user.getCompanyId());
		courseSeries.setUserName(user.getFullName());
		courseSeries.setCreateDate(serviceContext.getCreateDate(now));
		courseSeries.setModifiedDate(serviceContext.getModifiedDate(now));
		courseSeries.setStart_date(startDate);
		courseSeries.setEnd_date(endDate);
		courseSeries.setType(type);
		courseSeries.setMax_no_of_stud_reg(maxNoStudReg);
		courseSeries.setPublishing_status(publishingStatus);
		courseSeries.setCourseId(courseId);
		courseSeries.setLocationId(locationId);
		courseSeries.setExpandoBridgeAttributes(serviceContext);

		courseSeriesPersistence.update(courseSeries);

		return courseSeries;
	}
	
	public CourseSeries updateCourse(long userId, long courseId, long locationId,
			Date startDate, Date endDate, String type, long maxNoStudReg,
			String publishingStatus, ServiceContext serviceContext) throws SystemException, PortalException {

		long groupId = serviceContext.getScopeGroupId();
		User user = userPersistence.findByPrimaryKey(userId);
		Date now = new Date();

		validate(startDate, endDate, type, maxNoStudReg);

		List<CourseSeries> courseSeriesList = courseSeriesPersistence.findByCourseId(courseId);
		CourseSeries courseSeries = courseSeriesList.get(0);
		
		courseSeries.setUserId(userId);
		courseSeries.setGroupId(groupId);
		courseSeries.setCompanyId(user.getCompanyId());
		courseSeries.setUserName(user.getFullName());
		courseSeries.setCreateDate(serviceContext.getCreateDate(now));
		courseSeries.setModifiedDate(serviceContext.getModifiedDate(now));
		courseSeries.setStart_date(startDate);
		courseSeries.setEnd_date(endDate);
		courseSeries.setType(type);
		courseSeries.setMax_no_of_stud_reg(maxNoStudReg);
		courseSeries.setPublishing_status(publishingStatus);
		courseSeries.setCourseId(courseId);
		courseSeries.setLocationId(locationId);
		courseSeries.setExpandoBridgeAttributes(serviceContext);

		courseSeriesPersistence.update(courseSeries);

		return courseSeries;
	}
}