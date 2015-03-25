package Day4_Animal;

import java.util.Scanner;

public class AnimalTest {

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
			Cat cat = new Cat();
			cat.capability();
			break;

		case 2:
			Dog dog = new Dog();
			dog.capability();
			break;

		case 3:
			Fish fish = new Fish();
			fish.capability();
			break;

		case 4:
			Chicken Chi = new Chicken();
			Chi.capability();
			break;

		case 5:
			Bird bird = new Bird();
			bird.capability();
			break;
		case 6:
			Duck duck = new Duck();
			duck.capability();
			break;

		default:
			break;
		}

	}
}
