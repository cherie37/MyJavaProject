package Day5_HasRelations;

public class Person {
	String fName, lName;
	String gender;
	int age;
	
	

	private Dog dog;
	private Cat cat;

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	public Person(String fName, String lName, String gender, int age) {
		this.fName = fName;
		this.lName = lName;
		this.gender = gender;
		this.age = age;

	}
	
	public void DogDetail(){

		System.out.println("My Dog Name : "+dog.getName());
		System.out.println("My Dog Color : "+dog.getColor());
		System.out.println("My Dog Size : "+dog.getSize());
		System.out.println("My Dog Sex : "+dog.getSex());
		
		
	}
	
	public void CatDetail(){

		System.out.println("My Cat Name : "+cat.getName());
		System.out.println("My Cat Color : "+cat.getColor());
		System.out.println("My Cat Size : "+cat.getSize());
		System.out.println("My Cat Sex : "+cat.getSex());
		
		
	}

	
}
