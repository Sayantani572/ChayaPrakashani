package com.example.indusnetprj.chayaprakashani.mapper;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.example.indusnetprj.chayaprakashani.entity.StudCourses;
import com.example.indusnetprj.chayaprakashani.entity.StudentDetails;
import com.example.indusnetprj.chayaprakashani.request.StudDetailsRequest;
import com.example.indusnetprj.chayaprakashani.request.StudcoursesRequest;
//import com.example.indusnetprj.chayaprakashani.request.StudDetailsRequest;
//import com.example.indusnetprj.chayaprakashani.request.StudcoursesRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StudObjectMapper {
	
	
	public static void main(String[] args) throws JsonProcessingException {
		
		try {
		
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		String json="{ \"id\":1, \"firstName\": \"Swati\",\"lastName\":\"mishra\",\"email\": \"Swatimishra@gmail.com\",\"password\": \"t749\", \"mobile\": \"7270725519\", \"roles\": \"ROLE_USER\",\"studcourses\":[{\"serialNo\":1,\"courseId\":144,\"courseName\": \"Angular Js\"},{\"serialNo\":2,\"courseId\":141,\"courseName\":\"SAAP\"}]}";

		StudDetailsRequest students=objectMapper.readValue(json,StudDetailsRequest.class);


		System.out.println(students);
		
//		StudDetailsRequest studDetailsRequest=new StudDetailsRequest() ;
//		studDetailsRequest.setFirstName("Jaya");
//		studDetailsRequest.setLastName("Bachu");
//		studDetailsRequest.setEmail("bachjaya@gmail.com");
//		studDetailsRequest.setPassword("4563");
//		studDetailsRequest.setMobile("7894563210");
//		studDetailsRequest.setRoles("ROLE_USER");
//		
//		String json = "{ \"color\" : \"Black\", \"type\" : \"BMW\" }"
//		StudCourses studcoursesRequest=new StudCourses();
//		studcoursesRequest.setCourseId(140);
//		studcoursesRequest.setCourseName("java");
//		
//		StudCourses studcoursesRequest1=new StudCourses();
//		studcoursesRequest.setCourseId(141);
//		studcoursesRequest.setCourseName("SAAP");
//		
//		
//		List<StudcoursesRequest> studcourses=new ArrayList<StudcoursesRequest>();
//		
//		studDetailsRequest.getStudcourses().addAll((Collection<? extends StudcoursesRequest>) studcoursesRequest);
//		studDetailsRequest.getStudcourses().addAll((Collection<? extends StudcoursesRequest>) studcoursesRequest1);
//		
//		File file=new File("target/stud.json");
//		
//       objectMapper.writeValue(file, studDetailsRequest);
	 
		
	}
	catch(final Exception e) {
		e.printStackTrace();
	}
	
}
}
