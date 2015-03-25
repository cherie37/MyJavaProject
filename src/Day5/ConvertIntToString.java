package Day5;

import java.util.Scanner;

public class ConvertIntToString {

	public static void main(String[] args) {
		int Num1, thousand, hundred, ten, unit;

		System.out.println("Enter Number(0-9999) : ");
		Scanner sc = new Scanner(System.in);
		Num1 = sc.nextInt();
		thousand = Num1 / 1000;
		hundred = (Num1 % 1000) / 100;
		ten = (Num1 % 100) / 10;
		unit = (Num1 % 10);
		String[] word = { "หนึ่ง", "สอง", "สาม", "สี่", "ห้า", "หก", "เจ็ด",
				"แปด", "เก้า" };

		if (thousand > 0) {
			switch (thousand) {
			case 1:
				System.out.print(word[0] + "พัน");
				break;
			case 2:
				System.out.print(word[1] + "พัน");
				break;
			case 3:
				System.out.print(word[2] + "พัน");
				break;
			case 4:
				System.out.print(word[3] + "พัน");
				break;
			case 5:
				System.out.print(word[4] + "พัน");
				break;
			case 6:
				System.out.print(word[5] + "พัน");
				break;
			case 7:
				System.out.print(word[6] + "พัน");
				break;
			case 8:
				System.out.print(word[7] + "พัน");
				break;
			case 9:
				System.out.print(word[8] + "พัน");
				break;
			default:
				System.out.print("");
			}
			// System.out.println(hundred);
		}
		if (hundred >= 0) {
			switch (hundred) {
			case 1:
				System.out.print(word[0] + "ร้อย");
				break;
			case 2:
				System.out.print(word[1] + "ร้อย");
				break;
			case 3:
				System.out.print(word[2] + "ร้อย");
				break;
			case 4:
				System.out.print(word[3] + "ร้อย");
				break;
			case 5:
				System.out.print(word[4] + "ร้อย");
				break;
			case 6:
				System.out.print(word[5] + "ร้อย");
				break;
			case 7:
				System.out.print(word[6] + "ร้อย");
				break;
			case 8:
				System.out.print(word[7] + "ร้อย");
				break;
			case 9:
				System.out.print(word[8] + "ร้อย");
				break;
			case 0:
				System.out.print("");
				break;
			default:
				System.out.print("");
			}
		}
		if (ten >= 0) {
			switch (ten) {
			case 1:
				System.out.print("สิบ");
				break;
			case 2:
				System.out.print("ยี่" + "สิบ");
				break;
			case 3:
				System.out.print(word[2] + "สิบ");
				break;
			case 4:
				System.out.print(word[3] + "สิบ");
				break;
			case 5:
				System.out.print(word[4] + "สิบ");
				break;
			case 6:
				System.out.print(word[5] + "สิบ");
				break;
			case 7:
				System.out.print(word[6] + "สิบ");
				break;
			case 8:
				System.out.print(word[7] + "สิบ");
				break;
			case 9:
				System.out.print(word[8] + "สิบ");
				break;
			case 0:
				System.out.print("");
				break;
			default:
				System.out.print("");
			}
		}
		if (unit >= 0) {
			switch (unit) {
			case 1:
				if (ten > 0)
					System.out.print("เอ็ด");
				else if (unit == 1)
					System.out.print("หนึ่ง");
				break;
			case 2:
				System.out.print(word[1]);
				break;
			case 3:
				System.out.print(word[2]);
				break;
			case 4:
				System.out.print(word[3]);
				break;
			case 5:
				System.out.print(word[4]);
				break;
			case 6:
				System.out.print(word[5]);
				break;
			case 7:
				System.out.print(word[6]);
				break;
			case 8:
				System.out.print(word[7]);
				break;
			case 9:
				System.out.print(word[8]);
				break;
			case 0:
				System.out.print("");
				break;
			default:
				System.out.print("");
			}

		}
		if (thousand == 0 && hundred == 0 && ten == 0 && unit == 0) {
			System.out.print("ศุนย์");
		}
		System.out.println("บาท");
	}

}
