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
 * Provides the local service utility for TaxDetails. This utility wraps
 * {@link com.ocms.course.service.impl.TaxDetailsLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author doraraj
 * @see TaxDetailsLocalService
 * @see com.ocms.course.service.base.TaxDetailsLocalServiceBaseImpl
 * @see com.ocms.course.service.impl.TaxDetailsLocalServiceImpl
 * @generated
 */
public class TaxDetailsLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ocms.course.service.impl.TaxDetailsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the tax details to the database. Also notifies the appropriate model listeners.
	*
	* @param taxDetails the tax details
	* @return the tax details that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxDetails addTaxDetails(
		com.ocms.course.model.TaxDetails taxDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTaxDetails(taxDetails);
	}

	/**
	* Creates a new tax details with the primary key. Does not add the tax details to the database.
	*
	* @param taxDetailsId the primary key for the new tax details
	* @return the new tax details
	*/
	public static com.ocms.course.model.TaxDetails createTaxDetails(
		long taxDetailsId) {
		return getService().createTaxDetails(taxDetailsId);
	}

	/**
	* Deletes the tax details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param taxDetailsId the primary key of the tax details
	* @return the tax details that was removed
	* @throws PortalException if a tax details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxDetails deleteTaxDetails(
		long taxDetailsId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTaxDetails(taxDetailsId);
	}

	/**
	* Deletes the tax details from the database. Also notifies the appropriate model listeners.
	*
	* @param taxDetails the tax details
	* @return the tax details that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxDetails deleteTaxDetails(
		com.ocms.course.model.TaxDetails taxDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTaxDetails(taxDetails);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.ocms.course.model.TaxDetails fetchTaxDetails(
		long taxDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchTaxDetails(taxDetailsId);
	}

	/**
	* Returns the tax details with the primary key.
	*
	* @param taxDetailsId the primary key of the tax details
	* @return the tax details
	* @throws PortalException if a tax details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxDetails getTaxDetails(
		long taxDetailsId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTaxDetails(taxDetailsId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the tax detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tax detailses
	* @param end the upper bound of the range of tax detailses (not inclusive)
	* @return the range of tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTaxDetailses(start, end);
	}

	/**
	* Returns the number of tax detailses.
	*
	* @return the number of tax detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int getTaxDetailsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTaxDetailsesCount();
	}

	/**
	* Updates the tax details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param taxDetails the tax details
	* @return the tax details that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.TaxDetails updateTaxDetails(
		com.ocms.course.model.TaxDetails taxDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTaxDetails(taxDetails);
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

	public static TaxDetailsLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TaxDetailsLocalService.class.getName());

			if (invokableLocalService instanceof TaxDetailsLocalService) {
				_service = (TaxDetailsLocalService)invokableLocalService;
			}
			else {
				_service = new TaxDetailsLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(TaxDetailsLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(TaxDetailsLocalService service) {
	}

	private static TaxDetailsLocalService _service;
}