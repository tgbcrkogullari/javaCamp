package odev3;

public class UserManager {

	public void logIn (User user) {
		
		System.out.println(user.userName + " kullan�c�s� giri� yapt�.");
		System.out.println("-------------------------------------------------");
		
	}
	
	public void logOut (User user) {
		
		System.out.println("-------------------------------------------------");
		System.out.println(user.userName + " kullan�c�s� ��k�� yapt�.");
		
		
	}
	
}