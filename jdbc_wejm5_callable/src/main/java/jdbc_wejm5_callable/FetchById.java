package jdbc_wejm5_callable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

public class FetchById {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id of row");
		int id = sc.nextInt();
		
		FileInputStream fileInputStream = new FileInputStream("companydbconfig.properties");
		Properties properties =new Properties();
		properties.load(fileInputStream);
		
		Class.forName(properties.getProperty("className"));
		Connection connection  = DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("user"),properties.getProperty("password"));
		
		CallableStatement callableStatement = connection.prepareCall("call companydb.company_fetch_by_id(?)");
		callableStatement.setInt(1, id);
		
		ResultSet resultSet = callableStatement.executeQuery();
		
		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
			System.out.println(resultSet.getString(4));
			System.out.println(resultSet.getLong(5));
			System.out.println("*********************");
			
		}

	}

}
