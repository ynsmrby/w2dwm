package com.w2dwm.app.util;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MapperUtil {

	@Bean
	public ModelMapper setup() {
		return new ModelMapper();
	}

}
