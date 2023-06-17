package maven_jdbc_wejm5;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Person person = new Person();
		PersonCRUD crud = new PersonCRUD();

		System.out.println(
				"Enter the chioce \n1. Save the Person \n2. Update the person \n3. Delete the by id perosn \n4. Get person details bu id \n5. Get all Person \n6. Exit ");
		int choice = sc.nextInt();
		boolean condition =true;
		do {

			switch (choice) {
			case 1: {

				System.out.println("Enter the id:");
				int id = sc.nextInt();

				System.out.println("Enter the name:");
				String name = sc.next();

				System.out.println("Enter phone no:");
				long phone = sc.nextLong();
				person.setId(id);
				person.setName(name);
				person.setPhone(phone);

				crud.savePerson(person);
			}
				break;
			case 2: {

				System.out.println("Enter the id:");
				int id = sc.nextInt();

				System.out.println("Enter the name:");
				String name = sc.next();

				System.out.println("Enter phone no:");
				long phone = sc.nextLong();
				person.setId(id);
				person.setName(name);
				person.setPhone(phone);

				crud.updatePerson(person);
			}
				break;
			case 3: {

				System.out.println("Enter the id:");
				int id = sc.nextInt();

				crud.deleteById(id);
			}
				break;
			case 4: {

				System.out.println("Enter the id:");
				int id = sc.nextInt();

				crud.fetchById(id);
			}
				break;
			case 5: {

				crud.fetchAll();
			}
				break;

			default:
				condition = false;
			}
		} while (condition);
	}

}
