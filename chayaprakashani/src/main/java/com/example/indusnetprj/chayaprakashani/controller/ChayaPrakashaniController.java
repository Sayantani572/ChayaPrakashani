package com.example.indusnetprj.chayaprakashani.controller;
import java.util.ArrayList;
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
import com.example.indusnetprj.chayaprakashani.service.ChayaprakashaniService;
//import com.example.indusnetprj.chayaprakashani.repository.UsersRepository;


@RestController
@RequestMapping("/courseapi")
public class ChayaPrakashaniController {

//   @Autowired
//   private StudentDAO studentrepository;
//
//	@Autowired
//	private ChayaPrakashaniDAO repository;
//	
//	@Autowired
//	private StudentCourseDAO studcourserepo;
	
	@Autowired
	private ChayaprakashaniService chayaprakashaniService;

	@RequestMapping("/courses")
	public List<Courses> findAllCourses(){
		//return repository.findAll();
		return chayaprakashaniService.findAllCourses();
	}
	
	@PostMapping("/registerStudent")
	public StudentDetails addStudent(@Valid @RequestBody StudentDetails request) throws NonUniqueResultException {
		
//		StudentDetails existingemail=studentrepository.findByEmail(request.getEmail()).orElse(null);
//		
//		 if (existingemail != null) {
//	         
//			 throw new NonUniqueResultException();
//		 }
//		 
//         String role = request.getRoles();
//		 
//		 if(role==null) {
//			 request.setRoles("ROLE_USER");
//		 }
		 return chayaprakashaniService.savestudent(request); 		
	}
	

	@PreAuthorize("hasRole('USER')")
	@RequestMapping("/showstudents/{studFirstName}")
	public StudentDetails findStudByfirstName(@PathVariable String studFirstName) {
		
	return chayaprakashaniService.getStudentByName(studFirstName);
	
	}
	
	

	@PreAuthorize("hasRole('ADMIN')")
    @RequestMapping("/admin")
    public List<StudentDetails> securedHello() {
//		
//		List<StudentDetails> listStudent=studentrepository.findAll();
//		List<StudentDetails> newStudentList=new ArrayList<StudentDetails>();
//
//		for(StudentDetails ls:listStudent)
//		{
//			if(!ls.getRoles().equals("ROLE_ADMIN"))
//			{
//				newStudentList.add(ls);
//			}
//		}
//	      return newStudentList;
//        
//   
		return chayaprakashaniService.AllStudent();
	
	}
        
    }
	
