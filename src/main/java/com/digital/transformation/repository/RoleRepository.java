package com.digital.transformation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digital.transformation.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    // Additional query methods if needed
}
