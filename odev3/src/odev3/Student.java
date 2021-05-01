package odev3;

public class Student extends User {
	
	String attendedOfCourses;
	
	public Student() {
		
	}
		
	public Student(String attendedOfCourses) {
		super();
		this.attendedOfCourses = attendedOfCourses;

	}

	public String getAttendedOfCourses() {
		return attendedOfCourses;
	}

	public void setAttendedOfCourses(String attendedOfCourses) {
		this.attendedOfCourses = attendedOfCourses;
	}
}