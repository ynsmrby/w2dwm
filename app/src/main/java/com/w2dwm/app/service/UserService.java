package com.w2dwm.app.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.w2dwm.app.domain.User;
import com.w2dwm.app.entity.UserEntity;
import com.w2dwm.app.repo.UserRepository;
import com.w2dwm.app.util.MapperUtil;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	@Autowired
	private UserRepository repository;

	@Autowired
	private MapperUtil util;


	@Transactional
	public User createUser(User user) {
		UserEntity entity = util.setup().map(user, UserEntity.class);
		UserEntity response = repository.save(entity);
		return util.setup().map(response, User.class);
	}

	public List<User> getAllUser() {
		List<UserEntity> response = repository.findAll();
		List<User> list = new ArrayList<>();
		response.forEach(r -> list.add(util.setup().map(r, User.class)));
		return list;
	}

}
