package com.myio;
import java.io.File;
import java.io.IOException;

public class DemoFile {
	public static void main(String[] args) {
		File myFile=new File("data.txt");
		try {
			myFile.createNewFile();
			System.out.println("File created succesfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
