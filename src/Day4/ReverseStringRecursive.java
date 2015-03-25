package Day4;

import java.util.Scanner;

public class ReverseStringRecursive {

	char reverse;
	String reverse1 = "";
	int index;

	public String reverse(int index, String msg1) {

		if (index < 0) {
			return reverse1;
		} else {
			reverse = msg1.charAt(index);
			index--;
			reverse1 += reverse;
			return reverse(index, msg1);
		}

	}

	public static void main(String args[]) {
		String msg = "Hello world";

		ReverseStringRecursive rev = new ReverseStringRecursive();
		System.out.println(rev.reverse(msg.length() - 1, msg));

	}
}
