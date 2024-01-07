package com.sdp.test;

import com.sdp.pattern.TimeZoneEI;

public class TimeZoneEITest {

	public static void main(String[] args) {
		TimeZoneEI tz1=TimeZoneEI.getInstance();
		TimeZoneEI tz2=TimeZoneEI.getInstance();
		System.out.println(tz1.hashCode()+".."+tz2.hashCode());
		
	}

}
