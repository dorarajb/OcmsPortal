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
 * Provides a wrapper for {@link CoursePackageLocalService}.
 *
 * @author doraraj
 * @see CoursePackageLocalService
 * @generated
 */
public class CoursePackageLocalServiceWrapper
	implements CoursePackageLocalService,
		ServiceWrapper<CoursePackageLocalService> {
	public CoursePackageLocalServiceWrapper(
		CoursePackageLocalService coursePackageLocalService) {
		_coursePackageLocalService = coursePackageLocalService;
	}

	/**
	* Adds the course package to the database. Also notifies the appropriate model listeners.
	*
	* @param coursePackage the course package
	* @return the course package that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.CoursePackage addCoursePackage(
		com.ocms.course.model.CoursePackage coursePackage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _coursePackageLocalService.addCoursePackage(coursePackage);
	}

	/**
	* Creates a new course package with the primary key. Does not add the course package to the database.
	*
	* @param coursePackageId the primary key for the new course package
	* @return the new course package
	*/
	@Override
	public com.ocms.course.model.CoursePackage createCoursePackage(
		long coursePackageId) {
		return _coursePackageLocalService.createCoursePackage(coursePackageId);
	}

	/**
	* Deletes the course package with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param coursePackageId the primary key of the course package
	* @return the course package that was removed
	* @throws PortalException if a course package with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.CoursePackage deleteCoursePackage(
		long coursePackageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _coursePackageLocalService.deleteCoursePackage(coursePackageId);
	}

	/**
	* Deletes the course package from the database. Also notifies the appropriate model listeners.
	*
	* @param coursePackage the course package
	* @return the course package that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.CoursePackage deleteCoursePackage(
		com.ocms.course.model.CoursePackage coursePackage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _coursePackageLocalService.deleteCoursePackage(coursePackage);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _coursePackageLocalService.dynamicQuery();
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
		return _coursePackageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CoursePackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _coursePackageLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CoursePackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _coursePackageLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _coursePackageLocalService.dynamicQueryCount(dynamicQuery);
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
		return _coursePackageLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ocms.course.model.CoursePackage fetchCoursePackage(
		long coursePackageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _coursePackageLocalService.fetchCoursePackage(coursePackageId);
	}

	/**
	* Returns the course package with the primary key.
	*
	* @param coursePackageId the primary key of the course package
	* @return the course package
	* @throws PortalException if a course package with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.CoursePackage getCoursePackage(
		long coursePackageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _coursePackageLocalService.getCoursePackage(coursePackageId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _coursePackageLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the course packages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CoursePackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of course packages
	* @param end the upper bound of the range of course packages (not inclusive)
	* @return the range of course packages
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ocms.course.model.CoursePackage> getCoursePackages(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _coursePackageLocalService.getCoursePackages(start, end);
	}

	/**
	* Returns the number of course packages.
	*
	* @return the number of course packages
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCoursePackagesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _coursePackageLocalService.getCoursePackagesCount();
	}

	/**
	* Updates the course package in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param coursePackage the course package
	* @return the course package that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.CoursePackage updateCoursePackage(
		com.ocms.course.model.CoursePackage coursePackage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _coursePackageLocalService.updateCoursePackage(coursePackage);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _coursePackageLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_coursePackageLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _coursePackageLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<com.ocms.course.model.CoursePackage> getCoursesPackagesByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _coursePackageLocalService.getCoursesPackagesByGroupId(groupId);
	}

	@Override
	public java.util.List<com.ocms.course.model.CoursePackage> getCoursesPackagesByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _coursePackageLocalService.getCoursesPackagesByGroupId(groupId,
			start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.CoursePackage> getCoursesPackagesByCoursePackageId(
		long coursePackageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _coursePackageLocalService.getCoursesPackagesByCoursePackageId(coursePackageId);
	}

	@Override
	public java.util.List<com.ocms.course.model.CoursePackage> getCoursesPackagesByCoursePackageId(
		long coursePackageId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _coursePackageLocalService.getCoursesPackagesByCoursePackageId(coursePackageId,
			start, end);
	}

	@Override
	public com.ocms.course.model.CoursePackage addCoursePackage(long userId,
		java.lang.String name, java.lang.String code,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _coursePackageLocalService.addCoursePackage(userId, name, code,
			serviceContext);
	}

	@Override
	public com.ocms.course.model.CoursePackage updateCoursePackage(
		long userId, long coursePackageId, java.lang.String name,
		java.lang.String code,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _coursePackageLocalService.updateCoursePackage(userId,
			coursePackageId, name, code, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CoursePackageLocalService getWrappedCoursePackageLocalService() {
		return _coursePackageLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCoursePackageLocalService(
		CoursePackageLocalService coursePackageLocalService) {
		_coursePackageLocalService = coursePackageLocalService;
	}

	@Override
	public CoursePackageLocalService getWrappedService() {
		return _coursePackageLocalService;
	}

	@Override
	public void setWrappedService(
		CoursePackageLocalService coursePackageLocalService) {
		_coursePackageLocalService = coursePackageLocalService;
	}

	private CoursePackageLocalService _coursePackageLocalService;
}