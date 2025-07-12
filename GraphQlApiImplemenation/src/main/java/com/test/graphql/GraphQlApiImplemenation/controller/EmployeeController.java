package com.test.graphql.GraphQlApiImplemenation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.test.graphql.GraphQlApiImplemenation.model.Employee;
import com.test.graphql.GraphQlApiImplemenation.service.EmployeeService;


//@RestController
//@RequestMapping("/api/employee")
@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	
//	@PostMapping("/add")
//	public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp) {
//		return new ResponseEntity<Employee>(service.addEmployee(emp),HttpStatus.CREATED);
//		
//	}
	
	@QueryMapping
	public List<Employee> getAllEmployees() {
		List<Employee> empList = service.getAllEmployees();
		return empList;
	}
}
