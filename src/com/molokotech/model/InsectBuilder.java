package com.molokotech.model;

public class InsectBuilder {

	private final String name;
	private final String type;
	private final boolean fly;
	private final Integer age;

	public InsectBuilder(Builder builder) {
		this.name = builder.name;
		this.type = builder.type;
		this.fly = builder.fly;
		this.age = builder.age;
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

	public static class Builder {

		private String name;
		private String type;
		private boolean fly;
		private Integer age;

		private Builder() {

		}

		public static Builder newInstance() {
			return new Builder();
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setType(String type) {
			this.type = type;
			return this;
		}

		public Builder setFly(boolean fly) {
			this.fly = fly;
			return this;
		}

		public Builder setAge(Integer age) {
			this.age = age;
			return this;
		}
		
		public InsectBuilder build() {
			return new InsectBuilder(this);
		}
	}
}
