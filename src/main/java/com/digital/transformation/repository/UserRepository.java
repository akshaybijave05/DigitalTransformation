package com.digital.transformation.repository;

import com.digital.transformation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByEmailAndPassword(String email, String password);
}
