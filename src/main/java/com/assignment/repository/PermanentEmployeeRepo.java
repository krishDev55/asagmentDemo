package com.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.model.PermanentEmployee;

@Repository
public interface PermanentEmployeeRepo extends JpaRepository<PermanentEmployee, Integer> {

}
