package com.cllis.lock;

public class Task  implements Runnable{

	@Override
	public void run() {
			A a=new A();
			a.m1();
			a.m2();
		
	}

}
