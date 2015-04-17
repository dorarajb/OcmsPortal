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
 * Provides the local service utility for StudentRegistration. This utility wraps
 * {@link com.ocms.course.service.impl.StudentRegistrationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author doraraj
 * @see StudentRegistrationLocalService
 * @see com.ocms.course.service.base.StudentRegistrationLocalServiceBaseImpl
 * @see com.ocms.course.service.impl.StudentRegistrationLocalServiceImpl
 * @generated
 */
public class StudentRegistrationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ocms.course.service.impl.StudentRegistrationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the student registration to the database. Also notifies the appropriate model listeners.
	*
	* @param studentRegistration the student registration
	* @return the student registration that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.StudentRegistration addStudentRegistration(
		com.ocms.course.model.StudentRegistration studentRegistration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addStudentRegistration(studentRegistration);
	}

	/**
	* Creates a new student registration with the primary key. Does not add the student registration to the database.
	*
	* @param studRegId the primary key for the new student registration
	* @return the new student registration
	*/
	public static com.ocms.course.model.StudentRegistration createStudentRegistration(
		long studRegId) {
		return getService().createStudentRegistration(studRegId);
	}

	/**
	* Deletes the student registration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studRegId the primary key of the student registration
	* @return the student registration that was removed
	* @throws PortalException if a student registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.StudentRegistration deleteStudentRegistration(
		long studRegId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteStudentRegistration(studRegId);
	}

	/**
	* Deletes the student registration from the database. Also notifies the appropriate model listeners.
	*
	* @param studentRegistration the student registration
	* @return the student registration that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.StudentRegistration deleteStudentRegistration(
		com.ocms.course.model.StudentRegistration studentRegistration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteStudentRegistration(studentRegistration);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.StudentRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.StudentRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.ocms.course.model.StudentRegistration fetchStudentRegistration(
		long studRegId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchStudentRegistration(studRegId);
	}

	/**
	* Returns the student registration with the primary key.
	*
	* @param studRegId the primary key of the student registration
	* @return the student registration
	* @throws PortalException if a student registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.StudentRegistration getStudentRegistration(
		long studRegId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getStudentRegistration(studRegId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the student registrations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.StudentRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of student registrations
	* @param end the upper bound of the range of student registrations (not inclusive)
	* @return the range of student registrations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.StudentRegistration> getStudentRegistrations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getStudentRegistrations(start, end);
	}

	/**
	* Returns the number of student registrations.
	*
	* @return the number of student registrations
	* @throws SystemException if a system exception occurred
	*/
	public static int getStudentRegistrationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getStudentRegistrationsCount();
	}

	/**
	* Updates the student registration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param studentRegistration the student registration
	* @return the student registration that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.StudentRegistration updateStudentRegistration(
		com.ocms.course.model.StudentRegistration studentRegistration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateStudentRegistration(studentRegistration);
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

	public static java.util.List<com.ocms.course.model.StudentRegistration> getStudentRegistrationByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getStudentRegistrationByGroupId(groupId);
	}

	public static java.util.List<com.ocms.course.model.StudentRegistration> getStudentRegistrationByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getStudentRegistrationByGroupId(groupId, start, end);
	}

	public static java.util.List<com.ocms.course.model.StudentRegistration> getStudentRegistrationByStudentRegistrationId(
		long studentRegistrationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getStudentRegistrationByStudentRegistrationId(studentRegistrationId);
	}

	public static java.util.List<com.ocms.course.model.StudentRegistration> getStudentRegistrationByStudentRegistrationId(
		long studentRegistrationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getStudentRegistrationByStudentRegistrationId(studentRegistrationId,
			start, end);
	}

	public static com.ocms.course.model.StudentRegistration addStudentRegistration(
		long userId, long contactId, java.lang.String memo,
		java.lang.String studRegStatus, java.lang.String advisorOrig,
		java.lang.String advisorReg, long coursePackageId, long discountId,
		java.lang.String commMethod, java.lang.String notes,
		java.lang.String currency, long tax, java.lang.String autoCharge,
		java.lang.String currencyPaid, long exchangeRate,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addStudentRegistration(userId, contactId, memo,
			studRegStatus, advisorOrig, advisorReg, coursePackageId,
			discountId, commMethod, notes, currency, tax, autoCharge,
			currencyPaid, exchangeRate, serviceContext);
	}

	public static com.ocms.course.model.StudentRegistration updateStudentRegistration(
		long userId, long studentRegistrationId, long contactId,
		java.lang.String memo, java.lang.String studRegStatus,
		java.lang.String advisorOrig, java.lang.String advisorReg,
		long coursePackageId, long discountId, java.lang.String commMethod,
		java.lang.String notes, java.lang.String currency, long tax,
		java.lang.String autoCharge, java.lang.String currencyPaid,
		long exchangeRate,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateStudentRegistration(userId, studentRegistrationId,
			contactId, memo, studRegStatus, advisorOrig, advisorReg,
			coursePackageId, discountId, commMethod, notes, currency, tax,
			autoCharge, currencyPaid, exchangeRate, serviceContext);
	}

	public static void deleteStudentRegistrationByStudentRegistrationId(
		long studentRegistrationId) {
		getService()
			.deleteStudentRegistrationByStudentRegistrationId(studentRegistrationId);
	}

	public static void deleteStudentRegistrationByGrouptId(long groupId) {
		getService().deleteStudentRegistrationByGrouptId(groupId);
	}

	public static void deleteAllStudentRegistration() {
		getService().deleteAllStudentRegistration();
	}

	public static void clearService() {
		_service = null;
	}

	public static StudentRegistrationLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					StudentRegistrationLocalService.class.getName());

			if (invokableLocalService instanceof StudentRegistrationLocalService) {
				_service = (StudentRegistrationLocalService)invokableLocalService;
			}
			else {
				_service = new StudentRegistrationLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(StudentRegistrationLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(StudentRegistrationLocalService service) {
	}

	private static StudentRegistrationLocalService _service;
}