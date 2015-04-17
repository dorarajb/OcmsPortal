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
 * Provides a wrapper for {@link TaxDetailsService}.
 *
 * @author doraraj
 * @see TaxDetailsService
 * @generated
 */
public class TaxDetailsServiceWrapper implements TaxDetailsService,
	ServiceWrapper<TaxDetailsService> {
	public TaxDetailsServiceWrapper(TaxDetailsService taxDetailsService) {
		_taxDetailsService = taxDetailsService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _taxDetailsService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_taxDetailsService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _taxDetailsService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsService.getTaxDetailsByGroupId(groupId);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsService.getTaxDetailsByGroupId(groupId, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByTaxDetailsId(
		int taxDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsService.getTaxDetailsByTaxDetailsId(taxDetailsId);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByTaxDetailsId(
		int taxDetailsId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsService.getTaxDetailsByTaxDetailsId(taxDetailsId,
			start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByTaxTypeId(
		int taxTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsService.getTaxDetailsByTaxTypeId(taxTypeId);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByTaxTypeId(
		int taxTypeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsService.getTaxDetailsByTaxTypeId(taxTypeId, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByActive(
		int taxActiveId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsService.getTaxDetailsByActive(taxActiveId);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByActive(
		int taxActiveId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsService.getTaxDetailsByActive(taxActiveId, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByGroupIdActive(
		int groupId, int taxActiveId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsService.getTaxDetailsByGroupIdActive(groupId,
			taxActiveId);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByGroupIdActive(
		int groupId, int taxActiveId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsService.getTaxDetailsByGroupIdActive(groupId,
			taxActiveId, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByGroupIdTaxDetailsIdActive(
		int taxDetailsId, int taxActiveId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsService.getTaxDetailsByGroupIdTaxDetailsIdActive(taxDetailsId,
			taxActiveId);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByGroupIdTaxDetailsIdActive(
		int taxDetailsId, int taxActiveId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsService.getTaxDetailsByGroupIdTaxDetailsIdActive(taxDetailsId,
			taxActiveId, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByGroupIdTaxTypeIdActive(
		int taxTypeId, int taxActiveId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsService.getTaxDetailsByGroupIdTaxTypeIdActive(taxTypeId,
			taxActiveId);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByGroupIdTaxTypeIdActive(
		int taxTypeId, int taxActiveId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsService.getTaxDetailsByGroupIdTaxTypeIdActive(taxTypeId,
			taxActiveId, start, end);
	}

	@Override
	public com.ocms.course.model.TaxDetails addTaxDetails(long taxTypeId,
		java.lang.String country, java.util.Date effectiveFromDate,
		java.util.Date effectiveToDate, int active, int taxPercent,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsService.addTaxDetails(taxTypeId, country,
			effectiveFromDate, effectiveToDate, active, taxPercent,
			serviceContext);
	}

	@Override
	public com.ocms.course.model.TaxDetails updateTaxDetails(
		long taxDetailsId, long taxTypeId, java.lang.String country,
		java.util.Date effectiveFromDate, java.util.Date effectiveToDate,
		int active, int taxPercent,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsService.updateTaxDetails(taxDetailsId, taxTypeId,
			country, effectiveFromDate, effectiveToDate, active, taxPercent,
			serviceContext);
	}

	@Override
	public void deleteTaxDetailsByTaxDetailsId(long taxDetailsId) {
		_taxDetailsService.deleteTaxDetailsByTaxDetailsId(taxDetailsId);
	}

	@Override
	public void deletetaxDetailsByGrouptId(long groupId) {
		_taxDetailsService.deletetaxDetailsByGrouptId(groupId);
	}

	@Override
	public void deleteAlltaxDetails() {
		_taxDetailsService.deleteAlltaxDetails();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TaxDetailsService getWrappedTaxDetailsService() {
		return _taxDetailsService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTaxDetailsService(TaxDetailsService taxDetailsService) {
		_taxDetailsService = taxDetailsService;
	}

	@Override
	public TaxDetailsService getWrappedService() {
		return _taxDetailsService;
	}

	@Override
	public void setWrappedService(TaxDetailsService taxDetailsService) {
		_taxDetailsService = taxDetailsService;
	}

	private TaxDetailsService _taxDetailsService;
}