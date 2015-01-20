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
 * Provides a wrapper for {@link PricingLocalService}.
 *
 * @author doraraj
 * @see PricingLocalService
 * @generated
 */
public class PricingLocalServiceWrapper implements PricingLocalService,
	ServiceWrapper<PricingLocalService> {
	public PricingLocalServiceWrapper(PricingLocalService pricingLocalService) {
		_pricingLocalService = pricingLocalService;
	}

	/**
	* Adds the pricing to the database. Also notifies the appropriate model listeners.
	*
	* @param pricing the pricing
	* @return the pricing that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.Pricing addPricing(
		com.ocms.course.model.Pricing pricing)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pricingLocalService.addPricing(pricing);
	}

	/**
	* Creates a new pricing with the primary key. Does not add the pricing to the database.
	*
	* @param pricingId the primary key for the new pricing
	* @return the new pricing
	*/
	@Override
	public com.ocms.course.model.Pricing createPricing(long pricingId) {
		return _pricingLocalService.createPricing(pricingId);
	}

	/**
	* Deletes the pricing with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param pricingId the primary key of the pricing
	* @return the pricing that was removed
	* @throws PortalException if a pricing with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.Pricing deletePricing(long pricingId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _pricingLocalService.deletePricing(pricingId);
	}

	/**
	* Deletes the pricing from the database. Also notifies the appropriate model listeners.
	*
	* @param pricing the pricing
	* @return the pricing that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.Pricing deletePricing(
		com.ocms.course.model.Pricing pricing)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pricingLocalService.deletePricing(pricing);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pricingLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pricingLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _pricingLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pricingLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pricingLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pricingLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.ocms.course.model.Pricing fetchPricing(long pricingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pricingLocalService.fetchPricing(pricingId);
	}

	/**
	* Returns the pricing with the primary key.
	*
	* @param pricingId the primary key of the pricing
	* @return the pricing
	* @throws PortalException if a pricing with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.Pricing getPricing(long pricingId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _pricingLocalService.getPricing(pricingId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _pricingLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricings(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pricingLocalService.getPricings(start, end);
	}

	/**
	* Returns the number of pricings.
	*
	* @return the number of pricings
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPricingsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pricingLocalService.getPricingsCount();
	}

	/**
	* Updates the pricing in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param pricing the pricing
	* @return the pricing that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.Pricing updatePricing(
		com.ocms.course.model.Pricing pricing)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pricingLocalService.updatePricing(pricing);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _pricingLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_pricingLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _pricingLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PricingLocalService getWrappedPricingLocalService() {
		return _pricingLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPricingLocalService(
		PricingLocalService pricingLocalService) {
		_pricingLocalService = pricingLocalService;
	}

	@Override
	public PricingLocalService getWrappedService() {
		return _pricingLocalService;
	}

	@Override
	public void setWrappedService(PricingLocalService pricingLocalService) {
		_pricingLocalService = pricingLocalService;
	}

	private PricingLocalService _pricingLocalService;
}