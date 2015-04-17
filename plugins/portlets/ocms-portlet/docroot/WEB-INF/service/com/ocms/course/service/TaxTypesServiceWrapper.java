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
 * Provides a wrapper for {@link TaxTypesService}.
 *
 * @author doraraj
 * @see TaxTypesService
 * @generated
 */
public class TaxTypesServiceWrapper implements TaxTypesService,
	ServiceWrapper<TaxTypesService> {
	public TaxTypesServiceWrapper(TaxTypesService taxTypesService) {
		_taxTypesService = taxTypesService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _taxTypesService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_taxTypesService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _taxTypesService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxTypes> getTaxTypesByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxTypesService.getTaxTypesByGroupId(groupId);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxTypes> getTaxTypesByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxTypesService.getTaxTypesByGroupId(groupId, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxTypes> getTaxTypesByTaxTypesId(
		int taxTypesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxTypesService.getTaxTypesByTaxTypesId(taxTypesId);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxTypes> getPricingByTaxTypesId(
		int taxTypesId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxTypesService.getPricingByTaxTypesId(taxTypesId, start, end);
	}

	@Override
	public com.ocms.course.model.TaxTypes addTaxType(
		java.lang.String taxTypeName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _taxTypesService.addTaxType(taxTypeName, serviceContext);
	}

	@Override
	public com.ocms.course.model.TaxTypes updateTaxTypes(long taxTypesId,
		java.lang.String taxTypeName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _taxTypesService.updateTaxTypes(taxTypesId, taxTypeName,
			serviceContext);
	}

	@Override
	public void deleteTaxTypesByTaxTypesId(long taxTypesId) {
		_taxTypesService.deleteTaxTypesByTaxTypesId(taxTypesId);
	}

	@Override
	public void deleteTaxTypesByGrouptId(long groupId) {
		_taxTypesService.deleteTaxTypesByGrouptId(groupId);
	}

	@Override
	public void deleteAllTaxTypes() {
		_taxTypesService.deleteAllTaxTypes();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TaxTypesService getWrappedTaxTypesService() {
		return _taxTypesService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTaxTypesService(TaxTypesService taxTypesService) {
		_taxTypesService = taxTypesService;
	}

	@Override
	public TaxTypesService getWrappedService() {
		return _taxTypesService;
	}

	@Override
	public void setWrappedService(TaxTypesService taxTypesService) {
		_taxTypesService = taxTypesService;
	}

	private TaxTypesService _taxTypesService;
}