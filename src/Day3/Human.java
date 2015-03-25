package Day3;

public class Human extends Life{
	public Human() {
		super("John");//super();
		System.out.println("The human default constructor");
		
	}
	
	public Human(String name) {
		super(name);
		System.out.println("The human default "+name);
		
	}

	

	

}
