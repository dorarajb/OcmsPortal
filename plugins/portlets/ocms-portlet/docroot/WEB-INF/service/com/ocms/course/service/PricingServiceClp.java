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

import com.liferay.portal.service.InvokableService;

/**
 * @author doraraj
 * @generated
 */
public class PricingServiceClp implements PricingService {
	public PricingServiceClp(InvokableService invokableService) {
		_invokableService = invokableService;

		_methodName0 = "getBeanIdentifier";

		_methodParameterTypes0 = new String[] {  };

		_methodName1 = "setBeanIdentifier";

		_methodParameterTypes1 = new String[] { "java.lang.String" };

		_methodName3 = "getPricingByGroupId";

		_methodParameterTypes3 = new String[] { "long" };

		_methodName4 = "getPricingByGroupId";

		_methodParameterTypes4 = new String[] { "long", "int", "int" };

		_methodName5 = "getPricingByCourseId";

		_methodParameterTypes5 = new String[] { "int" };

		_methodName6 = "getPricingByCourseId";

		_methodParameterTypes6 = new String[] { "int", "int", "int" };

		_methodName7 = "getPricingByPackageId";

		_methodParameterTypes7 = new String[] { "int" };

		_methodName8 = "getPricingByPackageId";

		_methodParameterTypes8 = new String[] { "int", "int", "int" };

		_methodName9 = "getPricingByPricingId";

		_methodParameterTypes9 = new String[] { "int" };

		_methodName10 = "getPricingByPricingId";

		_methodParameterTypes10 = new String[] { "int", "int", "int" };

		_methodName11 = "getPricingByPrice";

		_methodParameterTypes11 = new String[] { "int" };

		_methodName12 = "getPricingByPrice";

		_methodParameterTypes12 = new String[] { "int", "int", "int" };

		_methodName13 = "getPricingByPackageAndLocation";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getPricingByPackageAndLocation";

		_methodParameterTypes14 = new String[] { "int", "int", "int", "int" };

		_methodName15 = "getPricingByPackageLocationActive";

		_methodParameterTypes15 = new String[] { "int", "int", "int" };

		_methodName16 = "getPricingByPackageLocationActive";

		_methodParameterTypes16 = new String[] { "int", "int", "int", "int", "int" };

		_methodName17 = "getPricingByPackageIdAndActive";

		_methodParameterTypes17 = new String[] { "int", "int" };

		_methodName18 = "getPricingByPackageIdAndActive";

		_methodParameterTypes18 = new String[] { "int", "int", "int", "int" };

		_methodName19 = "addPricing";

		_methodParameterTypes19 = new String[] {
				"int", "int", "java.lang.String", "java.util.Date",
				"java.util.Date", "int", "int", "java.lang.String", "int",
				"java.lang.String", "int",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName20 = "updatePricing";

		_methodParameterTypes20 = new String[] {
				"int", "int", "java.lang.String", "java.util.Date",
				"java.util.Date", "int", "int", "java.lang.String", "int",
				"java.lang.String", "int", "long",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName21 = "deletePricingByLocationId";

		_methodParameterTypes21 = new String[] { "long" };

		_methodName22 = "deletePricingByPackageId";

		_methodParameterTypes22 = new String[] { "int" };

		_methodName23 = "deletePricingByGrouptId";

		_methodParameterTypes23 = new String[] { "long" };

		_methodName24 = "deleteAllPricing";

		_methodParameterTypes24 = new String[] {  };
	}

	@Override
	public java.lang.String getBeanIdentifier() {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName0,
					_methodParameterTypes0, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.lang.String)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		try {
			_invokableService.invokeMethod(_methodName1,
				_methodParameterTypes1,
				new Object[] { ClpSerializer.translateInput(beanIdentifier) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		throw new UnsupportedOperationException();
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName3,
					_methodParameterTypes3, new Object[] { groupId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.Pricing>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName4,
					_methodParameterTypes4, new Object[] { groupId, start, end });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.Pricing>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByCourseId(
		int courseId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName5,
					_methodParameterTypes5, new Object[] { courseId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.Pricing>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByCourseId(
		int courseId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName6,
					_methodParameterTypes6,
					new Object[] { courseId, start, end });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.Pricing>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByPackageId(
		int packageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName7,
					_methodParameterTypes7, new Object[] { packageId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.Pricing>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByPackageId(
		int packageId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName8,
					_methodParameterTypes8,
					new Object[] { packageId, start, end });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.Pricing>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByPricingId(
		int pricingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName9,
					_methodParameterTypes9, new Object[] { pricingId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.Pricing>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByPricingId(
		int pricingId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName10,
					_methodParameterTypes10,
					new Object[] { pricingId, start, end });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.Pricing>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByPrice(
		int price) throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName11,
					_methodParameterTypes11, new Object[] { price });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.Pricing>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByPrice(
		int price, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName12,
					_methodParameterTypes12, new Object[] { price, start, end });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.Pricing>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByPackageAndLocation(
		int packageId, int locationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName13,
					_methodParameterTypes13,
					new Object[] { packageId, locationId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.Pricing>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByPackageAndLocation(
		int packageId, int locationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName14,
					_methodParameterTypes14,
					new Object[] { packageId, locationId, start, end });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.Pricing>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByPackageLocationActive(
		int packageId, int locationId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName15,
					_methodParameterTypes15,
					new Object[] { packageId, locationId, active });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.Pricing>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByPackageLocationActive(
		int packageId, int locationId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName16,
					_methodParameterTypes16,
					new Object[] { packageId, locationId, active, start, end });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.Pricing>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByPackageIdAndActive(
		int packageId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName17,
					_methodParameterTypes17, new Object[] { packageId, active });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.Pricing>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.Pricing> getPricingByPackageIdAndActive(
		int packageId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName18,
					_methodParameterTypes18,
					new Object[] { packageId, active, start, end });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.ocms.course.model.Pricing>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.ocms.course.model.Pricing addPricing(int deposit, int price,
		java.lang.String currency, java.util.Date effectiveFromDate,
		java.util.Date effectiveToDate, int balanceDueParDate, int locationId,
		java.lang.String locationCode, int courseId,
		java.lang.String courseCode, int packageId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName19,
					_methodParameterTypes19,
					new Object[] {
						deposit,
						
					price,
						
					ClpSerializer.translateInput(currency),
						
					ClpSerializer.translateInput(effectiveFromDate),
						
					ClpSerializer.translateInput(effectiveToDate),
						
					balanceDueParDate,
						
					locationId,
						
					ClpSerializer.translateInput(locationCode),
						
					courseId,
						
					ClpSerializer.translateInput(courseCode),
						
					packageId,
						
					ClpSerializer.translateInput(serviceContext)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.ocms.course.model.Pricing)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.ocms.course.model.Pricing updatePricing(int deposit, int price,
		java.lang.String currency, java.util.Date effectiveFromDate,
		java.util.Date effectiveToDate, int balanceDueParDate, int locationId,
		java.lang.String locationCode, int courseId,
		java.lang.String courseCode, int packageId, long pricingId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName20,
					_methodParameterTypes20,
					new Object[] {
						deposit,
						
					price,
						
					ClpSerializer.translateInput(currency),
						
					ClpSerializer.translateInput(effectiveFromDate),
						
					ClpSerializer.translateInput(effectiveToDate),
						
					balanceDueParDate,
						
					locationId,
						
					ClpSerializer.translateInput(locationCode),
						
					courseId,
						
					ClpSerializer.translateInput(courseCode),
						
					packageId,
						
					pricingId,
						
					ClpSerializer.translateInput(serviceContext)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.ocms.course.model.Pricing)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void deletePricingByLocationId(long pricingId) {
		try {
			_invokableService.invokeMethod(_methodName21,
				_methodParameterTypes21, new Object[] { pricingId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void deletePricingByPackageId(int packageId) {
		try {
			_invokableService.invokeMethod(_methodName22,
				_methodParameterTypes22, new Object[] { packageId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void deletePricingByGrouptId(long groupId) {
		try {
			_invokableService.invokeMethod(_methodName23,
				_methodParameterTypes23, new Object[] { groupId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void deleteAllPricing() {
		try {
			_invokableService.invokeMethod(_methodName24,
				_methodParameterTypes24, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	private InvokableService _invokableService;
	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName16;
	private String[] _methodParameterTypes16;
	private String _methodName17;
	private String[] _methodParameterTypes17;
	private String _methodName18;
	private String[] _methodParameterTypes18;
	private String _methodName19;
	private String[] _methodParameterTypes19;
	private String _methodName20;
	private String[] _methodParameterTypes20;
	private String _methodName21;
	private String[] _methodParameterTypes21;
	private String _methodName22;
	private String[] _methodParameterTypes22;
	private String _methodName23;
	private String[] _methodParameterTypes23;
	private String _methodName24;
	private String[] _methodParameterTypes24;
}