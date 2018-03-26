package com.tuyano.libro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class SomeBean implements SampleBeanInterface {

	private Date date;
	private SimpleDateFormat format;
	
	public SomeBean() {
		date = Calendar.getInstance().getTime();
		format = new SimpleDateFormat("yyyy/MM/dd");
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return format.format(date);
	}

	@Override
	public void setMessage(String message) {
		// TODO Auto-generated method stub
		try {
			date = format.parse(message);
		} catch(ParseException e) {
			e.printStackTrace();
			date = null;
		}
	}
	
	@Override
	public String toString() {
		return "SomeBean [date=" + format.format(date) + "]";
	}

}
