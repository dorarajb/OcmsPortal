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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for CourseSeries. This utility wraps
 * {@link com.ocms.course.service.impl.CourseSeriesLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author doraraj
 * @see CourseSeriesLocalService
 * @see com.ocms.course.service.base.CourseSeriesLocalServiceBaseImpl
 * @see com.ocms.course.service.impl.CourseSeriesLocalServiceImpl
 * @generated
 */
public class CourseSeriesLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ocms.course.service.impl.CourseSeriesLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the course series to the database. Also notifies the appropriate model listeners.
	*
	* @param courseSeries the course series
	* @return the course series that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries addCourseSeries(
		com.ocms.course.model.CourseSeries courseSeries)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addCourseSeries(courseSeries);
	}

	/**
	* Creates a new course series with the primary key. Does not add the course series to the database.
	*
	* @param courseSeriesId the primary key for the new course series
	* @return the new course series
	*/
	public static com.ocms.course.model.CourseSeries createCourseSeries(
		long courseSeriesId) {
		return getService().createCourseSeries(courseSeriesId);
	}

	/**
	* Deletes the course series with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param courseSeriesId the primary key of the course series
	* @return the course series that was removed
	* @throws PortalException if a course series with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries deleteCourseSeries(
		long courseSeriesId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCourseSeries(courseSeriesId);
	}

	/**
	* Deletes the course series from the database. Also notifies the appropriate model listeners.
	*
	* @param courseSeries the course series
	* @return the course series that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries deleteCourseSeries(
		com.ocms.course.model.CourseSeries courseSeries)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCourseSeries(courseSeries);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.ocms.course.model.CourseSeries fetchCourseSeries(
		long courseSeriesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchCourseSeries(courseSeriesId);
	}

	/**
	* Returns the course series with the primary key.
	*
	* @param courseSeriesId the primary key of the course series
	* @return the course series
	* @throws PortalException if a course series with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries getCourseSeries(
		long courseSeriesId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCourseSeries(courseSeriesId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.ocms.course.model.CourseSeries> getCourseSerieses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCourseSerieses(start, end);
	}

	/**
	* Returns the number of course serieses.
	*
	* @return the number of course serieses
	* @throws SystemException if a system exception occurred
	*/
	public static int getCourseSeriesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCourseSeriesesCount();
	}

	/**
	* Updates the course series in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param courseSeries the course series
	* @return the course series that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.CourseSeries updateCourseSeries(
		com.ocms.course.model.CourseSeries courseSeries)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateCourseSeries(courseSeries);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCourseSeriesByGroupId(groupId);
	}

	public static java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCourseSeriesByGroupId(groupId, start, end);
	}

	public static java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByCourseId(
		long courseId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCourseSeriesByCourseId(courseId);
	}

	public static java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByCourseId(
		long courseId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCourseSeriesByCourseId(courseId, start, end);
	}

	public static java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByLocationId(
		long locationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCourseSeriesByLocationId(locationId);
	}

	public static java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByLocationId(
		long locationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCourseSeriesByLocationId(locationId, start, end);
	}

	public static java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByLocationId(
		long locationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getCourseSeriesByLocationId(locationId, orderByComparator);
	}

	public static java.util.List<com.ocms.course.model.CourseSeries> getCourseSeriesByCourseSeriesCode(
		java.lang.String courseSeriesCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCourseSeriesByCourseSeriesCode(courseSeriesCode);
	}

	public static com.ocms.course.model.CourseSeries addCourseSeries(
		long userId, long courseId, long locationId,
		java.lang.String courseSeriesCode, java.util.Date startDate,
		java.util.Date endDate, java.lang.String type, long maxNoStudReg,
		java.lang.String publishingStatus, long seriesCount,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addCourseSeries(userId, courseId, locationId,
			courseSeriesCode, startDate, endDate, type, maxNoStudReg,
			publishingStatus, seriesCount, serviceContext);
	}

	public static com.ocms.course.model.CourseSeries updateCourse(long userId,
		long courseId, long locationId, java.util.Date startDate,
		java.util.Date endDate, java.lang.String type, long maxNoStudReg,
		java.lang.String publishingStatus,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateCourse(userId, courseId, locationId, startDate,
			endDate, type, maxNoStudReg, publishingStatus, serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static CourseSeriesLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					CourseSeriesLocalService.class.getName());

			if (invokableLocalService instanceof CourseSeriesLocalService) {
				_service = (CourseSeriesLocalService)invokableLocalService;
			}
			else {
				_service = new CourseSeriesLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(CourseSeriesLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(CourseSeriesLocalService service) {
	}

	private static CourseSeriesLocalService _service;
}