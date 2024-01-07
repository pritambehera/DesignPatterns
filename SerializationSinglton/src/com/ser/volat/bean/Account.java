package com.ser.volat.bean;

public class Account {
private static Account Instance;

private String AccountNO;
private volatile int balance=100;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
public static Account getInstance() {
 if(Instance==null) {
	 synchronized(Account.class){
		 if(Instance==null) {
			 Instance=new Account();
		 }
	  }
   }
 return Instance;
}
 public int m1() {
 return balance++;
 }
 public int m2() {
	 return balance--;
 }
}

