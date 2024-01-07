package com.sdp.pattern;



public class TimeZoneL {
 private static TimeZoneL Instance;

private  TimeZoneL(){
//synchronized.getInstance(TimeZoneL.class);
//if(Instance == null) {
//	Instance=new TimeZoneL();
//}
//return;

//	}
}
public static TimeZoneL getInstance() {
	if(Instance==null) {
		synchronized (TimeZoneL.class) {
			if(Instance == null) {
				Instance=new TimeZoneL();
			}
		}
	}
	return Instance;
}
	
}
