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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.ocms.course.NoSuchCourseSeriesException;
import com.ocms.course.model.CourseSeries;
import com.ocms.course.model.impl.CourseSeriesImpl;
import com.ocms.course.model.impl.CourseSeriesModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the course series service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author doraraj
 * @see CourseSeriesPersistence
 * @see CourseSeriesUtil
 * @generated
 */
public class CourseSeriesPersistenceImpl extends BasePersistenceImpl<CourseSeries>
	implements CourseSeriesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CourseSeriesUtil} to access the course series persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CourseSeriesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
			CourseSeriesModelImpl.FINDER_CACHE_ENABLED, CourseSeriesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
			CourseSeriesModelImpl.FINDER_CACHE_ENABLED, CourseSeriesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
			CourseSeriesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
			CourseSeriesModelImpl.FINDER_CACHE_ENABLED, CourseSeriesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
			CourseSeriesModelImpl.FINDER_CACHE_ENABLED, CourseSeriesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			CourseSeriesModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
			CourseSeriesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the course serieses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseSeries> findByGroupId(long groupId)
		throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the course serieses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of course serieses
	 * @param end the upper bound of the range of course serieses (not inclusive)
	 * @return the range of matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseSeries> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the course serieses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of course serieses
	 * @param end the upper bound of the range of course serieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseSeries> findByGroupId(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId, start, end, orderByComparator };
		}

		List<CourseSeries> list = (List<CourseSeries>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CourseSeries courseSeries : list) {
				if ((groupId != courseSeries.getGroupId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_COURSESERIES_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CourseSeriesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<CourseSeries>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CourseSeries>(list);
				}
				else {
					list = (List<CourseSeries>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first course series in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course series
	 * @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchCourseSeriesException, SystemException {
		CourseSeries courseSeries = fetchByGroupId_First(groupId,
				orderByComparator);

		if (courseSeries != null) {
			return courseSeries;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCourseSeriesException(msg.toString());
	}

	/**
	 * Returns the first course series in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course series, or <code>null</code> if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries fetchByGroupId_First(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<CourseSeries> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last course series in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course series
	 * @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchCourseSeriesException, SystemException {
		CourseSeries courseSeries = fetchByGroupId_Last(groupId,
				orderByComparator);

		if (courseSeries != null) {
			return courseSeries;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCourseSeriesException(msg.toString());
	}

	/**
	 * Returns the last course series in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course series, or <code>null</code> if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries fetchByGroupId_Last(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<CourseSeries> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the course serieses before and after the current course series in the ordered set where groupId = &#63;.
	 *
	 * @param courseSeriesId the primary key of the current course series
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next course series
	 * @throws com.ocms.course.NoSuchCourseSeriesException if a course series with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries[] findByGroupId_PrevAndNext(long courseSeriesId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchCourseSeriesException, SystemException {
		CourseSeries courseSeries = findByPrimaryKey(courseSeriesId);

		Session session = null;

		try {
			session = openSession();

			CourseSeries[] array = new CourseSeriesImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, courseSeries, groupId,
					orderByComparator, true);

			array[1] = courseSeries;

			array[2] = getByGroupId_PrevAndNext(session, courseSeries, groupId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CourseSeries getByGroupId_PrevAndNext(Session session,
		CourseSeries courseSeries, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_COURSESERIES_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(CourseSeriesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(courseSeries);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CourseSeries> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the course serieses where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupId(long groupId) throws SystemException {
		for (CourseSeries courseSeries : findByGroupId(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(courseSeries);
		}
	}

	/**
	 * Returns the number of course serieses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByGroupId(long groupId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COURSESERIES_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "courseSeries.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COURSESERIESID =
		new FinderPath(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
			CourseSeriesModelImpl.FINDER_CACHE_ENABLED, CourseSeriesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycourseSeriesId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSESERIESID =
		new FinderPath(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
			CourseSeriesModelImpl.FINDER_CACHE_ENABLED, CourseSeriesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycourseSeriesId",
			new String[] { Long.class.getName() },
			CourseSeriesModelImpl.COURSESERIESID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COURSESERIESID = new FinderPath(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
			CourseSeriesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycourseSeriesId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the course serieses where courseSeriesId = &#63;.
	 *
	 * @param courseSeriesId the course series ID
	 * @return the matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseSeries> findBycourseSeriesId(long courseSeriesId)
		throws SystemException {
		return findBycourseSeriesId(courseSeriesId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the course serieses where courseSeriesId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param courseSeriesId the course series ID
	 * @param start the lower bound of the range of course serieses
	 * @param end the upper bound of the range of course serieses (not inclusive)
	 * @return the range of matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseSeries> findBycourseSeriesId(long courseSeriesId,
		int start, int end) throws SystemException {
		return findBycourseSeriesId(courseSeriesId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the course serieses where courseSeriesId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param courseSeriesId the course series ID
	 * @param start the lower bound of the range of course serieses
	 * @param end the upper bound of the range of course serieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseSeries> findBycourseSeriesId(long courseSeriesId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSESERIESID;
			finderArgs = new Object[] { courseSeriesId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COURSESERIESID;
			finderArgs = new Object[] {
					courseSeriesId,
					
					start, end, orderByComparator
				};
		}

		List<CourseSeries> list = (List<CourseSeries>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CourseSeries courseSeries : list) {
				if ((courseSeriesId != courseSeries.getCourseSeriesId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_COURSESERIES_WHERE);

			query.append(_FINDER_COLUMN_COURSESERIESID_COURSESERIESID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CourseSeriesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(courseSeriesId);

				if (!pagination) {
					list = (List<CourseSeries>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CourseSeries>(list);
				}
				else {
					list = (List<CourseSeries>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first course series in the ordered set where courseSeriesId = &#63;.
	 *
	 * @param courseSeriesId the course series ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course series
	 * @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries findBycourseSeriesId_First(long courseSeriesId,
		OrderByComparator orderByComparator)
		throws NoSuchCourseSeriesException, SystemException {
		CourseSeries courseSeries = fetchBycourseSeriesId_First(courseSeriesId,
				orderByComparator);

		if (courseSeries != null) {
			return courseSeries;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("courseSeriesId=");
		msg.append(courseSeriesId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCourseSeriesException(msg.toString());
	}

	/**
	 * Returns the first course series in the ordered set where courseSeriesId = &#63;.
	 *
	 * @param courseSeriesId the course series ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course series, or <code>null</code> if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries fetchBycourseSeriesId_First(long courseSeriesId,
		OrderByComparator orderByComparator) throws SystemException {
		List<CourseSeries> list = findBycourseSeriesId(courseSeriesId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last course series in the ordered set where courseSeriesId = &#63;.
	 *
	 * @param courseSeriesId the course series ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course series
	 * @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries findBycourseSeriesId_Last(long courseSeriesId,
		OrderByComparator orderByComparator)
		throws NoSuchCourseSeriesException, SystemException {
		CourseSeries courseSeries = fetchBycourseSeriesId_Last(courseSeriesId,
				orderByComparator);

		if (courseSeries != null) {
			return courseSeries;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("courseSeriesId=");
		msg.append(courseSeriesId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCourseSeriesException(msg.toString());
	}

	/**
	 * Returns the last course series in the ordered set where courseSeriesId = &#63;.
	 *
	 * @param courseSeriesId the course series ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course series, or <code>null</code> if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries fetchBycourseSeriesId_Last(long courseSeriesId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBycourseSeriesId(courseSeriesId);

		if (count == 0) {
			return null;
		}

		List<CourseSeries> list = findBycourseSeriesId(courseSeriesId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the course serieses where courseSeriesId = &#63; from the database.
	 *
	 * @param courseSeriesId the course series ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBycourseSeriesId(long courseSeriesId)
		throws SystemException {
		for (CourseSeries courseSeries : findBycourseSeriesId(courseSeriesId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(courseSeries);
		}
	}

	/**
	 * Returns the number of course serieses where courseSeriesId = &#63;.
	 *
	 * @param courseSeriesId the course series ID
	 * @return the number of matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBycourseSeriesId(long courseSeriesId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COURSESERIESID;

		Object[] finderArgs = new Object[] { courseSeriesId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COURSESERIES_WHERE);

			query.append(_FINDER_COLUMN_COURSESERIESID_COURSESERIESID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(courseSeriesId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_COURSESERIESID_COURSESERIESID_2 = "courseSeries.courseSeriesId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COURSEID = new FinderPath(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
			CourseSeriesModelImpl.FINDER_CACHE_ENABLED, CourseSeriesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCourseId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSEID =
		new FinderPath(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
			CourseSeriesModelImpl.FINDER_CACHE_ENABLED, CourseSeriesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCourseId",
			new String[] { Long.class.getName() },
			CourseSeriesModelImpl.COURSEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COURSEID = new FinderPath(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
			CourseSeriesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCourseId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the course serieses where courseId = &#63;.
	 *
	 * @param courseId the course ID
	 * @return the matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseSeries> findByCourseId(long courseId)
		throws SystemException {
		return findByCourseId(courseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the course serieses where courseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param courseId the course ID
	 * @param start the lower bound of the range of course serieses
	 * @param end the upper bound of the range of course serieses (not inclusive)
	 * @return the range of matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseSeries> findByCourseId(long courseId, int start, int end)
		throws SystemException {
		return findByCourseId(courseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the course serieses where courseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param courseId the course ID
	 * @param start the lower bound of the range of course serieses
	 * @param end the upper bound of the range of course serieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseSeries> findByCourseId(long courseId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSEID;
			finderArgs = new Object[] { courseId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COURSEID;
			finderArgs = new Object[] { courseId, start, end, orderByComparator };
		}

		List<CourseSeries> list = (List<CourseSeries>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CourseSeries courseSeries : list) {
				if ((courseId != courseSeries.getCourseId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_COURSESERIES_WHERE);

			query.append(_FINDER_COLUMN_COURSEID_COURSEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CourseSeriesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(courseId);

				if (!pagination) {
					list = (List<CourseSeries>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CourseSeries>(list);
				}
				else {
					list = (List<CourseSeries>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first course series in the ordered set where courseId = &#63;.
	 *
	 * @param courseId the course ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course series
	 * @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries findByCourseId_First(long courseId,
		OrderByComparator orderByComparator)
		throws NoSuchCourseSeriesException, SystemException {
		CourseSeries courseSeries = fetchByCourseId_First(courseId,
				orderByComparator);

		if (courseSeries != null) {
			return courseSeries;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("courseId=");
		msg.append(courseId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCourseSeriesException(msg.toString());
	}

	/**
	 * Returns the first course series in the ordered set where courseId = &#63;.
	 *
	 * @param courseId the course ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course series, or <code>null</code> if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries fetchByCourseId_First(long courseId,
		OrderByComparator orderByComparator) throws SystemException {
		List<CourseSeries> list = findByCourseId(courseId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last course series in the ordered set where courseId = &#63;.
	 *
	 * @param courseId the course ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course series
	 * @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries findByCourseId_Last(long courseId,
		OrderByComparator orderByComparator)
		throws NoSuchCourseSeriesException, SystemException {
		CourseSeries courseSeries = fetchByCourseId_Last(courseId,
				orderByComparator);

		if (courseSeries != null) {
			return courseSeries;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("courseId=");
		msg.append(courseId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCourseSeriesException(msg.toString());
	}

	/**
	 * Returns the last course series in the ordered set where courseId = &#63;.
	 *
	 * @param courseId the course ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course series, or <code>null</code> if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries fetchByCourseId_Last(long courseId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCourseId(courseId);

		if (count == 0) {
			return null;
		}

		List<CourseSeries> list = findByCourseId(courseId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the course serieses before and after the current course series in the ordered set where courseId = &#63;.
	 *
	 * @param courseSeriesId the primary key of the current course series
	 * @param courseId the course ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next course series
	 * @throws com.ocms.course.NoSuchCourseSeriesException if a course series with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries[] findByCourseId_PrevAndNext(long courseSeriesId,
		long courseId, OrderByComparator orderByComparator)
		throws NoSuchCourseSeriesException, SystemException {
		CourseSeries courseSeries = findByPrimaryKey(courseSeriesId);

		Session session = null;

		try {
			session = openSession();

			CourseSeries[] array = new CourseSeriesImpl[3];

			array[0] = getByCourseId_PrevAndNext(session, courseSeries,
					courseId, orderByComparator, true);

			array[1] = courseSeries;

			array[2] = getByCourseId_PrevAndNext(session, courseSeries,
					courseId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CourseSeries getByCourseId_PrevAndNext(Session session,
		CourseSeries courseSeries, long courseId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_COURSESERIES_WHERE);

		query.append(_FINDER_COLUMN_COURSEID_COURSEID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(CourseSeriesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(courseId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(courseSeries);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CourseSeries> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the course serieses where courseId = &#63; from the database.
	 *
	 * @param courseId the course ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCourseId(long courseId) throws SystemException {
		for (CourseSeries courseSeries : findByCourseId(courseId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(courseSeries);
		}
	}

	/**
	 * Returns the number of course serieses where courseId = &#63;.
	 *
	 * @param courseId the course ID
	 * @return the number of matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCourseId(long courseId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COURSEID;

		Object[] finderArgs = new Object[] { courseId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COURSESERIES_WHERE);

			query.append(_FINDER_COLUMN_COURSEID_COURSEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(courseId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_COURSEID_COURSEID_2 = "courseSeries.courseId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LOCATIONID =
		new FinderPath(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
			CourseSeriesModelImpl.FINDER_CACHE_ENABLED, CourseSeriesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLocationId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATIONID =
		new FinderPath(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
			CourseSeriesModelImpl.FINDER_CACHE_ENABLED, CourseSeriesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLocationId",
			new String[] { Long.class.getName() },
			CourseSeriesModelImpl.LOCATIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOCATIONID = new FinderPath(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
			CourseSeriesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLocationId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the course serieses where locationId = &#63;.
	 *
	 * @param locationId the location ID
	 * @return the matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseSeries> findByLocationId(long locationId)
		throws SystemException {
		return findByLocationId(locationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the course serieses where locationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param locationId the location ID
	 * @param start the lower bound of the range of course serieses
	 * @param end the upper bound of the range of course serieses (not inclusive)
	 * @return the range of matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseSeries> findByLocationId(long locationId, int start,
		int end) throws SystemException {
		return findByLocationId(locationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the course serieses where locationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param locationId the location ID
	 * @param start the lower bound of the range of course serieses
	 * @param end the upper bound of the range of course serieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseSeries> findByLocationId(long locationId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATIONID;
			finderArgs = new Object[] { locationId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LOCATIONID;
			finderArgs = new Object[] { locationId, start, end, orderByComparator };
		}

		List<CourseSeries> list = (List<CourseSeries>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CourseSeries courseSeries : list) {
				if ((locationId != courseSeries.getLocationId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_COURSESERIES_WHERE);

			query.append(_FINDER_COLUMN_LOCATIONID_LOCATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CourseSeriesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(locationId);

				if (!pagination) {
					list = (List<CourseSeries>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CourseSeries>(list);
				}
				else {
					list = (List<CourseSeries>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first course series in the ordered set where locationId = &#63;.
	 *
	 * @param locationId the location ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course series
	 * @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries findByLocationId_First(long locationId,
		OrderByComparator orderByComparator)
		throws NoSuchCourseSeriesException, SystemException {
		CourseSeries courseSeries = fetchByLocationId_First(locationId,
				orderByComparator);

		if (courseSeries != null) {
			return courseSeries;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("locationId=");
		msg.append(locationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCourseSeriesException(msg.toString());
	}

	/**
	 * Returns the first course series in the ordered set where locationId = &#63;.
	 *
	 * @param locationId the location ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course series, or <code>null</code> if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries fetchByLocationId_First(long locationId,
		OrderByComparator orderByComparator) throws SystemException {
		List<CourseSeries> list = findByLocationId(locationId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last course series in the ordered set where locationId = &#63;.
	 *
	 * @param locationId the location ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course series
	 * @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries findByLocationId_Last(long locationId,
		OrderByComparator orderByComparator)
		throws NoSuchCourseSeriesException, SystemException {
		CourseSeries courseSeries = fetchByLocationId_Last(locationId,
				orderByComparator);

		if (courseSeries != null) {
			return courseSeries;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("locationId=");
		msg.append(locationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCourseSeriesException(msg.toString());
	}

	/**
	 * Returns the last course series in the ordered set where locationId = &#63;.
	 *
	 * @param locationId the location ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course series, or <code>null</code> if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries fetchByLocationId_Last(long locationId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByLocationId(locationId);

		if (count == 0) {
			return null;
		}

		List<CourseSeries> list = findByLocationId(locationId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the course serieses before and after the current course series in the ordered set where locationId = &#63;.
	 *
	 * @param courseSeriesId the primary key of the current course series
	 * @param locationId the location ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next course series
	 * @throws com.ocms.course.NoSuchCourseSeriesException if a course series with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries[] findByLocationId_PrevAndNext(long courseSeriesId,
		long locationId, OrderByComparator orderByComparator)
		throws NoSuchCourseSeriesException, SystemException {
		CourseSeries courseSeries = findByPrimaryKey(courseSeriesId);

		Session session = null;

		try {
			session = openSession();

			CourseSeries[] array = new CourseSeriesImpl[3];

			array[0] = getByLocationId_PrevAndNext(session, courseSeries,
					locationId, orderByComparator, true);

			array[1] = courseSeries;

			array[2] = getByLocationId_PrevAndNext(session, courseSeries,
					locationId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CourseSeries getByLocationId_PrevAndNext(Session session,
		CourseSeries courseSeries, long locationId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_COURSESERIES_WHERE);

		query.append(_FINDER_COLUMN_LOCATIONID_LOCATIONID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(CourseSeriesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(locationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(courseSeries);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CourseSeries> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the course serieses where locationId = &#63; from the database.
	 *
	 * @param locationId the location ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByLocationId(long locationId) throws SystemException {
		for (CourseSeries courseSeries : findByLocationId(locationId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(courseSeries);
		}
	}

	/**
	 * Returns the number of course serieses where locationId = &#63;.
	 *
	 * @param locationId the location ID
	 * @return the number of matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByLocationId(long locationId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LOCATIONID;

		Object[] finderArgs = new Object[] { locationId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COURSESERIES_WHERE);

			query.append(_FINDER_COLUMN_LOCATIONID_LOCATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(locationId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_LOCATIONID_LOCATIONID_2 = "courseSeries.locationId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COURSESERIESCODE =
		new FinderPath(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
			CourseSeriesModelImpl.FINDER_CACHE_ENABLED, CourseSeriesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCourseSeriesCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSESERIESCODE =
		new FinderPath(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
			CourseSeriesModelImpl.FINDER_CACHE_ENABLED, CourseSeriesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCourseSeriesCode", new String[] { String.class.getName() },
			CourseSeriesModelImpl.COURSESERIESCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COURSESERIESCODE = new FinderPath(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
			CourseSeriesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCourseSeriesCode", new String[] { String.class.getName() });

	/**
	 * Returns all the course serieses where courseSeriesCode = &#63;.
	 *
	 * @param courseSeriesCode the course series code
	 * @return the matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseSeries> findByCourseSeriesCode(String courseSeriesCode)
		throws SystemException {
		return findByCourseSeriesCode(courseSeriesCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the course serieses where courseSeriesCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param courseSeriesCode the course series code
	 * @param start the lower bound of the range of course serieses
	 * @param end the upper bound of the range of course serieses (not inclusive)
	 * @return the range of matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseSeries> findByCourseSeriesCode(String courseSeriesCode,
		int start, int end) throws SystemException {
		return findByCourseSeriesCode(courseSeriesCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the course serieses where courseSeriesCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param courseSeriesCode the course series code
	 * @param start the lower bound of the range of course serieses
	 * @param end the upper bound of the range of course serieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseSeries> findByCourseSeriesCode(String courseSeriesCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSESERIESCODE;
			finderArgs = new Object[] { courseSeriesCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COURSESERIESCODE;
			finderArgs = new Object[] {
					courseSeriesCode,
					
					start, end, orderByComparator
				};
		}

		List<CourseSeries> list = (List<CourseSeries>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CourseSeries courseSeries : list) {
				if (!Validator.equals(courseSeriesCode,
							courseSeries.getCourseSeriesCode())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_COURSESERIES_WHERE);

			boolean bindCourseSeriesCode = false;

			if (courseSeriesCode == null) {
				query.append(_FINDER_COLUMN_COURSESERIESCODE_COURSESERIESCODE_1);
			}
			else if (courseSeriesCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_COURSESERIESCODE_COURSESERIESCODE_3);
			}
			else {
				bindCourseSeriesCode = true;

				query.append(_FINDER_COLUMN_COURSESERIESCODE_COURSESERIESCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CourseSeriesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCourseSeriesCode) {
					qPos.add(courseSeriesCode);
				}

				if (!pagination) {
					list = (List<CourseSeries>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CourseSeries>(list);
				}
				else {
					list = (List<CourseSeries>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first course series in the ordered set where courseSeriesCode = &#63;.
	 *
	 * @param courseSeriesCode the course series code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course series
	 * @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries findByCourseSeriesCode_First(String courseSeriesCode,
		OrderByComparator orderByComparator)
		throws NoSuchCourseSeriesException, SystemException {
		CourseSeries courseSeries = fetchByCourseSeriesCode_First(courseSeriesCode,
				orderByComparator);

		if (courseSeries != null) {
			return courseSeries;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("courseSeriesCode=");
		msg.append(courseSeriesCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCourseSeriesException(msg.toString());
	}

	/**
	 * Returns the first course series in the ordered set where courseSeriesCode = &#63;.
	 *
	 * @param courseSeriesCode the course series code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course series, or <code>null</code> if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries fetchByCourseSeriesCode_First(String courseSeriesCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<CourseSeries> list = findByCourseSeriesCode(courseSeriesCode, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last course series in the ordered set where courseSeriesCode = &#63;.
	 *
	 * @param courseSeriesCode the course series code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course series
	 * @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries findByCourseSeriesCode_Last(String courseSeriesCode,
		OrderByComparator orderByComparator)
		throws NoSuchCourseSeriesException, SystemException {
		CourseSeries courseSeries = fetchByCourseSeriesCode_Last(courseSeriesCode,
				orderByComparator);

		if (courseSeries != null) {
			return courseSeries;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("courseSeriesCode=");
		msg.append(courseSeriesCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCourseSeriesException(msg.toString());
	}

	/**
	 * Returns the last course series in the ordered set where courseSeriesCode = &#63;.
	 *
	 * @param courseSeriesCode the course series code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course series, or <code>null</code> if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries fetchByCourseSeriesCode_Last(String courseSeriesCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCourseSeriesCode(courseSeriesCode);

		if (count == 0) {
			return null;
		}

		List<CourseSeries> list = findByCourseSeriesCode(courseSeriesCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the course serieses before and after the current course series in the ordered set where courseSeriesCode = &#63;.
	 *
	 * @param courseSeriesId the primary key of the current course series
	 * @param courseSeriesCode the course series code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next course series
	 * @throws com.ocms.course.NoSuchCourseSeriesException if a course series with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries[] findByCourseSeriesCode_PrevAndNext(
		long courseSeriesId, String courseSeriesCode,
		OrderByComparator orderByComparator)
		throws NoSuchCourseSeriesException, SystemException {
		CourseSeries courseSeries = findByPrimaryKey(courseSeriesId);

		Session session = null;

		try {
			session = openSession();

			CourseSeries[] array = new CourseSeriesImpl[3];

			array[0] = getByCourseSeriesCode_PrevAndNext(session, courseSeries,
					courseSeriesCode, orderByComparator, true);

			array[1] = courseSeries;

			array[2] = getByCourseSeriesCode_PrevAndNext(session, courseSeries,
					courseSeriesCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CourseSeries getByCourseSeriesCode_PrevAndNext(Session session,
		CourseSeries courseSeries, String courseSeriesCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_COURSESERIES_WHERE);

		boolean bindCourseSeriesCode = false;

		if (courseSeriesCode == null) {
			query.append(_FINDER_COLUMN_COURSESERIESCODE_COURSESERIESCODE_1);
		}
		else if (courseSeriesCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_COURSESERIESCODE_COURSESERIESCODE_3);
		}
		else {
			bindCourseSeriesCode = true;

			query.append(_FINDER_COLUMN_COURSESERIESCODE_COURSESERIESCODE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(CourseSeriesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCourseSeriesCode) {
			qPos.add(courseSeriesCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(courseSeries);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CourseSeries> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the course serieses where courseSeriesCode = &#63; from the database.
	 *
	 * @param courseSeriesCode the course series code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCourseSeriesCode(String courseSeriesCode)
		throws SystemException {
		for (CourseSeries courseSeries : findByCourseSeriesCode(
				courseSeriesCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(courseSeries);
		}
	}

	/**
	 * Returns the number of course serieses where courseSeriesCode = &#63;.
	 *
	 * @param courseSeriesCode the course series code
	 * @return the number of matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCourseSeriesCode(String courseSeriesCode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COURSESERIESCODE;

		Object[] finderArgs = new Object[] { courseSeriesCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COURSESERIES_WHERE);

			boolean bindCourseSeriesCode = false;

			if (courseSeriesCode == null) {
				query.append(_FINDER_COLUMN_COURSESERIESCODE_COURSESERIESCODE_1);
			}
			else if (courseSeriesCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_COURSESERIESCODE_COURSESERIESCODE_3);
			}
			else {
				bindCourseSeriesCode = true;

				query.append(_FINDER_COLUMN_COURSESERIESCODE_COURSESERIESCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCourseSeriesCode) {
					qPos.add(courseSeriesCode);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_COURSESERIESCODE_COURSESERIESCODE_1 =
		"courseSeries.courseSeriesCode IS NULL";
	private static final String _FINDER_COLUMN_COURSESERIESCODE_COURSESERIESCODE_2 =
		"courseSeries.courseSeriesCode = ?";
	private static final String _FINDER_COLUMN_COURSESERIESCODE_COURSESERIESCODE_3 =
		"(courseSeries.courseSeriesCode IS NULL OR courseSeries.courseSeriesCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FLAGTOLISTDATA =
		new FinderPath(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
			CourseSeriesModelImpl.FINDER_CACHE_ENABLED, CourseSeriesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByFlagToListData",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FLAGTOLISTDATA =
		new FinderPath(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
			CourseSeriesModelImpl.FINDER_CACHE_ENABLED, CourseSeriesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByFlagToListData",
			new String[] { Integer.class.getName() },
			CourseSeriesModelImpl.FLAGTOLISTDATA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FLAGTOLISTDATA = new FinderPath(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
			CourseSeriesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByFlagToListData",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the course serieses where flagToListData = &#63;.
	 *
	 * @param flagToListData the flag to list data
	 * @return the matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseSeries> findByFlagToListData(int flagToListData)
		throws SystemException {
		return findByFlagToListData(flagToListData, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the course serieses where flagToListData = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param flagToListData the flag to list data
	 * @param start the lower bound of the range of course serieses
	 * @param end the upper bound of the range of course serieses (not inclusive)
	 * @return the range of matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseSeries> findByFlagToListData(int flagToListData,
		int start, int end) throws SystemException {
		return findByFlagToListData(flagToListData, start, end, null);
	}

	/**
	 * Returns an ordered range of all the course serieses where flagToListData = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param flagToListData the flag to list data
	 * @param start the lower bound of the range of course serieses
	 * @param end the upper bound of the range of course serieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseSeries> findByFlagToListData(int flagToListData,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FLAGTOLISTDATA;
			finderArgs = new Object[] { flagToListData };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FLAGTOLISTDATA;
			finderArgs = new Object[] {
					flagToListData,
					
					start, end, orderByComparator
				};
		}

		List<CourseSeries> list = (List<CourseSeries>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CourseSeries courseSeries : list) {
				if ((flagToListData != courseSeries.getFlagToListData())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_COURSESERIES_WHERE);

			query.append(_FINDER_COLUMN_FLAGTOLISTDATA_FLAGTOLISTDATA_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CourseSeriesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(flagToListData);

				if (!pagination) {
					list = (List<CourseSeries>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CourseSeries>(list);
				}
				else {
					list = (List<CourseSeries>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first course series in the ordered set where flagToListData = &#63;.
	 *
	 * @param flagToListData the flag to list data
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course series
	 * @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries findByFlagToListData_First(int flagToListData,
		OrderByComparator orderByComparator)
		throws NoSuchCourseSeriesException, SystemException {
		CourseSeries courseSeries = fetchByFlagToListData_First(flagToListData,
				orderByComparator);

		if (courseSeries != null) {
			return courseSeries;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("flagToListData=");
		msg.append(flagToListData);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCourseSeriesException(msg.toString());
	}

	/**
	 * Returns the first course series in the ordered set where flagToListData = &#63;.
	 *
	 * @param flagToListData the flag to list data
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course series, or <code>null</code> if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries fetchByFlagToListData_First(int flagToListData,
		OrderByComparator orderByComparator) throws SystemException {
		List<CourseSeries> list = findByFlagToListData(flagToListData, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last course series in the ordered set where flagToListData = &#63;.
	 *
	 * @param flagToListData the flag to list data
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course series
	 * @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries findByFlagToListData_Last(int flagToListData,
		OrderByComparator orderByComparator)
		throws NoSuchCourseSeriesException, SystemException {
		CourseSeries courseSeries = fetchByFlagToListData_Last(flagToListData,
				orderByComparator);

		if (courseSeries != null) {
			return courseSeries;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("flagToListData=");
		msg.append(flagToListData);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCourseSeriesException(msg.toString());
	}

	/**
	 * Returns the last course series in the ordered set where flagToListData = &#63;.
	 *
	 * @param flagToListData the flag to list data
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course series, or <code>null</code> if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries fetchByFlagToListData_Last(int flagToListData,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByFlagToListData(flagToListData);

		if (count == 0) {
			return null;
		}

		List<CourseSeries> list = findByFlagToListData(flagToListData,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the course serieses before and after the current course series in the ordered set where flagToListData = &#63;.
	 *
	 * @param courseSeriesId the primary key of the current course series
	 * @param flagToListData the flag to list data
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next course series
	 * @throws com.ocms.course.NoSuchCourseSeriesException if a course series with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries[] findByFlagToListData_PrevAndNext(
		long courseSeriesId, int flagToListData,
		OrderByComparator orderByComparator)
		throws NoSuchCourseSeriesException, SystemException {
		CourseSeries courseSeries = findByPrimaryKey(courseSeriesId);

		Session session = null;

		try {
			session = openSession();

			CourseSeries[] array = new CourseSeriesImpl[3];

			array[0] = getByFlagToListData_PrevAndNext(session, courseSeries,
					flagToListData, orderByComparator, true);

			array[1] = courseSeries;

			array[2] = getByFlagToListData_PrevAndNext(session, courseSeries,
					flagToListData, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CourseSeries getByFlagToListData_PrevAndNext(Session session,
		CourseSeries courseSeries, int flagToListData,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_COURSESERIES_WHERE);

		query.append(_FINDER_COLUMN_FLAGTOLISTDATA_FLAGTOLISTDATA_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(CourseSeriesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(flagToListData);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(courseSeries);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CourseSeries> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the course serieses where flagToListData = &#63; from the database.
	 *
	 * @param flagToListData the flag to list data
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByFlagToListData(int flagToListData)
		throws SystemException {
		for (CourseSeries courseSeries : findByFlagToListData(flagToListData,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(courseSeries);
		}
	}

	/**
	 * Returns the number of course serieses where flagToListData = &#63;.
	 *
	 * @param flagToListData the flag to list data
	 * @return the number of matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByFlagToListData(int flagToListData)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FLAGTOLISTDATA;

		Object[] finderArgs = new Object[] { flagToListData };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COURSESERIES_WHERE);

			query.append(_FINDER_COLUMN_FLAGTOLISTDATA_FLAGTOLISTDATA_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(flagToListData);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_FLAGTOLISTDATA_FLAGTOLISTDATA_2 = "courseSeries.flagToListData = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPIDANDFLAGTOLISTDATA =
		new FinderPath(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
			CourseSeriesModelImpl.FINDER_CACHE_ENABLED, CourseSeriesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByGroupIdAndFlagToListData",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPIDANDFLAGTOLISTDATA =
		new FinderPath(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
			CourseSeriesModelImpl.FINDER_CACHE_ENABLED, CourseSeriesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByGroupIdAndFlagToListData",
			new String[] { Long.class.getName(), Integer.class.getName() },
			CourseSeriesModelImpl.GROUPID_COLUMN_BITMASK |
			CourseSeriesModelImpl.FLAGTOLISTDATA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPIDANDFLAGTOLISTDATA =
		new FinderPath(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
			CourseSeriesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByGroupIdAndFlagToListData",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the course serieses where groupId = &#63; and flagToListData = &#63;.
	 *
	 * @param groupId the group ID
	 * @param flagToListData the flag to list data
	 * @return the matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseSeries> findByGroupIdAndFlagToListData(long groupId,
		int flagToListData) throws SystemException {
		return findByGroupIdAndFlagToListData(groupId, flagToListData,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the course serieses where groupId = &#63; and flagToListData = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param flagToListData the flag to list data
	 * @param start the lower bound of the range of course serieses
	 * @param end the upper bound of the range of course serieses (not inclusive)
	 * @return the range of matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseSeries> findByGroupIdAndFlagToListData(long groupId,
		int flagToListData, int start, int end) throws SystemException {
		return findByGroupIdAndFlagToListData(groupId, flagToListData, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the course serieses where groupId = &#63; and flagToListData = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param flagToListData the flag to list data
	 * @param start the lower bound of the range of course serieses
	 * @param end the upper bound of the range of course serieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseSeries> findByGroupIdAndFlagToListData(long groupId,
		int flagToListData, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPIDANDFLAGTOLISTDATA;
			finderArgs = new Object[] { groupId, flagToListData };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPIDANDFLAGTOLISTDATA;
			finderArgs = new Object[] {
					groupId, flagToListData,
					
					start, end, orderByComparator
				};
		}

		List<CourseSeries> list = (List<CourseSeries>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CourseSeries courseSeries : list) {
				if ((groupId != courseSeries.getGroupId()) ||
						(flagToListData != courseSeries.getFlagToListData())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_COURSESERIES_WHERE);

			query.append(_FINDER_COLUMN_GROUPIDANDFLAGTOLISTDATA_GROUPID_2);

			query.append(_FINDER_COLUMN_GROUPIDANDFLAGTOLISTDATA_FLAGTOLISTDATA_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CourseSeriesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(flagToListData);

				if (!pagination) {
					list = (List<CourseSeries>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CourseSeries>(list);
				}
				else {
					list = (List<CourseSeries>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first course series in the ordered set where groupId = &#63; and flagToListData = &#63;.
	 *
	 * @param groupId the group ID
	 * @param flagToListData the flag to list data
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course series
	 * @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries findByGroupIdAndFlagToListData_First(long groupId,
		int flagToListData, OrderByComparator orderByComparator)
		throws NoSuchCourseSeriesException, SystemException {
		CourseSeries courseSeries = fetchByGroupIdAndFlagToListData_First(groupId,
				flagToListData, orderByComparator);

		if (courseSeries != null) {
			return courseSeries;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", flagToListData=");
		msg.append(flagToListData);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCourseSeriesException(msg.toString());
	}

	/**
	 * Returns the first course series in the ordered set where groupId = &#63; and flagToListData = &#63;.
	 *
	 * @param groupId the group ID
	 * @param flagToListData the flag to list data
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course series, or <code>null</code> if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries fetchByGroupIdAndFlagToListData_First(long groupId,
		int flagToListData, OrderByComparator orderByComparator)
		throws SystemException {
		List<CourseSeries> list = findByGroupIdAndFlagToListData(groupId,
				flagToListData, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last course series in the ordered set where groupId = &#63; and flagToListData = &#63;.
	 *
	 * @param groupId the group ID
	 * @param flagToListData the flag to list data
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course series
	 * @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries findByGroupIdAndFlagToListData_Last(long groupId,
		int flagToListData, OrderByComparator orderByComparator)
		throws NoSuchCourseSeriesException, SystemException {
		CourseSeries courseSeries = fetchByGroupIdAndFlagToListData_Last(groupId,
				flagToListData, orderByComparator);

		if (courseSeries != null) {
			return courseSeries;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", flagToListData=");
		msg.append(flagToListData);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCourseSeriesException(msg.toString());
	}

	/**
	 * Returns the last course series in the ordered set where groupId = &#63; and flagToListData = &#63;.
	 *
	 * @param groupId the group ID
	 * @param flagToListData the flag to list data
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course series, or <code>null</code> if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries fetchByGroupIdAndFlagToListData_Last(long groupId,
		int flagToListData, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByGroupIdAndFlagToListData(groupId, flagToListData);

		if (count == 0) {
			return null;
		}

		List<CourseSeries> list = findByGroupIdAndFlagToListData(groupId,
				flagToListData, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the course serieses before and after the current course series in the ordered set where groupId = &#63; and flagToListData = &#63;.
	 *
	 * @param courseSeriesId the primary key of the current course series
	 * @param groupId the group ID
	 * @param flagToListData the flag to list data
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next course series
	 * @throws com.ocms.course.NoSuchCourseSeriesException if a course series with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries[] findByGroupIdAndFlagToListData_PrevAndNext(
		long courseSeriesId, long groupId, int flagToListData,
		OrderByComparator orderByComparator)
		throws NoSuchCourseSeriesException, SystemException {
		CourseSeries courseSeries = findByPrimaryKey(courseSeriesId);

		Session session = null;

		try {
			session = openSession();

			CourseSeries[] array = new CourseSeriesImpl[3];

			array[0] = getByGroupIdAndFlagToListData_PrevAndNext(session,
					courseSeries, groupId, flagToListData, orderByComparator,
					true);

			array[1] = courseSeries;

			array[2] = getByGroupIdAndFlagToListData_PrevAndNext(session,
					courseSeries, groupId, flagToListData, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CourseSeries getByGroupIdAndFlagToListData_PrevAndNext(
		Session session, CourseSeries courseSeries, long groupId,
		int flagToListData, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_COURSESERIES_WHERE);

		query.append(_FINDER_COLUMN_GROUPIDANDFLAGTOLISTDATA_GROUPID_2);

		query.append(_FINDER_COLUMN_GROUPIDANDFLAGTOLISTDATA_FLAGTOLISTDATA_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(CourseSeriesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(flagToListData);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(courseSeries);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CourseSeries> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the course serieses where groupId = &#63; and flagToListData = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param flagToListData the flag to list data
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupIdAndFlagToListData(long groupId,
		int flagToListData) throws SystemException {
		for (CourseSeries courseSeries : findByGroupIdAndFlagToListData(
				groupId, flagToListData, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(courseSeries);
		}
	}

	/**
	 * Returns the number of course serieses where groupId = &#63; and flagToListData = &#63;.
	 *
	 * @param groupId the group ID
	 * @param flagToListData the flag to list data
	 * @return the number of matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByGroupIdAndFlagToListData(long groupId, int flagToListData)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPIDANDFLAGTOLISTDATA;

		Object[] finderArgs = new Object[] { groupId, flagToListData };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_COURSESERIES_WHERE);

			query.append(_FINDER_COLUMN_GROUPIDANDFLAGTOLISTDATA_GROUPID_2);

			query.append(_FINDER_COLUMN_GROUPIDANDFLAGTOLISTDATA_FLAGTOLISTDATA_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(flagToListData);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GROUPIDANDFLAGTOLISTDATA_GROUPID_2 =
		"courseSeries.groupId = ? AND ";
	private static final String _FINDER_COLUMN_GROUPIDANDFLAGTOLISTDATA_FLAGTOLISTDATA_2 =
		"courseSeries.flagToListData = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LOCATIONIDANDFLAGTOLISTDATA =
		new FinderPath(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
			CourseSeriesModelImpl.FINDER_CACHE_ENABLED, CourseSeriesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBylocationIdAndFlagToListData",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATIONIDANDFLAGTOLISTDATA =
		new FinderPath(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
			CourseSeriesModelImpl.FINDER_CACHE_ENABLED, CourseSeriesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBylocationIdAndFlagToListData",
			new String[] { Long.class.getName(), Integer.class.getName() },
			CourseSeriesModelImpl.LOCATIONID_COLUMN_BITMASK |
			CourseSeriesModelImpl.FLAGTOLISTDATA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOCATIONIDANDFLAGTOLISTDATA =
		new FinderPath(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
			CourseSeriesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBylocationIdAndFlagToListData",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the course serieses where locationId = &#63; and flagToListData = &#63;.
	 *
	 * @param locationId the location ID
	 * @param flagToListData the flag to list data
	 * @return the matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseSeries> findBylocationIdAndFlagToListData(
		long locationId, int flagToListData) throws SystemException {
		return findBylocationIdAndFlagToListData(locationId, flagToListData,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the course serieses where locationId = &#63; and flagToListData = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param locationId the location ID
	 * @param flagToListData the flag to list data
	 * @param start the lower bound of the range of course serieses
	 * @param end the upper bound of the range of course serieses (not inclusive)
	 * @return the range of matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseSeries> findBylocationIdAndFlagToListData(
		long locationId, int flagToListData, int start, int end)
		throws SystemException {
		return findBylocationIdAndFlagToListData(locationId, flagToListData,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the course serieses where locationId = &#63; and flagToListData = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param locationId the location ID
	 * @param flagToListData the flag to list data
	 * @param start the lower bound of the range of course serieses
	 * @param end the upper bound of the range of course serieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseSeries> findBylocationIdAndFlagToListData(
		long locationId, int flagToListData, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATIONIDANDFLAGTOLISTDATA;
			finderArgs = new Object[] { locationId, flagToListData };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LOCATIONIDANDFLAGTOLISTDATA;
			finderArgs = new Object[] {
					locationId, flagToListData,
					
					start, end, orderByComparator
				};
		}

		List<CourseSeries> list = (List<CourseSeries>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CourseSeries courseSeries : list) {
				if ((locationId != courseSeries.getLocationId()) ||
						(flagToListData != courseSeries.getFlagToListData())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_COURSESERIES_WHERE);

			query.append(_FINDER_COLUMN_LOCATIONIDANDFLAGTOLISTDATA_LOCATIONID_2);

			query.append(_FINDER_COLUMN_LOCATIONIDANDFLAGTOLISTDATA_FLAGTOLISTDATA_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CourseSeriesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(locationId);

				qPos.add(flagToListData);

				if (!pagination) {
					list = (List<CourseSeries>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CourseSeries>(list);
				}
				else {
					list = (List<CourseSeries>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first course series in the ordered set where locationId = &#63; and flagToListData = &#63;.
	 *
	 * @param locationId the location ID
	 * @param flagToListData the flag to list data
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course series
	 * @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries findBylocationIdAndFlagToListData_First(
		long locationId, int flagToListData, OrderByComparator orderByComparator)
		throws NoSuchCourseSeriesException, SystemException {
		CourseSeries courseSeries = fetchBylocationIdAndFlagToListData_First(locationId,
				flagToListData, orderByComparator);

		if (courseSeries != null) {
			return courseSeries;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("locationId=");
		msg.append(locationId);

		msg.append(", flagToListData=");
		msg.append(flagToListData);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCourseSeriesException(msg.toString());
	}

	/**
	 * Returns the first course series in the ordered set where locationId = &#63; and flagToListData = &#63;.
	 *
	 * @param locationId the location ID
	 * @param flagToListData the flag to list data
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course series, or <code>null</code> if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries fetchBylocationIdAndFlagToListData_First(
		long locationId, int flagToListData, OrderByComparator orderByComparator)
		throws SystemException {
		List<CourseSeries> list = findBylocationIdAndFlagToListData(locationId,
				flagToListData, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last course series in the ordered set where locationId = &#63; and flagToListData = &#63;.
	 *
	 * @param locationId the location ID
	 * @param flagToListData the flag to list data
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course series
	 * @throws com.ocms.course.NoSuchCourseSeriesException if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries findBylocationIdAndFlagToListData_Last(
		long locationId, int flagToListData, OrderByComparator orderByComparator)
		throws NoSuchCourseSeriesException, SystemException {
		CourseSeries courseSeries = fetchBylocationIdAndFlagToListData_Last(locationId,
				flagToListData, orderByComparator);

		if (courseSeries != null) {
			return courseSeries;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("locationId=");
		msg.append(locationId);

		msg.append(", flagToListData=");
		msg.append(flagToListData);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCourseSeriesException(msg.toString());
	}

	/**
	 * Returns the last course series in the ordered set where locationId = &#63; and flagToListData = &#63;.
	 *
	 * @param locationId the location ID
	 * @param flagToListData the flag to list data
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course series, or <code>null</code> if a matching course series could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries fetchBylocationIdAndFlagToListData_Last(
		long locationId, int flagToListData, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBylocationIdAndFlagToListData(locationId,
				flagToListData);

		if (count == 0) {
			return null;
		}

		List<CourseSeries> list = findBylocationIdAndFlagToListData(locationId,
				flagToListData, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the course serieses before and after the current course series in the ordered set where locationId = &#63; and flagToListData = &#63;.
	 *
	 * @param courseSeriesId the primary key of the current course series
	 * @param locationId the location ID
	 * @param flagToListData the flag to list data
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next course series
	 * @throws com.ocms.course.NoSuchCourseSeriesException if a course series with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries[] findBylocationIdAndFlagToListData_PrevAndNext(
		long courseSeriesId, long locationId, int flagToListData,
		OrderByComparator orderByComparator)
		throws NoSuchCourseSeriesException, SystemException {
		CourseSeries courseSeries = findByPrimaryKey(courseSeriesId);

		Session session = null;

		try {
			session = openSession();

			CourseSeries[] array = new CourseSeriesImpl[3];

			array[0] = getBylocationIdAndFlagToListData_PrevAndNext(session,
					courseSeries, locationId, flagToListData,
					orderByComparator, true);

			array[1] = courseSeries;

			array[2] = getBylocationIdAndFlagToListData_PrevAndNext(session,
					courseSeries, locationId, flagToListData,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CourseSeries getBylocationIdAndFlagToListData_PrevAndNext(
		Session session, CourseSeries courseSeries, long locationId,
		int flagToListData, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_COURSESERIES_WHERE);

		query.append(_FINDER_COLUMN_LOCATIONIDANDFLAGTOLISTDATA_LOCATIONID_2);

		query.append(_FINDER_COLUMN_LOCATIONIDANDFLAGTOLISTDATA_FLAGTOLISTDATA_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(CourseSeriesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(locationId);

		qPos.add(flagToListData);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(courseSeries);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CourseSeries> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the course serieses where locationId = &#63; and flagToListData = &#63; from the database.
	 *
	 * @param locationId the location ID
	 * @param flagToListData the flag to list data
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBylocationIdAndFlagToListData(long locationId,
		int flagToListData) throws SystemException {
		for (CourseSeries courseSeries : findBylocationIdAndFlagToListData(
				locationId, flagToListData, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(courseSeries);
		}
	}

	/**
	 * Returns the number of course serieses where locationId = &#63; and flagToListData = &#63;.
	 *
	 * @param locationId the location ID
	 * @param flagToListData the flag to list data
	 * @return the number of matching course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBylocationIdAndFlagToListData(long locationId,
		int flagToListData) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LOCATIONIDANDFLAGTOLISTDATA;

		Object[] finderArgs = new Object[] { locationId, flagToListData };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_COURSESERIES_WHERE);

			query.append(_FINDER_COLUMN_LOCATIONIDANDFLAGTOLISTDATA_LOCATIONID_2);

			query.append(_FINDER_COLUMN_LOCATIONIDANDFLAGTOLISTDATA_FLAGTOLISTDATA_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(locationId);

				qPos.add(flagToListData);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_LOCATIONIDANDFLAGTOLISTDATA_LOCATIONID_2 =
		"courseSeries.locationId = ? AND ";
	private static final String _FINDER_COLUMN_LOCATIONIDANDFLAGTOLISTDATA_FLAGTOLISTDATA_2 =
		"courseSeries.flagToListData = ?";

	public CourseSeriesPersistenceImpl() {
		setModelClass(CourseSeries.class);
	}

	/**
	 * Caches the course series in the entity cache if it is enabled.
	 *
	 * @param courseSeries the course series
	 */
	@Override
	public void cacheResult(CourseSeries courseSeries) {
		EntityCacheUtil.putResult(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
			CourseSeriesImpl.class, courseSeries.getPrimaryKey(), courseSeries);

		courseSeries.resetOriginalValues();
	}

	/**
	 * Caches the course serieses in the entity cache if it is enabled.
	 *
	 * @param courseSerieses the course serieses
	 */
	@Override
	public void cacheResult(List<CourseSeries> courseSerieses) {
		for (CourseSeries courseSeries : courseSerieses) {
			if (EntityCacheUtil.getResult(
						CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
						CourseSeriesImpl.class, courseSeries.getPrimaryKey()) == null) {
				cacheResult(courseSeries);
			}
			else {
				courseSeries.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all course serieses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CourseSeriesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CourseSeriesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the course series.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CourseSeries courseSeries) {
		EntityCacheUtil.removeResult(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
			CourseSeriesImpl.class, courseSeries.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CourseSeries> courseSerieses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CourseSeries courseSeries : courseSerieses) {
			EntityCacheUtil.removeResult(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
				CourseSeriesImpl.class, courseSeries.getPrimaryKey());
		}
	}

	/**
	 * Creates a new course series with the primary key. Does not add the course series to the database.
	 *
	 * @param courseSeriesId the primary key for the new course series
	 * @return the new course series
	 */
	@Override
	public CourseSeries create(long courseSeriesId) {
		CourseSeries courseSeries = new CourseSeriesImpl();

		courseSeries.setNew(true);
		courseSeries.setPrimaryKey(courseSeriesId);

		return courseSeries;
	}

	/**
	 * Removes the course series with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param courseSeriesId the primary key of the course series
	 * @return the course series that was removed
	 * @throws com.ocms.course.NoSuchCourseSeriesException if a course series with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries remove(long courseSeriesId)
		throws NoSuchCourseSeriesException, SystemException {
		return remove((Serializable)courseSeriesId);
	}

	/**
	 * Removes the course series with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the course series
	 * @return the course series that was removed
	 * @throws com.ocms.course.NoSuchCourseSeriesException if a course series with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries remove(Serializable primaryKey)
		throws NoSuchCourseSeriesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CourseSeries courseSeries = (CourseSeries)session.get(CourseSeriesImpl.class,
					primaryKey);

			if (courseSeries == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCourseSeriesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(courseSeries);
		}
		catch (NoSuchCourseSeriesException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected CourseSeries removeImpl(CourseSeries courseSeries)
		throws SystemException {
		courseSeries = toUnwrappedModel(courseSeries);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(courseSeries)) {
				courseSeries = (CourseSeries)session.get(CourseSeriesImpl.class,
						courseSeries.getPrimaryKeyObj());
			}

			if (courseSeries != null) {
				session.delete(courseSeries);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (courseSeries != null) {
			clearCache(courseSeries);
		}

		return courseSeries;
	}

	@Override
	public CourseSeries updateImpl(
		com.ocms.course.model.CourseSeries courseSeries)
		throws SystemException {
		courseSeries = toUnwrappedModel(courseSeries);

		boolean isNew = courseSeries.isNew();

		CourseSeriesModelImpl courseSeriesModelImpl = (CourseSeriesModelImpl)courseSeries;

		Session session = null;

		try {
			session = openSession();

			if (courseSeries.isNew()) {
				session.save(courseSeries);

				courseSeries.setNew(false);
			}
			else {
				session.merge(courseSeries);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CourseSeriesModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((courseSeriesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						courseSeriesModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { courseSeriesModelImpl.getGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((courseSeriesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSESERIESID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						courseSeriesModelImpl.getOriginalCourseSeriesId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COURSESERIESID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSESERIESID,
					args);

				args = new Object[] { courseSeriesModelImpl.getCourseSeriesId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COURSESERIESID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSESERIESID,
					args);
			}

			if ((courseSeriesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						courseSeriesModelImpl.getOriginalCourseId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COURSEID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSEID,
					args);

				args = new Object[] { courseSeriesModelImpl.getCourseId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COURSEID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSEID,
					args);
			}

			if ((courseSeriesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						courseSeriesModelImpl.getOriginalLocationId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOCATIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATIONID,
					args);

				args = new Object[] { courseSeriesModelImpl.getLocationId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOCATIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATIONID,
					args);
			}

			if ((courseSeriesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSESERIESCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						courseSeriesModelImpl.getOriginalCourseSeriesCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COURSESERIESCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSESERIESCODE,
					args);

				args = new Object[] { courseSeriesModelImpl.getCourseSeriesCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COURSESERIESCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSESERIESCODE,
					args);
			}

			if ((courseSeriesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FLAGTOLISTDATA.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						courseSeriesModelImpl.getOriginalFlagToListData()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FLAGTOLISTDATA,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FLAGTOLISTDATA,
					args);

				args = new Object[] { courseSeriesModelImpl.getFlagToListData() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FLAGTOLISTDATA,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FLAGTOLISTDATA,
					args);
			}

			if ((courseSeriesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPIDANDFLAGTOLISTDATA.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						courseSeriesModelImpl.getOriginalGroupId(),
						courseSeriesModelImpl.getOriginalFlagToListData()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPIDANDFLAGTOLISTDATA,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPIDANDFLAGTOLISTDATA,
					args);

				args = new Object[] {
						courseSeriesModelImpl.getGroupId(),
						courseSeriesModelImpl.getFlagToListData()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPIDANDFLAGTOLISTDATA,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPIDANDFLAGTOLISTDATA,
					args);
			}

			if ((courseSeriesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATIONIDANDFLAGTOLISTDATA.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						courseSeriesModelImpl.getOriginalLocationId(),
						courseSeriesModelImpl.getOriginalFlagToListData()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOCATIONIDANDFLAGTOLISTDATA,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATIONIDANDFLAGTOLISTDATA,
					args);

				args = new Object[] {
						courseSeriesModelImpl.getLocationId(),
						courseSeriesModelImpl.getFlagToListData()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOCATIONIDANDFLAGTOLISTDATA,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATIONIDANDFLAGTOLISTDATA,
					args);
			}
		}

		EntityCacheUtil.putResult(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
			CourseSeriesImpl.class, courseSeries.getPrimaryKey(), courseSeries);

		return courseSeries;
	}

	protected CourseSeries toUnwrappedModel(CourseSeries courseSeries) {
		if (courseSeries instanceof CourseSeriesImpl) {
			return courseSeries;
		}

		CourseSeriesImpl courseSeriesImpl = new CourseSeriesImpl();

		courseSeriesImpl.setNew(courseSeries.isNew());
		courseSeriesImpl.setPrimaryKey(courseSeries.getPrimaryKey());

		courseSeriesImpl.setCourseSeriesId(courseSeries.getCourseSeriesId());
		courseSeriesImpl.setGroupId(courseSeries.getGroupId());
		courseSeriesImpl.setCompanyId(courseSeries.getCompanyId());
		courseSeriesImpl.setUserId(courseSeries.getUserId());
		courseSeriesImpl.setUserName(courseSeries.getUserName());
		courseSeriesImpl.setCreateDate(courseSeries.getCreateDate());
		courseSeriesImpl.setModifiedDate(courseSeries.getModifiedDate());
		courseSeriesImpl.setCourseId(courseSeries.getCourseId());
		courseSeriesImpl.setLocationId(courseSeries.getLocationId());
		courseSeriesImpl.setType(courseSeries.getType());
		courseSeriesImpl.setStartDate(courseSeries.getStartDate());
		courseSeriesImpl.setEndDate(courseSeries.getEndDate());
		courseSeriesImpl.setPublishingStatus(courseSeries.getPublishingStatus());
		courseSeriesImpl.setMaxNoStudReg(courseSeries.getMaxNoStudReg());
		courseSeriesImpl.setSeriesCount(courseSeries.getSeriesCount());
		courseSeriesImpl.setCourseSeriesCode(courseSeries.getCourseSeriesCode());
		courseSeriesImpl.setCourseSeriesEventCode(courseSeries.getCourseSeriesEventCode());
		courseSeriesImpl.setFlagToListData(courseSeries.getFlagToListData());
		courseSeriesImpl.setFlagToChkEventCreation(courseSeries.getFlagToChkEventCreation());
		courseSeriesImpl.setSMonth(courseSeries.getSMonth());
		courseSeriesImpl.setSDay(courseSeries.getSDay());
		courseSeriesImpl.setEMonth(courseSeries.getEMonth());
		courseSeriesImpl.setEDay(courseSeries.getEDay());

		return courseSeriesImpl;
	}

	/**
	 * Returns the course series with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the course series
	 * @return the course series
	 * @throws com.ocms.course.NoSuchCourseSeriesException if a course series with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCourseSeriesException, SystemException {
		CourseSeries courseSeries = fetchByPrimaryKey(primaryKey);

		if (courseSeries == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCourseSeriesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return courseSeries;
	}

	/**
	 * Returns the course series with the primary key or throws a {@link com.ocms.course.NoSuchCourseSeriesException} if it could not be found.
	 *
	 * @param courseSeriesId the primary key of the course series
	 * @return the course series
	 * @throws com.ocms.course.NoSuchCourseSeriesException if a course series with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries findByPrimaryKey(long courseSeriesId)
		throws NoSuchCourseSeriesException, SystemException {
		return findByPrimaryKey((Serializable)courseSeriesId);
	}

	/**
	 * Returns the course series with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the course series
	 * @return the course series, or <code>null</code> if a course series with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CourseSeries courseSeries = (CourseSeries)EntityCacheUtil.getResult(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
				CourseSeriesImpl.class, primaryKey);

		if (courseSeries == _nullCourseSeries) {
			return null;
		}

		if (courseSeries == null) {
			Session session = null;

			try {
				session = openSession();

				courseSeries = (CourseSeries)session.get(CourseSeriesImpl.class,
						primaryKey);

				if (courseSeries != null) {
					cacheResult(courseSeries);
				}
				else {
					EntityCacheUtil.putResult(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
						CourseSeriesImpl.class, primaryKey, _nullCourseSeries);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CourseSeriesModelImpl.ENTITY_CACHE_ENABLED,
					CourseSeriesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return courseSeries;
	}

	/**
	 * Returns the course series with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param courseSeriesId the primary key of the course series
	 * @return the course series, or <code>null</code> if a course series with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseSeries fetchByPrimaryKey(long courseSeriesId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)courseSeriesId);
	}

	/**
	 * Returns all the course serieses.
	 *
	 * @return the course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseSeries> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the course serieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of course serieses
	 * @param end the upper bound of the range of course serieses (not inclusive)
	 * @return the range of course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseSeries> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the course serieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CourseSeriesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of course serieses
	 * @param end the upper bound of the range of course serieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseSeries> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<CourseSeries> list = (List<CourseSeries>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_COURSESERIES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_COURSESERIES;

				if (pagination) {
					sql = sql.concat(CourseSeriesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CourseSeries>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CourseSeries>(list);
				}
				else {
					list = (List<CourseSeries>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the course serieses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CourseSeries courseSeries : findAll()) {
			remove(courseSeries);
		}
	}

	/**
	 * Returns the number of course serieses.
	 *
	 * @return the number of course serieses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_COURSESERIES);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the course series persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ocms.course.model.CourseSeries")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CourseSeries>> listenersList = new ArrayList<ModelListener<CourseSeries>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CourseSeries>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(CourseSeriesImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_COURSESERIES = "SELECT courseSeries FROM CourseSeries courseSeries";
	private static final String _SQL_SELECT_COURSESERIES_WHERE = "SELECT courseSeries FROM CourseSeries courseSeries WHERE ";
	private static final String _SQL_COUNT_COURSESERIES = "SELECT COUNT(courseSeries) FROM CourseSeries courseSeries";
	private static final String _SQL_COUNT_COURSESERIES_WHERE = "SELECT COUNT(courseSeries) FROM CourseSeries courseSeries WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "courseSeries.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CourseSeries exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CourseSeries exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CourseSeriesPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"type"
			});
	private static CourseSeries _nullCourseSeries = new CourseSeriesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CourseSeries> toCacheModel() {
				return _nullCourseSeriesCacheModel;
			}
		};

	private static CacheModel<CourseSeries> _nullCourseSeriesCacheModel = new CacheModel<CourseSeries>() {
			@Override
			public CourseSeries toEntityModel() {
				return _nullCourseSeries;
			}
		};
}