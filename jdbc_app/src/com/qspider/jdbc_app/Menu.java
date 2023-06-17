package com.qspider.jdbc_app;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("***************************");
		System.out.println("   Select any one option  ");
		System.out.println("***************************");
		System.out.println("1. Insert data into Table :");
		System.out.println("2. Delete data from Table :");
		System.out.println("3. Update data from Table :");
		System.out.println("4. Fetch the data from Table :");
		
		int option = scanner.nextInt();
		switch (option) {
		case 1:
			DataInsert.insert();
				break;
		case 2:
			DataDelete.delete();
			break;
		case 3:
			DataUpdate.update();
			break;
		case 4:
			DataFetch.fetch();
			
			break;
		default:
			break;
		}

	}

}
