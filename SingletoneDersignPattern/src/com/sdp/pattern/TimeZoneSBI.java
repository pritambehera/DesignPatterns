package com.sdp.pattern;

public class TimeZoneSBI {
private static TimeZoneSBI Instance;
static {
	Instance = TimeZoneSBI.getInstance();
}
	private TimeZoneSBI() {
		
	}
	
	public static TimeZoneSBI getInstance() {
		
		return Instance;
	}

	
}
