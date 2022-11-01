package eTicaretDemo;

import eTicaretDemo.business.abstracts.UserService;
import eTicaretDemo.business.abstracts.VerificationService;
import eTicaretDemo.business.concretes.UserCheckManager;
import eTicaretDemo.business.concretes.UserManager;
import eTicaretDemo.business.concretes.VerificationManager;
import eTicaretDemo.dataAccess.concretes.HibernateUserDao;
import eTicaretDemo.entities.concretes.User;

public class Main {
	
	public static void main(String[] args) {
		User user1 = new User(1, "Bat", "Ka", "kaynarcalidanbatu@gmail.com", "1234567");
		
		VerificationService verificationService = new VerificationManager();
		UserService userService = new UserManager(new HibernateUserDao(), new UserCheckManager(), verificationService);
		
		userService.register(user1);
		System.out.println("===========================");
		verificationService.verifyEmail(user1.getEmail());
		System.out.println("===========================");
		userService.login(user1);
	}
	
}
