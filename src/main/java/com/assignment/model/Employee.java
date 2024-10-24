package com.assignment.model;

import org.hibernate.annotations.Cascade;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;


@Entity


@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Employee {
	 @Id
	    @GeneratedValue( strategy = GenerationType.AUTO )
	    private Integer id;
	
	    @Column(name = "EMPLOYEE_ID")
	    
	    private String employeeId;
	    private String firstName;
	    private String lastName;
	    private String email;
	    
	    
	    
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(String employeeId) {
			this.employeeId = employeeId;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
	    
	    
		
		
	    
	    
	    
	    
	    
}
