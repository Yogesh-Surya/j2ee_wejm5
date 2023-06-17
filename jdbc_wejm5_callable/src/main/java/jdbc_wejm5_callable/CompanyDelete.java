package jdbc_wejm5_callable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class CompanyDelete {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id of row");
		int id = sc.nextInt();
		
		FileInputStream fileInputStream = new FileInputStream("companydbconfig.properties");
		Properties properties =new Properties();
		properties.load(fileInputStream);
		
		Class.forName(properties.getProperty("className"));
		Connection connection  = DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("user"),properties.getProperty("password"));
		
		CallableStatement callableStatement = connection.prepareCall("call companydb.delete_company(?)");
		callableStatement.setInt(1, id);
		int count = callableStatement.executeUpdate();
		
		if (count == 1) {
			System.out.println("Deleted succsessfully");
		}
		else {
			System.out.println("Not Deleted");
		}
		
	}

}
