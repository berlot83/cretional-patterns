package com.molokotech.factories;

import com.molokotech.impl.Ant;
import com.molokotech.interfaces.InsectBehavor;

public class AntFactory extends InsectBehavorFactory {

	@Override
	public InsectBehavor createInsectBehavor() {
		return new Ant();
	}

}
