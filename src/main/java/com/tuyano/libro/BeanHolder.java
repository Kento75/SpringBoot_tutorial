package com.tuyano.libro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BeanHolder {
	
	@Autowired
	private SampleBeanInterface bean;
	
	public void showMessage() {
		System.out.println("print by BeanHolder");
		System.out.println(bean);
		System.out.println("end");
	}

}
