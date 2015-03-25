package Day1;
import java.util.Scanner;

public class ReverseString {
	public static void main(String args[]) {
		// sc = new Scanner(System.in);
		//msg=
		String msg = "Hello World";
		String reverse = "";
		for (int i = msg.length() - 1; i >= 0; i--)
			reverse += msg.charAt(i);
		System.out.println(reverse);
	}
}
