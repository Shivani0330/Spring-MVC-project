package com.company.model;

public class Department {

	private long id;
	private String name;
	private String manager;
	private int numberOfEmployees;
	private String createdDate;
	
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getManager() {
		return manager;
	}
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", manager=" + manager + ", numberOfEmployees="
				+ numberOfEmployees + ", createdDate=" + createdDate + "]";
	}
	
	
}
