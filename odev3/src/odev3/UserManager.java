package odev3;

public class UserManager {

	public void logIn (User user) {
		
		System.out.println(user.userName + " kullanýcýsý giriþ yaptý.");
		System.out.println("-------------------------------------------------");
		
	}
	
	public void logOut (User user) {
		
		System.out.println("-------------------------------------------------");
		System.out.println(user.userName + " kullanýcýsý çýkýþ yaptý.");
		
		
	}
	
}