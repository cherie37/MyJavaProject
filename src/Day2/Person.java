package Day2;

public class Person {
	String firstName;
	String lastName;
	int age;
	
	public  Person () {
		firstName="Riez";
		lastName="Thep";
	}
	
	public String getFirstName(){
		return firstName;
		
	}
	
	public String eat() {
		return "Sushi";	
	}
	
	
	public  Person (String firstName1,String lastName1) {
		firstName=firstName1;
		lastName=lastName1;
	}
	
	public static void main(String[] args) {
		
	
		Person person = new Person("Ry","Cher");
		//person.firstName = "John";
		
		System.out.println("Firstneame :" + person.firstName);
		System.out.println("Lastname :" + person.lastName);
		System.out.println(person.eat());
		
		
		
	}

}
