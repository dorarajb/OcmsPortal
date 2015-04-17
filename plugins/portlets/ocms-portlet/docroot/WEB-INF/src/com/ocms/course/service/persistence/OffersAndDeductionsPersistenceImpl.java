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

import com.ocms.course.NoSuchOffersAndDeductionsException;
import com.ocms.course.model.OffersAndDeductions;
import com.ocms.course.model.impl.OffersAndDeductionsImpl;
import com.ocms.course.model.impl.OffersAndDeductionsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the offers and deductions service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author doraraj
 * @see OffersAndDeductionsPersistence
 * @see OffersAndDeductionsUtil
 * @generated
 */
public class OffersAndDeductionsPersistenceImpl extends BasePersistenceImpl<OffersAndDeductions>
	implements OffersAndDeductionsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link OffersAndDeductionsUtil} to access the offers and deductions persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = OffersAndDeductionsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsModelImpl.FINDER_CACHE_ENABLED,
			OffersAndDeductionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsModelImpl.FINDER_CACHE_ENABLED,
			OffersAndDeductionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsModelImpl.FINDER_CACHE_ENABLED,
			OffersAndDeductionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsModelImpl.FINDER_CACHE_ENABLED,
			OffersAndDeductionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			OffersAndDeductionsModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the offers and deductionses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OffersAndDeductions> findByGroupId(long groupId)
		throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the offers and deductionses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of offers and deductionses
	 * @param end the upper bound of the range of offers and deductionses (not inclusive)
	 * @return the range of matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OffersAndDeductions> findByGroupId(long groupId, int start,
		int end) throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the offers and deductionses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of offers and deductionses
	 * @param end the upper bound of the range of offers and deductionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OffersAndDeductions> findByGroupId(long groupId, int start,
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

		List<OffersAndDeductions> list = (List<OffersAndDeductions>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (OffersAndDeductions offersAndDeductions : list) {
				if ((groupId != offersAndDeductions.getGroupId())) {
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

			query.append(_SQL_SELECT_OFFERSANDDEDUCTIONS_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OffersAndDeductionsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<OffersAndDeductions>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OffersAndDeductions>(list);
				}
				else {
					list = (List<OffersAndDeductions>)QueryUtil.list(q,
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
	 * Returns the first offers and deductions in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching offers and deductions
	 * @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchOffersAndDeductionsException, SystemException {
		OffersAndDeductions offersAndDeductions = fetchByGroupId_First(groupId,
				orderByComparator);

		if (offersAndDeductions != null) {
			return offersAndDeductions;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOffersAndDeductionsException(msg.toString());
	}

	/**
	 * Returns the first offers and deductions in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions fetchByGroupId_First(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<OffersAndDeductions> list = findByGroupId(groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last offers and deductions in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching offers and deductions
	 * @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchOffersAndDeductionsException, SystemException {
		OffersAndDeductions offersAndDeductions = fetchByGroupId_Last(groupId,
				orderByComparator);

		if (offersAndDeductions != null) {
			return offersAndDeductions;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOffersAndDeductionsException(msg.toString());
	}

	/**
	 * Returns the last offers and deductions in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions fetchByGroupId_Last(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<OffersAndDeductions> list = findByGroupId(groupId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the offers and deductionses before and after the current offers and deductions in the ordered set where groupId = &#63;.
	 *
	 * @param id the primary key of the current offers and deductions
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next offers and deductions
	 * @throws com.ocms.course.NoSuchOffersAndDeductionsException if a offers and deductions with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions[] findByGroupId_PrevAndNext(long id,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchOffersAndDeductionsException, SystemException {
		OffersAndDeductions offersAndDeductions = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			OffersAndDeductions[] array = new OffersAndDeductionsImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, offersAndDeductions,
					groupId, orderByComparator, true);

			array[1] = offersAndDeductions;

			array[2] = getByGroupId_PrevAndNext(session, offersAndDeductions,
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

	protected OffersAndDeductions getByGroupId_PrevAndNext(Session session,
		OffersAndDeductions offersAndDeductions, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_OFFERSANDDEDUCTIONS_WHERE);

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
			query.append(OffersAndDeductionsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(offersAndDeductions);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<OffersAndDeductions> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the offers and deductionses where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupId(long groupId) throws SystemException {
		for (OffersAndDeductions offersAndDeductions : findByGroupId(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(offersAndDeductions);
		}
	}

	/**
	 * Returns the number of offers and deductionses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching offers and deductionses
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

			query.append(_SQL_COUNT_OFFERSANDDEDUCTIONS_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "offersAndDeductions.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ID = new FinderPath(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsModelImpl.FINDER_CACHE_ENABLED,
			OffersAndDeductionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findById",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID = new FinderPath(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsModelImpl.FINDER_CACHE_ENABLED,
			OffersAndDeductionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findById",
			new String[] { Long.class.getName() },
			OffersAndDeductionsModelImpl.ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ID = new FinderPath(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countById",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the offers and deductionses where id = &#63;.
	 *
	 * @param id the ID
	 * @return the matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OffersAndDeductions> findById(long id)
		throws SystemException {
		return findById(id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the offers and deductionses where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of offers and deductionses
	 * @param end the upper bound of the range of offers and deductionses (not inclusive)
	 * @return the range of matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OffersAndDeductions> findById(long id, int start, int end)
		throws SystemException {
		return findById(id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the offers and deductionses where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of offers and deductionses
	 * @param end the upper bound of the range of offers and deductionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OffersAndDeductions> findById(long id, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID;
			finderArgs = new Object[] { id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ID;
			finderArgs = new Object[] { id, start, end, orderByComparator };
		}

		List<OffersAndDeductions> list = (List<OffersAndDeductions>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (OffersAndDeductions offersAndDeductions : list) {
				if ((id != offersAndDeductions.getId())) {
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

			query.append(_SQL_SELECT_OFFERSANDDEDUCTIONS_WHERE);

			query.append(_FINDER_COLUMN_ID_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OffersAndDeductionsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

				if (!pagination) {
					list = (List<OffersAndDeductions>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OffersAndDeductions>(list);
				}
				else {
					list = (List<OffersAndDeductions>)QueryUtil.list(q,
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
	 * Returns the first offers and deductions in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching offers and deductions
	 * @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions findById_First(long id,
		OrderByComparator orderByComparator)
		throws NoSuchOffersAndDeductionsException, SystemException {
		OffersAndDeductions offersAndDeductions = fetchById_First(id,
				orderByComparator);

		if (offersAndDeductions != null) {
			return offersAndDeductions;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("id=");
		msg.append(id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOffersAndDeductionsException(msg.toString());
	}

	/**
	 * Returns the first offers and deductions in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions fetchById_First(long id,
		OrderByComparator orderByComparator) throws SystemException {
		List<OffersAndDeductions> list = findById(id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last offers and deductions in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching offers and deductions
	 * @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions findById_Last(long id,
		OrderByComparator orderByComparator)
		throws NoSuchOffersAndDeductionsException, SystemException {
		OffersAndDeductions offersAndDeductions = fetchById_Last(id,
				orderByComparator);

		if (offersAndDeductions != null) {
			return offersAndDeductions;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("id=");
		msg.append(id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOffersAndDeductionsException(msg.toString());
	}

	/**
	 * Returns the last offers and deductions in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions fetchById_Last(long id,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countById(id);

		if (count == 0) {
			return null;
		}

		List<OffersAndDeductions> list = findById(id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the offers and deductionses where id = &#63; from the database.
	 *
	 * @param id the ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeById(long id) throws SystemException {
		for (OffersAndDeductions offersAndDeductions : findById(id,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(offersAndDeductions);
		}
	}

	/**
	 * Returns the number of offers and deductionses where id = &#63;.
	 *
	 * @param id the ID
	 * @return the number of matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countById(long id) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ID;

		Object[] finderArgs = new Object[] { id };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_OFFERSANDDEDUCTIONS_WHERE);

			query.append(_FINDER_COLUMN_ID_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

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

	private static final String _FINDER_COLUMN_ID_ID_2 = "offersAndDeductions.id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CODE = new FinderPath(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsModelImpl.FINDER_CACHE_ENABLED,
			OffersAndDeductionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODE = new FinderPath(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsModelImpl.FINDER_CACHE_ENABLED,
			OffersAndDeductionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCode",
			new String[] { String.class.getName() },
			OffersAndDeductionsModelImpl.CODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CODE = new FinderPath(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the offers and deductionses where code = &#63;.
	 *
	 * @param code the code
	 * @return the matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OffersAndDeductions> findByCode(String code)
		throws SystemException {
		return findByCode(code, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the offers and deductionses where code = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param code the code
	 * @param start the lower bound of the range of offers and deductionses
	 * @param end the upper bound of the range of offers and deductionses (not inclusive)
	 * @return the range of matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OffersAndDeductions> findByCode(String code, int start, int end)
		throws SystemException {
		return findByCode(code, start, end, null);
	}

	/**
	 * Returns an ordered range of all the offers and deductionses where code = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param code the code
	 * @param start the lower bound of the range of offers and deductionses
	 * @param end the upper bound of the range of offers and deductionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OffersAndDeductions> findByCode(String code, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODE;
			finderArgs = new Object[] { code };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CODE;
			finderArgs = new Object[] { code, start, end, orderByComparator };
		}

		List<OffersAndDeductions> list = (List<OffersAndDeductions>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (OffersAndDeductions offersAndDeductions : list) {
				if (!Validator.equals(code, offersAndDeductions.getCode())) {
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

			query.append(_SQL_SELECT_OFFERSANDDEDUCTIONS_WHERE);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_CODE_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CODE_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_CODE_CODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OffersAndDeductionsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCode) {
					qPos.add(code);
				}

				if (!pagination) {
					list = (List<OffersAndDeductions>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OffersAndDeductions>(list);
				}
				else {
					list = (List<OffersAndDeductions>)QueryUtil.list(q,
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
	 * Returns the first offers and deductions in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching offers and deductions
	 * @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions findByCode_First(String code,
		OrderByComparator orderByComparator)
		throws NoSuchOffersAndDeductionsException, SystemException {
		OffersAndDeductions offersAndDeductions = fetchByCode_First(code,
				orderByComparator);

		if (offersAndDeductions != null) {
			return offersAndDeductions;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("code=");
		msg.append(code);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOffersAndDeductionsException(msg.toString());
	}

	/**
	 * Returns the first offers and deductions in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions fetchByCode_First(String code,
		OrderByComparator orderByComparator) throws SystemException {
		List<OffersAndDeductions> list = findByCode(code, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last offers and deductions in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching offers and deductions
	 * @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions findByCode_Last(String code,
		OrderByComparator orderByComparator)
		throws NoSuchOffersAndDeductionsException, SystemException {
		OffersAndDeductions offersAndDeductions = fetchByCode_Last(code,
				orderByComparator);

		if (offersAndDeductions != null) {
			return offersAndDeductions;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("code=");
		msg.append(code);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOffersAndDeductionsException(msg.toString());
	}

	/**
	 * Returns the last offers and deductions in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions fetchByCode_Last(String code,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCode(code);

		if (count == 0) {
			return null;
		}

		List<OffersAndDeductions> list = findByCode(code, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the offers and deductionses before and after the current offers and deductions in the ordered set where code = &#63;.
	 *
	 * @param id the primary key of the current offers and deductions
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next offers and deductions
	 * @throws com.ocms.course.NoSuchOffersAndDeductionsException if a offers and deductions with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions[] findByCode_PrevAndNext(long id, String code,
		OrderByComparator orderByComparator)
		throws NoSuchOffersAndDeductionsException, SystemException {
		OffersAndDeductions offersAndDeductions = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			OffersAndDeductions[] array = new OffersAndDeductionsImpl[3];

			array[0] = getByCode_PrevAndNext(session, offersAndDeductions,
					code, orderByComparator, true);

			array[1] = offersAndDeductions;

			array[2] = getByCode_PrevAndNext(session, offersAndDeductions,
					code, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected OffersAndDeductions getByCode_PrevAndNext(Session session,
		OffersAndDeductions offersAndDeductions, String code,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_OFFERSANDDEDUCTIONS_WHERE);

		boolean bindCode = false;

		if (code == null) {
			query.append(_FINDER_COLUMN_CODE_CODE_1);
		}
		else if (code.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CODE_CODE_3);
		}
		else {
			bindCode = true;

			query.append(_FINDER_COLUMN_CODE_CODE_2);
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
			query.append(OffersAndDeductionsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCode) {
			qPos.add(code);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(offersAndDeductions);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<OffersAndDeductions> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the offers and deductionses where code = &#63; from the database.
	 *
	 * @param code the code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCode(String code) throws SystemException {
		for (OffersAndDeductions offersAndDeductions : findByCode(code,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(offersAndDeductions);
		}
	}

	/**
	 * Returns the number of offers and deductionses where code = &#63;.
	 *
	 * @param code the code
	 * @return the number of matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCode(String code) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CODE;

		Object[] finderArgs = new Object[] { code };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_OFFERSANDDEDUCTIONS_WHERE);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_CODE_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CODE_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_CODE_CODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCode) {
					qPos.add(code);
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

	private static final String _FINDER_COLUMN_CODE_CODE_1 = "offersAndDeductions.code IS NULL";
	private static final String _FINDER_COLUMN_CODE_CODE_2 = "offersAndDeductions.code = ?";
	private static final String _FINDER_COLUMN_CODE_CODE_3 = "(offersAndDeductions.code IS NULL OR offersAndDeductions.code = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ACTIVE = new FinderPath(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsModelImpl.FINDER_CACHE_ENABLED,
			OffersAndDeductionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByActive",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVE =
		new FinderPath(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsModelImpl.FINDER_CACHE_ENABLED,
			OffersAndDeductionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByActive",
			new String[] { Integer.class.getName() },
			OffersAndDeductionsModelImpl.ACTIVE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ACTIVE = new FinderPath(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByActive",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the offers and deductionses where active = &#63;.
	 *
	 * @param active the active
	 * @return the matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OffersAndDeductions> findByActive(int active)
		throws SystemException {
		return findByActive(active, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the offers and deductionses where active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param active the active
	 * @param start the lower bound of the range of offers and deductionses
	 * @param end the upper bound of the range of offers and deductionses (not inclusive)
	 * @return the range of matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OffersAndDeductions> findByActive(int active, int start, int end)
		throws SystemException {
		return findByActive(active, start, end, null);
	}

	/**
	 * Returns an ordered range of all the offers and deductionses where active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param active the active
	 * @param start the lower bound of the range of offers and deductionses
	 * @param end the upper bound of the range of offers and deductionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OffersAndDeductions> findByActive(int active, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVE;
			finderArgs = new Object[] { active };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ACTIVE;
			finderArgs = new Object[] { active, start, end, orderByComparator };
		}

		List<OffersAndDeductions> list = (List<OffersAndDeductions>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (OffersAndDeductions offersAndDeductions : list) {
				if ((active != offersAndDeductions.getActive())) {
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

			query.append(_SQL_SELECT_OFFERSANDDEDUCTIONS_WHERE);

			query.append(_FINDER_COLUMN_ACTIVE_ACTIVE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OffersAndDeductionsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(active);

				if (!pagination) {
					list = (List<OffersAndDeductions>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OffersAndDeductions>(list);
				}
				else {
					list = (List<OffersAndDeductions>)QueryUtil.list(q,
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
	 * Returns the first offers and deductions in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching offers and deductions
	 * @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions findByActive_First(int active,
		OrderByComparator orderByComparator)
		throws NoSuchOffersAndDeductionsException, SystemException {
		OffersAndDeductions offersAndDeductions = fetchByActive_First(active,
				orderByComparator);

		if (offersAndDeductions != null) {
			return offersAndDeductions;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOffersAndDeductionsException(msg.toString());
	}

	/**
	 * Returns the first offers and deductions in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions fetchByActive_First(int active,
		OrderByComparator orderByComparator) throws SystemException {
		List<OffersAndDeductions> list = findByActive(active, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last offers and deductions in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching offers and deductions
	 * @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions findByActive_Last(int active,
		OrderByComparator orderByComparator)
		throws NoSuchOffersAndDeductionsException, SystemException {
		OffersAndDeductions offersAndDeductions = fetchByActive_Last(active,
				orderByComparator);

		if (offersAndDeductions != null) {
			return offersAndDeductions;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOffersAndDeductionsException(msg.toString());
	}

	/**
	 * Returns the last offers and deductions in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions fetchByActive_Last(int active,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByActive(active);

		if (count == 0) {
			return null;
		}

		List<OffersAndDeductions> list = findByActive(active, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the offers and deductionses before and after the current offers and deductions in the ordered set where active = &#63;.
	 *
	 * @param id the primary key of the current offers and deductions
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next offers and deductions
	 * @throws com.ocms.course.NoSuchOffersAndDeductionsException if a offers and deductions with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions[] findByActive_PrevAndNext(long id, int active,
		OrderByComparator orderByComparator)
		throws NoSuchOffersAndDeductionsException, SystemException {
		OffersAndDeductions offersAndDeductions = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			OffersAndDeductions[] array = new OffersAndDeductionsImpl[3];

			array[0] = getByActive_PrevAndNext(session, offersAndDeductions,
					active, orderByComparator, true);

			array[1] = offersAndDeductions;

			array[2] = getByActive_PrevAndNext(session, offersAndDeductions,
					active, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected OffersAndDeductions getByActive_PrevAndNext(Session session,
		OffersAndDeductions offersAndDeductions, int active,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_OFFERSANDDEDUCTIONS_WHERE);

		query.append(_FINDER_COLUMN_ACTIVE_ACTIVE_2);

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
			query.append(OffersAndDeductionsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(active);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(offersAndDeductions);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<OffersAndDeductions> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the offers and deductionses where active = &#63; from the database.
	 *
	 * @param active the active
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByActive(int active) throws SystemException {
		for (OffersAndDeductions offersAndDeductions : findByActive(active,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(offersAndDeductions);
		}
	}

	/**
	 * Returns the number of offers and deductionses where active = &#63;.
	 *
	 * @param active the active
	 * @return the number of matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByActive(int active) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ACTIVE;

		Object[] finderArgs = new Object[] { active };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_OFFERSANDDEDUCTIONS_WHERE);

			query.append(_FINDER_COLUMN_ACTIVE_ACTIVE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(active);

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

	private static final String _FINDER_COLUMN_ACTIVE_ACTIVE_2 = "offersAndDeductions.active = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPIDANDACTIVE =
		new FinderPath(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsModelImpl.FINDER_CACHE_ENABLED,
			OffersAndDeductionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupIdAndActive",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPIDANDACTIVE =
		new FinderPath(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsModelImpl.FINDER_CACHE_ENABLED,
			OffersAndDeductionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByGroupIdAndActive",
			new String[] { Long.class.getName(), Integer.class.getName() },
			OffersAndDeductionsModelImpl.GROUPID_COLUMN_BITMASK |
			OffersAndDeductionsModelImpl.ACTIVE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPIDANDACTIVE = new FinderPath(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByGroupIdAndActive",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the offers and deductionses where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @return the matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OffersAndDeductions> findByGroupIdAndActive(long groupId,
		int active) throws SystemException {
		return findByGroupIdAndActive(groupId, active, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the offers and deductionses where groupId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param start the lower bound of the range of offers and deductionses
	 * @param end the upper bound of the range of offers and deductionses (not inclusive)
	 * @return the range of matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OffersAndDeductions> findByGroupIdAndActive(long groupId,
		int active, int start, int end) throws SystemException {
		return findByGroupIdAndActive(groupId, active, start, end, null);
	}

	/**
	 * Returns an ordered range of all the offers and deductionses where groupId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param start the lower bound of the range of offers and deductionses
	 * @param end the upper bound of the range of offers and deductionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OffersAndDeductions> findByGroupIdAndActive(long groupId,
		int active, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPIDANDACTIVE;
			finderArgs = new Object[] { groupId, active };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPIDANDACTIVE;
			finderArgs = new Object[] {
					groupId, active,
					
					start, end, orderByComparator
				};
		}

		List<OffersAndDeductions> list = (List<OffersAndDeductions>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (OffersAndDeductions offersAndDeductions : list) {
				if ((groupId != offersAndDeductions.getGroupId()) ||
						(active != offersAndDeductions.getActive())) {
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

			query.append(_SQL_SELECT_OFFERSANDDEDUCTIONS_WHERE);

			query.append(_FINDER_COLUMN_GROUPIDANDACTIVE_GROUPID_2);

			query.append(_FINDER_COLUMN_GROUPIDANDACTIVE_ACTIVE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OffersAndDeductionsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(active);

				if (!pagination) {
					list = (List<OffersAndDeductions>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OffersAndDeductions>(list);
				}
				else {
					list = (List<OffersAndDeductions>)QueryUtil.list(q,
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
	 * Returns the first offers and deductions in the ordered set where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching offers and deductions
	 * @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions findByGroupIdAndActive_First(long groupId,
		int active, OrderByComparator orderByComparator)
		throws NoSuchOffersAndDeductionsException, SystemException {
		OffersAndDeductions offersAndDeductions = fetchByGroupIdAndActive_First(groupId,
				active, orderByComparator);

		if (offersAndDeductions != null) {
			return offersAndDeductions;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOffersAndDeductionsException(msg.toString());
	}

	/**
	 * Returns the first offers and deductions in the ordered set where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions fetchByGroupIdAndActive_First(long groupId,
		int active, OrderByComparator orderByComparator)
		throws SystemException {
		List<OffersAndDeductions> list = findByGroupIdAndActive(groupId,
				active, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last offers and deductions in the ordered set where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching offers and deductions
	 * @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions findByGroupIdAndActive_Last(long groupId,
		int active, OrderByComparator orderByComparator)
		throws NoSuchOffersAndDeductionsException, SystemException {
		OffersAndDeductions offersAndDeductions = fetchByGroupIdAndActive_Last(groupId,
				active, orderByComparator);

		if (offersAndDeductions != null) {
			return offersAndDeductions;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOffersAndDeductionsException(msg.toString());
	}

	/**
	 * Returns the last offers and deductions in the ordered set where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions fetchByGroupIdAndActive_Last(long groupId,
		int active, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByGroupIdAndActive(groupId, active);

		if (count == 0) {
			return null;
		}

		List<OffersAndDeductions> list = findByGroupIdAndActive(groupId,
				active, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the offers and deductionses before and after the current offers and deductions in the ordered set where groupId = &#63; and active = &#63;.
	 *
	 * @param id the primary key of the current offers and deductions
	 * @param groupId the group ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next offers and deductions
	 * @throws com.ocms.course.NoSuchOffersAndDeductionsException if a offers and deductions with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions[] findByGroupIdAndActive_PrevAndNext(long id,
		long groupId, int active, OrderByComparator orderByComparator)
		throws NoSuchOffersAndDeductionsException, SystemException {
		OffersAndDeductions offersAndDeductions = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			OffersAndDeductions[] array = new OffersAndDeductionsImpl[3];

			array[0] = getByGroupIdAndActive_PrevAndNext(session,
					offersAndDeductions, groupId, active, orderByComparator,
					true);

			array[1] = offersAndDeductions;

			array[2] = getByGroupIdAndActive_PrevAndNext(session,
					offersAndDeductions, groupId, active, orderByComparator,
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

	protected OffersAndDeductions getByGroupIdAndActive_PrevAndNext(
		Session session, OffersAndDeductions offersAndDeductions, long groupId,
		int active, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_OFFERSANDDEDUCTIONS_WHERE);

		query.append(_FINDER_COLUMN_GROUPIDANDACTIVE_GROUPID_2);

		query.append(_FINDER_COLUMN_GROUPIDANDACTIVE_ACTIVE_2);

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
			query.append(OffersAndDeductionsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(active);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(offersAndDeductions);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<OffersAndDeductions> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the offers and deductionses where groupId = &#63; and active = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupIdAndActive(long groupId, int active)
		throws SystemException {
		for (OffersAndDeductions offersAndDeductions : findByGroupIdAndActive(
				groupId, active, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(offersAndDeductions);
		}
	}

	/**
	 * Returns the number of offers and deductionses where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @return the number of matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByGroupIdAndActive(long groupId, int active)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPIDANDACTIVE;

		Object[] finderArgs = new Object[] { groupId, active };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_OFFERSANDDEDUCTIONS_WHERE);

			query.append(_FINDER_COLUMN_GROUPIDANDACTIVE_GROUPID_2);

			query.append(_FINDER_COLUMN_GROUPIDANDACTIVE_ACTIVE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(active);

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

	private static final String _FINDER_COLUMN_GROUPIDANDACTIVE_GROUPID_2 = "offersAndDeductions.groupId = ? AND ";
	private static final String _FINDER_COLUMN_GROUPIDANDACTIVE_ACTIVE_2 = "offersAndDeductions.active = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CODEANDACTIVE =
		new FinderPath(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsModelImpl.FINDER_CACHE_ENABLED,
			OffersAndDeductionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCodeAndActive",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODEANDACTIVE =
		new FinderPath(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsModelImpl.FINDER_CACHE_ENABLED,
			OffersAndDeductionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCodeAndActive",
			new String[] { String.class.getName(), Integer.class.getName() },
			OffersAndDeductionsModelImpl.CODE_COLUMN_BITMASK |
			OffersAndDeductionsModelImpl.ACTIVE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CODEANDACTIVE = new FinderPath(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCodeAndActive",
			new String[] { String.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the offers and deductionses where code = &#63; and active = &#63;.
	 *
	 * @param code the code
	 * @param active the active
	 * @return the matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OffersAndDeductions> findByCodeAndActive(String code, int active)
		throws SystemException {
		return findByCodeAndActive(code, active, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the offers and deductionses where code = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param code the code
	 * @param active the active
	 * @param start the lower bound of the range of offers and deductionses
	 * @param end the upper bound of the range of offers and deductionses (not inclusive)
	 * @return the range of matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OffersAndDeductions> findByCodeAndActive(String code,
		int active, int start, int end) throws SystemException {
		return findByCodeAndActive(code, active, start, end, null);
	}

	/**
	 * Returns an ordered range of all the offers and deductionses where code = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param code the code
	 * @param active the active
	 * @param start the lower bound of the range of offers and deductionses
	 * @param end the upper bound of the range of offers and deductionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OffersAndDeductions> findByCodeAndActive(String code,
		int active, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODEANDACTIVE;
			finderArgs = new Object[] { code, active };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CODEANDACTIVE;
			finderArgs = new Object[] {
					code, active,
					
					start, end, orderByComparator
				};
		}

		List<OffersAndDeductions> list = (List<OffersAndDeductions>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (OffersAndDeductions offersAndDeductions : list) {
				if (!Validator.equals(code, offersAndDeductions.getCode()) ||
						(active != offersAndDeductions.getActive())) {
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

			query.append(_SQL_SELECT_OFFERSANDDEDUCTIONS_WHERE);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_CODEANDACTIVE_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CODEANDACTIVE_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_CODEANDACTIVE_CODE_2);
			}

			query.append(_FINDER_COLUMN_CODEANDACTIVE_ACTIVE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OffersAndDeductionsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCode) {
					qPos.add(code);
				}

				qPos.add(active);

				if (!pagination) {
					list = (List<OffersAndDeductions>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OffersAndDeductions>(list);
				}
				else {
					list = (List<OffersAndDeductions>)QueryUtil.list(q,
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
	 * Returns the first offers and deductions in the ordered set where code = &#63; and active = &#63;.
	 *
	 * @param code the code
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching offers and deductions
	 * @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions findByCodeAndActive_First(String code,
		int active, OrderByComparator orderByComparator)
		throws NoSuchOffersAndDeductionsException, SystemException {
		OffersAndDeductions offersAndDeductions = fetchByCodeAndActive_First(code,
				active, orderByComparator);

		if (offersAndDeductions != null) {
			return offersAndDeductions;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("code=");
		msg.append(code);

		msg.append(", active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOffersAndDeductionsException(msg.toString());
	}

	/**
	 * Returns the first offers and deductions in the ordered set where code = &#63; and active = &#63;.
	 *
	 * @param code the code
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions fetchByCodeAndActive_First(String code,
		int active, OrderByComparator orderByComparator)
		throws SystemException {
		List<OffersAndDeductions> list = findByCodeAndActive(code, active, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last offers and deductions in the ordered set where code = &#63; and active = &#63;.
	 *
	 * @param code the code
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching offers and deductions
	 * @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions findByCodeAndActive_Last(String code,
		int active, OrderByComparator orderByComparator)
		throws NoSuchOffersAndDeductionsException, SystemException {
		OffersAndDeductions offersAndDeductions = fetchByCodeAndActive_Last(code,
				active, orderByComparator);

		if (offersAndDeductions != null) {
			return offersAndDeductions;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("code=");
		msg.append(code);

		msg.append(", active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOffersAndDeductionsException(msg.toString());
	}

	/**
	 * Returns the last offers and deductions in the ordered set where code = &#63; and active = &#63;.
	 *
	 * @param code the code
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions fetchByCodeAndActive_Last(String code,
		int active, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByCodeAndActive(code, active);

		if (count == 0) {
			return null;
		}

		List<OffersAndDeductions> list = findByCodeAndActive(code, active,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the offers and deductionses before and after the current offers and deductions in the ordered set where code = &#63; and active = &#63;.
	 *
	 * @param id the primary key of the current offers and deductions
	 * @param code the code
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next offers and deductions
	 * @throws com.ocms.course.NoSuchOffersAndDeductionsException if a offers and deductions with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions[] findByCodeAndActive_PrevAndNext(long id,
		String code, int active, OrderByComparator orderByComparator)
		throws NoSuchOffersAndDeductionsException, SystemException {
		OffersAndDeductions offersAndDeductions = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			OffersAndDeductions[] array = new OffersAndDeductionsImpl[3];

			array[0] = getByCodeAndActive_PrevAndNext(session,
					offersAndDeductions, code, active, orderByComparator, true);

			array[1] = offersAndDeductions;

			array[2] = getByCodeAndActive_PrevAndNext(session,
					offersAndDeductions, code, active, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected OffersAndDeductions getByCodeAndActive_PrevAndNext(
		Session session, OffersAndDeductions offersAndDeductions, String code,
		int active, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_OFFERSANDDEDUCTIONS_WHERE);

		boolean bindCode = false;

		if (code == null) {
			query.append(_FINDER_COLUMN_CODEANDACTIVE_CODE_1);
		}
		else if (code.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CODEANDACTIVE_CODE_3);
		}
		else {
			bindCode = true;

			query.append(_FINDER_COLUMN_CODEANDACTIVE_CODE_2);
		}

		query.append(_FINDER_COLUMN_CODEANDACTIVE_ACTIVE_2);

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
			query.append(OffersAndDeductionsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCode) {
			qPos.add(code);
		}

		qPos.add(active);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(offersAndDeductions);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<OffersAndDeductions> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the offers and deductionses where code = &#63; and active = &#63; from the database.
	 *
	 * @param code the code
	 * @param active the active
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCodeAndActive(String code, int active)
		throws SystemException {
		for (OffersAndDeductions offersAndDeductions : findByCodeAndActive(
				code, active, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(offersAndDeductions);
		}
	}

	/**
	 * Returns the number of offers and deductionses where code = &#63; and active = &#63;.
	 *
	 * @param code the code
	 * @param active the active
	 * @return the number of matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCodeAndActive(String code, int active)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CODEANDACTIVE;

		Object[] finderArgs = new Object[] { code, active };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_OFFERSANDDEDUCTIONS_WHERE);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_CODEANDACTIVE_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CODEANDACTIVE_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_CODEANDACTIVE_CODE_2);
			}

			query.append(_FINDER_COLUMN_CODEANDACTIVE_ACTIVE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCode) {
					qPos.add(code);
				}

				qPos.add(active);

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

	private static final String _FINDER_COLUMN_CODEANDACTIVE_CODE_1 = "offersAndDeductions.code IS NULL AND ";
	private static final String _FINDER_COLUMN_CODEANDACTIVE_CODE_2 = "offersAndDeductions.code = ? AND ";
	private static final String _FINDER_COLUMN_CODEANDACTIVE_CODE_3 = "(offersAndDeductions.code IS NULL OR offersAndDeductions.code = '') AND ";
	private static final String _FINDER_COLUMN_CODEANDACTIVE_ACTIVE_2 = "offersAndDeductions.active = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TYPE = new FinderPath(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsModelImpl.FINDER_CACHE_ENABLED,
			OffersAndDeductionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByType",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE = new FinderPath(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsModelImpl.FINDER_CACHE_ENABLED,
			OffersAndDeductionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByType",
			new String[] { String.class.getName() },
			OffersAndDeductionsModelImpl.TYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TYPE = new FinderPath(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByType",
			new String[] { String.class.getName() });

	/**
	 * Returns all the offers and deductionses where type = &#63;.
	 *
	 * @param type the type
	 * @return the matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OffersAndDeductions> findByType(String type)
		throws SystemException {
		return findByType(type, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the offers and deductionses where type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param type the type
	 * @param start the lower bound of the range of offers and deductionses
	 * @param end the upper bound of the range of offers and deductionses (not inclusive)
	 * @return the range of matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OffersAndDeductions> findByType(String type, int start, int end)
		throws SystemException {
		return findByType(type, start, end, null);
	}

	/**
	 * Returns an ordered range of all the offers and deductionses where type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param type the type
	 * @param start the lower bound of the range of offers and deductionses
	 * @param end the upper bound of the range of offers and deductionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OffersAndDeductions> findByType(String type, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE;
			finderArgs = new Object[] { type };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TYPE;
			finderArgs = new Object[] { type, start, end, orderByComparator };
		}

		List<OffersAndDeductions> list = (List<OffersAndDeductions>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (OffersAndDeductions offersAndDeductions : list) {
				if (!Validator.equals(type, offersAndDeductions.getType())) {
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

			query.append(_SQL_SELECT_OFFERSANDDEDUCTIONS_WHERE);

			boolean bindType = false;

			if (type == null) {
				query.append(_FINDER_COLUMN_TYPE_TYPE_1);
			}
			else if (type.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TYPE_TYPE_3);
			}
			else {
				bindType = true;

				query.append(_FINDER_COLUMN_TYPE_TYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OffersAndDeductionsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindType) {
					qPos.add(type);
				}

				if (!pagination) {
					list = (List<OffersAndDeductions>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OffersAndDeductions>(list);
				}
				else {
					list = (List<OffersAndDeductions>)QueryUtil.list(q,
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
	 * Returns the first offers and deductions in the ordered set where type = &#63;.
	 *
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching offers and deductions
	 * @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions findByType_First(String type,
		OrderByComparator orderByComparator)
		throws NoSuchOffersAndDeductionsException, SystemException {
		OffersAndDeductions offersAndDeductions = fetchByType_First(type,
				orderByComparator);

		if (offersAndDeductions != null) {
			return offersAndDeductions;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("type=");
		msg.append(type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOffersAndDeductionsException(msg.toString());
	}

	/**
	 * Returns the first offers and deductions in the ordered set where type = &#63;.
	 *
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions fetchByType_First(String type,
		OrderByComparator orderByComparator) throws SystemException {
		List<OffersAndDeductions> list = findByType(type, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last offers and deductions in the ordered set where type = &#63;.
	 *
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching offers and deductions
	 * @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions findByType_Last(String type,
		OrderByComparator orderByComparator)
		throws NoSuchOffersAndDeductionsException, SystemException {
		OffersAndDeductions offersAndDeductions = fetchByType_Last(type,
				orderByComparator);

		if (offersAndDeductions != null) {
			return offersAndDeductions;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("type=");
		msg.append(type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOffersAndDeductionsException(msg.toString());
	}

	/**
	 * Returns the last offers and deductions in the ordered set where type = &#63;.
	 *
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions fetchByType_Last(String type,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByType(type);

		if (count == 0) {
			return null;
		}

		List<OffersAndDeductions> list = findByType(type, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the offers and deductionses before and after the current offers and deductions in the ordered set where type = &#63;.
	 *
	 * @param id the primary key of the current offers and deductions
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next offers and deductions
	 * @throws com.ocms.course.NoSuchOffersAndDeductionsException if a offers and deductions with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions[] findByType_PrevAndNext(long id, String type,
		OrderByComparator orderByComparator)
		throws NoSuchOffersAndDeductionsException, SystemException {
		OffersAndDeductions offersAndDeductions = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			OffersAndDeductions[] array = new OffersAndDeductionsImpl[3];

			array[0] = getByType_PrevAndNext(session, offersAndDeductions,
					type, orderByComparator, true);

			array[1] = offersAndDeductions;

			array[2] = getByType_PrevAndNext(session, offersAndDeductions,
					type, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected OffersAndDeductions getByType_PrevAndNext(Session session,
		OffersAndDeductions offersAndDeductions, String type,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_OFFERSANDDEDUCTIONS_WHERE);

		boolean bindType = false;

		if (type == null) {
			query.append(_FINDER_COLUMN_TYPE_TYPE_1);
		}
		else if (type.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TYPE_TYPE_3);
		}
		else {
			bindType = true;

			query.append(_FINDER_COLUMN_TYPE_TYPE_2);
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
			query.append(OffersAndDeductionsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindType) {
			qPos.add(type);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(offersAndDeductions);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<OffersAndDeductions> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the offers and deductionses where type = &#63; from the database.
	 *
	 * @param type the type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByType(String type) throws SystemException {
		for (OffersAndDeductions offersAndDeductions : findByType(type,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(offersAndDeductions);
		}
	}

	/**
	 * Returns the number of offers and deductionses where type = &#63;.
	 *
	 * @param type the type
	 * @return the number of matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByType(String type) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TYPE;

		Object[] finderArgs = new Object[] { type };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_OFFERSANDDEDUCTIONS_WHERE);

			boolean bindType = false;

			if (type == null) {
				query.append(_FINDER_COLUMN_TYPE_TYPE_1);
			}
			else if (type.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TYPE_TYPE_3);
			}
			else {
				bindType = true;

				query.append(_FINDER_COLUMN_TYPE_TYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindType) {
					qPos.add(type);
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

	private static final String _FINDER_COLUMN_TYPE_TYPE_1 = "offersAndDeductions.type IS NULL";
	private static final String _FINDER_COLUMN_TYPE_TYPE_2 = "offersAndDeductions.type = ?";
	private static final String _FINDER_COLUMN_TYPE_TYPE_3 = "(offersAndDeductions.type IS NULL OR offersAndDeductions.type = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPIDTYPEACTIVE =
		new FinderPath(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsModelImpl.FINDER_CACHE_ENABLED,
			OffersAndDeductionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupIdTypeActive",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPIDTYPEACTIVE =
		new FinderPath(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsModelImpl.FINDER_CACHE_ENABLED,
			OffersAndDeductionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByGroupIdTypeActive",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName()
			},
			OffersAndDeductionsModelImpl.GROUPID_COLUMN_BITMASK |
			OffersAndDeductionsModelImpl.TYPE_COLUMN_BITMASK |
			OffersAndDeductionsModelImpl.ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPIDTYPEACTIVE = new FinderPath(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByGroupIdTypeActive",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName()
			});

	/**
	 * Returns all the offers and deductionses where groupId = &#63; and type = &#63; and id = &#63;.
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param id the ID
	 * @return the matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OffersAndDeductions> findByGroupIdTypeActive(long groupId,
		String type, long id) throws SystemException {
		return findByGroupIdTypeActive(groupId, type, id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the offers and deductionses where groupId = &#63; and type = &#63; and id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param id the ID
	 * @param start the lower bound of the range of offers and deductionses
	 * @param end the upper bound of the range of offers and deductionses (not inclusive)
	 * @return the range of matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OffersAndDeductions> findByGroupIdTypeActive(long groupId,
		String type, long id, int start, int end) throws SystemException {
		return findByGroupIdTypeActive(groupId, type, id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the offers and deductionses where groupId = &#63; and type = &#63; and id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param id the ID
	 * @param start the lower bound of the range of offers and deductionses
	 * @param end the upper bound of the range of offers and deductionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OffersAndDeductions> findByGroupIdTypeActive(long groupId,
		String type, long id, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPIDTYPEACTIVE;
			finderArgs = new Object[] { groupId, type, id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPIDTYPEACTIVE;
			finderArgs = new Object[] {
					groupId, type, id,
					
					start, end, orderByComparator
				};
		}

		List<OffersAndDeductions> list = (List<OffersAndDeductions>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (OffersAndDeductions offersAndDeductions : list) {
				if ((groupId != offersAndDeductions.getGroupId()) ||
						!Validator.equals(type, offersAndDeductions.getType()) ||
						(id != offersAndDeductions.getId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_OFFERSANDDEDUCTIONS_WHERE);

			query.append(_FINDER_COLUMN_GROUPIDTYPEACTIVE_GROUPID_2);

			boolean bindType = false;

			if (type == null) {
				query.append(_FINDER_COLUMN_GROUPIDTYPEACTIVE_TYPE_1);
			}
			else if (type.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GROUPIDTYPEACTIVE_TYPE_3);
			}
			else {
				bindType = true;

				query.append(_FINDER_COLUMN_GROUPIDTYPEACTIVE_TYPE_2);
			}

			query.append(_FINDER_COLUMN_GROUPIDTYPEACTIVE_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OffersAndDeductionsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindType) {
					qPos.add(type);
				}

				qPos.add(id);

				if (!pagination) {
					list = (List<OffersAndDeductions>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OffersAndDeductions>(list);
				}
				else {
					list = (List<OffersAndDeductions>)QueryUtil.list(q,
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
	 * Returns the first offers and deductions in the ordered set where groupId = &#63; and type = &#63; and id = &#63;.
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching offers and deductions
	 * @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions findByGroupIdTypeActive_First(long groupId,
		String type, long id, OrderByComparator orderByComparator)
		throws NoSuchOffersAndDeductionsException, SystemException {
		OffersAndDeductions offersAndDeductions = fetchByGroupIdTypeActive_First(groupId,
				type, id, orderByComparator);

		if (offersAndDeductions != null) {
			return offersAndDeductions;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", type=");
		msg.append(type);

		msg.append(", id=");
		msg.append(id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOffersAndDeductionsException(msg.toString());
	}

	/**
	 * Returns the first offers and deductions in the ordered set where groupId = &#63; and type = &#63; and id = &#63;.
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions fetchByGroupIdTypeActive_First(long groupId,
		String type, long id, OrderByComparator orderByComparator)
		throws SystemException {
		List<OffersAndDeductions> list = findByGroupIdTypeActive(groupId, type,
				id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last offers and deductions in the ordered set where groupId = &#63; and type = &#63; and id = &#63;.
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching offers and deductions
	 * @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions findByGroupIdTypeActive_Last(long groupId,
		String type, long id, OrderByComparator orderByComparator)
		throws NoSuchOffersAndDeductionsException, SystemException {
		OffersAndDeductions offersAndDeductions = fetchByGroupIdTypeActive_Last(groupId,
				type, id, orderByComparator);

		if (offersAndDeductions != null) {
			return offersAndDeductions;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", type=");
		msg.append(type);

		msg.append(", id=");
		msg.append(id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOffersAndDeductionsException(msg.toString());
	}

	/**
	 * Returns the last offers and deductions in the ordered set where groupId = &#63; and type = &#63; and id = &#63;.
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions fetchByGroupIdTypeActive_Last(long groupId,
		String type, long id, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByGroupIdTypeActive(groupId, type, id);

		if (count == 0) {
			return null;
		}

		List<OffersAndDeductions> list = findByGroupIdTypeActive(groupId, type,
				id, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the offers and deductionses where groupId = &#63; and type = &#63; and id = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param id the ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupIdTypeActive(long groupId, String type, long id)
		throws SystemException {
		for (OffersAndDeductions offersAndDeductions : findByGroupIdTypeActive(
				groupId, type, id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(offersAndDeductions);
		}
	}

	/**
	 * Returns the number of offers and deductionses where groupId = &#63; and type = &#63; and id = &#63;.
	 *
	 * @param groupId the group ID
	 * @param type the type
	 * @param id the ID
	 * @return the number of matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByGroupIdTypeActive(long groupId, String type, long id)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPIDTYPEACTIVE;

		Object[] finderArgs = new Object[] { groupId, type, id };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_OFFERSANDDEDUCTIONS_WHERE);

			query.append(_FINDER_COLUMN_GROUPIDTYPEACTIVE_GROUPID_2);

			boolean bindType = false;

			if (type == null) {
				query.append(_FINDER_COLUMN_GROUPIDTYPEACTIVE_TYPE_1);
			}
			else if (type.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GROUPIDTYPEACTIVE_TYPE_3);
			}
			else {
				bindType = true;

				query.append(_FINDER_COLUMN_GROUPIDTYPEACTIVE_TYPE_2);
			}

			query.append(_FINDER_COLUMN_GROUPIDTYPEACTIVE_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindType) {
					qPos.add(type);
				}

				qPos.add(id);

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

	private static final String _FINDER_COLUMN_GROUPIDTYPEACTIVE_GROUPID_2 = "offersAndDeductions.groupId = ? AND ";
	private static final String _FINDER_COLUMN_GROUPIDTYPEACTIVE_TYPE_1 = "offersAndDeductions.type IS NULL AND ";
	private static final String _FINDER_COLUMN_GROUPIDTYPEACTIVE_TYPE_2 = "offersAndDeductions.type = ? AND ";
	private static final String _FINDER_COLUMN_GROUPIDTYPEACTIVE_TYPE_3 = "(offersAndDeductions.type IS NULL OR offersAndDeductions.type = '') AND ";
	private static final String _FINDER_COLUMN_GROUPIDTYPEACTIVE_ID_2 = "offersAndDeductions.id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_IDANDACTIVE =
		new FinderPath(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsModelImpl.FINDER_CACHE_ENABLED,
			OffersAndDeductionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByIdAndActive",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDANDACTIVE =
		new FinderPath(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsModelImpl.FINDER_CACHE_ENABLED,
			OffersAndDeductionsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByIdAndActive",
			new String[] { Long.class.getName(), Integer.class.getName() },
			OffersAndDeductionsModelImpl.ID_COLUMN_BITMASK |
			OffersAndDeductionsModelImpl.ACTIVE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IDANDACTIVE = new FinderPath(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByIdAndActive",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the offers and deductionses where id = &#63; and active = &#63;.
	 *
	 * @param id the ID
	 * @param active the active
	 * @return the matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OffersAndDeductions> findByIdAndActive(long id, int active)
		throws SystemException {
		return findByIdAndActive(id, active, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the offers and deductionses where id = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param active the active
	 * @param start the lower bound of the range of offers and deductionses
	 * @param end the upper bound of the range of offers and deductionses (not inclusive)
	 * @return the range of matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OffersAndDeductions> findByIdAndActive(long id, int active,
		int start, int end) throws SystemException {
		return findByIdAndActive(id, active, start, end, null);
	}

	/**
	 * Returns an ordered range of all the offers and deductionses where id = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param active the active
	 * @param start the lower bound of the range of offers and deductionses
	 * @param end the upper bound of the range of offers and deductionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OffersAndDeductions> findByIdAndActive(long id, int active,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDANDACTIVE;
			finderArgs = new Object[] { id, active };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_IDANDACTIVE;
			finderArgs = new Object[] { id, active, start, end, orderByComparator };
		}

		List<OffersAndDeductions> list = (List<OffersAndDeductions>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (OffersAndDeductions offersAndDeductions : list) {
				if ((id != offersAndDeductions.getId()) ||
						(active != offersAndDeductions.getActive())) {
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

			query.append(_SQL_SELECT_OFFERSANDDEDUCTIONS_WHERE);

			query.append(_FINDER_COLUMN_IDANDACTIVE_ID_2);

			query.append(_FINDER_COLUMN_IDANDACTIVE_ACTIVE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OffersAndDeductionsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

				qPos.add(active);

				if (!pagination) {
					list = (List<OffersAndDeductions>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OffersAndDeductions>(list);
				}
				else {
					list = (List<OffersAndDeductions>)QueryUtil.list(q,
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
	 * Returns the first offers and deductions in the ordered set where id = &#63; and active = &#63;.
	 *
	 * @param id the ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching offers and deductions
	 * @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions findByIdAndActive_First(long id, int active,
		OrderByComparator orderByComparator)
		throws NoSuchOffersAndDeductionsException, SystemException {
		OffersAndDeductions offersAndDeductions = fetchByIdAndActive_First(id,
				active, orderByComparator);

		if (offersAndDeductions != null) {
			return offersAndDeductions;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("id=");
		msg.append(id);

		msg.append(", active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOffersAndDeductionsException(msg.toString());
	}

	/**
	 * Returns the first offers and deductions in the ordered set where id = &#63; and active = &#63;.
	 *
	 * @param id the ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions fetchByIdAndActive_First(long id, int active,
		OrderByComparator orderByComparator) throws SystemException {
		List<OffersAndDeductions> list = findByIdAndActive(id, active, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last offers and deductions in the ordered set where id = &#63; and active = &#63;.
	 *
	 * @param id the ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching offers and deductions
	 * @throws com.ocms.course.NoSuchOffersAndDeductionsException if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions findByIdAndActive_Last(long id, int active,
		OrderByComparator orderByComparator)
		throws NoSuchOffersAndDeductionsException, SystemException {
		OffersAndDeductions offersAndDeductions = fetchByIdAndActive_Last(id,
				active, orderByComparator);

		if (offersAndDeductions != null) {
			return offersAndDeductions;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("id=");
		msg.append(id);

		msg.append(", active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOffersAndDeductionsException(msg.toString());
	}

	/**
	 * Returns the last offers and deductions in the ordered set where id = &#63; and active = &#63;.
	 *
	 * @param id the ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching offers and deductions, or <code>null</code> if a matching offers and deductions could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions fetchByIdAndActive_Last(long id, int active,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByIdAndActive(id, active);

		if (count == 0) {
			return null;
		}

		List<OffersAndDeductions> list = findByIdAndActive(id, active,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the offers and deductionses where id = &#63; and active = &#63; from the database.
	 *
	 * @param id the ID
	 * @param active the active
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByIdAndActive(long id, int active)
		throws SystemException {
		for (OffersAndDeductions offersAndDeductions : findByIdAndActive(id,
				active, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(offersAndDeductions);
		}
	}

	/**
	 * Returns the number of offers and deductionses where id = &#63; and active = &#63;.
	 *
	 * @param id the ID
	 * @param active the active
	 * @return the number of matching offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByIdAndActive(long id, int active)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_IDANDACTIVE;

		Object[] finderArgs = new Object[] { id, active };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_OFFERSANDDEDUCTIONS_WHERE);

			query.append(_FINDER_COLUMN_IDANDACTIVE_ID_2);

			query.append(_FINDER_COLUMN_IDANDACTIVE_ACTIVE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

				qPos.add(active);

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

	private static final String _FINDER_COLUMN_IDANDACTIVE_ID_2 = "offersAndDeductions.id = ? AND ";
	private static final String _FINDER_COLUMN_IDANDACTIVE_ACTIVE_2 = "offersAndDeductions.active = ?";

	public OffersAndDeductionsPersistenceImpl() {
		setModelClass(OffersAndDeductions.class);
	}

	/**
	 * Caches the offers and deductions in the entity cache if it is enabled.
	 *
	 * @param offersAndDeductions the offers and deductions
	 */
	@Override
	public void cacheResult(OffersAndDeductions offersAndDeductions) {
		EntityCacheUtil.putResult(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsImpl.class, offersAndDeductions.getPrimaryKey(),
			offersAndDeductions);

		offersAndDeductions.resetOriginalValues();
	}

	/**
	 * Caches the offers and deductionses in the entity cache if it is enabled.
	 *
	 * @param offersAndDeductionses the offers and deductionses
	 */
	@Override
	public void cacheResult(List<OffersAndDeductions> offersAndDeductionses) {
		for (OffersAndDeductions offersAndDeductions : offersAndDeductionses) {
			if (EntityCacheUtil.getResult(
						OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
						OffersAndDeductionsImpl.class,
						offersAndDeductions.getPrimaryKey()) == null) {
				cacheResult(offersAndDeductions);
			}
			else {
				offersAndDeductions.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all offers and deductionses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(OffersAndDeductionsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(OffersAndDeductionsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the offers and deductions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OffersAndDeductions offersAndDeductions) {
		EntityCacheUtil.removeResult(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsImpl.class, offersAndDeductions.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<OffersAndDeductions> offersAndDeductionses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (OffersAndDeductions offersAndDeductions : offersAndDeductionses) {
			EntityCacheUtil.removeResult(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
				OffersAndDeductionsImpl.class,
				offersAndDeductions.getPrimaryKey());
		}
	}

	/**
	 * Creates a new offers and deductions with the primary key. Does not add the offers and deductions to the database.
	 *
	 * @param id the primary key for the new offers and deductions
	 * @return the new offers and deductions
	 */
	@Override
	public OffersAndDeductions create(long id) {
		OffersAndDeductions offersAndDeductions = new OffersAndDeductionsImpl();

		offersAndDeductions.setNew(true);
		offersAndDeductions.setPrimaryKey(id);

		return offersAndDeductions;
	}

	/**
	 * Removes the offers and deductions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the offers and deductions
	 * @return the offers and deductions that was removed
	 * @throws com.ocms.course.NoSuchOffersAndDeductionsException if a offers and deductions with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions remove(long id)
		throws NoSuchOffersAndDeductionsException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the offers and deductions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the offers and deductions
	 * @return the offers and deductions that was removed
	 * @throws com.ocms.course.NoSuchOffersAndDeductionsException if a offers and deductions with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions remove(Serializable primaryKey)
		throws NoSuchOffersAndDeductionsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			OffersAndDeductions offersAndDeductions = (OffersAndDeductions)session.get(OffersAndDeductionsImpl.class,
					primaryKey);

			if (offersAndDeductions == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOffersAndDeductionsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(offersAndDeductions);
		}
		catch (NoSuchOffersAndDeductionsException nsee) {
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
	protected OffersAndDeductions removeImpl(
		OffersAndDeductions offersAndDeductions) throws SystemException {
		offersAndDeductions = toUnwrappedModel(offersAndDeductions);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(offersAndDeductions)) {
				offersAndDeductions = (OffersAndDeductions)session.get(OffersAndDeductionsImpl.class,
						offersAndDeductions.getPrimaryKeyObj());
			}

			if (offersAndDeductions != null) {
				session.delete(offersAndDeductions);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (offersAndDeductions != null) {
			clearCache(offersAndDeductions);
		}

		return offersAndDeductions;
	}

	@Override
	public OffersAndDeductions updateImpl(
		com.ocms.course.model.OffersAndDeductions offersAndDeductions)
		throws SystemException {
		offersAndDeductions = toUnwrappedModel(offersAndDeductions);

		boolean isNew = offersAndDeductions.isNew();

		OffersAndDeductionsModelImpl offersAndDeductionsModelImpl = (OffersAndDeductionsModelImpl)offersAndDeductions;

		Session session = null;

		try {
			session = openSession();

			if (offersAndDeductions.isNew()) {
				session.save(offersAndDeductions);

				offersAndDeductions.setNew(false);
			}
			else {
				session.merge(offersAndDeductions);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !OffersAndDeductionsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((offersAndDeductionsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						offersAndDeductionsModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { offersAndDeductionsModelImpl.getGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((offersAndDeductionsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						offersAndDeductionsModelImpl.getOriginalId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
					args);

				args = new Object[] { offersAndDeductionsModelImpl.getId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
					args);
			}

			if ((offersAndDeductionsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						offersAndDeductionsModelImpl.getOriginalCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODE,
					args);

				args = new Object[] { offersAndDeductionsModelImpl.getCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODE,
					args);
			}

			if ((offersAndDeductionsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						offersAndDeductionsModelImpl.getOriginalActive()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACTIVE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVE,
					args);

				args = new Object[] { offersAndDeductionsModelImpl.getActive() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACTIVE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVE,
					args);
			}

			if ((offersAndDeductionsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPIDANDACTIVE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						offersAndDeductionsModelImpl.getOriginalGroupId(),
						offersAndDeductionsModelImpl.getOriginalActive()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPIDANDACTIVE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPIDANDACTIVE,
					args);

				args = new Object[] {
						offersAndDeductionsModelImpl.getGroupId(),
						offersAndDeductionsModelImpl.getActive()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPIDANDACTIVE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPIDANDACTIVE,
					args);
			}

			if ((offersAndDeductionsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODEANDACTIVE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						offersAndDeductionsModelImpl.getOriginalCode(),
						offersAndDeductionsModelImpl.getOriginalActive()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODEANDACTIVE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODEANDACTIVE,
					args);

				args = new Object[] {
						offersAndDeductionsModelImpl.getCode(),
						offersAndDeductionsModelImpl.getActive()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODEANDACTIVE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODEANDACTIVE,
					args);
			}

			if ((offersAndDeductionsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						offersAndDeductionsModelImpl.getOriginalType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TYPE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE,
					args);

				args = new Object[] { offersAndDeductionsModelImpl.getType() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TYPE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE,
					args);
			}

			if ((offersAndDeductionsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPIDTYPEACTIVE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						offersAndDeductionsModelImpl.getOriginalGroupId(),
						offersAndDeductionsModelImpl.getOriginalType(),
						offersAndDeductionsModelImpl.getOriginalId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPIDTYPEACTIVE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPIDTYPEACTIVE,
					args);

				args = new Object[] {
						offersAndDeductionsModelImpl.getGroupId(),
						offersAndDeductionsModelImpl.getType(),
						offersAndDeductionsModelImpl.getId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPIDTYPEACTIVE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPIDTYPEACTIVE,
					args);
			}

			if ((offersAndDeductionsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDANDACTIVE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						offersAndDeductionsModelImpl.getOriginalId(),
						offersAndDeductionsModelImpl.getOriginalActive()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IDANDACTIVE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDANDACTIVE,
					args);

				args = new Object[] {
						offersAndDeductionsModelImpl.getId(),
						offersAndDeductionsModelImpl.getActive()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IDANDACTIVE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDANDACTIVE,
					args);
			}
		}

		EntityCacheUtil.putResult(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
			OffersAndDeductionsImpl.class, offersAndDeductions.getPrimaryKey(),
			offersAndDeductions);

		return offersAndDeductions;
	}

	protected OffersAndDeductions toUnwrappedModel(
		OffersAndDeductions offersAndDeductions) {
		if (offersAndDeductions instanceof OffersAndDeductionsImpl) {
			return offersAndDeductions;
		}

		OffersAndDeductionsImpl offersAndDeductionsImpl = new OffersAndDeductionsImpl();

		offersAndDeductionsImpl.setNew(offersAndDeductions.isNew());
		offersAndDeductionsImpl.setPrimaryKey(offersAndDeductions.getPrimaryKey());

		offersAndDeductionsImpl.setId(offersAndDeductions.getId());
		offersAndDeductionsImpl.setGroupId(offersAndDeductions.getGroupId());
		offersAndDeductionsImpl.setCompanyId(offersAndDeductions.getCompanyId());
		offersAndDeductionsImpl.setUserId(offersAndDeductions.getUserId());
		offersAndDeductionsImpl.setUserName(offersAndDeductions.getUserName());
		offersAndDeductionsImpl.setCreateDate(offersAndDeductions.getCreateDate());
		offersAndDeductionsImpl.setModifiedDate(offersAndDeductions.getModifiedDate());
		offersAndDeductionsImpl.setCode(offersAndDeductions.getCode());
		offersAndDeductionsImpl.setDescription(offersAndDeductions.getDescription());
		offersAndDeductionsImpl.setAmount(offersAndDeductions.getAmount());
		offersAndDeductionsImpl.setActive(offersAndDeductions.getActive());
		offersAndDeductionsImpl.setEffectiveFromDate(offersAndDeductions.getEffectiveFromDate());
		offersAndDeductionsImpl.setEffectivetoDate(offersAndDeductions.getEffectivetoDate());
		offersAndDeductionsImpl.setType(offersAndDeductions.getType());

		return offersAndDeductionsImpl;
	}

	/**
	 * Returns the offers and deductions with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the offers and deductions
	 * @return the offers and deductions
	 * @throws com.ocms.course.NoSuchOffersAndDeductionsException if a offers and deductions with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOffersAndDeductionsException, SystemException {
		OffersAndDeductions offersAndDeductions = fetchByPrimaryKey(primaryKey);

		if (offersAndDeductions == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOffersAndDeductionsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return offersAndDeductions;
	}

	/**
	 * Returns the offers and deductions with the primary key or throws a {@link com.ocms.course.NoSuchOffersAndDeductionsException} if it could not be found.
	 *
	 * @param id the primary key of the offers and deductions
	 * @return the offers and deductions
	 * @throws com.ocms.course.NoSuchOffersAndDeductionsException if a offers and deductions with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions findByPrimaryKey(long id)
		throws NoSuchOffersAndDeductionsException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the offers and deductions with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the offers and deductions
	 * @return the offers and deductions, or <code>null</code> if a offers and deductions with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		OffersAndDeductions offersAndDeductions = (OffersAndDeductions)EntityCacheUtil.getResult(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
				OffersAndDeductionsImpl.class, primaryKey);

		if (offersAndDeductions == _nullOffersAndDeductions) {
			return null;
		}

		if (offersAndDeductions == null) {
			Session session = null;

			try {
				session = openSession();

				offersAndDeductions = (OffersAndDeductions)session.get(OffersAndDeductionsImpl.class,
						primaryKey);

				if (offersAndDeductions != null) {
					cacheResult(offersAndDeductions);
				}
				else {
					EntityCacheUtil.putResult(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
						OffersAndDeductionsImpl.class, primaryKey,
						_nullOffersAndDeductions);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(OffersAndDeductionsModelImpl.ENTITY_CACHE_ENABLED,
					OffersAndDeductionsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return offersAndDeductions;
	}

	/**
	 * Returns the offers and deductions with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the offers and deductions
	 * @return the offers and deductions, or <code>null</code> if a offers and deductions with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OffersAndDeductions fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the offers and deductionses.
	 *
	 * @return the offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OffersAndDeductions> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the offers and deductionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of offers and deductionses
	 * @param end the upper bound of the range of offers and deductionses (not inclusive)
	 * @return the range of offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OffersAndDeductions> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the offers and deductionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.OffersAndDeductionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of offers and deductionses
	 * @param end the upper bound of the range of offers and deductionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of offers and deductionses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OffersAndDeductions> findAll(int start, int end,
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

		List<OffersAndDeductions> list = (List<OffersAndDeductions>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_OFFERSANDDEDUCTIONS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_OFFERSANDDEDUCTIONS;

				if (pagination) {
					sql = sql.concat(OffersAndDeductionsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<OffersAndDeductions>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OffersAndDeductions>(list);
				}
				else {
					list = (List<OffersAndDeductions>)QueryUtil.list(q,
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
	 * Removes all the offers and deductionses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (OffersAndDeductions offersAndDeductions : findAll()) {
			remove(offersAndDeductions);
		}
	}

	/**
	 * Returns the number of offers and deductionses.
	 *
	 * @return the number of offers and deductionses
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

				Query q = session.createQuery(_SQL_COUNT_OFFERSANDDEDUCTIONS);

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
	 * Initializes the offers and deductions persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ocms.course.model.OffersAndDeductions")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<OffersAndDeductions>> listenersList = new ArrayList<ModelListener<OffersAndDeductions>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<OffersAndDeductions>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(OffersAndDeductionsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_OFFERSANDDEDUCTIONS = "SELECT offersAndDeductions FROM OffersAndDeductions offersAndDeductions";
	private static final String _SQL_SELECT_OFFERSANDDEDUCTIONS_WHERE = "SELECT offersAndDeductions FROM OffersAndDeductions offersAndDeductions WHERE ";
	private static final String _SQL_COUNT_OFFERSANDDEDUCTIONS = "SELECT COUNT(offersAndDeductions) FROM OffersAndDeductions offersAndDeductions";
	private static final String _SQL_COUNT_OFFERSANDDEDUCTIONS_WHERE = "SELECT COUNT(offersAndDeductions) FROM OffersAndDeductions offersAndDeductions WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "offersAndDeductions.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No OffersAndDeductions exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No OffersAndDeductions exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(OffersAndDeductionsPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "code", "active", "type"
			});
	private static OffersAndDeductions _nullOffersAndDeductions = new OffersAndDeductionsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<OffersAndDeductions> toCacheModel() {
				return _nullOffersAndDeductionsCacheModel;
			}
		};

	private static CacheModel<OffersAndDeductions> _nullOffersAndDeductionsCacheModel =
		new CacheModel<OffersAndDeductions>() {
			@Override
			public OffersAndDeductions toEntityModel() {
				return _nullOffersAndDeductions;
			}
		};
}