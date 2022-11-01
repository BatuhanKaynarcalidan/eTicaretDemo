package eTicaretDemo.business.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretDemo.business.abstracts.VerificationService;

public class VerificationManager implements VerificationService {
	
	private List<String> verifedMails = new ArrayList<String>();
	
	@Override
	public void sendVerifyEmail(String email) {
		System.out.println("Email Dogrulama");
		
	}
	
	@Override
	public boolean verifyEmail(String email) {
		if (verifedMails.contains(email)) {
			
			return true;
		}
		System.out.println("Emailiniz dogrulandi");
		return false;
		
	}
	
	@Override
	public boolean checkVerifyEmail(String email) {
		if (verifedMails.contains(email)) {
			return true;
		}
		return false;
		
	}
	
}
