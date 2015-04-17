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
 * Provides the remote service utility for Pricing. This utility wraps
 * {@link com.ocms.course.service.impl.PricingServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author doraraj
 * @see PricingService
 * @see com.ocms.course.service.base.PricingServiceBaseImpl
 * @see com.ocms.course.service.impl.PricingServiceImpl
 * @generated
 */
public class PricingServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ocms.course.service.impl.PricingServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static java.util.List<com.ocms.course.model.Pricing> getPricingByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPricingByGroupId(groupId);
	}

	public static java.util.List<com.ocms.course.model.Pricing> getPricingByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPricingByGroupId(groupId, start, end);
	}

	public static java.util.List<com.ocms.course.model.Pricing> getPricingByCourseId(
		int courseId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPricingByCourseId(courseId);
	}

	public static java.util.List<com.ocms.course.model.Pricing> getPricingByCourseId(
		int courseId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPricingByCourseId(courseId, start, end);
	}

	public static java.util.List<com.ocms.course.model.Pricing> getPricingByPackageId(
		int packageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPricingByPackageId(packageId);
	}

	public static java.util.List<com.ocms.course.model.Pricing> getPricingByPackageId(
		int packageId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPricingByPackageId(packageId, start, end);
	}

	public static java.util.List<com.ocms.course.model.Pricing> getPricingByPricingId(
		int pricingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPricingByPricingId(pricingId);
	}

	public static java.util.List<com.ocms.course.model.Pricing> getPricingByPricingId(
		int pricingId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPricingByPricingId(pricingId, start, end);
	}

	public static java.util.List<com.ocms.course.model.Pricing> getPricingByPrice(
		int price) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPricingByPrice(price);
	}

	public static java.util.List<com.ocms.course.model.Pricing> getPricingByPrice(
		int price, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPricingByPrice(price, start, end);
	}

	public static java.util.List<com.ocms.course.model.Pricing> getPricingByPackageAndLocation(
		int packageId, int locationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPricingByPackageAndLocation(packageId, locationId);
	}

	public static java.util.List<com.ocms.course.model.Pricing> getPricingByPackageAndLocation(
		int packageId, int locationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getPricingByPackageAndLocation(packageId, locationId,
			start, end);
	}

	public static java.util.List<com.ocms.course.model.Pricing> getPricingByPackageLocationActive(
		int packageId, int locationId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getPricingByPackageLocationActive(packageId, locationId,
			active);
	}

	public static java.util.List<com.ocms.course.model.Pricing> getPricingByPackageLocationActive(
		int packageId, int locationId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getPricingByPackageLocationActive(packageId, locationId,
			active, start, end);
	}

	public static java.util.List<com.ocms.course.model.Pricing> getPricingByPackageIdAndActive(
		int packageId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPricingByPackageIdAndActive(packageId, active);
	}

	public static java.util.List<com.ocms.course.model.Pricing> getPricingByPackageIdAndActive(
		int packageId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getPricingByPackageIdAndActive(packageId, active, start, end);
	}

	public static com.ocms.course.model.Pricing addPricing(int deposit,
		int price, java.lang.String currency, java.util.Date effectiveFromDate,
		java.util.Date effectiveToDate, int balanceDueParDate, int locationId,
		java.lang.String locationCode, int courseId,
		java.lang.String courseCode, int packageId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addPricing(deposit, price, currency, effectiveFromDate,
			effectiveToDate, balanceDueParDate, locationId, locationCode,
			courseId, courseCode, packageId, serviceContext);
	}

	public static com.ocms.course.model.Pricing updatePricing(int deposit,
		int price, java.lang.String currency, java.util.Date effectiveFromDate,
		java.util.Date effectiveToDate, int balanceDueParDate, int locationId,
		java.lang.String locationCode, int courseId,
		java.lang.String courseCode, int packageId, long pricingId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updatePricing(deposit, price, currency, effectiveFromDate,
			effectiveToDate, balanceDueParDate, locationId, locationCode,
			courseId, courseCode, packageId, pricingId, serviceContext);
	}

	public static void deletePricingByLocationId(long pricingId) {
		getService().deletePricingByLocationId(pricingId);
	}

	public static void deletePricingByPackageId(int packageId) {
		getService().deletePricingByPackageId(packageId);
	}

	public static void deletePricingByGrouptId(long groupId) {
		getService().deletePricingByGrouptId(groupId);
	}

	public static void deleteAllPricing() {
		getService().deleteAllPricing();
	}

	public static void clearService() {
		_service = null;
	}

	public static PricingService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					PricingService.class.getName());

			if (invokableService instanceof PricingService) {
				_service = (PricingService)invokableService;
			}
			else {
				_service = new PricingServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(PricingServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(PricingService service) {
	}

	private static PricingService _service;
}