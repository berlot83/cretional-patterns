package com.molokotech.impl;

import com.molokotech.interfaces.InsectBehavor;

public class Bee implements InsectBehavor {
	
	@Override
	public void build() {
		System.out.println("Bee");
	}

}
