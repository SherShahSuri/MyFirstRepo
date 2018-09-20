import java.util.Set;
import java.util.TreeSet;

import com.beans.BookComparator;
import com.lambda.book;

public class DemoTreeSet {
	public static void main(String[] args) {
		Set<book>books =new TreeSet<>(new BookComparator());
		books.add(new book());
		books.add(new book("Core Java", 1234,800));
		books.add(new book("Complete Reference", 89, 400d));
		books.add(new book());
		
		System.out.println("Size is : "+books.size());
		System.out.println(books);
	}
}
