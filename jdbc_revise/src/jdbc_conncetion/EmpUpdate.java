package jdbc_conncetion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class EmpUpdate {

	public static void main(String[] args) throws ClassNotFoundException, Exception {

		Scanner sc = new Scanner(System.in);

		String url = "jdbc:mysql://localhost:3306/empdb";
		String userName = "root";
		String password = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(url, userName, password);

		PreparedStatement preparedStatement = connection.prepareStatement("UPDATE EMP SET EMAME=?,JOB=?,SAL=?WHERE ID=?(?,?,?,?)");
		
		System.out.println("Enter new  no: ");
		preparedStatement.setInt(1, sc.nextInt());
		System.out.println("Enter new name: ");
		preparedStatement.setString(2, sc.next());
		System.out.println("Enter new job: ");
		preparedStatement.setString(3, sc.next());
		System.out.println("Enter new sallary: ");
		preparedStatement.setInt(4, sc.nextInt());

		int count = preparedStatement.executeUpdate();
		if (count > 0) {
			System.out.println("Updated record ");
		}
		else {
			System.out.println("Not updated");
		}
	}

}
