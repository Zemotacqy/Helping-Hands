package com.ementoring;

import java.util.*;

public class Question {
	private String question;
	private String userEmail;
	private String createdAt;
	
	public Question(String newQuestion, String newUserEmail) {
		question = newQuestion;
		userEmail = newUserEmail;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public String getOwnerEmail() {
		return userEmail;
	}
	
	public void setOwnerEmailToName(String name) {
		userEmail = name;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
}
