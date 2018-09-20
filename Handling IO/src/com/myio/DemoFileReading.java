package com.myio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoFileReading {
	public static void main(String[] args) {
		try{
			FileReader reader=new FileReader("data.txt");
			byte b=0;

			do {
				int data=reader.read();
				System.out.println((char)data);
				b=(byte)data;
				
			}while(b!=-1);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
