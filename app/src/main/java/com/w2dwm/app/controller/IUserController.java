package com.w2dwm.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.w2dwm.app.domain.User;

@RestController("/user")
public interface IUserController {

	@GetMapping("/ping")
	public String ping();
	
	@PostMapping("/create")
	public User createUser(User student);

	@GetMapping("/get-all-user")
	public List<User> getAllUser();

}
