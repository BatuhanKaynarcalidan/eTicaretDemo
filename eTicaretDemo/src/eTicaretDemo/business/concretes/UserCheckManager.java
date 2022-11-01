package eTicaretDemo.business.concretes;

import java.util.regex.Pattern;

import eTicaretDemo.business.abstracts.UserCheckService;
import eTicaretDemo.entities.concretes.User;

public class UserCheckManager implements UserCheckService {
	public boolean checkEmail(User user) {
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		if (user.getEmail().isEmpty()) {
			System.out.println("Kullanılan E-posta");
			return false;
		} else if (pattern.matcher(user.getEmail()).find() == false) {
			System.out.println("Gecersiz E-posta.E-posta soyle olmalidir : test@mymail.com");
			return false;
		}
		return true;
		
	}
	
	@Override
	public boolean checkPassword(User user) {
		if (user.getPassword().length() < 6) {
			System.out.println("Sıfrenız en az 6 karakter olmalıdır.");
			return false;
		}
		return true;
		
	}
	
	@Override
	public boolean checkFirstName(User user) {
		if (user.getFirstName().length() < 3) {
			System.out.println("Adınız en az 3 harften olusmalıdır.");
			return false;
		}
		return true;
		
	}
	
	@Override
	public boolean checkLastName(User user) {
		if (user.getLastName().length() < 2) {
			System.out.println("Soyadınız en az ıkı harften olusmalıdır.");
			return false;
		}
		return true;
		
	}
}
