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
		String[] word = { "˹��", "�ͧ", "���", "���", "���", "ˡ", "��",
				"Ỵ", "���" };

		if (thousand > 0) {
			switch (thousand) {
			case 1:
				System.out.print(word[0] + "�ѹ");
				break;
			case 2:
				System.out.print(word[1] + "�ѹ");
				break;
			case 3:
				System.out.print(word[2] + "�ѹ");
				break;
			case 4:
				System.out.print(word[3] + "�ѹ");
				break;
			case 5:
				System.out.print(word[4] + "�ѹ");
				break;
			case 6:
				System.out.print(word[5] + "�ѹ");
				break;
			case 7:
				System.out.print(word[6] + "�ѹ");
				break;
			case 8:
				System.out.print(word[7] + "�ѹ");
				break;
			case 9:
				System.out.print(word[8] + "�ѹ");
				break;
			default:
				System.out.print("");
			}
			// System.out.println(hundred);
		}
		if (hundred >= 0) {
			switch (hundred) {
			case 1:
				System.out.print(word[0] + "����");
				break;
			case 2:
				System.out.print(word[1] + "����");
				break;
			case 3:
				System.out.print(word[2] + "����");
				break;
			case 4:
				System.out.print(word[3] + "����");
				break;
			case 5:
				System.out.print(word[4] + "����");
				break;
			case 6:
				System.out.print(word[5] + "����");
				break;
			case 7:
				System.out.print(word[6] + "����");
				break;
			case 8:
				System.out.print(word[7] + "����");
				break;
			case 9:
				System.out.print(word[8] + "����");
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
				System.out.print("�Ժ");
				break;
			case 2:
				System.out.print("���" + "�Ժ");
				break;
			case 3:
				System.out.print(word[2] + "�Ժ");
				break;
			case 4:
				System.out.print(word[3] + "�Ժ");
				break;
			case 5:
				System.out.print(word[4] + "�Ժ");
				break;
			case 6:
				System.out.print(word[5] + "�Ժ");
				break;
			case 7:
				System.out.print(word[6] + "�Ժ");
				break;
			case 8:
				System.out.print(word[7] + "�Ժ");
				break;
			case 9:
				System.out.print(word[8] + "�Ժ");
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
					System.out.print("���");
				else if (unit == 1)
					System.out.print("˹��");
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
			System.out.print("�ع��");
		}
		System.out.println("�ҷ");
	}

}
