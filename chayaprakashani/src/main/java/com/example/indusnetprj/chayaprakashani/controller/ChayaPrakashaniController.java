package com.example.indusnetprj.chayaprakashani.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.indusnetprj.chayaprakashani.entity.Courses;
import com.example.indusnetprj.chayaprakashani.service.ChayaPrakashaniService;


@RestController
@RequestMapping("/coursesapi")
public class ChayaPrakashaniController {

	@Autowired
	private ChayaPrakashaniService service;
	
	@GetMapping("/courses")
	public List<Courses> findAllCourses(){
		return service.getCourses();
	}
}
