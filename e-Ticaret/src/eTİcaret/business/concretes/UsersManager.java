package eTÝcaret.business.concretes;

import java.util.List;

import eTÝcaret.business.abstracts.UsersService;
import eTÝcaret.dataAccess.abstaracts.UserDao;
import eTÝcaret.entities.concretes.Users;

public class UsersManager implements UsersService {
	private UserDao userDao;
	
	public UsersManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(Users user) {
		userDao.add(user);
		
	}

	@Override
	public void update(Users user) {
		userDao.update(user);
		
	}

	@Override
	public void delete(Users user) {
		userDao.delete(user);
		
	}

	@Override
	public void veriyfUsers(int id) {
		Users tempUser = userDao.getById(id);
		System.out.println("\nSuccess: " + tempUser.geteMail() + " is verified!");
		tempUser.setVerifiedUser(true);
		
	}

	@Override
	public Users getById(int id) {
		return userDao.getById(id);
	}

	@Override
	public Users getByEmail(String email) {
		return userDao.getByEmail(email);
	}

	@Override
	public Users getLoginInfos(String email, String password) {
		return userDao.getLoginInfos(email, password);
	}

	@Override
	public List<Users> getAll() {
		return userDao.getAll();
	}

}
