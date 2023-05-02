package com.molokotech.factories;

import com.molokotech.impl.Roach;
import com.molokotech.interfaces.InsectBehavor;

public class RoachFactory extends InsectBehavorFactory {

	@Override
	public InsectBehavor createInsectBehavor() {
		return new Roach();
	}

}
