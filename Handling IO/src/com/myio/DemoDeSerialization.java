package com.myio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoDeSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fi=new FileInputStream("person.txt");
		ObjectInputStream oi=new ObjectInputStream(fi);
		Object o=oi.readObject();
		Person p=(Person)o;
		System.out.println(p.getPerID()+"\t"+p.getPersonAddress());
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();}
	}
}
