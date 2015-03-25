package Day3;

import java.util.Scanner;

public class MinMax2 {
	int min, max;
	int[] numArray;

	public int max() {
		for (int i = 1; i < numArray.length; i++) {
			this.max = numArray[0];
			if (numArray[i] > max) {
				this.max = numArray[i];
			}
		}
		return max;
	}

	public int min() {
		min = numArray[0];
		for (int i = 1; i < numArray.length; i++) {
			if (numArray[i] < min) {
				min = numArray[i];
			}
		}
		return min;
	}

	public int[] getNumArray() {
		return numArray;
	}

	public void setNumArray(int[] numArray) {
		this.numArray = numArray;
	}

	public static void main(String[] args) {
		int index, num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input index : ");
		index = sc.nextInt();

		int[] numArray = new int[index];
		System.out.println("Input " + index + " number : ");

		for (int i = 0; i < index; i++) {
			System.out.print((i + 1) + ": ");
			num = sc.nextInt();
			numArray[i] = num;
		}

		MinMax2 maxMin = new MinMax2();
		maxMin.setNumArray(numArray);
		System.out.println("Max is : " + maxMin.max());
		System.out.println("Min is : " + maxMin.min());
	}

}
