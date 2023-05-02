package com.molokotech.impl;

import com.molokotech.interfaces.InsectBehavor;

public class Ant implements InsectBehavor {
	
	@Override
	public void build() {
		System.out.println("Ant");
	}
	
}
