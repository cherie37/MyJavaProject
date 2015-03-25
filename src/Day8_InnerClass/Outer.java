package Day8_InnerClass;

public class Outer {
	private String thoughts = "Hello";

	class Inner1 { //inner class
		String innerThought = "My inner";

		void doStuff() {
			System.out.println(innerThought);
			System.out.println("Bye1");

		}
	}
	static class Inner2 { //inner class //static
		String innerThought2 = "My inner2";

		void doStuff() {
			System.out.println(innerThought2);
			System.out.println("Bye2");

		}
	}
	

	public static void main(String[] args) {
		Outer o = new Outer(); 
		Outer.Inner1 inner1 = o.new Inner1(); //non-static
		inner1.doStuff();
		
		Inner2 inner2 = new Outer.Inner2(); //static
		inner2.doStuff(); 
				
		}
}
