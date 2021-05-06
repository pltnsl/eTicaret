package eTÝcaret.business.abstracts;

import java.util.List;

import eTÝcaret.entities.concretes.Users;

public interface UsersService {
	void add(Users user);
	void update(Users user);
	void delete(Users user);
    void veriyfUsers(int id);
	Users getById(int id);
	Users getByEmail(String email);
	Users getLoginInfos(String email, String password);
	
	List<Users> getAll();
	
	

}
