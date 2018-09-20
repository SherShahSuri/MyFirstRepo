import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList();
		l.add(10);
		l.add(23);
		l.add(6);
		l.add(23);
//		l.add("hello");
//		l.add(12.12d);
		
		
		System.out.println("size is "+l.size());
		l.add( new Integer(500));
		
		l.add(2, 200);
		System.out.println("list content "+l);
		
		for(Integer value:l) {
			System.out.println(value);	
		}
		
		Iterator<Integer> it=l.iterator();
		while(it.hasNext()) {
			Integer data=it.next();
			System.out.println(data);
		}
		
		System.out.println("2nd element is "+l.get(2));
		System.out.println("data removed is going to be "+l.remove(2));
		System.out.println("updated list now is "+l);
		
		l.remove(new Integer(23));
		
		System.out.println("new value of the list is now "+l);
		
	}
}