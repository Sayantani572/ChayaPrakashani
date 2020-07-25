package com.example.indusnetprj.chayaprakashani.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="StudCourses")
public class StudCourses {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "serialno_generator")
	@SequenceGenerator(name = "serialno_generator", allocationSize = 1,sequenceName = "serialno_seq")
	@Column(name = "serial_no")
	private Integer serialNo;
	
	
	@Column(name="course_id")
	private Integer courseId;
		

	@Column(name="coursename")
	private String courseName;
	
	
		
	public StudCourses() {
		
	}

	public StudCourses(Integer serialNo, Integer courseId, String courseName) {
		super();
		this.serialNo = serialNo;
		this.courseId = courseId;
		this.courseName = courseName;
	}

	public Integer getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
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

	
	
}
