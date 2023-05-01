package com.molokotech.service;

import com.molokotech.model.Insect;
import com.molokotech.model.InsectBuilder;

public class InsectService {
	public void createBug() {
	}
	public static void main(String[] args) {
		Insect i = Insect.getInstance().setName("oruga").setType("gusano").setFly(false).setAge(1);
		System.out.println(i);
		System.out.println("");
		InsectBuilder build = InsectBuilder.Builder
												.newInstance()
													.setAge(1)
													.setFly(false)
													.setName("cucaracha")
													.setType("bug")
												.build();
		System.out.println(build);
	}
}
