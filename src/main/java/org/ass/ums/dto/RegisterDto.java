package org.ass.ums.dto;

import java.io.Serializable;

public class RegisterDto implements Serializable {
	
	private String firstName;
	
	private String contactNumber;
	
	private String email;
	
	private String password;
	
	private String country;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "RegisterDto [firstName=" + firstName + ", contactNumber=" + contactNumber + ", email=" + email
				+ ", password=" + password + ", country=" + country + "]";
	}

}
