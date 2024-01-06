package com.goonok;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.goonok.beans.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/goonok/resources/beans.xml");
		
		Student st = context.getBean("student", Student.class);
		
		System.out.println(st);
		
		
	}

}
