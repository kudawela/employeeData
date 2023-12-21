package com.springboot.crud.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity; // javax.
import jakarta.persistence.Id;
import jakarta.persistence.Table; //javax

@Entity
@Table(name = "Employee")
public class Employee {
	
	@Id
	@Generated(value = { "mm" })
	private int id;
	private String name;
	private int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
