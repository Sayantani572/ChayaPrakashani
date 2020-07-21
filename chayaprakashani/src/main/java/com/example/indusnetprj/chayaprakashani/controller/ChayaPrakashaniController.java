package com.example.indusnetprj.chayaprakashani.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.indusnetprj.chayaprakashani.dao.ChayaPrakashaniDAO;
import com.example.indusnetprj.chayaprakashani.dao.StudentCourseDAO;
import com.example.indusnetprj.chayaprakashani.dao.StudentDAO;
import com.example.indusnetprj.chayaprakashani.dto.StudentRequest;
import com.example.indusnetprj.chayaprakashani.entity.Courses;
import com.example.indusnetprj.chayaprakashani.entity.StudentDetails;



@RestController
@RequestMapping("/courseapi")
public class ChayaPrakashaniController {

	@Autowired
   private StudentDAO studentrepository;

	@Autowired
	private ChayaPrakashaniDAO repository;
	
	@Autowired
	private StudentCourseDAO studcourserepo;

	@GetMapping("/courses")
	public List<Courses> findAllCourses(){
		return repository.findAll();
	}
	
	@PostMapping("/registerStudent")
	public StudentDetails addStudent(@RequestBody StudentRequest request) {
		
		return studentrepository.save(request.getStudentreq());
	}

	@GetMapping("/show/{studId}")
	public StudentDetails findStudById(@PathVariable int studId) {
		
	return studentrepository.findById(studId).orElse(null);
	}
	
//	@PreAuthorize("hasAnyRole('USER')")
//    @GetMapping("/user")
	@GetMapping("/showstudents/{studFirstName}")
	public StudentDetails findStudByfirstname(@PathVariable String studFirstName) {
		
	return studentrepository.findByfirstname(studFirstName).orElse(null);
	
	}
//	 public String alternate() {
//        return "user page";
//    }
	
	
//	@PutMapping("/updateDetails")
//	
//	public StudentDetails updateStudent(@RequestBody StudentDetails student) {
//	
//	StudentDetails existingstudent=studentrepository.findById(student.getId()).orElse(null);
//
//	 existingstudent.setFirstname(student.getFirstname());
//	 existingstudent.setLastname(student.getLastname());
//	 existingstudent.setEmail(student.getEmail());
//	 existingstudent.setPassword(student.getPassword());
//	 existingstudent.setMobile(student.getMobile());
//	 existingstudent.setStudcourses(student.getStudcourses());
//	
//	return studentrepository.save(existingstudent);
//	
//	}
	
//	 @PreAuthorize("hasAnyRole('ADMIN')")
//	    @RequestMapping("/admin")
//	    public String securedHello() {
	
//	       return "admin page";
//	    }
	}
