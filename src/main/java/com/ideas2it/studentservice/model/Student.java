package com.ideas2it.studentservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

/**
 * <p>
 * The Student entity consists of Id, name and passport number. The Id is
 * auto  generated and uniquely identifies a particular detail
 * </p>   
 * 
 * @author karthik created on 31 October  
 *
 */
@Entity
@Table(name="Student")
public class Student {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String passportNumber;
	
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	public String getName() {
		return this.name;
	}
	
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public String getPassportNumber() {
		return this.passportNumber;
	}
}