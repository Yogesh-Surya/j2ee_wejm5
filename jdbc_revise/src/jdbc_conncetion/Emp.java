package jdbc_conncetion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Scanner;

public class Emp {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		String url = "jdbc:mysql://localhost:3306/empdb";
		String userName = "root";
		String password = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, userName, password);

		// Statement statement = connection.prepareStatement("INSERT INTO EMP VALUES
		// (?,?,?,?)");

		PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO EMP VALUES (?,?,?,?)");
		for (int i = 0; i < 5; i++) {

			System.out.println("Enter no: ");
			preparedStatement.setInt(1, sc.nextInt());
			System.out.println("Enter name: ");
			preparedStatement.setString(2, sc.next());
			System.out.println("Enter job: ");
			preparedStatement.setString(3, sc.next());
			System.out.println("Enter sallary: ");
			preparedStatement.setInt(4, sc.nextInt());

			int count = preparedStatement.executeUpdate();
			if (count > 0) {
				System.out.println("Inserted" + i + "recodrd");
			}
			else {
				System.out.println("Not inserted");
			}
		}
	

	}

}
