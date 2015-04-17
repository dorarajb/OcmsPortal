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
 * Provides a wrapper for {@link OffersAndDeductionsLocalService}.
 *
 * @author doraraj
 * @see OffersAndDeductionsLocalService
 * @generated
 */
public class OffersAndDeductionsLocalServiceWrapper
	implements OffersAndDeductionsLocalService,
		ServiceWrapper<OffersAndDeductionsLocalService> {
	public OffersAndDeductionsLocalServiceWrapper(
		OffersAndDeductionsLocalService offersAndDeductionsLocalService) {
		_offersAndDeductionsLocalService = offersAndDeductionsLocalService;
	}

	/**
	* Adds the offers and deductions to the database. Also notifies the appropriate model listeners.
	*
	* @param offersAndDeductions the offers and deductions
	* @return the offers and deductions that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.OffersAndDeductions addOffersAndDeductions(
		com.ocms.course.model.OffersAndDeductions offersAndDeductions)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsLocalService.addOffersAndDeductions(offersAndDeductions);
	}

	/**
	* Creates a new offers and deductions with the primary key. Does not add the offers and deductions to the database.
	*
	* @param id the primary key for the new offers and deductions
	* @return the new offers and deductions
	*/
	@Override
	public com.ocms.course.model.OffersAndDeductions createOffersAndDeductions(
		long id) {
		return _offersAndDeductionsLocalService.createOffersAndDeductions(id);
	}

	/**
	* Deletes the offers and deductions with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the offers and deductions
	* @return the offers and deductions that was removed
	* @throws PortalException if a offers and deductions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.OffersAndDeductions deleteOffersAndDeductions(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsLocalService.deleteOffersAndDeductions(id);
	}

	/**
	* Deletes the offers and deductions from the database. Also notifies the appropriate model listeners.
	*
	* @param offersAndDeductions the offers and deductions
	* @return the offers and deductions that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.OffersAndDeductions deleteOffersAndDeductions(
		com.ocms.course.model.OffersAndDeductions offersAndDeductions)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsLocalService.deleteOffersAndDeductions(offersAndDeductions);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _offersAndDeductionsLocalService.dynamicQuery();
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
		return _offersAndDeductionsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _offersAndDeductionsLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _offersAndDeductionsLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _offersAndDeductionsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _offersAndDeductionsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ocms.course.model.OffersAndDeductions fetchOffersAndDeductions(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsLocalService.fetchOffersAndDeductions(id);
	}

	/**
	* Returns the offers and deductions with the primary key.
	*
	* @param id the primary key of the offers and deductions
	* @return the offers and deductions
	* @throws PortalException if a offers and deductions with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.OffersAndDeductions getOffersAndDeductions(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsLocalService.getOffersAndDeductions(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the offers and deductionses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of offers and deductionses
	* @param end the upper bound of the range of offers and deductionses (not inclusive)
	* @return the range of offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsLocalService.getOffersAndDeductionses(start,
			end);
	}

	/**
	* Returns the number of offers and deductionses.
	*
	* @return the number of offers and deductionses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getOffersAndDeductionsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsLocalService.getOffersAndDeductionsesCount();
	}

	/**
	* Updates the offers and deductions in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param offersAndDeductions the offers and deductions
	* @return the offers and deductions that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.OffersAndDeductions updateOffersAndDeductions(
		com.ocms.course.model.OffersAndDeductions offersAndDeductions)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsLocalService.updateOffersAndDeductions(offersAndDeductions);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _offersAndDeductionsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_offersAndDeductionsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _offersAndDeductionsLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsLocalService.getOffersAndDeductionsByGroupId(groupId);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsLocalService.getOffersAndDeductionsByGroupId(groupId,
			start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByid(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsLocalService.getOffersAndDeductionsByid(id);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByid(
		int id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsLocalService.getOffersAndDeductionsByid(id,
			start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsLocalService.getOffersAndDeductionsByCode(code);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByCode(
		java.lang.String code, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsLocalService.getOffersAndDeductionsByCode(code,
			start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByActive(
		int active) throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsLocalService.getOffersAndDeductionsByActive(active);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByActive(
		int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsLocalService.getOffersAndDeductionsByActive(active,
			start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByType(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsLocalService.getOffersAndDeductionsByType(type);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByType(
		java.lang.String type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsLocalService.getOffersAndDeductionsByType(type,
			start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByGroupIdAndActive(
		long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsLocalService.getOffersAndDeductionsByGroupIdAndActive(groupId,
			active);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByGroupIdAndActive(
		long groupId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsLocalService.getOffersAndDeductionsByGroupIdAndActive(groupId,
			active, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByidAndActive(
		long id, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsLocalService.getOffersAndDeductionsByidAndActive(id,
			active);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByidAndActive(
		long id, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsLocalService.getOffersAndDeductionsByidAndActive(id,
			active, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByCodeAndActive(
		java.lang.String code, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsLocalService.getOffersAndDeductionsByCodeAndActive(code,
			active);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByCodeAndActive(
		java.lang.String code, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsLocalService.getOffersAndDeductionsByCodeAndActive(code,
			active, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByGroupIdTypeActive(
		long groupId, java.lang.String type, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsLocalService.getOffersAndDeductionsByGroupIdTypeActive(groupId,
			type, active);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByGroupIdTypeActive(
		long groupId, java.lang.String type, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsLocalService.getOffersAndDeductionsByGroupIdTypeActive(groupId,
			type, active, start, end);
	}

	@Override
	public com.ocms.course.model.OffersAndDeductions addOffersAndDeductions(
		java.lang.String code, java.lang.String type,
		java.lang.String description, java.util.Date effectiveFromDate,
		java.util.Date effectiveToDate, long amount,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsLocalService.addOffersAndDeductions(code,
			type, description, effectiveFromDate, effectiveToDate, amount,
			serviceContext);
	}

	@Override
	public com.ocms.course.model.OffersAndDeductions updateOffersAndDeductions(
		long id, java.lang.String code, java.lang.String type,
		java.lang.String description, java.util.Date effectiveFromDate,
		java.util.Date effectiveToDate, long amount,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _offersAndDeductionsLocalService.updateOffersAndDeductions(id,
			code, type, description, effectiveFromDate, effectiveToDate,
			amount, serviceContext);
	}

	@Override
	public void deleteOffersAndDeductionsById(long id) {
		_offersAndDeductionsLocalService.deleteOffersAndDeductionsById(id);
	}

	@Override
	public void deleteOffersAndDeductionsByType(java.lang.String type) {
		_offersAndDeductionsLocalService.deleteOffersAndDeductionsByType(type);
	}

	@Override
	public void deleteOffersAndDeductionsByGrouptId(long groupId) {
		_offersAndDeductionsLocalService.deleteOffersAndDeductionsByGrouptId(groupId);
	}

	@Override
	public void deleteAllOffersAndDeductions() {
		_offersAndDeductionsLocalService.deleteAllOffersAndDeductions();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public OffersAndDeductionsLocalService getWrappedOffersAndDeductionsLocalService() {
		return _offersAndDeductionsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedOffersAndDeductionsLocalService(
		OffersAndDeductionsLocalService offersAndDeductionsLocalService) {
		_offersAndDeductionsLocalService = offersAndDeductionsLocalService;
	}

	@Override
	public OffersAndDeductionsLocalService getWrappedService() {
		return _offersAndDeductionsLocalService;
	}

	@Override
	public void setWrappedService(
		OffersAndDeductionsLocalService offersAndDeductionsLocalService) {
		_offersAndDeductionsLocalService = offersAndDeductionsLocalService;
	}

	private OffersAndDeductionsLocalService _offersAndDeductionsLocalService;
}