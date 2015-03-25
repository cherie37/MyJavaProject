package Day3;

public class MaxMin {
	int min, max;
	int[] numArray = { 7, 5, 8, 9, 10, 25, 50, 45, 43, 22 };

	public int max() {
		for (int i = 0; i < numArray.length; i++) {
			this.max = numArray[0];
			if (numArray[i] > max) {
				this.max = numArray[i];
			}
		}
		return max;
	}

	public int min() {
		min = numArray[0];
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] < min) {
				min = numArray[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		MaxMin maxMin = new MaxMin();
		System.out.println("Max is : " + maxMin.max());
		System.out.println("Min is : " + maxMin.min());
	}

}
