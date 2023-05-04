package com.molokotech;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.molokotech.impl.Ant;
import com.molokotech.impl.Bee;
import com.molokotech.impl.Roach;

@Configuration
public class BeanConfig {

	
	@Bean
	public Bee getBee() {
		return new Bee();
	}
	
	@Bean
	public Ant getAnt() {
		return new Ant();
	}

	@Bean
	public Roach getRoach() {
		return new Roach();
	}
}
