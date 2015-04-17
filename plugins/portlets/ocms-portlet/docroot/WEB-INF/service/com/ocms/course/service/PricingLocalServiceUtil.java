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
 * Provides the local service utility for Pricing. This utility wraps
 * {@link com.ocms.course.service.impl.PricingLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author doraraj
 * @see PricingLocalService
 * @see com.ocms.course.service.base.PricingLocalServiceBaseImpl
 * @see com.ocms.course.service.impl.PricingLocalServiceImpl
 * @generated
 */
public class PricingLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ocms.course.service.impl.PricingLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the pricing to the database. Also notifies the appropriate model listeners.
	*
	* @param pricing the pricing
	* @return the pricing that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing addPricing(
		com.ocms.course.model.Pricing pricing)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addPricing(pricing);
	}

	/**
	* Creates a new pricing with the primary key. Does not add the pricing to the database.
	*
	* @param pricingId the primary key for the new pricing
	* @return the new pricing
	*/
	public static com.ocms.course.model.Pricing createPricing(long pricingId) {
		return getService().createPricing(pricingId);
	}

	/**
	* Deletes the pricing with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param pricingId the primary key of the pricing
	* @return the pricing that was removed
	* @throws PortalException if a pricing with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing deletePricing(long pricingId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletePricing(pricingId);
	}

	/**
	* Deletes the pricing from the database. Also notifies the appropriate model listeners.
	*
	* @param pricing the pricing
	* @return the pricing that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing deletePricing(
		com.ocms.course.model.Pricing pricing)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletePricing(pricing);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.ocms.course.model.Pricing fetchPricing(long pricingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchPricing(pricingId);
	}

	/**
	* Returns the pricing with the primary key.
	*
	* @param pricingId the primary key of the pricing
	* @return the pricing
	* @throws PortalException if a pricing with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing getPricing(long pricingId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPricing(pricingId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the pricings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @return the range of pricings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Pricing> getPricings(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPricings(start, end);
	}

	/**
	* Returns the number of pricings.
	*
	* @return the number of pricings
	* @throws SystemException if a system exception occurred
	*/
	public static int getPricingsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPricingsCount();
	}

	/**
	* Updates the pricing in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param pricing the pricing
	* @return the pricing that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Pricing updatePricing(
		com.ocms.course.model.Pricing pricing)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatePricing(pricing);
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
		int balanceDueParDate, java.util.Date effectiveToDate, int locationId,
		java.lang.String locationCode, int courseId,
		java.lang.String courseCode, int packageId, long pricingId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updatePricing(deposit, price, currency, effectiveFromDate,
			balanceDueParDate, effectiveToDate, locationId, locationCode,
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

	public static PricingLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					PricingLocalService.class.getName());

			if (invokableLocalService instanceof PricingLocalService) {
				_service = (PricingLocalService)invokableLocalService;
			}
			else {
				_service = new PricingLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(PricingLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(PricingLocalService service) {
	}

	private static PricingLocalService _service;
}