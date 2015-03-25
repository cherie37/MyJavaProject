package Day1;
import java.util.Scanner;

public class FlowStatement {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int a = 5;
		a = sc.nextInt();
		if (a > 0) {
			System.out.println("a is equal 0");
		}
		if (a == 5) {
			System.out.println("a is equal 5");
		} else if (a == 10) {
			System.out.println("a is equal 10");
		} else {
			System.out.println("a is other");
		}

	}

}
