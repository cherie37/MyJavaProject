package Day3;

public class Life {
	public Life(){
		System.out.println("The Life default constructor");
	}

	public Life(String name) {
		System.out.println("The life constructor with string parameter");
		
	}
	public void eat() {
		System.out.println("The life (eat) ");
	}
	public void eat(String name) {
		System.out.println("The life (eat) "+name);
	}
	
	
	
}
