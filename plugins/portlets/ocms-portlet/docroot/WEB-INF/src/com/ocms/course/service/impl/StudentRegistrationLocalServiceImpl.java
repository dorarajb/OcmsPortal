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
import com.ocms.course.StudentRegistrationAdvisorOriginalException;
import com.ocms.course.StudentRegistrationAdvisorRegistrationException;
import com.ocms.course.StudentRegistrationAutoChargeException;
import com.ocms.course.StudentRegistrationCommunicationMethodException;
import com.ocms.course.StudentRegistrationCurrencyException;
import com.ocms.course.StudentRegistrationCurrencyPaidException;
import com.ocms.course.StudentRegistrationExchangeRateException;
import com.ocms.course.StudentRegistrationMemoException;
import com.ocms.course.StudentRegistrationNotesException;
import com.ocms.course.StudentRegistrationStatusException;
import com.ocms.course.StudentRegistrationTaxException;
import com.ocms.course.model.StudentRegistration;
import com.ocms.course.service.base.StudentRegistrationLocalServiceBaseImpl;

/**
 * The implementation of the student registration local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ocms.course.service.StudentRegistrationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author doraraj
 * @see com.ocms.course.service.base.StudentRegistrationLocalServiceBaseImpl
 * @see com.ocms.course.service.StudentRegistrationLocalServiceUtil
 */
public class StudentRegistrationLocalServiceImpl
	extends StudentRegistrationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.ocms.course.service.StudentRegistrationLocalServiceUtil} to access the student registration local service.
	 */
	public List<StudentRegistration> getStudentRegistrationByGroupId(long groupId) throws SystemException {
		return studentRegistrationPersistence.findByGroupId(groupId);
	}
	
	public List<StudentRegistration> getStudentRegistrationByGroupId(long groupId, int start, int end) throws SystemException {
		return studentRegistrationPersistence.findByGroupId(groupId, start, end);
	}
	
	public List<StudentRegistration> getStudentRegistrationByStudentRegistrationId(long studentRegistrationId) throws SystemException {
		return studentRegistrationPersistence.findByStudRegId(studentRegistrationId);
	}
	
	public List<StudentRegistration> getStudentRegistrationByStudentRegistrationId(long studentRegistrationId, int start, int end) throws SystemException {
		return studentRegistrationPersistence.findByStudRegId(studentRegistrationId, start, end);
	}
	
	protected void validate(String memo, String studRegStatus, String advisorOrig, String advisorReg, long coursePackageId, long discountId, String commMethod, String notes,
	String currency, long tax, String autoCharge, String currencyPaid, long exchangeRate) throws PortalException {
		if (Validator.isNull(memo)) {
			throw new StudentRegistrationMemoException();
		}
		if (Validator.isNull(studRegStatus)) {
			throw new StudentRegistrationStatusException();
		}
		if (Validator.isNull(advisorOrig)) {
			throw new StudentRegistrationAdvisorOriginalException();
		}
		if (Validator.isNull(advisorReg)) {
			throw new StudentRegistrationAdvisorRegistrationException();
		}
		if (Validator.isNull(commMethod)) {
			throw new StudentRegistrationCommunicationMethodException();
		}
		if (Validator.isNull(notes)) {
			throw new StudentRegistrationNotesException();
		}
		if (Validator.isNull(currency)) {
			throw new StudentRegistrationCurrencyException();
		}
		if (Validator.isNull(tax)) {
			throw new StudentRegistrationTaxException();
		}
		if (Validator.isNull(autoCharge)) {
			throw new StudentRegistrationAutoChargeException();
		}
		if (Validator.isNull(currencyPaid)) {
			throw new StudentRegistrationCurrencyPaidException();
		}
		if (Validator.isNull(exchangeRate)) {
			throw new StudentRegistrationExchangeRateException();
		}
	}
	
	public StudentRegistration addStudentRegistration(long userId, long contactId, String memo, String studRegStatus, String advisorOrig, String advisorReg, long coursePackageId, long discountId, String commMethod, String notes,
			String currency, long tax, String autoCharge, String currencyPaid, long exchangeRate, ServiceContext serviceContext) throws SystemException, PortalException {
		long groupId = serviceContext.getScopeGroupId();

		User user = userPersistence.findByPrimaryKey(userId);

		Date now = new Date();

		validate(memo, studRegStatus, advisorOrig, advisorReg, coursePackageId, discountId, commMethod, notes,
				currency, tax, autoCharge, currencyPaid, exchangeRate);

		long studentRegistrationId = counterLocalService.increment();

		StudentRegistration studentRegistration = studentRegistrationPersistence.create(studentRegistrationId);

		studentRegistration.setUserId(userId);
		studentRegistration.setGroupId(groupId);
		studentRegistration.setCompanyId(user.getCompanyId());
		studentRegistration.setUserName(user.getFullName());
		studentRegistration.setCreateDate(serviceContext.getCreateDate(now));
		studentRegistration.setModifiedDate(serviceContext.getModifiedDate(now));

		studentRegistration.setContactId(contactId);
		studentRegistration.setMemo(memo);
	    studentRegistration.setStudRegStatus(studRegStatus);
	    studentRegistration.setAdvisorOrig(advisorOrig);
	    studentRegistration.setAdvisorReg(advisorReg);
	    studentRegistration.setCoursePackageId(coursePackageId);
	    studentRegistration.setDiscountId(discountId);
	    studentRegistration.setCommMethod(commMethod);
	    studentRegistration.setNotes(notes);
	    studentRegistration.setCurrency(currency);
	    studentRegistration.setTax(tax);
	    studentRegistration.setAutoCharge(autoCharge);
	    studentRegistration.setCurrencyPaid(currencyPaid);
	    studentRegistration.setExchangeRate(exchangeRate);
	    
		studentRegistration.setExpandoBridgeAttributes(serviceContext);

		studentRegistrationPersistence.update(studentRegistration);

		return studentRegistration;
	}
	
	public StudentRegistration updateStudentRegistration(long userId, long studentRegistrationId, long contactId, String memo, String studRegStatus, String advisorOrig, String advisorReg, long coursePackageId, long discountId, String commMethod, String notes,
			String currency, long tax, String autoCharge, String currencyPaid, long exchangeRate, ServiceContext serviceContext) throws SystemException, PortalException {

		long groupId = serviceContext.getScopeGroupId();
		User user = userPersistence.findByPrimaryKey(userId);
		Date now = new Date();

		validate(memo, studRegStatus, advisorOrig, advisorReg, coursePackageId, discountId, commMethod, notes,
				currency, tax, autoCharge, currencyPaid, exchangeRate);

		List<StudentRegistration> studentRegistrationList = studentRegistrationPersistence.findByStudRegId(studentRegistrationId);
		StudentRegistration studentRegistration = studentRegistrationList.get(0);
		
		studentRegistration.setUserId(userId);
		studentRegistration.setGroupId(groupId);
		studentRegistration.setCompanyId(user.getCompanyId());
		studentRegistration.setUserName(user.getFullName());
		studentRegistration.setCreateDate(serviceContext.getCreateDate(now));
		studentRegistration.setModifiedDate(serviceContext.getModifiedDate(now));

		studentRegistration.setContactId(contactId);
		studentRegistration.setMemo(memo);
	    studentRegistration.setStudRegStatus(studRegStatus);
	    studentRegistration.setAdvisorOrig(advisorOrig);
	    studentRegistration.setAdvisorReg(advisorReg);
	    studentRegistration.setCoursePackageId(coursePackageId);
	    studentRegistration.setDiscountId(discountId);
	    studentRegistration.setCommMethod(commMethod);
	    studentRegistration.setNotes(notes);
	    studentRegistration.setCurrency(currency);
	    studentRegistration.setTax(tax);
	    studentRegistration.setAutoCharge(autoCharge);
	    studentRegistration.setCurrencyPaid(currencyPaid);
	    studentRegistration.setExchangeRate(exchangeRate);
		
		studentRegistration.setExpandoBridgeAttributes(serviceContext);

		studentRegistrationPersistence.update(studentRegistration);

		return studentRegistration;
	}
	
	public void deleteStudentRegistrationByStudentRegistrationId(long studentRegistrationId){
		try {
			studentRegistrationPersistence.removeByStudRegId(studentRegistrationId);
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteStudentRegistrationByGrouptId(long groupId){
		try {
			studentRegistrationPersistence.removeByGroupId(groupId);
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteAllStudentRegistration(){
		try {
			studentRegistrationPersistence.removeAll();
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}

}