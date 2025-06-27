package com.sunil.hibernate_jpa;

import javax.annotation.processing.Generated;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long sid;
	private String Name;
	private String Departmet;
	private long phone;
	public long getSid() {
		return sid;
	}
	public void setSid(long sid) {
		this.sid = sid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDepartmet() {
		return Departmet;
	}
	public void setDepartmet(String departmet) {
		Departmet = departmet;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", Name=" + Name + ", Departmet=" + Departmet + ", phone=" + phone + "]";
	}
	
	
	
	

}
