package Servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entities.AddFinance;
import Services.AddFinanceServices;

/**
 * Servlet implementation class AddFinanceHandler
 */
@WebServlet("/AddFinanceHandler")
public class AddFinanceHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddFinanceHandler() {
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String studentid =request.getParameter("studentid");
        String fname =request.getParameter("fname");
        String lname=request.getParameter("lname");
        String paydate=request.getParameter("paydate");
        String paytype=request.getParameter("paytype");
        String amount=request.getParameter("amount");
  
        
        
       AddFinance addfinance=new AddFinance();
       addfinance.setStudentid(studentid);
       addfinance.setFname(fname);
       addfinance.setFname(lname);
       addfinance.setPaydate(paydate);
       addfinance.setPaytype(paytype);
       addfinance.setAmount(amount);
       

       
        
         AddFinanceServices as=new AddFinanceServices();
            if(as.insertFinance(addfinance))
                response.sendRedirect("ViewFinance.jsp");
          
         
}

	

	

}
