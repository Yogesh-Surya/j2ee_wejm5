package jdbc_conncetion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Revise {

	public static void main(String[] args) throws ClassNotFoundException, Exception {

		String url = "jdbc:mysql://localhost:3306/mydb";
		String userName = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, userName, password);

		Statement statement = connection.createStatement();

		int count = statement.executeUpdate("INSERT INTO MY_TABLE VALUES(1,'YOGI',1234657890)");
		if (count == 1) {
			System.out.println("Inserted");
		}
		else {
			System.out.println("Not Inserted");
		}
			
	}

}
