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

package com.ocms.course.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CourseSeriesLocalService}.
 *
 * @author doraraj
 * @see CourseSeriesLocalService
 * @generated
 */
public class CourseSeriesLocalServiceWrapper implements CourseSeriesLocalService,
	ServiceWrapper<CourseSeriesLocalService> {
	public CourseSeriesLocalServiceWrapper(
		CourseSeriesLocalService courseSeriesLocalService) {
		_courseSeriesLocalService = courseSeriesLocalService;
	}

	/**
	* Adds the course series to the database. Also notifies the appropriate model listeners.
	*
	* @param courseSeries the course series
	* @return the course series that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.CourseSeries addCourseSeries(
		com.ocms.course.model.CourseSeries courseSeries)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesLocalService.addCourseSeries(courseSeries);
	}

	/**
	* Creates a new course series with the primary key. Does not add the course series to the database.
	*
	* @param courseSeriesId the primary key for the new course series
	* @return the new course series
	*/
	@Override
	public com.ocms.course.model.CourseSeries createCourseSeries(
		long courseSeriesId) {
		return _courseSeriesLocalService.createCourseSeries(courseSeriesId);
	}

	/**
	* Deletes the course series with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param courseSeriesId the primary key of the course series
	* @return the course series that was removed
	* @throws PortalException if a course series with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.CourseSeries deleteCourseSeries(
		long courseSeriesId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesLocalService.deleteCourseSeries(courseSeriesId);
	}

	/**
	* Deletes the course series from the database. Also notifies the appropriate model listeners.
	*
	* @param courseSeries the course series
	* @return the course series that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.CourseSeries deleteCourseSeries(
		com.ocms.course.model.CourseSeries courseSeries)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesLocalService.deleteCourseSeries(courseSeries);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _courseSeriesLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ocms.course.model.CourseSeries fetchCourseSeries(
		long courseSeriesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesLocalService.fetchCourseSeries(courseSeriesId);
	}

	/**
	* Returns the course series with the primary key.
	*
	* @param courseSeriesId the primary key of the course series
	* @return the course series
	* @throws PortalException if a course series with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.CourseSeries getCourseSeries(
		long courseSeriesId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesLocalService.getCourseSeries(courseSeriesId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the course serieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of course serieses
	* @param end the upper bound of the range of course serieses (not inclusive)
	* @return the range of course serieses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSerieses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesLocalService.getCourseSerieses(start, end);
	}

	/**
	* Returns the number of course serieses.
	*
	* @return the number of course serieses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCourseSeriesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesLocalService.getCourseSeriesesCount();
	}

	/**
	* Updates the course series in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param courseSeries the course series
	* @return the course series that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.CourseSeries updateCourseSeries(
		com.ocms.course.model.CourseSeries courseSeries)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesLocalService.updateCourseSeries(courseSeries);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _courseSeriesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_courseSeriesLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _courseSeriesLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesLocalService.getCourseSeriesByGroupId(groupId);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesLocalService.getCourseSeriesByGroupId(groupId,
			start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByCourseId(
		long courseId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesLocalService.getCourseSeriesByCourseId(courseId);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByCourseId(
		long courseId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesLocalService.getCourseSeriesByCourseId(courseId,
			start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByLocationId(
		long locationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesLocalService.getCourseSeriesByLocationId(locationId);
	}

	@Override
	public java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByLocationId(
		long locationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesLocalService.getCourseSeriesByLocationId(locationId,
			start, end);
	}

	@Override
	public com.ocms.course.model.CourseSeries addCourseSeries(long userId,
		long courseId, long locationId, java.util.Date startDate,
		java.util.Date endDate, java.lang.String type, long maxNoStudReg,
		java.lang.String publishingStatus,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesLocalService.addCourseSeries(userId, courseId,
			locationId, startDate, endDate, type, maxNoStudReg,
			publishingStatus, serviceContext);
	}

	@Override
	public com.ocms.course.model.CourseSeries updateCourse(long userId,
		long courseId, long locationId, java.util.Date startDate,
		java.util.Date endDate, java.lang.String type, long maxNoStudReg,
		java.lang.String publishingStatus,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _courseSeriesLocalService.updateCourse(userId, courseId,
			locationId, startDate, endDate, type, maxNoStudReg,
			publishingStatus, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CourseSeriesLocalService getWrappedCourseSeriesLocalService() {
		return _courseSeriesLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCourseSeriesLocalService(
		CourseSeriesLocalService courseSeriesLocalService) {
		_courseSeriesLocalService = courseSeriesLocalService;
	}

	@Override
	public CourseSeriesLocalService getWrappedService() {
		return _courseSeriesLocalService;
	}

	@Override
	public void setWrappedService(
		CourseSeriesLocalService courseSeriesLocalService) {
		_courseSeriesLocalService = courseSeriesLocalService;
	}

	private CourseSeriesLocalService _courseSeriesLocalService;
}