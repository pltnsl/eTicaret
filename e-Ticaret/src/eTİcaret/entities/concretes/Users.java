package eTÝcaret.entities.concretes;

import eTÝcaret.entities.abstracts.Entity;

public class Users implements Entity {
	private int id;
	private String firstName;
	private String lastName;
	private String eMail;
	private boolean verifiedUser;
	private String password;
	
	public Users(int id,String firstName, String lastName, String eMail, String password, boolean verifiedUser) {
		super();
		this.id=id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.password = password;
		this.verifiedUser = verifiedUser;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPassword() {
		return password;
	}
	public void setPasspord(String password) {
		this.password = password;
	}
	public boolean isVerifiedUser() {
		return verifiedUser;
	}
	public void setVerifiedUser(boolean verifiedUser) {
		this.verifiedUser = verifiedUser;
	}
}
