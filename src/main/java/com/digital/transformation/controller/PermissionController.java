package com.digital.transformation.controller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.digital.transformation.entity.Permission;
import com.digital.transformation.service.PermissionService;

import java.util.List;

@RestController
@RequestMapping("/api/permissions")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    @GetMapping
    public List<Permission> getAllPermissions() {
        return permissionService.getAllPermissions();
    }

    @GetMapping("/{id}")
    public Permission getPermissionById(@PathVariable Long id) {
        return permissionService.getPermissionById(id).orElse(null);
    }

    @PostMapping
    public Permission savePermission(@RequestBody Permission permission) {
        return permissionService.savePermission(permission);
    }

    @PutMapping("/{id}")
    public Permission updatePermission(@PathVariable Long id, @RequestBody Permission permission) {
        // Ensure the permission ID in the path matches the ID in the request body
        if (!id.equals(permission.getId())) {
            throw new IllegalArgumentException("Permission ID mismatch");
        }
        return permissionService.savePermission(permission);
    }

    @DeleteMapping("/{id}")
    public void deletePermission(@PathVariable Long id) {
        permissionService.deletePermission(id);
    }
}

