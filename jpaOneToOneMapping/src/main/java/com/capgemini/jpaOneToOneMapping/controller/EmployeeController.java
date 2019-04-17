package com.capgemini.jpaOneToOneMapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.jpaOneToOneMapping.employee.Employee;
import com.capgemini.jpaOneToOneMapping.employee.dao.EmployeeDao;
import com.capgemini.jpaOneToOneMapping.profile.Profile;

@RestController
public class EmployeeController {
   
	@Autowired
	EmployeeDao dao;
	
	@RequestMapping("/")
	public void addNewEmployee() {
		
		Employee employee = new Employee(11, "Ashlesha", new Profile(11, "Analyst"));
        dao.save(employee);
    }
	
	@RequestMapping("/get")
	public Employee findEmployee() {
		Employee employee = dao.findById(11).get();
		return employee;
	} 
}