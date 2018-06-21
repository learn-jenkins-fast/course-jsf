package com.example.course.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="helloWorldBean")
@RequestScoped
public class CourseBean {
	String name= "Enterprise Java Development";
	String code = "E650";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}


}
