package com.cllis.lock;

public class A {
 private static int i;
  
public  void m1() {
	synchronized (A.class) {
		System.out.println(Thread.currentThread().getName() + " enter in the m1() method");
		i++;
		System.out.println(Thread.currentThread().getName() + " exist from the m1() method");
	}
 }

public  void m2() {
	synchronized (A.class) {
		System.out.println(Thread.currentThread().getName() + " enter in the m2() method");
		i--;
		System.out.println(Thread.currentThread().getName() + " exist from the m2() method");
	}
}

}
