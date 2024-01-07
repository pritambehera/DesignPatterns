package com.sdp.Thread;

import com.sdp.pattern.TimeZoneL;

public class Task implements Runnable {

	@Override
	public void run() {
		TimeZoneL.getInstance();		
	}
 
}
