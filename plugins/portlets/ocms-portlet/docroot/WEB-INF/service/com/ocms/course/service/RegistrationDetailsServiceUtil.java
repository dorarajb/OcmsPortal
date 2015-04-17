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
 * Provides the remote service utility for RegistrationDetails. This utility wraps
 * {@link com.ocms.course.service.impl.RegistrationDetailsServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author doraraj
 * @see RegistrationDetailsService
 * @see com.ocms.course.service.base.RegistrationDetailsServiceBaseImpl
 * @see com.ocms.course.service.impl.RegistrationDetailsServiceImpl
 * @generated
 */
public class RegistrationDetailsServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ocms.course.service.impl.RegistrationDetailsServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static java.util.List<com.ocms.course.model.RegistrationDetails> getRegistrationDetailsByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getRegistrationDetailsByGroupId(groupId);
	}

	public static java.util.List<com.ocms.course.model.RegistrationDetails> getRegistrationDetailsByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getRegistrationDetailsByGroupId(groupId, start, end);
	}

	public static java.util.List<com.ocms.course.model.RegistrationDetails> getRegistrationDetailsByRegistrationDetailsId(
		long registrationDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getRegistrationDetailsByRegistrationDetailsId(registrationDetailsId);
	}

	public static java.util.List<com.ocms.course.model.RegistrationDetails> getRegistrationDetailsByRegistrationDetailsId(
		long registrationDetailsId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getRegistrationDetailsByRegistrationDetailsId(registrationDetailsId,
			start, end);
	}

	public static com.ocms.course.model.RegistrationDetails addRegistrationDetails(
		long userId, long studRegId, long contactId, long eventId,
		double price, double discount, double fee, double credit,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addRegistrationDetails(userId, studRegId, contactId,
			eventId, price, discount, fee, credit, serviceContext);
	}

	public static com.ocms.course.model.RegistrationDetails updateRegistrationDetails(
		long userId, long registrationDetailsId, long studRegId,
		long contactId, long eventId, double price, double discount,
		double fee, double credit,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateRegistrationDetails(userId, registrationDetailsId,
			studRegId, contactId, eventId, price, discount, fee, credit,
			serviceContext);
	}

	public static void deleteRegistrationDetailsByRegistrationDetailsId(
		long registrationDetailsId) {
		getService()
			.deleteRegistrationDetailsByRegistrationDetailsId(registrationDetailsId);
	}

	public static void deleteRegistrationDetailsByGrouptId(long groupId) {
		getService().deleteRegistrationDetailsByGrouptId(groupId);
	}

	public static void deleteAllRegistrationDetails() {
		getService().deleteAllRegistrationDetails();
	}

	public static void clearService() {
		_service = null;
	}

	public static RegistrationDetailsService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					RegistrationDetailsService.class.getName());

			if (invokableService instanceof RegistrationDetailsService) {
				_service = (RegistrationDetailsService)invokableService;
			}
			else {
				_service = new RegistrationDetailsServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(RegistrationDetailsServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(RegistrationDetailsService service) {
	}

	private static RegistrationDetailsService _service;
}