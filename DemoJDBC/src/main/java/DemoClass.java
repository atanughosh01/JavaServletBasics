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

import java.sql.*;																// Step-1

public class DemoClass {

	public static void main(String[] args) throws Exception {
				
		// System.out.println("Hello World !!!");
		
		// Constants required to create a connection
		String url = "jdbc:mysql://localhost:3306/testdb2";
		String uname = "root";
		String pswrd = "admin123";
		
		Class.forName("com.mysql.cj.jdbc.Driver");									// Step-2(b), 2(a) was done via GUI
		
		Connection conn = DriverManager.getConnection(url, uname, pswrd);			// Step-3
		// System.out.print(conn);	
		
		Statement stmt = conn.createStatement();									// Step-4
		
		// ResultSet rs = stmt.executeQuery("INSERT INTO department VALUES ('Jaydip')");
		
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM employee");	// Step-5
		ResultSet rs = ps.executeQuery();
		
		ps = conn.prepareStatement("INSERT INTO employee VALUES (001910501016, 'Jaydip', 21, 'Mar21, 2022')");
		ps.executeUpdate();
		ps = conn.prepareStatement("INSERT INTO employee VALUES (001910501005, 'Atanu', 20, 'Jan01, 2022')");
		ps.executeUpdate();
		
		while(rs.next()) {															// Step-6
			System.out.println(rs.getString("department"));
		}
		
		stmt.close();																// Step-7
		conn.close();
	}
}
