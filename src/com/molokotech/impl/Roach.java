package com.molokotech.impl;

import com.molokotech.interfaces.InsectBehavor;
import com.molokotech.model.Bug;

public class Roach extends Bug implements InsectBehavor {
	
	@Override
	public void build() {
		System.out.println("Roach");
	}

}
