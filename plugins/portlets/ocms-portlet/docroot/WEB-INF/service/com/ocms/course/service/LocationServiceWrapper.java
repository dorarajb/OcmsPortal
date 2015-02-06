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
 * Provides a wrapper for {@link LocationService}.
 *
 * @author doraraj
 * @see LocationService
 * @generated
 */
public class LocationServiceWrapper implements LocationService,
	ServiceWrapper<LocationService> {
	public LocationServiceWrapper(LocationService locationService) {
		_locationService = locationService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _locationService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_locationService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _locationService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.ocms.course.model.Location> getLocationByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _locationService.getLocationByGroupId(groupId);
	}

	@Override
	public java.util.List<com.ocms.course.model.Location> getLocationByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _locationService.getLocationByGroupId(groupId, start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.Location> getLocationByLocationId(
		long locationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _locationService.getLocationByLocationId(locationId);
	}

	@Override
	public java.util.List<com.ocms.course.model.Location> getLocationByLocationId(
		long locationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _locationService.getLocationByLocationId(locationId, start, end);
	}

	@Override
	public com.ocms.course.model.Location addLocation(long userId,
		java.lang.String name, java.lang.String code, java.lang.String notes,
		java.lang.String addressLine1, java.lang.String addressLine2,
		java.lang.String city, java.lang.String state, java.lang.String region,
		java.lang.String country, java.lang.String zip, java.lang.String phone,
		java.lang.String fax, java.lang.String email,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _locationService.addLocation(userId, name, code, notes,
			addressLine1, addressLine2, city, state, region, country, zip,
			phone, fax, email, serviceContext);
	}

	@Override
	public com.ocms.course.model.Location updateLocation(long userId,
		long locationId, java.lang.String name, java.lang.String code,
		java.lang.String notes, java.lang.String addressLine1,
		java.lang.String addressLine2, java.lang.String city,
		java.lang.String state, java.lang.String region,
		java.lang.String country, java.lang.String zip, java.lang.String phone,
		java.lang.String fax, java.lang.String email,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _locationService.updateLocation(userId, locationId, name, code,
			notes, addressLine1, addressLine2, city, state, region, country,
			zip, phone, fax, email, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LocationService getWrappedLocationService() {
		return _locationService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLocationService(LocationService locationService) {
		_locationService = locationService;
	}

	@Override
	public LocationService getWrappedService() {
		return _locationService;
	}

	@Override
	public void setWrappedService(LocationService locationService) {
		_locationService = locationService;
	}

	private LocationService _locationService;
}