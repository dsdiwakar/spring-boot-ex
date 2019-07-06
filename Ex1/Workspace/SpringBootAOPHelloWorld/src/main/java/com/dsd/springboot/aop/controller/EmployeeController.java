package com.dsd.springboot.aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dsd.springboot.aop.model.Employee;
import com.dsd.springboot.aop.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/add/employee", method = RequestMethod.GET)
	public Employee addEmployee(@RequestParam("name") String name, @RequestParam("empID") String empID) {
		return employeeService.createEmployee(name, empID);
	}

	@RequestMapping(value = "remove/employee", method = RequestMethod.GET)
	public String removeEmployee(@RequestParam("empID") String empID) {
		employeeService.deleteEmployee(empID);

		return "Employee removed.";
	}

}
