package com.example.indusnetprj.chayaprakashani.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="StudCourses")
public class StudCourses {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="c_id")
	private Integer c_id;
	

	@Column(name="coursename")
	private String courseName;
	
	
	@Column(name="courseteacher")
	private String courseTeacher;
	
	
	public StudCourses() {
		
	}

	public StudCourses(Integer c_id, String courseName, String courseTeacher) {
		super();
		this.c_id = c_id;
		this.courseName = courseName;
		this.courseTeacher = courseTeacher;
	}




	public Integer getC_id() {
		return c_id;
	}


	public void setC_id(Integer c_id) {
		this.c_id = c_id;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getCourseTeacher() {
		return courseTeacher;
	}


	public void setCourseTeacher(String courseTeacher) {
		this.courseTeacher = courseTeacher;
	}


	
}
