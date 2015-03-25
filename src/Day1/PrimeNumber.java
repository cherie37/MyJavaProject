package Day1;
public class PrimeNumber {
	public static void main(String args[]) {
		// int[] Num1 = new int[100];
		int PrimeNo = 0;
		int check=0;

		/*
		 * for (int i = 2; i < 100; i++) { if (i == 3 || i == 5|| i == 7) {
		 * System.out.println("PrimeNo : " + i); } if (i % i == 0 && i % 2 != 0
		 * && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && i != 0) {
		 * System.out.println("PrimeNo : " + i); } }
		 */
		for (int i = 3; i <= 100; i++) {
			int primeNo = 0;
			// System.out.println("PrimeNo : " + i);
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					check=0;
					break;
					// System.out.println("PrimeNo : " + i +" "+j);
				} else {
					check=1;									
					continue;
				}			
				
				
			}if(check==1)System.out.println("PrimeNo : " + i);

			

		}
	}
}
// 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 //input j
// 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18//mod i
