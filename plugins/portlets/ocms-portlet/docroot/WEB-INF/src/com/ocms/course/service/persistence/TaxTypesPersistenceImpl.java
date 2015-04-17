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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.ocms.course.NoSuchTaxTypesException;
import com.ocms.course.model.TaxTypes;
import com.ocms.course.model.impl.TaxTypesImpl;
import com.ocms.course.model.impl.TaxTypesModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the tax types service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author doraraj
 * @see TaxTypesPersistence
 * @see TaxTypesUtil
 * @generated
 */
public class TaxTypesPersistenceImpl extends BasePersistenceImpl<TaxTypes>
	implements TaxTypesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TaxTypesUtil} to access the tax types persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TaxTypesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TaxTypesModelImpl.ENTITY_CACHE_ENABLED,
			TaxTypesModelImpl.FINDER_CACHE_ENABLED, TaxTypesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TaxTypesModelImpl.ENTITY_CACHE_ENABLED,
			TaxTypesModelImpl.FINDER_CACHE_ENABLED, TaxTypesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TaxTypesModelImpl.ENTITY_CACHE_ENABLED,
			TaxTypesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(TaxTypesModelImpl.ENTITY_CACHE_ENABLED,
			TaxTypesModelImpl.FINDER_CACHE_ENABLED, TaxTypesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(TaxTypesModelImpl.ENTITY_CACHE_ENABLED,
			TaxTypesModelImpl.FINDER_CACHE_ENABLED, TaxTypesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			TaxTypesModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(TaxTypesModelImpl.ENTITY_CACHE_ENABLED,
			TaxTypesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the tax typeses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching tax typeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxTypes> findByGroupId(long groupId) throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tax typeses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of tax typeses
	 * @param end the upper bound of the range of tax typeses (not inclusive)
	 * @return the range of matching tax typeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxTypes> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tax typeses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of tax typeses
	 * @param end the upper bound of the range of tax typeses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tax typeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxTypes> findByGroupId(long groupId, int start, int end,
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

		List<TaxTypes> list = (List<TaxTypes>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TaxTypes taxTypes : list) {
				if ((groupId != taxTypes.getGroupId())) {
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

			query.append(_SQL_SELECT_TAXTYPES_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TaxTypesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<TaxTypes>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TaxTypes>(list);
				}
				else {
					list = (List<TaxTypes>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first tax types in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tax types
	 * @throws com.ocms.course.NoSuchTaxTypesException if a matching tax types could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxTypes findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchTaxTypesException, SystemException {
		TaxTypes taxTypes = fetchByGroupId_First(groupId, orderByComparator);

		if (taxTypes != null) {
			return taxTypes;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTaxTypesException(msg.toString());
	}

	/**
	 * Returns the first tax types in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tax types, or <code>null</code> if a matching tax types could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxTypes fetchByGroupId_First(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<TaxTypes> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tax types in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tax types
	 * @throws com.ocms.course.NoSuchTaxTypesException if a matching tax types could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxTypes findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchTaxTypesException, SystemException {
		TaxTypes taxTypes = fetchByGroupId_Last(groupId, orderByComparator);

		if (taxTypes != null) {
			return taxTypes;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTaxTypesException(msg.toString());
	}

	/**
	 * Returns the last tax types in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tax types, or <code>null</code> if a matching tax types could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxTypes fetchByGroupId_Last(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<TaxTypes> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tax typeses before and after the current tax types in the ordered set where groupId = &#63;.
	 *
	 * @param taxTypesId the primary key of the current tax types
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tax types
	 * @throws com.ocms.course.NoSuchTaxTypesException if a tax types with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxTypes[] findByGroupId_PrevAndNext(long taxTypesId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchTaxTypesException, SystemException {
		TaxTypes taxTypes = findByPrimaryKey(taxTypesId);

		Session session = null;

		try {
			session = openSession();

			TaxTypes[] array = new TaxTypesImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, taxTypes, groupId,
					orderByComparator, true);

			array[1] = taxTypes;

			array[2] = getByGroupId_PrevAndNext(session, taxTypes, groupId,
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

	protected TaxTypes getByGroupId_PrevAndNext(Session session,
		TaxTypes taxTypes, long groupId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TAXTYPES_WHERE);

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
			query.append(TaxTypesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(taxTypes);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TaxTypes> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tax typeses where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupId(long groupId) throws SystemException {
		for (TaxTypes taxTypes : findByGroupId(groupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(taxTypes);
		}
	}

	/**
	 * Returns the number of tax typeses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching tax typeses
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

			query.append(_SQL_COUNT_TAXTYPES_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "taxTypes.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TAXTYPEID =
		new FinderPath(TaxTypesModelImpl.ENTITY_CACHE_ENABLED,
			TaxTypesModelImpl.FINDER_CACHE_ENABLED, TaxTypesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTaxTypeId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAXTYPEID =
		new FinderPath(TaxTypesModelImpl.ENTITY_CACHE_ENABLED,
			TaxTypesModelImpl.FINDER_CACHE_ENABLED, TaxTypesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTaxTypeId",
			new String[] { Long.class.getName() },
			TaxTypesModelImpl.TAXTYPESID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TAXTYPEID = new FinderPath(TaxTypesModelImpl.ENTITY_CACHE_ENABLED,
			TaxTypesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTaxTypeId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the tax typeses where taxTypesId = &#63;.
	 *
	 * @param taxTypesId the tax types ID
	 * @return the matching tax typeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxTypes> findByTaxTypeId(long taxTypesId)
		throws SystemException {
		return findByTaxTypeId(taxTypesId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tax typeses where taxTypesId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param taxTypesId the tax types ID
	 * @param start the lower bound of the range of tax typeses
	 * @param end the upper bound of the range of tax typeses (not inclusive)
	 * @return the range of matching tax typeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxTypes> findByTaxTypeId(long taxTypesId, int start, int end)
		throws SystemException {
		return findByTaxTypeId(taxTypesId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tax typeses where taxTypesId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param taxTypesId the tax types ID
	 * @param start the lower bound of the range of tax typeses
	 * @param end the upper bound of the range of tax typeses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tax typeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxTypes> findByTaxTypeId(long taxTypesId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAXTYPEID;
			finderArgs = new Object[] { taxTypesId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TAXTYPEID;
			finderArgs = new Object[] { taxTypesId, start, end, orderByComparator };
		}

		List<TaxTypes> list = (List<TaxTypes>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TaxTypes taxTypes : list) {
				if ((taxTypesId != taxTypes.getTaxTypesId())) {
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

			query.append(_SQL_SELECT_TAXTYPES_WHERE);

			query.append(_FINDER_COLUMN_TAXTYPEID_TAXTYPESID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TaxTypesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(taxTypesId);

				if (!pagination) {
					list = (List<TaxTypes>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TaxTypes>(list);
				}
				else {
					list = (List<TaxTypes>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first tax types in the ordered set where taxTypesId = &#63;.
	 *
	 * @param taxTypesId the tax types ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tax types
	 * @throws com.ocms.course.NoSuchTaxTypesException if a matching tax types could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxTypes findByTaxTypeId_First(long taxTypesId,
		OrderByComparator orderByComparator)
		throws NoSuchTaxTypesException, SystemException {
		TaxTypes taxTypes = fetchByTaxTypeId_First(taxTypesId, orderByComparator);

		if (taxTypes != null) {
			return taxTypes;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("taxTypesId=");
		msg.append(taxTypesId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTaxTypesException(msg.toString());
	}

	/**
	 * Returns the first tax types in the ordered set where taxTypesId = &#63;.
	 *
	 * @param taxTypesId the tax types ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tax types, or <code>null</code> if a matching tax types could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxTypes fetchByTaxTypeId_First(long taxTypesId,
		OrderByComparator orderByComparator) throws SystemException {
		List<TaxTypes> list = findByTaxTypeId(taxTypesId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tax types in the ordered set where taxTypesId = &#63;.
	 *
	 * @param taxTypesId the tax types ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tax types
	 * @throws com.ocms.course.NoSuchTaxTypesException if a matching tax types could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxTypes findByTaxTypeId_Last(long taxTypesId,
		OrderByComparator orderByComparator)
		throws NoSuchTaxTypesException, SystemException {
		TaxTypes taxTypes = fetchByTaxTypeId_Last(taxTypesId, orderByComparator);

		if (taxTypes != null) {
			return taxTypes;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("taxTypesId=");
		msg.append(taxTypesId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTaxTypesException(msg.toString());
	}

	/**
	 * Returns the last tax types in the ordered set where taxTypesId = &#63;.
	 *
	 * @param taxTypesId the tax types ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tax types, or <code>null</code> if a matching tax types could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxTypes fetchByTaxTypeId_Last(long taxTypesId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTaxTypeId(taxTypesId);

		if (count == 0) {
			return null;
		}

		List<TaxTypes> list = findByTaxTypeId(taxTypesId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the tax typeses where taxTypesId = &#63; from the database.
	 *
	 * @param taxTypesId the tax types ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTaxTypeId(long taxTypesId) throws SystemException {
		for (TaxTypes taxTypes : findByTaxTypeId(taxTypesId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(taxTypes);
		}
	}

	/**
	 * Returns the number of tax typeses where taxTypesId = &#63;.
	 *
	 * @param taxTypesId the tax types ID
	 * @return the number of matching tax typeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTaxTypeId(long taxTypesId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TAXTYPEID;

		Object[] finderArgs = new Object[] { taxTypesId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TAXTYPES_WHERE);

			query.append(_FINDER_COLUMN_TAXTYPEID_TAXTYPESID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(taxTypesId);

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

	private static final String _FINDER_COLUMN_TAXTYPEID_TAXTYPESID_2 = "taxTypes.taxTypesId = ?";

	public TaxTypesPersistenceImpl() {
		setModelClass(TaxTypes.class);
	}

	/**
	 * Caches the tax types in the entity cache if it is enabled.
	 *
	 * @param taxTypes the tax types
	 */
	@Override
	public void cacheResult(TaxTypes taxTypes) {
		EntityCacheUtil.putResult(TaxTypesModelImpl.ENTITY_CACHE_ENABLED,
			TaxTypesImpl.class, taxTypes.getPrimaryKey(), taxTypes);

		taxTypes.resetOriginalValues();
	}

	/**
	 * Caches the tax typeses in the entity cache if it is enabled.
	 *
	 * @param taxTypeses the tax typeses
	 */
	@Override
	public void cacheResult(List<TaxTypes> taxTypeses) {
		for (TaxTypes taxTypes : taxTypeses) {
			if (EntityCacheUtil.getResult(
						TaxTypesModelImpl.ENTITY_CACHE_ENABLED,
						TaxTypesImpl.class, taxTypes.getPrimaryKey()) == null) {
				cacheResult(taxTypes);
			}
			else {
				taxTypes.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tax typeses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TaxTypesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TaxTypesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tax types.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TaxTypes taxTypes) {
		EntityCacheUtil.removeResult(TaxTypesModelImpl.ENTITY_CACHE_ENABLED,
			TaxTypesImpl.class, taxTypes.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TaxTypes> taxTypeses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TaxTypes taxTypes : taxTypeses) {
			EntityCacheUtil.removeResult(TaxTypesModelImpl.ENTITY_CACHE_ENABLED,
				TaxTypesImpl.class, taxTypes.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tax types with the primary key. Does not add the tax types to the database.
	 *
	 * @param taxTypesId the primary key for the new tax types
	 * @return the new tax types
	 */
	@Override
	public TaxTypes create(long taxTypesId) {
		TaxTypes taxTypes = new TaxTypesImpl();

		taxTypes.setNew(true);
		taxTypes.setPrimaryKey(taxTypesId);

		return taxTypes;
	}

	/**
	 * Removes the tax types with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param taxTypesId the primary key of the tax types
	 * @return the tax types that was removed
	 * @throws com.ocms.course.NoSuchTaxTypesException if a tax types with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxTypes remove(long taxTypesId)
		throws NoSuchTaxTypesException, SystemException {
		return remove((Serializable)taxTypesId);
	}

	/**
	 * Removes the tax types with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tax types
	 * @return the tax types that was removed
	 * @throws com.ocms.course.NoSuchTaxTypesException if a tax types with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxTypes remove(Serializable primaryKey)
		throws NoSuchTaxTypesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TaxTypes taxTypes = (TaxTypes)session.get(TaxTypesImpl.class,
					primaryKey);

			if (taxTypes == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTaxTypesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(taxTypes);
		}
		catch (NoSuchTaxTypesException nsee) {
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
	protected TaxTypes removeImpl(TaxTypes taxTypes) throws SystemException {
		taxTypes = toUnwrappedModel(taxTypes);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(taxTypes)) {
				taxTypes = (TaxTypes)session.get(TaxTypesImpl.class,
						taxTypes.getPrimaryKeyObj());
			}

			if (taxTypes != null) {
				session.delete(taxTypes);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (taxTypes != null) {
			clearCache(taxTypes);
		}

		return taxTypes;
	}

	@Override
	public TaxTypes updateImpl(com.ocms.course.model.TaxTypes taxTypes)
		throws SystemException {
		taxTypes = toUnwrappedModel(taxTypes);

		boolean isNew = taxTypes.isNew();

		TaxTypesModelImpl taxTypesModelImpl = (TaxTypesModelImpl)taxTypes;

		Session session = null;

		try {
			session = openSession();

			if (taxTypes.isNew()) {
				session.save(taxTypes);

				taxTypes.setNew(false);
			}
			else {
				session.merge(taxTypes);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TaxTypesModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((taxTypesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						taxTypesModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { taxTypesModelImpl.getGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((taxTypesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAXTYPEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						taxTypesModelImpl.getOriginalTaxTypesId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TAXTYPEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAXTYPEID,
					args);

				args = new Object[] { taxTypesModelImpl.getTaxTypesId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TAXTYPEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAXTYPEID,
					args);
			}
		}

		EntityCacheUtil.putResult(TaxTypesModelImpl.ENTITY_CACHE_ENABLED,
			TaxTypesImpl.class, taxTypes.getPrimaryKey(), taxTypes);

		return taxTypes;
	}

	protected TaxTypes toUnwrappedModel(TaxTypes taxTypes) {
		if (taxTypes instanceof TaxTypesImpl) {
			return taxTypes;
		}

		TaxTypesImpl taxTypesImpl = new TaxTypesImpl();

		taxTypesImpl.setNew(taxTypes.isNew());
		taxTypesImpl.setPrimaryKey(taxTypes.getPrimaryKey());

		taxTypesImpl.setTaxTypesId(taxTypes.getTaxTypesId());
		taxTypesImpl.setGroupId(taxTypes.getGroupId());
		taxTypesImpl.setCompanyId(taxTypes.getCompanyId());
		taxTypesImpl.setUserId(taxTypes.getUserId());
		taxTypesImpl.setUserName(taxTypes.getUserName());
		taxTypesImpl.setCreateDate(taxTypes.getCreateDate());
		taxTypesImpl.setModifiedDate(taxTypes.getModifiedDate());
		taxTypesImpl.setTaxName(taxTypes.getTaxName());

		return taxTypesImpl;
	}

	/**
	 * Returns the tax types with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tax types
	 * @return the tax types
	 * @throws com.ocms.course.NoSuchTaxTypesException if a tax types with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxTypes findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTaxTypesException, SystemException {
		TaxTypes taxTypes = fetchByPrimaryKey(primaryKey);

		if (taxTypes == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTaxTypesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return taxTypes;
	}

	/**
	 * Returns the tax types with the primary key or throws a {@link com.ocms.course.NoSuchTaxTypesException} if it could not be found.
	 *
	 * @param taxTypesId the primary key of the tax types
	 * @return the tax types
	 * @throws com.ocms.course.NoSuchTaxTypesException if a tax types with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxTypes findByPrimaryKey(long taxTypesId)
		throws NoSuchTaxTypesException, SystemException {
		return findByPrimaryKey((Serializable)taxTypesId);
	}

	/**
	 * Returns the tax types with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tax types
	 * @return the tax types, or <code>null</code> if a tax types with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxTypes fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TaxTypes taxTypes = (TaxTypes)EntityCacheUtil.getResult(TaxTypesModelImpl.ENTITY_CACHE_ENABLED,
				TaxTypesImpl.class, primaryKey);

		if (taxTypes == _nullTaxTypes) {
			return null;
		}

		if (taxTypes == null) {
			Session session = null;

			try {
				session = openSession();

				taxTypes = (TaxTypes)session.get(TaxTypesImpl.class, primaryKey);

				if (taxTypes != null) {
					cacheResult(taxTypes);
				}
				else {
					EntityCacheUtil.putResult(TaxTypesModelImpl.ENTITY_CACHE_ENABLED,
						TaxTypesImpl.class, primaryKey, _nullTaxTypes);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TaxTypesModelImpl.ENTITY_CACHE_ENABLED,
					TaxTypesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return taxTypes;
	}

	/**
	 * Returns the tax types with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param taxTypesId the primary key of the tax types
	 * @return the tax types, or <code>null</code> if a tax types with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxTypes fetchByPrimaryKey(long taxTypesId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)taxTypesId);
	}

	/**
	 * Returns all the tax typeses.
	 *
	 * @return the tax typeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxTypes> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tax typeses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tax typeses
	 * @param end the upper bound of the range of tax typeses (not inclusive)
	 * @return the range of tax typeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxTypes> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tax typeses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tax typeses
	 * @param end the upper bound of the range of tax typeses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tax typeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxTypes> findAll(int start, int end,
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

		List<TaxTypes> list = (List<TaxTypes>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TAXTYPES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TAXTYPES;

				if (pagination) {
					sql = sql.concat(TaxTypesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TaxTypes>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TaxTypes>(list);
				}
				else {
					list = (List<TaxTypes>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the tax typeses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TaxTypes taxTypes : findAll()) {
			remove(taxTypes);
		}
	}

	/**
	 * Returns the number of tax typeses.
	 *
	 * @return the number of tax typeses
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

				Query q = session.createQuery(_SQL_COUNT_TAXTYPES);

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

	/**
	 * Initializes the tax types persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ocms.course.model.TaxTypes")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TaxTypes>> listenersList = new ArrayList<ModelListener<TaxTypes>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TaxTypes>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TaxTypesImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TAXTYPES = "SELECT taxTypes FROM TaxTypes taxTypes";
	private static final String _SQL_SELECT_TAXTYPES_WHERE = "SELECT taxTypes FROM TaxTypes taxTypes WHERE ";
	private static final String _SQL_COUNT_TAXTYPES = "SELECT COUNT(taxTypes) FROM TaxTypes taxTypes";
	private static final String _SQL_COUNT_TAXTYPES_WHERE = "SELECT COUNT(taxTypes) FROM TaxTypes taxTypes WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "taxTypes.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TaxTypes exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TaxTypes exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TaxTypesPersistenceImpl.class);
	private static TaxTypes _nullTaxTypes = new TaxTypesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TaxTypes> toCacheModel() {
				return _nullTaxTypesCacheModel;
			}
		};

	private static CacheModel<TaxTypes> _nullTaxTypesCacheModel = new CacheModel<TaxTypes>() {
			@Override
			public TaxTypes toEntityModel() {
				return _nullTaxTypes;
			}
		};
}