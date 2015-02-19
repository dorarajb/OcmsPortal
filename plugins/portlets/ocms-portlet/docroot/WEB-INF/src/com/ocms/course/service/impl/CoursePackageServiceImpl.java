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
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.security.auth.PrincipalThreadLocal;
import com.liferay.portal.service.ServiceContext;
import com.ocms.course.CoursePackageCodeException;
import com.ocms.course.CoursePackageNameException;
import com.ocms.course.model.CoursePackage;
import com.ocms.course.service.base.CoursePackageServiceBaseImpl;

/**
 * The implementation of the course package remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ocms.course.service.CoursePackageService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author doraraj
 * @see com.ocms.course.service.base.CoursePackageServiceBaseImpl
 * @see com.ocms.course.service.CoursePackageServiceUtil
 */
@AccessControlled(guestAccessEnabled=true)
@JSONWebService("coursePackage")
public class CoursePackageServiceImpl extends CoursePackageServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.ocms.course.service.CoursePackageServiceUtil} to access the course package remote service.
	 */
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.ocms.course.service.CoursePackageLocalServiceUtil} to access the course package local service.
	 */
	public List<CoursePackage> getCoursesPackagesByGroupId(long groupId) throws SystemException {
		return coursePackagePersistence.findByGroupId(groupId);
	}
	
	public List<CoursePackage> getCoursesPackagesByGroupId(long groupId, int start, int end) throws SystemException {
		return coursePackagePersistence.findByGroupId(groupId, start, end);
	}
	
	public List<CoursePackage> getCoursesPackagesByCoursePackageId(long coursePackageId) throws SystemException {
		return coursePackagePersistence.findByCoursePackageId(coursePackageId);
	}
	
	public List<CoursePackage> getCoursesPackagesByCoursePackageId(long coursePackageId, int start, int end) throws SystemException {
		return coursePackagePersistence.findByCoursePackageId(coursePackageId, start, end);
	}
	
	protected void validate(String name, String code) throws PortalException {
		if (Validator.isNull(name)) {
			throw new CoursePackageNameException();
		}
		if (Validator.isNull(code)) {
			throw new CoursePackageCodeException();
		}
	}
	
	public CoursePackage addCoursePackage(String name, String code, ServiceContext serviceContext) throws SystemException, PortalException {
		
		long userId =PrincipalThreadLocal.getUserId();
		long groupId = serviceContext.getScopeGroupId();

		User user = userPersistence.findByPrimaryKey(userId);

		Date now = new Date();

		validate(name, code);

		long coursePackageId = counterLocalService.increment();

		CoursePackage coursePackage = coursePackagePersistence.create(coursePackageId);

		coursePackage.setUserId(userId);
		coursePackage.setGroupId(groupId);
		coursePackage.setCompanyId(user.getCompanyId());
		coursePackage.setUserName(user.getFullName());
		coursePackage.setCreateDate(serviceContext.getCreateDate(now));
		coursePackage.setModifiedDate(serviceContext.getModifiedDate(now));
		coursePackage.setName(name);
		coursePackage.setCode(code);
		coursePackage.setExpandoBridgeAttributes(serviceContext);

		coursePackagePersistence.update(coursePackage);

		return coursePackage;
	}
	
	public CoursePackage updateCoursePackage(long coursePackageId, String name, String code, ServiceContext serviceContext) throws SystemException, PortalException {

		long userId =PrincipalThreadLocal.getUserId();
		long groupId = serviceContext.getScopeGroupId();
		User user = userPersistence.findByPrimaryKey(userId);
		Date now = new Date();

		validate(name, code);

		List<CoursePackage> coursePackageList = coursePackagePersistence.findByCoursePackageId(coursePackageId);
		CoursePackage coursePackage = coursePackageList.get(0);
		
		coursePackage.setUserId(userId);
		coursePackage.setGroupId(groupId);
		coursePackage.setCompanyId(user.getCompanyId());
		coursePackage.setUserName(user.getFullName());
		coursePackage.setCreateDate(serviceContext.getCreateDate(now));
		coursePackage.setModifiedDate(serviceContext.getModifiedDate(now));
		coursePackage.setName(name);
		coursePackage.setCode(code);
		coursePackage.setExpandoBridgeAttributes(serviceContext);

		coursePackagePersistence.update(coursePackage);

		return coursePackage;
	}
}