package Day5_HasRelations;

public class Cat extends Animal {
	Cat(String name, String color, String size, String sex) {
		super(name, color, size, sex);
		// TODO Auto-generated constructor stub
	}


	
	public Cat() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public void move() {
		System.out.println("Cat move");
		
	}

	@Override
	public void eat() {
		System.out.println("Cat eat");
		
	}

}
