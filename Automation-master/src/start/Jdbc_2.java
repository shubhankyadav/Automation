package start;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url="jdbc:mysql://localhost:3306/shanu";
		//"jdbc:/mysql://" + host + ":" + port + "/shanu"
		String host="localhost";
		String port="3306";
		String un="root";
		String pwd="shubhankyadav";
		String abc= "ABCD";
//		Class.forName("com.mysql.jdbc.Driver"); 
		Connection con = DriverManager.getConnection(url,un, pwd);
		
		  Statement s = con.createStatement(); 
		  ResultSet rs =s.executeQuery("select * from Cardsinfo where CardName ='Credit'");
		  
		  rs.next(); System.out.println(rs.getString("catagory"));
		 

	}

}
