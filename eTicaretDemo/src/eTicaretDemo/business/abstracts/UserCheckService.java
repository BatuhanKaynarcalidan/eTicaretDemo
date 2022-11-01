package eTicaretDemo.business.abstracts;

import eTicaretDemo.entities.concretes.User;

public interface UserCheckService {
	boolean checkEmail(User user);
	
	boolean checkPassword(User user);
	
	boolean checkFirstName(User user);
	
	boolean checkLastName(User user);
}
