
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connections.book;
import com.dao.BookDAO;
import com.dao.impl.BookDAOImpl;

/**
 * Servlet implementation class AddBookServlet
 */
@WebServlet("/addme")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddBookServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String author = request.getParameter("author");
		int isbn = Integer.parseInt(request.getParameter("isbn"));
		double price = Double.parseDouble(request.getParameter("price"));
		String bookName = (request.getParameter("bookName"));
		String publication = (request.getParameter("publication"));

		book Book = new book(isbn, bookName, publication, author, price);
		BookDAO dao = new BookDAOImpl();
		int rows = dao.addBook(Book);

		PrintWriter writer = response.getWriter();
		writer.println("<html><head><title>title123</title></head>");
		writer.println("<body>");
		if (rows > 0) {
			writer.println("book inserted succesfully");
		} else {
			writer.println("sorry, cannot add book, please retry.");
			String message="sorry yaar bro";
			request.setAttribute("myMessage", message);

			RequestDispatcher dispatcher = request.getRequestDispatcher("addbook.jsp");
			dispatcher.forward(request, response);
		}
	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
