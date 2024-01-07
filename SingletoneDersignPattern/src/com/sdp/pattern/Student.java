package com.sdp.pattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Course implements Serializable{
	private String cid;
	private String cname;
	
}
public class Student   {
 public static void main(String[] args) throws IOException, ClassNotFoundException {
	 Course c= new Course();
	FileOutputStream fos=new FileOutputStream("Student.ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(c);
	System.out.println("successfull");
	
	FileInputStream fis= new FileInputStream("Student.ser");
	ObjectInputStream ois= new ObjectInputStream(fis);
	

}
}
