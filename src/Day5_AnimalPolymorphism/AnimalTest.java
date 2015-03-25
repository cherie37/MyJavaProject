package Day5_AnimalPolymorphism;

import java.util.Scanner;

public class AnimalTest {
	static void capability(Animal animal) {

		animal.sleep();
		animal.eat();
		animal.breathe();

	}

	public static void main(String[] args) {
		int choice;
		String[] AnimalType = { "Cat", "Dog", "Fish", "Chicken", "Bird", "Duck" };
		System.out.println("Select choice : ");
		for (int i = 0; i < AnimalType.length; i++) {
			System.out.println((i + 1) + " : " + AnimalType[i]);
		}
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();

		switch (choice) {
		case 1:
			Animal cat = new Cat();
			capability(cat);
			break;

		case 2:
			Animal dog = new Dog();
			capability(dog);
			break;

		case 3:
			Animal fish = new Fish();
			capability(fish);
			break;

		case 4:
			//Animal Chi = new Chicken();
			capability(new Chicken());
			break;

		case 5:
			//Animal bird = new Bird();
			capability(new Bird());
			break;
		case 6:
			//Animal duck = new Duck();
			capability(new Duck());
			break;

		default:
			break;
		}

	}

}
