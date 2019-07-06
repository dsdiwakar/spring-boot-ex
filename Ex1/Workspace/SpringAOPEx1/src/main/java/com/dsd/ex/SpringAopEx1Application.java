package com.dsd.ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dsd.ex.service.BusinessLogic;

//@SpringBootApplication
public class SpringAopEx1Application {

	public static void main(String[] args) {
//		SpringApplication.run(SpringAopEx1Application.class, args);
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-config.xml");
		BusinessLogic businessLogic = (BusinessLogic) appContext.getBean("businessLogic");
		businessLogic.getBusinessLogic();
	}

}
