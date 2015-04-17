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
 * Provides a wrapper for {@link StudentRegistrationService}.
 *
 * @author doraraj
 * @see StudentRegistrationService
 * @generated
 */
public class StudentRegistrationServiceWrapper
	implements StudentRegistrationService,
		ServiceWrapper<StudentRegistrationService> {
	public StudentRegistrationServiceWrapper(
		StudentRegistrationService studentRegistrationService) {
		_studentRegistrationService = studentRegistrationService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _studentRegistrationService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_studentRegistrationService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _studentRegistrationService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<com.ocms.course.model.StudentRegistration> getStudentRegistrationByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentRegistrationService.getStudentRegistrationByGroupId(groupId);
	}

	@Override
	public java.util.List<com.ocms.course.model.StudentRegistration> getStudentRegistrationByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentRegistrationService.getStudentRegistrationByGroupId(groupId,
			start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.StudentRegistration> getStudentRegistrationByStudentRegistrationId(
		long studentRegistrationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentRegistrationService.getStudentRegistrationByStudentRegistrationId(studentRegistrationId);
	}

	@Override
	public java.util.List<com.ocms.course.model.StudentRegistration> getStudentRegistrationByStudentRegistrationId(
		long studentRegistrationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _studentRegistrationService.getStudentRegistrationByStudentRegistrationId(studentRegistrationId,
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
		return _studentRegistrationService.addStudentRegistration(userId,
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
		return _studentRegistrationService.updateStudentRegistration(userId,
			studentRegistrationId, contactId, memo, studRegStatus, advisorOrig,
			advisorReg, coursePackageId, discountId, commMethod, notes,
			currency, tax, autoCharge, currencyPaid, exchangeRate,
			serviceContext);
	}

	@Override
	public void deleteStudentRegistrationByStudentRegistrationId(
		long studentRegistrationId) {
		_studentRegistrationService.deleteStudentRegistrationByStudentRegistrationId(studentRegistrationId);
	}

	@Override
	public void deleteStudentRegistrationByGrouptId(long groupId) {
		_studentRegistrationService.deleteStudentRegistrationByGrouptId(groupId);
	}

	@Override
	public void deleteAllStudentRegistration() {
		_studentRegistrationService.deleteAllStudentRegistration();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public StudentRegistrationService getWrappedStudentRegistrationService() {
		return _studentRegistrationService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedStudentRegistrationService(
		StudentRegistrationService studentRegistrationService) {
		_studentRegistrationService = studentRegistrationService;
	}

	@Override
	public StudentRegistrationService getWrappedService() {
		return _studentRegistrationService;
	}

	@Override
	public void setWrappedService(
		StudentRegistrationService studentRegistrationService) {
		_studentRegistrationService = studentRegistrationService;
	}

	private StudentRegistrationService _studentRegistrationService;
}