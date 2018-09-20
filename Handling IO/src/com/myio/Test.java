package com.myio;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		Person[] p=new Person[3];
		for(int i=0;i<3;i++) {
			p[i]=new Person();
			System.out.println("Kindly enter the Id, name, address and age for person no. "+i+"\n");
			try {
				p[i].setPerID(br.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				p[i].setPersonName(br.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				p[i].setPersonAddress(br.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				p[i].setPersonAge(br.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		FileWriter writer=null;
		try {
			writer=new FileWriter("data.txt");
			for(int i=0;i<3;i++) {
				writer.write(p[i].perID+"\t"+p[i].personName+"\t"+p[i].personAddress+"\t"+p[i].personAge+"\n");
				}
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
