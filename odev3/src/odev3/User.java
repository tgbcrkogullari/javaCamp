package odev3;

public class User {
	
	int id;
	String userName;
	String password;
	String fistName;
	String lastName;
	String nationalIdentity;
	String eMail;
	
	public User () {
		
	}
	
	public User(int id, String userName, String password, String fistName, String lastName, String nationalIdentity,
			String eMail) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.fistName = fistName;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
		this.eMail = eMail;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}


}