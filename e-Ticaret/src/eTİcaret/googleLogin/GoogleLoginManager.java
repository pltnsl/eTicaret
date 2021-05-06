package eTÝcaret.googleLogin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GoogleLoginManager {
	public void register(String email, String password) {
		Pattern pattern = Pattern.compile("@gmail");
		Matcher matcher = pattern.matcher(email);
		
		if(matcher.find()) {
			System.out.println("User registered with google");
		    return;
		}
		System.out.println("Email doesn't fit the gmail format");
	}

}
