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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.ocms.course.RegistrationDetailsCreditException;
import com.ocms.course.RegistrationDetailsDiscountException;
import com.ocms.course.RegistrationDetailsFeeException;
import com.ocms.course.RegistrationDetailsPriceException;
import com.ocms.course.model.RegistrationDetails;
import com.ocms.course.service.base.RegistrationDetailsLocalServiceBaseImpl;

/**
 * The implementation of the registration details local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ocms.course.service.RegistrationDetailsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author doraraj
 * @see com.ocms.course.service.base.RegistrationDetailsLocalServiceBaseImpl
 * @see com.ocms.course.service.RegistrationDetailsLocalServiceUtil
 */
public class RegistrationDetailsLocalServiceImpl
	extends RegistrationDetailsLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.ocms.course.service.RegistrationDetailsLocalServiceUtil} to access the registration details local service.
	 */
	
	public List<RegistrationDetails> getRegistrationDetailsByGroupId(long groupId) throws SystemException {
		return registrationDetailsPersistence.findByGroupId(groupId);
	}
	
	public List<RegistrationDetails> getRegistrationDetailsByGroupId(long groupId, int start, int end) throws SystemException {
		return registrationDetailsPersistence.findByGroupId(groupId, start, end);
	}
	
	public List<RegistrationDetails> getRegistrationDetailsByRegistrationDetailsId(long registrationDetailsId) throws SystemException {
		return registrationDetailsPersistence.findByRegistrationDetailsId(registrationDetailsId);
	}
	
	public List<RegistrationDetails> getRegistrationDetailsByRegistrationDetailsId(long registrationDetailsId, int start, int end) throws SystemException {
		return registrationDetailsPersistence.findByRegistrationDetailsId(registrationDetailsId, start, end);
	}
	
	protected void validate(double price, double discount, double fee, double credit) throws PortalException {
		if (Validator.isNull(price)) {
			throw new RegistrationDetailsPriceException();
		}
		if (Validator.isNull(discount)) {
			throw new RegistrationDetailsDiscountException();
		}
		if (Validator.isNull(fee)) {
			throw new RegistrationDetailsFeeException();
		}
		if (Validator.isNull(credit)) {
			throw new RegistrationDetailsCreditException();
		}
	}
	
	public RegistrationDetails addRegistrationDetails(long userId,
			long studRegId, long contactId, long eventId, double price,
			double discount, double fee, double credit,
			ServiceContext serviceContext) throws SystemException,
			PortalException {
		long groupId = serviceContext.getScopeGroupId();

		User user = userPersistence.findByPrimaryKey(userId);

		Date now = new Date();

		validate(price, discount, fee, credit);

		long registrationDetailsId = counterLocalService.increment();

		RegistrationDetails registrationDetails = registrationDetailsPersistence.create(registrationDetailsId);

		registrationDetails.setUserId(userId);
		registrationDetails.setGroupId(groupId);
		registrationDetails.setCompanyId(user.getCompanyId());
		registrationDetails.setUserName(user.getFullName());
		registrationDetails.setCreateDate(serviceContext.getCreateDate(now));
		registrationDetails.setModifiedDate(serviceContext.getModifiedDate(now));

		registrationDetails.setRegistrationDetailsId(registrationDetailsId);
		registrationDetails.setStudRegId(studRegId);
		registrationDetails.setContactId(contactId);
		registrationDetails.setEventId(eventId);
		registrationDetails.setPrice(price);
		registrationDetails.setDiscount(discount);
		registrationDetails.setFee(fee);
		registrationDetails.setCredit(credit);
	    
		registrationDetails.setExpandoBridgeAttributes(serviceContext);

		registrationDetailsPersistence.update(registrationDetails);

		return registrationDetails;
	}
	
	public RegistrationDetails updateRegistrationDetails(long userId,
			long registrationDetailsId, long studRegId, long contactId,
			long eventId, double price, double discount, double fee,
			double credit, ServiceContext serviceContext)
			throws SystemException, PortalException {

		long groupId = serviceContext.getScopeGroupId();
		User user = userPersistence.findByPrimaryKey(userId);
		Date now = new Date();

		validate(price, discount, fee, credit);

		List<RegistrationDetails> registrationDetailsList = registrationDetailsPersistence.findByRegistrationDetailsId(registrationDetailsId);
		RegistrationDetails registrationDetails = registrationDetailsList.get(0);
		
		registrationDetails.setUserId(userId);
		registrationDetails.setGroupId(groupId);
		registrationDetails.setCompanyId(user.getCompanyId());
		registrationDetails.setUserName(user.getFullName());
		registrationDetails.setCreateDate(serviceContext.getCreateDate(now));
		registrationDetails.setModifiedDate(serviceContext.getModifiedDate(now));

		registrationDetails.setRegistrationDetailsId(registrationDetailsId);
		registrationDetails.setStudRegId(studRegId);
		registrationDetails.setContactId(contactId);
		registrationDetails.setEventId(eventId);
		registrationDetails.setPrice(price);
		registrationDetails.setDiscount(discount);
		registrationDetails.setFee(fee);
		registrationDetails.setCredit(credit);
		
		registrationDetails.setExpandoBridgeAttributes(serviceContext);

		registrationDetailsPersistence.update(registrationDetails);

		return registrationDetails;
	}
	
	public void deleteRegistrationDetailsByRegistrationDetailsId(long registrationDetailsId){
		try {
			registrationDetailsPersistence.removeByRegistrationDetailsId(registrationDetailsId);
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteRegistrationDetailsByGrouptId(long groupId){
		try {
			registrationDetailsPersistence.removeByGroupId(groupId);
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteAllRegistrationDetails(){
		try {
			registrationDetailsPersistence.removeAll();
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}
}