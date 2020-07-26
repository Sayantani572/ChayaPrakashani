package com.example.indusnetprj.chayaprakashani.request;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.example.indusnetprj.chayaprakashani.entity.StudCourses;
import com.fasterxml.jackson.annotation.JsonBackReference;

 public class StudDetailsRequest {
	
   private String firstName;
	
	private String lastName;
	
	private String email;
	
	
	private String password;
	
	
	private String mobile;
	

	private String roles;
	  
	//@JsonBackReference
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	public List<StudcoursesRequest> studcourses;

	public StudDetailsRequest() {
		}

	public StudDetailsRequest(String firstName, String lastName, String email, String password, String mobile,
			String roles, List<StudcoursesRequest> studcourses) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.roles = roles;
		this.studcourses = studcourses;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public List<StudcoursesRequest> getStudcourses() {
		return studcourses;
	}

	public void setStudcourses(List<StudcoursesRequest> studcourses) {
		this.studcourses = studcourses;
	}

	@Override
	public String toString() {
		return "StudDetailsRequest [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", mobile=" + mobile + ", roles=" + roles + ", studcourses=" + studcourses
				+ "]";
	}

	
	

}
