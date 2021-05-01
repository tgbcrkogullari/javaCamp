package odev3;

public class InstructorManager {
	
	public void startToCourse(Instructor instructor) {
		
		System.out.println(instructor.givenOfCourses + " kursu baþlamýþtýr.");
				
	}
	
	public void giveHomework(Instructor instructor) {
		
		System.out.println(instructor.givenOfCourses + " kursunun ödevi eklenmiþtir.");
	}
	
	public void finishToCourse(Instructor instructor) {
		
		System.out.println(instructor.givenOfCourses + " kursu bitmiþtir.");
				
	}

}
