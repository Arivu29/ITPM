package Services;

import java.sql.Connection;
import java.sql.Statement;

import Connect.DbConnect;
import Entities.AddFinance;

public class AddFinanceServices {
	
	 public boolean insertFinance(AddFinance fin) {
			
			
			try {
				Connection con = DbConnect.getDBConnection();  	
				Statement st = con.createStatement();
				int i = st.executeUpdate("INSERT INTO add_finance(studentid,fname,lname,paydate,paytype,amount) VALUES('"+fin.getStudentid()+"','"+fin.getFname()+"','"+fin.getLname()+"','"+fin.getPaydate()+"','"+fin.getPaytype()+"','"+fin.getAmount()+"')");

				if(i>0) {
					return true;
				}
				
			}
			catch(Exception e){
				System.out.println(e);
			} 

			return false;
		}

}
