package com.sdp.pattern;

public class TimeZone4 {
	private static TimeZone4 Instance;
	private TimeZone4() {
	}
		private static TimeZone4 getInstance() {
		if(Instance==null) {
			Instance=new TimeZone4();
	     	}
	    
		return Instance;
	}
	
	
}
