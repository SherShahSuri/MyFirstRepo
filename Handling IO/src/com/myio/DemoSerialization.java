package com.myio;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import com.myio.Person;
public class DemoSerialization {
	public static void main(String[] args) {
		try {
			FileOutputStream fo=new FileOutputStream("person.txt");
			ObjectOutputStream oo=new ObjectOutputStream(fo);
			oo.writeObject(new Person(12,"ab","cd", 30));
			oo.close();
			fo.close();
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (IOException  e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}


