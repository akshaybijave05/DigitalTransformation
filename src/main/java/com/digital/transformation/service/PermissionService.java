package com.digital.transformation.service;

import java.util.List;
import java.util.Optional;

import com.digital.transformation.entity.Permission;

public interface PermissionService {

	List<Permission> getAllPermissions();

	Optional<Permission> getPermissionById(Long id);

	Permission savePermission(Permission permission);

	void deletePermission(Long id);

}
