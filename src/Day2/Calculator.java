package Day2;
import java.util.Scanner;

public class Calculator {
	
	float result = 0;

	public void plus(int x, int y) {
		result = x + y;
		System.out.println(result);
	}

	public void minus(int x, int y) {
		result = x - y;
		System.out.println(result);
	}

	public void multiply(int x, int y) {
		result = x * y;
		System.out.println(result);
	}

	public void divide(int x, int y) {
		result = x / y;
		System.out.println(result);
	}

	public static void main(String[] args) {
		int x, y;
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input x : ");
		x = sc.nextInt();
		System.out.println("Input y : ");
		y = sc.nextInt();

		Calculator cal = new Calculator();
		System.out.println("Select choice 1(+) 2(-) 3(*) 4(/) : ");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			cal.plus(x, y);
			break;
		case 2:
			cal.minus(x, y);
			break;
		case 3:
			cal.multiply(x, y);
			break;
		case 4:
			cal.divide(x, y);
			break;

		default:
			break;
		}

	}
}
