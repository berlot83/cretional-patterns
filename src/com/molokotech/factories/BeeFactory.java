package com.molokotech.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.molokotech.impl.Bee;
import com.molokotech.interfaces.InsectBehavor;

@Service
public class BeeFactory extends InsectBehavorFactory {

	@Autowired
	Bee bee;
	
	@Override
	public InsectBehavor createInsectBehavor() {
		return bee;
	}

}
