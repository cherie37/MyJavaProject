package Day7;

import java.util.*;

public class Teacher extends Person implements Drive {

	
	private List<Address> address;
	private Course course;
	private List<Student> student;
	
	public List<Student> getStudent() {
		return student;
	}


	public void setStudent(List<Student> student) {
		this.student = student;
	}


	Teacher(String fName, String lName) {
		super(fName, lName);
		// TODO Auto-generated constructor stub
	}

	
	

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public String getAll() {
		return fName + " " + lName;
	}




	@Override
	public void canDrive() {
		System.out.println("Teacher "+getAll()+" Can drive.");
		
	}

}
