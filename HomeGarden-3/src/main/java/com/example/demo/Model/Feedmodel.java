package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity


@Table(name = "feedback")

public class Feedmodel {

	@Id
	private String username;
	private String email;
    private String feedback;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	public Feedmodel(String username, String email, String feedback) {
		super();
		this.username = username;
		this.email = email;
		this.feedback = feedback;
	}
	public Feedmodel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


}