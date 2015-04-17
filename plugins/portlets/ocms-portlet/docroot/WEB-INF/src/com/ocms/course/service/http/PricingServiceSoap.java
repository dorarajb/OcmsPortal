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

package com.ocms.course.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.ocms.course.service.PricingServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.ocms.course.service.PricingServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.ocms.course.model.PricingSoap}.
 * If the method in the service utility returns a
 * {@link com.ocms.course.model.Pricing}, that is translated to a
 * {@link com.ocms.course.model.PricingSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author doraraj
 * @see PricingServiceHttp
 * @see com.ocms.course.model.PricingSoap
 * @see com.ocms.course.service.PricingServiceUtil
 * @generated
 */
public class PricingServiceSoap {
	public static com.ocms.course.model.PricingSoap[] getPricingByGroupId(
		long groupId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Pricing> returnValue = PricingServiceUtil.getPricingByGroupId(groupId);

			return com.ocms.course.model.PricingSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.PricingSoap[] getPricingByGroupId(
		long groupId, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Pricing> returnValue = PricingServiceUtil.getPricingByGroupId(groupId,
					start, end);

			return com.ocms.course.model.PricingSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.PricingSoap[] getPricingByCourseId(
		int courseId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Pricing> returnValue = PricingServiceUtil.getPricingByCourseId(courseId);

			return com.ocms.course.model.PricingSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.PricingSoap[] getPricingByCourseId(
		int courseId, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Pricing> returnValue = PricingServiceUtil.getPricingByCourseId(courseId,
					start, end);

			return com.ocms.course.model.PricingSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.PricingSoap[] getPricingByPackageId(
		int packageId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Pricing> returnValue = PricingServiceUtil.getPricingByPackageId(packageId);

			return com.ocms.course.model.PricingSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.PricingSoap[] getPricingByPackageId(
		int packageId, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Pricing> returnValue = PricingServiceUtil.getPricingByPackageId(packageId,
					start, end);

			return com.ocms.course.model.PricingSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.PricingSoap[] getPricingByPricingId(
		int pricingId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Pricing> returnValue = PricingServiceUtil.getPricingByPricingId(pricingId);

			return com.ocms.course.model.PricingSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.PricingSoap[] getPricingByPricingId(
		int pricingId, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Pricing> returnValue = PricingServiceUtil.getPricingByPricingId(pricingId,
					start, end);

			return com.ocms.course.model.PricingSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.PricingSoap[] getPricingByPrice(
		int price) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Pricing> returnValue = PricingServiceUtil.getPricingByPrice(price);

			return com.ocms.course.model.PricingSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.PricingSoap[] getPricingByPrice(
		int price, int start, int end) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Pricing> returnValue = PricingServiceUtil.getPricingByPrice(price,
					start, end);

			return com.ocms.course.model.PricingSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.PricingSoap[] getPricingByPackageAndLocation(
		int packageId, int locationId) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Pricing> returnValue = PricingServiceUtil.getPricingByPackageAndLocation(packageId,
					locationId);

			return com.ocms.course.model.PricingSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.PricingSoap[] getPricingByPackageAndLocation(
		int packageId, int locationId, int start, int end)
		throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Pricing> returnValue = PricingServiceUtil.getPricingByPackageAndLocation(packageId,
					locationId, start, end);

			return com.ocms.course.model.PricingSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.PricingSoap[] getPricingByPackageLocationActive(
		int packageId, int locationId, int active) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Pricing> returnValue = PricingServiceUtil.getPricingByPackageLocationActive(packageId,
					locationId, active);

			return com.ocms.course.model.PricingSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.PricingSoap[] getPricingByPackageLocationActive(
		int packageId, int locationId, int active, int start, int end)
		throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Pricing> returnValue = PricingServiceUtil.getPricingByPackageLocationActive(packageId,
					locationId, active, start, end);

			return com.ocms.course.model.PricingSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.PricingSoap[] getPricingByPackageIdAndActive(
		int packageId, int active) throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Pricing> returnValue = PricingServiceUtil.getPricingByPackageIdAndActive(packageId,
					active);

			return com.ocms.course.model.PricingSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.PricingSoap[] getPricingByPackageIdAndActive(
		int packageId, int active, int start, int end)
		throws RemoteException {
		try {
			java.util.List<com.ocms.course.model.Pricing> returnValue = PricingServiceUtil.getPricingByPackageIdAndActive(packageId,
					active, start, end);

			return com.ocms.course.model.PricingSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.PricingSoap addPricing(int deposit,
		int price, java.lang.String currency, java.util.Date effectiveFromDate,
		java.util.Date effectiveToDate, int balanceDueParDate, int locationId,
		java.lang.String locationCode, int courseId,
		java.lang.String courseCode, int packageId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.ocms.course.model.Pricing returnValue = PricingServiceUtil.addPricing(deposit,
					price, currency, effectiveFromDate, effectiveToDate,
					balanceDueParDate, locationId, locationCode, courseId,
					courseCode, packageId, serviceContext);

			return com.ocms.course.model.PricingSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.ocms.course.model.PricingSoap updatePricing(int deposit,
		int price, java.lang.String currency, java.util.Date effectiveFromDate,
		java.util.Date effectiveToDate, int balanceDueParDate, int locationId,
		java.lang.String locationCode, int courseId,
		java.lang.String courseCode, int packageId, long pricingId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.ocms.course.model.Pricing returnValue = PricingServiceUtil.updatePricing(deposit,
					price, currency, effectiveFromDate, effectiveToDate,
					balanceDueParDate, locationId, locationCode, courseId,
					courseCode, packageId, pricingId, serviceContext);

			return com.ocms.course.model.PricingSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deletePricingByLocationId(long pricingId)
		throws RemoteException {
		try {
			PricingServiceUtil.deletePricingByLocationId(pricingId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deletePricingByPackageId(int packageId)
		throws RemoteException {
		try {
			PricingServiceUtil.deletePricingByPackageId(packageId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deletePricingByGrouptId(long groupId)
		throws RemoteException {
		try {
			PricingServiceUtil.deletePricingByGrouptId(groupId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteAllPricing() throws RemoteException {
		try {
			PricingServiceUtil.deleteAllPricing();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(PricingServiceSoap.class);
}