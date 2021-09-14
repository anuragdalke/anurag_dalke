package com.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USR")

public class UserEntity {
	
	@Id
	@Column(name="ID")
	private Long id;
	@Column(name="USER_LOGIN")
	private String  userLogin;
	@Column(name="FIRST_NAME")
	private String  firstName;
	@Column(name="LAST_NAME")
	private String  lastName;
	@Column(name="EMAIL")
	private String  email;
	@Column(name="ADDRESS")
	private String  address;
	
	
	public UserEntity() {
		//Default Constructor
	}
	
	public UserEntity(Long id, String userLogin, String firstName, String lastName, String email, String address) {
		super();
		this.id = id;
		this.userLogin = userLogin;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserLogin() {
		return userLogin;
	}
	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
	
}
