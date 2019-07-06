package com.dsd.ex.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(* com.dsd.ex.service.BusinessLogic.getBusinessLogic(..))")
	public void loggingBeforeBusinessLogic(JoinPoint joinPoint) {
		System.out.println("loggingBeforeBusinessLogic is running!!");
		System.out.println("Before execution of method:" + joinPoint.getSignature().getName());
	}
}
