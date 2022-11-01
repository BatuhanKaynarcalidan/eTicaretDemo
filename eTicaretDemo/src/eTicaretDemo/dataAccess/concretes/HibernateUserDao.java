package eTicaretDemo.dataAccess.concretes;

import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi : " + user.getFirstName() + " " + user.getLastName());
		
	}
	
}
