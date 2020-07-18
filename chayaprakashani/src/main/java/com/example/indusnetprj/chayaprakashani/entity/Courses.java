package com.example.indusnetprj.chayaprakashani.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name="Courses")
public class Courses {
	@Id
	private Integer courseid;
	
	@Column(name="coursename")
	private String coursename;
	
	@Column(name="courseteacher")
	private String courseteacher;
	
	@Column(name="coursefee")
	private int coursefee;
	
	@Column(name="coursedate")
	private Date coursedate;

	public Courses() {
		
	}

	public Courses(Integer courseid, String coursename, String courseteacher, int coursefee, Date coursedate) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.courseteacher = courseteacher;
		this.coursefee = coursefee;
		this.coursedate = coursedate;
	}

	public Integer getCourseid() {
		return courseid;
	}

	public void setCourseid(Integer courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getCourseteacher() {
		return courseteacher;
	}

	public void setCourseteacher(String courseteacher) {
		this.courseteacher = courseteacher;
	}

	public int getCoursefee() {
		return coursefee;
	}

	public void setCoursefee(int coursefee) {
		this.coursefee = coursefee;
	}

	public Date getCoursedate() {
		return coursedate;
	}

	public void setCoursedate(Date coursedate) {
		this.coursedate = coursedate;
	}
	
	

}