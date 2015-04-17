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
 * Provides a wrapper for {@link RegistrationDetailsLocalService}.
 *
 * @author doraraj
 * @see RegistrationDetailsLocalService
 * @generated
 */
public class RegistrationDetailsLocalServiceWrapper
	implements RegistrationDetailsLocalService,
		ServiceWrapper<RegistrationDetailsLocalService> {
	public RegistrationDetailsLocalServiceWrapper(
		RegistrationDetailsLocalService registrationDetailsLocalService) {
		_registrationDetailsLocalService = registrationDetailsLocalService;
	}

	/**
	* Adds the registration details to the database. Also notifies the appropriate model listeners.
	*
	* @param registrationDetails the registration details
	* @return the registration details that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.RegistrationDetails addRegistrationDetails(
		com.ocms.course.model.RegistrationDetails registrationDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationDetailsLocalService.addRegistrationDetails(registrationDetails);
	}

	/**
	* Creates a new registration details with the primary key. Does not add the registration details to the database.
	*
	* @param registrationDetailsId the primary key for the new registration details
	* @return the new registration details
	*/
	@Override
	public com.ocms.course.model.RegistrationDetails createRegistrationDetails(
		long registrationDetailsId) {
		return _registrationDetailsLocalService.createRegistrationDetails(registrationDetailsId);
	}

	/**
	* Deletes the registration details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param registrationDetailsId the primary key of the registration details
	* @return the registration details that was removed
	* @throws PortalException if a registration details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.RegistrationDetails deleteRegistrationDetails(
		long registrationDetailsId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _registrationDetailsLocalService.deleteRegistrationDetails(registrationDetailsId);
	}

	/**
	* Deletes the registration details from the database. Also notifies the appropriate model listeners.
	*
	* @param registrationDetails the registration details
	* @return the registration details that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.RegistrationDetails deleteRegistrationDetails(
		com.ocms.course.model.RegistrationDetails registrationDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationDetailsLocalService.deleteRegistrationDetails(registrationDetails);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _registrationDetailsLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationDetailsLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationDetailsLocalService.dynamicQuery(dynamicQuery,
			start, end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationDetailsLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationDetailsLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationDetailsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.ocms.course.model.RegistrationDetails fetchRegistrationDetails(
		long registrationDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationDetailsLocalService.fetchRegistrationDetails(registrationDetailsId);
	}

	/**
	* Returns the registration details with the primary key.
	*
	* @param registrationDetailsId the primary key of the registration details
	* @return the registration details
	* @throws PortalException if a registration details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.RegistrationDetails getRegistrationDetails(
		long registrationDetailsId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _registrationDetailsLocalService.getRegistrationDetails(registrationDetailsId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _registrationDetailsLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.ocms.course.model.RegistrationDetails> getRegistrationDetailses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationDetailsLocalService.getRegistrationDetailses(start,
			end);
	}

	/**
	* Returns the number of registration detailses.
	*
	* @return the number of registration detailses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getRegistrationDetailsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationDetailsLocalService.getRegistrationDetailsesCount();
	}

	/**
	* Updates the registration details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param registrationDetails the registration details
	* @return the registration details that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.ocms.course.model.RegistrationDetails updateRegistrationDetails(
		com.ocms.course.model.RegistrationDetails registrationDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationDetailsLocalService.updateRegistrationDetails(registrationDetails);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _registrationDetailsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_registrationDetailsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _registrationDetailsLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.ocms.course.model.RegistrationDetails> getRegistrationDetailsByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationDetailsLocalService.getRegistrationDetailsByGroupId(groupId);
	}

	@Override
	public java.util.List<com.ocms.course.model.RegistrationDetails> getRegistrationDetailsByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationDetailsLocalService.getRegistrationDetailsByGroupId(groupId,
			start, end);
	}

	@Override
	public java.util.List<com.ocms.course.model.RegistrationDetails> getRegistrationDetailsByRegistrationDetailsId(
		long registrationDetailsId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationDetailsLocalService.getRegistrationDetailsByRegistrationDetailsId(registrationDetailsId);
	}

	@Override
	public java.util.List<com.ocms.course.model.RegistrationDetails> getRegistrationDetailsByRegistrationDetailsId(
		long registrationDetailsId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationDetailsLocalService.getRegistrationDetailsByRegistrationDetailsId(registrationDetailsId,
			start, end);
	}

	@Override
	public com.ocms.course.model.RegistrationDetails addRegistrationDetails(
		long userId, long studRegId, long contactId, long eventId,
		double price, double discount, double fee, double credit,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _registrationDetailsLocalService.addRegistrationDetails(userId,
			studRegId, contactId, eventId, price, discount, fee, credit,
			serviceContext);
	}

	@Override
	public com.ocms.course.model.RegistrationDetails updateRegistrationDetails(
		long userId, long registrationDetailsId, long studRegId,
		long contactId, long eventId, double price, double discount,
		double fee, double credit,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _registrationDetailsLocalService.updateRegistrationDetails(userId,
			registrationDetailsId, studRegId, contactId, eventId, price,
			discount, fee, credit, serviceContext);
	}

	@Override
	public void deleteRegistrationDetailsByRegistrationDetailsId(
		long registrationDetailsId) {
		_registrationDetailsLocalService.deleteRegistrationDetailsByRegistrationDetailsId(registrationDetailsId);
	}

	@Override
	public void deleteRegistrationDetailsByGrouptId(long groupId) {
		_registrationDetailsLocalService.deleteRegistrationDetailsByGrouptId(groupId);
	}

	@Override
	public void deleteAllRegistrationDetails() {
		_registrationDetailsLocalService.deleteAllRegistrationDetails();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public RegistrationDetailsLocalService getWrappedRegistrationDetailsLocalService() {
		return _registrationDetailsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedRegistrationDetailsLocalService(
		RegistrationDetailsLocalService registrationDetailsLocalService) {
		_registrationDetailsLocalService = registrationDetailsLocalService;
	}

	@Override
	public RegistrationDetailsLocalService getWrappedService() {
		return _registrationDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		RegistrationDetailsLocalService registrationDetailsLocalService) {
		_registrationDetailsLocalService = registrationDetailsLocalService;
	}

	private RegistrationDetailsLocalService _registrationDetailsLocalService;
}