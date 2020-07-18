package com.example.indusnetprj.chayaprakashani.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.indusnetprj.chayaprakashani.entity.Courses;

@Repository
public interface ChayaPrakashaniDAO extends JpaRepository<Courses, Integer>{

}
