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
 * Provides the remote service utility for Discount. This utility wraps
 * {@link com.ocms.course.service.impl.DiscountServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author doraraj
 * @see DiscountService
 * @see com.ocms.course.service.base.DiscountServiceBaseImpl
 * @see com.ocms.course.service.impl.DiscountServiceImpl
 * @generated
 */
public class DiscountServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ocms.course.service.impl.DiscountServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static java.util.List<com.ocms.course.model.Discount> getDiscountByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDiscountByGroupId(groupId);
	}

	public static java.util.List<com.ocms.course.model.Discount> getDiscountByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDiscountByGroupId(groupId, start, end);
	}

	public static java.util.List<com.ocms.course.model.Discount> getDiscountByDiscountId(
		int discountId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDiscountByDiscountId(discountId);
	}

	public static java.util.List<com.ocms.course.model.Discount> getDiscountByDiscountId(
		int discountId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDiscountByDiscountId(discountId, start, end);
	}

	public static java.util.List<com.ocms.course.model.Discount> getDiscountByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDiscountByCode(code);
	}

	public static java.util.List<com.ocms.course.model.Discount> getDiscountByCode(
		java.lang.String code, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDiscountByCode(code, start, end);
	}

	public static java.util.List<com.ocms.course.model.Discount> getDiscountByActive(
		int active) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDiscountByActive(active);
	}

	public static java.util.List<com.ocms.course.model.Discount> getDiscountByActive(
		int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDiscountByActive(active, start, end);
	}

	public static java.util.List<com.ocms.course.model.Discount> getDiscountByGroupIdAndActive(
		long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDiscountByGroupIdAndActive(groupId, active);
	}

	public static java.util.List<com.ocms.course.model.Discount> getDiscountByGroupIdAndActive(
		long groupId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getDiscountByGroupIdAndActive(groupId, active, start, end);
	}

	public static java.util.List<com.ocms.course.model.Discount> getDiscountByDiscountIdAndActive(
		long discountId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDiscountByDiscountIdAndActive(discountId, active);
	}

	public static java.util.List<com.ocms.course.model.Discount> getDiscountByDiscountIdAndActive(
		long discountId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getDiscountByDiscountIdAndActive(discountId, active, start,
			end);
	}

	public static java.util.List<com.ocms.course.model.Discount> getDiscountByCodeAndActive(
		java.lang.String code, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDiscountByCodeAndActive(code, active);
	}

	public static java.util.List<com.ocms.course.model.Discount> getDiscountByCodeAndActive(
		java.lang.String code, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDiscountByCodeAndActive(code, active, start, end);
	}

	public static com.ocms.course.model.Discount addDiscount(
		java.lang.String code, java.lang.String description,
		java.util.Date effectiveFromDate, java.util.Date effectiveToDate,
		long amount, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDiscount(code, description, effectiveFromDate,
			effectiveToDate, amount, serviceContext);
	}

	public static com.ocms.course.model.Discount updateDiscount(
		long discountId, java.lang.String code, java.lang.String description,
		java.util.Date effectiveFromDate, java.util.Date effectiveToDate,
		long amount, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateDiscount(discountId, code, description,
			effectiveFromDate, effectiveToDate, amount, serviceContext);
	}

	public static void deleteDiscountByDiscountId(long discountId) {
		getService().deleteDiscountByDiscountId(discountId);
	}

	public static void deleteDiscountByGrouptId(long groupId) {
		getService().deleteDiscountByGrouptId(groupId);
	}

	public static void deleteAllDiscount() {
		getService().deleteAllDiscount();
	}

	public static void clearService() {
		_service = null;
	}

	public static DiscountService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DiscountService.class.getName());

			if (invokableService instanceof DiscountService) {
				_service = (DiscountService)invokableService;
			}
			else {
				_service = new DiscountServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(DiscountServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DiscountService service) {
	}

	private static DiscountService _service;
}