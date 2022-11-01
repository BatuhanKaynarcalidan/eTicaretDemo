package eTicaretDemo.business.abstracts;

public interface VerificationService {
	void sendVerifyEmail(String email);
	
	boolean verifyEmail(String email);
	
	boolean checkVerifyEmail(String email);
}
