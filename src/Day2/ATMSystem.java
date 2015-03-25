package Day2;

import java.util.Scanner;

public class ATMSystem {
	float deposit = 0;
	float withdraw = 0;
	float balance = 10000;
	int check;
	static int count = 0;

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	ATMSystem() {
		deposit = 0;
		withdraw = 0;
		balance = 10000;

	}

	public int logIn(int pwd) {
		if (pwd == 1234) {
			if (count == 0) {
				System.out.println("Welcome");
			}
			return check = 1;
		} else {
			System.out.println("Invalid Password Try again:");
			return check = 0;
		}

	}

	public void deposit(float deposit1) {
		balance += deposit1;

	}

	public void withdraw(float withdraw1) {
		if (balance >= withdraw1)
			balance -= withdraw1;

		else {
			System.out.print("Balance is not enough : ");
		}
	}

	public static void main(String[] args) {
		int pwd = 0;
		int choice;
		float dep;
		float wdr;

		ATMSystem user1 = new ATMSystem();
		Scanner sc = new Scanner(System.in);

		System.out.print("Input Password : ");
		pwd = sc.nextInt();

		while (true) {

			if (user1.logIn(pwd) == 1) {
				System.out.println("Select choice " + '\n' + "1-deposit" + '\n'
						+ "2-withdraw" + '\n' + "3-check balance" + '\n'
						+ "4-Logout: ");
				choice = sc.nextInt();

				if (choice == 1) {// deposit
					System.out.println("How much for Deposit : ");
					dep = sc.nextFloat();
					user1.deposit(dep);
					System.out.println("Balance : " + user1.balance);

				} else if (choice == 2) { // withdraw
					System.out.println("How much for Withdraw : ");
					wdr = sc.nextFloat();
					user1.withdraw(wdr);
					System.out.println("Balance : " + user1.balance);
				} else if (choice == 3) {// check balance
					user1.getBalance();
					System.out.println("Balance : " + user1.balance);
				} else if (choice == 4) {
					System.out.println("Thank you");
					break;
				}
				count++;

			} else {
				System.out.print("Input Password : ");
				pwd = sc.nextInt();
			}
		}
	}
}
