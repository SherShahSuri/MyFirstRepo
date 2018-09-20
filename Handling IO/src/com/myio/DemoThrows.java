package com.myio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoThrows {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fi=new FileInputStream("person.txt");
		ObjectInputStream oi=new ObjectInputStream(fi);
		Object o=oi.readObject();
		Person p=(Person)o;
		System.out.println(p.getPerID()+"\t"+p.getPersonAddress());
		}
}
