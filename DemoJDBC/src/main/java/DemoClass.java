// Java Database Connectivity Basics

/**
 * 	// STEPS TO FOLLOW TO USE JDBC
 * 
 *  1. Import the required package
 *  
 *  2. a) Load the driver first   --> for mySQL : com.mysql.jdbc.Driver
 *     b) Then load the register  --> 
 *     
 *  3. Establish the connection   --> Connection interface
 *  
 *  4. Create the statement       --> Statement interface
 *  
 *  5. Execute the queries
 *  
 *  6. Process the result
 *  
 *  7. Close the Statement obj and Connection obj
 *  
 */

import java.sql.*;															// Step-1
import java.io.*;

public class DemoClass {

	public static void main(String[] args) throws Exception {
		
		// Constants required to create a connection
		String url = " ";
		String uname = "root";
		String pswrd = " ";
		
		Class.forName("com.mysql.jdbc.Driver");								// Step-2(b), 2(a) was done via GUI
		
		Connection conn = DriverManager.getConnection(url, uname, pswrd);	// Step-3
		
		Statement stmt = conn.createStatement();							// Step-4
		
		ResultSet rs = stmt.executeQuery(" ");								// Step-5
		
		while(rs.next()) {													// Step-6
			System.out.println(rs.getString(1) + " " + rs.getString(2));
		}
		
		stmt.close();														// Step-7
		conn.close();
	}
}
