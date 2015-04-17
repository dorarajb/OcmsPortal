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
 * Provides the remote service utility for OffersAndDeductions. This utility wraps
 * {@link com.ocms.course.service.impl.OffersAndDeductionsServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author doraraj
 * @see OffersAndDeductionsService
 * @see com.ocms.course.service.base.OffersAndDeductionsServiceBaseImpl
 * @see com.ocms.course.service.impl.OffersAndDeductionsServiceImpl
 * @generated
 */
public class OffersAndDeductionsServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ocms.course.service.impl.OffersAndDeductionsServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOffersAndDeductionsByGroupId(groupId);
	}

	public static java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOffersAndDeductionsByGroupId(groupId, start, end);
	}

	public static java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByid(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOffersAndDeductionsByid(id);
	}

	public static java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByid(
		int id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOffersAndDeductionsByid(id, start, end);
	}

	public static java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOffersAndDeductionsByCode(code);
	}

	public static java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByCode(
		java.lang.String code, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOffersAndDeductionsByCode(code, start, end);
	}

	public static java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByActive(
		int active) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOffersAndDeductionsByActive(active);
	}

	public static java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByActive(
		int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOffersAndDeductionsByActive(active, start, end);
	}

	public static java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByType(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOffersAndDeductionsByType(type);
	}

	public static java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByType(
		java.lang.String type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOffersAndDeductionsByType(type, start, end);
	}

	public static java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByGroupIdAndActive(
		long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getOffersAndDeductionsByGroupIdAndActive(groupId, active);
	}

	public static java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByGroupIdAndActive(
		long groupId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getOffersAndDeductionsByGroupIdAndActive(groupId, active,
			start, end);
	}

	public static java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByidAndActive(
		long id, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOffersAndDeductionsByidAndActive(id, active);
	}

	public static java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByidAndActive(
		long id, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getOffersAndDeductionsByidAndActive(id, active, start, end);
	}

	public static java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByCodeAndActive(
		java.lang.String code, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOffersAndDeductionsByCodeAndActive(code, active);
	}

	public static java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByCodeAndActive(
		java.lang.String code, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getOffersAndDeductionsByCodeAndActive(code, active, start,
			end);
	}

	public static java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByGroupIdTypeActive(
		long groupId, java.lang.String type, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getOffersAndDeductionsByGroupIdTypeActive(groupId, type,
			active);
	}

	public static java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByGroupIdTypeActive(
		long groupId, java.lang.String type, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getOffersAndDeductionsByGroupIdTypeActive(groupId, type,
			active, start, end);
	}

	public static com.ocms.course.model.OffersAndDeductions addOffersAndDeductions(
		java.lang.String code, java.lang.String type,
		java.lang.String description, java.util.Date effectiveFromDate,
		java.util.Date effectiveToDate, long amount,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addOffersAndDeductions(code, type, description,
			effectiveFromDate, effectiveToDate, amount, serviceContext);
	}

	public static com.ocms.course.model.OffersAndDeductions updateOffersAndDeductions(
		long id, java.lang.String code, java.lang.String type,
		java.lang.String description, java.util.Date effectiveFromDate,
		java.util.Date effectiveToDate, long amount,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateOffersAndDeductions(id, code, type, description,
			effectiveFromDate, effectiveToDate, amount, serviceContext);
	}

	public static void deleteOffersAndDeductionsById(long id) {
		getService().deleteOffersAndDeductionsById(id);
	}

	public static void deleteOffersAndDeductionsByType(java.lang.String type) {
		getService().deleteOffersAndDeductionsByType(type);
	}

	public static void deleteOffersAndDeductionsByGrouptId(long groupId) {
		getService().deleteOffersAndDeductionsByGrouptId(groupId);
	}

	public static void deleteAllOffersAndDeductions() {
		getService().deleteAllOffersAndDeductions();
	}

	public static void clearService() {
		_service = null;
	}

	public static OffersAndDeductionsService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					OffersAndDeductionsService.class.getName());

			if (invokableService instanceof OffersAndDeductionsService) {
				_service = (OffersAndDeductionsService)invokableService;
			}
			else {
				_service = new OffersAndDeductionsServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(OffersAndDeductionsServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(OffersAndDeductionsService service) {
	}

	private static OffersAndDeductionsService _service;
}