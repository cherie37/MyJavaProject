package Day1;
import java.util.Scanner;

public class DoWhileStatement {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		//a = sc.nextInt();

		String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July",
				"Aug", "Sep", "Oct", "Nov", "Dec" };
		
		while(counter<month.length){
					
			System.out.println(month[counter]);
			counter++;
			
		}
	}

}
