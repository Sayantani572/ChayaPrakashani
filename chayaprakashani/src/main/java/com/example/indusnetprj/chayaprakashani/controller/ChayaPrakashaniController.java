package com.example.indusnetprj.chayaprakashani.controller;
import java.util.List;

import javax.persistence.NonUniqueResultException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.indusnetprj.chayaprakashani.dao.ChayaPrakashaniDAO;
import com.example.indusnetprj.chayaprakashani.dao.StudentCourseDAO;
import com.example.indusnetprj.chayaprakashani.dao.StudentDAO;

//import com.example.indusnetprj.chayaprakashani.dto.StudentRequest;
import com.example.indusnetprj.chayaprakashani.entity.Courses;
import com.example.indusnetprj.chayaprakashani.entity.StudentDetails;
import com.example.indusnetprj.chayaprakashani.exception.GlobalException;
//import com.example.indusnetprj.chayaprakashani.repository.UsersRepository;


@RestController
@RequestMapping("/courseapi")
public class ChayaPrakashaniController {

   @Autowired
   private StudentDAO studentrepository;

	@Autowired
	private ChayaPrakashaniDAO repository;
	
	@Autowired
	private StudentCourseDAO studcourserepo;

	@RequestMapping("/courses")
	public List<Courses> findAllCourses(){
		return repository.findAll();
	}
	
	@PostMapping("/registerStudent")
	public StudentDetails addStudent(@Valid @RequestBody StudentDetails request) throws Exception {
		
		StudentDetails existingemail=studentrepository.findByEmail(request.getEmail()).orElse(null);
		
		 if (existingemail != null) {
	         
			 throw new NonUniqueResultException();
		 }
		 return studentrepository.save(request); 		
	}
	

	@PreAuthorize("hasRole('USER')")
	@RequestMapping("/showstudents/{studFirstName}")
	public StudentDetails findStudByfirstName(@PathVariable String studFirstName) {
		
	return studentrepository.findByfirstName(studFirstName).orElse(null);
	
	}
	
	
	/* Sourav's entry*/
	
	@PreAuthorize("hasRole('ADMIN')")
    @RequestMapping("/admin")
    public String securedHello() {
        return "admin page";
        
        
        
    }
	}
