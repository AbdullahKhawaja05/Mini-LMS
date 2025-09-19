package MiniLMS;

public class Student {
	
	private String name;
	private String seatNo;
	
	public Student(String name, String seatNo) {
		
		this.name = name;
		this.seatNo = seatNo;
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getSeatNo() {
		return seatNo;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	
	@Override 
	
	public String toString() {
		return ("Name: " + name + ", Seat No: " + seatNo);
	}

}
