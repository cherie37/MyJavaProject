package Day5_HasRelations;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person("Riez", "Thep", "female", 23);

		// New Dogs
		Dog dog = new Dog("Ai", "Black", "Big", "Male");
		Dog dog2 = new Dog("Bi", "Brown", "Big", "Male");

		person.setDog(dog);
		Dog dog1 = person.getDog();
		person.DogDetail();
		//System.out.println("dog : " + dog1.getName());

		System.out.println("");

		person.setDog(dog2);
		Dog dog3 = person.getDog();
		person.DogDetail();

		// New Cats
		System.out.println("");
		Cat cat = new Cat();
		cat.setName("BB");
		cat.setColor("White");
		cat.setSize("small");
		cat.setSex("Female");
		person.setCat(cat);

		Cat cat1 = person.getCat();
		person.CatDetail();
		System.out.println("");
		System.out.println("Cat :" + cat1.getName() + " " + cat1.getColor()
				+ " " + cat1.getSize() + " " + cat1.getSex());

		System.out.println("Person " + person.fName + " " + person.lName);

	}

}
