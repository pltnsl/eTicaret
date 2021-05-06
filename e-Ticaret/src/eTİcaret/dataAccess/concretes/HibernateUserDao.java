package eTÝcaret.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTÝcaret.dataAccess.abstaracts.UserDao;
import eTÝcaret.entities.concretes.Users;

public class HibernateUserDao implements UserDao{
	List<Users> users= new ArrayList<Users>();

	@Override
	public void add(Users user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Users user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Users user) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public List<Users> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public Users getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users getByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users getLoginInfos(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
