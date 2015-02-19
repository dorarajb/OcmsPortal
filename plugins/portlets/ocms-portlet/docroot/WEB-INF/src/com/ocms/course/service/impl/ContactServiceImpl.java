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

package com.ocms.course.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.security.auth.PrincipalThreadLocal;
import com.liferay.portal.service.ServiceContext;
import com.ocms.course.ContactAddressLine1Exception;
import com.ocms.course.ContactAddressLine2Exception;
import com.ocms.course.ContactCityException;
import com.ocms.course.ContactEmailException;
import com.ocms.course.ContactFaxException;
import com.ocms.course.ContactNameException;
import com.ocms.course.ContactPhoneException;
import com.ocms.course.ContactRegionException;
import com.ocms.course.ContactStateException;
import com.ocms.course.ContactTypeException;
import com.ocms.course.ContactZipException;
import com.ocms.course.model.Contact;
import com.ocms.course.service.base.ContactServiceBaseImpl;

/**
 * The implementation of the contact remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ocms.course.service.ContactService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author doraraj
 * @see com.ocms.course.service.base.ContactServiceBaseImpl
 * @see com.ocms.course.service.ContactServiceUtil
 */
@AccessControlled(guestAccessEnabled=true)
@JSONWebService("contact")
public class ContactServiceImpl extends ContactServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.ocms.course.service.ContactServiceUtil} to access the contact remote service.
	 */
	public List<Contact> getContactByGroupId(long groupId) throws SystemException {
		return contactPersistence.findByGroupId(groupId);
	}
	
	public List<Contact> getContactByGroupId(long groupId, int start, int end) throws SystemException {
		return contactPersistence.findByGroupId(groupId, start, end);
	}
	
	public List<Contact> getContactByContactId(long contactId) throws SystemException {
		return contactPersistence.findByContactId(contactId);
	}
	
	public List<Contact> getContactByContactId(long contactId, int start, int end) throws SystemException {
		return contactPersistence.findByContactId(contactId, start, end);
	}
	
	protected void validate(String contactType, String contactName, String addressLine1, String addressLine2, String city, String state, String region, String zip,
			String phone, String fax, String email) throws PortalException {
		if (Validator.isNull(contactType)) {
			throw new ContactTypeException();
		}
		if (Validator.isNull(contactName)) {
			throw new ContactNameException();
		}
		if (Validator.isNull(addressLine1)) {
			throw new ContactAddressLine1Exception();
		}
		if (Validator.isNull(addressLine2)) {
			throw new ContactAddressLine2Exception();
		}
		if (Validator.isNull(city)) {
			throw new ContactCityException();
		}
		if (Validator.isNull(state)) {
			throw new ContactStateException();
		}
		if (Validator.isNull(region)) {
			throw new ContactRegionException();
		}
		if (Validator.isNull(zip)) {
			throw new ContactZipException();
		}
		if (Validator.isNull(phone)) {
			throw new ContactPhoneException();
		}
		if (Validator.isNull(fax)) {
			throw new ContactFaxException();
		}
		if (Validator.isNull(email)) {
			throw new ContactEmailException();
		}
	}
	
	public Contact addContact(String contactType, String contactName, String addressLine1, String addressLine2, String city, String state, String region, String zip,
			String phone, String fax, String email, ServiceContext serviceContext) throws SystemException, PortalException {
		
		long userId =PrincipalThreadLocal.getUserId();
		long groupId = serviceContext.getScopeGroupId();

		User user = userPersistence.findByPrimaryKey(userId);

		Date now = new Date();

		validate(contactType, contactName, addressLine1, addressLine2, city, state, region, zip, phone, fax, email);

		long contactId = counterLocalService.increment();

		Contact contact = contactPersistence.create(contactId);

		contact.setUserId(userId);
		contact.setGroupId(groupId);
		contact.setCompanyId(user.getCompanyId());
		contact.setUserName(user.getFullName());
		contact.setCreateDate(serviceContext.getCreateDate(now));
		contact.setModifiedDate(serviceContext.getModifiedDate(now));
		contact.setContactType(contactType);
		contact.setContactName(contactName);
		contact.setAddressLine1(addressLine1);
		contact.setAddressLine2(addressLine2);
		contact.setCity(city);
		contact.setState(state);
		contact.setRegion(region);
		contact.setZip(zip);
		contact.setPhone(phone);
		contact.setFax(fax);
		contact.setEmail(email);
		contact.setExpandoBridgeAttributes(serviceContext);

		contactPersistence.update(contact);

		return contact;
	}
	
	public Contact updateContact(long contactId, String contactType, String contactName, String addressLine1, String addressLine2, String city, String state, String region, String zip,
			String phone, String fax, String email, ServiceContext serviceContext) throws SystemException, PortalException {

		long userId =PrincipalThreadLocal.getUserId();
		long groupId = serviceContext.getScopeGroupId();
		User user = userPersistence.findByPrimaryKey(userId);
		Date now = new Date();

		validate(contactType, contactName, addressLine1, addressLine2, city, state, region, zip, phone, fax, email);

		List<Contact> contactList = contactPersistence.findByContactId(contactId);
		Contact contact = contactList.get(0);
		
		contact.setUserId(userId);
		contact.setGroupId(groupId);
		contact.setCompanyId(user.getCompanyId());
		contact.setUserName(user.getFullName());
		contact.setCreateDate(serviceContext.getCreateDate(now));
		contact.setModifiedDate(serviceContext.getModifiedDate(now));
		contact.setContactType(contactType);
		contact.setContactName(contactName);
		contact.setAddressLine1(addressLine1);
		contact.setAddressLine2(addressLine2);
		contact.setCity(city);
		contact.setState(state);
		contact.setRegion(region);
		contact.setZip(zip);
		contact.setPhone(phone);
		contact.setFax(fax);
		contact.setEmail(email);
		contact.setExpandoBridgeAttributes(serviceContext);

		contactPersistence.update(contact);

		return contact;
	}
	
	public void deleteContactByContactId(long contactId){
		try {
			contactPersistence.removeByContactId(contactId);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteContactByGrouptId(long groupId){
		try {
			contactPersistence.removeByGroupId(groupId);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteAllContact(){
		try {
			contactPersistence.removeAll();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}