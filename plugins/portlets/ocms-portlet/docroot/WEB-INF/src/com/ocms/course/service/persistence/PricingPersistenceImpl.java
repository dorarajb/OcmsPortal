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

import com.ocms.course.NoSuchPricingException;
import com.ocms.course.model.Pricing;
import com.ocms.course.model.impl.PricingImpl;
import com.ocms.course.model.impl.PricingModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the pricing service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author doraraj
 * @see PricingPersistence
 * @see PricingUtil
 * @generated
 */
public class PricingPersistenceImpl extends BasePersistenceImpl<Pricing>
	implements PricingPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PricingUtil} to access the pricing persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PricingImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingModelImpl.FINDER_CACHE_ENABLED, PricingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingModelImpl.FINDER_CACHE_ENABLED, PricingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingModelImpl.FINDER_CACHE_ENABLED, PricingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingModelImpl.FINDER_CACHE_ENABLED, PricingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			PricingModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the pricings where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pricing> findByGroupId(long groupId) throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pricings where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of pricings
	 * @param end the upper bound of the range of pricings (not inclusive)
	 * @return the range of matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pricing> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the pricings where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of pricings
	 * @param end the upper bound of the range of pricings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pricing> findByGroupId(long groupId, int start, int end,
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

		List<Pricing> list = (List<Pricing>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Pricing pricing : list) {
				if ((groupId != pricing.getGroupId())) {
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

			query.append(_SQL_SELECT_PRICING_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PricingModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<Pricing>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Pricing>(list);
				}
				else {
					list = (List<Pricing>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first pricing in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pricing
	 * @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchPricingException, SystemException {
		Pricing pricing = fetchByGroupId_First(groupId, orderByComparator);

		if (pricing != null) {
			return pricing;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPricingException(msg.toString());
	}

	/**
	 * Returns the first pricing in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pricing, or <code>null</code> if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing fetchByGroupId_First(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Pricing> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last pricing in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pricing
	 * @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchPricingException, SystemException {
		Pricing pricing = fetchByGroupId_Last(groupId, orderByComparator);

		if (pricing != null) {
			return pricing;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPricingException(msg.toString());
	}

	/**
	 * Returns the last pricing in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pricing, or <code>null</code> if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing fetchByGroupId_Last(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<Pricing> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the pricings before and after the current pricing in the ordered set where groupId = &#63;.
	 *
	 * @param pricingId the primary key of the current pricing
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pricing
	 * @throws com.ocms.course.NoSuchPricingException if a pricing with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing[] findByGroupId_PrevAndNext(long pricingId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchPricingException, SystemException {
		Pricing pricing = findByPrimaryKey(pricingId);

		Session session = null;

		try {
			session = openSession();

			Pricing[] array = new PricingImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, pricing, groupId,
					orderByComparator, true);

			array[1] = pricing;

			array[2] = getByGroupId_PrevAndNext(session, pricing, groupId,
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

	protected Pricing getByGroupId_PrevAndNext(Session session,
		Pricing pricing, long groupId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PRICING_WHERE);

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
			query.append(PricingModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(pricing);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Pricing> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pricings where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupId(long groupId) throws SystemException {
		for (Pricing pricing : findByGroupId(groupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(pricing);
		}
	}

	/**
	 * Returns the number of pricings where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching pricings
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

			query.append(_SQL_COUNT_PRICING_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "pricing.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRICINGID =
		new FinderPath(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingModelImpl.FINDER_CACHE_ENABLED, PricingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPricingId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRICINGID =
		new FinderPath(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingModelImpl.FINDER_CACHE_ENABLED, PricingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPricingId",
			new String[] { Long.class.getName() },
			PricingModelImpl.PRICINGID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRICINGID = new FinderPath(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPricingId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the pricings where pricingId = &#63;.
	 *
	 * @param pricingId the pricing ID
	 * @return the matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pricing> findByPricingId(long pricingId)
		throws SystemException {
		return findByPricingId(pricingId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the pricings where pricingId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pricingId the pricing ID
	 * @param start the lower bound of the range of pricings
	 * @param end the upper bound of the range of pricings (not inclusive)
	 * @return the range of matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pricing> findByPricingId(long pricingId, int start, int end)
		throws SystemException {
		return findByPricingId(pricingId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the pricings where pricingId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pricingId the pricing ID
	 * @param start the lower bound of the range of pricings
	 * @param end the upper bound of the range of pricings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pricing> findByPricingId(long pricingId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRICINGID;
			finderArgs = new Object[] { pricingId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRICINGID;
			finderArgs = new Object[] { pricingId, start, end, orderByComparator };
		}

		List<Pricing> list = (List<Pricing>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Pricing pricing : list) {
				if ((pricingId != pricing.getPricingId())) {
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

			query.append(_SQL_SELECT_PRICING_WHERE);

			query.append(_FINDER_COLUMN_PRICINGID_PRICINGID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PricingModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pricingId);

				if (!pagination) {
					list = (List<Pricing>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Pricing>(list);
				}
				else {
					list = (List<Pricing>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first pricing in the ordered set where pricingId = &#63;.
	 *
	 * @param pricingId the pricing ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pricing
	 * @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing findByPricingId_First(long pricingId,
		OrderByComparator orderByComparator)
		throws NoSuchPricingException, SystemException {
		Pricing pricing = fetchByPricingId_First(pricingId, orderByComparator);

		if (pricing != null) {
			return pricing;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("pricingId=");
		msg.append(pricingId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPricingException(msg.toString());
	}

	/**
	 * Returns the first pricing in the ordered set where pricingId = &#63;.
	 *
	 * @param pricingId the pricing ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pricing, or <code>null</code> if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing fetchByPricingId_First(long pricingId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Pricing> list = findByPricingId(pricingId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last pricing in the ordered set where pricingId = &#63;.
	 *
	 * @param pricingId the pricing ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pricing
	 * @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing findByPricingId_Last(long pricingId,
		OrderByComparator orderByComparator)
		throws NoSuchPricingException, SystemException {
		Pricing pricing = fetchByPricingId_Last(pricingId, orderByComparator);

		if (pricing != null) {
			return pricing;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("pricingId=");
		msg.append(pricingId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPricingException(msg.toString());
	}

	/**
	 * Returns the last pricing in the ordered set where pricingId = &#63;.
	 *
	 * @param pricingId the pricing ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pricing, or <code>null</code> if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing fetchByPricingId_Last(long pricingId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPricingId(pricingId);

		if (count == 0) {
			return null;
		}

		List<Pricing> list = findByPricingId(pricingId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the pricings where pricingId = &#63; from the database.
	 *
	 * @param pricingId the pricing ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPricingId(long pricingId) throws SystemException {
		for (Pricing pricing : findByPricingId(pricingId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(pricing);
		}
	}

	/**
	 * Returns the number of pricings where pricingId = &#63;.
	 *
	 * @param pricingId the pricing ID
	 * @return the number of matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPricingId(long pricingId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRICINGID;

		Object[] finderArgs = new Object[] { pricingId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PRICING_WHERE);

			query.append(_FINDER_COLUMN_PRICINGID_PRICINGID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(pricingId);

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

	private static final String _FINDER_COLUMN_PRICINGID_PRICINGID_2 = "pricing.pricingId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PACKAGEID =
		new FinderPath(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingModelImpl.FINDER_CACHE_ENABLED, PricingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPackageId",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGEID =
		new FinderPath(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingModelImpl.FINDER_CACHE_ENABLED, PricingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPackageId",
			new String[] { Integer.class.getName() },
			PricingModelImpl.PACKAGEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PACKAGEID = new FinderPath(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPackageId",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the pricings where packageId = &#63;.
	 *
	 * @param packageId the package ID
	 * @return the matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pricing> findByPackageId(int packageId)
		throws SystemException {
		return findByPackageId(packageId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the pricings where packageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param packageId the package ID
	 * @param start the lower bound of the range of pricings
	 * @param end the upper bound of the range of pricings (not inclusive)
	 * @return the range of matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pricing> findByPackageId(int packageId, int start, int end)
		throws SystemException {
		return findByPackageId(packageId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the pricings where packageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param packageId the package ID
	 * @param start the lower bound of the range of pricings
	 * @param end the upper bound of the range of pricings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pricing> findByPackageId(int packageId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGEID;
			finderArgs = new Object[] { packageId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PACKAGEID;
			finderArgs = new Object[] { packageId, start, end, orderByComparator };
		}

		List<Pricing> list = (List<Pricing>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Pricing pricing : list) {
				if ((packageId != pricing.getPackageId())) {
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

			query.append(_SQL_SELECT_PRICING_WHERE);

			query.append(_FINDER_COLUMN_PACKAGEID_PACKAGEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PricingModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(packageId);

				if (!pagination) {
					list = (List<Pricing>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Pricing>(list);
				}
				else {
					list = (List<Pricing>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first pricing in the ordered set where packageId = &#63;.
	 *
	 * @param packageId the package ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pricing
	 * @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing findByPackageId_First(int packageId,
		OrderByComparator orderByComparator)
		throws NoSuchPricingException, SystemException {
		Pricing pricing = fetchByPackageId_First(packageId, orderByComparator);

		if (pricing != null) {
			return pricing;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("packageId=");
		msg.append(packageId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPricingException(msg.toString());
	}

	/**
	 * Returns the first pricing in the ordered set where packageId = &#63;.
	 *
	 * @param packageId the package ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pricing, or <code>null</code> if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing fetchByPackageId_First(int packageId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Pricing> list = findByPackageId(packageId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last pricing in the ordered set where packageId = &#63;.
	 *
	 * @param packageId the package ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pricing
	 * @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing findByPackageId_Last(int packageId,
		OrderByComparator orderByComparator)
		throws NoSuchPricingException, SystemException {
		Pricing pricing = fetchByPackageId_Last(packageId, orderByComparator);

		if (pricing != null) {
			return pricing;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("packageId=");
		msg.append(packageId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPricingException(msg.toString());
	}

	/**
	 * Returns the last pricing in the ordered set where packageId = &#63;.
	 *
	 * @param packageId the package ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pricing, or <code>null</code> if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing fetchByPackageId_Last(int packageId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPackageId(packageId);

		if (count == 0) {
			return null;
		}

		List<Pricing> list = findByPackageId(packageId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the pricings before and after the current pricing in the ordered set where packageId = &#63;.
	 *
	 * @param pricingId the primary key of the current pricing
	 * @param packageId the package ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pricing
	 * @throws com.ocms.course.NoSuchPricingException if a pricing with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing[] findByPackageId_PrevAndNext(long pricingId, int packageId,
		OrderByComparator orderByComparator)
		throws NoSuchPricingException, SystemException {
		Pricing pricing = findByPrimaryKey(pricingId);

		Session session = null;

		try {
			session = openSession();

			Pricing[] array = new PricingImpl[3];

			array[0] = getByPackageId_PrevAndNext(session, pricing, packageId,
					orderByComparator, true);

			array[1] = pricing;

			array[2] = getByPackageId_PrevAndNext(session, pricing, packageId,
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

	protected Pricing getByPackageId_PrevAndNext(Session session,
		Pricing pricing, int packageId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PRICING_WHERE);

		query.append(_FINDER_COLUMN_PACKAGEID_PACKAGEID_2);

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
			query.append(PricingModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(packageId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(pricing);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Pricing> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pricings where packageId = &#63; from the database.
	 *
	 * @param packageId the package ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPackageId(int packageId) throws SystemException {
		for (Pricing pricing : findByPackageId(packageId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(pricing);
		}
	}

	/**
	 * Returns the number of pricings where packageId = &#63;.
	 *
	 * @param packageId the package ID
	 * @return the number of matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPackageId(int packageId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PACKAGEID;

		Object[] finderArgs = new Object[] { packageId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PRICING_WHERE);

			query.append(_FINDER_COLUMN_PACKAGEID_PACKAGEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(packageId);

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

	private static final String _FINDER_COLUMN_PACKAGEID_PACKAGEID_2 = "pricing.packageId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COURSEID = new FinderPath(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingModelImpl.FINDER_CACHE_ENABLED, PricingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCourseId",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSEID =
		new FinderPath(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingModelImpl.FINDER_CACHE_ENABLED, PricingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCourseId",
			new String[] { Integer.class.getName() },
			PricingModelImpl.COURSEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COURSEID = new FinderPath(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCourseId",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the pricings where courseId = &#63;.
	 *
	 * @param courseId the course ID
	 * @return the matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pricing> findByCourseId(int courseId) throws SystemException {
		return findByCourseId(courseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the pricings where courseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param courseId the course ID
	 * @param start the lower bound of the range of pricings
	 * @param end the upper bound of the range of pricings (not inclusive)
	 * @return the range of matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pricing> findByCourseId(int courseId, int start, int end)
		throws SystemException {
		return findByCourseId(courseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the pricings where courseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param courseId the course ID
	 * @param start the lower bound of the range of pricings
	 * @param end the upper bound of the range of pricings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pricing> findByCourseId(int courseId, int start, int end,
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

		List<Pricing> list = (List<Pricing>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Pricing pricing : list) {
				if ((courseId != pricing.getCourseId())) {
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

			query.append(_SQL_SELECT_PRICING_WHERE);

			query.append(_FINDER_COLUMN_COURSEID_COURSEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PricingModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(courseId);

				if (!pagination) {
					list = (List<Pricing>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Pricing>(list);
				}
				else {
					list = (List<Pricing>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first pricing in the ordered set where courseId = &#63;.
	 *
	 * @param courseId the course ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pricing
	 * @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing findByCourseId_First(int courseId,
		OrderByComparator orderByComparator)
		throws NoSuchPricingException, SystemException {
		Pricing pricing = fetchByCourseId_First(courseId, orderByComparator);

		if (pricing != null) {
			return pricing;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("courseId=");
		msg.append(courseId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPricingException(msg.toString());
	}

	/**
	 * Returns the first pricing in the ordered set where courseId = &#63;.
	 *
	 * @param courseId the course ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pricing, or <code>null</code> if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing fetchByCourseId_First(int courseId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Pricing> list = findByCourseId(courseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last pricing in the ordered set where courseId = &#63;.
	 *
	 * @param courseId the course ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pricing
	 * @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing findByCourseId_Last(int courseId,
		OrderByComparator orderByComparator)
		throws NoSuchPricingException, SystemException {
		Pricing pricing = fetchByCourseId_Last(courseId, orderByComparator);

		if (pricing != null) {
			return pricing;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("courseId=");
		msg.append(courseId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPricingException(msg.toString());
	}

	/**
	 * Returns the last pricing in the ordered set where courseId = &#63;.
	 *
	 * @param courseId the course ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pricing, or <code>null</code> if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing fetchByCourseId_Last(int courseId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCourseId(courseId);

		if (count == 0) {
			return null;
		}

		List<Pricing> list = findByCourseId(courseId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the pricings before and after the current pricing in the ordered set where courseId = &#63;.
	 *
	 * @param pricingId the primary key of the current pricing
	 * @param courseId the course ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pricing
	 * @throws com.ocms.course.NoSuchPricingException if a pricing with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing[] findByCourseId_PrevAndNext(long pricingId, int courseId,
		OrderByComparator orderByComparator)
		throws NoSuchPricingException, SystemException {
		Pricing pricing = findByPrimaryKey(pricingId);

		Session session = null;

		try {
			session = openSession();

			Pricing[] array = new PricingImpl[3];

			array[0] = getByCourseId_PrevAndNext(session, pricing, courseId,
					orderByComparator, true);

			array[1] = pricing;

			array[2] = getByCourseId_PrevAndNext(session, pricing, courseId,
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

	protected Pricing getByCourseId_PrevAndNext(Session session,
		Pricing pricing, int courseId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PRICING_WHERE);

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
			query.append(PricingModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(courseId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(pricing);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Pricing> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pricings where courseId = &#63; from the database.
	 *
	 * @param courseId the course ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCourseId(int courseId) throws SystemException {
		for (Pricing pricing : findByCourseId(courseId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(pricing);
		}
	}

	/**
	 * Returns the number of pricings where courseId = &#63;.
	 *
	 * @param courseId the course ID
	 * @return the number of matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCourseId(int courseId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COURSEID;

		Object[] finderArgs = new Object[] { courseId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PRICING_WHERE);

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

	private static final String _FINDER_COLUMN_COURSEID_COURSEID_2 = "pricing.courseId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LOCATIONID =
		new FinderPath(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingModelImpl.FINDER_CACHE_ENABLED, PricingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLocationId",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATIONID =
		new FinderPath(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingModelImpl.FINDER_CACHE_ENABLED, PricingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLocationId",
			new String[] { Integer.class.getName() },
			PricingModelImpl.LOCATIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOCATIONID = new FinderPath(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLocationId",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the pricings where locationId = &#63;.
	 *
	 * @param locationId the location ID
	 * @return the matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pricing> findByLocationId(int locationId)
		throws SystemException {
		return findByLocationId(locationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pricings where locationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param locationId the location ID
	 * @param start the lower bound of the range of pricings
	 * @param end the upper bound of the range of pricings (not inclusive)
	 * @return the range of matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pricing> findByLocationId(int locationId, int start, int end)
		throws SystemException {
		return findByLocationId(locationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the pricings where locationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param locationId the location ID
	 * @param start the lower bound of the range of pricings
	 * @param end the upper bound of the range of pricings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pricing> findByLocationId(int locationId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
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

		List<Pricing> list = (List<Pricing>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Pricing pricing : list) {
				if ((locationId != pricing.getLocationId())) {
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

			query.append(_SQL_SELECT_PRICING_WHERE);

			query.append(_FINDER_COLUMN_LOCATIONID_LOCATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PricingModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(locationId);

				if (!pagination) {
					list = (List<Pricing>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Pricing>(list);
				}
				else {
					list = (List<Pricing>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first pricing in the ordered set where locationId = &#63;.
	 *
	 * @param locationId the location ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pricing
	 * @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing findByLocationId_First(int locationId,
		OrderByComparator orderByComparator)
		throws NoSuchPricingException, SystemException {
		Pricing pricing = fetchByLocationId_First(locationId, orderByComparator);

		if (pricing != null) {
			return pricing;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("locationId=");
		msg.append(locationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPricingException(msg.toString());
	}

	/**
	 * Returns the first pricing in the ordered set where locationId = &#63;.
	 *
	 * @param locationId the location ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pricing, or <code>null</code> if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing fetchByLocationId_First(int locationId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Pricing> list = findByLocationId(locationId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last pricing in the ordered set where locationId = &#63;.
	 *
	 * @param locationId the location ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pricing
	 * @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing findByLocationId_Last(int locationId,
		OrderByComparator orderByComparator)
		throws NoSuchPricingException, SystemException {
		Pricing pricing = fetchByLocationId_Last(locationId, orderByComparator);

		if (pricing != null) {
			return pricing;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("locationId=");
		msg.append(locationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPricingException(msg.toString());
	}

	/**
	 * Returns the last pricing in the ordered set where locationId = &#63;.
	 *
	 * @param locationId the location ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pricing, or <code>null</code> if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing fetchByLocationId_Last(int locationId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByLocationId(locationId);

		if (count == 0) {
			return null;
		}

		List<Pricing> list = findByLocationId(locationId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the pricings before and after the current pricing in the ordered set where locationId = &#63;.
	 *
	 * @param pricingId the primary key of the current pricing
	 * @param locationId the location ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pricing
	 * @throws com.ocms.course.NoSuchPricingException if a pricing with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing[] findByLocationId_PrevAndNext(long pricingId,
		int locationId, OrderByComparator orderByComparator)
		throws NoSuchPricingException, SystemException {
		Pricing pricing = findByPrimaryKey(pricingId);

		Session session = null;

		try {
			session = openSession();

			Pricing[] array = new PricingImpl[3];

			array[0] = getByLocationId_PrevAndNext(session, pricing,
					locationId, orderByComparator, true);

			array[1] = pricing;

			array[2] = getByLocationId_PrevAndNext(session, pricing,
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

	protected Pricing getByLocationId_PrevAndNext(Session session,
		Pricing pricing, int locationId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PRICING_WHERE);

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
			query.append(PricingModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(locationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(pricing);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Pricing> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pricings where locationId = &#63; from the database.
	 *
	 * @param locationId the location ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByLocationId(int locationId) throws SystemException {
		for (Pricing pricing : findByLocationId(locationId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(pricing);
		}
	}

	/**
	 * Returns the number of pricings where locationId = &#63;.
	 *
	 * @param locationId the location ID
	 * @return the number of matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByLocationId(int locationId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LOCATIONID;

		Object[] finderArgs = new Object[] { locationId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PRICING_WHERE);

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

	private static final String _FINDER_COLUMN_LOCATIONID_LOCATIONID_2 = "pricing.locationId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRICE = new FinderPath(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingModelImpl.FINDER_CACHE_ENABLED, PricingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPrice",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRICE = new FinderPath(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingModelImpl.FINDER_CACHE_ENABLED, PricingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPrice",
			new String[] { Integer.class.getName() },
			PricingModelImpl.PRICE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRICE = new FinderPath(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPrice",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the pricings where price = &#63;.
	 *
	 * @param price the price
	 * @return the matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pricing> findByPrice(int price) throws SystemException {
		return findByPrice(price, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pricings where price = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param price the price
	 * @param start the lower bound of the range of pricings
	 * @param end the upper bound of the range of pricings (not inclusive)
	 * @return the range of matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pricing> findByPrice(int price, int start, int end)
		throws SystemException {
		return findByPrice(price, start, end, null);
	}

	/**
	 * Returns an ordered range of all the pricings where price = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param price the price
	 * @param start the lower bound of the range of pricings
	 * @param end the upper bound of the range of pricings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pricing> findByPrice(int price, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRICE;
			finderArgs = new Object[] { price };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRICE;
			finderArgs = new Object[] { price, start, end, orderByComparator };
		}

		List<Pricing> list = (List<Pricing>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Pricing pricing : list) {
				if ((price != pricing.getPrice())) {
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

			query.append(_SQL_SELECT_PRICING_WHERE);

			query.append(_FINDER_COLUMN_PRICE_PRICE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PricingModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(price);

				if (!pagination) {
					list = (List<Pricing>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Pricing>(list);
				}
				else {
					list = (List<Pricing>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first pricing in the ordered set where price = &#63;.
	 *
	 * @param price the price
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pricing
	 * @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing findByPrice_First(int price,
		OrderByComparator orderByComparator)
		throws NoSuchPricingException, SystemException {
		Pricing pricing = fetchByPrice_First(price, orderByComparator);

		if (pricing != null) {
			return pricing;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("price=");
		msg.append(price);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPricingException(msg.toString());
	}

	/**
	 * Returns the first pricing in the ordered set where price = &#63;.
	 *
	 * @param price the price
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pricing, or <code>null</code> if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing fetchByPrice_First(int price,
		OrderByComparator orderByComparator) throws SystemException {
		List<Pricing> list = findByPrice(price, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last pricing in the ordered set where price = &#63;.
	 *
	 * @param price the price
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pricing
	 * @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing findByPrice_Last(int price,
		OrderByComparator orderByComparator)
		throws NoSuchPricingException, SystemException {
		Pricing pricing = fetchByPrice_Last(price, orderByComparator);

		if (pricing != null) {
			return pricing;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("price=");
		msg.append(price);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPricingException(msg.toString());
	}

	/**
	 * Returns the last pricing in the ordered set where price = &#63;.
	 *
	 * @param price the price
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pricing, or <code>null</code> if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing fetchByPrice_Last(int price,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPrice(price);

		if (count == 0) {
			return null;
		}

		List<Pricing> list = findByPrice(price, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the pricings before and after the current pricing in the ordered set where price = &#63;.
	 *
	 * @param pricingId the primary key of the current pricing
	 * @param price the price
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pricing
	 * @throws com.ocms.course.NoSuchPricingException if a pricing with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing[] findByPrice_PrevAndNext(long pricingId, int price,
		OrderByComparator orderByComparator)
		throws NoSuchPricingException, SystemException {
		Pricing pricing = findByPrimaryKey(pricingId);

		Session session = null;

		try {
			session = openSession();

			Pricing[] array = new PricingImpl[3];

			array[0] = getByPrice_PrevAndNext(session, pricing, price,
					orderByComparator, true);

			array[1] = pricing;

			array[2] = getByPrice_PrevAndNext(session, pricing, price,
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

	protected Pricing getByPrice_PrevAndNext(Session session, Pricing pricing,
		int price, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PRICING_WHERE);

		query.append(_FINDER_COLUMN_PRICE_PRICE_2);

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
			query.append(PricingModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(price);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(pricing);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Pricing> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pricings where price = &#63; from the database.
	 *
	 * @param price the price
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPrice(int price) throws SystemException {
		for (Pricing pricing : findByPrice(price, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(pricing);
		}
	}

	/**
	 * Returns the number of pricings where price = &#63;.
	 *
	 * @param price the price
	 * @return the number of matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPrice(int price) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRICE;

		Object[] finderArgs = new Object[] { price };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PRICING_WHERE);

			query.append(_FINDER_COLUMN_PRICE_PRICE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(price);

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

	private static final String _FINDER_COLUMN_PRICE_PRICE_2 = "pricing.price = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PACKAGEANDLOCATION =
		new FinderPath(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingModelImpl.FINDER_CACHE_ENABLED, PricingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPackageAndLocation",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGEANDLOCATION =
		new FinderPath(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingModelImpl.FINDER_CACHE_ENABLED, PricingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByPackageAndLocation",
			new String[] { Integer.class.getName(), Integer.class.getName() },
			PricingModelImpl.PACKAGEID_COLUMN_BITMASK |
			PricingModelImpl.LOCATIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PACKAGEANDLOCATION = new FinderPath(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPackageAndLocation",
			new String[] { Integer.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the pricings where packageId = &#63; and locationId = &#63;.
	 *
	 * @param packageId the package ID
	 * @param locationId the location ID
	 * @return the matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pricing> findByPackageAndLocation(int packageId, int locationId)
		throws SystemException {
		return findByPackageAndLocation(packageId, locationId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pricings where packageId = &#63; and locationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param packageId the package ID
	 * @param locationId the location ID
	 * @param start the lower bound of the range of pricings
	 * @param end the upper bound of the range of pricings (not inclusive)
	 * @return the range of matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pricing> findByPackageAndLocation(int packageId,
		int locationId, int start, int end) throws SystemException {
		return findByPackageAndLocation(packageId, locationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the pricings where packageId = &#63; and locationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param packageId the package ID
	 * @param locationId the location ID
	 * @param start the lower bound of the range of pricings
	 * @param end the upper bound of the range of pricings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pricing> findByPackageAndLocation(int packageId,
		int locationId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGEANDLOCATION;
			finderArgs = new Object[] { packageId, locationId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PACKAGEANDLOCATION;
			finderArgs = new Object[] {
					packageId, locationId,
					
					start, end, orderByComparator
				};
		}

		List<Pricing> list = (List<Pricing>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Pricing pricing : list) {
				if ((packageId != pricing.getPackageId()) ||
						(locationId != pricing.getLocationId())) {
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

			query.append(_SQL_SELECT_PRICING_WHERE);

			query.append(_FINDER_COLUMN_PACKAGEANDLOCATION_PACKAGEID_2);

			query.append(_FINDER_COLUMN_PACKAGEANDLOCATION_LOCATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PricingModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(packageId);

				qPos.add(locationId);

				if (!pagination) {
					list = (List<Pricing>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Pricing>(list);
				}
				else {
					list = (List<Pricing>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first pricing in the ordered set where packageId = &#63; and locationId = &#63;.
	 *
	 * @param packageId the package ID
	 * @param locationId the location ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pricing
	 * @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing findByPackageAndLocation_First(int packageId,
		int locationId, OrderByComparator orderByComparator)
		throws NoSuchPricingException, SystemException {
		Pricing pricing = fetchByPackageAndLocation_First(packageId,
				locationId, orderByComparator);

		if (pricing != null) {
			return pricing;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("packageId=");
		msg.append(packageId);

		msg.append(", locationId=");
		msg.append(locationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPricingException(msg.toString());
	}

	/**
	 * Returns the first pricing in the ordered set where packageId = &#63; and locationId = &#63;.
	 *
	 * @param packageId the package ID
	 * @param locationId the location ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pricing, or <code>null</code> if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing fetchByPackageAndLocation_First(int packageId,
		int locationId, OrderByComparator orderByComparator)
		throws SystemException {
		List<Pricing> list = findByPackageAndLocation(packageId, locationId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last pricing in the ordered set where packageId = &#63; and locationId = &#63;.
	 *
	 * @param packageId the package ID
	 * @param locationId the location ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pricing
	 * @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing findByPackageAndLocation_Last(int packageId, int locationId,
		OrderByComparator orderByComparator)
		throws NoSuchPricingException, SystemException {
		Pricing pricing = fetchByPackageAndLocation_Last(packageId, locationId,
				orderByComparator);

		if (pricing != null) {
			return pricing;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("packageId=");
		msg.append(packageId);

		msg.append(", locationId=");
		msg.append(locationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPricingException(msg.toString());
	}

	/**
	 * Returns the last pricing in the ordered set where packageId = &#63; and locationId = &#63;.
	 *
	 * @param packageId the package ID
	 * @param locationId the location ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pricing, or <code>null</code> if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing fetchByPackageAndLocation_Last(int packageId,
		int locationId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByPackageAndLocation(packageId, locationId);

		if (count == 0) {
			return null;
		}

		List<Pricing> list = findByPackageAndLocation(packageId, locationId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the pricings before and after the current pricing in the ordered set where packageId = &#63; and locationId = &#63;.
	 *
	 * @param pricingId the primary key of the current pricing
	 * @param packageId the package ID
	 * @param locationId the location ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pricing
	 * @throws com.ocms.course.NoSuchPricingException if a pricing with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing[] findByPackageAndLocation_PrevAndNext(long pricingId,
		int packageId, int locationId, OrderByComparator orderByComparator)
		throws NoSuchPricingException, SystemException {
		Pricing pricing = findByPrimaryKey(pricingId);

		Session session = null;

		try {
			session = openSession();

			Pricing[] array = new PricingImpl[3];

			array[0] = getByPackageAndLocation_PrevAndNext(session, pricing,
					packageId, locationId, orderByComparator, true);

			array[1] = pricing;

			array[2] = getByPackageAndLocation_PrevAndNext(session, pricing,
					packageId, locationId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Pricing getByPackageAndLocation_PrevAndNext(Session session,
		Pricing pricing, int packageId, int locationId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PRICING_WHERE);

		query.append(_FINDER_COLUMN_PACKAGEANDLOCATION_PACKAGEID_2);

		query.append(_FINDER_COLUMN_PACKAGEANDLOCATION_LOCATIONID_2);

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
			query.append(PricingModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(packageId);

		qPos.add(locationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(pricing);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Pricing> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pricings where packageId = &#63; and locationId = &#63; from the database.
	 *
	 * @param packageId the package ID
	 * @param locationId the location ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPackageAndLocation(int packageId, int locationId)
		throws SystemException {
		for (Pricing pricing : findByPackageAndLocation(packageId, locationId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(pricing);
		}
	}

	/**
	 * Returns the number of pricings where packageId = &#63; and locationId = &#63;.
	 *
	 * @param packageId the package ID
	 * @param locationId the location ID
	 * @return the number of matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPackageAndLocation(int packageId, int locationId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PACKAGEANDLOCATION;

		Object[] finderArgs = new Object[] { packageId, locationId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PRICING_WHERE);

			query.append(_FINDER_COLUMN_PACKAGEANDLOCATION_PACKAGEID_2);

			query.append(_FINDER_COLUMN_PACKAGEANDLOCATION_LOCATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(packageId);

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

	private static final String _FINDER_COLUMN_PACKAGEANDLOCATION_PACKAGEID_2 = "pricing.packageId = ? AND ";
	private static final String _FINDER_COLUMN_PACKAGEANDLOCATION_LOCATIONID_2 = "pricing.locationId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PACKAGELOCATIONACTIVE =
		new FinderPath(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingModelImpl.FINDER_CACHE_ENABLED, PricingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByPackageLocationActive",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGELOCATIONACTIVE =
		new FinderPath(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingModelImpl.FINDER_CACHE_ENABLED, PricingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByPackageLocationActive",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			PricingModelImpl.PACKAGEID_COLUMN_BITMASK |
			PricingModelImpl.LOCATIONID_COLUMN_BITMASK |
			PricingModelImpl.ACTIVE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PACKAGELOCATIONACTIVE = new FinderPath(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPackageLocationActive",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the pricings where packageId = &#63; and locationId = &#63; and active = &#63;.
	 *
	 * @param packageId the package ID
	 * @param locationId the location ID
	 * @param active the active
	 * @return the matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pricing> findByPackageLocationActive(int packageId,
		int locationId, int active) throws SystemException {
		return findByPackageLocationActive(packageId, locationId, active,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pricings where packageId = &#63; and locationId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param packageId the package ID
	 * @param locationId the location ID
	 * @param active the active
	 * @param start the lower bound of the range of pricings
	 * @param end the upper bound of the range of pricings (not inclusive)
	 * @return the range of matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pricing> findByPackageLocationActive(int packageId,
		int locationId, int active, int start, int end)
		throws SystemException {
		return findByPackageLocationActive(packageId, locationId, active,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the pricings where packageId = &#63; and locationId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param packageId the package ID
	 * @param locationId the location ID
	 * @param active the active
	 * @param start the lower bound of the range of pricings
	 * @param end the upper bound of the range of pricings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pricing> findByPackageLocationActive(int packageId,
		int locationId, int active, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGELOCATIONACTIVE;
			finderArgs = new Object[] { packageId, locationId, active };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PACKAGELOCATIONACTIVE;
			finderArgs = new Object[] {
					packageId, locationId, active,
					
					start, end, orderByComparator
				};
		}

		List<Pricing> list = (List<Pricing>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Pricing pricing : list) {
				if ((packageId != pricing.getPackageId()) ||
						(locationId != pricing.getLocationId()) ||
						(active != pricing.getActive())) {
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

			query.append(_SQL_SELECT_PRICING_WHERE);

			query.append(_FINDER_COLUMN_PACKAGELOCATIONACTIVE_PACKAGEID_2);

			query.append(_FINDER_COLUMN_PACKAGELOCATIONACTIVE_LOCATIONID_2);

			query.append(_FINDER_COLUMN_PACKAGELOCATIONACTIVE_ACTIVE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PricingModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(packageId);

				qPos.add(locationId);

				qPos.add(active);

				if (!pagination) {
					list = (List<Pricing>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Pricing>(list);
				}
				else {
					list = (List<Pricing>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first pricing in the ordered set where packageId = &#63; and locationId = &#63; and active = &#63;.
	 *
	 * @param packageId the package ID
	 * @param locationId the location ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pricing
	 * @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing findByPackageLocationActive_First(int packageId,
		int locationId, int active, OrderByComparator orderByComparator)
		throws NoSuchPricingException, SystemException {
		Pricing pricing = fetchByPackageLocationActive_First(packageId,
				locationId, active, orderByComparator);

		if (pricing != null) {
			return pricing;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("packageId=");
		msg.append(packageId);

		msg.append(", locationId=");
		msg.append(locationId);

		msg.append(", active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPricingException(msg.toString());
	}

	/**
	 * Returns the first pricing in the ordered set where packageId = &#63; and locationId = &#63; and active = &#63;.
	 *
	 * @param packageId the package ID
	 * @param locationId the location ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pricing, or <code>null</code> if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing fetchByPackageLocationActive_First(int packageId,
		int locationId, int active, OrderByComparator orderByComparator)
		throws SystemException {
		List<Pricing> list = findByPackageLocationActive(packageId, locationId,
				active, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last pricing in the ordered set where packageId = &#63; and locationId = &#63; and active = &#63;.
	 *
	 * @param packageId the package ID
	 * @param locationId the location ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pricing
	 * @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing findByPackageLocationActive_Last(int packageId,
		int locationId, int active, OrderByComparator orderByComparator)
		throws NoSuchPricingException, SystemException {
		Pricing pricing = fetchByPackageLocationActive_Last(packageId,
				locationId, active, orderByComparator);

		if (pricing != null) {
			return pricing;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("packageId=");
		msg.append(packageId);

		msg.append(", locationId=");
		msg.append(locationId);

		msg.append(", active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPricingException(msg.toString());
	}

	/**
	 * Returns the last pricing in the ordered set where packageId = &#63; and locationId = &#63; and active = &#63;.
	 *
	 * @param packageId the package ID
	 * @param locationId the location ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pricing, or <code>null</code> if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing fetchByPackageLocationActive_Last(int packageId,
		int locationId, int active, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByPackageLocationActive(packageId, locationId, active);

		if (count == 0) {
			return null;
		}

		List<Pricing> list = findByPackageLocationActive(packageId, locationId,
				active, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the pricings before and after the current pricing in the ordered set where packageId = &#63; and locationId = &#63; and active = &#63;.
	 *
	 * @param pricingId the primary key of the current pricing
	 * @param packageId the package ID
	 * @param locationId the location ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pricing
	 * @throws com.ocms.course.NoSuchPricingException if a pricing with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing[] findByPackageLocationActive_PrevAndNext(long pricingId,
		int packageId, int locationId, int active,
		OrderByComparator orderByComparator)
		throws NoSuchPricingException, SystemException {
		Pricing pricing = findByPrimaryKey(pricingId);

		Session session = null;

		try {
			session = openSession();

			Pricing[] array = new PricingImpl[3];

			array[0] = getByPackageLocationActive_PrevAndNext(session, pricing,
					packageId, locationId, active, orderByComparator, true);

			array[1] = pricing;

			array[2] = getByPackageLocationActive_PrevAndNext(session, pricing,
					packageId, locationId, active, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Pricing getByPackageLocationActive_PrevAndNext(Session session,
		Pricing pricing, int packageId, int locationId, int active,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PRICING_WHERE);

		query.append(_FINDER_COLUMN_PACKAGELOCATIONACTIVE_PACKAGEID_2);

		query.append(_FINDER_COLUMN_PACKAGELOCATIONACTIVE_LOCATIONID_2);

		query.append(_FINDER_COLUMN_PACKAGELOCATIONACTIVE_ACTIVE_2);

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
			query.append(PricingModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(packageId);

		qPos.add(locationId);

		qPos.add(active);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(pricing);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Pricing> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pricings where packageId = &#63; and locationId = &#63; and active = &#63; from the database.
	 *
	 * @param packageId the package ID
	 * @param locationId the location ID
	 * @param active the active
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPackageLocationActive(int packageId, int locationId,
		int active) throws SystemException {
		for (Pricing pricing : findByPackageLocationActive(packageId,
				locationId, active, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(pricing);
		}
	}

	/**
	 * Returns the number of pricings where packageId = &#63; and locationId = &#63; and active = &#63;.
	 *
	 * @param packageId the package ID
	 * @param locationId the location ID
	 * @param active the active
	 * @return the number of matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPackageLocationActive(int packageId, int locationId,
		int active) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PACKAGELOCATIONACTIVE;

		Object[] finderArgs = new Object[] { packageId, locationId, active };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_PRICING_WHERE);

			query.append(_FINDER_COLUMN_PACKAGELOCATIONACTIVE_PACKAGEID_2);

			query.append(_FINDER_COLUMN_PACKAGELOCATIONACTIVE_LOCATIONID_2);

			query.append(_FINDER_COLUMN_PACKAGELOCATIONACTIVE_ACTIVE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(packageId);

				qPos.add(locationId);

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

	private static final String _FINDER_COLUMN_PACKAGELOCATIONACTIVE_PACKAGEID_2 =
		"pricing.packageId = ? AND ";
	private static final String _FINDER_COLUMN_PACKAGELOCATIONACTIVE_LOCATIONID_2 =
		"pricing.locationId = ? AND ";
	private static final String _FINDER_COLUMN_PACKAGELOCATIONACTIVE_ACTIVE_2 = "pricing.active = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PACKAGEANDACTIVE =
		new FinderPath(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingModelImpl.FINDER_CACHE_ENABLED, PricingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPackageAndActive",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGEANDACTIVE =
		new FinderPath(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingModelImpl.FINDER_CACHE_ENABLED, PricingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByPackageAndActive",
			new String[] { Integer.class.getName(), Integer.class.getName() },
			PricingModelImpl.PACKAGEID_COLUMN_BITMASK |
			PricingModelImpl.ACTIVE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PACKAGEANDACTIVE = new FinderPath(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPackageAndActive",
			new String[] { Integer.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the pricings where packageId = &#63; and active = &#63;.
	 *
	 * @param packageId the package ID
	 * @param active the active
	 * @return the matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pricing> findByPackageAndActive(int packageId, int active)
		throws SystemException {
		return findByPackageAndActive(packageId, active, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pricings where packageId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param packageId the package ID
	 * @param active the active
	 * @param start the lower bound of the range of pricings
	 * @param end the upper bound of the range of pricings (not inclusive)
	 * @return the range of matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pricing> findByPackageAndActive(int packageId, int active,
		int start, int end) throws SystemException {
		return findByPackageAndActive(packageId, active, start, end, null);
	}

	/**
	 * Returns an ordered range of all the pricings where packageId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param packageId the package ID
	 * @param active the active
	 * @param start the lower bound of the range of pricings
	 * @param end the upper bound of the range of pricings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pricing> findByPackageAndActive(int packageId, int active,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGEANDACTIVE;
			finderArgs = new Object[] { packageId, active };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PACKAGEANDACTIVE;
			finderArgs = new Object[] {
					packageId, active,
					
					start, end, orderByComparator
				};
		}

		List<Pricing> list = (List<Pricing>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Pricing pricing : list) {
				if ((packageId != pricing.getPackageId()) ||
						(active != pricing.getActive())) {
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

			query.append(_SQL_SELECT_PRICING_WHERE);

			query.append(_FINDER_COLUMN_PACKAGEANDACTIVE_PACKAGEID_2);

			query.append(_FINDER_COLUMN_PACKAGEANDACTIVE_ACTIVE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PricingModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(packageId);

				qPos.add(active);

				if (!pagination) {
					list = (List<Pricing>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Pricing>(list);
				}
				else {
					list = (List<Pricing>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first pricing in the ordered set where packageId = &#63; and active = &#63;.
	 *
	 * @param packageId the package ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pricing
	 * @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing findByPackageAndActive_First(int packageId, int active,
		OrderByComparator orderByComparator)
		throws NoSuchPricingException, SystemException {
		Pricing pricing = fetchByPackageAndActive_First(packageId, active,
				orderByComparator);

		if (pricing != null) {
			return pricing;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("packageId=");
		msg.append(packageId);

		msg.append(", active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPricingException(msg.toString());
	}

	/**
	 * Returns the first pricing in the ordered set where packageId = &#63; and active = &#63;.
	 *
	 * @param packageId the package ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pricing, or <code>null</code> if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing fetchByPackageAndActive_First(int packageId, int active,
		OrderByComparator orderByComparator) throws SystemException {
		List<Pricing> list = findByPackageAndActive(packageId, active, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last pricing in the ordered set where packageId = &#63; and active = &#63;.
	 *
	 * @param packageId the package ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pricing
	 * @throws com.ocms.course.NoSuchPricingException if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing findByPackageAndActive_Last(int packageId, int active,
		OrderByComparator orderByComparator)
		throws NoSuchPricingException, SystemException {
		Pricing pricing = fetchByPackageAndActive_Last(packageId, active,
				orderByComparator);

		if (pricing != null) {
			return pricing;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("packageId=");
		msg.append(packageId);

		msg.append(", active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPricingException(msg.toString());
	}

	/**
	 * Returns the last pricing in the ordered set where packageId = &#63; and active = &#63;.
	 *
	 * @param packageId the package ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pricing, or <code>null</code> if a matching pricing could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing fetchByPackageAndActive_Last(int packageId, int active,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPackageAndActive(packageId, active);

		if (count == 0) {
			return null;
		}

		List<Pricing> list = findByPackageAndActive(packageId, active,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the pricings before and after the current pricing in the ordered set where packageId = &#63; and active = &#63;.
	 *
	 * @param pricingId the primary key of the current pricing
	 * @param packageId the package ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pricing
	 * @throws com.ocms.course.NoSuchPricingException if a pricing with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing[] findByPackageAndActive_PrevAndNext(long pricingId,
		int packageId, int active, OrderByComparator orderByComparator)
		throws NoSuchPricingException, SystemException {
		Pricing pricing = findByPrimaryKey(pricingId);

		Session session = null;

		try {
			session = openSession();

			Pricing[] array = new PricingImpl[3];

			array[0] = getByPackageAndActive_PrevAndNext(session, pricing,
					packageId, active, orderByComparator, true);

			array[1] = pricing;

			array[2] = getByPackageAndActive_PrevAndNext(session, pricing,
					packageId, active, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Pricing getByPackageAndActive_PrevAndNext(Session session,
		Pricing pricing, int packageId, int active,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PRICING_WHERE);

		query.append(_FINDER_COLUMN_PACKAGEANDACTIVE_PACKAGEID_2);

		query.append(_FINDER_COLUMN_PACKAGEANDACTIVE_ACTIVE_2);

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
			query.append(PricingModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(packageId);

		qPos.add(active);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(pricing);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Pricing> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pricings where packageId = &#63; and active = &#63; from the database.
	 *
	 * @param packageId the package ID
	 * @param active the active
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPackageAndActive(int packageId, int active)
		throws SystemException {
		for (Pricing pricing : findByPackageAndActive(packageId, active,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(pricing);
		}
	}

	/**
	 * Returns the number of pricings where packageId = &#63; and active = &#63;.
	 *
	 * @param packageId the package ID
	 * @param active the active
	 * @return the number of matching pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPackageAndActive(int packageId, int active)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PACKAGEANDACTIVE;

		Object[] finderArgs = new Object[] { packageId, active };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PRICING_WHERE);

			query.append(_FINDER_COLUMN_PACKAGEANDACTIVE_PACKAGEID_2);

			query.append(_FINDER_COLUMN_PACKAGEANDACTIVE_ACTIVE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(packageId);

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

	private static final String _FINDER_COLUMN_PACKAGEANDACTIVE_PACKAGEID_2 = "pricing.packageId = ? AND ";
	private static final String _FINDER_COLUMN_PACKAGEANDACTIVE_ACTIVE_2 = "pricing.active = ?";

	public PricingPersistenceImpl() {
		setModelClass(Pricing.class);
	}

	/**
	 * Caches the pricing in the entity cache if it is enabled.
	 *
	 * @param pricing the pricing
	 */
	@Override
	public void cacheResult(Pricing pricing) {
		EntityCacheUtil.putResult(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingImpl.class, pricing.getPrimaryKey(), pricing);

		pricing.resetOriginalValues();
	}

	/**
	 * Caches the pricings in the entity cache if it is enabled.
	 *
	 * @param pricings the pricings
	 */
	@Override
	public void cacheResult(List<Pricing> pricings) {
		for (Pricing pricing : pricings) {
			if (EntityCacheUtil.getResult(
						PricingModelImpl.ENTITY_CACHE_ENABLED,
						PricingImpl.class, pricing.getPrimaryKey()) == null) {
				cacheResult(pricing);
			}
			else {
				pricing.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all pricings.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PricingImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PricingImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the pricing.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Pricing pricing) {
		EntityCacheUtil.removeResult(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingImpl.class, pricing.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Pricing> pricings) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Pricing pricing : pricings) {
			EntityCacheUtil.removeResult(PricingModelImpl.ENTITY_CACHE_ENABLED,
				PricingImpl.class, pricing.getPrimaryKey());
		}
	}

	/**
	 * Creates a new pricing with the primary key. Does not add the pricing to the database.
	 *
	 * @param pricingId the primary key for the new pricing
	 * @return the new pricing
	 */
	@Override
	public Pricing create(long pricingId) {
		Pricing pricing = new PricingImpl();

		pricing.setNew(true);
		pricing.setPrimaryKey(pricingId);

		return pricing;
	}

	/**
	 * Removes the pricing with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pricingId the primary key of the pricing
	 * @return the pricing that was removed
	 * @throws com.ocms.course.NoSuchPricingException if a pricing with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing remove(long pricingId)
		throws NoSuchPricingException, SystemException {
		return remove((Serializable)pricingId);
	}

	/**
	 * Removes the pricing with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the pricing
	 * @return the pricing that was removed
	 * @throws com.ocms.course.NoSuchPricingException if a pricing with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing remove(Serializable primaryKey)
		throws NoSuchPricingException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Pricing pricing = (Pricing)session.get(PricingImpl.class, primaryKey);

			if (pricing == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPricingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(pricing);
		}
		catch (NoSuchPricingException nsee) {
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
	protected Pricing removeImpl(Pricing pricing) throws SystemException {
		pricing = toUnwrappedModel(pricing);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pricing)) {
				pricing = (Pricing)session.get(PricingImpl.class,
						pricing.getPrimaryKeyObj());
			}

			if (pricing != null) {
				session.delete(pricing);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (pricing != null) {
			clearCache(pricing);
		}

		return pricing;
	}

	@Override
	public Pricing updateImpl(com.ocms.course.model.Pricing pricing)
		throws SystemException {
		pricing = toUnwrappedModel(pricing);

		boolean isNew = pricing.isNew();

		PricingModelImpl pricingModelImpl = (PricingModelImpl)pricing;

		Session session = null;

		try {
			session = openSession();

			if (pricing.isNew()) {
				session.save(pricing);

				pricing.setNew(false);
			}
			else {
				session.merge(pricing);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !PricingModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((pricingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						pricingModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { pricingModelImpl.getGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((pricingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRICINGID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						pricingModelImpl.getOriginalPricingId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRICINGID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRICINGID,
					args);

				args = new Object[] { pricingModelImpl.getPricingId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRICINGID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRICINGID,
					args);
			}

			if ((pricingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						pricingModelImpl.getOriginalPackageId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PACKAGEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGEID,
					args);

				args = new Object[] { pricingModelImpl.getPackageId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PACKAGEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGEID,
					args);
			}

			if ((pricingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						pricingModelImpl.getOriginalCourseId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COURSEID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSEID,
					args);

				args = new Object[] { pricingModelImpl.getCourseId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COURSEID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COURSEID,
					args);
			}

			if ((pricingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						pricingModelImpl.getOriginalLocationId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOCATIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATIONID,
					args);

				args = new Object[] { pricingModelImpl.getLocationId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOCATIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATIONID,
					args);
			}

			if ((pricingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRICE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { pricingModelImpl.getOriginalPrice() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRICE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRICE,
					args);

				args = new Object[] { pricingModelImpl.getPrice() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRICE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRICE,
					args);
			}

			if ((pricingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGEANDLOCATION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						pricingModelImpl.getOriginalPackageId(),
						pricingModelImpl.getOriginalLocationId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PACKAGEANDLOCATION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGEANDLOCATION,
					args);

				args = new Object[] {
						pricingModelImpl.getPackageId(),
						pricingModelImpl.getLocationId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PACKAGEANDLOCATION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGEANDLOCATION,
					args);
			}

			if ((pricingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGELOCATIONACTIVE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						pricingModelImpl.getOriginalPackageId(),
						pricingModelImpl.getOriginalLocationId(),
						pricingModelImpl.getOriginalActive()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PACKAGELOCATIONACTIVE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGELOCATIONACTIVE,
					args);

				args = new Object[] {
						pricingModelImpl.getPackageId(),
						pricingModelImpl.getLocationId(),
						pricingModelImpl.getActive()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PACKAGELOCATIONACTIVE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGELOCATIONACTIVE,
					args);
			}

			if ((pricingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGEANDACTIVE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						pricingModelImpl.getOriginalPackageId(),
						pricingModelImpl.getOriginalActive()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PACKAGEANDACTIVE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGEANDACTIVE,
					args);

				args = new Object[] {
						pricingModelImpl.getPackageId(),
						pricingModelImpl.getActive()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PACKAGEANDACTIVE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PACKAGEANDACTIVE,
					args);
			}
		}

		EntityCacheUtil.putResult(PricingModelImpl.ENTITY_CACHE_ENABLED,
			PricingImpl.class, pricing.getPrimaryKey(), pricing);

		return pricing;
	}

	protected Pricing toUnwrappedModel(Pricing pricing) {
		if (pricing instanceof PricingImpl) {
			return pricing;
		}

		PricingImpl pricingImpl = new PricingImpl();

		pricingImpl.setNew(pricing.isNew());
		pricingImpl.setPrimaryKey(pricing.getPrimaryKey());

		pricingImpl.setPricingId(pricing.getPricingId());
		pricingImpl.setGroupId(pricing.getGroupId());
		pricingImpl.setCompanyId(pricing.getCompanyId());
		pricingImpl.setUserId(pricing.getUserId());
		pricingImpl.setUserName(pricing.getUserName());
		pricingImpl.setCreateDate(pricing.getCreateDate());
		pricingImpl.setModifiedDate(pricing.getModifiedDate());
		pricingImpl.setLocationId(pricing.getLocationId());
		pricingImpl.setCourseId(pricing.getCourseId());
		pricingImpl.setPackageId(pricing.getPackageId());
		pricingImpl.setDeposit(pricing.getDeposit());
		pricingImpl.setPrice(pricing.getPrice());
		pricingImpl.setCurrency(pricing.getCurrency());
		pricingImpl.setEffectiveFromDate(pricing.getEffectiveFromDate());
		pricingImpl.setCourseCode(pricing.getCourseCode());
		pricingImpl.setLocationCode(pricing.getLocationCode());
		pricingImpl.setEffectiveToDate(pricing.getEffectiveToDate());
		pricingImpl.setActive(pricing.getActive());
		pricingImpl.setBalanceDueParDate(pricing.getBalanceDueParDate());

		return pricingImpl;
	}

	/**
	 * Returns the pricing with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the pricing
	 * @return the pricing
	 * @throws com.ocms.course.NoSuchPricingException if a pricing with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPricingException, SystemException {
		Pricing pricing = fetchByPrimaryKey(primaryKey);

		if (pricing == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPricingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return pricing;
	}

	/**
	 * Returns the pricing with the primary key or throws a {@link com.ocms.course.NoSuchPricingException} if it could not be found.
	 *
	 * @param pricingId the primary key of the pricing
	 * @return the pricing
	 * @throws com.ocms.course.NoSuchPricingException if a pricing with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing findByPrimaryKey(long pricingId)
		throws NoSuchPricingException, SystemException {
		return findByPrimaryKey((Serializable)pricingId);
	}

	/**
	 * Returns the pricing with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the pricing
	 * @return the pricing, or <code>null</code> if a pricing with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Pricing pricing = (Pricing)EntityCacheUtil.getResult(PricingModelImpl.ENTITY_CACHE_ENABLED,
				PricingImpl.class, primaryKey);

		if (pricing == _nullPricing) {
			return null;
		}

		if (pricing == null) {
			Session session = null;

			try {
				session = openSession();

				pricing = (Pricing)session.get(PricingImpl.class, primaryKey);

				if (pricing != null) {
					cacheResult(pricing);
				}
				else {
					EntityCacheUtil.putResult(PricingModelImpl.ENTITY_CACHE_ENABLED,
						PricingImpl.class, primaryKey, _nullPricing);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PricingModelImpl.ENTITY_CACHE_ENABLED,
					PricingImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return pricing;
	}

	/**
	 * Returns the pricing with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pricingId the primary key of the pricing
	 * @return the pricing, or <code>null</code> if a pricing with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Pricing fetchByPrimaryKey(long pricingId) throws SystemException {
		return fetchByPrimaryKey((Serializable)pricingId);
	}

	/**
	 * Returns all the pricings.
	 *
	 * @return the pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pricing> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pricings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of pricings
	 * @param end the upper bound of the range of pricings (not inclusive)
	 * @return the range of pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pricing> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the pricings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.PricingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of pricings
	 * @param end the upper bound of the range of pricings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pricings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Pricing> findAll(int start, int end,
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

		List<Pricing> list = (List<Pricing>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PRICING);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PRICING;

				if (pagination) {
					sql = sql.concat(PricingModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Pricing>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Pricing>(list);
				}
				else {
					list = (List<Pricing>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the pricings from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Pricing pricing : findAll()) {
			remove(pricing);
		}
	}

	/**
	 * Returns the number of pricings.
	 *
	 * @return the number of pricings
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

				Query q = session.createQuery(_SQL_COUNT_PRICING);

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
	 * Initializes the pricing persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ocms.course.model.Pricing")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Pricing>> listenersList = new ArrayList<ModelListener<Pricing>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Pricing>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PricingImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PRICING = "SELECT pricing FROM Pricing pricing";
	private static final String _SQL_SELECT_PRICING_WHERE = "SELECT pricing FROM Pricing pricing WHERE ";
	private static final String _SQL_COUNT_PRICING = "SELECT COUNT(pricing) FROM Pricing pricing";
	private static final String _SQL_COUNT_PRICING_WHERE = "SELECT COUNT(pricing) FROM Pricing pricing WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "pricing.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Pricing exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Pricing exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PricingPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"currency", "active"
			});
	private static Pricing _nullPricing = new PricingImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Pricing> toCacheModel() {
				return _nullPricingCacheModel;
			}
		};

	private static CacheModel<Pricing> _nullPricingCacheModel = new CacheModel<Pricing>() {
			@Override
			public Pricing toEntityModel() {
				return _nullPricing;
			}
		};
}