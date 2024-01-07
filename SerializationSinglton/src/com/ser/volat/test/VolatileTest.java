package com.ser.volat.test;

import com.ser.volat.bean.Task1;
import com.ser.volat.bean.Task2;

public class VolatileTest {
public static void main(String[] args) {
	Task1 task1=new Task1();
	Task2 task2= new Task2();
	task1.start();
	task2.start();
	
}
}
