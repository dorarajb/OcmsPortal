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
 * Provides the remote service utility for TaxTypes. This utility wraps
 * {@link com.ocms.course.service.impl.TaxTypesServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author doraraj
 * @see TaxTypesService
 * @see com.ocms.course.service.base.TaxTypesServiceBaseImpl
 * @see com.ocms.course.service.impl.TaxTypesServiceImpl
 * @generated
 */
public class TaxTypesServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ocms.course.service.impl.TaxTypesServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static java.util.List<com.ocms.course.model.TaxTypes> getTaxTypesByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTaxTypesByGroupId(groupId);
	}

	public static java.util.List<com.ocms.course.model.TaxTypes> getTaxTypesByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTaxTypesByGroupId(groupId, start, end);
	}

	public static java.util.List<com.ocms.course.model.TaxTypes> getTaxTypesByTaxTypesId(
		int taxTypesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTaxTypesByTaxTypesId(taxTypesId);
	}

	public static java.util.List<com.ocms.course.model.TaxTypes> getPricingByTaxTypesId(
		int taxTypesId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPricingByTaxTypesId(taxTypesId, start, end);
	}

	public static com.ocms.course.model.TaxTypes addTaxType(
		java.lang.String taxTypeName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().addTaxType(taxTypeName, serviceContext);
	}

	public static com.ocms.course.model.TaxTypes updateTaxTypes(
		long taxTypesId, java.lang.String taxTypeName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateTaxTypes(taxTypesId, taxTypeName, serviceContext);
	}

	public static void deleteTaxTypesByTaxTypesId(long taxTypesId) {
		getService().deleteTaxTypesByTaxTypesId(taxTypesId);
	}

	public static void deleteTaxTypesByGrouptId(long groupId) {
		getService().deleteTaxTypesByGrouptId(groupId);
	}

	public static void deleteAllTaxTypes() {
		getService().deleteAllTaxTypes();
	}

	public static void clearService() {
		_service = null;
	}

	public static TaxTypesService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TaxTypesService.class.getName());

			if (invokableService instanceof TaxTypesService) {
				_service = (TaxTypesService)invokableService;
			}
			else {
				_service = new TaxTypesServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(TaxTypesServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(TaxTypesService service) {
	}

	private static TaxTypesService _service;
}