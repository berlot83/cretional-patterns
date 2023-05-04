package com.molokotech.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.molokotech.impl.Ant;
import com.molokotech.interfaces.InsectBehavor;

@Service
public class AntFactory extends InsectBehavorFactory {

	@Autowired
	Ant ant;
	
	@Override
	public InsectBehavor createInsectBehavor() {
		return ant;
	}

}
