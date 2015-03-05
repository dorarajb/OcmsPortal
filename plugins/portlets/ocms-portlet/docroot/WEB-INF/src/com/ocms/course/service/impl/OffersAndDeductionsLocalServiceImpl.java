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
import com.liferay.portal.security.auth.PrincipalThreadLocal;
import com.liferay.portal.service.ServiceContext;
import com.ocms.course.OffersAndDeductionsAmountException;
import com.ocms.course.OffersAndDeductionsCodeException;
import com.ocms.course.OffersAndDeductionsEffectiveFromDateException;
import com.ocms.course.OffersAndDeductionsEffectiveToDateException;
import com.ocms.course.OffersAndDeductionsTypeException;
import com.ocms.course.model.OffersAndDeductions;
import com.ocms.course.service.base.OffersAndDeductionsLocalServiceBaseImpl;

/**
 * The implementation of the offers and deductions local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ocms.course.service.OffersAndDeductionsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author doraraj
 * @see com.ocms.course.service.base.OffersAndDeductionsLocalServiceBaseImpl
 * @see com.ocms.course.service.OffersAndDeductionsLocalServiceUtil
 */
public class OffersAndDeductionsLocalServiceImpl
	extends OffersAndDeductionsLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.ocms.course.service.OffersAndDeductionsLocalServiceUtil} to access the offers and deductions local service.
	 */
	
	public List<OffersAndDeductions> getOffersAndDeductionsByGroupId(long groupId) throws SystemException {
		return offersAndDeductionsPersistence.findByGroupId(groupId);
	}
	
	public List<OffersAndDeductions> getOffersAndDeductionsByGroupId(long groupId, int start, int end) throws SystemException {
		return offersAndDeductionsPersistence.findByGroupId(groupId, start, end);
	}
	
	public List<OffersAndDeductions> getOffersAndDeductionsByid(int id) throws SystemException {
		return offersAndDeductionsPersistence.findById(id);
	}
	
	public List<OffersAndDeductions> getOffersAndDeductionsByid(int id, int start, int end) throws SystemException {
		return offersAndDeductionsPersistence.findById(id, start, end);
	}
	
	public List<OffersAndDeductions> getOffersAndDeductionsByCode(String code) throws SystemException {
		return offersAndDeductionsPersistence.findByCode(code);
	}
	
	public List<OffersAndDeductions>  getOffersAndDeductionsByCode(String code, int start, int end) throws SystemException {
		return offersAndDeductionsPersistence.findByCode(code, start, end);
	}
	
	public List<OffersAndDeductions> getOffersAndDeductionsByActive(int active) throws SystemException {
		return offersAndDeductionsPersistence.findByActive(active);
	}
	
	public List<OffersAndDeductions> getOffersAndDeductionsByActive(int active, int start, int end) throws SystemException {
		return offersAndDeductionsPersistence.findByActive(active, start, end);
	}
	
	public List<OffersAndDeductions> getOffersAndDeductionsByType(String type) throws SystemException {
		return offersAndDeductionsPersistence.findByType(type);
	}
	
	public List<OffersAndDeductions> getOffersAndDeductionsByType(String type, int start, int end) throws SystemException {
		return offersAndDeductionsPersistence.findByType(type, start, end);
	}
	
	public List<OffersAndDeductions> getOffersAndDeductionsByGroupIdAndActive(long groupId, int active) throws SystemException {
		return offersAndDeductionsPersistence.findByGroupIdAndActive(groupId, active);
	}
	
	public List<OffersAndDeductions> getOffersAndDeductionsByGroupIdAndActive(long groupId, int active, int start, int end) throws SystemException {
		return offersAndDeductionsPersistence.findByGroupIdAndActive(groupId, active, start, end);
	}
	
	public List<OffersAndDeductions> getOffersAndDeductionsByidAndActive(long id, int active) throws SystemException {
		return offersAndDeductionsPersistence.findByIdAndActive( id, active);
	}
	
	public List<OffersAndDeductions> getOffersAndDeductionsByidAndActive(long id, int active, int start, int end) throws SystemException {
		return offersAndDeductionsPersistence.findByIdAndActive(id, active, start, end);
	}
	
	public List<OffersAndDeductions> getOffersAndDeductionsByCodeAndActive(String code, int active) throws SystemException {
		return offersAndDeductionsPersistence.findByCodeAndActive( code, active);
	}
	
	public List<OffersAndDeductions> getOffersAndDeductionsByCodeAndActive(String code, int active, int start, int end) throws SystemException {
		return offersAndDeductionsPersistence.findByCodeAndActive(code, active, start, end);
	}
	
	public List<OffersAndDeductions> getOffersAndDeductionsByGroupIdTypeActive(long groupId,String type, int active) throws SystemException {
		return offersAndDeductionsPersistence.findByGroupIdTypeActive(groupId, type, active);
	}
	
	public List<OffersAndDeductions> getOffersAndDeductionsByGroupIdTypeActive(long groupId,String type, int active, int start, int end) throws SystemException {
		return offersAndDeductionsPersistence.findByGroupIdTypeActive(groupId, type, active, start, end);
	}
	
	protected void validate( String code,String type,  Date effectiveFromDate,Date effectiveToDate, long amount) throws PortalException {
		
		if (Validator.isNull(code)) {
			throw new OffersAndDeductionsCodeException();
		}
		
		if (Validator.isNull(effectiveFromDate)) {
			throw new OffersAndDeductionsEffectiveFromDateException();
		}
		
		if (Validator.isNull(effectiveToDate)) {
			throw new OffersAndDeductionsEffectiveToDateException();
		}
		
		if (Validator.isNull(amount)) {
			throw new OffersAndDeductionsAmountException();
		}
		
		if (Validator.isNull(type)) {
			throw new OffersAndDeductionsTypeException();
		}
		
	}
	
	public OffersAndDeductions addOffersAndDeductions(String code,String type, String description,  Date effectiveFromDate,Date effectiveToDate, long amount, ServiceContext serviceContext) throws SystemException, PortalException {
		
		long userId =PrincipalThreadLocal.getUserId();
		long groupId = serviceContext.getScopeGroupId();

		User user = userPersistence.findByPrimaryKey(userId);

		Date now = new Date();

		validate(code,type, effectiveFromDate, effectiveToDate, amount);

		long id = counterLocalService.increment();

		OffersAndDeductions OffersAndDeductions = offersAndDeductionsPersistence.create(id);

		OffersAndDeductions.setUserId(userId);
		OffersAndDeductions.setGroupId(groupId);
		OffersAndDeductions.setCompanyId(user.getCompanyId());
		OffersAndDeductions.setUserName(user.getFullName());
		OffersAndDeductions.setCreateDate(serviceContext.getCreateDate(now));
		OffersAndDeductions.setModifiedDate(serviceContext.getModifiedDate(now));
		OffersAndDeductions.setCode(code);
		OffersAndDeductions.setType(type);
		OffersAndDeductions.setEffectiveFromDate(effectiveFromDate);
		OffersAndDeductions.setEffectivetoDate(effectiveToDate);
		OffersAndDeductions.setDescription(description);
		OffersAndDeductions.setAmount(amount);

		offersAndDeductionsPersistence.update(OffersAndDeductions);

		return OffersAndDeductions;
	}
	
	public OffersAndDeductions updateOffersAndDeductions(long id,String code, String type, String description,
			Date effectiveFromDate,Date effectiveToDate, long amount,
			ServiceContext serviceContext) throws SystemException, PortalException {

		long userId =PrincipalThreadLocal.getUserId();
		long groupId = serviceContext.getScopeGroupId();
		
		User user = userPersistence.findByPrimaryKey(userId);
		Date now = new Date();

		validate(code,type, effectiveFromDate, effectiveToDate, amount);

		List<OffersAndDeductions> OffersAndDeductionsList = offersAndDeductionsPersistence.findById(id);
		OffersAndDeductions OffersAndDeductions = OffersAndDeductionsList.get(0);
		
		OffersAndDeductions.setUserId(userId);
		OffersAndDeductions.setGroupId(groupId);
		OffersAndDeductions.setCompanyId(user.getCompanyId());
		OffersAndDeductions.setUserName(user.getFullName());
		OffersAndDeductions.setCreateDate(serviceContext.getCreateDate(now));
		OffersAndDeductions.setModifiedDate(serviceContext.getModifiedDate(now));
		OffersAndDeductions.setCode(code);
		OffersAndDeductions.setType(type);
		OffersAndDeductions.setEffectiveFromDate(effectiveFromDate);
		OffersAndDeductions.setEffectivetoDate(effectiveToDate);
		OffersAndDeductions.setDescription(description);
		OffersAndDeductions.setAmount(amount);

		offersAndDeductionsPersistence.update(OffersAndDeductions);

		return OffersAndDeductions;
	}
	
	public void deleteOffersAndDeductionsById(long id){
		try {
			offersAndDeductionsPersistence.removeById(id);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteOffersAndDeductionsByType(String type){
		try {
			offersAndDeductionsPersistence.removeByType(type);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteOffersAndDeductionsByGrouptId(long groupId){
		try {
			offersAndDeductionsPersistence.removeByGroupId(groupId);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteAllOffersAndDeductions(){
		try {
			offersAndDeductionsPersistence.removeAll();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}