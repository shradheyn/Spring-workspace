package com.coforge.training.springcore.model;
/**
* Author   : Shradhey.Naudiyal
* Date     : Sep 26, 2025
* Time     : 4:16:48 PM
* Project  : spring-core
*/
public class Student {
	
	private int rollNo;
	private String name,college;
	private double marks;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	
}
