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
public class StudentRegistrationServiceClp implements StudentRegistrationService {
	public StudentRegistrationServiceClp(InvokableService invokableService) {
		_invokableService = invokableService;

		_methodName0 = "getBeanIdentifier";

		_methodParameterTypes0 = new String[] {  };

		_methodName1 = "setBeanIdentifier";

		_methodParameterTypes1 = new String[] { "java.lang.String" };

		_methodName3 = "getStudentRegistrationByGroupId";

		_methodParameterTypes3 = new String[] { "long" };

		_methodName4 = "getStudentRegistrationByGroupId";

		_methodParameterTypes4 = new String[] { "long", "int", "int" };

		_methodName5 = "getStudentRegistrationByStudentRegistrationId";

		_methodParameterTypes5 = new String[] { "long" };

		_methodName6 = "getStudentRegistrationByStudentRegistrationId";

		_methodParameterTypes6 = new String[] { "long", "int", "int" };

		_methodName7 = "addStudentRegistration";

		_methodParameterTypes7 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "long", "long",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"long", "java.lang.String", "java.lang.String", "long",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName8 = "updateStudentRegistration";

		_methodParameterTypes8 = new String[] {
				"long", "long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "long", "long",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"long", "java.lang.String", "java.lang.String", "long",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName9 = "deleteStudentRegistrationByStudentRegistrationId";

		_methodParameterTypes9 = new String[] { "long" };

		_methodName10 = "deleteStudentRegistrationByGrouptId";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "deleteAllStudentRegistration";

		_methodParameterTypes11 = new String[] {  };
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
	public java.util.List<com.ocms.course.model.StudentRegistration> getStudentRegistrationByGroupId(
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

		return (java.util.List<com.ocms.course.model.StudentRegistration>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.StudentRegistration> getStudentRegistrationByGroupId(
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

		return (java.util.List<com.ocms.course.model.StudentRegistration>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.StudentRegistration> getStudentRegistrationByStudentRegistrationId(
		long studentRegistrationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName5,
					_methodParameterTypes5,
					new Object[] { studentRegistrationId });
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

		return (java.util.List<com.ocms.course.model.StudentRegistration>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.ocms.course.model.StudentRegistration> getStudentRegistrationByStudentRegistrationId(
		long studentRegistrationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName6,
					_methodParameterTypes6,
					new Object[] { studentRegistrationId, start, end });
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

		return (java.util.List<com.ocms.course.model.StudentRegistration>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.ocms.course.model.StudentRegistration addStudentRegistration(
		long userId, long contactId, java.lang.String memo,
		java.lang.String studRegStatus, java.lang.String advisorOrig,
		java.lang.String advisorReg, long coursePackageId, long discountId,
		java.lang.String commMethod, java.lang.String notes,
		java.lang.String currency, long tax, java.lang.String autoCharge,
		java.lang.String currencyPaid, long exchangeRate,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName7,
					_methodParameterTypes7,
					new Object[] {
						userId,
						
					contactId,
						
					ClpSerializer.translateInput(memo),
						
					ClpSerializer.translateInput(studRegStatus),
						
					ClpSerializer.translateInput(advisorOrig),
						
					ClpSerializer.translateInput(advisorReg),
						
					coursePackageId,
						
					discountId,
						
					ClpSerializer.translateInput(commMethod),
						
					ClpSerializer.translateInput(notes),
						
					ClpSerializer.translateInput(currency),
						
					tax,
						
					ClpSerializer.translateInput(autoCharge),
						
					ClpSerializer.translateInput(currencyPaid),
						
					exchangeRate,
						
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

		return (com.ocms.course.model.StudentRegistration)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.ocms.course.model.StudentRegistration updateStudentRegistration(
		long userId, long studentRegistrationId, long contactId,
		java.lang.String memo, java.lang.String studRegStatus,
		java.lang.String advisorOrig, java.lang.String advisorReg,
		long coursePackageId, long discountId, java.lang.String commMethod,
		java.lang.String notes, java.lang.String currency, long tax,
		java.lang.String autoCharge, java.lang.String currencyPaid,
		long exchangeRate,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName8,
					_methodParameterTypes8,
					new Object[] {
						userId,
						
					studentRegistrationId,
						
					contactId,
						
					ClpSerializer.translateInput(memo),
						
					ClpSerializer.translateInput(studRegStatus),
						
					ClpSerializer.translateInput(advisorOrig),
						
					ClpSerializer.translateInput(advisorReg),
						
					coursePackageId,
						
					discountId,
						
					ClpSerializer.translateInput(commMethod),
						
					ClpSerializer.translateInput(notes),
						
					ClpSerializer.translateInput(currency),
						
					tax,
						
					ClpSerializer.translateInput(autoCharge),
						
					ClpSerializer.translateInput(currencyPaid),
						
					exchangeRate,
						
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

		return (com.ocms.course.model.StudentRegistration)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void deleteStudentRegistrationByStudentRegistrationId(
		long studentRegistrationId) {
		try {
			_invokableService.invokeMethod(_methodName9,
				_methodParameterTypes9, new Object[] { studentRegistrationId });
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
	public void deleteStudentRegistrationByGrouptId(long groupId) {
		try {
			_invokableService.invokeMethod(_methodName10,
				_methodParameterTypes10, new Object[] { groupId });
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
	public void deleteAllStudentRegistration() {
		try {
			_invokableService.invokeMethod(_methodName11,
				_methodParameterTypes11, new Object[] {  });
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
}