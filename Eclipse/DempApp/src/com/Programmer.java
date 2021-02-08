package com;

public class Programmer extends Employee{
private String projectName;
void setProject(String projectName) {
	this.projectName = projectName;
}
void displayPrg() {
	System.out.println("Project Name is "+projectName);
}
}
