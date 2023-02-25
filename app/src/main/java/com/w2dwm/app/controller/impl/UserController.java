package com.w2dwm.app.controller.impl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.w2dwm.app.controller.IUserController;
import com.w2dwm.app.domain.User;
import com.w2dwm.app.service.UserService;
import com.w2dwm.app.util.HashUtil;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class UserController implements IUserController {

	@Autowired
	private UserService service;

	@Override
	public String ping() {
		return "PROJECTS BUILD AND RUN";
	}

	@Override
	public User createUser(User user) {
		if (user.getHashPassword() != null) {
			user.setHashPassword(HashUtil.encode(user.getHashPassword()));
		}
		
		return service.createUser(user);
	}

	@Override
	public List<User> getAllUser() {
		return service.getAllUser();
	}

}
