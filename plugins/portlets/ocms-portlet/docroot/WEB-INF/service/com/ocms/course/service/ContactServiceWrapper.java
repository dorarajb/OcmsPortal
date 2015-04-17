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
 * Provides a wrapper for {@link ContactService}.
 *
 * @author doraraj
 * @see ContactService
 * @generated
 */
public class ContactServiceWrapper implements ContactService,
	ServiceWrapper<ContactService> {
	public ContactServiceWrapper(ContactService contactService) {
		_contactService = contactService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _contactService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_contactService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _contactService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.ocms.course.model.Contact> getContactByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contactService.getContactByGroupId(groupId);
	}

	@Override
	public java.util.List<com.ocms.course.model.Contact> getContactByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contactService.getContactByGroupId(groupId, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.Contact> getContactByContactId(
		long contactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contactService.getContactByContactId(contactId);
	}

	@Override
	public java.util.List<com.ocms.course.model.Contact> getContactByContactId(
		long contactId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contactService.getContactByContactId(contactId, start, end);
	}

	@Override
	public com.ocms.course.model.Contact addContact(
		java.lang.String contactType, java.lang.String contactName,
		java.lang.String addressLine1, java.lang.String addressLine2,
		java.lang.String city, java.lang.String state, java.lang.String region,
		java.lang.String zip, java.lang.String phone, java.lang.String fax,
		java.lang.String email,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _contactService.addContact(contactType, contactName,
			addressLine1, addressLine2, city, state, region, zip, phone, fax,
			email, serviceContext);
	}

	@Override
	public com.ocms.course.model.Contact updateContact(long contactId,
		java.lang.String contactType, java.lang.String contactName,
		java.lang.String addressLine1, java.lang.String addressLine2,
		java.lang.String city, java.lang.String state, java.lang.String region,
		java.lang.String zip, java.lang.String phone, java.lang.String fax,
		java.lang.String email,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _contactService.updateContact(contactId, contactType,
			contactName, addressLine1, addressLine2, city, state, region, zip,
			phone, fax, email, serviceContext);
	}

	@Override
	public void deleteContactByContactId(long contactId) {
		_contactService.deleteContactByContactId(contactId);
	}

	@Override
	public void deleteContactByGrouptId(long groupId) {
		_contactService.deleteContactByGrouptId(groupId);
	}

	@Override
	public void deleteAllContact() {
		_contactService.deleteAllContact();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ContactService getWrappedContactService() {
		return _contactService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedContactService(ContactService contactService) {
		_contactService = contactService;
	}

	@Override
	public ContactService getWrappedService() {
		return _contactService;
	}

	@Override
	public void setWrappedService(ContactService contactService) {
		_contactService = contactService;
	}

	private ContactService _contactService;
}