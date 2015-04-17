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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.ocms.course.NoSuchStudentRegistrationException;
import com.ocms.course.model.StudentRegistration;
import com.ocms.course.model.impl.StudentRegistrationImpl;
import com.ocms.course.model.impl.StudentRegistrationModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the student registration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author doraraj
 * @see StudentRegistrationPersistence
 * @see StudentRegistrationUtil
 * @generated
 */
public class StudentRegistrationPersistenceImpl extends BasePersistenceImpl<StudentRegistration>
	implements StudentRegistrationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link StudentRegistrationUtil} to access the student registration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = StudentRegistrationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(StudentRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			StudentRegistrationModelImpl.FINDER_CACHE_ENABLED,
			StudentRegistrationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(StudentRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			StudentRegistrationModelImpl.FINDER_CACHE_ENABLED,
			StudentRegistrationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(StudentRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			StudentRegistrationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(StudentRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			StudentRegistrationModelImpl.FINDER_CACHE_ENABLED,
			StudentRegistrationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(StudentRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			StudentRegistrationModelImpl.FINDER_CACHE_ENABLED,
			StudentRegistrationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			StudentRegistrationModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(StudentRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			StudentRegistrationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the student registrations where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching student registrations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StudentRegistration> findByGroupId(long groupId)
		throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the student registrations where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.StudentRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of student registrations
	 * @param end the upper bound of the range of student registrations (not inclusive)
	 * @return the range of matching student registrations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StudentRegistration> findByGroupId(long groupId, int start,
		int end) throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the student registrations where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.StudentRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of student registrations
	 * @param end the upper bound of the range of student registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching student registrations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StudentRegistration> findByGroupId(long groupId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
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

		List<StudentRegistration> list = (List<StudentRegistration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (StudentRegistration studentRegistration : list) {
				if ((groupId != studentRegistration.getGroupId())) {
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

			query.append(_SQL_SELECT_STUDENTREGISTRATION_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(StudentRegistrationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<StudentRegistration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<StudentRegistration>(list);
				}
				else {
					list = (List<StudentRegistration>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first student registration in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student registration
	 * @throws com.ocms.course.NoSuchStudentRegistrationException if a matching student registration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StudentRegistration findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchStudentRegistrationException, SystemException {
		StudentRegistration studentRegistration = fetchByGroupId_First(groupId,
				orderByComparator);

		if (studentRegistration != null) {
			return studentRegistration;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchStudentRegistrationException(msg.toString());
	}

	/**
	 * Returns the first student registration in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student registration, or <code>null</code> if a matching student registration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StudentRegistration fetchByGroupId_First(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<StudentRegistration> list = findByGroupId(groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last student registration in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student registration
	 * @throws com.ocms.course.NoSuchStudentRegistrationException if a matching student registration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StudentRegistration findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchStudentRegistrationException, SystemException {
		StudentRegistration studentRegistration = fetchByGroupId_Last(groupId,
				orderByComparator);

		if (studentRegistration != null) {
			return studentRegistration;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchStudentRegistrationException(msg.toString());
	}

	/**
	 * Returns the last student registration in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student registration, or <code>null</code> if a matching student registration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StudentRegistration fetchByGroupId_Last(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<StudentRegistration> list = findByGroupId(groupId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the student registrations before and after the current student registration in the ordered set where groupId = &#63;.
	 *
	 * @param studRegId the primary key of the current student registration
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next student registration
	 * @throws com.ocms.course.NoSuchStudentRegistrationException if a student registration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StudentRegistration[] findByGroupId_PrevAndNext(long studRegId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchStudentRegistrationException, SystemException {
		StudentRegistration studentRegistration = findByPrimaryKey(studRegId);

		Session session = null;

		try {
			session = openSession();

			StudentRegistration[] array = new StudentRegistrationImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, studentRegistration,
					groupId, orderByComparator, true);

			array[1] = studentRegistration;

			array[2] = getByGroupId_PrevAndNext(session, studentRegistration,
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

	protected StudentRegistration getByGroupId_PrevAndNext(Session session,
		StudentRegistration studentRegistration, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_STUDENTREGISTRATION_WHERE);

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
			query.append(StudentRegistrationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(studentRegistration);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<StudentRegistration> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the student registrations where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupId(long groupId) throws SystemException {
		for (StudentRegistration studentRegistration : findByGroupId(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(studentRegistration);
		}
	}

	/**
	 * Returns the number of student registrations where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching student registrations
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

			query.append(_SQL_COUNT_STUDENTREGISTRATION_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "studentRegistration.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STUDREGID =
		new FinderPath(StudentRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			StudentRegistrationModelImpl.FINDER_CACHE_ENABLED,
			StudentRegistrationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStudRegId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STUDREGID =
		new FinderPath(StudentRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			StudentRegistrationModelImpl.FINDER_CACHE_ENABLED,
			StudentRegistrationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStudRegId",
			new String[] { Long.class.getName() },
			StudentRegistrationModelImpl.STUDREGID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STUDREGID = new FinderPath(StudentRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			StudentRegistrationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStudRegId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the student registrations where studRegId = &#63;.
	 *
	 * @param studRegId the stud reg ID
	 * @return the matching student registrations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StudentRegistration> findByStudRegId(long studRegId)
		throws SystemException {
		return findByStudRegId(studRegId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the student registrations where studRegId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.StudentRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param studRegId the stud reg ID
	 * @param start the lower bound of the range of student registrations
	 * @param end the upper bound of the range of student registrations (not inclusive)
	 * @return the range of matching student registrations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StudentRegistration> findByStudRegId(long studRegId, int start,
		int end) throws SystemException {
		return findByStudRegId(studRegId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the student registrations where studRegId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.StudentRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param studRegId the stud reg ID
	 * @param start the lower bound of the range of student registrations
	 * @param end the upper bound of the range of student registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching student registrations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StudentRegistration> findByStudRegId(long studRegId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STUDREGID;
			finderArgs = new Object[] { studRegId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STUDREGID;
			finderArgs = new Object[] { studRegId, start, end, orderByComparator };
		}

		List<StudentRegistration> list = (List<StudentRegistration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (StudentRegistration studentRegistration : list) {
				if ((studRegId != studentRegistration.getStudRegId())) {
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

			query.append(_SQL_SELECT_STUDENTREGISTRATION_WHERE);

			query.append(_FINDER_COLUMN_STUDREGID_STUDREGID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(StudentRegistrationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(studRegId);

				if (!pagination) {
					list = (List<StudentRegistration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<StudentRegistration>(list);
				}
				else {
					list = (List<StudentRegistration>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first student registration in the ordered set where studRegId = &#63;.
	 *
	 * @param studRegId the stud reg ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student registration
	 * @throws com.ocms.course.NoSuchStudentRegistrationException if a matching student registration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StudentRegistration findByStudRegId_First(long studRegId,
		OrderByComparator orderByComparator)
		throws NoSuchStudentRegistrationException, SystemException {
		StudentRegistration studentRegistration = fetchByStudRegId_First(studRegId,
				orderByComparator);

		if (studentRegistration != null) {
			return studentRegistration;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("studRegId=");
		msg.append(studRegId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchStudentRegistrationException(msg.toString());
	}

	/**
	 * Returns the first student registration in the ordered set where studRegId = &#63;.
	 *
	 * @param studRegId the stud reg ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching student registration, or <code>null</code> if a matching student registration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StudentRegistration fetchByStudRegId_First(long studRegId,
		OrderByComparator orderByComparator) throws SystemException {
		List<StudentRegistration> list = findByStudRegId(studRegId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last student registration in the ordered set where studRegId = &#63;.
	 *
	 * @param studRegId the stud reg ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student registration
	 * @throws com.ocms.course.NoSuchStudentRegistrationException if a matching student registration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StudentRegistration findByStudRegId_Last(long studRegId,
		OrderByComparator orderByComparator)
		throws NoSuchStudentRegistrationException, SystemException {
		StudentRegistration studentRegistration = fetchByStudRegId_Last(studRegId,
				orderByComparator);

		if (studentRegistration != null) {
			return studentRegistration;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("studRegId=");
		msg.append(studRegId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchStudentRegistrationException(msg.toString());
	}

	/**
	 * Returns the last student registration in the ordered set where studRegId = &#63;.
	 *
	 * @param studRegId the stud reg ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching student registration, or <code>null</code> if a matching student registration could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StudentRegistration fetchByStudRegId_Last(long studRegId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByStudRegId(studRegId);

		if (count == 0) {
			return null;
		}

		List<StudentRegistration> list = findByStudRegId(studRegId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the student registrations where studRegId = &#63; from the database.
	 *
	 * @param studRegId the stud reg ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByStudRegId(long studRegId) throws SystemException {
		for (StudentRegistration studentRegistration : findByStudRegId(
				studRegId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(studentRegistration);
		}
	}

	/**
	 * Returns the number of student registrations where studRegId = &#63;.
	 *
	 * @param studRegId the stud reg ID
	 * @return the number of matching student registrations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByStudRegId(long studRegId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STUDREGID;

		Object[] finderArgs = new Object[] { studRegId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_STUDENTREGISTRATION_WHERE);

			query.append(_FINDER_COLUMN_STUDREGID_STUDREGID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(studRegId);

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

	private static final String _FINDER_COLUMN_STUDREGID_STUDREGID_2 = "studentRegistration.studRegId = ?";

	public StudentRegistrationPersistenceImpl() {
		setModelClass(StudentRegistration.class);
	}

	/**
	 * Caches the student registration in the entity cache if it is enabled.
	 *
	 * @param studentRegistration the student registration
	 */
	@Override
	public void cacheResult(StudentRegistration studentRegistration) {
		EntityCacheUtil.putResult(StudentRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			StudentRegistrationImpl.class, studentRegistration.getPrimaryKey(),
			studentRegistration);

		studentRegistration.resetOriginalValues();
	}

	/**
	 * Caches the student registrations in the entity cache if it is enabled.
	 *
	 * @param studentRegistrations the student registrations
	 */
	@Override
	public void cacheResult(List<StudentRegistration> studentRegistrations) {
		for (StudentRegistration studentRegistration : studentRegistrations) {
			if (EntityCacheUtil.getResult(
						StudentRegistrationModelImpl.ENTITY_CACHE_ENABLED,
						StudentRegistrationImpl.class,
						studentRegistration.getPrimaryKey()) == null) {
				cacheResult(studentRegistration);
			}
			else {
				studentRegistration.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all student registrations.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(StudentRegistrationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(StudentRegistrationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the student registration.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(StudentRegistration studentRegistration) {
		EntityCacheUtil.removeResult(StudentRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			StudentRegistrationImpl.class, studentRegistration.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<StudentRegistration> studentRegistrations) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (StudentRegistration studentRegistration : studentRegistrations) {
			EntityCacheUtil.removeResult(StudentRegistrationModelImpl.ENTITY_CACHE_ENABLED,
				StudentRegistrationImpl.class,
				studentRegistration.getPrimaryKey());
		}
	}

	/**
	 * Creates a new student registration with the primary key. Does not add the student registration to the database.
	 *
	 * @param studRegId the primary key for the new student registration
	 * @return the new student registration
	 */
	@Override
	public StudentRegistration create(long studRegId) {
		StudentRegistration studentRegistration = new StudentRegistrationImpl();

		studentRegistration.setNew(true);
		studentRegistration.setPrimaryKey(studRegId);

		return studentRegistration;
	}

	/**
	 * Removes the student registration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param studRegId the primary key of the student registration
	 * @return the student registration that was removed
	 * @throws com.ocms.course.NoSuchStudentRegistrationException if a student registration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StudentRegistration remove(long studRegId)
		throws NoSuchStudentRegistrationException, SystemException {
		return remove((Serializable)studRegId);
	}

	/**
	 * Removes the student registration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the student registration
	 * @return the student registration that was removed
	 * @throws com.ocms.course.NoSuchStudentRegistrationException if a student registration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StudentRegistration remove(Serializable primaryKey)
		throws NoSuchStudentRegistrationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			StudentRegistration studentRegistration = (StudentRegistration)session.get(StudentRegistrationImpl.class,
					primaryKey);

			if (studentRegistration == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchStudentRegistrationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(studentRegistration);
		}
		catch (NoSuchStudentRegistrationException nsee) {
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
	protected StudentRegistration removeImpl(
		StudentRegistration studentRegistration) throws SystemException {
		studentRegistration = toUnwrappedModel(studentRegistration);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(studentRegistration)) {
				studentRegistration = (StudentRegistration)session.get(StudentRegistrationImpl.class,
						studentRegistration.getPrimaryKeyObj());
			}

			if (studentRegistration != null) {
				session.delete(studentRegistration);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (studentRegistration != null) {
			clearCache(studentRegistration);
		}

		return studentRegistration;
	}

	@Override
	public StudentRegistration updateImpl(
		com.ocms.course.model.StudentRegistration studentRegistration)
		throws SystemException {
		studentRegistration = toUnwrappedModel(studentRegistration);

		boolean isNew = studentRegistration.isNew();

		StudentRegistrationModelImpl studentRegistrationModelImpl = (StudentRegistrationModelImpl)studentRegistration;

		Session session = null;

		try {
			session = openSession();

			if (studentRegistration.isNew()) {
				session.save(studentRegistration);

				studentRegistration.setNew(false);
			}
			else {
				session.merge(studentRegistration);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !StudentRegistrationModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((studentRegistrationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						studentRegistrationModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { studentRegistrationModelImpl.getGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((studentRegistrationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STUDREGID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						studentRegistrationModelImpl.getOriginalStudRegId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STUDREGID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STUDREGID,
					args);

				args = new Object[] { studentRegistrationModelImpl.getStudRegId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STUDREGID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STUDREGID,
					args);
			}
		}

		EntityCacheUtil.putResult(StudentRegistrationModelImpl.ENTITY_CACHE_ENABLED,
			StudentRegistrationImpl.class, studentRegistration.getPrimaryKey(),
			studentRegistration);

		return studentRegistration;
	}

	protected StudentRegistration toUnwrappedModel(
		StudentRegistration studentRegistration) {
		if (studentRegistration instanceof StudentRegistrationImpl) {
			return studentRegistration;
		}

		StudentRegistrationImpl studentRegistrationImpl = new StudentRegistrationImpl();

		studentRegistrationImpl.setNew(studentRegistration.isNew());
		studentRegistrationImpl.setPrimaryKey(studentRegistration.getPrimaryKey());

		studentRegistrationImpl.setStudRegId(studentRegistration.getStudRegId());
		studentRegistrationImpl.setGroupId(studentRegistration.getGroupId());
		studentRegistrationImpl.setCompanyId(studentRegistration.getCompanyId());
		studentRegistrationImpl.setUserId(studentRegistration.getUserId());
		studentRegistrationImpl.setUserName(studentRegistration.getUserName());
		studentRegistrationImpl.setCreateDate(studentRegistration.getCreateDate());
		studentRegistrationImpl.setModifiedDate(studentRegistration.getModifiedDate());
		studentRegistrationImpl.setMemo(studentRegistration.getMemo());
		studentRegistrationImpl.setStudRegStatus(studentRegistration.getStudRegStatus());
		studentRegistrationImpl.setAdvisorOrig(studentRegistration.getAdvisorOrig());
		studentRegistrationImpl.setAdvisorReg(studentRegistration.getAdvisorReg());
		studentRegistrationImpl.setCoursePackageId(studentRegistration.getCoursePackageId());
		studentRegistrationImpl.setDiscountId(studentRegistration.getDiscountId());
		studentRegistrationImpl.setCommMethod(studentRegistration.getCommMethod());
		studentRegistrationImpl.setNotes(studentRegistration.getNotes());
		studentRegistrationImpl.setCurrency(studentRegistration.getCurrency());
		studentRegistrationImpl.setTax(studentRegistration.getTax());
		studentRegistrationImpl.setAutoCharge(studentRegistration.getAutoCharge());
		studentRegistrationImpl.setCurrencyPaid(studentRegistration.getCurrencyPaid());
		studentRegistrationImpl.setExchangeRate(studentRegistration.getExchangeRate());
		studentRegistrationImpl.setContactId(studentRegistration.getContactId());

		return studentRegistrationImpl;
	}

	/**
	 * Returns the student registration with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the student registration
	 * @return the student registration
	 * @throws com.ocms.course.NoSuchStudentRegistrationException if a student registration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StudentRegistration findByPrimaryKey(Serializable primaryKey)
		throws NoSuchStudentRegistrationException, SystemException {
		StudentRegistration studentRegistration = fetchByPrimaryKey(primaryKey);

		if (studentRegistration == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchStudentRegistrationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return studentRegistration;
	}

	/**
	 * Returns the student registration with the primary key or throws a {@link com.ocms.course.NoSuchStudentRegistrationException} if it could not be found.
	 *
	 * @param studRegId the primary key of the student registration
	 * @return the student registration
	 * @throws com.ocms.course.NoSuchStudentRegistrationException if a student registration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StudentRegistration findByPrimaryKey(long studRegId)
		throws NoSuchStudentRegistrationException, SystemException {
		return findByPrimaryKey((Serializable)studRegId);
	}

	/**
	 * Returns the student registration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the student registration
	 * @return the student registration, or <code>null</code> if a student registration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StudentRegistration fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		StudentRegistration studentRegistration = (StudentRegistration)EntityCacheUtil.getResult(StudentRegistrationModelImpl.ENTITY_CACHE_ENABLED,
				StudentRegistrationImpl.class, primaryKey);

		if (studentRegistration == _nullStudentRegistration) {
			return null;
		}

		if (studentRegistration == null) {
			Session session = null;

			try {
				session = openSession();

				studentRegistration = (StudentRegistration)session.get(StudentRegistrationImpl.class,
						primaryKey);

				if (studentRegistration != null) {
					cacheResult(studentRegistration);
				}
				else {
					EntityCacheUtil.putResult(StudentRegistrationModelImpl.ENTITY_CACHE_ENABLED,
						StudentRegistrationImpl.class, primaryKey,
						_nullStudentRegistration);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(StudentRegistrationModelImpl.ENTITY_CACHE_ENABLED,
					StudentRegistrationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return studentRegistration;
	}

	/**
	 * Returns the student registration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param studRegId the primary key of the student registration
	 * @return the student registration, or <code>null</code> if a student registration with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StudentRegistration fetchByPrimaryKey(long studRegId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)studRegId);
	}

	/**
	 * Returns all the student registrations.
	 *
	 * @return the student registrations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StudentRegistration> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the student registrations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.StudentRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of student registrations
	 * @param end the upper bound of the range of student registrations (not inclusive)
	 * @return the range of student registrations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StudentRegistration> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the student registrations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.StudentRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of student registrations
	 * @param end the upper bound of the range of student registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of student registrations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StudentRegistration> findAll(int start, int end,
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

		List<StudentRegistration> list = (List<StudentRegistration>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_STUDENTREGISTRATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_STUDENTREGISTRATION;

				if (pagination) {
					sql = sql.concat(StudentRegistrationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<StudentRegistration>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<StudentRegistration>(list);
				}
				else {
					list = (List<StudentRegistration>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the student registrations from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (StudentRegistration studentRegistration : findAll()) {
			remove(studentRegistration);
		}
	}

	/**
	 * Returns the number of student registrations.
	 *
	 * @return the number of student registrations
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

				Query q = session.createQuery(_SQL_COUNT_STUDENTREGISTRATION);

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
	 * Initializes the student registration persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ocms.course.model.StudentRegistration")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<StudentRegistration>> listenersList = new ArrayList<ModelListener<StudentRegistration>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<StudentRegistration>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(StudentRegistrationImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_STUDENTREGISTRATION = "SELECT studentRegistration FROM StudentRegistration studentRegistration";
	private static final String _SQL_SELECT_STUDENTREGISTRATION_WHERE = "SELECT studentRegistration FROM StudentRegistration studentRegistration WHERE ";
	private static final String _SQL_COUNT_STUDENTREGISTRATION = "SELECT COUNT(studentRegistration) FROM StudentRegistration studentRegistration";
	private static final String _SQL_COUNT_STUDENTREGISTRATION_WHERE = "SELECT COUNT(studentRegistration) FROM StudentRegistration studentRegistration WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "studentRegistration.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No StudentRegistration exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No StudentRegistration exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(StudentRegistrationPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"currency"
			});
	private static StudentRegistration _nullStudentRegistration = new StudentRegistrationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<StudentRegistration> toCacheModel() {
				return _nullStudentRegistrationCacheModel;
			}
		};

	private static CacheModel<StudentRegistration> _nullStudentRegistrationCacheModel =
		new CacheModel<StudentRegistration>() {
			@Override
			public StudentRegistration toEntityModel() {
				return _nullStudentRegistration;
			}
		};
}