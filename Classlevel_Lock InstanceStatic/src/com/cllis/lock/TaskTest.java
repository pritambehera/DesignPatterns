package com.cllis.lock;

public class TaskTest {
public static void main(String[] args) {
	Task task= new Task();
	for(int i=0;i <= 10;i++) {
		Thread thread=new Thread(task);
		thread.start();
	}
}
}
