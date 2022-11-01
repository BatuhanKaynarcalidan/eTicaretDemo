package eTicaretDemo.business.concretes;

import eTicaretDemo.business.abstracts.UserCheckService;
import eTicaretDemo.business.abstracts.UserService;
import eTicaretDemo.business.abstracts.VerificationService;
import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	private UserCheckService userCheckService;
	private VerificationService verificationService;
	
	public UserManager(UserDao userDao, UserCheckService userCheckService, VerificationService verificationService) {
		this.userDao = userDao;
		this.userCheckService = userCheckService;
		this.verificationService = verificationService;
	}
	
	public void register(User user) {
		if (userCheckService.checkFirstName(user) && userCheckService.checkLastName(user)
				&& userCheckService.checkEmail(user) && userCheckService.checkPassword(user)) {
			userDao.add(user);
			verificationService.checkVerifyEmail(user.getEmail());
			System.out.println("Kaydiniz basarılı");
		}
	}
	
	public void login(User user) {
		if (userCheckService.checkFirstName(user) && userCheckService.checkLastName(user)
				&& userCheckService.checkEmail(user) && userCheckService.checkPassword(user)) {
			System.out.println("Basarılı bır sekılde gırıs yaptınız");
			
		} else {
			System.out.println("Gecersız e-posta veya sıfre");
		}
	}
	
}
