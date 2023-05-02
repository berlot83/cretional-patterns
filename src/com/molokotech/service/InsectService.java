package com.molokotech.service;

import com.molokotech.factories.AntFactory;
import com.molokotech.factories.BeeFactory;
import com.molokotech.factories.InsectBehavorFactory;
import com.molokotech.factories.RoachFactory;
import com.molokotech.model.Insect;
import com.molokotech.model.InsectBuilder;

public class InsectService {
	public void createBug() {
	}
	public static void main(String[] args) {
		System.out.println("=============== Builder and singleton pattern ==============");
		System.out.println("basic:");
		
		Insect i = Insect.getInstance().setName("oruga").setType("gusano").setFly(false).setAge(1);
		System.out.println(i);
		System.out.println("");
		
		System.out.println("advanced (inner class):");
		InsectBuilder build = InsectBuilder.Builder
												.newInstance()
													.setAge(1)
													.setFly(false)
													.setName("cucaracha")
													.setType("bug")
												.build();
		System.out.println(build);
		
		System.out.println("=============== Factory pattern ==============");
		InsectBehavorFactory antFactory = new AntFactory();
		antFactory.create();
		InsectBehavorFactory beeFactory = new BeeFactory();
		beeFactory.create();
		InsectBehavorFactory roachFactory = new RoachFactory();
		roachFactory.create();
	}
}
