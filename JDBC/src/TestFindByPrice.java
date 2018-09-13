import java.util.List;

import com.connections.book;
import com.dao.BookDAO;
import com.dao.impl.BookDAOImpl;

public class TestFindByPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDAO dao = new BookDAOImpl();

		float price = 182.11f;
		List<book>books=dao.findAllBooks();
		
		if(books.size()>0) {
			for(book Book:books) {
				System.out.println(Book);
			}
		}
		else {
			System.out.println("NO DATA FOUND");
		}
		book Book = dao.findBookByISBN(2);
		System.out.println(Book);

	}
}