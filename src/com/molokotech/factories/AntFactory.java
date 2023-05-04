package com.molokotech.factories;

import org.springframework.stereotype.Service;

import com.molokotech.impl.Ant;
import com.molokotech.interfaces.InsectBehavor;

@Service
public class AntFactory extends InsectBehavorFactory {

	@Override
	public InsectBehavor createInsectBehavor() {
		return new Ant();
	}

}
