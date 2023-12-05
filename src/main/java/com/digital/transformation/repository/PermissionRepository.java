package com.digital.transformation.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.digital.transformation.entity.Permission;

public interface PermissionRepository extends JpaRepository<Permission, Long> {

    
}
