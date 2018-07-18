package com.nt.domain;

public class Employee {
	private Integer EmployeeId;
	private String Name;
	private String Designation;
	private Double salary;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public Integer getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		EmployeeId = employeeId;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Employee(Integer employeeId, String name, String designation, Double salary) {
		super();
		EmployeeId = employeeId;
		Name = name;
		Designation = designation;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

}
