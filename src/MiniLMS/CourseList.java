package MiniLMS;

public class CourseList {
	
	private String[] courses;
	private int count;
	
	public CourseList(int size) {
		
		courses = new String[size];
		count=0;
	}

	public void addCourse(String course) {
		
		if(count<courses.length) {
			
			courses[count] = course;
			
			count++;
		}
		
		else {
			
			System.out.println("Course list is full");
		}
	}
	
	public void displayCourses() {
		
		for(int i =0; i<count; i++) {
			
			System.out.println(courses[i]);
		}
	}
}
