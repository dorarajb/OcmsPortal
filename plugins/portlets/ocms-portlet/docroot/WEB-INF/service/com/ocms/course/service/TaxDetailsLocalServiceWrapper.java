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
 * Provides a wrapper for {@link TaxDetailsLocalService}.
 *
 * @author doraraj
 * @see TaxDetailsLocalService
 * @generated
 */
public class TaxDetailsLocalServiceWrapper implements TaxDetailsLocalService,
	ServiceWrapper<TaxDetailsLocalService> {
	public TaxDetailsLocalServiceWrapper(
		TaxDetailsLocalService taxDetailsLocalService) {
		_taxDetailsLocalService = taxDetailsLocalService;
	}

	/**
	* Adds the tax details to the database. Also notifies the appropriate model listeners.
	*
	* @param taxDetails the tax details
	* @return the tax details that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.TaxDetails addTaxDetails(
		com.ocms.course.model.TaxDetails taxDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsLocalService.addTaxDetails(taxDetails);
	}

	/**
	* Creates a new tax details with the primary key. Does not add the tax details to the database.
	*
	* @param taxDetailsId the primary key for the new tax details
	* @return the new tax details
	*/
	@Override
	public com.ocms.course.model.TaxDetails createTaxDetails(long taxDetailsId) {
		return _taxDetailsLocalService.createTaxDetails(taxDetailsId);
	}

	/**
	* Deletes the tax details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param taxDetailsId the primary key of the tax details
	* @return the tax details that was removed
	* @throws PortalException if a tax details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.TaxDetails deleteTaxDetails(long taxDetailsId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsLocalService.deleteTaxDetails(taxDetailsId);
	}

	/**
	* Deletes the tax details from the database. Also notifies the appropriate model listeners.
	*
	* @param taxDetails the tax details
	* @return the tax details that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.TaxDetails deleteTaxDetails(
		com.ocms.course.model.TaxDetails taxDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsLocalService.deleteTaxDetails(taxDetails);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _taxDetailsLocalService.dynamicQuery();
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
		return _taxDetailsLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _taxDetailsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _taxDetailsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ocms.course.model.TaxDetails fetchTaxDetails(long taxDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsLocalService.fetchTaxDetails(taxDetailsId);
	}

	/**
	* Returns the tax details with the primary key.
	*
	* @param taxDetailsId the primary key of the tax details
	* @return the tax details
	* @throws PortalException if a tax details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.TaxDetails getTaxDetails(long taxDetailsId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsLocalService.getTaxDetails(taxDetailsId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsLocalService.getTaxDetailses(start, end);
	}

	/**
	* Returns the number of tax detailses.
	*
	* @return the number of tax detailses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTaxDetailsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsLocalService.getTaxDetailsesCount();
	}

	/**
	* Updates the tax details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param taxDetails the tax details
	* @return the tax details that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.TaxDetails updateTaxDetails(
		com.ocms.course.model.TaxDetails taxDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsLocalService.updateTaxDetails(taxDetails);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _taxDetailsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_taxDetailsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _taxDetailsLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsLocalService.getTaxDetailsByGroupId(groupId);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsLocalService.getTaxDetailsByGroupId(groupId, start,
			end);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByTaxDetailsId(
		int taxDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsLocalService.getTaxDetailsByTaxDetailsId(taxDetailsId);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByTaxDetailsId(
		int taxDetailsId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsLocalService.getTaxDetailsByTaxDetailsId(taxDetailsId,
			start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByTaxTypeId(
		int taxTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsLocalService.getTaxDetailsByTaxTypeId(taxTypeId);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByTaxTypeId(
		int taxTypeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsLocalService.getTaxDetailsByTaxTypeId(taxTypeId,
			start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByActive(
		int taxActiveId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsLocalService.getTaxDetailsByActive(taxActiveId);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByActive(
		int taxActiveId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsLocalService.getTaxDetailsByActive(taxActiveId,
			start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByGroupIdActive(
		int groupId, int taxActiveId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsLocalService.getTaxDetailsByGroupIdActive(groupId,
			taxActiveId);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByGroupIdActive(
		int groupId, int taxActiveId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsLocalService.getTaxDetailsByGroupIdActive(groupId,
			taxActiveId, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByGroupIdTaxDetailsIdActive(
		int taxDetailsId, int taxActiveId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsLocalService.getTaxDetailsByGroupIdTaxDetailsIdActive(taxDetailsId,
			taxActiveId);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByGroupIdTaxDetailsIdActive(
		int taxDetailsId, int taxActiveId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsLocalService.getTaxDetailsByGroupIdTaxDetailsIdActive(taxDetailsId,
			taxActiveId, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByGroupIdTaxTypeIdActive(
		int taxTypeId, int taxActiveId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsLocalService.getTaxDetailsByGroupIdTaxTypeIdActive(taxTypeId,
			taxActiveId);
	}

	@Override
	public java.util.List<com.ocms.course.model.TaxDetails> getTaxDetailsByGroupIdTaxTypeIdActive(
		int taxTypeId, int taxActiveId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsLocalService.getTaxDetailsByGroupIdTaxTypeIdActive(taxTypeId,
			taxActiveId, start, end);
	}

	@Override
	public com.ocms.course.model.TaxDetails addTaxDetails(long taxTypeId,
		java.lang.String country, java.util.Date effectiveFromDate,
		java.util.Date effectiveToDate, int active, int taxPercent,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsLocalService.addTaxDetails(taxTypeId, country,
			effectiveFromDate, effectiveToDate, active, taxPercent,
			serviceContext);
	}

	@Override
	public com.ocms.course.model.TaxDetails updateTaxDetails(
		long taxDetailsId, long taxTypeId, java.lang.String country,
		java.util.Date effectiveFromDate, java.util.Date effectiveToDate,
		int active, int taxPercent,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _taxDetailsLocalService.updateTaxDetails(taxDetailsId,
			taxTypeId, country, effectiveFromDate, effectiveToDate, active,
			taxPercent, serviceContext);
	}

	@Override
	public void deleteTaxDetailsByTaxDetailsId(long taxDetailsId) {
		_taxDetailsLocalService.deleteTaxDetailsByTaxDetailsId(taxDetailsId);
	}

	@Override
	public void deletetaxDetailsByGrouptId(long groupId) {
		_taxDetailsLocalService.deletetaxDetailsByGrouptId(groupId);
	}

	@Override
	public void deleteAlltaxDetails() {
		_taxDetailsLocalService.deleteAlltaxDetails();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TaxDetailsLocalService getWrappedTaxDetailsLocalService() {
		return _taxDetailsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTaxDetailsLocalService(
		TaxDetailsLocalService taxDetailsLocalService) {
		_taxDetailsLocalService = taxDetailsLocalService;
	}

	@Override
	public TaxDetailsLocalService getWrappedService() {
		return _taxDetailsLocalService;
	}

	@Override
	public void setWrappedService(TaxDetailsLocalService taxDetailsLocalService) {
		_taxDetailsLocalService = taxDetailsLocalService;
	}

	private TaxDetailsLocalService _taxDetailsLocalService;
}