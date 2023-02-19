package com.w2dwm.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.w2dwm.app.domain.Student;

@RestController()
public interface IMainController {

	@GetMapping("/ping")
	public String ping();
	
	@PostMapping("/ping")
	public Student createStudnet(Student student);

	@GetMapping("get-all-student")
	public List<Student> getAllStudent();

}
