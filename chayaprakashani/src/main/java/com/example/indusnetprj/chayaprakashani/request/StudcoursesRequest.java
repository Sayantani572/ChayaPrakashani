package com.example.indusnetprj.chayaprakashani.request;

import com.fasterxml.jackson.annotation.JsonManagedReference;

public class StudcoursesRequest {
	
	private Integer courseId;
	
	private String courseName;
	
	//@JsonManagedReference
	//private StudDetailsRequest details;

	public StudcoursesRequest() {
		super();
		
	}

	public StudcoursesRequest(Integer courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
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

	@Override
	public String toString() {
		return "StudcoursesRequest [courseId=" + courseId + ", courseName=" + courseName + "]";
	}

		
}
