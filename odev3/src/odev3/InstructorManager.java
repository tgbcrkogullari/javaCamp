package odev3;

public class InstructorManager {
	
	public void startToCourse(Instructor instructor) {
		
		System.out.println(instructor.givenOfCourses + " kursu ba�lam��t�r.");
				
	}
	
	public void giveHomework(Instructor instructor) {
		
		System.out.println(instructor.givenOfCourses + " kursunun �devi eklenmi�tir.");
	}
	
	public void finishToCourse(Instructor instructor) {
		
		System.out.println(instructor.givenOfCourses + " kursu bitmi�tir.");
				
	}

}
