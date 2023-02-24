package com.springboot.testkafka.payload;

import java.io.Serializable;

public class UserJbpm implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;

	private String name;

	private Integer age;

	private String role;

	private Integer workingTickets;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Integer getWorkingTickets() {
		return workingTickets;
	}

	public void setWorkingTickets(Integer workingTickets) {
		this.workingTickets = workingTickets;
	}

	public UserJbpm(Long id, String name, Integer age, String role, Integer workingTickets) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.role = role;
		this.workingTickets = workingTickets;
	}
	
	public UserJbpm() {
		
	}

	@Override
	public String toString() {
		return "UserJbpm [id=" + id + ", name=" + name + ", age=" + age + ", role=" + role + ", workingTickets="
				+ workingTickets + "]";
	}


	
}
