package eT�caret.business.concretes;

import java.util.regex.Pattern;

import eT�caret.business.abstracts.UsersValidationService;
import eT�caret.entities.concretes.Users;

public class UsersValidationManager implements UsersValidationService {
	
	public static final Pattern isValidEmail_Pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	@Override
	public boolean validateUsers(Users user) {
		if (isValidEmail(user.geteMail()) && isValidPassword(user.getPassword()) && isValidFirstName(user.getFirstName()) 
				&& isValidLastName(user.getLastName()) && isAllFilled(user.getFirstName(), user.getLastName(), user.geteMail(), user.getPassword())) 
		{
		return true;
		}
		
		return false;
	}
	
	private boolean isValidEmail(String email) {
		return isValidEmail_Pattern.matcher(email).find();
	}
	
	private boolean isValidPassword(String password) {
		return password.length() >= 6;
	}
	
	private boolean isValidFirstName(String firstName) {
		return firstName.length() >= 2;
	}
	
	private boolean isValidLastName(String lastName) {
		return lastName.length() >= 2;		
	}
	
	private boolean isAllFilled(String firstName, String lastName, String email, String password) {
		if (firstName.length() > 0 && lastName.length() > 0 && email.length() > 0 && password.length() > 0) {
			return true;
		}
		
		return false;
	}

}
