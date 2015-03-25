package Day1;
import java.util.Scanner;

public class ForStatement {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		// a = sc.nextInt();
		int[] Num1 = {1,2,3,4,5,6,7,8,9,10};

		String[] month = { "Jan", "Feb", "Mar", "Apr", "May", "June", "July",
				"Aug", "Sep", "Oct", "Nov", "Dec" };

		for (int i = 0; i < month.length; i++) {
			System.out.print(" " + month[i]);
		}
		System.out.println("");
		for (int i = 0; i < 10; i++) {
			System.out.print(" " + Num1[i]);
			if(i>=4)break;
			
			
		}
	}

}
