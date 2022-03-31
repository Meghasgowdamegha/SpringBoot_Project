package com.cg.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee
{
private Integer id;
private String name;
private Integer dob;
private float salary;
private String address;
private String designation;
private String shop_id;

public Employee(Integer id, String name, Integer dob, float salary, String address, String designation,String shop_id) 
{
	this.id = id;
	this.name = name;
	this.dob = dob;
	this.salary = salary;
	this.address = address;
	this.designation = designation;
	this.shop_id = shop_id;
}

//Default constructor
public Employee() 
{
	super();
}

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getDob() {
	return dob;
}
public void setDob(Integer dob) {
	this.dob = dob;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getShop_id() {
	return shop_id;
}
public void setShop_id(String shop_id) {
	this.shop_id = shop_id;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + ", salary=" + salary + ", address=" + address
			+ ", designation=" + designation + ", shop_id=" + shop_id + "]";
}


}
