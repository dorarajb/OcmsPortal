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
import com.ocms.course.CountryException;
import com.ocms.course.TaxDetailsTaxTypeIdException;
import com.ocms.course.TaxEffectiveFromDateException;
import com.ocms.course.TaxEffectiveToDateException;
import com.ocms.course.TaxPercentException;
import com.ocms.course.model.TaxDetails;
import com.ocms.course.service.base.TaxDetailsServiceBaseImpl;

/**
 * The implementation of the tax details remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ocms.course.service.TaxDetailsService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author doraraj
 * @see com.ocms.course.service.base.TaxDetailsServiceBaseImpl
 * @see com.ocms.course.service.TaxDetailsServiceUtil
 */

@AccessControlled(guestAccessEnabled=true)
@JSONWebService("taxDetails")
public class TaxDetailsServiceImpl extends TaxDetailsServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.ocms.course.service.TaxDetailsServiceUtil} to access the tax details remote service.
	 */
	public List<TaxDetails> getTaxDetailsByGroupId(long groupId) throws SystemException {
		return taxDetailsPersistence.findByGroupId(groupId);
	}
	
	public List<TaxDetails> getTaxDetailsByGroupId(long groupId, int start, int end) throws SystemException {
		return taxDetailsPersistence.findByGroupId(groupId, start, end);
	}
	
	public List<TaxDetails> getTaxDetailsByTaxDetailsId(int taxDetailsId) throws SystemException {
		return taxDetailsPersistence.findByTaxTypeId(taxDetailsId);
	}
	
	public List<TaxDetails> getTaxDetailsByTaxDetailsId(int taxDetailsId, int start, int end) throws SystemException {
		return taxDetailsPersistence.findByTaxTypeId(taxDetailsId, start, end);
	}
	
	public List<TaxDetails> getTaxDetailsByTaxTypeId(int taxTypeId) throws SystemException {
		return taxDetailsPersistence.findByTaxTypeId(taxTypeId);
	}
	
	public List<TaxDetails> getTaxDetailsByTaxTypeId(int taxTypeId, int start, int end) throws SystemException {
		return taxDetailsPersistence.findByTaxTypeId(taxTypeId, start, end);
	}
	
	public List<TaxDetails> getTaxDetailsByActive(int taxActiveId) throws SystemException {
		return taxDetailsPersistence.findByActive(taxActiveId);
	}
	
	public List<TaxDetails> getTaxDetailsByActive(int taxActiveId, int start, int end) throws SystemException {
		return taxDetailsPersistence.findByActive(taxActiveId, start, end);
	}
	
	public List<TaxDetails> getTaxDetailsByGroupIdActive(int groupId,int taxActiveId) throws SystemException {
		return taxDetailsPersistence.findByGroupIdActive(groupId,taxActiveId);
	}
	
	public List<TaxDetails> getTaxDetailsByGroupIdActive(int groupId,int taxActiveId, int start, int end) throws SystemException {
		return taxDetailsPersistence.findByGroupIdActive(groupId,taxActiveId, start, end);
	}
	
	public List<TaxDetails> getTaxDetailsByGroupIdTaxDetailsIdActive(int taxDetailsId,int taxActiveId) throws SystemException {
		return taxDetailsPersistence.findByTaxDetailsIdActive(taxDetailsId,taxActiveId);
	}
	
	public List<TaxDetails> getTaxDetailsByGroupIdTaxDetailsIdActive(int taxDetailsId,int taxActiveId , int start, int end) throws SystemException {
		return taxDetailsPersistence.findByTaxDetailsIdActive(taxDetailsId,taxActiveId, start, end);
	}
	
	public List<TaxDetails> getTaxDetailsByGroupIdTaxTypeIdActive(int taxTypeId,int taxActiveId) throws SystemException {
		return taxDetailsPersistence.findByTaxTypeIdActive(taxTypeId,taxActiveId);
	}
	
	public List<TaxDetails> getTaxDetailsByGroupIdTaxTypeIdActive(int taxTypeId,int taxActiveId , int start, int end) throws SystemException {
		return taxDetailsPersistence.findByTaxTypeIdActive(taxTypeId,taxActiveId, start, end);
	}
	
	protected void validate(long taxTypeId, String country,  Date effectiveFromDate,Date effectiveToDate, int taxPercent) throws PortalException {
		
		if (Validator.isNull(taxTypeId)) {
			throw new TaxDetailsTaxTypeIdException();
		}
		
		if (Validator.isNull(country)) {
			throw new CountryException();
		}
		
		if (Validator.isNull(effectiveFromDate)) {
			throw new TaxEffectiveFromDateException();
		}
		
		if (Validator.isNull(effectiveToDate)) {
			throw new TaxEffectiveToDateException();
		}
		
		if (Validator.isNull(taxPercent)) {
			throw new TaxPercentException();
		}
		
	}
	
	public TaxDetails addTaxDetails(long taxTypeId, String country,  Date effectiveFromDate,Date effectiveToDate,
			int active, int taxPercent, ServiceContext serviceContext) throws SystemException, PortalException {
		
		long userId =PrincipalThreadLocal.getUserId();
		long groupId = serviceContext.getScopeGroupId();

		User user = userPersistence.findByPrimaryKey(userId);

		Date now = new Date();

		validate(taxTypeId, country, effectiveFromDate,effectiveToDate,taxPercent);

		long taxDetailsId = counterLocalService.increment();

		TaxDetails taxDetails = taxDetailsPersistence.create(taxDetailsId);

		taxDetails.setUserId(userId);
		taxDetails.setGroupId(groupId);
		taxDetails.setCompanyId(user.getCompanyId());
		taxDetails.setUserName(user.getFullName());
		taxDetails.setCreateDate(serviceContext.getCreateDate(now));
		taxDetails.setModifiedDate(serviceContext.getModifiedDate(now));
		taxDetails.setTaxTypeId(taxTypeId);
		taxDetails.setCountry(country);
		taxDetails.setEffectiveFromDate(effectiveFromDate);
		taxDetails.setEffectiveToDate(effectiveToDate);
		taxDetails.setActive(active);
		taxDetails.setTaxPercent(taxPercent);
		taxDetails.setExpandoBridgeAttributes(serviceContext);

		taxDetailsPersistence.update(taxDetails);

		return taxDetails;
	}
	
	public TaxDetails updateTaxDetails(long taxDetailsId,long taxTypeId, String country,  Date effectiveFromDate,Date effectiveToDate,
			int active, int taxPercent, ServiceContext serviceContext) throws SystemException, PortalException {

		long userId =PrincipalThreadLocal.getUserId();
		long groupId = serviceContext.getScopeGroupId();
		
		User user = userPersistence.findByPrimaryKey(userId);
		Date now = new Date();

		validate(taxTypeId, country, effectiveFromDate,effectiveToDate,taxPercent);

		List<TaxDetails> taxDetailsList = taxDetailsPersistence.findByTaxDetailsId(taxDetailsId);
		TaxDetails taxDetails = taxDetailsList.get(0);
		
		taxDetails.setUserId(userId);
		taxDetails.setGroupId(groupId);
		taxDetails.setCompanyId(user.getCompanyId());
		taxDetails.setUserName(user.getFullName());
		taxDetails.setCreateDate(serviceContext.getCreateDate(now));
		taxDetails.setModifiedDate(serviceContext.getModifiedDate(now));
		taxDetails.setTaxTypeId(taxTypeId);
		taxDetails.setCountry(country);
		taxDetails.setEffectiveFromDate(effectiveFromDate);
		taxDetails.setEffectiveToDate(effectiveToDate);
		taxDetails.setActive(active);
		taxDetails.setTaxPercent(taxPercent);
		taxDetails.setExpandoBridgeAttributes(serviceContext);

		taxDetailsPersistence.update(taxDetails);

		return taxDetails;
	}
	
	public void deleteTaxDetailsByTaxDetailsId(long taxDetailsId){
		try {
			taxDetailsPersistence.removeByTaxTypeId(taxDetailsId);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deletetaxDetailsByGrouptId(long groupId){
		try {
			taxDetailsPersistence.removeByGroupId(groupId);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteAlltaxDetails(){
		try {
			taxDetailsPersistence.removeAll();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}