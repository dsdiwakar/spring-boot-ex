package com.dsd.springboot.aop.service;

import org.springframework.stereotype.Service;

import com.dsd.springboot.aop.model.Employee;

@Service
public class EmployeeService {

	public Employee createEmployee(String name, String empID) {
		Employee emp = new Employee();
		emp.setEmpId(empID);
		emp.setName(name);
		return emp;
	}

	public void deleteEmployee(String empID) {

	}

}
