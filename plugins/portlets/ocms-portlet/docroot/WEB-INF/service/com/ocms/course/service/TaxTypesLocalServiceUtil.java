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
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for TaxTypes. This utility wraps
 * {@link com.ocms.course.service.impl.TaxTypesLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author doraraj
 * @see TaxTypesLocalService
 * @see com.ocms.course.service.base.TaxTypesLocalServiceBaseImpl
 * @see com.ocms.course.service.impl.TaxTypesLocalServiceImpl
 * @generated
 */
public class TaxTypesLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ocms.course.service.impl.TaxTypesLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the tax types to the database. Also notifies the appropriate model listeners.
	*
	* @param taxTypes the tax types
	* @return the tax types that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxTypes addTaxTypes(
		com.ocms.course.model.TaxTypes taxTypes)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTaxTypes(taxTypes);
	}

	/**
	* Creates a new tax types with the primary key. Does not add the tax types to the database.
	*
	* @param taxTypesId the primary key for the new tax types
	* @return the new tax types
	*/
	public static com.ocms.course.model.TaxTypes createTaxTypes(long taxTypesId) {
		return getService().createTaxTypes(taxTypesId);
	}

	/**
	* Deletes the tax types with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param taxTypesId the primary key of the tax types
	* @return the tax types that was removed
	* @throws PortalException if a tax types with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxTypes deleteTaxTypes(long taxTypesId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTaxTypes(taxTypesId);
	}

	/**
	* Deletes the tax types from the database. Also notifies the appropriate model listeners.
	*
	* @param taxTypes the tax types
	* @return the tax types that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxTypes deleteTaxTypes(
		com.ocms.course.model.TaxTypes taxTypes)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTaxTypes(taxTypes);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.ocms.course.model.TaxTypes fetchTaxTypes(long taxTypesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchTaxTypes(taxTypesId);
	}

	/**
	* Returns the tax types with the primary key.
	*
	* @param taxTypesId the primary key of the tax types
	* @return the tax types
	* @throws PortalException if a tax types with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxTypes getTaxTypes(long taxTypesId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTaxTypes(taxTypesId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the tax typeses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tax typeses
	* @param end the upper bound of the range of tax typeses (not inclusive)
	* @return the range of tax typeses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.TaxTypes> getTaxTypeses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTaxTypeses(start, end);
	}

	/**
	* Returns the number of tax typeses.
	*
	* @return the number of tax typeses
	* @throws SystemException if a system exception occurred
	*/
	public static int getTaxTypesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTaxTypesesCount();
	}

	/**
	* Updates the tax types in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param taxTypes the tax types
	* @return the tax types that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxTypes updateTaxTypes(
		com.ocms.course.model.TaxTypes taxTypes)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTaxTypes(taxTypes);
	}

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

	public static TaxTypesLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TaxTypesLocalService.class.getName());

			if (invokableLocalService instanceof TaxTypesLocalService) {
				_service = (TaxTypesLocalService)invokableLocalService;
			}
			else {
				_service = new TaxTypesLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(TaxTypesLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(TaxTypesLocalService service) {
	}

	private static TaxTypesLocalService _service;
}