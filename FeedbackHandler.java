package Servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entities.Feedback;
import Services.FeedbackService;

/**
 * Servlet implementation class AddFinanceHandler
 */
@WebServlet("/FeedbackHandler")
public class FeedbackHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FeedbackHandler() {
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String libraryid =request.getParameter("libraryid");
        String feedback =request.getParameter("feedback");
        
       Feedback feed=new Feedback();
       feed.setLibraryid(libraryid);
       feed.setFeedback(feedback);     

       
        
       FeedbackService fs=new FeedbackService();
            if(fs.insertFeedback(feed))
                response.sendRedirect("Feedback.jsp");
          
         
}

	

	

}
