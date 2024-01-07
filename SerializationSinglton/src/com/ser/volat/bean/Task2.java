package com.ser.volat.bean;

public class Task2 extends Thread{

	@Override
	public void run() {
		Account task2= Account.getInstance();
		int balance=0;
		balance=task2.m2();
		System.out.println(balance+"increment by"+Thread.currentThread().getName());
		
	}

}
