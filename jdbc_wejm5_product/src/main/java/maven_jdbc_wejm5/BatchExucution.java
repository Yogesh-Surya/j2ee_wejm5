package maven_jdbc_wejm5;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

public class BatchExucution {

	public static void main(String[] args) throws Exception {

		Product product1 = new Product();
		product1.setId(1);
		product1.setName("TV");
		product1.setPrice(15000);
		product1.setManufacturers("sony");

		Product product2 = new Product();
		product2.setId(2);
		product2.setName("AC");
		product2.setPrice(25000);
		product2.setManufacturers("altos");

		Product product3 = new Product();
		product3.setId(3);
		product3.setName("CAR");
		product3.setPrice(400000);
		product3.setManufacturers("maruti");

		List<Product> list = new ArrayList<Product>();
		list.add(product1);
		list.add(product2);
		list.add(product3);

		Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);

		FileInputStream fileInputStream = new FileInputStream("productdbconfig.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);

		Connection connection = DriverManager.getConnection(properties.getProperty("url"),
				properties.getProperty("user"), properties.getProperty("password"));
		PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO PRODUCT VALUES (?,?,?,?)");

		for (Product product : list) {
			preparedStatement.setInt(1, product.getId());
			preparedStatement.setString(2, product.getName());
			preparedStatement.setInt(3, product.getPrice());
			preparedStatement.setString(4, product.getManufacturers());
			preparedStatement.addBatch();
		}
		
		preparedStatement.executeBatch();
		System.out.println("Batch Exucution done: ");
		connection.close();
		
	}

}
