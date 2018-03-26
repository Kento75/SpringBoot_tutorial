package com.tuyano.libro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext app = new AnnotationConfigApplicationContext(SampleBeanConfig.class);
		BeanHolder holder = app.getBean(BeanHolder.class);
		holder.showMessage();
	}
}
