
public class DemoID {
	public static void main(String[] args) {
		int value1=Integer.parseInt(args[0]);
		int value2=Integer.parseInt(args[1]);
		int value3=Integer.parseInt(args[2]);
		int value4=Integer.parseInt(args[3]);
		
		int[] array;
		array=new int[4];
		array[0]=value1;
		array[1]=value2;
		array[2]=value3;
		array[3]=value4;
		
//		System.out.println("array zerp"+array[0]);
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		for(int arr:array) {
			//enhanced for loop
			System.out.println(arr);
		}
		
	}

}
