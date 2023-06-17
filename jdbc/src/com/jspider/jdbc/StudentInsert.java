package com.jspider.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class StudentInsert {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
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
		String query = "INSERT INTO STUDENT VALUES (?,?,?,?,?)";
		
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		Connection connectin = DriverManager.getConnection(url);
		PreparedStatement preparedStatemt = connectin.prepareStatement(query);
		
		preparedStatemt.setInt(1,id);
		preparedStatemt.setString(2,name);
		preparedStatemt.setString(3,address);
		preparedStatemt.setLong(4,phone);
		preparedStatemt.setString(5,cls);
		
		int count = preparedStatemt.executeUpdate();
		if (count >= 1) {
			System.out.println("Inserted");
		}
		else {
			System.out.println("Not-Inserted");
		}
		connectin.close();

	}
	

}
