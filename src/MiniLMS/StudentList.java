package MiniLMS;

import java.util.ArrayList;

public class StudentList {
	
	private ArrayList<Student> students = new ArrayList<>();
	
	
	public void addStudent(Student s) {
		
		students.add(s);
	}
	
	public void removeStudent (String seatNo) {
		
		for (int i = 0; i<students.size(); i++) {
			
			if(students.get(i).getSeatNo().equals(seatNo)) {
				
				students.remove(i);
				
				System.out.println("Removed: " + seatNo);
				
				return;
			}
		}
			
		System.out.println("This seat number does not exist");
				


	}
	
	
	public void display() {
		for(Student s: students) {
			
			System.out.println(s);
		}
	}

}
