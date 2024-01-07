package com.sdp.pattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Subject {
	
private String content;
private int duration;

public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
@Override
public String toString() {
	return "Subject [content=" + content + ", duration=" + duration + "]";
}

}
class Course extends Subject implements Serializable {
	private Subject subject;
	private  String cid;
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
//		Serialization
		FileOutputStream fos= new FileOutputStream("Course.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
//		Course  c=new Course();
		Course s=new Course();
//		oos.writeObject(c);
		oos.writeObject(s);
		System.out.println(oos);
		
		FileInputStream fis= new FileInputStream("Course.ser");
		ObjectInputStream ois= new ObjectInputStream(fis);
		ois.readObject();
	}
	 
}
