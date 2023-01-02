package com.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;

import com.entities.Note;
import com.helper.FactoryProvider;

/**
 * Servlet implementation class SearchServlet
 */
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String search = request.getParameter("queryBox").trim();
		System.out.println(search);
		
		/*Session s = FactoryProvider.getFactory().openSession();
		Query q1 = s.createQuery("from Note");
		List<Note> list =  q1.list();
		for(Note note : list) {
			
		    // String title = note.getTitle();
			//String content = note.getContent();
			if (note.getTitle() == search) {
				response.sendRedirect("search.jsp");
			} else {
				response.sendRedirect("all_notes.jsp");
			}
			
		}*/
		// HttpSession httpSession = request.getSession();
		 //String title = (String)httpSession.getAttribute("titlename");
		 //System.out.println(title);
	//s.close();
	}

}
