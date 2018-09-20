package com.myio;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;

public class DemoFileWriting {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name=null;
		String add=null;
		String[]hobbies= null;
		System.out.println("Please enter your name");
		try {
			name = br.readLine();
			System.out.println("You entered :" + name+"\n");

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Please enter your address");
		try {
			add = br.readLine();
			System.out.println("You entered :" + add+"\n");

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("enter your two hobbies");
		try {
			hobbies = new String[2];
			hobbies[0] = br.readLine();
			hobbies[1] = br.readLine();
			System.out.println("your hobbies are the following \n" + hobbies[0] + "\n" + hobbies[1]+"\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileWriter writer=null;
		try {
			writer=new FileWriter("data.txt", true);
			writer.write(name+"\n"+add+"\n"+hobbies[0]+"\n"+hobbies[1]+"\n");
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
