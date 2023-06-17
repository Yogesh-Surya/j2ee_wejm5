package jdbc_conncetion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Helloworld {

	private static Connection connection;
	private static Statement statement;
	private PreparedStatement preparedStatement;
	private static String query;
	private static ResultSet resultSet;
	private final static String driverPath = "com.mysql.cj.jdbc.Driver";
	private final static String url = "jdbc:mysql://localhost:3306/empdb";
	private final static String userName = "root";
	private final static String password = "root";
	private static int result;

	public static void main(String[] args) {
		try {
			Class.forName(driverPath);
			connection = DriverManager.getConnection(url, userName, password);
			statement = connection.createStatement();

			// 1.create table
			String query = "create table emp (empno int(4) primary key, \" + \"ename varchar(20), job varchar(20), sal int(10))";
			result = statement.executeUpdate(query);
			System.out.println("Table created");
			result = 0;
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
