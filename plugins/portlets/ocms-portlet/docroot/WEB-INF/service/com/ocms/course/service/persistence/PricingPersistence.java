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

package com.ocms.course.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.ocms.course.model.Pricing;

/**
 * The persistence interface for the pricing service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author doraraj
 * @see PricingPersistenceImpl
 * @see PricingUtil
 * @generated
 */
public interface PricingPersistence extends BasePersistence<Pricing> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PricingUtil} to access the pricing persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the pricings where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Pricing> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the pricings where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @return the range of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Pricing> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the pricings where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Pricing> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first pricing in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pricing
	* @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException;

	/**
	* Returns the first pricing in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pricing, or <code>null</code> if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last pricing in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pricing
	* @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException;

	/**
	* Returns the last pricing in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pricing, or <code>null</code> if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the pricings before and after the current pricing in the ordered set where groupId = &#63;.
	*
	* @param pricingId the primary key of the current pricing
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next pricing
	* @throws com.ocms.course.NoSuchPricingException if a pricing with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing[] findByGroupId_PrevAndNext(
		long pricingId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException;

	/**
	* Removes all the pricings where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of pricings where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the pricings where pricingId = &#63;.
	*
	* @param pricingId the pricing ID
	* @return the matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Pricing> findByPricingId(
		long pricingId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the pricings where pricingId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pricingId the pricing ID
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @return the range of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Pricing> findByPricingId(
		long pricingId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the pricings where pricingId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pricingId the pricing ID
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Pricing> findByPricingId(
		long pricingId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first pricing in the ordered set where pricingId = &#63;.
	*
	* @param pricingId the pricing ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pricing
	* @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing findByPricingId_First(long pricingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException;

	/**
	* Returns the first pricing in the ordered set where pricingId = &#63;.
	*
	* @param pricingId the pricing ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pricing, or <code>null</code> if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing fetchByPricingId_First(
		long pricingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last pricing in the ordered set where pricingId = &#63;.
	*
	* @param pricingId the pricing ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pricing
	* @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing findByPricingId_Last(long pricingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException;

	/**
	* Returns the last pricing in the ordered set where pricingId = &#63;.
	*
	* @param pricingId the pricing ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pricing, or <code>null</code> if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing fetchByPricingId_Last(long pricingId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the pricings where pricingId = &#63; from the database.
	*
	* @param pricingId the pricing ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPricingId(long pricingId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of pricings where pricingId = &#63;.
	*
	* @param pricingId the pricing ID
	* @return the number of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public int countByPricingId(long pricingId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the pricings where packageId = &#63;.
	*
	* @param packageId the package ID
	* @return the matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Pricing> findByPackageId(
		int packageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the pricings where packageId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param packageId the package ID
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @return the range of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Pricing> findByPackageId(
		int packageId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the pricings where packageId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param packageId the package ID
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Pricing> findByPackageId(
		int packageId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first pricing in the ordered set where packageId = &#63;.
	*
	* @param packageId the package ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pricing
	* @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing findByPackageId_First(int packageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException;

	/**
	* Returns the first pricing in the ordered set where packageId = &#63;.
	*
	* @param packageId the package ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pricing, or <code>null</code> if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing fetchByPackageId_First(int packageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last pricing in the ordered set where packageId = &#63;.
	*
	* @param packageId the package ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pricing
	* @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing findByPackageId_Last(int packageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException;

	/**
	* Returns the last pricing in the ordered set where packageId = &#63;.
	*
	* @param packageId the package ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pricing, or <code>null</code> if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing fetchByPackageId_Last(int packageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the pricings before and after the current pricing in the ordered set where packageId = &#63;.
	*
	* @param pricingId the primary key of the current pricing
	* @param packageId the package ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next pricing
	* @throws com.ocms.course.NoSuchPricingException if a pricing with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing[] findByPackageId_PrevAndNext(
		long pricingId, int packageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException;

	/**
	* Removes all the pricings where packageId = &#63; from the database.
	*
	* @param packageId the package ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPackageId(int packageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of pricings where packageId = &#63;.
	*
	* @param packageId the package ID
	* @return the number of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public int countByPackageId(int packageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the pricings where courseId = &#63;.
	*
	* @param courseId the course ID
	* @return the matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Pricing> findByCourseId(
		int courseId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the pricings where courseId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param courseId the course ID
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @return the range of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Pricing> findByCourseId(
		int courseId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the pricings where courseId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param courseId the course ID
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Pricing> findByCourseId(
		int courseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first pricing in the ordered set where courseId = &#63;.
	*
	* @param courseId the course ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pricing
	* @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing findByCourseId_First(int courseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException;

	/**
	* Returns the first pricing in the ordered set where courseId = &#63;.
	*
	* @param courseId the course ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pricing, or <code>null</code> if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing fetchByCourseId_First(int courseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last pricing in the ordered set where courseId = &#63;.
	*
	* @param courseId the course ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pricing
	* @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing findByCourseId_Last(int courseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException;

	/**
	* Returns the last pricing in the ordered set where courseId = &#63;.
	*
	* @param courseId the course ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pricing, or <code>null</code> if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing fetchByCourseId_Last(int courseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the pricings before and after the current pricing in the ordered set where courseId = &#63;.
	*
	* @param pricingId the primary key of the current pricing
	* @param courseId the course ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next pricing
	* @throws com.ocms.course.NoSuchPricingException if a pricing with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing[] findByCourseId_PrevAndNext(
		long pricingId, int courseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException;

	/**
	* Removes all the pricings where courseId = &#63; from the database.
	*
	* @param courseId the course ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCourseId(int courseId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of pricings where courseId = &#63;.
	*
	* @param courseId the course ID
	* @return the number of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public int countByCourseId(int courseId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the pricings where locationId = &#63;.
	*
	* @param locationId the location ID
	* @return the matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Pricing> findByLocationId(
		int locationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the pricings where locationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param locationId the location ID
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @return the range of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Pricing> findByLocationId(
		int locationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the pricings where locationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param locationId the location ID
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Pricing> findByLocationId(
		int locationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first pricing in the ordered set where locationId = &#63;.
	*
	* @param locationId the location ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pricing
	* @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing findByLocationId_First(
		int locationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException;

	/**
	* Returns the first pricing in the ordered set where locationId = &#63;.
	*
	* @param locationId the location ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pricing, or <code>null</code> if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing fetchByLocationId_First(
		int locationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last pricing in the ordered set where locationId = &#63;.
	*
	* @param locationId the location ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pricing
	* @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing findByLocationId_Last(int locationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException;

	/**
	* Returns the last pricing in the ordered set where locationId = &#63;.
	*
	* @param locationId the location ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pricing, or <code>null</code> if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing fetchByLocationId_Last(
		int locationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the pricings before and after the current pricing in the ordered set where locationId = &#63;.
	*
	* @param pricingId the primary key of the current pricing
	* @param locationId the location ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next pricing
	* @throws com.ocms.course.NoSuchPricingException if a pricing with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing[] findByLocationId_PrevAndNext(
		long pricingId, int locationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException;

	/**
	* Removes all the pricings where locationId = &#63; from the database.
	*
	* @param locationId the location ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByLocationId(int locationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of pricings where locationId = &#63;.
	*
	* @param locationId the location ID
	* @return the number of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public int countByLocationId(int locationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the pricings where price = &#63;.
	*
	* @param price the price
	* @return the matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Pricing> findByPrice(int price)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the pricings where price = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param price the price
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @return the range of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Pricing> findByPrice(
		int price, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the pricings where price = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param price the price
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Pricing> findByPrice(
		int price, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first pricing in the ordered set where price = &#63;.
	*
	* @param price the price
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pricing
	* @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing findByPrice_First(int price,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException;

	/**
	* Returns the first pricing in the ordered set where price = &#63;.
	*
	* @param price the price
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pricing, or <code>null</code> if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing fetchByPrice_First(int price,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last pricing in the ordered set where price = &#63;.
	*
	* @param price the price
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pricing
	* @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing findByPrice_Last(int price,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException;

	/**
	* Returns the last pricing in the ordered set where price = &#63;.
	*
	* @param price the price
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pricing, or <code>null</code> if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing fetchByPrice_Last(int price,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the pricings before and after the current pricing in the ordered set where price = &#63;.
	*
	* @param pricingId the primary key of the current pricing
	* @param price the price
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next pricing
	* @throws com.ocms.course.NoSuchPricingException if a pricing with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing[] findByPrice_PrevAndNext(
		long pricingId, int price,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException;

	/**
	* Removes all the pricings where price = &#63; from the database.
	*
	* @param price the price
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPrice(int price)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of pricings where price = &#63;.
	*
	* @param price the price
	* @return the number of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public int countByPrice(int price)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the pricings where packageId = &#63; and locationId = &#63;.
	*
	* @param packageId the package ID
	* @param locationId the location ID
	* @return the matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Pricing> findByPackageAndLocation(
		int packageId, int locationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the pricings where packageId = &#63; and locationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param packageId the package ID
	* @param locationId the location ID
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @return the range of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Pricing> findByPackageAndLocation(
		int packageId, int locationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the pricings where packageId = &#63; and locationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param packageId the package ID
	* @param locationId the location ID
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Pricing> findByPackageAndLocation(
		int packageId, int locationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first pricing in the ordered set where packageId = &#63; and locationId = &#63;.
	*
	* @param packageId the package ID
	* @param locationId the location ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pricing
	* @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing findByPackageAndLocation_First(
		int packageId, int locationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException;

	/**
	* Returns the first pricing in the ordered set where packageId = &#63; and locationId = &#63;.
	*
	* @param packageId the package ID
	* @param locationId the location ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pricing, or <code>null</code> if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing fetchByPackageAndLocation_First(
		int packageId, int locationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last pricing in the ordered set where packageId = &#63; and locationId = &#63;.
	*
	* @param packageId the package ID
	* @param locationId the location ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pricing
	* @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing findByPackageAndLocation_Last(
		int packageId, int locationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException;

	/**
	* Returns the last pricing in the ordered set where packageId = &#63; and locationId = &#63;.
	*
	* @param packageId the package ID
	* @param locationId the location ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pricing, or <code>null</code> if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing fetchByPackageAndLocation_Last(
		int packageId, int locationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the pricings before and after the current pricing in the ordered set where packageId = &#63; and locationId = &#63;.
	*
	* @param pricingId the primary key of the current pricing
	* @param packageId the package ID
	* @param locationId the location ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next pricing
	* @throws com.ocms.course.NoSuchPricingException if a pricing with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing[] findByPackageAndLocation_PrevAndNext(
		long pricingId, int packageId, int locationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException;

	/**
	* Removes all the pricings where packageId = &#63; and locationId = &#63; from the database.
	*
	* @param packageId the package ID
	* @param locationId the location ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPackageAndLocation(int packageId, int locationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of pricings where packageId = &#63; and locationId = &#63;.
	*
	* @param packageId the package ID
	* @param locationId the location ID
	* @return the number of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public int countByPackageAndLocation(int packageId, int locationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the pricings where packageId = &#63; and locationId = &#63; and active = &#63;.
	*
	* @param packageId the package ID
	* @param locationId the location ID
	* @param active the active
	* @return the matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Pricing> findByPackageLocationActive(
		int packageId, int locationId, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the pricings where packageId = &#63; and locationId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param packageId the package ID
	* @param locationId the location ID
	* @param active the active
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @return the range of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Pricing> findByPackageLocationActive(
		int packageId, int locationId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the pricings where packageId = &#63; and locationId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param packageId the package ID
	* @param locationId the location ID
	* @param active the active
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Pricing> findByPackageLocationActive(
		int packageId, int locationId, int active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first pricing in the ordered set where packageId = &#63; and locationId = &#63; and active = &#63;.
	*
	* @param packageId the package ID
	* @param locationId the location ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pricing
	* @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing findByPackageLocationActive_First(
		int packageId, int locationId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException;

	/**
	* Returns the first pricing in the ordered set where packageId = &#63; and locationId = &#63; and active = &#63;.
	*
	* @param packageId the package ID
	* @param locationId the location ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pricing, or <code>null</code> if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing fetchByPackageLocationActive_First(
		int packageId, int locationId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last pricing in the ordered set where packageId = &#63; and locationId = &#63; and active = &#63;.
	*
	* @param packageId the package ID
	* @param locationId the location ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pricing
	* @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing findByPackageLocationActive_Last(
		int packageId, int locationId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException;

	/**
	* Returns the last pricing in the ordered set where packageId = &#63; and locationId = &#63; and active = &#63;.
	*
	* @param packageId the package ID
	* @param locationId the location ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pricing, or <code>null</code> if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing fetchByPackageLocationActive_Last(
		int packageId, int locationId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the pricings before and after the current pricing in the ordered set where packageId = &#63; and locationId = &#63; and active = &#63;.
	*
	* @param pricingId the primary key of the current pricing
	* @param packageId the package ID
	* @param locationId the location ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next pricing
	* @throws com.ocms.course.NoSuchPricingException if a pricing with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing[] findByPackageLocationActive_PrevAndNext(
		long pricingId, int packageId, int locationId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException;

	/**
	* Removes all the pricings where packageId = &#63; and locationId = &#63; and active = &#63; from the database.
	*
	* @param packageId the package ID
	* @param locationId the location ID
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPackageLocationActive(int packageId, int locationId,
		int active) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of pricings where packageId = &#63; and locationId = &#63; and active = &#63;.
	*
	* @param packageId the package ID
	* @param locationId the location ID
	* @param active the active
	* @return the number of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public int countByPackageLocationActive(int packageId, int locationId,
		int active) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the pricings where packageId = &#63; and active = &#63;.
	*
	* @param packageId the package ID
	* @param active the active
	* @return the matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Pricing> findByPackageAndActive(
		int packageId, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the pricings where packageId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param packageId the package ID
	* @param active the active
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @return the range of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Pricing> findByPackageAndActive(
		int packageId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the pricings where packageId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param packageId the package ID
	* @param active the active
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Pricing> findByPackageAndActive(
		int packageId, int active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first pricing in the ordered set where packageId = &#63; and active = &#63;.
	*
	* @param packageId the package ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pricing
	* @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing findByPackageAndActive_First(
		int packageId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException;

	/**
	* Returns the first pricing in the ordered set where packageId = &#63; and active = &#63;.
	*
	* @param packageId the package ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pricing, or <code>null</code> if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing fetchByPackageAndActive_First(
		int packageId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last pricing in the ordered set where packageId = &#63; and active = &#63;.
	*
	* @param packageId the package ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pricing
	* @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing findByPackageAndActive_Last(
		int packageId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException;

	/**
	* Returns the last pricing in the ordered set where packageId = &#63; and active = &#63;.
	*
	* @param packageId the package ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pricing, or <code>null</code> if a matching pricing could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing fetchByPackageAndActive_Last(
		int packageId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the pricings before and after the current pricing in the ordered set where packageId = &#63; and active = &#63;.
	*
	* @param pricingId the primary key of the current pricing
	* @param packageId the package ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next pricing
	* @throws com.ocms.course.NoSuchPricingException if a pricing with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing[] findByPackageAndActive_PrevAndNext(
		long pricingId, int packageId, int active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException;

	/**
	* Removes all the pricings where packageId = &#63; and active = &#63; from the database.
	*
	* @param packageId the package ID
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPackageAndActive(int packageId, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of pricings where packageId = &#63; and active = &#63;.
	*
	* @param packageId the package ID
	* @param active the active
	* @return the number of matching pricings
	* @throws SystemException if a system exception occurred
	*/
	public int countByPackageAndActive(int packageId, int active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the pricing in the entity cache if it is enabled.
	*
	* @param pricing the pricing
	*/
	public void cacheResult(com.ocms.course.model.Pricing pricing);

	/**
	* Caches the pricings in the entity cache if it is enabled.
	*
	* @param pricings the pricings
	*/
	public void cacheResult(
		java.util.List<com.ocms.course.model.Pricing> pricings);

	/**
	* Creates a new pricing with the primary key. Does not add the pricing to the database.
	*
	* @param pricingId the primary key for the new pricing
	* @return the new pricing
	*/
	public com.ocms.course.model.Pricing create(long pricingId);

	/**
	* Removes the pricing with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param pricingId the primary key of the pricing
	* @return the pricing that was removed
	* @throws com.ocms.course.NoSuchPricingException if a pricing with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing remove(long pricingId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException;

	public com.ocms.course.model.Pricing updateImpl(
		com.ocms.course.model.Pricing pricing)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the pricing with the primary key or throws a {@link com.ocms.course.NoSuchPricingException} if it could not be found.
	*
	* @param pricingId the primary key of the pricing
	* @return the pricing
	* @throws com.ocms.course.NoSuchPricingException if a pricing with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing findByPrimaryKey(long pricingId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchPricingException;

	/**
	* Returns the pricing with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param pricingId the primary key of the pricing
	* @return the pricing, or <code>null</code> if a pricing with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.ocms.course.model.Pricing fetchByPrimaryKey(long pricingId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the pricings.
	*
	* @return the pricings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Pricing> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.ocms.course.model.Pricing> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the pricings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of pricings
	* @param end the upper bound of the range of pricings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of pricings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.ocms.course.model.Pricing> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the pricings from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of pricings.
	*
	* @return the number of pricings
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}