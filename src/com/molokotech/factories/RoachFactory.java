package com.molokotech.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.molokotech.impl.Roach;
import com.molokotech.interfaces.InsectBehavor;

@Service
public class RoachFactory extends InsectBehavorFactory {

	@Autowired
	Roach roach;
	
	@Override
	public InsectBehavor createInsectBehavor() {
		return roach;
	}

}
