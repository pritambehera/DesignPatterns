package com.ser.volat.bean;

public class Task1 extends Thread{

	@Override
	public void run() {
		Account task1=Account.getInstance();
		int balance=0;
		balance=task1.m1();
		System.out.println(balance+":increment by"+Thread.currentThread().getName());
		
	}

}
