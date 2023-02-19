package com.w2dwm.app.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.w2dwm.app.controller.IMainController;
import com.w2dwm.app.domain.Student;
import com.w2dwm.app.repo.StudentRepository;
import com.w2dwm.app.service.MainService;

@SpringBootApplication
public class MainController implements IMainController {

	@Autowired
	private MainService service;

	@Override
	public String ping() {
		// TODO Auto-generated method stub
		return "PROJECTS BUILD AND RUN";
	}

	@Override
	public Student createStudnet(Student student) {
		return service.createStudnet(student);
	}

	@Override
	public List<Student> getAllStudent() {
		return service.getAllStudent();
	}

}
