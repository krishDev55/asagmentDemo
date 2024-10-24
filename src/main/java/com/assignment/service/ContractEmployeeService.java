package com.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.model.ContractEmployee;
import com.assignment.repository.ContractEmployeeRepo;

@Service
public class ContractEmployeeService {
		@Autowired
	 private ContractEmployeeRepo contractorEmpRepo;
		
		/***
		 *   save the Contractor employee  method  
		 **/
		public ContractEmployee saveEmployee(ContractEmployee emp) {
			
			return contractorEmpRepo.save(emp);
		}
		/***
		 *   Find And Get  Contractor employee By id method  
		 **/
		
		public ContractEmployee getEmployeeById(Integer id) {
			
			return contractorEmpRepo.findById(id).get();
		}
		
		/***
		 *   update  Contractor employee  method  
		 **/
		
		public ContractEmployee updateEmployee(ContractEmployee emp) {
			
			return contractorEmpRepo.saveAndFlush(emp);
		}
		
		/***
		 *   get All  Contractor employees  method  
		 **/
		public List<ContractEmployee> getAllContractEmployees(){
			
			return contractorEmpRepo.findAll();
		}
		
		
		/***
		 *  Delete Contractor employees by id  method  
		 **/
		public void deleteContractEmployeesById(Integer id){
			
				contractorEmpRepo.deleteById(id);
		}
		
		
}
