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
 * Provides a wrapper for {@link ContactLocalService}.
 *
 * @author doraraj
 * @see ContactLocalService
 * @generated
 */
public class ContactLocalServiceWrapper implements ContactLocalService,
	ServiceWrapper<ContactLocalService> {
	public ContactLocalServiceWrapper(ContactLocalService contactLocalService) {
		_contactLocalService = contactLocalService;
	}

	/**
	* Adds the contact to the database. Also notifies the appropriate model listeners.
	*
	* @param contact the contact
	* @return the contact that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.Contact addContact(
		com.ocms.course.model.Contact contact)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contactLocalService.addContact(contact);
	}

	/**
	* Creates a new contact with the primary key. Does not add the contact to the database.
	*
	* @param contactId the primary key for the new contact
	* @return the new contact
	*/
	@Override
	public com.ocms.course.model.Contact createContact(long contactId) {
		return _contactLocalService.createContact(contactId);
	}

	/**
	* Deletes the contact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param contactId the primary key of the contact
	* @return the contact that was removed
	* @throws PortalException if a contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.Contact deleteContact(long contactId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _contactLocalService.deleteContact(contactId);
	}

	/**
	* Deletes the contact from the database. Also notifies the appropriate model listeners.
	*
	* @param contact the contact
	* @return the contact that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.Contact deleteContact(
		com.ocms.course.model.Contact contact)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contactLocalService.deleteContact(contact);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _contactLocalService.dynamicQuery();
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
		return _contactLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _contactLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _contactLocalService.dynamicQuery(dynamicQuery, start, end,
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
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contactLocalService.dynamicQueryCount(dynamicQuery);
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
		return _contactLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.ocms.course.model.Contact fetchContact(long contactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contactLocalService.fetchContact(contactId);
	}

	/**
	* Returns the contact with the primary key.
	*
	* @param contactId the primary key of the contact
	* @return the contact
	* @throws PortalException if a contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.Contact getContact(long contactId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _contactLocalService.getContact(contactId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _contactLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.ContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contacts
	* @param end the upper bound of the range of contacts (not inclusive)
	* @return the range of contacts
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ocms.course.model.Contact> getContacts(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contactLocalService.getContacts(start, end);
	}

	/**
	* Returns the number of contacts.
	*
	* @return the number of contacts
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getContactsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contactLocalService.getContactsCount();
	}

	/**
	* Updates the contact in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param contact the contact
	* @return the contact that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.Contact updateContact(
		com.ocms.course.model.Contact contact)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contactLocalService.updateContact(contact);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _contactLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_contactLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _contactLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.ocms.course.model.Contact> getContactByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contactLocalService.getContactByGroupId(groupId);
	}

	@Override
	public java.util.List<com.ocms.course.model.Contact> getContactByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contactLocalService.getContactByGroupId(groupId, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.Contact> getContactByContactId(
		long contactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contactLocalService.getContactByContactId(contactId);
	}

	@Override
	public java.util.List<com.ocms.course.model.Contact> getContactByContactId(
		long contactId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _contactLocalService.getContactByContactId(contactId, start, end);
	}

	@Override
	public com.ocms.course.model.Contact addContact(long userId,
		java.lang.String contactType, java.lang.String contactName,
		java.lang.String addressLine1, java.lang.String addressLine2,
		java.lang.String city, java.lang.String state, java.lang.String region,
		java.lang.String zip, java.lang.String phone, java.lang.String fax,
		java.lang.String email,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _contactLocalService.addContact(userId, contactType,
			contactName, addressLine1, addressLine2, city, state, region, zip,
			phone, fax, email, serviceContext);
	}

	@Override
	public com.ocms.course.model.Contact updateContact(long userId,
		long contactId, java.lang.String contactType,
		java.lang.String contactName, java.lang.String addressLine1,
		java.lang.String addressLine2, java.lang.String city,
		java.lang.String state, java.lang.String region, java.lang.String zip,
		java.lang.String phone, java.lang.String fax, java.lang.String email,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _contactLocalService.updateContact(userId, contactId,
			contactType, contactName, addressLine1, addressLine2, city, state,
			region, zip, phone, fax, email, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ContactLocalService getWrappedContactLocalService() {
		return _contactLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedContactLocalService(
		ContactLocalService contactLocalService) {
		_contactLocalService = contactLocalService;
	}

	@Override
	public ContactLocalService getWrappedService() {
		return _contactLocalService;
	}

	@Override
	public void setWrappedService(ContactLocalService contactLocalService) {
		_contactLocalService = contactLocalService;
	}

	private ContactLocalService _contactLocalService;
}