package com.example.indusnetprj.chayaprakashani.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.indusnetprj.chayaprakashani.dao.ChayaPrakashaniDAO;
import com.example.indusnetprj.chayaprakashani.entity.Courses;

@Service
public class ChayaPrakashaniService {

	@Autowired
	private ChayaPrakashaniDAO repository;
	
	public List<Courses> getCourses(){
		return repository.findAll();
	}
}
