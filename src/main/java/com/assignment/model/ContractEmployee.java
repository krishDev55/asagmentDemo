package com.assignment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

	@Entity
	@Table
public class ContractEmployee  extends Employee{

	 	private String contractStartDate;
	    private String contractEndDate;
	    private String agencyName;
	    
	    
	    
		public String getContractStartDate() {
			return contractStartDate;
		}
		public void setContractStartDate(String contractStartDate) {
			this.contractStartDate = contractStartDate;
		}
		public String getContractEndDate() {
			return contractEndDate;
		}
		public void setContractEndDate(String contractEndDate) {
			this.contractEndDate = contractEndDate;
		}
		public String getAgencyName() {
			return agencyName;
		}
		public void setAgencyName(String agencyName) {
			this.agencyName = agencyName;
		}
	    
	    
	    
}
