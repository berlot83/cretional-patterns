package com.molokotech.model;

final public class Insect {

	private String name;
	private String type;
	private boolean fly;
	private Integer age;
	private static Insect insect;
	
	private Insect() {
		
	}
	
	public static Insect getInstance() {
		if (insect == null)
			insect = new Insect();
		return insect;
	}

	public Insect setName(String name) {
		this.name = name;
		return this;
	}

	public Insect setType(String type) {
		this.type = type;
		return this;
	}

	public Insect setFly(boolean fly) {
		this.fly = fly;
		return this;
	}

	public Insect setAge(Integer age) {
		this.age = age;
		return this;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public boolean isFly() {
		return fly;
	}

	public Integer getAge() {
		return age;
	}
	
	public String toString() {
		return "name: " + name
				+ "\ntype: " + type
				+ "\nfly: " + fly
				+ "\nage: " + age;
	}

}
