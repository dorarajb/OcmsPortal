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

import com.ocms.course.NoSuchTaxDetailsException;
import com.ocms.course.model.TaxDetails;
import com.ocms.course.model.impl.TaxDetailsImpl;
import com.ocms.course.model.impl.TaxDetailsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tax details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author doraraj
 * @see TaxDetailsPersistence
 * @see TaxDetailsUtil
 * @generated
 */
public class TaxDetailsPersistenceImpl extends BasePersistenceImpl<TaxDetails>
	implements TaxDetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TaxDetailsUtil} to access the tax details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TaxDetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaxDetailsModelImpl.FINDER_CACHE_ENABLED, TaxDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaxDetailsModelImpl.FINDER_CACHE_ENABLED, TaxDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaxDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaxDetailsModelImpl.FINDER_CACHE_ENABLED, TaxDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaxDetailsModelImpl.FINDER_CACHE_ENABLED, TaxDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			TaxDetailsModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaxDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the tax detailses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching tax detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxDetails> findByGroupId(long groupId)
		throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tax detailses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of tax detailses
	 * @param end the upper bound of the range of tax detailses (not inclusive)
	 * @return the range of matching tax detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxDetails> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tax detailses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of tax detailses
	 * @param end the upper bound of the range of tax detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tax detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxDetails> findByGroupId(long groupId, int start, int end,
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

		List<TaxDetails> list = (List<TaxDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TaxDetails taxDetails : list) {
				if ((groupId != taxDetails.getGroupId())) {
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

			query.append(_SQL_SELECT_TAXDETAILS_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TaxDetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<TaxDetails>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TaxDetails>(list);
				}
				else {
					list = (List<TaxDetails>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first tax details in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tax details
	 * @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchTaxDetailsException, SystemException {
		TaxDetails taxDetails = fetchByGroupId_First(groupId, orderByComparator);

		if (taxDetails != null) {
			return taxDetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTaxDetailsException(msg.toString());
	}

	/**
	 * Returns the first tax details in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tax details, or <code>null</code> if a matching tax details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails fetchByGroupId_First(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<TaxDetails> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tax details in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tax details
	 * @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchTaxDetailsException, SystemException {
		TaxDetails taxDetails = fetchByGroupId_Last(groupId, orderByComparator);

		if (taxDetails != null) {
			return taxDetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTaxDetailsException(msg.toString());
	}

	/**
	 * Returns the last tax details in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tax details, or <code>null</code> if a matching tax details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails fetchByGroupId_Last(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<TaxDetails> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tax detailses before and after the current tax details in the ordered set where groupId = &#63;.
	 *
	 * @param taxDetailsId the primary key of the current tax details
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tax details
	 * @throws com.ocms.course.NoSuchTaxDetailsException if a tax details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails[] findByGroupId_PrevAndNext(long taxDetailsId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchTaxDetailsException, SystemException {
		TaxDetails taxDetails = findByPrimaryKey(taxDetailsId);

		Session session = null;

		try {
			session = openSession();

			TaxDetails[] array = new TaxDetailsImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, taxDetails, groupId,
					orderByComparator, true);

			array[1] = taxDetails;

			array[2] = getByGroupId_PrevAndNext(session, taxDetails, groupId,
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

	protected TaxDetails getByGroupId_PrevAndNext(Session session,
		TaxDetails taxDetails, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TAXDETAILS_WHERE);

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
			query.append(TaxDetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(taxDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TaxDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tax detailses where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupId(long groupId) throws SystemException {
		for (TaxDetails taxDetails : findByGroupId(groupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(taxDetails);
		}
	}

	/**
	 * Returns the number of tax detailses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching tax detailses
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

			query.append(_SQL_COUNT_TAXDETAILS_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "taxDetails.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TAXDETAILSID =
		new FinderPath(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaxDetailsModelImpl.FINDER_CACHE_ENABLED, TaxDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTaxDetailsId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAXDETAILSID =
		new FinderPath(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaxDetailsModelImpl.FINDER_CACHE_ENABLED, TaxDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTaxDetailsId",
			new String[] { Long.class.getName() },
			TaxDetailsModelImpl.TAXDETAILSID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TAXDETAILSID = new FinderPath(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaxDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTaxDetailsId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the tax detailses where taxDetailsId = &#63;.
	 *
	 * @param taxDetailsId the tax details ID
	 * @return the matching tax detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxDetails> findByTaxDetailsId(long taxDetailsId)
		throws SystemException {
		return findByTaxDetailsId(taxDetailsId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tax detailses where taxDetailsId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param taxDetailsId the tax details ID
	 * @param start the lower bound of the range of tax detailses
	 * @param end the upper bound of the range of tax detailses (not inclusive)
	 * @return the range of matching tax detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxDetails> findByTaxDetailsId(long taxDetailsId, int start,
		int end) throws SystemException {
		return findByTaxDetailsId(taxDetailsId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tax detailses where taxDetailsId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param taxDetailsId the tax details ID
	 * @param start the lower bound of the range of tax detailses
	 * @param end the upper bound of the range of tax detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tax detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxDetails> findByTaxDetailsId(long taxDetailsId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAXDETAILSID;
			finderArgs = new Object[] { taxDetailsId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TAXDETAILSID;
			finderArgs = new Object[] {
					taxDetailsId,
					
					start, end, orderByComparator
				};
		}

		List<TaxDetails> list = (List<TaxDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TaxDetails taxDetails : list) {
				if ((taxDetailsId != taxDetails.getTaxDetailsId())) {
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

			query.append(_SQL_SELECT_TAXDETAILS_WHERE);

			query.append(_FINDER_COLUMN_TAXDETAILSID_TAXDETAILSID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TaxDetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(taxDetailsId);

				if (!pagination) {
					list = (List<TaxDetails>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TaxDetails>(list);
				}
				else {
					list = (List<TaxDetails>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first tax details in the ordered set where taxDetailsId = &#63;.
	 *
	 * @param taxDetailsId the tax details ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tax details
	 * @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails findByTaxDetailsId_First(long taxDetailsId,
		OrderByComparator orderByComparator)
		throws NoSuchTaxDetailsException, SystemException {
		TaxDetails taxDetails = fetchByTaxDetailsId_First(taxDetailsId,
				orderByComparator);

		if (taxDetails != null) {
			return taxDetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("taxDetailsId=");
		msg.append(taxDetailsId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTaxDetailsException(msg.toString());
	}

	/**
	 * Returns the first tax details in the ordered set where taxDetailsId = &#63;.
	 *
	 * @param taxDetailsId the tax details ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tax details, or <code>null</code> if a matching tax details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails fetchByTaxDetailsId_First(long taxDetailsId,
		OrderByComparator orderByComparator) throws SystemException {
		List<TaxDetails> list = findByTaxDetailsId(taxDetailsId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tax details in the ordered set where taxDetailsId = &#63;.
	 *
	 * @param taxDetailsId the tax details ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tax details
	 * @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails findByTaxDetailsId_Last(long taxDetailsId,
		OrderByComparator orderByComparator)
		throws NoSuchTaxDetailsException, SystemException {
		TaxDetails taxDetails = fetchByTaxDetailsId_Last(taxDetailsId,
				orderByComparator);

		if (taxDetails != null) {
			return taxDetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("taxDetailsId=");
		msg.append(taxDetailsId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTaxDetailsException(msg.toString());
	}

	/**
	 * Returns the last tax details in the ordered set where taxDetailsId = &#63;.
	 *
	 * @param taxDetailsId the tax details ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tax details, or <code>null</code> if a matching tax details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails fetchByTaxDetailsId_Last(long taxDetailsId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTaxDetailsId(taxDetailsId);

		if (count == 0) {
			return null;
		}

		List<TaxDetails> list = findByTaxDetailsId(taxDetailsId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the tax detailses where taxDetailsId = &#63; from the database.
	 *
	 * @param taxDetailsId the tax details ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTaxDetailsId(long taxDetailsId)
		throws SystemException {
		for (TaxDetails taxDetails : findByTaxDetailsId(taxDetailsId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(taxDetails);
		}
	}

	/**
	 * Returns the number of tax detailses where taxDetailsId = &#63;.
	 *
	 * @param taxDetailsId the tax details ID
	 * @return the number of matching tax detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTaxDetailsId(long taxDetailsId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TAXDETAILSID;

		Object[] finderArgs = new Object[] { taxDetailsId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TAXDETAILS_WHERE);

			query.append(_FINDER_COLUMN_TAXDETAILSID_TAXDETAILSID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(taxDetailsId);

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

	private static final String _FINDER_COLUMN_TAXDETAILSID_TAXDETAILSID_2 = "taxDetails.taxDetailsId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TAXTYPEID =
		new FinderPath(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaxDetailsModelImpl.FINDER_CACHE_ENABLED, TaxDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTaxTypeId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAXTYPEID =
		new FinderPath(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaxDetailsModelImpl.FINDER_CACHE_ENABLED, TaxDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTaxTypeId",
			new String[] { Long.class.getName() },
			TaxDetailsModelImpl.TAXTYPEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TAXTYPEID = new FinderPath(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaxDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTaxTypeId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the tax detailses where taxTypeId = &#63;.
	 *
	 * @param taxTypeId the tax type ID
	 * @return the matching tax detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxDetails> findByTaxTypeId(long taxTypeId)
		throws SystemException {
		return findByTaxTypeId(taxTypeId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the tax detailses where taxTypeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param taxTypeId the tax type ID
	 * @param start the lower bound of the range of tax detailses
	 * @param end the upper bound of the range of tax detailses (not inclusive)
	 * @return the range of matching tax detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxDetails> findByTaxTypeId(long taxTypeId, int start, int end)
		throws SystemException {
		return findByTaxTypeId(taxTypeId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tax detailses where taxTypeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param taxTypeId the tax type ID
	 * @param start the lower bound of the range of tax detailses
	 * @param end the upper bound of the range of tax detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tax detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxDetails> findByTaxTypeId(long taxTypeId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAXTYPEID;
			finderArgs = new Object[] { taxTypeId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TAXTYPEID;
			finderArgs = new Object[] { taxTypeId, start, end, orderByComparator };
		}

		List<TaxDetails> list = (List<TaxDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TaxDetails taxDetails : list) {
				if ((taxTypeId != taxDetails.getTaxTypeId())) {
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

			query.append(_SQL_SELECT_TAXDETAILS_WHERE);

			query.append(_FINDER_COLUMN_TAXTYPEID_TAXTYPEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TaxDetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(taxTypeId);

				if (!pagination) {
					list = (List<TaxDetails>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TaxDetails>(list);
				}
				else {
					list = (List<TaxDetails>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first tax details in the ordered set where taxTypeId = &#63;.
	 *
	 * @param taxTypeId the tax type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tax details
	 * @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails findByTaxTypeId_First(long taxTypeId,
		OrderByComparator orderByComparator)
		throws NoSuchTaxDetailsException, SystemException {
		TaxDetails taxDetails = fetchByTaxTypeId_First(taxTypeId,
				orderByComparator);

		if (taxDetails != null) {
			return taxDetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("taxTypeId=");
		msg.append(taxTypeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTaxDetailsException(msg.toString());
	}

	/**
	 * Returns the first tax details in the ordered set where taxTypeId = &#63;.
	 *
	 * @param taxTypeId the tax type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tax details, or <code>null</code> if a matching tax details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails fetchByTaxTypeId_First(long taxTypeId,
		OrderByComparator orderByComparator) throws SystemException {
		List<TaxDetails> list = findByTaxTypeId(taxTypeId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tax details in the ordered set where taxTypeId = &#63;.
	 *
	 * @param taxTypeId the tax type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tax details
	 * @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails findByTaxTypeId_Last(long taxTypeId,
		OrderByComparator orderByComparator)
		throws NoSuchTaxDetailsException, SystemException {
		TaxDetails taxDetails = fetchByTaxTypeId_Last(taxTypeId,
				orderByComparator);

		if (taxDetails != null) {
			return taxDetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("taxTypeId=");
		msg.append(taxTypeId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTaxDetailsException(msg.toString());
	}

	/**
	 * Returns the last tax details in the ordered set where taxTypeId = &#63;.
	 *
	 * @param taxTypeId the tax type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tax details, or <code>null</code> if a matching tax details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails fetchByTaxTypeId_Last(long taxTypeId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTaxTypeId(taxTypeId);

		if (count == 0) {
			return null;
		}

		List<TaxDetails> list = findByTaxTypeId(taxTypeId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tax detailses before and after the current tax details in the ordered set where taxTypeId = &#63;.
	 *
	 * @param taxDetailsId the primary key of the current tax details
	 * @param taxTypeId the tax type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tax details
	 * @throws com.ocms.course.NoSuchTaxDetailsException if a tax details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails[] findByTaxTypeId_PrevAndNext(long taxDetailsId,
		long taxTypeId, OrderByComparator orderByComparator)
		throws NoSuchTaxDetailsException, SystemException {
		TaxDetails taxDetails = findByPrimaryKey(taxDetailsId);

		Session session = null;

		try {
			session = openSession();

			TaxDetails[] array = new TaxDetailsImpl[3];

			array[0] = getByTaxTypeId_PrevAndNext(session, taxDetails,
					taxTypeId, orderByComparator, true);

			array[1] = taxDetails;

			array[2] = getByTaxTypeId_PrevAndNext(session, taxDetails,
					taxTypeId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TaxDetails getByTaxTypeId_PrevAndNext(Session session,
		TaxDetails taxDetails, long taxTypeId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TAXDETAILS_WHERE);

		query.append(_FINDER_COLUMN_TAXTYPEID_TAXTYPEID_2);

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
			query.append(TaxDetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(taxTypeId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(taxDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TaxDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tax detailses where taxTypeId = &#63; from the database.
	 *
	 * @param taxTypeId the tax type ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTaxTypeId(long taxTypeId) throws SystemException {
		for (TaxDetails taxDetails : findByTaxTypeId(taxTypeId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(taxDetails);
		}
	}

	/**
	 * Returns the number of tax detailses where taxTypeId = &#63;.
	 *
	 * @param taxTypeId the tax type ID
	 * @return the number of matching tax detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTaxTypeId(long taxTypeId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TAXTYPEID;

		Object[] finderArgs = new Object[] { taxTypeId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TAXDETAILS_WHERE);

			query.append(_FINDER_COLUMN_TAXTYPEID_TAXTYPEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(taxTypeId);

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

	private static final String _FINDER_COLUMN_TAXTYPEID_TAXTYPEID_2 = "taxDetails.taxTypeId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ACTIVE = new FinderPath(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaxDetailsModelImpl.FINDER_CACHE_ENABLED, TaxDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByActive",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVE =
		new FinderPath(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaxDetailsModelImpl.FINDER_CACHE_ENABLED, TaxDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByActive",
			new String[] { Integer.class.getName() },
			TaxDetailsModelImpl.ACTIVE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ACTIVE = new FinderPath(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaxDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByActive",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the tax detailses where active = &#63;.
	 *
	 * @param active the active
	 * @return the matching tax detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxDetails> findByActive(int active) throws SystemException {
		return findByActive(active, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tax detailses where active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param active the active
	 * @param start the lower bound of the range of tax detailses
	 * @param end the upper bound of the range of tax detailses (not inclusive)
	 * @return the range of matching tax detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxDetails> findByActive(int active, int start, int end)
		throws SystemException {
		return findByActive(active, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tax detailses where active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param active the active
	 * @param start the lower bound of the range of tax detailses
	 * @param end the upper bound of the range of tax detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tax detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxDetails> findByActive(int active, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
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

		List<TaxDetails> list = (List<TaxDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TaxDetails taxDetails : list) {
				if ((active != taxDetails.getActive())) {
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

			query.append(_SQL_SELECT_TAXDETAILS_WHERE);

			query.append(_FINDER_COLUMN_ACTIVE_ACTIVE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TaxDetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(active);

				if (!pagination) {
					list = (List<TaxDetails>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TaxDetails>(list);
				}
				else {
					list = (List<TaxDetails>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first tax details in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tax details
	 * @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails findByActive_First(int active,
		OrderByComparator orderByComparator)
		throws NoSuchTaxDetailsException, SystemException {
		TaxDetails taxDetails = fetchByActive_First(active, orderByComparator);

		if (taxDetails != null) {
			return taxDetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTaxDetailsException(msg.toString());
	}

	/**
	 * Returns the first tax details in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tax details, or <code>null</code> if a matching tax details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails fetchByActive_First(int active,
		OrderByComparator orderByComparator) throws SystemException {
		List<TaxDetails> list = findByActive(active, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tax details in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tax details
	 * @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails findByActive_Last(int active,
		OrderByComparator orderByComparator)
		throws NoSuchTaxDetailsException, SystemException {
		TaxDetails taxDetails = fetchByActive_Last(active, orderByComparator);

		if (taxDetails != null) {
			return taxDetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTaxDetailsException(msg.toString());
	}

	/**
	 * Returns the last tax details in the ordered set where active = &#63;.
	 *
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tax details, or <code>null</code> if a matching tax details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails fetchByActive_Last(int active,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByActive(active);

		if (count == 0) {
			return null;
		}

		List<TaxDetails> list = findByActive(active, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tax detailses before and after the current tax details in the ordered set where active = &#63;.
	 *
	 * @param taxDetailsId the primary key of the current tax details
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tax details
	 * @throws com.ocms.course.NoSuchTaxDetailsException if a tax details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails[] findByActive_PrevAndNext(long taxDetailsId, int active,
		OrderByComparator orderByComparator)
		throws NoSuchTaxDetailsException, SystemException {
		TaxDetails taxDetails = findByPrimaryKey(taxDetailsId);

		Session session = null;

		try {
			session = openSession();

			TaxDetails[] array = new TaxDetailsImpl[3];

			array[0] = getByActive_PrevAndNext(session, taxDetails, active,
					orderByComparator, true);

			array[1] = taxDetails;

			array[2] = getByActive_PrevAndNext(session, taxDetails, active,
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

	protected TaxDetails getByActive_PrevAndNext(Session session,
		TaxDetails taxDetails, int active, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TAXDETAILS_WHERE);

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
			query.append(TaxDetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(active);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(taxDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TaxDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tax detailses where active = &#63; from the database.
	 *
	 * @param active the active
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByActive(int active) throws SystemException {
		for (TaxDetails taxDetails : findByActive(active, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(taxDetails);
		}
	}

	/**
	 * Returns the number of tax detailses where active = &#63;.
	 *
	 * @param active the active
	 * @return the number of matching tax detailses
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

			query.append(_SQL_COUNT_TAXDETAILS_WHERE);

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

	private static final String _FINDER_COLUMN_ACTIVE_ACTIVE_2 = "taxDetails.active = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPIDACTIVE =
		new FinderPath(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaxDetailsModelImpl.FINDER_CACHE_ENABLED, TaxDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupIdActive",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPIDACTIVE =
		new FinderPath(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaxDetailsModelImpl.FINDER_CACHE_ENABLED, TaxDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupIdActive",
			new String[] { Long.class.getName(), Integer.class.getName() },
			TaxDetailsModelImpl.GROUPID_COLUMN_BITMASK |
			TaxDetailsModelImpl.ACTIVE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPIDACTIVE = new FinderPath(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaxDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupIdActive",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the tax detailses where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @return the matching tax detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxDetails> findByGroupIdActive(long groupId, int active)
		throws SystemException {
		return findByGroupIdActive(groupId, active, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tax detailses where groupId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param start the lower bound of the range of tax detailses
	 * @param end the upper bound of the range of tax detailses (not inclusive)
	 * @return the range of matching tax detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxDetails> findByGroupIdActive(long groupId, int active,
		int start, int end) throws SystemException {
		return findByGroupIdActive(groupId, active, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tax detailses where groupId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param start the lower bound of the range of tax detailses
	 * @param end the upper bound of the range of tax detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tax detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxDetails> findByGroupIdActive(long groupId, int active,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPIDACTIVE;
			finderArgs = new Object[] { groupId, active };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPIDACTIVE;
			finderArgs = new Object[] {
					groupId, active,
					
					start, end, orderByComparator
				};
		}

		List<TaxDetails> list = (List<TaxDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TaxDetails taxDetails : list) {
				if ((groupId != taxDetails.getGroupId()) ||
						(active != taxDetails.getActive())) {
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

			query.append(_SQL_SELECT_TAXDETAILS_WHERE);

			query.append(_FINDER_COLUMN_GROUPIDACTIVE_GROUPID_2);

			query.append(_FINDER_COLUMN_GROUPIDACTIVE_ACTIVE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TaxDetailsModelImpl.ORDER_BY_JPQL);
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
					list = (List<TaxDetails>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TaxDetails>(list);
				}
				else {
					list = (List<TaxDetails>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first tax details in the ordered set where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tax details
	 * @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails findByGroupIdActive_First(long groupId, int active,
		OrderByComparator orderByComparator)
		throws NoSuchTaxDetailsException, SystemException {
		TaxDetails taxDetails = fetchByGroupIdActive_First(groupId, active,
				orderByComparator);

		if (taxDetails != null) {
			return taxDetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTaxDetailsException(msg.toString());
	}

	/**
	 * Returns the first tax details in the ordered set where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tax details, or <code>null</code> if a matching tax details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails fetchByGroupIdActive_First(long groupId, int active,
		OrderByComparator orderByComparator) throws SystemException {
		List<TaxDetails> list = findByGroupIdActive(groupId, active, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tax details in the ordered set where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tax details
	 * @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails findByGroupIdActive_Last(long groupId, int active,
		OrderByComparator orderByComparator)
		throws NoSuchTaxDetailsException, SystemException {
		TaxDetails taxDetails = fetchByGroupIdActive_Last(groupId, active,
				orderByComparator);

		if (taxDetails != null) {
			return taxDetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTaxDetailsException(msg.toString());
	}

	/**
	 * Returns the last tax details in the ordered set where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tax details, or <code>null</code> if a matching tax details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails fetchByGroupIdActive_Last(long groupId, int active,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGroupIdActive(groupId, active);

		if (count == 0) {
			return null;
		}

		List<TaxDetails> list = findByGroupIdActive(groupId, active, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tax detailses before and after the current tax details in the ordered set where groupId = &#63; and active = &#63;.
	 *
	 * @param taxDetailsId the primary key of the current tax details
	 * @param groupId the group ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tax details
	 * @throws com.ocms.course.NoSuchTaxDetailsException if a tax details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails[] findByGroupIdActive_PrevAndNext(long taxDetailsId,
		long groupId, int active, OrderByComparator orderByComparator)
		throws NoSuchTaxDetailsException, SystemException {
		TaxDetails taxDetails = findByPrimaryKey(taxDetailsId);

		Session session = null;

		try {
			session = openSession();

			TaxDetails[] array = new TaxDetailsImpl[3];

			array[0] = getByGroupIdActive_PrevAndNext(session, taxDetails,
					groupId, active, orderByComparator, true);

			array[1] = taxDetails;

			array[2] = getByGroupIdActive_PrevAndNext(session, taxDetails,
					groupId, active, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TaxDetails getByGroupIdActive_PrevAndNext(Session session,
		TaxDetails taxDetails, long groupId, int active,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TAXDETAILS_WHERE);

		query.append(_FINDER_COLUMN_GROUPIDACTIVE_GROUPID_2);

		query.append(_FINDER_COLUMN_GROUPIDACTIVE_ACTIVE_2);

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
			query.append(TaxDetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(active);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(taxDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TaxDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tax detailses where groupId = &#63; and active = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupIdActive(long groupId, int active)
		throws SystemException {
		for (TaxDetails taxDetails : findByGroupIdActive(groupId, active,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(taxDetails);
		}
	}

	/**
	 * Returns the number of tax detailses where groupId = &#63; and active = &#63;.
	 *
	 * @param groupId the group ID
	 * @param active the active
	 * @return the number of matching tax detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByGroupIdActive(long groupId, int active)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPIDACTIVE;

		Object[] finderArgs = new Object[] { groupId, active };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TAXDETAILS_WHERE);

			query.append(_FINDER_COLUMN_GROUPIDACTIVE_GROUPID_2);

			query.append(_FINDER_COLUMN_GROUPIDACTIVE_ACTIVE_2);

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

	private static final String _FINDER_COLUMN_GROUPIDACTIVE_GROUPID_2 = "taxDetails.groupId = ? AND ";
	private static final String _FINDER_COLUMN_GROUPIDACTIVE_ACTIVE_2 = "taxDetails.active = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TAXDETAILSIDACTIVE =
		new FinderPath(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaxDetailsModelImpl.FINDER_CACHE_ENABLED, TaxDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTaxDetailsIdActive",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAXDETAILSIDACTIVE =
		new FinderPath(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaxDetailsModelImpl.FINDER_CACHE_ENABLED, TaxDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByTaxDetailsIdActive",
			new String[] { Long.class.getName(), Integer.class.getName() },
			TaxDetailsModelImpl.TAXDETAILSID_COLUMN_BITMASK |
			TaxDetailsModelImpl.ACTIVE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TAXDETAILSIDACTIVE = new FinderPath(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaxDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByTaxDetailsIdActive",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the tax detailses where taxDetailsId = &#63; and active = &#63;.
	 *
	 * @param taxDetailsId the tax details ID
	 * @param active the active
	 * @return the matching tax detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxDetails> findByTaxDetailsIdActive(long taxDetailsId,
		int active) throws SystemException {
		return findByTaxDetailsIdActive(taxDetailsId, active,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tax detailses where taxDetailsId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param taxDetailsId the tax details ID
	 * @param active the active
	 * @param start the lower bound of the range of tax detailses
	 * @param end the upper bound of the range of tax detailses (not inclusive)
	 * @return the range of matching tax detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxDetails> findByTaxDetailsIdActive(long taxDetailsId,
		int active, int start, int end) throws SystemException {
		return findByTaxDetailsIdActive(taxDetailsId, active, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tax detailses where taxDetailsId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param taxDetailsId the tax details ID
	 * @param active the active
	 * @param start the lower bound of the range of tax detailses
	 * @param end the upper bound of the range of tax detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tax detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxDetails> findByTaxDetailsIdActive(long taxDetailsId,
		int active, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAXDETAILSIDACTIVE;
			finderArgs = new Object[] { taxDetailsId, active };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TAXDETAILSIDACTIVE;
			finderArgs = new Object[] {
					taxDetailsId, active,
					
					start, end, orderByComparator
				};
		}

		List<TaxDetails> list = (List<TaxDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TaxDetails taxDetails : list) {
				if ((taxDetailsId != taxDetails.getTaxDetailsId()) ||
						(active != taxDetails.getActive())) {
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

			query.append(_SQL_SELECT_TAXDETAILS_WHERE);

			query.append(_FINDER_COLUMN_TAXDETAILSIDACTIVE_TAXDETAILSID_2);

			query.append(_FINDER_COLUMN_TAXDETAILSIDACTIVE_ACTIVE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TaxDetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(taxDetailsId);

				qPos.add(active);

				if (!pagination) {
					list = (List<TaxDetails>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TaxDetails>(list);
				}
				else {
					list = (List<TaxDetails>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first tax details in the ordered set where taxDetailsId = &#63; and active = &#63;.
	 *
	 * @param taxDetailsId the tax details ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tax details
	 * @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails findByTaxDetailsIdActive_First(long taxDetailsId,
		int active, OrderByComparator orderByComparator)
		throws NoSuchTaxDetailsException, SystemException {
		TaxDetails taxDetails = fetchByTaxDetailsIdActive_First(taxDetailsId,
				active, orderByComparator);

		if (taxDetails != null) {
			return taxDetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("taxDetailsId=");
		msg.append(taxDetailsId);

		msg.append(", active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTaxDetailsException(msg.toString());
	}

	/**
	 * Returns the first tax details in the ordered set where taxDetailsId = &#63; and active = &#63;.
	 *
	 * @param taxDetailsId the tax details ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tax details, or <code>null</code> if a matching tax details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails fetchByTaxDetailsIdActive_First(long taxDetailsId,
		int active, OrderByComparator orderByComparator)
		throws SystemException {
		List<TaxDetails> list = findByTaxDetailsIdActive(taxDetailsId, active,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tax details in the ordered set where taxDetailsId = &#63; and active = &#63;.
	 *
	 * @param taxDetailsId the tax details ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tax details
	 * @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails findByTaxDetailsIdActive_Last(long taxDetailsId,
		int active, OrderByComparator orderByComparator)
		throws NoSuchTaxDetailsException, SystemException {
		TaxDetails taxDetails = fetchByTaxDetailsIdActive_Last(taxDetailsId,
				active, orderByComparator);

		if (taxDetails != null) {
			return taxDetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("taxDetailsId=");
		msg.append(taxDetailsId);

		msg.append(", active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTaxDetailsException(msg.toString());
	}

	/**
	 * Returns the last tax details in the ordered set where taxDetailsId = &#63; and active = &#63;.
	 *
	 * @param taxDetailsId the tax details ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tax details, or <code>null</code> if a matching tax details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails fetchByTaxDetailsIdActive_Last(long taxDetailsId,
		int active, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByTaxDetailsIdActive(taxDetailsId, active);

		if (count == 0) {
			return null;
		}

		List<TaxDetails> list = findByTaxDetailsIdActive(taxDetailsId, active,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the tax detailses where taxDetailsId = &#63; and active = &#63; from the database.
	 *
	 * @param taxDetailsId the tax details ID
	 * @param active the active
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTaxDetailsIdActive(long taxDetailsId, int active)
		throws SystemException {
		for (TaxDetails taxDetails : findByTaxDetailsIdActive(taxDetailsId,
				active, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(taxDetails);
		}
	}

	/**
	 * Returns the number of tax detailses where taxDetailsId = &#63; and active = &#63;.
	 *
	 * @param taxDetailsId the tax details ID
	 * @param active the active
	 * @return the number of matching tax detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTaxDetailsIdActive(long taxDetailsId, int active)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TAXDETAILSIDACTIVE;

		Object[] finderArgs = new Object[] { taxDetailsId, active };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TAXDETAILS_WHERE);

			query.append(_FINDER_COLUMN_TAXDETAILSIDACTIVE_TAXDETAILSID_2);

			query.append(_FINDER_COLUMN_TAXDETAILSIDACTIVE_ACTIVE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(taxDetailsId);

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

	private static final String _FINDER_COLUMN_TAXDETAILSIDACTIVE_TAXDETAILSID_2 =
		"taxDetails.taxDetailsId = ? AND ";
	private static final String _FINDER_COLUMN_TAXDETAILSIDACTIVE_ACTIVE_2 = "taxDetails.active = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TAXTYPEIDACTIVE =
		new FinderPath(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaxDetailsModelImpl.FINDER_CACHE_ENABLED, TaxDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTaxTypeIdActive",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAXTYPEIDACTIVE =
		new FinderPath(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaxDetailsModelImpl.FINDER_CACHE_ENABLED, TaxDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTaxTypeIdActive",
			new String[] { Long.class.getName(), Integer.class.getName() },
			TaxDetailsModelImpl.TAXTYPEID_COLUMN_BITMASK |
			TaxDetailsModelImpl.ACTIVE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TAXTYPEIDACTIVE = new FinderPath(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaxDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByTaxTypeIdActive",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the tax detailses where taxTypeId = &#63; and active = &#63;.
	 *
	 * @param taxTypeId the tax type ID
	 * @param active the active
	 * @return the matching tax detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxDetails> findByTaxTypeIdActive(long taxTypeId, int active)
		throws SystemException {
		return findByTaxTypeIdActive(taxTypeId, active, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tax detailses where taxTypeId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param taxTypeId the tax type ID
	 * @param active the active
	 * @param start the lower bound of the range of tax detailses
	 * @param end the upper bound of the range of tax detailses (not inclusive)
	 * @return the range of matching tax detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxDetails> findByTaxTypeIdActive(long taxTypeId, int active,
		int start, int end) throws SystemException {
		return findByTaxTypeIdActive(taxTypeId, active, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tax detailses where taxTypeId = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param taxTypeId the tax type ID
	 * @param active the active
	 * @param start the lower bound of the range of tax detailses
	 * @param end the upper bound of the range of tax detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tax detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxDetails> findByTaxTypeIdActive(long taxTypeId, int active,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAXTYPEIDACTIVE;
			finderArgs = new Object[] { taxTypeId, active };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TAXTYPEIDACTIVE;
			finderArgs = new Object[] {
					taxTypeId, active,
					
					start, end, orderByComparator
				};
		}

		List<TaxDetails> list = (List<TaxDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TaxDetails taxDetails : list) {
				if ((taxTypeId != taxDetails.getTaxTypeId()) ||
						(active != taxDetails.getActive())) {
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

			query.append(_SQL_SELECT_TAXDETAILS_WHERE);

			query.append(_FINDER_COLUMN_TAXTYPEIDACTIVE_TAXTYPEID_2);

			query.append(_FINDER_COLUMN_TAXTYPEIDACTIVE_ACTIVE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TaxDetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(taxTypeId);

				qPos.add(active);

				if (!pagination) {
					list = (List<TaxDetails>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TaxDetails>(list);
				}
				else {
					list = (List<TaxDetails>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first tax details in the ordered set where taxTypeId = &#63; and active = &#63;.
	 *
	 * @param taxTypeId the tax type ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tax details
	 * @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails findByTaxTypeIdActive_First(long taxTypeId, int active,
		OrderByComparator orderByComparator)
		throws NoSuchTaxDetailsException, SystemException {
		TaxDetails taxDetails = fetchByTaxTypeIdActive_First(taxTypeId, active,
				orderByComparator);

		if (taxDetails != null) {
			return taxDetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("taxTypeId=");
		msg.append(taxTypeId);

		msg.append(", active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTaxDetailsException(msg.toString());
	}

	/**
	 * Returns the first tax details in the ordered set where taxTypeId = &#63; and active = &#63;.
	 *
	 * @param taxTypeId the tax type ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tax details, or <code>null</code> if a matching tax details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails fetchByTaxTypeIdActive_First(long taxTypeId, int active,
		OrderByComparator orderByComparator) throws SystemException {
		List<TaxDetails> list = findByTaxTypeIdActive(taxTypeId, active, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tax details in the ordered set where taxTypeId = &#63; and active = &#63;.
	 *
	 * @param taxTypeId the tax type ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tax details
	 * @throws com.ocms.course.NoSuchTaxDetailsException if a matching tax details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails findByTaxTypeIdActive_Last(long taxTypeId, int active,
		OrderByComparator orderByComparator)
		throws NoSuchTaxDetailsException, SystemException {
		TaxDetails taxDetails = fetchByTaxTypeIdActive_Last(taxTypeId, active,
				orderByComparator);

		if (taxDetails != null) {
			return taxDetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("taxTypeId=");
		msg.append(taxTypeId);

		msg.append(", active=");
		msg.append(active);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTaxDetailsException(msg.toString());
	}

	/**
	 * Returns the last tax details in the ordered set where taxTypeId = &#63; and active = &#63;.
	 *
	 * @param taxTypeId the tax type ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tax details, or <code>null</code> if a matching tax details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails fetchByTaxTypeIdActive_Last(long taxTypeId, int active,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTaxTypeIdActive(taxTypeId, active);

		if (count == 0) {
			return null;
		}

		List<TaxDetails> list = findByTaxTypeIdActive(taxTypeId, active,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tax detailses before and after the current tax details in the ordered set where taxTypeId = &#63; and active = &#63;.
	 *
	 * @param taxDetailsId the primary key of the current tax details
	 * @param taxTypeId the tax type ID
	 * @param active the active
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tax details
	 * @throws com.ocms.course.NoSuchTaxDetailsException if a tax details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails[] findByTaxTypeIdActive_PrevAndNext(long taxDetailsId,
		long taxTypeId, int active, OrderByComparator orderByComparator)
		throws NoSuchTaxDetailsException, SystemException {
		TaxDetails taxDetails = findByPrimaryKey(taxDetailsId);

		Session session = null;

		try {
			session = openSession();

			TaxDetails[] array = new TaxDetailsImpl[3];

			array[0] = getByTaxTypeIdActive_PrevAndNext(session, taxDetails,
					taxTypeId, active, orderByComparator, true);

			array[1] = taxDetails;

			array[2] = getByTaxTypeIdActive_PrevAndNext(session, taxDetails,
					taxTypeId, active, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TaxDetails getByTaxTypeIdActive_PrevAndNext(Session session,
		TaxDetails taxDetails, long taxTypeId, int active,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TAXDETAILS_WHERE);

		query.append(_FINDER_COLUMN_TAXTYPEIDACTIVE_TAXTYPEID_2);

		query.append(_FINDER_COLUMN_TAXTYPEIDACTIVE_ACTIVE_2);

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
			query.append(TaxDetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(taxTypeId);

		qPos.add(active);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(taxDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TaxDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tax detailses where taxTypeId = &#63; and active = &#63; from the database.
	 *
	 * @param taxTypeId the tax type ID
	 * @param active the active
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTaxTypeIdActive(long taxTypeId, int active)
		throws SystemException {
		for (TaxDetails taxDetails : findByTaxTypeIdActive(taxTypeId, active,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(taxDetails);
		}
	}

	/**
	 * Returns the number of tax detailses where taxTypeId = &#63; and active = &#63;.
	 *
	 * @param taxTypeId the tax type ID
	 * @param active the active
	 * @return the number of matching tax detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTaxTypeIdActive(long taxTypeId, int active)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TAXTYPEIDACTIVE;

		Object[] finderArgs = new Object[] { taxTypeId, active };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TAXDETAILS_WHERE);

			query.append(_FINDER_COLUMN_TAXTYPEIDACTIVE_TAXTYPEID_2);

			query.append(_FINDER_COLUMN_TAXTYPEIDACTIVE_ACTIVE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(taxTypeId);

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

	private static final String _FINDER_COLUMN_TAXTYPEIDACTIVE_TAXTYPEID_2 = "taxDetails.taxTypeId = ? AND ";
	private static final String _FINDER_COLUMN_TAXTYPEIDACTIVE_ACTIVE_2 = "taxDetails.active = ?";

	public TaxDetailsPersistenceImpl() {
		setModelClass(TaxDetails.class);
	}

	/**
	 * Caches the tax details in the entity cache if it is enabled.
	 *
	 * @param taxDetails the tax details
	 */
	@Override
	public void cacheResult(TaxDetails taxDetails) {
		EntityCacheUtil.putResult(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaxDetailsImpl.class, taxDetails.getPrimaryKey(), taxDetails);

		taxDetails.resetOriginalValues();
	}

	/**
	 * Caches the tax detailses in the entity cache if it is enabled.
	 *
	 * @param taxDetailses the tax detailses
	 */
	@Override
	public void cacheResult(List<TaxDetails> taxDetailses) {
		for (TaxDetails taxDetails : taxDetailses) {
			if (EntityCacheUtil.getResult(
						TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
						TaxDetailsImpl.class, taxDetails.getPrimaryKey()) == null) {
				cacheResult(taxDetails);
			}
			else {
				taxDetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tax detailses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TaxDetailsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TaxDetailsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tax details.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TaxDetails taxDetails) {
		EntityCacheUtil.removeResult(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaxDetailsImpl.class, taxDetails.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TaxDetails> taxDetailses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TaxDetails taxDetails : taxDetailses) {
			EntityCacheUtil.removeResult(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
				TaxDetailsImpl.class, taxDetails.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tax details with the primary key. Does not add the tax details to the database.
	 *
	 * @param taxDetailsId the primary key for the new tax details
	 * @return the new tax details
	 */
	@Override
	public TaxDetails create(long taxDetailsId) {
		TaxDetails taxDetails = new TaxDetailsImpl();

		taxDetails.setNew(true);
		taxDetails.setPrimaryKey(taxDetailsId);

		return taxDetails;
	}

	/**
	 * Removes the tax details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param taxDetailsId the primary key of the tax details
	 * @return the tax details that was removed
	 * @throws com.ocms.course.NoSuchTaxDetailsException if a tax details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails remove(long taxDetailsId)
		throws NoSuchTaxDetailsException, SystemException {
		return remove((Serializable)taxDetailsId);
	}

	/**
	 * Removes the tax details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tax details
	 * @return the tax details that was removed
	 * @throws com.ocms.course.NoSuchTaxDetailsException if a tax details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails remove(Serializable primaryKey)
		throws NoSuchTaxDetailsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TaxDetails taxDetails = (TaxDetails)session.get(TaxDetailsImpl.class,
					primaryKey);

			if (taxDetails == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTaxDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(taxDetails);
		}
		catch (NoSuchTaxDetailsException nsee) {
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
	protected TaxDetails removeImpl(TaxDetails taxDetails)
		throws SystemException {
		taxDetails = toUnwrappedModel(taxDetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(taxDetails)) {
				taxDetails = (TaxDetails)session.get(TaxDetailsImpl.class,
						taxDetails.getPrimaryKeyObj());
			}

			if (taxDetails != null) {
				session.delete(taxDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (taxDetails != null) {
			clearCache(taxDetails);
		}

		return taxDetails;
	}

	@Override
	public TaxDetails updateImpl(com.ocms.course.model.TaxDetails taxDetails)
		throws SystemException {
		taxDetails = toUnwrappedModel(taxDetails);

		boolean isNew = taxDetails.isNew();

		TaxDetailsModelImpl taxDetailsModelImpl = (TaxDetailsModelImpl)taxDetails;

		Session session = null;

		try {
			session = openSession();

			if (taxDetails.isNew()) {
				session.save(taxDetails);

				taxDetails.setNew(false);
			}
			else {
				session.merge(taxDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TaxDetailsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((taxDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						taxDetailsModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { taxDetailsModelImpl.getGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((taxDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAXDETAILSID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						taxDetailsModelImpl.getOriginalTaxDetailsId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TAXDETAILSID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAXDETAILSID,
					args);

				args = new Object[] { taxDetailsModelImpl.getTaxDetailsId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TAXDETAILSID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAXDETAILSID,
					args);
			}

			if ((taxDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAXTYPEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						taxDetailsModelImpl.getOriginalTaxTypeId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TAXTYPEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAXTYPEID,
					args);

				args = new Object[] { taxDetailsModelImpl.getTaxTypeId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TAXTYPEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAXTYPEID,
					args);
			}

			if ((taxDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						taxDetailsModelImpl.getOriginalActive()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACTIVE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVE,
					args);

				args = new Object[] { taxDetailsModelImpl.getActive() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACTIVE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVE,
					args);
			}

			if ((taxDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPIDACTIVE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						taxDetailsModelImpl.getOriginalGroupId(),
						taxDetailsModelImpl.getOriginalActive()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPIDACTIVE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPIDACTIVE,
					args);

				args = new Object[] {
						taxDetailsModelImpl.getGroupId(),
						taxDetailsModelImpl.getActive()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPIDACTIVE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPIDACTIVE,
					args);
			}

			if ((taxDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAXDETAILSIDACTIVE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						taxDetailsModelImpl.getOriginalTaxDetailsId(),
						taxDetailsModelImpl.getOriginalActive()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TAXDETAILSIDACTIVE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAXDETAILSIDACTIVE,
					args);

				args = new Object[] {
						taxDetailsModelImpl.getTaxDetailsId(),
						taxDetailsModelImpl.getActive()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TAXDETAILSIDACTIVE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAXDETAILSIDACTIVE,
					args);
			}

			if ((taxDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAXTYPEIDACTIVE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						taxDetailsModelImpl.getOriginalTaxTypeId(),
						taxDetailsModelImpl.getOriginalActive()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TAXTYPEIDACTIVE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAXTYPEIDACTIVE,
					args);

				args = new Object[] {
						taxDetailsModelImpl.getTaxTypeId(),
						taxDetailsModelImpl.getActive()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TAXTYPEIDACTIVE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAXTYPEIDACTIVE,
					args);
			}
		}

		EntityCacheUtil.putResult(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TaxDetailsImpl.class, taxDetails.getPrimaryKey(), taxDetails);

		return taxDetails;
	}

	protected TaxDetails toUnwrappedModel(TaxDetails taxDetails) {
		if (taxDetails instanceof TaxDetailsImpl) {
			return taxDetails;
		}

		TaxDetailsImpl taxDetailsImpl = new TaxDetailsImpl();

		taxDetailsImpl.setNew(taxDetails.isNew());
		taxDetailsImpl.setPrimaryKey(taxDetails.getPrimaryKey());

		taxDetailsImpl.setTaxDetailsId(taxDetails.getTaxDetailsId());
		taxDetailsImpl.setGroupId(taxDetails.getGroupId());
		taxDetailsImpl.setCompanyId(taxDetails.getCompanyId());
		taxDetailsImpl.setUserId(taxDetails.getUserId());
		taxDetailsImpl.setUserName(taxDetails.getUserName());
		taxDetailsImpl.setCreateDate(taxDetails.getCreateDate());
		taxDetailsImpl.setModifiedDate(taxDetails.getModifiedDate());
		taxDetailsImpl.setCountry(taxDetails.getCountry());
		taxDetailsImpl.setTaxTypeId(taxDetails.getTaxTypeId());
		taxDetailsImpl.setEffectiveFromDate(taxDetails.getEffectiveFromDate());
		taxDetailsImpl.setEffectiveToDate(taxDetails.getEffectiveToDate());
		taxDetailsImpl.setActive(taxDetails.getActive());
		taxDetailsImpl.setTaxPercent(taxDetails.getTaxPercent());

		return taxDetailsImpl;
	}

	/**
	 * Returns the tax details with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tax details
	 * @return the tax details
	 * @throws com.ocms.course.NoSuchTaxDetailsException if a tax details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTaxDetailsException, SystemException {
		TaxDetails taxDetails = fetchByPrimaryKey(primaryKey);

		if (taxDetails == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTaxDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return taxDetails;
	}

	/**
	 * Returns the tax details with the primary key or throws a {@link com.ocms.course.NoSuchTaxDetailsException} if it could not be found.
	 *
	 * @param taxDetailsId the primary key of the tax details
	 * @return the tax details
	 * @throws com.ocms.course.NoSuchTaxDetailsException if a tax details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails findByPrimaryKey(long taxDetailsId)
		throws NoSuchTaxDetailsException, SystemException {
		return findByPrimaryKey((Serializable)taxDetailsId);
	}

	/**
	 * Returns the tax details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tax details
	 * @return the tax details, or <code>null</code> if a tax details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TaxDetails taxDetails = (TaxDetails)EntityCacheUtil.getResult(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
				TaxDetailsImpl.class, primaryKey);

		if (taxDetails == _nullTaxDetails) {
			return null;
		}

		if (taxDetails == null) {
			Session session = null;

			try {
				session = openSession();

				taxDetails = (TaxDetails)session.get(TaxDetailsImpl.class,
						primaryKey);

				if (taxDetails != null) {
					cacheResult(taxDetails);
				}
				else {
					EntityCacheUtil.putResult(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
						TaxDetailsImpl.class, primaryKey, _nullTaxDetails);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TaxDetailsModelImpl.ENTITY_CACHE_ENABLED,
					TaxDetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return taxDetails;
	}

	/**
	 * Returns the tax details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param taxDetailsId the primary key of the tax details
	 * @return the tax details, or <code>null</code> if a tax details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TaxDetails fetchByPrimaryKey(long taxDetailsId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)taxDetailsId);
	}

	/**
	 * Returns all the tax detailses.
	 *
	 * @return the tax detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxDetails> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tax detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tax detailses
	 * @param end the upper bound of the range of tax detailses (not inclusive)
	 * @return the range of tax detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxDetails> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tax detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.TaxDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tax detailses
	 * @param end the upper bound of the range of tax detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tax detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TaxDetails> findAll(int start, int end,
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

		List<TaxDetails> list = (List<TaxDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TAXDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TAXDETAILS;

				if (pagination) {
					sql = sql.concat(TaxDetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TaxDetails>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TaxDetails>(list);
				}
				else {
					list = (List<TaxDetails>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the tax detailses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TaxDetails taxDetails : findAll()) {
			remove(taxDetails);
		}
	}

	/**
	 * Returns the number of tax detailses.
	 *
	 * @return the number of tax detailses
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

				Query q = session.createQuery(_SQL_COUNT_TAXDETAILS);

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
	 * Initializes the tax details persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ocms.course.model.TaxDetails")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TaxDetails>> listenersList = new ArrayList<ModelListener<TaxDetails>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TaxDetails>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TaxDetailsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TAXDETAILS = "SELECT taxDetails FROM TaxDetails taxDetails";
	private static final String _SQL_SELECT_TAXDETAILS_WHERE = "SELECT taxDetails FROM TaxDetails taxDetails WHERE ";
	private static final String _SQL_COUNT_TAXDETAILS = "SELECT COUNT(taxDetails) FROM TaxDetails taxDetails";
	private static final String _SQL_COUNT_TAXDETAILS_WHERE = "SELECT COUNT(taxDetails) FROM TaxDetails taxDetails WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "taxDetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TaxDetails exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TaxDetails exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TaxDetailsPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"active"
			});
	private static TaxDetails _nullTaxDetails = new TaxDetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TaxDetails> toCacheModel() {
				return _nullTaxDetailsCacheModel;
			}
		};

	private static CacheModel<TaxDetails> _nullTaxDetailsCacheModel = new CacheModel<TaxDetails>() {
			@Override
			public TaxDetails toEntityModel() {
				return _nullTaxDetails;
			}
		};
}