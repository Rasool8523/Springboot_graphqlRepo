package com.test.graphql.GraphQlApiImplemenation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.graphql.GraphQlApiImplemenation.model.Employee;

@Service
public interface EmployeeService {

		Employee addEmployee(Employee e);
		List<Employee> getAllEmployees();
		Employee getEmployeeById(long id);
}
