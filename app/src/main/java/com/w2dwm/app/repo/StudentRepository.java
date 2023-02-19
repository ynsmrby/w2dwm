package com.w2dwm.app.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.w2dwm.app.domain.Student;
import com.w2dwm.app.entity.StudentEntity;
 
public interface StudentRepository extends JpaRepository<StudentEntity, Student> {
 
}