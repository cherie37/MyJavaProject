package Day4_Animal;

public class Cat extends TerrestrialAnimal implements Run,Bite{

	@Override
	void sleep() {
		System.out.println("cat can sleep");
		
	}

	@Override
	void eat() {
		System.out.println("cat can eat");
		
	}

	@Override
	void breathe() {
		System.out.println("cat can breathe");
		
	}

	@Override
	public void biteable() {
		System.out.println("cat can bite");
		
	}

	@Override
	public void runable() {
		System.out.println("cat can run");
		
	}
	
	public String getCatagory() {
		return catagory;
	}
	
	public void capability() {
		System.out.println("Catagory : "+getCatagory());
		sleep();
		eat();
		breathe();
		biteable();
		runable();
		
		
	}

}
