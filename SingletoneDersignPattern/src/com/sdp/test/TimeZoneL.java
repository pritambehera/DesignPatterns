package com.sdp.test;

public class TimeZoneL {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		TimeZoneL tl1= TimeZoneL.class.newInstance();
		TimeZoneL tl2= TimeZoneL.class.newInstance();
		System.out.println(tl1.hashCode()+"..."+tl2.hashCode());

	}

}
