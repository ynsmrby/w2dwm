package com.w2dwm.app.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "USER_INFO")
@Data
public class UserEntity extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3232380324543282578L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "SURNAME")
	private String surname;

	@Column(name = "BIRTHDAY")
	private LocalDate birthDate;

	@Column(name = "PASSWORD")
	private String hashPassword;

}