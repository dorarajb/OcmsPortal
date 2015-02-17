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
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactory;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.security.auth.PrincipalThreadLocal;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.UserService;
import com.ocms.course.CourseSeriesEndDateException;
import com.ocms.course.CourseSeriesMaxNoStudRegException;
import com.ocms.course.CourseSeriesStartDateException;
import com.ocms.course.CourseSeriesTypeException;
import com.ocms.course.model.CourseSeries;
import com.ocms.course.model.impl.CourseSeriesImpl;
import com.ocms.course.service.CourseSeriesLocalServiceUtil;
import com.ocms.course.service.LocationLocalServiceUtil;
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
	
	public List<CourseSeries> getCourseSeriesByLocationId(long locationId, OrderByComparator orderByComparator) throws SystemException {
		return courseSeriesPersistence.findByLocationId(locationId, 0, CourseSeriesLocalServiceUtil.getCourseSeriesesCount(), orderByComparator);
	}
	
	public List<CourseSeries> getCourseSeriesByCourseSeriesCode(String courseSeriesCode) throws SystemException {
		return courseSeriesPersistence.findByCourseSeriesCode(courseSeriesCode);
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
	
	public CourseSeries addCourseSeries(long userId, long courseId, long locationId, String courseSeriesCode,
			Date startDate, Date endDate, String type, long maxNoStudReg,
			String publishingStatus, long seriesCount, ServiceContext serviceContext)
			throws SystemException, PortalException {

		User user = userPersistence.findByPrimaryKey(userId);
		long groupId = 10184;

		Date now = new Date();

		validate(startDate, endDate, type, maxNoStudReg);

		long courseSeriesId = counterLocalService.increment();
		CourseSeries courseSeries = courseSeriesPersistence.create(courseSeriesId);

		courseSeries.setUserId(userId);
		courseSeries.setGroupId(groupId);
		courseSeries.setCompanyId(user.getCompanyId());
		courseSeries.setUserName(user.getFullName());
		courseSeries.setCreateDate(new Date());
		courseSeries.setModifiedDate(new Date());
		courseSeries.setStartDate(startDate);
		courseSeries.setEndDate(endDate);
		courseSeries.setType(type);
		courseSeries.setMaxNoStudReg(maxNoStudReg);
		courseSeries.setPublishingStatus(publishingStatus);
		courseSeries.setCourseId(courseId);
		courseSeries.setLocationId(locationId);
		courseSeries.setCourseSeriesCode(courseSeriesCode);
		courseSeries.setSeriesCount(seriesCount);
		courseSeries.setExpandoBridgeAttributes(serviceContext);

		courseSeriesPersistence.update(courseSeries);

		return courseSeries;
	}
	
	public CourseSeries updateCourse(long userId, long courseId, long locationId,
			Date startDate, Date endDate, String type, long maxNoStudReg,
			String publishingStatus, ServiceContext serviceContext) throws SystemException, PortalException {

		long groupId = 10184;
		User user = userPersistence.findByPrimaryKey(userId);
		Date now = new Date();

		validate(startDate, endDate, type, maxNoStudReg);

		List<CourseSeries> courseSeriesList = courseSeriesPersistence.findByCourseId(courseId);
		CourseSeries courseSeries = courseSeriesList.get(0);
		
		courseSeries.setUserId(userId);
		courseSeries.setGroupId(groupId);
		courseSeries.setCompanyId(user.getCompanyId());
		courseSeries.setUserName(user.getFullName());
		courseSeries.setCreateDate(new Date());
		courseSeries.setModifiedDate(new Date());
		courseSeries.setStartDate(startDate);
		courseSeries.setEndDate(endDate);
		courseSeries.setType(type);
		courseSeries.setMaxNoStudReg(maxNoStudReg);
		courseSeries.setPublishingStatus(publishingStatus);
		courseSeries.setCourseId(courseId);
		courseSeries.setLocationId(locationId);
		courseSeries.setExpandoBridgeAttributes(serviceContext);

		courseSeriesPersistence.update(courseSeries);

		return courseSeries;
	}
	
	public void deleteCourseSeriesByCourseSeriesId(long courseSeriesId){
		try {
			courseSeriesPersistence.removeBycourseSeriesId(courseSeriesId);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteCourseSeriesByGrouptId(long groupId){
		try {
			courseSeriesPersistence.removeByGroupId(groupId);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteAllCourseSeries(){
		try {
			courseSeriesPersistence.removeAll();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addCourseSeriesLoop(long[] locationList, long[] courseList){
		
		        ServiceContext serviceContext = null;
		        long userId =PrincipalThreadLocal.getUserId();
				OrderByComparatorFactory orderByComparatorFactory = OrderByComparatorFactoryUtil.getOrderByComparatorFactory();
				OrderByComparator comparator = orderByComparatorFactory.create(CourseSeriesImpl.TABLE_NAME, "seriesCount", false);
				
				System.out.println(locationList);
				System.out.println(courseList);
				
			    try {
			    	
			    	for (long locationId : locationList) {
			    		long seriesCount = 0;
			    		String courseSeriesCode =  null;
			    		if (CourseSeriesLocalServiceUtil.getCourseSeriesesCount() > 0) {
			    			List<CourseSeries> courseSeriesTemp = CourseSeriesLocalServiceUtil.getCourseSeriesByLocationId(locationId, comparator);
			    			if (courseSeriesTemp.size() > 0) {
			    				seriesCount = courseSeriesTemp.get(courseSeriesTemp.size()-1).getSeriesCount();
			    			}
			    			courseSeriesCode = LocationLocalServiceUtil.getLocation(locationId).getCode();
			    		}	    		
			    		for (long courseId : courseList) {
			    			CourseSeriesLocalServiceUtil.addCourseSeries(
			    					userId, courseId, locationId, courseSeriesCode + " " + (seriesCount + 1),
			    					new Date(), new Date(), "type", 100, "Do not publish", seriesCount + 1,
			    					serviceContext);
			    		}
			    	}

			        System.out.println("Success");

			    } catch (Exception e) {
			        e.printStackTrace();

			    }
			    
	}
	
	public void addCourseSeriesLoopTest(){
		
		long[] locationList = {1,2};
		long[] courseList = {11603,11604};
		addCourseSeriesLoop(locationList, courseList);
		
	}
}