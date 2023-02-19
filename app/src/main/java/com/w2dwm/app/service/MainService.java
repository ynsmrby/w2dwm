package com.w2dwm.app.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.w2dwm.app.domain.Student;
import com.w2dwm.app.entity.StudentEntity;
import com.w2dwm.app.repo.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MainService {

	@Autowired
	private StudentRepository studentRepository;

	public String ping() {
		// TODO Auto-generated method stub
		return "PROJECTS BUILD AND RUN";
	}

	@Transactional
	public Student createStudnet(Student student) {
		return mappingDomain(studentRepository.save(mappingEntity(student)));
	}

	private StudentEntity mappingEntity(Student student) {
		StudentEntity entity = new StudentEntity();
		entity.setEmail(student.getEmail());
		entity.setName(student.getName());
		return entity;
	}

	private Student mappingDomain(StudentEntity student) {
		Student entity = new Student();
		entity.setEmail(student.getEmail());
		entity.setName(student.getName());
		entity.setId(student.getId());
		return entity;
	}

	public List<Student> getAllStudent() {
		List<Student> list = new ArrayList<Student>();
		studentRepository.findAll().forEach(entiti -> list.add(mappingDomain(entiti)));
		return list;
	}

}
