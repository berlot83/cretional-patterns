package com.molokotech.factories;

import org.springframework.stereotype.Service;

import com.molokotech.impl.Roach;
import com.molokotech.interfaces.InsectBehavor;

@Service
public class RoachFactory extends InsectBehavorFactory {

	@Override
	public InsectBehavor createInsectBehavor() {
		return new Roach();
	}

}
