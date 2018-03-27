package com.tuyano.libro.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("bean.xml");
		SampleAopBean bean1 = (SampleAopBean)app.getBean("sampleAopBean");
		bean1.printMessage();
		System.out.println("---------------");
		SampleAopBean bean2 = (SampleAopBean)app.getBean("proxyFactoryBean");
		bean2.printMessage();
	}

}
