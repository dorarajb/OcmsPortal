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
public class OffersAndDeductionsServiceClp implements OffersAndDeductionsService {
	public OffersAndDeductionsServiceClp(InvokableService invokableService) {
		_invokableService = invokableService;

		_methodName0 = "getBeanIdentifier";

		_methodParameterTypes0 = new String[] {  };

		_methodName1 = "setBeanIdentifier";

		_methodParameterTypes1 = new String[] { "java.lang.String" };

		_methodName3 = "getOffersAndDeductionsByGroupId";

		_methodParameterTypes3 = new String[] { "long" };

		_methodName4 = "getOffersAndDeductionsByGroupId";

		_methodParameterTypes4 = new String[] { "long", "int", "int" };

		_methodName5 = "getOffersAndDeductionsByid";

		_methodParameterTypes5 = new String[] { "int" };

		_methodName6 = "getOffersAndDeductionsByid";

		_methodParameterTypes6 = new String[] { "int", "int", "int" };

		_methodName7 = "getOffersAndDeductionsByCode";

		_methodParameterTypes7 = new String[] { "java.lang.String" };

		_methodName8 = "getOffersAndDeductionsByCode";

		_methodParameterTypes8 = new String[] { "java.lang.String", "int", "int" };

		_methodName9 = "getOffersAndDeductionsByActive";

		_methodParameterTypes9 = new String[] { "int" };

		_methodName10 = "getOffersAndDeductionsByActive";

		_methodParameterTypes10 = new String[] { "int", "int", "int" };

		_methodName11 = "getOffersAndDeductionsByType";

		_methodParameterTypes11 = new String[] { "java.lang.String" };

		_methodName12 = "getOffersAndDeductionsByType";

		_methodParameterTypes12 = new String[] { "java.lang.String", "int", "int" };

		_methodName13 = "getOffersAndDeductionsByGroupIdAndActive";

		_methodParameterTypes13 = new String[] { "long", "int" };

		_methodName14 = "getOffersAndDeductionsByGroupIdAndActive";

		_methodParameterTypes14 = new String[] { "long", "int", "int", "int" };

		_methodName15 = "getOffersAndDeductionsByidAndActive";

		_methodParameterTypes15 = new String[] { "long", "int" };

		_methodName16 = "getOffersAndDeductionsByidAndActive";

		_methodParameterTypes16 = new String[] { "long", "int", "int", "int" };

		_methodName17 = "getOffersAndDeductionsByCodeAndActive";

		_methodParameterTypes17 = new String[] { "java.lang.String", "int" };

		_methodName18 = "getOffersAndDeductionsByCodeAndActive";

		_methodParameterTypes18 = new String[] {
				"java.lang.String", "int", "int", "int"
			};

		_methodName19 = "getOffersAndDeductionsByGroupIdTypeActive";

		_methodParameterTypes19 = new String[] { "long", "java.lang.String", "int" };

		_methodName20 = "getOffersAndDeductionsByGroupIdTypeActive";

		_methodParameterTypes20 = new String[] {
				"long", "java.lang.String", "int", "int", "int"
			};

		_methodName21 = "addOffersAndDeductions";

		_methodParameterTypes21 = new String[] {
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.util.Date", "java.util.Date", "long",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName22 = "updateOffersAndDeductions";

		_methodParameterTypes22 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.util.Date", "java.util.Date", "long",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName23 = "deleteOffersAndDeductionsById";

		_methodParameterTypes23 = new String[] { "long" };

		_methodName24 = "deleteOffersAndDeductionsByType";

		_methodParameterTypes24 = new String[] { "java.lang.String" };

		_methodName25 = "deleteOffersAndDeductionsByGrouptId";

		_methodParameterTypes25 = new String[] { "long" };

		_methodName26 = "deleteAllOffersAndDeductions";

		_methodParameterTypes26 = new String[] {  };
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
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByGroupId(
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

		return (java.util.List<com.ocms.course.model.OffersAndDeductions>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByGroupId(
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

		return (java.util.List<com.ocms.course.model.OffersAndDeductions>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByid(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName5,
					_methodParameterTypes5, new Object[] { id });
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

		return (java.util.List<com.ocms.course.model.OffersAndDeductions>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByid(
		int id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName6,
					_methodParameterTypes6, new Object[] { id, start, end });
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

		return (java.util.List<com.ocms.course.model.OffersAndDeductions>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName7,
					_methodParameterTypes7,
					new Object[] { ClpSerializer.translateInput(code) });
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

		return (java.util.List<com.ocms.course.model.OffersAndDeductions>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByCode(
		java.lang.String code, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName8,
					_methodParameterTypes8,
					new Object[] { ClpSerializer.translateInput(code), start, end });
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

		return (java.util.List<com.ocms.course.model.OffersAndDeductions>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByActive(
		int active) throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName9,
					_methodParameterTypes9, new Object[] { active });
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

		return (java.util.List<com.ocms.course.model.OffersAndDeductions>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByActive(
		int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName10,
					_methodParameterTypes10, new Object[] { active, start, end });
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

		return (java.util.List<com.ocms.course.model.OffersAndDeductions>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByType(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName11,
					_methodParameterTypes11,
					new Object[] { ClpSerializer.translateInput(type) });
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

		return (java.util.List<com.ocms.course.model.OffersAndDeductions>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByType(
		java.lang.String type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName12,
					_methodParameterTypes12,
					new Object[] { ClpSerializer.translateInput(type), start, end });
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

		return (java.util.List<com.ocms.course.model.OffersAndDeductions>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByGroupIdAndActive(
		long groupId, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName13,
					_methodParameterTypes13, new Object[] { groupId, active });
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

		return (java.util.List<com.ocms.course.model.OffersAndDeductions>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByGroupIdAndActive(
		long groupId, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName14,
					_methodParameterTypes14,
					new Object[] { groupId, active, start, end });
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

		return (java.util.List<com.ocms.course.model.OffersAndDeductions>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByidAndActive(
		long id, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName15,
					_methodParameterTypes15, new Object[] { id, active });
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

		return (java.util.List<com.ocms.course.model.OffersAndDeductions>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByidAndActive(
		long id, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName16,
					_methodParameterTypes16,
					new Object[] { id, active, start, end });
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

		return (java.util.List<com.ocms.course.model.OffersAndDeductions>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByCodeAndActive(
		java.lang.String code, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName17,
					_methodParameterTypes17,
					new Object[] { ClpSerializer.translateInput(code), active });
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

		return (java.util.List<com.ocms.course.model.OffersAndDeductions>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByCodeAndActive(
		java.lang.String code, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName18,
					_methodParameterTypes18,
					new Object[] {
						ClpSerializer.translateInput(code),
						
					active,
						
					start,
						
					end
					});
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

		return (java.util.List<com.ocms.course.model.OffersAndDeductions>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByGroupIdTypeActive(
		long groupId, java.lang.String type, int active)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName19,
					_methodParameterTypes19,
					new Object[] {
						groupId,
						
					ClpSerializer.translateInput(type),
						
					active
					});
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

		return (java.util.List<com.ocms.course.model.OffersAndDeductions>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.OffersAndDeductions> getOffersAndDeductionsByGroupIdTypeActive(
		long groupId, java.lang.String type, int active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName20,
					_methodParameterTypes20,
					new Object[] {
						groupId,
						
					ClpSerializer.translateInput(type),
						
					active,
						
					start,
						
					end
					});
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

		return (java.util.List<com.ocms.course.model.OffersAndDeductions>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.ocms.course.model.OffersAndDeductions addOffersAndDeductions(
		java.lang.String code, java.lang.String type,
		java.lang.String description, java.util.Date effectiveFromDate,
		java.util.Date effectiveToDate, long amount,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName21,
					_methodParameterTypes21,
					new Object[] {
						ClpSerializer.translateInput(code),
						
					ClpSerializer.translateInput(type),
						
					ClpSerializer.translateInput(description),
						
					ClpSerializer.translateInput(effectiveFromDate),
						
					ClpSerializer.translateInput(effectiveToDate),
						
					amount,
						
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

		return (com.ocms.course.model.OffersAndDeductions)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.ocms.course.model.OffersAndDeductions updateOffersAndDeductions(
		long id, java.lang.String code, java.lang.String type,
		java.lang.String description, java.util.Date effectiveFromDate,
		java.util.Date effectiveToDate, long amount,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName22,
					_methodParameterTypes22,
					new Object[] {
						id,
						
					ClpSerializer.translateInput(code),
						
					ClpSerializer.translateInput(type),
						
					ClpSerializer.translateInput(description),
						
					ClpSerializer.translateInput(effectiveFromDate),
						
					ClpSerializer.translateInput(effectiveToDate),
						
					amount,
						
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

		return (com.ocms.course.model.OffersAndDeductions)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void deleteOffersAndDeductionsById(long id) {
		try {
			_invokableService.invokeMethod(_methodName23,
				_methodParameterTypes23, new Object[] { id });
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
	public void deleteOffersAndDeductionsByType(java.lang.String type) {
		try {
			_invokableService.invokeMethod(_methodName24,
				_methodParameterTypes24,
				new Object[] { ClpSerializer.translateInput(type) });
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
	public void deleteOffersAndDeductionsByGrouptId(long groupId) {
		try {
			_invokableService.invokeMethod(_methodName25,
				_methodParameterTypes25, new Object[] { groupId });
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
	public void deleteAllOffersAndDeductions() {
		try {
			_invokableService.invokeMethod(_methodName26,
				_methodParameterTypes26, new Object[] {  });
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
	private String _methodName25;
	private String[] _methodParameterTypes25;
	private String _methodName26;
	private String[] _methodParameterTypes26;
}