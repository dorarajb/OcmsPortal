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

package com.liferay.portal.workflow.kaleo.export;

import com.liferay.portal.kernel.xml.Element;
import com.liferay.portal.workflow.kaleo.definition.Node;
import com.liferay.portal.workflow.kaleo.definition.State;

/**
 * @author Michael C. Han
 */
public class StateNodeExporter
	extends BaseNodeExporter implements NodeExporter {


	protected Element createNodeElement(Element element, String namespace) {
		return element.addElement("state", namespace);
	}


	protected void exportAdditionalNodeElements(
		Node node, Element nodeElement) {

		exportTimersElement(node, nodeElement, "timers", "timer");

		State state = (State)node;

		boolean initial = state.isInitial();

		if (initial) {
			addTextElement(nodeElement, "initial", String.valueOf(initial));
		}
	}

}