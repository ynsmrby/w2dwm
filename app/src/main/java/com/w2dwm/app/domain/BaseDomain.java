package com.w2dwm.app.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class BaseDomain  implements  Serializable{

	private static final long serialVersionUID = 5822289126820910787L;
   
	public Long id;
 
}