package com.jackrutorial.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
@Entity
@Table(name="customer")
public class Customer {

 @Override
	public String toString() {
		return "Customer [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender
				+ ", address=" + address + "]";
	}

@Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 
 @Column(name = "firstname")
 @NotEmpty
 @Size(min = 6, max = 15, message = "please enter firstname as CostaRica")
 private String firstname;
 
 @Column(name = "lastname")
 private String lastname;
 
 @Column(name = "gender")
 private String gender;
 
 @Range(min = 5, max = 150)
 @Column(name = "address")
 private String address;

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getFirstname() {
  return firstname;
 }

 public void setFirstname(String firstname) {
  this.firstname = firstname;
 }

 public String getLastname() {
  return lastname;
 }

 public void setLastname(String lastname) {
  this.lastname = lastname;
 }

 public String getGender() {
  return gender;
 }

 public void setGender(String gender) {
  this.gender = gender;
 }

 public String getAddress() {
  return address;
 }

 public void setAddress(String address) {
  this.address = address;
 }
}