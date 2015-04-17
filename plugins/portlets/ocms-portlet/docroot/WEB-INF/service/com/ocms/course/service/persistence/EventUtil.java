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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.ocms.course.model.Event;

import java.util.List;

/**
 * The persistence utility for the event service. This utility wraps {@link EventPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author doraraj
 * @see EventPersistence
 * @see EventPersistenceImpl
 * @generated
 */
public class EventUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Event event) {
		getPersistence().clearCache(event);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Event> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Event> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Event> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Event update(Event event) throws SystemException {
		return getPersistence().update(event);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Event update(Event event, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(event, serviceContext);
	}

	/**
	* Returns all the events where eventId = &#63;.
	*
	* @param eventId the event ID
	* @return the matching events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Event> findByEventId(
		long eventId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByEventId(eventId);
	}

	/**
	* Returns a range of all the events where eventId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param eventId the event ID
	* @param start the lower bound of the range of events
	* @param end the upper bound of the range of events (not inclusive)
	* @return the range of matching events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Event> findByEventId(
		long eventId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByEventId(eventId, start, end);
	}

	/**
	* Returns an ordered range of all the events where eventId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param eventId the event ID
	* @param start the lower bound of the range of events
	* @param end the upper bound of the range of events (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Event> findByEventId(
		long eventId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByEventId(eventId, start, end, orderByComparator);
	}

	/**
	* Returns the first event in the ordered set where eventId = &#63;.
	*
	* @param eventId the event ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching event
	* @throws com.ocms.course.NoSuchEventException if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Event findByEventId_First(
		long eventId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchEventException {
		return getPersistence().findByEventId_First(eventId, orderByComparator);
	}

	/**
	* Returns the first event in the ordered set where eventId = &#63;.
	*
	* @param eventId the event ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching event, or <code>null</code> if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Event fetchByEventId_First(
		long eventId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByEventId_First(eventId, orderByComparator);
	}

	/**
	* Returns the last event in the ordered set where eventId = &#63;.
	*
	* @param eventId the event ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching event
	* @throws com.ocms.course.NoSuchEventException if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Event findByEventId_Last(long eventId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchEventException {
		return getPersistence().findByEventId_Last(eventId, orderByComparator);
	}

	/**
	* Returns the last event in the ordered set where eventId = &#63;.
	*
	* @param eventId the event ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching event, or <code>null</code> if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Event fetchByEventId_Last(
		long eventId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByEventId_Last(eventId, orderByComparator);
	}

	/**
	* Removes all the events where eventId = &#63; from the database.
	*
	* @param eventId the event ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByEventId(long eventId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByEventId(eventId);
	}

	/**
	* Returns the number of events where eventId = &#63;.
	*
	* @param eventId the event ID
	* @return the number of matching events
	* @throws SystemException if a system exception occurred
	*/
	public static int countByEventId(long eventId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByEventId(eventId);
	}

	/**
	* Returns all the events where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Event> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the events where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of events
	* @param end the upper bound of the range of events (not inclusive)
	* @return the range of matching events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Event> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the events where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of events
	* @param end the upper bound of the range of events (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Event> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first event in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching event
	* @throws com.ocms.course.NoSuchEventException if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Event findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchEventException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first event in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching event, or <code>null</code> if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Event fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last event in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching event
	* @throws com.ocms.course.NoSuchEventException if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Event findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchEventException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last event in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching event, or <code>null</code> if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Event fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the events before and after the current event in the ordered set where groupId = &#63;.
	*
	* @param eventId the primary key of the current event
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next event
	* @throws com.ocms.course.NoSuchEventException if a event with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Event[] findByGroupId_PrevAndNext(
		long eventId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchEventException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(eventId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the events where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of events where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching events
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the events where flag = &#63;.
	*
	* @param flag the flag
	* @return the matching events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Event> findByFlag(
		int flag) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFlag(flag);
	}

	/**
	* Returns a range of all the events where flag = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param flag the flag
	* @param start the lower bound of the range of events
	* @param end the upper bound of the range of events (not inclusive)
	* @return the range of matching events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Event> findByFlag(
		int flag, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFlag(flag, start, end);
	}

	/**
	* Returns an ordered range of all the events where flag = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param flag the flag
	* @param start the lower bound of the range of events
	* @param end the upper bound of the range of events (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Event> findByFlag(
		int flag, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFlag(flag, start, end, orderByComparator);
	}

	/**
	* Returns the first event in the ordered set where flag = &#63;.
	*
	* @param flag the flag
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching event
	* @throws com.ocms.course.NoSuchEventException if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Event findByFlag_First(int flag,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchEventException {
		return getPersistence().findByFlag_First(flag, orderByComparator);
	}

	/**
	* Returns the first event in the ordered set where flag = &#63;.
	*
	* @param flag the flag
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching event, or <code>null</code> if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Event fetchByFlag_First(int flag,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByFlag_First(flag, orderByComparator);
	}

	/**
	* Returns the last event in the ordered set where flag = &#63;.
	*
	* @param flag the flag
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching event
	* @throws com.ocms.course.NoSuchEventException if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Event findByFlag_Last(int flag,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchEventException {
		return getPersistence().findByFlag_Last(flag, orderByComparator);
	}

	/**
	* Returns the last event in the ordered set where flag = &#63;.
	*
	* @param flag the flag
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching event, or <code>null</code> if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Event fetchByFlag_Last(int flag,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByFlag_Last(flag, orderByComparator);
	}

	/**
	* Returns the events before and after the current event in the ordered set where flag = &#63;.
	*
	* @param eventId the primary key of the current event
	* @param flag the flag
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next event
	* @throws com.ocms.course.NoSuchEventException if a event with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Event[] findByFlag_PrevAndNext(
		long eventId, int flag,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchEventException {
		return getPersistence()
				   .findByFlag_PrevAndNext(eventId, flag, orderByComparator);
	}

	/**
	* Removes all the events where flag = &#63; from the database.
	*
	* @param flag the flag
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFlag(int flag)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByFlag(flag);
	}

	/**
	* Returns the number of events where flag = &#63;.
	*
	* @param flag the flag
	* @return the number of matching events
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFlag(int flag)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByFlag(flag);
	}

	/**
	* Returns all the events where userId = &#63; and flag = &#63;.
	*
	* @param userId the user ID
	* @param flag the flag
	* @return the matching events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Event> findByUserIdFlag(
		long userId, int flag)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserIdFlag(userId, flag);
	}

	/**
	* Returns a range of all the events where userId = &#63; and flag = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param flag the flag
	* @param start the lower bound of the range of events
	* @param end the upper bound of the range of events (not inclusive)
	* @return the range of matching events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Event> findByUserIdFlag(
		long userId, int flag, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserIdFlag(userId, flag, start, end);
	}

	/**
	* Returns an ordered range of all the events where userId = &#63; and flag = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param flag the flag
	* @param start the lower bound of the range of events
	* @param end the upper bound of the range of events (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Event> findByUserIdFlag(
		long userId, int flag, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUserIdFlag(userId, flag, start, end, orderByComparator);
	}

	/**
	* Returns the first event in the ordered set where userId = &#63; and flag = &#63;.
	*
	* @param userId the user ID
	* @param flag the flag
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching event
	* @throws com.ocms.course.NoSuchEventException if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Event findByUserIdFlag_First(
		long userId, int flag,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchEventException {
		return getPersistence()
				   .findByUserIdFlag_First(userId, flag, orderByComparator);
	}

	/**
	* Returns the first event in the ordered set where userId = &#63; and flag = &#63;.
	*
	* @param userId the user ID
	* @param flag the flag
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching event, or <code>null</code> if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Event fetchByUserIdFlag_First(
		long userId, int flag,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUserIdFlag_First(userId, flag, orderByComparator);
	}

	/**
	* Returns the last event in the ordered set where userId = &#63; and flag = &#63;.
	*
	* @param userId the user ID
	* @param flag the flag
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching event
	* @throws com.ocms.course.NoSuchEventException if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Event findByUserIdFlag_Last(
		long userId, int flag,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchEventException {
		return getPersistence()
				   .findByUserIdFlag_Last(userId, flag, orderByComparator);
	}

	/**
	* Returns the last event in the ordered set where userId = &#63; and flag = &#63;.
	*
	* @param userId the user ID
	* @param flag the flag
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching event, or <code>null</code> if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Event fetchByUserIdFlag_Last(
		long userId, int flag,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUserIdFlag_Last(userId, flag, orderByComparator);
	}

	/**
	* Returns the events before and after the current event in the ordered set where userId = &#63; and flag = &#63;.
	*
	* @param eventId the primary key of the current event
	* @param userId the user ID
	* @param flag the flag
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next event
	* @throws com.ocms.course.NoSuchEventException if a event with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Event[] findByUserIdFlag_PrevAndNext(
		long eventId, long userId, int flag,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchEventException {
		return getPersistence()
				   .findByUserIdFlag_PrevAndNext(eventId, userId, flag,
			orderByComparator);
	}

	/**
	* Removes all the events where userId = &#63; and flag = &#63; from the database.
	*
	* @param userId the user ID
	* @param flag the flag
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUserIdFlag(long userId, int flag)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUserIdFlag(userId, flag);
	}

	/**
	* Returns the number of events where userId = &#63; and flag = &#63;.
	*
	* @param userId the user ID
	* @param flag the flag
	* @return the number of matching events
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUserIdFlag(long userId, int flag)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUserIdFlag(userId, flag);
	}

	/**
	* Returns all the events where userId = &#63; and flag = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param flag the flag
	* @param groupId the group ID
	* @return the matching events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Event> findByUserIdFlagGroupId(
		long userId, int flag, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserIdFlagGroupId(userId, flag, groupId);
	}

	/**
	* Returns a range of all the events where userId = &#63; and flag = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param flag the flag
	* @param groupId the group ID
	* @param start the lower bound of the range of events
	* @param end the upper bound of the range of events (not inclusive)
	* @return the range of matching events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Event> findByUserIdFlagGroupId(
		long userId, int flag, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUserIdFlagGroupId(userId, flag, groupId, start, end);
	}

	/**
	* Returns an ordered range of all the events where userId = &#63; and flag = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param flag the flag
	* @param groupId the group ID
	* @param start the lower bound of the range of events
	* @param end the upper bound of the range of events (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Event> findByUserIdFlagGroupId(
		long userId, int flag, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUserIdFlagGroupId(userId, flag, groupId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first event in the ordered set where userId = &#63; and flag = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param flag the flag
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching event
	* @throws com.ocms.course.NoSuchEventException if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Event findByUserIdFlagGroupId_First(
		long userId, int flag, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchEventException {
		return getPersistence()
				   .findByUserIdFlagGroupId_First(userId, flag, groupId,
			orderByComparator);
	}

	/**
	* Returns the first event in the ordered set where userId = &#63; and flag = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param flag the flag
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching event, or <code>null</code> if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Event fetchByUserIdFlagGroupId_First(
		long userId, int flag, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUserIdFlagGroupId_First(userId, flag, groupId,
			orderByComparator);
	}

	/**
	* Returns the last event in the ordered set where userId = &#63; and flag = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param flag the flag
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching event
	* @throws com.ocms.course.NoSuchEventException if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Event findByUserIdFlagGroupId_Last(
		long userId, int flag, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchEventException {
		return getPersistence()
				   .findByUserIdFlagGroupId_Last(userId, flag, groupId,
			orderByComparator);
	}

	/**
	* Returns the last event in the ordered set where userId = &#63; and flag = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param flag the flag
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching event, or <code>null</code> if a matching event could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Event fetchByUserIdFlagGroupId_Last(
		long userId, int flag, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUserIdFlagGroupId_Last(userId, flag, groupId,
			orderByComparator);
	}

	/**
	* Returns the events before and after the current event in the ordered set where userId = &#63; and flag = &#63; and groupId = &#63;.
	*
	* @param eventId the primary key of the current event
	* @param userId the user ID
	* @param flag the flag
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next event
	* @throws com.ocms.course.NoSuchEventException if a event with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Event[] findByUserIdFlagGroupId_PrevAndNext(
		long eventId, long userId, int flag, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchEventException {
		return getPersistence()
				   .findByUserIdFlagGroupId_PrevAndNext(eventId, userId, flag,
			groupId, orderByComparator);
	}

	/**
	* Removes all the events where userId = &#63; and flag = &#63; and groupId = &#63; from the database.
	*
	* @param userId the user ID
	* @param flag the flag
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUserIdFlagGroupId(long userId, int flag,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUserIdFlagGroupId(userId, flag, groupId);
	}

	/**
	* Returns the number of events where userId = &#63; and flag = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param flag the flag
	* @param groupId the group ID
	* @return the number of matching events
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUserIdFlagGroupId(long userId, int flag,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUserIdFlagGroupId(userId, flag, groupId);
	}

	/**
	* Caches the event in the entity cache if it is enabled.
	*
	* @param event the event
	*/
	public static void cacheResult(com.ocms.course.model.Event event) {
		getPersistence().cacheResult(event);
	}

	/**
	* Caches the events in the entity cache if it is enabled.
	*
	* @param events the events
	*/
	public static void cacheResult(
		java.util.List<com.ocms.course.model.Event> events) {
		getPersistence().cacheResult(events);
	}

	/**
	* Creates a new event with the primary key. Does not add the event to the database.
	*
	* @param eventId the primary key for the new event
	* @return the new event
	*/
	public static com.ocms.course.model.Event create(long eventId) {
		return getPersistence().create(eventId);
	}

	/**
	* Removes the event with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param eventId the primary key of the event
	* @return the event that was removed
	* @throws com.ocms.course.NoSuchEventException if a event with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Event remove(long eventId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchEventException {
		return getPersistence().remove(eventId);
	}

	public static com.ocms.course.model.Event updateImpl(
		com.ocms.course.model.Event event)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(event);
	}

	/**
	* Returns the event with the primary key or throws a {@link com.ocms.course.NoSuchEventException} if it could not be found.
	*
	* @param eventId the primary key of the event
	* @return the event
	* @throws com.ocms.course.NoSuchEventException if a event with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Event findByPrimaryKey(long eventId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.ocms.course.NoSuchEventException {
		return getPersistence().findByPrimaryKey(eventId);
	}

	/**
	* Returns the event with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param eventId the primary key of the event
	* @return the event, or <code>null</code> if a event with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.ocms.course.model.Event fetchByPrimaryKey(long eventId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(eventId);
	}

	/**
	* Returns all the events.
	*
	* @return the events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Event> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the events.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of events
	* @param end the upper bound of the range of events (not inclusive)
	* @return the range of events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Event> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the events.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of events
	* @param end the upper bound of the range of events (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of events
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.ocms.course.model.Event> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the events from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of events.
	*
	* @return the number of events
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static EventPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (EventPersistence)PortletBeanLocatorUtil.locate(com.ocms.course.service.ClpSerializer.getServletContextName(),
					EventPersistence.class.getName());

			ReferenceRegistry.registerReference(EventUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(EventPersistence persistence) {
	}

	private static EventPersistence _persistence;
}