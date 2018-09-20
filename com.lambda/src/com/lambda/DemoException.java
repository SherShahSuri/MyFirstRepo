package com.lambda;

public class DemoException {
	public static void main(String[] args) throws MyException {
		int min_bal=100;
		try{
			if(min_bal<1000) {
				throw new MyException("Balance is less than 1000");
			}
			else {
				System.out.println("Your balance is within limit.");
			}
		}
		catch(MyException e){
//			e.display();
			e.printStackTrace();
		}
	}
}
