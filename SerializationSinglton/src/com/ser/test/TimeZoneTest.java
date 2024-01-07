package com.ser.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.ser.bean.TimeZone;

public class TimeZoneTest {
public static void main(String[] args) throws FileNotFoundException, IOException {
//	TimeZone tz= new TimeZone();
	
	ObjectOutputStream  oos= new ObjectOutputStream(new FileOutputStream("F://Tz.ser"));
//	oos.writeObject(tz);
	oos.writeObject(TimeZone.getInstance());
	System.out.println(oos);
		
		
}
}
