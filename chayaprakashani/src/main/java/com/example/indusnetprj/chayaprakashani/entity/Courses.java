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
	@Column(name = "course_id")
	private Integer courseId;
	
	@Column(name="coursename")
	private String courseName;
	
	@Column(name="courseteacher")
	private String courseTeacher;
	
	@Column(name="coursefee")
	private int courseFee;
	
	@Column(name="coursedate")
	private Date courseDate;

	public Courses() {
		
	}

	public Courses(Integer courseId, String courseName, String courseTeacher, int courseFee, Date courseDate) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseTeacher = courseTeacher;
		this.courseFee = courseFee;
		this.courseDate = courseDate;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
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

	public int getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}

	public Date getCourseDate() {
		return courseDate;
	}

	public void setCourseDate(Date courseDate) {
		this.courseDate = courseDate;
	}


}