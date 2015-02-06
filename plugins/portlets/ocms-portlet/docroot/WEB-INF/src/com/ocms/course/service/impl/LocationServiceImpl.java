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

package com.ocms.course.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.service.ServiceContext;
import com.ocms.course.LocationAddressLine1Exception;
import com.ocms.course.LocationAddressLine2Exception;
import com.ocms.course.LocationCityException;
import com.ocms.course.LocationCodeException;
import com.ocms.course.LocationCountryException;
import com.ocms.course.LocationEmailException;
import com.ocms.course.LocationFaxException;
import com.ocms.course.LocationNameException;
import com.ocms.course.LocationNotesException;
import com.ocms.course.LocationPhoneException;
import com.ocms.course.LocationRegionException;
import com.ocms.course.LocationStateException;
import com.ocms.course.LocationZipException;
import com.ocms.course.model.Location;
import com.ocms.course.service.base.LocationServiceBaseImpl;

/**
 * The implementation of the location remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ocms.course.service.LocationService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author doraraj
 * @see com.ocms.course.service.base.LocationServiceBaseImpl
 * @see com.ocms.course.service.LocationServiceUtil
 */
@AccessControlled(guestAccessEnabled=true)
@JSONWebService("location")
public class LocationServiceImpl extends LocationServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.ocms.course.service.LocationServiceUtil} to access the location remote service.
	 */
	public List<Location> getLocationByGroupId(long groupId) throws SystemException {
		return locationPersistence.findByGroupId(groupId);
	}
	
	public List<Location> getLocationByGroupId(long groupId, int start, int end) throws SystemException {
		return locationPersistence.findByGroupId(groupId, start, end);
	}
	
	public List<Location> getLocationByLocationId(long locationId) throws SystemException {
		return locationPersistence.findByLocationId(locationId);
	}
	
	public List<Location> getLocationByLocationId(long locationId, int start, int end) throws SystemException {
		return locationPersistence.findByLocationId(locationId, start, end);
	}
	
	protected void validate(String name, String code, String notes,
			String addressLine1, String addressLine2, String city,
			String state, String region, String country, String zip,
			String phone, String fax, String email) throws PortalException {
		if (Validator.isNull(name)) {
			throw new LocationNameException();
		}
		if (Validator.isNull(code)) {
			throw new LocationCodeException();
		}
		if (Validator.isNull(notes)) {
			throw new LocationNotesException();
		}
		if (Validator.isNull(addressLine1)) {
			throw new LocationAddressLine1Exception();
		}
		if (Validator.isNull(addressLine2)) {
			throw new LocationAddressLine2Exception();
		}
		if (Validator.isNull(city)) {
			throw new LocationCityException();
		}
		if (Validator.isNull(state)) {
			throw new LocationStateException();
		}
		if (Validator.isNull(region)) {
			throw new LocationRegionException();
		}
		if (Validator.isNull(country)) {
			throw new LocationCountryException();
		}
		if (Validator.isNull(zip)) {
			throw new LocationZipException();
		}
		if (Validator.isNull(phone)) {
			throw new LocationPhoneException();
		}
		if (Validator.isNull(fax)) {
			throw new LocationFaxException();
		}
		if (Validator.isNull(email)) {
			throw new LocationEmailException();
		}
	}
	
	public Location addLocation(long userId, String name, String code, String notes,
			String addressLine1, String addressLine2, String city,
			String state, String region, String country, String zip,
			String phone, String fax, String email, ServiceContext serviceContext) throws SystemException, PortalException {
		long groupId = serviceContext.getScopeGroupId();

		User user = userPersistence.findByPrimaryKey(userId);

		Date now = new Date();

		validate(name, code, notes, addressLine1, addressLine2, city, state,
				region, country, zip, phone, fax, email);

		long locationId = counterLocalService.increment();

		Location location = locationPersistence.create(locationId);

		location.setUserId(userId);
		location.setGroupId(groupId);
		location.setCompanyId(user.getCompanyId());
		location.setUserName(user.getFullName());
		location.setCreateDate(serviceContext.getCreateDate(now));
		location.setModifiedDate(serviceContext.getModifiedDate(now));
		location.setName(name);
		location.setCode(code);
		location.setNotes(notes);
		location.setAddressLine1(addressLine1);
		location.setAddressLine2(addressLine2);
		location.setCity(city);
		location.setState(state);
		location.setRegion(region);
		location.setCountry(country);
		location.setZipcode(zip);
		location.setPhone(phone);
		location.setFax(fax);
		location.setEmail(email);
		location.setExpandoBridgeAttributes(serviceContext);

		locationPersistence.update(location);

		return location;
	}
	
	public Location updateLocation(long userId, long locationId, String name, String code, String notes,
			String addressLine1, String addressLine2, String city,
			String state, String region, String country, String zip,
			String phone, String fax, String email, ServiceContext serviceContext) throws SystemException, PortalException {

		long groupId = serviceContext.getScopeGroupId();
		User user = userPersistence.findByPrimaryKey(userId);
		Date now = new Date();

		validate(name, code, notes, addressLine1, addressLine2, city, state,
				region, country, zip, phone, fax, email);

		List<Location> locationList = locationPersistence.findByLocationId(locationId);
		Location location = locationList.get(0);
		
		location.setUserId(userId);
		location.setGroupId(groupId);
		location.setCompanyId(user.getCompanyId());
		location.setUserName(user.getFullName());
		location.setCreateDate(serviceContext.getCreateDate(now));
		location.setModifiedDate(serviceContext.getModifiedDate(now));
		location.setName(name);
		location.setCode(code);
		location.setNotes(notes);
		location.setAddressLine1(addressLine1);
		location.setAddressLine2(addressLine2);
		location.setCity(city);
		location.setState(state);
		location.setRegion(region);
		location.setCountry(country);
		location.setZipcode(zip);
		location.setPhone(phone);
		location.setFax(fax);
		location.setEmail(email);
		location.setExpandoBridgeAttributes(serviceContext);

		locationPersistence.update(location);

		return location;
	}
}