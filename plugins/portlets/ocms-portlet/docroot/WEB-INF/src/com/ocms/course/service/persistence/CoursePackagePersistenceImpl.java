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

import com.ocms.course.NoSuchCoursePackageException;
import com.ocms.course.model.CoursePackage;
import com.ocms.course.model.impl.CoursePackageImpl;
import com.ocms.course.model.impl.CoursePackageModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the course package service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author doraraj
 * @see CoursePackagePersistence
 * @see CoursePackageUtil
 * @generated
 */
public class CoursePackagePersistenceImpl extends BasePersistenceImpl<CoursePackage>
	implements CoursePackagePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CoursePackageUtil} to access the course package persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CoursePackageImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CoursePackageModelImpl.ENTITY_CACHE_ENABLED,
			CoursePackageModelImpl.FINDER_CACHE_ENABLED,
			CoursePackageImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CoursePackageModelImpl.ENTITY_CACHE_ENABLED,
			CoursePackageModelImpl.FINDER_CACHE_ENABLED,
			CoursePackageImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CoursePackageModelImpl.ENTITY_CACHE_ENABLED,
			CoursePackageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COURSEPACKAGEID =
		new FinderPath(CoursePackageModelImpl.ENTITY_CACHE_ENABLED,
			CoursePackageModelImpl.FINDER_CACHE_ENABLED,
			CoursePackageImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCoursePackageId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSEPACKAGEID =
		new FinderPath(CoursePackageModelImpl.ENTITY_CACHE_ENABLED,
			CoursePackageModelImpl.FINDER_CACHE_ENABLED,
			CoursePackageImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCoursePackageId", new String[] { Long.class.getName() },
			CoursePackageModelImpl.COURSEPACKAGEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COURSEPACKAGEID = new FinderPath(CoursePackageModelImpl.ENTITY_CACHE_ENABLED,
			CoursePackageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCoursePackageId", new String[] { Long.class.getName() });

	/**
	 * Returns all the course packages where coursePackageId = &#63;.
	 *
	 * @param coursePackageId the course package ID
	 * @return the matching course packages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CoursePackage> findByCoursePackageId(long coursePackageId)
		throws SystemException {
		return findByCoursePackageId(coursePackageId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the course packages where coursePackageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CoursePackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param coursePackageId the course package ID
	 * @param start the lower bound of the range of course packages
	 * @param end the upper bound of the range of course packages (not inclusive)
	 * @return the range of matching course packages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CoursePackage> findByCoursePackageId(long coursePackageId,
		int start, int end) throws SystemException {
		return findByCoursePackageId(coursePackageId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the course packages where coursePackageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CoursePackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param coursePackageId the course package ID
	 * @param start the lower bound of the range of course packages
	 * @param end the upper bound of the range of course packages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching course packages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CoursePackage> findByCoursePackageId(long coursePackageId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSEPACKAGEID;
			finderArgs = new Object[] { coursePackageId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COURSEPACKAGEID;
			finderArgs = new Object[] {
					coursePackageId,
					
					start, end, orderByComparator
				};
		}

		List<CoursePackage> list = (List<CoursePackage>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CoursePackage coursePackage : list) {
				if ((coursePackageId != coursePackage.getCoursePackageId())) {
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

			query.append(_SQL_SELECT_COURSEPACKAGE_WHERE);

			query.append(_FINDER_COLUMN_COURSEPACKAGEID_COURSEPACKAGEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CoursePackageModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(coursePackageId);

				if (!pagination) {
					list = (List<CoursePackage>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CoursePackage>(list);
				}
				else {
					list = (List<CoursePackage>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first course package in the ordered set where coursePackageId = &#63;.
	 *
	 * @param coursePackageId the course package ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course package
	 * @throws com.ocms.course.NoSuchCoursePackageException if a matching course package could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CoursePackage findByCoursePackageId_First(long coursePackageId,
		OrderByComparator orderByComparator)
		throws NoSuchCoursePackageException, SystemException {
		CoursePackage coursePackage = fetchByCoursePackageId_First(coursePackageId,
				orderByComparator);

		if (coursePackage != null) {
			return coursePackage;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("coursePackageId=");
		msg.append(coursePackageId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCoursePackageException(msg.toString());
	}

	/**
	 * Returns the first course package in the ordered set where coursePackageId = &#63;.
	 *
	 * @param coursePackageId the course package ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course package, or <code>null</code> if a matching course package could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CoursePackage fetchByCoursePackageId_First(long coursePackageId,
		OrderByComparator orderByComparator) throws SystemException {
		List<CoursePackage> list = findByCoursePackageId(coursePackageId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last course package in the ordered set where coursePackageId = &#63;.
	 *
	 * @param coursePackageId the course package ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course package
	 * @throws com.ocms.course.NoSuchCoursePackageException if a matching course package could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CoursePackage findByCoursePackageId_Last(long coursePackageId,
		OrderByComparator orderByComparator)
		throws NoSuchCoursePackageException, SystemException {
		CoursePackage coursePackage = fetchByCoursePackageId_Last(coursePackageId,
				orderByComparator);

		if (coursePackage != null) {
			return coursePackage;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("coursePackageId=");
		msg.append(coursePackageId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCoursePackageException(msg.toString());
	}

	/**
	 * Returns the last course package in the ordered set where coursePackageId = &#63;.
	 *
	 * @param coursePackageId the course package ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course package, or <code>null</code> if a matching course package could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CoursePackage fetchByCoursePackageId_Last(long coursePackageId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCoursePackageId(coursePackageId);

		if (count == 0) {
			return null;
		}

		List<CoursePackage> list = findByCoursePackageId(coursePackageId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the course packages where coursePackageId = &#63; from the database.
	 *
	 * @param coursePackageId the course package ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCoursePackageId(long coursePackageId)
		throws SystemException {
		for (CoursePackage coursePackage : findByCoursePackageId(
				coursePackageId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(coursePackage);
		}
	}

	/**
	 * Returns the number of course packages where coursePackageId = &#63;.
	 *
	 * @param coursePackageId the course package ID
	 * @return the number of matching course packages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCoursePackageId(long coursePackageId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COURSEPACKAGEID;

		Object[] finderArgs = new Object[] { coursePackageId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COURSEPACKAGE_WHERE);

			query.append(_FINDER_COLUMN_COURSEPACKAGEID_COURSEPACKAGEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(coursePackageId);

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

	private static final String _FINDER_COLUMN_COURSEPACKAGEID_COURSEPACKAGEID_2 =
		"coursePackage.coursePackageId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NAME = new FinderPath(CoursePackageModelImpl.ENTITY_CACHE_ENABLED,
			CoursePackageModelImpl.FINDER_CACHE_ENABLED,
			CoursePackageImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByName",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME = new FinderPath(CoursePackageModelImpl.ENTITY_CACHE_ENABLED,
			CoursePackageModelImpl.FINDER_CACHE_ENABLED,
			CoursePackageImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByName", new String[] { String.class.getName() },
			CoursePackageModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NAME = new FinderPath(CoursePackageModelImpl.ENTITY_CACHE_ENABLED,
			CoursePackageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByName",
			new String[] { String.class.getName() });

	/**
	 * Returns all the course packages where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching course packages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CoursePackage> findByName(String name)
		throws SystemException {
		return findByName(name, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the course packages where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CoursePackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of course packages
	 * @param end the upper bound of the range of course packages (not inclusive)
	 * @return the range of matching course packages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CoursePackage> findByName(String name, int start, int end)
		throws SystemException {
		return findByName(name, start, end, null);
	}

	/**
	 * Returns an ordered range of all the course packages where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CoursePackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of course packages
	 * @param end the upper bound of the range of course packages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching course packages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CoursePackage> findByName(String name, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME;
			finderArgs = new Object[] { name };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NAME;
			finderArgs = new Object[] { name, start, end, orderByComparator };
		}

		List<CoursePackage> list = (List<CoursePackage>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CoursePackage coursePackage : list) {
				if (!Validator.equals(name, coursePackage.getName())) {
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

			query.append(_SQL_SELECT_COURSEPACKAGE_WHERE);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_NAME_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NAME_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_NAME_NAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CoursePackageModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindName) {
					qPos.add(name);
				}

				if (!pagination) {
					list = (List<CoursePackage>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CoursePackage>(list);
				}
				else {
					list = (List<CoursePackage>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first course package in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course package
	 * @throws com.ocms.course.NoSuchCoursePackageException if a matching course package could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CoursePackage findByName_First(String name,
		OrderByComparator orderByComparator)
		throws NoSuchCoursePackageException, SystemException {
		CoursePackage coursePackage = fetchByName_First(name, orderByComparator);

		if (coursePackage != null) {
			return coursePackage;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCoursePackageException(msg.toString());
	}

	/**
	 * Returns the first course package in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course package, or <code>null</code> if a matching course package could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CoursePackage fetchByName_First(String name,
		OrderByComparator orderByComparator) throws SystemException {
		List<CoursePackage> list = findByName(name, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last course package in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course package
	 * @throws com.ocms.course.NoSuchCoursePackageException if a matching course package could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CoursePackage findByName_Last(String name,
		OrderByComparator orderByComparator)
		throws NoSuchCoursePackageException, SystemException {
		CoursePackage coursePackage = fetchByName_Last(name, orderByComparator);

		if (coursePackage != null) {
			return coursePackage;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCoursePackageException(msg.toString());
	}

	/**
	 * Returns the last course package in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course package, or <code>null</code> if a matching course package could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CoursePackage fetchByName_Last(String name,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByName(name);

		if (count == 0) {
			return null;
		}

		List<CoursePackage> list = findByName(name, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the course packages before and after the current course package in the ordered set where name = &#63;.
	 *
	 * @param coursePackageId the primary key of the current course package
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next course package
	 * @throws com.ocms.course.NoSuchCoursePackageException if a course package with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CoursePackage[] findByName_PrevAndNext(long coursePackageId,
		String name, OrderByComparator orderByComparator)
		throws NoSuchCoursePackageException, SystemException {
		CoursePackage coursePackage = findByPrimaryKey(coursePackageId);

		Session session = null;

		try {
			session = openSession();

			CoursePackage[] array = new CoursePackageImpl[3];

			array[0] = getByName_PrevAndNext(session, coursePackage, name,
					orderByComparator, true);

			array[1] = coursePackage;

			array[2] = getByName_PrevAndNext(session, coursePackage, name,
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

	protected CoursePackage getByName_PrevAndNext(Session session,
		CoursePackage coursePackage, String name,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_COURSEPACKAGE_WHERE);

		boolean bindName = false;

		if (name == null) {
			query.append(_FINDER_COLUMN_NAME_NAME_1);
		}
		else if (name.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NAME_NAME_3);
		}
		else {
			bindName = true;

			query.append(_FINDER_COLUMN_NAME_NAME_2);
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
			query.append(CoursePackageModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindName) {
			qPos.add(name);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(coursePackage);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CoursePackage> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the course packages where name = &#63; from the database.
	 *
	 * @param name the name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByName(String name) throws SystemException {
		for (CoursePackage coursePackage : findByName(name, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(coursePackage);
		}
	}

	/**
	 * Returns the number of course packages where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching course packages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByName(String name) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NAME;

		Object[] finderArgs = new Object[] { name };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COURSEPACKAGE_WHERE);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_NAME_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NAME_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_NAME_NAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindName) {
					qPos.add(name);
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

	private static final String _FINDER_COLUMN_NAME_NAME_1 = "coursePackage.name IS NULL";
	private static final String _FINDER_COLUMN_NAME_NAME_2 = "coursePackage.name = ?";
	private static final String _FINDER_COLUMN_NAME_NAME_3 = "(coursePackage.name IS NULL OR coursePackage.name = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(CoursePackageModelImpl.ENTITY_CACHE_ENABLED,
			CoursePackageModelImpl.FINDER_CACHE_ENABLED,
			CoursePackageImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(CoursePackageModelImpl.ENTITY_CACHE_ENABLED,
			CoursePackageModelImpl.FINDER_CACHE_ENABLED,
			CoursePackageImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByGroupId", new String[] { Long.class.getName() },
			CoursePackageModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(CoursePackageModelImpl.ENTITY_CACHE_ENABLED,
			CoursePackageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the course packages where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching course packages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CoursePackage> findByGroupId(long groupId)
		throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the course packages where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CoursePackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of course packages
	 * @param end the upper bound of the range of course packages (not inclusive)
	 * @return the range of matching course packages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CoursePackage> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the course packages where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CoursePackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of course packages
	 * @param end the upper bound of the range of course packages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching course packages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CoursePackage> findByGroupId(long groupId, int start, int end,
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

		List<CoursePackage> list = (List<CoursePackage>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CoursePackage coursePackage : list) {
				if ((groupId != coursePackage.getGroupId())) {
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

			query.append(_SQL_SELECT_COURSEPACKAGE_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CoursePackageModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<CoursePackage>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CoursePackage>(list);
				}
				else {
					list = (List<CoursePackage>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first course package in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course package
	 * @throws com.ocms.course.NoSuchCoursePackageException if a matching course package could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CoursePackage findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchCoursePackageException, SystemException {
		CoursePackage coursePackage = fetchByGroupId_First(groupId,
				orderByComparator);

		if (coursePackage != null) {
			return coursePackage;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCoursePackageException(msg.toString());
	}

	/**
	 * Returns the first course package in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course package, or <code>null</code> if a matching course package could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CoursePackage fetchByGroupId_First(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<CoursePackage> list = findByGroupId(groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last course package in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course package
	 * @throws com.ocms.course.NoSuchCoursePackageException if a matching course package could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CoursePackage findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchCoursePackageException, SystemException {
		CoursePackage coursePackage = fetchByGroupId_Last(groupId,
				orderByComparator);

		if (coursePackage != null) {
			return coursePackage;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCoursePackageException(msg.toString());
	}

	/**
	 * Returns the last course package in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course package, or <code>null</code> if a matching course package could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CoursePackage fetchByGroupId_Last(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<CoursePackage> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the course packages before and after the current course package in the ordered set where groupId = &#63;.
	 *
	 * @param coursePackageId the primary key of the current course package
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next course package
	 * @throws com.ocms.course.NoSuchCoursePackageException if a course package with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CoursePackage[] findByGroupId_PrevAndNext(long coursePackageId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchCoursePackageException, SystemException {
		CoursePackage coursePackage = findByPrimaryKey(coursePackageId);

		Session session = null;

		try {
			session = openSession();

			CoursePackage[] array = new CoursePackageImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, coursePackage,
					groupId, orderByComparator, true);

			array[1] = coursePackage;

			array[2] = getByGroupId_PrevAndNext(session, coursePackage,
					groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CoursePackage getByGroupId_PrevAndNext(Session session,
		CoursePackage coursePackage, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_COURSEPACKAGE_WHERE);

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
			query.append(CoursePackageModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(coursePackage);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CoursePackage> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the course packages where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupId(long groupId) throws SystemException {
		for (CoursePackage coursePackage : findByGroupId(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(coursePackage);
		}
	}

	/**
	 * Returns the number of course packages where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching course packages
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

			query.append(_SQL_COUNT_COURSEPACKAGE_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "coursePackage.groupId = ?";

	public CoursePackagePersistenceImpl() {
		setModelClass(CoursePackage.class);
	}

	/**
	 * Caches the course package in the entity cache if it is enabled.
	 *
	 * @param coursePackage the course package
	 */
	@Override
	public void cacheResult(CoursePackage coursePackage) {
		EntityCacheUtil.putResult(CoursePackageModelImpl.ENTITY_CACHE_ENABLED,
			CoursePackageImpl.class, coursePackage.getPrimaryKey(),
			coursePackage);

		coursePackage.resetOriginalValues();
	}

	/**
	 * Caches the course packages in the entity cache if it is enabled.
	 *
	 * @param coursePackages the course packages
	 */
	@Override
	public void cacheResult(List<CoursePackage> coursePackages) {
		for (CoursePackage coursePackage : coursePackages) {
			if (EntityCacheUtil.getResult(
						CoursePackageModelImpl.ENTITY_CACHE_ENABLED,
						CoursePackageImpl.class, coursePackage.getPrimaryKey()) == null) {
				cacheResult(coursePackage);
			}
			else {
				coursePackage.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all course packages.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CoursePackageImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CoursePackageImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the course package.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CoursePackage coursePackage) {
		EntityCacheUtil.removeResult(CoursePackageModelImpl.ENTITY_CACHE_ENABLED,
			CoursePackageImpl.class, coursePackage.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CoursePackage> coursePackages) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CoursePackage coursePackage : coursePackages) {
			EntityCacheUtil.removeResult(CoursePackageModelImpl.ENTITY_CACHE_ENABLED,
				CoursePackageImpl.class, coursePackage.getPrimaryKey());
		}
	}

	/**
	 * Creates a new course package with the primary key. Does not add the course package to the database.
	 *
	 * @param coursePackageId the primary key for the new course package
	 * @return the new course package
	 */
	@Override
	public CoursePackage create(long coursePackageId) {
		CoursePackage coursePackage = new CoursePackageImpl();

		coursePackage.setNew(true);
		coursePackage.setPrimaryKey(coursePackageId);

		return coursePackage;
	}

	/**
	 * Removes the course package with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param coursePackageId the primary key of the course package
	 * @return the course package that was removed
	 * @throws com.ocms.course.NoSuchCoursePackageException if a course package with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CoursePackage remove(long coursePackageId)
		throws NoSuchCoursePackageException, SystemException {
		return remove((Serializable)coursePackageId);
	}

	/**
	 * Removes the course package with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the course package
	 * @return the course package that was removed
	 * @throws com.ocms.course.NoSuchCoursePackageException if a course package with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CoursePackage remove(Serializable primaryKey)
		throws NoSuchCoursePackageException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CoursePackage coursePackage = (CoursePackage)session.get(CoursePackageImpl.class,
					primaryKey);

			if (coursePackage == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCoursePackageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(coursePackage);
		}
		catch (NoSuchCoursePackageException nsee) {
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
	protected CoursePackage removeImpl(CoursePackage coursePackage)
		throws SystemException {
		coursePackage = toUnwrappedModel(coursePackage);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(coursePackage)) {
				coursePackage = (CoursePackage)session.get(CoursePackageImpl.class,
						coursePackage.getPrimaryKeyObj());
			}

			if (coursePackage != null) {
				session.delete(coursePackage);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (coursePackage != null) {
			clearCache(coursePackage);
		}

		return coursePackage;
	}

	@Override
	public CoursePackage updateImpl(
		com.ocms.course.model.CoursePackage coursePackage)
		throws SystemException {
		coursePackage = toUnwrappedModel(coursePackage);

		boolean isNew = coursePackage.isNew();

		CoursePackageModelImpl coursePackageModelImpl = (CoursePackageModelImpl)coursePackage;

		Session session = null;

		try {
			session = openSession();

			if (coursePackage.isNew()) {
				session.save(coursePackage);

				coursePackage.setNew(false);
			}
			else {
				session.merge(coursePackage);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CoursePackageModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((coursePackageModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSEPACKAGEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						coursePackageModelImpl.getOriginalCoursePackageId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COURSEPACKAGEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSEPACKAGEID,
					args);

				args = new Object[] { coursePackageModelImpl.getCoursePackageId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COURSEPACKAGEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSEPACKAGEID,
					args);
			}

			if ((coursePackageModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						coursePackageModelImpl.getOriginalName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAME, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME,
					args);

				args = new Object[] { coursePackageModelImpl.getName() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAME, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME,
					args);
			}

			if ((coursePackageModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						coursePackageModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { coursePackageModelImpl.getGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}
		}

		EntityCacheUtil.putResult(CoursePackageModelImpl.ENTITY_CACHE_ENABLED,
			CoursePackageImpl.class, coursePackage.getPrimaryKey(),
			coursePackage);

		return coursePackage;
	}

	protected CoursePackage toUnwrappedModel(CoursePackage coursePackage) {
		if (coursePackage instanceof CoursePackageImpl) {
			return coursePackage;
		}

		CoursePackageImpl coursePackageImpl = new CoursePackageImpl();

		coursePackageImpl.setNew(coursePackage.isNew());
		coursePackageImpl.setPrimaryKey(coursePackage.getPrimaryKey());

		coursePackageImpl.setCoursePackageId(coursePackage.getCoursePackageId());
		coursePackageImpl.setGroupId(coursePackage.getGroupId());
		coursePackageImpl.setCompanyId(coursePackage.getCompanyId());
		coursePackageImpl.setUserId(coursePackage.getUserId());
		coursePackageImpl.setUserName(coursePackage.getUserName());
		coursePackageImpl.setCreateDate(coursePackage.getCreateDate());
		coursePackageImpl.setModifiedDate(coursePackage.getModifiedDate());
		coursePackageImpl.setName(coursePackage.getName());
		coursePackageImpl.setCode(coursePackage.getCode());

		return coursePackageImpl;
	}

	/**
	 * Returns the course package with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the course package
	 * @return the course package
	 * @throws com.ocms.course.NoSuchCoursePackageException if a course package with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CoursePackage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCoursePackageException, SystemException {
		CoursePackage coursePackage = fetchByPrimaryKey(primaryKey);

		if (coursePackage == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCoursePackageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return coursePackage;
	}

	/**
	 * Returns the course package with the primary key or throws a {@link com.ocms.course.NoSuchCoursePackageException} if it could not be found.
	 *
	 * @param coursePackageId the primary key of the course package
	 * @return the course package
	 * @throws com.ocms.course.NoSuchCoursePackageException if a course package with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CoursePackage findByPrimaryKey(long coursePackageId)
		throws NoSuchCoursePackageException, SystemException {
		return findByPrimaryKey((Serializable)coursePackageId);
	}

	/**
	 * Returns the course package with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the course package
	 * @return the course package, or <code>null</code> if a course package with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CoursePackage fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CoursePackage coursePackage = (CoursePackage)EntityCacheUtil.getResult(CoursePackageModelImpl.ENTITY_CACHE_ENABLED,
				CoursePackageImpl.class, primaryKey);

		if (coursePackage == _nullCoursePackage) {
			return null;
		}

		if (coursePackage == null) {
			Session session = null;

			try {
				session = openSession();

				coursePackage = (CoursePackage)session.get(CoursePackageImpl.class,
						primaryKey);

				if (coursePackage != null) {
					cacheResult(coursePackage);
				}
				else {
					EntityCacheUtil.putResult(CoursePackageModelImpl.ENTITY_CACHE_ENABLED,
						CoursePackageImpl.class, primaryKey, _nullCoursePackage);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CoursePackageModelImpl.ENTITY_CACHE_ENABLED,
					CoursePackageImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return coursePackage;
	}

	/**
	 * Returns the course package with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param coursePackageId the primary key of the course package
	 * @return the course package, or <code>null</code> if a course package with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CoursePackage fetchByPrimaryKey(long coursePackageId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)coursePackageId);
	}

	/**
	 * Returns all the course packages.
	 *
	 * @return the course packages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CoursePackage> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the course packages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CoursePackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of course packages
	 * @param end the upper bound of the range of course packages (not inclusive)
	 * @return the range of course packages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CoursePackage> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the course packages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.CoursePackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of course packages
	 * @param end the upper bound of the range of course packages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of course packages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CoursePackage> findAll(int start, int end,
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

		List<CoursePackage> list = (List<CoursePackage>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_COURSEPACKAGE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_COURSEPACKAGE;

				if (pagination) {
					sql = sql.concat(CoursePackageModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CoursePackage>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CoursePackage>(list);
				}
				else {
					list = (List<CoursePackage>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the course packages from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CoursePackage coursePackage : findAll()) {
			remove(coursePackage);
		}
	}

	/**
	 * Returns the number of course packages.
	 *
	 * @return the number of course packages
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

				Query q = session.createQuery(_SQL_COUNT_COURSEPACKAGE);

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
	 * Initializes the course package persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ocms.course.model.CoursePackage")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CoursePackage>> listenersList = new ArrayList<ModelListener<CoursePackage>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CoursePackage>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CoursePackageImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_COURSEPACKAGE = "SELECT coursePackage FROM CoursePackage coursePackage";
	private static final String _SQL_SELECT_COURSEPACKAGE_WHERE = "SELECT coursePackage FROM CoursePackage coursePackage WHERE ";
	private static final String _SQL_COUNT_COURSEPACKAGE = "SELECT COUNT(coursePackage) FROM CoursePackage coursePackage";
	private static final String _SQL_COUNT_COURSEPACKAGE_WHERE = "SELECT COUNT(coursePackage) FROM CoursePackage coursePackage WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "coursePackage.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CoursePackage exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CoursePackage exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CoursePackagePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"code"
			});
	private static CoursePackage _nullCoursePackage = new CoursePackageImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CoursePackage> toCacheModel() {
				return _nullCoursePackageCacheModel;
			}
		};

	private static CacheModel<CoursePackage> _nullCoursePackageCacheModel = new CacheModel<CoursePackage>() {
			@Override
			public CoursePackage toEntityModel() {
				return _nullCoursePackage;
			}
		};
}