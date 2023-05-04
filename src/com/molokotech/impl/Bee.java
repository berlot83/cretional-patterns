package com.molokotech.impl;

import org.springframework.stereotype.Component;
import com.molokotech.interfaces.InsectBehavor;

@Component
public class Bee implements InsectBehavor {
	
	@Override
	public void build() {
		System.out.println("Bee");
	}

}
