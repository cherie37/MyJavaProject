package Day5_AnimalPolymorphism;

public class Bird extends Poultry implements Fly,Run,Bite {

	@Override
	public void flyable() {
		System.out.println("Bird can fly");
		
	}

	@Override
	public void biteable() {
		System.out.println("Bird can bite");
		
	}

	@Override
	public void runable() {
		System.out.println("Bird can run");
		
	}

	@Override
	void sleep() {
		System.out.println("Bird can sleep");
		
	}

	@Override
	void eat() {
		System.out.println("Bird can eat");
		
	}

	@Override
	void breathe() {
		System.out.println("Bird can breathe");
		
	}
	public String getCatagory() {
		return catagory;
	}

	/*@Override
	 void allCapability() {
		System.out.println("Catagory : "+getCatagory());
		flyable();
		biteable();
		runable();
		sleep();
		eat();
		breathe();
		
	}*/
	

}
