package com.qspider.jdbc_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;

public class DataFetch {

	public static void fetch()  throws SQLException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the id ");
		int id = sc.nextInt();
		
		String url="jdbc:mysql://localhost:3306/persondb?user=root&password=root";
		String query = "SELECT * FROM person WHERE ID=?";
		
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		Connection connection = DriverManager.getConnection(url);
		PreparedStatement preparedStatement =connection.prepareStatement(query);
		preparedStatement.setInt(1,id);
		
		ResultSet resultset = preparedStatement.executeQuery();
		
		while (resultset.next()) {
			System.out.println("*******************");
			System.out.println("id = " + resultset.getInt(1));
			System.out.println("name = " + resultset.getString(2));
			System.out.println("phone =" + resultset.getLong("phone"));

			System.out.println("*******************");
		}
		
	
		connection.close();
	}		
}


