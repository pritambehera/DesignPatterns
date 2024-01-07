package com.ser.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.ser.bean.Subject;

public class SerializationTest {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Subject subject = new Subject();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\Subject.ser"));
		oos.writeObject(oos);
		System.out.println(subject);
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\Subject.ser"));
		ois.readObject();
		System.out.println(subject);

	}

}
