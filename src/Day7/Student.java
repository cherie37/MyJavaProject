package Day7;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

	private Address address;
	private List<Course> course;
	private List<Teacher> teacher;

	public List<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}

	Student(String fName, String lName) {
		super(fName, lName);
		// TODO Auto-generated constructor stub
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public String getAll() {
		return fName + " " + lName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
