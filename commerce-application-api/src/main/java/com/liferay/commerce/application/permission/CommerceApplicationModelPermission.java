/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.commerce.application.permission;

import com.liferay.commerce.application.model.CommerceApplicationModel;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;

/**
 * @author Alessio Antonio Rendina
 */
public interface CommerceApplicationModelPermission {

	public void check(
			PermissionChecker permissionChecker,
			CommerceApplicationModel commerceApplicationModel, String actionId)
		throws PortalException;

	public void check(
			PermissionChecker permissionChecker,
			long commerceApplicationModelId, String actionId)
		throws PortalException;

	public boolean contains(
			PermissionChecker permissionChecker,
			CommerceApplicationModel commerceApplicationModel, String actionId)
		throws PortalException;

	public boolean contains(
			PermissionChecker permissionChecker,
			long commerceApplicationModelId, String actionId)
		throws PortalException;

	public boolean contains(
			PermissionChecker permissionChecker,
			long[] commerceApplicationModelIds, String actionId)
		throws PortalException;

}