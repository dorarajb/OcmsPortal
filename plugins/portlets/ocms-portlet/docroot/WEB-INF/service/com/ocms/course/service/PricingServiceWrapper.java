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
 * Provides a wrapper for {@link PricingService}.
 *
 * @author doraraj
 * @see PricingService
 * @generated
 */
public class PricingServiceWrapper implements PricingService,
	ServiceWrapper<PricingService> {
	public PricingServiceWrapper(PricingService pricingService) {
		_pricingService = pricingService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _pricingService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_pricingService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _pricingService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pricingService.getPricingByGroupId(groupId);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pricingService.getPricingByGroupId(groupId, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByCourseId(
		int courseId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pricingService.getPricingByCourseId(courseId);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByCourseId(
		int courseId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pricingService.getPricingByCourseId(courseId, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByPackageId(
		int packageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pricingService.getPricingByPackageId(packageId);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByPackageId(
		int packageId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pricingService.getPricingByPackageId(packageId, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByPricingId(
		int pricingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pricingService.getPricingByPricingId(pricingId);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByPricingId(
		int pricingId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pricingService.getPricingByPricingId(pricingId, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByPrice(
		int price) throws com.liferay.portal.kernel.exception.SystemException {
		return _pricingService.getPricingByPrice(price);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByPrice(
		int price, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pricingService.getPricingByPrice(price, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByPackageAndLocation(
		int packageId, int locationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pricingService.getPricingByPackageAndLocation(packageId,
			locationId);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByPackageAndLocation(
		int packageId, int locationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pricingService.getPricingByPackageAndLocation(packageId,
			locationId, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByPackageLocationActive(
		int packageId, int locationId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pricingService.getPricingByPackageLocationActive(packageId,
			locationId, active);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByPackageLocationActive(
		int packageId, int locationId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pricingService.getPricingByPackageLocationActive(packageId,
			locationId, active, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByPackageIdAndActive(
		int packageId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pricingService.getPricingByPackageIdAndActive(packageId, active);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByPackageIdAndActive(
		int packageId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pricingService.getPricingByPackageIdAndActive(packageId,
			active, start, end);
	}

	@Override
	public com.ocms.course.model.Pricing addPricing(int deposit, int price,
		java.lang.String currency, java.util.Date effectiveFromDate,
		java.util.Date effectiveToDate, int balanceDueParDate, int locationId,
		java.lang.String locationCode, int courseId,
		java.lang.String courseCode, int packageId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _pricingService.addPricing(deposit, price, currency,
			effectiveFromDate, effectiveToDate, balanceDueParDate, locationId,
			locationCode, courseId, courseCode, packageId, serviceContext);
	}

	@Override
	public com.ocms.course.model.Pricing updatePricing(int deposit, int price,
		java.lang.String currency, java.util.Date effectiveFromDate,
		java.util.Date effectiveToDate, int balanceDueParDate, int locationId,
		java.lang.String locationCode, int courseId,
		java.lang.String courseCode, int packageId, long pricingId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _pricingService.updatePricing(deposit, price, currency,
			effectiveFromDate, effectiveToDate, balanceDueParDate, locationId,
			locationCode, courseId, courseCode, packageId, pricingId,
			serviceContext);
	}

	@Override
	public void deletePricingByLocationId(long pricingId) {
		_pricingService.deletePricingByLocationId(pricingId);
	}

	@Override
	public void deletePricingByPackageId(int packageId) {
		_pricingService.deletePricingByPackageId(packageId);
	}

	@Override
	public void deletePricingByGrouptId(long groupId) {
		_pricingService.deletePricingByGrouptId(groupId);
	}

	@Override
	public void deleteAllPricing() {
		_pricingService.deleteAllPricing();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PricingService getWrappedPricingService() {
		return _pricingService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPricingService(PricingService pricingService) {
		_pricingService = pricingService;
	}

	@Override
	public PricingService getWrappedService() {
		return _pricingService;
	}

	@Override
	public void setWrappedService(PricingService pricingService) {
		_pricingService = pricingService;
	}

	private PricingService _pricingService;
}