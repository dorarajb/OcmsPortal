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
 * Provides a wrapper for {@link DiscountLocalService}.
 *
 * @author doraraj
 * @see DiscountLocalService
 * @generated
 */
public class DiscountLocalServiceWrapper implements DiscountLocalService,
	ServiceWrapper<DiscountLocalService> {
	public DiscountLocalServiceWrapper(
		DiscountLocalService discountLocalService) {
		_discountLocalService = discountLocalService;
	}

	/**
	* Adds the discount to the database. Also notifies the appropriate model listeners.
	*
	* @param discount the discount
	* @return the discount that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.Discount addDiscount(
		com.ocms.course.model.Discount discount)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountLocalService.addDiscount(discount);
	}

	/**
	* Creates a new discount with the primary key. Does not add the discount to the database.
	*
	* @param id the primary key for the new discount
	* @return the new discount
	*/
	@Override
	public com.ocms.course.model.Discount createDiscount(long id) {
		return _discountLocalService.createDiscount(id);
	}

	/**
	* Deletes the discount with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the discount
	* @return the discount that was removed
	* @throws PortalException if a discount with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.Discount deleteDiscount(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _discountLocalService.deleteDiscount(id);
	}

	/**
	* Deletes the discount from the database. Also notifies the appropriate model listeners.
	*
	* @param discount the discount
	* @return the discount that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.Discount deleteDiscount(
		com.ocms.course.model.Discount discount)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountLocalService.deleteDiscount(discount);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _discountLocalService.dynamicQuery();
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
		return _discountLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.DiscountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _discountLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.DiscountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _discountLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _discountLocalService.dynamicQueryCount(dynamicQuery);
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
		return _discountLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.ocms.course.model.Discount fetchDiscount(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountLocalService.fetchDiscount(id);
	}

	/**
	* Returns the discount with the primary key.
	*
	* @param id the primary key of the discount
	* @return the discount
	* @throws PortalException if a discount with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.Discount getDiscount(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _discountLocalService.getDiscount(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _discountLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the discounts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.DiscountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of discounts
	* @param end the upper bound of the range of discounts (not inclusive)
	* @return the range of discounts
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.ocms.course.model.Discount> getDiscounts(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountLocalService.getDiscounts(start, end);
	}

	/**
	* Returns the number of discounts.
	*
	* @return the number of discounts
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDiscountsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountLocalService.getDiscountsCount();
	}

	/**
	* Updates the discount in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param discount the discount
	* @return the discount that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.Discount updateDiscount(
		com.ocms.course.model.Discount discount)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountLocalService.updateDiscount(discount);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _discountLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_discountLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _discountLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<com.ocms.course.model.Discount> getDiscountByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountLocalService.getDiscountByGroupId(groupId);
	}

	@Override
	public java.util.List<com.ocms.course.model.Discount> getDiscountByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountLocalService.getDiscountByGroupId(groupId, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.Discount> getDiscountByid(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _discountLocalService.getDiscountByid(id);
	}

	@Override
	public java.util.List<com.ocms.course.model.Discount> getDiscountByid(
		int id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountLocalService.getDiscountByid(id, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.Discount> getDiscountByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountLocalService.getDiscountByCode(code);
	}

	@Override
	public java.util.List<com.ocms.course.model.Discount> getDiscountByCode(
		java.lang.String code, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountLocalService.getDiscountByCode(code, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.Discount> getDiscountByActive(
		int active) throws com.liferay.portal.kernel.exception.SystemException {
		return _discountLocalService.getDiscountByActive(active);
	}

	@Override
	public java.util.List<com.ocms.course.model.Discount> getDiscountByActive(
		int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountLocalService.getDiscountByActive(active, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.Discount> getDiscountByGroupIdAndActive(
		long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountLocalService.getDiscountByGroupIdAndActive(groupId,
			active);
	}

	@Override
	public java.util.List<com.ocms.course.model.Discount> getDiscountByGroupIdAndActive(
		long groupId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountLocalService.getDiscountByGroupIdAndActive(groupId,
			active, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.Discount> getDiscountByidAndActive(
		long id, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountLocalService.getDiscountByidAndActive(id, active);
	}

	@Override
	public java.util.List<com.ocms.course.model.Discount> getDiscountByidAndActive(
		long id, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountLocalService.getDiscountByidAndActive(id, active,
			start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.Discount> getDiscountByCodeAndActive(
		java.lang.String code, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountLocalService.getDiscountByCodeAndActive(code, active);
	}

	@Override
	public java.util.List<com.ocms.course.model.Discount> getDiscountByCodeAndActive(
		java.lang.String code, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _discountLocalService.getDiscountByCodeAndActive(code, active,
			start, end);
	}

	@Override
	public com.ocms.course.model.Discount addDiscount(java.lang.String code,
		java.lang.String description, java.util.Date effectiveFromDate,
		java.util.Date effectiveToDate, long amount,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _discountLocalService.addDiscount(code, description,
			effectiveFromDate, effectiveToDate, amount, serviceContext);
	}

	@Override
	public com.ocms.course.model.Discount updateDiscount(long id,
		java.lang.String code, java.lang.String description,
		java.util.Date effectiveFromDate, java.util.Date effectiveToDate,
		long amount, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _discountLocalService.updateDiscount(id, code, description,
			effectiveFromDate, effectiveToDate, amount, serviceContext);
	}

	@Override
	public void deleteDiscountByid(long id) {
		_discountLocalService.deleteDiscountByid(id);
	}

	@Override
	public void deleteDiscountByGrouptId(long groupId) {
		_discountLocalService.deleteDiscountByGrouptId(groupId);
	}

	@Override
	public void deleteAllDiscount() {
		_discountLocalService.deleteAllDiscount();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DiscountLocalService getWrappedDiscountLocalService() {
		return _discountLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDiscountLocalService(
		DiscountLocalService discountLocalService) {
		_discountLocalService = discountLocalService;
	}

	@Override
	public DiscountLocalService getWrappedService() {
		return _discountLocalService;
	}

	@Override
	public void setWrappedService(DiscountLocalService discountLocalService) {
		_discountLocalService = discountLocalService;
	}

	private DiscountLocalService _discountLocalService;
}