package com.molokotech.factories;

import com.molokotech.interfaces.InsectBehavor;

public abstract class InsectBehavorFactory {

	public InsectBehavor create() {
		InsectBehavor ib = createInsectBehavor();
		ib.build();
		return ib;
	}

	public abstract InsectBehavor createInsectBehavor();

}
