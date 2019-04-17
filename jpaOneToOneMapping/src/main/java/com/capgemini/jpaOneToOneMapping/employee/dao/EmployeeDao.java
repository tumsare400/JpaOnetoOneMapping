package com.capgemini.jpaOneToOneMapping.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.jpaOneToOneMapping.employee.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
    
}
