import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Note;
import com.helper.FactoryProvider;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class update extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String title=req.getParameter("title");
		    String content=req.getParameter("content");
		    int note_id=Integer.parseInt(req.getParameter("note_id").trim());
		    Session session=FactoryProvider.getFactory().openSession();
		    Transaction txTransaction=session.beginTransaction();
		    
		    Note note=(Note)session.get(Note.class, note_id);
		    note.setTitle(title);
		    note.setContnt(content);
		    note.setAddedDate(new Date());
		    txTransaction.commit();
		    
		    session.close();
		    
		    resp.sendRedirect("all_notes.jsp");
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
	

}
