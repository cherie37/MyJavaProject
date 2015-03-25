package Day1;
public class TypeConversion {

	public static void main(String arg[]) {

		char newln = '\n';
		String nickName = new String("Rie");
		int Age = 25;
		float FloatAge = Age;

		double DNum1 = 5430000000000.00;
		int IntNum2 = (int) DNum1;

		char char1 = 'a';
		int charNum = (int) char1;

		int valuesA[] = new int[5];
		valuesA[0] = 6;
		valuesA[1] = 7;
		valuesA[2] = 8;

		int valuesB[] = { 1, 2, 3, 4 };

		System.out.println("valuesA[0] : " + valuesA[0]);
		System.out.println("valuesA[1] : " + valuesA[1]);
		System.out.println("valuesA[2] : " + valuesA[2]);
		System.out.println("valuesA[3] : " + valuesA[3]);
		System.out.println("valuesA[4] : " + valuesA[4] + '\n');

		System.out.println("valuesB[0] : " + valuesB[0]);
		System.out.println("valuesB[1] : " + valuesB[1]);
		System.out.println("valuesB[2] : " + valuesB[2]);
		System.out.println("valuesB[3] : " + valuesB[3] + '\n');

		System.out.println("FloatAge : " + FloatAge + newln);
		System.out.println("charNum : " + charNum + newln);
		System.out.println("IntNum2 : " + IntNum2 + newln);

	}
}
