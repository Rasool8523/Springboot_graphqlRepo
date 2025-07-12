package com.test.graphql.GraphQlApiImplemenation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.test.graphql.GraphQlApiImplemenation.model.Employee;
import com.test.graphql.GraphQlApiImplemenation.model.EmployeeInput;
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
	@MutationMapping
	public Employee addEmployee(@Argument("employee") EmployeeInput input) {
		Employee emp = new Employee();
		emp.setName(input.getName());
		emp.setDesignation(input.getDesignation());
		emp.setSalary(input.getSalary());
		return service.addEmployee(emp);
		
	}
	
	@QueryMapping
	public List<Employee> getAllEmployees() {
		List<Employee> empList = service.getAllEmployees();
		return empList;
	}
	
	@QueryMapping
	public Employee getEmployeeById(@Argument long empId) {
		Employee emp = service.getEmployeeById(empId);
		return emp;
	}
}
