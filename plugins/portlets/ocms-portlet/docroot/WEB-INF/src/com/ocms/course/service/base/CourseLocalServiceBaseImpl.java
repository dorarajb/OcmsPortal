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

package com.ocms.course.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.ocms.course.model.Course;
import com.ocms.course.service.CourseLocalService;
import com.ocms.course.service.persistence.ContactPersistence;
import com.ocms.course.service.persistence.CoursePackagePersistence;
import com.ocms.course.service.persistence.CoursePersistence;
import com.ocms.course.service.persistence.CourseSeriesPersistence;
import com.ocms.course.service.persistence.LocationPersistence;
import com.ocms.course.service.persistence.PricingPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the course local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.ocms.course.service.impl.CourseLocalServiceImpl}.
 * </p>
 *
 * @author doraraj
 * @see com.ocms.course.service.impl.CourseLocalServiceImpl
 * @see com.ocms.course.service.CourseLocalServiceUtil
 * @generated
 */
public abstract class CourseLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements CourseLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.ocms.course.service.CourseLocalServiceUtil} to access the course local service.
	 */

	/**
	 * Adds the course to the database. Also notifies the appropriate model listeners.
	 *
	 * @param course the course
	 * @return the course that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Course addCourse(Course course) throws SystemException {
		course.setNew(true);

		return coursePersistence.update(course);
	}

	/**
	 * Creates a new course with the primary key. Does not add the course to the database.
	 *
	 * @param courseId the primary key for the new course
	 * @return the new course
	 */
	@Override
	public Course createCourse(long courseId) {
		return coursePersistence.create(courseId);
	}

	/**
	 * Deletes the course with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param courseId the primary key of the course
	 * @return the course that was removed
	 * @throws PortalException if a course with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Course deleteCourse(long courseId)
		throws PortalException, SystemException {
		return coursePersistence.remove(courseId);
	}

	/**
	 * Deletes the course from the database. Also notifies the appropriate model listeners.
	 *
	 * @param course the course
	 * @return the course that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Course deleteCourse(Course course) throws SystemException {
		return coursePersistence.remove(course);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(Course.class,
			clazz.getClassLoader());
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
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return coursePersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return coursePersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return coursePersistence.findWithDynamicQuery(dynamicQuery, start, end,
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return coursePersistence.countWithDynamicQuery(dynamicQuery);
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return coursePersistence.countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public Course fetchCourse(long courseId) throws SystemException {
		return coursePersistence.fetchByPrimaryKey(courseId);
	}

	/**
	 * Returns the course with the primary key.
	 *
	 * @param courseId the primary key of the course
	 * @return the course
	 * @throws PortalException if a course with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Course getCourse(long courseId)
		throws PortalException, SystemException {
		return coursePersistence.findByPrimaryKey(courseId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return coursePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the courses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of courses
	 * @param end the upper bound of the range of courses (not inclusive)
	 * @return the range of courses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Course> getCourses(int start, int end)
		throws SystemException {
		return coursePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of courses.
	 *
	 * @return the number of courses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getCoursesCount() throws SystemException {
		return coursePersistence.countAll();
	}

	/**
	 * Updates the course in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param course the course
	 * @return the course that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Course updateCourse(Course course) throws SystemException {
		return coursePersistence.update(course);
	}

	/**
	 * Returns the contact local service.
	 *
	 * @return the contact local service
	 */
	public com.ocms.course.service.ContactLocalService getContactLocalService() {
		return contactLocalService;
	}

	/**
	 * Sets the contact local service.
	 *
	 * @param contactLocalService the contact local service
	 */
	public void setContactLocalService(
		com.ocms.course.service.ContactLocalService contactLocalService) {
		this.contactLocalService = contactLocalService;
	}

	/**
	 * Returns the contact remote service.
	 *
	 * @return the contact remote service
	 */
	public com.ocms.course.service.ContactService getContactService() {
		return contactService;
	}

	/**
	 * Sets the contact remote service.
	 *
	 * @param contactService the contact remote service
	 */
	public void setContactService(
		com.ocms.course.service.ContactService contactService) {
		this.contactService = contactService;
	}

	/**
	 * Returns the contact persistence.
	 *
	 * @return the contact persistence
	 */
	public ContactPersistence getContactPersistence() {
		return contactPersistence;
	}

	/**
	 * Sets the contact persistence.
	 *
	 * @param contactPersistence the contact persistence
	 */
	public void setContactPersistence(ContactPersistence contactPersistence) {
		this.contactPersistence = contactPersistence;
	}

	/**
	 * Returns the course local service.
	 *
	 * @return the course local service
	 */
	public com.ocms.course.service.CourseLocalService getCourseLocalService() {
		return courseLocalService;
	}

	/**
	 * Sets the course local service.
	 *
	 * @param courseLocalService the course local service
	 */
	public void setCourseLocalService(
		com.ocms.course.service.CourseLocalService courseLocalService) {
		this.courseLocalService = courseLocalService;
	}

	/**
	 * Returns the course remote service.
	 *
	 * @return the course remote service
	 */
	public com.ocms.course.service.CourseService getCourseService() {
		return courseService;
	}

	/**
	 * Sets the course remote service.
	 *
	 * @param courseService the course remote service
	 */
	public void setCourseService(
		com.ocms.course.service.CourseService courseService) {
		this.courseService = courseService;
	}

	/**
	 * Returns the course persistence.
	 *
	 * @return the course persistence
	 */
	public CoursePersistence getCoursePersistence() {
		return coursePersistence;
	}

	/**
	 * Sets the course persistence.
	 *
	 * @param coursePersistence the course persistence
	 */
	public void setCoursePersistence(CoursePersistence coursePersistence) {
		this.coursePersistence = coursePersistence;
	}

	/**
	 * Returns the course package local service.
	 *
	 * @return the course package local service
	 */
	public com.ocms.course.service.CoursePackageLocalService getCoursePackageLocalService() {
		return coursePackageLocalService;
	}

	/**
	 * Sets the course package local service.
	 *
	 * @param coursePackageLocalService the course package local service
	 */
	public void setCoursePackageLocalService(
		com.ocms.course.service.CoursePackageLocalService coursePackageLocalService) {
		this.coursePackageLocalService = coursePackageLocalService;
	}

	/**
	 * Returns the course package remote service.
	 *
	 * @return the course package remote service
	 */
	public com.ocms.course.service.CoursePackageService getCoursePackageService() {
		return coursePackageService;
	}

	/**
	 * Sets the course package remote service.
	 *
	 * @param coursePackageService the course package remote service
	 */
	public void setCoursePackageService(
		com.ocms.course.service.CoursePackageService coursePackageService) {
		this.coursePackageService = coursePackageService;
	}

	/**
	 * Returns the course package persistence.
	 *
	 * @return the course package persistence
	 */
	public CoursePackagePersistence getCoursePackagePersistence() {
		return coursePackagePersistence;
	}

	/**
	 * Sets the course package persistence.
	 *
	 * @param coursePackagePersistence the course package persistence
	 */
	public void setCoursePackagePersistence(
		CoursePackagePersistence coursePackagePersistence) {
		this.coursePackagePersistence = coursePackagePersistence;
	}

	/**
	 * Returns the course series local service.
	 *
	 * @return the course series local service
	 */
	public com.ocms.course.service.CourseSeriesLocalService getCourseSeriesLocalService() {
		return courseSeriesLocalService;
	}

	/**
	 * Sets the course series local service.
	 *
	 * @param courseSeriesLocalService the course series local service
	 */
	public void setCourseSeriesLocalService(
		com.ocms.course.service.CourseSeriesLocalService courseSeriesLocalService) {
		this.courseSeriesLocalService = courseSeriesLocalService;
	}

	/**
	 * Returns the course series remote service.
	 *
	 * @return the course series remote service
	 */
	public com.ocms.course.service.CourseSeriesService getCourseSeriesService() {
		return courseSeriesService;
	}

	/**
	 * Sets the course series remote service.
	 *
	 * @param courseSeriesService the course series remote service
	 */
	public void setCourseSeriesService(
		com.ocms.course.service.CourseSeriesService courseSeriesService) {
		this.courseSeriesService = courseSeriesService;
	}

	/**
	 * Returns the course series persistence.
	 *
	 * @return the course series persistence
	 */
	public CourseSeriesPersistence getCourseSeriesPersistence() {
		return courseSeriesPersistence;
	}

	/**
	 * Sets the course series persistence.
	 *
	 * @param courseSeriesPersistence the course series persistence
	 */
	public void setCourseSeriesPersistence(
		CourseSeriesPersistence courseSeriesPersistence) {
		this.courseSeriesPersistence = courseSeriesPersistence;
	}

	/**
	 * Returns the location local service.
	 *
	 * @return the location local service
	 */
	public com.ocms.course.service.LocationLocalService getLocationLocalService() {
		return locationLocalService;
	}

	/**
	 * Sets the location local service.
	 *
	 * @param locationLocalService the location local service
	 */
	public void setLocationLocalService(
		com.ocms.course.service.LocationLocalService locationLocalService) {
		this.locationLocalService = locationLocalService;
	}

	/**
	 * Returns the location remote service.
	 *
	 * @return the location remote service
	 */
	public com.ocms.course.service.LocationService getLocationService() {
		return locationService;
	}

	/**
	 * Sets the location remote service.
	 *
	 * @param locationService the location remote service
	 */
	public void setLocationService(
		com.ocms.course.service.LocationService locationService) {
		this.locationService = locationService;
	}

	/**
	 * Returns the location persistence.
	 *
	 * @return the location persistence
	 */
	public LocationPersistence getLocationPersistence() {
		return locationPersistence;
	}

	/**
	 * Sets the location persistence.
	 *
	 * @param locationPersistence the location persistence
	 */
	public void setLocationPersistence(LocationPersistence locationPersistence) {
		this.locationPersistence = locationPersistence;
	}

	/**
	 * Returns the pricing local service.
	 *
	 * @return the pricing local service
	 */
	public com.ocms.course.service.PricingLocalService getPricingLocalService() {
		return pricingLocalService;
	}

	/**
	 * Sets the pricing local service.
	 *
	 * @param pricingLocalService the pricing local service
	 */
	public void setPricingLocalService(
		com.ocms.course.service.PricingLocalService pricingLocalService) {
		this.pricingLocalService = pricingLocalService;
	}

	/**
	 * Returns the pricing remote service.
	 *
	 * @return the pricing remote service
	 */
	public com.ocms.course.service.PricingService getPricingService() {
		return pricingService;
	}

	/**
	 * Sets the pricing remote service.
	 *
	 * @param pricingService the pricing remote service
	 */
	public void setPricingService(
		com.ocms.course.service.PricingService pricingService) {
		this.pricingService = pricingService;
	}

	/**
	 * Returns the pricing persistence.
	 *
	 * @return the pricing persistence
	 */
	public PricingPersistence getPricingPersistence() {
		return pricingPersistence;
	}

	/**
	 * Sets the pricing persistence.
	 *
	 * @param pricingPersistence the pricing persistence
	 */
	public void setPricingPersistence(PricingPersistence pricingPersistence) {
		this.pricingPersistence = pricingPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("com.ocms.course.model.Course",
			courseLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.ocms.course.model.Course");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return Course.class;
	}

	protected String getModelClassName() {
		return Course.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = coursePersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.ocms.course.service.ContactLocalService.class)
	protected com.ocms.course.service.ContactLocalService contactLocalService;
	@BeanReference(type = com.ocms.course.service.ContactService.class)
	protected com.ocms.course.service.ContactService contactService;
	@BeanReference(type = ContactPersistence.class)
	protected ContactPersistence contactPersistence;
	@BeanReference(type = com.ocms.course.service.CourseLocalService.class)
	protected com.ocms.course.service.CourseLocalService courseLocalService;
	@BeanReference(type = com.ocms.course.service.CourseService.class)
	protected com.ocms.course.service.CourseService courseService;
	@BeanReference(type = CoursePersistence.class)
	protected CoursePersistence coursePersistence;
	@BeanReference(type = com.ocms.course.service.CoursePackageLocalService.class)
	protected com.ocms.course.service.CoursePackageLocalService coursePackageLocalService;
	@BeanReference(type = com.ocms.course.service.CoursePackageService.class)
	protected com.ocms.course.service.CoursePackageService coursePackageService;
	@BeanReference(type = CoursePackagePersistence.class)
	protected CoursePackagePersistence coursePackagePersistence;
	@BeanReference(type = com.ocms.course.service.CourseSeriesLocalService.class)
	protected com.ocms.course.service.CourseSeriesLocalService courseSeriesLocalService;
	@BeanReference(type = com.ocms.course.service.CourseSeriesService.class)
	protected com.ocms.course.service.CourseSeriesService courseSeriesService;
	@BeanReference(type = CourseSeriesPersistence.class)
	protected CourseSeriesPersistence courseSeriesPersistence;
	@BeanReference(type = com.ocms.course.service.LocationLocalService.class)
	protected com.ocms.course.service.LocationLocalService locationLocalService;
	@BeanReference(type = com.ocms.course.service.LocationService.class)
	protected com.ocms.course.service.LocationService locationService;
	@BeanReference(type = LocationPersistence.class)
	protected LocationPersistence locationPersistence;
	@BeanReference(type = com.ocms.course.service.PricingLocalService.class)
	protected com.ocms.course.service.PricingLocalService pricingLocalService;
	@BeanReference(type = com.ocms.course.service.PricingService.class)
	protected com.ocms.course.service.PricingService pricingService;
	@BeanReference(type = PricingPersistence.class)
	protected PricingPersistence pricingPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private CourseLocalServiceClpInvoker _clpInvoker = new CourseLocalServiceClpInvoker();
}