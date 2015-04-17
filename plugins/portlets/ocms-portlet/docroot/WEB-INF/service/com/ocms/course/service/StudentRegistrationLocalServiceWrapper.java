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
 * Provides a wrapper for {@link StudentRegistrationLocalService}.
 *
 * @author doraraj
 * @see StudentRegistrationLocalService
 * @generated
 */
public class StudentRegistrationLocalServiceWrapper
	implements StudentRegistrationLocalService,
		ServiceWrapper<StudentRegistrationLocalService> {
	public StudentRegistrationLocalServiceWrapper(
		StudentRegistrationLocalService studentRegistrationLocalService) {
		_studentRegistrationLocalService = studentRegistrationLocalService;
	}

	/**
	* Adds the student registration to the database. Also notifies the appropriate model listeners.
	*
	* @param studentRegistration the student registration
	* @return the student registration that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.StudentRegistration addStudentRegistration(
		com.ocms.course.model.StudentRegistration studentRegistration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentRegistrationLocalService.addStudentRegistration(studentRegistration);
	}

	/**
	* Creates a new student registration with the primary key. Does not add the student registration to the database.
	*
	* @param studRegId the primary key for the new student registration
	* @return the new student registration
	*/
	@Override
	public com.ocms.course.model.StudentRegistration createStudentRegistration(
		long studRegId) {
		return _studentRegistrationLocalService.createStudentRegistration(studRegId);
	}

	/**
	* Deletes the student registration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studRegId the primary key of the student registration
	* @return the student registration that was removed
	* @throws PortalException if a student registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.StudentRegistration deleteStudentRegistration(
		long studRegId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _studentRegistrationLocalService.deleteStudentRegistration(studRegId);
	}

	/**
	* Deletes the student registration from the database. Also notifies the appropriate model listeners.
	*
	* @param studentRegistration the student registration
	* @return the student registration that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.StudentRegistration deleteStudentRegistration(
		com.ocms.course.model.StudentRegistration studentRegistration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentRegistrationLocalService.deleteStudentRegistration(studentRegistration);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _studentRegistrationLocalService.dynamicQuery();
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
		return _studentRegistrationLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _studentRegistrationLocalService.dynamicQuery(dynamicQuery,
			start, end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentRegistrationLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _studentRegistrationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _studentRegistrationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ocms.course.model.StudentRegistration fetchStudentRegistration(
		long studRegId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentRegistrationLocalService.fetchStudentRegistration(studRegId);
	}

	/**
	* Returns the student registration with the primary key.
	*
	* @param studRegId the primary key of the student registration
	* @return the student registration
	* @throws PortalException if a student registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.StudentRegistration getStudentRegistration(
		long studRegId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _studentRegistrationLocalService.getStudentRegistration(studRegId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _studentRegistrationLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.ocms.course.model.StudentRegistration> getStudentRegistrations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentRegistrationLocalService.getStudentRegistrations(start,
			end);
	}

	/**
	* Returns the number of student registrations.
	*
	* @return the number of student registrations
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getStudentRegistrationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentRegistrationLocalService.getStudentRegistrationsCount();
	}

	/**
	* Updates the student registration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param studentRegistration the student registration
	* @return the student registration that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.StudentRegistration updateStudentRegistration(
		com.ocms.course.model.StudentRegistration studentRegistration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentRegistrationLocalService.updateStudentRegistration(studentRegistration);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _studentRegistrationLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_studentRegistrationLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _studentRegistrationLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.ocms.course.model.StudentRegistration> getStudentRegistrationByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentRegistrationLocalService.getStudentRegistrationByGroupId(groupId);
	}

	@Override
	public java.util.List<com.ocms.course.model.StudentRegistration> getStudentRegistrationByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentRegistrationLocalService.getStudentRegistrationByGroupId(groupId,
			start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.StudentRegistration> getStudentRegistrationByStudentRegistrationId(
		long studentRegistrationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentRegistrationLocalService.getStudentRegistrationByStudentRegistrationId(studentRegistrationId);
	}

	@Override
	public java.util.List<com.ocms.course.model.StudentRegistration> getStudentRegistrationByStudentRegistrationId(
		long studentRegistrationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentRegistrationLocalService.getStudentRegistrationByStudentRegistrationId(studentRegistrationId,
			start, end);
	}

	@Override
	public com.ocms.course.model.StudentRegistration addStudentRegistration(
		long userId, long contactId, java.lang.String memo,
		java.lang.String studRegStatus, java.lang.String advisorOrig,
		java.lang.String advisorReg, long coursePackageId, long discountId,
		java.lang.String commMethod, java.lang.String notes,
		java.lang.String currency, long tax, java.lang.String autoCharge,
		java.lang.String currencyPaid, long exchangeRate,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _studentRegistrationLocalService.addStudentRegistration(userId,
			contactId, memo, studRegStatus, advisorOrig, advisorReg,
			coursePackageId, discountId, commMethod, notes, currency, tax,
			autoCharge, currencyPaid, exchangeRate, serviceContext);
	}

	@Override
	public com.ocms.course.model.StudentRegistration updateStudentRegistration(
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
		return _studentRegistrationLocalService.updateStudentRegistration(userId,
			studentRegistrationId, contactId, memo, studRegStatus, advisorOrig,
			advisorReg, coursePackageId, discountId, commMethod, notes,
			currency, tax, autoCharge, currencyPaid, exchangeRate,
			serviceContext);
	}

	@Override
	public void deleteStudentRegistrationByStudentRegistrationId(
		long studentRegistrationId) {
		_studentRegistrationLocalService.deleteStudentRegistrationByStudentRegistrationId(studentRegistrationId);
	}

	@Override
	public void deleteStudentRegistrationByGrouptId(long groupId) {
		_studentRegistrationLocalService.deleteStudentRegistrationByGrouptId(groupId);
	}

	@Override
	public void deleteAllStudentRegistration() {
		_studentRegistrationLocalService.deleteAllStudentRegistration();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public StudentRegistrationLocalService getWrappedStudentRegistrationLocalService() {
		return _studentRegistrationLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedStudentRegistrationLocalService(
		StudentRegistrationLocalService studentRegistrationLocalService) {
		_studentRegistrationLocalService = studentRegistrationLocalService;
	}

	@Override
	public StudentRegistrationLocalService getWrappedService() {
		return _studentRegistrationLocalService;
	}

	@Override
	public void setWrappedService(
		StudentRegistrationLocalService studentRegistrationLocalService) {
		_studentRegistrationLocalService = studentRegistrationLocalService;
	}

	private StudentRegistrationLocalService _studentRegistrationLocalService;
}