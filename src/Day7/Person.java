package Day7;

public class Person  {

	
	String fName;
	String lName;
	String addreass;
	
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

	

	Person(String fName,String lName) {
		this.fName = fName;
		this.lName = lName;

	}



	public String getAddreass() {
		return addreass;
	}

	public void setAddreass(String addreass) {
		this.addreass = addreass;
	}

}
