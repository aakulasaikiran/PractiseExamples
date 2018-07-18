package com.nt.domain;

public class Student {
	private Integer rollno;
	private String name;
	private String study;
	private Integer marks;
	private Character grade;
	public Integer getRollno() {
		return rollno;
	}
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudy() {
		return study;
	}
	public void setStudy(String study) {
		this.study = study;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	public Character getGrade() {
		return grade;
	}
	public void setGrade(Character grade) {
		this.grade = grade;
	}
	public Student(Integer rollno, String name, String study, Integer marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.study = study;
		this.marks = marks;
	}

}
