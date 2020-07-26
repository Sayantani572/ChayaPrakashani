package com.example.indusnetprj.chayaprakashani.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;

@Entity
@Table(name="student_details")
public class StudentDetails {
 
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "studentid_generator")
	@SequenceGenerator(name = "studentid_generator", allocationSize = 1,sequenceName = "studentid_seq")
	@Column(name = "student_id")
	private Integer id;
	
	@NotNull(message = "Fisrt name can not be null")
	@Size(min = 2,message = "Fisrt Name must not less than 2 char")
	@Column(name = "first_name")
	private String firstName;
	
	
	@NotBlank(message = "Last name can not be null")
	@Column(name = "last_name")
	private String lastName;
	
	@NotBlank(message = "Email can not be null")
	@Email
	@Column(name = "email")
	private String email;
	
	@NotNull(message = "Password can not be null")
	@Size(min = 4,message = "password must not less than 4 digit")
	@Column(name = "password")
	private String password;
	
	@NotNull(message = "Mobile no can not be null")
	@Pattern(regexp = "^[6-9][0-9]{9}$")
	@Column(name = "mobile")
	private String mobile;
	

	
	@Column(name = "roles")
	 private String roles;
	  
	
	//@NotNull
	@OneToMany(targetEntity = StudCourses.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "studcourseId_fk",referencedColumnName = "student_id")
	private List<StudCourses> studcourses;
	
	
	 public StudentDetails() {
		
	}


	public StudentDetails(StudentDetails users) {
	    	
	        this.email = users.getEmail();
	        this.roles = users.getRoles();
	        this.firstName = users.getFirstName();
	        this.lastName =users.getLastName();
	        this.id = users.getId();
	        this.password = users.getPassword();
		}


	


	public StudentDetails(Integer id,
			@NotNull(message = "Fisrt name can not be null") @Size(min = 2, message = "Fisrt Name must not less than 2 char") String firstName,
			@NotBlank(message = "Last name can not be null") String lastName,
			@NotBlank(message = "Email can not be null") @Email String email,
			@NotNull(message = "Password can not be null") @Size(min = 4, message = "password must not less than 4 digit") String password,
			@NotNull(message = "Mobile no can not be null") @Pattern(regexp = "^[6-9][0-9]{9}$") String mobile,
			String roles, List<StudCourses> studcourses) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.roles = roles;
		this.studcourses = studcourses;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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


	public List<StudCourses> getStudcourses() {
		return studcourses;
	}


	public void setStudcourses(List<StudCourses> studcourses) {
		this.studcourses = studcourses;
	}
	


	}
