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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for TaxDetails. This utility wraps
 * {@link com.ocms.course.service.impl.TaxDetailsServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author doraraj
 * @see TaxDetailsService
 * @see com.ocms.course.service.base.TaxDetailsServiceBaseImpl
 * @see com.ocms.course.service.impl.TaxDetailsServiceImpl
 * @generated
 */
public class TaxDetailsServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ocms.course.service.impl.TaxDetailsServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTaxDetailsByGroupId(groupId);
	}

	public static java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTaxDetailsByGroupId(groupId, start, end);
	}

	public static java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByTaxDetailsId(
		int taxDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTaxDetailsByTaxDetailsId(taxDetailsId);
	}

	public static java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByTaxDetailsId(
		int taxDetailsId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTaxDetailsByTaxDetailsId(taxDetailsId, start, end);
	}

	public static java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByTaxTypeId(
		int taxTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTaxDetailsByTaxTypeId(taxTypeId);
	}

	public static java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByTaxTypeId(
		int taxTypeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTaxDetailsByTaxTypeId(taxTypeId, start, end);
	}

	public static java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByActive(
		int taxActiveId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTaxDetailsByActive(taxActiveId);
	}

	public static java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByActive(
		int taxActiveId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTaxDetailsByActive(taxActiveId, start, end);
	}

	public static java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByGroupIdActive(
		int groupId, int taxActiveId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTaxDetailsByGroupIdActive(groupId, taxActiveId);
	}

	public static java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByGroupIdActive(
		int groupId, int taxActiveId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getTaxDetailsByGroupIdActive(groupId, taxActiveId, start,
			end);
	}

	public static java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByGroupIdTaxDetailsIdActive(
		int taxDetailsId, int taxActiveId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getTaxDetailsByGroupIdTaxDetailsIdActive(taxDetailsId,
			taxActiveId);
	}

	public static java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByGroupIdTaxDetailsIdActive(
		int taxDetailsId, int taxActiveId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getTaxDetailsByGroupIdTaxDetailsIdActive(taxDetailsId,
			taxActiveId, start, end);
	}

	public static java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByGroupIdTaxTypeIdActive(
		int taxTypeId, int taxActiveId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getTaxDetailsByGroupIdTaxTypeIdActive(taxTypeId, taxActiveId);
	}

	public static java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByGroupIdTaxTypeIdActive(
		int taxTypeId, int taxActiveId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getTaxDetailsByGroupIdTaxTypeIdActive(taxTypeId,
			taxActiveId, start, end);
	}

	public static com.ocms.course.model.TaxDetails addTaxDetails(
		long taxTypeId, java.lang.String country,
		java.util.Date effectiveFromDate, java.util.Date effectiveToDate,
		int active, int taxPercent,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addTaxDetails(taxTypeId, country, effectiveFromDate,
			effectiveToDate, active, taxPercent, serviceContext);
	}

	public static com.ocms.course.model.TaxDetails updateTaxDetails(
		long taxDetailsId, long taxTypeId, java.lang.String country,
		java.util.Date effectiveFromDate, java.util.Date effectiveToDate,
		int active, int taxPercent,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateTaxDetails(taxDetailsId, taxTypeId, country,
			effectiveFromDate, effectiveToDate, active, taxPercent,
			serviceContext);
	}

	public static void deleteTaxDetailsByTaxDetailsId(long taxDetailsId) {
		getService().deleteTaxDetailsByTaxDetailsId(taxDetailsId);
	}

	public static void deletetaxDetailsByGrouptId(long groupId) {
		getService().deletetaxDetailsByGrouptId(groupId);
	}

	public static void deleteAlltaxDetails() {
		getService().deleteAlltaxDetails();
	}

	public static void clearService() {
		_service = null;
	}

	public static TaxDetailsService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TaxDetailsService.class.getName());

			if (invokableService instanceof TaxDetailsService) {
				_service = (TaxDetailsService)invokableService;
			}
			else {
				_service = new TaxDetailsServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(TaxDetailsServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(TaxDetailsService service) {
	}

	private static TaxDetailsService _service;
}