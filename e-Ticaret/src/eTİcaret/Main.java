package eTİcaret;

import eTİcaret.business.abstracts.UsersService;
import eTİcaret.business.concretes.AuthManager;
import eTİcaret.business.concretes.EmailManager;
import eTİcaret.business.concretes.UsersManager;
import eTİcaret.business.concretes.UsersValidationManager;
import eTİcaret.core.AuthService;
import eTİcaret.core.GoogleLoginManagerAdapter;
import eTİcaret.dataAccess.concretes.HibernateUserDao;

public class Main {

	public static void main(String[] args) {
		
		{
			UsersService usersService = new UsersManager(new HibernateUserDao());
			
			AuthService authService = new AuthManager(usersService, new UsersValidationManager(), new EmailManager());

			
			System.out.println("\n######### Register Tests #########");
			
			authService.register(1, "Ayşe", "Yimaz", "jhgt@gmail.com", "123asd123"); // Successful
			authService.register(2, "Arda", "Kirmizi", "adsdsaEmail", "123asd3123");  // E-mail is not in correct form
			authService.register(3, "Ornek", "Deneme", "Ornekdeneme@gmail.com", "ihfgrt");  // Password must be at least 6 characters.
			authService.register(4, "F", "L", "testmail2@gmail.com", "asddsa123");  // First & Last Name of User must be at least 2 characters.
			authService.register(5, "Email", "Exists", "cxg2520@gmail.com", "123vasddsa123");  // E-mail is already exist in database.
			authService.register(6, "", "", "Ornekads@gmail.com", "asddsa321123");  // All parts of register infos must be filled. First & Last name is empty.
			
			System.out.println("\n----------------------------------------------------------------\n");
			
			authService.login("jhgt@gmail.com", "123asd123"); // Infos are correct, but User is NOT verified.
			usersService.veriyfUsers(1); // User clicked the verification link and verified.
			authService.login("jhgt@gmail.com", "123asd123"); // Retried to log in, but password is wrong
			authService.login("jhgt@gmail.com", "123asd123"); // This time e-mail is not correct
			authService.login("jhgt@gmail.com", ""); // Password cannot be empty
			authService.login("", "123test123"); // E-mail cannot be empty
			authService.login("jhgt@gmail.com", "123test123"); // Successful
			
			usersService.getAll(); // To see users registered correctly and their verification status for better tests
			
			
			System.out.println("\n\n\n######### Google Log in Simulation #########");
			
			AuthService googleLoginService = new GoogleLoginManagerAdapter();
			googleLoginService.register(6, "Google", "Test", "googletest@gmail.com", "googletest123");
			googleLoginService.login("googletest@gmail.com", "googletest123");
			

		}
	}
}
