package com.sdp.pattern;

public class TimeZoneEI {
 
 private static TimeZoneEI Instance =new TimeZoneEI() ;
 
 	private TimeZoneEI() {
 		System.out.println("Eager Instan");
      
 	}

	public static TimeZoneEI getInstance() {
 		
 		return Instance;
 	}
}
