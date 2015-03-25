package Day4_Animal;

public class Dog extends TerrestrialAnimal implements Run,Bite,Swim{

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

	@Override
	public void swimable() {
		System.out.println("Dog can swim");
		
	}

	@Override
	public void biteable() {
		System.out.println("Dog can bite");
		
	}

	@Override
	public void runable() {
		System.out.println("Dog can run");
		
	}
	public String getCatagory() {
		return catagory;
	}

	@Override
	void capability() {
		System.out.println("Catagory : "+getCatagory());
		sleep();
		eat();
		breathe();
		swimable();
		biteable();
		runable();
		
	}

}
