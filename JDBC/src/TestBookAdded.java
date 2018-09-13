import com.connections.book;
import com.dao.BookDAO;
import com.dao.impl.BookDAOImpl;

public class TestBookAdded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDAO dao = new BookDAOImpl();
		book Book = new book();
		Book.setAuthor("one2");
		Book.setISBN(3444);
		Book.setBookName("Hibernate in Action");
		Book.setPrice(400d);
		Book.setPublication("citi ltd.");

		int rows = dao.addBook(Book);
		if (rows > 0) {
			System.out.println("Data added suuccessfully");
		} else {
			System.out.println("No row added");
		}

	}

}
