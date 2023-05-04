package com.molokotech.factories;

import org.springframework.stereotype.Service;

import com.molokotech.impl.Bee;
import com.molokotech.interfaces.InsectBehavor;

@Service
public class BeeFactory extends InsectBehavorFactory {

	@Override
	public InsectBehavor createInsectBehavor() {
		return new Bee();
	}

}
