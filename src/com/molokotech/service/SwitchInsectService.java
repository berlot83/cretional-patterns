package com.molokotech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.molokotech.factories.AntFactory;
import com.molokotech.factories.BeeFactory;
import com.molokotech.factories.RoachFactory;
import com.molokotech.interfaces.InsectBehavor;

@Service
public class SwitchInsectService {
	@Autowired
	AntFactory antService;

	@Autowired
	RoachFactory roachService;

	@Autowired
	BeeFactory beeService;

	public InsectBehavor switchClass(String _class) throws Exception {
		switch (_class) {
		case "ant":
			return antService.create();
		case "bee":
			return beeService.create();
		case "roach":
			return roachService.create();
		default:
			throw new Exception("No existe la clase seleccionada");
		}
	}
}
