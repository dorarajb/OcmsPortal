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
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for StudentRegistration. This utility wraps
 * {@link com.ocms.course.service.impl.StudentRegistrationServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author doraraj
 * @see StudentRegistrationService
 * @see com.ocms.course.service.base.StudentRegistrationServiceBaseImpl
 * @see com.ocms.course.service.impl.StudentRegistrationServiceImpl
 * @generated
 */
public class StudentRegistrationServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ocms.course.service.impl.StudentRegistrationServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

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

	public static StudentRegistrationService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					StudentRegistrationService.class.getName());

			if (invokableService instanceof StudentRegistrationService) {
				_service = (StudentRegistrationService)invokableService;
			}
			else {
				_service = new StudentRegistrationServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(StudentRegistrationServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(StudentRegistrationService service) {
	}

	private static StudentRegistrationService _service;
}