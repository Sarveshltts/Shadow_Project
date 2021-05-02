package com.ltts.shadow.Tables.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "User")
public class User 
{
	@Id
	private int id;
	@Column
	private String userName;
	@Column
	private String password;
	@Column
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return userName;
	}
	public void setUsername(String username) {
		this.userName = username;
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
	public User(int id, String username, String password, String email) {
		super();
		this.id = id;
		this.userName = username;
		this.password = password;
		this.email = email;
	}
	public User() {
		super();
	}
	
	
}
