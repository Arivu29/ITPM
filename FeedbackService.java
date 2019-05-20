package Services;

import java.sql.Connection;
import java.sql.Statement;

import Connect.DbConnect;
import Entities.Feedback;

public class FeedbackService {
	
	 public boolean insertFeedback(Feedback fb) {
			
			
			try {
				Connection con = DbConnect.getDBConnection();  	
				Statement st = con.createStatement();
				int i = st.executeUpdate("INSERT INTO feedback(libraryid,feedback) VALUES('"+fb.getLibraryid()+"','"+fb.getFeedback()+"')");

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
