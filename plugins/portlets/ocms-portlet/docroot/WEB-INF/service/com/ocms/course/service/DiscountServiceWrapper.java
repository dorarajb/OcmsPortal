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
 * Provides a wrapper for {@link DiscountService}.
 *
 * @author doraraj
 * @see DiscountService
 * @generated
 */
public class DiscountServiceWrapper implements DiscountService,
	ServiceWrapper<DiscountService> {
	public DiscountServiceWrapper(DiscountService discountService) {
		_discountService = discountService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _discountService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_discountService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _discountService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.ocms.course.model.Discount> getDiscountByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountService.getDiscountByGroupId(groupId);
	}

	@Override
	public java.util.List<com.ocms.course.model.Discount> getDiscountByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountService.getDiscountByGroupId(groupId, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.Discount> getDiscountByDiscountId(
		int discountId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountService.getDiscountByDiscountId(discountId);
	}

	@Override
	public java.util.List<com.ocms.course.model.Discount> getDiscountByDiscountId(
		int discountId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountService.getDiscountByDiscountId(discountId, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.Discount> getDiscountByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountService.getDiscountByCode(code);
	}

	@Override
	public java.util.List<com.ocms.course.model.Discount> getDiscountByCode(
		java.lang.String code, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountService.getDiscountByCode(code, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.Discount> getDiscountByActive(
		int active) throws com.liferay.portal.kernel.exception.SystemException {
		return _discountService.getDiscountByActive(active);
	}

	@Override
	public java.util.List<com.ocms.course.model.Discount> getDiscountByActive(
		int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountService.getDiscountByActive(active, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.Discount> getDiscountByGroupIdAndActive(
		long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountService.getDiscountByGroupIdAndActive(groupId, active);
	}

	@Override
	public java.util.List<com.ocms.course.model.Discount> getDiscountByGroupIdAndActive(
		long groupId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountService.getDiscountByGroupIdAndActive(groupId, active,
			start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.Discount> getDiscountByDiscountIdAndActive(
		long discountId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountService.getDiscountByDiscountIdAndActive(discountId,
			active);
	}

	@Override
	public java.util.List<com.ocms.course.model.Discount> getDiscountByDiscountIdAndActive(
		long discountId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountService.getDiscountByDiscountIdAndActive(discountId,
			active, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.Discount> getDiscountByCodeAndActive(
		java.lang.String code, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountService.getDiscountByCodeAndActive(code, active);
	}

	@Override
	public java.util.List<com.ocms.course.model.Discount> getDiscountByCodeAndActive(
		java.lang.String code, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountService.getDiscountByCodeAndActive(code, active, start,
			end);
	}

	@Override
	public com.ocms.course.model.Discount addDiscount(java.lang.String code,
		java.lang.String description, java.util.Date effectiveFromDate,
		java.util.Date effectiveToDate, long amount,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _discountService.addDiscount(code, description,
			effectiveFromDate, effectiveToDate, amount, serviceContext);
	}

	@Override
	public com.ocms.course.model.Discount updateDiscount(long discountId,
		java.lang.String code, java.lang.String description,
		java.util.Date effectiveFromDate, java.util.Date effectiveToDate,
		long amount, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _discountService.updateDiscount(discountId, code, description,
			effectiveFromDate, effectiveToDate, amount, serviceContext);
	}

	@Override
	public void deleteDiscountByDiscountId(long discountId) {
		_discountService.deleteDiscountByDiscountId(discountId);
	}

	@Override
	public void deleteDiscountByGrouptId(long groupId) {
		_discountService.deleteDiscountByGrouptId(groupId);
	}

	@Override
	public void deleteAllDiscount() {
		_discountService.deleteAllDiscount();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DiscountService getWrappedDiscountService() {
		return _discountService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDiscountService(DiscountService discountService) {
		_discountService = discountService;
	}

	@Override
	public DiscountService getWrappedService() {
		return _discountService;
	}

	@Override
	public void setWrappedService(DiscountService discountService) {
		_discountService = discountService;
	}

	private DiscountService _discountService;
}