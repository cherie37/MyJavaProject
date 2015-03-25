package Day5;

import java.util.Scanner;

public class ConvertIntToString2 {

	private static void convertToTH(long Num, int million,
			int hundred_thousand, int ten_thousand, int thousand, int hundred,
			int ten, int digi) {

		String[] thWord = { "", "หนึ่ง", "สอง", "สาม", "สี่", "ห้า", "หก",
				"เจ็ด", "แปด", "เก้า" };
		if (Num >= 0 && Num < 9999999) {
			if (million > 0) {
				System.out.print(thWord[million] + "ล้าน");
			}
			if (hundred_thousand > 0) {
				System.out.print(thWord[hundred_thousand] + "แสน");
			}
			if (ten_thousand > 0) {
				System.out.print(thWord[ten_thousand] + "หมื่น");
			}
			if (thousand > 0) {
				System.out.print(thWord[thousand] + "พัน");
			}
			if (hundred > 0) {
				System.out.print(thWord[hundred] + "ร้อย");
			}
			if (ten > 0) {
				if (ten == 1) {
					System.out.print("สิบ");
				} else if (ten == 2) {
					System.out.print("ยี่สิบ");
				} else
					System.out.print(thWord[ten] + "สิบ");
			}
			if (digi > 0 && ten > 0) {
				if (digi == 1)
					System.out.print("เอ็ด");
				else
					System.out.print(thWord[digi]);

			} else if (digi > 0 && ten == 0) {
				System.out.print(thWord[digi]);
			}

			if (hundred_thousand == 0 && ten_thousand == 0 && thousand == 0
					&& hundred == 0 && ten == 0 && digi == 0) {
				System.out.print("ศุนย์");
			}

			System.out.println("บาท");
		}

	}

	private static void convertToEN(long Num, int million,
			int hundred_thousand, int ten_thousand, int thousand, int hundred,
			int ten, int digi) {
		String[] enWord = { "zero", "one", "two", "three", "four", "five", "six",
				"seven", "eight", "nine" };
		String[] enWord2 = { "", "eleven", "twelve", "thir", "four", "fif",
				"six", "seven", "eigh", "nine" };

		if (million > 0) {
			System.out.println(enWord[million] + "million ");
		}

		if (hundred_thousand > 0) {
			System.out.print(enWord[hundred_thousand] + "hundred ");
		}
		if (ten_thousand > 0) {
			if (ten_thousand == 1) {
				if (thousand == 1 || thousand == 2) {
					System.out.println(enWord2[thousand]);
				} else if (thousand == 0) {
					System.out.println("ten");
				} else if (thousand > 2) {
					System.out.println(enWord2[thousand] + "teen");
				}
			} else if (ten_thousand == 2) {
				System.out.print("twenty");
				if (digi > 0) {
					System.out.print(enWord[thousand]);
				}
			} else if (ten_thousand == 0) {

			} else {
				System.out.print(enWord2[ten_thousand] + "ty"
						+ enWord[thousand]);
			}
			System.out.println("thousand");

		} else if (ten_thousand <= 0) {
			if (thousand > 0) {
				System.out.println(enWord[thousand] + "thousand");
			}
		}

		if (hundred > 0) {
			System.out.println(enWord[hundred] + "hundred");
		}

		if (ten > 0) { // ten
			if (ten == 1) {
				if (digi == 0) {
					System.out.print("ten");
				} else if (digi == 1 || digi == 2) {
					System.out.print(enWord2[digi]);
				} else if (digi > 2) {
					System.out.print(enWord2[digi] + "teen");
				}
			} else if (ten == 2) {
				System.out.print("twenty");
				if (digi > 0) {
					System.out.print(enWord[digi]);
				}
			} else {
				System.out.print(enWord2[ten] + "ty" + enWord[digi]);
			}

		} else { // digi
			if (digi >= 0) {
				System.out.print(enWord[digi]);
			}
		}

	}


	public static void main(String[] args) {
		String Num2;
		long Num1;
		boolean E;
		int million, hundred_thousand, ten_thousand, thousand, hundred, ten, digi;

		String lang;

		System.out.println("Enter Number(0-9999999) and Select language : ");
		Scanner sc = new Scanner(System.in);

		Num2 = sc.next();
		E = Num2.matches("[0-9]+");

		// System.out.println(E);
		if (E) {
			Num1 = Long.parseLong(Num2);

			million = (int) (Num1 % 10000000) / 1000000;
			hundred_thousand = (int) (Num1 % 1000000) / 100000;
			ten_thousand = (int) (Num1 % 100000) / 10000;
			thousand = (int) (Num1 % 10000) / 1000;
			hundred = (int) (Num1 % 1000) / 100;
			ten = (int) (Num1 % 100) / 10;
			digi = (int) (Num1 % 10);

			lang = sc.next();

			if (Num1 >= 0 && Num1 <= 9999999) {

			} else {
				System.out.println("Invalid input");
			}
			System.out.println(lang);

			switch (lang) {
			case "TH":case "th":
				convertToTH(Num1, million, hundred_thousand, ten_thousand,
						thousand, hundred, ten, digi);
				break;
			case "EN":case "en":
				convertToEN(Num1, million, hundred_thousand, ten_thousand,
						thousand, hundred, ten, digi);
				break;

			default:
				break;
			}
		} else {
			System.out.println("Invalid input(Inpet Number!!!)");
		}
	}

}
