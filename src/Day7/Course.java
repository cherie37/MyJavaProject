package Day7;

import java.net.IDN;
import java.util.HashMap;
import java.util.Map;

public class Course  {

	String id_c;
	String nameCourse;

	public Course(String id_c, String nameCourse) {
		this.id_c = id_c;
		this.nameCourse = nameCourse;
	}

	public String getId_c() {
		return id_c;
	}

	public void setId_c(String id_c) {
		this.id_c = id_c;
	}

	public String getNameCourse() {
		return nameCourse;
	}

	public void setNameCourse(String nameCourse) {
		this.nameCourse = nameCourse;
	}

	public String courseDetail() {
		
		 return id_c+" "+nameCourse ;
	}

}
