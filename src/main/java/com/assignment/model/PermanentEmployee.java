package com.assignment.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity

@Table
public class PermanentEmployee extends Employee {

	 	private String startingDate;
	    private Double salery;
	    private String designation;
	    
		public String getStartingDate() {
			return startingDate;
		}
		public void setStartingDate(String startingDate) {
			this.startingDate = startingDate;
		}
		public Double getSalery() {
			return salery;
		}
		public void setSalery(Double salery) {
			this.salery = salery;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
	    
	    
}
