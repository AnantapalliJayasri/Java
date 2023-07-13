package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ClassPathResource;
import java.util.*;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import java.io.*;
@RestController
public class EmployeeCon {
	@GetMapping("/EmpDetails")
	public ResponseEntity<Map<String,Object>> getEmpData()throws IOException{
		ClassPathResource data = new ClassPathResource("Employees.json");
		String data1 = IOUtils.toString(data.getInputStream(),StandardCharsets.UTF_8);
		System.out.println(new JSONObject(data1).toMap());
		return new ResponseEntity<>(new JSONObject(data1).toMap(),HttpStatus.OK);
	}
	
}
