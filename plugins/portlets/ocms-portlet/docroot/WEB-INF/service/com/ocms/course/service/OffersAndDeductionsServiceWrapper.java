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
 * Provides a wrapper for {@link OffersAndDeductionsService}.
 *
 * @author doraraj
 * @see OffersAndDeductionsService
 * @generated
 */
public class OffersAndDeductionsServiceWrapper
	implements OffersAndDeductionsService,
		ServiceWrapper<OffersAndDeductionsService> {
	public OffersAndDeductionsServiceWrapper(
		OffersAndDeductionsService offersAndDeductionsService) {
		_offersAndDeductionsService = offersAndDeductionsService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _offersAndDeductionsService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_offersAndDeductionsService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _offersAndDeductionsService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsService.getOffersAndDeductionsByGroupId(groupId);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsService.getOffersAndDeductionsByGroupId(groupId,
			start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByid(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsService.getOffersAndDeductionsByid(id);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByid(
		int id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsService.getOffersAndDeductionsByid(id,
			start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsService.getOffersAndDeductionsByCode(code);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByCode(
		java.lang.String code, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsService.getOffersAndDeductionsByCode(code,
			start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByActive(
		int active) throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsService.getOffersAndDeductionsByActive(active);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByActive(
		int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsService.getOffersAndDeductionsByActive(active,
			start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByType(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsService.getOffersAndDeductionsByType(type);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByType(
		java.lang.String type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsService.getOffersAndDeductionsByType(type,
			start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByGroupIdAndActive(
		long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsService.getOffersAndDeductionsByGroupIdAndActive(groupId,
			active);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByGroupIdAndActive(
		long groupId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsService.getOffersAndDeductionsByGroupIdAndActive(groupId,
			active, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByidAndActive(
		long id, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsService.getOffersAndDeductionsByidAndActive(id,
			active);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByidAndActive(
		long id, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsService.getOffersAndDeductionsByidAndActive(id,
			active, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByCodeAndActive(
		java.lang.String code, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsService.getOffersAndDeductionsByCodeAndActive(code,
			active);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByCodeAndActive(
		java.lang.String code, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsService.getOffersAndDeductionsByCodeAndActive(code,
			active, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByGroupIdTypeActive(
		long groupId, java.lang.String type, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsService.getOffersAndDeductionsByGroupIdTypeActive(groupId,
			type, active);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByGroupIdTypeActive(
		long groupId, java.lang.String type, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsService.getOffersAndDeductionsByGroupIdTypeActive(groupId,
			type, active, start, end);
	}

	@Override
	public com.ocms.course.model.OffersAndDeductions addOffersAndDeductions(
		java.lang.String code, java.lang.String type,
		java.lang.String description, java.util.Date effectiveFromDate,
		java.util.Date effectiveToDate, long amount,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsService.addOffersAndDeductions(code, type,
			description, effectiveFromDate, effectiveToDate, amount,
			serviceContext);
	}

	@Override
	public com.ocms.course.model.OffersAndDeductions updateOffersAndDeductions(
		long id, java.lang.String code, java.lang.String type,
		java.lang.String description, java.util.Date effectiveFromDate,
		java.util.Date effectiveToDate, long amount,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsService.updateOffersAndDeductions(id, code,
			type, description, effectiveFromDate, effectiveToDate, amount,
			serviceContext);
	}

	@Override
	public void deleteOffersAndDeductionsById(long id) {
		_offersAndDeductionsService.deleteOffersAndDeductionsById(id);
	}

	@Override
	public void deleteOffersAndDeductionsByType(java.lang.String type) {
		_offersAndDeductionsService.deleteOffersAndDeductionsByType(type);
	}

	@Override
	public void deleteOffersAndDeductionsByGrouptId(long groupId) {
		_offersAndDeductionsService.deleteOffersAndDeductionsByGrouptId(groupId);
	}

	@Override
	public void deleteAllOffersAndDeductions() {
		_offersAndDeductionsService.deleteAllOffersAndDeductions();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public OffersAndDeductionsService getWrappedOffersAndDeductionsService() {
		return _offersAndDeductionsService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedOffersAndDeductionsService(
		OffersAndDeductionsService offersAndDeductionsService) {
		_offersAndDeductionsService = offersAndDeductionsService;
	}

	@Override
	public OffersAndDeductionsService getWrappedService() {
		return _offersAndDeductionsService;
	}

	@Override
	public void setWrappedService(
		OffersAndDeductionsService offersAndDeductionsService) {
		_offersAndDeductionsService = offersAndDeductionsService;
	}

	private OffersAndDeductionsService _offersAndDeductionsService;
}