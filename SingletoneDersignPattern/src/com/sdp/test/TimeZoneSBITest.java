package com.sdp.test;

import com.sdp.pattern.TimeZoneSBI;

public class TimeZoneSBITest {

	public static void main(String[] args) {
		TimeZoneSBI.getInstance();		
		System.out.println(TimeZoneSBI.class.hashCode());

	}

}
