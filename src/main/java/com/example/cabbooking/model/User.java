package com.example.cabbooking.model;

import jakarta.persistence.*;
import jakarta.persistence.GenerationType;

@Entity

public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String name;
	String password;
	String email;
 
	@Enumerated(EnumType.STRING)
	Role role;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, String password, String email, Role role) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.role = role;
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
