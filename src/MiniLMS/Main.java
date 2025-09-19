package MiniLMS;

public class Main {

	public static void main(String[] args) {
		
		// creating a new array list and adding student name and seat no
	StudentList studentList = new StudentList();
	
	studentList.addStudent(new Student("Abdullah Khawaja", "B24110006010"));
	studentList.addStudent(new Student("Ali Khan", "B24110006011"));
	studentList.addStudent(new Student("Muhammad Ali", "B24110006012"));
	
	
	// creating new static array and setting its size to 6, adding courses.
	CourseList courseList = new CourseList(6);
	
	courseList.addCourse("Object Oriented Programming");
	courseList.addCourse("Discrete Mathematics");
	courseList.addCourse("Linear Algebra");
	courseList.addCourse("Digital Logic Design");
	courseList.addCourse("Ideaology and Constitution of Pakistan");
	courseList.addCourse("Business Communication and Presentation Skills");
	courseList.addCourse("Calculus");  
	
	System.out.println("Students: ");
	studentList.display();
	
	System.out.println("-----------------------");
	
	System.out.println("Courses: ");
	courseList.displayCourses();
	
	System.out.println("-----------------------");
	
	studentList.removeStudent("B24110006012");
	
	System.out.println("-----------------------");
	
	
	System.out.println("Student list after removal:");
	studentList.display();
	
	
	
	
	
	
	


	}

}
