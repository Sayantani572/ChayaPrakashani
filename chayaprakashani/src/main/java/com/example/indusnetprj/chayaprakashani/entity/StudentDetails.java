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
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="student_details")
public class StudentDetails {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stud_id")
	private Integer id;
	
	@Column(name = "first_name")
	private String firstname;
	
	@Column(name = "last_name")
	private String lastname;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "mobile")
	private String mobile;
	
	//new
//	@Column(name = "active")
//    private int active;
//
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
//    private Set<Role> roles;
    //new
	
	@OneToMany(targetEntity = StudCourses.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "studcourseId_fk",referencedColumnName = "stud_id")
	private List<StudCourses> studcourses;
	
	
	public StudentDetails()
	{}

			/*   new   */
//	public StudentDetails(StudentDetails student) {
//		super();
//		this.id = student.getId();
//		this.firstname = student.getFirstname();
//		this.lastname = student.getLastname();
//		this.email = student.getEmail();
//		this.password = student.getPassword();
//		this.mobile = student.getMobile();
//		this.active = student.getActive();
//		this.roles = student.getRoles();
//		this.studcourses = student.getStudcourses();
//	}
//           /*  new   */

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
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


	public List<StudCourses> getStudcourses() {
		return studcourses;
	}


	public void setStudcourses(List<StudCourses> studcourses) {
		this.studcourses = studcourses;
	}
		
	
	//new

//    public int getActive() {
//		return active;
//	}
//
//
//	public void setActive(int active) {
//		this.active = active;
//	}
//
//
//	public Set<Role> getRoles() {
//		return roles;
//	}
//
//
//	public void setRoles(Set<Role> roles) {
//		this.roles = roles;
//	}


}
