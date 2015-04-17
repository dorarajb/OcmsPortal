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

package com.ocms.course;

import com.liferay.portal.kernel.exception.PortalException;

/**
 * @author doraraj
 */
public class StudentRegistrationNotesException extends PortalException {

	public StudentRegistrationNotesException() {
		super();
	}

	public StudentRegistrationNotesException(String msg) {
		super(msg);
	}

	public StudentRegistrationNotesException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public StudentRegistrationNotesException(Throwable cause) {
		super(cause);
	}

}