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
 * Provides the local service utility for Discount. This utility wraps
 * {@link com.ocms.course.service.impl.DiscountLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author doraraj
 * @see DiscountLocalService
 * @see com.ocms.course.service.base.DiscountLocalServiceBaseImpl
 * @see com.ocms.course.service.impl.DiscountLocalServiceImpl
 * @generated
 */
public class DiscountLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ocms.course.service.impl.DiscountLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the discount to the database. Also notifies the appropriate model listeners.
	*
	* @param discount the discount
	* @return the discount that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount addDiscount(
		com.ocms.course.model.Discount discount)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDiscount(discount);
	}

	/**
	* Creates a new discount with the primary key. Does not add the discount to the database.
	*
	* @param id the primary key for the new discount
	* @return the new discount
	*/
	public static com.ocms.course.model.Discount createDiscount(long id) {
		return getService().createDiscount(id);
	}

	/**
	* Deletes the discount with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the discount
	* @return the discount that was removed
	* @throws PortalException if a discount with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount deleteDiscount(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDiscount(id);
	}

	/**
	* Deletes the discount from the database. Also notifies the appropriate model listeners.
	*
	* @param discount the discount
	* @return the discount that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount deleteDiscount(
		com.ocms.course.model.Discount discount)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDiscount(discount);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.DiscountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.ocms.course.model.Discount fetchDiscount(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDiscount(id);
	}

	/**
	* Returns the discount with the primary key.
	*
	* @param id the primary key of the discount
	* @return the discount
	* @throws PortalException if a discount with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount getDiscount(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDiscount(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.ocms.course.model.Discount> getDiscounts(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDiscounts(start, end);
	}

	/**
	* Returns the number of discounts.
	*
	* @return the number of discounts
	* @throws SystemException if a system exception occurred
	*/
	public static int getDiscountsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDiscountsCount();
	}

	/**
	* Updates the discount in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param discount the discount
	* @return the discount that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Discount updateDiscount(
		com.ocms.course.model.Discount discount)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDiscount(discount);
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

	public static java.util.List<com.ocms.course.model.Discount> getDiscountByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDiscountByGroupId(groupId);
	}

	public static java.util.List<com.ocms.course.model.Discount> getDiscountByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDiscountByGroupId(groupId, start, end);
	}

	public static java.util.List<com.ocms.course.model.Discount> getDiscountByid(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDiscountByid(id);
	}

	public static java.util.List<com.ocms.course.model.Discount> getDiscountByid(
		int id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDiscountByid(id, start, end);
	}

	public static java.util.List<com.ocms.course.model.Discount> getDiscountByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDiscountByCode(code);
	}

	public static java.util.List<com.ocms.course.model.Discount> getDiscountByCode(
		java.lang.String code, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDiscountByCode(code, start, end);
	}

	public static java.util.List<com.ocms.course.model.Discount> getDiscountByActive(
		int active) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDiscountByActive(active);
	}

	public static java.util.List<com.ocms.course.model.Discount> getDiscountByActive(
		int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDiscountByActive(active, start, end);
	}

	public static java.util.List<com.ocms.course.model.Discount> getDiscountByGroupIdAndActive(
		long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDiscountByGroupIdAndActive(groupId, active);
	}

	public static java.util.List<com.ocms.course.model.Discount> getDiscountByGroupIdAndActive(
		long groupId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getDiscountByGroupIdAndActive(groupId, active, start, end);
	}

	public static java.util.List<com.ocms.course.model.Discount> getDiscountByidAndActive(
		long id, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDiscountByidAndActive(id, active);
	}

	public static java.util.List<com.ocms.course.model.Discount> getDiscountByidAndActive(
		long id, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDiscountByidAndActive(id, active, start, end);
	}

	public static java.util.List<com.ocms.course.model.Discount> getDiscountByCodeAndActive(
		java.lang.String code, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDiscountByCodeAndActive(code, active);
	}

	public static java.util.List<com.ocms.course.model.Discount> getDiscountByCodeAndActive(
		java.lang.String code, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDiscountByCodeAndActive(code, active, start, end);
	}

	public static com.ocms.course.model.Discount addDiscount(
		java.lang.String code, java.lang.String description,
		java.util.Date effectiveFromDate, java.util.Date effectiveToDate,
		long amount, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDiscount(code, description, effectiveFromDate,
			effectiveToDate, amount, serviceContext);
	}

	public static com.ocms.course.model.Discount updateDiscount(long id,
		java.lang.String code, java.lang.String description,
		java.util.Date effectiveFromDate, java.util.Date effectiveToDate,
		long amount, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateDiscount(id, code, description, effectiveFromDate,
			effectiveToDate, amount, serviceContext);
	}

	public static void deleteDiscountByid(long id) {
		getService().deleteDiscountByid(id);
	}

	public static void deleteDiscountByGrouptId(long groupId) {
		getService().deleteDiscountByGrouptId(groupId);
	}

	public static void deleteAllDiscount() {
		getService().deleteAllDiscount();
	}

	public static void clearService() {
		_service = null;
	}

	public static DiscountLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DiscountLocalService.class.getName());

			if (invokableLocalService instanceof DiscountLocalService) {
				_service = (DiscountLocalService)invokableLocalService;
			}
			else {
				_service = new DiscountLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DiscountLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DiscountLocalService service) {
	}

	private static DiscountLocalService _service;
}