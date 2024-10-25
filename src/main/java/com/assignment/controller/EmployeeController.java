package com.assignment.controller;

import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.assignment.model.ContractEmployee;
import com.assignment.model.PermanentEmployee;
import com.assignment.service.ContractEmployeeService;
import com.assignment.service.PermanentEmployeeService;

@RestController
@RequestMapping("/app/")
public class EmployeeController {
			
		@Autowired
		private ContractEmployeeService contractEmp;
		
		@Autowired
		 private PermanentEmployeeService permanantEmp;
		
		
		/*
		 * Save the Contractor Employee 
		 *    using the varify method or Url By PostMan software 
		 *    
		 * **/
	@PostMapping("/saveContEmployee")
	public ResponseEntity<ContractEmployee> 
					saveEmployee(@RequestBody ContractEmployee emp) {
		
		return new ResponseEntity<ContractEmployee>(
							contractEmp.saveEmployee(emp), HttpStatus.OK);
		
	}
	
	
	/*
	 * Get the Contractor Employee  by id
	 *    
	 *    
	 * **/
		@GetMapping("/getContEmployee/{id}")
		public ResponseEntity<ContractEmployee> 
						getContractorEmployeeByid(@PathVariable Integer id) {
			
			
			return new ResponseEntity<ContractEmployee>(
								contractEmp.getEmployeeById(id), HttpStatus.OK);
			
		}

		/*
		 * Get All  Contractor Employee
		 *    
		 *    
		 * **/
		@GetMapping("/getContEmployees")
		public ResponseEntity <List<ContractEmployee>> allContractorEmployee() {
		
		return new ResponseEntity<List<ContractEmployee>>(
							contractEmp.getAllContractEmployees(), HttpStatus.OK);
		
		}
		
		/*
		 * Get All  Contractor Employee
		 *    
		 *    
		 * **/
		
		@PutMapping("/updateContEmployee")
		public ResponseEntity <ContractEmployee> updateContractorEmployee(@RequestBody ContractEmployee emp) {
		
		return new ResponseEntity<ContractEmployee>(
							contractEmp.updateEmployee(emp), HttpStatus.OK);

		}
		
		/*
		 * Delete Contractor Employee By id
		 *    
		 *    
		 * **/
		
		@DeleteMapping("/deleteContEmployee/{id}")
		public ResponseEntity <String> 
							deleteContractorEmployee(@PathVariable Integer id) {
		
			
			contractEmp.deleteContractEmployeesById(id);
			
		return new ResponseEntity<String>("ContractEmployee Deleted",
							 HttpStatus.OK);

		}

		
		/*
		 * Save the  Employee Permanent Employee 
		 *    using the varify method or Url By PostMan software 
		 *    
		 * **/
	@PostMapping("/savePermaEmployee")
	public ResponseEntity<PermanentEmployee> 
					savePerEmployee(@RequestBody PermanentEmployee emp) {
		
		return new ResponseEntity<PermanentEmployee>(
						permanantEmp.saveEmployee(emp), HttpStatus.OK);
		
	}
	
	
	/*
	 * Get the Permanent Employee  by id
	 *    
	 *    
	 * **/
		@GetMapping("/getParmaEmployee/{id}")
		public ResponseEntity<PermanentEmployee> 
						getPermanentEmployeeByid(@PathVariable Integer id) {
			
			return new ResponseEntity<PermanentEmployee>(
								permanantEmp.getEmployeeById(id), HttpStatus.OK);
			
		}

		/*
		 * Get All  Permanent Employee
		 *    
		 *    
		 * **/
		@GetMapping("/getParmaEmployees")
		public ResponseEntity <List<PermanentEmployee>> allPermanentEmployee() {
		
		return new ResponseEntity<List<PermanentEmployee>>(
							permanantEmp.getAllPermanentEmployees(), HttpStatus.OK);
		
		}
		
		/*
		 * Get All  Permanent Employee
		 *    
		 *    
		 * **/
		
		@PutMapping("/updatePerEmployee")
		public ResponseEntity <PermanentEmployee> updatePermanentEmployee(@RequestBody PermanentEmployee emp) {
		
		return new ResponseEntity<PermanentEmployee>(
							permanantEmp.updateEmployee(emp), HttpStatus.OK);

		}
		
		/*
		 * Delete Permanent Employee By id
		 *    
		 *    
		 * **/
		
		@DeleteMapping("/deletePermaEmployee/{id}")
		public ResponseEntity <String> 
							deletePermanentEmployee(@PathVariable Integer id) {
		
			
			permanantEmp.deletePermanentEmployeesById(id);
			
		return new ResponseEntity<String>("ContractEmployee Deleted",
							 HttpStatus.OK);

		}
	
		@GetMapping("/test")
		public String test() {
			return "this is Test Url ........";
		}
	
	
}
