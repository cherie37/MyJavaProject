package Day7;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {

		Student strRie = new Student("Riez", "Thep");
		Student strWan = new Student("Wan", "Updaul");

		Teacher tNet = new Teacher("Net", "NetIdol");
		Teacher tTom = new Teacher("Tom", "MhepKing");

		Address a1 = new Address("street11", "dist1", "provinceA", "67800");
		Address a2 = new Address("street12", "dist2", "provinceA", "67801");
		Address a3 = new Address("street13", "dist3", "provinceB", "67802");
		Address a4 = new Address("street14", "dist4", "provinceB", "67803");

		Course c1 = new Course("001", "courseAB");
		Course c2 = new Course("002", "courseAC");
		Course c3 = new Course("003", "courseAD");

		ArrayList<Address> addressTNet = new ArrayList<Address>(); // address of  teacher t1
		addressTNet.add(a2);
		addressTNet.add(a1);
		tNet.setCourse(c1);
		tNet.setAddress(addressTNet);
		

		ArrayList<Teacher> teacherOfRie = new ArrayList<Teacher>(); // teacher of student Rie
		teacherOfRie.add(tNet);
		teacherOfRie.add(tTom);
		strRie.setTeacher(teacherOfRie);
		

		ArrayList<Student> studentOfNet = new ArrayList<Student>(); // student of teacher tom
		studentOfNet.add(strRie);
		studentOfNet.add(strWan);
		tNet.setStudent(studentOfNet);
		

		ArrayList<Course> cours1 = new ArrayList<Course>(); // course of student  str1
		cours1.add(c1);
		cours1.add(c2);
		strRie.setCourse(cours1);
		
		strRie.setAddress(a1);
		strWan.setAddress(a4);
		
		 
		
		

		System.out.println("Student id and name : " + strRie.fName + " "
				+ strRie.lName);
		System.out.println("Address :" + strRie.getAddress().getAllDetail());

		for (Course course : strRie.getCourse()) {
			System.out.println(course.courseDetail());
		}

		System.out.println("Student have " + teacherOfRie.size() + " teacher");

		for (Teacher teach1 : strRie.getTeacher()) {
			System.out.println(teach1.getfName() + " " + teach1.getlName());
		}

		System.out.println("***************");
		
		System.out.println("Student id and name : " + strWan.fName + " "
				+ strWan.lName);
		System.out.println("Address :" + strWan.getAddress().getAllDetail());
		

		System.out.println("***************"); // Show Teacher
		System.out.println("Teacher Name :" + tNet.fName + " " + tNet.lName);
		System.out.println("course id :" + tNet.getCourse().courseDetail());

		for (Address address1 : tNet.getAddress()) {
			System.out.println(address1.getAllDetail());
		}

		System.out.println("Teacher have " + studentOfNet.size() + " student : ");

		for (Student student1 : tNet.getStudent()) {
			System.out.println(student1.getfName()+" "+student1.getlName());
		}

		tNet.canDrive();
	}

}
