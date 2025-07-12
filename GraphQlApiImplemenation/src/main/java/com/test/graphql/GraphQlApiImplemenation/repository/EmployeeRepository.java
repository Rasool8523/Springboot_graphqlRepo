package com.test.graphql.GraphQlApiImplemenation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.graphql.GraphQlApiImplemenation.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
