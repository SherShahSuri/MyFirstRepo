package mypack1.business;

public class Operation {
	public int add(int no1,int no2) {
		return no1+no2;
	}
	
	
	public int max(int[] arr) {
		int value=arr[0];
		for (int i:arr) {
			if (value<i) {
				value=i;
			}
		}
		return value;
	}
	
}
