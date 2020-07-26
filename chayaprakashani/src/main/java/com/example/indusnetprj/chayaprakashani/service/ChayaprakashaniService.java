package com.example.indusnetprj.chayaprakashani.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NonUniqueResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.indusnetprj.chayaprakashani.dao.ChayaPrakashaniDAO;
import com.example.indusnetprj.chayaprakashani.dao.StudentCourseDAO;
import com.example.indusnetprj.chayaprakashani.dao.StudentDAO;
import com.example.indusnetprj.chayaprakashani.entity.Courses;
import com.example.indusnetprj.chayaprakashani.entity.StudentDetails;

@Service
public class ChayaprakashaniService {
	
	 @Autowired
	   private StudentDAO studentrepository;

		@Autowired
		private ChayaPrakashaniDAO repository;
		
		@Autowired
		private StudentCourseDAO studcourserepo;
		
		
		public List<Courses> findAllCourses(){
			return repository.findAll();
		}
		


		public StudentDetails savestudent(StudentDetails request) throws NonUniqueResultException{
			

			StudentDetails existingemail=studentrepository.findByEmail(request.getEmail()).orElse(null);
			
			 if (existingemail != null) {
		         
				 throw new NonUniqueResultException();
			 }
			 
	         String role = request.getRoles();
			 
			 if(role==null) {
				 request.setRoles("ROLE_USER");
			 }
			 return studentrepository.save(request); 		
		
			
		}
		
		public StudentDetails getStudentByName(String firstName) {
			
			return studentrepository.findByfirstName(firstName).orElse(null);
		}
		
		
		
		public List<StudentDetails> AllStudent() {
			

			List<StudentDetails> listStudent=studentrepository.findAll();
			List<StudentDetails> newStudentList=new ArrayList<StudentDetails>();

			for(StudentDetails ls:listStudent)
			{
				if(!ls.getRoles().equals("ROLE_ADMIN"))
				{
					newStudentList.add(ls);
				}
			}
		      return newStudentList;
	        
	    }
			
		}

