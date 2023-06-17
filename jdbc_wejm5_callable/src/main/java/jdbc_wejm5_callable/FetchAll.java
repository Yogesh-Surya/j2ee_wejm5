package jdbc_wejm5_callable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

public class FetchAll {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fileInputStream = new FileInputStream("companydbconfig.properties");
		Properties properties =new Properties();
		properties.load(fileInputStream);
		
		Class.forName(properties.getProperty("className"));
		Connection connection  = DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("user"),properties.getProperty("password"));
		
		CallableStatement callableStatement = connection.prepareCall("call companydb.company_fetch()");

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
