import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Note;
import com.helper.FactoryProvider;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/abc")
public class Az extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    try {
	    	String title=req.getParameter("title");
		    String content=req.getParameter("content");
		    Note note=new Note(title,content,new Date());
		    
		    Session session=FactoryProvider.getFactory().openSession();
		    Transaction txTransaction=session.beginTransaction();
		    
		    session.save(note);
		    txTransaction.commit();
		    
		    session.close();
		    resp.setContentType("text/html");
		    PrintWriter outPrintWriter=resp.getWriter();
		    outPrintWriter.println("<h1 style='text-align:center;'>Note is added succesfully </h1>");
		    outPrintWriter.println("<h1 style='text-align:center;'> <a href='all_notes.jsp'>view all notes</a> </h1>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
