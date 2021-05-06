package eTÝcaret.business.concretes;

import eTÝcaret.business.abstracts.EmailService;
import eTÝcaret.business.abstracts.UsersService;
import eTÝcaret.business.abstracts.UsersValidationService;
import eTÝcaret.core.AuthService;
import eTÝcaret.entities.concretes.Users;

public class AuthManager implements AuthService {
	private UsersService userService;
	private UsersValidationService userValidationService;
	private EmailService emailService;
	
	public AuthManager(UsersService usersService, UsersValidationService usersValidationService,
			EmailService emailService) 
	{
		this.userService = usersService;
		this.userValidationService = usersValidationService;
		this.emailService = emailService;
	}

	@Override
	public void register(int id, String firstName, String lastName, String email, String password) {
Users tempUser = new Users(id, firstName, lastName, email, password, false);
		
		if (!userValidationService.validateUsers(tempUser)) {
			System.out.println("\nRegistration was NOT successful!\nPlease check your infos again!");
			return;
		}
		
		if (!isEmailNOTUsed(email)) {
			System.out.println("\nRegistration was NOT Successful: This E-mail is already exist!");
			return;
		}
		
		else {
			System.out.println("\nRegistration was Successful!\nPlease check your E-mail to verify your account!");
			emailService.send("\nTo verify your account use the link below:\nhttps://www.verificationTest.com/verify?id=12345");
			userService.add(tempUser);
		}
		
	
		
	}

	private boolean isEmailNOTUsed(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void login(String email, String password) {
		// TODO Auto-generated method stub
		
	}

}
