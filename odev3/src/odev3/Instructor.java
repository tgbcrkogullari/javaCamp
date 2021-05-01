package odev3;

public class Instructor extends User {

	String givenOfCourses;
	String profession;
	
	public Instructor() {
		
	}

	public Instructor(String givenOfCourses, String profession) {
		super();
		this.givenOfCourses = givenOfCourses;
		this.profession = profession;
	}

	public String getGivenOfCourses() {
		return givenOfCourses;
	}

	public void setGivenOfCourses(String givenOfCourses) {
		this.givenOfCourses = givenOfCourses;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}
}