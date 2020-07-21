package com.example.indusnetprj.chayaprakashani.dto;

import com.example.indusnetprj.chayaprakashani.entity.StudentDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class StudentRequest {

	private StudentDetails studentreq;

	
	public StudentRequest() {}

	public StudentRequest(StudentDetails studentreq) {
		super();
		this.studentreq = studentreq;
	}

	public StudentDetails getStudentreq() {
		return studentreq;
	}

	public void setStudentreq(StudentDetails studentreq) {
		this.studentreq = studentreq;
	}

	@Override
	public String toString() {
		return "StudentRequest [studentreq=" + studentreq + "]";
	}
	
	
	
}
