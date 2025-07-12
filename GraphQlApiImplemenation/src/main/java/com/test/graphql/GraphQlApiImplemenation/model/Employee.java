package com.test.graphql.GraphQlApiImplemenation.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name="employee")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empId;
	@NonNull
	private String name;
	private String designation;
	private double salary;
}
