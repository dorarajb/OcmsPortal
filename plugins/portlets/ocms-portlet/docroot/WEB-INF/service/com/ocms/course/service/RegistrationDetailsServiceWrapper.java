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
 * Provides a wrapper for {@link RegistrationDetailsService}.
 *
 * @author doraraj
 * @see RegistrationDetailsService
 * @generated
 */
public class RegistrationDetailsServiceWrapper
	implements RegistrationDetailsService,
		ServiceWrapper<RegistrationDetailsService> {
	public RegistrationDetailsServiceWrapper(
		RegistrationDetailsService registrationDetailsService) {
		_registrationDetailsService = registrationDetailsService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _registrationDetailsService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_registrationDetailsService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _registrationDetailsService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<com.ocms.course.model.RegistrationDetails> getRegistrationDetailsByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationDetailsService.getRegistrationDetailsByGroupId(groupId);
	}

	@Override
	public java.util.List<com.ocms.course.model.RegistrationDetails> getRegistrationDetailsByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationDetailsService.getRegistrationDetailsByGroupId(groupId,
			start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.RegistrationDetails> getRegistrationDetailsByRegistrationDetailsId(
		long registrationDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationDetailsService.getRegistrationDetailsByRegistrationDetailsId(registrationDetailsId);
	}

	@Override
	public java.util.List<com.ocms.course.model.RegistrationDetails> getRegistrationDetailsByRegistrationDetailsId(
		long registrationDetailsId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationDetailsService.getRegistrationDetailsByRegistrationDetailsId(registrationDetailsId,
			start, end);
	}

	@Override
	public com.ocms.course.model.RegistrationDetails addRegistrationDetails(
		long userId, long studRegId, long contactId, long eventId,
		double price, double discount, double fee, double credit,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _registrationDetailsService.addRegistrationDetails(userId,
			studRegId, contactId, eventId, price, discount, fee, credit,
			serviceContext);
	}

	@Override
	public com.ocms.course.model.RegistrationDetails updateRegistrationDetails(
		long userId, long registrationDetailsId, long studRegId,
		long contactId, long eventId, double price, double discount,
		double fee, double credit,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _registrationDetailsService.updateRegistrationDetails(userId,
			registrationDetailsId, studRegId, contactId, eventId, price,
			discount, fee, credit, serviceContext);
	}

	@Override
	public void deleteRegistrationDetailsByRegistrationDetailsId(
		long registrationDetailsId) {
		_registrationDetailsService.deleteRegistrationDetailsByRegistrationDetailsId(registrationDetailsId);
	}

	@Override
	public void deleteRegistrationDetailsByGrouptId(long groupId) {
		_registrationDetailsService.deleteRegistrationDetailsByGrouptId(groupId);
	}

	@Override
	public void deleteAllRegistrationDetails() {
		_registrationDetailsService.deleteAllRegistrationDetails();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public RegistrationDetailsService getWrappedRegistrationDetailsService() {
		return _registrationDetailsService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedRegistrationDetailsService(
		RegistrationDetailsService registrationDetailsService) {
		_registrationDetailsService = registrationDetailsService;
	}

	@Override
	public RegistrationDetailsService getWrappedService() {
		return _registrationDetailsService;
	}

	@Override
	public void setWrappedService(
		RegistrationDetailsService registrationDetailsService) {
		_registrationDetailsService = registrationDetailsService;
	}

	private RegistrationDetailsService _registrationDetailsService;
}