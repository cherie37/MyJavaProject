package Day5_AnimalPolymorphism;

public class Duck extends Poultry implements Fly,Swim,Run,Bite{

	@Override
	public void biteable() {
		System.out.println("Duck can Bite");
		
	}

	@Override
	public void runable() {
		System.out.println("Duck can run");
		
	}

	@Override
	public void swimable() {
		System.out.println("Duck can swim");
		
	}

	@Override
	public void flyable() {
		System.out.println("Duck can fly");
		
	}

	@Override
	void sleep() {
		System.out.println("Duck can sleep");
		
	}

	@Override
	void eat() {
		System.out.println("Duck can eat");
		
	}

	@Override
	void breathe() {
		System.out.println("Duck can breathe");
		
	}

	/*@Override
	void allCapability() {
		System.out.println("Catagory : "+getCatagory());
		eat();
		sleep();
		breathe();
		biteable();
		runable();
		swimable();
		flyable();
		
	}*/
	
	public String getCatagory() {
		return catagory;
	}

}
