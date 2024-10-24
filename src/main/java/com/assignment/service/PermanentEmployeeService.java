package com.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.assignment.model.PermanentEmployee;
import com.assignment.repository.PermanentEmployeeRepo;

@Service
public class PermanentEmployeeService {

		@Autowired
		private PermanentEmployeeRepo permanentEmp;
		
		
		/***
		 *   save the Permanent employee  method  
		 **/
		public PermanentEmployee saveEmployee(PermanentEmployee emp) {
			
			return permanentEmp.save(emp);
		}
		/***
		 *   Find And Get  Permanent employee By id method  
		 **/
		
		public PermanentEmployee getEmployeeById(Integer id) {
			
			return permanentEmp.findById(id).get();
		}
		
		/***
		 *   update  Permanent employee  method  
		 **/
		
		public PermanentEmployee updateEmployee(PermanentEmployee emp) {
			
			return permanentEmp.saveAndFlush(emp);
		}
		
		/***
		 *   get All  Permanent employees  method  
		 **/
		public List<PermanentEmployee> getAllPermanentEmployees(){
			
			return permanentEmp.findAll();
		}
		
		
		/***
		 *  Delete Permanent Employees by id  method  
		 **/
		public void deletePermanentEmployeesById(Integer id){
			
			permanentEmp.deleteById(id);
		}
		
		
}
