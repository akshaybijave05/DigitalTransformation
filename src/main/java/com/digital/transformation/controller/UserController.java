package com.digital.transformation.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.digital.transformation.entity.User;
import com.digital.transformation.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	
	private UserService userService;

	@GetMapping
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/{id}")
	public User getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}

	@PostMapping
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}

	@PutMapping("/{id}")
	public User updateUser(@PathVariable int id, @RequestBody User updatedUser) {
		return userService.updateUser(id, updatedUser);
	}

	@PostMapping("/login")
	public User loginUser(@RequestParam String email, @RequestParam String password) {
		return userService.loginUser(email, password);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
	}
}
