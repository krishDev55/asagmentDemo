package com.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.model.ContractEmployee;

@Repository
public interface ContractEmployeeRepo extends JpaRepository<ContractEmployee, Integer>{

		
}
