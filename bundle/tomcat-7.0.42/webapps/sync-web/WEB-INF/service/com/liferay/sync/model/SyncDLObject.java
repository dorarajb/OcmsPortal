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

package com.liferay.sync.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the SyncDLObject service. Represents a row in the &quot;SyncDLObject&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SyncDLObjectModel
 * @see com.liferay.sync.model.impl.SyncDLObjectImpl
 * @see com.liferay.sync.model.impl.SyncDLObjectModelImpl
 * @generated
 */
public interface SyncDLObject extends SyncDLObjectModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.liferay.sync.model.impl.SyncDLObjectImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public void setCreateDate(java.util.Date createDate);

	public void setModifiedDate(java.util.Date modifiedDate);
}