package edu.cpcc.labs.demo.model;

import java.util.List;

public class Student {
   private String name;
   public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public List<String> getCourses() {
	return courses;
}
public void setCourses(List<String> courses) {
	this.courses = courses;
}
private String lastName;
   private Long  id;
   private List<String> courses;
}
