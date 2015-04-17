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
 * Provides a wrapper for {@link TaxTypesLocalService}.
 *
 * @author doraraj
 * @see TaxTypesLocalService
 * @generated
 */
public class TaxTypesLocalServiceWrapper implements TaxTypesLocalService,
	ServiceWrapper<TaxTypesLocalService> {
	public TaxTypesLocalServiceWrapper(
		TaxTypesLocalService taxTypesLocalService) {
		_taxTypesLocalService = taxTypesLocalService;
	}

	/**
	* Adds the tax types to the database. Also notifies the appropriate model listeners.
	*
	* @param taxTypes the tax types
	* @return the tax types that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.TaxTypes addTaxTypes(
		com.ocms.course.model.TaxTypes taxTypes)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxTypesLocalService.addTaxTypes(taxTypes);
	}

	/**
	* Creates a new tax types with the primary key. Does not add the tax types to the database.
	*
	* @param taxTypesId the primary key for the new tax types
	* @return the new tax types
	*/
	@Override
	public com.ocms.course.model.TaxTypes createTaxTypes(long taxTypesId) {
		return _taxTypesLocalService.createTaxTypes(taxTypesId);
	}

	/**
	* Deletes the tax types with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param taxTypesId the primary key of the tax types
	* @return the tax types that was removed
	* @throws PortalException if a tax types with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.TaxTypes deleteTaxTypes(long taxTypesId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _taxTypesLocalService.deleteTaxTypes(taxTypesId);
	}

	/**
	* Deletes the tax types from the database. Also notifies the appropriate model listeners.
	*
	* @param taxTypes the tax types
	* @return the tax types that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.TaxTypes deleteTaxTypes(
		com.ocms.course.model.TaxTypes taxTypes)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxTypesLocalService.deleteTaxTypes(taxTypes);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _taxTypesLocalService.dynamicQuery();
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
		return _taxTypesLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _taxTypesLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxTypesLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _taxTypesLocalService.dynamicQueryCount(dynamicQuery);
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
		return _taxTypesLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.ocms.course.model.TaxTypes fetchTaxTypes(long taxTypesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxTypesLocalService.fetchTaxTypes(taxTypesId);
	}

	/**
	* Returns the tax types with the primary key.
	*
	* @param taxTypesId the primary key of the tax types
	* @return the tax types
	* @throws PortalException if a tax types with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.TaxTypes getTaxTypes(long taxTypesId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _taxTypesLocalService.getTaxTypes(taxTypesId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _taxTypesLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.ocms.course.model.TaxTypes> getTaxTypeses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxTypesLocalService.getTaxTypeses(start, end);
	}

	/**
	* Returns the number of tax typeses.
	*
	* @return the number of tax typeses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTaxTypesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxTypesLocalService.getTaxTypesesCount();
	}

	/**
	* Updates the tax types in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param taxTypes the tax types
	* @return the tax types that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.TaxTypes updateTaxTypes(
		com.ocms.course.model.TaxTypes taxTypes)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxTypesLocalService.updateTaxTypes(taxTypes);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _taxTypesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_taxTypesLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _taxTypesLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxTypes> getTaxTypesByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxTypesLocalService.getTaxTypesByGroupId(groupId);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxTypes> getTaxTypesByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxTypesLocalService.getTaxTypesByGroupId(groupId, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxTypes> getTaxTypesByTaxTypesId(
		int taxTypesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxTypesLocalService.getTaxTypesByTaxTypesId(taxTypesId);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxTypes> getPricingByTaxTypesId(
		int taxTypesId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxTypesLocalService.getPricingByTaxTypesId(taxTypesId, start,
			end);
	}

	@Override
	public com.ocms.course.model.TaxTypes addTaxType(
		java.lang.String taxTypeName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _taxTypesLocalService.addTaxType(taxTypeName, serviceContext);
	}

	@Override
	public com.ocms.course.model.TaxTypes updateTaxTypes(long taxTypesId,
		java.lang.String taxTypeName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _taxTypesLocalService.updateTaxTypes(taxTypesId, taxTypeName,
			serviceContext);
	}

	@Override
	public void deleteTaxTypesByTaxTypesId(long taxTypesId) {
		_taxTypesLocalService.deleteTaxTypesByTaxTypesId(taxTypesId);
	}

	@Override
	public void deleteTaxTypesByGrouptId(long groupId) {
		_taxTypesLocalService.deleteTaxTypesByGrouptId(groupId);
	}

	@Override
	public void deleteAllTaxTypes() {
		_taxTypesLocalService.deleteAllTaxTypes();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TaxTypesLocalService getWrappedTaxTypesLocalService() {
		return _taxTypesLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTaxTypesLocalService(
		TaxTypesLocalService taxTypesLocalService) {
		_taxTypesLocalService = taxTypesLocalService;
	}

	@Override
	public TaxTypesLocalService getWrappedService() {
		return _taxTypesLocalService;
	}

	@Override
	public void setWrappedService(TaxTypesLocalService taxTypesLocalService) {
		_taxTypesLocalService = taxTypesLocalService;
	}

	private TaxTypesLocalService _taxTypesLocalService;
}