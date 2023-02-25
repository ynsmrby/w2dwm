package com.w2dwm.app.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.w2dwm.app.domain.User;
import com.w2dwm.app.entity.UserEntity;
 
public interface UserRepository extends JpaRepository<UserEntity, User> {
 
}