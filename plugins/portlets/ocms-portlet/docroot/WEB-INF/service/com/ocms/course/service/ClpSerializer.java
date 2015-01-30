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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import com.ocms.course.model.ContactClp;
import com.ocms.course.model.CourseClp;
import com.ocms.course.model.CoursePackageClp;
import com.ocms.course.model.CourseSeriesClp;
import com.ocms.course.model.LocationClp;
import com.ocms.course.model.PricingClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author doraraj
 */
public class ClpSerializer {
	public static String getServletContextName() {
		if (Validator.isNotNull(_servletContextName)) {
			return _servletContextName;
		}

		synchronized (ClpSerializer.class) {
			if (Validator.isNotNull(_servletContextName)) {
				return _servletContextName;
			}

			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Class<?> portletPropsClass = classLoader.loadClass(
						"com.liferay.util.portlet.PortletProps");

				Method getMethod = portletPropsClass.getMethod("get",
						new Class<?>[] { String.class });

				String portletPropsServletContextName = (String)getMethod.invoke(null,
						"ocms-portlet-deployment-context");

				if (Validator.isNotNull(portletPropsServletContextName)) {
					_servletContextName = portletPropsServletContextName;
				}
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Unable to locate deployment context from portlet properties");
				}
			}

			if (Validator.isNull(_servletContextName)) {
				try {
					String propsUtilServletContextName = PropsUtil.get(
							"ocms-portlet-deployment-context");

					if (Validator.isNotNull(propsUtilServletContextName)) {
						_servletContextName = propsUtilServletContextName;
					}
				}
				catch (Throwable t) {
					if (_log.isInfoEnabled()) {
						_log.info(
							"Unable to locate deployment context from portal properties");
					}
				}
			}

			if (Validator.isNull(_servletContextName)) {
				_servletContextName = "ocms-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(ContactClp.class.getName())) {
			return translateInputContact(oldModel);
		}

		if (oldModelClassName.equals(CourseClp.class.getName())) {
			return translateInputCourse(oldModel);
		}

		if (oldModelClassName.equals(CoursePackageClp.class.getName())) {
			return translateInputCoursePackage(oldModel);
		}

		if (oldModelClassName.equals(CourseSeriesClp.class.getName())) {
			return translateInputCourseSeries(oldModel);
		}

		if (oldModelClassName.equals(LocationClp.class.getName())) {
			return translateInputLocation(oldModel);
		}

		if (oldModelClassName.equals(PricingClp.class.getName())) {
			return translateInputPricing(oldModel);
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInputContact(BaseModel<?> oldModel) {
		ContactClp oldClpModel = (ContactClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getContactRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCourse(BaseModel<?> oldModel) {
		CourseClp oldClpModel = (CourseClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCourseRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCoursePackage(BaseModel<?> oldModel) {
		CoursePackageClp oldClpModel = (CoursePackageClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCoursePackageRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCourseSeries(BaseModel<?> oldModel) {
		CourseSeriesClp oldClpModel = (CourseSeriesClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCourseSeriesRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputLocation(BaseModel<?> oldModel) {
		LocationClp oldClpModel = (LocationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getLocationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPricing(BaseModel<?> oldModel) {
		PricingClp oldClpModel = (PricingClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPricingRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals("com.ocms.course.model.impl.ContactImpl")) {
			return translateOutputContact(oldModel);
		}

		if (oldModelClassName.equals("com.ocms.course.model.impl.CourseImpl")) {
			return translateOutputCourse(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ocms.course.model.impl.CoursePackageImpl")) {
			return translateOutputCoursePackage(oldModel);
		}

		if (oldModelClassName.equals(
					"com.ocms.course.model.impl.CourseSeriesImpl")) {
			return translateOutputCourseSeries(oldModel);
		}

		if (oldModelClassName.equals("com.ocms.course.model.impl.LocationImpl")) {
			return translateOutputLocation(oldModel);
		}

		if (oldModelClassName.equals("com.ocms.course.model.impl.PricingImpl")) {
			return translateOutputPricing(oldModel);
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Throwable translateThrowable(Throwable throwable) {
		if (_useReflectionToTranslateThrowable) {
			try {
				UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

				objectOutputStream.writeObject(throwable);

				objectOutputStream.flush();
				objectOutputStream.close();

				UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
						0, unsyncByteArrayOutputStream.size());

				Thread currentThread = Thread.currentThread();

				ClassLoader contextClassLoader = currentThread.getContextClassLoader();

				ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
						contextClassLoader);

				throwable = (Throwable)objectInputStream.readObject();

				objectInputStream.close();

				return throwable;
			}
			catch (SecurityException se) {
				if (_log.isInfoEnabled()) {
					_log.info("Do not use reflection to translate throwable");
				}

				_useReflectionToTranslateThrowable = false;
			}
			catch (Throwable throwable2) {
				_log.error(throwable2, throwable2);

				return throwable2;
			}
		}

		Class<?> clazz = throwable.getClass();

		String className = clazz.getName();

		if (className.equals(PortalException.class.getName())) {
			return new PortalException();
		}

		if (className.equals(SystemException.class.getName())) {
			return new SystemException();
		}

		if (className.equals("com.ocms.course.ContactAddressLine1Exception")) {
			return new com.ocms.course.ContactAddressLine1Exception();
		}

		if (className.equals("com.ocms.course.ContactAddressLine2Exception")) {
			return new com.ocms.course.ContactAddressLine2Exception();
		}

		if (className.equals("com.ocms.course.ContactCityException")) {
			return new com.ocms.course.ContactCityException();
		}

		if (className.equals("com.ocms.course.ContactEmailException")) {
			return new com.ocms.course.ContactEmailException();
		}

		if (className.equals("com.ocms.course.ContactFaxException")) {
			return new com.ocms.course.ContactFaxException();
		}

		if (className.equals("com.ocms.course.ContactNameException")) {
			return new com.ocms.course.ContactNameException();
		}

		if (className.equals("com.ocms.course.ContactPhoneException")) {
			return new com.ocms.course.ContactPhoneException();
		}

		if (className.equals("com.ocms.course.ContactRegionException")) {
			return new com.ocms.course.ContactRegionException();
		}

		if (className.equals("com.ocms.course.ContactStateException")) {
			return new com.ocms.course.ContactStateException();
		}

		if (className.equals("com.ocms.course.ContactTypeException")) {
			return new com.ocms.course.ContactTypeException();
		}

		if (className.equals("com.ocms.course.ContactZipException")) {
			return new com.ocms.course.ContactZipException();
		}

		if (className.equals("com.ocms.course.CourseCodeException")) {
			return new com.ocms.course.CourseCodeException();
		}

		if (className.equals("com.ocms.course.CourseDurationException")) {
			return new com.ocms.course.CourseDurationException();
		}

		if (className.equals("com.ocms.course.CourseNameException")) {
			return new com.ocms.course.CourseNameException();
		}

		if (className.equals("com.ocms.course.CoursePackageCodeException")) {
			return new com.ocms.course.CoursePackageCodeException();
		}

		if (className.equals("com.ocms.course.CoursePackageNameException")) {
			return new com.ocms.course.CoursePackageNameException();
		}

		if (className.equals("com.ocms.course.CourseSeriesEndDateException")) {
			return new com.ocms.course.CourseSeriesEndDateException();
		}

		if (className.equals(
					"com.ocms.course.CourseSeriesMaxNoStudRegException")) {
			return new com.ocms.course.CourseSeriesMaxNoStudRegException();
		}

		if (className.equals(
					"com.ocms.course.CourseSeriesPublishStatusException")) {
			return new com.ocms.course.CourseSeriesPublishStatusException();
		}

		if (className.equals("com.ocms.course.CourseSeriesStartDateException")) {
			return new com.ocms.course.CourseSeriesStartDateException();
		}

		if (className.equals("com.ocms.course.CourseSeriesTypeException")) {
			return new com.ocms.course.CourseSeriesTypeException();
		}

		if (className.equals("com.ocms.course.CurrencyException")) {
			return new com.ocms.course.CurrencyException();
		}

		if (className.equals("com.ocms.course.DepositException")) {
			return new com.ocms.course.DepositException();
		}

		if (className.equals("com.ocms.course.EffectiveDateException")) {
			return new com.ocms.course.EffectiveDateException();
		}

		if (className.equals("com.ocms.course.LocationAddressLine1Exception")) {
			return new com.ocms.course.LocationAddressLine1Exception();
		}

		if (className.equals("com.ocms.course.LocationAddressLine2Exception")) {
			return new com.ocms.course.LocationAddressLine2Exception();
		}

		if (className.equals("com.ocms.course.LocationCityException")) {
			return new com.ocms.course.LocationCityException();
		}

		if (className.equals("com.ocms.course.LocationCodeException")) {
			return new com.ocms.course.LocationCodeException();
		}

		if (className.equals("com.ocms.course.LocationCountryException")) {
			return new com.ocms.course.LocationCountryException();
		}

		if (className.equals("com.ocms.course.LocationEmailException")) {
			return new com.ocms.course.LocationEmailException();
		}

		if (className.equals("com.ocms.course.LocationFaxException")) {
			return new com.ocms.course.LocationFaxException();
		}

		if (className.equals("com.ocms.course.LocationNameException")) {
			return new com.ocms.course.LocationNameException();
		}

		if (className.equals("com.ocms.course.LocationNotesException")) {
			return new com.ocms.course.LocationNotesException();
		}

		if (className.equals("com.ocms.course.LocationPhoneException")) {
			return new com.ocms.course.LocationPhoneException();
		}

		if (className.equals("com.ocms.course.LocationRegionException")) {
			return new com.ocms.course.LocationRegionException();
		}

		if (className.equals("com.ocms.course.LocationStateException")) {
			return new com.ocms.course.LocationStateException();
		}

		if (className.equals("com.ocms.course.LocationZipException")) {
			return new com.ocms.course.LocationZipException();
		}

		if (className.equals("com.ocms.course.PriceException")) {
			return new com.ocms.course.PriceException();
		}

		if (className.equals("com.ocms.course.PricingCourseIdException")) {
			return new com.ocms.course.PricingCourseIdException();
		}

		if (className.equals("com.ocms.course.PricingLocationIdException")) {
			return new com.ocms.course.PricingLocationIdException();
		}

		if (className.equals("com.ocms.course.PricingPackageIdException")) {
			return new com.ocms.course.PricingPackageIdException();
		}

		if (className.equals("com.ocms.course.NoSuchContactException")) {
			return new com.ocms.course.NoSuchContactException();
		}

		if (className.equals("com.ocms.course.NoSuchCourseException")) {
			return new com.ocms.course.NoSuchCourseException();
		}

		if (className.equals("com.ocms.course.NoSuchCoursePackageException")) {
			return new com.ocms.course.NoSuchCoursePackageException();
		}

		if (className.equals("com.ocms.course.NoSuchCourseSeriesException")) {
			return new com.ocms.course.NoSuchCourseSeriesException();
		}

		if (className.equals("com.ocms.course.NoSuchLocationException")) {
			return new com.ocms.course.NoSuchLocationException();
		}

		if (className.equals("com.ocms.course.NoSuchPricingException")) {
			return new com.ocms.course.NoSuchPricingException();
		}

		return throwable;
	}

	public static Object translateOutputContact(BaseModel<?> oldModel) {
		ContactClp newModel = new ContactClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setContactRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCourse(BaseModel<?> oldModel) {
		CourseClp newModel = new CourseClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCourseRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCoursePackage(BaseModel<?> oldModel) {
		CoursePackageClp newModel = new CoursePackageClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCoursePackageRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCourseSeries(BaseModel<?> oldModel) {
		CourseSeriesClp newModel = new CourseSeriesClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCourseSeriesRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputLocation(BaseModel<?> oldModel) {
		LocationClp newModel = new LocationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setLocationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPricing(BaseModel<?> oldModel) {
		PricingClp newModel = new PricingClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPricingRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}