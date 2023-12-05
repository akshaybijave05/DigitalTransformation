package com.digital.transformation.service;

import java.util.List;
import java.util.Optional;

import com.digital.transformation.entity.Role;

public interface RoleService {

	List<Role> getAllRoles();

	Optional<Role> getRoleById(Long id);

	Role saveRole(Role role);

	void deleteRole(Long id);

}
