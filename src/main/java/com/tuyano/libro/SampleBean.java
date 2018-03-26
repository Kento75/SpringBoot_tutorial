package com.tuyano.libro;

public class SampleBean implements SampleBeanInterface {

	private String message;
	
	public SampleBean() {
		message = "(No Message)";
	}
	
	public SampleBean(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "SampleBean [message" + message + "]";
	}
}
