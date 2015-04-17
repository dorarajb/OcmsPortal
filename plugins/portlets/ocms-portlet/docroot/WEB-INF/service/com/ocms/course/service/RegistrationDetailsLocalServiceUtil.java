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
 * Provides the local service utility for RegistrationDetails. This utility wraps
 * {@link com.ocms.course.service.impl.RegistrationDetailsLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author doraraj
 * @see RegistrationDetailsLocalService
 * @see com.ocms.course.service.base.RegistrationDetailsLocalServiceBaseImpl
 * @see com.ocms.course.service.impl.RegistrationDetailsLocalServiceImpl
 * @generated
 */
public class RegistrationDetailsLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.ocms.course.service.impl.RegistrationDetailsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the registration details to the database. Also notifies the appropriate model listeners.
	*
	* @param registrationDetails the registration details
	* @return the registration details that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.RegistrationDetails addRegistrationDetails(
		com.ocms.course.model.RegistrationDetails registrationDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addRegistrationDetails(registrationDetails);
	}

	/**
	* Creates a new registration details with the primary key. Does not add the registration details to the database.
	*
	* @param registrationDetailsId the primary key for the new registration details
	* @return the new registration details
	*/
	public static com.ocms.course.model.RegistrationDetails createRegistrationDetails(
		long registrationDetailsId) {
		return getService().createRegistrationDetails(registrationDetailsId);
	}

	/**
	* Deletes the registration details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param registrationDetailsId the primary key of the registration details
	* @return the registration details that was removed
	* @throws PortalException if a registration details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.RegistrationDetails deleteRegistrationDetails(
		long registrationDetailsId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteRegistrationDetails(registrationDetailsId);
	}

	/**
	* Deletes the registration details from the database. Also notifies the appropriate model listeners.
	*
	* @param registrationDetails the registration details
	* @return the registration details that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.RegistrationDetails deleteRegistrationDetails(
		com.ocms.course.model.RegistrationDetails registrationDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteRegistrationDetails(registrationDetails);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.RegistrationDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.RegistrationDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.ocms.course.model.RegistrationDetails fetchRegistrationDetails(
		long registrationDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchRegistrationDetails(registrationDetailsId);
	}

	/**
	* Returns the registration details with the primary key.
	*
	* @param registrationDetailsId the primary key of the registration details
	* @return the registration details
	* @throws PortalException if a registration details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.RegistrationDetails getRegistrationDetails(
		long registrationDetailsId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getRegistrationDetails(registrationDetailsId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the registration detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.RegistrationDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of registration detailses
	* @param end the upper bound of the range of registration detailses (not inclusive)
	* @return the range of registration detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.RegistrationDetails> getRegistrationDetailses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getRegistrationDetailses(start, end);
	}

	/**
	* Returns the number of registration detailses.
	*
	* @return the number of registration detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int getRegistrationDetailsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getRegistrationDetailsesCount();
	}

	/**
	* Updates the registration details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param registrationDetails the registration details
	* @return the registration details that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.RegistrationDetails updateRegistrationDetails(
		com.ocms.course.model.RegistrationDetails registrationDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateRegistrationDetails(registrationDetails);
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

	public static java.util.List<com.ocms.course.model.RegistrationDetails> getRegistrationDetailsByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getRegistrationDetailsByGroupId(groupId);
	}

	public static java.util.List<com.ocms.course.model.RegistrationDetails> getRegistrationDetailsByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getRegistrationDetailsByGroupId(groupId, start, end);
	}

	public static java.util.List<com.ocms.course.model.RegistrationDetails> getRegistrationDetailsByRegistrationDetailsId(
		long registrationDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getRegistrationDetailsByRegistrationDetailsId(registrationDetailsId);
	}

	public static java.util.List<com.ocms.course.model.RegistrationDetails> getRegistrationDetailsByRegistrationDetailsId(
		long registrationDetailsId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getRegistrationDetailsByRegistrationDetailsId(registrationDetailsId,
			start, end);
	}

	public static com.ocms.course.model.RegistrationDetails addRegistrationDetails(
		long userId, long studRegId, long contactId, long eventId,
		double price, double discount, double fee, double credit,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addRegistrationDetails(userId, studRegId, contactId,
			eventId, price, discount, fee, credit, serviceContext);
	}

	public static com.ocms.course.model.RegistrationDetails updateRegistrationDetails(
		long userId, long registrationDetailsId, long studRegId,
		long contactId, long eventId, double price, double discount,
		double fee, double credit,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateRegistrationDetails(userId, registrationDetailsId,
			studRegId, contactId, eventId, price, discount, fee, credit,
			serviceContext);
	}

	public static void deleteRegistrationDetailsByRegistrationDetailsId(
		long registrationDetailsId) {
		getService()
			.deleteRegistrationDetailsByRegistrationDetailsId(registrationDetailsId);
	}

	public static void deleteRegistrationDetailsByGrouptId(long groupId) {
		getService().deleteRegistrationDetailsByGrouptId(groupId);
	}

	public static void deleteAllRegistrationDetails() {
		getService().deleteAllRegistrationDetails();
	}

	public static void clearService() {
		_service = null;
	}

	public static RegistrationDetailsLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					RegistrationDetailsLocalService.class.getName());

			if (invokableLocalService instanceof RegistrationDetailsLocalService) {
				_service = (RegistrationDetailsLocalService)invokableLocalService;
			}
			else {
				_service = new RegistrationDetailsLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(RegistrationDetailsLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(RegistrationDetailsLocalService service) {
	}

	private static RegistrationDetailsLocalService _service;
}