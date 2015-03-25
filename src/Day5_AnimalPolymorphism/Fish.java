package Day5_AnimalPolymorphism;

public class Fish extends AquaticAnimal implements Swim,Bite{

	@Override
	public void biteable() {
		System.out.println("Dog can bite");
		
	}

	@Override
	public void swimable() {
		System.out.println("Dog can swim");
		
	}

	@Override
	void sleep() {
		System.out.println("Dog can sleep");
		
	}

	@Override
	void eat() {
		System.out.println("Dog can eat");
		
	}

	@Override
	void breathe() {
		System.out.println("Dog can breathe");
		
	}
	public String getCatagory() {
		return catagory;
	}

	/*@Override
	void allCapability() {
		System.out.println("Catagory : "+getCatagory());
		sleep();
		eat();
		breathe();
		biteable();
		swimable();
		
		
	}*/

}
