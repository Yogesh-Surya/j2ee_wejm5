package jdbc_conncetion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseConnection {

	public static void main(String[] args) throws Exception {

//		Five steps: 
//		1. Register/load the driver
//		2. Create connection
//		3. Create statement
//		4. Exucute query
//		5.Close connection
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		
		Statement statement = connection.createStatement();
		
		int count = statement.executeUpdate("INSERT INTO STUDENT VALUES(4,'rama', 'PUNE', 66775451,'10TH')");
		 
		connection.close();	
		
		if (count == 1) {
			System.out.println("Data inserted");
		}
		else {
			System.out.println("Not inserted");
		}
	}

}
