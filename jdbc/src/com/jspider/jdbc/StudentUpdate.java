package com.jspider.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class StudentUpdate {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the id");
		int id = sc.nextInt();
		
		System.out.println("Enter the name");
		String name = sc.next();
		
		System.out.println("Enter the address");
		String address = sc.next();
		
		System.out.println("Enter the phone");
		long phone = sc.nextLong();
		
		System.out.println("Enter the class");
		String cls = sc.next();
		
		String url = "jdbc:mysql://localhost:3306/student?user=root&password=root";
		String query = "UPDATE STUDENT SET NAME=?, ADDRESS=?, MOBILE_NO=?, CLASS=? WHERE ID=?";
		
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		Connection connection = DriverManager.getConnection(url);
		PreparedStatement preparedStatemt =connection.prepareStatement(query);
		
		preparedStatemt.setString(1,name);
		preparedStatemt.setString(2,address);
		preparedStatemt.setLong(3,phone);
		preparedStatemt.setString(4,cls);
		preparedStatemt.setInt(5,id);
		
		int count = preparedStatemt.executeUpdate();
		if (count == 1) {
			System.out.println("UPDATED");
		}
		else {
			System.out.println("Not-UPDATED");
		}
		connection.close();

	}
	

}
