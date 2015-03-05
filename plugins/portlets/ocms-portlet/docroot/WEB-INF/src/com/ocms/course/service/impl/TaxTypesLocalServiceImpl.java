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
import com.ocms.course.TaxTypeNameException;
import com.ocms.course.model.TaxTypes;
import com.ocms.course.service.base.TaxTypesLocalServiceBaseImpl;

/**
 * The implementation of the tax types local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ocms.course.service.TaxTypesLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author doraraj
 * @see com.ocms.course.service.base.TaxTypesLocalServiceBaseImpl
 * @see com.ocms.course.service.TaxTypesLocalServiceUtil
 */
public class TaxTypesLocalServiceImpl extends TaxTypesLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.ocms.course.service.TaxTypesLocalServiceUtil} to access the tax types local service.
	 */
	public List<TaxTypes> getTaxTypesByGroupId(long groupId) throws SystemException {
		return taxTypesPersistence.findByGroupId(groupId);
	}
	
	public List<TaxTypes> getTaxTypesByGroupId(long groupId, int start, int end) throws SystemException {
		return taxTypesPersistence.findByGroupId(groupId, start, end);
	}
	
	public List<TaxTypes> getTaxTypesByTaxTypesId(int taxTypesId) throws SystemException {
		return taxTypesPersistence.findByTaxTypeId(taxTypesId);
	}
	
	public List<TaxTypes> getPricingByTaxTypesId(int taxTypesId, int start, int end) throws SystemException {
		return taxTypesPersistence.findByTaxTypeId(taxTypesId, start, end);
	}
	
	protected void validate(String taxName) throws PortalException {
		if (Validator.isNull(taxName)) {
			throw new TaxTypeNameException();
		}
	}
	
	public TaxTypes addTaxType(String taxTypeName, ServiceContext serviceContext) throws SystemException, PortalException {
		
		long userId =PrincipalThreadLocal.getUserId();
		long groupId = serviceContext.getScopeGroupId();

		User user = userPersistence.findByPrimaryKey(userId);

		Date now = new Date();

		validate(taxTypeName);

		long taxTypesId = counterLocalService.increment();

		TaxTypes taxTypes = taxTypesPersistence.create(taxTypesId);

		taxTypes.setUserId(userId);
		taxTypes.setGroupId(groupId);
		taxTypes.setCompanyId(user.getCompanyId());
		taxTypes.setUserName(user.getFullName());
		taxTypes.setCreateDate(serviceContext.getCreateDate(now));
		taxTypes.setModifiedDate(serviceContext.getModifiedDate(now));
		taxTypes.setTaxName(taxTypeName);
		taxTypes.setExpandoBridgeAttributes(serviceContext);

		taxTypesPersistence.update(taxTypes);

		return taxTypes;
	}
	
	public TaxTypes updateTaxTypes(long taxTypesId,String taxTypeName, ServiceContext serviceContext) throws SystemException, PortalException {

		long userId =PrincipalThreadLocal.getUserId();
		long groupId = serviceContext.getScopeGroupId();
		
		User user = userPersistence.findByPrimaryKey(userId);
		Date now = new Date();

		validate(taxTypeName);

		List<TaxTypes> taxTypesList = taxTypesPersistence.findByTaxTypeId(taxTypesId);
		TaxTypes taxTypes = taxTypesList.get(0);
		
		taxTypes.setUserId(userId);
		taxTypes.setGroupId(groupId);
		taxTypes.setCompanyId(user.getCompanyId());
		taxTypes.setUserName(user.getFullName());
		taxTypes.setCreateDate(serviceContext.getCreateDate(now));
		taxTypes.setModifiedDate(serviceContext.getModifiedDate(now));
		taxTypes.setTaxName(taxTypeName);
		taxTypes.setExpandoBridgeAttributes(serviceContext);


		taxTypesPersistence.update(taxTypes);

		return taxTypes;
	}
	
	public void deleteTaxTypesByTaxTypesId(long taxTypesId){
		try {
			taxTypesPersistence.removeByTaxTypeId(taxTypesId);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteTaxTypesByGrouptId(long groupId){
		try {
			taxTypesPersistence.removeByGroupId(groupId);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteAllTaxTypes(){
		try {
			taxTypesPersistence.removeAll();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}