package eTÝcaret.dataAccess.abstaracts;

import java.util.List;

import eTÝcaret.entities.concretes.Users;

public interface UserDao {
	void add(Users user);
	void update(Users user);
	void delete(Users user);
	Users getById(int id);
	Users getByEmail(String email);
	Users getLoginInfos(String email, String password);
	List<Users>getAll();

}
