package com.example.indusnetprj.chayaprakashani.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="StudCourses")
public class StudCourses {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="c_id")
	private Integer c_id;
	
	@Column(name="coursename")
	private String coursename;
	
	@Column(name="courseteacher")
	private String courseteacher;
	
	
	public StudCourses() {
		
	}


	public StudCourses(Integer c_id, String coursename, String courseteacher) {
		super();
		this.c_id = c_id;
		this.coursename = coursename;
		this.courseteacher = courseteacher;
	}


	public Integer getC_id() {
		return c_id;
	}


	public void setC_id(Integer c_id) {
		this.c_id = c_id;
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

	

	
}
