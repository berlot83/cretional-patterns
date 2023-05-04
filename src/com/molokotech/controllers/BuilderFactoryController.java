package com.molokotech.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.molokotech.interfaces.InsectBehavor;
import com.molokotech.service.SwitchInsectService;

@RestController
@RequestMapping("/entity")
public class BuilderFactoryController {

	@Autowired
	SwitchInsectService sif;
	
	@GetMapping("/")
	public InsectBehavor getEntity(@RequestParam String clase) throws Exception {
		return sif.switchClass(clase);
	}
	
}
