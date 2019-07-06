package com.dsd.springboot.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {

	@Before(value = "execution(* com.dsd.springboot.aop.service.EmployeeService.*(..)) and args(name,empID)")
	public void beforeAdvice(JoinPoint joinPoint, String name, String empID) {
		System.out.println("Before method:" + joinPoint.getSignature());
		System.out.println("Create Employee with name - " + name + " and id - " + empID);
	}

	@After(value = "execution(* com.dsd.springboot.aop.service.EmployeeService.*(..)) and args(name,empID)")
	public void afterAdvice(JoinPoint joinPoint, String name, String empID) {
		System.out.println("After method:" + joinPoint.getSignature());

		System.out.println("Successfully created Employee with name - " + name + " and id - " + empID);
	}
}
