import com.connections.book;
import com.dao.BookDAO;
import com.dao.impl.BookDAOImpl;

public class TestUpdateBook {
	public static void main(String[] args) {
		BookDAO dao = new BookDAOImpl();
		int ISBN = 1;
		book Book = new book();
		if (dao.updateBook(ISBN, Book)) {
			System.out.println("price updated successfully");
		} else {
			System.out.println("No such record found");
		}
	}
}
