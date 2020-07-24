package com.example.indusnetprj.chayaprakashani;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.indusnetprj.chayaprakashani.dao.StudentDAO;


@SpringBootApplication
public class ChayaprakashaniApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChayaprakashaniApplication.class, args);
	}

}

