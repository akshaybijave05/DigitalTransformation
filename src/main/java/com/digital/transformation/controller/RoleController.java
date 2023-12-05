package com.digital.transformation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.digital.transformation.entity.Role;
import com.digital.transformation.service.RoleService;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RoleController {

	@Autowired
	private RoleService roleService;

	@GetMapping
	public List<Role> getAllRoles() {
		return roleService.getAllRoles();
	}

	@GetMapping("/{id}")
	public Role getRoleById(@PathVariable Long id) {
		return roleService.getRoleById(id).orElse(null);
	}

	@PostMapping
	public Role saveRole(@RequestBody Role role) {
		return roleService.saveRole(role);
	}

	@PutMapping("/{id}")
	public Role updateRole(@PathVariable Long id, @RequestBody Role role) {
		// Ensure the role ID in the path matches the ID in the request body
		if (!id.equals(role.getId())) {
			throw new IllegalArgumentException("Role ID mismatch");
		}
		return roleService.saveRole(role);
	}

	@DeleteMapping("/{id}")
	public void deleteRole(@PathVariable Long id) {
		roleService.deleteRole(id);
	}
}
