package eT�caret.business.concretes;

import eT�caret.business.abstracts.EmailService;


public class EmailManager implements EmailService{

	@Override
	public void send(String message) {
		System.out.println("\n Sent message : " + message);
		
	}

}
