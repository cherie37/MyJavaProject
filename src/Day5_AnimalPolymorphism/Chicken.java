package Day5_AnimalPolymorphism;

public class Chicken extends Poultry implements Fly,Run,Bite{

	@Override
	public void biteable() {
		System.out.println("Chicken can bite");
		
	}

	@Override
	public void runable() {
		System.out.println("Chicken can run");
		
	}

	@Override
	public void flyable() {
		System.out.println("Chicken can fly");
		
	}

	@Override
	void sleep() {
		System.out.println("Chicken can sleep");
		
	}

	@Override
	void eat() {
		System.out.println("Chicken can eat");
		
	}

	@Override
	void breathe() {
		System.out.println("Chicken can breathe");
		
	}
	public String getCatagory() {
		return catagory;
	}

	/*@Override
	void allCapability() {
		System.out.println("Catagory : "+getCatagory());
		biteable();
		runable();
		flyable();
		sleep();
		eat();
		breathe();
		
	}*/

}
