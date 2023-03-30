package com.MB.MovieBooking.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserDto {

	private Integer userId;

	@NotEmpty
	private String userName;

	@NotEmpty
	@Email(message = "Please provide valid email address", regexp = ".+@.+\\..+")
	private String email;

	@NotEmpty
	@Size(min = 8, max = 30)
	private String password;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserDto(Integer userId, @NotEmpty String userName,
			@NotEmpty @Email(message = "Please provide valid email address", regexp = ".+@.+\\..+") String email,
			@NotEmpty @Size(min = 8, max = 30) String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.password = password;
	}

	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", userName=" + userName + ", email=" + email + ", password=" + password
				+ "]";
	}
	
	
	
	
}
