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

package com.liferay.portal.workflow.kaleo.runtime.node;

import com.liferay.portal.workflow.kaleo.util.NodeTypeDependentObjectRegistry;

import java.util.Map;

/**
 * @author Michael C. Han
 */
public class NodeExecutorFactory {

	public static NodeExecutor getNodeExecutor(String nodeTypeString) {
		return _nodeExecutors.getNodeTypeDependentObjects(nodeTypeString);
	}

	public void setNodeExectors(Map<String, NodeExecutor> nodeExecutors) {
		_nodeExecutors.setNodeTypeDependentObjects(nodeExecutors);
	}

	private static NodeTypeDependentObjectRegistry<NodeExecutor>
		_nodeExecutors = new NodeTypeDependentObjectRegistry<NodeExecutor>();

}