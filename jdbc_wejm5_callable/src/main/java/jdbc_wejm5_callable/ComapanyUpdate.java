package jdbc_wejm5_callable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.Scanner;

public class ComapanyUpdate {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int id = sc.nextInt();
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter gst: ");
		String gst = sc.next();
		System.out.println("Enter Address: ");
		String address = sc.next();
		System.out.println("Enter phone: ");
		long phone = sc.nextLong();
		
		FileInputStream fileInputStream = new FileInputStream("companydbconfig.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		
		Class.forName(properties.getProperty("className"));
		Connection connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"), properties.getProperty("password"));
		
		CallableStatement callableStatement = connection.prepareCall("call companydb.update_company(?,?,?,?,?)");
		callableStatement.setInt(1, id);
		callableStatement.setString(2, name);
		callableStatement.setString(3, gst);
		callableStatement.setString(4, address);
		callableStatement.setLong(5, phone);

		int count = callableStatement.executeUpdate();
		
		if (count==1) {
			System.out.println("Updated");
		}
		else {
			System.out.println("not updated");
		}
	}

}
