package org.o7planning.thebookstore.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.o7planning.thebookstore.beans.Book;

@WebServlet(urlPatterns="/bookList")
public class BookListServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	public BookListServlet(){
		super();
	}
	
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		List<Book> list = new ArrayList<>();
		Book book = null;
		book = new Book("Juggad","B615","$42");
		list.add(book);
		book = new Book("The Creativity","B616","$82");
		list.add(book);
		book = new Book("The Stranger","B617","$47");
		list.add(book);
		book = new Book("New World","B618","$39");
		list.add(book);
		book = new Book("Pride Forever","B619","$65");
		list.add(book);
		
		request.setAttribute("bookList", list);
		RequestDispatcher dispatcher = request.getServletContext()
				.getRequestDispatcher("/WEB-INF/views/bookListView.jsp");
		dispatcher.forward(request, response);
	}
	
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
