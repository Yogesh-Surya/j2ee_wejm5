package jdbc_conncetion;

import java.awt.Taskbar.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmpDisplayAll {

	public static void main(String[] args) throws Exception {

		String url = "jdbc:mysql://localhost:3306/empdb";
		String userName = "root";
		String password = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, userName, password);
		
		Statement statement = connection.createStatement();
		
		//statement.execute("SELECT * FROM EMP");
		
		ResultSet resultSet = statement.executeQuery("SELECT * FROM EMP");
		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1)); 
			System.out.println(resultSet.getString(2)); 
			System.out.println(resultSet.getString(3)); 
			System.out.println(resultSet.getInt(4)); 
			System.out.println("*************************************");
		}

	}

}
