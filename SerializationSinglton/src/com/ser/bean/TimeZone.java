package com.ser.bean;

import java.io.Serializable;

public class TimeZone  {
	private static TimeZone Instance;
	
	private  TimeZone() {
		
	}
	public static TimeZone getInstance() {
	if (Instance==null) {
		synchronized(TimeZone.class){
		if(Instance==null) {
			Instance= new TimeZone();
		}
	  }
	}
		return getInstance();
	}
}
