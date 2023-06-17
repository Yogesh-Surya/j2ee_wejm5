package maven_wejm5_jdbc;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxExpect.Open.Condition;

public class UserMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

		Scanner scanner = new Scanner(System.in);
		User user = new User();

		UserCRUD crud = new UserCRUD();

		System.out.println("Enter the choice \n1. SignUp User \n2. Login user \n3. Exit");
		int choice = scanner.nextInt();
		boolean condition = true;
		do {

			switch (choice) {
			case 1:
				System.out.println("Enter the Id");
				user.setId(scanner.nextInt());
				System.out.println("Enter the name");
				user.setName(scanner.next());

				System.out.println("Enter the email");
				user.setEmail(scanner.next());

				System.out.println("Enter the password");
				user.setPassword(scanner.next());

				System.out.println("Enter the address");
				user.setAddress(scanner.next());

				crud.signupUser(user);
				break;
			case 2: {
				System.out.println("Enter the email");
				String email = scanner.next();
				user.setEmail(email);
//				user.setEmail(scanner.next());
				System.out.println("Enter the password");
				user.setPassword(scanner.next());

				boolean result = crud.logInUser(user);
				if (result) {
					System.out.println("Loged in successfull");
					crud.displayPassword(email);
					boolean flag = true;

					do {
						System.out.println("Enter the choice \n1. Update Passwords \n2.Logout");
						int choice1 = scanner.nextInt();
						switch (choice1) {
						case 1: {
							System.out.println("Enter the facebook password");
							String facebook = scanner.next();
							System.out.println("Enter the whatsapp password");
							String whatsapp = scanner.next();
							System.out.println("Enter the snapchat password");
							String snapchat = scanner.next();
							System.out.println("Enter the twitter password");
							String twitter = scanner.next();
							System.out.println("Enter the instagrm password");
							String instagrm = scanner.next();

							user.setFacebook(facebook);
							user.setWhatsapp(whatsapp);
							user.setSnapchat(snapchat);
							user.setTwitter(twitter);
							user.setInstagram(instagrm);

							crud.updatePassword(user);
							break;
							
						}
						default:
							flag = false;

						}
					} while (flag);

				} else {
					System.out.println("Failed to login");
				}
			}
			break;
			default:
				condition = false;

			}
		} while (condition);
	}

}
