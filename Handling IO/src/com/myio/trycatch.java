package com.myio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class trycatch {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // chaining of the objects
		System.out.println("Please enter your name");
		try {
			String name = br.readLine();
			System.out.println("You entered :" + name);

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Please enter your address");
		try {
			String add = br.readLine();
			System.out.println("You entered :" + add);

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("enter your two hobbies");
		try {
			String[] hobbies = new String[2];
			hobbies[0] = br.readLine();
			hobbies[1] = br.readLine();
			System.out.println("your hobbies are the following \n" + hobbies[0] + "\n" + hobbies[1]);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
