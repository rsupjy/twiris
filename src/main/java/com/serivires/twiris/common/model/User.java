package com.serivires.twiris.common.model;

public class User {
	private String sequence;
	
	private String name;
	
	private String password;

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [sequence=" + sequence + ", name=" + name + ", password="
				+ password + "]";
	}
	
	
}
