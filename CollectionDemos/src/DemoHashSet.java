//array list
//hash set
//tree set


import java.util.HashSet;
import java.util.Set;

public class DemoHashSet {
	public static void main(String[] args) {
		Set<String> names=new HashSet<>();
		names.add("Java");
		names.add(".NET");
		names.add("Testing");
		names.add("Spring");
		names.add("Testing");
		
		System.out.println("Size:"+ names.size());
		System.out.println(names);
		
		boolean removed=names.remove(".NET");
		if(removed) {
			System.out.println("Data removed successfully");
		}
		else {
			System.out.println("No such data found");
		}
		System.out.println("after removal: "+names);
		System.out.println(names.contains("Java"));
	}
}
