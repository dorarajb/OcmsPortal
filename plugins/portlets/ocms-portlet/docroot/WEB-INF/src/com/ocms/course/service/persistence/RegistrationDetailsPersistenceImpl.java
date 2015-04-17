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

import com.ocms.course.NoSuchRegistrationDetailsException;
import com.ocms.course.model.RegistrationDetails;
import com.ocms.course.model.impl.RegistrationDetailsImpl;
import com.ocms.course.model.impl.RegistrationDetailsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the registration details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author doraraj
 * @see RegistrationDetailsPersistence
 * @see RegistrationDetailsUtil
 * @generated
 */
public class RegistrationDetailsPersistenceImpl extends BasePersistenceImpl<RegistrationDetails>
	implements RegistrationDetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RegistrationDetailsUtil} to access the registration details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RegistrationDetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RegistrationDetailsModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationDetailsModelImpl.FINDER_CACHE_ENABLED,
			RegistrationDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RegistrationDetailsModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationDetailsModelImpl.FINDER_CACHE_ENABLED,
			RegistrationDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RegistrationDetailsModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(RegistrationDetailsModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationDetailsModelImpl.FINDER_CACHE_ENABLED,
			RegistrationDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(RegistrationDetailsModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationDetailsModelImpl.FINDER_CACHE_ENABLED,
			RegistrationDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			RegistrationDetailsModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(RegistrationDetailsModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the registration detailses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching registration detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RegistrationDetails> findByGroupId(long groupId)
		throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the registration detailses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.RegistrationDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of registration detailses
	 * @param end the upper bound of the range of registration detailses (not inclusive)
	 * @return the range of matching registration detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RegistrationDetails> findByGroupId(long groupId, int start,
		int end) throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the registration detailses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.RegistrationDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of registration detailses
	 * @param end the upper bound of the range of registration detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching registration detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RegistrationDetails> findByGroupId(long groupId, int start,
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

		List<RegistrationDetails> list = (List<RegistrationDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (RegistrationDetails registrationDetails : list) {
				if ((groupId != registrationDetails.getGroupId())) {
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

			query.append(_SQL_SELECT_REGISTRATIONDETAILS_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(RegistrationDetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<RegistrationDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<RegistrationDetails>(list);
				}
				else {
					list = (List<RegistrationDetails>)QueryUtil.list(q,
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
	 * Returns the first registration details in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration details
	 * @throws com.ocms.course.NoSuchRegistrationDetailsException if a matching registration details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegistrationDetails findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchRegistrationDetailsException, SystemException {
		RegistrationDetails registrationDetails = fetchByGroupId_First(groupId,
				orderByComparator);

		if (registrationDetails != null) {
			return registrationDetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRegistrationDetailsException(msg.toString());
	}

	/**
	 * Returns the first registration details in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration details, or <code>null</code> if a matching registration details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegistrationDetails fetchByGroupId_First(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<RegistrationDetails> list = findByGroupId(groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last registration details in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration details
	 * @throws com.ocms.course.NoSuchRegistrationDetailsException if a matching registration details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegistrationDetails findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchRegistrationDetailsException, SystemException {
		RegistrationDetails registrationDetails = fetchByGroupId_Last(groupId,
				orderByComparator);

		if (registrationDetails != null) {
			return registrationDetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRegistrationDetailsException(msg.toString());
	}

	/**
	 * Returns the last registration details in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration details, or <code>null</code> if a matching registration details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegistrationDetails fetchByGroupId_Last(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<RegistrationDetails> list = findByGroupId(groupId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the registration detailses before and after the current registration details in the ordered set where groupId = &#63;.
	 *
	 * @param registrationDetailsId the primary key of the current registration details
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next registration details
	 * @throws com.ocms.course.NoSuchRegistrationDetailsException if a registration details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegistrationDetails[] findByGroupId_PrevAndNext(
		long registrationDetailsId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchRegistrationDetailsException, SystemException {
		RegistrationDetails registrationDetails = findByPrimaryKey(registrationDetailsId);

		Session session = null;

		try {
			session = openSession();

			RegistrationDetails[] array = new RegistrationDetailsImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, registrationDetails,
					groupId, orderByComparator, true);

			array[1] = registrationDetails;

			array[2] = getByGroupId_PrevAndNext(session, registrationDetails,
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

	protected RegistrationDetails getByGroupId_PrevAndNext(Session session,
		RegistrationDetails registrationDetails, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_REGISTRATIONDETAILS_WHERE);

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
			query.append(RegistrationDetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(registrationDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<RegistrationDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the registration detailses where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupId(long groupId) throws SystemException {
		for (RegistrationDetails registrationDetails : findByGroupId(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(registrationDetails);
		}
	}

	/**
	 * Returns the number of registration detailses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching registration detailses
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

			query.append(_SQL_COUNT_REGISTRATIONDETAILS_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "registrationDetails.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REGISTRATIONDETAILSID =
		new FinderPath(RegistrationDetailsModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationDetailsModelImpl.FINDER_CACHE_ENABLED,
			RegistrationDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByRegistrationDetailsId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTRATIONDETAILSID =
		new FinderPath(RegistrationDetailsModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationDetailsModelImpl.FINDER_CACHE_ENABLED,
			RegistrationDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByRegistrationDetailsId",
			new String[] { Long.class.getName() },
			RegistrationDetailsModelImpl.REGISTRATIONDETAILSID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REGISTRATIONDETAILSID = new FinderPath(RegistrationDetailsModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByRegistrationDetailsId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the registration detailses where registrationDetailsId = &#63;.
	 *
	 * @param registrationDetailsId the registration details ID
	 * @return the matching registration detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RegistrationDetails> findByRegistrationDetailsId(
		long registrationDetailsId) throws SystemException {
		return findByRegistrationDetailsId(registrationDetailsId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the registration detailses where registrationDetailsId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.RegistrationDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param registrationDetailsId the registration details ID
	 * @param start the lower bound of the range of registration detailses
	 * @param end the upper bound of the range of registration detailses (not inclusive)
	 * @return the range of matching registration detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RegistrationDetails> findByRegistrationDetailsId(
		long registrationDetailsId, int start, int end)
		throws SystemException {
		return findByRegistrationDetailsId(registrationDetailsId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the registration detailses where registrationDetailsId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.RegistrationDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param registrationDetailsId the registration details ID
	 * @param start the lower bound of the range of registration detailses
	 * @param end the upper bound of the range of registration detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching registration detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RegistrationDetails> findByRegistrationDetailsId(
		long registrationDetailsId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTRATIONDETAILSID;
			finderArgs = new Object[] { registrationDetailsId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REGISTRATIONDETAILSID;
			finderArgs = new Object[] {
					registrationDetailsId,
					
					start, end, orderByComparator
				};
		}

		List<RegistrationDetails> list = (List<RegistrationDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (RegistrationDetails registrationDetails : list) {
				if ((registrationDetailsId != registrationDetails.getRegistrationDetailsId())) {
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

			query.append(_SQL_SELECT_REGISTRATIONDETAILS_WHERE);

			query.append(_FINDER_COLUMN_REGISTRATIONDETAILSID_REGISTRATIONDETAILSID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(RegistrationDetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(registrationDetailsId);

				if (!pagination) {
					list = (List<RegistrationDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<RegistrationDetails>(list);
				}
				else {
					list = (List<RegistrationDetails>)QueryUtil.list(q,
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
	 * Returns the first registration details in the ordered set where registrationDetailsId = &#63;.
	 *
	 * @param registrationDetailsId the registration details ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration details
	 * @throws com.ocms.course.NoSuchRegistrationDetailsException if a matching registration details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegistrationDetails findByRegistrationDetailsId_First(
		long registrationDetailsId, OrderByComparator orderByComparator)
		throws NoSuchRegistrationDetailsException, SystemException {
		RegistrationDetails registrationDetails = fetchByRegistrationDetailsId_First(registrationDetailsId,
				orderByComparator);

		if (registrationDetails != null) {
			return registrationDetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("registrationDetailsId=");
		msg.append(registrationDetailsId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRegistrationDetailsException(msg.toString());
	}

	/**
	 * Returns the first registration details in the ordered set where registrationDetailsId = &#63;.
	 *
	 * @param registrationDetailsId the registration details ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration details, or <code>null</code> if a matching registration details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegistrationDetails fetchByRegistrationDetailsId_First(
		long registrationDetailsId, OrderByComparator orderByComparator)
		throws SystemException {
		List<RegistrationDetails> list = findByRegistrationDetailsId(registrationDetailsId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last registration details in the ordered set where registrationDetailsId = &#63;.
	 *
	 * @param registrationDetailsId the registration details ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration details
	 * @throws com.ocms.course.NoSuchRegistrationDetailsException if a matching registration details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegistrationDetails findByRegistrationDetailsId_Last(
		long registrationDetailsId, OrderByComparator orderByComparator)
		throws NoSuchRegistrationDetailsException, SystemException {
		RegistrationDetails registrationDetails = fetchByRegistrationDetailsId_Last(registrationDetailsId,
				orderByComparator);

		if (registrationDetails != null) {
			return registrationDetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("registrationDetailsId=");
		msg.append(registrationDetailsId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRegistrationDetailsException(msg.toString());
	}

	/**
	 * Returns the last registration details in the ordered set where registrationDetailsId = &#63;.
	 *
	 * @param registrationDetailsId the registration details ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration details, or <code>null</code> if a matching registration details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegistrationDetails fetchByRegistrationDetailsId_Last(
		long registrationDetailsId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByRegistrationDetailsId(registrationDetailsId);

		if (count == 0) {
			return null;
		}

		List<RegistrationDetails> list = findByRegistrationDetailsId(registrationDetailsId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the registration detailses where registrationDetailsId = &#63; from the database.
	 *
	 * @param registrationDetailsId the registration details ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRegistrationDetailsId(long registrationDetailsId)
		throws SystemException {
		for (RegistrationDetails registrationDetails : findByRegistrationDetailsId(
				registrationDetailsId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(registrationDetails);
		}
	}

	/**
	 * Returns the number of registration detailses where registrationDetailsId = &#63;.
	 *
	 * @param registrationDetailsId the registration details ID
	 * @return the number of matching registration detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByRegistrationDetailsId(long registrationDetailsId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REGISTRATIONDETAILSID;

		Object[] finderArgs = new Object[] { registrationDetailsId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_REGISTRATIONDETAILS_WHERE);

			query.append(_FINDER_COLUMN_REGISTRATIONDETAILSID_REGISTRATIONDETAILSID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(registrationDetailsId);

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

	private static final String _FINDER_COLUMN_REGISTRATIONDETAILSID_REGISTRATIONDETAILSID_2 =
		"registrationDetails.registrationDetailsId = ?";

	public RegistrationDetailsPersistenceImpl() {
		setModelClass(RegistrationDetails.class);
	}

	/**
	 * Caches the registration details in the entity cache if it is enabled.
	 *
	 * @param registrationDetails the registration details
	 */
	@Override
	public void cacheResult(RegistrationDetails registrationDetails) {
		EntityCacheUtil.putResult(RegistrationDetailsModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationDetailsImpl.class, registrationDetails.getPrimaryKey(),
			registrationDetails);

		registrationDetails.resetOriginalValues();
	}

	/**
	 * Caches the registration detailses in the entity cache if it is enabled.
	 *
	 * @param registrationDetailses the registration detailses
	 */
	@Override
	public void cacheResult(List<RegistrationDetails> registrationDetailses) {
		for (RegistrationDetails registrationDetails : registrationDetailses) {
			if (EntityCacheUtil.getResult(
						RegistrationDetailsModelImpl.ENTITY_CACHE_ENABLED,
						RegistrationDetailsImpl.class,
						registrationDetails.getPrimaryKey()) == null) {
				cacheResult(registrationDetails);
			}
			else {
				registrationDetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all registration detailses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(RegistrationDetailsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(RegistrationDetailsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the registration details.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RegistrationDetails registrationDetails) {
		EntityCacheUtil.removeResult(RegistrationDetailsModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationDetailsImpl.class, registrationDetails.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<RegistrationDetails> registrationDetailses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (RegistrationDetails registrationDetails : registrationDetailses) {
			EntityCacheUtil.removeResult(RegistrationDetailsModelImpl.ENTITY_CACHE_ENABLED,
				RegistrationDetailsImpl.class,
				registrationDetails.getPrimaryKey());
		}
	}

	/**
	 * Creates a new registration details with the primary key. Does not add the registration details to the database.
	 *
	 * @param registrationDetailsId the primary key for the new registration details
	 * @return the new registration details
	 */
	@Override
	public RegistrationDetails create(long registrationDetailsId) {
		RegistrationDetails registrationDetails = new RegistrationDetailsImpl();

		registrationDetails.setNew(true);
		registrationDetails.setPrimaryKey(registrationDetailsId);

		return registrationDetails;
	}

	/**
	 * Removes the registration details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param registrationDetailsId the primary key of the registration details
	 * @return the registration details that was removed
	 * @throws com.ocms.course.NoSuchRegistrationDetailsException if a registration details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegistrationDetails remove(long registrationDetailsId)
		throws NoSuchRegistrationDetailsException, SystemException {
		return remove((Serializable)registrationDetailsId);
	}

	/**
	 * Removes the registration details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the registration details
	 * @return the registration details that was removed
	 * @throws com.ocms.course.NoSuchRegistrationDetailsException if a registration details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegistrationDetails remove(Serializable primaryKey)
		throws NoSuchRegistrationDetailsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			RegistrationDetails registrationDetails = (RegistrationDetails)session.get(RegistrationDetailsImpl.class,
					primaryKey);

			if (registrationDetails == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRegistrationDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(registrationDetails);
		}
		catch (NoSuchRegistrationDetailsException nsee) {
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
	protected RegistrationDetails removeImpl(
		RegistrationDetails registrationDetails) throws SystemException {
		registrationDetails = toUnwrappedModel(registrationDetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(registrationDetails)) {
				registrationDetails = (RegistrationDetails)session.get(RegistrationDetailsImpl.class,
						registrationDetails.getPrimaryKeyObj());
			}

			if (registrationDetails != null) {
				session.delete(registrationDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (registrationDetails != null) {
			clearCache(registrationDetails);
		}

		return registrationDetails;
	}

	@Override
	public RegistrationDetails updateImpl(
		com.ocms.course.model.RegistrationDetails registrationDetails)
		throws SystemException {
		registrationDetails = toUnwrappedModel(registrationDetails);

		boolean isNew = registrationDetails.isNew();

		RegistrationDetailsModelImpl registrationDetailsModelImpl = (RegistrationDetailsModelImpl)registrationDetails;

		Session session = null;

		try {
			session = openSession();

			if (registrationDetails.isNew()) {
				session.save(registrationDetails);

				registrationDetails.setNew(false);
			}
			else {
				session.merge(registrationDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !RegistrationDetailsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((registrationDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						registrationDetailsModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { registrationDetailsModelImpl.getGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((registrationDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTRATIONDETAILSID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						registrationDetailsModelImpl.getOriginalRegistrationDetailsId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGISTRATIONDETAILSID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTRATIONDETAILSID,
					args);

				args = new Object[] {
						registrationDetailsModelImpl.getRegistrationDetailsId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGISTRATIONDETAILSID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTRATIONDETAILSID,
					args);
			}
		}

		EntityCacheUtil.putResult(RegistrationDetailsModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationDetailsImpl.class, registrationDetails.getPrimaryKey(),
			registrationDetails);

		return registrationDetails;
	}

	protected RegistrationDetails toUnwrappedModel(
		RegistrationDetails registrationDetails) {
		if (registrationDetails instanceof RegistrationDetailsImpl) {
			return registrationDetails;
		}

		RegistrationDetailsImpl registrationDetailsImpl = new RegistrationDetailsImpl();

		registrationDetailsImpl.setNew(registrationDetails.isNew());
		registrationDetailsImpl.setPrimaryKey(registrationDetails.getPrimaryKey());

		registrationDetailsImpl.setStudRegId(registrationDetails.getStudRegId());
		registrationDetailsImpl.setContactId(registrationDetails.getContactId());
		registrationDetailsImpl.setEventId(registrationDetails.getEventId());
		registrationDetailsImpl.setPrice(registrationDetails.getPrice());
		registrationDetailsImpl.setDiscount(registrationDetails.getDiscount());
		registrationDetailsImpl.setFee(registrationDetails.getFee());
		registrationDetailsImpl.setCredit(registrationDetails.getCredit());
		registrationDetailsImpl.setRegistrationDetailsId(registrationDetails.getRegistrationDetailsId());
		registrationDetailsImpl.setGroupId(registrationDetails.getGroupId());
		registrationDetailsImpl.setCompanyId(registrationDetails.getCompanyId());
		registrationDetailsImpl.setUserId(registrationDetails.getUserId());
		registrationDetailsImpl.setUserName(registrationDetails.getUserName());
		registrationDetailsImpl.setCreateDate(registrationDetails.getCreateDate());
		registrationDetailsImpl.setModifiedDate(registrationDetails.getModifiedDate());

		return registrationDetailsImpl;
	}

	/**
	 * Returns the registration details with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the registration details
	 * @return the registration details
	 * @throws com.ocms.course.NoSuchRegistrationDetailsException if a registration details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegistrationDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRegistrationDetailsException, SystemException {
		RegistrationDetails registrationDetails = fetchByPrimaryKey(primaryKey);

		if (registrationDetails == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRegistrationDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return registrationDetails;
	}

	/**
	 * Returns the registration details with the primary key or throws a {@link com.ocms.course.NoSuchRegistrationDetailsException} if it could not be found.
	 *
	 * @param registrationDetailsId the primary key of the registration details
	 * @return the registration details
	 * @throws com.ocms.course.NoSuchRegistrationDetailsException if a registration details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegistrationDetails findByPrimaryKey(long registrationDetailsId)
		throws NoSuchRegistrationDetailsException, SystemException {
		return findByPrimaryKey((Serializable)registrationDetailsId);
	}

	/**
	 * Returns the registration details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the registration details
	 * @return the registration details, or <code>null</code> if a registration details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegistrationDetails fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		RegistrationDetails registrationDetails = (RegistrationDetails)EntityCacheUtil.getResult(RegistrationDetailsModelImpl.ENTITY_CACHE_ENABLED,
				RegistrationDetailsImpl.class, primaryKey);

		if (registrationDetails == _nullRegistrationDetails) {
			return null;
		}

		if (registrationDetails == null) {
			Session session = null;

			try {
				session = openSession();

				registrationDetails = (RegistrationDetails)session.get(RegistrationDetailsImpl.class,
						primaryKey);

				if (registrationDetails != null) {
					cacheResult(registrationDetails);
				}
				else {
					EntityCacheUtil.putResult(RegistrationDetailsModelImpl.ENTITY_CACHE_ENABLED,
						RegistrationDetailsImpl.class, primaryKey,
						_nullRegistrationDetails);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(RegistrationDetailsModelImpl.ENTITY_CACHE_ENABLED,
					RegistrationDetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return registrationDetails;
	}

	/**
	 * Returns the registration details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param registrationDetailsId the primary key of the registration details
	 * @return the registration details, or <code>null</code> if a registration details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RegistrationDetails fetchByPrimaryKey(long registrationDetailsId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)registrationDetailsId);
	}

	/**
	 * Returns all the registration detailses.
	 *
	 * @return the registration detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RegistrationDetails> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<RegistrationDetails> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the registration detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ocms.course.model.impl.RegistrationDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of registration detailses
	 * @param end the upper bound of the range of registration detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of registration detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<RegistrationDetails> findAll(int start, int end,
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

		List<RegistrationDetails> list = (List<RegistrationDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_REGISTRATIONDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_REGISTRATIONDETAILS;

				if (pagination) {
					sql = sql.concat(RegistrationDetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<RegistrationDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<RegistrationDetails>(list);
				}
				else {
					list = (List<RegistrationDetails>)QueryUtil.list(q,
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
	 * Removes all the registration detailses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (RegistrationDetails registrationDetails : findAll()) {
			remove(registrationDetails);
		}
	}

	/**
	 * Returns the number of registration detailses.
	 *
	 * @return the number of registration detailses
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

				Query q = session.createQuery(_SQL_COUNT_REGISTRATIONDETAILS);

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
	 * Initializes the registration details persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.ocms.course.model.RegistrationDetails")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<RegistrationDetails>> listenersList = new ArrayList<ModelListener<RegistrationDetails>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<RegistrationDetails>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(RegistrationDetailsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_REGISTRATIONDETAILS = "SELECT registrationDetails FROM RegistrationDetails registrationDetails";
	private static final String _SQL_SELECT_REGISTRATIONDETAILS_WHERE = "SELECT registrationDetails FROM RegistrationDetails registrationDetails WHERE ";
	private static final String _SQL_COUNT_REGISTRATIONDETAILS = "SELECT COUNT(registrationDetails) FROM RegistrationDetails registrationDetails";
	private static final String _SQL_COUNT_REGISTRATIONDETAILS_WHERE = "SELECT COUNT(registrationDetails) FROM RegistrationDetails registrationDetails WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "registrationDetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RegistrationDetails exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No RegistrationDetails exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(RegistrationDetailsPersistenceImpl.class);
	private static RegistrationDetails _nullRegistrationDetails = new RegistrationDetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<RegistrationDetails> toCacheModel() {
				return _nullRegistrationDetailsCacheModel;
			}
		};

	private static CacheModel<RegistrationDetails> _nullRegistrationDetailsCacheModel =
		new CacheModel<RegistrationDetails>() {
			@Override
			public RegistrationDetails toEntityModel() {
				return _nullRegistrationDetails;
			}
		};
}