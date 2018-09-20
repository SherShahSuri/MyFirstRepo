package com.myio;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DemoRead {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	//chaining of the objects
		System.out.println("Please enter your name");
		try {
		String name =br.readLine();
		System.out.println("You entered :"+name);
		
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
