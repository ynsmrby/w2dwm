package com.w2dwm.app.domain;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class User extends BaseDomain {

	private static final long serialVersionUID = -6600372477958715615L;

	private String name;

	private String surname;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate birthDate;

	private String email;

	private String hashPassword;

}