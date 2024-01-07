package com.ser.bean;

import java.io.Serializable;

public class Subject  implements Serializable{
	private String subcode;
	private int duration;
	
	public String getSubcode() {
		return subcode;
	}
	public void setSubcode(String subcode) {
		this.subcode = subcode;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Subject [subcode=" + subcode + ", duration=" + duration + "]";
	}
	
}
