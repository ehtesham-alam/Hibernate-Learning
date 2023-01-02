package com.servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Note;
import com.helper.FactoryProvider;

/**
 * Servlet implementation class SaveNoteServlet
 */
public class SaveNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
				//Title,content fetch
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			Note note = new Note(title, content, new Date());
			
			//HttpSession httpSession = request.getSession();
			//httpSession.setAttribute("titlename",title);
		
			//System.out.println(note.getId()+" : "+note.getTitle());
			
			Session s = FactoryProvider.getFactory().openSession();
			Transaction tx = s.beginTransaction();
			
			s.save(note);
			tx.commit();
			s.close();
			response.setContentType("text/html");
			response.getWriter().println("<h1 style=text-align:center;> Note Added Successfully</h1>");
			response.getWriter().println("<h1 style=text-align:center><a href='all_notes.jsp'>View all notes</a></h1>");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
		

}
