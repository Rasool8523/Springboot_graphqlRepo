package com.test.graphql.GraphQlApiImplemenation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.graphql.GraphQlApiImplemenation.model.Employee;
import com.test.graphql.GraphQlApiImplemenation.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public Employee addEmployee(Employee emp) {
		if( emp.getName() != null ) {
			return repo.save(emp);
		} else {
			throw new RuntimeException("Employee Data is Empty");
		}
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

}
