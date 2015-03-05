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
import com.ocms.course.CourseCodeException;
import com.ocms.course.CourseDurationException;
import com.ocms.course.CourseNameException;
import com.ocms.course.CurrencyException;
import com.ocms.course.DepositException;
import com.ocms.course.EffectiveDateException;
import com.ocms.course.NoSuchPricingException;
import com.ocms.course.PriceException;
import com.ocms.course.PricingCourseIdException;
import com.ocms.course.PricingLocationIdException;
import com.ocms.course.PricingPackageIdException;
import com.ocms.course.model.Course;
import com.ocms.course.model.Pricing;
import com.ocms.course.service.base.PricingLocalServiceBaseImpl;

/**
 * The implementation of the pricing local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ocms.course.service.PricingLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author dorarajb
 * @see com.ocms.course.service.base.PricingLocalServiceBaseImpl
 * @see com.ocms.course.service.PricingLocalServiceUtil
 */
public class PricingLocalServiceImpl extends PricingLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.ocms.course.service.PricingLocalServiceUtil} to access the pricing local service.
	 */
	public List<Pricing> getPricingByGroupId(long groupId) throws SystemException {
		return (List<Pricing>) pricingPersistence.findByGroupId(groupId);
	}
	
	public List<Pricing> getPricingByGroupId(long groupId, int start, int end) throws SystemException {
		return pricingPersistence.findByGroupId(groupId, start, end);
	}
	
	public List<Pricing> getPricingByCourseId(int courseId) throws SystemException {
		return pricingPersistence.findByCourseId(courseId);
	}
	
	public List<Pricing> getPricingByCourseId(int courseId, int start, int end) throws SystemException {
		return pricingPersistence.findByCourseId(courseId, start, end);
	}
	
	public List<Pricing> getPricingByPackageId(int packageId) throws SystemException {
		return pricingPersistence.findByPackageId(packageId);
	}
	
	public List<Pricing> getPricingByPackageId(int packageId, int start, int end) throws SystemException {
		return pricingPersistence.findByPackageId(packageId, start, end);
	}
	
	public List<Pricing> getPricingByPricingId(int pricingId) throws SystemException {
		return pricingPersistence.findByPricingId(pricingId);
	}
	
	public List<Pricing> getPricingByPricingId(int pricingId, int start, int end) throws SystemException {
		return pricingPersistence.findByPricingId(pricingId, start, end);
	}
	
	public List<Pricing> getPricingByPrice(int price) throws SystemException {
		return pricingPersistence.findByPrice(price);
	}
	
	public List<Pricing> getPricingByPrice(int price, int start, int end) throws SystemException {
		return pricingPersistence.findByPrice(price, start, end);
	}
	
	public List<Pricing> getPricingByPackageAndLocation(int packageId,int locationId) throws SystemException {
		return pricingPersistence.findByPackageAndLocation(packageId, locationId);
	}
	
	public List<Pricing> getPricingByPackageAndLocation(int packageId,int locationId, int start, int end) throws SystemException {
		return pricingPersistence.findByPackageAndLocation(packageId, locationId, start, end);
	}
	
	public List<Pricing> getPricingByPackageLocationActive(int packageId,int locationId,int active) throws SystemException {
		return pricingPersistence.findByPackageLocationActive(packageId, locationId, active);
	}
	
	public List<Pricing> getPricingByPackageLocationActive(int packageId,int locationId, int active, int start, int end) throws SystemException {
		return pricingPersistence.findByPackageLocationActive(packageId, locationId, active, start, end);
	}
	
	public List<Pricing> getPricingByPackageIdAndActive(int packageId, int active) throws SystemException {
		return pricingPersistence.findByPackageAndActive(packageId, active);
	}
	
	public List<Pricing> getPricingByPackageIdAndActive(int packageId,int active, int start, int end) throws SystemException {
		return pricingPersistence.findByPackageAndActive(packageId,active, start, end);
	}
	
	
	protected void validate(int deposit, int price, String currency, Date effectiveDate, int pricingLocationId, int pricingCourseId, int pricingPackageId) throws PortalException {
		if (Validator.isNull(deposit)) {
			throw new DepositException();
		}
		if (Validator.isNull(price)) {
			throw new PriceException();
		}
		if (Validator.isNull(currency)) {
			throw new CurrencyException();
		}
		if (Validator.isNull(effectiveDate)) {
			throw new EffectiveDateException();
		}
		if (Validator.isNull(pricingLocationId)) {
			throw new PricingLocationIdException();
		}
		if (Validator.isNull(pricingCourseId)) {
			throw new PricingCourseIdException();
		}
		if (Validator.isNull(pricingPackageId)) {
			throw new PricingPackageIdException();
		}
	}
	
	public Pricing addPricing(int deposit, int price, String currency, Date effectiveFromDate,Date effectiveToDate,
			int balanceDueParDate, int locationId,String locationCode, int courseId, String courseCode,  
			int packageId, ServiceContext serviceContext) throws SystemException, PortalException {
		
		long userId =PrincipalThreadLocal.getUserId();
		long groupId = serviceContext.getScopeGroupId();

		User user = userPersistence.findByPrimaryKey(userId);

		Date now = new Date();

		validate(deposit, price, currency, effectiveFromDate, locationId, courseId, packageId);

		long pricingId = counterLocalService.increment();

		Pricing pricing = pricingPersistence.create(pricingId);

		pricing.setUserId(userId);
		pricing.setGroupId(groupId);
		pricing.setCompanyId(user.getCompanyId());
		pricing.setUserName(user.getFullName());
		pricing.setCreateDate(serviceContext.getCreateDate(now));
		pricing.setModifiedDate(serviceContext.getModifiedDate(now));
		pricing.setDeposit(deposit);
		pricing.setPrice(price);
		pricing.setCurrency(currency);
		pricing.setEffectiveFromDate(effectiveFromDate);
		pricing.setEffectiveToDate(effectiveToDate);
		pricing.setBalanceDueParDate(balanceDueParDate);
		pricing.setLocationId(locationId);
		pricing.setLocationCode(locationCode);
		pricing.setCourseId(courseId);
		pricing.setCourseCode(courseCode);
		pricing.setPackageId(packageId);
		pricing.setExpandoBridgeAttributes(serviceContext);

		pricingPersistence.update(pricing);

		return pricing;
	}
	
	public Pricing updatePricing(int deposit, int price, String currency, Date effectiveFromDate,
			int balanceDueParDate, Date effectiveToDate, int locationId, String locationCode, int courseId, String courseCode,
			int packageId,long pricingId, ServiceContext serviceContext) throws SystemException, PortalException {

		long userId =PrincipalThreadLocal.getUserId();
		long groupId = serviceContext.getScopeGroupId();
		User user = userPersistence.findByPrimaryKey(userId);
		Date now = new Date();

		validate(deposit, price, currency, effectiveFromDate, locationId, courseId, packageId);

		List<Pricing> priceList = pricingPersistence.findByPricingId(pricingId);
		Pricing pricing = priceList.get(0);
		
		pricing.setUserId(userId);
		pricing.setGroupId(groupId);
		pricing.setCompanyId(user.getCompanyId());
		pricing.setUserName(user.getFullName());
		pricing.setCreateDate(serviceContext.getCreateDate(now));
		pricing.setModifiedDate(serviceContext.getModifiedDate(now));
		pricing.setDeposit(deposit);
		pricing.setPrice(price);
		pricing.setCurrency(currency);
		pricing.setEffectiveFromDate(effectiveFromDate);
		pricing.setEffectiveToDate(effectiveToDate);
		pricing.setBalanceDueParDate(balanceDueParDate);
		pricing.setLocationId(locationId);
		pricing.setLocationCode(locationCode);
		pricing.setCourseId(courseId);
		pricing.setCourseCode(courseCode);
		pricing.setPackageId(packageId);
		pricing.setExpandoBridgeAttributes(serviceContext);


		pricingPersistence.update(pricing);

		return pricing;
	}
	
	public void deletePricingByLocationId(long pricingId){
		try {
			pricingPersistence.removeByPricingId(pricingId);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deletePricingByPackageId(int packageId){
		try {
			pricingPersistence.removeByPackageId(packageId);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deletePricingByGrouptId(long groupId){
		try {
			pricingPersistence.removeByGroupId(groupId);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteAllPricing(){
		try {
			pricingPersistence.removeAll();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}