package com.molokotech.factories;

import com.molokotech.impl.Bee;
import com.molokotech.interfaces.InsectBehavor;

public class BeeFactory extends InsectBehavorFactory {

	@Override
	public InsectBehavor createInsectBehavor() {
		return new Bee();
	}

}
