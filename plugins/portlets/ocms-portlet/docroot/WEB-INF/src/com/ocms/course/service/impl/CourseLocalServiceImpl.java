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
import com.ocms.course.CourseCodeException;
import com.ocms.course.CourseDurationException;
import com.ocms.course.CourseNameException;
import com.ocms.course.model.Course;
import com.ocms.course.service.base.CourseLocalServiceBaseImpl;

/**
 * The implementation of the course local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ocms.course.service.CourseLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author doraraj
 * @see com.ocms.course.service.base.CourseLocalServiceBaseImpl
 * @see com.ocms.course.service.CourseLocalServiceUtil
 */
public class CourseLocalServiceImpl extends CourseLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.ocms.course.service.CourseLocalServiceUtil} to access the course local service.
	 */
	
	public List<Course> getCoursesByGroupId(long groupId) throws SystemException {
		return coursePersistence.findByGroupId(groupId);
	}
	
	public List<Course> getCoursesByGroupId(long groupId, int start, int end) throws SystemException {
		return coursePersistence.findByGroupId(groupId, start, end);
	}
	
	public List<Course> getCoursesByCourseId(long courseId) throws SystemException {
		return coursePersistence.findByCourseId(courseId);
	}
	
	public List<Course> getCoursesByCourseId(long courseId, int start, int end) throws SystemException {
		return coursePersistence.findByCourseId(courseId, start, end);
	}
	
	protected void validate(String name, String code, String duration) throws PortalException {
		if (Validator.isNull(name)) {
			throw new CourseNameException();
		}
		if (Validator.isNull(code)) {
			throw new CourseCodeException();
		}
		if (Validator.isNull(duration)) {
			throw new CourseDurationException();
		}
	}
	
	public Course addCourse(long userId, String name, String code, String duration, ServiceContext serviceContext) throws SystemException, PortalException {
		long groupId = serviceContext.getScopeGroupId();

		User user = userPersistence.findByPrimaryKey(userId);

		Date now = new Date();

		validate(name, code, duration);

		long courseId = counterLocalService.increment();

		Course course = coursePersistence.create(courseId);

		course.setUserId(userId);
		course.setGroupId(groupId);
		course.setCompanyId(user.getCompanyId());
		course.setUserName(user.getFullName());
		course.setCreateDate(serviceContext.getCreateDate(now));
		course.setModifiedDate(serviceContext.getModifiedDate(now));
		course.setName(name);
		course.setCode(code);
		course.setDuration(duration);
		course.setExpandoBridgeAttributes(serviceContext);

		coursePersistence.update(course);

		return course;
	}
	
	public Course updateCourse(long userId, long courseId, String name, String code, String duration, ServiceContext serviceContext) throws SystemException, PortalException {

		long groupId = serviceContext.getScopeGroupId();
		User user = userPersistence.findByPrimaryKey(userId);
		Date now = new Date();

		validate(name, code, duration);

		List<Course> courseList = coursePersistence.findByCourseId(courseId);
		Course course = courseList.get(0);
		
		course.setUserId(userId);
		course.setGroupId(groupId);
		course.setCompanyId(user.getCompanyId());
		course.setUserName(user.getFullName());
		course.setCreateDate(serviceContext.getCreateDate(now));
		course.setModifiedDate(serviceContext.getModifiedDate(now));
		course.setName(name);
		course.setCode(code);
		course.setDuration(duration);
		course.setExpandoBridgeAttributes(serviceContext);

		coursePersistence.update(course);

		return course;
	}
	
	public void deleteCourseByCourseId(long courseId){
		try {
			coursePersistence.removeByCourseId(courseId);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteCourseByGrouptId(long groupId){
		try {
			coursePersistence.removeByGroupId(groupId);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteAllCourse(){
		try {
			coursePersistence.removeAll();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}