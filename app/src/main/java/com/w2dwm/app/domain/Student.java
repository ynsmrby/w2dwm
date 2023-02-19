package com.w2dwm.app.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student  extends BaseDomain{

	private static final long serialVersionUID = -6600372477958715615L;

	private Integer id;
 
    private String name;
    
    private String email;
 
}