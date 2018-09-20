
public class DemoCommandLine {
	public static void main(String[] args) {
//		File f;
		
		System.out.println("arg - "+args[0]+ args[1]);
		
		int value1=Integer.parseInt(args[0]);
		int value2=Integer.parseInt(args[1]);
		System.out.println("You entered :-"+(value1+value2));
		double db1=Double.parseDouble(args[0]);
		double db2=Double.parseDouble(args[1]);
		System.out.println("You entered :-"+(db1+db2));
		Integer i=new Integer(100);
		i=890;	//autoboxing
		
		int v=i.intValue();
		v=i;	//unboxing
		System.out.println(v);
		
	}
	
}
